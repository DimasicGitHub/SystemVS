/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class lu
extends gh {
    private static final float k = 16.0f;
    private static final float l = 20.0f;
    private static final float m = 14.0f;
    private static final float n = 6.0f;
    private static final float o = 0.001f;
    private static final float p = 0.5f;
    private static final float q = 0.22f;
    private static final float r = 40.0f;
    private static final float s = 400.0f;
    private static final float t = 3.0f;
    private static final float u = 4.0f;
    private static final float v = 24.0f;
    private static final float w = 2.0f;
    private static final float x = 24.0f;
    private final jD y;
    private final List<cA> z = new ArrayList<cA>();
    private final Map<cA, bo> A = new HashMap<cA, bo>();
    private final bo B = jm.a(0.0f, 0.22f);
    private final bo C = jm.b(0.0f, 0.28f);
    private float D;
    private float E;
    private float F;
    private float G;
    private float H;
    private float I;
    private float J;
    private boolean K;
    private float L;
    private final s M;
    private boolean N;

    public lu(jD jD2) {
        this.y = jD2;
        this.c = 301.0f;
        this.M = new s(jD2.t());
        this.M.a(() -> jD2.a(this.M.a()));
        this.b();
        this.d = this.a();
        this.B.c(1.0f);
    }

    public void e() {
        for (cA cA2 : this.z) {
            if (!cA2.c()) continue;
            cA2.b();
        }
    }

    private float e() {
        return Math.max(0.0f, this.c() - this.d());
    }

    private boolean b(double d2, double d3) {
        float f2 = this.a + this.c - 4.0f - 3.0f;
        return d3 >= (double)(f2 - 3.0f) && d3 <= (double)(f2 + 3.0f + 3.0f) && d2 >= (double)this.J && d2 <= (double)(this.J + this.I);
    }

    private float b() {
        return 73.0f;
    }

    public boolean b() {
        for (cA cA2 : this.z) {
            if (!cA2.c()) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean b(int n2, int n3, int n4) {
        return this.a((T cA2) -> {
            int n5 = n3;
            int n6 = n4;
            int n7 = n2;
            return cA2.b(n7, n5, n6);
        });
    }

    private void b() {
        this.z.clear();
        float f2 = this.f();
        for (fa object : this.y.d()) {
            this.a(object, f2);
        }
        this.A.keySet().retainAll(this.z);
        for (cA cA2 : this.z) {
            this.A.computeIfAbsent(cA2, this::a);
        }
    }

    @Override
    public boolean b(int n2, double d2, double d3) {
        double d4;
        double d5;
        if (n2 == 0 && this.e() > 0.001f && this.b(d5 = d3, d4 = d2)) {
            this.K = true;
            this.L = (float)d3 - this.J;
            return true;
        }
        int n3 = n2;
        double d6 = d2;
        double d7 = d3;
        if (this.M.b(n3, d6, d7)) {
            return true;
        }
        return this.a((T cA2) -> {
            int n3 = n2;
            double d4 = d3;
            double d5 = d2;
            return cA2.b(n3, d5, d4);
        });
    }

    public boolean c() {
        return this.N;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        float f5;
        float f6;
        float f7;
        this.d();
        this.d = this.a();
        float f8 = this.a + 16.0f;
        float f9 = f2;
        float f10 = 6.0f;
        float f11 = 2.0f;
        float f12 = 0.0f;
        int n2 = 0x1A000000;
        float f13 = 1.0f;
        int n3 = gD.border();
        int n4 = gD.background();
        float f14 = 14.0f;
        float f15 = 14.0f;
        float f16 = 14.0f;
        float f17 = 14.0f;
        float f18 = this.d;
        float f19 = this.c;
        float f20 = this.b;
        float f21 = this.a;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f19, n2, n4, f21, f20, f10, f17, f18, f11, matrix4f2, f9, n3, f15, f13, f16, f14, f12);
        float f22 = this.b + 16.0f;
        float f23 = this.a(matrix4f, f8, f2);
        float f24 = f22 + 4.0f;
        float f25 = f2;
        int n5 = gD.foreground();
        float f26 = 16.0f;
        float f27 = f24;
        float f28 = f23;
        String string = this.y.e();
        Matrix4f matrix4f3 = matrix4f;
        ao.a(f25, string, f26, f28, n5, f27, matrix4f3);
        this.M.a(this.y.t());
        float f29 = f8 + this.f() - 28.0f;
        float f30 = f7 = f22 + 4.0f;
        float f31 = f29;
        this.M.c(f30, f31);
        float f32 = f2;
        float f33 = f3;
        float f34 = f4;
        Matrix4f matrix4f4 = matrix4f;
        this.M.c(f32, f33, f34, matrix4f4);
        float f35 = f22 + 24.0f + 16.0f;
        float f36 = f2;
        int n6 = gD.border();
        float f37 = 1.0f;
        float f38 = this.f();
        float f39 = f35;
        float f40 = f8;
        Matrix4f matrix4f5 = matrix4f;
        dP.a(f36, f37, f40, f39, f38, matrix4f5, n6);
        this.c();
        float f41 = this.C.a();
        this.E = f6 = f35 + 1.0f + 16.0f;
        this.F = Math.max(0.0f, this.b + this.d - 16.0f - f6);
        float f42 = f6 - f41;
        float f43 = f8;
        this.a(f42, f43);
        float f44 = f35 + 1.0f;
        float f45 = f5 = Math.max(0.0f, this.b + this.d - 2.0f - f44);
        float f46 = this.c;
        float f47 = f44;
        float f48 = this.a;
        aM.b(f46, f45, f47, f48);
        try {
            float f49 = f2;
            float f50 = f3;
            float f51 = f4;
            Matrix4f matrix4f6 = matrix4f;
            this.a(f49, f51, matrix4f6, f50);
        }
        finally {
            aM.b();
        }
        float f52 = f2;
        float f53 = f41;
        float f54 = f5;
        float f55 = f44;
        Matrix4f matrix4f7 = matrix4f;
        this.a(f54, matrix4f7, f52, f53, f55);
        if (this.e() > 0.001f) {
            float f56 = f2;
            float f57 = f41;
            float f58 = this.F;
            float f59 = f6;
            Matrix4f matrix4f8 = matrix4f;
            this.a(matrix4f8, f59, f56, f58, f57);
        }
    }

    private void c() {
        this.D = Math.clamp((float)this.D, (float)0.0f, (float)this.e());
        this.C.c(this.D);
    }

    private float c() {
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (cA cA2 : this.z) {
            float f4 = this.a(cA2);
            if (f4 <= 0.001f) continue;
            float f5 = cA2.g() * f4;
            float f6 = 16.0f * f4;
            f2 += f5 + (f3 > 0.0f ? f6 : 0.0f);
            f3 += f5 + f6;
        }
        return f2;
    }

    private float f() {
        return this.c - 32.0f;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void d(float f2, float f3, float f4, Matrix4f matrix4f) {
        cP.a(0.0f, fk.a().b());
        try {
            for (cA cA2 : this.z) {
                float f5 = this.a(cA2);
                if (f5 <= 0.001f) continue;
                float f6 = f4 * f5;
                float f7 = f2;
                float f8 = f3;
                Matrix4f matrix4f2 = matrix4f;
                cA2.d(f7, f8, f6, matrix4f2);
            }
        }
        finally {
            cP.a();
        }
    }

    private float d() {
        return Math.max(0.0f, 400.0f - this.b() - 16.0f);
    }

    private void d() {
        for (cA cA2 : this.z) {
            bo bo2 = this.A.get(cA2);
            if (bo2 == null) continue;
            bo2.c(cA2.a().d() ? 1.0f : 0.0f);
            bo2.a();
        }
    }

    @Override
    public boolean a(double d2, double d3, int n2) {
        if (this.K && n2 == 0) {
            this.K = false;
            return true;
        }
        if (this.M.a(d2, d3, n2)) {
            return true;
        }
        return this.a((T cA2) -> cA2.a(d2, d3, n2));
    }

    @Override
    public boolean a(int n2, char c2) {
        return this.a((T cA2) -> {
            int n3 = n2;
            char c3 = c2;
            return cA2.a(n3, c3);
        });
    }

    @Override
    public boolean a(double d2, double d3, int n2, double d4, double d5) {
        if (this.K && n2 == 0) {
            float f2 = Math.max(0.0f, this.H - this.I);
            float f3 = this.e();
            if (f2 > 0.0f && f3 > 0.0f) {
                float f4 = (float)d2 - this.L;
                float f5 = (f4 - this.G) / f2;
                this.D = Math.clamp((float)(f5 * f3), (float)0.0f, (float)f3);
                this.C.c(this.D);
                this.C.b(this.D);
            }
            return true;
        }
        double d6 = d2;
        double d7 = d3;
        int n3 = n2;
        double d8 = d4;
        double d9 = d5;
        if (this.M.a(d6, d7, n3, d8, d9)) {
            return true;
        }
        return this.a((T cA2) -> {
            double d6 = d5;
            double d7 = d4;
            int n3 = n2;
            double d8 = d2;
            double d9 = d3;
            return cA2.a(d8, d9, n3, d7, d6);
        });
    }

    @Override
    public boolean a(double d2, double d3, double d4) {
        if (this.a((T cA2) -> {
            double d5 = d2;
            double d6 = d4;
            double d7 = d3;
            return cA2.a(d5, d7, d6);
        })) {
            return true;
        }
        if (d3 < (double)this.a || d3 > (double)(this.a + this.c)) {
            return false;
        }
        if (d4 < (double)this.E || d4 > (double)(this.E + this.F)) {
            return false;
        }
        float f2 = this.e();
        if (f2 <= 0.001f) {
            return false;
        }
        this.D = Math.clamp((float)(this.D - (float)(d2 * 40.0)), (float)0.0f, (float)f2);
        this.C.c(this.D);
        return true;
    }

    @Override
    public boolean a(int n2, int n3, int n4) {
        return this.a((T cA2) -> {
            int n5 = n3;
            int n6 = n2;
            int n7 = n4;
            return cA2.a(n6, n5, n7);
        });
    }

    private boolean a(Predicate predicate) {
        for (cA cA2 : this.z) {
            if (this.a(cA2) <= 0.5f || !predicate.test(cA2)) continue;
            return true;
        }
        return false;
    }

    public jD a() {
        return this.y;
    }

    private cA a(fa fa2) {
        if (fa2 instanceof eP) {
            eP eP2 = (eP)fa2;
            return new C(eP2);
        }
        if (fa2 instanceof hO) {
            hO hO2 = (hO)fa2;
            return new js(hO2);
        }
        if (fa2 instanceof dw) {
            dw dw2 = (dw)fa2;
            return new hr(dw2);
        }
        if (fa2 instanceof gz) {
            gz gz2 = (gz)fa2;
            return new Q(gz2);
        }
        if (fa2 instanceof kZ) {
            kZ kZ2 = (kZ)fa2;
            return new hn(kZ2);
        }
        if (fa2 instanceof fr) {
            fr fr2 = (fr)fa2;
            return new gl(fr2);
        }
        if (fa2 instanceof jh) {
            jh jh2 = (jh)fa2;
            return new gl(jh2);
        }
        if (fa2 instanceof lw) {
            lw lw2 = (lw)fa2;
            return new gX(lw2);
        }
        if (fa2 instanceof fx) {
            fx fx2 = (fx)fa2;
            return new cH(fx2);
        }
        if (fa2 instanceof bu) {
            bu bu2 = (bu)fa2;
            return new bK(bu2);
        }
        if (fa2 instanceof kn) {
            kn kn2 = (kn)fa2;
            return new bK(kn2);
        }
        if (fa2 instanceof t) {
            t t2 = (t)fa2;
            return new kG(t2);
        }
        if (fa2 instanceof cX) {
            cX cX2 = (cX)fa2;
            return new aN(cX2);
        }
        if (fa2 instanceof hE) {
            hE hE2 = (hE)fa2;
            return new gf(hE2);
        }
        return null;
    }

    public float a() {
        return 400.0f;
    }

    private float a(cA cA2) {
        bo bo2 = this.A.get(cA2);
        if (bo2 == null) {
            return cA2.a().d() ? 1.0f : 0.0f;
        }
        return bo2.b();
    }

    public boolean a(float f2, float f3) {
        return f2 >= this.a && f2 <= this.a + this.c && f3 >= this.b && f3 <= this.b + this.d;
    }

    public boolean a(double d2, double d3) {
        for (cA cA2 : this.z) {
            double d4;
            double d5;
            if (this.a(cA2) <= 0.5f || !cA2.c() || !cA2.c(d5 = d3, d4 = d2)) continue;
            return true;
        }
        return false;
    }

    public void a() {
        if (this.N) {
            return;
        }
        this.N = true;
        this.B.c(0.0f);
    }

    public boolean a() {
        return this.N && this.B.b() < 0.001f;
    }

    private bo a(cA cA2) {
        float f2 = cA2.a().d() ? 1.0f : 0.0f;
        bo bo2 = jm.a(f2, 0.22f);
        bo2.c(f2);
        return bo2;
    }

    private void a(fa fa2, float f2) {
        cA cA2 = this.a(fa2);
        if (cA2 == null) {
            return;
        }
        cA2.a(f2);
        this.z.add(cA2);
    }

    private void a(Matrix4f matrix4f, float f2, float f3, float f4, float f5) {
        float f6 = this.c();
        if (f6 <= f4) {
            return;
        }
        float f7 = this.a + this.c - 4.0f - 3.0f;
        float f8 = f2 + f4 - 4.0f;
        float f9 = f2 + 4.0f;
        float f10 = Math.max(0.0f, f8 - f9);
        if (f10 <= 0.0f) {
            return;
        }
        float f11 = Math.max(24.0f, f10 * (f4 / f6));
        f11 = Math.min(f11, f10);
        float f12 = f10 - f11;
        float f13 = this.e();
        float f14 = f9 + (f13 > 0.0f ? f12 * (f5 / f13) : 0.0f);
        this.G = f9;
        this.H = f10;
        this.I = f11;
        this.J = f14;
        float f15 = 1.5f;
        float f16 = f3;
        float f17 = 3.0f;
        float f18 = 1.0f;
        float f19 = 0.0f;
        int n2 = 0x1A000000;
        float f20 = 0.0f;
        int n3 = 0;
        int n4 = gD.surface();
        float f21 = f15;
        float f22 = f15;
        float f23 = f15;
        float f24 = f15;
        float f25 = f11;
        float f26 = 3.0f;
        float f27 = f14;
        float f28 = f7;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f26, n2, n4, f28, f27, f17, f24, f25, f18, matrix4f2, f16, n3, f22, f20, f23, f21, f19);
    }

    private float a(Matrix4f matrix4f, float f2, float f3) {
        kD kD2 = this.y.b();
        if (kD2 == null) {
            return f2;
        }
        float f4 = this.b + 16.0f + 2.0f;
        float f5 = f3;
        int n2 = gD.elevated();
        float f6 = 4.0f;
        float f7 = 20.0f;
        float f8 = 20.0f;
        float f9 = f4;
        float f10 = f2;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f6, f10, n2, matrix4f2, f7, f8, f5, f9);
        float f11 = Math.min(14.0f / kD2.getWidth(), 14.0f / kD2.getHeight());
        float f12 = kD2.getWidth() * f11;
        float f13 = kD2.getHeight() * f11;
        float f14 = f2 + (20.0f - f12) / 2.0f;
        float f15 = f4 + (20.0f - f13) / 2.0f;
        float f16 = f3;
        int n3 = gD.mutedFg();
        float f17 = f13;
        float f18 = f12;
        float f19 = f15;
        float f20 = f14;
        kD kD3 = kD2;
        Matrix4f matrix4f3 = matrix4f;
        jr.a(f16, n3, matrix4f3, f19, kD3, f17, f20, f18);
        return f2 + 20.0f + 6.0f;
    }

    private void a(float f2, float f3, Matrix4f matrix4f, float f4) {
        for (cA cA2 : this.z) {
            float f5 = this.a(cA2);
            if (f5 <= 0.001f) continue;
            float f6 = f2 * f5;
            float f7 = f4;
            float f8 = f3;
            Matrix4f matrix4f2 = matrix4f;
            cA2.c(f6, f7, f8, matrix4f2);
        }
    }

    private void a(float f2, float f3) {
        float f4 = f2;
        float f5 = 0.0f;
        for (cA cA2 : this.z) {
            float f6 = this.a(cA2);
            if (f6 <= 0.001f) continue;
            float f7 = 16.0f * f6;
            if (f5 > 0.0f) {
                f4 += f7;
            }
            float f8 = f4;
            float f9 = f3;
            cA2.c(f8, f9);
            float f10 = cA2.g() * f6;
            f4 += f10;
            f5 += f10 + f7;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(class_332 class_3322, float f2, float f3, float f4, Matrix4f matrix4f) {
        float f5 = this.B.a();
        if (f5 <= 0.001f) {
            return;
        }
        float f6 = jm.c(f5);
        float f7 = (1.0f - f5) * -6.0f;
        float f8 = this.a + this.c / 2.0f;
        float f9 = this.b + this.d / 2.0f;
        class_4587 class_45872 = class_3322.method_51448();
        float f10 = f7;
        float f11 = f6;
        float f12 = f9;
        float f13 = f8;
        class_4587 class_45873 = class_45872;
        Matrix4f matrix4f2 = ca.a(f11, f13, f10, f12, class_45873);
        cP.a(0.0f, fk.a().b());
        try {
            float f14 = f4 * f5;
            float f15 = f3;
            float f16 = f2;
            Matrix4f matrix4f3 = matrix4f2;
            this.c(f14, f15, f16, matrix4f3);
        }
        finally {
            cP.a();
            class_45872.method_22909();
        }
    }

    private void a(float f2, Matrix4f matrix4f, float f3, float f4, float f5) {
        bp bp2 = bp.a();
        if (bp2 != null && bp2.c()) {
            return;
        }
        float f6 = this.e();
        float f7 = f3 * Math.clamp((float)(f4 / 24.0f), (float)0.0f, (float)1.0f);
        float f8 = f3 * Math.clamp((float)((f6 - f4) / 24.0f), (float)0.0f, (float)1.0f);
        int n2 = gD.background();
        int n3 = 0xFF000000 | n2 & 0xFFFFFF;
        int n4 = n2 & 0xFFFFFF;
        float f9 = this.c - 8.0f - 3.0f;
        if (f7 > 0.001f) {
            int n5 = lu.a(n4, f7);
            int n6 = lu.a(n3, f7);
            float f10 = 24.0f;
            float f11 = f9 - 14.0f;
            float f12 = f5;
            float f13 = this.a + 14.0f;
            Matrix4f matrix4f2 = matrix4f;
            dP.a(n6, matrix4f2, f11, n5, f10, f13, f12);
        }
        if (f8 > 0.001f) {
            int n7 = lu.a(n3, f8);
            int n8 = lu.a(n4, f8);
            float f14 = 24.0f;
            float f15 = f9 - 14.0f;
            float f16 = f5 + f2 - 24.0f + 1.0f;
            float f17 = this.a + 14.0f;
            Matrix4f matrix4f3 = matrix4f;
            dP.a(n8, matrix4f3, f15, n7, f14, f17, f16);
        }
    }

    private static int a(int n2, float f2) {
        int n3 = Math.clamp((long)((int)((float)(n2 >>> 24 & 0xFF) * f2)), (int)0, (int)255);
        return n3 << 24 | n2 & 0xFFFFFF;
    }

    @Override
    public void k() {
        for (cA cA2 : this.z) {
            cA2.k();
        }
    }
}

