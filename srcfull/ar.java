/*
 * Decompiled with CFR 0.152.
 */
public final class ar {
    private static final float a = 1.0E-4f;
    private float b;
    private float c;

    public ar(float f2) {
        this.b = f2;
    }

    public float a() {
        return this.b;
    }

    public float a(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            this.a(f3);
            return this.b;
        }
        if (f4 <= 0.0f) {
            return this.b;
        }
        if (Math.abs(this.b - f3) < 1.0E-4f && Math.abs(this.c) < 1.0E-4f) {
            this.a(f3);
            return this.b;
        }
        float f5 = 2.0f / f2;
        float f6 = f5 * f4;
        float f7 = 1.0f / (1.0f + f6 + 0.48f * f6 * f6 + 0.235f * f6 * f6 * f6);
        float f8 = this.b - f3;
        float f9 = (this.c + f5 * f8) * f4;
        this.c = (this.c - f5 * f9) * f7;
        this.b = f3 + (f8 + f9) * f7;
        return this.b;
    }

    public void a(float f2) {
        this.b = f2;
        this.c = 0.0f;
    }
}

