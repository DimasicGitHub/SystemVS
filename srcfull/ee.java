/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1309;
import net.minecraft.class_6880;

public final class ee
extends Enum<ee> {
    public static final /* synthetic */ /* enum */ ee a;
    public static final /* synthetic */ /* enum */ ee b;
    public static final /* synthetic */ /* enum */ ee c;
    public static final /* synthetic */ /* enum */ ee d;
    public static final /* synthetic */ /* enum */ ee e;
    public final /* synthetic */ fh f;
    public final /* synthetic */ String g;
    private final /* synthetic */ List<en> h;
    private static final /* synthetic */ ee[] i;

    private /* synthetic */ ee(String string, int n2, fh fh2, String string2, en ... enArray) {
        this.f = fh2;
        this.g = string2;
        this.h = List.of(enArray);
    }

    static {
        a = new ee("SNOTVORNOE", 0, fh.B, "\u0421\u043d\u043e\u0442\u0432\u043e\u0440\u043a\u0430", ee.a(class_1294.field_5911, 2), ee.a(class_1294.field_5901, 2), ee.a(class_1294.field_5920, 3), ee.a(class_1294.field_5919, 1));
        b = new ee("PALADIN", 1, fh.y, "\u041f\u0430\u043b\u043b\u0430\u0434\u0438\u043d\u043a\u0430", ee.a(class_1294.field_5914, 3), ee.a(class_1294.field_5907, 1), ee.a(class_1294.field_5918, 1), ee.a(class_1294.field_5905, 1));
        c = new ee("SVYATAYA_VODA", 2, fh.w, "\u0421\u0432\u044f\u0442\u043a\u0430", ee.a(class_1294.field_5924, 2), ee.a(class_1294.field_5905, 2));
        d = new ee("ASSASIN", 3, fh.z, "\u0410\u0441\u0441\u0430\u0441\u0438\u043d\u043a\u0430", ee.a(class_1294.field_5910, 4), ee.a(class_1294.field_5904, 3), ee.a(class_1294.field_5917, 1));
        e = new ee("RADIACIYA", 4, fh.A, "\u0420\u0430\u0434\u0438\u0430\u0446\u0438\u044f", ee.a(class_1294.field_5899, 2), ee.a(class_1294.field_5920, 2), ee.a(class_1294.field_5909, 3), ee.a(class_1294.field_5903, 5), ee.a(class_1294.field_5912, 1));
        i = ee.a();
    }

    public static /* bridge */ /* synthetic */ ee[] values() {
        return (ee[])i.clone();
    }

    public /* bridge */ /* synthetic */ boolean a(class_1293 class_12932) {
        if (class_12932 == null) {
            return false;
        }
        for (en en2 : this.h) {
            if (!en2.a(class_12932)) continue;
            return true;
        }
        return false;
    }

    private static /* bridge */ /* synthetic */ class_1293 a(class_1309 class_13092, en en2) {
        class_1293 class_12932 = class_13092.method_6112(en2.a());
        return class_12932 != null && en2.a(class_12932) ? class_12932 : null;
    }

    private static /* bridge */ /* synthetic */ ee[] a() {
        return new ee[]{a, b, c, d, e};
    }

    public /* bridge */ /* synthetic */ class_1293 a(class_1309 class_13092) {
        return class_13092 == null ? null : ee.a(class_13092, (en)((Object)this.h.getFirst()));
    }

    public static /* bridge */ /* synthetic */ ee a(String string) {
        return Enum.valueOf(ee.class, string);
    }

    public /* bridge */ /* synthetic */ boolean a(class_1309 class_13092) {
        if (class_13092 == null) {
            return false;
        }
        for (en en2 : this.h) {
            if (ee.a(class_13092, en2) != null) continue;
            return false;
        }
        return true;
    }

    private static /* bridge */ /* synthetic */ en a(class_6880 class_68802, int n2) {
        return new en(class_68802, n2);
    }
}

