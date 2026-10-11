/*
 * Decompiled with CFR 0.152.
 */
public final class m
extends Enum<m> {
    public static final /* enum */ m a = new m("4.wav");
    public static final /* enum */ m b = new m("4F.wav");
    public static final /* enum */ m c = new m("3.wav");
    public static final /* enum */ m d = new m("3F.wav");
    public static final /* enum */ m e = new m("3.wav");
    public static final /* enum */ m f = new m("3F.wav");
    public static final /* enum */ m g = new m("5.wav");
    public static final /* enum */ m h = new m("6.wav");
    public static final /* enum */ m i = new m("1.wav");
    public static final /* enum */ m j = new m("2.wav");
    public static final /* enum */ m k = new m("2F.wav");
    private final String l;
    private static final /* synthetic */ m[] m;

    private m(String string2) {
        this.l = string2;
    }

    static {
        m = m.a();
    }

    public static m[] values() {
        return (m[])m.clone();
    }

    public static m a(String string) {
        return Enum.valueOf(m.class, string);
    }

    private static /* synthetic */ m[] a() {
        return new m[]{a, b, c, d, e, f, g, h, i, j, k};
    }

    public String a() {
        return this.l;
    }
}

