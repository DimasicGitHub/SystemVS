/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_10219;
import net.minecraft.class_1041;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;

@jB(value=class_1041.class)
public class bf {
    private static boolean a;

    public static void b(class_1041 class_10412) {
        long l2 = class_10412.method_4490();
        if (l2 == 0L) {
            return;
        }
        if (!class_10412.method_4498()) {
            if (a) {
                a = false;
                GLFW.glfwSetWindowAttrib((long)l2, (int)131077, (int)1);
            }
            return;
        }
        if (!gd.a()) {
            return;
        }
        if (GLFW.glfwGetWindowMonitor((long)l2) == 0L) {
            return;
        }
        long l3 = bf.a(l2);
        if (l3 == 0L) {
            return;
        }
        GLFWVidMode gLFWVidMode = GLFW.glfwGetVideoMode((long)l3);
        if (gLFWVidMode == null) {
            return;
        }
        int[] nArray = new int[1];
        int[] nArray2 = new int[1];
        GLFW.glfwGetMonitorPos((long)l3, (int[])nArray, (int[])nArray2);
        a = true;
        GLFW.glfwSetWindowAttrib((long)l2, (int)131077, (int)0);
        GLFW.glfwSetWindowMonitor((long)l2, (long)0L, (int)nArray[0], (int)nArray2[0], (int)gLFWVidMode.width(), (int)gLFWVidMode.height(), (int)-1);
    }

    private static long a(long l2) {
        long l3 = GLFW.glfwGetWindowMonitor((long)l2);
        if (l3 != 0L) {
            return l3;
        }
        int[] nArray = new int[1];
        int[] nArray2 = new int[1];
        GLFW.glfwGetWindowPos((long)l2, (int[])nArray, (int[])nArray2);
        PointerBuffer pointerBuffer = GLFW.glfwGetMonitors();
        if (pointerBuffer == null) {
            return GLFW.glfwGetPrimaryMonitor();
        }
        for (int i2 = 0; i2 < pointerBuffer.limit(); ++i2) {
            long l4 = pointerBuffer.get(i2);
            GLFWVidMode gLFWVidMode = GLFW.glfwGetVideoMode((long)l4);
            if (gLFWVidMode == null) continue;
            int[] nArray3 = new int[1];
            int[] nArray4 = new int[1];
            GLFW.glfwGetMonitorPos((long)l4, (int[])nArray3, (int[])nArray4);
            if (nArray[0] < nArray3[0] || nArray[0] >= nArray3[0] + gLFWVidMode.width() || nArray2[0] < nArray4[0] || nArray2[0] >= nArray4[0] + gLFWVidMode.height()) continue;
            return l4;
        }
        return GLFW.glfwGetPrimaryMonitor();
    }

    @hz(method="method_4479", desc="()V", at=iD.TAIL)
    public static void a(class_1041 class_10412) {
        bf.b(class_10412);
    }

    @hz(method="method_15998", desc="(Lnet/minecraft/class_10219;)V", at=iD.REPLACE)
    public static void a(class_1041 class_10412, class_10219 class_102192) {
        if (gd.a()) {
            try {
                ad.d();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        bP.a(class_10412, class_102192);
    }
}

