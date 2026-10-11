/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class iy
extends cA {
    protected static final float k = 32.0f;
    protected static final float l = 26.0f;
    protected static final float m = 8.0f;
    protected static final float n = 0.22f;
    protected static final float o = 1.5f;
    protected static final float p = 14.0f;
    protected static final float q = 9.0f;
    protected final bo r = new bo(0.0f, 0.22f).a(D::d);
    private boolean s;
    private boolean t;
    private double u;

    protected iy(fa fa2) {
        super(fa2);
    }

    protected abstract float b();

    @Override
    public boolean b(int n2, double d2, double d3) {
        if (n2 != 0) {
            return false;
        }
        float f2 = this.b(this.c);
        float f3 = this.a(this.c - this.n() - 8.0f);
        float f4 = this.b(f2, f3);
        if (d2 < (double)this.a || d2 > (double)(this.a + this.c) || d3 < (double)f4 || d3 > (double)(f4 + 32.0f)) {
            return false;
        }
        this.s = true;
        this.t = false;
        this.u = d2;
        return true;
    }

    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        String string = this.a();
        float f5 = ao.a(string, 12.0f);
        float f6 = f2;
        float f7 = this.c - f5 - 8.0f;
        Matrix4f matrix4f2 = matrix4f;
        float f8 = this.a(f7, matrix4f2, f6);
        float f9 = f2;
        float f10 = this.c;
        float f11 = f8;
        Matrix4f matrix4f3 = matrix4f;
        float f12 = this.a(matrix4f3, f9, f11, f10);
        float f13 = this.b + 1.0f;
        float f14 = f2;
        int n2 = gD.primary();
        float f15 = 12.0f;
        float f16 = f13;
        float f17 = this.a + this.c - f5;
        String string2 = string;
        Matrix4f matrix4f4 = matrix4f;
        ao.a(f16, f17, n2, f15, f14, string2, matrix4f4);
        float f18 = f12;
        float f19 = f8;
        float f20 = this.b(f18, f19);
        float f21 = f2;
        int n3 = gD.elevated();
        float f22 = 8.0f;
        float f23 = 32.0f;
        float f24 = this.c;
        float f25 = f20;
        float f26 = this.a;
        Matrix4f matrix4f5 = matrix4f;
        dP.a(f22, f26, n3, matrix4f5, f23, f24, f21, f25);
        if (!this.t) {
            this.r.c(this.b());
        }
        float f27 = this.r.a();
        float f28 = this.a();
        float f29 = this.a() == 1 ? this.a(0) : this.a(0) + (this.a(this.a() - 1) - this.a(0)) * f27 / (float)(this.a() - 1);
        float f30 = f29 - f28 / 2.0f;
        float f31 = f20 + 3.0f;
        float f32 = f2;
        float f33 = 2.0f;
        float f34 = 1.0f;
        float f35 = 0.0f;
        int n4 = 0x1A000000;
        float f36 = 0.0f;
        int n5 = 0;
        int n6 = gD.background();
        float f37 = 8.0f;
        float f38 = 8.0f;
        float f39 = 8.0f;
        float f40 = 8.0f;
        float f41 = 26.0f;
        float f42 = f28;
        float f43 = f31;
        float f44 = f30;
        Matrix4f matrix4f6 = matrix4f;
        dP.a(f42, n4, n6, f44, f43, f33, f40, f41, f34, matrix4f6, f32, n5, f38, f36, f39, f37, f35);
        this.a(matrix4f, f20, f2);
        this.d = f20 + 32.0f - this.b;
    }

    protected final float n() {
        return ao.a(this.a(), 12.0f);
    }

    @Override
    public float f() {
        float f2 = this.a(this.c - this.n() - 8.0f);
        float f3 = this.b(this.c);
        return this.a(f2, f3) + 8.0f + 32.0f;
    }

    @Override
    public boolean a(double d2, double d3, int n2, double d4, double d5) {
        if (!this.s || n2 != 0) {
            return false;
        }
        if (!this.t && Math.abs(d3 - this.u) >= 1.5) {
            this.t = true;
        }
        if (!this.t) {
            return true;
        }
        this.r.c(this.a(d3));
        return true;
    }

    @Override
    public boolean a(double d2, double d3, int n2) {
        if (!this.s || n2 != 0) {
            return false;
        }
        boolean bl2 = this.t;
        this.s = false;
        this.t = false;
        int n3 = bl2 ? Math.round(this.a(d2)) : this.a(d2);
        n3 = Math.clamp((long)n3, (int)0, (int)(this.a() - 1));
        this.a(n3);
        return true;
    }

    protected float a(double d2) {
        float f2 = this.c / (float)this.a();
        float f3 = (float)((d2 - (double)this.a) / (double)f2) - 0.5f;
        return Math.clamp((float)f3, (float)0.0f, (float)((float)this.a() - 1.0f));
    }

    protected int a(double d2) {
        float f2 = this.c / (float)this.a();
        return (int)Math.floor((d2 - (double)this.a) / (double)f2);
    }

    protected abstract String a();

    protected abstract void a(int var1);

    protected abstract void a(Matrix4f var1, float var2, float var3);

    @Override
    protected final float a(int n2) {
        return this.a + this.c / (float)this.a() * ((float)n2 + 0.5f);
    }

    protected abstract float a();

    protected abstract int a();
}

