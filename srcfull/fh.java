/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1792;
import net.minecraft.class_1802;

public final class fh
extends Enum<fh> {
    public static final /* synthetic */ /* enum */ fh a;
    public static final /* synthetic */ /* enum */ fh b;
    public static final /* synthetic */ /* enum */ fh c;
    public static final /* synthetic */ /* enum */ fh d;
    public static final /* synthetic */ /* enum */ fh e;
    public static final /* synthetic */ /* enum */ fh f;
    public static final /* synthetic */ /* enum */ fh g;
    public static final /* synthetic */ /* enum */ fh h;
    public static final /* synthetic */ /* enum */ fh i;
    public static final /* synthetic */ /* enum */ fh j;
    public static final /* synthetic */ /* enum */ fh k;
    public static final /* synthetic */ /* enum */ fh l;
    public static final /* synthetic */ /* enum */ fh m;
    public static final /* synthetic */ /* enum */ fh n;
    public static final /* synthetic */ /* enum */ fh o;
    public static final /* synthetic */ /* enum */ fh p;
    public static final /* synthetic */ /* enum */ fh q;
    public static final /* synthetic */ /* enum */ fh r;
    public static final /* synthetic */ /* enum */ fh s;
    public static final /* synthetic */ /* enum */ fh t;
    public static final /* synthetic */ /* enum */ fh u;
    public static final /* synthetic */ /* enum */ fh v;
    public static final /* synthetic */ /* enum */ fh w;
    public static final /* synthetic */ /* enum */ fh x;
    public static final /* synthetic */ /* enum */ fh y;
    public static final /* synthetic */ /* enum */ fh z;
    public static final /* synthetic */ /* enum */ fh A;
    public static final /* synthetic */ /* enum */ fh B;
    public static final /* synthetic */ /* enum */ fh C;
    public static final /* synthetic */ /* enum */ fh D;
    public static final /* synthetic */ /* enum */ fh E;
    public static final /* synthetic */ /* enum */ fh F;
    public static final /* synthetic */ /* enum */ fh G;
    public static final /* synthetic */ /* enum */ fh H;
    public static final /* synthetic */ /* enum */ fh I;
    public static final /* synthetic */ /* enum */ fh J;
    public final /* synthetic */ class_1792 K;
    public final /* synthetic */ String L;
    public final /* synthetic */ String M;
    public final /* synthetic */ String N;
    public final /* synthetic */ String O;
    public final /* synthetic */ String P;
    public final /* synthetic */ boolean Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ int S;
    public final /* synthetic */ boolean T;
    public final /* synthetic */ jj U;
    private static final /* synthetic */ fh[] V;

    private /* synthetic */ fh(String string, int n2, class_1792 class_17922, String string2, String string3, int n3, int n4) {
        this(string, n2, class_17922, string2, string3, null, false, n3, n4, false, jj.a);
    }

    private /* synthetic */ fh(String string, int n2, class_1792 class_17922, String string2, String string3, String string4, jj jj2) {
        this(string, n2, class_17922, string2, string3, string4, false, -1, -1, false, jj2);
    }

    private /* synthetic */ fh(String string, int n2, class_1792 class_17922, String string2, String string3, String string4) {
        this(string, n2, class_17922, string2, string3, string4, false, -1, -1, false, jj.a);
    }

    private /* synthetic */ fh(String string, int n2, class_1792 class_17922, String string2, String string3, int n3, int n4, boolean bl2) {
        this(string, n2, class_17922, string2, string3, null, false, n3, n4, bl2, jj.a);
    }

    private /* synthetic */ fh(String string, int n2, class_1792 class_17922, String string2, String string3, String string4, boolean bl2, int n3, int n4, boolean bl3, jj jj2) {
        this.K = class_17922;
        this.L = string2;
        this.M = string3;
        this.N = string4;
        this.O = string3 == null ? null : string3.toLowerCase();
        this.P = string4 == null ? null : string4.toLowerCase();
        this.Q = bl2;
        this.R = n3;
        this.S = n4;
        this.T = bl3;
        this.U = jj2;
    }

    private /* synthetic */ fh(String string, int n2, class_1792 class_17922, String string2, String string3) {
        this(string, n2, class_17922, string2, string3, null, false, -1, -1, false, jj.a);
    }

    static {
        a = new fh("ENDER_EYE", 0, class_1802.field_8449, "\u0414\u0435\u0437\u043e\u0440\u0438\u0435\u043d\u0442\u0430\u0446\u0438\u044f", "\u0434\u0435\u0437\u043e\u0440\u0438\u0435\u043d\u0442\u0430\u0446\u0438\u044f", "\u0437\u0432\u0443\u043a\u043e\u0432\u0430\u044f \u0432\u043e\u043b\u043d\u0430", jj.b);
        b = new fh("FIRE_CHARGE", 1, class_1802.field_8814, "\u041e\u0433\u043d\u0435\u043d\u043d\u044b\u0439 \u0441\u043c\u0435\u0440\u0447", "\u043e\u0433\u043d\u0435\u043d\u043d\u044b\u0439", null, jj.d);
        c = new fh("SUGAR", 2, class_1802.field_8479, "\u042f\u0432\u043d\u0430\u044f \u043f\u044b\u043b\u044c", "\u044f\u0432\u043d\u0430\u044f \u043f\u044b\u043b\u044c", "\u0441\u0432\u0435\u0442\u043e\u0432\u0430\u044f \u0432\u0441\u043f\u044b\u0448\u043a\u0430", jj.b);
        d = new fh("TOTEM_OF_UNDYING", 3, class_1802.field_8288, "\u0422\u043e\u0442\u0435\u043c \u0431\u0435\u0441\u0441\u043c\u0435\u0440\u0442\u0438\u044f", null);
        e = new fh("EXPERIENCE_BOTTLE", 4, class_1802.field_8287, "\u0411\u0443\u0442\u044b\u043b\u043a\u0430 \u043e\u043f\u044b\u0442\u0430", null);
        f = new fh("NETHERITE_SCRAP", 5, class_1802.field_22021, "T\u0440\u0430\u043f\u043a\u0430", "\u0442\u0440\u0430\u043f\u043a\u0430", "\u043d\u0435\u0440\u0443\u0448\u0438\u043c\u0430\u044f \u043a\u043b\u0435\u0442\u043a\u0430", jj.b);
        g = new fh("DRIED_KELP", 6, class_1802.field_8551, "\u041f\u043ba\u0441\u0442", "\u043f\u043b\u0430\u0441\u0442", "\u043d\u0435\u0440\u0443\u0448\u0438\u043c\u0430\u044f \u0441\u0442\u0435\u043d\u0430", jj.b);
        h = new fh("GOLDEN_APPLE", 7, class_1802.field_8463, "\u0417\u043e\u043b\u043e\u0442\u043e\u0435 \u044f\u0431\u043b\u043e\u043a\u043e", null);
        i = new fh("ENCHANTED_GOLDEN_APPLE", 8, class_1802.field_8367, "\u0417\u0430\u0447. \u0437\u043e\u043b\u043e\u0442\u043e\u0435 \u044f\u0431\u043b\u043e\u043a\u043e", null);
        j = new fh("CHORUS_FRUIT", 9, class_1802.field_8233, "\u0425\u043e\u0440\u0443\u0441", null);
        k = new fh("ENDER_PEARL", 10, class_1802.field_8634, "\u042d\u043d\u0434\u0435\u0440 \u043f\u0451\u0440\u043b", null);
        l = new fh("SNOWBALL", 11, class_1802.field_8543, "\u0421\u043d\u0435\u0436\u043e\u043a", null);
        m = new fh("SNOWBALL_FREEZE", 12, class_1802.field_8543, "\u0421\u043d\u0435\u0436\u043e\u043a \u0437\u0430\u043c\u043e\u0440\u043e\u0437\u043a\u0430", "\u0437\u0430\u043c\u043e\u0440\u043e\u0437\u043a\u0430", "\u043b\u0435\u0434\u044f\u043d\u0430\u044f \u0441\u0444\u0435\u0440\u0430");
        n = new fh("POPPED_CHORUS_FRUIT", 13, class_1802.field_8882, "\u0422\u0440\u0430\u043f\u043a\u0430 2", null, null, jj.c);
        o = new fh("NETHER_STAR", 14, class_1802.field_8137, "\u0421\u0442\u0430\u043d", null, null, jj.c);
        p = new fh("JACK_O_LANTERN", 15, class_1802.field_8693, "\u0421\u0432\u0435\u0442\u0438\u043b\u044c\u043d\u0438\u043a \u0414\u0436\u0435\u043a\u0430", null);
        q = new fh("PRISMARINE_SHARD", 16, class_1802.field_8662, "\u0412\u0437\u0440\u044b\u0432\u043d\u0430\u044f \u0442\u0440\u0430\u043f\u043a\u0430", null, null, jj.c);
        r = new fh("WIND_CHARGE", 17, class_1802.field_49098, "\u0417\u0430\u0440\u044f\u0434 \u0432\u0438\u0445\u0440\u044f", null);
        s = new fh("BOZHA_AURA", 18, class_1802.field_8614, "\u0411o\u0436\u044c\u044f a\u0443\u0440\u0430", "\u0431\u043e\u0436\u044c\u044f \u0430\u0443\u0440\u0430", "\u0431\u043e\u0436\u0435\u0441\u0442\u0432\u0435\u043d\u043d\u0430\u044f \u0430\u0443\u0440\u0430", jj.b);
        t = new fh("CROSSBOW", 19, class_1802.field_8399, "\u0410\u0440\u0431\u0430\u043b\u0435\u0442", "\u0430\u0440\u0431\u0430\u043b\u0435\u0442");
        u = new fh("SHULKER", 20, class_1802.field_8545, "\u0428\u0430\u043b\u043a\u0435\u0440", "\u044f\u0449\u0438\u043a");
        v = new fh("POTION_POPPER", 21, class_1802.field_8436, "\u0425\u043b\u043e\u043f\u0443\u0448\u043a\u0430", null, 16738740, -1);
        w = new fh("SVYATAYA_VODA", 22, class_1802.field_8436, "\u0421\u0432\u044f\u0442\u0430\u044f \u0432\u043e\u0434\u0430", "\u0441\u0432\u044f\u0442\u0430\u044f \u0432\u043e\u0434\u0430", 0xFFFFFF, -1);
        x = new fh("POTION_GNEVA", 23, class_1802.field_8436, "\u0417\u0435\u043b\u044c\u0435 \u0413\u043d\u0435\u0432\u0430", "\u0437\u0435\u043b\u044c\u0435 \u0433\u043d\u0435\u0432\u0430", 0x993333, -1);
        y = new fh("POTION_PALADINA", 24, class_1802.field_8436, "\u0417\u0435\u043b\u044c\u0435 \u041f\u0430\u043b\u043b\u0430\u0434\u0438\u043d\u0430", "\u0437\u0435\u043b\u044c\u0435 \u043f\u0430\u043b\u043b\u0430\u0434\u0438\u043d\u0430", 65535, -1);
        z = new fh("POTION_ASSASINA", 25, class_1802.field_8436, "\u0417\u0435\u043b\u044c\u0435 \u0410\u0441\u0441\u0430\u0441\u0438\u043d\u0430", "\u0437\u0435\u043b\u044c\u0435 \u0430\u0441\u0441\u0430\u0441\u0438\u043d\u0430", 0x333333, -1);
        A = new fh("POTION_RADIACII", 26, class_1802.field_8436, "\u0417\u0435\u043b\u044c\u0435 \u0420\u0430\u0434\u0438\u0430\u0446\u0438\u0438", "\u0437\u0435\u043b\u044c\u0435 \u0440\u0430\u0434\u0438\u0430\u0446\u0438\u0438", 3329330, -1);
        B = new fh("SNOTVORNOE", 27, class_1802.field_8436, "\u0421\u043d\u043e\u0442\u0432\u043e\u0440\u043d\u043e\u0435", "\u0441\u043d\u043e\u0442\u0432\u043e\u0440\u043d\u043e\u0435", 255, -1);
        C = new fh("TALIC_MRAKA", 28, class_1802.field_8288, "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u041c\u0440\u0430\u043a\u0430", null, -1, 1, true);
        D = new fh("TALIC_VIHRYA", 29, class_1802.field_8288, "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u0412\u0438\u0445\u0440\u044f", null, -1, 2, true);
        E = new fh("TALIC_DEMONA", 30, class_1802.field_8288, "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u0414\u0435\u043c\u043e\u043d\u0430", null, -1, 3, true);
        F = new fh("TALIC_RAZDORA", 31, class_1802.field_8288, "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u0420\u0430\u0437\u0434\u043e\u0440\u0430", null, -1, 4, true);
        G = new fh("TALIC_YAROSTI", 32, class_1802.field_8288, "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u042f\u0440\u043e\u0441\u0442\u0438", null, -1, 5, false);
        H = new fh("TALIC_KRUSHITELYA", 33, class_1802.field_8288, "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u041a\u0440\u0443\u0448\u0438\u0442\u0435\u043b\u044f", null, -1, 6, false);
        I = new fh("TALIC_KARATELYA", 34, class_1802.field_8288, "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u041a\u0430\u0440\u0430\u0442\u0435\u043b\u044f", null, -1, 7, false);
        J = new fh("TALIC_TIRANA", 35, class_1802.field_8288, "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u0422\u0438\u0440\u0430\u043d\u0430", null, -1, 8, true);
        V = fh.a();
    }

    public static /* bridge */ /* synthetic */ fh[] values() {
        return (fh[])V.clone();
    }

    public static /* bridge */ /* synthetic */ fh b(int n2) {
        for (fh fh2 : fh.values()) {
            if (fh2.S != n2) continue;
            return fh2;
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ fh a(int n2) {
        for (fh fh2 : fh.values()) {
            if (fh2.R != n2) continue;
            return fh2;
        }
        return null;
    }

    private static /* bridge */ /* synthetic */ fh[] a() {
        return new fh[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J};
    }

    public static /* bridge */ /* synthetic */ fh a(String string) {
        return Enum.valueOf(fh.class, string);
    }
}

