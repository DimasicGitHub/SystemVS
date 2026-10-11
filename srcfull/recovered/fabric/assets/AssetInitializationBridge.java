/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.assets;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;
import recovered.fabric.diagnostic.SystemDlcLog;

public final class AssetInitializationBridge {
    private static final String[] registries = new String[]{"aV", "ds", "eJ"};

    private AssetInitializationBridge() {
    }

    public static void initialize() {
        for (String registry : registries) {
            AssetInitializationBridge.initialize(registry);
        }
    }

    private static void initialize(String name) {
        try {
            Class<?> type = Class.forName(name);
            Method method = AssetInitializationBridge.initializer(type);
            method.setAccessible(true);
            method.invoke(null, new Object[0]);
            SystemDlcLog.info("asset registry " + name + " loaded count=" + AssetInitializationBridge.count(type));
        }
        catch (Throwable error) {
            SystemDlcLog.errorOnce("asset registry " + name, AssetInitializationBridge.root(error));
        }
    }

    private static Method initializer(Class<?> type) throws NoSuchMethodException {
        for (Method method : type.getDeclaredMethods()) {
            if (!method.getName().equals("a") || method.getReturnType() != Void.TYPE || method.getParameterCount() != 0 || !Modifier.isStatic(method.getModifiers())) continue;
            return method;
        }
        throw new NoSuchMethodException(type.getName() + ".a");
    }

    private static int count(Class<?> type) throws IllegalAccessException {
        int result = 0;
        for (Field field : type.getDeclaredFields()) {
            if (!Modifier.isStatic(field.getModifiers()) || !Map.class.isAssignableFrom(field.getType())) continue;
            field.setAccessible(true);
            Map values = (Map)field.get(null);
            if (values == null) continue;
            result = Math.max(result, values.size());
        }
        return result;
    }

    private static Throwable root(Throwable error) {
        return error.getCause() == null ? error : error.getCause();
    }
}

