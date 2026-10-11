/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;

final class et
extends jJ {
    final lw a;
    private final ft b;
    private ks c;
    final /* synthetic */ gf d;

    et(gf gf2, lw lw2) {
        this.d = gf2;
        super(lw2);
        this.a = lw2;
        this.b = new ft(lw2);
    }

    @Override
    boolean a(double d2, double d3, int n2, float f2, float f3, float f4) {
        if (n2 != 0) {
            return false;
        }
        if (d3 < (double)f3 || d3 > (double)(f3 + 26.0f)) {
            return false;
        }
        float f5 = f4 + f2 - 8.0f - 14.0f;
        if (d2 >= (double)(f5 - 4.0f) && d2 <= (double)(f5 + 14.0f + 4.0f)) {
            this.b.a(() -> new float[]{gf.d(this.d) + gf.e(this.d) + 8.0f, gf.f(this.d)});
            return true;
        }
        return false;
    }

    @Override
    void a(float f2, float f3, float f4, float f5, float f6, Matrix4f matrix4f, float f7) {
        String string = String.format("#%06X", this.a.a() & 0xFFFFFF);
        float f8 = ao.a(string, 12.0f);
        float f9 = Math.max(56.0f, f8 + 8.0f);
        float f10 = f5 + f6 - 8.0f - 14.0f;
        float f11 = f10 - 8.0f - f9;
        float f12 = f7 + 4.0f;
        int n2 = 0xFF000000 | this.a.a() & 0xFFFFFF;
        int n3 = cv.a(n2);
        if (this.c == null) {
            this.c = new ks(n3, n2, f9);
        }
        float f13 = f9;
        int n4 = n2;
        int n5 = n3;
        this.c.a(n4, n5, f13);
        float f14 = f2;
        int n6 = this.c.a();
        float f15 = 4.0f;
        float f16 = 18.0f;
        float f17 = this.c.a();
        float f18 = f12;
        float f19 = f11;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f15, f19, n6, matrix4f2, f16, f17, f14, f18);
        float f20 = f2;
        int n7 = this.c.b();
        float f21 = 12.0f;
        float f22 = f12 + 3.0f;
        float f23 = f11 + (this.c.a() - f8) / 2.0f;
        String string2 = string;
        Matrix4f matrix4f3 = matrix4f;
        ao.a(f22, f23, n7, f21, f20, string2, matrix4f3);
        float f24 = f2;
        int n8 = gD.foreground();
        float f25 = 13.0f;
        float f26 = 14.0f;
        float f27 = f7 + 6.5f;
        float f28 = f10;
        kD kD2 = kD.BRUSH;
        Matrix4f matrix4f4 = matrix4f;
        jr.a(f24, n8, matrix4f4, f27, kD2, f25, f28, f26);
    }

    float a(float f2, float f3) {
        String string = String.format("#%06X", this.a.a() & 0xFFFFFF);
        float f4 = ao.a(string, 12.0f);
        float f5 = Math.max(56.0f, f4 + 8.0f);
        float f6 = f2 + f3 - 8.0f - 14.0f;
        return f6 - 8.0f - f5;
    }
}

