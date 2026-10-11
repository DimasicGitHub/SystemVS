/*
 * Decompiled with CFR 0.152.
 */
final class lq
extends Enum<lq> {
    public static final /* synthetic */ /* enum */ lq a;
    public static final /* synthetic */ /* enum */ lq b;
    public static final /* synthetic */ /* enum */ lq c;
    public static final /* synthetic */ /* enum */ lq d;
    public static final /* synthetic */ /* enum */ lq e;
    public static final /* synthetic */ /* enum */ lq f;
    public static final /* synthetic */ /* enum */ lq g;
    public static final /* synthetic */ /* enum */ lq h;
    public static final /* synthetic */ /* enum */ lq i;
    public static final /* synthetic */ /* enum */ lq j;
    private static final /* synthetic */ lq[] k;

    private /* synthetic */ lq(String string, int n2) {
    }

    static {
        a = new lq("IDLE", 0);
        b = new lq("SWAP_TO_ANCHOR", 1);
        c = new lq("PLACE_ANCHOR", 2);
        d = new lq("VERIFY_ANCHOR", 3);
        e = new lq("SWAP_TO_GLOWSTONE", 4);
        f = new lq("CHARGE_ANCHOR", 5);
        g = new lq("SWAP_BACK_FROM_GLOW", 6);
        h = new lq("EXPLODE_ANCHOR", 7);
        i = new lq("SWAP_BACK", 8);
        j = new lq("DONE", 9);
        k = lq.a();
    }

    public static /* bridge */ /* synthetic */ lq[] values() {
        return (lq[])k.clone();
    }

    private static /* bridge */ /* synthetic */ lq[] a() {
        return new lq[]{a, b, c, d, e, f, g, h, i, j};
    }

    public static /* bridge */ /* synthetic */ lq a(String string) {
        return Enum.valueOf(lq.class, string);
    }
}

