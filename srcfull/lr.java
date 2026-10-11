/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.function.Consumer;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lr
extends gh {
    private static final float k = 0.18f;
    private static final float l = 0.32f;
    private static final float m = 10.0f;
    private final dt n;
    private final ji o;
    private final ac p;
    private final bY q;
    private final as r;
    private final bo s = new bo(1.0f, 0.18f).a(D::c);
    private boolean t = false;
    private Runnable u;
    private cG v = cG.a;
    private fV w;

    public lr() {
        this.c = 963.0f;
        this.d = 700.0f;
        this.n = new dt();
        this.o = new ji();
        this.p = new ac();
        this.q = new bY();
        this.r = new as();
        this.n.a(this.o::a);
    }

    private void e() {
        this.s.b(1.0f);
        this.t = false;
        this.u = null;
    }

    private void b(Runnable runnable) {
        this.u = runnable;
        this.t = true;
        this.s.a(0.18f);
        this.s.a(D::c);
        this.s.c(0.0f);
    }

    @Override
    public boolean b(int n2, double d2, double d3) {
        int n3 = n2;
        double d4 = d2;
        double d5 = d3;
        if (this.n.b(n3, d4, d5)) {
            return true;
        }
        if (this.a(d3)) {
            return true;
        }
        if (this.t) {
            return true;
        }
        int n4 = n2;
        double d6 = d3;
        double d7 = d2;
        return this.a().b(n4, d7, d6);
    }

    public void b(List list) {
        this.b(() -> {
            this.v = cG.d;
            this.w = null;
            this.n.b("F\u0430vorites");
            this.o.a(list);
            this.o.a(0.0f);
            this.n.a(true);
        });
    }

    @Override
    public boolean b(int n2, int n3, int n4) {
        int n5 = n3;
        int n6 = n4;
        int n7 = n2;
        return this.a().b(n7, n5, n6);
    }

    public float b() {
        return this.b + 48.0f + 1.0f;
    }

    public void b() {
        this.v = cG.c;
        this.n.a("Fri\u0435nds");
        this.q.a();
        this.n.a(false);
        this.e();
    }

    public void c() {
        this.v = cG.e;
        this.n.a("W\u0430ypoints");
        this.r.a();
        this.n.a(false);
        this.e();
    }

    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        float f5;
        float f6 = this.s.a();
        if (this.t && f6 <= 0.001f) {
            if (this.u != null) {
                this.u.run();
            }
            this.u = null;
            this.t = false;
            this.s.a(0.32f);
            this.s.a(D::g);
            this.s.c(1.0f);
            f6 = this.s.a();
        }
        float f7 = this.b;
        float f8 = this.a;
        this.n.c(f7, f8);
        float f9 = f2;
        float f10 = f3;
        float f11 = f4;
        Matrix4f matrix4f2 = matrix4f;
        this.n.c(f9, f10, f11, matrix4f2);
        float f12 = this.b + 48.0f + 1.0f;
        float f13 = this.d - 48.0f - 1.0f;
        gh gh2 = this.a();
        float f14 = f12;
        float f15 = this.a;
        gh2.c(f14, f15);
        gh2.c(this.c);
        gh2.d(f13);
        float f16 = f5 = (1.0f - f6) * 10.0f;
        float f17 = f13;
        float f18 = f12;
        float f19 = f2 * f6;
        float f20 = f3;
        float f21 = f4;
        Matrix4f matrix4f3 = matrix4f;
        gh gh3 = gh2;
        this.a(f19, gh3, f18, matrix4f3, f17, f16, f20, f21);
        if (gh2 == this.o) {
            this.o.a(matrix4f, f2 * f6);
        }
    }

    public float c() {
        return this.d - 48.0f - 1.0f;
    }

    public void h() {
        this.b(() -> {
            this.v = cG.e;
            this.n.b("W\u0430ypoints");
            this.r.a();
            this.n.a(false);
        });
    }

    public void f() {
        this.b(() -> {
            this.v = cG.b;
            this.n.b("\u0421onfigs");
            this.p.b();
            this.n.a(false);
        });
    }

    public void d() {
        switch (this.v.ordinal()) {
            case 1: {
                this.p.b();
                break;
            }
            case 2: {
                this.q.a();
                break;
            }
            case 4: {
                this.r.a();
                break;
            }
        }
    }

    public float a() {
        return this.s.b();
    }

    @Override
    public boolean a(double d2, double d3, double d4) {
        if (this.a(d4)) {
            return true;
        }
        if (this.t) {
            return true;
        }
        double d5 = d2;
        double d6 = d4;
        double d7 = d3;
        return this.a().a(d5, d7, d6);
    }

    public void a(Runnable runnable) {
        this.n.a(runnable);
    }

    @Override
    public boolean a(int n2, char c2) {
        int n3 = n2;
        char c3 = c2;
        return this.a().a(n3, c3);
    }

    public void a(float f2, float f3, boolean bl2) {
        this.c = f2;
        this.n.c(f2);
        this.n.b(bl2);
        float f4 = f3;
        float f5 = f2;
        this.o.a(f4, f5);
        float f6 = f3;
        float f7 = f2;
        this.p.a(f6, f7);
        float f8 = f3;
        float f9 = f2;
        this.q.a(f8, f9);
        float f10 = f3;
        float f11 = f2;
        this.r.a(f10, f11);
    }

    @Override
    public boolean a(int n2, int n3, int n4) {
        int n5 = n3;
        int n6 = n2;
        int n7 = n4;
        return this.a().a(n6, n5, n7);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(float f2, gh gh2, float f3, Matrix4f matrix4f, float f4, float f5, float f6, float f7) {
        if (f5 <= 0.001f) {
            float f8 = f2;
            float f9 = f6;
            float f10 = f7;
            Matrix4f matrix4f2 = matrix4f;
            gh2.c(f8, f9, f10, matrix4f2);
            return;
        }
        Matrix4f matrix4f3 = new Matrix4f((Matrix4fc)matrix4f).translate(0.0f, f5, 0.0f);
        float f11 = f4;
        float f12 = this.c;
        float f13 = f3;
        float f14 = this.a;
        aM.b(f12, f11, f13, f14);
        try {
            float f15 = f2;
            float f16 = f6;
            float f17 = f7;
            Matrix4f matrix4f4 = matrix4f3;
            gh2.c(f15, f16, f17, matrix4f4);
        }
        finally {
            aM.b();
        }
    }

    public void a(Consumer consumer) {
        this.n.b(consumer);
    }

    public fV a() {
        return this.w;
    }

    public cG a() {
        return this.v;
    }

    public ji a() {
        return this.o;
    }

    public boolean a(fV fV2) {
        return this.v == cG.a && this.w == fV2;
    }

    public void a(fV fV2, List list) {
        this.v = cG.a;
        this.w = fV2;
        this.n.b(fV2);
        this.o.a(list);
        this.o.a(0.0f);
        this.n.a(false);
        this.e();
    }

    private void a(List list, fV fV2, float f2) {
        this.v = cG.a;
        this.w = fV2;
        this.n.a(fV2);
        this.o.a(list);
        this.o.a(f2);
        this.n.a(false);
    }

    public void a() {
        this.v = cG.b;
        this.n.a("\u0421onfigs");
        this.p.b();
        this.n.a(false);
        this.e();
    }

    public void a(fV fV2, List list, float f2) {
        this.b(() -> {
            float f3 = f2;
            List list2 = list;
            fV fV3 = fV2;
            this.a(list2, fV3, f3);
        });
    }

    public void a(List list) {
        this.v = cG.d;
        this.w = null;
        this.n.a("F\u0430vorites");
        this.o.a(list);
        this.o.a(0.0f);
        this.n.a(true);
        this.e();
    }

    @Override
    public boolean a(double d2, double d3, int n2) {
        if (this.a(d3)) {
            return false;
        }
        return this.a().a(d2, d3, n2);
    }

    @Override
    public boolean a(double d2, double d3, int n2, double d4, double d5) {
        double d6 = d5;
        double d7 = d4;
        int n3 = n2;
        double d8 = d2;
        double d9 = d3;
        return this.a().a(d8, d9, n3, d7, d6);
    }

    public void a(aT aT2) {
        this.o.a(aT2);
    }

    private gh a() {
        gh gh2 = this.v == cG.b ? this.p : (this.v == cG.c ? this.q : (this.v == cG.e ? this.r : this.o));
        return gh2;
    }

    public boolean a(double d2) {
        return d2 >= (double)this.b && d2 < (double)(this.b + 48.0f);
    }

    public boolean a(double d2, int n2, double d3) {
        int n3 = n2;
        double d4 = d2;
        double d5 = d3;
        return this.n.b(n3, d5, d4);
    }

    public void g() {
        this.b(() -> {
            this.v = cG.c;
            this.n.b("Fri\u0435nds");
            this.q.a();
            this.n.a(false);
        });
    }
}

