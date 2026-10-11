/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;
import org.joml.Matrix4f;

public class dt
extends gh {
    private static final float k = 0.1f;
    private static final float l = 0.18f;
    private static final float m = 6.0f;
    private boolean n = false;
    private boolean o;
    private String p = "All";
    private String q;
    private final bo r = new bo(1.0f, 0.18f).a(D::f);
    private boolean s;
    private int t = 1;
    private int u = 1;
    private fV v;
    private Consumer<Boolean> w;
    private Consumer<Boolean> x;
    private Runnable y;
    private final bg z;
    private final bg A;
    private final bg B;
    private final bg C;
    private final bg D;

    public dt() {
        this.c = 963.0f;
        this.d = 49.0f;
        this.z = new bg(kD.PANEL, 14.0f);
        this.z.a("\u0411\u043e\u043a\u043e\u0432\u0430\u044f \u043f\u0430\u043d\u0435\u043b\u044c");
        this.z.a(() -> {
            boolean bl2 = this.o = !this.o;
            if (this.x != null) {
                this.x.accept(this.o);
            }
        });
        this.A = new bg(kD.COLLAPSE_ALL, 14.0f);
        this.A.a("\u0421\u0432\u0435\u0440\u043d\u0443\u0442\u044c \u0432\u0441\u0451");
        this.A.a(() -> {
            boolean bl2 = this.n = !this.n;
            if (this.w != null) {
                this.w.accept(this.n);
            }
        });
        this.B = new bg(kD.MOON, 14.0f);
        this.B.a("\u0421\u043c\u0435\u043d\u0438\u0442\u044c \u0442\u0435\u043c\u0443");
        this.B.a(hS::a);
        this.C = new bg(kD.LANGUAGE, 14.0f);
        this.a();
        fc.a().a(this::a);
        this.C.a(() -> {
            fc fc2 = fc.a();
            if (fc2.a() == hj.a) {
                fc2.a();
            }
            fc2.b();
        });
        this.D = new bg(kD.STAR, 14.0f);
        this.D.b(kD.STAR_FILLED);
        this.D.a("\u0418\u0437\u0431\u0440\u0430\u043d\u043d\u043e\u0435");
        this.D.a(() -> {
            if (this.y != null) {
                this.y.run();
            }
        });
    }

    public void b(String string) {
        String string2;
        if (string == null) {
            return;
        }
        String string3 = string2 = this.s ? this.q : this.p;
        if (string.equals(string2)) {
            return;
        }
        this.q = string;
        this.s = true;
        this.t = this.u;
        this.r.a(0.1f);
        this.r.a(D::c);
        this.r.c(0.0f);
    }

    @Override
    public boolean b(int n2, double d2, double d3) {
        int n3 = n2;
        double d4 = d2;
        double d5 = d3;
        if (this.z.b(n3, d4, d5)) {
            return true;
        }
        int n4 = n2;
        double d6 = d2;
        double d7 = d3;
        if (this.A.b(n4, d6, d7)) {
            return true;
        }
        int n5 = n2;
        double d8 = d2;
        double d9 = d3;
        if (this.B.b(n5, d8, d9)) {
            return true;
        }
        int n6 = n2;
        double d10 = d2;
        double d11 = d3;
        if (this.C.b(n6, d10, d11)) {
            return true;
        }
        int n7 = n2;
        double d12 = d2;
        double d13 = d3;
        return this.D.b(n7, d12, d13);
    }

    public void b(Consumer consumer) {
        this.x = consumer;
    }

    public void b(boolean bl2) {
        this.o = bl2;
    }

    public void b(fV fV2) {
        this.n = false;
        this.v = fV2;
        this.u = 1;
        this.a(fV2 != null ? fV2.a() : "All");
    }

    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        float f5;
        float f6 = f2;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        int n2 = 0;
        float f10 = 0.0f;
        int n3 = 0;
        int n4 = gD.background();
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 12.0f;
        float f14 = 0.0f;
        float f15 = 48.0f;
        float f16 = this.c;
        float f17 = this.b;
        float f18 = this.a;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f16, n2, n4, f18, f17, f7, f14, f15, f8, matrix4f2, f6, n3, f12, f10, f13, f11, f9);
        float f19 = this.a + 18.0f - 1.0f;
        float f20 = f5 = this.b + 17.0f;
        float f21 = f19;
        this.z.c(f20, f21);
        float f22 = f2;
        float f23 = f3;
        float f24 = f4;
        Matrix4f matrix4f3 = matrix4f;
        this.z.c(f22, f23, f24, matrix4f3);
        float f25 = f19 + 14.0f + 14.0f;
        float f26 = this.b + 15.5f;
        float f27 = f25 + 7.5f;
        float f28 = f2;
        int n5 = gD.border();
        float f29 = 17.0f;
        float f30 = 1.0f;
        float f31 = f26;
        float f32 = f27;
        Matrix4f matrix4f4 = matrix4f;
        dP.a(f28, f29, f32, f31, f30, matrix4f4, n5);
        float f33 = f25 + 16.0f + 8.0f;
        float f34 = this.b + 17.0f;
        float f35 = this.r.a();
        if (this.s && f35 <= 0.001f) {
            if (this.q != null) {
                this.p = this.q;
            }
            this.q = null;
            this.s = false;
            this.r.a(0.18f);
            this.r.a(D::f);
            this.r.c(1.0f);
            f35 = this.r.a();
        }
        float f36 = (1.0f - f35) * 6.0f * (float)(this.s ? -this.t : this.t);
        float f37 = jm.a(f35);
        ao.b(matrix4f, this.p, f33, f34 + f36, 14.0f, gD.foreground(), f2 * f37);
        float f38 = f2;
        int n6 = gD.border();
        float f39 = 1.0f;
        float f40 = this.c;
        float f41 = this.b + 48.0f;
        float f42 = this.a;
        Matrix4f matrix4f5 = matrix4f;
        dP.a(f38, f39, f42, f41, f40, matrix4f5, n6);
        float f43 = f2;
        float f44 = f3;
        float f45 = f4;
        Matrix4f matrix4f6 = matrix4f;
        this.a(f44, matrix4f6, f43, f45);
    }

    private void a() {
        hj hj2 = fc.a().a();
        this.C.a(hj2 == hj.a ? "Switch to EN" : "\u041d\u0430 \u0440\u0443\u0441\u0441\u043a\u043e\u043c");
    }

    public void a(Runnable runnable) {
        this.y = runnable;
    }

    private void a(float f2, Matrix4f matrix4f, float f3, float f4) {
        this.A.a(this.n ? kD.EXPAND_ALL : kD.COLLAPSE_ALL);
        this.A.a(this.n ? "\u0420\u0430\u0437\u0432\u0435\u0440\u043d\u0443\u0442\u044c \u0432\u0441\u0451" : "\u0421\u0432\u0435\u0440\u043d\u0443\u0442\u044c \u0432\u0441\u0451");
        this.B.a(hS.a() == ga.b ? kD.SUN : kD.MOON);
        float f5 = this.b + 17.0f;
        float f6 = this.b + 15.5f;
        float f7 = this.a + this.c - 25.0f;
        bg[] bgArray = new bg[]{this.A, this.B, this.C, this.D};
        for (int i2 = 0; i2 < bgArray.length; ++i2) {
            float f8 = f7 - 14.0f;
            float f9 = f5;
            float f10 = f8;
            bgArray[i2].c(f9, f10);
            float f11 = f3;
            float f12 = f2;
            float f13 = f4;
            Matrix4f matrix4f2 = matrix4f;
            bgArray[i2].c(f11, f12, f13, matrix4f2);
            f7 = f8 - 7.0f;
            if (i2 >= bgArray.length - 1) continue;
            float f14 = f7 - 1.0f;
            float f15 = f3;
            int n2 = gD.border();
            float f16 = 17.0f;
            float f17 = 1.0f;
            float f18 = f6;
            float f19 = f14;
            Matrix4f matrix4f3 = matrix4f;
            dP.a(f15, f16, f19, f18, f17, matrix4f3, n2);
            f7 = f14 - 7.0f;
        }
    }

    public void a(boolean bl2) {
        this.D.a(bl2);
    }

    public void a(String string) {
        if (string == null) {
            return;
        }
        this.p = string;
        this.q = null;
        this.s = false;
        this.r.b(1.0f);
    }

    public void a(Consumer consumer) {
        this.w = consumer;
    }

    public void a(fV fV2) {
        String string;
        this.n = false;
        String string2 = string = fV2 != null ? fV2.a() : "All";
        this.u = this.v != null && fV2 != null && fV2 != this.v ? (fV2.ordinal() > this.v.ordinal() ? 1 : -1) : 1;
        this.v = fV2;
        this.b(string);
    }
}

