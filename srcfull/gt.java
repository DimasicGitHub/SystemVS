/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class gt
extends lA {
    private static final float k = 16.0f;
    private static final float l = 10.0f;
    private bu m;
    private boolean n;
    private Runnable o;
    private int p = -1;
    private final bo q = jm.a(0.0f, 0.15f);

    public gt(bu bu2) {
        this.m = bu2;
        this.d = 20.0f;
    }

    @Override
    public boolean b(int n2, double d2, double d3) {
        if (this.n) {
            if (n2 == 0 && this.d(d2, d3)) {
                this.n = false;
                this.p = -1;
                return true;
            }
            this.m.a(n2);
            this.n = false;
            this.p = -1;
            if (this.o != null) {
                this.o.run();
            }
            return true;
        }
        int n3 = n2;
        double d4 = d3;
        double d5 = d2;
        return super.b(n3, d5, d4);
    }

    private boolean b() {
        if (this.n) {
            return false;
        }
        String string = this.m.a();
        return string != null && !string.isEmpty() && !string.equals("None");
    }

    @Override
    public boolean b(int n2, int n3, int n4) {
        if (!this.n) {
            return false;
        }
        if (this.p == -1) {
            return false;
        }
        if (n2 == this.p) {
            this.m.a(this.p, 0);
            this.n = false;
            this.p = -1;
            if (this.o != null) {
                this.o.run();
            }
            return true;
        }
        return false;
    }

    public boolean c() {
        return this.n;
    }

    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        float f5;
        String string = this.a();
        this.c = this.a();
        this.c(f4, f3);
        this.q.c(this.n ? 1.0f : 0.0f);
        float f6 = f5 = this.q.a();
        int n2 = gD.primary();
        int n3 = gD.elevated();
        int n4 = bC.a(n2, f6, n3);
        float f7 = f5;
        int n5 = gD.background();
        int n6 = gD.foreground();
        int n7 = bC.a(n5, f7, n6);
        float f8 = f5;
        int n8 = gD.background();
        int n9 = gD.mutedFg();
        int n10 = bC.a(n8, f8, n9);
        float f9 = f2;
        int n11 = n4;
        float f10 = 4.0f;
        float f11 = this.d;
        float f12 = this.c;
        float f13 = this.b;
        float f14 = this.a;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f10, f14, n11, matrix4f2, f11, f12, f9, f13);
        float f15 = this.a + 4.0f;
        float f16 = this.b + (this.d - 10.0f) / 2.0f;
        float f17 = f2;
        int n12 = n7;
        float f18 = 10.0f;
        float f19 = 16.0f;
        float f20 = f16;
        float f21 = f15;
        kD kD2 = kD.KEYBOARD;
        Matrix4f matrix4f3 = matrix4f;
        jr.a(f17, n12, matrix4f3, f20, kD2, f18, f21, f19);
        float f22 = f15 + 16.0f + 4.0f;
        float f23 = this.b + (this.d - 12.0f) / 2.0f;
        ao.a(matrix4f, string, f22, f23, 12.0f, n10, f2);
    }

    private String a() {
        if (this.n) {
            return "...";
        }
        String string = this.m.a();
        return string == null || string.isEmpty() ? "None" : string;
    }

    public void a(Runnable runnable) {
        this.o = runnable;
    }

    public void a(bu bu2) {
        this.m = bu2;
    }

    @Override
    protected boolean a(double d2, double d3) {
        this.n = !this.n;
        this.p = -1;
        return true;
    }

    @Override
    public boolean a(int n2, int n3, int n4) {
        if (!this.n) {
            if (n4 == 261 && this.e && this.a()) {
                this.m.a(-1);
                if (this.o != null) {
                    this.o.run();
                }
                return true;
            }
            return false;
        }
        if (n4 == 256 || n4 == 261) {
            this.m.a(-1);
            this.n = false;
            this.p = -1;
            if (this.o != null) {
                this.o.run();
            }
            return true;
        }
        if (bu.a(n4)) {
            this.p = n4;
            return true;
        }
        this.m.a(n4, n3);
        this.n = false;
        this.p = -1;
        if (this.o != null) {
            this.o.run();
        }
        return true;
    }

    private boolean a() {
        String string = this.m.a();
        return string != null && !string.isEmpty() && !string.equals("None");
    }

    public float a() {
        float f2 = 20.0f + ao.a(this.a(), 12.0f);
        if (this.b()) {
            return 4.0f + f2 + 4.0f;
        }
        return 8.0f + Math.max(f2, 51.0f);
    }
}

