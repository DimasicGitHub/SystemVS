/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ji
extends gh {
    private static final float k = 2.0f;
    private static final float l = 64.0f;
    private static final float m = 16.0f;
    private static final float n = 3.0f;
    private static final float o = 4.0f;
    private static final float p = 48.0f;
    private static final float q = 4.0f;
    private static final float r = 4.0f;
    private static float s;
    private static float t;
    private final List<bq> u = new ArrayList<bq>();
    private int[] v = new int[0];
    private final bo w = jm.b(0.0f, 0.28f);
    private float x;
    private float y;
    private float z = 301.0f;
    private boolean A;
    private float B;
    private final float[] C = new float[3];
    private final float[] D = new float[3];

    public ji() {
        this.c = 963.0f;
    }

    private float e() {
        float f2 = this.f();
        float f3 = this.w.b();
        float f4 = 48.0f;
        float f5 = this.d();
        float f6 = this.c();
        return aR.a(f3, f5, f4, f2, f6);
    }

    @Override
    public boolean b(int n2, double d2, double d3) {
        bq bq2 = null;
        for (bq bq3 : this.u) {
            if (!bq3.d()) continue;
            bq2 = bq3;
            break;
        }
        if (bq2 != null) {
            int n3 = n2;
            double d4 = d2;
            double d5 = d3;
            if (bq2.b(n3, d4, d5)) {
                return true;
            }
            bq2.g();
            return true;
        }
        if (n2 == 0 && this.f() > 0.001f && this.d() > 48.0f) {
            double d6;
            double d7;
            float f2 = 48.0f;
            float f3 = 12.0f;
            float f4 = this.e();
            float f5 = this.b() - 4.0f;
            if (ji.a(f5, f4, d7 = d3, f2, f3, d6 = d2)) {
                this.A = true;
                this.B = (float)d3 - this.e();
                return true;
            }
        }
        if (d2 < (double)this.a || d2 > (double)(this.a + this.c) || d3 < (double)s || d3 > (double)t) {
            return false;
        }
        for (bq bq3 : this.u) {
            double d8;
            double d9;
            int n4;
            if (!bq3.b(n4 = n2, d9 = d2, d8 = d3)) continue;
            return true;
        }
        return false;
    }

    private void b() {
        this.x = Math.clamp((float)this.x, (float)0.0f, (float)this.f());
        this.w.c(this.x);
    }

    private float b() {
        return this.a + this.c - 4.0f - 4.0f;
    }

    @Override
    public boolean b(int n2, int n3, int n4) {
        for (bq bq2 : this.u) {
            int n5;
            int n6;
            int n7;
            if (!bq2.b(n7 = n2, n6 = n3, n5 = n4)) continue;
            return true;
        }
        return false;
    }

    public void b(float f2) {
        this.x = Math.max(0.0f, f2);
        this.w.c(this.x);
    }

    private float c() {
        return this.b + 16.0f;
    }

    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        Object object;
        int n2;
        for (bq bq2 : this.u) {
            bq2.c();
        }
        this.a();
        float f5 = this.w.a();
        float f6 = this.a + 16.0f;
        float f7 = this.b + 16.0f - f5;
        float f8 = this.z + 16.0f;
        float[] fArray = this.D;
        fArray[0] = 0.0f;
        fArray[1] = 0.0f;
        fArray[2] = 0.0f;
        float f9 = Math.max(0.0f, this.d - 2.0f);
        s = this.b;
        t = this.b + f9;
        float f10 = f9;
        float f11 = this.c;
        float f12 = this.b;
        float f13 = this.a;
        aM.b(f11, f10, f12, f13);
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            boolean bl2;
            float f14;
            bq bq3 = this.u.get(i2);
            n2 = i2 < this.v.length ? this.v[i2] : 0;
            object = bq3.a();
            float f15 = f6 + (float)n2 * f8;
            float f16 = f14 = f7 + fArray[n2];
            float f17 = f15;
            bq3.c(f16, f17);
            bq3.b();
            boolean bl3 = bl2 = f14 + object > this.b && f14 < this.b + f9;
            if (bl2) {
                float f18 = f2;
                float f19 = f3;
                float f20 = f4;
                Matrix4f matrix4f2 = matrix4f;
                bq3.c(f18, f19, f20, matrix4f2);
            }
            int n3 = n2;
            fArray[n3] = fArray[n3] + (object + 16.0f);
        }
        aM.b();
        float f21 = f9;
        float f22 = this.c;
        float f23 = this.b;
        float f24 = this.a;
        aM.b(f22, f21, f23, f24);
        for (bq bq3 : this.u) {
            float f25 = f2;
            float f26 = f3;
            float f27 = f4;
            Matrix4f matrix4f3 = matrix4f;
            bq3.d(f26, f27, f25, matrix4f3);
        }
        aM.b();
        this.y = 0.0f;
        Object object2 = fArray;
        int n4 = ((Object)object2).length;
        for (n2 = 0; n2 < n4; ++n2) {
            object = object2[n2];
            if (!(object > this.y)) continue;
            this.y = object;
        }
        this.b();
        float f28 = f2;
        float f29 = f5;
        Matrix4f matrix4f4 = matrix4f;
        this.a(matrix4f4, f28, f29);
    }

    private float f() {
        return Math.max(0.0f, this.y - this.d + 16.0f);
    }

    private float d() {
        return Math.max(0.0f, this.d - 2.0f - 32.0f);
    }

    private static int a(float f2, int n2) {
        int n3 = Math.clamp((long)((int)(255.0f * f2)), (int)0, (int)255);
        return n3 << 24 | n2 & 0xFFFFFF;
    }

    public void a(aT aT2) {
        if (aT2 == null) {
            return;
        }
        int n2 = -1;
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            if (this.u.get(i2).a() != aT2) continue;
            n2 = i2;
            break;
        }
        if (n2 < 0) {
            return;
        }
        bq bq2 = this.u.get(n2);
        bq2.a(false);
        int n3 = n2 < this.v.length ? this.v[n2] : 0;
        float f2 = 0.0f;
        for (int i3 = 0; i3 < n2; ++i3) {
            int n4;
            int n5 = n4 = i3 < this.v.length ? this.v[i3] : 0;
            if (n4 != n3) continue;
            f2 += this.u.get(i3).b() + 16.0f;
        }
        this.x = f2;
        this.w.c(this.x);
        bq2.d();
    }

    @Override
    public boolean a(int n2, char c2) {
        for (bq bq2 : this.u) {
            char c3;
            int n3;
            if (!bq2.a(n3 = n2, c3 = c2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean a(int n2, int n3, int n4) {
        for (bq bq2 : this.u) {
            int n5;
            int n6;
            int n7;
            if (!bq2.a(n7 = n2, n6 = n3, n5 = n4)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean a(double d2, double d3, double d4) {
        if (d3 >= (double)this.a && d3 <= (double)(this.a + this.c) && d4 >= (double)this.b && d4 <= (double)(this.b + this.d)) {
            for (bq bq2 : this.u) {
                double d5;
                double d6;
                double d7;
                if (!bq2.a(d7 = d2, d6 = d3, d5 = d4)) continue;
                return true;
            }
            this.x = Math.clamp((float)(this.x - (float)(d2 * 48.0)), (float)0.0f, (float)this.f());
            this.w.c(this.x);
            return true;
        }
        return false;
    }

    @Override
    public boolean a(double d2, double d3, int n2, double d4, double d5) {
        if (this.A && n2 == 0) {
            float f2 = this.f();
            float f3 = 48.0f;
            float f4 = this.d();
            float f5 = this.c();
            float f6 = (float)d2 - this.B;
            this.x = aR.b(f3, f4, f2, f6, f5);
            this.w.c(this.x);
            return true;
        }
        for (bq bq2 : this.u) {
            double d6;
            double d7;
            int n3;
            double d8;
            double d9;
            if (!bq2.a(d9 = d2, d8 = d3, n3 = n2, d7 = d4, d6 = d5)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean a(double d2, double d3, int n2) {
        if (this.A && n2 == 0) {
            this.A = false;
            return true;
        }
        for (bq bq2 : this.u) {
            if (!bq2.a(d2, d3, n2)) continue;
            return true;
        }
        return false;
    }

    public List a() {
        return this.u;
    }

    public void a(float f2) {
        this.x = Math.max(0.0f, f2);
        this.w.b(this.x);
    }

    public float a() {
        return this.x;
    }

    private Set a() {
        jE jE2 = hJ.a();
        return jE2 == null ? Set.of() : new HashSet(jE2.c());
    }

    public void a(List list) {
        this.u.clear();
        Set set = this.a();
        for (aT aT2 : list) {
            bq bq2 = new bq(aT2);
            bq2.a(this.z);
            bq2.b(set.contains(aT2.b()));
            this.u.add(bq2);
        }
        this.a();
        this.x = 0.0f;
        this.w.b(0.0f);
    }

    public void a(float f2, float f3) {
        this.c = f3;
        float f4 = 358.0f;
        float f5 = f2;
        float f6 = 301.0f;
        float f7 = jm.a(f4, f5, f6);
        if (Math.abs(f7 - this.z) <= 0.001f) {
            return;
        }
        this.z = f7;
        for (bq bq2 : this.u) {
            bq2.a(this.z);
        }
        this.a();
        this.b();
    }

    public void a(Matrix4f matrix4f, float f2) {
        bp bp2 = bp.a();
        if (bp2 != null && bp2.c()) {
            return;
        }
        float f3 = this.w.b();
        float f4 = this.f();
        float f5 = f2 * Math.clamp((float)(f3 / 16.0f), (float)0.0f, (float)1.0f);
        float f6 = f2 * Math.clamp((float)((f4 - f3) / 16.0f), (float)0.0f, (float)1.0f);
        int n2 = gD.background() & 0xFFFFFF;
        float f7 = this.c - 3.0f;
        if (f5 > 0.001f) {
            float f8 = f5;
            int n3 = n2;
            int n4 = n2;
            int n5 = ji.a(f8, n3);
            float f9 = 64.0f;
            float f10 = f7;
            float f11 = this.b;
            float f12 = this.a;
            Matrix4f matrix4f2 = matrix4f;
            dP.a(n5, matrix4f2, f10, n4, f9, f12, f11);
        }
        if (f6 > 0.001f) {
            float f13 = f6;
            int n6 = n2;
            float f14 = 1.0f;
            int n7 = ji.a(f13, n6);
            int n8 = n2;
            float f15 = 12.0f;
            float f16 = 64.0f;
            float f17 = f7;
            float f18 = this.b + this.d - 64.0f;
            float f19 = this.a;
            Matrix4f matrix4f3 = matrix4f;
            dP.a(f15, n7, f14, f18, f16, f17, f19, n8, matrix4f3);
        }
    }

    private void a(Matrix4f matrix4f, float f2, float f3) {
        if (this.f() <= 0.001f || this.d() <= 48.0f) {
            return;
        }
        float f4 = this.f();
        float f5 = f3;
        float f6 = 48.0f;
        float f7 = this.d();
        float f8 = this.c();
        float f9 = aR.a(f5, f7, f6, f4, f8);
        float f10 = f2;
        int n2 = gD.surface();
        float f11 = 2.0f;
        float f12 = 48.0f;
        float f13 = 4.0f;
        float f14 = f9;
        float f15 = this.b();
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f11, f15, n2, matrix4f2, f12, f13, f10, f14);
    }

    public void a(boolean bl2) {
        for (bq bq2 : this.u) {
            bq2.a(bl2);
        }
    }

    private void a() {
        int n2 = this.u.size();
        if (this.v.length != n2) {
            this.v = new int[n2];
        }
        float[] fArray = this.C;
        fArray[0] = 0.0f;
        fArray[1] = 0.0f;
        fArray[2] = 0.0f;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = 0;
            for (int i3 = 1; i3 < 3; ++i3) {
                if (!(fArray[i3] < fArray[n3])) continue;
                n3 = i3;
            }
            this.v[i2] = n3;
            int n4 = n3;
            fArray[n4] = fArray[n4] + (this.u.get(i2).b() + 16.0f);
        }
    }

    public void a(Set set) {
        if (set == null) {
            return;
        }
        for (bq bq2 : this.u) {
            String string = bq2.a().b();
            bq2.b(set.contains(string));
        }
        this.a();
    }
}

