/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_276;
import net.minecraft.class_408;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector4f;
import org.lwjgl.glfw.GLFW;

public final class dz {
    private static volatile /* synthetic */ boolean a;
    private final /* synthetic */ gu b;
    private final /* synthetic */ hP c;
    private final /* synthetic */ hP d;
    private final /* synthetic */ im e;
    private final /* synthetic */ ar f;
    private final /* synthetic */ Vector4f g;
    private /* synthetic */ hP h;
    private /* synthetic */ boolean i;
    private /* synthetic */ boolean j;
    private /* synthetic */ boolean k;
    private /* synthetic */ boolean l;
    private /* synthetic */ int m;
    private /* synthetic */ boolean n;
    private /* synthetic */ boolean o;
    private /* synthetic */ double p;
    private /* synthetic */ double q;
    private /* synthetic */ float r;
    private /* synthetic */ float s;
    private /* synthetic */ long t;

    public /* synthetic */ dz(gu gu2) {
        this.e = new im();
        this.f = new ar(0.0f);
        this.g = new Vector4f();
        this.k = true;
        this.m = -1;
        this.o = true;
        this.b = gu2;
        this.c = new hP(gu2.a(), gu2.b(), gu2.c());
        this.d = new hP(gu2.d(), gu2.e(), gu2.f());
    }

    private /* bridge */ /* synthetic */ boolean e() {
        hP hP2;
        double d2;
        double d3;
        hP hP3;
        double d4;
        double d5;
        hP hP4;
        double d6 = lo.aM.field_1729.method_1603();
        double d7 = lo.aM.field_1729.method_1604();
        boolean bl2 = dz.f();
        if (bl2 && !this.l) {
            double d8 = d7;
            double d9 = d6;
            hP4 = this.a(d8, d9);
            if (hP4 != null) {
                this.h = hP4;
                this.p = d6;
                this.q = d7;
                this.r = hP4.j;
                this.s = hP4.k;
            }
        } else if (!bl2 && this.l) {
            this.d();
        }
        this.l = bl2;
        boolean bl3 = this.j = this.h != null || this.a(d5 = d6, d4 = d7, hP3 = this.c) || !this.b.a().a() && this.a(d3 = d6, d2 = d7, hP2 = this.d);
        if (this.h != null) {
            float f2 = (float)this.h.a.g();
            float f3 = (float)this.h.a.f();
            float f4 = this.r + (float)(d6 - this.p) / this.h.o;
            this.h.j = dz.a(f4, f2, f3);
            float f5 = (float)this.h.b.g();
            float f6 = (float)this.h.b.f();
            float f7 = this.s + (float)(d7 - this.q) / this.h.p;
            this.h.k = dz.a(f7, f5, f6);
        }
        if (this.h != null) {
            v1 = this.h;
        } else {
            double d10 = d7;
            double d11 = d6;
            v1 = hP4 = this.a(d10, d11);
        }
        if (hP4 == null) {
            return false;
        }
        this.k = hP4 == this.c;
        return true;
    }

    public /* bridge */ /* synthetic */ float b(boolean bl2) {
        return (bl2 ? this.c : this.d).g.a();
    }

    public /* bridge */ /* synthetic */ boolean b() {
        return lo.aM != null && lo.aM.field_1755 instanceof class_408;
    }

    public /* bridge */ /* synthetic */ void b() {
        this.d();
        this.f.a(0.0f);
        this.m = -1;
        this.j = false;
        this.e.a();
        this.c.a();
        this.d.a();
    }

    public static /* bridge */ /* synthetic */ float b() {
        return -0.72f;
    }

    public /* bridge */ /* synthetic */ float c() {
        return this.f.a();
    }

    public /* bridge */ /* synthetic */ void c() {
        if (this.h != null) {
            return;
        }
        this.m = -1;
        if (!this.j || lo.aM == null || lo.aM.method_22683() == null) {
            return;
        }
        class_276 class_2762 = dk.a();
        if (class_2762 == null) {
            return;
        }
        int n2 = (int)lo.aM.field_1729.method_1603();
        int n3 = class_2762.field_1481 - 1 - (int)lo.aM.field_1729.method_1604();
        if (n2 < 0 || n3 < 0 || n2 >= class_2762.field_1482 || n3 >= class_2762.field_1481) {
            return;
        }
        this.m = hm.a(class_2762.field_1476, n2, n3);
        this.n = this.d();
        this.o = this.k;
    }

    public /* bridge */ /* synthetic */ float c(boolean bl2) {
        return (bl2 ? this.c : this.d).h.a();
    }

    public /* bridge */ /* synthetic */ boolean c() {
        return this.j || this.d();
    }

    private static /* bridge */ /* synthetic */ boolean f() {
        if (lo.aM == null || lo.aM.method_22683() == null) {
            return false;
        }
        return GLFW.glfwGetMouseButton((long)lo.aM.method_22683().method_4490(), (int)0) == 1;
    }

    public /* bridge */ /* synthetic */ boolean d() {
        return this.f.a() > 0.004f;
    }

    private /* bridge */ /* synthetic */ void d() {
        if (this.h != null) {
            this.h.b();
            this.h = null;
        }
        this.l = false;
        a = false;
    }

    public /* bridge */ /* synthetic */ float d(boolean bl2) {
        return (bl2 ? this.c : this.d).i.a();
    }

    private /* bridge */ /* synthetic */ hP a(double d2, double d3) {
        boolean bl2;
        if (this.m < 10) {
            return null;
        }
        if (this.n) {
            return this.o ? this.c : this.d;
        }
        boolean bl3 = this.c.q >= this.t - 1L;
        boolean bl4 = bl2 = this.d.q >= this.t - 1L && !this.b.a().a();
        if (bl3 && bl2) {
            double d4 = d2;
            double d5 = d3;
            hP hP2 = this.c;
            double d6 = d2;
            double d7 = d3;
            hP hP3 = this.d;
            return dz.a(d4, d5, hP2) <= dz.a(d6, d7, hP3) ? this.c : this.d;
        }
        if (bl3) {
            return this.c;
        }
        return bl2 ? this.d : null;
    }

    private static /* bridge */ /* synthetic */ float a(float f2, float f3, float f4) {
        return f2 < f4 ? f4 : Math.min(f2, f3);
    }

    private /* bridge */ /* synthetic */ boolean a(double d2, double d3, hP hP2) {
        if (hP2.q < this.t - 1L) {
            return false;
        }
        float f2 = hP2.i.a();
        return Math.abs(d2 - (double)hP2.m) <= (double)(Math.abs(hP2.o) * 0.42f * f2) && Math.abs(d3 - (double)hP2.n) <= (double)(Math.abs(hP2.p) * 0.32f * f2);
    }

    private /* bridge */ /* synthetic */ boolean a(float f2, Matrix4f matrix4f, float f3, float[] fArray, float f4) {
        Vector4f vector4f = this.g.set(f4, f3, f2, 1.0f);
        matrix4f.transform(vector4f);
        if (vector4f.w <= 1.0E-4f) {
            return false;
        }
        float f5 = 1.0f / vector4f.w;
        fArray[0] = (vector4f.x * f5 * 0.5f + 0.5f) * (float)lo.aM.method_22683().method_4480();
        fArray[1] = (0.5f - vector4f.y * f5 * 0.5f) * (float)lo.aM.method_22683().method_4507();
        return true;
    }

    private static /* bridge */ /* synthetic */ double a(double d2, double d3, hP hP2) {
        double d4 = d3 - (double)hP2.m;
        double d5 = d2 - (double)hP2.n;
        return d4 * d4 + d5 * d5;
    }

    public static /* bridge */ /* synthetic */ float a() {
        return -0.52f;
    }

    public /* bridge */ /* synthetic */ void a() {
        boolean bl2;
        ++this.t;
        float f2 = this.e.a();
        this.i = this.b();
        boolean bl3 = bl2 = this.i && this.e();
        if (!this.i) {
            this.d();
            this.j = false;
        }
        a = this.h != null;
        float f3 = 0.05f;
        float f4 = f2;
        float f5 = bl2 ? 1.0f : 0.0f;
        this.f.a(f3, f5, f4);
        this.c.a(this.h == this.c, f2);
        this.d.a(this.h == this.d, f2);
    }

    public /* bridge */ /* synthetic */ void a(Matrix4f matrix4f, float f2, float f3, boolean bl2) {
        float f4;
        float f5;
        float f6;
        float[] fArray;
        float f7;
        float f8;
        float f9;
        hP hP2;
        if (!this.i) {
            return;
        }
        hP hP3 = hP2 = bl2 ? this.c : this.d;
        if (hP2.q == this.t || lo.aM == null || lo.aM.method_22683() == null) {
            return;
        }
        float f10 = -0.72f;
        Matrix4f matrix4f2 = hP2.d.set((Matrix4fc)RenderSystem.getProjectionMatrix()).mul((Matrix4fc)RenderSystem.getModelViewMatrix()).mul((Matrix4fc)matrix4f);
        Matrix4f matrix4f3 = matrix4f2;
        if (!this.a(f10, matrix4f3, f9 = (f8 = f2 + -0.52f + (f7 = hP2.i.a()) * 0.21999997f), fArray = hP2.e, f6 = (f5 = f3 + (f4 = dz.a(bl2)) + f7 * ((bl2 ? 0.5f : -0.5f) - f4)))) {
            return;
        }
        float f11 = -0.72f;
        Matrix4f matrix4f4 = matrix4f2;
        float f12 = f8;
        float[] fArray2 = hP2.f;
        float f13 = f5 + 1.0f;
        if (!this.a(f11, matrix4f4, f12, fArray2, f13)) {
            return;
        }
        float f14 = hP2.f[0] - hP2.e[0];
        float f15 = -0.72f;
        Matrix4f matrix4f5 = matrix4f2;
        float f16 = f8 + 1.0f;
        float[] fArray3 = hP2.f;
        float f17 = f5;
        if (!this.a(f15, matrix4f5, f16, fArray3, f17)) {
            return;
        }
        float f18 = hP2.f[1] - hP2.e[1];
        if (Math.abs(f14) < 0.001f || Math.abs(f18) < 0.001f) {
            return;
        }
        hP2.m = hP2.e[0];
        hP2.n = hP2.e[1];
        hP2.o = f14;
        hP2.p = f18;
        hP2.q = this.t;
    }

    public /* bridge */ /* synthetic */ boolean a(double d2) {
        if (this.h == null) {
            return false;
        }
        float f2 = (float)this.h.c.g();
        float f3 = (float)this.h.c.f();
        float f4 = this.h.l + (float)d2 * 0.06f;
        this.h.l = dz.a(f4, f2, f3);
        return true;
    }

    public static /* bridge */ /* synthetic */ float a(boolean bl2) {
        return bl2 ? 0.56f : -0.56f;
    }

    public /* bridge */ /* synthetic */ boolean a(boolean bl2) {
        return this.k == bl2;
    }

    public static /* bridge */ /* synthetic */ boolean a() {
        return a;
    }
}

