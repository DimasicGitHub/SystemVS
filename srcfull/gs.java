/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import org.joml.Matrix4f;

public final class gs {
    private static final float a = 1.0f;
    private static final float b = 0.5f;
    private static final float c = 8.0f;

    private static void a(Matrix4f matrix4f, float f2, int n2, float f3, float f4, float f5) {
        if (Math.abs(f4 - f2) <= 0.5f) {
            float f6 = f3;
            int n3 = n2;
            float f7 = f5;
            float f8 = f2 - 0.5f;
            Matrix4f matrix4f2 = matrix4f;
            gs.a(f8, f7, n3, f6, matrix4f2);
        }
    }

    private static void a(float f2, float f3, float f4, Matrix4f matrix4f, int n2) {
        float f5 = f2;
        int n3 = n2;
        float f6 = 0.0f;
        float f7 = f4;
        float f8 = 1.0f;
        float f9 = 0.0f;
        float f10 = f3;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f6, f10, n3, matrix4f2, f7, f8, f5, f9);
    }

    private static void a(float f2, float f3, int n2, float f4, Matrix4f matrix4f) {
        float f5 = f4;
        int n3 = n2;
        float f6 = 0.0f;
        float f7 = 1.0f;
        float f8 = f3;
        float f9 = f2;
        float f10 = 0.0f;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f6, f10, n3, matrix4f2, f7, f8, f5, f9);
    }

    private static void a(float f2, int n2, float f3, float f4, Matrix4f matrix4f, float f5) {
        if (Math.abs(f3 - f2) <= 0.5f) {
            float f6 = f4;
            int n3 = n2;
            float f7 = f5;
            float f8 = f2 - 0.5f;
            Matrix4f matrix4f2 = matrix4f;
            gs.a(f6, f8, f7, matrix4f2, n3);
        }
    }

    private static boolean a(jD jD2) {
        return jD2.C() && jD2.w();
    }

    public static void a(float f2, List list, Matrix4f matrix4f, int n2, float f3, float f4, jD jD2) {
        if (jD2 == null) {
            return;
        }
        float f5 = jD2.A();
        float f6 = jD2.t();
        float f7 = jD2.u();
        float f8 = f7 + f5;
        float f9 = f7 + f5 / 2.0f;
        float f10 = jD2.v();
        float f11 = f10 + f6;
        float f12 = f10 + f6 / 2.0f;
        float f13 = 0.0f;
        float f14 = f2;
        int n3 = n2;
        float f15 = f4;
        float f16 = f7;
        Matrix4f matrix4f2 = matrix4f;
        gs.a(f13, n3, f16, f14, matrix4f2, f15);
        float f17 = f3;
        float f18 = f2;
        int n4 = n2;
        float f19 = f4;
        float f20 = f8;
        Matrix4f matrix4f3 = matrix4f;
        gs.a(f17, n4, f20, f18, matrix4f3, f19);
        float f21 = f3 / 2.0f;
        float f22 = f2;
        int n5 = n2;
        float f23 = f4;
        float f24 = f9;
        Matrix4f matrix4f4 = matrix4f;
        gs.a(f21, n5, f24, f22, matrix4f4, f23);
        float f25 = 0.0f;
        float f26 = f2;
        int n6 = n2;
        float f27 = f3;
        float f28 = f10;
        Matrix4f matrix4f5 = matrix4f;
        gs.a(matrix4f5, f25, n6, f26, f28, f27);
        float f29 = f4;
        float f30 = f2;
        int n7 = n2;
        float f31 = f3;
        float f32 = f11;
        Matrix4f matrix4f6 = matrix4f;
        gs.a(matrix4f6, f29, n7, f30, f32, f31);
        float f33 = f4 / 2.0f;
        float f34 = f2;
        int n8 = n2;
        float f35 = f3;
        float f36 = f12;
        Matrix4f matrix4f7 = matrix4f;
        gs.a(matrix4f7, f33, n8, f34, f36, f35);
        for (jD jD3 : list) {
            if (jD3 == jD2 || !gs.a(jD3)) continue;
            float f37 = jD3.u();
            float f38 = f37 + jD3.A();
            float f39 = f37 + jD3.A() / 2.0f;
            float f40 = jD3.v();
            float f41 = f40 + jD3.t();
            float f42 = f40 + jD3.t() / 2.0f;
            float f43 = f37;
            float f44 = f2;
            int n9 = n2;
            float f45 = f4;
            float f46 = f7;
            Matrix4f matrix4f8 = matrix4f;
            gs.a(f43, n9, f46, f44, matrix4f8, f45);
            float f47 = f38;
            float f48 = f2;
            int n10 = n2;
            float f49 = f4;
            float f50 = f8;
            Matrix4f matrix4f9 = matrix4f;
            gs.a(f47, n10, f50, f48, matrix4f9, f49);
            float f51 = f39;
            float f52 = f2;
            int n11 = n2;
            float f53 = f4;
            float f54 = f9;
            Matrix4f matrix4f10 = matrix4f;
            gs.a(f51, n11, f54, f52, matrix4f10, f53);
            float f55 = f38 + 8.0f;
            float f56 = f2;
            int n12 = n2;
            float f57 = f4;
            float f58 = f7;
            Matrix4f matrix4f11 = matrix4f;
            gs.a(f55, n12, f58, f56, matrix4f11, f57);
            float f59 = f37 - 8.0f;
            float f60 = f2;
            int n13 = n2;
            float f61 = f4;
            float f62 = f8;
            Matrix4f matrix4f12 = matrix4f;
            gs.a(f59, n13, f62, f60, matrix4f12, f61);
            float f63 = f40;
            float f64 = f2;
            int n14 = n2;
            float f65 = f3;
            float f66 = f10;
            Matrix4f matrix4f13 = matrix4f;
            gs.a(matrix4f13, f63, n14, f64, f66, f65);
            float f67 = f41;
            float f68 = f2;
            int n15 = n2;
            float f69 = f3;
            float f70 = f11;
            Matrix4f matrix4f14 = matrix4f;
            gs.a(matrix4f14, f67, n15, f68, f70, f69);
            float f71 = f42;
            float f72 = f2;
            int n16 = n2;
            float f73 = f3;
            float f74 = f12;
            Matrix4f matrix4f15 = matrix4f;
            gs.a(matrix4f15, f71, n16, f72, f74, f73);
            float f75 = f41 + 8.0f;
            float f76 = f2;
            int n17 = n2;
            float f77 = f3;
            float f78 = f10;
            Matrix4f matrix4f16 = matrix4f;
            gs.a(matrix4f16, f75, n17, f76, f78, f77);
            float f79 = f40 - 8.0f;
            float f80 = f2;
            int n18 = n2;
            float f81 = f3;
            float f82 = f11;
            Matrix4f matrix4f17 = matrix4f;
            gs.a(matrix4f17, f79, n18, f80, f82, f81);
        }
    }
}

