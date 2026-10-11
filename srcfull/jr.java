/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.geom.Path2D;
import java.awt.geom.PathIterator;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import net.minecraft.class_10149;
import net.minecraft.class_10156;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_5944;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.MemoryUtil;

public class jr {
    private static final int a = 256;
    private static final float b = 0.12f;
    private static final float c = 1.0f;
    private static final class_10156 d = iS.a("svg", class_290.field_1585, class_10149.field_53930);
    private static final Map<kD, jH> e = new EnumMap<kD, jH>(kD.class);
    private static final FloatBuffer f = MemoryUtil.memAllocFloat((int)1024);
    private static int g = -1;
    private static int h = -1;
    private static jH i = null;
    private static int j = -1;
    private static int k;
    private static int l;
    private static int m;
    private static float[] n;
    private static jH o;
    private static kD p;
    private static int q;
    private static float r;
    private static float s;

    private jr() {
    }

    static {
        n = new float[1280];
    }

    public static void b() {
        if (k > 0 && --k == 0) {
            jr.c();
        }
    }

    private static jH b(kD kD2) {
        float[] objectArray = new float[1024];
        int n2 = 0;
        for (String string : kD2.getPaths()) {
            Path2D.Float float_;
            try {
                float_ = dA.a(string);
            }
            catch (RuntimeException runtimeException) {
                continue;
            }
            int n3 = n2;
            float[] fArray = objectArray;
            Path2D.Float float_2 = float_;
            n2 = jr.a(fArray, n3, float_2);
            if (n2 >= 256) break;
        }
        if (n2 < 256) {
            float[] fArray = new float[n2 * 4];
            System.arraycopy(objectArray, 0, fArray, 0, n2 * 4);
            objectArray = fArray;
        }
        return new jH(objectArray, n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void c() {
        if (l == 0) {
            return;
        }
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        try {
            class_5944 class_59442 = RenderSystem.setShader((class_10156)d);
            if (class_59442 == null) {
                return;
            }
            kD kD2 = p;
            float f2 = kD2.getHeight();
            float f3 = kD2.getWidth();
            float f4 = 0.0f;
            float f5 = 0.0f;
            String string = "ViewBox";
            class_5944 class_59443 = class_59442;
            bS.a(f2, f4, class_59443, string, f3, f5);
            float f6 = s;
            String string2 = "PaddingSvg";
            class_5944 class_59444 = class_59442;
            bS.a(f6, class_59444, string2);
            float f7 = kD2.getStrokeWidth();
            String string3 = "StrokeWidth";
            class_5944 class_59445 = class_59442;
            bS.a(f7, class_59445, string3);
            float f8 = bS.d(q);
            float f9 = bS.c(q);
            float f10 = bS.b(q);
            float f11 = bS.a(q);
            String string4 = "Color";
            class_5944 class_59446 = class_59442;
            bS.a(f8, f10, class_59446, string4, f9, f11);
            float f12 = r;
            String string5 = "GlobalAlpha";
            class_5944 class_59447 = class_59442;
            bS.a(f12, class_59447, string5);
            float f13 = kD2.isFilled() ? 1.0f : 0.0f;
            String string6 = "Filled";
            class_5944 class_59448 = class_59442;
            bS.a(f13, class_59448, string6);
            float f14 = jr.o.b;
            String string7 = "SegmentCount";
            class_5944 class_59449 = class_59442;
            bS.a(f14, class_59449, string7);
            jH jH2 = o;
            class_5944 class_594410 = class_59442;
            jr.a(jH2, class_594410);
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1585);
            for (int i2 = 0; i2 < m; i2 += 5) {
                class_2872.method_22912(n[i2], n[i2 + 1], n[i2 + 2]).method_22913(n[i2 + 3], n[i2 + 4]);
            }
            class_286.method_43433((class_9801)class_2872.method_60800());
        }
        finally {
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
            l = 0;
            m = 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void d() {
        Map<kD, jH> map = e;
        synchronized (map) {
            e.clear();
        }
        i = null;
        j = -1;
        l = 0;
        m = 0;
        o = null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static jH a(kD kD2) {
        Map<kD, jH> map = e;
        synchronized (map) {
            jH jH2 = e.get((Object)kD2);
            if (jH2 != null) {
                return jH2;
            }
            jH jH3 = jr.b(kD2);
            e.put(kD2, jH3);
            return jH3;
        }
    }

    private static int a(float[] fArray, int n2, Path2D.Float float_) {
        PathIterator pathIterator = float_.getPathIterator(null, 0.12f);
        float[] fArray2 = new float[6];
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        while (!pathIterator.isDone() && n2 < 256) {
            int n3 = pathIterator.currentSegment(fArray2);
            switch (n3) {
                case 0: {
                    f2 = fArray2[0];
                    f3 = fArray2[1];
                    f4 = f2;
                    f5 = f3;
                    break;
                }
                case 1: {
                    float f6 = fArray2[1];
                    float f7 = fArray2[0];
                    float f8 = f3;
                    float f9 = f2;
                    int n4 = n2;
                    float[] fArray3 = fArray;
                    n2 = jr.a(n4, f6, fArray3, f7, f8, f9);
                    f2 = fArray2[0];
                    f3 = fArray2[1];
                    break;
                }
                case 4: {
                    float f10 = f5;
                    float f11 = f4;
                    float f12 = f3;
                    float f13 = f2;
                    int n5 = n2;
                    float[] fArray4 = fArray;
                    n2 = jr.a(n5, f10, fArray4, f11, f12, f13);
                    f2 = f4;
                    f3 = f5;
                }
            }
            pathIterator.next();
        }
        return n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(float f2, Matrix4f matrix4f, float f3, kD kD2, float f4, float f5, int n2, float f6, jH jH2) {
        jr.c();
        float f7 = kD2.getWidth();
        float f8 = kD2.getHeight();
        float f9 = Math.min(f4 / f7, f6 / f8);
        float f10 = f7 * f9;
        float f11 = f8 * f9;
        float f12 = f5 + (f4 - f10) * 0.5f;
        float f13 = f2 + (f6 - f11) * 0.5f;
        float f14 = f10 / f7;
        float f15 = kD2.getStrokeWidth() * 0.5f + 1.0f / Math.max(f14, 1.0E-4f);
        float f16 = f15 * f14;
        float f17 = f12 - f16;
        float f18 = f13 - f16;
        float f19 = f10 + f16 * 2.0f;
        float f20 = f11 + f16 * 2.0f;
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        try {
            class_5944 class_59442 = RenderSystem.setShader((class_10156)d);
            if (class_59442 == null) {
                return;
            }
            float f21 = f8;
            float f22 = f7;
            float f23 = 0.0f;
            float f24 = 0.0f;
            String string = "ViewBox";
            class_5944 class_59443 = class_59442;
            bS.a(f21, f23, class_59443, string, f22, f24);
            float f25 = f15;
            String string2 = "PaddingSvg";
            class_5944 class_59444 = class_59442;
            bS.a(f25, class_59444, string2);
            float f26 = kD2.getStrokeWidth();
            String string3 = "StrokeWidth";
            class_5944 class_59445 = class_59442;
            bS.a(f26, class_59445, string3);
            float f27 = bS.d(n2);
            float f28 = bS.c(n2);
            float f29 = bS.b(n2);
            float f30 = bS.a(n2);
            String string4 = "Color";
            class_5944 class_59446 = class_59442;
            bS.a(f27, f29, class_59446, string4, f28, f30);
            float f31 = f3;
            String string5 = "GlobalAlpha";
            class_5944 class_59447 = class_59442;
            bS.a(f31, class_59447, string5);
            float f32 = kD2.isFilled() ? 1.0f : 0.0f;
            String string6 = "Filled";
            class_5944 class_59448 = class_59442;
            bS.a(f32, class_59448, string6);
            float f33 = jH2.b;
            String string7 = "SegmentCount";
            class_5944 class_59449 = class_59442;
            bS.a(f33, class_59449, string7);
            jH jH3 = jH2;
            class_5944 class_594410 = class_59442;
            jr.a(jH3, class_594410);
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1585);
            class_2872.method_22918(matrix4f, f17, f18, 0.0f).method_22913(0.0f, 0.0f);
            class_2872.method_22918(matrix4f, f17, f18 + f20, 0.0f).method_22913(0.0f, 1.0f);
            class_2872.method_22918(matrix4f, f17 + f19, f18 + f20, 0.0f).method_22913(1.0f, 1.0f);
            class_2872.method_22918(matrix4f, f17 + f19, f18, 0.0f).method_22913(1.0f, 0.0f);
            class_286.method_43433((class_9801)class_2872.method_60800());
        }
        finally {
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
        }
    }

    private static void a(float[] fArray, int n2, class_5944 class_59442) {
        int n3 = class_59442.method_1270();
        if (n3 != g) {
            h = GL20.glGetUniformLocation((int)n3, (CharSequence)"Segments");
            g = n3;
        }
        if (h < 0) {
            return;
        }
        f.clear();
        f.put(fArray, 0, n2 * 4);
        f.flip();
        GlStateManager._glUseProgram((int)n3);
        GL20.glUniform4fv((int)h, (FloatBuffer)f);
        i = null;
        j = -1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(float f2, float f3, Matrix4f matrix4f, float f4, float[] fArray, int n2, float f5, float f6, float f7, float f8, float f9, int n3) {
        if (n2 <= 0 || f7 <= 0.0f || f2 <= 0.0f) {
            return;
        }
        jr.c();
        float f10 = Math.min(f5 / f7, f3 / f2);
        float f11 = f7 * f10;
        float f12 = f2 * f10;
        float f13 = f4 + (f5 - f11) * 0.5f;
        float f14 = f9 + (f3 - f12) * 0.5f;
        float f15 = f11 / f7;
        float f16 = f6 * 0.5f + 1.0f / Math.max(f15, 1.0E-4f);
        float f17 = f16 * f15;
        float f18 = f13 - f17;
        float f19 = f14 - f17;
        float f20 = f11 + f17 * 2.0f;
        float f21 = f12 + f17 * 2.0f;
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        try {
            class_5944 class_59442 = RenderSystem.setShader((class_10156)d);
            if (class_59442 == null) {
                return;
            }
            float f22 = f2;
            float f23 = f7;
            float f24 = 0.0f;
            float f25 = 0.0f;
            String string = "ViewBox";
            class_5944 class_59443 = class_59442;
            bS.a(f22, f24, class_59443, string, f23, f25);
            float f26 = f16;
            String string2 = "PaddingSvg";
            class_5944 class_59444 = class_59442;
            bS.a(f26, class_59444, string2);
            float f27 = f6;
            String string3 = "StrokeWidth";
            class_5944 class_59445 = class_59442;
            bS.a(f27, class_59445, string3);
            float f28 = bS.d(n3);
            float f29 = bS.c(n3);
            float f30 = bS.b(n3);
            float f31 = bS.a(n3);
            String string4 = "Color";
            class_5944 class_59446 = class_59442;
            bS.a(f28, f30, class_59446, string4, f29, f31);
            float f32 = f8;
            String string5 = "GlobalAlpha";
            class_5944 class_59447 = class_59442;
            bS.a(f32, class_59447, string5);
            float f33 = 0.0f;
            String string6 = "Filled";
            class_5944 class_59448 = class_59442;
            bS.a(f33, class_59448, string6);
            float f34 = n2;
            String string7 = "SegmentCount";
            class_5944 class_59449 = class_59442;
            bS.a(f34, class_59449, string7);
            int n4 = n2;
            float[] fArray2 = fArray;
            class_5944 class_594410 = class_59442;
            jr.a(fArray2, n4, class_594410);
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1585);
            class_2872.method_22918(matrix4f, f18, f19, 0.0f).method_22913(0.0f, 0.0f);
            class_2872.method_22918(matrix4f, f18, f19 + f21, 0.0f).method_22913(0.0f, 1.0f);
            class_2872.method_22918(matrix4f, f18 + f20, f19 + f21, 0.0f).method_22913(1.0f, 1.0f);
            class_2872.method_22918(matrix4f, f18 + f20, f19, 0.0f).method_22913(1.0f, 0.0f);
            class_286.method_43433((class_9801)class_2872.method_60800());
        }
        finally {
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
        }
    }

    private static int a(int n2, float f2, float[] fArray, float f3, float f4, float f5) {
        float f6 = f3 - f5;
        float f7 = f2 - f4;
        if (f6 * f6 + f7 * f7 < 1.0E-8f) {
            return n2;
        }
        int n3 = n2 * 4;
        fArray[n3] = f5;
        fArray[n3 + 1] = f4;
        fArray[n3 + 2] = f3;
        fArray[n3 + 3] = f2;
        return n2 + 1;
    }

    public static void a(int n2, float f2, float f3, float f4, float f5, float f6, Matrix4f matrix4f) {
        float f7 = f5;
        int n3 = n2;
        float f8 = Math.min(f4, f3) * 0.2f;
        float f9 = f3;
        float f10 = f4;
        float f11 = f6;
        float f12 = f2;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f8, f12, n3, matrix4f2, f9, f10, f7, f11);
    }

    public static void a(float f2, float f3, Matrix4f matrix4f, float f4, float f5, int n2) {
        float f6 = f2;
        int n3 = n2;
        float f7 = f5 * 0.2f;
        float f8 = f5;
        float f9 = f5;
        float f10 = f3;
        float f11 = f4;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f7, f11, n3, matrix4f2, f8, f9, f6, f10);
    }

    public static void a(float f2, int n2, Matrix4f matrix4f, float f3, kD kD2, float f4, float f5, float f6) {
        jH jH2 = jr.a(kD2);
        if (jH2.b == 0) {
            jr.c();
            float f7 = f2;
            int n3 = n2;
            float f8 = Math.min(f6, f4) * 0.2f;
            float f9 = f4;
            float f10 = f6;
            float f11 = f3;
            float f12 = f5;
            Matrix4f matrix4f2 = matrix4f;
            dP.a(f8, f12, n3, matrix4f2, f9, f10, f7, f11);
            return;
        }
        if (k > 0) {
            float f13 = f2;
            int n4 = n2;
            float f14 = f4;
            float f15 = f6;
            float f16 = f3;
            float f17 = f5;
            kD kD3 = kD2;
            jH jH3 = jH2;
            Matrix4f matrix4f3 = matrix4f;
            jr.a(n4, f16, kD3, matrix4f3, f17, f14, f15, f13, jH3);
            return;
        }
        float f18 = f2;
        int n5 = n2;
        float f19 = f4;
        float f20 = f6;
        float f21 = f3;
        float f22 = f5;
        kD kD4 = kD2;
        jH jH4 = jH2;
        Matrix4f matrix4f4 = matrix4f;
        jr.a(f21, matrix4f4, f18, kD4, f20, f22, n5, f19, jH4);
    }

    public static void a(float f2, kD kD2, int n2, Matrix4f matrix4f, float f3, float f4, float f5) {
        float f6 = f3;
        int n3 = n2;
        float f7 = f4;
        float f8 = f4;
        float f9 = f2;
        float f10 = f5;
        kD kD3 = kD2;
        Matrix4f matrix4f2 = matrix4f;
        jr.a(f6, n3, matrix4f2, f9, kD3, f7, f10, f8);
    }

    private static void a(jH jH2, class_5944 class_59442) {
        int n2 = class_59442.method_1270();
        if (n2 != g) {
            h = GL20.glGetUniformLocation((int)n2, (CharSequence)"Segments");
            g = n2;
        }
        if (h < 0) {
            return;
        }
        if (jH2 == i && n2 == j) {
            return;
        }
        f.clear();
        f.put(jH2.a, 0, jH2.b * 4);
        f.flip();
        GlStateManager._glUseProgram((int)n2);
        GL20.glUniform4fv((int)h, (FloatBuffer)f);
        i = jH2;
        j = n2;
    }

    public static void a() {
        ++k;
    }

    private static void a(float f2, float f3, Matrix4f matrix4f, float f4, float f5) {
        int n2 = m;
        jr.n[n2] = matrix4f.m00() * f2 + matrix4f.m10() * f5 + matrix4f.m30();
        jr.n[n2 + 1] = matrix4f.m01() * f2 + matrix4f.m11() * f5 + matrix4f.m31();
        jr.n[n2 + 2] = matrix4f.m02() * f2 + matrix4f.m12() * f5 + matrix4f.m32();
        jr.n[n2 + 3] = f3;
        jr.n[n2 + 4] = f4;
        m += 5;
    }

    private static void a(int n2, float f2, kD kD2, Matrix4f matrix4f, float f3, float f4, float f5, float f6, jH jH2) {
        float f7 = kD2.getWidth();
        float f8 = kD2.getHeight();
        float f9 = Math.min(f5 / f7, f4 / f8);
        float f10 = f7 * f9;
        float f11 = f8 * f9;
        float f12 = f3 + (f5 - f10) * 0.5f;
        float f13 = f2 + (f4 - f11) * 0.5f;
        float f14 = f10 / f7;
        float f15 = kD2.getStrokeWidth() * 0.5f + 1.0f / Math.max(f14, 1.0E-4f);
        float f16 = f15 * f14;
        if (l > 0 && (p != kD2 || q != n2 || r != f6 || s != f15)) {
            jr.c();
        }
        p = kD2;
        o = jH2;
        q = n2;
        r = f6;
        s = f15;
        if (m + 20 > n.length) {
            n = Arrays.copyOf(n, n.length * 2);
        }
        float f17 = f12 - f16;
        float f18 = f13 - f16;
        float f19 = f10 + f16 * 2.0f;
        float f20 = f11 + f16 * 2.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        float f23 = f18;
        float f24 = f17;
        Matrix4f matrix4f2 = matrix4f;
        jr.a(f24, f22, matrix4f2, f21, f23);
        float f25 = 1.0f;
        float f26 = 0.0f;
        float f27 = f18 + f20;
        float f28 = f17;
        Matrix4f matrix4f3 = matrix4f;
        jr.a(f28, f26, matrix4f3, f25, f27);
        float f29 = 1.0f;
        float f30 = 1.0f;
        float f31 = f18 + f20;
        float f32 = f17 + f19;
        Matrix4f matrix4f4 = matrix4f;
        jr.a(f32, f30, matrix4f4, f29, f31);
        float f33 = 0.0f;
        float f34 = 1.0f;
        float f35 = f18;
        float f36 = f17 + f19;
        Matrix4f matrix4f5 = matrix4f;
        jr.a(f36, f34, matrix4f5, f33, f35);
        ++l;
    }
}

