/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.nativebridge;

import b.Boot;
import java.lang.reflect.Field;
import java.util.Map;
import recovered.fabric.diagnostic.SystemDlcLog;

public final class OriginalHookStatus {
    private OriginalHookStatus() {
    }

    public static void report() {
        try {
            Class<?> type = Class.forName("li");
            boolean ready = Boot.nativePatchMethodReady();
            boolean enabled = OriginalHookStatus.booleanValue(type, "i");
            boolean active = OriginalHookStatus.booleanValue(type, "h");
            int targets = OriginalHookStatus.mapSize(type, "b");
            int bytecodes = OriginalHookStatus.mapSize(type, "c");
            int handles = OriginalHookStatus.mapSize(type, "d");
            SystemDlcLog.info("original hooks ready=" + ready + " enabled=" + enabled + " active=" + active + " targets=" + targets + " bytecodes=" + bytecodes + " handles=" + handles);
        }
        catch (Throwable error) {
            SystemDlcLog.error("original hook status unavailable", error);
        }
    }

    private static boolean booleanValue(Class<?> type, String name) throws ReflectiveOperationException {
        Field field = OriginalHookStatus.field(type, name);
        return field.getBoolean(null);
    }

    private static int mapSize(Class<?> type, String name) throws ReflectiveOperationException {
        Field field = OriginalHookStatus.field(type, name);
        return ((Map)field.get(null)).size();
    }

    private static Field field(Class<?> type, String name) throws NoSuchFieldException {
        Field field = type.getDeclaredField(name);
        field.setAccessible(true);
        return field;
    }
}

