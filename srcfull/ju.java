/*
 * Decompiled with CFR 0.152.
 */
final class ju
extends gF {
    private /* synthetic */ ju(String string, int n2, String string2) {
    }

    @Override
    public /* bridge */ /* synthetic */ void a(fD fD2) {
        float[] fArray = fD2.a(45);
        int[] nArray = fD2.a(15);
        int[] nArray2 = fD2.b(15);
        for (int i2 = 0; i2 < 6; ++i2) {
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            int n2;
            float f10 = fD2.o * 8.0f + gF.a(i2 * 7717);
            int n3 = (int)f10;
            float f11 = f10 - (float)n3;
            int n4 = n3 * 7919 + i2 * 104729;
            float f12 = 0.1f + gF.a(n4) * 0.8f;
            float f13 = gF.a(n4 + 3) * ((float)Math.PI * 2) + f11 * 0.5f;
            float f14 = gF.a(n4 + 5) < 0.5f ? -1.0f : 1.0f;
            float f15 = 1.6f + gF.a(n4 + 7) * 2.0f;
            float f16 = (0.35f + 0.65f * gF.d((float)Math.PI * f11)) * fD2.a(f12);
            for (n2 = 0; n2 <= 14; ++n2) {
                f9 = (float)n2 / 14.0f;
                f8 = gF.a(n4 + n2 * 53) - 0.5f + (gF.a(n4 + n2 * 191) - 0.5f) * 0.45f;
                f7 = gF.a(n4 + n2 * 97) - 0.5f + (gF.a(n4 + n2 * 313) - 0.5f) * 0.45f;
                f6 = gF.a(n4 + n2 * 17) - 0.5f + (gF.a(n4 + n2 * 421) - 0.5f) * 0.45f;
                f5 = f13 + f14 * f15 * f9 + f8 * 0.32f;
                f4 = fD2.l * (0.9f + f7 * 0.42f + gF.a(n4 + n2, fD2.o * 55.0f) * 0.06f);
                f3 = (f12 + f6 * 0.2f + gF.a(n4 + n2 * 5, fD2.o * 45.0f) * 0.025f) * fD2.m;
                fArray[n2 * 3] = gF.c(f5) * f4;
                fArray[n2 * 3 + 1] = f3;
                fArray[n2 * 3 + 2] = gF.d(f5) * f4;
                f2 = 0.25f + 0.75f * gF.d((float)Math.PI * f9);
                nArray[n2] = fD2.a(f16 * 0.85f * f2);
                nArray2[n2] = fD2.a(f16 * 0.2f * f2);
            }
            boolean bl2 = false;
            int[] nArray3 = nArray2;
            float f17 = fD2.n * 1.15f;
            int n5 = 15;
            float[] fArray2 = fArray;
            fD2.a(f17, fArray2, nArray3, bl2, n5);
            boolean bl3 = false;
            int[] nArray4 = nArray;
            float f18 = fD2.n * 0.34f;
            int n6 = 15;
            float[] fArray3 = fArray;
            fD2.a(f18, fArray3, nArray4, bl3, n6);
            n2 = 3 + (int)(gF.a(n4 + 13) * 9.0f);
            f9 = fArray[n2 * 3];
            f8 = fArray[n2 * 3 + 1];
            f7 = fArray[n2 * 3 + 2];
            f6 = f9 - fArray[(n2 - 1) * 3];
            f5 = f7 - fArray[(n2 - 1) * 3 + 2];
            f4 = (float)Math.sqrt(f6 * f6 + f5 * f5);
            if (f4 < 1.0E-5f) continue;
            f3 = gF.a(n4 + 19) < 0.5f ? -0.9f : 0.9f;
            f2 = (f6 * gF.c(f3) - f5 * gF.d(f3)) / f4;
            float f19 = (f6 * gF.d(f3) + f5 * gF.c(f3)) / f4;
            for (int i3 = 0; i3 < 4; ++i3) {
                float f20 = (float)i3 / 3.0f;
                float f21 = fD2.l * 0.85f * f20;
                fArray[i3 * 3] = f9 + f2 * f21 + fD2.l * (gF.a(n4 + i3 * 71) - 0.5f) * 0.2f;
                fArray[i3 * 3 + 1] = f8 - fD2.m * f20 * 0.14f;
                fArray[i3 * 3 + 2] = f7 + f19 * f21 + fD2.l * (gF.a(n4 + i3 * 83) - 0.5f) * 0.2f;
                nArray[i3] = fD2.a(f16 * 0.5f * (1.0f - f20));
            }
            boolean bl4 = false;
            int[] nArray5 = nArray;
            float f22 = fD2.n * 0.28f;
            int n7 = 4;
            float[] fArray4 = fArray;
            fD2.a(f22, fArray4, nArray5, bl4, n7);
        }
    }
}

