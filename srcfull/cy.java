/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import net.minecraft.class_1297;
import net.minecraft.class_1308;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_238;
import net.minecraft.class_243;

public class cy {
    public static /* bridge */ /* synthetic */ double a(class_1309 class_13092) {
        if (lo.aM.field_1724 == null) {
            return Double.MAX_VALUE;
        }
        class_243 class_2432 = lo.aM.field_1724.method_5836(1.0f);
        class_238 class_2383 = class_13092.method_5829().method_1014((double)class_13092.method_5871());
        double d2 = Math.max(0.0, Math.max(class_2383.field_1323 - class_2432.field_1352, class_2432.field_1352 - class_2383.field_1320));
        double d3 = Math.max(0.0, Math.max(class_2383.field_1322 - class_2432.field_1351, class_2432.field_1351 - class_2383.field_1325));
        double d4 = Math.max(0.0, Math.max(class_2383.field_1321 - class_2432.field_1350, class_2432.field_1350 - class_2383.field_1324));
        return d2 * d2 + d3 * d3 + d4 * d4;
    }

    public static /* bridge */ /* synthetic */ class_243 a(class_1309 class_13092) {
        return new class_243(class_13092.method_23317(), class_13092.method_23318() + (double)class_13092.method_17682() * 0.5, class_13092.method_23321());
    }

    public static /* bridge */ /* synthetic */ boolean a(class_1309 class_13092) {
        for (class_1799 class_17992 : class_13092.method_5661()) {
            if (class_17992.method_7960()) continue;
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean a(boolean bl2, boolean bl3, boolean bl4, class_1309 class_13092, boolean bl5) {
        if (lo.aM.field_1724 == null || class_13092 == null || class_13092 == lo.aM.field_1724 || class_13092.method_29504() || !class_13092.method_5805() || class_13092.method_7325() || class_13092.method_6032() <= 0.0f) {
            return false;
        }
        if (!bl5 && class_13092.method_5767()) {
            return false;
        }
        if (!bl3 && class_13092.method_6039()) {
            return false;
        }
        if (bl2 && !cy.a(class_13092)) {
            return false;
        }
        if (class_13092 instanceof class_1657) {
            return !eV.a().a(class_13092.method_5477().getString());
        }
        return !bl4 && class_13092 instanceof class_1308;
    }

    public static /* bridge */ /* synthetic */ boolean a(class_1309 class_13092, boolean bl2, double d2, double d3) {
        if (lo.aM.field_1724 == null) {
            return false;
        }
        if (!bl2) {
            return (double)lo.aM.field_1724.method_5739((class_1297)class_13092) <= d2;
        }
        double d4 = class_13092.method_23317() - lo.aM.field_1724.method_23317();
        double d5 = class_13092.method_23318() - lo.aM.field_1724.method_23318();
        double d6 = class_13092.method_23321() - lo.aM.field_1724.method_23321();
        double d7 = d4 * d4 + d6 * d6;
        double d8 = Math.sqrt(d7);
        return d8 <= d2 && Math.abs(d5) <= d3;
    }

    public static /* bridge */ /* synthetic */ Stream a(double d2, boolean bl2, double d3) {
        if (lo.aM.field_1687 == null || lo.aM.field_1724 == null) {
            return Stream.empty();
        }
        return StreamSupport.stream(lo.aM.field_1687.method_18112().spliterator(), false).filter(class_12972 -> class_12972 instanceof class_1309).map(class_12972 -> (class_1309)class_12972).filter(class_13092 -> {
            double d4 = d3;
            boolean bl3 = bl2;
            double d5 = d2;
            class_1309 class_13093 = class_13092;
            return cy.a(class_13093, bl3, d5, d4);
        });
    }

    public static /* bridge */ /* synthetic */ boolean a(class_1309 class_13092, float f2) {
        if (lo.aM.field_1724 == null) {
            return true;
        }
        if (f2 >= 180.0f) {
            return true;
        }
        class_243 class_2432 = class_13092.method_19538().method_1031(0.0, (double)(class_13092.method_17682() / 2.0f), 0.0).method_1020(lo.aM.field_1724.method_33571()).method_1029();
        double d2 = Math.max(-1.0, Math.min(1.0, lo.aM.field_1724.method_5828(1.0f).method_1026(class_2432)));
        return Math.toDegrees(Math.acos(d2)) <= (double)(f2 / 2.0f);
    }

    public static /* bridge */ /* synthetic */ class_1309 a(float f2, class_1309 class_13093, int n2, List list, String string) {
        if (list.isEmpty()) {
            return null;
        }
        if (lo.aM.field_1724 == null) {
            return null;
        }
        return switch (string) {
            case "\u0422\u0435\u043a\u0443\u0449\u0430\u044f \u0446\u0435\u043b\u044c" -> {
                if (class_13093 != null && (float)n2 < f2 && list.contains(class_13093)) {
                    yield class_13093;
                }
                yield list.stream().min(Comparator.comparingDouble(class_13092 -> lo.aM.field_1724.method_5739((class_1297)class_13092))).orElse(null);
            }
            case "\u041c\u0435\u043d\u044c\u0448\u0435 HP" -> list.stream().min(Comparator.comparingDouble(class_1309::method_6032)).orElse(null);
            default -> list.stream().min(Comparator.comparingDouble(class_13092 -> lo.aM.field_1724.method_5739((class_1297)class_13092))).orElse(null);
        };
    }

    public static /* bridge */ /* synthetic */ boolean a(double d2, class_243 class_2432) {
        if (lo.aM.field_1724 == null) {
            return false;
        }
        class_243 class_2433 = class_2432.method_1020(lo.aM.field_1724.method_33571()).method_1029();
        double d3 = Math.max(-1.0, Math.min(1.0, lo.aM.field_1724.method_5828(1.0f).method_1026(class_2433)));
        return Math.toDegrees(Math.acos(d3)) <= d2;
    }
}

