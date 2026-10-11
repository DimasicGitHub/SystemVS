/*
 * Decompiled with CFR 0.152.
 */
final class fu
extends Enum<fu> {
    public static final /* synthetic */ /* enum */ fu a;
    public static final /* synthetic */ /* enum */ fu b;
    public static final /* synthetic */ /* enum */ fu c;
    private static final /* synthetic */ fu[] d;

    private /* synthetic */ fu(String string, int n2) {
    }

    static {
        a = new fu("TOTEM_TO_SPHERE", 0);
        b = new fu("SPHERE_TO_SPHERE", 1);
        c = new fu("TOTEM_TO_TOTEM", 2);
        d = fu.a();
    }

    public static /* bridge */ /* synthetic */ fu[] values() {
        return (fu[])d.clone();
    }

    private static /* bridge */ /* synthetic */ fu[] a() {
        return new fu[]{a, b, c};
    }

    public static /* bridge */ /* synthetic */ fu a(String string) {
        return Enum.valueOf(fu.class, string);
    }
}

