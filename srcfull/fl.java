/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fl {
    private static final float a = 0.35f;
    private static final float b = 0.14285715f;
    private final bo c;
    private final Y d;
    private String e = "";
    private String f = "";
    private String g = "";
    private String h = "";
    private String i = "";
    private boolean j;

    public fl(Y y2, float f2) {
        this.d = y2;
        this.c = new bo(1.0f, f2).a(D::b);
    }

    public fl(Y y2) {
        this(y2, 0.35f);
    }

    public fl() {
        this(Y.a, 0.35f);
    }

    public void b(String string) {
        String string2;
        String string3 = string2 = string == null ? "" : string;
        if (string2.equals(this.e)) {
            return;
        }
        this.f = this.e;
        String string4 = this.e = string2;
        String string5 = this.f;
        int n2 = fl.a(string4, string5);
        this.g = this.e.substring(0, n2);
        this.h = this.f.substring(n2);
        this.i = this.e.substring(n2);
        this.j = !this.h.isEmpty() || !this.i.isEmpty();
        this.c.b(0.0f);
        this.c.c(1.0f);
    }

    private void a(String string, float f2, int n2, float f3, float f4, float f5, Matrix4f matrix4f) {
        if (f2 <= 0.001f) {
            return;
        }
        switch (this.d.ordinal()) {
            case 0: {
                ao.b(matrix4f, string, f4, f3, f5, n2, f2);
                break;
            }
            case 1: {
                ao.a(matrix4f, string, f4, f3, f5, n2, f2);
            }
        }
    }

    public void a(Matrix4f matrix4f, float f2, int n2, float f3, float f4, float f5) {
        float f6 = this.c.a();
        if (f5 <= 0.001f) {
            return;
        }
        float f7 = 0.0f;
        if (!this.g.isEmpty()) {
            float f8 = f5;
            int n3 = n2;
            float f9 = f4;
            float f10 = f3;
            float f11 = f2;
            String string = this.g;
            Matrix4f matrix4f2 = matrix4f;
            this.a(string, f8, n3, f10, f11, f9, matrix4f2);
            float f12 = f4;
            String string2 = this.g;
            f7 = this.a(f12, string2);
        }
        float f13 = f2 + f7;
        if (this.j && f6 < 0.14285715f) {
            float f14 = f6 / 0.14285715f;
            float f15 = f5 * (1.0f - f14);
            float f16 = f14;
            float f17 = f15;
            int n4 = n2;
            float f18 = f4;
            float f19 = f3;
            float f20 = f13;
            String string = this.h;
            Matrix4f matrix4f3 = matrix4f;
            this.a(f19, f17, f18, f20, f16, string, n4, matrix4f3);
        } else if (!this.i.isEmpty()) {
            float f21 = this.j ? (f6 - 0.14285715f) / 0.85714287f : f6;
            float f22 = f5 * f21;
            float f23 = 1.0f - f21;
            float f24 = f22;
            int n5 = n2;
            float f25 = f4;
            float f26 = f3;
            float f27 = f13;
            String string = this.i;
            Matrix4f matrix4f4 = matrix4f;
            this.a(f26, f24, f25, f27, f23, string, n5, matrix4f4);
        }
        if (f6 >= 0.999f) {
            this.j = false;
            this.f = "";
            this.g = this.e;
            this.h = "";
            this.i = "";
        }
    }

    private void a(float f2, float f3, float f4, float f5, float f6, String string, int n2, Matrix4f matrix4f) {
        if (f3 <= 0.001f) {
            return;
        }
        switch (this.d.ordinal()) {
            case 0: {
                float f7 = f6;
                float f8 = f3;
                int n3 = n2;
                float f9 = f4;
                float f10 = f2;
                float f11 = f5;
                String string2 = string;
                Matrix4f matrix4f2 = matrix4f;
                ao.a(matrix4f2, f10, f8, n3, f7, string2, f9, f11);
                break;
            }
            case 1: {
                float f12 = f6;
                float f13 = f3;
                int n4 = n2;
                float f14 = f4;
                float f15 = f2;
                float f16 = f5;
                String string3 = string;
                Matrix4f matrix4f3 = matrix4f;
                ao.a(n4, string3, f12, matrix4f3, f15, f13, f14, f16);
            }
        }
    }

    private float a(float f2, String string) {
        float f3;
        if (this.d == Y.a) {
            float f4 = f2;
            String string2 = string;
            f3 = ao.a(f4, string2);
        } else {
            f3 = ao.a(string, f2);
        }
        return f3;
    }

    private static int a(String string, String string2) {
        int n2;
        int n3 = Math.min(string2.length(), string.length());
        for (n2 = 0; n2 < n3 && string2.charAt(n2) == string.charAt(n2); ++n2) {
        }
        return n2;
    }

    public void a(String string) {
        this.e = string == null ? "" : string;
        this.f = "";
        this.g = this.e;
        this.h = "";
        this.i = "";
        this.j = false;
        this.c.b(1.0f);
    }

    public void a() {
        this.a(0.0f);
    }

    public void a(float f2) {
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = this.e;
        this.j = false;
        this.c.b(0.0f);
        if (f2 > 0.0f) {
            float f3 = f2;
            float f4 = 1.0f;
            this.c.a(f3, f4);
        } else {
            this.c.c(1.0f);
        }
    }

    public String a() {
        return this.e;
    }

    public float a() {
        return this.c.b();
    }
}

