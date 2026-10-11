/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_332;
import net.minecraft.class_746;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class al
extends jD {
    private static final float a = 32.0f;
    private static final float b = 14.0f;
    private static final float c = 20.0f;
    private static final float d = 6.0f;
    private static final float e = 8.0f;
    private static final float f = 6.0f;
    private static final float g = 6.0f;
    private static final float h = 3.0f;
    private static final float i = 0.06f;
    private static final float j = 0.001f;
    private final im k = new im();
    private long l = -1L;
    private float m = -1.0f;
    private float n = -1.0f;
    private long o = -1L;
    private int p = Integer.MIN_VALUE;
    private int q = Integer.MIN_VALUE;
    private int r = Integer.MIN_VALUE;
    private String s = "\u2014";
    private String t = "\u2014";
    private String u = "\u2014";

    public al() {
        this.C().a(() -> true);
        this.D().a(() -> this.C().a());
    }

    @Override
    public String e() {
        return "\u0421\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0435\u0437";
    }

    private boolean b() {
        return this.a() && this.D().a();
    }

    private void b() {
        long l2 = fk.a();
        if (l2 == this.o) {
            return;
        }
        this.o = l2;
        class_746 class_7462 = lo.aM.field_1724;
        if (class_7462 == null) {
            String string = this.x() ? "0" : "\u2014";
            String string2 = this.x() ? "64" : "\u2014";
            this.s = string;
            this.t = string2;
            this.u = string;
            return;
        }
        int n2 = (int)Math.floor(class_7462.method_23317());
        int n3 = (int)Math.floor(class_7462.method_23318());
        int n4 = (int)Math.floor(class_7462.method_23321());
        if (n2 != this.p) {
            this.p = n2;
            this.s = Integer.toString(n2);
        }
        if (n3 != this.q) {
            this.q = n3;
            this.t = Integer.toString(n3);
        }
        if (n4 != this.r) {
            this.r = n4;
            this.u = Integer.toString(n4);
        }
    }

    private String b() {
        this.b();
        return this.t;
    }

    private float b() {
        return this.a() ? 26.0f : 0.0f;
    }

    @Override
    public kD b() {
        return kD.COORDS;
    }

    private String c() {
        this.b();
        return this.u;
    }

    private float c() {
        this.a();
        return this.a(this.a());
    }

    @Override
    public float n() {
        return 32.0f;
    }

    @Override
    public String d() {
        return "cs";
    }

    private float d() {
        return this.a(this.b());
    }

    private void a(float f2, Matrix4f matrix4f, float f3, float f4) {
        if (this.n > 0.001f) {
            float f5 = this.A(f2 * this.n);
            int n2 = gD.elevated();
            float f6 = 6.0f;
            float f7 = 20.0f;
            float f8 = 20.0f;
            float f9 = f3;
            float f10 = f4;
            Matrix4f matrix4f2 = matrix4f;
            dP.a(f6, f10, n2, matrix4f2, f7, f8, f5, f9);
        }
        float f11 = eo.a(kD.COORDS);
        float f12 = eo.b(kD.COORDS);
        float f13 = f4 + (20.0f - f11) / 2.0f;
        float f14 = f3 + (20.0f - f12) / 2.0f;
        float f15 = f2 * this.m;
        int n3 = gD.mutedFg();
        float f16 = f12;
        float f17 = f11;
        float f18 = f14;
        float f19 = f13;
        kD kD2 = kD.COORDS;
        Matrix4f matrix4f3 = matrix4f;
        jr.a(f15, n3, matrix4f3, f18, kD2, f16, f19, f17);
    }

    @Override
    protected void a(dd dd2, boolean bl2) {
        dd2.k().a(bl2);
    }

    private void a() {
        long l2 = fk.a();
        if (this.l == l2) {
            return;
        }
        this.l = l2;
        boolean bl2 = this.a();
        boolean bl3 = this.b();
        if (this.m < 0.0f) {
            this.m = bl2 ? 1.0f : 0.0f;
            this.n = bl3 ? 1.0f : 0.0f;
            return;
        }
        float f2 = this.k.a();
        float f3 = 0.06f;
        float f4 = f2;
        float f5 = bl2 ? 1.0f : 0.0f;
        float f6 = this.m;
        this.m = im.a(f5, f6, f4, f3);
        float f7 = 0.06f;
        float f8 = f2;
        float f9 = bl3 ? 1.0f : 0.0f;
        float f10 = this.n;
        this.n = im.a(f9, f10, f8, f7);
    }

    private static float a(Matrix4f matrix4f, String string, String string2, float f2, float f3, float f4) {
        float f5 = f4;
        int n2 = gD.mutedFg();
        float f6 = 14.0f;
        float f7 = f2;
        float f8 = f3;
        String string3 = string2;
        Matrix4f matrix4f2 = matrix4f;
        ao.a(f5, string3, f6, f8, n2, f7, matrix4f2);
        float f9 = 14.0f;
        String string4 = string2;
        float f10 = ao.a(f9, string4);
        float f11 = f3 + f10 + 3.0f;
        float f12 = f4;
        int n3 = gD.foreground();
        float f13 = 14.0f;
        float f14 = f2;
        float f15 = f11;
        String string5 = string;
        Matrix4f matrix4f3 = matrix4f;
        ao.a(f12, string5, f13, f15, n3, f14, matrix4f3);
        float f16 = 14.0f;
        String string6 = string;
        return f11 + ao.a(f16, string6);
    }

    private boolean a() {
        return this.C().a();
    }

    private float a(float f2) {
        float f3 = 8.0f + f2;
        f3 += al.a("X", this.a());
        f3 += 6.0f;
        f3 += al.a("Y", this.b());
        f3 += 6.0f;
        f3 += al.a("Z", this.c());
        return f3 += 8.0f;
    }

    @Override
    protected boolean a(dd dd2) {
        return dd2.k().a();
    }

    private static float a(String string, String string2) {
        float f2 = 14.0f;
        String string3 = string;
        float f3 = 14.0f;
        String string4 = string2;
        return ao.a(f2, string3) + 3.0f + ao.a(f3, string4);
    }

    private float a() {
        return 26.0f * Math.max(0.0f, this.m < 0.0f ? (this.a() ? 1.0f : 0.0f) : this.m);
    }

    private String a() {
        this.b();
        return this.s;
    }

    @Override
    public float o() {
        return 32.0f;
    }

    @Override
    public float p() {
        return this.d();
    }

    @Override
    public float q() {
        return this.d();
    }

    @Override
    protected boolean r() {
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void A(float f2, class_332 class_3322, Matrix4f matrix4f, float f3) {
        this.a();
        float f4 = f2 * f3;
        if (f4 <= 0.001f) {
            return;
        }
        float f5 = this.a(this.a());
        if (f5 <= 0.5f) {
            return;
        }
        float f6 = this.O();
        float f7 = this.P();
        float f8 = this.A(f4);
        float f9 = 1.0f;
        float f10 = 1.0f;
        float f11 = 0.0f;
        int n2 = 0x1A000000;
        float f12 = 0.0f;
        int n3 = 0;
        int n4 = gD.background();
        float f13 = 12.0f;
        float f14 = 12.0f;
        float f15 = 12.0f;
        float f16 = 12.0f;
        float f17 = 32.0f;
        float f18 = f5;
        float f19 = f7;
        float f20 = f6;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f18, n2, n4, f20, f19, f9, f16, f17, f10, matrix4f2, f8, n3, f14, f12, f15, f13, f11);
        float f21 = f7 + 6.0f;
        float f22 = f7 + 9.0f;
        float f23 = 32.0f;
        float f24 = f5;
        float f25 = f7;
        float f26 = f6;
        aM.b(f24, f23, f25, f26);
        try {
            float f27 = f6 + 8.0f;
            if (this.m > 0.001f) {
                float f28 = f4;
                float f29 = f21;
                float f30 = f27;
                Matrix4f matrix4f3 = matrix4f;
                this.a(f28, matrix4f3, f29, f30);
                f27 += 26.0f * this.m;
            }
            float f31 = f4;
            float f32 = f22;
            float f33 = f27;
            String string = this.a();
            String string2 = "X";
            Matrix4f matrix4f4 = matrix4f;
            f27 = al.a(matrix4f4, string, string2, f32, f33, f31) + 6.0f;
            float f34 = f4;
            float f35 = f22;
            float f36 = f27;
            String string3 = this.b();
            String string4 = "Y";
            Matrix4f matrix4f5 = matrix4f;
            f27 = al.a(matrix4f5, string3, string4, f35, f36, f34) + 6.0f;
            float f37 = f4;
            float f38 = f22;
            float f39 = f27;
            String string5 = this.c();
            String string6 = "Z";
            Matrix4f matrix4f6 = matrix4f;
            al.a(matrix4f6, string5, string6, f38, f39, f37);
        }
        finally {
            aM.b();
        }
    }

    @Override
    public float N() {
        return this.O();
    }

    @Override
    public float M() {
        return 32.0f;
    }

    @Override
    public float L() {
        return this.c();
    }
}

