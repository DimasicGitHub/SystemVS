/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.platform.GlStateManager;
import java.nio.ByteBuffer;
import net.minecraft.class_6367;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public final class hm {
    private static final ByteBuffer a = BufferUtils.createByteBuffer((int)4);

    public static int a(int n2, int n3, int n4) {
        try {
            int n5 = GL11.glGetInteger((int)36006);
            GlStateManager._glBindFramebuffer((int)36008, (int)n2);
            a.clear();
            GL11.glReadPixels((int)n3, (int)n4, (int)1, (int)1, (int)6408, (int)5121, (ByteBuffer)a);
            GlStateManager._glBindFramebuffer((int)36160, (int)n5);
            return a.get(3) & 0xFF;
        }
        catch (Throwable throwable) {
            return -1;
        }
    }

    public static void a(class_6367 class_63672) {
        GlStateManager._activeTexture((int)33984);
        GlStateManager._bindTexture((int)class_63672.method_30277());
        GlStateManager._texParameter((int)3553, (int)10241, (int)9729);
        GlStateManager._texParameter((int)3553, (int)10240, (int)9729);
        GlStateManager._texParameter((int)3553, (int)10242, (int)10496);
        GlStateManager._texParameter((int)3553, (int)10243, (int)10496);
        GlStateManager._bindTexture((int)0);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        GlStateManager._glBindFramebuffer((int)36008, (int)n8);
        GlStateManager._glBindFramebuffer((int)36009, (int)n2);
        GL30.glBlitFramebuffer((int)n9, (int)n5, (int)n10, (int)n7, (int)n3, (int)n11, (int)n6, (int)n4, (int)16384, (int)9728);
    }
}

