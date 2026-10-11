/*
 * Decompiled with CFR 0.152.
 */
final class gj
extends jv {
    private /* synthetic */ gj(String string, int n2) {
    }

    @Override
    public /* bridge */ /* synthetic */ float a(float f2, float f3, float f4, float f5) {
        if (f2 == 0.0f) {
            return f3;
        }
        if ((f2 /= f4) == 1.0f) {
            return f3 + f5;
        }
        float f6 = f4 * 0.3f;
        float f7 = f6 / 4.0f;
        return f5 * (float)Math.pow(2.0, -10.0f * f2) * (float)Math.sin((double)(f2 * f4 - f7) * (Math.PI * 2) / (double)f6) + f5 + f3;
    }
}

