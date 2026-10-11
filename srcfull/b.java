/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.class_276;
import net.minecraft.class_6367;
import org.lwjgl.opengl.GL30;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class b {
    private static final int a = 4;
    private static class_6367 b;
    private static int c;
    private static int d;
    private static boolean e;
    private static boolean f;
    private static long g;

    private b() {
    }

    static {
        c = 0;
        d = 0;
        e = true;
        f = true;
        g = 0L;
    }

    public static void b() {
        if (!f || b == null) {
            return;
        }
        try {
            GlStateManager._activeTexture((int)33984);
            GlStateManager._bindTexture((int)b.method_30277());
            GlStateManager._texParameter((int)3553, (int)33085, (int)4);
            GL30.glGenerateMipmap((int)3553);
            GlStateManager._texParameter((int)3553, (int)10241, (int)9987);
            GlStateManager._bindTexture((int)0);
            f = false;
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public static int a() {
        try {
            class_276 class_2762 = lo.aM.method_1522();
            if (class_2762 == null) {
                return 0;
            }
            int n2 = class_2762.field_1482;
            int n3 = class_2762.field_1481;
            if (n2 <= 0 || n3 <= 0) {
                return 0;
            }
            boolean bl2 = false;
            if (b == null) {
                b = new class_6367(n2, n3, false);
                b.a(b);
                c = n2;
                d = n3;
                bl2 = true;
            } else if (c != n2 || d != n3) {
                b.method_1234(n2, n3);
                b.a(b);
                c = n2;
                d = n3;
                bl2 = true;
            }
            if (e || bl2) {
                b.method_1235(true);
                class_2762.method_1237(n2, n3);
                class_2762.method_1235(true);
                e = false;
                f = true;
            }
            return b.method_30277();
        }
        catch (Throwable throwable) {
            return 0;
        }
    }

    private static void a(class_6367 class_63672) {
        hm.a(class_63672);
    }

    public static long a() {
        return g;
    }

    public static void a() {
        e = true;
        ++g;
    }
}

