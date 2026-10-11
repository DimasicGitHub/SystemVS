/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class gq
extends fO {
    private static final long k = 2500000000L;
    private final jt l;
    private final bC m = new bC(gD.background(), 0.22f);
    private long n;
    private Consumer<String> o;
    private Runnable p;

    public gq() {
        this.c = 300.0f;
        this.d = 144.0f;
        this.l = new jt(220.0f, 36.0f, "\u0418\u043b\u0438 \u0432\u0441\u0442\u0430\u0432\u044c\u0442\u0435 \u043a\u043b\u044e\u0447...", 14.0f, 12.0f, 36.0f);
        this.l.a(this::a);
    }

    @Override
    public boolean b(int n2, double d2, double d3) {
        int n3 = n2;
        double d4 = d2;
        double d5 = d3;
        if (this.l.b(n3, d4, d5)) {
            return true;
        }
        if (n2 == 0 && this.d(d2, d3)) {
            if (!this.l.a().trim().isEmpty()) {
                this.a();
            } else if (this.p != null) {
                this.p.run();
            }
            return true;
        }
        return false;
    }

    @Override
    protected void b() {
        this.l.c(this.b());
    }

    private float b() {
        return Math.max(0.0f, this.c - 80.0f);
    }

    public void c() {
        this.n = System.nanoTime() + 2500000000L;
    }

    @Override
    public boolean a(int n2, int n3, int n4) {
        int n5 = n3;
        int n6 = n2;
        int n7 = n4;
        return this.l.a(n6, n5, n7);
    }

    public void a(Runnable runnable) {
        this.p = runnable;
    }

    @Override
    public boolean a(int n2, char c2) {
        int n3 = n2;
        char c3 = c2;
        return this.l.a(n3, c3);
    }

    public void a(Consumer consumer) {
        this.o = consumer;
    }

    public jt a() {
        return this.l;
    }

    public void a(float f2) {
        this.c = f2;
        this.l.c(this.b());
    }

    private void a() {
        String string = this.l.a().trim();
        if (string.isEmpty() || this.o == null) {
            return;
        }
        this.o.accept(string);
        this.l.a();
        this.l.a(false);
    }

    private boolean a() {
        return System.nanoTime() < this.n;
    }

    @Override
    protected float a() {
        return 14.0f;
    }

    @Override
    protected void a(float f2, Matrix4f matrix4f, float f3, float f4) {
        float f5;
        float f6 = this.a + 40.0f;
        float f7 = this.b + 41.0f;
        float f8 = f4;
        float f9 = 13.0f;
        float f10 = 14.0f;
        float f11 = 20.0f;
        float f12 = f7;
        float f13 = f6;
        kD kD2 = kD.CLOUDS;
        Matrix4f matrix4f2 = matrix4f;
        aU.a(kD2, matrix4f2, f13, f9, f11, f12, f8, f10);
        String string = fc.a().a("\u0421\u043e\u0437\u0434\u0430\u0442\u044c \u043d\u043e\u0432\u044b\u0439 \u043a\u043e\u043d\u0444\u0438\u0433");
        float f14 = f6 + 20.0f + 6.0f;
        float f15 = f7 + 2.0f;
        float f16 = f4;
        int n2 = gD.foreground();
        float f17 = 16.0f;
        float f18 = f15;
        float f19 = f14;
        String string2 = string;
        Matrix4f matrix4f3 = matrix4f;
        ao.a(f18, f19, n2, f17, f16, string2, matrix4f3);
        float f20 = f5 = f7 + 20.0f + 8.0f;
        float f21 = f6;
        this.l.c(f20, f21);
        float f22 = f4;
        float f23 = f3;
        float f24 = f2;
        Matrix4f matrix4f4 = matrix4f;
        this.l.c(f22, f23, f24, matrix4f4);
        float f25 = f6 + this.b() - 12.0f - 24.0f;
        float f26 = f5 + 6.0f;
        float f27 = f4;
        int n3 = gD.elevated();
        float f28 = 4.0f;
        float f29 = 24.0f;
        float f30 = 24.0f;
        float f31 = f26;
        float f32 = f25;
        Matrix4f matrix4f5 = matrix4f;
        dP.a(f28, f32, n3, matrix4f5, f29, f30, f27, f31);
        float f33 = f25 + 5.335f;
        float f34 = f26 + 5.335f;
        boolean bl2 = this.a();
        this.m.b(bl2 ? gD.danger() : gD.mutedFg());
        int n4 = this.m.a();
        float f35 = f4;
        int n5 = n4;
        float f36 = 13.33f;
        float f37 = 13.33f;
        float f38 = f34;
        float f39 = f33;
        kD kD3 = kD.INFO;
        Matrix4f matrix4f6 = matrix4f;
        jr.a(f35, n5, matrix4f6, f38, kD3, f36, f39, f37);
        if (bl2) {
            float f40 = 24.0f;
            float f41 = 24.0f;
            float f42 = f26;
            float f43 = f25;
            String string3 = "\u0422\u0430\u043a\u043e\u0433\u043e \u043a\u043b\u044e\u0447\u0430 \u043d\u0435 \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u0443\u0435\u0442";
            fi.a(f41, f40, string3, f43, f42);
        } else {
            float f44 = f25;
            float f45 = f26;
            double d2 = f3;
            float f46 = 24.0f;
            float f47 = 24.0f;
            double d3 = f2;
            if (gq.a(f44, f45, d2, f46, f47, d3)) {
                float f48 = 24.0f;
                float f49 = 24.0f;
                float f50 = f26;
                float f51 = f25;
                String string4 = "\u0412\u0441\u0442\u0430\u0432\u044c\u0442\u0435 \u043a\u043b\u044e\u0447 \u043a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u0438 \u0434\u043b\u044f \u0438\u043c\u043f\u043e\u0440\u0442\u0430";
                fi.a(f51, string4, f50, f49, f48);
            }
        }
    }
}

