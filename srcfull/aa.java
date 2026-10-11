/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1058;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4184;
import net.minecraft.class_4185;
import net.minecraft.class_433;
import net.minecraft.class_437;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4603;
import net.minecraft.class_465;
import net.minecraft.class_757;
import net.minecraft.class_9779;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@jB(value=class_757.class)
public class aa {
    private static volatile class_9779 a;
    private static volatile boolean b;
    private static float c;
    private static volatile boolean d;
    private static final hW<hl> e;
    private static final hW<cq> f;
    private static final hW<gS> g;
    private static final hW<hh> h;
    private static final hW<fq> i;
    private static final hW<gu> j;
    private static boolean k;
    private static boolean l;
    private static final long m;
    private static final long n;
    private static final long o;

    static {
        b = false;
        c = 110.0f;
        d = false;
        e = new hW(hl.class);
        f = new hW(cq.class);
        g = new hW(gS.class);
        h = new hW(hh.class);
        i = new hW(fq::a);
        j = new hW(gu.class);
        m = gy.a(class_757.class, Float.TYPE, 5);
        n = gy.a(class_757.class, Float.TYPE, 6);
        o = gy.a(class_757.class, Float.TYPE, 7);
    }

    @hz(method="method_3186", desc="(Lnet/minecraft/class_4587;F)V", at=iD.CANCELLABLE)
    public static boolean b(class_757 class_7572, class_4587 class_45872, float f2) {
        if (d) {
            return false;
        }
        hl hl2 = (hl)e.a();
        return hl2 == null || !hl2.h();
    }

    public static void b(boolean bl2) {
        d = bl2;
    }

    @hz(method="method_3172", desc="(Lnet/minecraft/class_4184;FLorg/joml/Matrix4f;)V", at=iD.TAIL)
    public static void b(class_757 class_7572, class_4184 class_41842, float f2, Matrix4f matrix4f) {
        if (!k) {
            return;
        }
        k = false;
        dz dz2 = aa.a();
        if (dz2 != null) {
            try {
                dz2.c();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if (!l) {
            return;
        }
        l = false;
        try {
            if (dz2 != null && dz2.d()) {
                dk.a(lo.aM, dz2.c());
            } else {
                fq fq2 = (fq)i.a();
                if (fq2 != null) {
                    fq fq3 = fq2;
                    class_310 class_3102 = lo.aM;
                    dk.a(fq3, class_3102);
                }
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static dz a() {
        gu gu2 = (gu)j.a();
        return gu2 != null ? gu2.a() : null;
    }

    @hz(target=class_4603.class, method="method_23070", desc="(Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;)V", at=iD.CANCELLABLE)
    public static boolean a(class_4587 class_45872, class_4597 class_45972) {
        hl hl2 = (hl)e.a();
        return hl2 == null || !hl2.a();
    }

    @hz(method="method_3172", desc="(Lnet/minecraft/class_4184;FLorg/joml/Matrix4f;)V", at=iD.HEAD)
    public static void a(class_757 class_7572, class_4184 class_41842, float f2, Matrix4f matrix4f) {
        k = false;
        l = false;
        dz dz2 = aa.a();
        if (dz2 != null) {
            dz2.a();
        }
        if (!(i.a() != null || dz2 != null && dz2.c())) {
            return;
        }
        if (!dk.a(lo.aM.method_1522())) {
            return;
        }
        k = true;
    }

    @hz(method="method_57796", desc="()V", at=iD.CANCELLABLE)
    public static boolean a(class_757 class_7572) {
        return !gd.b();
    }

    public static void a(float f2) {
        c = f2;
    }

    public static void a(boolean bl2) {
        b = bl2;
    }

    @hz(target=class_465.class, method="method_2380", desc="(Lnet/minecraft/class_332;II)V", at=iD.CANCELLABLE)
    public static boolean a(class_465 class_4652, class_332 class_3322, int n2, int n3) {
        try {
            int n4;
            class_465 class_4653;
            class_332 class_3323;
            int n5;
            gS gS2 = (gS)g.a();
            if (gS2 != null && gS2.a(n5 = n2, class_3323 = class_3322, class_4653 = class_4652, n4 = n3)) {
                return false;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return true;
    }

    @hz(method="method_22973", desc="(F)Lorg/joml/Matrix4f;", at=iD.REPLACE)
    public static Matrix4f a(class_757 class_7572, float f2) {
        try {
            cq cq2 = (cq)f.a();
            if (cq2 != null && !cq.a()) {
                Matrix4f matrix4f = new Matrix4f();
                float f3 = hW.a.getFloat(class_7572, m);
                if (f3 != 1.0f) {
                    float f4 = hW.a.getFloat(class_7572, n);
                    float f5 = hW.a.getFloat(class_7572, o);
                    matrix4f.translate(f4, -f5, 0.0f);
                    matrix4f.scale(f3, f3, 1.0f);
                }
                return matrix4f.perspective(f2 * ((float)Math.PI / 180), cq.a(), 0.05f, class_7572.method_32796());
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return (Matrix4f)bP.a(class_7572, Float.valueOf(f2));
    }

    @hz(method="method_3198", desc="(Lnet/minecraft/class_4587;F)V", at=iD.CANCELLABLE)
    public static boolean a(class_757 class_7572, class_4587 class_45872, float f2) {
        hl hl2 = (hl)e.a();
        return hl2 == null || !hl2.c();
    }

    @hz(method="method_3196", desc="(Lnet/minecraft/class_4184;FZ)F", at=iD.REPLACE)
    public static float a(class_757 class_7572, class_4184 class_41842, float f2, boolean bl2) {
        Object object;
        float f3 = b ? (bl2 ? c : 70.0f) : ((object = (Float)bP.a(class_7572, class_41842, Float.valueOf(f2), bl2)) != null ? ((Float)object).floatValue() : 70.0f);
        object = gM.a();
        if (object != null) {
            f3 *= ((gM)object).a();
        }
        return f3;
    }

    public static void a() {
        l = true;
    }

    public static boolean a() {
        return k;
    }

    @hz(target=class_4603.class, method="method_23068", desc="(Lnet/minecraft/class_1058;Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;)V", at=iD.CANCELLABLE)
    public static boolean a(class_1058 class_10582, class_4587 class_45872, class_4597 class_45972) {
        hl hl2 = (hl)e.a();
        return hl2 == null;
    }

    public static class_9779 a() {
        return a;
    }

    @hz(target=class_437.class, method="method_47413", desc="(Lnet/minecraft/class_332;IIF)V", at=iD.TAIL)
    public static void a(class_437 class_4372, class_332 class_3322, int n2, int n3, float f2) {
        try {
            Object object;
            if (lo.aM.field_1755 == class_4372 && lo.aM.method_18506() == null && lo.aM.method_53466() && a != null && !gd.j() && (object = hW.a()) != null) {
                ((aW)object).a(class_3322, a);
            }
            if (class_4372 instanceof class_433) {
                class_4185 class_41852;
                object = (class_433)class_4372;
                if (fj.c() && cr.a != -1L && (class_41852 = (class_4185)gy.a(object, cr.a)) != null && lo.aM.field_1772 != null) {
                    int n4 = class_41852.method_46426() + class_41852.method_25368() / 2;
                    int n5 = class_41852.method_46427() + class_41852.method_25364() + 4;
                    String string = fj.h() ? "\u00a7e\u26a0 \u041d\u0430\u0436\u043c\u0438\u0442\u0435 \u0435\u0449\u0451 \u0440\u0430\u0437 \u0434\u043b\u044f \u0432\u044b\u0445\u043e\u0434\u0430" : "\u00a7c\u26a0 \u0412\u044b \u0432 PvP!";
                    class_3322.method_25300(lo.aM.field_1772, string, n4, n5, -1);
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @hz(method="method_3192", desc="(Lnet/minecraft/class_9779;Z)V", at=iD.CANCELLABLE)
    public static boolean a(class_757 class_7572, class_9779 class_97792, boolean bl2) {
        hh hh2 = (hh)h.a();
        if (hh2 != null && hh2.a()) {
            return false;
        }
        a = class_97792;
        b.a();
        return true;
    }
}

