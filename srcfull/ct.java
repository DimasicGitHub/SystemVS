/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_332;
import net.minecraft.class_6880;
import org.joml.Matrix4f;

public sealed interface ct
permits dG, iq, ef {
    public static ct of(kD kD2) {
        return new iq(kD2);
    }

    public static ct of(class_6880 class_68802) {
        return new ef(class_68802);
    }

    public static ct of(class_1792 class_17922) {
        return new dG(new class_1799((class_1935)class_17922));
    }

    public static ct of(class_1799 class_17992) {
        return new dG(class_17992 == null || class_17992.method_7960() ? new class_1799((class_1935)class_1802.field_8407) : class_17992);
    }

    public void draw(float var1, float var2, float var3, Matrix4f var4, float var5, class_332 var6);
}

