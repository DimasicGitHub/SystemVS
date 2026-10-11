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

public final class bn {
    private static final /* synthetic */ class_10156 a;
    private static final /* synthetic */ class_10156 b;
    private static class_6367 c;
    private static class_6367 d;
    private static /* synthetic */ class_5944 e;
    private static /* synthetic */ class_284 f;
    private static /* synthetic */ class_284 g;
    private static /* synthetic */ class_284 h;
    private static /* synthetic */ class_5944 i;
    private static /* synthetic */ class_284 j;
    private static /* synthetic */ class_276 k;
    private static /* synthetic */ int l;
    private static /* synthetic */ int m;

    private /* synthetic */ bn() {
    }

    static {
        a = new class_10156(class_2960.method_60656((String)"core/box_glow_blur"), class_290.field_1592, class_10149.field_53930);
        b = new class_10156(class_2960.method_60656((String)"core/box_glow_blit"), class_290.field_1592, class_10149.field_53930);
    }

    private static /* bridge */ /* synthetic */ void a() {
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1592);
        class_2872.method_22912(0.0f, 0.0f, 0.0f);
        class_2872.method_22912(1.0f, 0.0f, 0.0f);
        class_2872.method_22912(1.0f, 1.0f, 0.0f);
        class_2872.method_22912(0.0f, 1.0f, 0.0f);
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    private static /* bridge */ /* synthetic */ void a(class_6367 class_63672) {
        hm.a(class_63672);
    }

    private static /* bridge */ /* synthetic */ void a(int n2, int n3) {
        if (c == null) {
            c = new class_6367(n2, n3, false);
            bn.a(c);
        } else if (bn.c.field_1482 != n2 || bn.c.field_1481 != n3) {
            c.method_1234(n2, n3);
            bn.a(c);
        }
        if (d == null) {
            d = new class_6367(n2, n3, false);
            bn.a(d);
        } else if (bn.d.field_1482 != n2 || bn.d.field_1481 != n3) {
            d.method_1234(n2, n3);
            bn.a(d);
        }
    }

    public static /* bridge */ /* synthetic */ boolean a() {
        class_310 class_3102 = class_310.method_1551();
        class_276 class_2762 = class_3102.method_1522();
        if (class_2762 == null) {
            return false;
        }
        int n2 = Math.max(1, class_2762.field_1482 / 2);
        int n3 = Math.max(1, class_2762.field_1481 / 2);
        bn.a(n2, n3);
        if (c == null) {
            return false;
        }
        k = class_2762;
        l = class_2762.field_1482;
        m = class_2762.field_1481;
        c.method_1236(0.0f, 0.0f, 0.0f, 0.0f);
        c.method_1230();
        c.method_1235(true);
        RenderSystem.viewport((int)0, (int)0, (int)bn.c.field_1482, (int)bn.c.field_1481);
        return true;
    }

    public static /* bridge */ /* synthetic */ void a(float f2, float f3) {
        class_5944 class_59442;
        class_5944 class_59443;
        if (c == null || d == null || k == null) {
            return;
        }
        class_310 class_3102 = class_310.method_1551();
        if (jI.b()) {
            k.method_1235(false);
            return;
        }
        try {
            class_59443 = class_3102.method_62887().method_62947(a);
            class_59442 = class_3102.method_62887().method_62947(b);
        }
        catch (Throwable throwable) {
            k.method_1235(false);
            return;
        }
        if (class_59443 == null || class_59442 == null) {
            k.method_1235(false);
            return;
        }
        if (class_59443 != e) {
            e = class_59443;
            f = class_59443.method_34582("InSize");
            g = class_59443.method_34582("Direction");
            h = class_59443.method_34582("Radius");
        }
        if (class_59442 != i) {
            i = class_59442;
            j = class_59442.method_34582("Intensity");
        }
        int n2 = bn.c.field_1482;
        int n3 = bn.c.field_1481;
        float f4 = f2 / 2.0f;
        RenderSystem.disableBlend();
        RenderSystem.viewport((int)0, (int)0, (int)n2, (int)n3);
        RenderSystem.setShader((class_5944)class_59443);
        if (f != null) {
            f.method_1255((float)n2, (float)n3);
        }
        if (h != null) {
            h.method_1251(f4);
        }
        d.method_1235(false);
        class_59443.method_62899("InSampler", c.method_30277());
        if (g != null) {
            g.method_1255(1.0f, 0.0f);
        }
        bn.a();
        c.method_1235(false);
        class_59443.method_62899("InSampler", d.method_30277());
        if (g != null) {
            g.method_1255(0.0f, 1.0f);
        }
        bn.a();
        k.method_1235(false);
        RenderSystem.viewport((int)0, (int)0, (int)l, (int)m);
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.setShader((class_5944)class_59442);
        if (j != null) {
            j.method_1251(f3);
        }
        class_59442.method_62899("InSampler", c.method_30277());
        bn.a();
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableDepthTest();
        RenderSystem.defaultBlendFunc();
        k = null;
    }
}

