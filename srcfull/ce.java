/*
 * Decompiled with CFR 0.152.
 */
public final class ce
extends Enum<ce> {
    public static final /* enum */ ce a = new ce("RGB");
    public static final /* enum */ ce b = new ce("HSL");
    public static final /* enum */ ce c = new ce("HEX");
    final String d;
    private static final /* synthetic */ ce[] e;

    private ce(String string2) {
        this.d = string2;
    }

    static {
        e = ce.a();
    }

    public static ce[] values() {
        return (ce[])e.clone();
    }

    private static /* synthetic */ ce[] a() {
        return new ce[]{a, b, c};
    }

    public static ce a(String string) {
        return Enum.valueOf(ce.class, string);
    }
}

