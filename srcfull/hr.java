/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;

public class hr
extends cA {
    private final dw k;
    private final fs l;

    public hr(dw dw2) {
        super(dw2);
        this.k = dw2;
        this.l = new fs(dw2.a());
        this.l.a(() -> this.k.a(this.l.a()));
    }

    @Override
    public boolean b(int n2, double d2, double d3) {
        int n3 = n2;
        double d4 = d3;
        double d5 = d2;
        return this.l.b(n3, d5, d4);
    }

    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        float f5;
        this.l.a(this.k.a());
        float f6 = this.c - 16.0f - 8.0f;
        float f7 = f2;
        float f8 = f6;
        Matrix4f matrix4f2 = matrix4f;
        float f9 = this.a(f8, matrix4f2, f7);
        float f10 = f2;
        float f11 = f6;
        float f12 = f9;
        Matrix4f matrix4f3 = matrix4f;
        float f13 = this.a(matrix4f3, f10, f12, f11);
        float f14 = f5 = this.b + -1.0f;
        float f15 = this.a + this.c - 16.0f;
        this.l.c(f14, f15);
        float f16 = f2;
        float f17 = f3;
        float f18 = f4;
        Matrix4f matrix4f4 = matrix4f;
        this.l.c(f16, f17, f18, matrix4f4);
        this.d = Math.max(this.a(f9, f13), 16.0f);
    }

    @Override
    protected float c() {
        return 11.0f;
    }

    @Override
    public float f() {
        float f2 = this.c - 16.0f - 8.0f;
        return Math.max(this.a(this.a(f2), this.b(f2)), 16.0f);
    }

    @Override
    protected float d() {
        return 12.0f;
    }

    @Override
    protected kD a() {
        return kD.SETTING_CHECKBOX;
    }
}

