/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1268;
import net.minecraft.class_243;
import net.minecraft.class_2824;
import org.lwjgl.glfw.GLFW;

class am
implements class_2824.class_5908 {
    final /* synthetic */ bR a;

    /* synthetic */ am(bR bR2) {
        this.a = bR2;
    }

    public /* bridge */ /* synthetic */ void method_34219(class_1268 class_12682) {
    }

    public /* bridge */ /* synthetic */ void method_34220(class_1268 class_12682, class_243 class_2432) {
    }

    public /* bridge */ /* synthetic */ void method_34218() {
        if (!this.a.b.a() && !this.a.b().method_24828()) {
            return;
        }
        if (GLFW.glfwGetKey((long)lo.aM.method_22683().method_4490(), (int)32) == 1 && !this.a.b.a()) {
            return;
        }
        if (this.a.e > 0) {
            return;
        }
        if (bR.a((bR)this.a).field_1894.method_1434() && this.a.b().method_5624()) {
            this.a.c = true;
        }
    }
}

