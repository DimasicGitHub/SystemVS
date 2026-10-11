/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;

public class s
extends lA {
    private boolean k;
    private Runnable l;
    private float m;
    private float n;
    private boolean o;
    private boolean p;
    private boolean q;
    private double r;
    private long s;

    public s(boolean bl2) {
        this.k = bl2;
        this.n = this.m = bl2 ? 1.0f : 0.0f;
        this.s = System.nanoTime();
        this.c = 28.0f;
        this.d = 16.0f;
    }

    private void b(boolean bl2) {
        if (this.k == bl2) {
            return;
        }
        this.k = bl2;
        if (this.l != null) {
            this.l.run();
        }
    }

    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        float f5;
        long l2 = System.nanoTime();
        float f6 = (float)((double)(l2 - this.s) / 1.0E9);
        this.s = l2;
        this.n += (this.m - this.n) * (1.0f - (float)Math.exp(-14.0f * f6));
        float f7 = f5 = this.n;
        int n2 = gD.primary();
        int n3 = gD.border();
        int n4 = bC.a(n2, f7, n3);
        float f8 = f5;
        int n5 = gD.background();
        int n6 = gD.foreground();
        int n7 = bC.a(n5, f8, n6);
        float f9 = f2;
        int n8 = n4;
        float f10 = this.d / 2.0f;
        float f11 = this.d;
        float f12 = this.c;
        float f13 = this.b;
        float f14 = this.a;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f10, f14, n8, matrix4f2, f11, f12, f9, f13);
        float f15 = this.a + 2.0f + f5 * (this.c - 12.0f - 4.0f);
        float f16 = this.b + (this.d - 12.0f) / 2.0f;
        float f17 = f2;
        int n9 = n7;
        float f18 = 6.0f;
        float f19 = 12.0f;
        float f20 = 12.0f;
        float f21 = f16;
        float f22 = f15;
        Matrix4f matrix4f3 = matrix4f;
        dP.a(f18, f22, n9, matrix4f3, f19, f20, f17, f21);
    }

    @Override
    public boolean a(double d2, double d3, int n2) {
        if (!this.o || n2 != 0) {
            return false;
        }
        boolean bl2 = this.p;
        this.o = false;
        this.p = false;
        boolean bl3 = bl2 ? this.m >= 0.5f : !this.q;
        this.b(bl3);
        this.m = bl3 ? 1.0f : 0.0f;
        return true;
    }

    public boolean a() {
        return this.k;
    }

    public void a(Runnable runnable) {
        this.l = runnable;
    }

    @Override
    public boolean a(double d2, double d3, int n2, double d4, double d5) {
        if (!this.o || n2 != 0) {
            return false;
        }
        if (!this.p && Math.abs(d3 - this.r) >= 1.5) {
            this.p = true;
        }
        if (!this.p) {
            return true;
        }
        this.m = (float)Math.clamp((double)((d3 - (double)(this.a + 2.0f + 6.0f)) / (double)(this.c - 12.0f - 4.0f)), (double)0.0, (double)1.0);
        return true;
    }

    @Override
    protected boolean a(double d2, double d3) {
        this.o = true;
        this.p = false;
        this.q = this.k;
        this.r = d3;
        return true;
    }

    public void a(boolean bl2) {
        if (this.k == bl2) {
            return;
        }
        this.k = bl2;
        this.m = bl2 ? 1.0f : 0.0f;
    }
}

