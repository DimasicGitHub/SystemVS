/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import net.minecraft.class_4185;
import net.minecraft.class_433;

public final class cr {
    public static final long a = cr.a();

    private cr() {
    }

    private static long a() {
        try {
            for (Field field : class_433.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) || field.getType() != class_4185.class) continue;
                return hW.a.objectFieldOffset(field);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return -1L;
    }
}

