/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class hf
extends cs {
    private static final float k = 14.0f;
    private fM l;
    private final s m;
    private final fn n;
    private final bo o = jm.a(1.0f, 0.22f);
    private static final IntPredicate p = if.a;
    private final gO q;
    private final gO r;
    private final gO s;
    private final gO t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;
    private float A;
    private float B;
    private float C;
    private float D;
    private Consumer<fM> E;
    private Consumer<fM> F;
    private Consumer<fM> G;
    private BiConsumer<fM, String> H;
    private eY I;

    public hf(fM fM2) {
        Consumer<String> consumer = this::a;
        boolean bl2 = true;
        float f2 = 16.0f;
        this.q = this.a(bl2, f2, consumer);
        Consumer<String> consumer2 = string -> this.a((String)string, 0);
        boolean bl3 = true;
        float f3 = 14.0f;
        this.r = this.a(bl3, f3, consumer2).a(p);
        Consumer<String> consumer3 = string -> this.a((String)string, 1);
        boolean bl4 = true;
        float f4 = 14.0f;
        this.s = this.a(bl4, f4, consumer3).a(p);
        Consumer<String> consumer4 = string -> this.a((String)string, 2);
        boolean bl5 = true;
        float f5 = 14.0f;
        this.t = this.a(bl5, f5, consumer4).a(p);
        this.l = fM2;
        this.c = 300.0f;
        this.d = 116.0f;
        this.m = new s(fM2 != null && fM2.a());
        Runnable runnable = () -> this.a(this.E);
        String string2 = "\u0423\u0434\u0430\u043b\u0438\u0442\u044c \u0432\u0435\u0439\u043f\u043e\u0438\u043d\u0442";
        float f6 = 14.0f;
        float f7 = 13.0f;
        kD kD2 = kD.TRASH;
        Runnable runnable2 = () -> this.a(this.F);
        String string3 = "\u0421\u043a\u043e\u043f\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b";
        float f8 = 14.0f;
        float f9 = 14.0f;
        kD kD3 = kD.COPY;
        this.n = new fn().a(string2, runnable, f7, f6, kD2).a(string3, runnable2, f9, f8, kD3);
        this.o.b(fM2 != null && fM2.a() ? 1.0f : 0.5f);
    }

    public void b(Consumer consumer) {
        this.E = consumer;
    }

    private void b(Matrix4f matrix4f, float f2, float f3, float f4) {
        String string;
        float f5 = this.b + this.d - 12.0f - this.n.a();
        float f6 = this.a + this.c - 16.0f;
        float f7 = f4;
        float f8 = f3;
        float f9 = f2;
        float f10 = f5;
        float f11 = f6;
        Matrix4f matrix4f2 = matrix4f;
        float f12 = this.n.a(f8, f9, f7, matrix4f2, f10, f11);
        String string2 = string = this.l != null && this.l.c() != null ? this.l.c() : "";
        if (!string.isEmpty()) {
            float f13 = this.a + 16.0f;
            float f14 = Math.max(0.0f, f12 - 8.0f - f13);
            float f15 = f5 + (this.n.a() - 12.0f) / 2.0f + 1.0f;
            float f16 = 12.0f;
            float f17 = f14;
            String string3 = string;
            String string4 = dq.a(f17, string3, f16);
            ao.a(matrix4f, string4, f13, f15, 12.0f, gD.mutedFg(), f4);
        }
    }

    public void c(Consumer consumer) {
        this.F = consumer;
    }

    public void d(Consumer consumer) {
        this.G = consumer;
    }

    private void a(String string, int n2) {
        if (this.l == null) {
            return;
        }
        int n3 = this.l.a();
        int n4 = this.l.b();
        int n5 = this.l.c();
        int[] nArray = if.a(string);
        if (nArray != null) {
            n3 = nArray[0];
            n4 = nArray[1];
            n5 = nArray[2];
        } else {
            Integer n6 = if.a(string);
            if (n6 == null) {
                return;
            }
            switch (n2) {
                case 0: {
                    n3 = n6;
                    break;
                }
                case 1: {
                    n4 = n6;
                    break;
                }
                case 2: {
                    n5 = n6;
                }
            }
        }
        if (n3 == this.l.a() && n4 == this.l.b() && n5 == this.l.c()) {
            return;
        }
        if (this.I != null) {
            this.I.onChange(this.l, n3, n4, n5);
        }
    }

    public void a(BiConsumer biConsumer) {
        this.H = biConsumer;
    }

    public void a(eY eY2) {
        this.I = eY2;
    }

    private void a(float f2, Matrix4f matrix4f) {
        float f3 = this.b + 44.0f;
        float f4 = this.a + (this.c - 269.0f) / 2.0f;
        float f5 = f2;
        int n2 = gD.elevated();
        float f6 = 8.0f;
        float f7 = 34.0f;
        float f8 = 269.0f;
        float f9 = f3;
        float f10 = f4;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f6, f10, n2, matrix4f2, f7, f8, f5, f9);
        float f11 = f4 + 4.0f;
        float f12 = f3 + 4.0f;
        float f13 = f2;
        float f14 = 3.0f;
        float f15 = 1.0f;
        float f16 = 0.0f;
        int n3 = 0x1A000000;
        float f17 = 0.0f;
        int n4 = 0;
        int n5 = gD.background();
        float f18 = 6.0f;
        float f19 = 6.0f;
        float f20 = 6.0f;
        float f21 = 6.0f;
        float f22 = 26.0f;
        float f23 = 261.0f;
        float f24 = f12;
        float f25 = f11;
        Matrix4f matrix4f3 = matrix4f;
        dP.a(f23, n3, n5, f25, f24, f14, f21, f22, f15, matrix4f3, f13, n4, f19, f17, f20, f18, f16);
        this.y = f11;
        this.z = f12;
        this.A = this.y + 87.0f + 0.0f;
        this.B = f12;
        this.C = this.A + 87.0f + 0.0f;
        this.D = f12;
        float f26 = 5.0f;
        float f27 = 26.0f - f26 * 2.0f;
        float f28 = f12 + f26;
        float f29 = f2;
        int n6 = gD.border();
        float f30 = f27;
        float f31 = 1.0f;
        float f32 = f28;
        float f33 = this.A;
        Matrix4f matrix4f4 = matrix4f;
        dP.a(f29, f30, f33, f32, f31, matrix4f4, n6);
        float f34 = f2;
        int n7 = gD.border();
        float f35 = f27;
        float f36 = 1.0f;
        float f37 = f28;
        float f38 = this.C;
        Matrix4f matrix4f5 = matrix4f;
        dP.a(f34, f35, f38, f37, f36, matrix4f5, n7);
        gO gO2 = this.r;
        float f39 = f2;
        float f40 = f12;
        float f41 = this.y;
        int n8 = this.l == null ? 0 : this.l.a();
        String string = "X";
        Matrix4f matrix4f6 = matrix4f;
        jn.a(matrix4f6, f40, gO2, string, f39, f41, n8);
        gO gO3 = this.s;
        float f42 = f2;
        float f43 = f12;
        float f44 = this.A;
        int n9 = this.l == null ? 0 : this.l.b();
        String string2 = "Y";
        Matrix4f matrix4f7 = matrix4f;
        jn.a(matrix4f7, f43, gO3, string2, f42, f44, n9);
        gO gO4 = this.t;
        float f45 = f2;
        float f46 = f12;
        float f47 = this.C;
        int n10 = this.l == null ? 0 : this.l.c();
        String string3 = "Z";
        Matrix4f matrix4f8 = matrix4f;
        jn.a(matrix4f8, f46, gO4, string3, f45, f47, n10);
    }

    private static String a(double d2) {
        if (d2 < 1000.0) {
            return (int)Math.round(d2) + "m";
        }
        return String.format("%.1fkm", d2 / 1000.0);
    }

    private String a() {
        if (this.l == null) {
            return "";
        }
        String string = fA.a();
        if (string == null) {
            return "";
        }
        if (!string.equals(this.l.c())) {
            return "";
        }
        if (lo.aM == null || lo.aM.field_1724 == null) {
            return "";
        }
        double d2 = lo.aM.field_1724.method_23317() - (double)this.l.a();
        double d3 = lo.aM.field_1724.method_23318() - (double)this.l.b();
        double d4 = lo.aM.field_1724.method_23321() - (double)this.l.c();
        double d5 = Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
        return hf.a(d5);
    }

    private void a(Matrix4f matrix4f, float f2, float f3, float f4) {
        float f5 = this.a + 16.0f;
        float f6 = this.b + 16.0f;
        float f7 = f3;
        int n2 = gD.foreground();
        float f8 = 18.0f;
        float f9 = 18.0f;
        float f10 = f6 + 1.0f;
        float f11 = f5;
        kD kD2 = kD.WAYPOINT;
        Matrix4f matrix4f2 = matrix4f;
        jr.a(f7, n2, matrix4f2, f10, kD2, f8, f11, f9);
        float f12 = f5 + 18.0f + 8.0f;
        float f13 = this.a + this.c - 16.0f - this.m.q();
        float f14 = f6 + (18.0f - this.m.r()) / 2.0f - 1.0f;
        float f15 = f6 + 1.0f - 1.0f;
        String string = this.l != null && this.l.b() != null ? this.l.b() : "";
        String string2 = this.a();
        float f16 = string2.isEmpty() ? 0.0f : ao.a(string2, 14.0f);
        float f17 = string2.isEmpty() ? 0.0f : 8.0f;
        float f18 = Math.max(0.0f, f13 - 8.0f - f12 - f17 - f16);
        this.u = f12 - 2.0f;
        this.v = f6;
        this.w = f18 + 4.0f;
        this.x = 18.0f;
        aF aF2 = aF.b;
        float f19 = f3;
        int n3 = gD.foreground();
        float f20 = f18;
        float f21 = 16.0f;
        float f22 = f15;
        float f23 = f12;
        String string3 = string;
        gO gO2 = this.q;
        Matrix4f matrix4f3 = matrix4f;
        float f24 = kl.a(n3, f21, f23, f22, f20, matrix4f3, aF2, f19, string3, gO2);
        if (!string2.isEmpty()) {
            float f25 = f12 + f24 + 8.0f;
            float f26 = f6 + 2.0f - 1.0f;
            ao.a(matrix4f, string2, f25, f26, 14.0f, gD.mutedFg(), f3);
        }
        float f27 = f14;
        float f28 = f13;
        this.m.c(f27, f28);
        if (this.l != null) {
            this.m.a(this.l.a());
        }
        float f29 = f3;
        float f30 = f2;
        float f31 = f4;
        Matrix4f matrix4f4 = matrix4f;
        this.m.c(f29, f30, f31, matrix4f4);
    }

    @Override
    protected void a(float f2, Matrix4f matrix4f, float f3, float f4) {
        float f5;
        this.o.c(this.l != null && this.l.a() ? 1.0f : 0.5f);
        float f6 = f5 = f2 * this.o.a();
        float f7 = 14.0f;
        Matrix4f matrix4f2 = matrix4f;
        this.a(f7, matrix4f2, f6);
        float f8 = f5;
        float f9 = f3;
        float f10 = f4;
        Matrix4f matrix4f3 = matrix4f;
        this.a(matrix4f3, f9, f8, f10);
        float f11 = f5;
        Matrix4f matrix4f4 = matrix4f;
        this.a(f11, matrix4f4);
        this.b(matrix4f, f4, f3, f5);
    }

    private void a(Consumer consumer) {
        if (consumer != null && this.l != null) {
            consumer.accept(this.l);
        }
    }

    public fM a() {
        return this.l;
    }

    public void a(fM fM2) {
        this.l = fM2;
        if (fM2 != null) {
            this.m.a(fM2.a());
        }
    }

    private void a(String string) {
        String string2;
        if (this.l == null) {
            return;
        }
        String string3 = string2 = string == null ? "" : string.trim();
        if (string2.isEmpty()) {
            return;
        }
        if (string2.equals(this.l.b())) {
            return;
        }
        if (this.H != null) {
            this.H.accept(this.l, string2);
        }
    }

    @Override
    protected boolean a(int n2, double d2, double d3) {
        if (n2 == 0) {
            double d4;
            double d5;
            float f2 = this.m.r();
            float f3 = this.m.q();
            float f4 = this.m.p();
            float f5 = this.m.o();
            if (hf.a(f5, f4, d5 = d2, f2, f3, d4 = d3)) {
                boolean bl2 = !this.m.a();
                this.m.a(bl2);
                if (this.l != null) {
                    this.l.a(bl2);
                    if (this.G != null) {
                        this.G.accept(this.l);
                    }
                }
                return true;
            }
        }
        if (n2 != 0) {
            return false;
        }
        float f6 = this.u;
        float f7 = this.v;
        double d6 = d2;
        float f8 = this.x;
        float f9 = this.w;
        double d7 = d3;
        if (hf.a(f6, f7, d6, f8, f9, d7)) {
            String string = this.l != null ? this.l.b() : "";
            gO gO2 = this.q;
            this.a(string, gO2);
            return true;
        }
        float f10 = this.y;
        float f11 = this.z;
        double d8 = d2;
        float f12 = 26.0f;
        float f13 = 87.0f;
        double d9 = d3;
        if (hf.a(f10, f11, d8, f12, f13, d9)) {
            String string = this.l == null ? "0" : Integer.toString(this.l.a());
            gO gO3 = this.r;
            this.a(string, gO3);
            return true;
        }
        float f14 = this.A;
        float f15 = this.B;
        double d10 = d2;
        float f16 = 26.0f;
        float f17 = 87.0f;
        double d11 = d3;
        if (hf.a(f14, f15, d10, f16, f17, d11)) {
            String string = this.l == null ? "0" : Integer.toString(this.l.b());
            gO gO4 = this.s;
            this.a(string, gO4);
            return true;
        }
        float f18 = this.C;
        float f19 = this.D;
        double d12 = d2;
        float f20 = 26.0f;
        float f21 = 87.0f;
        double d13 = d3;
        if (hf.a(f18, f19, d12, f20, f21, d13)) {
            String string = this.l == null ? "0" : Integer.toString(this.l.c());
            gO gO5 = this.t;
            this.a(string, gO5);
            return true;
        }
        return false;
    }

    @Override
    protected fn a() {
        return this.n;
    }
}

