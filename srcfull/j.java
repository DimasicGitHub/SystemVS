/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Set;
import net.minecraft.class_10151;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1921;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.minecraft.class_276;
import net.minecraft.class_2784;
import net.minecraft.class_279;
import net.minecraft.class_284;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3695;
import net.minecraft.class_4063;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4604;
import net.minecraft.class_5498;
import net.minecraft.class_638;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_757;
import net.minecraft.class_761;
import net.minecraft.class_898;
import net.minecraft.class_9779;
import net.minecraft.class_9909;
import net.minecraft.class_9922;
import net.minecraft.class_9925;
import net.minecraft.class_9958;
import net.minecraft.class_9975;
import net.minecraft.class_9976;
import net.minecraft.class_9978;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@jB(value=class_761.class)
public class j {
    private static final hW<hl> a = new hW(hl.class);
    private static final hW<lt> b = new hW(lt.class);
    private static final hW<dv> c = new hW(dv.class);
    private static final hW<kQ> d = new hW(kQ::a);
    private static final hW<eW> e = new hW(eW::a);
    private static final long f = gy.a(class_761.class, class_638.class);
    private static final long g = gy.a(class_898.class, Boolean.TYPE, 0);
    private static final long h = gy.a(class_898.class, Boolean.TYPE, 1);
    private static final H i = new H();
    private static final class_4587 j = new class_4587();
    private static boolean k;
    private static boolean l;
    private static class_1297 m;
    private static class_742 n;
    private static class_898 o;
    private static boolean p;
    private static boolean q;
    private static class_276 r;
    private static class_276 s;
    private static class_276 t;
    private static dv u;
    private static boolean v;

    @hz(method="method_62207", desc="(Lnet/minecraft/class_4587;Lnet/minecraft/class_4597$class_4598;Lnet/minecraft/class_4184;Lnet/minecraft/class_9779;Ljava/util/List;)V", at=iD.TAIL)
    public static void b(class_761 class_7612, class_4587 class_45872, class_4597.class_4598 class_45982, class_4184 class_41842, class_9779 class_97792, List list) {
        aW aW2 = hW.a();
        if (aW2 == null) {
            return;
        }
        try {
            class_638 class_6382 = (class_638)gy.a(class_7612, f);
            H h2 = i.a(class_45872, class_41842, class_97792, class_6382);
            aW2.b(h2);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    @hz(method="method_3254", desc="()V", at=iD.CANCELLABLE)
    public static boolean b(class_761 class_7612) {
        hl hl2 = (hl)a.a();
        return hl2 == null || !hl2.p();
    }

    private static boolean b() {
        eW eW2 = (eW)e.a();
        return eW2 != null && eW2.a() && eW2.b() < 32.0f;
    }

    @hz(method="method_62214", desc="(Lnet/minecraft/class_9958;Lnet/minecraft/class_9779;Lnet/minecraft/class_4184;Lnet/minecraft/class_3695;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lnet/minecraft/class_9925;Lnet/minecraft/class_9925;Lnet/minecraft/class_9925;Lnet/minecraft/class_9925;ZLnet/minecraft/class_4604;Lnet/minecraft/class_9925;)V", at=iD.TAIL)
    public static void b(class_761 class_7612, class_9958 class_99582, class_9779 class_97792, class_4184 class_41842, class_3695 class_36952, Matrix4f matrix4f, Matrix4f matrix4f2, class_9925 class_99252, class_9925 class_99253, class_9925 class_99254, class_9925 class_99255, boolean bl2, class_4604 class_46042, class_9925 class_99256) {
        aW aW2 = hW.a();
        if (aW2 == null) {
            return;
        }
        if (!jI.a()) {
            return;
        }
        try {
            class_638 class_6382 = (class_638)gy.a(class_7612, f);
            ad.a();
            H h2 = i.a(j, class_41842, class_97792, class_6382);
            aW2.e(h2);
            aW2.f(h2);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    @hz(method="method_3251", desc="(Lnet/minecraft/class_1921;DDDLorg/joml/Matrix4f;Lorg/joml/Matrix4f;)V", at=iD.TAIL)
    public static void b(class_761 class_7612, class_1921 class_19212, double d2, double d3, double d4, Matrix4f matrix4f, Matrix4f matrix4f2) {
        lt lt2 = (lt)b.a();
        if (lt2 != null) {
            lt2.b();
        }
    }

    @hz(method="method_22710", desc="(Lnet/minecraft/class_9922;Lnet/minecraft/class_9779;ZLnet/minecraft/class_4184;Lnet/minecraft/class_757;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;)V", at=iD.TAIL)
    public static void b(class_761 class_7612, class_9922 class_99222, class_9779 class_97792, boolean bl2, class_4184 class_41842, class_757 class_7572, Matrix4f matrix4f, Matrix4f matrix4f2) {
        Object object;
        if (iv.a()) {
            try {
                RenderSystem.disableBlend();
                RenderSystem.disableDepthTest();
                RenderSystem.resetTextureMatrix();
                iv.a(class_310.method_1551().method_1522());
                class_310.method_1551().method_1522().method_1235(true);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if (dS.a()) {
            try {
                RenderSystem.disableBlend();
                RenderSystem.disableDepthTest();
                RenderSystem.resetTextureMatrix();
                dS.a(class_310.method_1551().method_1522());
                class_310.method_1551().method_1522().method_1235(true);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if (ly.a()) {
            try {
                RenderSystem.disableBlend();
                RenderSystem.disableDepthTest();
                RenderSystem.resetTextureMatrix();
                ly.a(class_310.method_1551().method_1522());
                class_310.method_1551().method_1522().method_1235(true);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        try {
            dv dv2 = (dv)c.a();
            class_310 class_3102 = class_310.method_1551();
            kO.a(dv2, class_3102);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            object = bp.a();
            if (object != null && ((bp)object).c()) {
                b.a();
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        object = hW.a();
        if (object == null) {
            return;
        }
        try {
            class_638 class_6382 = (class_638)gy.a(class_7612, f);
            H h2 = i.a(j, class_41842, class_97792, class_6382);
            ((aW)object).c(h2);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    @hz(method="method_62207", desc="(Lnet/minecraft/class_4587;Lnet/minecraft/class_4597$class_4598;Lnet/minecraft/class_4184;Lnet/minecraft/class_9779;Ljava/util/List;)V", at=iD.HEAD)
    public static void c(class_761 class_7612, class_4587 class_45872, class_4597.class_4598 class_45982, class_4184 class_41842, class_9779 class_97792, List list) {
        boolean bl2;
        dv dv2;
        if (k) {
            j.a();
        }
        if ((dv2 = (dv)c.a()) == null || !dv2.a()) {
            return;
        }
        class_310 class_3102 = class_310.method_1551();
        class_746 class_7462 = class_3102.field_1724;
        if (class_3102.field_1687 == null || class_7462 == null || class_3102.field_1773.method_35765()) {
            return;
        }
        class_276 class_2762 = class_3102.method_1522();
        boolean bl3 = dv2.c();
        class_276 class_2763 = class_2762;
        boolean bl4 = !dv2.b();
        if (!kO.a(class_2763, bl4, bl2 = bl3)) {
            return;
        }
        class_2762.method_1235(false);
        n = class_7462;
        l = class_3102.field_1690.method_31044() == class_5498.field_26664;
        m = l ? class_3102.method_1560() : null;
        o = class_3102.method_1561();
        r = class_2762;
        s = kO.a();
        t = kO.b();
        u = dv2;
        v = bl3;
        p = hW.a.getBoolean(o, g);
        q = hW.a.getBoolean(o, h);
        hW.a.putBoolean(o, g, false);
        hW.a.putBoolean(o, h, false);
        k = s != null;
    }

    @hz(method="method_62207", desc="(Lnet/minecraft/class_4587;Lnet/minecraft/class_4597$class_4598;Lnet/minecraft/class_4184;Lnet/minecraft/class_9779;Ljava/util/List;)V", at=iD.TAIL)
    public static void d(class_761 class_7612, class_4587 class_45872, class_4597.class_4598 class_45982, class_4184 class_41842, class_9779 class_97792, List list) {
        if (!k) {
            return;
        }
        j.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @hz(method="method_22977", desc="(Lnet/minecraft/class_1297;DDDFLnet/minecraft/class_4587;Lnet/minecraft/class_4597;)V", at=iD.TAIL)
    public static void a(class_761 class_7612, class_1297 class_12972, double d2, double d3, double d4, float f2, class_4587 class_45872, class_4597 class_45972) {
        try {
            j.a(class_12972, d2, d3, d4, f2, class_45872);
        }
        finally {
            gv.a(class_45872);
        }
    }

    private static void a() {
        k = false;
        if (o != null) {
            hW.a.putBoolean(o, g, p);
            hW.a.putBoolean(o, h, q);
        }
        if (r != null) {
            kO.a(r);
        }
        n = null;
        m = null;
        o = null;
        r = null;
        s = null;
        t = null;
        u = null;
    }

    @hz(method="method_22990", desc="()Lnet/minecraft/class_276;", at=iD.REPLACE)
    public static class_276 a(class_761 class_7612) {
        if (aL.a()) {
            class_276 class_2762 = aL.a();
            if (class_2762 == null) {
                class_2762 = kO.a();
            }
            if (class_2762 != null) {
                return class_2762;
            }
        }
        return (class_276)bP.a(class_7612);
    }

    @hz(target=class_9975.class, method="method_62306", desc="(Lnet/minecraft/class_4587;Lnet/minecraft/class_4597$class_4598;FI)V", at=iD.CANCELLABLE)
    public static boolean a(class_9975 class_99752, class_4587 class_45872, class_4597.class_4598 class_45982, float f2, int n2) {
        return d.a() == null && !j.b();
    }

    @hz(target=class_9975.class, method="method_62305", desc="(Lnet/minecraft/class_4587;)V", at=iD.CANCELLABLE)
    public static boolean a(class_9975 class_99752, class_4587 class_45872) {
        return d.a() == null && !j.b();
    }

    @hz(method="method_62204", desc="(Lnet/minecraft/class_9909;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lnet/minecraft/class_4063;Lnet/minecraft/class_243;FIF)V", at=iD.CANCELLABLE)
    public static boolean a(class_761 class_7612, class_9909 class_99092, Matrix4f matrix4f, Matrix4f matrix4f2, class_4063 class_40632, class_243 class_2432, float f2, int n2, float f3) {
        return d.a() == null && !j.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @hz(method="method_62208", desc="(Lnet/minecraft/class_4587;Lnet/minecraft/class_4597$class_4598;Lnet/minecraft/class_4597$class_4598;Lnet/minecraft/class_4184;F)V", at=iD.TAIL)
    public static void a(class_761 class_7612, class_4587 class_45872, class_4597.class_4598 class_45982, class_4597.class_4598 class_45983, class_4184 class_41842, float f2) {
        try {
            cE.a(class_45872, class_41842, f2);
        }
        catch (Throwable throwable) {
        }
        finally {
            gv.a(class_45872);
        }
    }

    @hz(target=class_9975.class, method="method_62307", desc="(Lnet/minecraft/class_4587;Lnet/minecraft/class_4597$class_4598;FIFFLnet/minecraft/class_9958;)V", at=iD.CANCELLABLE)
    public static boolean a(class_9975 class_99752, class_4587 class_45872, class_4597.class_4598 class_45982, float f2, int n2, float f3, float f4, class_9958 class_99582) {
        return d.a() == null && !j.b();
    }

    @hz(target=class_9975.class, method="method_62302", desc="(FFF)V", at=iD.CANCELLABLE)
    public static boolean a(class_9975 class_99752, float f2, float f3, float f4) {
        kQ kQ2 = (kQ)d.a();
        if (kQ2 != null) {
            kQ2.a();
            return false;
        }
        return !j.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(class_1297 class_12972, double d2, double d3, double d4, float f2, class_4587 class_45872) {
        if (!k) {
            return;
        }
        if (!(class_12972 instanceof class_742)) {
            return;
        }
        class_742 class_7422 = (class_742)class_12972;
        if (u == null || s == null) {
            return;
        }
        if (class_7422 == n || !class_7422.method_5805() || class_7422.method_31481() || class_7422.method_7325()) {
            return;
        }
        if (l && class_7422 == m) {
            return;
        }
        boolean bl2 = u.e((class_1657)class_7422);
        if (bl2 && !v) {
            return;
        }
        if (!u.a((class_1657)class_7422)) {
            return;
        }
        boolean bl3 = bl2 && t != null;
        class_276 class_2762 = bl3 ? t : s;
        double d5 = class_3532.method_16436((double)f2, (double)class_7422.field_6038, (double)class_7422.method_23317());
        double d6 = class_3532.method_16436((double)f2, (double)class_7422.field_5971, (double)class_7422.method_23318());
        double d7 = class_3532.method_16436((double)f2, (double)class_7422.field_5989, (double)class_7422.method_23321());
        ht ht2 = ht.a();
        aL.a(class_2762);
        class_2762.method_1235(false);
        try {
            o.method_62424((class_1297)class_7422, d5 - d2, d6 - d3, d7 - d4, f2, class_45872, (class_4597)ht2, o.method_23839((class_1297)class_7422, f2));
            ht2.a();
            if (bl3) {
                kO.c();
            } else {
                kO.b();
            }
        }
        catch (Throwable throwable) {
        }
        finally {
            aL.a();
            r.method_1235(false);
        }
    }

    @hz(target=class_9976.class, method="method_62316", desc="(Lnet/minecraft/class_1937;Lnet/minecraft/class_4597;IFLnet/minecraft/class_243;)V", at=iD.CANCELLABLE)
    public static boolean a(class_9976 class_99762, class_1937 class_19372, class_4597 class_45972, int n2, float f2, class_243 class_2432) {
        hl hl2 = (hl)a.a();
        return hl2 == null || !hl2.q();
    }

    @hz(target=class_310.class, method="method_1588", desc="()Z", at=iD.CANCELLABLE)
    public static boolean a() {
        hl hl2 = (hl)a.a();
        return hl2 == null || !hl2.x();
    }

    @hz(target=class_310.class, method="method_27022", desc="(Lnet/minecraft/class_1297;)Z", at=iD.CANCELLABLE)
    public static boolean a(class_310 class_3102, class_1297 class_12972) {
        return true;
    }

    @hz(method="method_3270", desc="()Z", at=iD.CANCELLABLE)
    public static boolean a(class_761 class_7612) {
        return true;
    }

    @hz(target=class_284.class, method="method_1249", desc="(FFF)V", at=iD.REPLACE)
    public static void a(class_284 class_2843, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float[] fArray;
        lt lt2 = (lt)b.a();
        if (lt2 != null && (fArray = lt2.a(f7 = f3, f6 = f4, f5 = f2)) != null) {
            bP.a(class_2843, Float.valueOf(fArray[0]), Float.valueOf(fArray[1]), Float.valueOf(fArray[2]));
            return;
        }
        bP.a(class_2843, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4));
    }

    @hz(method="method_3279", desc="()V", at=iD.HEAD)
    public static void a(class_761 class_7612) {
        lt lt2 = (lt)b.a();
        if (lt2 != null) {
            lt2.c();
        }
    }

    @hz(method="method_22710", desc="(Lnet/minecraft/class_9922;Lnet/minecraft/class_9779;ZLnet/minecraft/class_4184;Lnet/minecraft/class_757;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;)V", at=iD.HEAD)
    public static void a(class_761 class_7612, class_9922 class_99222, class_9779 class_97792, boolean bl2, class_4184 class_41842, class_757 class_7572, Matrix4f matrix4f, Matrix4f matrix4f2) {
        try {
            ly.a(class_99222);
            dS.a(class_99222);
            Matrix4f matrix4f3 = matrix4f2;
            Matrix4f matrix4f4 = matrix4f;
            class_4184 class_41843 = class_41842;
            class_9922 class_99223 = class_99222;
            iv.a(matrix4f4, class_99223, matrix4f3, class_41843);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            cE.a();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        kO.a();
        aW aW2 = hW.a();
        if (aW2 == null) {
            return;
        }
        try {
            aW2.d();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    @hz(method="method_3251", desc="(Lnet/minecraft/class_1921;DDDLorg/joml/Matrix4f;Lorg/joml/Matrix4f;)V", at=iD.HEAD)
    public static void a(class_761 class_7612, class_1921 class_19212, double d2, double d3, double d4, Matrix4f matrix4f, Matrix4f matrix4f2) {
        lt lt2 = (lt)b.a();
        if (lt2 != null) {
            double d5 = d4;
            double d6 = d3;
            double d7 = d2;
            lt2.a(d5, d7, d6);
        }
    }

    @hz(method="method_62207", desc="(Lnet/minecraft/class_4587;Lnet/minecraft/class_4597$class_4598;Lnet/minecraft/class_4184;Lnet/minecraft/class_9779;Ljava/util/List;)V", at=iD.HEAD)
    public static void a(class_761 class_7612, class_4587 class_45872, class_4597.class_4598 class_45982, class_4184 class_41842, class_9779 class_97792, List list) {
        aW aW2 = hW.a();
        if (aW2 == null) {
            return;
        }
        try {
            class_638 class_6382 = (class_638)gy.a(class_7612, f);
            H h2 = i.a(class_45872, class_41842, class_97792, class_6382);
            aW2.a(h2);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    @hz(method="method_62214", desc="(Lnet/minecraft/class_9958;Lnet/minecraft/class_9779;Lnet/minecraft/class_4184;Lnet/minecraft/class_3695;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lnet/minecraft/class_9925;Lnet/minecraft/class_9925;Lnet/minecraft/class_9925;Lnet/minecraft/class_9925;ZLnet/minecraft/class_4604;Lnet/minecraft/class_9925;)V", at=iD.HEAD)
    public static void a(class_761 class_7612, class_9958 class_99582, class_9779 class_97792, class_4184 class_41842, class_3695 class_36952, Matrix4f matrix4f, Matrix4f matrix4f2, class_9925 class_99252, class_9925 class_99253, class_9925 class_99254, class_9925 class_99255, boolean bl2, class_4604 class_46042, class_9925 class_99256) {
        aW aW2 = hW.a();
        if (aW2 == null) {
            return;
        }
        try {
            bU.a(matrix4f, matrix4f2);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            class_638 class_6382 = (class_638)gy.a(class_7612, f);
            H h2 = i.a(j, class_41842, class_97792, class_6382);
            aW2.d(h2);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    @hz(target=class_10151.class, method="method_62941", desc="(Lnet/minecraft/class_2960;Ljava/util/Set;)Lnet/minecraft/class_279;", at=iD.REPLACE)
    public static class_279 a(class_10151 class_101512, class_2960 class_29602, Set set) {
        class_279 class_2792 = (class_279)bP.a(class_101512, class_29602, set);
        if (class_2792 != null && class_29602 != null && "minecraft".equals(class_29602.method_12836()) && "saturation".equals(class_29602.method_12832())) {
            try {
                ly.a(class_2792);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return class_2792;
    }

    @hz(target=class_9978.class, method="method_62322", desc="(Lnet/minecraft/class_2784;Lnet/minecraft/class_243;DD)V", at=iD.CANCELLABLE)
    public static boolean a(class_9978 class_99782, class_2784 class_27842, class_243 class_2432, double d2, double d3) {
        hl hl2 = (hl)a.a();
        return hl2 == null || !hl2.r();
    }
}

