/*
 * Decompiled with CFR 0.152.
 */
public final class a
extends Enum<a> {
    public static final /* enum */ a a = new a();
    public static final /* enum */ a b = new a();
    public static final /* enum */ a c = new a();
    public static final /* enum */ a d = new a();
    private static final /* synthetic */ a[] e;

    static {
        e = a.a();
    }

    public static a[] values() {
        return (a[])e.clone();
    }

    private static /* synthetic */ a[] a() {
        return new a[]{a, b, c, d};
    }

    public static a a(String string) {
        return Enum.valueOf(a.class, string);
    }
}

