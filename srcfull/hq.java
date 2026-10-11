/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;

public final class hq {
    public static final float a = 36.0f;
    public static final float b = 12.0f;
    public static final float c = 8.0f;
    public static final float d = 5.0f;
    public static final float e = 5.0f;
    public static final float f = 8.0f;
    public static final float g = 1.0f;
    public static final float h = 6.0f;
    public static final float i = 14.0f;
    public static final float j = 12.0f;

    public static void a(String string, float f2, float f3, float f4, float f5, Matrix4f matrix4f, float f6) {
        if (string == null || string.isEmpty() || f4 <= 0.0f) {
            return;
        }
        float f7 = f6 + f2 + 6.0f + 5.0f - 1.0f;
        float f8 = f5 + f3 / 2.0f - 18.0f;
        float f9 = f4;
        float f10 = f8;
        float f11 = f7;
        String string2 = string;
        Matrix4f matrix4f2 = matrix4f;
        hq.a(f10, f11, string2, matrix4f2, f9);
    }

    public static void a(float f2, Matrix4f matrix4f, String string, float f3, float f4) {
        if (string == null || string.isEmpty() || f2 <= 0.0f) {
            return;
        }
        float f5 = hq.a(string);
        float f6 = 36.0f;
        int n2 = gD.primary();
        float f7 = f2;
        int n3 = n2;
        float f8 = 14.0f;
        float f9 = f6;
        float f10 = f5;
        float f11 = f4;
        float f12 = f3;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f8, f12, n3, matrix4f2, f9, f10, f7, f11);
        float f13 = ao.a(string, 12.0f);
        float f14 = f3 + (f5 - f13) / 2.0f;
        float f15 = f4 + (f6 - 12.0f) / 2.0f;
        float f16 = f2;
        int n4 = gD.elevated();
        float f17 = 12.0f;
        float f18 = f15;
        float f19 = f14;
        String string2 = string;
        Matrix4f matrix4f3 = matrix4f;
        ao.a(f18, f19, n4, f17, f16, string2, matrix4f3);
        float f20 = f3 + f5 - 1.0f;
        float f21 = f4 + (f6 - 8.0f) / 2.0f;
        float f22 = f2;
        int n5 = n2;
        float f23 = 8.0f;
        float f24 = 5.0f;
        float f25 = f21;
        float f26 = f20;
        kD kD2 = kD.TOOLTIP_ARROW_RIGHT;
        Matrix4f matrix4f4 = matrix4f;
        jr.a(f22, n5, matrix4f4, f25, kD2, f23, f26, f24);
    }

    public static void a(float f2, float f3, Matrix4f matrix4f, float f4, float f5, String string) {
        if (string == null || string.isEmpty() || f3 <= 0.0f) {
            return;
        }
        float f6 = hq.a(string);
        float f7 = f2 - 6.0f - 5.0f + 1.0f - f6;
        float f8 = f5 + f4 / 2.0f - 18.0f;
        float f9 = f3;
        float f10 = f8;
        float f11 = f7;
        String string2 = string;
        Matrix4f matrix4f2 = matrix4f;
        hq.a(f9, matrix4f2, string2, f11, f10);
    }

    public static void a(float f2, float f3, String string, Matrix4f matrix4f, float f4) {
        if (string == null || string.isEmpty() || f4 <= 0.0f) {
            return;
        }
        float f5 = hq.a(string);
        float f6 = 36.0f;
        int n2 = gD.primary();
        float f7 = f4;
        int n3 = n2;
        float f8 = 14.0f;
        float f9 = f6;
        float f10 = f5;
        float f11 = f2;
        float f12 = f3;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f8, f12, n3, matrix4f2, f9, f10, f7, f11);
        float f13 = ao.a(string, 12.0f);
        float f14 = f3 + (f5 - f13) / 2.0f;
        float f15 = f2 + (f6 - 12.0f) / 2.0f;
        float f16 = f4;
        int n4 = gD.elevated();
        float f17 = 12.0f;
        float f18 = f15;
        float f19 = f14;
        String string2 = string;
        Matrix4f matrix4f3 = matrix4f;
        ao.a(f18, f19, n4, f17, f16, string2, matrix4f3);
        float f20 = f3 - 5.0f + 1.0f;
        float f21 = f2 + (f6 - 8.0f) / 2.0f;
        float f22 = f4;
        int n5 = n2;
        float f23 = 8.0f;
        float f24 = 5.0f;
        float f25 = f21;
        float f26 = f20;
        kD kD2 = kD.TOOLTIP_ARROW_LEFT;
        Matrix4f matrix4f4 = matrix4f;
        jr.a(f22, n5, matrix4f4, f25, kD2, f23, f26, f24);
    }

    public static void a(float f2, float f3, float f4, String string, Matrix4f matrix4f) {
        if (string == null || string.isEmpty() || f2 <= 0.0f) {
            return;
        }
        float f5 = hq.a(string);
        float f6 = 36.0f;
        int n2 = gD.primary();
        float f7 = f2;
        int n3 = n2;
        float f8 = 14.0f;
        float f9 = f6;
        float f10 = f5;
        float f11 = f3;
        float f12 = f4;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f8, f12, n3, matrix4f2, f9, f10, f7, f11);
        float f13 = ao.a(string, 12.0f);
        float f14 = f4 + (f5 - f13) / 2.0f;
        float f15 = f3 + (f6 - 12.0f) / 2.0f;
        float f16 = f2;
        int n4 = gD.elevated();
        float f17 = 12.0f;
        float f18 = f15;
        float f19 = f14;
        String string2 = string;
        Matrix4f matrix4f3 = matrix4f;
        ao.a(f18, f19, n4, f17, f16, string2, matrix4f3);
        float f20 = f4 + (f5 - 8.0f) / 2.0f;
        float f21 = f3 - 5.0f + 1.0f;
        float f22 = f2;
        int n5 = n2;
        float f23 = 5.0f;
        float f24 = 8.0f;
        float f25 = f21;
        float f26 = f20;
        kD kD2 = kD.TOOLTIP_ARROW_UP;
        Matrix4f matrix4f4 = matrix4f;
        jr.a(f22, n5, matrix4f4, f25, kD2, f23, f26, f24);
    }

    public static float a(String string) {
        return ao.a(string, 12.0f) + 24.0f;
    }

    public static void a(float f2, float f3, float f4, String string, float f5, Matrix4f matrix4f) {
        if (string == null || string.isEmpty() || f4 <= 0.0f) {
            return;
        }
        float f6 = hq.a(string);
        float f7 = f5 + f2 / 2.0f - f6 / 2.0f;
        float f8 = f3 - 6.0f - 5.0f + 1.0f - 36.0f;
        float f9 = f4;
        float f10 = f8;
        float f11 = f7;
        String string2 = string;
        Matrix4f matrix4f2 = matrix4f;
        hq.a(f9, f11, f10, matrix4f2, string2);
    }

    public static void a(String string, float f2, Matrix4f matrix4f, float f3, float f4, float f5, float f6) {
        if (string == null || string.isEmpty() || f5 <= 0.0f) {
            return;
        }
        float f7 = hq.a(string);
        float f8 = f2 + f4 / 2.0f - f7 / 2.0f;
        float f9 = f3 + f6 + 6.0f + 5.0f - 1.0f;
        float f10 = f5;
        float f11 = f9;
        float f12 = f8;
        String string2 = string;
        Matrix4f matrix4f2 = matrix4f;
        hq.a(f10, f11, f12, string2, matrix4f2);
    }

    public static void a(float f2, float f3, float f4, Matrix4f matrix4f, String string) {
        if (string == null || string.isEmpty() || f2 <= 0.0f) {
            return;
        }
        float f5 = hq.a(string);
        float f6 = 36.0f;
        int n2 = gD.primary();
        float f7 = f2;
        int n3 = n2;
        float f8 = 14.0f;
        float f9 = f6;
        float f10 = f5;
        float f11 = f4;
        float f12 = f3;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f8, f12, n3, matrix4f2, f9, f10, f7, f11);
        float f13 = ao.a(string, 12.0f);
        float f14 = f3 + (f5 - f13) / 2.0f;
        float f15 = f4 + (f6 - 12.0f) / 2.0f;
        float f16 = f2;
        int n4 = gD.elevated();
        float f17 = 12.0f;
        float f18 = f15;
        float f19 = f14;
        String string2 = string;
        Matrix4f matrix4f3 = matrix4f;
        ao.a(f18, f19, n4, f17, f16, string2, matrix4f3);
        float f20 = f3 + (f5 - 8.0f) / 2.0f;
        float f21 = f4 + f6 - 1.0f;
        float f22 = f2;
        int n5 = n2;
        float f23 = 5.0f;
        float f24 = 8.0f;
        float f25 = f21;
        float f26 = f20;
        kD kD2 = kD.TOOLTIP_ARROW;
        Matrix4f matrix4f4 = matrix4f;
        jr.a(f22, n5, matrix4f4, f25, kD2, f23, f26, f24);
    }
}

