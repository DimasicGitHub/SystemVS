/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import net.minecraft.class_1058;
import net.minecraft.class_1799;
import net.minecraft.class_2960;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class gf
extends cA {
    private static final float ct = 8.0f;
    private static final float cu = 4.0f;
    private static final float m = 26.0f;
    private static final float n = 4.0f;
    private static final float o = 8.0f;
    private static final float p = 8.0f;
    private static final float q = 8.0f;
    private static final float r = 16.0f;
    private static final float s = 6.0f;
    private static final float t = 12.0f;
    private static final float u = 70.0f;
    private static final float v = 6.0f;
    private static final float w = 10.0f;
    private static final float x = 141.0f;
    private static final float y = 0.05f;
    private static final float z = 56.0f;
    private static final float A = 18.0f;
    private static final float B = 4.0f;
    private static final float C = 4.0f;
    private static final float D = 14.0f;
    private static final float E = 13.0f;
    private static final float F = 8.0f;
    private static final float G = 20.0f;
    private static final float H = 70.0f;
    private static final float I = 4.0f;
    private static final float J = 6.0f;
    private static final float K = 18.0f;
    private static final float L = 10.0f;
    private static final float M = 0.85f;
    private static final float N = 0.55f;
    private static final float O = 4.5f;
    private static final float P = 0.04f;
    private static final float Q = 0.1f;
    private final hE R;
    private final Map<fa, jJ> S = new HashMap<fa, jJ>();
    private final ey<jJ> T = new ey(4.0f);
    private final im U = new im();
    private float V;
    private boolean W;
    private gz X;
    private float Y = Float.NaN;
    private boolean Z = true;

    public gf(hE hE2) {
        super(hE2);
        this.R = hE2;
    }

    static /* synthetic */ float e(gf gf2) {
        return gf2.c;
    }

    @Override
    public float i() {
        return this.n() + this.a();
    }

    @Override
    public boolean b(int n2, double d2, double d3) {
        for (fz fz2 : this.b()) {
            double d4 = d2;
            double d5 = d3;
            int n3 = n2;
            float f2 = fz2.d;
            float f3 = fz2.c;
            float f4 = fz2.b;
            if (!fz2.a.a(d4, d5, n3, f2, f3, f4)) continue;
            return true;
        }
        return false;
    }

    private List b() {
        ArrayList<fz> arrayList = new ArrayList<fz>();
        float f2 = this.a + 4.0f;
        float f3 = this.c - 8.0f;
        for (jJ jJ2 : this.T.a()) {
            if (!(jJ2.i.a() > 0.5f)) continue;
            arrayList.add(new fz(jJ2, f2, jJ2.i.c(), f3));
        }
        return arrayList;
    }

    @Override
    public boolean b(int n2, int n3, int n4) {
        for (jJ jJ2 : this.T.a()) {
            bE bE2;
            if (!(jJ2 instanceof bE) || !(bE2 = (bE)jJ2).a(n2)) continue;
            return true;
        }
        return false;
    }

    static /* synthetic */ float b(gf gf2) {
        return gf2.c;
    }

    private float b() {
        float f2 = this.T.a();
        return f2 <= 0.001f ? 0.0f : 8.0f + f2;
    }

    private void c() {
        float f2;
        if (!this.T.a(fk.a())) {
            return;
        }
        List list = this.a();
        ArrayList<fa> arrayList = new ArrayList<fa>(list.size());
        for (Object object2 : list) {
            arrayList.add(((jJ)object2).h);
        }
        float f3 = f2 = this.Z ? 0.0f : 0.04f;
        Function<Object, jJ> function = object -> this.S.get((fa)object);
        ArrayList<fa> arrayList2 = arrayList;
        this.T.a(f3, arrayList2, function);
        this.T.a(arrayList);
        if (this.Z) {
            for (jJ jJ2 : this.T.a()) {
                jJ2.i.a();
            }
            this.W = false;
            this.Z = false;
        }
        this.T.a();
    }

    static /* synthetic */ float c(gf gf2) {
        return gf2.b;
    }

    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        float f5;
        this.c();
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
        if (this.T.a() || !this.T.b()) {
            this.d = f14 - this.b;
            return;
        }
        if (!Float.isNaN(this.Y) && this.Y != f14) {
            this.T.b();
        }
        this.Y = f14;
        this.f();
        float f15 = this.V;
        float f16 = f2;
        int n2 = gD.elevated();
        float f17 = 8.0f;
        float f18 = f15;
        float f19 = this.c;
        float f20 = f14;
        float f21 = this.a;
        Matrix4f matrix4f4 = matrix4f;
        dP.a(f17, f21, n2, matrix4f4, f18, f19, f16, f20);
        float f22 = this.a + 4.0f;
        float f23 = this.c - 8.0f;
        this.T.a(f14 + 4.0f);
        for (jJ jJ2 : this.T.a()) {
            float f24 = jJ2.i.a();
            if (f24 <= 0.001f) continue;
            float f25 = f2 * f24;
            float f26 = f3;
            float f27 = f4;
            float f28 = f23;
            float f29 = jJ2.i.c();
            float f30 = f22;
            jJ jJ3 = jJ2;
            Matrix4f matrix4f5 = matrix4f;
            this.a(f29, f30, matrix4f5, f25, jJ3, f27, f28, f26);
        }
        this.d = f14 - this.b + f15;
    }

    private float n() {
        float f2 = this.a(this.c);
        float f3 = this.b(this.c);
        return this.a(f2, f3) + 8.0f;
    }

    @Override
    public float f() {
        this.c();
        float f2 = this.U.a();
        float f3 = this.b();
        if (!this.W) {
            this.V = f3;
            this.W = true;
        } else {
            float f4 = 0.1f;
            float f5 = f2;
            float f6 = f3;
            float f7 = this.V;
            this.V = im.a(f6, f7, f5, f4);
        }
        return this.n() + this.V;
    }

    static /* synthetic */ float f(gf gf2) {
        return gf2.b;
    }

    static /* synthetic */ float d(gf gf2) {
        return gf2.a;
    }

    private jJ a(fa fa2) {
        if (fa2 instanceof bu) {
            bu bu2 = (bu)fa2;
            return new bE(bu2);
        }
        if (fa2 instanceof kn) {
            kn kn2 = (kn)fa2;
            return new bE(kn2);
        }
        if (fa2 instanceof dw) {
            dw dw2 = (dw)fa2;
            return new aI(dw2);
        }
        if (fa2 instanceof gz) {
            gz gz2 = (gz)fa2;
            return new iK(this, gz2);
        }
        if (fa2 instanceof lw) {
            lw lw2 = (lw)fa2;
            return new et(this, lw2);
        }
        if (fa2 instanceof iP) {
            iP iP2 = (iP)fa2;
            return new bJ(this, iP2);
        }
        return null;
    }

    static /* synthetic */ float a(gf gf2) {
        return gf2.a;
    }

    private static int a(float f2) {
        float f3 = 0.85f;
        int n2 = gD.elevated();
        int n3 = gD.background();
        int n4 = bC.a(n2, f3, n3);
        float f4 = f2;
        int n5 = n4;
        int n6 = gD.background();
        return bC.a(n5, f4, n6);
    }

    private void a(float f2, float f3, float f4, Matrix4f matrix4f, jJ jJ2, float f5, float f6) {
        String string;
        class_1058 class_10582;
        class_1799 class_17992;
        float f7 = f2 + 8.0f;
        float f8 = f4 + 5.0f;
        class_1799 class_17993 = class_17992 = this.R.a() != null ? (class_1799)this.R.a().apply(jJ2.h) : null;
        if (class_17992 != null && !class_17992.method_7960()) {
            float f9 = f6;
            float f10 = 16.0f;
            float f11 = f8;
            float f12 = f7;
            class_1799 class_17994 = class_17992;
            Matrix4f matrix4f2 = matrix4f;
            ir.a(f10, f9, f12, class_17994, matrix4f2, f11);
            return;
        }
        class_1058 class_10583 = class_10582 = this.R.b() != null ? (class_1058)this.R.b().apply(jJ2.h) : null;
        if (class_10582 != null) {
            float f13 = f6;
            int n2 = -1;
            float f14 = 0.0f;
            float f15 = 0.0f;
            float f16 = 0.0f;
            float f17 = 0.0f;
            float f18 = class_10582.method_4575();
            float f19 = class_10582.method_4577();
            float f20 = class_10582.method_4593();
            float f21 = class_10582.method_4594();
            float f22 = 16.0f;
            float f23 = 16.0f;
            float f24 = f8;
            float f25 = f7;
            class_2960 class_29602 = class_10582.method_45852();
            Matrix4f matrix4f3 = matrix4f;
            iQ.a(f25, f23, f19, f22, f18, f14, n2, f24, f15, matrix4f3, class_29602, f17, f21, f20, f13, f16);
            return;
        }
        float f26 = f6;
        int n3 = gD.mutedFg();
        float f27 = 16.0f;
        float f28 = 16.0f;
        float f29 = f8;
        float f30 = f7;
        kD kD2 = kD.INFO;
        Matrix4f matrix4f4 = matrix4f;
        jr.a(f26, n3, matrix4f4, f29, kD2, f27, f30, f28);
        if (f5 >= f7 && f5 <= f7 + 16.0f && f3 >= f8 && f3 <= f8 + 16.0f && (string = jJ2.h.h()) != null && !string.isEmpty()) {
            float f31 = 16.0f;
            float f32 = f8;
            float f33 = f7;
            String string2 = string;
            fi.a(f31, string2, f33, f32);
        }
    }

    private void a(float f2, float f3, Matrix4f matrix4f, float f4, jJ jJ2, float f5, float f6, float f7) {
        int n2;
        Object object;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12 = f4;
        float f13 = 3.0f;
        float f14 = 1.0f;
        float f15 = 0.0f;
        int n3 = 0x1A000000;
        float f16 = 0.0f;
        int n4 = 0;
        int n5 = gD.surface();
        float f17 = 8.0f;
        float f18 = 8.0f;
        float f19 = 8.0f;
        float f20 = 8.0f;
        float f21 = 26.0f;
        float f22 = f6;
        float f23 = f2;
        float f24 = f3;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f22, n3, n5, f24, f23, f13, f20, f21, f14, matrix4f2, f12, n4, f18, f16, f19, f17, f15);
        if (jJ2 instanceof bJ) {
            bJ bJ2 = (bJ)jJ2;
            f11 = f4 * bJ2.a();
        } else {
            f11 = f4;
        }
        float f25 = f10 = f11;
        float f26 = f7;
        float f27 = f5;
        float f28 = f2;
        float f29 = f3;
        jJ jJ3 = jJ2;
        Matrix4f matrix4f3 = matrix4f;
        this.a(f29, f26, f28, matrix4f3, jJ3, f27, f25);
        float f30 = f3 + 8.0f + 16.0f + 6.0f;
        float f31 = f2 + 7.0f;
        if (jJ2 instanceof bJ) {
            bJ bJ3 = (bJ)jJ2;
            float f32 = f6;
            float f33 = f3;
            f9 = bJ3.a(f32, f33);
            f8 = 3.0f;
        } else if (jJ2 instanceof et) {
            et et2 = (et)jJ2;
            f9 = et2.a(f3, f6);
            f8 = 3.0f;
        } else {
            f9 = f3 + 141.0f;
            f8 = 4.0f;
        }
        float f34 = f9 - f30 - f8;
        if (jJ2 instanceof bJ) {
            object = (bJ)jJ2;
            float f35 = ((bJ)object).e.b();
            int n6 = gD.foreground();
            int n7 = gD.mutedFg();
            n2 = bC.a(n6, f35, n7);
        } else {
            n2 = gD.foreground();
        }
        int n8 = n2;
        Object object2 = object = gf.a() ? fc.a().b(jJ2.h.e()) : null;
        if (object != null) {
            if (ao.a((String)object, 12.0f) > f34) {
                float f36 = f34;
                bJ bJ4 = object;
                object = gf.a(f36, (String)((Object)bJ4));
            }
            float f37 = f4;
            int n9 = n8;
            float f38 = 12.0f;
            float f39 = f31;
            float f40 = f30;
            bJ bJ5 = object;
            Matrix4f matrix4f4 = matrix4f;
            ao.a(f39, f40, n9, f38, f37, (String)((Object)bJ5), matrix4f4);
        } else {
            float f41 = 12.0f;
            String[] stringArray = jJ2.h.a();
            String[] stringArray2 = stringArray;
            if (ao.a(f41, stringArray2) > f34) {
                float f42 = ao.a("...", 12.0f);
                float f43 = 12.0f;
                float f44 = f34 - f42;
                String[] stringArray3 = stringArray;
                int n10 = ao.a(f43, f44, stringArray3);
                float f45 = f4;
                int n11 = n8;
                float f46 = 12.0f;
                float f47 = f31;
                float f48 = f30;
                int n12 = n10;
                int n13 = 0;
                String[] stringArray4 = stringArray;
                Matrix4f matrix4f5 = matrix4f;
                ao.a(n13, f45, stringArray4, f48, matrix4f5, n12, n11, f46, f47);
                float f49 = 12.0f;
                int n14 = n10;
                int n15 = 0;
                String[] stringArray5 = stringArray;
                float f50 = f4;
                int n16 = n8;
                float f51 = 12.0f;
                float f52 = f31;
                float f53 = f30 + ao.a(n15, stringArray5, f49, n14);
                String string = "...";
                Matrix4f matrix4f6 = matrix4f;
                ao.a(f52, f53, n16, f51, f50, string, matrix4f6);
            } else {
                float f54 = f4;
                int n17 = n8;
                float f55 = 12.0f;
                float f56 = f31;
                float f57 = f30;
                int n18 = stringArray.length;
                int n19 = 0;
                String[] stringArray6 = stringArray;
                Matrix4f matrix4f7 = matrix4f;
                ao.a(n19, f54, stringArray6, f57, matrix4f7, n18, n17, f55, f56);
            }
        }
        float f58 = f4;
        float f59 = f7;
        float f60 = f5;
        float f61 = f6;
        float f62 = f2;
        float f63 = f3;
        Matrix4f matrix4f8 = matrix4f;
        jJ2.a(f58, f59, f60, f63, f61, matrix4f8, f62);
    }

    private float a() {
        int n2 = 0;
        for (fa fa2 : this.R.a()) {
            if (!fa2.d()) continue;
            ++n2;
        }
        if (n2 == 0) {
            return 0.0f;
        }
        return 8.0f + (float)n2 * 26.0f + (float)(n2 - 1) * 4.0f;
    }

    private List a() {
        ArrayList<jJ> arrayList = new ArrayList<jJ>(this.R.a().size());
        for (fa fa2 : this.R.a()) {
            jJ jJ2;
            if (!fa2.d() || (jJ2 = this.S.computeIfAbsent(fa2, this::a)) == null) continue;
            arrayList.add(jJ2);
        }
        return arrayList;
    }

    @Override
    public boolean a(int n2, int n3, int n4) {
        for (jJ jJ2 : this.T.a()) {
            bE bE2;
            if (!(jJ2 instanceof bE) || !(bE2 = (bE)jJ2).a(n4, n3)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean a(double d2, double d3, int n2) {
        if (n2 != 0) {
            return false;
        }
        if (this.X != null) {
            this.X = null;
            return true;
        }
        boolean bl2 = false;
        for (jJ jJ2 : this.T.a()) {
            if (jJ2 instanceof aI) {
                aI aI2 = (aI)jJ2;
                if (aI2.b.a(d2, d3, n2)) {
                    bl2 = true;
                    continue;
                }
            }
            if (!(jJ2 instanceof bJ)) continue;
            bJ bJ2 = (bJ)jJ2;
            if (!bJ2.d.a(d2, d3, n2)) continue;
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public boolean a(double d2, double d3, int n2, double d4, double d5) {
        if (n2 != 0) {
            return false;
        }
        if (this.X != null) {
            for (fz fz2 : this.b()) {
                jJ jJ2 = fz2.a;
                if (!(jJ2 instanceof iK)) continue;
                iK iK2 = (iK)jJ2;
                if (iK2.a != this.X) continue;
                iK2.a(d3, fz2.b);
                return true;
            }
            return false;
        }
        for (jJ jJ3 : this.T.a()) {
            jJ jJ4;
            if (jJ3 instanceof aI) {
                jJ4 = (aI)jJ3;
                double d6 = d2;
                double d7 = d3;
                int n3 = n2;
                double d8 = d4;
                double d9 = d5;
                if (jJ4.b.a(d6, d7, n3, d8, d9)) {
                    return true;
                }
            }
            if (!(jJ3 instanceof bJ)) continue;
            jJ4 = (bJ)jJ3;
            double d10 = d2;
            double d11 = d3;
            int n4 = n2;
            double d12 = d4;
            double d13 = d5;
            if (!((bJ)jJ4).d.a(d10, d11, n4, d12, d13)) continue;
            return true;
        }
        return false;
    }

    private static String a(float f2, String string) {
        String string2 = "...";
        float f3 = ao.a(string2, 12.0f);
        StringBuilder stringBuilder = new StringBuilder(string);
        while (!stringBuilder.isEmpty() && ao.a(stringBuilder.toString(), 12.0f) + f3 > f2) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        return String.valueOf(stringBuilder) + string2;
    }
}

