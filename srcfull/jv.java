/*
 * Decompiled with CFR 0.152.
 */
public abstract sealed class jv
extends Enum<jv>
permits hL, iX, kY, jy, gU, dp, dD, gj, ia, x, r, w, J, ed, aJ, aQ, jV {
    public static final /* synthetic */ /* enum */ jv a;
    public static final /* synthetic */ /* enum */ jv b;
    public static final /* synthetic */ /* enum */ jv c;
    public static final /* synthetic */ /* enum */ jv d;
    public static final /* synthetic */ /* enum */ jv e;
    public static final /* synthetic */ /* enum */ jv f;
    public static final /* synthetic */ /* enum */ jv g;
    public static final /* synthetic */ /* enum */ jv h;
    public static final /* synthetic */ /* enum */ jv i;
    public static final /* synthetic */ /* enum */ jv j;
    public static final /* synthetic */ /* enum */ jv k;
    public static final /* synthetic */ /* enum */ jv l;
    public static final /* synthetic */ /* enum */ jv m;
    public static final /* synthetic */ /* enum */ jv n;
    public static final /* synthetic */ /* enum */ jv o;
    public static final /* synthetic */ /* enum */ jv p;
    public static final /* synthetic */ /* enum */ jv q;
    private static final /* synthetic */ jv[] r;

    private /* synthetic */ jv(String string, int n2) {
    }

    static {
        a = new hL("CUBIC_IN", 0);
        b = new iX("CUBIC_OUT", 1);
        c = new kY("CUBIC_IN_OUT", 2);
        d = new jy("LINEAR", 3);
        e = new gU("QUINT_OUT", 4);
        f = new dp("QUINT_IN", 5);
        g = new dD("QUINT_IN_OUT", 6);
        h = new gj("ELASTIC_OUT", 7);
        i = new ia("ELASTIC_IN", 8);
        j = new x("BACK_OUT", 9);
        k = new r("BACK_IN", 10);
        l = new w("QUAD_OUT", 11);
        m = new J("QUART_OUT", 12);
        n = new ed("EXPO_OUT", 13);
        o = new aJ("SINE_OUT", 14);
        p = new aQ("CIRC_OUT", 15);
        q = new jV("BOUNCE_OUT", 16);
        r = jv.a();
    }

    public static /* bridge */ /* synthetic */ jv[] values() {
        return (jv[])r.clone();
    }

    public static /* bridge */ /* synthetic */ jv a(String string) {
        return Enum.valueOf(jv.class, string);
    }

    private static /* bridge */ /* synthetic */ jv[] a() {
        return new jv[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q};
    }

    public abstract /* synthetic */ float a(float var1, float var2, float var3, float var4);
}

