/*
 * Decompiled with CFR 0.152.
 */
final class gp
extends Enum<gp> {
    public static final /* synthetic */ /* enum */ gp a;
    public static final /* synthetic */ /* enum */ gp b;
    public static final /* synthetic */ /* enum */ gp c;
    public static final /* synthetic */ /* enum */ gp d;
    private static final /* synthetic */ gp[] e;

    private /* synthetic */ gp(String string, int n2) {
    }

    static {
        a = new gp("IDLE", 0);
        b = new gp("SWAP_SLOT", 1);
        c = new gp("PLACE", 2);
        d = new gp("SWAP_BACK", 3);
        e = gp.a();
    }

    public static /* bridge */ /* synthetic */ gp[] values() {
        return (gp[])e.clone();
    }

    private static /* bridge */ /* synthetic */ gp[] a() {
        return new gp[]{a, b, c, d};
    }

    public static /* bridge */ /* synthetic */ gp a(String string) {
        return Enum.valueOf(gp.class, string);
    }
}

