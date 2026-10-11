/*
 * Decompiled with CFR 0.152.
 */
final class il
extends gF {
    private /* synthetic */ il(String string, int n2, String string2) {
    }

    @Override
    public /* bridge */ /* synthetic */ void a(fD fD2) {
        for (int i2 = 0; i2 < fD2.p; ++i2) {
            float f2 = gF.b(fD2.o * 0.35f + gF.a(i2 * 7919));
            float f3 = gF.a(i2 * 104729) * ((float)Math.PI * 2) + f2 * 0.7f + gF.a(i2 * 13, fD2.o * 0.6f) * 0.5f;
            float f4 = fD2.l * (0.25f + 0.8f * gF.a(i2 * 15486)) + gF.a(i2 * 29, fD2.o * 0.9f + f2 * 2.0f) * 0.07f;
            float f5 = gF.d((float)Math.PI * f2) * fD2.a(f2);
            int n2 = fD2.a(f5 * 0.75f);
            float f6 = fD2.n * (0.45f + 0.65f * gF.a(i2 * 32452));
            float f7 = gF.d(f3) * f4;
            float f8 = f2 * fD2.m * 1.25f;
            float f9 = gF.c(f3) * f4;
            fD2.a(f9, f6, f7, f8, n2);
        }
    }
}

