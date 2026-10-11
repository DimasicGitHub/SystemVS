/*
 * Decompiled with CFR 0.152.
 */
public final class ga
extends Enum<ga> {
    public static final /* enum */ ga a = new ga(new hM(-1, -328966, -657931, -1710619, -9211021, -15263977, -16119286, -7934036, -208051, -148876, -219739));
    public static final /* enum */ ga b = new ga(new hM(-16119286, -15263977, -14277082, -12566464, -6184543, -328966, -328966, -7934036, -4959479, -4046580, -4645860));
    private final hM c;
    private static final /* synthetic */ ga[] d;

    private ga(hM hM2) {
        this.c = hM2;
    }

    static {
        d = ga.a();
    }

    public static ga[] values() {
        return (ga[])d.clone();
    }

    public static ga a(String string) {
        return Enum.valueOf(ga.class, string);
    }

    private static /* synthetic */ ga[] a() {
        return new ga[]{a, b};
    }

    public hM a() {
        return this.c;
    }
}

