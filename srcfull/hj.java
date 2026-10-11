/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class hj
extends Enum<hj> {
    public static final /* enum */ hj a = new hj("\u0420\u0443\u0441\u0441\u043a\u0438\u0439", "RU");
    public static final /* enum */ hj b = new hj("\u0415nglish", "EN");
    private final String c;
    private final String d;
    private static final /* synthetic */ hj[] e;

    private hj(String string2, String string3) {
        this.c = string2;
        this.d = string3;
    }

    static {
        e = hj.a();
    }

    public static hj[] values() {
        return (hj[])e.clone();
    }

    public String b() {
        return this.d;
    }

    public String a() {
        return this.c;
    }

    private static /* synthetic */ hj[] a() {
        return new hj[]{a, b};
    }

    public hj a() {
        hj[] hjArray = hj.values();
        return hjArray[(this.ordinal() + 1) % hjArray.length];
    }

    public static hj a(String string) {
        return Enum.valueOf(hj.class, string);
    }
}

