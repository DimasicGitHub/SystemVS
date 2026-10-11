/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1541;
import net.minecraft.class_1657;
import net.minecraft.class_1685;
import net.minecraft.class_1937;
import net.minecraft.class_238;
import net.minecraft.class_243;

public class ib {
    public static /* bridge */ /* synthetic */ boolean b(class_1937 class_19372, class_1657 class_16572, double d2) {
        if (class_19372 == null || class_16572 == null) {
            return false;
        }
        List list = class_19372.method_8390(class_1685.class, ib.a(class_16572, d2), class_16852 -> class_16852.method_24921() != class_16572);
        for (class_1685 class_16853 : list) {
            class_243 class_2432;
            if ((double)class_16572.method_5739((class_1297)class_16853) > d2 || (class_2432 = class_16853.method_18798()).method_1027() < 0.01) continue;
            class_243 class_2433 = class_16572.method_19538().method_1020(class_16853.method_19538());
            if (class_2433.method_1027() < 1.0E-4) {
                return true;
            }
            if (!(class_2432.method_1029().method_1026(class_2433.method_1029()) > 0.5)) continue;
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean a(int n2, class_1937 class_19372, double d2, class_1657 class_16572) {
        if (class_19372 == null || class_16572 == null) {
            return false;
        }
        List list = class_19372.method_8390(class_1541.class, ib.a(class_16572, d2), class_15412 -> class_15412.method_6969() <= n2);
        for (class_1541 class_15413 : list) {
            if (!((double)class_16572.method_5739((class_1297)class_15413) <= d2)) continue;
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean a(class_1937 class_19372, class_1657 class_16572, double d2) {
        if (class_19372 == null || class_16572 == null) {
            return false;
        }
        List list = class_19372.method_8390(class_1511.class, ib.a(class_16572, d2), class_15112 -> true);
        for (class_1511 class_15113 : list) {
            if (!((double)class_16572.method_5739((class_1297)class_15113) <= d2)) continue;
            return true;
        }
        return false;
    }

    private static /* bridge */ /* synthetic */ class_238 a(class_1657 class_16572, double d2) {
        return class_16572.method_5829().method_1014(Math.min(d2, 128.0));
    }
}

