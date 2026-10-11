/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.class_1799;
import net.minecraft.class_1935;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2480;
import net.minecraft.class_7923;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class kt
extends ke<class_2248, bI> {
    private static final int k = -1;
    private static final float l = 56.0f;
    private static final float m = 18.0f;
    private static final float n = 4.0f;
    private static final float o = 4.0f;
    private static final float p = 12.0f;
    private static final float q = 8.0f;
    private static final float r = 16.0f;
    private static final float s = 16.0f;
    private static final float t = 8.0f;
    private final t u;
    private final List<class_2248> v = new ArrayList<class_2248>();
    private final List<class_2248> w = new ArrayList<class_2248>();
    private final lw F;
    private final ft G;
    private class_2248 H;
    private boolean I;
    private final Map<class_2248, bo> J;
    private final Map<class_2248, bo> K;

    public kt(t t2) {
        lw lw2 = new lw("", "", -1, true);
        lw2.setNameParts(new String[]{"_", "_", "b", "l", "o", "c", "k", "l", "i", "s", "t", "_", "e", "d", "i", "t"});
        this.F = lw2;
        this.G = new ft(this.F);
        this.J = new HashMap<class_2248, bo>();
        this.K = new HashMap<class_2248, bo>();
        this.u = t2;
        for (class_2248 class_22484 : class_7923.field_41175) {
            if (class_22484 == class_2246.field_10124 || class_22484 == class_2246.field_10543 || class_22484 == class_2246.field_10243 || class_22484 instanceof class_2480 && class_22484 != class_2246.field_10603 || new class_1799((class_1935)class_22484).method_7960()) continue;
            this.w.add(class_22484);
        }
        this.w.sort((class_22482, class_22483) -> this.a((class_2248)class_22482).compareToIgnoreCase(this.a((class_2248)class_22483)));
        this.F.b(() -> {
            if (this.H != null) {
                int n2;
                int n3 = n2 = this.F.a();
                class_2248 class_22482 = this.H;
                t2.a(n3, class_22482);
                bI bI2 = this.b(this.H);
                if (bI2 != null) {
                    bI2.d.a(n2);
                }
            }
        });
        this.G.b(false);
    }

    @Override
    protected String e() {
        return "\u0412\u044b\u043a\u043b\u044e\u0447\u0438\u0442\u044c \u0432\u0441\u0435";
    }

    @Override
    protected boolean b(double d2, double d3, int n2) {
        if (!this.G.c()) {
            return false;
        }
        this.G.a(d2, d3, n2);
        return true;
    }

    private bI b(class_2248 class_22482) {
        for (bI bI2 : this.aA.a()) {
            if (bI2.a != class_22482) continue;
            return bI2;
        }
        return null;
    }

    @Override
    protected void b() {
        this.I = !this.I;
        this.a();
    }

    @Override
    protected String b() {
        return "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u0442\u0435 \u043e\u0442\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u0435 \u0431\u043b\u043e\u043a\u043e\u0432 \u0444\u0443\u043d\u043a\u0446\u0438\u0438 \u0411\u043b\u043e\u043a\u0415\u0441\u043f.";
    }

    @Override
    protected boolean b(double d2, double d3, double d4) {
        return this.G.c();
    }

    @Override
    protected boolean b(int n2, char c2) {
        if (!this.G.c()) {
            return false;
        }
        int n3 = n2;
        char c3 = c2;
        return this.G.a(n3, c3);
    }

    @Override
    protected boolean c(int n2, double d2, double d3) {
        double d4;
        double d5;
        if (!this.G.c()) {
            return false;
        }
        float f2 = 383.0f;
        float f3 = 293.0f;
        float f4 = this.G.p();
        float f5 = this.G.o();
        if (kt.a(f5, f4, d5 = d3, f2, f3, d4 = d2)) {
            int n3 = n2;
            double d6 = d3;
            double d7 = d2;
            this.G.b(n3, d7, d6);
        } else {
            this.G.n();
        }
        return true;
    }

    @Override
    protected String c() {
        return "\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043d\u0430\u0437\u0432\u0430\u043d\u0438\u0435 \u0431\u043b\u043e\u043a\u0430";
    }

    @Override
    protected void c() {
        for (class_2248 class_22482 : this.u.a().keySet()) {
            this.u.a(class_22482, false);
            bI bI2 = this.b(class_22482);
            if (bI2 == null) continue;
            bI2.c.c(0.0f);
        }
        if (this.I) {
            this.a();
        }
    }

    @Override
    protected boolean d(int n2, int n3, int n4) {
        if (!this.G.c()) {
            return false;
        }
        int n5 = n3;
        int n6 = n2;
        int n7 = n4;
        return this.G.a(n6, n5, n7);
    }

    @Override
    protected String d() {
        return this.I ? "\u041f\u043e\u043a\u0430\u0437\u0430\u0442\u044c \u0432\u0441\u0435" : "\u0422\u043e\u043b\u044c\u043a\u043e \u0432\u043a\u043b.";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean d(double d2, double d3) {
        double d4;
        double d5;
        if (super.d(d2, d3)) {
            return true;
        }
        if (!this.G.c()) return false;
        float f2 = 383.0f;
        float f3 = 293.0f;
        float f4 = this.G.p();
        float f5 = this.G.o();
        if (!kt.a(f5, f4, d5 = d3, f2, f3, d4 = d2)) return false;
        return true;
    }

    @Override
    protected void d() {
        this.a();
    }

    @Override
    protected boolean a(double d2, double d3, double d4, int n2, double d5) {
        if (!this.G.c()) {
            return false;
        }
        double d6 = d4;
        double d7 = d5;
        int n3 = n2;
        double d8 = d3;
        double d9 = d2;
        this.G.a(d8, d9, n3, d7, d6);
        return true;
    }

    @Override
    protected /* bridge */ /* synthetic */ boolean a(el el2, float f2, float f3, double d2, float f4, double d3) {
        float f5 = f4;
        float f6 = f2;
        float f7 = f3;
        double d4 = d3;
        double d5 = d2;
        bI bI2 = (bI)el2;
        return this.a(d5, f7, bI2, f6, d4, f5);
    }

    @Override
    protected /* bridge */ /* synthetic */ void a(Matrix4f matrix4f, float f2, float f3, float f4, float f5, float f6, float f7, el el2) {
        float f8 = f3;
        float f9 = f6;
        float f10 = f5;
        float f11 = f2;
        float f12 = f7;
        float f13 = f4;
        bI bI2 = (bI)el2;
        Matrix4f matrix4f2 = matrix4f;
        this.a(f8, f9, bI2, matrix4f2, f12, f13, f11, f10);
    }

    @Override
    protected /* bridge */ /* synthetic */ el a(Object object) {
        return this.a((class_2248)object);
    }

    @Override
    protected List a() {
        return this.v;
    }

    protected bI a(class_2248 class_22482) {
        return new bI(class_22482, this.u.a(class_22482), this.a(class_22482));
    }

    private String a(class_2248 class_22482) {
        return class_22482.method_9518().getString();
    }

    private int a(class_2248 class_22482) {
        return this.u.a().containsKey(class_22482) ? this.u.a(class_22482) : -1;
    }

    private void a() {
        String string = this.az.a() == null ? "" : this.az.a().trim().toLowerCase();
        this.v.clear();
        for (class_2248 class_22482 : this.w) {
            if (this.I && !this.u.a(class_22482) || !string.isEmpty() && !this.a(class_22482).toLowerCase().contains(string)) continue;
            this.v.add(class_22482);
        }
    }

    @Override
    protected boolean a() {
        return this.I;
    }

    @Override
    protected String a() {
        return "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0435\u043c\u044b\u0435 \u0431\u043b\u043e\u043a\u0438";
    }

    protected boolean a(double d2, float f2, bI bI2, float f3, double d3, float f4) {
        float f5 = f2 + f4 - 8.0f - 28.0f;
        float f6 = f3 + 5.0f;
        float f7 = f5 - 8.0f - 16.0f;
        float f8 = f3 + 5.0f;
        float f9 = f5 - 2.0f;
        float f10 = f6 - 3.0f;
        double d4 = d3;
        float f11 = 22.0f;
        float f12 = 32.0f;
        double d5 = d2;
        if (kt.a(f9, f10, d4, f11, f12, d5)) {
            this.a(bI2.a);
        } else {
            float f13 = f7 - 4.0f;
            float f14 = f8 - 4.0f;
            double d6 = d3;
            float f15 = 24.0f;
            float f16 = 24.0f;
            double d7 = d2;
            if (kt.a(f13, f14, d6, f15, f16, d7)) {
                this.a(bI2.a, f3 + 13.0f);
            }
        }
        return true;
    }

    @Override
    protected void a(float f2, Matrix4f matrix4f, float f3, Matrix4f matrix4f2, float f4, float f5) {
        if (this.G.c()) {
            float f6 = f4;
            float f7 = f3;
            float f8 = f2;
            Matrix4f matrix4f3 = matrix4f;
            this.G.d(f7, f8, f6, matrix4f3);
        }
    }

    private void a(class_2248 class_22482, float f2) {
        float f3;
        if (!this.u.a().containsKey(class_22482)) {
            int n2 = -1;
            boolean bl2 = this.u.a(class_22482);
            class_2248 class_22483 = class_22482;
            this.u.a(bl2, class_22483, n2);
        }
        this.H = class_22482;
        int n3 = this.a(class_22482);
        int n4 = n3 >> 24 & 0xFF;
        int n5 = n3 & 0xFF;
        int n6 = n3 >> 8 & 0xFF;
        int n7 = n3 >> 16 & 0xFF;
        this.F.a(n7, n6, n4, n5);
        float f4 = this.a - 293.0f - 6.0f;
        if (f4 < 0.0f) {
            f4 = this.a + this.c + 6.0f;
        }
        float f5 = f3 = f2 - 191.5f;
        float f6 = f4;
        this.G.c(f5, f6);
        this.G.i();
    }

    private void a(class_2248 class_22482) {
        boolean bl2;
        if (this.u.a().containsKey(class_22482)) {
            bl2 = !this.u.a(class_22482);
            this.u.a(class_22482, bl2);
        } else {
            int n2 = -1;
            boolean bl3 = true;
            class_2248 class_22483 = class_22482;
            this.u.a(bl3, class_22483, n2);
            bl2 = true;
        }
        bI bI2 = this.b(class_22482);
        if (bI2 != null) {
            bI2.c.c(bl2 ? 1.0f : 0.0f);
        }
        if (this.I) {
            this.a();
        }
    }

    protected void a(float f2, float f3, bI bI2, Matrix4f matrix4f, float f4, float f5, float f6, float f7) {
        class_2248 class_22483 = bI2.a;
        boolean bl2 = this.u.a(class_22483);
        bI2.c.c(bl2 ? 1.0f : 0.0f);
        float f8 = bI2.c.a();
        float f9 = f2 * (0.4f + 0.6f * f8);
        bo bo2 = this.J.computeIfAbsent(class_22483, class_22482 -> jm.a());
        float f10 = 26.0f;
        float f11 = f6;
        float f12 = f4;
        float f13 = f5;
        double d2 = f3;
        double d3 = f7;
        boolean bl3 = kt.a(f13, f12, d2, f10, f11, d3);
        float f14 = f2;
        boolean bl4 = bl3;
        bo bo3 = bo2;
        float f15 = 6.0f;
        float f16 = 26.0f;
        float f17 = f6;
        float f18 = f4;
        float f19 = f5;
        Matrix4f matrix4f2 = matrix4f;
        cv.a(f14, matrix4f2, bl4, f15, f18, f16, bo3, f17, f19);
        float f20 = f5 + 6.0f;
        float f21 = f4 + 5.0f;
        class_1799 class_17992 = new class_1799((class_1935)class_22483);
        if (!class_17992.method_7960()) {
            float f22 = f9;
            float f23 = 16.0f;
            float f24 = f21;
            float f25 = f20;
            class_1799 class_17993 = class_17992;
            Matrix4f matrix4f3 = matrix4f;
            ir.a(f23, f22, f25, class_17993, matrix4f3, f24);
        }
        float f26 = f8;
        int n2 = gD.foreground();
        int n3 = gD.mutedFg();
        int n4 = bC.a(n2, f26, n3);
        float f27 = f5 + f6 - 8.0f - 28.0f;
        float f28 = f4 + 5.0f;
        float f29 = f27 - 8.0f - 16.0f;
        float f30 = f4 + 5.0f;
        String string = String.format("#%06X", this.a(class_22483) & 0xFFFFFF);
        float f31 = ao.a(string, 12.0f);
        float f32 = Math.max(56.0f, f31 + 8.0f);
        float f33 = f29 - 8.0f - f32;
        float f34 = f4 + 4.0f;
        int n5 = 0xFF000000 | this.a(class_22483) & 0xFFFFFF;
        int n6 = cv.a(n5);
        if (bI2.e == null) {
            bI2.e = new ks(n6, n5, f32);
        }
        float f35 = f32;
        int n7 = n5;
        int n8 = n6;
        bI2.e.a(n7, n8, f35);
        float f36 = f20 + 16.0f + 6.0f;
        float f37 = f4 + 7.0f;
        float f38 = f33 - 6.0f - f36;
        float f39 = 26.0f;
        float f40 = f38;
        float f41 = f4;
        float f42 = f36;
        aM.b(f40, f39, f41, f42);
        ao.a(matrix4f, this.a(class_22483), f36, f37, 12.0f, n4, f9);
        aM.b();
        float f43 = f9;
        int n9 = bI2.e.a();
        float f44 = 4.0f;
        float f45 = 18.0f;
        float f46 = bI2.e.a();
        float f47 = f34;
        float f48 = f33;
        Matrix4f matrix4f4 = matrix4f;
        dP.a(f44, f48, n9, matrix4f4, f45, f46, f43, f47);
        float f49 = f9;
        int n10 = bI2.e.b();
        float f50 = 12.0f;
        float f51 = f34 + 3.0f;
        float f52 = f33 + (bI2.e.a() - f31) / 2.0f;
        String string2 = string;
        Matrix4f matrix4f5 = matrix4f;
        ao.a(f51, f52, n10, f50, f49, string2, matrix4f5);
        bo bo4 = this.K.computeIfAbsent(class_22483, class_22482 -> jm.a());
        float f53 = 24.0f;
        float f54 = 24.0f;
        float f55 = f30 - 4.0f;
        float f56 = f29 - 4.0f;
        double d4 = f3;
        double d5 = f7;
        boolean bl5 = kt.a(f56, f55, d4, f53, f54, d5);
        bo4.c(bl5 ? 1.0f : 0.0f);
        float f57 = bo4.a();
        int n11 = gD.foreground();
        int n12 = gD.mutedFg();
        int n13 = bC.a(n11, f57, n12);
        float f58 = f9;
        int n14 = n13;
        float f59 = 16.0f;
        float f60 = 16.0f;
        float f61 = f30;
        float f62 = f29;
        kD kD2 = kD.BRUSH;
        Matrix4f matrix4f6 = matrix4f;
        jr.a(f58, n14, matrix4f6, f61, kD2, f59, f62, f60);
        float f63 = f2;
        float f64 = f8;
        float f65 = f28;
        float f66 = f27;
        Matrix4f matrix4f7 = matrix4f;
        cv.a(f65, f63, f66, matrix4f7, f64);
    }

    @Override
    protected void q() {
        if (this.G.c()) {
            this.G.n();
        }
    }
}

