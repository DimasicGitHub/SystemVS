/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1657;

public class kk {
    private static final long a = 5000L;
    private static class_1657 b;
    private static long c;

    public static void a(class_1657 class_16572) {
        b = class_16572;
        c = System.currentTimeMillis();
    }

    public static class_1657 a() {
        if (b == null) {
            return null;
        }
        if (!b.method_5805()) {
            b = null;
            return null;
        }
        if (System.currentTimeMillis() - c > 5000L) {
            b = null;
            return null;
        }
        return b;
    }
}

