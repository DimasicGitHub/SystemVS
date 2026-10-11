/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;

public class bk
extends hT {
    private final kD m;

    public bk(kD kD2, String string) {
        super(string, 224.0f, 49.0f);
        this.m = kD2;
    }

    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        float f5 = this.a + 16.0f - 2.0f;
        float f6 = this.b + this.d - 15.0f - 20.0f;
        float f7 = f2;
        int n2 = gD.foreground();
        float f8 = 20.0f;
        float f9 = f6;
        float f10 = f5;
        kD kD2 = this.m;
        Matrix4f matrix4f2 = matrix4f;
        jr.a(f9, kD2, n2, matrix4f2, f7, f8, f10);
        float f11 = f5 + 20.0f + 8.0f;
        float f12 = Math.max(0.0f, this.a + this.c - 8.0f - f11);
        float f13 = f6 + 2.0f;
        float f14 = f2 * (1.0f - this.l);
        aE aE2 = ao::c;
        float f15 = f14;
        int n3 = gD.primary();
        float f16 = 16.0f;
        float f17 = this.d;
        float f18 = this.b;
        float f19 = f12;
        float f20 = f13;
        float f21 = f11;
        Matrix4f matrix4f3 = matrix4f;
        this.a(f19, matrix4f3, f15, n3, f21, aE2, f20, f16, f17, f18);
    }
}

