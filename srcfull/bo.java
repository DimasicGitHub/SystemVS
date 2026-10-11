/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public final class bo {
    private static final double a = 1.0E9;
    private float b;
    private float c;
    private float d;
    private float e;
    private Function<Float, Float> f = D::b;
    private long g;
    private boolean h;

    public bo(float f2, float f3) {
        this.b = f2;
        this.c = f2;
        this.d = f2;
        this.e = f3;
        this.g = System.nanoTime();
    }

    public void b(float f2) {
        this.b = f2;
        this.c = f2;
        this.d = f2;
        this.h = false;
    }

    public float b() {
        return this.c;
    }

    public float c() {
        return this.d;
    }

    public void c(float f2) {
        if (this.d == f2) {
            return;
        }
        this.b = this.c;
        this.d = f2;
        this.g = System.nanoTime();
        this.h = true;
    }

    public bo a(Function function) {
        this.f = function;
        return this;
    }

    public void a(float f2) {
        this.e = f2;
    }

    public float a() {
        if (!this.h || this.e <= 0.0f) {
            this.c = this.d;
            this.h = false;
            return this.c;
        }
        float f2 = (float)((double)(System.nanoTime() - this.g) / 1.0E9);
        float f3 = f2 / this.e;
        if (f3 <= 0.0f) {
            this.c = this.b;
        } else if (f3 >= 1.0f) {
            this.c = this.d;
            this.h = false;
        } else {
            float f4 = this.f.apply(Float.valueOf(f3)).floatValue();
            this.c = this.b + (this.d - this.b) * f4;
        }
        return this.c;
    }

    public void a(float f2, float f3) {
        if (this.d == f3) {
            return;
        }
        this.b = this.c;
        this.d = f3;
        this.g = System.nanoTime() + (long)((double)f2 * 1.0E9);
        this.h = true;
    }
}

