/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class jm {
    public static final float a = 0.15f;
    public static final float b = 0.22f;
    public static final float c = 0.32f;
    public static final float d = 0.28f;
    public static final float e = 16.0f;
    public static final float f = 0.92f;
    public static final float g = 1.7f;

    private jm() {
    }

    public static bo b(float f2, float f3) {
        return new bo(f2, f3).a(D::f);
    }

    public static float b(float f2) {
        return 16.0f * (1.0f - Math.clamp((float)f2, (float)0.0f, (float)1.0f));
    }

    public static float c(float f2) {
        return 0.92f + 0.07999998f * Math.clamp((float)f2, (float)0.0f, (float)1.0f);
    }

    public static bo a(float f2, float f3) {
        return new bo(f2, f3).a(D::b);
    }

    public static bo a(float f2) {
        return new bo(f2, 0.22f).a(D::b);
    }

    public static float a(float f2, float f3, float f4) {
        return f4 + (f2 - f4) * f3;
    }

    public static bo a() {
        return new bo(0.0f, 0.15f).a(D::b);
    }

    public static Matrix4f a(Matrix4f matrix4f, float f2, float f3, float f4) {
        float f5 = jm.c(f2);
        return new Matrix4f((Matrix4fc)matrix4f).translate(f3, f4, 0.0f).scale(f5, f5, 1.0f).translate(-f3, -f4, 0.0f);
    }

    public static float a(float f2) {
        float f3 = Math.clamp((float)f2, (float)0.0f, (float)1.0f);
        return (float)Math.pow(f3, 1.7f);
    }
}

