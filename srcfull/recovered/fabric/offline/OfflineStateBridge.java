/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.offline;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Set;
import recovered.fabric.diagnostic.SystemDlcLog;

public final class OfflineStateBridge {
    private OfflineStateBridge() {
    }

    public static void initialize() {
        try {
            Class<?> type = Class.forName("eV");
            Object manager = OfflineStateBridge.method(type, "a", type, true).invoke(null, new Object[0]);
            OfflineStateBridge.method(type, "c", Void.TYPE, false).invoke(manager, new Object[0]);
            Set friends = (Set)OfflineStateBridge.method(type, "a", Set.class, false).invoke(manager, new Object[0]);
            SystemDlcLog.info("offline friends loaded count=" + friends.size());
        }
        catch (Throwable error) {
            SystemDlcLog.errorOnce("offline friends load", OfflineStateBridge.root(error));
        }
    }

    private static Method method(Class<?> type, String name, Class<?> result, boolean requireStatic) throws NoSuchMethodException {
        for (Method method : type.getDeclaredMethods()) {
            boolean valid;
            boolean bl2 = valid = method.getName().equals(name) && method.getReturnType() == result && method.getParameterCount() == 0;
            if (!valid || requireStatic && !Modifier.isStatic(method.getModifiers())) continue;
            method.setAccessible(true);
            return method;
        }
        throw new NoSuchMethodException(type.getName() + "." + name);
    }

    private static Throwable root(Throwable error) {
        return error.getCause() == null ? error : error.getCause();
    }
}

