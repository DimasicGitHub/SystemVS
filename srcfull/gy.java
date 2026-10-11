/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class gy {
    private gy() {
    }

    public static long b(Class clazz, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (Modifier.isStatic(field.getModifiers()) || !clazz2.isAssignableFrom(field.getType())) continue;
            return hW.a.objectFieldOffset(field);
        }
        return 0L;
    }

    public static void a(Object object, long l2, int n2) {
        hW.a.putInt(object, l2, n2);
    }

    public static void a(Object object, long l2, Object object2) {
        hW.a.putObject(object, l2, object2);
    }

    public static boolean a(Object object, long l2) {
        return hW.a.getBoolean(object, l2);
    }

    public static double a(Object object, long l2) {
        return hW.a.getDouble(object, l2);
    }

    public static void a(Object object, long l2, boolean bl2) {
        hW.a.putBoolean(object, l2, bl2);
    }

    public static void a(Object object, long l2, double d2) {
        hW.a.putDouble(object, l2, d2);
    }

    public static void a(Object object, long l2, float f2) {
        hW.a.putFloat(object, l2, f2);
    }

    public static void a(Object object, long l2, long l3) {
        hW.a.putLong(object, l2, l3);
    }

    public static Object a(Object object, long l2) {
        return hW.a.getObject(object, l2);
    }

    public static long a(Class clazz, int n2) {
        int n3 = 0;
        for (Field field : clazz.getDeclaredFields()) {
            if (Modifier.isStatic(field.getModifiers())) continue;
            if (n3 == n2) {
                return hW.a.objectFieldOffset(field);
            }
            ++n3;
        }
        return 0L;
    }

    public static long a(Class clazz, Class clazz2, int n2) {
        int n3 = 0;
        for (Field field : clazz.getDeclaredFields()) {
            if (Modifier.isStatic(field.getModifiers()) || field.getType() != clazz2) continue;
            if (n3 == n2) {
                return hW.a.objectFieldOffset(field);
            }
            ++n3;
        }
        return 0L;
    }

    public static long a(Class clazz, Class clazz2) {
        return gy.a(clazz, clazz2, 0);
    }

    public static int a(Object object, long l2) {
        return hW.a.getInt(object, l2);
    }

    public static long a(Object object, long l2) {
        return hW.a.getLong(object, l2);
    }

    public static float a(Object object, long l2) {
        return hW.a.getFloat(object, l2);
    }
}

