/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_4588;
import org.joml.Matrix4f;

public class eb {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;

    public eb(kz kz2, float f2, float f3) {
        this.e = kz2.a();
        jN jN2 = kz2.b();
        if (jN2 != null) {
            this.a = jN2.a() / f2;
            this.b = jN2.c() / f2;
            this.c = 1.0f - jN2.b() / f3;
            this.d = 1.0f - jN2.d() / f3;
        } else {
            this.d = 0.0f;
            this.c = 0.0f;
            this.b = 0.0f;
            this.a = 0.0f;
        }
        jN jN3 = kz2.a();
        if (jN3 != null) {
            this.g = jN3.c() - jN3.a();
            this.h = jN3.b() - jN3.d();
            this.f = jN3.b();
        } else {
            this.f = 0.0f;
            this.h = 0.0f;
            this.g = 0.0f;
        }
    }

    public float a(class_4588 class_45882, float f2, Matrix4f matrix4f, float f3, float f4, float f5) {
        if (kT.a()) {
            return 1.0f;
        }
        float f6 = this.g * f4;
        float f7 = this.h * f4;
        class_45882.method_22918(matrix4f, f2, f5 -= this.f * f4, f3).method_22913(this.a, this.c);
        class_45882.method_22918(matrix4f, f2, f5 + f7, f3).method_22913(this.a, this.d);
        class_45882.method_22918(matrix4f, f2 + f6, f5 + f7, f3).method_22913(this.b, this.d);
        class_45882.method_22918(matrix4f, f2 + f6, f5, f3).method_22913(this.b, this.c);
        return this.e * f4;
    }

    public float a(float f2) {
        return this.e * f2;
    }
}

