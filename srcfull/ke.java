/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class ke<K, R extends el>
extends kc
implements eG {
    protected final jt az;
    protected final ey<R> aA = new ey(4.0f);
    private final bo aB = jm.b(0.0f, 0.28f);
    protected float aC;
    private final bo aD = jm.a();
    private final bo aE = jm.a();
    private boolean aF;
    private float aG;

    protected ke() {
        this.c = 335.0f;
        float f2 = 32.0f;
        this.az = new jt(303.0f, 26.0f, this.c(), 12.0f, f2, 0.0f);
        this.az.a((T string) -> {
            this.d();
            this.aC = 0.0f;
            this.aB.b(0.0f);
        });
        this.d = this.a();
    }

    protected String e() {
        return null;
    }

    @Override
    protected void e(float f2, float f3, float f4, Matrix4f matrix4f) {
        float f5 = this.b + jm.b(f3);
        Matrix4f matrix4f2 = jm.a(matrix4f, f3, this.a + this.c / 2.0f, f5 + this.d / 2.0f);
        float f6 = f3;
        float f7 = 1.0f;
        int n2 = gD.border();
        int n3 = gD.background();
        float f8 = 12.0f;
        float f9 = this.d;
        float f10 = this.c;
        float f11 = f5;
        float f12 = this.a;
        Matrix4f matrix4f3 = matrix4f2;
        dP.a(f7, f10, f6, matrix4f3, f11, n3, f8, f12, n2, f9);
        float f13 = f3;
        float f14 = f5;
        Matrix4f matrix4f4 = matrix4f2;
        this.a(f14, f13, matrix4f4);
        float f15 = f3;
        float f16 = f5;
        float f17 = f2;
        float f18 = f4;
        Matrix4f matrix4f5 = matrix4f2;
        this.a(f18, f16, matrix4f5, f15, f17);
        float f19 = f3;
        float f20 = f5;
        float f21 = f2;
        float f22 = f4;
        Matrix4f matrix4f6 = matrix4f2;
        this.a(f19, f22, f20, f21, matrix4f6);
        if (this.g()) {
            float f23 = f3;
            float f24 = f5;
            float f25 = f2;
            float f26 = f4;
            Matrix4f matrix4f7 = matrix4f2;
            this.a(f23, f26, f24, matrix4f7, f25);
        }
        float f27 = f3;
        float f28 = f5;
        float f29 = f2;
        float f30 = f4;
        Matrix4f matrix4f8 = matrix4f2;
        Matrix4f matrix4f9 = matrix4f;
        this.a(f30, matrix4f9, f29, matrix4f8, f27, f28);
    }

    private void e() {
        this.d();
        this.aC = 0.0f;
        this.aB.b(0.0f);
    }

    protected float i() {
        return this.a + (this.c - 303.0f) / 2.0f;
    }

    protected float b(float f2) {
        return this.a(f2) + 26.0f + 8.0f;
    }

    @Override
    public void b(jZ jZ2) {
        this.e();
        super.b(jZ2);
    }

    protected float b() {
        return this.c - 24.0f - 28.0f;
    }

    protected boolean b(int n2, char c2) {
        return false;
    }

    protected boolean b(double d2, double d3, double d4) {
        return false;
    }

    protected boolean b(double d2, double d3, int n2) {
        return false;
    }

    private el b(Object object) {
        return this.a(object);
    }

    protected void b() {
    }

    protected abstract String b();

    protected abstract String c();

    protected boolean c(int n2, double d2, double d3) {
        return false;
    }

    protected void c() {
    }

    @Override
    protected boolean c(int n2, int n3, int n4) {
        int n5 = n3;
        int n6 = n2;
        int n7 = n4;
        if (this.d(n5, n6, n7)) {
            return true;
        }
        if (this.az.a()) {
            int n8 = n2;
            int n9 = n3;
            int n10 = n4;
            this.az.a(n9, n8, n10);
            return true;
        }
        return false;
    }

    protected float c(float f2) {
        return this.b(f2) + 148.0f + 8.0f;
    }

    private boolean h() {
        return this.aA.a() > 140.0f;
    }

    protected float h() {
        float f2 = this.b();
        float f3 = 12.0f;
        String string = this.b();
        float f4 = ao.a(f2, f3, string);
        return 30.0f + f4;
    }

    protected void f() {
        if (!this.aA.a(fk.a())) {
            return;
        }
        List list = this.a();
        ArrayList arrayList = new ArrayList(list);
        this.aA.a(arrayList, this::b);
        this.aA.a(arrayList);
        this.aA.a();
    }

    private float l() {
        return Math.max(0.0f, this.aA.a() - 140.0f);
    }

    protected void d() {
    }

    protected boolean d(int n2, int n3, int n4) {
        return false;
    }

    protected String d() {
        return null;
    }

    private float a() {
        return this.h() + 10.0f + 26.0f + 8.0f + 148.0f + (this.g() ? 36.0f : 0.0f) + 12.0f;
    }

    @Override
    public boolean a(double d2, double d3, int n2) {
        if (this.b(d2, d3, n2)) {
            return true;
        }
        if (this.aF && n2 == 0) {
            this.aF = false;
            return true;
        }
        return false;
    }

    protected boolean a(double d2, double d3, double d4, int n2, double d5) {
        return false;
    }

    @Override
    public boolean a(double d2, double d3, int n2, double d4, double d5) {
        double d6 = d3;
        double d7 = d2;
        double d8 = d5;
        int n3 = n2;
        double d9 = d4;
        if (this.a(d6, d7, d8, n3, d9)) {
            return true;
        }
        if (this.aF && n2 == 0) {
            float f2 = this.b;
            float f3 = this.b(f2);
            float f4 = f3 + 4.0f;
            float f5 = f3 + 148.0f - 4.0f;
            float f6 = f5 - f4 - 40.0f;
            float f7 = this.l();
            float f8 = (float)d2 - this.aG;
            float f9 = (f8 - f4) / f6;
            this.aC = Math.clamp((float)(f9 * f7), (float)0.0f, (float)f7);
            return true;
        }
        return false;
    }

    private void a(float f2, float f3, Matrix4f matrix4f) {
        float f4 = this.a + 12.0f;
        float f5 = f2 + 12.0f;
        float f6 = f3;
        int n2 = gD.foreground();
        float f7 = 14.0f;
        float f8 = f5;
        float f9 = f4;
        String string = this.a();
        Matrix4f matrix4f2 = matrix4f;
        ao.a(n2, f6, f8, matrix4f2, f9, f7, string);
        float f10 = f3;
        int n3 = gD.mutedFg();
        float f11 = 8.0f;
        float f12 = 8.0f;
        float f13 = f2 + 14.0f;
        float f14 = this.a + this.c - 12.0f - 8.0f;
        kD kD2 = kD.CLOSE;
        Matrix4f matrix4f3 = matrix4f;
        jr.a(f10, n3, matrix4f3, f13, kD2, f11, f14, f12);
        float f15 = f3;
        int n4 = gD.mutedFg();
        float f16 = this.b();
        float f17 = 12.0f;
        float f18 = f5 + 14.0f + 4.0f;
        float f19 = f4;
        String string2 = this.b();
        Matrix4f matrix4f4 = matrix4f;
        ao.a(f15, string2, f19, f17, matrix4f4, f16, f18, n4);
    }

    @Override
    protected boolean a(int n2, double d2, double d3) {
        double d4;
        float f2;
        float f3;
        double d5;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        double d6;
        float f12;
        float f13;
        double d7;
        float f14;
        float f15;
        if (n2 != 0) {
            return true;
        }
        int n3 = n2;
        double d8 = d2;
        double d9 = d3;
        if (this.c(n3, d8, d9)) {
            return true;
        }
        float f16 = this.a + this.c - 12.0f - 8.0f;
        float f17 = f16 - 4.0f;
        float f18 = this.b;
        float f19 = f18 + 14.0f;
        float f20 = f19 - 4.0f;
        double d10 = d3;
        float f21 = 16.0f;
        float f22 = 16.0f;
        double d11 = d2;
        if (ke.a(f17, f20, d10, f21, f22, d11)) {
            this.n();
            return true;
        }
        float f23 = this.i();
        float f24 = f23;
        if (ke.a(f24, f15 = (f14 = this.a(f18)), d7 = d3, f13 = 26.0f, f12 = 303.0f, d6 = d2)) {
            int n4 = n2;
            double d12 = d3;
            double d13 = d2;
            this.az.b(n4, d13, d12);
            return true;
        }
        this.az.a(false);
        if (this.g()) {
            double d14;
            float f25;
            float f26;
            double d15;
            float f27;
            float f28;
            double d16;
            float f29;
            float f30;
            double d17;
            float f31;
            float f32;
            f11 = this.k();
            f10 = this.c(f18);
            float f33 = 155.5f;
            if (this.d() != null && ke.a(f32 = f11, f31 = f10, d17 = d3, f30 = 28.0f, f29 = f33, d16 = d2)) {
                this.b();
                this.aC = 0.0f;
                this.aB.b(0.0f);
                return true;
            }
            if (this.e() != null && ke.a(f28 = f11 + f33, f27 = f10, d15 = d3, f26 = 28.0f, f25 = f33, d14 = d2)) {
                this.c();
                return true;
            }
        }
        f11 = this.j();
        f10 = this.b(f18);
        boolean bl2 = this.h();
        if (bl2) {
            double d18;
            float f34;
            float f35;
            double d19;
            f9 = f11 + 311.0f - 4.0f - 6.0f;
            f8 = f10 + 4.0f;
            f7 = f10 + 148.0f - 4.0f;
            float f36 = f7 - f8 - 40.0f;
            float f37 = f9;
            float f38 = this.l();
            f6 = f8 + (f38 > 0.0f ? f36 * (this.aB.b() / f38) : 0.0f);
            float f39 = f6;
            if (ke.a(f37, f39, d19 = d3, f35 = 40.0f, f34 = 6.0f, d18 = d2)) {
                this.aF = true;
                this.aG = (float)d3 - f6;
                return true;
            }
        }
        if (!ke.a(f5 = f11, f4 = f10, d5 = d3, f3 = 148.0f, f2 = 311.0f, d4 = d2)) {
            return true;
        }
        f9 = f11 + 4.0f;
        f8 = bl2 ? f11 + 311.0f - 4.0f - 6.0f - 4.0f : f11 + 311.0f - 4.0f;
        f7 = f8 - f9;
        for (el el2 : this.aA.a()) {
            double d20;
            float f40;
            float f41;
            double d21;
            float f42;
            float f43;
            if (el2.animation().a() <= 0.001f || !ke.a(f43 = f9, f42 = (f6 = el2.animation().c()), d21 = d3, f41 = el2.itemHeight(), f40 = f7, d20 = d2)) continue;
            float f44 = f7;
            float f45 = f6;
            float f46 = f9;
            double d22 = d3;
            double d23 = d2;
            el el3 = el2;
            this.a(el3, f45, f46, d23, f44, d22);
            return true;
        }
        return true;
    }

    protected abstract String a();

    @Override
    public boolean a(int n2, char c2) {
        int n3 = n2;
        char c3 = c2;
        if (this.b(n3, c3)) {
            return true;
        }
        if (this.az.a()) {
            int n4 = n2;
            char c4 = c2;
            this.az.a(n4, c4);
            return true;
        }
        return false;
    }

    @Override
    public void a(jZ jZ2) {
        this.e();
        super.a(jZ2);
    }

    protected abstract boolean a(el var1, float var2, float var3, double var4, float var6, double var7);

    protected abstract void a(Matrix4f var1, float var2, float var3, float var4, float var5, float var6, float var7, el var8);

    @Override
    public boolean a(double d2, double d3, double d4) {
        double d5;
        float f2;
        float f3;
        double d6;
        float f4;
        float f5;
        double d7 = d3;
        double d8 = d2;
        double d9 = d4;
        if (this.b(d7, d8, d9)) {
            return true;
        }
        float f6 = this.b;
        float f7 = this.j();
        float f8 = f7;
        if (!ke.a(f8, f5 = (f4 = this.b(f6)), d6 = d4, f3 = 148.0f, f2 = 311.0f, d5 = d3)) {
            return true;
        }
        float f9 = this.l();
        this.aC = Math.clamp((float)(this.aC - (float)(d2 * 48.0)), (float)0.0f, (float)f9);
        this.aB.c(this.aC);
        return true;
    }

    protected void a(float f2, Matrix4f matrix4f, float f3, Matrix4f matrix4f2, float f4, float f5) {
    }

    protected abstract List a();

    protected boolean a() {
        return false;
    }

    protected float a(float f2) {
        return f2 + this.h() + 10.0f;
    }

    protected abstract el a(Object var1);

    private void a(Matrix4f matrix4f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f2 + 311.0f - 4.0f - 6.0f;
        float f8 = f4 + 4.0f;
        float f9 = f4 + 148.0f - 4.0f;
        float f10 = f9 - f8 - 40.0f;
        float f11 = f8 + (f5 > 0.0f ? f10 * (f6 / f5) : 0.0f);
        float f12 = 3.0f;
        float f13 = f3;
        float f14 = 3.0f;
        float f15 = 1.0f;
        float f16 = 0.0f;
        int n2 = 0x1A000000;
        float f17 = 0.0f;
        int n3 = 0;
        int n4 = gD.surface();
        float f18 = f12;
        float f19 = f12;
        float f20 = f12;
        float f21 = f12;
        float f22 = 40.0f;
        float f23 = 6.0f;
        float f24 = f11;
        float f25 = f7;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f23, n2, n4, f25, f24, f14, f21, f22, f15, matrix4f2, f13, n3, f19, f17, f20, f18, f16);
    }

    private void a(float f2, float f3, float f4, Matrix4f matrix4f, float f5) {
        float f6;
        double d2;
        float f7;
        float f8;
        double d3;
        float f9;
        float f10;
        double d4;
        float f11;
        float f12;
        double d5;
        float f13;
        float f14;
        String string = this.d();
        String string2 = this.e();
        float f15 = this.k();
        float f16 = this.c(f4);
        float f17 = 155.5f;
        boolean bl2 = string != null && ke.a(f14 = f15, f13 = f16, d5 = (double)f5, f12 = 28.0f, f11 = f17, d4 = (double)f3);
        boolean bl3 = string2 != null && ke.a(f10 = f15 + f17, f9 = f16, d3 = (double)f5, f8 = 28.0f, f7 = f17, d2 = (double)f3);
        this.aD.c(bl2 ? 1.0f : 0.0f);
        this.aE.c(bl3 ? 1.0f : 0.0f);
        float f18 = this.aD.a();
        float f19 = this.aE.a();
        float f20 = f2;
        float f21 = 1.0f;
        float f22 = 1.0f;
        float f23 = 0.0f;
        int n2 = 0x1A000000;
        float f24 = 1.0f;
        int n3 = gD.border();
        int n4 = gD.elevated();
        float f25 = 8.0f;
        float f26 = 8.0f;
        float f27 = 8.0f;
        float f28 = 8.0f;
        float f29 = 28.0f;
        float f30 = 311.0f;
        float f31 = f16;
        float f32 = f15;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f30, n2, n4, f32, f31, f21, f28, f29, f22, matrix4f2, f20, n3, f26, f24, f27, f25, f23);
        if (string != null && f18 > 0.001f) {
            float f33 = f2 * 0.12f * f18;
            float f34 = 1.0f;
            float f35 = 1.0f;
            float f36 = 0.0f;
            int n5 = 0;
            float f37 = 0.0f;
            int n6 = 0;
            int n7 = -16777216;
            float f38 = 8.0f;
            float f39 = 0.0f;
            float f40 = 0.0f;
            float f41 = 8.0f;
            float f42 = 28.0f;
            float f43 = f17;
            float f44 = f16;
            float f45 = f15;
            Matrix4f matrix4f3 = matrix4f;
            dP.a(f43, n5, n7, f45, f44, f34, f41, f42, f35, matrix4f3, f33, n6, f39, f37, f40, f38, f36);
        }
        if (string2 != null && f19 > 0.001f) {
            float f46 = f2 * 0.12f * f19;
            float f47 = 1.0f;
            float f48 = 1.0f;
            float f49 = 0.0f;
            int n8 = 0;
            float f50 = 0.0f;
            int n9 = 0;
            int n10 = -16777216;
            float f51 = 0.0f;
            float f52 = 8.0f;
            float f53 = 8.0f;
            float f54 = 0.0f;
            float f55 = 28.0f;
            float f56 = f17;
            float f57 = f16;
            float f58 = f15 + f17;
            Matrix4f matrix4f4 = matrix4f;
            dP.a(f56, n8, n10, f58, f57, f47, f54, f55, f48, matrix4f4, f46, n9, f52, f50, f53, f51, f49);
        }
        float f59 = f2;
        int n11 = gD.border();
        float f60 = 28.0f;
        float f61 = 1.0f;
        float f62 = f16;
        float f63 = f15 + f17;
        Matrix4f matrix4f5 = matrix4f;
        dP.a(f59, f60, f63, f62, f61, matrix4f5, n11);
        float f64 = f16 + 8.0f;
        if (string != null) {
            f6 = ao.a(string, 12.0f);
            int n12 = this.a() ? gD.primary() : gD.foreground();
            float f65 = f2;
            int n13 = n12;
            float f66 = 12.0f;
            float f67 = f64;
            float f68 = f15 + (f17 - f6) / 2.0f;
            String string3 = string;
            Matrix4f matrix4f6 = matrix4f;
            ao.a(f67, f68, n13, f66, f65, string3, matrix4f6);
        }
        if (string2 != null) {
            f6 = ao.a(string2, 12.0f);
            float f69 = f2;
            int n14 = gD.foreground();
            float f70 = 12.0f;
            float f71 = f64;
            float f72 = f15 + f17 + (f17 - f6) / 2.0f;
            String string4 = string2;
            Matrix4f matrix4f7 = matrix4f;
            ao.a(f71, f72, n14, f70, f69, string4, matrix4f7);
        }
    }

    private void a(float f2, float f3, float f4, float f5, Matrix4f matrix4f) {
        float f6;
        this.f();
        float f7 = this.j();
        float f8 = this.b(f4);
        float f9 = f2;
        int n2 = gD.elevated();
        float f10 = 8.0f;
        float f11 = 148.0f;
        float f12 = 311.0f;
        float f13 = f8;
        float f14 = f7;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f10, f14, n2, matrix4f2, f11, f12, f9, f13);
        boolean bl2 = this.h();
        float f15 = f7 + 4.0f;
        float f16 = bl2 ? f7 + 311.0f - 4.0f - 6.0f - 4.0f : f7 + 311.0f - 4.0f;
        float f17 = f16 - f15;
        float f18 = this.l();
        if (this.aC < 0.0f) {
            this.aC = 0.0f;
        }
        if (this.aC > f18) {
            this.aC = f18;
        }
        this.aB.c(this.aC);
        float f19 = this.aB.a();
        this.aA.a(f8 + 4.0f - f19);
        float f20 = f8 + 4.0f;
        float f21 = f6 = 140.0f;
        float f22 = 311.0f;
        float f23 = f20;
        float f24 = f7;
        aM.b(f22, f21, f23, f24);
        for (el el2 : this.aA.a()) {
            float f25;
            float f26 = el2.animation().a();
            if (f26 <= 0.001f || (f25 = el2.animation().c()) + el2.itemHeight() < f20 || f25 > f20 + f6) continue;
            float f27 = f2 * f26;
            float f28 = f5;
            float f29 = f3;
            float f30 = f17;
            float f31 = f25;
            float f32 = f15;
            el el3 = el2;
            Matrix4f matrix4f3 = matrix4f;
            this.a(matrix4f3, f30, f27, f32, f29, f28, f31, el3);
        }
        float f33 = f2;
        float f34 = f8;
        float f35 = f7;
        Matrix4f matrix4f4 = matrix4f;
        this.a(f34, matrix4f4, f33, f35);
        aM.b();
        if (bl2) {
            float f36 = f2;
            float f37 = f18;
            float f38 = f19;
            float f39 = f8;
            float f40 = f7;
            Matrix4f matrix4f5 = matrix4f;
            this.a(matrix4f5, f40, f36, f39, f37, f38);
        }
    }

    private void a(float f2, float f3, Matrix4f matrix4f, float f4, float f5) {
        float f6 = this.i();
        float f7 = this.a(f3);
        float f8 = f4;
        float f9 = 1.0f;
        float f10 = 1.0f;
        float f11 = 0.0f;
        int n2 = 0x1A000000;
        float f12 = 1.0f;
        int n3 = gD.border();
        int n4 = gD.background();
        float f13 = 8.0f;
        float f14 = 8.0f;
        float f15 = 8.0f;
        float f16 = 8.0f;
        float f17 = 26.0f;
        float f18 = 303.0f;
        float f19 = f7;
        float f20 = f6;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f18, n2, n4, f20, f19, f9, f16, f17, f10, matrix4f2, f8, n3, f14, f12, f15, f13, f11);
        float f21 = f7;
        float f22 = f6;
        this.az.c(f21, f22);
        float f23 = f4;
        float f24 = f5;
        float f25 = f2;
        Matrix4f matrix4f3 = matrix4f;
        this.az.c(f23, f24, f25, matrix4f3);
        float f26 = f6 + 8.0f;
        float f27 = f7 + 5.0f;
        float f28 = f4;
        int n5 = gD.mutedFg();
        float f29 = 16.0f;
        float f30 = 16.0f;
        float f31 = f27;
        float f32 = f26;
        kD kD2 = kD.SEARCH;
        Matrix4f matrix4f4 = matrix4f;
        jr.a(f28, n5, matrix4f4, f31, kD2, f29, f32, f30);
    }

    protected void a(float f2, Matrix4f matrix4f, float f3, float f4) {
    }

    @Override
    protected void o() {
        this.az.a(false);
        this.q();
    }

    protected float k() {
        return this.a + (this.c - 311.0f) / 2.0f;
    }

    protected boolean g() {
        return this.d() != null || this.e() != null;
    }

    protected float j() {
        return this.a + (this.c - 311.0f) / 2.0f;
    }

    protected void q() {
    }
}

