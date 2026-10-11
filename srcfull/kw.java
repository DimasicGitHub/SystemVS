/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import net.minecraft.class_5498;

public class kw {
    private static /* synthetic */ float a;
    private static /* synthetic */ int b;
    private static /* synthetic */ int c;
    private static /* synthetic */ double d;
    private static /* synthetic */ double e;
    private static /* synthetic */ boolean f;
    private static /* synthetic */ float g;
    private static /* synthetic */ float h;
    private static /* synthetic */ class_243 i;

    static {
        a = Float.NaN;
        b = -1;
        c = -1;
        d = -2.0;
        e = 0.0;
        f = true;
        g = Float.NaN;
        h = Float.NaN;
        i = null;
    }

    public static /* bridge */ /* synthetic */ boolean a(double d2, float f2, class_243 class_2432, boolean bl2, class_4184 class_41842, boolean bl3, aT aT2, class_1657 class_16572, class_1657 class_16573) {
        double d3;
        double d4;
        float f3;
        double d5;
        class_4184 class_41843;
        double d6;
        double d7;
        float f4;
        double d8 = d2;
        class_1657 class_16574 = class_16573;
        class_243 class_2433 = class_2432;
        aT aT3 = aT2;
        boolean bl4 = bl2;
        boolean bl5 = bl3;
        class_1657 class_16575 = class_16572;
        if (!kw.a(d8, class_16574, class_2433, aT3, bl4, bl5, class_16575)) {
            return false;
        }
        if (class_16572 == class_16573) {
            return true;
        }
        if (class_16572.method_5858((class_1297)class_16573) < 4.0) {
            return true;
        }
        class_243 class_2434 = class_16572.method_19538();
        class_4184 class_41844 = class_41842;
        float f5 = class_16572.method_17682();
        double d9 = class_2434.field_1351 + (double)f5 + 0.5;
        return kw.a(class_41844, d9, f4 = f2, d7 = class_2434.field_1350, d6 = class_2434.field_1352) || kw.a(class_41843 = class_41842, d5 = class_2434.field_1351 + (double)f5 / 2.0, f3 = f2, d4 = class_2434.field_1350, d3 = class_2434.field_1352);
    }

    public static /* bridge */ /* synthetic */ boolean a(class_243 class_2432, class_1542 class_15422, double d2, boolean bl2, double d3) {
        if (class_15422 == null || !class_15422.method_5805()) {
            return false;
        }
        double d4 = d3;
        class_243 class_2433 = class_2432;
        class_243 class_2434 = class_15422.method_19538();
        if (!gv.a(class_2434, d4, class_2433)) {
            return false;
        }
        if ((double)class_15422.method_6983().method_7947() < d2) {
            return false;
        }
        return !bl2 || gv.a(class_15422.method_6983().method_7909());
    }

    public static /* bridge */ /* synthetic */ int a(class_1657 class_16572, boolean bl2, double d2, class_243 class_2432, List list, aT aT2, boolean bl3) {
        int n2 = 0;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            double d3 = d2;
            class_1657 class_16573 = class_16572;
            class_243 class_2433 = class_2432;
            aT aT3 = aT2;
            boolean bl4 = bl2;
            boolean bl5 = bl3;
            class_1657 class_16574 = (class_1657)iterator.next();
            class_1657 class_16575 = class_16574;
            if (!kw.a(d3, class_16573, class_2433, aT3, bl4, bl5, class_16575)) continue;
            ++n2;
        }
        return n2;
    }

    public static /* bridge */ /* synthetic */ boolean a(double d2, class_1657 class_16572, class_243 class_2432, aT aT2, boolean bl2, boolean bl3, class_1657 class_16573) {
        if (class_16573 == class_16572) {
            if (!bl3) {
                return false;
            }
            if (lo.aM.field_1690.method_31044() == class_5498.field_26664) {
                return false;
            }
        }
        if (!class_16573.method_5805()) {
            return false;
        }
        double d3 = d2;
        class_243 class_2433 = class_2432;
        class_243 class_2434 = class_16573.method_19538();
        if (!gv.a(class_2434, d3, class_2433)) {
            return false;
        }
        return bl2 || !aT2.e(class_16573);
    }

    private static /* bridge */ /* synthetic */ void a(float f2) {
        int n2 = lo.aM.method_22683().method_4489();
        int n3 = lo.aM.method_22683().method_4506();
        if (f2 == a && n2 == b && n3 == c) {
            return;
        }
        double d2 = n3 > 0 ? (double)n2 / (double)n3 : 1.7777777777777777;
        double d3 = Math.toRadians(f2);
        double d4 = Math.tan(d3 / 2.0);
        double d5 = 2.0 * Math.atan(d4 * d2);
        double d6 = Math.tan(d5 / 2.0);
        double d7 = 2.0 * Math.atan(Math.sqrt(d6 * d6 + d4 * d4));
        double d8 = d7 / 2.0 + Math.toRadians(10.0);
        double d9 = Math.cos(d8);
        a = f2;
        b = n2;
        c = n3;
        d = d9;
        e = d9 * d9;
        f = d9 >= 0.0;
    }

    public static /* bridge */ /* synthetic */ boolean a(class_243 class_2432, float f2, class_4184 class_41842) {
        float f3 = f2;
        class_4184 class_41843 = class_41842;
        double d2 = class_2432.field_1350;
        double d3 = class_2432.field_1351;
        double d4 = class_2432.field_1352;
        return kw.a(class_41843, d3, f3, d2, d4);
    }

    public static /* bridge */ /* synthetic */ boolean a(class_4184 class_41842, double d2, float f2, double d3, double d4) {
        class_243 class_2432 = class_41842.method_19326();
        double d5 = d4 - class_2432.field_1352;
        double d6 = d2 - class_2432.field_1351;
        double d7 = d3 - class_2432.field_1350;
        double d8 = d5 * d5 + d6 * d6 + d7 * d7;
        if (d8 < 1.0E-9) {
            return true;
        }
        class_243 class_2433 = kw.a(class_41842);
        double d9 = d5 * class_2433.field_1352 + d6 * class_2433.field_1351 + d7 * class_2433.field_1350;
        kw.a(f2);
        if (f) {
            return d9 >= 0.0 && d9 * d9 >= e * d8;
        }
        return d9 >= 0.0 || d9 * d9 >= e * d8;
    }

    private static /* bridge */ /* synthetic */ class_243 a(class_4184 class_41842) {
        float f2 = class_41842.method_19330();
        float f3 = class_41842.method_19329();
        if (i != null && f2 == g && f3 == h) {
            return i;
        }
        g = f2;
        h = f3;
        i = class_243.method_1030((float)f3, (float)f2);
        return i;
    }
}

