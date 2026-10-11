/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_332;
import org.joml.Matrix4f;

public record iq(kD a) implements ct
{
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{iq.class, "icon", "a"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{iq.class, "icon", "a"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{iq.class, "icon", "a"}, this);
    }

    @Override
    public void draw(float f2, float f3, float f4, Matrix4f matrix4f, float f5, class_332 class_3322) {
        if (this.a == null) {
            return;
        }
        float f6 = Math.min(f5 / this.a.getWidth(), f5 / this.a.getHeight());
        float f7 = this.a.getWidth() * f6;
        float f8 = this.a.getHeight() * f6;
        float f9 = f3 + (f5 - f7) / 2.0f;
        float f10 = f2 + (f5 - f8) / 2.0f;
        float f11 = f4;
        int n2 = gD.foreground();
        float f12 = f8;
        float f13 = f7;
        float f14 = f10;
        float f15 = f9;
        kD kD2 = this.a;
        Matrix4f matrix4f2 = matrix4f;
        jr.a(f11, n2, matrix4f2, f14, kD2, f12, f15, f13);
    }
}

