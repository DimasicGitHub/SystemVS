/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.class_10444;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1937;
import net.minecraft.class_2190;
import net.minecraft.class_276;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_6367;
import net.minecraft.class_811;
import net.minecraft.class_9323;
import net.minecraft.class_9334;
import net.minecraft.class_9336;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ir {
    private static final float a = 16.0f;
    private static final int b = 0xF000F0;
    private static final Quaternionf c = new Quaternionf();
    private static final class_4587 d = new class_4587();
    private static class_332 e;
    private static final int f = 256;
    private static final long g = 5000000000L;
    private static final Map<ex, ln> h;
    private static final class_10444 i;
    private static final int j = 64;
    private static final int k = 64;
    private static final Map<ex, class_6367> l;
    private static final Map<ex, class_1799> m;
    private static class_6367 n;
    private static ByteBuffer o;
    private static int p;
    private static boolean q;
    private static int r;
    private static class_332 s;
    private static float t;
    private static int u;
    private static float v;

    private ir() {
    }

    static {
        h = new eL(64, 0.75f, true);
        i = new class_10444();
        l = new aj(16, 0.75f, true);
        m = new LinkedHashMap<ex, class_1799>();
        r = 0;
        s = null;
        t = 1.0f;
        u = 0;
        v = 1.0f;
    }

    public static void e() {
        h.clear();
        for (class_6367 class_63672 : l.values()) {
            try {
                class_63672.method_1238();
            }
            catch (Throwable throwable) {}
        }
        l.clear();
        m.clear();
    }

    private static void b() {
        GL11.glDepthRange((double)0.0, (double)1.0);
        RenderSystem.depthMask((boolean)q);
        GL11.glDepthFunc((int)p);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void b(class_332 class_3322) {
        block8: {
            if (m.isEmpty() || class_3322 == null || lo.aM.method_1522() == null) {
                return;
            }
            Iterator<Map.Entry<ex, class_1799>> iterator = m.entrySet().iterator();
            int n2 = 4;
            block5: while (true) {
                while (iterator.hasNext() && n2-- > 0) {
                    Map.Entry<ex, class_1799> entry = iterator.next();
                    iterator.remove();
                    try {
                        class_6367 class_63672 = ir.a(class_3322, entry.getValue());
                        if (class_63672 == null) continue block5;
                        l.put(entry.getKey(), class_63672);
                        continue block5;
                    }
                    catch (Throwable throwable) {
                    }
                }
                break block8;
                {
                    continue block5;
                    break;
                }
                break;
            }
            finally {
                lo.aM.method_1522().method_1235(true);
            }
        }
    }

    public static void c() {
        if (r == 0) {
            return;
        }
        if (--r == 0) {
            if (s != null) {
                s.method_51452();
            }
            if (t < 1.0f) {
                RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            }
            s = null;
            t = 1.0f;
        }
    }

    public static void d() {
        if (u == 0) {
            return;
        }
        if (--u == 0) {
            class_4597.class_4598 class_45982 = lo.aM.method_22940().method_23000();
            ir.a();
            try {
                class_45982.method_22993();
            }
            finally {
                ir.b();
            }
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            v = 1.0f;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(float f2, float f3, float f4, class_1799 class_17992, Matrix4f matrix4f, float f5) {
        boolean bl2;
        class_1747 class_17472;
        if (class_17992 == null || class_17992.method_7960() || f3 <= 0.001f || f2 <= 0.0f) {
            return;
        }
        if (e != null) {
            float f6 = f3;
            float f7 = f2;
            float f8 = f5;
            float f9 = f4;
            class_1799 class_17993 = class_17992;
            Matrix4f matrix4f2 = matrix4f;
            class_332 class_3322 = e;
            ir.a(class_3322, matrix4f2, f7, class_17993, f8, f9, f6);
            return;
        }
        int n2 = ir.a(class_17992);
        if (n2 != 0) {
            float f10 = f3;
            int n3 = -1;
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = 0.0f;
            float f15 = 0.0f;
            float f16 = 1.0f;
            float f17 = 1.0f;
            float f18 = 0.0f;
            float f19 = f2;
            float f20 = f2;
            float f21 = f5;
            float f22 = f4;
            int n4 = n2;
            Matrix4f matrix4f3 = matrix4f;
            iQ.a(f21, n4, n3, f22, f20, f15, f16, f19, f10, f12, f13, f11, f17, f14, matrix4f3, f18);
            return;
        }
        class_4597.class_4598 class_45982 = lo.aM.method_22940().method_23000();
        class_10444 class_104442 = ir.a(class_17992);
        class_4587 class_45872 = d;
        class_45872.method_34426();
        class_45872.method_23760().method_23761().set((Matrix4fc)matrix4f);
        class_45872.method_46416(f4 + f2 / 2.0f, f5 + f2 / 2.0f, 0.0f);
        class_1792 class_17922 = class_17992.method_7909();
        boolean bl3 = class_17922 instanceof class_1747 && (class_17472 = (class_1747)class_17922).method_7711() instanceof class_2190;
        float f23 = f2 / 16.0f;
        class_45872.method_22905(16.0f * f23, -16.0f * f23, 16.0f * f23);
        if (bl3 && !bU.a()) {
            class_45872.method_22907(c.rotationY((float)Math.PI));
        }
        boolean bl4 = bl2 = f3 < 1.0f;
        if (bl2) {
            class_45982.method_22993();
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f3);
            eK.a();
        }
        ir.a();
        try {
            class_104442.method_65604(class_45872, (class_4597)class_45982, 0xF000F0, class_4608.field_21444);
            class_45982.method_22993();
        }
        finally {
            ir.b();
            if (bl2) {
                eK.b();
                RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            }
        }
    }

    public static void a(class_332 class_3322) {
        e = class_3322;
    }

    public static void a(float f2, class_332 class_3322) {
        if (r++ == 0) {
            s = class_3322;
            t = f2;
            class_3322.method_51452();
            RenderSystem.enableBlend();
            if (f2 < 1.0f) {
                RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f2);
            }
        }
    }

    public static void a(float f2, class_332 class_3322, float f3, class_1799 class_17992, float f4) {
        float f5 = f2;
        float f6 = 16.0f;
        float f7 = f4;
        float f8 = f3;
        class_1799 class_17993 = class_17992;
        class_332 class_3323 = class_3322;
        ir.a(f6, class_17993, f5, f7, f8, class_3323);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(class_332 class_3322, Matrix4f matrix4f, float f2, class_1799 class_17992, float f3, float f4, float f5) {
        class_4587 class_45872 = class_3322.method_51448();
        class_45872.method_22903();
        try {
            boolean bl2;
            class_45872.method_23760().method_23761().set((Matrix4fc)matrix4f);
            class_45872.method_46416(f4, f3, 0.0f);
            if (f2 != 16.0f) {
                float f6 = f2 / 16.0f;
                class_45872.method_22905(f6, f6, 1.0f);
            }
            boolean bl3 = bl2 = f5 < 1.0f;
            if (bl2) {
                RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f5);
                eK.a();
            }
            try {
                class_3322.method_51427(class_17992, 0, 0);
                class_3322.method_51452();
            }
            finally {
                if (bl2) {
                    eK.b();
                    RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                }
            }
        }
        finally {
            class_45872.method_22909();
        }
    }

    public static void a(float f2) {
        if (u++ == 0) {
            v = f2;
            if (f2 < 1.0f) {
                RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f2);
            }
        }
    }

    public static void a(float f2, float f3, class_1799 class_17992, Matrix4f matrix4f, float f4) {
        class_1747 class_17472;
        if (class_17992 == null || class_17992.method_7960() || f3 <= 0.0f) {
            return;
        }
        if (u == 0) {
            float f5 = 1.0f;
            float f6 = f3;
            float f7 = f4;
            float f8 = f2;
            class_1799 class_17993 = class_17992;
            Matrix4f matrix4f2 = matrix4f;
            ir.a(f6, f5, f8, class_17993, matrix4f2, f7);
            return;
        }
        int n2 = ir.a(class_17992);
        if (n2 != 0) {
            float f9 = v;
            int n3 = -1;
            float f10 = 0.0f;
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = 0.0f;
            float f15 = 1.0f;
            float f16 = 1.0f;
            float f17 = 0.0f;
            float f18 = f3;
            float f19 = f3;
            float f20 = f4;
            float f21 = f2;
            int n4 = n2;
            Matrix4f matrix4f3 = matrix4f;
            iQ.a(f20, n4, n3, f21, f19, f14, f15, f18, f9, f11, f12, f10, f16, f13, matrix4f3, f17);
            return;
        }
        class_4597.class_4598 class_45982 = lo.aM.method_22940().method_23000();
        class_10444 class_104442 = ir.a(class_17992);
        class_4587 class_45872 = d;
        class_45872.method_34426();
        class_45872.method_23760().method_23761().set((Matrix4fc)matrix4f);
        class_45872.method_46416(f2 + f3 / 2.0f, f4 + f3 / 2.0f, 0.0f);
        class_1792 class_17922 = class_17992.method_7909();
        boolean bl2 = class_17922 instanceof class_1747 && (class_17472 = (class_1747)class_17922).method_7711() instanceof class_2190;
        float f22 = f3 / 16.0f;
        class_45872.method_22905(16.0f * f22, -16.0f * f22, 16.0f * f22);
        if (bl2 && !bU.a()) {
            class_45872.method_22907(c.rotationY((float)Math.PI));
        }
        class_104442.method_65604(class_45872, (class_4597)class_45982, 0xF000F0, class_4608.field_21444);
    }

    private static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        int n12 = n4;
        int n13 = n5;
        int n14 = n9;
        int n15 = n2;
        int n16 = n11;
        int n17 = n8;
        int n18 = n6;
        int n19 = n10;
        int n20 = n7;
        int n21 = n3;
        hm.a(n16, n15, n12, n19, n13, n17, n21, n20, n18, n14);
    }

    private static boolean a(class_6367 class_63672) {
        try {
            if (o == null) {
                o = BufferUtils.createByteBuffer((int)16384);
            }
            o.clear();
            GlStateManager._glBindFramebuffer((int)36008, (int)class_63672.field_1476);
            GL11.glReadPixels((int)0, (int)0, (int)64, (int)64, (int)6408, (int)5121, (ByteBuffer)o);
            for (int i2 = 3; i2 < 16384; i2 += 4) {
                if (o.get(i2) == 0) continue;
                return true;
            }
            return false;
        }
        catch (Throwable throwable) {
            return true;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static class_6367 a(class_332 class_3322, class_1799 class_17992) {
        class_276 class_2762 = lo.aM.method_1522();
        int n2 = class_2762.field_1481;
        if (class_2762.field_1482 < 64 || n2 < 64) {
            return null;
        }
        float f2 = (float)(64.0 / lo.aM.method_22683().method_4495());
        class_3322.method_51452();
        if (n == null) {
            n = new class_6367(64, 64, false);
        }
        int n3 = 64;
        int n4 = 64;
        int n5 = 0;
        int n6 = 0;
        int n7 = ir.n.field_1476;
        int n8 = n2;
        int n9 = 64;
        int n10 = n2 - 64;
        int n11 = 0;
        int n12 = class_2762.field_1476;
        ir.a(n6, n12, n3, n4, n9, n11, n8, n5, n10, n7);
        class_2762.method_1235(true);
        class_6367 class_63672 = null;
        try {
            GL11.glEnable((int)3089);
            GL11.glScissor((int)0, (int)(n2 - 64), (int)64, (int)64);
            GlStateManager._clearColor((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
            GL11.glClear((int)16640);
            GL11.glDisable((int)3089);
            class_4587 class_45872 = class_3322.method_51448();
            class_45872.method_22903();
            try {
                float f3 = f2 / 16.0f;
                class_45872.method_22905(f3, f3, 1.0f);
                class_3322.method_51427(class_17992, 0, 0);
                class_3322.method_51452();
            }
            finally {
                class_45872.method_22909();
            }
            class_63672 = new class_6367(64, 64, false);
            int n13 = 64;
            int n14 = 64;
            int n15 = 0;
            int n16 = 0;
            int n17 = class_63672.field_1476;
            int n18 = n2;
            int n19 = 64;
            int n20 = n2 - 64;
            int n21 = 0;
            int n22 = class_2762.field_1476;
            ir.a(n16, n22, n13, n14, n19, n21, n18, n15, n20, n17);
        }
        finally {
            int n23 = n2;
            int n24 = 64;
            int n25 = n2 - 64;
            int n26 = 0;
            int n27 = class_2762.field_1476;
            int n28 = 64;
            int n29 = 64;
            int n30 = 0;
            int n31 = 0;
            int n32 = ir.n.field_1476;
            ir.a(n26, n32, n23, n24, n29, n31, n28, n25, n30, n27);
            class_2762.method_1235(true);
        }
        boolean bl2 = ir.a(class_63672);
        class_2762.method_1235(true);
        if (!bl2) {
            try {
                class_63672.method_1238();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            class_2762.method_1235(true);
            return null;
        }
        return class_63672;
    }

    private static ex a(class_1799 class_17992) {
        int n2 = 0;
        for (class_9336 class_93362 : class_17992.method_57353()) {
            if (class_93362.comp_2443() == class_9334.field_49629) continue;
            n2 += class_93362.hashCode();
        }
        return new ex(class_17992.method_7909(), n2, 0, 0);
    }

    private static int a(class_1799 class_17992) {
        if (!ir.a(class_17992)) {
            return 0;
        }
        ex ex2 = ir.a(class_17992);
        class_6367 class_63672 = l.get((Object)ex2);
        if (class_63672 != null) {
            return class_63672.method_30277();
        }
        if (m.size() < 16 && !m.containsKey((Object)ex2)) {
            m.put(ex2, class_17992.method_7972());
        }
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(float f2, class_1799 class_17992, float f3, float f4, float f5, class_332 class_3322) {
        if (class_17992 == null || class_17992.method_7960() || f3 <= 0.001f || f2 <= 0.0f) {
            return;
        }
        if (r > 0) {
            class_4587 class_45872 = class_3322.method_51448();
            class_45872.method_22903();
            class_45872.method_46416(f5, f4, 0.0f);
            if (f2 != 16.0f) {
                float f6 = f2 / 16.0f;
                class_45872.method_22905(f6, f6, 1.0f);
            }
            class_3322.method_51427(class_17992, 0, 0);
            class_45872.method_22909();
            return;
        }
        class_3322.method_51452();
        class_4587 class_45873 = class_3322.method_51448();
        class_45873.method_22903();
        class_45873.method_46416(f5, f4, 0.0f);
        if (f2 != 16.0f) {
            float f7 = f2 / 16.0f;
            class_45873.method_22905(f7, f7, 1.0f);
        }
        RenderSystem.enableBlend();
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f3);
        try {
            class_3322.method_51427(class_17992, 0, 0);
            class_3322.method_51452();
        }
        finally {
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            class_45873.method_22909();
        }
    }

    private static class_10444 a(class_1799 class_17992) {
        if (!ir.a(class_17992)) {
            lo.aM.method_65386().method_65598(i, class_17992, class_811.field_4317, false, (class_1937)lo.aM.field_1687, null, 0);
            return i;
        }
        class_9323 class_93232 = class_17992.method_57353();
        ex ex2 = new ex(class_17992.method_7909(), class_93232.hashCode(), class_17992.method_7947(), class_17992.method_7919());
        long l2 = System.nanoTime();
        ln ln2 = h.get((Object)ex2);
        if (ln2 != null && l2 - ln2.b < 5000000000L) {
            return ln2.a;
        }
        class_10444 class_104442 = ln2 != null ? ln2.a : new class_10444();
        lo.aM.method_65386().method_65598(class_104442, class_17992, class_811.field_4317, false, (class_1937)lo.aM.field_1687, null, 0);
        if (ln2 != null) {
            ln2.b = l2;
        } else {
            h.put(ex2, new ln(class_104442, l2));
        }
        return class_104442;
    }

    private static boolean a(class_1799 class_17992) {
        class_1792 class_17922 = class_17992.method_7909();
        if (class_17922 == class_1802.field_8575) {
            return false;
        }
        class_9323 class_93232 = class_17992.method_57353();
        if (class_93232.method_57832(class_9334.field_49617)) {
            return false;
        }
        return !class_93232.method_57832(class_9334.field_49628);
    }

    private static void a() {
        p = GL11.glGetInteger((int)2932);
        q = GL11.glGetBoolean((int)2930);
        GL11.glDepthFunc((int)515);
        RenderSystem.depthMask((boolean)true);
        GL11.glDepthRange((double)0.0, (double)0.05);
    }
}

