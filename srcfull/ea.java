/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ea
extends fO {
    private static final float k = 220.0f;
    private static final float l = 36.0f;
    private static final float m = 6.0f;
    private final jt n;
    private Consumer<String> o;

    public ea() {
        this.c = 300.0f;
        this.d = 78.0f;
        this.n = new jt(220.0f, 36.0f, "\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043d\u0438\u043a\u043d\u0435\u0439\u043c...", 14.0f, 12.0f, 36.0f);
        this.n.a(this::a);
    }

    @Override
    public boolean b(int n2, double d2, double d3) {
        int n3 = n2;
        double d4 = d3;
        double d5 = d2;
        return this.n.b(n3, d5, d4);
    }

    @Override
    public boolean a(int n2, int n3, int n4) {
        int n5 = n3;
        int n6 = n2;
        int n7 = n4;
        return this.n.a(n6, n5, n7);
    }

    @Override
    public boolean a(int n2, char c2) {
        int n3 = n2;
        char c3 = c2;
        return this.n.a(n3, c3);
    }

    public jt a() {
        return this.n;
    }

    public void a(Consumer consumer) {
        this.o = consumer;
    }

    private void a() {
        String string = this.n.a().trim();
        if (string.isEmpty()) {
            return;
        }
        if (this.o != null) {
            this.o.accept(string);
        }
        this.n.a();
        this.n.a(false);
    }

    @Override
    protected float a() {
        return 14.0f;
    }

    @Override
    protected void a(float f2, Matrix4f matrix4f, float f3, float f4) {
        float f5 = 246.0f;
        float f6 = this.a + (this.c - f5) / 2.0f;
        float f7 = this.b + (this.d - 36.0f) / 2.0f;
        float f8 = f7 + 8.0f;
        float f9 = f4;
        float f10 = 13.0f;
        float f11 = 14.0f;
        float f12 = 20.0f;
        float f13 = f8;
        float f14 = f6;
        kD kD2 = kD.FRIENDS;
        Matrix4f matrix4f2 = matrix4f;
        aU.a(kD2, matrix4f2, f14, f10, f12, f13, f9, f11);
        float f15 = f6 + 20.0f + 6.0f;
        this.n.c(220.0f);
        float f16 = f7;
        float f17 = f15;
        this.n.c(f16, f17);
        float f18 = f4;
        float f19 = f3;
        float f20 = f2;
        Matrix4f matrix4f3 = matrix4f;
        this.n.c(f18, f19, f20, matrix4f3);
        float f21 = f15 + 220.0f - 12.0f - 24.0f;
        float f22 = f7 + 6.0f;
        float f23 = f4;
        int n2 = gD.elevated();
        float f24 = 4.0f;
        float f25 = 24.0f;
        float f26 = 24.0f;
        float f27 = f22;
        float f28 = f21;
        Matrix4f matrix4f4 = matrix4f;
        dP.a(f24, f28, n2, matrix4f4, f25, f26, f23, f27);
        float f29 = f21 + 5.335f;
        float f30 = f22 + 5.335f;
        float f31 = f4;
        int n3 = gD.mutedFg();
        float f32 = 13.33f;
        float f33 = 13.33f;
        float f34 = f30;
        float f35 = f29;
        kD kD3 = kD.INFO;
        Matrix4f matrix4f5 = matrix4f;
        jr.a(f31, n3, matrix4f5, f34, kD3, f32, f35, f33);
        float f36 = 24.0f;
        float f37 = 24.0f;
        float f38 = f22;
        float f39 = f21;
        double d2 = f3;
        double d3 = f2;
        if (ea.a(f39, f38, d2, f36, f37, d3)) {
            float f40 = 24.0f;
            float f41 = 24.0f;
            float f42 = f22;
            float f43 = f21;
            String string = "\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043d\u0438\u043a \u0438\u0433\u0440\u043e\u043a\u0430 \u0434\u043b\u044f \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u0438\u044f \u0432 \u0434\u0440\u0443\u0437\u044c\u044f";
            fi.a(f43, string, f42, f41, f40);
        }
    }

    public void a(float f2) {
        this.c = f2;
    }
}

