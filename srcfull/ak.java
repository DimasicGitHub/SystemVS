/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ak
extends gh {
    private static final float k = 0.999f;
    private static final long l = 100000000L;
    private float m;
    private float n;
    private long o = -1L;
    private final bo p = jm.a(0.0f, 0.22f);
    private final bk q;
    private final fE r;
    private final aK s;
    private final List<aK> t = new ArrayList<aK>();
    private final fE u;
    private final List<dH> v = new ArrayList<dH>();
    private final List<dH> w = new ArrayList<dH>();
    private final dH x;
    private final dH y;
    private final dH z;
    private final dH A;
    private final dT B;
    private final eB C = new eB();
    private double D;
    private Consumer<fV> E;
    private Consumer<fV> F;
    private Runnable G;
    private Runnable H;
    private Runnable I;
    private Runnable J;

    public ak() {
        this.c = 224.0f;
        this.d = 700.0f;
        this.q = new bk(kD.LOGO, "Syst\u0435m");
        this.r = new fE("\u0421lient categories");
        this.s = new aK(null);
        this.s.a(true);
        for (fV fV2 : fV.values()) {
            if (fV2.a()) continue;
            this.t.add(new aK(fV2));
        }
        this.u = new fE("S\u0435ttings");
        this.x = new dH(kD.CLOUDS, "\u0421\u043e\u043d\u0444\u0438\u0433\u0437", this::c);
        this.y = new dH(kD.FRIENDS, "\u0424\u0440\u0438\u0435\u043d\u0434\u0437", this::d);
        this.z = new dH(kD.WAYPOINT, "\u0428\u0430\u0439\u043f\u043e\u0438\u043d\u0442\u0437", this::e);
        this.v.add(this.x);
        this.v.add(this.y);
        this.v.add(this.z);
        this.A = new dH(kD.SETTINGS, "\u0417\u0435\u0442\u0442\u0438\u043d\u0433\u0437", this::g);
        this.w.add(this.A);
        this.w.add(new dH(kD.SEARCH, "\u0417\u0435\u0430\u0440\u0441\u0445", this::f));
        this.B = new dT();
    }

    public void e(Runnable runnable) {
        this.J = runnable;
    }

    private void e() {
        if (this.z.a()) {
            return;
        }
        this.a();
        this.z.a(true);
        if (this.I != null) {
            this.I.run();
        }
    }

    public void i() {
        this.a();
        this.y.a(true);
    }

    @Override
    public boolean b(int n2, double d2, double d3) {
        this.D = d2;
        int n3 = n2;
        double d4 = d2;
        double d5 = d3;
        if (this.s.b(n3, d4, d5)) {
            this.b();
            return true;
        }
        for (aK fm2 : this.t) {
            double d6;
            double d7;
            int n4;
            if (!fm2.b(n4 = n2, d7 = d2, d6 = d3)) continue;
            this.a(fm2);
            return true;
        }
        for (dH dH2 : this.v) {
            double d8;
            double d9;
            int n4;
            if (!dH2.b(n4 = n2, d9 = d2, d8 = d3)) continue;
            return true;
        }
        for (dH dH3 : this.w) {
            double d10;
            double d11;
            int n5;
            if (!dH3.b(n5 = n2, d11 = d2, d10 = d3)) continue;
            return true;
        }
        return false;
    }

    public void b(Runnable runnable) {
        this.G = runnable;
    }

    private void b() {
        if (this.s.a()) {
            if (this.F != null) {
                this.F.accept(null);
            }
            return;
        }
        this.a();
        this.s.a(true);
        if (this.E != null) {
            this.E.accept(null);
        }
    }

    public void b(Consumer consumer) {
        this.F = consumer;
    }

    public void b(float f2) {
        float f3;
        this.m = f3 = Math.clamp((float)f2, (float)0.0f, (float)1.0f);
        this.n = f3;
        float f4 = f3;
        float f5 = 48.0f;
        float f6 = 224.0f;
        this.c = jm.a(f5, f4, f6);
        boolean bl2 = f3 >= 0.999f;
        this.o = -1L;
        this.p.b(bl2 ? 1.0f : 0.0f);
    }

    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        float f5 = f2;
        int n2 = gD.surface();
        float f6 = 12.0f;
        float f7 = this.d;
        float f8 = this.c;
        float f9 = this.b;
        float f10 = this.a;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f7, f10, matrix4f2, f8, f6, n2, f9, f5);
        float f11 = f2;
        int n3 = gD.border();
        float f12 = 1.0f;
        float f13 = this.c + 1.0f;
        float f14 = this.b + 48.0f;
        float f15 = this.a;
        Matrix4f matrix4f3 = matrix4f;
        dP.a(f11, f12, f15, f14, f13, matrix4f3, n3);
        float f16 = f2;
        int n4 = gD.border();
        float f17 = this.d;
        float f18 = 1.0f;
        float f19 = this.b;
        float f20 = this.a + this.c;
        Matrix4f matrix4f4 = matrix4f;
        dP.a(f16, f17, f20, f19, f18, matrix4f4, n4);
        this.a(this.q, this.c);
        float f21 = this.b;
        float f22 = this.a;
        this.q.c(f21, f22);
        float f23 = f2;
        float f24 = f3;
        float f25 = f4;
        Matrix4f matrix4f5 = matrix4f;
        this.q.c(f23, f24, f25, matrix4f5);
        float f26 = this.a + 8.0f;
        float f27 = this.m;
        float f28 = 32.0f;
        float f29 = 208.0f;
        float f30 = jm.a(f28, f27, f29);
        float f31 = 9.0f;
        float f32 = this.p.a();
        float f33 = this.b + 49.0f + 18.0f - 1.0f - f31;
        float f34 = f33 + 32.0f;
        float f35 = this.b + 49.0f + 16.0f - 1.0f;
        float f36 = f32;
        float f37 = f35;
        float f38 = f34;
        float f39 = jm.a(f37, f36, f38);
        float f40 = this.m;
        float f41 = f30;
        fE fE2 = this.r;
        this.a(f41, fE2, f40);
        float f42 = f33;
        float f43 = f26;
        this.r.c(f42, f43);
        float f44 = f2;
        float f45 = f3;
        float f46 = f4;
        Matrix4f matrix4f6 = matrix4f;
        this.r.c(f44, f45, f46, matrix4f6);
        this.a(this.s, f30);
        float f47 = f39;
        float f48 = f26;
        this.s.c(f47, f48);
        float f49 = f2;
        float f50 = f3;
        float f51 = f4;
        Matrix4f matrix4f7 = matrix4f;
        this.s.c(f49, f50, f51, matrix4f7);
        float f52 = f34 + 32.0f + 4.0f;
        float f53 = f35 + 32.0f + 4.0f;
        float f54 = f32;
        List<aK> list = this.t;
        float f55 = f53;
        float f56 = f52;
        float f57 = f30;
        float f58 = f26;
        float f59 = f2;
        float f60 = f3;
        float f61 = f4;
        Matrix4f matrix4f8 = matrix4f;
        this.a(f55, f58, f54, f60, f61, f59, f56, f57, matrix4f8, list);
        float f62 = 4.0f;
        float f63 = f52;
        int n5 = this.t.size();
        float f64 = this.a(f63, f62, n5);
        float f65 = 4.0f;
        float f66 = f53;
        int n6 = this.t.size();
        float f67 = this.a(f66, f65, n6);
        float f68 = 6.0f + f31 * 2.0f;
        float f69 = f64 + 38.0f - 32.0f + f31 * 2.0f;
        float f70 = f67 + f68 - 32.0f;
        float f71 = this.m;
        float f72 = f30;
        fE fE3 = this.u;
        this.a(f72, fE3, f71);
        float f73 = f32;
        float f74 = f70;
        float f75 = f69;
        float f76 = jm.a(f74, f73, f75);
        float f77 = f26;
        this.u.c(f76, f77);
        float f78 = f2;
        float f79 = f3;
        float f80 = f4;
        Matrix4f matrix4f9 = matrix4f;
        this.u.c(f78, f79, f80, matrix4f9);
        float f81 = f69 + 32.0f;
        float f82 = f67 + f68;
        float f83 = f32;
        List<dH> list2 = this.v;
        float f84 = f82;
        float f85 = f81;
        float f86 = f30;
        float f87 = f26;
        float f88 = f2;
        float f89 = f3;
        float f90 = f4;
        Matrix4f matrix4f10 = matrix4f;
        this.a(f84, f87, f83, f89, f90, f88, f85, f86, matrix4f10, list2);
        float f91 = this.b + this.d - 18.0f - 32.0f;
        float f92 = (float)this.w.size() * 32.0f + (float)(this.w.size() - 1) * 4.0f;
        float f93 = f91 - f92 - 15.0f;
        float f94 = 0.0f;
        List<dH> list3 = this.w;
        float f95 = f93;
        float f96 = f93;
        float f97 = f30;
        float f98 = f26;
        float f99 = f2;
        float f100 = f3;
        float f101 = f4;
        Matrix4f matrix4f11 = matrix4f;
        this.a(f95, f98, f94, f100, f101, f99, f96, f97, matrix4f11, list3);
        this.a(this.B, f30);
        float f102 = f91;
        float f103 = f26;
        this.B.c(f102, f103);
        float f104 = f2;
        float f105 = f3;
        float f106 = f4;
        Matrix4f matrix4f12 = matrix4f;
        this.B.c(f104, f105, f106, matrix4f12);
    }

    private void c() {
        if (this.x.a()) {
            return;
        }
        this.a();
        this.x.a(true);
        if (this.G != null) {
            this.G.run();
        }
    }

    public void c(Runnable runnable) {
        this.H = runnable;
    }

    public void h() {
        this.a();
        this.x.a(true);
    }

    private void f() {
        if (this.J != null) {
            this.J.run();
        }
    }

    private void d() {
        if (this.y.a()) {
            return;
        }
        this.a();
        this.y.a(true);
        if (this.H != null) {
            this.H.run();
        }
    }

    public void d(Runnable runnable) {
        this.I = runnable;
    }

    public void a(fV fV2) {
        if (fV2 == null) {
            if (this.s.a()) {
                return;
            }
            this.a();
            this.s.a(true);
            return;
        }
        for (aK aK2 : this.t) {
            if (aK2.a() != fV2) continue;
            if (aK2.a()) {
                return;
            }
            this.a();
            aK2.a(true);
            return;
        }
    }

    public void a(Consumer consumer) {
        this.E = consumer;
    }

    public fV a() {
        if (this.s.a()) {
            return null;
        }
        for (aK aK2 : this.t) {
            if (!aK2.a()) continue;
            return aK2.a();
        }
        return null;
    }

    private void a() {
        this.s.a(false);
        for (aK aK2 : this.t) {
            aK2.a(false);
        }
        this.x.a(false);
        this.y.a(false);
        this.z.a(false);
    }

    public void a(float f2) {
        boolean bl2;
        float f3 = this.m = Math.clamp((float)f2, (float)0.0f, (float)1.0f);
        float f4 = 48.0f;
        float f5 = 224.0f;
        this.c = jm.a(f4, f3, f5);
        boolean bl3 = this.m + 1.0E-4f < this.n;
        boolean bl4 = bl2 = this.m >= 0.999f;
        if (bl3 || !bl2) {
            this.o = -1L;
            this.p.c(0.0f);
        } else {
            if (this.o < 0L) {
                this.o = System.nanoTime();
            }
            if (System.nanoTime() - this.o >= 100000000L) {
                this.p.c(1.0f);
            }
        }
        this.n = this.m;
    }

    private void a(hT hT2, float f2) {
        hT2.a(this.m);
        hT2.c(f2);
    }

    private float a(float f2, float f3, int n2) {
        if (n2 <= 0) {
            return f2;
        }
        return f2 + (float)n2 * 32.0f + (float)Math.max(0, n2 - 1) * f3;
    }

    private float a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, Matrix4f matrix4f, List list) {
        float f10 = f8;
        float f11 = f2;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            hT hT2 = (hT)list.get(i2);
            this.a(hT2, f9);
            float f12 = f4;
            float f13 = f11;
            float f14 = f10;
            float f15 = jm.a(f13, f12, f14);
            float f16 = f3;
            hT2.c(f15, f16);
            float f17 = f7;
            float f18 = f5;
            float f19 = f6;
            Matrix4f matrix4f2 = matrix4f;
            hT2.c(f17, f18, f19, matrix4f2);
            float f20 = 32.0f + (i2 < list.size() - 1 ? 4.0f : 0.0f);
            f10 += f20;
            f11 += f20;
        }
        return f10;
    }

    private void a(aK aK2) {
        if (aK2.a()) {
            if (this.F != null) {
                this.F.accept(aK2.a());
            }
            return;
        }
        this.a();
        aK2.a(true);
        if (this.E != null) {
            this.E.accept(aK2.a());
        }
    }

    public void a(Runnable runnable) {
        this.C.a(runnable);
    }

    private void a(float f2, hT hT2, float f3) {
        hT2.a(f3);
        hT2.c(f2);
    }

    private void g() {
        double d2 = this.D;
        this.C.a(() -> {
            float f2 = this.A.o() + 16.0f - 8.0f + 16.0f;
            float f3 = f2 + 8.0f;
            float f4 = 14.0f;
            String string = this.A.c();
            float f5 = f3 + ao.a(f4, string);
            float f6 = this.m;
            float f7 = f2;
            float f8 = f5;
            float f9 = jm.a(f7, f6, f8);
            return new float[]{Math.max(f9, (float)d2) + 10.0f, this.A.p() + this.A.r() / 2.0f};
        });
    }

    public void j() {
        this.a();
        this.z.a(true);
    }
}

