/*
 * Decompiled with CFR 0.152.
 */
final class eu
extends Enum<eu> {
    public static final /* synthetic */ /* enum */ eu a;
    public static final /* synthetic */ /* enum */ eu b;
    public static final /* synthetic */ /* enum */ eu c;
    private static final /* synthetic */ eu[] d;

    private /* synthetic */ eu(String string, int n2) {
    }

    static {
        a = new eu("NONE", 0);
        b = new eu("USE_FROM_HOTBAR", 1);
        c = new eu("USE_FROM_INVENTORY", 2);
        d = eu.a();
    }

    public static /* bridge */ /* synthetic */ eu[] values() {
        return (eu[])d.clone();
    }

    private static /* bridge */ /* synthetic */ eu[] a() {
        return new eu[]{a, b, c};
    }

    public static /* bridge */ /* synthetic */ eu a(String string) {
        return Enum.valueOf(eu.class, string);
    }
}

