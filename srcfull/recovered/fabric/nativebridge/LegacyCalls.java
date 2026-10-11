/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.nativebridge;

import java.lang.reflect.Method;
import recovered.fabric.diagnostic.SystemDlcLog;

public final class LegacyCalls {
    private LegacyCalls() {
    }

    public static void runVoid(String className, String methodName) {
        LegacyCalls.invoke(className, methodName, Void.TYPE);
    }

    public static boolean runBoolean(String className, String methodName) {
        Boolean value;
        Object result = LegacyCalls.invoke(className, methodName, Boolean.TYPE);
        return result instanceof Boolean && (value = (Boolean)result) != false;
    }

    private static Object invoke(String className, String methodName, Class<?> returnType) {
        boolean report;
        String target = className + "." + methodName + "()";
        boolean bl2 = report = !target.equals("li.b()");
        if (report) {
            SystemDlcLog.info("legacy call started " + target);
        }
        try {
            Class<?> type = Class.forName(className);
            Method method = LegacyCalls.find(type, methodName, returnType);
            method.setAccessible(true);
            Object result = method.invoke(null, new Object[0]);
            if (report) {
                SystemDlcLog.info("legacy call completed " + target + " result=" + String.valueOf(result));
            }
            return result;
        }
        catch (Throwable error) {
            SystemDlcLog.error("legacy call failed " + target, error);
            return null;
        }
    }

    private static Method find(Class<?> type, String name, Class<?> returnType) throws NoSuchMethodException {
        for (Method method : type.getDeclaredMethods()) {
            if (!method.getName().equals(name) || method.getParameterCount() != 0 || method.getReturnType() != returnType) continue;
            return method;
        }
        throw new NoSuchMethodException(type.getName() + "." + name);
    }
}

