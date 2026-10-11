/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_304;
import net.minecraft.class_315;
import net.minecraft.class_3675;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ii {
    private static volatile boolean a = false;

    public static void b() {
        if (!a) {
            return;
        }
        a = false;
        if (lo.aM == null || lo.aM.method_22683() == null) {
            return;
        }
        class_315 class_3152 = lo.aM.field_1690;
        long l2 = lo.aM.method_22683().method_4490();
        class_3152.field_1894.method_23481(ii.a(l2, class_3152.field_1894));
        class_3152.field_1881.method_23481(ii.a(l2, class_3152.field_1881));
        class_3152.field_1913.method_23481(ii.a(l2, class_3152.field_1913));
        class_3152.field_1849.method_23481(ii.a(l2, class_3152.field_1849));
        class_3152.field_1903.method_23481(ii.a(l2, class_3152.field_1903));
        class_3152.field_1867.method_23481(ii.a(l2, class_3152.field_1867));
    }

    public static void c() {
        if (!a) {
            return;
        }
        if (lo.aM == null || lo.aM.field_1724 == null) {
            return;
        }
        class_315 class_3152 = lo.aM.field_1690;
        class_3152.field_1894.method_23481(false);
        class_3152.field_1881.method_23481(false);
        class_3152.field_1913.method_23481(false);
        class_3152.field_1849.method_23481(false);
        class_3152.field_1903.method_23481(false);
        class_3152.field_1867.method_23481(false);
        lo.aM.field_1724.method_5728(false);
    }

    public static void a() {
        if (a) {
            return;
        }
        a = true;
        if (lo.aM == null || lo.aM.field_1724 == null) {
            return;
        }
        class_315 class_3152 = lo.aM.field_1690;
        class_3152.field_1894.method_23481(false);
        class_3152.field_1881.method_23481(false);
        class_3152.field_1913.method_23481(false);
        class_3152.field_1849.method_23481(false);
        class_3152.field_1903.method_23481(false);
        class_3152.field_1867.method_23481(false);
        lo.aM.field_1724.method_5728(false);
    }

    public static boolean a() {
        return a;
    }

    private static boolean a(long l2, class_304 class_3042) {
        return class_3675.method_15987((long)l2, (int)class_3042.method_1429().method_1444());
    }
}

