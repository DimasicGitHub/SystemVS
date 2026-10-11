/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class jk<M extends kc>
extends cA {
    private static final float k = 32.0f;
    private static final float l = 8.0f;
    private static final float m = 12.0f;
    private static final float n = 12.0f;
    private static final float o = 12.0f;
    private static final float p = 0.85f;
    protected final M q;
    private final bo r = jm.a();

    protected jk(fa fa2, kc kc2) {
        super(fa2);
        this.q = kc2;
    }

    @Override
    public void b() {
        if (this.d() && ((kc)this.q).c()) {
            ((kc)this.q).n();
        }
    }

    @Override
    public boolean b(int n2, double d2, double d3) {
        double d4;
        double d5;
        if (this.d() && ((kc)this.q).c()) {
            int n3 = n2;
            double d6 = d3;
            double d7 = d2;
            ((kc)this.q).b(n3, d7, d6);
            return true;
        }
        if (n2 != 0) {
            return false;
        }
        float f2 = 32.0f;
        float f3 = this.c;
        float f4 = this.a;
        float f5 = this.a();
        if (!jk.a(f4, f5, d5 = d3, f2, f3, d4 = d2)) {
            return false;
        }
        this.a(() -> new float[]{this.c(((gh)this.q).q()), this.a() + 16.0f - ((gh)this.q).r() / 2.0f});
        return true;
    }

    protected abstract kD b();

    @Override
    public boolean c() {
        return this.d() && ((kc)this.q).c();
    }

    protected final float c(float f2) {
        boolean bl2;
        boolean bl3;
        float f3 = fk.a().a();
        float f4 = 28.0f;
        float f5 = this.a + this.c + f4;
        float f6 = this.a - f4 - f2;
        boolean bl4 = bl3 = f5 + f2 + 8.0f <= f3;
        if (bl3) {
            return f5;
        }
        boolean bl5 = bl2 = f6 >= 8.0f;
        if (bl2) {
            return f6;
        }
        return Math.max(8.0f, f3 - f2 - 8.0f);
    }

    @Override
    public boolean c(double d2, double d3) {
        if (!this.d() || !((kc)this.q).c()) {
            return false;
        }
        float f2 = ((gh)this.q).r();
        float f3 = ((gh)this.q).q();
        float f4 = ((gh)this.q).p();
        float f5 = ((gh)this.q).o();
        double d4 = d2;
        double d5 = d3;
        return jk.a(f5, f4, d4, f2, f3, d5);
    }

    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        double d2;
        float f5;
        float f6;
        double d3;
        float f7;
        float f8;
        float f9 = this.a;
        Matrix4f matrix4f2 = matrix4f;
        float f10 = f2;
        float f11 = this.c;
        Matrix4f matrix4f3 = matrix4f;
        float f12 = f2;
        float f13 = this.a(f11, matrix4f3, f12);
        float f14 = f13;
        float f15 = this.a(matrix4f2, f10, f14, f8 = this.c);
        float f16 = f15;
        float f17 = this.b(f16, f7 = f13);
        float f18 = f17;
        boolean bl2 = jk.a(f9, f18, d3 = (double)f3, f6 = 32.0f, f5 = this.c, d2 = (double)f4);
        this.r.c(bl2 ? 1.0f : 0.0f);
        float f19 = this.r.a();
        float f20 = 0.85f;
        int n2 = gD.elevated();
        int n3 = gD.background();
        int n4 = bC.a(n2, f20, n3);
        float f21 = f19;
        int n5 = n4;
        int n6 = gD.background();
        int n7 = bC.a(n5, f21, n6);
        int n8 = gD.foreground();
        float f22 = f2;
        float f23 = 1.0f;
        float f24 = 1.0f;
        float f25 = 0.0f;
        int n9 = 0x1A000000;
        float f26 = 1.0f;
        int n10 = gD.border();
        int n11 = n7;
        float f27 = 8.0f;
        float f28 = 8.0f;
        float f29 = 8.0f;
        float f30 = 8.0f;
        float f31 = 32.0f;
        float f32 = this.c;
        float f33 = f17;
        float f34 = this.a;
        Matrix4f matrix4f4 = matrix4f;
        dP.a(f32, n9, n11, f34, f33, f23, f30, f31, f24, matrix4f4, f22, n10, f28, f26, f29, f27, f25);
        String string = this.a();
        float f35 = ao.a(string, 14.0f);
        float f36 = 8.0f;
        float f37 = 12.0f + f36 + f35;
        float f38 = this.a + (this.c - f37) / 2.0f;
        float f39 = f17 + 10.0f;
        float f40 = f17 + 9.0f;
        float f41 = f2;
        int n12 = n8;
        float f42 = 12.0f;
        float f43 = 12.0f;
        float f44 = f39;
        float f45 = f38;
        kD kD2 = this.b();
        Matrix4f matrix4f5 = matrix4f;
        jr.a(f41, n12, matrix4f5, f44, kD2, f42, f45, f43);
        float f46 = f2;
        int n13 = n8;
        float f47 = 14.0f;
        float f48 = f40;
        float f49 = f38 + 12.0f + f36;
        String string2 = string;
        Matrix4f matrix4f6 = matrix4f;
        ao.a(f48, f49, n13, f47, f46, string2, matrix4f6);
        this.d = f17 + 32.0f - this.b;
    }

    @Override
    public float f() {
        return this.a(this.a(this.c), this.b(this.c)) + 8.0f + 32.0f;
    }

    protected boolean d() {
        return false;
    }

    @Override
    public void d(float f2, float f3, float f4, Matrix4f matrix4f) {
        if (this.d() && ((kc)this.q).c()) {
            float f5 = f4;
            float f6 = f2;
            float f7 = f3;
            Matrix4f matrix4f2 = matrix4f;
            ((kc)this.q).d(f6, f7, f5, matrix4f2);
        }
    }

    protected abstract String a();

    @Override
    public boolean a(int n2, char c2) {
        if (this.d() && ((kc)this.q).c()) {
            int n3 = n2;
            char c3 = c2;
            ((gh)this.q).a(n3, c3);
            return true;
        }
        return false;
    }

    @Override
    public boolean a(int n2, int n3, int n4) {
        if (this.d() && ((kc)this.q).c()) {
            int n5 = n3;
            int n6 = n2;
            int n7 = n4;
            ((kc)this.q).a(n6, n5, n7);
            return true;
        }
        return false;
    }

    protected final float a() {
        float f2 = this.b(this.c);
        float f3 = this.a(this.c);
        return this.b(f2, f3);
    }

    protected abstract void a(jZ var1);

    @Override
    public boolean a(double d2, double d3, int n2) {
        if (this.d() && ((kc)this.q).c()) {
            ((gh)this.q).a(d2, d3, n2);
            return true;
        }
        return false;
    }

    @Override
    public boolean a(double d2, double d3, int n2, double d4, double d5) {
        if (this.d() && ((kc)this.q).c()) {
            double d6 = d5;
            double d7 = d4;
            int n3 = n2;
            double d8 = d2;
            double d9 = d3;
            ((gh)this.q).a(d8, d9, n3, d7, d6);
            return true;
        }
        return false;
    }

    @Override
    public boolean a(double d2, double d3, double d4) {
        if (this.d() && ((kc)this.q).c()) {
            double d5 = d2;
            double d6 = d4;
            double d7 = d3;
            ((gh)this.q).a(d5, d7, d6);
            return true;
        }
        return false;
    }

    @Override
    public void k() {
        if (this.d() && ((kc)this.q).c()) {
            ((kc)this.q).n();
        }
    }
}

