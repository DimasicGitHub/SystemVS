/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;

public final class cv {
    private static final float a = 0.78f;
    private static final float b = 0.1f;
    private static final float c = 0.12f;

    private cv() {
    }

    public static int a(int n2) {
        int n3 = 0xFF000000 | gD.background() & 0xFFFFFF;
        int n4 = 0xFF000000 | gD.foreground() & 0xFFFFFF;
        int n5 = n3;
        int n6 = n3;
        float f2 = 0.78f;
        int n7 = n2;
        int n8 = bC.a(n6, f2, n7);
        int n9 = n8;
        if (ie.a(n5, n9) < 0.1f) {
            float f3 = 0.12f;
            int n10 = n4;
            int n11 = n8;
            n8 = bC.a(n10, f3, n11);
        }
        return n8;
    }

    public static void a(float f2, float f3, float f4, Matrix4f matrix4f, float f5) {
        float f6 = f5;
        int n2 = gD.primary();
        int n3 = gD.border();
        int n4 = bC.a(n2, f6, n3);
        float f7 = f5;
        int n5 = gD.background();
        int n6 = gD.foreground();
        int n7 = bC.a(n5, f7, n6);
        float f8 = f3;
        int n8 = n4;
        float f9 = 8.0f;
        float f10 = 16.0f;
        float f11 = 28.0f;
        float f12 = f2;
        float f13 = f4;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f9, f13, n8, matrix4f2, f10, f11, f8, f12);
        float f14 = f4 + 2.0f + f5 * 12.0f;
        float f15 = f2 + 2.0f;
        float f16 = f3;
        int n9 = n7;
        float f17 = 6.0f;
        float f18 = 12.0f;
        float f19 = 12.0f;
        float f20 = f15;
        float f21 = f14;
        Matrix4f matrix4f3 = matrix4f;
        dP.a(f17, f21, n9, matrix4f3, f18, f19, f16, f20);
    }

    public static void a(float f2, Matrix4f matrix4f, boolean bl2, float f3, float f4, float f5, bo bo2, float f6, float f7) {
        bo2.c(bl2 ? 1.0f : 0.0f);
        float f8 = bo2.a();
        float f9 = 0.85f;
        int n2 = gD.elevated();
        int n3 = gD.surface();
        int n4 = bC.a(n2, f9, n3);
        float f10 = f8;
        int n5 = n4;
        int n6 = gD.surface();
        int n7 = bC.a(n5, f10, n6);
        float f11 = f2;
        float f12 = 3.0f;
        float f13 = 1.0f;
        float f14 = 0.0f;
        int n8 = 0x1A000000;
        float f15 = 0.0f;
        int n9 = 0;
        int n10 = n7;
        float f16 = f3;
        float f17 = f3;
        float f18 = f3;
        float f19 = f3;
        float f20 = f5;
        float f21 = f6;
        float f22 = f4;
        float f23 = f7;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f21, n8, n10, f23, f22, f12, f19, f20, f13, matrix4f2, f11, n9, f17, f15, f18, f16, f14);
    }
}

