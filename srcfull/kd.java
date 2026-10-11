/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import org.lwjgl.glfw.GLFW;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class kd
implements fU {
    private static final float a = 8.0f;
    private final fk b;
    private final bO c;
    private jD d;
    private float e;
    private float f;

    public kd(fk fk2, bO bO2) {
        this.b = fk2;
        this.c = bO2;
    }

    private void b(float f2, float f3) {
        float f4 = f2 - this.f;
        float f5 = f3 - this.e;
        jD jD2 = this.d;
        float[] fArray = this.a(f5, f4, jD2);
        this.d.a(fArray[0], fArray[1]);
        this.d.f();
        float f6 = fArray[1];
        float f7 = fArray[0];
        jD jD3 = this.d;
        this.c.b(f6, f7, jD3);
    }

    private float a(jD jD2, float f2) {
        float f3 = jD2.A();
        float f4 = jD2.u() - jD2.O();
        float f5 = f2 + f4;
        float f6 = f5 + f3;
        float f7 = f5 + f3 / 2.0f;
        float f8 = this.b.a();
        ah ah2 = new ah(f2);
        ah2.a(f5, 0.0f);
        ah2.a(f6, f8);
        ah2.a(f7, f8 / 2.0f);
        for (jD jD3 : this.b.a()) {
            if (jD3 == jD2 || !kd.a(jD3)) continue;
            float f9 = jD3.u();
            float f10 = f9 + jD3.A();
            float f11 = f9 + jD3.A() / 2.0f;
            ah2.a(f5, f9);
            ah2.a(f6, f10);
            ah2.a(f5, f10 + 8.0f);
            ah2.a(f6, f9 - 8.0f);
            ah2.a(f7, f11);
        }
        return ah2.b;
    }

    private float a(float f2, jD jD2) {
        float f3 = jD2.t();
        float f4 = jD2.v() - jD2.P();
        float f5 = f2 + f4;
        float f6 = f5 + f3;
        float f7 = f5 + f3 / 2.0f;
        float f8 = this.b.b();
        ah ah2 = new ah(f2);
        ah2.a(f5, 0.0f);
        ah2.a(f6, f8);
        ah2.a(f7, f8 / 2.0f);
        for (jD jD3 : this.b.a()) {
            if (jD3 == jD2 || !kd.a(jD3)) continue;
            float f9 = jD3.v();
            float f10 = f9 + jD3.t();
            float f11 = f9 + jD3.t() / 2.0f;
            ah2.a(f5, f9);
            ah2.a(f6, f10);
            ah2.a(f5, f10 + 8.0f);
            ah2.a(f6, f9 - 8.0f);
            ah2.a(f7, f11);
        }
        return ah2.b;
    }

    public static boolean a(jD jD2) {
        return jD2.C() && jD2.w();
    }

    public jD a() {
        return this.d;
    }

    public static boolean a() {
        if (lo.aM == null || lo.aM.method_22683() == null) {
            return false;
        }
        long l2 = lo.aM.method_22683().method_4490();
        return GLFW.glfwGetKey((long)l2, (int)341) == 1 || GLFW.glfwGetKey((long)l2, (int)345) == 1;
    }

    public void a(float f2, boolean bl2, float f3, boolean bl3) {
        if (bl3 && !bl2) {
            float f4 = f3;
            float f5 = f2;
            this.a(f4, f5);
        } else if (bl3 && this.d != null) {
            float f6 = f3;
            float f7 = f2;
            this.b(f6, f7);
        } else if (!bl3 && bl2) {
            this.a();
        }
    }

    private void a(float f2, float f3) {
        if (dz.a()) {
            return;
        }
        List list = this.b.a();
        for (int i2 = list.size() - 1; i2 >= 0; --i2) {
            jD jD2 = (jD)list.get(i2);
            if (!kd.a(jD2) || !jD2.E() || !jD2.A(f3, f2)) continue;
            this.d = jD2;
            this.e = f3 - jD2.O();
            this.f = f2 - jD2.P();
            this.b.b(jD2);
            break;
        }
    }

    public void a() {
        if (this.d == null) {
            return;
        }
        float f2 = this.d.P();
        float f3 = this.d.O();
        jD jD2 = this.d;
        this.c.b(f2, f3, jD2);
        this.c.a(this.d);
        this.d = null;
    }

    private float[] a(float f2, float f3, jD jD2) {
        float f4;
        float f5 = jD2.O();
        float f6 = jD2.P();
        float f7 = f2;
        jD jD3 = jD2;
        float f8 = this.c.a(f7, jD3);
        float f9 = this.c.a(jD2, f3);
        if (!kd.a()) {
            f8 = this.a(jD2, f8);
            float f10 = f9;
            jD jD4 = jD2;
            f9 = this.a(f10, jD4);
        }
        float f11 = f8;
        jD jD5 = jD2;
        f8 = this.c.a(f11, jD5);
        jD jD6 = jD2;
        float f12 = f9 = this.c.a(jD2, f9);
        if (this.a(jD6, f12, f4 = f8)) {
            jD jD7 = jD2;
            float f13 = f9;
            float f14 = f5;
            if (!this.a(jD7, f13, f14)) {
                f8 = f5;
            } else {
                jD jD8 = jD2;
                float f15 = f6;
                float f16 = f8;
                if (!this.a(jD8, f15, f16)) {
                    f9 = f6;
                } else {
                    f8 = f5;
                    f9 = f6;
                }
            }
        }
        return new float[]{f8, f9};
    }

    private boolean a(jD jD2, float f2, float f3) {
        float f4 = jD2.A();
        float f5 = jD2.t();
        float f6 = jD2.u() - jD2.O();
        float f7 = jD2.v() - jD2.P();
        float f8 = f3 + f6;
        float f9 = f8 + f4;
        float f10 = f2 + f7;
        float f11 = f10 + f5;
        for (jD jD3 : this.b.a()) {
            if (jD3 == jD2 || !kd.a(jD3)) continue;
            float f12 = jD3.u();
            float f13 = f12 + jD3.A();
            float f14 = jD3.v();
            float f15 = f14 + jD3.t();
            if (!(f9 > f12) || !(f8 < f13) || !(f11 > f14) || !(f10 < f15)) continue;
            return true;
        }
        return false;
    }
}

