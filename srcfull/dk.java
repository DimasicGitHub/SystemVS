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

public final class dk {
    private static final /* synthetic */ class_10156 a;
    private static final /* synthetic */ class_10156 b;
    private static class_6367 c;
    private static class_6367 d;
    private static class_6367 e;
    private static /* synthetic */ class_5944 f;
    private static /* synthetic */ class_284 g;
    private static /* synthetic */ class_284 h;
    private static /* synthetic */ class_284 i;
    private static /* synthetic */ class_5944 j;
    private static /* synthetic */ class_284 k;
    private static /* synthetic */ class_284 l;
    private static /* synthetic */ class_284 m;
    private static /* synthetic */ class_284 n;
    private static /* synthetic */ class_284 o;
    private static /* synthetic */ class_284 p;
    private static /* synthetic */ class_284 q;
    private static final /* synthetic */ long r;

    private /* synthetic */ dk() {
    }

    static {
        a = new class_10156(class_2960.method_60656((String)"core/player_outline_blur"), class_290.field_1592, class_10149.field_53930);
        b = new class_10156(class_2960.method_60656((String)"core/player_outline_blit"), class_290.field_1592, class_10149.field_53930);
        r = System.nanoTime();
    }

    public static /* bridge */ /* synthetic */ void b() {
        if (c != null) {
            c.method_1238();
            c = null;
        }
        if (d != null) {
            d.method_1238();
            d = null;
        }
        if (e != null) {
            e.method_1238();
            e = null;
        }
        f = null;
        j = null;
        i = null;
        h = null;
        g = null;
        q = null;
        p = null;
        o = null;
        n = null;
        m = null;
        l = null;
        k = null;
    }

    private static /* bridge */ /* synthetic */ void b(class_5944 class_59442) {
        if (class_59442 == j) {
            return;
        }
        j = class_59442;
        k = class_59442.method_34582("OutlineColor");
        l = class_59442.method_34582("OutlineColorTop");
        m = class_59442.method_34582("Intensity");
        n = class_59442.method_34582("FillAlpha");
        o = class_59442.method_34582("Time");
        p = class_59442.method_34582("FlameStrength");
        q = class_59442.method_34582("GradientSpeed");
    }

    private static /* bridge */ /* synthetic */ void a() {
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1592);
        class_2872.method_22912(0.0f, 0.0f, 0.0f);
        class_2872.method_22912(1.0f, 0.0f, 0.0f);
        class_2872.method_22912(1.0f, 1.0f, 0.0f);
        class_2872.method_22912(0.0f, 1.0f, 0.0f);
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    private static /* bridge */ /* synthetic */ void a(int n2, int n3) {
        int n4 = Math.max(1, n3 / 2);
        int n5 = Math.max(1, n2 / 2);
        boolean bl2 = true;
        int n6 = n2;
        int n7 = n3;
        class_6367 class_63672 = c;
        c = dk.a(class_63672, bl2, n7, n6);
        boolean bl3 = false;
        int n8 = n5;
        int n9 = n4;
        class_6367 class_63673 = d;
        d = dk.a(class_63673, bl3, n9, n8);
        boolean bl4 = false;
        int n10 = n5;
        int n11 = n4;
        class_6367 class_63674 = e;
        e = dk.a(class_63674, bl4, n11, n10);
    }

    private static /* bridge */ /* synthetic */ class_6367 a(class_6367 class_63672, boolean bl2, int n2, int n3) {
        if (class_63672 == null) {
            class_6367 class_63673 = new class_6367(n2, n3, bl2);
            dk.a(class_63673);
            return class_63673;
        }
        if (class_63672.field_1482 != n2 || class_63672.field_1481 != n3) {
            class_63672.method_1234(n2, n3);
            dk.a(class_63672);
        }
        return class_63672;
    }

    private static /* bridge */ /* synthetic */ void a(class_6367 class_63672) {
        hm.a(class_63672);
    }

    public static /* bridge */ /* synthetic */ boolean a(class_276 class_2762) {
        int n2 = class_2762.field_1481;
        int n3 = class_2762.field_1482;
        dk.a(n2, n3);
        if (c == null) {
            return false;
        }
        c.method_1236(0.0f, 0.0f, 0.0f, 0.0f);
        c.method_1235(false);
        c.method_1230();
        class_2762.method_1235(false);
        return true;
    }

    public static /* bridge */ /* synthetic */ void a(fq fq2, class_310 class_3102) {
        if (fq2 == null) {
            return;
        }
        boolean bl2 = fq2.g.a();
        boolean bl3 = fq2.b.a();
        float f2 = (float)fq2.e.d();
        if (bl2) {
            f2 *= fq2.i.a();
        }
        float f3 = bl3 ? fq2.d.a() : 0.0f;
        float f4 = bl2 ? fq2.h.a() : 0.0f;
        float f5 = (float)fq2.f.d();
        float f6 = f2;
        float f7 = bl3 ? (float)fq2.c.g() * 0.003921569f : 0.0f;
        float f8 = bl3 ? (float)fq2.c.f() * 0.003921569f : 0.0f;
        float f9 = bl3 ? (float)fq2.c.e() * 0.003921569f : 0.0f;
        float f10 = bl3 ? (float)fq2.c.d() * 0.003921569f : 0.0f;
        float f11 = (float)fq2.a.g() * 0.003921569f;
        float f12 = (float)fq2.a.f() * 0.003921569f;
        float f13 = (float)fq2.a.e() * 0.003921569f;
        float f14 = (float)fq2.a.d() * 0.003921569f;
        class_310 class_3103 = class_3102;
        dk.a(class_3103, f3, f8, f10, f4, f14, f11, f9, f13, f6, f5, f7, f12);
    }

    public static /* bridge */ /* synthetic */ void a(class_310 class_3102, float f2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 1.8f;
        float f6 = 14.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = f2;
        float f12 = 1.0f;
        float f13 = 1.0f;
        float f14 = 1.0f;
        class_310 class_3103 = class_3102;
        dk.a(class_3103, f3, f8, f10, f4, f14, f11, f9, f13, f6, f5, f7, f12);
    }

    private static /* bridge */ /* synthetic */ void a(class_310 class_3102, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        class_5944 class_59442;
        class_5944 class_59443;
        if (c == null || d == null || e == null) {
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
        dk.a(class_59443);
        dk.b(class_59442);
        float f14 = 0.0f;
        float f15 = f10 / 2.0f;
        int n2 = dk.d.field_1482;
        int n3 = dk.d.field_1481;
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.disableBlend();
        RenderSystem.viewport((int)0, (int)0, (int)n2, (int)n3);
        RenderSystem.setShader((class_5944)class_59443);
        if (g != null) {
            g.method_1255((float)n2, (float)n3);
        }
        if (i != null) {
            i.method_1251(f15);
        }
        d.method_1235(false);
        class_59443.method_62899("MaskSampler", c.method_30277());
        if (h != null) {
            h.method_1255(1.0f, 0.0f);
        }
        dk.a();
        e.method_1235(false);
        class_59443.method_62899("MaskSampler", d.method_30277());
        if (h != null) {
            h.method_1255(0.0f, 1.0f);
        }
        dk.a();
        class_276 class_2762 = class_3102.method_1522();
        class_2762.method_1235(false);
        RenderSystem.viewport((int)0, (int)0, (int)class_2762.field_1482, (int)class_2762.field_1481);
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA, (GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA);
        class_59442.method_62899("BlurSampler", e.method_30277());
        class_59442.method_62899("MaskSampler", c.method_30277());
        if (k != null) {
            k.method_35657(f6, f9, f13, f7);
        }
        if (l != null) {
            l.method_35657(f4, f8, f3, f12);
        }
        if (m != null) {
            m.method_1251(f11);
        }
        if (n != null) {
            n.method_1251(f14);
        }
        if (o != null) {
            o.method_1251((float)(System.nanoTime() - r) / 1.0E9f);
        }
        if (p != null) {
            p.method_1251(f5);
        }
        if (q != null) {
            q.method_1251(f2);
        }
        RenderSystem.setShader((class_5944)class_59442);
        dk.a();
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableDepthTest();
        RenderSystem.disableBlend();
        RenderSystem.defaultBlendFunc();
    }

    private static /* bridge */ /* synthetic */ void a(class_5944 class_59442) {
        if (class_59442 == f) {
            return;
        }
        f = class_59442;
        g = class_59442.method_34582("MaskSize");
        h = class_59442.method_34582("Direction");
        i = class_59442.method_34582("Radius");
    }

    public static /* bridge */ /* synthetic */ class_276 a() {
        return c;
    }
}

