/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;

public final class fi {
    private static final float a = 0.2f;
    private static final float b = 1.0E9f;
    private static final bo c = new bo(0.0f, 0.22f).a(D::d);
    private static final bo d = jm.b(0.0f, 0.22f);
    private static final bo e = jm.b(0.0f, 0.22f);
    private static final bo f = jm.b(0.0f, 0.22f);
    private static final bo g = jm.b(0.0f, 0.22f);
    private static String h;
    private static float i;
    private static float j;
    private static float k;
    private static float l;
    private static a m;
    private static boolean n;
    private static String o;
    private static float p;
    private static float q;
    private static float r;
    private static float s;
    private static a t;
    private static long u;
    private static boolean v;
    private static final float[] w;

    private fi() {
    }

    static {
        w = new float[4];
    }

    public static boolean a(float[] fArray) {
        float f2;
        if (o == null || t == null || c.b() <= 0.001f) {
            return false;
        }
        float f3 = d.b();
        float f4 = e.b();
        float f5 = f.b();
        float f6 = g.b();
        float f7 = hq.a(o);
        float f8 = 36.0f;
        float f9 = switch (t.ordinal()) {
            case 1 -> {
                f2 = f3 + f5 / 2.0f - f7 / 2.0f;
                yield f4 + f6 + 6.0f + 5.0f - 1.0f;
            }
            case 3 -> {
                f2 = f3 + f5 + 6.0f + 5.0f - 1.0f;
                yield f4 + f6 / 2.0f - f8 / 2.0f;
            }
            case 2 -> {
                f2 = f3 - 6.0f - 5.0f + 1.0f - f7;
                yield f4 + f6 / 2.0f - f8 / 2.0f;
            }
            default -> {
                f2 = f3 + f5 / 2.0f - f7 / 2.0f;
                yield f4 - 6.0f - 5.0f + 1.0f - f8;
            }
        };
        fArray[0] = f2;
        fArray[1] = f9;
        fArray[2] = f7;
        fArray[3] = f8;
        return true;
    }

    public static float a() {
        return c.b();
    }

    public static void a(Matrix4f matrix4f, float f2) {
        float f3;
        if (h != null) {
            boolean bl2 = !h.equals(o) || i != p || j != q || k != r || l != s || m != t;
            boolean bl3 = c.b() > 0.05f;
            boolean bl4 = false;
            if (n) {
                u = 0L;
                v = true;
                if (!bl3) {
                    bl4 = true;
                }
            } else if (!v || bl2) {
                if (bl3) {
                    u = 0L;
                    v = true;
                } else {
                    u = System.nanoTime();
                    v = true;
                    c.b(0.0f);
                    bl4 = true;
                }
            }
            o = h;
            p = i;
            q = j;
            r = k;
            s = l;
            t = m;
            if (bl4) {
                d.b(i);
                e.b(j);
                f.b(k);
                g.b(l);
            } else {
                d.c(i);
                e.c(j);
                f.c(k);
                g.c(l);
            }
            f3 = (float)(System.nanoTime() - u) / 1.0E9f;
            if (n || f3 >= 0.2f) {
                c.c(1.0f);
            }
        } else {
            v = false;
            c.c(0.0f);
        }
        h = null;
        n = false;
        float f4 = c.a();
        float f5 = d.a();
        float f6 = e.a();
        f3 = f.a();
        float f7 = g.a();
        if (f4 <= 0.001f || o == null || t == null) {
            return;
        }
        Matrix4f matrix4f2 = matrix4f;
        if (fi.a(w)) {
            float f8 = w[0] + w[2] * 0.5f;
            float f9 = w[1] + w[3] * 0.5f;
            matrix4f2 = jm.a(matrix4f, f4, f8, f9);
        }
        switch (t.ordinal()) {
            case 1: {
                float f10 = f4 * f2;
                float f11 = f7;
                float f12 = f3;
                float f13 = f6;
                float f14 = f5;
                String string = o;
                Matrix4f matrix4f3 = matrix4f2;
                hq.a(string, f14, matrix4f3, f13, f12, f10, f11);
                break;
            }
            case 3: {
                float f15 = f4 * f2;
                float f16 = f7;
                float f17 = f3;
                float f18 = f6;
                float f19 = f5;
                String string = o;
                Matrix4f matrix4f4 = matrix4f2;
                hq.a(string, f17, f16, f15, f18, matrix4f4, f19);
                break;
            }
            case 2: {
                float f20 = f4 * f2;
                float f21 = f7;
                float f22 = f6;
                float f23 = f5;
                String string = o;
                Matrix4f matrix4f5 = matrix4f2;
                hq.a(f23, f20, matrix4f5, f21, f22, string);
                break;
            }
            default: {
                float f24 = f4 * f2;
                float f25 = f3;
                float f26 = f6;
                float f27 = f5;
                String string = o;
                Matrix4f matrix4f6 = matrix4f2;
                hq.a(f25, f26, f24, string, f27, matrix4f6);
            }
        }
    }

    public static void a(float f2, String string, float f3, float f4) {
        if (string == null || string.isEmpty()) {
            return;
        }
        h = fc.a().a(string);
        i = f3;
        j = f4;
        k = 0.0f;
        l = f2;
        m = a.c;
    }

    public static void a(float f2, String string, float f3, float f4, float f5) {
        if (string == null || string.isEmpty()) {
            return;
        }
        h = fc.a().a(string);
        i = f2;
        j = f3;
        k = f4;
        l = f5;
        m = a.b;
    }

    public static void a(float f2, float f3, String string, float f4, float f5) {
        if (string == null || string.isEmpty()) {
            return;
        }
        h = fc.a().a(string);
        i = f4;
        j = f5;
        k = f2;
        l = f3;
        m = a.b;
        n = true;
    }

    public static void a(String string, float f2, float f3, float f4, float f5) {
        if (string == null || string.isEmpty()) {
            return;
        }
        h = fc.a().a(string);
        i = f4;
        j = f2;
        k = f3;
        l = f5;
        m = a.d;
    }

    public static void a(float f2, float f3, String string, float f4) {
        if (string == null || string.isEmpty()) {
            return;
        }
        h = fc.a().a(string);
        i = f2;
        j = f3;
        k = f4;
        l = 0.0f;
        m = a.a;
    }
}

