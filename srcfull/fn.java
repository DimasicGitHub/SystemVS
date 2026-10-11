/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import org.joml.Matrix4f;

public class fn
implements fU {
    private static final float a = 18.0f;
    private static final float b = 2.0f;
    private final List<kr> c = new ArrayList<kr>();

    public float a(float f2, float f3, float f4, Matrix4f matrix4f, float f5, float f6) {
        float f7 = f6;
        float f8 = f6;
        for (kr kr2 : this.c) {
            String string;
            if (!kr2.a()) continue;
            float f9 = f7 - 18.0f;
            float f10 = f5;
            float f11 = f9;
            kr2.a.c(f10, f11);
            float f12 = kr2.a(f4);
            float f13 = f2;
            float f14 = f3;
            Matrix4f matrix4f2 = matrix4f;
            kr2.a.c(f12, f13, f14, matrix4f2);
            if (kr2.a.e() && kr2.b != null && (string = kr2.b.get()) != null && !string.isEmpty()) {
                float f15 = 18.0f;
                float f16 = 18.0f;
                float f17 = f5;
                float f18 = f9;
                String string2 = string;
                fi.a(f18, string2, f17, f16, f15);
            }
            f8 = f9;
            f7 = f9 - 2.0f;
        }
        return f8;
    }

    public boolean a(double d2, int n2, double d3) {
        for (kr kr2 : this.c) {
            double d4;
            double d5;
            int n3;
            if (!kr2.a() || !kr2.a.b(n3 = n2, d5 = d3, d4 = d2)) continue;
            return true;
        }
        return false;
    }

    public float a() {
        return 18.0f;
    }

    public fn a(float f2, BooleanSupplier booleanSupplier, kD kD2, Runnable runnable, float f3, String string) {
        BooleanSupplier booleanSupplier2 = booleanSupplier;
        Runnable runnable2 = runnable;
        Supplier<String> supplier = () -> string;
        float f4 = f3;
        float f5 = f2;
        kD kD3 = kD2;
        return this.a(f5, booleanSupplier2, kD3, runnable2, f4, supplier);
    }

    public fn a(float f2, BooleanSupplier booleanSupplier, kD kD2, Runnable runnable, float f3, Supplier supplier) {
        gw gw2 = new gw(kD2, 18.0f, 18.0f, f2, f3);
        gw2.a(runnable);
        this.c.add(new kr(gw2, supplier, booleanSupplier));
        return this;
    }

    public kr a(int n2) {
        return this.c.get(n2);
    }

    public fn a(String string, Runnable runnable, float f2, float f3, kD kD2) {
        BooleanSupplier booleanSupplier = null;
        Runnable runnable2 = runnable;
        Supplier<String> supplier = () -> string;
        float f4 = f3;
        float f5 = f2;
        kD kD3 = kD2;
        return this.a(f5, booleanSupplier, kD3, runnable2, f4, supplier);
    }
}

