/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;

public final class jn
implements fU {
    private static final float a = 12.0f;
    private static final float b = 12.0f;
    private static final float c = 8.0f;

    private jn() {
    }

    public static void a(Matrix4f matrix4f, float f2, gO gO2, String string, float f3, float f4, int n2) {
        String string2 = jn.a(string);
        String string3 = gO2 != null && gO2.b() ? gO2.a() : Integer.toString(n2);
        float f5 = ao.a(string2, 12.0f);
        float f6 = f4 + 8.0f;
        float f7 = f2 + 7.0f;
        float f8 = f3;
        int n3 = gD.mutedFg();
        float f9 = 12.0f;
        float f10 = f7;
        float f11 = f6;
        String string4 = string2;
        Matrix4f matrix4f2 = matrix4f;
        ao.a(f10, f11, n3, f9, f8, string4, matrix4f2);
        float f12 = f6 + f5 + 4.0f;
        float f13 = f4 + 87.0f - 8.0f;
        float f14 = Math.max(0.0f, f13 - f12);
        float f15 = 12.0f;
        float f16 = f14;
        String string5 = string3;
        String string6 = dq.b(f16, string5, f15);
        float f17 = ao.a(string6, 12.0f);
        float f18 = f13 - f17;
        float f19 = f2 + 7.0f;
        float f20 = f3;
        int n4 = gD.foreground();
        float f21 = 12.0f;
        float f22 = f19;
        float f23 = f18;
        String string7 = string6;
        Matrix4f matrix4f3 = matrix4f;
        ao.a(f22, f23, n4, f21, f20, string7, matrix4f3);
        if (gO2 != null && gO2.b() && gO2.a()) {
            float f24 = f18 + f17 + 1.0f;
            float f25 = f3;
            int n5 = gD.foreground();
            float f26 = 12.0f;
            float f27 = 1.0f;
            float f28 = f19;
            float f29 = f24;
            Matrix4f matrix4f4 = matrix4f;
            dP.a(f25, f26, f29, f28, f27, matrix4f4, n5);
        }
    }

    private static String a(String string) {
        if (string == null || string.isEmpty()) {
            return "";
        }
        char c2 = string.charAt(0);
        return Character.toString(Character.toUpperCase(c2));
    }
}

