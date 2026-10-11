/*
 * Decompiled with CFR 0.152.
 */
public final class dq {
    private static final String a = "...";

    private dq() {
    }

    public static String b(float f2, String string, float f3) {
        int n2;
        if (string == null) {
            return "";
        }
        if (ao.a(string, f3) <= f2) {
            return string;
        }
        for (n2 = 0; n2 < string.length() && ao.a(string.substring(n2), f3) > f2; ++n2) {
        }
        return string.substring(n2);
    }

    public static String a(float f2, String string, float f3) {
        int n2;
        if (string == null) {
            return "";
        }
        if (ao.a(string, f3) <= f2) {
            return string;
        }
        float f4 = ao.a(a, f3);
        for (n2 = string.length(); n2 > 0 && ao.a(string.substring(0, n2), f3) + f4 > f2; --n2) {
        }
        return string.substring(0, n2) + a;
    }

    public static String a(float f2, float f3, int n2, String string) {
        float f4 = (float)n2 * ao.d(f2) + 0.5f;
        float f5 = f3;
        float f6 = f2;
        String string2 = string;
        if (ao.a(f5, f6, string2) <= f4) {
            return string;
        }
        for (int i2 = string.length(); i2 > 0; --i2) {
            float f7 = f3;
            float f8 = f2;
            String string3 = string.substring(0, i2).stripTrailing() + a;
            String string4 = string3;
            if (!(ao.a(f7, f8, string4) <= f4)) continue;
            return string3;
        }
        return a;
    }
}

