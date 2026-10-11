/*
 * Decompiled with CFR 0.152.
 */
public final class co {
    private /* synthetic */ co() {
    }

    public static /* bridge */ /* synthetic */ String a(double d2) {
        return d2 < 10.0 ? String.format("%.1f\u0441", d2) : String.format("%d\u0441", (int)d2);
    }

    public static /* bridge */ /* synthetic */ String a(long l2) {
        long l3 = Math.max(0L, l2) / 1000L;
        return String.format("%d:%02d", l3 / 60L, l3 % 60L);
    }
}

