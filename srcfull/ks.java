/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ks {
    private final bC a;
    private final bC b;
    private final bo c;
    private boolean d;

    public ks(int n2, int n3, float f2) {
        this.a = new bC(n2, 0.22f);
        this.b = new bC(n3, 0.22f);
        this.c = jm.b(f2, 0.15f);
    }

    public int b() {
        return this.b.b();
    }

    public float a() {
        return this.c.b();
    }

    public int a() {
        return this.a.b();
    }

    public void a(int n2, int n3, float f2) {
        if (!this.d) {
            this.a.a(n3);
            this.b.a(n2);
            this.c.b(f2);
            this.d = true;
        } else {
            this.a.b(n3);
            this.b.b(n2);
            this.c.c(f2);
        }
        this.a.a();
        this.b.a();
        this.c.a();
    }
}

