/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;

public class bg
extends lA {
    private kD k;
    private kD l;
    private boolean m;
    private final bo n = jm.a(0.0f, 0.15f);
    private Runnable o;
    private String p;

    public bg(kD kD2, float f2) {
        this.k = kD2;
        this.c = f2;
        this.d = f2;
    }

    public void b(kD kD2) {
        this.l = kD2;
    }

    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        float f5 = this.c(f4, f3);
        this.n.c(this.m ? 1.0f : 0.0f);
        float f6 = this.l != null ? this.n.a() : 0.0f;
        float f7 = Math.max(f5, f6);
        int n2 = gD.primary();
        int n3 = gD.foreground();
        int n4 = bC.a(n2, f7, n3);
        if (f6 < 0.999f) {
            float f8 = f2 * (1.0f - f6);
            int n5 = n4;
            float f9 = this.d;
            float f10 = this.c;
            float f11 = this.b;
            float f12 = this.a;
            kD kD2 = this.k;
            Matrix4f matrix4f2 = matrix4f;
            jr.a(f8, n5, matrix4f2, f11, kD2, f9, f12, f10);
        }
        if (f6 > 0.001f) {
            float f13 = f2 * f6;
            int n6 = n4;
            float f14 = this.d;
            float f15 = this.c;
            float f16 = this.b;
            float f17 = this.a;
            kD kD3 = this.l;
            Matrix4f matrix4f3 = matrix4f;
            jr.a(f13, n6, matrix4f3, f16, kD3, f14, f17, f15);
        }
        if (this.e && this.p != null) {
            float f18 = this.c;
            float f19 = this.b;
            float f20 = this.a;
            String string = this.p;
            fi.a(f20, f19, string, f18);
        }
    }

    public void a(boolean bl2) {
        this.m = bl2;
    }

    public void a(String string) {
        this.p = string;
    }

    public void a(Runnable runnable) {
        this.o = runnable;
    }

    public void a(kD kD2) {
        this.k = kD2;
    }

    @Override
    protected boolean a(double d2, double d3) {
        if (this.o != null) {
            this.o.run();
        }
        return true;
    }
}

