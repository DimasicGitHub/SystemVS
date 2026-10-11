/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public final class ca {
    private ca() {
    }

    public static Matrix4f a(float f2, float f3, float f4, float f5, class_4587 class_45872) {
        float f6 = f4;
        float f7 = 0.0f;
        float f8 = f2;
        float f9 = f2;
        float f10 = f5;
        float f11 = f3;
        class_4587 class_45873 = class_45872;
        return ca.a(f10, f7, f9, f6, class_45873, f11, f8);
    }

    public static Matrix4f a(float f2, float f3, float f4, float f5, class_4587 class_45872, float f6) {
        float f7 = f5;
        float f8 = 0.0f;
        float f9 = f3;
        float f10 = f6;
        float f11 = f4;
        float f12 = f2;
        class_4587 class_45873 = class_45872;
        return ca.a(f11, f8, f10, f7, class_45873, f12, f9);
    }

    public static Matrix4f a(float f2, float f3, float f4, float f5, class_4587 class_45872, float f6, float f7) {
        class_45872.method_22903();
        class_45872.method_46416(f6 + f3, f2 + f5, 0.0f);
        class_45872.method_22905(f4, f7, 1.0f);
        class_45872.method_46416(-f6, -f2, 0.0f);
        return class_45872.method_23760().method_23761();
    }
}

