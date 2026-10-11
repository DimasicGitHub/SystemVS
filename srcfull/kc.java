/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.systems.RenderSystem;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class kc
extends gh {
    private static final float x = 0.38f;
    private static final float y = 0.26f;
    protected final bo z = new bo(0.0f, 0.38f).a(D::g);
    private boolean A;
    private boolean B = true;
    private boolean C = true;
    private boolean D;
    private jZ E;

    protected abstract void e(float var1, float var2, float var3, Matrix4f var4);

    public float e() {
        return 8.0f;
    }

    public void i() {
        this.A = false;
        this.D = true;
        this.j();
        this.z.c(1.0f);
    }

    public boolean b() {
        return this.D;
    }

    public void b(boolean bl2) {
        this.B = bl2;
    }

    public void b(jZ jZ2) {
        this.E = jZ2;
        this.g();
        this.i();
    }

    @Override
    public boolean b(int n2, double d2, double d3) {
        if (this.A) {
            return true;
        }
        this.g();
        if (n2 == 0 && this.B && !this.d(d2, d3)) {
            this.n();
            return true;
        }
        int n3 = n2;
        double d4 = d3;
        double d5 = d2;
        return this.a(n3, d5, d4);
    }

    protected boolean c(int n2, int n3, int n4) {
        return false;
    }

    public boolean c() {
        return this.z.b() > 0.001f || this.z.c() > 0.001f;
    }

    @Override
    public final void c(float f2, float f3, float f4, Matrix4f matrix4f) {
    }

    public float c() {
        return this.z.b();
    }

    public void n() {
        if (this.A) {
            return;
        }
        this.A = true;
        this.m();
        this.z.c(0.0f);
        this.o();
    }

    public void h() {
        this.A = false;
        this.D = false;
        this.j();
        this.z.c(1.0f);
        ih.a(this);
    }

    public float f() {
        return jm.b(this.z.b());
    }

    protected final boolean d() {
        return this.A;
    }

    public float d() {
        return this.z.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void d(float f2, float f3, float f4, Matrix4f matrix4f) {
        float f5 = this.z.a();
        if (f5 <= 0.001f) {
            if (this.A) {
                this.p();
                this.E = null;
                if (!this.D) {
                    ih.b(this);
                }
            }
            return;
        }
        this.g();
        RenderSystem.disableDepthTest();
        try {
            float f6 = f4 * f5;
            float f7 = f2;
            float f8 = f3;
            Matrix4f matrix4f2 = matrix4f;
            this.e(f7, f6, f8, matrix4f2);
        }
        finally {
            RenderSystem.enableDepthTest();
        }
    }

    protected void d(boolean bl2) {
        this.C = bl2;
    }

    protected boolean a(int n2, double d2, double d3) {
        return false;
    }

    @Override
    public boolean a(int n2, int n3, int n4) {
        if (this.C && n4 == 256) {
            this.n();
            return true;
        }
        int n5 = n3;
        int n6 = n2;
        int n7 = n4;
        return this.c(n5, n6, n7);
    }

    public void a(jZ jZ2) {
        this.E = jZ2;
        this.g();
        this.h();
    }

    protected void a(boolean bl2) {
        this.B = bl2;
    }

    private void m() {
        this.z.a(0.26f);
        this.z.a(D::b);
    }

    protected void o() {
    }

    protected void p() {
    }

    @Override
    public void k() {
        this.A = false;
        this.z.b(0.0f);
    }

    protected final void g() {
        if (this.E == null) {
            return;
        }
        float[] fArray = this.E.get();
        if (fArray == null || fArray.length < 2) {
            return;
        }
        this.a = fArray[0];
        this.b = fArray[1];
    }

    public float g() {
        return jm.c(this.z.b());
    }

    private void j() {
        this.z.a(0.38f);
        this.z.a(D::g);
    }
}

