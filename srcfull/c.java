/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;

public final class c {
    private static final int a = 60;

    private c() {
    }

    public static int a() {
        try {
            long l2 = GLFW.glfwGetPrimaryMonitor();
            if (l2 == 0L) {
                return 60;
            }
            GLFWVidMode gLFWVidMode = GLFW.glfwGetVideoMode((long)l2);
            return gLFWVidMode != null && gLFWVidMode.refreshRate() > 0 ? gLFWVidMode.refreshRate() : 60;
        }
        catch (Throwable throwable) {
            return 60;
        }
    }
}

