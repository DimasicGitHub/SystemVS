/*
 * Decompiled with CFR 0.152.
 */
final class ah {
    final float a;
    float b;
    float c = 8.0f;

    ah(float f2) {
        this.a = f2;
        this.b = f2;
    }

    void a(float f2, float f3) {
        float f4 = Math.abs(f2 - f3);
        if (f4 < this.c) {
            this.b = this.a - (f2 - f3);
            this.c = f4;
        }
    }
}

