/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.BiConsumer;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class da
extends cs {
    private kC k;
    private final s l;
    private final fn m;
    private final kr n;
    private static final long o = 2000000000L;
    private long p;
    private final bo q = jm.a(1.0f, 0.22f);
    private final bo r = jm.a();
    private final bo s = jm.a(0.0f, 0.22f);
    private final gO t;
    private final gO u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;
    private float A;
    private float B;
    private float C;
    private float D;
    private float E;
    private float F;
    private float G;
    private Consumer<kC> H;
    private Consumer<kC> I;
    private Consumer<kC> M;
    private Consumer<kC> N;
    private Consumer<kC> O;
    private Consumer<kC> P;
    private Consumer<kC> Q;
    private BiConsumer<kC, String> R;
    private BiConsumer<kC, String> S;

    public da(kC kC2) {
        Consumer<String> consumer = this::a;
        boolean bl2 = true;
        float f2 = 16.0f;
        this.t = this.a(bl2, f2, consumer);
        Consumer<String> consumer2 = this::b;
        boolean bl3 = false;
        float f3 = 14.0f;
        this.u = this.a(bl3, f3, consumer2);
        this.k = kC2;
        this.c = 300.0f;
        this.d = 144.0f;
        this.l = new s(kC2 != null && kC2.a());
        Runnable runnable = () -> this.a(this.O);
        String string = "\u0423\u0434\u0430\u043b\u0438\u0442\u044c \u043a\u043e\u043d\u0444\u0438\u0433";
        float f4 = 14.0f;
        float f5 = 13.0f;
        kD kD2 = kD.TRASH;
        Runnable runnable2 = () -> this.a(this.M);
        String string2 = "\u0421\u043e\u0445\u0440\u0430\u043d\u0438\u0442\u044c \u043a\u043e\u043d\u0444\u0438\u0433";
        float f6 = 14.0f;
        float f7 = 14.0f;
        kD kD3 = kD.SAVE;
        BooleanSupplier booleanSupplier = this::b;
        Runnable runnable3 = () -> this.a(this.P);
        String string3 = "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 \u043a\u043e\u043d\u0444\u0438\u0433\u0430";
        float f8 = 13.0f;
        float f9 = 12.0f;
        kD kD4 = kD.SETTINGS;
        BooleanSupplier booleanSupplier2 = this::a;
        Runnable runnable4 = () -> {
            this.p = System.nanoTime() + 2000000000L;
            this.a(this.N);
        };
        Supplier<String> supplier = () -> System.nanoTime() < this.p ? "\u041a\u043b\u044e\u0447 \u0441\u043a\u043e\u043f\u0438\u0440\u043e\u0432\u0430\u043d" : "\u041f\u043e\u0434\u0435\u043b\u0438\u0442\u044c\u0441\u044f \u043a\u043e\u043d\u0444\u0438\u0433\u043e\u043c";
        float f10 = 14.0f;
        float f11 = 13.0f;
        kD kD5 = kD.SHARE;
        this.m = new fn().a(string, runnable, f5, f4, kD2).a(string2, runnable2, f7, f6, kD3).a(f9, booleanSupplier, kD4, runnable3, f8, string3).a(f11, booleanSupplier2, kD5, runnable4, f10, supplier);
        this.n = this.m.a(3);
        this.q.b(kC2 != null && kC2.a() ? 1.0f : 0.5f);
        this.s.b(kC2 != null && kC2.b() ? 1.0f : 0.0f);
    }

    public void e(Consumer consumer) {
        this.N = consumer;
    }

    private boolean b() {
        return this.k != null && !this.k.c();
    }

    private void b(String string) {
        String string2;
        if (this.k == null) {
            return;
        }
        String string3 = string2 = this.k.b() == null ? "" : this.k.b();
        if (string.equals(string2)) {
            return;
        }
        if (this.S != null) {
            this.S.accept(this.k, string);
        }
    }

    public void b(Consumer consumer) {
        this.H = consumer;
    }

    public void b(BiConsumer biConsumer) {
        this.S = biConsumer;
    }

    private boolean c() {
        return this.k != null && !this.k.c();
    }

    public void c(Consumer consumer) {
        this.I = consumer;
    }

    public void h(Consumer consumer) {
        this.Q = consumer;
    }

    public void f(Consumer consumer) {
        this.O = consumer;
    }

    public void d(Consumer consumer) {
        this.M = consumer;
    }

    private boolean d() {
        return this.k == null || !this.k.c();
    }

    private void a(Consumer consumer) {
        if (consumer != null) {
            consumer.accept(this.k);
        }
    }

    public void a(BiConsumer biConsumer) {
        this.R = biConsumer;
    }

    private float a(String string, float f2) {
        if (string == null || string.isEmpty()) {
            return 0.0f;
        }
        int n2 = string.lastIndexOf(10);
        String string2 = n2 >= 0 ? string.substring(n2 + 1) : string;
        return Math.min(ao.a(string2, 14.0f), f2);
    }

    private boolean a() {
        if (this.k != null && this.k.c()) {
            return false;
        }
        return this.s.b() < 0.999f;
    }

    private void a(float f2, float f3, float f4, Matrix4f matrix4f) {
        boolean bl2 = this.k != null && this.k.b();
        this.s.c(bl2 ? 1.0f : 0.0f);
        float f5 = this.s.a();
        this.n.a(1.0f - f5);
        float f6 = this.b + this.d - 17.0f - this.m.a();
        float f7 = this.a + this.c - 18.0f;
        float f8 = f2;
        float f9 = f3;
        float f10 = f4;
        float f11 = f6;
        float f12 = f7;
        Matrix4f matrix4f2 = matrix4f;
        float f13 = this.m.a(f9, f10, f8, matrix4f2, f11, f12);
        float f14 = this.a + 16.0f;
        float f15 = Math.max(0.0f, f13 - 8.0f - f14);
        float f16 = f6 + (this.m.a() - 12.0f) / 2.0f;
        float f17 = f2;
        String string = this.k != null ? this.k.d() : null;
        float f18 = f15;
        float f19 = f16 + 1.0f;
        float f20 = f14;
        Matrix4f matrix4f3 = matrix4f;
        this.a(matrix4f3, f19, f18, string, f20, f17);
    }

    public void a(kC kC2) {
        this.k = kC2;
        if (kC2 != null) {
            this.l.a(kC2.a());
        }
    }

    public kC a() {
        return this.k;
    }

    private void a(Matrix4f matrix4f, float f2) {
        String string;
        float f3 = this.a + 16.0f;
        float f4 = this.b + 18.0f + 20.0f + 8.0f;
        float f5 = this.a();
        this.z = f3;
        this.A = f4;
        this.B = f5;
        this.C = 60.0f;
        if (this.u.b()) {
            float f6 = 14.0f;
            int n2 = 3;
            float f7 = f5;
            String string2 = this.u.a();
            String string3 = dq.a(f6, f7, n2, string2);
            float f8 = f2;
            int n3 = gD.foreground();
            float f9 = f5;
            float f10 = 14.0f;
            float f11 = f4;
            float f12 = f3;
            String string4 = string3;
            Matrix4f matrix4f2 = matrix4f;
            ao.a(f8, string4, f12, f10, matrix4f2, f9, f11, n3);
            if (this.u.a()) {
                float f13 = this.a(string3, f5);
                float f14 = f5;
                float f15 = 14.0f;
                String string5 = string3;
                int n4 = Math.max(1, Math.round(ao.a(f14, f15, string5) / ao.d(14.0f)));
                float f16 = f3 + f13 + 1.0f;
                float f17 = f4 + (float)(n4 - 1) * ao.d(14.0f);
                float f18 = f2;
                int n5 = gD.foreground();
                float f19 = 14.0f;
                float f20 = 1.0f;
                float f21 = f17;
                float f22 = f16;
                Matrix4f matrix4f3 = matrix4f;
                dP.a(f18, f19, f22, f21, f20, matrix4f3, n5);
            }
            return;
        }
        String string6 = string = this.k != null && this.k.b() != null ? this.k.b() : "";
        if (string.isEmpty()) {
            return;
        }
        float f23 = 14.0f;
        int n6 = 3;
        float f24 = f5;
        String string7 = string;
        float f25 = f2;
        int n7 = gD.mutedFg();
        float f26 = f5;
        float f27 = 14.0f;
        float f28 = f4;
        float f29 = f3;
        String string8 = dq.a(f23, f24, n6, string7);
        Matrix4f matrix4f4 = matrix4f;
        ao.a(f25, string8, f29, f27, matrix4f4, f26, f28, n7);
    }

    private void a(String string) {
        string = string.trim();
        if (this.k == null || string.isEmpty()) {
            return;
        }
        if (string.equals(this.k.a())) {
            return;
        }
        if (this.R != null) {
            this.R.accept(this.k, string);
        }
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
        double d8;
        float f10;
        float f11;
        double d9;
        float f12;
        float f13;
        double d10;
        double d11;
        if (n2 != 0) {
            return false;
        }
        float f14 = this.l.r();
        float f15 = this.l.q();
        float f16 = this.l.p();
        float f17 = this.l.o();
        if (da.a(f17, f16, d11 = d2, f14, f15, d10 = d3)) {
            boolean bl2 = !this.l.a();
            this.l.a(bl2);
            this.a(bl2 ? this.H : this.I);
            return true;
        }
        if (this.c() && da.a(f13 = this.D, f12 = this.E, d9 = d2, f11 = this.G, f10 = this.F, d8 = d3)) {
            this.f();
            if (this.Q != null) {
                this.Q.accept(this.k);
            }
            return true;
        }
        if (this.d() && da.a(f9 = this.v, f8 = this.w, d7 = d2, f7 = this.y, f6 = this.x, d6 = d3)) {
            String string = this.k != null ? this.k.a() : "";
            gO gO2 = this.t;
            this.a(string, gO2);
            return true;
        }
        if (this.d() && da.a(f5 = this.z, f4 = this.A, d5 = d2, f3 = this.C, f2 = this.B, d4 = d3)) {
            String string = this.k != null ? this.k.b() : "";
            gO gO3 = this.u;
            this.a(string, gO3);
            return true;
        }
        return false;
    }

    private float a() {
        return Math.max(0.0f, this.c - 32.0f);
    }

    @Override
    protected void a(float f2, Matrix4f matrix4f, float f3, float f4) {
        float f5;
        this.q.c(this.k != null && this.k.a() ? 1.0f : 0.5f);
        float f6 = f5 = f2 * this.q.a();
        float f7 = 14.0f;
        Matrix4f matrix4f2 = matrix4f;
        this.a(f7, matrix4f2, f6);
        float f8 = f5;
        float f9 = f3;
        float f10 = f4;
        Matrix4f matrix4f3 = matrix4f;
        this.a(f10, f8, matrix4f3, f9);
        this.a(matrix4f, f5);
        float f11 = f5;
        float f12 = f3;
        float f13 = f4;
        Matrix4f matrix4f4 = matrix4f;
        this.a(f11, f12, f13, matrix4f4);
    }

    @Override
    protected fn a() {
        return this.m;
    }

    private void a(float f2, float f3, Matrix4f matrix4f, float f4) {
        float f5;
        float f6 = this.a + 16.0f;
        float f7 = this.b + 18.0f;
        float f8 = f3;
        float f9 = 13.0f;
        float f10 = 14.0f;
        float f11 = 20.0f;
        float f12 = f7;
        float f13 = f6;
        kD kD2 = kD.CLOUDS;
        Matrix4f matrix4f2 = matrix4f;
        aU.a(kD2, matrix4f2, f13, f9, f11, f12, f8, f10);
        float f14 = f6 + 20.0f + 8.0f;
        float f15 = this.a + this.c - 16.0f - this.l.q();
        float f16 = 15.0f;
        float f17 = f15 - 8.0f - f14 - f16;
        float f18 = f7 + 2.0f;
        this.v = f14 - 2.0f;
        this.w = f7;
        this.x = f17 + 4.0f;
        this.y = 20.0f;
        String string = this.k != null && this.k.a() != null ? this.k.a() : "";
        aF aF2 = aF.b;
        float f19 = f3;
        int n2 = gD.foreground();
        float f20 = f17;
        float f21 = 16.0f;
        float f22 = f18;
        float f23 = f14;
        String string2 = string;
        gO gO2 = this.t;
        Matrix4f matrix4f3 = matrix4f;
        float f24 = kl.a(n2, f21, f23, f22, f20, matrix4f3, aF2, f19, string2, gO2);
        float f25 = f14 + Math.min(f24, f17) + 6.0f;
        float f26 = f7 + 5.0f;
        boolean bl2 = this.k != null && this.k.b();
        boolean bl3 = this.c();
        boolean bl4 = bl3 && f2 >= f25 - 2.0f && f2 <= f25 + 9.0f + 2.0f && f4 >= f26 - 2.0f && f4 <= f26 + 10.0f + 2.0f;
        this.r.c(bl4 ? 1.0f : 0.0f);
        float f27 = this.r.a();
        int n3 = gD.foreground();
        int n4 = gD.mutedFg();
        int n5 = bC.a(n3, f27, n4);
        float f28 = f3;
        int n6 = n5;
        float f29 = 10.0f;
        float f30 = 9.0f;
        float f31 = f26;
        float f32 = f25;
        kD kD3 = bl2 ? kD.LOCK_CLOSED : kD.LOCK_OPEN;
        Matrix4f matrix4f4 = matrix4f;
        jr.a(f28, n6, matrix4f4, f31, kD3, f29, f32, f30);
        this.D = f25 - 2.0f;
        this.E = f26 - 2.0f;
        this.F = 13.0f;
        this.G = 14.0f;
        float f33 = f5 = f7 + (20.0f - this.l.r()) / 2.0f;
        float f34 = f15;
        this.l.c(f33, f34);
        if (this.k != null) {
            this.l.a(this.k.a());
        }
        float f35 = f3;
        float f36 = f4;
        float f37 = f2;
        Matrix4f matrix4f5 = matrix4f;
        this.l.c(f35, f36, f37, matrix4f5);
    }

    public void g(Consumer consumer) {
        this.P = consumer;
    }
}

