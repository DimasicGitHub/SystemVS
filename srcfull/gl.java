/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class gl
extends cA {
    private static final float k = 0.32f;
    private static final float l = 0.3f;
    private static final float m = 10.0f;
    private static final float n = 26.0f;
    private static final float o = 4.0f;
    private static final float p = 4.0f;
    private static final float q = 12.0f;
    private static final float r = 8.0f;
    private static final int s = 5;
    private static final float t = 154.0f;
    private static final float u = 6.0f;
    private static final float v = 59.0f;
    private static final float w = 4.0f;
    private static final float x = 1.0f;
    private static final float y = 0.4f;
    private static final float z = 0.7f;
    private final jh A;
    private final fr B;
    private boolean C;
    private final bo D = new bo(0.0f, 0.32f).a(D::d);
    private boolean E;
    private final Map<Integer, bo> F = new HashMap<Integer, bo>();
    private final bo G = new bo(0.0f, 0.32f).a(D::f);
    private float H;
    private float I = Float.NaN;
    private boolean J;
    private float K;

    public gl(jh jh2) {
        super(jh2);
        this.A = jh2;
        this.B = null;
    }

    public gl(fr fr2) {
        super(fr2);
        this.A = null;
        this.B = fr2;
    }

    @Override
    public float i() {
        float f2 = this.a(this.a(this.c), this.b(this.c)) + 8.0f + 32.0f;
        if (!this.C) {
            return f2;
        }
        int n2 = this.a();
        if (n2 == 0) {
            return f2;
        }
        return f2 + 10.0f + this.b(n2);
    }

    private int b() {
        return this.A != null ? this.A.e() : this.B.b();
    }

    @Override
    private float b(int n2) {
        return Math.min(154.0f, this.a(n2));
    }

    private String b(int n2) {
        if (this.B == null || !this.B.b()) {
            return null;
        }
        String[] stringArray = this.a(n2);
        return stringArray.length == 0 ? null : an.a(ec.join(stringArray));
    }

    @Override
    public boolean b(int n2, double d2, double d3) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (n2 != 0) {
            return false;
        }
        float f6 = this.a();
        if (d2 >= (double)this.a && d2 <= (double)(this.a + this.c) && d3 >= (double)f6 && d3 <= (double)(f6 + 32.0f)) {
            boolean bl2 = this.C = !this.C;
            if (this.C) {
                this.H = 0.0f;
                this.G.b(0.0f);
                this.I = 0.0f;
            }
            return true;
        }
        if (!this.C) {
            return false;
        }
        int n3 = this.a();
        if (n3 == 0) {
            return false;
        }
        float f7 = f6 + 32.0f + 10.0f;
        float f8 = this.b(n3);
        if (!(d2 >= (double)this.a && d2 <= (double)(this.a + this.c) && d3 >= (double)f7 && d3 <= (double)(f7 + f8))) {
            return false;
        }
        boolean bl3 = this.b(n3);
        if (bl3) {
            f5 = this.a + this.c - 4.0f - 6.0f;
            f4 = f7 + 4.0f;
            f3 = f7 + f8 - 4.0f;
            float f9 = f3 - f4 - 59.0f;
            f2 = this.c(n3);
            float f10 = f4 + (f2 > 0.0f ? f9 * (this.G.b() / f2) : 0.0f);
            if (d2 >= (double)f5 && d2 <= (double)(f5 + 6.0f) && d3 >= (double)f10 && d3 <= (double)(f10 + 59.0f)) {
                this.J = true;
                this.K = (float)d3 - f10;
                return true;
            }
        }
        f5 = this.a + 4.0f;
        f4 = bl3 ? this.a + this.c - 4.0f - 6.0f - 4.0f : this.a + this.c - 4.0f;
        f3 = this.G.b();
        for (int i2 = 0; i2 < n3; ++i2) {
            f2 = f7 + 4.0f - f3 + (float)i2 * 30.0f;
            if (f2 + 26.0f < f7 || f2 > f7 + f8 || !(d2 >= (double)f5) || !(d2 <= (double)f4) || !(d3 >= (double)f2) || !(d3 <= (double)(f2 + 26.0f))) continue;
            this.a(i2);
            return true;
        }
        return true;
    }

    private void b(float f2, float f3, float f4, Matrix4f matrix4f, float f5, float f6) {
        float f7 = this.a + this.c - 4.0f - 6.0f;
        float f8 = f4 + 4.0f;
        float f9 = f4 + f2 - 4.0f;
        float f10 = f9 - f8 - 59.0f;
        float f11 = f8 + (f3 > 0.0f ? f10 * (f5 / f3) : 0.0f);
        float f12 = 3.0f;
        float f13 = f6;
        float f14 = 3.0f;
        float f15 = 1.0f;
        float f16 = 0.0f;
        int n2 = 0x1A000000;
        float f17 = 0.0f;
        int n3 = 0;
        int n4 = gD.surface();
        float f18 = f12;
        float f19 = f12;
        float f20 = f12;
        float f21 = f12;
        float f22 = 59.0f;
        float f23 = 6.0f;
        float f24 = f11;
        float f25 = f7;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f23, n2, n4, f25, f24, f14, f21, f22, f15, matrix4f2, f13, n3, f19, f17, f20, f18, f16);
    }

    private boolean b(int n2) {
        return n2 > 5;
    }

    @Override
    public void b() {
        this.C = false;
        this.J = false;
    }

    private float c(int n2) {
        return Math.max(0.0f, this.a(n2) - this.b(n2));
    }

    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        float f5;
        float f6 = f2;
        float f7 = this.c;
        Matrix4f matrix4f2 = matrix4f;
        float f8 = this.a(f7, matrix4f2, f6);
        float f9 = f2;
        float f10 = this.c;
        float f11 = f8;
        Matrix4f matrix4f3 = matrix4f;
        float f12 = f5 = this.a(matrix4f3, f9, f11, f10);
        float f13 = f8;
        float f14 = this.b(f12, f13);
        boolean bl2 = this.C;
        if (bl2 != this.E) {
            this.D.a(bl2 ? 0.32f : 0.3f);
            this.D.a(D::d);
            this.E = bl2;
        }
        this.D.c(bl2 ? 1.0f : 0.0f);
        float f15 = this.D.a();
        float f16 = f2;
        float f17 = 1.0f;
        float f18 = 1.0f;
        float f19 = 0.0f;
        int n2 = 0x1A000000;
        float f20 = 1.0f;
        int n3 = gD.border();
        int n4 = gD.background();
        float f21 = 8.0f;
        float f22 = 8.0f;
        float f23 = 8.0f;
        float f24 = 8.0f;
        float f25 = 32.0f;
        float f26 = this.c;
        float f27 = f14;
        float f28 = this.a;
        Matrix4f matrix4f4 = matrix4f;
        dP.a(f26, n2, n4, f28, f27, f17, f24, f25, f18, matrix4f4, f16, n3, f22, f20, f23, f21, f19);
        float f29 = kD.DROPDOWN_ARROWS.getWidth();
        float f30 = kD.DROPDOWN_ARROWS.getHeight();
        float f31 = this.a + this.c - 12.0f - f29;
        float f32 = f14 + (32.0f - f30) / 2.0f + 1.0f;
        float f33 = f2;
        int n5 = gD.foreground();
        float f34 = f30;
        float f35 = f29;
        float f36 = f32;
        float f37 = f31;
        kD kD2 = kD.DROPDOWN_ARROWS;
        Matrix4f matrix4f5 = matrix4f;
        jr.a(f33, n5, matrix4f5, f36, kD2, f34, f37, f35);
        float f38 = this.c - 24.0f - f29 - 4.0f;
        float f39 = f14 + 9.0f;
        float f40 = f38;
        float f41 = f2;
        int n6 = gD.foreground();
        float f42 = f39;
        float f43 = this.a + 12.0f;
        Matrix4f matrix4f6 = matrix4f;
        this.a(f41, n6, f42, f43, matrix4f6, f40);
        this.d = f14 + 32.0f - this.b;
        if (f15 > 0.001f) {
            float f44 = f15;
            float f45 = f14;
            float f46 = f2;
            float f47 = f3;
            float f48 = f4;
            Matrix4f matrix4f7 = matrix4f;
            this.a(f45, f46, f47, matrix4f7, f48, f44);
            this.d = f14 + 32.0f - this.b + (10.0f + this.b(this.a())) * f15;
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    protected float c() {
        return 12.0f;
    }

    private int c() {
        if (this.A != null) {
            return this.A.b();
        }
        for (int i2 = 0; i2 < this.B.a(); ++i2) {
            if (!this.B.a(i2)) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public float f() {
        float f2 = this.a(this.a(this.c), this.b(this.c)) + 8.0f + 32.0f;
        float f3 = this.D.b();
        if (f3 <= 0.001f) {
            return f2;
        }
        int n2 = this.a();
        if (n2 == 0) {
            return f2;
        }
        return f2 + (10.0f + this.b(n2)) * f3;
    }

    private boolean d() {
        return this.B != null || this.A != null && this.A.a();
    }

    @Override
    protected float d() {
        return 12.0f;
    }

    @Override
    public boolean a(double d2, double d3, int n2, double d4, double d5) {
        if (!this.J || n2 != 0) {
            return false;
        }
        int n3 = this.a();
        if (n3 == 0) {
            return false;
        }
        float f2 = this.a();
        float f3 = f2 + 32.0f + 10.0f;
        float f4 = this.b(n3);
        float f5 = f3 + 4.0f;
        float f6 = f3 + f4 - 4.0f;
        float f7 = f6 - f5 - 59.0f;
        float f8 = this.c(n3);
        float f9 = (float)d2 - this.K;
        float f10 = (f9 - f5) / f7;
        this.H = Math.clamp((float)(f10 * f8), (float)0.0f, (float)f8);
        return true;
    }

    private void a(float f2, float f3, float f4, Matrix4f matrix4f, float f5, float f6) {
        float f7;
        int n3 = this.a();
        if (n3 == 0) {
            return;
        }
        float f8 = f2 + 32.0f + 10.0f;
        float f9 = this.b(n3);
        float f10 = f9 * f6;
        float f11 = f3 * f6;
        float f12 = f10;
        float f13 = this.c;
        float f14 = f8;
        float f15 = this.a;
        aM.b(f13, f12, f14, f15);
        float f16 = f11;
        int n4 = gD.elevated();
        float f17 = 12.0f;
        float f18 = f9;
        float f19 = this.c;
        float f20 = f8;
        float f21 = this.a;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f17, f21, n4, matrix4f2, f18, f19, f16, f20);
        boolean bl2 = this.b(n3);
        float f22 = this.a + 4.0f;
        float f23 = bl2 ? this.a + this.c - 4.0f - 6.0f - 4.0f : this.a + this.c - 4.0f;
        float f24 = f23 - f22;
        float f25 = this.c(n3);
        this.H = f7 = Math.clamp((float)this.H, (float)0.0f, (float)f25);
        if (f7 != this.I) {
            this.G.c(f7);
            this.I = f7;
        }
        float f26 = this.G.a();
        boolean bl3 = f5 >= this.a && f5 <= this.a + this.c && f4 >= f8 && f4 <= f8 + f9;
        for (int i2 = 0; i2 < n3; ++i2) {
            boolean bl4;
            float f27 = f8 + 4.0f - f26 + (float)i2 * 30.0f;
            if (f27 + 26.0f < f8 || f27 > f8 + f9) continue;
            boolean bl5 = this.a(i2);
            boolean bl6 = bl4 = bl3 && f5 >= f22 && f5 <= f22 + f24 && f4 >= f27 && f4 <= f27 + 26.0f;
            float f28 = bl5 ? 1.0f : (bl4 ? 0.7f : 0.4f);
            bo bo2 = this.F.computeIfAbsent(i2, n2 -> jm.a(this.a((int)n2) ? 1.0f : 0.4f, 0.22f));
            bo2.c(f28);
            float f29 = bo2.a();
            float f30 = f11 * f29;
            float f31 = 3.0f;
            float f32 = 1.0f;
            float f33 = 0.0f;
            int n5 = 0x1A000000;
            float f34 = 0.0f;
            int n6 = 0;
            int n7 = gD.surface();
            float f35 = 8.0f;
            float f36 = 8.0f;
            float f37 = 8.0f;
            float f38 = 8.0f;
            float f39 = 26.0f;
            float f40 = f24;
            float f41 = f27;
            float f42 = f22;
            Matrix4f matrix4f3 = matrix4f;
            dP.a(f40, n5, n7, f42, f41, f31, f38, f39, f32, matrix4f3, f30, n6, f36, f34, f37, f35, f33);
            float f43 = f27 + 6.0f - 1.0f;
            float f44 = f24 - 16.0f;
            float f45 = f11 * f29;
            int n8 = gD.foreground();
            float f46 = f43;
            float f47 = f22 + 12.0f - 4.0f;
            int n9 = i2;
            Matrix4f matrix4f4 = matrix4f;
            this.a(matrix4f4, f45, n8, n9, f47, f46, f44);
        }
        if (bl2) {
            float f48 = f11;
            float f49 = f25;
            float f50 = f26;
            float f51 = f9;
            float f52 = f8;
            Matrix4f matrix4f5 = matrix4f;
            this.b(f51, f49, f52, matrix4f5, f50, f48);
        }
        aM.b();
    }

    @Override
    public boolean a(double d2, double d3, int n2) {
        if (this.J && n2 == 0) {
            this.J = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean a(double d2, double d3, double d4) {
        if (!this.C) {
            return false;
        }
        int n2 = this.a();
        if (n2 == 0) {
            return false;
        }
        if (!this.b(n2)) {
            return false;
        }
        float f2 = this.a();
        float f3 = f2 + 32.0f + 10.0f;
        float f4 = this.b(n2);
        if (!(d3 >= (double)this.a && d3 <= (double)(this.a + this.c) && d4 >= (double)f3 && d4 <= (double)(f3 + f4))) {
            return false;
        }
        float f5 = this.c(n2);
        this.H = Math.clamp((float)(this.H - (float)(d2 * 30.0)), (float)0.0f, (float)f5);
        return true;
    }

    private boolean a(int n2) {
        return this.A != null ? this.A.a(n2) : this.B.a(n2);
    }

    private void a(int n2) {
        if (this.A != null) {
            if (this.A.a()) {
                this.A.b(n2);
            } else {
                this.A.a(n2);
            }
        } else {
            this.B.a(n2);
        }
    }

    private String a(int n2) {
        String[] stringArray = this.a(n2);
        if (stringArray.length == 0) {
            return null;
        }
        return fc.a().b(Long.toHexString(kJ.a(stringArray)));
    }

    private float a(String string, boolean bl2) {
        float f2;
        if (bl2) {
            float f3 = 14.0f;
            String string2 = string;
            f2 = ao.a(f3, string2);
        } else {
            f2 = ao.a(string, 14.0f);
        }
        return f2;
    }

    private String[] a(int n2) {
        return this.A != null ? this.A.a(n2) : this.B.a(n2);
    }

    private int a() {
        return this.A != null ? this.A.a() : (this.B != null ? this.B.a() : 0);
    }

    @Override
    protected kD a() {
        return kD.SETTING_DROPDOWN;
    }

    private void a(float f2, int n2, float f3, float f4, Matrix4f matrix4f, float f5) {
        int n3 = this.b();
        if (n3 == 0) {
            boolean bl2 = false;
            float f6 = f5;
            String string = this.a("None");
            float f7 = f2;
            int n4 = n2;
            float f8 = 14.0f;
            float f9 = f3;
            float f10 = f4;
            String string2 = this.a(bl2, string, f6);
            Matrix4f matrix4f2 = matrix4f;
            ao.a(f9, f10, n4, f8, f7, string2, matrix4f2);
            return;
        }
        int n5 = this.c();
        boolean bl3 = this.b(n5) != null;
        boolean bl4 = this.d() && n3 > 1;
        String string = "\u2026";
        float f11 = bl4 ? this.a(string, bl3) : 0.0f;
        float f12 = f5 - f11;
        float f13 = f2;
        int n6 = n2;
        float f14 = f3;
        float f15 = f4;
        int n7 = n5;
        Matrix4f matrix4f3 = matrix4f;
        float f16 = this.a(matrix4f3, f13, n6, n7, f15, f14, f12);
        if (bl4) {
            boolean bl5 = bl3;
            float f17 = f2;
            int n8 = n2;
            float f18 = f3;
            float f19 = f4 + f16;
            String string3 = string;
            Matrix4f matrix4f4 = matrix4f;
            this.a(f18, string3, bl5, matrix4f4, f19, n8, f17);
        }
    }

    private String a(String string) {
        return fc.a().a(string);
    }

    private float a() {
        float f2 = this.b(this.c);
        float f3 = this.a(this.c);
        return this.b(f2, f3);
    }

    @Override
    private float a(int n2) {
        if (n2 <= 0) {
            return 0.0f;
        }
        return 8.0f + (float)n2 * 26.0f + (float)(n2 - 1) * 4.0f;
    }

    private float a(Matrix4f matrix4f, float f2, int n2, int n3, float f3, float f4, float f5) {
        String string;
        String string2 = this.b(n3);
        String string3 = string = string2 != null ? string2 : this.a(n3);
        if (string != null) {
            boolean bl2;
            boolean bl3 = bl2 = string2 != null;
            float f6 = f5;
            String string4 = string;
            String string5 = this.a(bl3, string4, f6);
            boolean bl4 = bl2;
            float f7 = f2;
            int n4 = n2;
            float f8 = f4;
            float f9 = f3;
            String string6 = string5;
            Matrix4f matrix4f2 = matrix4f;
            this.a(f8, string6, bl4, matrix4f2, f9, n4, f7);
            return this.a(string5, bl2);
        }
        float f10 = 14.0f;
        String[] stringArray = this.a(n3);
        String[] stringArray2 = stringArray;
        float f11 = ao.a(f10, stringArray2);
        if (f11 <= f5) {
            float f12 = f2;
            int n5 = n2;
            float f13 = 14.0f;
            float f14 = f4;
            float f15 = f3;
            int n6 = stringArray.length;
            int n7 = 0;
            String[] stringArray3 = stringArray;
            Matrix4f matrix4f3 = matrix4f;
            ao.a(n7, f12, stringArray3, f15, matrix4f3, n6, n5, f13, f14);
            return f11;
        }
        float f16 = this.a("...", false);
        float f17 = 14.0f;
        float f18 = f5 - f16;
        String[] stringArray4 = stringArray;
        int n8 = ao.a(f17, f18, stringArray4);
        float f19 = 14.0f;
        int n9 = n8;
        int n10 = 0;
        String[] stringArray5 = stringArray;
        float f20 = ao.a(n10, stringArray5, f19, n9);
        float f21 = f2;
        int n11 = n2;
        float f22 = 14.0f;
        float f23 = f4;
        float f24 = f3;
        int n12 = n8;
        int n13 = 0;
        String[] stringArray6 = stringArray;
        Matrix4f matrix4f4 = matrix4f;
        ao.a(n13, f21, stringArray6, f24, matrix4f4, n12, n11, f22, f23);
        float f25 = f2;
        int n14 = n2;
        float f26 = 14.0f;
        float f27 = f4;
        float f28 = f3 + f20;
        String string7 = "...";
        Matrix4f matrix4f5 = matrix4f;
        ao.a(f27, f28, n14, f26, f25, string7, matrix4f5);
        return f20 + f16;
    }

    private void a(float f2, String string, boolean bl2, Matrix4f matrix4f, float f3, int n2, float f4) {
        if (bl2) {
            float f5 = f4;
            int n3 = n2;
            float f6 = 14.0f;
            float f7 = f2;
            float f8 = f3;
            String string2 = string;
            Matrix4f matrix4f2 = matrix4f;
            ao.a(f5, string2, f6, f8, n3, f7, matrix4f2);
        } else {
            float f9 = f4;
            int n4 = n2;
            float f10 = 14.0f;
            float f11 = f2;
            float f12 = f3;
            String string3 = string;
            Matrix4f matrix4f3 = matrix4f;
            ao.a(f11, f12, n4, f10, f9, string3, matrix4f3);
        }
    }

    private String a(boolean bl2, String string, float f2) {
        if (this.a(string, bl2) <= f2) {
            return string;
        }
        String string2 = "...";
        float f3 = this.a(string2, bl2);
        StringBuilder stringBuilder = new StringBuilder(string);
        while (!stringBuilder.isEmpty() && this.a(stringBuilder.toString(), bl2) + f3 > f2) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        return String.valueOf(stringBuilder) + string2;
    }
}

