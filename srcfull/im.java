/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class im {
    private static final float a = 0.016666668f;
    private static final float b = 0.1f;
    private static final float c = -1.0f;
    private static final double d = -0.6931471805599453;
    private long e = -1L;

    public static float b(float f2, float f3, float f4, float f5) {
        if (f4 < 0.0f) {
            return f2;
        }
        float f6 = f5;
        float f7 = f3;
        float f8 = f2;
        float f9 = f4;
        return im.a(f8, f9, f7, f6);
    }

    public static float b() {
        return -1.0f;
    }

    public void a() {
        this.e = -1L;
    }

    public float a() {
        long l2 = System.nanoTime();
        if (this.e < 0L) {
            this.e = l2;
            return 0.016666668f;
        }
        float f2 = (float)((double)(l2 - this.e) / 1.0E9);
        this.e = l2;
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return Math.min(f2, 0.1f);
    }

    public static float a(float f2, float f3, float f4, float f5) {
        if (f5 <= 0.0f) {
            return f2;
        }
        float f6 = f2 - f3;
        if (Math.abs(f6) < 0.01f) {
            return f2;
        }
        float f7 = (float)Math.exp(-0.6931471805599453 * (double)f4 / (double)f5);
        return f2 - f6 * f7;
    }
}

