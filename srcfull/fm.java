/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;

public abstract class fm
extends hT {
    private static final float m = 0.82f;
    protected final kD n;
    private final bo o = jm.a();

    protected fm(kD kD2, String string) {
        super(string, 208.0f, 32.0f);
        this.n = kD2;
    }

    protected boolean b() {
        return false;
    }

    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        boolean bl2 = this.e = this.d((double)f4, (double)f3) && !ih.b();
        this.o.c(this.b() ? 1.0f : (this.e ? 0.82f : 0.0f));
        float f5 = this.o.a();
        if (f5 > 0.001f) {
            float f6 = f2 * f5;
            int n2 = gD.elevated();
            float f7 = 8.0f;
            float f8 = this.d;
            float f9 = this.c;
            float f10 = this.b;
            float f11 = this.a;
            Matrix4f matrix4f2 = matrix4f;
            dP.a(f7, f11, n2, matrix4f2, f8, f9, f6, f10);
        }
        float f12 = this.a + 16.0f - 8.0f;
        float f13 = this.b + (this.d - 16.0f) / 2.0f;
        float f14 = f2;
        int n3 = gD.foreground();
        float f15 = 16.0f;
        float f16 = f13;
        float f17 = f12;
        kD kD2 = this.n;
        Matrix4f matrix4f3 = matrix4f;
        jr.a(f16, kD2, n3, matrix4f3, f14, f15, f17);
        float f18 = f12 + 16.0f + 8.0f;
        float f19 = Math.max(0.0f, this.a + this.c - 8.0f - f18);
        float f20 = this.b + (this.d - 14.0f) / 2.0f;
        float f21 = f2 * (1.0f - this.l);
        aE aE2 = ao::b;
        float f22 = f21;
        int n4 = gD.foreground();
        float f23 = 14.0f;
        float f24 = this.d;
        float f25 = this.b;
        float f26 = f19;
        float f27 = f20;
        float f28 = f18;
        Matrix4f matrix4f4 = matrix4f;
        this.a(f26, matrix4f4, f22, n4, f28, aE2, f27, f23, f24, f25);
    }
}

