/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;

public class eg
extends lA {
    private boolean k;
    private Runnable l;
    private final bo m;

    public eg(boolean bl2) {
        this.k = bl2;
        this.c = 16.0f;
        this.d = 16.0f;
        this.m = jm.a(bl2 ? 1.0f : 0.0f, 0.15f);
    }

    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        float f5;
        this.m.c(this.k ? 1.0f : 0.0f);
        float f6 = f5 = this.m.a();
        int n2 = gD.primary();
        int n3 = gD.mutedFg();
        int n4 = bC.a(n2, f6, n3);
        if (f5 < 0.999f) {
            float f7 = f2 * (1.0f - f5);
            int n5 = n4;
            float f8 = this.d;
            float f9 = this.c;
            float f10 = this.b;
            float f11 = this.a;
            kD kD2 = kD.STAR;
            Matrix4f matrix4f2 = matrix4f;
            jr.a(f7, n5, matrix4f2, f10, kD2, f8, f11, f9);
        }
        if (f5 > 0.001f) {
            float f12 = f2 * f5;
            int n6 = n4;
            float f13 = this.d;
            float f14 = this.c;
            float f15 = this.b;
            float f16 = this.a;
            kD kD3 = kD.STAR_FILLED;
            Matrix4f matrix4f3 = matrix4f;
            jr.a(f12, n6, matrix4f3, f15, kD3, f13, f16, f14);
        }
    }

    public boolean a() {
        return this.k;
    }

    public void a(Runnable runnable) {
        this.l = runnable;
    }

    @Override
    protected boolean a(double d2, double d3) {
        boolean bl2 = this.k = !this.k;
        if (this.k) {
            iB.a().a(m.h);
        }
        if (this.l != null) {
            this.l.run();
        }
        return true;
    }
}

