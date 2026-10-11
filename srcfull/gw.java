/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;

public class gw
extends lA {
    private kD k;
    private final float l;
    private final float m;
    private Runnable n;

    public gw(kD kD2, float f2, float f3, float f4, float f5) {
        this.k = kD2;
        this.c = f2;
        this.d = f3;
        this.l = f4;
        this.m = f5;
    }

    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        float f5;
        float f6 = f5 = this.c(f4, f3);
        int n2 = gD.foreground();
        int n3 = gD.mutedFg();
        int n4 = bC.a(n2, f6, n3);
        float f7 = this.a + (this.c - this.l) / 2.0f;
        float f8 = this.b + (this.d - this.m) / 2.0f;
        float f9 = f2;
        int n5 = n4;
        float f10 = this.m;
        float f11 = this.l;
        float f12 = f8;
        float f13 = f7;
        kD kD2 = this.k;
        Matrix4f matrix4f2 = matrix4f;
        jr.a(f9, n5, matrix4f2, f12, kD2, f10, f13, f11);
    }

    public void a(kD kD2) {
        this.k = kD2;
    }

    @Override
    protected boolean a(double d2, double d3) {
        if (this.n != null) {
            this.n.run();
        }
        return true;
    }

    public void a(Runnable runnable) {
        this.n = runnable;
    }
}

