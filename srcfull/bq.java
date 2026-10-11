/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bq
extends gh {
    private final aT k;
    private final s l;
    private final eg m;
    private final gt n;
    private final List<cA> o = new ArrayList<cA>();
    private final kV p = new kV();
    private boolean q = true;
    private boolean r = false;
    private boolean s = false;
    private final bo t = jm.a(0.0f, 0.32f);
    private final bo u = jm.a(1.0f, 0.22f);
    private final bo v = jm.a(0.0f, 0.5f);
    private float w = Float.NaN;
    private long x = -1L;
    private float y;
    private long z = -1L;
    private float A;

    public bq(aT aT2) {
        this.k = aT2;
        this.c = 301.0f;
        this.l = new s(aT2.f());
        this.l.a(() -> aT2.a(this.l.a()));
        this.m = new eg(hJ.a(aT2.b()));
        this.m.a(() -> hJ.a(aT2.b(), this.m.a()));
        this.n = new gt(aT2.a());
        this.a();
        this.e();
        this.t.b(this.b() ? 0.0f : 1.0f);
        this.u.b(aT2.f() ? 1.0f : 0.5f);
    }

    private float e() {
        return this.c - 32.0f;
    }

    private void e() {
        float f2 = this.e();
        if (Math.abs(f2 - this.w) <= 0.001f) {
            return;
        }
        this.w = f2;
        for (cA cA2 : this.o) {
            cA2.a(f2);
        }
    }

    public void b() {
        if (this.q) {
            this.a();
        }
        this.e();
        this.p.b(this.o);
        float f2 = this.a + 16.0f;
        this.a(f2, this.b + 16.0f);
        if (!this.c()) {
            return;
        }
        float f3 = this.b + 16.0f + 24.0f + 16.0f;
        float f4 = f3 + 1.0f + 16.0f;
        this.a(f2, f4);
    }

    public void b(boolean bl2) {
        this.r = bl2;
        float f2 = this.b() ? 0.0f : 1.0f;
        this.t.b(f2);
        this.t.c(f2);
    }

    private boolean b() {
        return !this.c() || this.r;
    }

    @Override
    public boolean b(int n2, int n3, int n4) {
        int n5 = n2;
        int n6 = n3;
        int n7 = n4;
        if (this.n.b(n5, n6, n7)) {
            return true;
        }
        for (cA cA2 : this.a()) {
            int n8;
            int n9;
            int n10;
            if (!cA2.b(n10 = n2, n9 = n3, n8 = n4)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean b(int n2, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        double d7;
        int n3;
        if (this.t.b() >= 0.5f) {
            for (cA cA2 : this.a()) {
                double d8;
                double d9;
                int n4;
                if (!cA2.c() || !cA2.b(n4 = n2, d9 = d2, d8 = d3)) continue;
                return true;
            }
        }
        if (this.n.c() && this.n.b(n3 = n2, d7 = d2, d6 = d3)) {
            return true;
        }
        if (n2 == 1 && this.a(d5 = d3, d4 = d2) && this.c()) {
            this.r = !this.r;
            iB.a().a(m.g);
            return true;
        }
        int n5 = n2;
        double d10 = d2;
        double d11 = d3;
        if (this.l.b(n5, d10, d11)) {
            return true;
        }
        int n6 = n2;
        double d12 = d2;
        double d13 = d3;
        if (this.m.b(n6, d12, d13)) {
            return true;
        }
        int n7 = n2;
        double d14 = d2;
        double d15 = d3;
        if (this.n.b(n7, d14, d15)) {
            return true;
        }
        if (this.t.b() < 0.5f) {
            return false;
        }
        for (cA cA2 : this.a()) {
            double d16;
            double d17;
            int n8;
            if (!cA2.b(n8 = n2, d17 = d2, d16 = d3)) continue;
            return true;
        }
        return false;
    }

    public float b() {
        long l2 = fk.a();
        if (l2 == this.x) {
            return this.y;
        }
        this.y = this.b() ? 56.0f : this.d();
        this.x = l2;
        return this.y;
    }

    public void c() {
        this.t.c(this.b() ? 0.0f : 1.0f);
        this.t.a();
    }

    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        boolean bl2;
        float f5;
        this.l.a(this.k.f());
        if (this.q) {
            this.a();
        }
        this.e();
        this.p.b(this.o);
        this.u.c(this.k.f() ? 1.0f : 0.5f);
        float f6 = f2 * this.u.a();
        boolean bl3 = this.b();
        if (bl3 && !this.s) {
            for (cA cA2 : this.o) {
                cA2.k();
            }
        }
        this.s = bl3;
        this.t.c(bl3 ? 0.0f : 1.0f);
        float f7 = this.t.a();
        float f8 = this.a();
        float f9 = f6;
        float f10 = 1.0f;
        int n2 = gD.border();
        int n3 = gD.background();
        float f11 = 14.0f;
        float f12 = f8;
        float f13 = this.c;
        float f14 = this.b;
        float f15 = this.a;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f10, f13, f9, matrix4f2, f14, n3, f11, f15, n2, f12);
        float f16 = this.v.a();
        if (f16 > 0.001f) {
            float f17 = f2 * f16;
            float f18 = 2.0f;
            int n4 = gD.primary();
            int n5 = 0;
            float f19 = 14.0f;
            float f20 = f8;
            float f21 = this.c;
            float f22 = this.b;
            float f23 = this.a;
            Matrix4f matrix4f3 = matrix4f;
            dP.a(f18, f21, f17, matrix4f3, f22, n5, f19, f23, n4, f20);
        }
        float f24 = this.a + 16.0f;
        float f25 = f5 = this.b + 16.0f;
        float f26 = f24;
        float f27 = f6;
        float f28 = f3;
        float f29 = f4;
        Matrix4f matrix4f4 = matrix4f;
        this.a(f26, f25, f27, f29, f28, matrix4f4);
        if (f7 <= 0.001f) {
            return;
        }
        float f30 = f5 + 24.0f + 16.0f;
        float f31 = f6 * f7;
        int n6 = gD.border();
        float f32 = 1.0f;
        float f33 = this.e();
        float f34 = f30;
        float f35 = f24;
        Matrix4f matrix4f5 = matrix4f;
        dP.a(f31, f32, f35, f34, f33, matrix4f5, n6);
        float f36 = f30 + 1.0f + 16.0f;
        this.a(f24, f36);
        boolean bl4 = bl2 = f7 < 0.999f;
        if (bl2) {
            float f37;
            float f38 = f30 + 1.0f;
            float f39 = f37 = Math.max(0.0f, this.b + f8 - 16.0f - f38);
            float f40 = this.e();
            float f41 = f38;
            float f42 = f24;
            aM.b(f40, f39, f41, f42);
        }
        float f43 = f6 * f7;
        float f44 = f3;
        float f45 = f4;
        Matrix4f matrix4f6 = matrix4f;
        this.a(f43, matrix4f6, f45, f44);
        if (bl2) {
            aM.b();
        }
    }

    private boolean c() {
        for (cA cA2 : this.o) {
            if (cA2.a().d()) {
                return true;
            }
            if (!(this.p.a(cA2) > 0.001f)) continue;
            return true;
        }
        return false;
    }

    private float c() {
        this.e();
        float f2 = 73.0f;
        float f3 = 0.0f;
        for (cA cA2 : this.o) {
            float f4 = this.p.a(cA2);
            if (f4 <= 0.001f) continue;
            float f5 = cA2.g() * f4;
            float f6 = 16.0f * f4;
            f2 += f5 + (f3 > 0.0f ? f6 : 0.0f);
            f3 += f5 + f6;
        }
        return f2 + 16.0f;
    }

    private void f() {
        this.w = Float.NaN;
    }

    @Override
    public void d(float f2, float f3, float f4, Matrix4f matrix4f) {
        if (this.t.b() <= 0.001f) {
            return;
        }
        float f5 = f4 * this.u.b();
        for (cA cA2 : this.o) {
            float f6 = this.p.a(cA2);
            if (f6 <= 0.001f) continue;
            float f7 = f5 * f6;
            float f8 = f2;
            float f9 = f3;
            Matrix4f matrix4f2 = matrix4f;
            cA2.d(f8, f9, f7, matrix4f2);
        }
    }

    public void d() {
        this.v.b(1.0f);
        float f2 = 1.1f;
        float f3 = 0.0f;
        this.v.a(f2, f3);
    }

    public boolean d() {
        if (this.t.b() < 0.5f) {
            return false;
        }
        for (cA cA2 : this.a()) {
            if (!cA2.c()) continue;
            return true;
        }
        return false;
    }

    private float d() {
        this.e();
        float f2 = 73.0f;
        boolean bl2 = true;
        for (cA cA2 : this.o) {
            if (!cA2.a().d()) continue;
            if (!bl2) {
                f2 += 16.0f;
            }
            f2 += cA2.h();
            bl2 = false;
        }
        return f2 + 16.0f;
    }

    public void a(float f2) {
        if (Math.abs(this.c - f2) <= 0.001f) {
            return;
        }
        this.c = f2;
        this.f();
    }

    @Override
    public boolean a(int n2, int n3, int n4) {
        int n5 = n2;
        int n6 = n3;
        int n7 = n4;
        if (this.n.a(n5, n6, n7)) {
            return true;
        }
        for (cA cA2 : this.a()) {
            int n8;
            int n9;
            int n10;
            if (!cA2.a(n10 = n2, n9 = n3, n8 = n4)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean a(double d2, double d3, double d4) {
        if (this.t.b() < 0.5f) {
            return false;
        }
        for (cA cA2 : this.a()) {
            double d5;
            double d6;
            double d7;
            if (!cA2.a(d7 = d2, d6 = d3, d5 = d4)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean a(double d2, double d3, int n2, double d4, double d5) {
        double d6 = d2;
        double d7 = d3;
        int n3 = n2;
        double d8 = d4;
        double d9 = d5;
        if (this.l.a(d6, d7, n3, d8, d9)) {
            return true;
        }
        for (cA cA2 : this.a()) {
            double d10;
            double d11;
            int n4;
            double d12;
            double d13;
            if (!cA2.a(d13 = d2, d12 = d3, n4 = n2, d11 = d4, d10 = d5)) continue;
            return true;
        }
        return false;
    }

    public aT a() {
        return this.k;
    }

    private void a(fa fa2) {
        cA cA2 = cz.a(fa2);
        if (cA2 != null) {
            this.o.add(cA2);
        }
    }

    private List a() {
        ArrayList<cA> arrayList = new ArrayList<cA>(this.o.size());
        for (cA cA2 : this.o) {
            if (!(this.p.a(cA2) > 0.5f)) continue;
            arrayList.add(cA2);
        }
        return arrayList;
    }

    @Override
    public boolean a(int n2, char c2) {
        for (cA cA2 : this.a()) {
            char c3;
            int n3;
            if (!cA2.a(n3 = n2, c3 = c2)) continue;
            return true;
        }
        return false;
    }

    private boolean a(double d2, double d3) {
        float f2 = this.b + 16.0f;
        return d3 >= (double)this.a && d3 <= (double)(this.a + this.c) && d2 >= (double)f2 && d2 <= (double)(f2 + 24.0f);
    }

    private void a(float f2, float f3, float f4, float f5, float f6, Matrix4f matrix4f) {
        float f7 = f3 + 4.0f;
        float f8 = f4;
        int n2 = gD.foreground();
        float f9 = 16.0f;
        float f10 = f7;
        float f11 = f2;
        kD kD2 = this.k.a().a();
        Matrix4f matrix4f2 = matrix4f;
        jr.a(f10, kD2, n2, matrix4f2, f8, f9, f11);
        float f12 = this.a(f2, f3);
        float f13 = f4;
        float f14 = f6;
        float f15 = f5;
        Matrix4f matrix4f3 = matrix4f;
        this.l.c(f13, f14, f15, matrix4f3);
        float f16 = f4;
        float f17 = f6;
        float f18 = f5;
        Matrix4f matrix4f4 = matrix4f;
        this.m.c(f16, f17, f18, matrix4f4);
        float f19 = f4;
        float f20 = f6;
        float f21 = f5;
        Matrix4f matrix4f5 = matrix4f;
        this.n.c(f19, f20, f21, matrix4f5);
        float f22 = f2 + 16.0f + 6.0f;
        float f23 = f3 + 4.0f;
        float f24 = Math.max(0.0f, f12 - 8.0f - f22);
        float f25 = 16.0f;
        float f26 = f24;
        String string = this.k.b();
        float f27 = f4;
        int n3 = gD.foreground();
        float f28 = 16.0f;
        float f29 = f23;
        float f30 = f22;
        String string2 = dq.a(f26, string, f25);
        Matrix4f matrix4f6 = matrix4f;
        ao.a(f27, string2, f28, f30, n3, f29, matrix4f6);
    }

    public boolean a() {
        return this.r;
    }

    public float a() {
        float f2;
        long l2 = fk.a();
        if (l2 == this.z) {
            this.d = this.A;
            return this.A;
        }
        float f3 = this.t.b();
        float f4 = 56.0f;
        if (!this.c()) {
            f2 = f4;
        } else {
            float f5 = this.c();
            f2 = f4 + (f5 - f4) * f3;
        }
        this.A = f2;
        this.z = l2;
        this.d = f2;
        return f2;
    }

    public void a(boolean bl2) {
        if (this.c()) {
            this.r = bl2;
        }
    }

    @Override
    public boolean a(double d2, double d3, int n2) {
        if (this.l.a(d2, d3, n2)) {
            return true;
        }
        for (cA cA2 : this.a()) {
            if (!cA2.a(d2, d3, n2)) continue;
            return true;
        }
        return false;
    }

    private void a() {
        this.o.clear();
        for (fa fa2 : this.k.a()) {
            if (fa2 == this.k.a()) continue;
            this.a(fa2);
        }
        this.p.a(this.o);
        this.q = false;
        this.f();
    }

    private float a(float f2, float f3) {
        float f4 = f2 + this.e() - 28.0f;
        float f5 = f3 + 4.0f;
        float f6 = f4;
        this.l.c(f5, f6);
        float f7 = f4 - 4.0f - 16.0f;
        float f8 = f3 + 4.0f;
        float f9 = f7;
        this.m.c(f8, f9);
        this.n.a(this.k.a());
        float f10 = this.n.a();
        float f11 = f7 - 4.0f - f10;
        this.n.c(f10);
        float f12 = f3 + 2.0f;
        float f13 = f11;
        this.n.c(f12, f13);
        return f11;
    }

    private void a(float f2, Matrix4f matrix4f, float f3, float f4) {
        for (cA cA2 : this.o) {
            float f5 = this.p.a(cA2);
            if (f5 <= 0.001f) continue;
            float f6 = f2 * f5;
            float f7 = f4;
            float f8 = f3;
            Matrix4f matrix4f2 = matrix4f;
            cA2.c(f6, f7, f8, matrix4f2);
        }
    }

    private void a(float f2, float f3) {
        float f4 = f3;
        float f5 = 0.0f;
        for (cA cA2 : this.o) {
            float f6 = this.p.a(cA2);
            if (f6 <= 0.001f) continue;
            float f7 = 16.0f * f6;
            if (f5 > 0.0f) {
                f4 += f7;
            }
            float f8 = f4;
            float f9 = f2;
            cA2.c(f8, f9);
            float f10 = cA2.g() * f6;
            f4 += f10;
            f5 += f10 + f7;
        }
    }

    public void g() {
        for (cA cA2 : this.o) {
            if (!cA2.c()) continue;
            cA2.b();
        }
    }
}

