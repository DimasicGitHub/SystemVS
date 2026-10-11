/*
 * Decompiled with CFR 0.152.
 */
public final class ab {
    private ab() {
    }

    public static ce a() {
        try {
            String string;
            jE jE2 = hJ.a();
            if (jE2 != null && jE2.a() != null && (string = jE2.a().d()) != null) {
                return ce.a(string);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return ce.a;
    }

    public static void a(ce ce2) {
        try {
            jE jE2 = hJ.a();
            if (jE2 == null) {
                return;
            }
            kR kR2 = jE2.a();
            if (kR2 == null) {
                kR2 = new kR();
                jE2.a(kR2);
            }
            kR2.d(ce2.name());
            af af2 = af.a();
            if (af2 != null && af2.a() != null) {
                af2.a().a();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

