/*
 * Decompiled with CFR 0.152.
 */
public final class fw
extends Enum<fw> {
    public static final /* synthetic */ /* enum */ fw a;
    public static final /* synthetic */ /* enum */ fw b;
    public static final /* synthetic */ /* enum */ fw c;
    public static final /* synthetic */ /* enum */ fw d;
    private static final /* synthetic */ fw[] e;

    private /* synthetic */ fw(String string, int n2) {
    }

    static {
        a = new fw("ACTIVE", 0);
        b = new fw("PENDING", 1);
        c = new fw("DONE", 2);
        d = new fw("UNKNOWN", 3);
        e = fw.a();
    }

    public static /* bridge */ /* synthetic */ fw[] values() {
        return (fw[])e.clone();
    }

    private static /* bridge */ /* synthetic */ fw[] a() {
        return new fw[]{a, b, c, d};
    }

    public static /* bridge */ /* synthetic */ fw a(String string) {
        return Enum.valueOf(fw.class, string);
    }
}

