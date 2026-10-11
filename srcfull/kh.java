/*
 * Decompiled with CFR 0.152.
 */
final class kh
extends Enum<kh> {
    public static final /* synthetic */ /* enum */ kh a;
    public static final /* synthetic */ /* enum */ kh b;
    public static final /* synthetic */ /* enum */ kh c;
    public static final /* synthetic */ /* enum */ kh d;
    public static final /* synthetic */ /* enum */ kh e;
    public static final /* synthetic */ /* enum */ kh f;
    public static final /* synthetic */ /* enum */ kh g;
    public static final /* synthetic */ /* enum */ kh h;
    public static final /* synthetic */ /* enum */ kh i;
    public static final /* synthetic */ /* enum */ kh j;
    private static final /* synthetic */ kh[] k;

    private /* synthetic */ kh(String string, int n2) {
    }

    static {
        a = new kh("IDLE", 0);
        b = new kh("SWAP_TO_OBSIDIAN", 1);
        c = new kh("PLACE_OBSIDIAN", 2);
        d = new kh("VERIFY_OBSIDIAN", 3);
        e = new kh("SWAP_TO_CRYSTAL", 4);
        f = new kh("PLACE_CRYSTAL", 5);
        g = new kh("WAIT_CRYSTAL", 6);
        h = new kh("ATTACK_CRYSTAL", 7);
        i = new kh("SWAP_BACK", 8);
        j = new kh("DONE", 9);
        k = kh.a();
    }

    public static /* bridge */ /* synthetic */ kh[] values() {
        return (kh[])k.clone();
    }

    private static /* bridge */ /* synthetic */ kh[] a() {
        return new kh[]{a, b, c, d, e, f, g, h, i, j};
    }

    public static /* bridge */ /* synthetic */ kh a(String string) {
        return Enum.valueOf(kh.class, string);
    }
}

