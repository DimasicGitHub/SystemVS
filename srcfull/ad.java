/*
 * Decompiled with CFR 0.152.
 */
import b.Boot;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_10366;
import net.minecraft.class_1041;
import net.minecraft.class_276;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_308;
import net.minecraft.class_332;
import net.minecraft.class_437;
import net.minecraft.class_6367;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Matrix4fc;
import org.lwjgl.glfw.GLFWNativeWin32;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL32;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ad
extends lo {
    private static class_6367 a;
    private static class_6367 b;
    private static final class_6367[] c;
    private static int d;
    private static int e;
    private static int f;
    private static volatile class_276 g;
    private static volatile class_276 h;
    private static final Matrix4f i;
    private static final Matrix4f j;
    private static class_10366 k;
    private static boolean l;

    private ad() {
    }

    static {
        c = new class_6367[2];
        i = new Matrix4f();
        j = new Matrix4f();
    }

    public static void e() {
        g = null;
        h = null;
        for (int i2 = 0; i2 < c.length; ++i2) {
            ad.c[i2] = ad.a(c[i2]);
        }
        a = ad.a(a);
        b = ad.a(b);
        e = 0;
        f = 0;
    }

    public static class_276 b() {
        return h;
    }

    public static void b() {
        GL20.glBlendEquationSeparate((int)32774, (int)32776);
    }

    public static void c() {
        GL20.glBlendEquationSeparate((int)32774, (int)32774);
    }

    private static class_276 c() {
        if (b != null && ad.b.field_1482 == e && ad.b.field_1481 == f) {
            return b;
        }
        try {
            if (b == null) {
                b = new class_6367(e, f, true);
                b.method_1236(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                b.method_1234(e, f);
            }
        }
        catch (Throwable throwable) {
            b = null;
        }
        return b;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void d() {
        if (gd.a() == null) {
            return;
        }
        class_1041 class_10412 = aM.method_22683();
        if (class_10412 == null) {
            return;
        }
        int n2 = class_10412.method_4489();
        int n3 = class_10412.method_4506();
        if (n2 <= 0 || n3 <= 0) {
            return;
        }
        if (class_10412.method_4486() <= 0 || class_10412.method_4502() <= 0) {
            return;
        }
        if (!jI.a()) {
            return;
        }
        if (aM.method_18506() != null) {
            return;
        }
        bf.b(class_10412);
        if (!Boot.sbCreate(GLFWNativeWin32.glfwGetWin32Window((long)class_10412.method_4490()))) {
            return;
        }
        class_276 class_2762 = ad.a(n2, n3);
        if (class_2762 == null) {
            return;
        }
        try {
            ad.a(class_2762, class_10412);
            if (Boot.sbBeginFrame()) {
                ad.a(n2, n3);
            }
            if (gd.c()) {
                ad.a(class_2762, n2, n3);
            }
        }
        catch (Throwable throwable) {
        }
        finally {
            try {
                aM.method_1522().method_1240();
            }
            catch (Throwable throwable) {}
        }
    }

    private static void a(int n2) {
        class_1041 class_10412 = aM.method_22683();
        float f2 = class_10412.method_4486();
        float f3 = class_10412.method_4502();
        RenderSystem.enableBlend();
        ad.c();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA);
        RenderSystem.colorMask((boolean)true, (boolean)true, (boolean)true, (boolean)false);
        RenderSystem.setShader((class_10156)class_10142.field_53879);
        RenderSystem.setShaderTexture((int)0, (int)n2);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1585);
        class_2872.method_22912(0.0f, 0.0f, 0.0f).method_22913(0.0f, 1.0f);
        class_2872.method_22912(0.0f, f3, 0.0f).method_22913(0.0f, 0.0f);
        class_2872.method_22912(f2, f3, 0.0f).method_22913(1.0f, 0.0f);
        class_2872.method_22912(f2, 0.0f, 0.0f).method_22913(1.0f, 1.0f);
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.colorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        ad.b();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(class_437 class_4372, class_332 class_3322, int n2, int n3, float f2) {
        if (a == null || class_4372 == null) {
            return;
        }
        class_276 class_2762 = ad.c();
        if (class_2762 == null) {
            return;
        }
        class_276 class_2763 = g;
        try {
            class_2762.method_1230();
            class_2762.method_1235(true);
            g = class_2762;
            class_4372.method_25394(class_3322, n2, n3, f2);
            class_3322.method_51452();
        }
        catch (Throwable throwable) {
        }
        finally {
            g = class_2763;
        }
        try {
            a.method_1235(true);
            ad.a(class_2762.method_30277());
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static void a(Matrix4fStack matrix4fStack) {
        if (!l || k == null) {
            return;
        }
        RenderSystem.setProjectionMatrix((Matrix4f)i, (class_10366)k);
        matrix4fStack.set((Matrix4fc)j);
        try {
            gd.c();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static class_6367 a(class_6367 class_63672) {
        if (class_63672 != null) {
            try {
                class_63672.method_1238();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(class_276 class_2762, int n2, int n3) {
        aM.method_1522().method_1240();
        RenderSystem.viewport((int)0, (int)0, (int)n2, (int)n3);
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.enableBlend();
        ad.c();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA);
        RenderSystem.setShader((class_10156)class_10142.field_53879);
        RenderSystem.setShaderTexture((int)0, (int)class_2762.method_30277());
        RenderSystem.backupProjectionMatrix();
        Matrix4fStack matrix4fStack = RenderSystem.getModelViewStack();
        matrix4fStack.pushMatrix();
        try {
            RenderSystem.setProjectionMatrix((Matrix4f)new Matrix4f().setOrtho(0.0f, 1.0f, 0.0f, 1.0f, -1.0f, 1.0f), (class_10366)class_10366.field_54954);
            matrix4fStack.identity();
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1585);
            class_2872.method_22912(0.0f, 0.0f, 0.0f).method_22913(0.0f, 0.0f);
            class_2872.method_22912(1.0f, 0.0f, 0.0f).method_22913(1.0f, 0.0f);
            class_2872.method_22912(1.0f, 1.0f, 0.0f).method_22913(1.0f, 1.0f);
            class_2872.method_22912(0.0f, 1.0f, 0.0f).method_22913(0.0f, 1.0f);
            class_286.method_43433((class_9801)class_2872.method_60800());
        }
        finally {
            matrix4fStack.popMatrix();
            RenderSystem.restoreProjectionMatrix();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableBlend();
            RenderSystem.depthMask((boolean)true);
            RenderSystem.enableDepthTest();
        }
    }

    public static class_276 a() {
        return g;
    }

    private static void a(int n2, int n3) {
        class_6367 class_63672 = ad.a(d, n2, n3);
        if (class_63672 == null) {
            return;
        }
        d = (d + 1) % c.length;
        class_63672.method_1235(true);
        aM.method_1522().method_1237(n2, n3);
        long l2 = 0L;
        try {
            l2 = GL32.glFenceSync((int)37143, (int)0);
            GL11.glFlush();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        Boot.sbPublish(class_63672.method_30277(), l2);
    }

    private static class_6367 a(int n2, int n3, int n4) {
        class_6367 class_63672 = c[n2];
        if (class_63672 != null && class_63672.field_1482 == n3 && class_63672.field_1481 == n4) {
            return class_63672;
        }
        try {
            if (class_63672 == null) {
                class_63672 = new class_6367(n3, n4, false);
                class_63672.method_1236(0.0f, 0.0f, 0.0f, 1.0f);
            } else {
                class_63672.method_1234(n3, n4);
            }
        }
        catch (Throwable throwable) {
            class_63672 = null;
        }
        ad.c[n2] = class_63672;
        return class_63672;
    }

    public static void a() {
        if (gd.a() == null) {
            return;
        }
        i.set((Matrix4fc)RenderSystem.getProjectionMatrix());
        j.set((Matrix4fc)RenderSystem.getModelViewStack());
        k = RenderSystem.getProjectionType();
        l = true;
    }

    private static class_276 a(int n2, int n3) {
        if (a != null && e == n2 && f == n3) {
            return a;
        }
        try {
            if (a == null) {
                a = new class_6367(n2, n3, true);
                a.method_1236(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                a.method_1234(n2, n3);
            }
        }
        catch (Throwable throwable) {
            a = ad.a(a);
            return null;
        }
        e = n2;
        f = n3;
        return a;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(class_276 class_2762, class_1041 class_10412) {
        gd.a();
        class_2762.method_1230();
        class_2762.method_1235(true);
        RenderSystem.backupProjectionMatrix();
        Matrix4fStack matrix4fStack = RenderSystem.getModelViewStack();
        matrix4fStack.pushMatrix();
        try {
            RenderSystem.disableDepthTest();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            ad.b();
            h = aM.method_1522();
            g = class_2762;
            h.method_58226(9729);
            try {
                ad.a(matrix4fStack);
                Matrix4f matrix4f = new Matrix4f().setOrtho(0.0f, (float)class_10412.method_4486(), (float)class_10412.method_4502(), 0.0f, 1000.0f, 21000.0f);
                RenderSystem.setProjectionMatrix((Matrix4f)matrix4f, (class_10366)class_10366.field_54954);
                matrix4fStack.translation(0.0f, 0.0f, -11000.0f);
                class_308.method_24211();
                gd.b();
            }
            finally {
                g = null;
                try {
                    h.method_58226(9728);
                }
                catch (Throwable throwable) {}
                h = null;
            }
        }
        finally {
            ad.c();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableBlend();
            RenderSystem.enableDepthTest();
            matrix4fStack.popMatrix();
            RenderSystem.restoreProjectionMatrix();
        }
    }
}

