/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class gh
implements fU,
gD {
    protected float a;
    protected float b;
    protected float c;
    public float d;
    protected boolean e;
    protected final bo f = jm.a();
    protected boolean g = true;
    private bo h;
    private bo i;
    private boolean j;

    protected final void e(float f2, float f3) {
        if (this.h == null) {
            this.h = jm.b(0.0f, 0.32f);
            this.i = jm.b(0.0f, 0.32f);
        }
        this.h.b(f2);
        this.i.b(f3);
        this.a = f2;
        this.b = f3;
        this.j = true;
    }

    public boolean e() {
        return this.e;
    }

    public boolean b(int n2, int n3, int n4) {
        return false;
    }

    public boolean b(int n2, double d2, double d3) {
        return false;
    }

    public void c(boolean bl2) {
        this.g = bl2;
    }

    protected float c(float f2, float f3) {
        this.e = this.d((double)f2, (double)f3) && !ih.b();
        this.f.c(this.e ? 1.0f : 0.0f);
        return this.f.a();
    }

    public void c(float f2, float f3) {
        this.a = f3;
        this.b = f2;
    }

    public void c(float f2) {
        this.c = f2;
    }

    public abstract void c(float var1, float var2, float var3, Matrix4f var4);

    public boolean f() {
        return this.g;
    }

    protected final void l() {
        if (this.j && this.h != null) {
            this.a = this.h.a();
            this.b = this.i.a();
        }
    }

    protected final void d(float f2, float f3) {
        if (this.h == null) {
            this.h = jm.b(0.0f, 0.32f);
            this.i = jm.b(0.0f, 0.32f);
        }
        if (!this.j) {
            this.h.b(f2);
            this.i.b(f3);
            this.a = f2;
            this.b = f3;
            this.j = true;
        } else {
            this.h.c(f2);
            this.i.c(f3);
        }
    }

    public void d(float f2) {
        this.d = f2;
    }

    protected boolean d(double d2, double d3) {
        float f2 = this.d;
        float f3 = this.c;
        float f4 = this.b;
        float f5 = this.a;
        double d4 = d3;
        double d5 = d2;
        return gh.a(f5, f4, d4, f2, f3, d5);
    }

    public void d(float f2, float f3, float f4, Matrix4f matrix4f) {
    }

    public boolean a(int n2, int n3, int n4) {
        return false;
    }

    public boolean a(double d2, double d3, double d4) {
        return false;
    }

    public static boolean a(float f2, float f3, double d2, float f4, float f5, double d3) {
        return d3 >= (double)f2 && d3 <= (double)(f2 + f5) && d2 >= (double)f3 && d2 <= (double)(f3 + f4);
    }

    public boolean a(int n2, char c2) {
        return false;
    }

    public boolean a(double d2, double d3, int n2, double d4, double d5) {
        return false;
    }

    public boolean a(double d2, double d3, int n2) {
        return false;
    }

    public float o() {
        return this.a;
    }

    public float p() {
        return this.b;
    }

    public void k() {
    }

    public float q() {
        return this.c;
    }

    public float r() {
        return this.d;
    }
}

