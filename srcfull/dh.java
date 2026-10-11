/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class dh
extends gh {
    private static final float k = 16.0f;
    private static final float l = 20.0f;
    private static final float m = 14.0f;
    private static final float n = 6.0f;
    private static final float o = 0.001f;
    private static final float p = 0.5f;
    private static final float q = 0.22f;
    private static final String r = "Global";
    private final bl s = bl.a();
    private final List<cA> t = new ArrayList<cA>();
    private final Map<cA, bo> u = new HashMap<cA, bo>();
    private final bo v = jm.a(0.0f, 0.22f);
    private final s w;
    private boolean x;

    public dh() {
        this.c = 301.0f;
        this.w = new s(this.s.a());
        this.w.a(() -> this.s.e().a(this.w.a()));
        this.b();
        this.d = this.a();
        this.v.c(1.0f);
    }

    @Override
    public boolean b(int n2, double d2, double d3) {
        int n3 = n2;
        double d4 = d2;
        double d5 = d3;
        if (this.w.b(n3, d4, d5)) {
            return true;
        }
        return this.a((T cA2) -> {
            int n3 = n2;
            double d4 = d3;
            double d5 = d2;
            return cA2.b(n3, d5, d4);
        });
    }

    @Override
    public boolean b(int n2, int n3, int n4) {
        return this.a((T cA2) -> {
            int n5 = n3;
            int n6 = n4;
            int n7 = n2;
            return cA2.b(n7, n5, n6);
        });
    }

    public boolean b() {
        return this.x;
    }

    private void b() {
        this.t.clear();
        float f2 = this.b();
        for (fa object : this.s.a()) {
            cA cA2;
            if (object == this.s.e() || (cA2 = this.a(object)) == null) continue;
            cA2.a(f2);
            this.t.add(cA2);
        }
        this.u.keySet().retainAll(this.t);
        for (cA cA3 : this.t) {
            this.u.computeIfAbsent(cA3, this::a);
        }
    }

    private float b() {
        return this.c - 32.0f;
    }

    @Override
    public void c(float f2, float f3, float f4, Matrix4f matrix4f) {
        float f5;
        this.c();
        this.d = this.a();
        float f6 = this.a + 16.0f;
        float f7 = f2;
        float f8 = 6.0f;
        float f9 = 2.0f;
        float f10 = 0.0f;
        int n2 = 0x1A000000;
        float f11 = 1.0f;
        int n3 = gD.border();
        int n4 = gD.background();
        float f12 = 14.0f;
        float f13 = 14.0f;
        float f14 = 14.0f;
        float f15 = 14.0f;
        float f16 = this.d;
        float f17 = this.c;
        float f18 = this.b;
        float f19 = this.a;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f17, n2, n4, f19, f18, f8, f15, f16, f9, matrix4f2, f7, n3, f13, f11, f14, f12, f10);
        float f20 = this.b + 16.0f;
        float f21 = f2;
        float f22 = f6;
        Matrix4f matrix4f3 = matrix4f;
        float f23 = this.a(f21, f22, matrix4f3);
        float f24 = f20 + 4.0f;
        float f25 = f2;
        int n5 = gD.foreground();
        float f26 = 16.0f;
        float f27 = f24;
        float f28 = f23;
        String string = r;
        Matrix4f matrix4f4 = matrix4f;
        ao.a(f25, string, f26, f28, n5, f27, matrix4f4);
        this.w.a(this.s.a());
        float f29 = f6 + this.b() - 28.0f;
        float f30 = f5 = f20 + 4.0f;
        float f31 = f29;
        this.w.c(f30, f31);
        float f32 = f2;
        float f33 = f3;
        float f34 = f4;
        Matrix4f matrix4f5 = matrix4f;
        this.w.c(f32, f33, f34, matrix4f5);
        float f35 = f20 + 24.0f + 16.0f;
        float f36 = f2;
        int n6 = gD.border();
        float f37 = 1.0f;
        float f38 = this.b();
        float f39 = f35;
        float f40 = f6;
        Matrix4f matrix4f6 = matrix4f;
        dP.a(f36, f37, f40, f39, f38, matrix4f6, n6);
        this.a(f6, f35 + 1.0f + 16.0f);
        float f41 = f2;
        float f42 = f3;
        float f43 = f4;
        Matrix4f matrix4f7 = matrix4f;
        this.a(f43, matrix4f7, f41, f42);
    }

    private void c() {
        for (cA cA2 : this.t) {
            bo bo2 = this.u.get(cA2);
            if (bo2 == null) continue;
            bo2.c(cA2.a().d() ? 1.0f : 0.0f);
            bo2.a();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void d(float f2, float f3, float f4, Matrix4f matrix4f) {
        cP.a(0.0f, fk.a().b());
        try {
            for (cA cA2 : this.t) {
                float f5 = this.a(cA2);
                if (f5 <= 0.001f) continue;
                float f6 = f4 * f5;
                float f7 = f2;
                float f8 = f3;
                Matrix4f matrix4f2 = matrix4f;
                cA2.d(f7, f8, f6, matrix4f2);
            }
        }
        finally {
            cP.a();
        }
    }

    public void d() {
        for (cA cA2 : this.t) {
            if (!cA2.c()) continue;
            cA2.b();
        }
    }

    public float a() {
        float f2 = 73.0f;
        float f3 = 0.0f;
        for (cA cA2 : this.t) {
            float f4 = this.a(cA2);
            if (f4 <= 0.001f) continue;
            float f5 = cA2.g() * f4;
            float f6 = 16.0f * f4;
            f2 += f5 + (f3 > 0.0f ? f6 : 0.0f);
            f3 += f5 + f6;
        }
        return f2 + 16.0f;
    }

    @Override
    public boolean a(int n2, char c2) {
        return this.a((T cA2) -> {
            int n3 = n2;
            char c3 = c2;
            return cA2.a(n3, c3);
        });
    }

    private boolean a(Predicate predicate) {
        for (cA cA2 : this.t) {
            if (this.a(cA2) <= 0.5f || !predicate.test(cA2)) continue;
            return true;
        }
        return false;
    }

    private cA a(fa fa2) {
        if (fa2 instanceof dw) {
            dw dw2 = (dw)fa2;
            return new hr(dw2);
        }
        if (fa2 instanceof gz) {
            gz gz2 = (gz)fa2;
            return new Q(gz2);
        }
        if (fa2 instanceof fr) {
            fr fr2 = (fr)fa2;
            return new gl(fr2);
        }
        if (fa2 instanceof jh) {
            jh jh2 = (jh)fa2;
            return new gl(jh2);
        }
        return null;
    }

    private void a(float f2, float f3) {
        float f4 = f3;
        float f5 = 0.0f;
        for (cA cA2 : this.t) {
            float f6 = this.a(cA2);
            if (f6 <= 0.001f) continue;
            float f7 = 16.0f * f6;
            if (f5 > 0.0f) {
                f4 += f7;
            }
            float f8 = f4;
            float f9 = f2;
            cA2.c(f8, f9);
            float f10 = cA2.g() * f6;
            f4 += f10;
            f5 += f10 + f7;
        }
    }

    private bo a(cA cA2) {
        float f2 = cA2.a().d() ? 1.0f : 0.0f;
        bo bo2 = jm.a(f2, 0.22f);
        bo2.c(f2);
        return bo2;
    }

    public boolean a() {
        for (cA cA2 : this.t) {
            if (!cA2.c()) continue;
            return true;
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(Matrix4f matrix4f, class_332 class_3322, float f2, float f3, float f4) {
        float f5 = this.v.a();
        if (f5 <= 0.001f) {
            return;
        }
        float f6 = jm.c(f5);
        float f7 = (1.0f - f5) * -6.0f;
        float f8 = this.a + this.c / 2.0f;
        float f9 = this.b + this.d / 2.0f;
        class_4587 class_45872 = class_3322.method_51448();
        float f10 = f7;
        float f11 = f6;
        float f12 = f9;
        float f13 = f8;
        class_4587 class_45873 = class_45872;
        Matrix4f matrix4f2 = ca.a(f11, f13, f10, f12, class_45873);
        cP.a(0.0f, fk.a().b());
        try {
            float f14 = f2 * f5;
            float f15 = f4;
            float f16 = f3;
            Matrix4f matrix4f3 = matrix4f2;
            this.c(f14, f15, f16, matrix4f3);
        }
        finally {
            cP.a();
            class_45872.method_22909();
        }
    }

    private float a(float f2, float f3, Matrix4f matrix4f) {
        float f4 = this.b + 16.0f + 2.0f;
        float f5 = f2;
        int n2 = gD.elevated();
        float f6 = 4.0f;
        float f7 = 20.0f;
        float f8 = 20.0f;
        float f9 = f4;
        float f10 = f3;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f6, f10, n2, matrix4f2, f7, f8, f5, f9);
        kD kD2 = kD.SETTINGS;
        float f11 = Math.min(14.0f / kD2.getWidth(), 14.0f / kD2.getHeight());
        float f12 = kD2.getWidth() * f11;
        float f13 = kD2.getHeight() * f11;
        float f14 = f3 + (20.0f - f12) / 2.0f;
        float f15 = f4 + (20.0f - f13) / 2.0f;
        float f16 = f2;
        int n3 = gD.mutedFg();
        float f17 = f13;
        float f18 = f12;
        float f19 = f15;
        float f20 = f14;
        kD kD3 = kD2;
        Matrix4f matrix4f3 = matrix4f;
        jr.a(f16, n3, matrix4f3, f19, kD3, f17, f20, f18);
        return f3 + 20.0f + 6.0f;
    }

    private void a(float f2, Matrix4f matrix4f, float f3, float f4) {
        for (cA cA2 : this.t) {
            float f5 = this.a(cA2);
            if (f5 <= 0.001f) continue;
            float f6 = f3 * f5;
            float f7 = f4;
            float f8 = f2;
            Matrix4f matrix4f2 = matrix4f;
            cA2.c(f6, f7, f8, matrix4f2);
        }
    }

    public boolean a(double d2, double d3) {
        for (cA cA2 : this.t) {
            double d4;
            double d5;
            if (this.a(cA2) <= 0.5f || !cA2.c() || !cA2.c(d5 = d2, d4 = d3)) continue;
            return true;
        }
        return false;
    }

    public boolean a(float f2, float f3) {
        return f2 >= this.a && f2 <= this.a + this.c && f3 >= this.b && f3 <= this.b + this.d;
    }

    private float a(cA cA2) {
        bo bo2 = this.u.get(cA2);
        if (bo2 == null) {
            return cA2.a().d() ? 1.0f : 0.0f;
        }
        return bo2.b();
    }

    @Override
    public boolean a(int n2, int n3, int n4) {
        return this.a((T cA2) -> {
            int n5 = n3;
            int n6 = n2;
            int n7 = n4;
            return cA2.a(n6, n5, n7);
        });
    }

    @Override
    public boolean a(double d2, double d3, double d4) {
        return this.a((T cA2) -> {
            double d5 = d2;
            double d6 = d4;
            double d7 = d3;
            return cA2.a(d5, d7, d6);
        });
    }

    @Override
    public boolean a(double d2, double d3, int n2) {
        if (this.w.a(d2, d3, n2)) {
            return true;
        }
        return this.a((T cA2) -> cA2.a(d2, d3, n2));
    }

    @Override
    public boolean a(double d2, double d3, int n2, double d4, double d5) {
        double d6 = d2;
        double d7 = d3;
        int n3 = n2;
        double d8 = d4;
        double d9 = d5;
        if (this.w.a(d6, d7, n3, d8, d9)) {
            return true;
        }
        return this.a((T cA2) -> {
            double d6 = d5;
            double d7 = d4;
            int n3 = n2;
            double d8 = d2;
            double d9 = d3;
            return cA2.a(d8, d9, n3, d7, d6);
        });
    }

    public void a() {
        if (this.x) {
            return;
        }
        this.x = true;
        this.v.c(0.0f);
    }

    @Override
    public void k() {
        for (cA cA2 : this.t) {
            cA2.k();
        }
    }
}

