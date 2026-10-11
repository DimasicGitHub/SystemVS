/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ih {
    private static gh a;
    private static boolean b;

    private ih() {
    }

    public static void b(gh gh2) {
        if (a == gh2) {
            a = null;
        }
    }

    public static boolean b(int n2, int n3, int n4) {
        return ih.a((T gh2) -> {
            int n5 = n3;
            int n6 = n4;
            int n7 = n2;
            gh2.b(n7, n5, n6);
        });
    }

    public static boolean b() {
        return a != null && !b;
    }

    public static gh a() {
        return a;
    }

    private static boolean a(Consumer consumer) {
        if (a == null) {
            return false;
        }
        consumer.accept(a);
        return true;
    }

    public static boolean a(char c2, int n2) {
        return ih.a((T gh2) -> {
            int n3 = n2;
            char c3 = c2;
            gh2.a(n3, c3);
        });
    }

    public static boolean a(int n2, double d2, double d3) {
        double d4;
        double d5;
        int n3;
        return a != null && a.b(n3 = n2, d5 = d2, d4 = d3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(Matrix4f matrix4f, float f2, float f3, float f4) {
        if (a == null) {
            return;
        }
        b = true;
        try {
            float f5 = f4;
            float f6 = f3;
            float f7 = f2;
            Matrix4f matrix4f2 = matrix4f;
            a.d(f6, f7, f5, matrix4f2);
        }
        finally {
            b = false;
        }
    }

    public static void a(gh gh2) {
        if (a != null && a != gh2) {
            a.k();
        }
        a = gh2;
    }

    public static boolean a() {
        return a != null;
    }

    public static boolean a(int n2, int n3, int n4) {
        return ih.a((T gh2) -> {
            int n5 = n2;
            int n6 = n4;
            int n7 = n3;
            gh2.a(n6, n5, n7);
        });
    }

    public static boolean a(double d2, double d3, double d4) {
        return ih.a((T gh2) -> {
            double d5 = d4;
            double d6 = d3;
            double d7 = d2;
            gh2.a(d5, d7, d6);
        });
    }

    public static boolean a(double d2, int n2, double d3, double d4, double d5) {
        return ih.a((T gh2) -> {
            double d6 = d4;
            double d7 = d3;
            int n3 = n2;
            double d8 = d2;
            double d9 = d5;
            gh2.a(d8, d9, n3, d7, d6);
        });
    }

    public static boolean a(double d2, double d3, int n2) {
        return ih.a((T gh2) -> gh2.a(d2, d3, n2));
    }
}

