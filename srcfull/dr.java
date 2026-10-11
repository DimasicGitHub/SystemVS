/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class dr<C extends iC, A extends gh>
extends fX {
    protected static final int k = 3;
    private static final float l = 2.0f;
    protected final List<C> m = new ArrayList<C>();
    protected float n;
    protected boolean o;
    private float p;
    private float q;

    protected dr() {
        this.c = 963.0f;
        this.n = this.a();
    }

    @Override
    public boolean b(int n2, double d2, double d3) {
        double d4;
        double d5;
        int n3;
        if (d2 < (double)this.a || d2 > (double)(this.a + this.c) || d3 < (double)this.b || d3 > (double)this.q) {
            return false;
        }
        for (iC iC2 : List.copyOf(this.m)) {
            double d6;
            double d7;
            int n4;
            if (!iC2.b(n4 = n2, d7 = d2, d6 = d3)) continue;
            return true;
        }
        gh gh2 = this.a();
        return gh2 != null && gh2.b(n3 = n2, d5 = d2, d4 = d3);
    }

    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        this.m.removeIf(iC::g);
        float f5 = this.b();
        float f6 = this.a + 16.0f;
        float f7 = this.b + 16.0f - f5;
        float f8 = this.n + 16.0f;
        float[] fArray = new float[3];
        float f9 = Math.max(0.0f, this.d - 2.0f);
        this.q = this.b + f9;
        float f10 = f9;
        float f11 = this.c;
        float f12 = this.b;
        float f13 = this.a;
        aM.b(f11, f10, f12, f13);
        for (iC iC2 : this.m) {
            if (!iC2.i()) continue;
            float f14 = f2;
            float f15 = f3;
            float f16 = f4;
            Matrix4f matrix4f2 = matrix4f;
            iC2.c(f14, f15, f16, matrix4f2);
        }
        boolean bl2 = Math.abs(f5 - this.p) > 0.001f;
        boolean bl3 = this.o || bl2 || jX.a();
        this.p = f5;
        gh gh2 = this.a();
        boolean bl4 = bl3;
        float f17 = f7;
        float f18 = f6;
        gh gh3 = gh2;
        this.a(gh3, bl4, f18, f17);
        float f19 = f2;
        float f20 = f3;
        float f21 = f4;
        Matrix4f matrix4f3 = matrix4f;
        gh2.c(f19, f20, f21, matrix4f3);
        fArray[0] = fArray[0] + (gh2.d + 16.0f);
        int n2 = 1;
        for (Object object : this.m) {
            if (((iC)object).i()) continue;
            int n3 = n2++ % 3;
            float f22 = f6 + (float)n3 * f8;
            Object object2 = f7 + fArray[n3];
            if (bl3) {
                ((iC)object).a(f22, (float)object2);
            } else {
                Object object3 = object2;
                float f23 = f22;
                ((iC)object).c((float)object3, f23);
            }
            float f24 = f2;
            float f25 = f3;
            float f26 = f4;
            Matrix4f matrix4f4 = matrix4f;
            ((iC)object).c(f24, f25, f26, matrix4f4);
            int n4 = n3;
            fArray[n4] = fArray[n4] + (((iC)object).d + 16.0f);
        }
        this.o = false;
        aM.b();
        Object object = 0.0f;
        for (Object object2 : (Object)fArray) {
            if (!(object2 > object)) continue;
            object = object2;
        }
        this.b((float)object);
    }

    @Override
    public boolean a(int n2, int n3, int n4) {
        for (iC iC2 : this.m) {
            if (!iC2.h()) continue;
            int n5 = n3;
            int n6 = n2;
            int n7 = n4;
            return iC2.a(n6, n5, n7);
        }
        if (this.a()) {
            int n8 = n3;
            int n9 = n2;
            int n10 = n4;
            return this.a().a(n9, n8, n10);
        }
        return false;
    }

    protected abstract void a(gh var1, boolean var2, float var3, float var4);

    @Override
    public boolean a(int n2, char c2) {
        for (iC iC2 : this.m) {
            if (!iC2.h()) continue;
            int n3 = n2;
            char c3 = c2;
            return iC2.a(n3, c3);
        }
        if (this.a()) {
            int n4 = n2;
            char c4 = c2;
            return this.a().a(n4, c4);
        }
        return false;
    }

    protected abstract float a();

    protected abstract gh a();

    protected abstract void a(float var1);

    protected abstract boolean a();

    public void a(float f2, float f3) {
        this.c = f3;
        float f4 = 358.0f;
        float f5 = f2;
        float f6 = this.a();
        float f7 = jm.a(f4, f5, f6);
        if (Math.abs(f7 - this.n) <= 0.001f) {
            return;
        }
        this.n = f7;
        this.o = true;
        this.a(this.n);
        for (iC iC2 : this.m) {
            iC2.a(this.n);
        }
        this.b(this.u);
    }
}

