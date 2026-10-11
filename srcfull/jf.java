/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class jf {
    private static final float a = 14.0f;
    private static final float b = 0.001f;
    private static final float c = 0.05f;
    private static final Function<Float, Float> d = f2 -> {
        float f3 = 1.0f - f2.floatValue();
        return Float.valueOf(1.0f - f3 * f3 * f3);
    };
    private final float e;
    private float f;
    private boolean g;
    private float h;
    private Function<Float, Float> i = d;
    private boolean j;
    private boolean k;
    private float l;
    private float m;

    public jf(float f2) {
        this.e = f2;
    }

    public void b(float f2) {
        this.l = f2;
        this.m = f2;
        this.k = true;
    }

    public boolean b() {
        return this.g;
    }

    public float b() {
        return this.f;
    }

    public void b() {
        this.f = 0.0f;
        this.g = false;
    }

    public void c(float f2) {
        float f3 = this.a(f2);
        float f4 = this.f = this.g ? Math.min(1.0f, this.f + f3 * this.e) : Math.max(0.0f, this.f - f3 * this.e);
        if (this.j && this.k) {
            this.d(f2);
        }
    }

    public float c() {
        return this.l;
    }

    public float d() {
        return this.m;
    }

    private void d(float f2) {
        float f3 = this.m - this.l;
        if (Math.abs(f3) < 0.05f) {
            this.l = this.m;
        } else {
            float f4 = Math.min(1.0f, f2 * 14.0f);
            this.l += f3 * f4;
        }
    }

    public void a() {
        this.f = 1.0f;
        this.g = true;
    }

    public boolean a() {
        return !this.g && this.f <= 0.001f;
    }

    private float a(float f2) {
        if (this.h <= 0.0f) {
            return f2;
        }
        if (f2 >= this.h) {
            float f3 = f2 - this.h;
            this.h = 0.0f;
            return f3;
        }
        this.h -= f2;
        return 0.0f;
    }

    public void a(float f2) {
        this.m = f2;
        if (!this.k) {
            this.l = f2;
            this.k = true;
        }
    }

    public void a(float f2, boolean bl2) {
        if (this.g == bl2) {
            return;
        }
        this.g = bl2;
        this.h = Math.max(0.0f, f2);
    }

    public void a(boolean bl2) {
        if (this.g == bl2) {
            return;
        }
        this.g = bl2;
        this.h = 0.0f;
    }

    public jf a(Function function) {
        this.i = function;
        return this;
    }

    public jf a() {
        this.j = true;
        return this;
    }

    public float a() {
        return this.i.apply(Float.valueOf(Math.clamp((float)this.f, (float)0.0f, (float)1.0f))).floatValue();
    }
}

