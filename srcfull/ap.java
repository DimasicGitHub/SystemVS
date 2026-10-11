/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1792;
import net.minecraft.class_1802;

public final class ap
extends Enum<ap> {
    public static final /* synthetic */ /* enum */ ap a;
    public static final /* synthetic */ /* enum */ ap b;
    public static final /* synthetic */ /* enum */ ap c;
    public static final /* synthetic */ /* enum */ ap d;
    public static final /* synthetic */ /* enum */ ap e;
    public static final /* synthetic */ /* enum */ ap f;
    public final /* synthetic */ class_1792 g;
    public final /* synthetic */ String h;
    private static final /* synthetic */ class_1792[] i;
    private static final /* synthetic */ ap[] j;

    private /* synthetic */ ap(String string, int n2, class_1792 class_17922, String string2) {
        this.g = class_17922;
        this.h = string2;
    }

    static {
        a = new ap("SNOWBALL", 0, class_1802.field_8543, "\u041a\u043e\u043c \u0441\u043d\u0435\u0433\u0430");
        b = new ap("NETHER_STAR", 1, class_1802.field_8137, "\u0421\u0442\u0430\u043d");
        c = new ap("SHULKER", 2, null, "\u0420\u044e\u043a\u0437\u0430\u043a (\u043b\u044e\u0431\u043e\u0439 \u0448\u0430\u043b\u043a\u0435\u0440)");
        d = new ap("PRISMARINE_SHARD", 3, class_1802.field_8662, "\u0412\u0437\u0440\u044b\u0432\u043d\u0430\u044f \u0442\u0440\u0430\u043f\u043a\u0430");
        e = new ap("POPPED_CHORUS_FRUIT", 4, class_1802.field_8882, "T\u0440\u0430\u043f\u043a\u0430");
        f = new ap("FIRE_CHARGE", 5, class_1802.field_8814, "\u0412\u0437\u0440\u044b\u0432\u043d\u0430\u044f \u0448\u0442\u0443\u0447\u043a\u0430");
        j = ap.a();
        i = new class_1792[]{class_1802.field_8545, class_1802.field_8722, class_1802.field_8380, class_1802.field_8050, class_1802.field_8829, class_1802.field_8271, class_1802.field_8548, class_1802.field_8520, class_1802.field_8627, class_1802.field_8451, class_1802.field_8213, class_1802.field_8816, class_1802.field_8350, class_1802.field_8584, class_1802.field_8461, class_1802.field_8676, class_1802.field_8268};
    }

    public static /* bridge */ /* synthetic */ ap[] values() {
        return (ap[])j.clone();
    }

    public static /* bridge */ /* synthetic */ class_1792[] a() {
        return i;
    }

    private static /* bridge */ /* synthetic */ ap[] a() {
        return new ap[]{a, b, c, d, e, f};
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return this == c;
    }

    public static /* bridge */ /* synthetic */ ap a(String string) {
        return Enum.valueOf(ap.class, string);
    }
}

