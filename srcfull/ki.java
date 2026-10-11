/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ki {
    private static boolean a = true;

    private ki() {
    }

    public static boolean a() {
        bp bp2 = bp.a();
        return bp2 != null ? bp2.a() : a;
    }

    public static void a() {
        ki.a(!ki.a());
    }

    public static void a(boolean bl2) {
        a = bl2;
        bp bp2 = bp.a();
        if (bp2 != null) {
            bp2.c(bl2);
        }
    }
}

