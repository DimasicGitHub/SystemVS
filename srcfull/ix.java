/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_1847;
import net.minecraft.class_1935;
import net.minecraft.class_9334;

public final class ix
extends Enum<ix> {
    public static final /* enum */ ix a = new ix("\u0427\u0430\u0440\u043a\u0430", 150, class_1802.field_8367);
    public static final /* enum */ ix b = new ix("\u0414\u0435\u0437\u043a\u0430", 60, class_1802.field_8449);
    public static final /* enum */ ix c = new ix("\u0422\u043e\u0442\u0435\u043c", 60, class_1802.field_8288);
    public static final /* enum */ ix d = new ix("\u0413\u044d\u043f\u043b", 30, class_1802.field_8463);
    public static final /* enum */ ix e = new ix("\u041f\u043b\u0430\u0441\u0442", 30, class_1802.field_8551);
    public static final /* enum */ ix f = new ix("\u0418\u0441\u0446\u0435\u043b\u0435\u043d\u0438\u0435", 20, class_1802.field_8574);
    public static final /* enum */ ix g = new ix("\u0425\u043e\u0440\u0443\u0441", 20, class_1802.field_8233);
    public static final /* enum */ ix h = new ix("\u0422\u0440\u0430\u043f\u043a\u0430", 10, class_1802.field_22021);
    public final String i;
    public final long j;
    public final class_1799 k;
    private static final /* synthetic */ ix[] l;

    private ix(String string2, int n3, class_1792 class_17922) {
        this.i = string2;
        this.j = (long)n3 * 1000L;
        this.k = new class_1799((class_1935)class_17922);
        if (class_17922 == class_1802.field_8574) {
            this.k.method_57379(class_9334.field_49651, (Object)new class_1844(class_1847.field_8963));
        }
    }

    static {
        l = ix.a();
    }

    public static ix[] values() {
        return (ix[])l.clone();
    }

    private static /* synthetic */ ix[] a() {
        return new ix[]{a, b, c, d, e, f, g, h};
    }

    public static ix a(String string) {
        return Enum.valueOf(ix.class, string);
    }
}

