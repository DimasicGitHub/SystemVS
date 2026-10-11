/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.DescriptorWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicBoolean;
import recovered.fabric.diagnostic.SystemDlcLog;
import recovered.fabric.nativebridge.LegacyCalls;
import recovered.fabric.offline.OfflineRuntime;

public final class Boot {
    private static final AtomicBoolean bootstrapped = new AtomicBoolean();
    private static volatile boolean sbProbed;
    private static volatile boolean sbAvailable;
    private static volatile boolean sbCreated;
    private static volatile boolean sbWantActive;

    private Boot() {
    }

    public static void shutdown() {
        SystemDlcLog.info("Boot.shutdown");
        OfflineRuntime.shutdown();
    }

    public static String get() {
        SystemDlcLog.once("hwid", "Boot.get requested");
        return OfflineRuntime.deviceId();
    }

    public static String call(int action, String payload, String session) {
        SystemDlcLog.info("Boot.call action=" + action + " session=" + (session != null));
        String response = OfflineRuntime.call(action, payload, session);
        SystemDlcLog.info("Boot.call action=" + action + " responseLength=" + response.length());
        return response;
    }

    public static String ip() {
        return OfflineRuntime.ip();
    }

    public static String pcName() {
        return OfflineRuntime.pcName();
    }

    public static String wsUrl() {
        return OfflineRuntime.wsUrl();
    }

    public static void bootstrap() {
        SystemDlcLog.info("Boot.bootstrap requested");
        if (!bootstrapped.compareAndSet(false, true)) {
            SystemDlcLog.info("Boot.bootstrap skipped");
            return;
        }
        String className = Boot.class.getName().replace('.', '/');
        int registered = 0;
        int failed = 0;
        for (Method method : Boot.class.getDeclaredMethods()) {
            if (!Modifier.isNative(method.getModifiers()) || method.getName().equals("reg")) continue;
            try {
                String descriptor = Boot.descriptorOf(method);
                Boot.reg(Boot.class, className, method.getName(), descriptor);
                ++registered;
                SystemDlcLog.info("native registered " + method.getName() + descriptor);
            }
            catch (Throwable error) {
                ++failed;
                SystemDlcLog.error("native registration failed " + method.getName(), error);
            }
        }
        SystemDlcLog.info("native registration complete registered=" + registered + " failed=" + failed);
        LegacyCalls.runVoid("li", "a");
        SystemDlcLog.info("Boot.bootstrap completed");
    }

    private static String descriptorOf(Method method) {
        return DescriptorWriter.of(method);
    }

    private static void appendDesc(StringBuilder builder, Class<?> type) {
        DescriptorWriter.append(builder, type);
    }

    private static native void reg(Class<?> var0, String var1, String var2, String var3);

    public static native boolean nativeRedefineClass(Class<?> var0, byte[] var1);

    public static native byte[] nativeDumpClassBytes(Class<?> var0);

    public static native boolean nativePatchMethodReady();

    private static native boolean nativeAvailable();

    public static native boolean nativeUnload();

    private static native void nativePublish(int var0, long var1);

    private static native void nativeDestroy();

    private static native boolean nativeCreate(long var0);

    private static native boolean nativeBeginFrame();

    private static native void nativeSetActive(boolean var0);

    public static synchronized boolean sbLoad() {
        if (sbProbed) {
            return sbAvailable;
        }
        sbProbed = true;
        try {
            sbAvailable = Boot.nativeAvailable();
        }
        catch (Throwable error) {
            SystemDlcLog.errorOnce("nativeAvailable", error);
            sbAvailable = false;
        }
        SystemDlcLog.info("shared buffer available=" + sbAvailable);
        return sbAvailable;
    }

    public static synchronized boolean sbCreate(long window) {
        if (!sbAvailable) {
            return false;
        }
        if (sbCreated) {
            return true;
        }
        try {
            sbCreated = Boot.nativeCreate(window);
            if (sbCreated) {
                Boot.nativeSetActive(sbWantActive);
            }
        }
        catch (Throwable error) {
            SystemDlcLog.errorOnce("nativeCreate", error);
            sbCreated = false;
        }
        SystemDlcLog.info("shared buffer created=" + sbCreated);
        return sbCreated;
    }

    public static boolean sbBeginFrame() {
        try {
            return sbCreated && Boot.nativeBeginFrame();
        }
        catch (Throwable error) {
            SystemDlcLog.errorOnce("nativeBeginFrame", error);
            return false;
        }
    }

    public static void sbPublish(int texture, long fence) {
        if (!sbCreated) {
            return;
        }
        try {
            Boot.nativePublish(texture, fence);
        }
        catch (Throwable error) {
            SystemDlcLog.errorOnce("nativePublish", error);
        }
    }

    public static void sbSetActive(boolean active) {
        sbWantActive = active;
        if (!sbCreated) {
            return;
        }
        try {
            Boot.nativeSetActive(active);
        }
        catch (Throwable error) {
            SystemDlcLog.errorOnce("nativeSetActive", error);
        }
    }

    public static synchronized void sbDestroy() {
        sbWantActive = false;
        if (!sbCreated) {
            return;
        }
        sbCreated = false;
        try {
            Boot.nativeDestroy();
        }
        catch (Throwable error) {
            SystemDlcLog.errorOnce("nativeDestroy", error);
        }
    }

    public static boolean isCallingOriginal() {
        return LegacyCalls.runBoolean("li", "b");
    }
}

