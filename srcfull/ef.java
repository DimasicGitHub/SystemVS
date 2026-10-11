/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_1058;
import net.minecraft.class_1291;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_6880;
import org.joml.Matrix4f;

public final class ef
extends Record
implements ct {
    private final class_6880<class_1291> a;

    public ef(class_6880 class_68802) {
        this.a = class_68802;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ef.class, "effect", "a"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ef.class, "effect", "a"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ef.class, "effect", "a"}, this);
    }

    public class_6880 a() {
        return this.a;
    }

    @Override
    public void draw(float f2, float f3, float f4, Matrix4f matrix4f, float f5, class_332 class_3322) {
        if (this.a == null) {
            return;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102 == null) {
            return;
        }
        class_1058 class_10582 = class_3102.method_18505().method_18663(this.a);
        if (class_10582 == null) {
            return;
        }
        float f6 = f4;
        int n2 = -1;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = class_10582.method_4575();
        float f12 = class_10582.method_4577();
        float f13 = class_10582.method_4593();
        float f14 = class_10582.method_4594();
        float f15 = f5;
        float f16 = f5;
        float f17 = f2;
        float f18 = f3;
        class_2960 class_29602 = class_10582.method_45852();
        Matrix4f matrix4f2 = matrix4f;
        iQ.a(f18, f16, f12, f15, f11, f7, n2, f17, f8, matrix4f2, class_29602, f10, f14, f13, f6, f9);
    }
}

