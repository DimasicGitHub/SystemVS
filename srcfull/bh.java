/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bh {
    private float a;
    private float b;
    private float c;
    private float d;
    private boolean e;

    public bh(float f2, float f3, boolean bl2) {
        this.a(f2, f3, bl2);
    }

    public float b() {
        return this.b;
    }

    public void b(float f2) {
        this.b = f2;
    }

    public boolean b() {
        return this.e;
    }

    public float c() {
        return this.c;
    }

    public float d() {
        return this.d;
    }

    public void a(boolean bl2) {
        this.e = bl2;
    }

    public bh a(float f2, float f3, boolean bl2) {
        this.a = f2;
        this.b = f3;
        this.c = f2;
        this.d = f3;
        this.e = bl2;
        return this;
    }

    public void a(float f2) {
        this.a = f2;
    }

    public boolean a() {
        return this.a != this.c || this.b != this.d;
    }

    public float a() {
        return this.a;
    }
}

