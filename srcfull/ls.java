/*
 * Decompiled with CFR 0.152.
 */
final class ls
extends gF {
    private /* synthetic */ ls(String string, int n2, String string2) {
    }

    @Override
    public /* bridge */ /* synthetic */ void a(fD fD2) {
        int n2;
        int n3 = Math.max(28, fD2.p / 4);
        float f2 = fD2.o * ((float)Math.PI * 2) * 0.9f + gF.a(31, fD2.o * 0.8f) * 0.55f;
        float f3 = fD2.n * 0.6f;
        float[] fArray = fD2.a(n3 * 3);
        int[] nArray = fD2.a(n3);
        for (n2 = 0; n2 < n3; ++n2) {
            float f4 = (float)n2 / (float)(n3 - 1);
            float f5 = fD2.l * (1.0f - 0.12f * f4 + 0.09f * gF.a(32, fD2.o * 1.1f + f4 * 3.0f));
            float f6 = f2 + f4 * 2.2f * ((float)Math.PI * 2);
            fArray[n2 * 3] = gF.c(f6) * f5;
            fArray[n2 * 3 + 1] = f4 * fD2.m;
            fArray[n2 * 3 + 2] = gF.d(f6) * f5;
            nArray[n2] = fD2.a(0.8f * (0.45f + 0.55f * gF.d((float)Math.PI * f4)) * fD2.a(f4));
        }
        boolean bl2 = false;
        int[] nArray2 = nArray;
        float f7 = f3;
        int n4 = n3;
        float[] fArray2 = fArray;
        fD2.a(f7, fArray2, nArray2, bl2, n4);
        for (n2 = 0; n2 < n3; ++n2) {
            fArray[n2 * 3] = -fArray[n2 * 3];
            fArray[n2 * 3 + 2] = -fArray[n2 * 3 + 2];
        }
        boolean bl3 = false;
        int[] nArray3 = nArray;
        float f8 = f3;
        int n5 = n3;
        float[] fArray3 = fArray;
        fD2.a(f8, fArray3, nArray3, bl3, n5);
    }
}

