/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_10149;
import net.minecraft.class_10156;
import net.minecraft.class_276;
import net.minecraft.class_284;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_5944;
import net.minecraft.class_6367;
import net.minecraft.class_9801;

public final class id {
    private static final class_10156 a = new class_10156(class_2960.method_60656((String)"core/blur"), class_290.field_1592, class_10149.field_53930);
    private static final class_10156 b = new class_10156(class_2960.method_60656((String)"core/blur_composite"), class_290.field_1592, class_10149.field_53930);
    private static final int c = 2;
    private static class_6367 d;
    private static class_6367 e;
    private static class_6367 f;
    private static class_5944 g;
    private static class_284 h;
    private static class_284 i;
    private static class_284 j;
    private static class_5944 k;
    private static class_284 l;
    private static class_284 m;
    private static class_284 n;
    private static class_284 o;
    private static class_284 p;

    private id() {
    }

    private static void b() {
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1592);
        class_2872.method_22912(0.0f, 0.0f, 0.0f);
        class_2872.method_22912(1.0f, 0.0f, 0.0f);
        class_2872.method_22912(1.0f, 1.0f, 0.0f);
        class_2872.method_22912(0.0f, 1.0f, 0.0f);
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    private static class_6367 a(class_6367 class_63672, int n2, int n3) {
        if (class_63672 == null) {
            class_63672 = new class_6367(n3, n2, false);
        } else if (class_63672.field_1482 != n3 || class_63672.field_1481 != n2) {
            class_63672.method_1234(n3, n2);
        } else {
            return class_63672;
        }
        id.a(class_63672);
        return class_63672;
    }

    private static void a(int n2, int n3) {
        int n4 = Math.max(1, n2 / 2);
        int n5 = Math.max(1, n3 / 2);
        int n6 = n3;
        int n7 = n2;
        class_6367 class_63672 = d;
        d = id.a(class_63672, n6, n7);
        int n8 = n5;
        int n9 = n4;
        class_6367 class_63673 = e;
        e = id.a(class_63673, n8, n9);
        int n10 = n5;
        int n11 = n4;
        class_6367 class_63674 = f;
        f = id.a(class_63674, n10, n11);
    }

    public static void a() {
        if (d != null) {
            d.method_1238();
            d = null;
        }
        if (e != null) {
            e.method_1238();
            e = null;
        }
        if (f != null) {
            f.method_1238();
            f = null;
        }
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
    }

    private static void a(class_6367 class_63672) {
        hm.a(class_63672);
    }

    private static void a(float f2, int n2, int n3, float f3, float f4, float f5, float f6) {
        if (n == null) {
            return;
        }
        if (f6 <= 0.0f || f3 <= 0.0f) {
            n.method_35657(0.0f, 0.0f, 0.0f, 0.0f);
            if (o != null) {
                o.method_1255(0.0f, 0.0f);
            }
            return;
        }
        float f7 = 1.0f / (float)n3;
        float f8 = 1.0f / (float)n2;
        n.method_35657(f2 * f7, 1.0f - (f5 + f3) * f8, (f2 + f6) * f7, 1.0f - f5 * f8);
        if (o != null) {
            o.method_1255(f4 * f7, f4 * f8);
        }
    }

    public static void a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        float f11 = f4 * f6;
        float f12 = f8 * f6;
        float f13 = f2 * f6;
        float f14 = f3 * f6;
        float f15 = f9 * f6;
        float f16 = f10;
        float f17 = f7;
        float f18 = f5;
        id.a(f16, f18, f14, f11, f15, f13, f17, f12);
    }

    private static void a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        class_276 class_2762;
        class_5944 class_59442;
        class_5944 class_59443;
        class_276 class_2763;
        if (f3 <= 0.001f || f8 <= 0.01f) {
            return;
        }
        class_310 class_3102 = class_310.method_1551();
        class_276 class_2764 = class_3102.method_1522();
        if (class_2764 == null) {
            return;
        }
        boolean bl2 = f7 <= 0.0f || f9 <= 0.0f;
        class_276 class_2765 = class_2764;
        if (bl2 && (class_2763 = ad.b()) != null) {
            class_2765 = class_2763;
        }
        int n2 = class_2764.field_1482;
        int n3 = class_2764.field_1481;
        if (n2 <= 0 || n3 <= 0) {
            return;
        }
        if (jI.b()) {
            return;
        }
        try {
            class_59443 = class_3102.method_62887().method_62947(a);
            class_59442 = class_3102.method_62887().method_62947(b);
        }
        catch (Throwable throwable) {
            return;
        }
        if (class_59443 == null || class_59442 == null) {
            return;
        }
        id.a(n2, n3);
        if (d == null || e == null || f == null) {
            return;
        }
        class_5944 class_59444 = class_59442;
        class_5944 class_59445 = class_59443;
        id.a(class_59444, class_59445);
        d.method_1235(true);
        class_2765.method_1237(n2, n3);
        Object object = class_2762 = bl2 ? ad.a() : null;
        if (class_2762 != null) {
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            ad.c();
            float f10 = 0.0f;
            float f11 = 0.0f;
            float f12 = 0.0f;
            int n4 = class_2762.method_30277();
            class_6367 class_63672 = d;
            class_5944 class_59446 = class_59443;
            id.a(f12, f11, class_59446, class_63672, f10, n4);
        }
        RenderSystem.disableBlend();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        float f13 = f8;
        float f14 = 0.0f;
        float f15 = 1.0f;
        int n5 = d.method_30277();
        class_6367 class_63673 = e;
        class_5944 class_59447 = class_59443;
        id.a(f15, f14, class_59447, class_63673, f13, n5);
        float f16 = f8;
        float f17 = 1.0f;
        float f18 = 0.0f;
        int n6 = e.method_30277();
        class_6367 class_63674 = f;
        class_5944 class_59448 = class_59443;
        id.a(f18, f17, class_59448, class_63674, f16, n6);
        float f19 = f5;
        float f20 = f9;
        float f21 = f7;
        float f22 = f4;
        float f23 = f6;
        float f24 = f2;
        float f25 = f3;
        int n7 = n3;
        int n8 = n2;
        class_276 class_2766 = class_2764;
        class_5944 class_59449 = class_59442;
        id.a(n7, f24, f25, f19, f20, f21, f23, class_59449, n8, class_2766, f22);
        if (gd.b()) {
            ad.b();
        }
        RenderSystem.defaultBlendFunc();
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableDepthTest();
    }

    private static void a(class_5944 class_59442, class_5944 class_59443) {
        if (class_59443 != g) {
            g = class_59443;
            h = class_59443.method_34582("InSize");
            i = class_59443.method_34582("Direction");
            j = class_59443.method_34582("Radius");
        }
        if (class_59442 != k) {
            k = class_59442;
            l = class_59442.method_34582("MixAmount");
            m = class_59442.method_34582("DimAmount");
            n = class_59442.method_34582("BoxRect");
            o = class_59442.method_34582("BoxRadius");
            p = class_59442.method_34582("OverlayPass");
        }
    }

    private static void a(float f2, float f3, class_5944 class_59442, class_6367 class_63672, float f4, int n2) {
        class_63672.method_1235(false);
        RenderSystem.viewport((int)0, (int)0, (int)class_63672.field_1482, (int)class_63672.field_1481);
        RenderSystem.setShader((class_5944)class_59442);
        class_59442.method_62899("InSampler", n2);
        if (h != null) {
            h.method_1255((float)class_63672.field_1482, (float)class_63672.field_1481);
        }
        if (j != null) {
            j.method_1251(f4 / 2.0f);
        }
        if (i != null) {
            i.method_1255(f2, f3);
        }
        id.b();
    }

    private static void a(int n2, float f2, float f3, float f4, float f5, float f6, float f7, class_5944 class_59442, int n3, class_276 class_2762, float f8) {
        boolean bl2;
        class_2762.method_1235(false);
        RenderSystem.viewport((int)0, (int)0, (int)n3, (int)n2);
        RenderSystem.setShader((class_5944)class_59442);
        class_59442.method_62899("BlurSampler", f.method_30277());
        class_59442.method_62899("MainSampler", d.method_30277());
        if (l != null) {
            l.method_1251(Math.clamp((float)f3, (float)0.0f, (float)1.0f));
        }
        if (m != null) {
            m.method_1251(Math.clamp((float)f2, (float)0.0f, (float)1.0f));
        }
        float f9 = f4;
        float f10 = f5;
        float f11 = f6;
        float f12 = f8;
        float f13 = f7;
        int n4 = n2;
        int n5 = n3;
        id.a(f13, n4, n5, f10, f9, f12, f11);
        boolean bl3 = gd.b();
        boolean bl4 = bl2 = f6 <= 0.0f || f5 <= 0.0f;
        if (p != null) {
            p.method_1251(bl3 ? 1.0f : 0.0f);
        }
        if (bl3) {
            if (bl2) {
                RenderSystem.enableBlend();
                ad.c();
                RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA, (GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA);
            } else {
                RenderSystem.disableBlend();
                RenderSystem.colorMask((boolean)true, (boolean)true, (boolean)true, (boolean)false);
            }
        }
        id.b();
        if (bl3) {
            if (bl2) {
                RenderSystem.disableBlend();
            } else {
                RenderSystem.colorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
            }
        }
    }

    public static void a(float f2, float f3, float f4) {
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = f2;
        float f11 = f4;
        float f12 = f3;
        id.a(f10, f12, f8, f5, f9, f7, f11, f6);
    }
}

