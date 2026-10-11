/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1309;
import net.minecraft.class_746;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@jB(value=class_746.class)
public class cw {
    private static bh a;
    private static float b;
    private static float c;
    private static float d;
    private static float e;
    private static boolean f;
    private static boolean g;
    private static boolean h;

    @hz(method="method_3136", desc="()V", at=iD.HEAD)
    public static void e(class_746 class_7462) {
        if (!f) {
            return;
        }
        class_7462.method_36456(a.b());
        class_7462.method_36457(a.a());
    }

    @hz(target=class_1309.class, method="method_6007", desc="()V", at=iD.TAIL)
    public static void b(class_1309 class_13092) {
        if (class_13092 != lo.aM.field_1724) {
            return;
        }
        class_746 class_7462 = (class_746)class_13092;
        g = false;
        aW aW2 = hW.a();
        if (aW2 != null) {
            aW2.f();
        }
        if (!f) {
            return;
        }
        class_7462.method_36456(b);
        class_7462.method_36457(c);
    }

    @hz(method="method_5773", desc="()V", at=iD.TAIL)
    public static void b(class_746 class_7462) {
        if (!f) {
            return;
        }
        class_7462.field_3931 = d;
        class_7462.field_3914 = e;
        class_7462.field_3932 = d + (b - d) * 0.5f;
        class_7462.field_3916 = e + (c - e) * 0.5f;
    }

    @hz(target=class_746.class, method="method_6007", desc="()V", at=iD.HEAD)
    public static void c(class_746 class_7462) {
        aW aW2;
        if (class_7462 != lo.aM.field_1724) {
            return;
        }
        h = false;
        if (!kT.a() && class_7462.method_6115() && !class_7462.method_5765() && (aW2 = hW.a()) != null) {
            di di2 = new di();
            aW2.a(di2);
            h = di2.a();
        }
        g = true;
    }

    @hz(target=class_1309.class, method="method_6043", desc="()V", at=iD.HEAD)
    public static void c(class_1309 class_13092) {
        if (class_13092 != lo.aM.field_1724 || kT.a()) {
            return;
        }
        aW aW2 = hW.a();
        if (aW2 != null) {
            aW2.g();
        }
    }

    @hz(method="method_3136", desc="()V", at=iD.TAIL)
    public static void f(class_746 class_7462) {
        if (!f) {
            return;
        }
        class_7462.method_36456(b);
        class_7462.method_36457(c);
    }

    @hz(target=class_746.class, method="method_6007", desc="()V", at=iD.TAIL)
    public static void d(class_746 class_7462) {
        if (class_7462 != lo.aM.field_1724) {
            return;
        }
        g = false;
    }

    @hz(target=class_1309.class, method="method_6007", desc="()V", at=iD.HEAD)
    public static void a(class_1309 class_13092) {
        aW aW2;
        if (class_13092 != lo.aM.field_1724) {
            return;
        }
        class_746 class_7462 = (class_746)class_13092;
        h = false;
        if (!kT.a() && class_7462.method_6115() && !class_7462.method_5765() && (aW2 = hW.a()) != null) {
            di di2 = new di();
            aW2.a(di2);
            h = di2.a();
        }
        g = true;
        gT.d();
        if (!f) {
            return;
        }
        class_7462.method_36456(a.b());
        class_7462.method_36457(a.a());
    }

    @hz(method="method_5773", desc="()V", at=iD.HEAD)
    public static void a(class_746 class_7462) {
        a = null;
        f = false;
        if (kT.a()) {
            return;
        }
        aW aW2 = hW.a();
        if (aW2 == null) {
            return;
        }
        aW2.e();
        a = aW2.a(class_7462.method_36455(), class_7462.method_36454());
        if (a == null || !a.a() || class_7462.method_5765()) {
            return;
        }
        b = class_7462.method_36454();
        c = class_7462.method_36455();
        d = class_7462.field_3932;
        e = class_7462.field_3916;
        f = true;
    }

    @hz(target=class_746.class, method="method_6115", desc="()Z", at=iD.CANCELLABLE)
    public static boolean a(class_746 class_7462) {
        return !g || !h || class_7462 != lo.aM.field_1724;
    }

    @hz(target=class_1309.class, method="method_6115", desc="()Z", at=iD.CANCELLABLE)
    public static boolean a(class_1309 class_13092) {
        return !g || !h || class_13092 != lo.aM.field_1724;
    }
}

