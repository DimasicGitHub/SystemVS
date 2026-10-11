/*
 * Decompiled with CFR 0.152.
 */
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWMouseButtonCallback;
import org.lwjgl.glfw.GLFWMouseButtonCallbackI;
import org.lwjgl.glfw.GLFWScrollCallback;
import org.lwjgl.glfw.GLFWScrollCallbackI;

public class hg {
    private boolean a;
    private boolean b;
    private GLFWScrollCallback c;
    private GLFWMouseButtonCallback d;

    public void a(aW aW2) {
        GLFWScrollCallback gLFWScrollCallback;
        if (lo.aM == null || lo.aM.method_22683() == null) {
            return;
        }
        long l3 = lo.aM.method_22683().method_4490();
        if (l3 == 0L) {
            return;
        }
        if (!this.a) {
            this.c = GLFW.glfwSetScrollCallback((long)l3, null);
            gLFWScrollCallback = GLFWScrollCallback.create((l2, d2, d3) -> {
                hD hD2 = aW2.a(d2, d3);
                if (!hD2.a() && this.c != null) {
                    this.c.invoke(l2, d2, d3);
                }
            });
            GLFW.glfwSetScrollCallback((long)l3, (GLFWScrollCallbackI)gLFWScrollCallback);
            this.a = true;
        }
        if (!this.b) {
            this.d = GLFW.glfwSetMouseButtonCallback((long)l3, null);
            gLFWScrollCallback = GLFWMouseButtonCallback.create((l2, n2, n3, n4) -> {
                aS aS2 = aW2.a(n2, n3, n4);
                if (!aS2.c() && this.d != null) {
                    this.d.invoke(l2, n2, n3, n4);
                }
            });
            GLFW.glfwSetMouseButtonCallback((long)l3, (GLFWMouseButtonCallbackI)gLFWScrollCallback);
            this.b = true;
        }
    }
}

