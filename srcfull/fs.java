/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;

public class fs
extends lA {
    private boolean k;
    private Runnable l;
    private final bo m = jm.a(0.0f);
    private final bo n = jm.a(0.0f, 0.22f);

    public fs(boolean bl2) {
        this.k = bl2;
        this.c = 16.0f;
        this.d = 16.0f;
        this.m.b(bl2 ? 1.0f : 0.0f);
        this.n.b(bl2 ? 1.0f : 0.0f);
    }

    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        float f5;
        float f6 = f5 = this.n.a();
        int n2 = gD.primary();
        int n3 = gD.background();
        int n4 = bC.a(n2, f6, n3);
        float f7 = f5;
        int n5 = gD.primary();
        int n6 = gD.border();
        int n7 = bC.a(n5, f7, n6);
        float f8 = this.m.a();
        float f9 = f2;
        float f10 = 1.0f;
        float f11 = 1.0f;
        float f12 = 0.0f;
        int n8 = 0x1A000000;
        float f13 = 1.0f;
        int n9 = n7;
        int n10 = n4;
        float f14 = 6.0f;
        float f15 = 6.0f;
        float f16 = 6.0f;
        float f17 = 6.0f;
        float f18 = this.d;
        float f19 = this.c;
        float f20 = this.b;
        float f21 = this.a;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f19, n8, n10, f21, f20, f10, f17, f18, f11, matrix4f2, f9, n9, f15, f13, f16, f14, f12);
        if (f8 > 0.001f) {
            float f22 = 7.0f;
            float f23 = 6.0f;
            float f24 = this.a + (this.c - f22) / 2.0f;
            float f25 = this.b + (this.d - f23) / 2.0f;
            float f26 = f2 * f8;
            int n11 = gD.surface();
            float f27 = f23;
            float f28 = f22;
            float f29 = f25;
            float f30 = f24;
            kD kD2 = kD.SUCCESS_CHECKBOX;
            Matrix4f matrix4f3 = matrix4f;
            jr.a(f26, n11, matrix4f3, f29, kD2, f27, f30, f28);
        }
    }

    public void a(Runnable runnable) {
        this.l = runnable;
    }

    public boolean a() {
        return this.k;
    }

    @Override
    protected boolean a(double d2, double d3) {
        this.a(!this.k);
        iB.a().a(this.k ? m.j : m.k);
        if (this.l != null) {
            this.l.run();
        }
        return true;
    }

    public void a(boolean bl2) {
        if (this.k == bl2) {
            return;
        }
        this.k = bl2;
        this.m.c(bl2 ? 1.0f : 0.0f);
        this.n.c(bl2 ? 1.0f : 0.0f);
    }
}

