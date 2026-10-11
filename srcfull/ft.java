/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ft
extends kc {
    private static final float k = 293.0f;
    private static final float l = 383.0f;
    private static final float m = 8.0f;
    private static final float n = 12.0f;
    private static final float o = 12.0f;
    private static final float p = 28.0f;
    private static final float q = 14.0f;
    private static final float r = 12.0f;
    private static final float s = 12.0f;
    private static final float t = 4.0f;
    private static final float u = 6.0f;
    private static final float v = 8.0f;
    private static final float w = 14.0f;
    private static final float F = 16.0f;
    private static final float G = 269.0f;
    private static final float H = 150.0f;
    private static final float I = 8.0f;
    private static final float J = 240.0f;
    private static final float K = 8.0f;
    private static final float L = 7.0f;
    private static final float M = 10.0f;
    private static final float N = 16.0f;
    private static final float O = 16.0f;
    private static final float P = 12.0f;
    private static final float Q = 13.0f;
    private static final float R = 14.0f;
    private static final float S = 1.5f;
    private static final int T = -1;
    private static final float U = 269.0f;
    private static final float V = 34.0f;
    private static final float W = 8.0f;
    private static final float X = 4.0f;
    private static final float cd = 26.0f;
    private static final float ce = 8.0f;
    private static final float aa = 60.0f;
    private static final float ab = 133.0f;
    private static final float ac = 60.0f;
    private static final float ad = 12.0f;
    private static final float ae = 8.0f;
    private static final float af = 6.0f;
    private static final float ag = 269.0f;
    private static final float ah = 32.0f;
    private static final float ai = 8.0f;
    private static final float aj = 16.0f;
    private static final float ak = 10.0f;
    private static final float al = 29.0f;
    private static final float am = 26.0f;
    private static final float an = 8.0f;
    private static final float ao = 1.5f;
    private static final float ap = 26.0f;
    private static final float aq = 4.0f;
    private static final float ar = 4.0f;
    private static final float as = 6.0f;
    private static final float at = 0.4f;
    private static final float au = 0.7f;
    private static final float av = 0.1f;
    private static final float aw = 0.18f;
    private static final float ax = 6.0f;
    private static final float ay = 0.05f;
    private static final float az = 0.03f;
    private static final float aA = 28.0f;
    private static final float aB = 18.0f;
    private static final String aC = "\u0412\u044b\u0431\u043e\u0440 \u0446\u0432\u0435\u0442\u0430";
    private static final String aD = "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0446\u0432\u0435\u0442, \u043a\u043e\u0442\u043e\u0440\u044b\u0439 \u0431\u0443\u0434\u0435\u0442 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c\u0441\u044f.";
    private static final String aE = "\u0421\u043e\u0445\u0440\u0430\u043d\u0451\u043d\u043d\u044b\u0435 \u0446\u0432\u0435\u0442\u0430";
    private static final String aF = "\u041c\u043e\u0436\u0435\u0442\u0435 \u0432\u044b\u0431\u0440\u0430\u0442\u044c \u0441\u043e\u0445\u0440\u0430\u043d\u0451\u043d\u043d\u044b\u0439 \u0446\u0432\u0435\u0442.";
    private static final int aG = -1;
    private static final int aH = 3;
    private static final int aI = 4;
    private final lw aJ;
    private float aK;
    private float aL;
    private float aM;
    private float aN = 1.0f;
    private boolean aO;
    private boolean aP;
    private boolean aQ;
    private float aR;
    private float aS;
    private float aT;
    private float aU;
    private final im aV = new im();
    private boolean aW;
    private int aX = -1;
    private final bo aY = jm.a(0.0f, 0.15f);
    private final bo aZ = jm.b(0.0f, 0.15f);
    private final bC ba;
    private boolean bb;
    private int bc = -16777216;
    private float bd;
    private float be;
    private final im bf = new im();
    private boolean bg;
    private static final ByteBuffer bh = ByteBuffer.allocateDirect(4).order(ByteOrder.nativeOrder());
    private static ce bi = ab.a();
    private ce bj = bi;
    private boolean bk;
    private final bo bl = jm.a(0.0f, 0.15f);
    private final bo bm = new bo(1.0f, 0.18f).a(D::f);
    private int bn = 1;
    private int bo = -1;
    private ce bp;
    private final gO bq = new gO(12.0f);

    public ft(lw lw2) {
        this.aJ = lw2;
        this.c = 293.0f;
        this.d = 383.0f;
        this.ba = new bC(0xFF000000 | lw2.a() & 0xFFFFFF, 0.22f);
        this.bq.a(this::a);
        this.bq.a(() -> {
            this.bo = -1;
        });
        this.bq.a(this::a);
        this.bq.a().b(true);
        this.a();
    }

    @Override
    protected void e(float f2, float f3, float f4, Matrix4f matrix4f) {
        this.c();
        float f5 = this.b + jm.b(f3);
        Matrix4f matrix4f2 = jm.a(matrix4f, f3, this.a + 146.5f, f5 + 191.5f);
        float f6 = f3;
        float f7 = 6.0f;
        float f8 = 2.0f;
        float f9 = 0.0f;
        int n2 = 0x1A000000;
        float f10 = 1.0f;
        int n3 = gD.border();
        int n4 = gD.background();
        float f11 = 8.0f;
        float f12 = 8.0f;
        float f13 = 8.0f;
        float f14 = 8.0f;
        float f15 = 383.0f;
        float f16 = 293.0f;
        float f17 = f5;
        float f18 = this.a;
        Matrix4f matrix4f3 = matrix4f2;
        dP.a(f16, n2, n4, f18, f17, f7, f14, f15, f8, matrix4f3, f6, n3, f12, f10, f13, f11, f9);
        l l2 = this.a(f5);
        float f19 = f3;
        float f20 = l2.o;
        float f21 = f5;
        Matrix4f matrix4f4 = matrix4f2;
        this.a(f19, matrix4f4, f21, f20);
        float f22 = f3;
        float f23 = l2.b;
        float f24 = l2.a;
        Matrix4f matrix4f5 = matrix4f2;
        this.a(f22, f24, f23, matrix4f5);
        float f25 = f3;
        float f26 = l2.g;
        float f27 = l2.f;
        Matrix4f matrix4f6 = matrix4f2;
        this.a(matrix4f6, f26, f25, f27);
        float f28 = f3;
        float f29 = l2.h;
        float f30 = l2.a;
        Matrix4f matrix4f7 = matrix4f2;
        this.b(f29, matrix4f7, f30, f28);
        this.b(matrix4f2, l2.a, l2.n, f3);
        float f31 = f3;
        float f32 = l2.m;
        float f33 = l2.l;
        float f34 = l2.a;
        Matrix4f matrix4f8 = matrix4f2;
        this.a(f31, f32, f33, f34, matrix4f8);
        if (this.bb) {
            float f35 = f2;
            float f36 = f4;
            this.a(f35, f36);
            this.b(f4, f2);
            float f37 = f3;
            float f38 = this.be;
            float f39 = this.bd;
            Matrix4f matrix4f9 = matrix4f;
            this.c(matrix4f9, f39, f37, f38);
        } else if (this.bg) {
            this.bg = false;
            this.bf.a();
        }
        float f40 = f3;
        float f41 = f2;
        float f42 = f4;
        float f43 = l2.j + 26.0f;
        float f44 = l2.i;
        Matrix4f matrix4f10 = matrix4f2;
        this.a(f44, matrix4f10, f41, f40, f42, f43);
    }

    @Override
    public boolean b(int n2, double d2, double d3) {
        if (this.bb) {
            if (n2 == 1) {
                this.bb = false;
            } else if (n2 == 0) {
                this.d();
            }
            return true;
        }
        if (this.bk && n2 == 0 && !this.b(d2, d3) && !this.a(d2, d3)) {
            this.bk = false;
            return true;
        }
        int n3 = n2;
        double d4 = d3;
        double d5 = d2;
        return super.b(n3, d5, d4);
    }

    private void b(Matrix4f matrix4f, float f2, float f3, float f4) {
        float f5 = f4;
        int n2 = gD.foreground();
        float f6 = 12.0f;
        float f7 = 12.0f;
        float f8 = f3 + 1.0f;
        float f9 = f2;
        kD kD2 = kD.EYEDROPPER;
        Matrix4f matrix4f2 = matrix4f;
        jr.a(f5, n2, matrix4f2, f8, kD2, f6, f9, f7);
        float f10 = f4;
        int n3 = gD.foreground();
        float f11 = 14.0f;
        float f12 = f3;
        float f13 = f2 + 12.0f + 4.0f;
        String string = aE;
        Matrix4f matrix4f3 = matrix4f;
        ao.a(n3, f10, f12, matrix4f3, f13, f11, string);
        float f14 = f4;
        int n4 = gD.mutedFg();
        float f15 = 269.0f;
        float f16 = 12.0f;
        float f17 = f3 + 14.0f + 4.0f;
        float f18 = f2;
        String string2 = aF;
        Matrix4f matrix4f4 = matrix4f;
        ao.a(f14, string2, f18, f16, matrix4f4, f15, f17, n4);
    }

    private static float b() {
        int n2 = ce.values().length;
        return 8.0f + (float)n2 * 26.0f + (float)(n2 - 1) * 4.0f;
    }

    private void b(float f2, Matrix4f matrix4f, float f3, float f4) {
        float f5 = f4;
        int n2 = gD.elevated();
        float f6 = 8.0f;
        float f7 = 34.0f;
        float f8 = 269.0f;
        float f9 = f2;
        float f10 = f3;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f6, f10, n2, matrix4f2, f7, f8, f5, f9);
        float f11 = f2 + 4.0f;
        float f12 = ft.a();
        float f13 = f3 + 4.0f;
        float f14 = f13 + 60.0f + f12;
        float f15 = f14 + 133.0f + f12;
        float f16 = f4;
        float f17 = f11;
        float f18 = f13;
        Matrix4f matrix4f3 = matrix4f;
        this.a(f17, f16, matrix4f3, f18);
        float f19 = f4;
        float f20 = f11;
        float f21 = f14;
        Matrix4f matrix4f4 = matrix4f;
        this.b(f21, f19, f20, matrix4f4);
        float f22 = f4;
        float f23 = f11;
        float f24 = f15;
        Matrix4f matrix4f5 = matrix4f;
        this.c(f22, matrix4f5, f24, f23);
    }

    private void b(Matrix4f matrix4f, float f2, float f3, float f4, float f5) {
        float f6 = f2;
        float f7 = 3.0f;
        float f8 = 1.0f;
        float f9 = 0.0f;
        int n2 = 0x1A000000;
        float f10 = 0.0f;
        int n3 = 0;
        int n4 = gD.surface();
        float f11 = 8.0f;
        float f12 = 8.0f;
        float f13 = 8.0f;
        float f14 = 8.0f;
        float f15 = 26.0f;
        float f16 = f3;
        float f17 = f5;
        float f18 = f4;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f16, n2, n4, f18, f17, f7, f14, f15, f8, matrix4f2, f6, n3, f12, f10, f13, f11, f9);
    }

    private void b(float f2, float f3, float f4, Matrix4f matrix4f) {
        float f5 = f3;
        float f6 = 133.0f;
        float f7 = f4;
        float f8 = f2;
        Matrix4f matrix4f2 = matrix4f;
        this.b(matrix4f2, f5, f6, f8, f7);
        float f9 = this.bm.a();
        if (f9 < 0.001f && this.bj != bi) {
            this.bj = bi;
            this.bm.c(1.0f);
            f9 = this.bm.a();
        }
        float f10 = f3 * f9;
        boolean bl2 = this.bm.c() < 0.5f;
        float f11 = (float)(bl2 ? this.bn : -this.bn) * (1.0f - f9) * 4.0f;
        if (this.bj == ce.c) {
            float f12 = f10;
            float f13 = f11;
            float f14 = f4;
            float f15 = f2;
            Matrix4f matrix4f3 = matrix4f;
            this.a(matrix4f3, f14, f13, f15, f12);
            return;
        }
        String[] stringArray = this.a(this.bj);
        float f16 = this.bj == ce.c || bi == ce.c ? f10 : f3;
        float f17 = 43.666668f;
        for (int i2 = 0; i2 < 3; ++i2) {
            float f18 = f2 + (float)i2 * (f17 + 1.0f);
            float f19 = f4 + 7.0f + f11;
            float f20 = f10;
            String string = stringArray[i2];
            int n2 = i2;
            float f21 = f19;
            float f22 = f17;
            float f23 = f18;
            Matrix4f matrix4f4 = matrix4f;
            this.a(string, f22, f20, n2, matrix4f4, f23, f21);
            if (i2 >= 2) continue;
            float f24 = f16;
            int n3 = gD.border();
            float f25 = 26.0f;
            float f26 = 1.0f;
            float f27 = f4;
            float f28 = f18 + f17;
            Matrix4f matrix4f5 = matrix4f;
            dP.a(f24, f25, f28, f27, f26, matrix4f5, n3);
        }
    }

    private void b() {
        int n2;
        int n3 = n2 = this.aJ.b() ? Math.round(this.aN * 255.0f) : 255;
        float f2 = this.aM;
        float f3 = this.aL;
        float f4 = this.aK;
        int n4 = ie.a(f2, n3, f3, f4);
        this.aJ.a(n4);
        if (this.aX >= 0) {
            int n5 = n4;
            int n6 = this.aX;
            ev.a(n5, n6);
        }
    }

    private void b(float f2, float f3) {
        float f4 = this.bf.a();
        if (!this.bg) {
            this.bd = f2;
            this.be = f3;
            this.bg = true;
            return;
        }
        float f5 = 0.03f;
        float f6 = f4;
        float f7 = f2;
        float f8 = this.bd;
        this.bd = im.a(f7, f8, f6, f5);
        float f9 = 0.03f;
        float f10 = f4;
        float f11 = f3;
        float f12 = this.be;
        this.be = im.a(f11, f12, f10, f9);
    }

    private boolean b(double d2, double d3) {
        if (!this.bk) {
            return false;
        }
        l l2 = this.a();
        float f2 = ft.b();
        float f3 = 60.0f;
        float f4 = l2.j + 26.0f + 6.0f;
        float f5 = l2.i;
        double d4 = d3;
        double d5 = d2;
        return ft.a(f5, f4, d4, f2, f3, d5);
    }

    private int b() {
        return Color.HSBtoRGB(this.aK, this.aL, this.aM);
    }

    private void b(String string) {
        Integer n2 = ie.a(string);
        if (n2 == null) {
            return;
        }
        int n3 = n2 & 0xFF;
        int n4 = n2 >> 8 & 0xFF;
        int n5 = n2 >> 16 & 0xFF;
        this.a(n3, n5, n4);
    }

    private void c() {
        float f2 = this.aV.a();
        if (!this.aW) {
            this.aR = this.aL;
            this.aS = this.aM;
            this.aT = this.aK;
            this.aU = this.aN;
            this.aW = true;
            return;
        }
        float f3 = 0.05f;
        float f4 = f2;
        float f5 = this.aL;
        float f6 = this.aR;
        this.aR = im.a(f5, f6, f4, f3);
        float f7 = 0.05f;
        float f8 = f2;
        float f9 = this.aM;
        float f10 = this.aS;
        this.aS = im.a(f9, f10, f8, f7);
        float f11 = 0.05f;
        float f12 = f2;
        float f13 = this.aK;
        float f14 = this.aT;
        this.aT = im.a(f13, f14, f12, f11);
        float f15 = 0.05f;
        float f16 = f2;
        float f17 = this.aN;
        float f18 = this.aU;
        this.aU = im.a(f17, f18, f16, f15);
    }

    private void c(float f2, Matrix4f matrix4f, float f3, float f4) {
        float f5 = f2;
        float f6 = 60.0f;
        float f7 = f4;
        float f8 = f3;
        Matrix4f matrix4f2 = matrix4f;
        this.b(matrix4f2, f5, f6, f8, f7);
        float f9 = f4 + 7.0f;
        if (this.bo == 3) {
            float f10 = f2;
            String string = "%";
            float f11 = f9;
            float f12 = 60.0f;
            float f13 = f3;
            Matrix4f matrix4f3 = matrix4f;
            this.a(matrix4f3, f10, f13, f11, string, f12);
        } else {
            String string = Math.round(this.aN * 100.0f) + "%";
            float f14 = ao.a(string, 12.0f);
            float f15 = f2;
            int n2 = gD.foreground();
            float f16 = 12.0f;
            float f17 = f9;
            float f18 = f3 + (60.0f - f14) / 2.0f;
            String string2 = string;
            Matrix4f matrix4f4 = matrix4f;
            ao.a(f17, f18, n2, f16, f15, string2, matrix4f4);
        }
    }

    private void c(Matrix4f matrix4f, float f2, float f3, float f4) {
        float f5 = 14.0f;
        float f6 = lo.aM.method_22683().method_4486();
        float f7 = lo.aM.method_22683().method_4502();
        float f8 = f2 + 18.0f;
        float f9 = f4 + 18.0f;
        if (f8 + 28.0f > f6) {
            f8 = f2 - 18.0f - 28.0f;
        }
        if (f9 + 28.0f > f7) {
            f9 = f4 - 18.0f - 28.0f;
        }
        float f10 = f3;
        float f11 = 3.0f;
        float f12 = 1.0f;
        float f13 = 0.0f;
        int n2 = 0x1A000000;
        float f14 = 1.5f;
        int n3 = -1;
        int n4 = this.bc;
        float f15 = f5;
        float f16 = f5;
        float f17 = f5;
        float f18 = f5;
        float f19 = 28.0f;
        float f20 = 28.0f;
        float f21 = f9;
        float f22 = f8;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f20, n2, n4, f22, f21, f11, f18, f19, f12, matrix4f2, f10, n3, f16, f14, f17, f15, f13);
        String string = String.format("#%06X", this.bc & 0xFFFFFF);
        float f23 = ao.a(string, 12.0f);
        float f24 = f3;
        int n5 = -1;
        float f25 = 12.0f;
        float f26 = f9 + 28.0f + 4.0f;
        float f27 = f8 + (28.0f - f23) / 2.0f;
        String string2 = string;
        Matrix4f matrix4f3 = matrix4f;
        ao.a(f26, f27, n5, f25, f24, string2, matrix4f3);
    }

    private void d() {
        int n2 = this.bc;
        if (this.aJ.b()) {
            int n3 = Math.round(this.aN * 255.0f);
            int n4 = n2 & 0xFF;
            int n5 = n2 >> 8 & 0xFF;
            int n6 = n2 >> 16 & 0xFF;
            this.aJ.a(n6, n5, n3, n4);
        } else {
            int n7 = n2 & 0xFF;
            int n8 = n2 >> 8 & 0xFF;
            int n9 = n2 >> 16 & 0xFF;
            this.aJ.a(n7, n8, n9);
        }
        this.a();
        if (this.aX >= 0) {
            int n10 = this.aJ.a();
            int n11 = this.aX;
            ev.a(n10, n11);
        }
        this.bb = false;
    }

    private boolean a(double d2, double d3) {
        l l2 = this.a();
        float f2 = 26.0f;
        float f3 = 60.0f;
        float f4 = l2.j;
        float f5 = l2.i;
        double d4 = d3;
        double d5 = d2;
        return ft.a(f5, f4, d4, f2, f3, d5);
    }

    private void a(String string) {
        int n2 = this.bo;
        this.bo = -1;
        if (string == null) {
            return;
        }
        if ((string = string.trim()).isEmpty()) {
            return;
        }
        try {
            switch (n2) {
                case 4: {
                    this.b(string);
                    break;
                }
                case 3: {
                    this.aN = Math.clamp((float)Float.parseFloat(string), (float)0.0f, (float)100.0f) / 100.0f;
                    this.b();
                    break;
                }
                default: {
                    this.a(n2, string);
                    break;
                }
            }
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
    }

    private void a(int n2, String string) {
        int n3 = this.b();
        int n4 = n3 >> 16 & 0xFF;
        int n5 = n3 >> 8 & 0xFF;
        int n6 = n3 & 0xFF;
        if (this.bp == ce.a) {
            int n7 = Math.clamp((long)Integer.parseInt(string), (int)0, (int)255);
            if (n2 == 0) {
                n4 = n7;
            } else if (n2 == 1) {
                n5 = n7;
            } else {
                n6 = n7;
            }
            int n8 = n6;
            int n9 = n5;
            int n10 = n4;
            this.a(n8, n10, n9);
        } else if (this.bp == ce.b) {
            float[] fArray = ie.b(this.a());
            float f2 = Float.parseFloat(string);
            if (n2 == 0) {
                fArray[0] = Math.clamp((float)f2, (float)0.0f, (float)360.0f) / 360.0f;
            } else {
                fArray[n2] = Math.clamp((float)f2, (float)0.0f, (float)100.0f) / 100.0f;
            }
            float f3 = fArray[2];
            float f4 = fArray[1];
            float f5 = fArray[0];
            int n11 = ie.b(f3, f5, f4);
            int n12 = n11 & 0xFF;
            int n13 = n11 >> 8 & 0xFF;
            int n14 = n11 >> 16 & 0xFF;
            this.a(n12, n14, n13);
        }
    }

    private void a(int n2, int n3, int n4) {
        float[] fArray = ie.a(0xFF000000 | n3 << 16 | n4 << 8 | n2);
        this.aK = fArray[0];
        this.aL = fArray[1];
        this.aM = fArray[2];
        this.b();
    }

    @Override
    protected boolean a(int n2, double d2, double d3) {
        double d4;
        float f2;
        float f3;
        double d5;
        float f4;
        float f5;
        double d6;
        float f6;
        float f7;
        double d7;
        float f8;
        float f9;
        float f10;
        float f11;
        if (n2 != 0) {
            return true;
        }
        l l2 = this.a();
        float f12 = this.a + 293.0f - 16.0f - 8.0f;
        float f13 = f12 - 4.0f;
        float f14 = this.b + 14.0f - 4.0f;
        double d8 = d3;
        float f15 = 16.0f;
        float f16 = 16.0f;
        double d9 = d2;
        if (ft.a(f13, f14, d8, f15, f16, d9)) {
            this.n();
            return true;
        }
        if (this.bk) {
            f11 = l2.j + 26.0f + 6.0f;
            ce[] ceArray = ce.values();
            for (int i2 = 0; i2 < ceArray.length; ++i2) {
                float f17 = l2.i + 4.0f;
                float f18 = f17;
                f10 = f11 + 4.0f + (float)i2 * 30.0f;
                float f19 = f10;
                double d10 = d3;
                float f20 = 26.0f;
                float f21 = 52.0f;
                float f22 = f21;
                double d11 = d2;
                if (!ft.a(f18, f19, d10, f20, f22, d11)) continue;
                this.a(ceArray[i2]);
                this.bk = false;
                return true;
            }
        }
        if (ft.a(f9 = l2.i, f8 = l2.j, d7 = d3, f7 = 26.0f, f6 = 60.0f, d6 = d2)) {
            this.bk = !this.bk;
            return true;
        }
        float f23 = l2.j;
        double d12 = d3;
        double d13 = d2;
        if (this.a(f23, d12, d13)) {
            return true;
        }
        if (this.bo >= 0) {
            this.bq.a();
        }
        if (ft.a(f5 = this.a + 12.0f - 4.0f, f4 = (f11 = l2.f + (l2.g - 16.0f) / 2.0f) - 4.0f, d5 = d3, f3 = 24.0f, f2 = 24.0f, d4 = d2)) {
            this.bb = true;
            return true;
        }
        float f24 = l2.a;
        float f25 = l2.b;
        double d14 = d3;
        float f26 = 150.0f;
        float f27 = 269.0f;
        double d15 = d2;
        if (ft.a(f24, f25, d14, f26, f27, d15)) {
            this.aO = true;
            float f28 = l2.b;
            float f29 = l2.a;
            double d16 = d3;
            double d17 = d2;
            this.a(f29, f28, d17, d16);
            return true;
        }
        float f30 = l2.c;
        float f31 = l2.d - 2.0f;
        double d18 = d3;
        float f32 = 12.0f;
        float f33 = 240.0f;
        double d19 = d2;
        if (ft.a(f30, f31, d18, f32, f33, d19)) {
            this.aP = true;
            float f34 = l2.c;
            double d20 = d2;
            this.a(f34, d20);
            return true;
        }
        float f35 = l2.c;
        float f36 = l2.e - 2.0f;
        double d21 = d3;
        float f37 = 12.0f;
        float f38 = 240.0f;
        double d22 = d2;
        if (ft.a(f35, f36, d21, f37, f38, d22)) {
            this.aQ = true;
            this.a(d2, l2.c);
            return true;
        }
        for (int i3 = 0; i3 < 7; ++i3) {
            float f39 = l2.k + 10.0f + (float)i3 * (16.0f + l2.m);
            float f40 = f39;
            f10 = l2.l + 8.0f;
            float f41 = f10;
            double d23 = d3;
            float f42 = 16.0f;
            float f43 = 16.0f;
            double d24 = d2;
            if (!ft.a(f40, f41, d23, f42, f43, d24)) continue;
            this.aX = i3;
            this.aJ.a(ev.a(i3));
            this.a();
            return true;
        }
        return true;
    }

    private boolean a(float f2, double d2, double d3) {
        if (d2 < (double)f2 || d2 > (double)(f2 + 26.0f)) {
            return false;
        }
        float f3 = this.a + 12.0f + 4.0f;
        float f4 = ft.a();
        float f5 = f3 + 60.0f + f4;
        float f6 = f5 + 133.0f + f4;
        if (d3 >= (double)f5 && d3 <= (double)(f5 + 133.0f)) {
            if (this.bj == ce.c) {
                this.a(4);
            } else {
                float f7 = 43.666668f;
                for (int i2 = 0; i2 < 3; ++i2) {
                    float f8 = f5 + (float)i2 * (f7 + 1.0f);
                    if (!(d3 >= (double)f8) || !(d3 <= (double)(f8 + f7))) continue;
                    this.a(i2);
                    return true;
                }
            }
            return true;
        }
        if (d3 >= (double)f6 && d3 <= (double)(f6 + 60.0f)) {
            this.a(3);
            return true;
        }
        return false;
    }

    private void a(float f2, double d2) {
        this.aK = ft.a((float)(d2 - (double)f2) / 240.0f);
        this.b();
    }

    private void a(double d2, float f2) {
        this.aN = ft.a((float)(d2 - (double)f2) / 240.0f);
        this.b();
    }

    private static float a(float f2) {
        return Math.clamp((float)f2, (float)0.0f, (float)1.0f);
    }

    private l a() {
        return this.a(this.b);
    }

    private l a(float f2) {
        float f3;
        float f4 = f3 = 241.0f;
        float f5 = 12.0f;
        String string = aD;
        float f6 = ao.a(f4, f5, string);
        float f7 = this.a + 12.0f;
        float f8 = f2 + 12.0f + 14.0f + 4.0f + f6 + 6.0f;
        float f9 = f8 + 150.0f + 10.0f;
        float f10 = 23.0f;
        float f11 = this.a + 12.0f + 16.0f + 13.0f;
        float f12 = f9 + 8.0f + 7.0f;
        float f13 = f9 + f10 + 10.0f;
        float f14 = f13 + 4.0f;
        float f15 = f7 + 4.0f;
        float f16 = f13 + 34.0f + 8.0f;
        float f17 = 269.0f;
        float f18 = 12.0f;
        String string2 = aF;
        float f19 = ao.a(f17, f18, string2);
        float f20 = f16 + 14.0f + 4.0f + f19 + 6.0f;
        float f21 = 22.833334f;
        return new l(f7, f8, f11, f9, f12, f9, f10, f13, f15, f14, f7, f20, f21, f16, f3);
    }

    private void a(float f2, float f3) {
        try {
            double d2 = lo.aM.method_22683().method_4495() * (double)jX.c();
            int n2 = lo.aM.method_22683().method_4489();
            int n3 = lo.aM.method_22683().method_4506();
            int n4 = (int)Math.round((double)f3 * d2);
            int n5 = (int)Math.round((double)n3 - (double)f2 * d2);
            if (n4 < 0 || n5 < 0 || n4 >= n2 || n5 >= n3) {
                return;
            }
            bh.clear();
            RenderSystem.assertOnRenderThread();
            GL11.glReadPixels((int)n4, (int)n5, (int)1, (int)1, (int)6408, (int)5121, (ByteBuffer)bh);
            this.bc = 0xFF000000 | (bh.get(0) & 0xFF) << 16 | (bh.get(1) & 0xFF) << 8 | bh.get(2) & 0xFF;
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    @Override
    public boolean a(double d2, double d3, int n2, double d4, double d5) {
        l l2 = this.a();
        if (this.aO) {
            float f2 = l2.b;
            float f3 = l2.a;
            double d6 = d2;
            double d7 = d3;
            this.a(f3, f2, d7, d6);
            return true;
        }
        if (this.aP) {
            float f4 = l2.c;
            double d8 = d3;
            this.a(f4, d8);
            return true;
        }
        if (this.aQ) {
            this.a(d3, l2.c);
            return true;
        }
        return false;
    }

    @Override
    public boolean a(double d2, double d3, int n2) {
        if (this.aO || this.aQ || this.aP) {
            this.aP = false;
            this.aQ = false;
            this.aO = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean a(int n2, int n3, int n4) {
        if (this.bb && n4 == 256) {
            this.bb = false;
            return true;
        }
        if (this.bq.b()) {
            int n5 = n3;
            int n6 = n4;
            return this.bq.a(n5, n6);
        }
        int n7 = n3;
        int n8 = n2;
        int n9 = n4;
        return super.a(n8, n7, n9);
    }

    @Override
    public boolean a(int n2, char c2) {
        if (this.bq.b()) {
            this.bq.a(c2);
            return true;
        }
        return false;
    }

    private void a(float f2, float f3, double d2, double d3) {
        this.aL = ft.a((float)(d2 - (double)f2) / 269.0f);
        this.aM = 1.0f - ft.a((float)(d3 - (double)f3) / 150.0f);
        this.b();
    }

    private static float a() {
        float f2 = 261.0f;
        return Math.max(0.0f, (f2 - 60.0f - 133.0f - 60.0f) / 2.0f);
    }

    private void a(float f2, float f3, Matrix4f matrix4f, float f4) {
        float f5 = f3;
        float f6 = 60.0f;
        float f7 = f2;
        float f8 = f4;
        Matrix4f matrix4f2 = matrix4f;
        this.b(matrix4f2, f5, f6, f8, f7);
        String string = ft.bi.d;
        float f9 = ao.a(string, 12.0f);
        float f10 = kD.DROPDOWN_ARROWS.getWidth();
        float f11 = kD.DROPDOWN_ARROWS.getHeight();
        float f12 = f4 + (60.0f - (f9 + 6.0f + f10)) / 2.0f;
        float f13 = f2 + 7.0f;
        float f14 = f3;
        int n2 = gD.foreground();
        float f15 = 12.0f;
        float f16 = f13;
        float f17 = f12;
        String string2 = string;
        Matrix4f matrix4f3 = matrix4f;
        ao.a(f16, f17, n2, f15, f14, string2, matrix4f3);
        float f18 = f3;
        int n3 = gD.foreground();
        float f19 = f11;
        float f20 = f10;
        float f21 = f2 + (26.0f - f11) / 2.0f;
        float f22 = f12 + f9 + 6.0f;
        kD kD2 = kD.DROPDOWN_ARROWS;
        Matrix4f matrix4f4 = matrix4f;
        jr.a(f18, n3, matrix4f4, f21, kD2, f19, f22, f20);
    }

    private void a(Matrix4f matrix4f, float f2, float f3, float f4, float f5) {
        float f6 = f2 + 7.0f + f3;
        if (this.bo == 4) {
            float f7 = f5;
            String string = "#";
            float f8 = f6;
            float f9 = 133.0f;
            float f10 = f4;
            Matrix4f matrix4f2 = matrix4f;
            this.a(f10, matrix4f2, f7, string, f9, f8);
        } else {
            String string = String.format("#%06X", this.a() & 0xFFFFFF);
            float f11 = ao.a(string, 12.0f);
            float f12 = f5;
            int n2 = gD.foreground();
            float f13 = 12.0f;
            float f14 = f6;
            float f15 = f4 + (133.0f - f11) / 2.0f;
            String string2 = string;
            Matrix4f matrix4f3 = matrix4f;
            ao.a(f14, f15, n2, f13, f12, string2, matrix4f3);
        }
    }

    private void a(String string, float f2, float f3, int n2, Matrix4f matrix4f, float f4, float f5) {
        if (this.bo == n2) {
            String string2 = this.bq.a();
            float f6 = ao.a(string2, 12.0f);
            boolean bl2 = this.bq.a();
            float f7 = f3;
            int n3 = gD.foreground();
            float f8 = f2;
            float f9 = f5;
            float f10 = f4 + (f2 - f6) / 2.0f;
            Matrix4f matrix4f2 = matrix4f;
            this.bq.a().a(f9, n3, matrix4f2, f7, bl2, f10, f8);
        } else {
            float f11 = ao.a(string, 12.0f);
            float f12 = f3;
            int n4 = gD.foreground();
            float f13 = 12.0f;
            float f14 = f5;
            float f15 = f4 + (f2 - f11) / 2.0f;
            String string3 = string;
            Matrix4f matrix4f3 = matrix4f;
            ao.a(f14, f15, n4, f13, f12, string3, matrix4f3);
        }
    }

    private void a(float f2, Matrix4f matrix4f, float f3, String string, float f4, float f5) {
        String string2 = this.bq.a();
        float f6 = ao.a(string, 12.0f);
        float f7 = ao.a(string2, 12.0f);
        float f8 = f2 + (f4 - (f6 + f7)) / 2.0f;
        float f9 = f3;
        int n2 = gD.foreground();
        float f10 = 12.0f;
        float f11 = f5;
        float f12 = f8;
        String string3 = string;
        Matrix4f matrix4f2 = matrix4f;
        ao.a(f11, f12, n2, f10, f9, string3, matrix4f2);
        boolean bl2 = this.bq.a();
        float f13 = f3;
        int n3 = gD.foreground();
        float f14 = f4;
        float f15 = f5;
        float f16 = f8 + f6;
        Matrix4f matrix4f3 = matrix4f;
        this.bq.a().a(f15, n3, matrix4f3, f13, bl2, f16, f14);
    }

    private int a() {
        return 0xFF000000 | Color.HSBtoRGB(this.aK, this.aL, this.aM) & 0xFFFFFF;
    }

    private void a(float f2, Matrix4f matrix4f, float f3, float f4) {
        float f5 = this.a + 12.0f;
        float f6 = f3 + 12.0f;
        float f7 = f6 + 1.0f;
        float f8 = f2;
        int n2 = gD.foreground();
        float f9 = 12.0f;
        float f10 = 12.0f;
        float f11 = f7;
        float f12 = f5;
        kD kD2 = kD.SETTING_COLOR;
        Matrix4f matrix4f2 = matrix4f;
        jr.a(f8, n2, matrix4f2, f11, kD2, f9, f12, f10);
        float f13 = f2;
        int n3 = gD.foreground();
        float f14 = 14.0f;
        float f15 = f6;
        float f16 = f5 + 12.0f + 4.0f;
        String string = aC;
        Matrix4f matrix4f3 = matrix4f;
        ao.a(n3, f13, f15, matrix4f3, f16, f14, string);
        float f17 = f2;
        int n4 = gD.mutedFg();
        float f18 = 8.0f;
        float f19 = 8.0f;
        float f20 = f3 + 14.0f;
        float f21 = this.a + 293.0f - 16.0f - 8.0f;
        kD kD3 = kD.CLOSE;
        Matrix4f matrix4f4 = matrix4f;
        jr.a(f17, n4, matrix4f4, f20, kD3, f18, f21, f19);
        float f22 = f2;
        int n5 = gD.mutedFg();
        float f23 = f4;
        float f24 = 12.0f;
        float f25 = f6 + 14.0f + 4.0f;
        float f26 = f5;
        String string2 = aD;
        Matrix4f matrix4f5 = matrix4f;
        ao.a(f22, string2, f26, f24, matrix4f5, f23, f25, n5);
    }

    private void a(float f2, float f3, float f4, Matrix4f matrix4f) {
        int n2 = Color.HSBtoRGB(this.aK, 1.0f, 1.0f) | 0xFF000000;
        float f5 = f2;
        int n3 = n2;
        float f6 = 8.0f;
        float f7 = 150.0f;
        float f8 = 269.0f;
        float f9 = f4;
        float f10 = f3;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f5, matrix4f2, f7, f6, f10, f8, f9, n3);
        float f11 = this.aW ? this.aR : this.aL;
        float f12 = this.aW ? this.aS : this.aM;
        float f13 = f2;
        int n4 = this.a();
        float f14 = f4 + (1.0f - f12) * 150.0f - 7.0f;
        float f15 = f3 + f11 * 269.0f - 7.0f;
        Matrix4f matrix4f3 = matrix4f;
        this.a(n4, f13, f14, f15, matrix4f3);
    }

    private void a(Matrix4f matrix4f, float f2, float f3, float f4) {
        float f5 = f3;
        int n2 = gD.foreground();
        float f6 = 16.0f;
        float f7 = 16.0f;
        float f8 = f4 + (f2 - 16.0f) / 2.0f;
        float f9 = this.a + 12.0f;
        kD kD2 = kD.EYEDROPPER;
        Matrix4f matrix4f2 = matrix4f;
        jr.a(f5, n2, matrix4f2, f8, kD2, f6, f9, f7);
        float f10 = this.a + 12.0f + 16.0f + 13.0f;
        float f11 = this.aW ? this.aT : this.aK;
        float f12 = this.aW ? this.aU : this.aN;
        float f13 = f3;
        float f14 = 4.0f;
        float f15 = 8.0f;
        float f16 = 240.0f;
        float f17 = f4;
        float f18 = f10;
        Matrix4f matrix4f3 = matrix4f;
        dP.a(f15, f17, matrix4f3, f14, f18, f16, f13);
        float f19 = f3;
        int n3 = this.a();
        float f20 = f4 + -3.0f;
        float f21 = f10 + f11 * 240.0f - 7.0f;
        Matrix4f matrix4f4 = matrix4f;
        this.a(n3, f19, f20, f21, matrix4f4);
        float f22 = f4 + 8.0f + 7.0f;
        int n4 = this.b() & 0xFFFFFF;
        float f23 = f3;
        int n5 = n4 | 0xFF000000;
        int n6 = n4;
        float f24 = 4.0f;
        float f25 = 8.0f;
        float f26 = 240.0f;
        float f27 = f22;
        float f28 = f10;
        Matrix4f matrix4f5 = matrix4f;
        dP.a(n5, f25, f24, n6, f27, f28, matrix4f5, f26, f23);
        int n7 = Math.round(f12 * 255.0f) << 24 | n4;
        float f29 = f3;
        int n8 = n7;
        float f30 = f22 + -3.0f;
        float f31 = f10 + f12 * 240.0f - 7.0f;
        Matrix4f matrix4f6 = matrix4f;
        this.a(n8, f29, f30, f31, matrix4f6);
    }

    private void a(int n2, float f2, float f3, float f4, Matrix4f matrix4f) {
        float f5 = 7.0f;
        float f6 = f2;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        int n3 = 0;
        float f10 = 1.5f;
        int n4 = -1;
        int n5 = n2;
        float f11 = f5;
        float f12 = f5;
        float f13 = f5;
        float f14 = f5;
        float f15 = 14.0f;
        float f16 = 14.0f;
        float f17 = f3;
        float f18 = f4;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f16, n3, n5, f18, f17, f7, f14, f15, f8, matrix4f2, f6, n4, f12, f10, f13, f11, f9);
    }

    private void a(float f2, float f3, float f4, float f5, Matrix4f matrix4f) {
        float f6 = f2;
        int n2 = gD.elevated();
        float f7 = 8.0f;
        float f8 = 32.0f;
        float f9 = 269.0f;
        float f10 = f4;
        float f11 = f5;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f7, f11, n2, matrix4f2, f8, f9, f6, f10);
        this.aY.c(this.aX >= 0 ? 1.0f : 0.0f);
        if (this.aX >= 0 && this.aY.c() < 0.5f) {
            this.aZ.b(this.aX);
        }
        if (this.aX >= 0) {
            this.aZ.c(this.aX);
        }
        this.ba.b(this.a());
        float f12 = this.aY.a();
        float f13 = this.aZ.a();
        int n3 = this.ba.a();
        if (f12 > 0.001f) {
            float f14 = f5 + 10.0f + f13 * (16.0f + f3);
            float f15 = f2 * f12;
            float f16 = 2.0f;
            float f17 = 1.0f;
            float f18 = 0.0f;
            int n4 = 0x1A000000;
            float f19 = 1.5f;
            int n5 = n3;
            int n6 = gD.background();
            float f20 = 8.0f;
            float f21 = 8.0f;
            float f22 = 8.0f;
            float f23 = 8.0f;
            float f24 = 26.0f;
            float f25 = 29.0f;
            float f26 = f4 + 3.0f;
            float f27 = f14 + -6.5f;
            Matrix4f matrix4f3 = matrix4f;
            dP.a(f25, n4, n6, f27, f26, f16, f23, f24, f17, matrix4f3, f15, n5, f21, f19, f22, f20, f18);
        }
        List list = ev.a();
        float f28 = 8.0f;
        float f29 = f4 + 8.0f;
        for (int i2 = 0; i2 < 7; ++i2) {
            int n7 = i2 < list.size() ? (Integer)list.get(i2) : -1;
            float f30 = f2;
            float f31 = 2.0f;
            float f32 = 1.0f;
            float f33 = 0.0f;
            int n8 = 0x1A000000;
            float f34 = 0.0f;
            int n9 = 0;
            int n10 = n7;
            float f35 = f28;
            float f36 = f28;
            float f37 = f28;
            float f38 = f28;
            float f39 = 16.0f;
            float f40 = 16.0f;
            float f41 = f29;
            float f42 = f5 + 10.0f + (float)i2 * (16.0f + f3);
            Matrix4f matrix4f4 = matrix4f;
            dP.a(f40, n8, n10, f42, f41, f31, f38, f39, f32, matrix4f4, f30, n9, f36, f34, f37, f35, f33);
        }
    }

    @Override
    public void a(jZ jZ2) {
        this.a();
        this.aX = -1;
        this.aW = false;
        this.bb = false;
        this.bg = false;
        this.bk = false;
        this.bo = -1;
        this.aQ = false;
        this.aP = false;
        this.aO = false;
        this.aY.b(0.0f);
        this.ba.a(this.a());
        super.a(jZ2);
    }

    private void a() {
        int n2 = this.aJ.a();
        float[] fArray = ie.a(n2);
        this.aK = fArray[0];
        this.aL = fArray[1];
        this.aM = fArray[2];
        this.aN = (float)(n2 >> 24 & 0xFF) / 255.0f;
    }

    private boolean a(int n2) {
        if (this.bo == 4) {
            return n2 >= 48 && n2 <= 57 || n2 >= 97 && n2 <= 102 || n2 >= 65 && n2 <= 70 || n2 == 35;
        }
        return n2 >= 48 && n2 <= 57;
    }

    private void a(int n2) {
        if (this.bo == n2) {
            return;
        }
        if (this.bo >= 0) {
            this.bq.a();
        }
        this.bo = n2;
        this.bp = this.bj;
        this.bq.a(this.a(n2));
    }

    private String a(int n2) {
        if (n2 == 4) {
            return String.format("%06X", this.a() & 0xFFFFFF);
        }
        if (n2 == 3) {
            return String.valueOf(Math.round(this.aN * 100.0f));
        }
        return this.a(this.bj)[n2].replace("\u00b0", "").replace("%", "");
    }

    private String[] a(ce ce2) {
        String[] stringArray;
        int n2 = this.b();
        int n3 = n2 >> 16 & 0xFF;
        int n4 = n2 >> 8 & 0xFF;
        int n5 = n2 & 0xFF;
        switch (ce2.ordinal()) {
            case 0: {
                String[] stringArray2 = new String[3];
                stringArray2[0] = String.valueOf(n3);
                stringArray2[1] = String.valueOf(n4);
                stringArray = stringArray2;
                stringArray2[2] = String.valueOf(n5);
                break;
            }
            case 1: {
                float[] fArray = ie.b(this.a());
                String[] stringArray3 = new String[3];
                stringArray3[0] = Math.round(fArray[0] * 360.0f) + "\u00b0";
                stringArray3[1] = Math.round(fArray[1] * 100.0f) + "%";
                stringArray = stringArray3;
                stringArray3[2] = Math.round(fArray[2] * 100.0f) + "%";
                break;
            }
            default: {
                String[] stringArray4 = new String[3];
                stringArray4[0] = "";
                stringArray4[1] = "";
                stringArray = stringArray4;
                stringArray4[2] = "";
            }
        }
        return stringArray;
    }

    private void a(Matrix4f matrix4f, float f2, float f3, float f4, String string, float f5) {
        String string2 = this.bq.a();
        float f6 = ao.a(string2, 12.0f);
        float f7 = ao.a(string, 12.0f);
        float f8 = f3 + (f5 - (f6 + f7)) / 2.0f;
        boolean bl2 = this.bq.a();
        float f9 = f2;
        int n2 = gD.foreground();
        float f10 = f5;
        float f11 = f4;
        float f12 = f8;
        Matrix4f matrix4f2 = matrix4f;
        this.bq.a().a(f11, n2, matrix4f2, f9, bl2, f12, f10);
        float f13 = f2;
        int n3 = gD.foreground();
        float f14 = 12.0f;
        float f15 = f4;
        float f16 = f8 + f6;
        String string3 = string;
        Matrix4f matrix4f3 = matrix4f;
        ao.a(f15, f16, n3, f14, f13, string3, matrix4f3);
    }

    private void a(float f2, Matrix4f matrix4f, float f3, float f4, float f5, float f6) {
        this.bl.c(this.bk ? 1.0f : 0.0f);
        float f7 = this.bl.a();
        if (f7 <= 0.001f) {
            return;
        }
        float f8 = f6 + 6.0f;
        float f9 = ft.b();
        float f10 = f4 * jm.a(f7);
        Matrix4f matrix4f2 = jm.a(matrix4f, f7, f2 + 30.0f, f8);
        matrix4f2 = new Matrix4f((Matrix4fc)matrix4f2).translate(0.0f, -(1.0f - f7) * 6.0f, 0.0f);
        float f11 = f10;
        int n2 = gD.elevated();
        float f12 = 8.0f;
        float f13 = f9;
        float f14 = 60.0f;
        float f15 = f8;
        float f16 = f2;
        Matrix4f matrix4f3 = matrix4f2;
        dP.a(f12, f16, n2, matrix4f3, f13, f14, f11, f15);
        ce[] ceArray = ce.values();
        for (int i2 = 0; i2 < ceArray.length; ++i2) {
            boolean bl2;
            float f17 = f8 + 4.0f + (float)i2 * 30.0f;
            float f18 = f2 + 4.0f;
            float f19 = 52.0f;
            boolean bl3 = ceArray[i2] == bi;
            boolean bl4 = bl2 = f5 >= f18 && f5 <= f18 + f19 && f3 >= f17 && f3 <= f17 + 26.0f;
            float f20 = bl3 ? 1.0f : (bl2 ? 0.7f : 0.4f);
            float f21 = f10 * f20;
            float f22 = 3.0f;
            float f23 = 1.0f;
            float f24 = 0.0f;
            int n3 = 0x1A000000;
            float f25 = 0.0f;
            int n4 = 0;
            int n5 = gD.surface();
            float f26 = 8.0f;
            float f27 = 8.0f;
            float f28 = 8.0f;
            float f29 = 8.0f;
            float f30 = 26.0f;
            float f31 = f19;
            float f32 = f17;
            float f33 = f18;
            Matrix4f matrix4f4 = matrix4f2;
            dP.a(f31, n3, n5, f33, f32, f22, f29, f30, f23, matrix4f4, f21, n4, f27, f25, f28, f26, f24);
            String string = ceArray[i2].d;
            float f34 = ao.a(string, 12.0f);
            float f35 = f10 * f20;
            int n6 = gD.foreground();
            float f36 = 12.0f;
            float f37 = f17 + 7.0f;
            float f38 = f18 + (f19 - f34) / 2.0f;
            String string2 = string;
            Matrix4f matrix4f5 = matrix4f2;
            ao.a(f37, f38, n6, f36, f35, string2, matrix4f5);
        }
    }

    private void a(ce ce2) {
        if (ce2 == bi) {
            return;
        }
        this.bn = ce2.ordinal() > bi.ordinal() ? -1 : 1;
        bi = ce2;
        ab.a(ce2);
        this.bm.b(1.0f);
        this.bm.c(0.0f);
    }

    @Override
    protected void o() {
        this.aP = false;
        this.aQ = false;
        this.aO = false;
        if (this.bq.b()) {
            this.bq.a();
        }
    }
}

