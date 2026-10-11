/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class cs
extends iC {
    @Override
    public final boolean b(int n2, double d2, double d3) {
        double d4;
        int n3;
        double d5;
        double d6;
        double d7;
        int n4;
        if (this.i()) {
            return false;
        }
        fs fs2 = this.a();
        if (fs2 != null && fs2.b(n4 = n2, d7 = d2, d6 = d3)) {
            this.f();
            return true;
        }
        fn fn2 = this.a();
        if (fn2 != null && fn2.a(d5 = d3, n3 = n2, d4 = d2)) {
            this.f();
            return true;
        }
        int n5 = n2;
        double d8 = d3;
        double d9 = d2;
        if (this.a(n5, d8, d9)) {
            return true;
        }
        this.f();
        return false;
    }

    protected abstract fn a();

    protected boolean a(int n2, double d2, double d3) {
        return false;
    }

    protected fs a() {
        return null;
    }
}

