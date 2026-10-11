/*
 * Decompiled with CFR 0.152.
 */
import b.Boot;

public final class gr {
    private static volatile String a;

    private gr() {
    }

    public static String a(String string, String string2) {
        if (string == null || string.isEmpty()) {
            return null;
        }
        try {
            int n2 = Integer.parseInt(string);
            return Boot.call(n2, string2, a);
        }
        catch (NumberFormatException | UnsatisfiedLinkError throwable) {
            return null;
        }
    }

    public static String a() {
        return a;
    }

    public static void a(String string) {
        a = string;
    }
}

