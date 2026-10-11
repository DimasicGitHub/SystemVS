/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;
import net.minecraft.class_636;

public final class du {
    private static final Method a = du.a();

    private du() {
    }

    public static void a(class_636 class_6362) {
        if (a == null || class_6362 == null) {
            return;
        }
        try {
            a.invoke(class_6362, new Object[0]);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static Method a() {
        for (String string : new String[]{"method_2911", "syncSelectedSlot"}) {
            try {
                Method method = class_636.class.getDeclaredMethod(string, new Class[0]);
                method.setAccessible(true);
                return method;
            }
            catch (Throwable throwable) {
            }
        }
        return null;
    }
}

