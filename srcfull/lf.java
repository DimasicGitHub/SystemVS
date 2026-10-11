/*
 * Decompiled with CFR 0.152.
 */
final class lf
extends Enum<lf> {
    public static final /* synthetic */ /* enum */ lf a;
    public static final /* synthetic */ /* enum */ lf b;
    public static final /* synthetic */ /* enum */ lf c;
    public static final /* synthetic */ /* enum */ lf d;
    public static final /* synthetic */ /* enum */ lf e;
    public static final /* synthetic */ /* enum */ lf f;
    private static final /* synthetic */ lf[] g;

    private /* synthetic */ lf(String string, int n2) {
    }

    static {
        a = new lf("IDLE", 0);
        b = new lf("SWAP_IN", 1);
        c = new lf("SELECT", 2);
        d = new lf("HOLD", 3);
        e = new lf("RELEASE", 4);
        f = new lf("POST_COOLDOWN", 5);
        g = lf.a();
    }

    public static /* bridge */ /* synthetic */ lf[] values() {
        return (lf[])g.clone();
    }

    private static /* bridge */ /* synthetic */ lf[] a() {
        return new lf[]{a, b, c, d, e, f};
    }

    public static /* bridge */ /* synthetic */ lf a(String string) {
        return Enum.valueOf(lf.class, string);
    }
}

