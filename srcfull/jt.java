/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class jt
extends gh {
    private final kp k;
    private final String l;
    private final float m;
    private final float n;
    private final float o;
    private boolean p;
    private final bo q = jm.a(0.0f, 0.15f);
    private Consumer<String> r;

    public jt(float f2, float f3, String string2, float f4, float f5, float f6) {
        this.c = f2;
        this.d = f3;
        this.l = string2;
        this.n = f4;
        this.m = f5;
        this.o = f6;
        this.k = new kp(f4);
        this.k.a((T string) -> {
            if (this.r != null) {
                this.r.accept((String)string);
            }
        });
    }

    @Override
    public boolean b(int n2, double d2, double d3) {
        if (n2 != 0) {
            return false;
        }
        boolean bl2 = this.d(d2, d3);
        this.a(bl2);
        return bl2;
    }

    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        float f5;
        float f6 = f5 = this.q.a();
        int n2 = gD.primary();
        int n3 = gD.border();
        int n4 = bC.a(n2, f6, n3);
        float f7 = f2;
        float f8 = 1.0f;
        float f9 = 1.0f;
        float f10 = 0.0f;
        int n5 = 0x1A000000;
        float f11 = 1.0f;
        int n6 = n4;
        int n7 = gD.background();
        float f12 = 8.0f;
        float f13 = 8.0f;
        float f14 = 8.0f;
        float f15 = 8.0f;
        float f16 = this.d;
        float f17 = this.c;
        float f18 = this.b;
        float f19 = this.a;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f17, n5, n7, f19, f18, f8, f15, f16, f9, matrix4f2, f7, n6, f13, f11, f14, f12, f10);
        float f20 = this.b + (this.d - this.n) / 2.0f;
        float f21 = this.c - this.m * 2.0f - this.o;
        float f22 = this.d;
        float f23 = f21;
        float f24 = this.b;
        float f25 = this.a + this.m;
        aM.b(f23, f22, f24, f25);
        if (this.k.a() && !this.p) {
            String string = fc.a().a(this.l);
            ao.a(matrix4f, string, this.a + this.m, f20, this.n, gD.mutedFg(), f2);
        } else {
            boolean bl2 = this.p;
            float f26 = f2;
            int n8 = gD.foreground();
            float f27 = f21;
            float f28 = f20;
            float f29 = this.a + this.m;
            Matrix4f matrix4f3 = matrix4f;
            this.k.a(f28, n8, matrix4f3, f26, bl2, f29, f27);
        }
        aM.b();
    }

    public String a() {
        return this.k.a();
    }

    public float a() {
        return this.n;
    }

    @Override
    public boolean a(int n2, char c2) {
        if (!this.p) {
            return false;
        }
        return this.k.a(c2);
    }

    public boolean a() {
        return this.p;
    }

    public void a(Consumer consumer) {
        this.r = consumer;
    }

    public void a() {
        this.k.a();
    }

    public void a(Runnable runnable) {
        this.k.a(runnable);
    }

    public void a(boolean bl2) {
        if (this.p == bl2) {
            return;
        }
        this.p = bl2;
        this.q.c(bl2 ? 1.0f : 0.0f);
    }

    public void a(String string) {
        this.k.a(string);
    }

    @Override
    public boolean a(int n2, int n3, int n4) {
        if (!this.p) {
            return false;
        }
        if (n4 == 256) {
            this.a(false);
            return true;
        }
        int n5 = n3;
        int n6 = n4;
        return this.k.a(n5, n6);
    }
}

