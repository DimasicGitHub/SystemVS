/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;

public class kl
implements fU {
    public static float a(int n2, float f2, float f3, float f4, float f5, Matrix4f matrix4f, aF aF2, float f6, String string, gO gO2) {
        if (gO2.b()) {
            boolean bl2 = gO2.a();
            float f7 = f6;
            int n3 = gD.foreground();
            float f8 = f5;
            float f9 = f4;
            float f10 = f3;
            Matrix4f matrix4f2 = matrix4f;
            gO2.a().a(f9, n3, matrix4f2, f7, bl2, f10, f8);
            String string2 = gO2.a().a();
            int n4 = gO2.a().a(f5);
            return Math.min(ao.a(string2.substring(n4), f2), f5);
        }
        float f11 = f2;
        float f12 = f5;
        String string3 = string == null ? "" : string;
        String string4 = dq.a(f12, string3, f11);
        aF aF3 = aF2;
        float f13 = f6;
        int n5 = n2;
        float f14 = f2;
        float f15 = f4;
        float f16 = f3;
        String string5 = string4;
        Matrix4f matrix4f3 = matrix4f;
        kl.a(string5, f14, f13, n5, f15, matrix4f3, aF3, f16);
        return Math.min(ao.a(string4, f2), f5);
    }

    private static void a(String string, float f2, float f3, int n2, float f4, Matrix4f matrix4f, aF aF2, float f5) {
        if (aF2 == aF.b) {
            float f6 = f3;
            int n3 = n2;
            float f7 = f2;
            float f8 = f4;
            float f9 = f5;
            String string2 = string;
            Matrix4f matrix4f2 = matrix4f;
            ao.a(f8, f9, n3, f7, f6, string2, matrix4f2);
        } else {
            ao.a(matrix4f, string, f5, f4, f2, n2, f3);
        }
    }
}

