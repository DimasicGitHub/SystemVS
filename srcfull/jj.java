/*
 * Decompiled with CFR 0.152.
 */
public final class jj
extends Enum<jj> {
    public static final /* synthetic */ /* enum */ jj a;
    public static final /* synthetic */ /* enum */ jj b;
    public static final /* synthetic */ /* enum */ jj c;
    public static final /* synthetic */ /* enum */ jj d;
    private static final /* synthetic */ jj[] e;

    private /* synthetic */ jj(String string, int n2) {
    }

    static {
        a = new jj("NONE", 0);
        b = new jj("FT", 1);
        c = new jj("HW", 2);
        d = new jj("ANY", 3);
        e = jj.a();
    }

    public static /* bridge */ /* synthetic */ jj[] values() {
        return (jj[])e.clone();
    }

    private static /* bridge */ /* synthetic */ jj[] a() {
        return new jj[]{a, b, c, d};
    }

    public static /* bridge */ /* synthetic */ jj a(String string) {
        return Enum.valueOf(jj.class, string);
    }
}

