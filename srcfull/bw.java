/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_1935;
import net.minecraft.class_2371;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_5537;
import net.minecraft.class_9274;
import net.minecraft.class_9276;
import net.minecraft.class_9279;
import net.minecraft.class_9280;
import net.minecraft.class_9285;
import net.minecraft.class_9290;
import net.minecraft.class_9334;
import net.minecraft.class_9837;

public class bw {
    private static final /* synthetic */ List<ko> a;
    private static final /* synthetic */ List<ko> b;

    static {
        a = new ArrayList<ko>();
        b = new ArrayList<ko>();
    }

    private static /* bridge */ /* synthetic */ void e() {
        if (lo.aM.field_1724 != null && lo.aM.field_1755 == null) {
            lo.aM.field_1724.method_5728(false);
        }
    }

    public static /* bridge */ /* synthetic */ int e(class_1792 class_17922) {
        int n2;
        if (lo.aM.field_1724 == null) {
            return -1;
        }
        class_1661 class_16612 = lo.aM.field_1724.method_31548();
        for (n2 = 0; n2 < 9; ++n2) {
            if (class_16612.method_5438(n2).method_7909() != class_17922) continue;
            return n2;
        }
        for (n2 = 9; n2 < class_16612.method_5439(); ++n2) {
            if (class_16612.method_5438(n2).method_7909() != class_17922) continue;
            return n2;
        }
        return -1;
    }

    public static /* bridge */ /* synthetic */ boolean e(class_1799 class_17992) {
        if (class_17992 == null || class_17992.method_7960()) {
            return false;
        }
        class_9290 class_92902 = (class_9290)class_17992.method_57824(class_9334.field_49632);
        return class_92902 != null && !class_92902.comp_2400().isEmpty();
    }

    public static /* bridge */ /* synthetic */ boolean i(class_1799 class_17992) {
        if (!bw.f(class_17992) || !bw.g(class_17992)) {
            return false;
        }
        fh fh2 = bw.a(class_17992);
        return fh2 != null && fh2.T;
    }

    public static /* bridge */ /* synthetic */ void b(int n2) {
        if (lo.aM.field_1724 == null || n2 < 0 || n2 > 8) {
            return;
        }
        if (lo.aM.field_1724.method_31548().field_7545 == n2) {
            return;
        }
        lo.aM.field_1724.method_31548().field_7545 = n2;
        bw.b();
    }

    public static /* bridge */ /* synthetic */ boolean b(class_1799 class_17992, int n2) {
        if (class_17992 == null || class_17992.method_7960() || class_17992.method_7909() != class_1802.field_8288) {
            return false;
        }
        class_9280 class_92802 = (class_9280)class_17992.method_57824(class_9334.field_49637);
        if (class_92802 == null || class_92802.comp_3354().isEmpty()) {
            return false;
        }
        return (int)((Float)class_92802.comp_3354().getFirst()).floatValue() == n2;
    }

    private static /* bridge */ /* synthetic */ void b(int n2, int n3) {
        if (lo.aM.field_1761 == null || lo.aM.field_1724 == null) {
            return;
        }
        iE.a(2);
        int n4 = lo.aM.field_1724.field_7512.field_7763;
        lo.aM.field_1761.method_2906(n4, n3, n2, class_1713.field_7791, (class_1657)lo.aM.field_1724);
    }

    public static /* bridge */ /* synthetic */ class_1735 b(int n2) {
        if (lo.aM.field_1724 == null) {
            return null;
        }
        class_2371 class_23712 = lo.aM.field_1724.field_7512.field_7761;
        for (class_1735 class_17352 : class_23712) {
            class_1799 class_17992;
            int n3;
            if (class_17352.field_7874 < 9 || class_17352.field_7874 > 35 || !bw.b(class_17992 = class_17352.method_7677(), n3 = n2)) continue;
            return class_17352;
        }
        for (class_1735 class_17352 : class_23712) {
            class_1799 class_17993;
            int n4;
            if (class_17352.field_7874 < 36 || class_17352.field_7874 > 44 || !bw.b(class_17993 = class_17352.method_7677(), n4 = n2)) continue;
            return class_17352;
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ boolean b() {
        return lo.aM.field_1724 != null && lo.aM.field_1724.method_31548().method_5438(38).method_31574(class_1802.field_8833);
    }

    private static /* bridge */ /* synthetic */ boolean b(class_1799 class_17992) {
        class_9279 class_92792 = (class_9279)class_17992.method_57824(class_9334.field_49628);
        if (class_92792 == null || class_92792.method_57458()) {
            return false;
        }
        return bw.a(class_92792.method_57461().toString(), "sphere-");
    }

    public static /* bridge */ /* synthetic */ boolean b(int n2) {
        if (!bw.a(bw.a(n2), bw.a())) {
            return false;
        }
        bw.c(n2, 0);
        return true;
    }

    public static /* bridge */ /* synthetic */ class_1735 b(class_1792 class_17922) {
        class_1735 class_17352;
        class_1792 class_17923 = class_17922;
        int n2 = 35;
        int n3 = 9;
        class_1735 class_17353 = bw.a(class_17923, n2, n3);
        if (class_17353 != null) {
            class_17352 = class_17353;
        } else {
            int n4 = 44;
            int n5 = 36;
            class_1792 class_17924 = class_17922;
            class_17352 = bw.a(class_17924, n4, n5);
        }
        return class_17352;
    }

    public static /* bridge */ /* synthetic */ int b(boolean bl2) {
        int n2 = bw.a(bl2);
        if (n2 == -1 && bl2) {
            n2 = bw.a(false);
        }
        return n2;
    }

    public static /* bridge */ /* synthetic */ void b() {
        if (lo.aM.field_1761 == null || lo.aM.field_1724 == null) {
            return;
        }
        du.a(lo.aM.field_1761);
    }

    public static /* bridge */ /* synthetic */ int b(class_1792 class_17922) {
        boolean bl2 = false;
        int n2 = 8;
        int n3 = 0;
        class_1792 class_17923 = class_17922;
        return bw.a(bl2, class_17923, n2, n3);
    }

    public static /* bridge */ /* synthetic */ void c() {
        bw.a(a);
    }

    public static /* bridge */ /* synthetic */ int c(class_1792 class_17922) {
        int n2 = bw.b(class_17922);
        return n2 == -1 ? -1 : 36 + n2;
    }

    private static /* bridge */ /* synthetic */ void c(int n2, int n3) {
        if (lo.aM.field_1761 == null || lo.aM.field_1724 == null) {
            return;
        }
        iE.a(2);
        int n4 = lo.aM.field_1724.field_7512.field_7763;
        lo.aM.field_1761.method_2906(n4, n2, n3, class_1713.field_7790, (class_1657)lo.aM.field_1724);
    }

    public static /* bridge */ /* synthetic */ boolean h(class_1799 class_17992) {
        return bw.f(class_17992) && !bw.g(class_17992);
    }

    public static /* bridge */ /* synthetic */ boolean f(class_1799 class_17992) {
        return class_17992 != null && !class_17992.method_7960() && class_17992.method_7909() == class_1802.field_8288;
    }

    public static /* bridge */ /* synthetic */ int f(class_1792 class_17922) {
        int n2;
        boolean bl2 = true;
        class_1792 class_17923 = class_17922;
        int n3 = bw.a(bl2, class_17923);
        if (n3 != -1) {
            n2 = n3;
        } else {
            boolean bl3 = false;
            class_1792 class_17924 = class_17922;
            n2 = bw.a(bl3, class_17924);
        }
        return n2;
    }

    private static /* bridge */ /* synthetic */ boolean d(class_1799 class_17992) {
        class_9285 class_92852 = (class_9285)class_17992.method_57824(class_9334.field_49636);
        if (class_92852 == null) {
            return false;
        }
        for (class_9285.class_9287 class_92872 : class_92852.comp_2393()) {
            class_9274 class_92742 = class_92872.comp_2397();
            if (class_92742 != class_9274.field_49218 && class_92742 != class_9274.field_49219) continue;
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ void d(int n2, int n3) {
        if (lo.aM.field_1724 == null || lo.aM.field_1724.field_3944 == null) {
            return;
        }
        iE.a(2);
        class_2371 class_23712 = lo.aM.field_1724.field_7512.field_7761;
        if (n3 >= 0 && n3 < class_23712.size()) {
            class_5537.method_61637((class_1799)((class_1735)class_23712.get(n3)).method_7677(), (int)n2);
        }
        lo.aM.field_1724.field_3944.method_52787((class_2596)new class_9837(n3, n2));
    }

    public static /* bridge */ /* synthetic */ int d(class_1792 class_17922) {
        boolean bl2 = false;
        int n2 = 35;
        int n3 = 9;
        class_1792 class_17923 = class_17922;
        return bw.a(bl2, class_17923, n2, n3);
    }

    public static /* bridge */ /* synthetic */ void d() {
        a.clear();
        b.clear();
        gT.c();
    }

    public static /* bridge */ /* synthetic */ void d(int n2) {
        bw.c(n2, 1);
    }

    public static /* bridge */ /* synthetic */ class_1799 a(int n2) {
        if (lo.aM.field_1724 == null) {
            return class_1799.field_8037;
        }
        class_2371 class_23712 = lo.aM.field_1724.field_7512.field_7761;
        if (n2 < 0 || n2 >= class_23712.size()) {
            return class_1799.field_8037;
        }
        return ((class_1735)class_23712.get(n2)).method_7677();
    }

    public static /* bridge */ /* synthetic */ void a(int n2, int n3) {
        if (n3 < 0 || n3 > 8) {
            return;
        }
        bw.e();
        int n4 = n3;
        int n5 = n2;
        bw.b(n4, n5);
    }

    public static /* bridge */ /* synthetic */ class_1799 a() {
        return lo.aM.field_1724 == null ? class_1799.field_8037 : lo.aM.field_1724.field_7512.method_34255();
    }

    public static /* bridge */ /* synthetic */ int a(int n2, class_1792 class_17922) {
        if (class_17922 == null) {
            return -1;
        }
        class_9276 class_92762 = (class_9276)bw.a(n2).method_57824(class_9334.field_49650);
        if (class_92762 == null) {
            return -1;
        }
        for (int i2 = 0; i2 < class_92762.method_57426(); ++i2) {
            if (class_92762.method_57422(i2).method_7909() != class_17922) continue;
            return i2;
        }
        return -1;
    }

    private static /* bridge */ /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public static /* bridge */ /* synthetic */ int a(class_1792 class_17922, boolean bl2) {
        if (lo.aM.field_1724 == null) {
            return 0;
        }
        int n2 = 0;
        for (int i2 = 0; i2 < 36; ++i2) {
            class_1799 class_17992 = lo.aM.field_1724.method_31548().method_5438(i2);
            if (!class_17992.method_31574(class_17922) || bl2 && !class_17992.method_58657().method_57543()) continue;
            ++n2;
        }
        return n2;
    }

    public static /* bridge */ /* synthetic */ int a(int n2) {
        return n2 < 9 ? n2 + 36 : n2;
    }

    public static /* bridge */ /* synthetic */ int a(boolean bl2, class_1792 class_17922, int n2, int n3) {
        if (class_17922 == null || lo.aM.field_1724 == null) {
            return -1;
        }
        for (int i2 = n3; i2 <= n2; ++i2) {
            class_1799 class_17992 = lo.aM.field_1724.method_31548().method_5438(i2);
            if (!class_17992.method_31574(class_17922) || bl2 && !class_17992.method_58657().method_57543()) continue;
            return i2;
        }
        return -1;
    }

    public static /* bridge */ /* synthetic */ class_1799 a(fh fh2) {
        if (fh2 == null || fh2.K == null) {
            return class_1799.field_8037;
        }
        class_1799 class_17992 = new class_1799((class_1935)fh2.K);
        if (fh2.R >= 0) {
            class_17992.method_57379(class_9334.field_49651, (Object)new class_1844(Optional.empty(), Optional.of(fh2.R), List.of(), Optional.empty()));
        }
        return class_17992;
    }

    public static /* bridge */ /* synthetic */ class_1661 a() {
        return lo.aM.field_1724 != null ? lo.aM.field_1724.method_31548() : null;
    }

    public static /* bridge */ /* synthetic */ cM a(Predicate predicate) {
        if (lo.aM.field_1724 == null || predicate == null) {
            return null;
        }
        int n2 = 35;
        class_2371 class_23712 = lo.aM.field_1724.field_7512.field_7761;
        class_2371 class_23713 = class_23712;
        int n3 = 9;
        Predicate predicate2 = predicate;
        cM cM2 = bw.a(n2, (List)class_23713, n3, predicate2);
        if (cM2 != null) {
            return cM2;
        }
        Predicate predicate3 = predicate;
        int n4 = 44;
        int n5 = 36;
        class_2371 class_23714 = class_23712;
        return bw.a(n4, (List)class_23714, n5, predicate3);
    }

    public static /* bridge */ /* synthetic */ void a(Consumer consumer) {
        if (lo.aM.field_1724 == null || consumer == null) {
            return;
        }
        for (class_1735 class_17352 : lo.aM.field_1724.field_7512.field_7761) {
            class_9276 class_92762;
            class_1799 class_17992;
            if (class_17352.field_7874 < 9 || class_17352.field_7874 > 44 || (class_17992 = class_17352.method_7677()) == null || class_17992.method_7960() || (class_92762 = (class_9276)class_17992.method_57824(class_9334.field_49650)) == null || class_92762.method_57429()) continue;
            for (int i2 = 0; i2 < class_92762.method_57426(); ++i2) {
                class_1799 class_17993 = class_92762.method_57422(i2);
                if (class_17993 == null || class_17993.method_7960()) continue;
                consumer.accept(class_17993);
            }
        }
    }

    private static /* bridge */ /* synthetic */ cM a(int n2, List list, int n3, Predicate predicate) {
        for (class_1735 class_17352 : list) {
            class_9276 class_92762;
            class_1799 class_17992;
            if (class_17352.field_7874 < n3 || class_17352.field_7874 > n2 || (class_17992 = class_17352.method_7677()) == null || class_17992.method_7960() || (class_92762 = (class_9276)class_17992.method_57824(class_9334.field_49650)) == null || class_92762.method_57429()) continue;
            for (int i2 = 0; i2 < class_92762.method_57426(); ++i2) {
                class_1799 class_17993 = class_92762.method_57422(i2);
                if (class_17993 == null || class_17993.method_7960() || !predicate.test(class_17993)) continue;
                return new cM(class_17352, i2);
            }
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ void a(Runnable runnable, int n2, int n3) {
        gT.a();
        Runnable runnable2 = () -> {
            try {
                gT.d();
                bw.a(n3, n2);
            }
            finally {
                gT.b();
                if (runnable != null) {
                    bw.a(runnable);
                }
            }
        };
        int n4 = 1;
        bw.a(runnable2, n4);
    }

    public static /* bridge */ /* synthetic */ void a(int n2) {
        bw.e();
        int n3 = 40;
        int n4 = n2;
        bw.b(n3, n4);
    }

    public static /* bridge */ /* synthetic */ int a() {
        if (lo.aM.field_1724 == null) {
            return -1;
        }
        class_2371 class_23712 = lo.aM.field_1724.field_7512.field_7761;
        for (class_1735 class_17352 : class_23712) {
            if (class_17352.field_7874 < 9 || class_17352.field_7874 > 35 || !class_17352.method_7677().method_7960()) continue;
            return class_17352.field_7874;
        }
        return -1;
    }

    public static /* bridge */ /* synthetic */ boolean a(class_1799 class_17992, class_1799 class_17993) {
        if (class_17992 == null || class_17993 == null || class_17993.method_7960()) {
            return false;
        }
        class_9276 class_92762 = (class_9276)class_17992.method_57824(class_9334.field_49650);
        if (class_92762 == null) {
            return false;
        }
        return new class_9276.class_9277(class_92762).method_57432(class_17993.method_7972()) == class_17993.method_7947();
    }

    public static /* bridge */ /* synthetic */ boolean a(class_1799 class_17992, int n2) {
        if (class_17992 == null || class_17992.method_7960() || class_17992.method_7909() != class_1802.field_8436) {
            return false;
        }
        class_1844 class_18442 = (class_1844)class_17992.method_57824(class_9334.field_49651);
        return class_18442 != null && class_18442.comp_2379().isPresent() && (Integer)class_18442.comp_2379().get() == n2;
    }

    public static /* bridge */ /* synthetic */ class_1735 a(int n2) {
        if (lo.aM.field_1724 == null) {
            return null;
        }
        class_2371 class_23712 = lo.aM.field_1724.field_7512.field_7761;
        for (class_1735 class_17352 : class_23712) {
            if (class_17352.field_7874 < 9 || class_17352.field_7874 > 35 || !bw.a(class_17352.method_7677(), n2)) continue;
            return class_17352;
        }
        for (class_1735 class_17352 : class_23712) {
            if (class_17352.field_7874 < 36 || class_17352.field_7874 > 44 || !bw.a(class_17352.method_7677(), n2)) continue;
            return class_17352;
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ boolean a(String string, String string2) {
        int n2 = string.length() - string2.length();
        for (int i2 = 0; i2 <= n2; ++i2) {
            if (!string.regionMatches(true, i2, string2, 0, string2.length())) continue;
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean a(String string, class_1799 class_17992) {
        if (class_17992 == null || class_17992.method_7960() || string == null) {
            return false;
        }
        class_9290 class_92902 = (class_9290)class_17992.method_57824(class_9334.field_49632);
        if (class_92902 == null) {
            return false;
        }
        for (class_2561 class_25612 : class_92902.comp_2400()) {
            String string2;
            if (class_25612 == null || (string2 = class_25612.getString()) == null || !bw.a(string2, string)) continue;
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ fh a(class_1799 class_17992) {
        if (class_17992 == null || class_17992.method_7960() || class_17992.method_7909() != class_1802.field_8288) {
            return null;
        }
        class_9280 class_92802 = (class_9280)class_17992.method_57824(class_9334.field_49637);
        if (class_92802 == null || class_92802.comp_3354().isEmpty()) {
            return null;
        }
        return fh.b((int)((Float)class_92802.comp_3354().getFirst()).floatValue());
    }

    public static /* bridge */ /* synthetic */ boolean a(class_1799 class_17992, String string) {
        if (class_17992 == null || class_17992.method_7960()) {
            return false;
        }
        return bw.a(class_17992.method_7964().getString(), string);
    }

    public static /* bridge */ /* synthetic */ class_1735 a(class_1792 class_17922, int n2, int n3) {
        if (class_17922 == null || lo.aM.field_1724 == null) {
            return null;
        }
        class_2371 class_23712 = lo.aM.field_1724.field_7512.field_7761;
        for (class_1735 class_17352 : class_23712) {
            if (class_17352.field_7874 < n3 || class_17352.field_7874 > n2 || class_17352.method_7677().method_7909() != class_17922) continue;
            return class_17352;
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ boolean a() {
        return !a.isEmpty() || !b.isEmpty();
    }

    private static /* bridge */ /* synthetic */ void a(List list) {
        if (list.isEmpty()) {
            return;
        }
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ko ko2 = (ko)list.get(i2);
            --ko2.a;
            if (ko2.a > 0) continue;
            try {
                ko2.b.run();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            list.remove(i2);
            --i2;
            --n2;
        }
    }

    public static /* bridge */ /* synthetic */ void a() {
        bw.a(b);
    }

    public static /* bridge */ /* synthetic */ class_1735 a(String string) {
        return bw.a(string, null);
    }

    public static /* bridge */ /* synthetic */ class_1735 a(String string, String string2) {
        if (lo.aM.field_1724 == null) {
            return null;
        }
        if (string == null && string2 == null) {
            return null;
        }
        class_2371 class_23712 = lo.aM.field_1724.field_7512.field_7761;
        String string3 = string == null ? null : string.toLowerCase();
        String string4 = string2 == null ? null : string2.toLowerCase();
        for (class_1735 class_17352 : class_23712) {
            if (class_17352.field_7874 < 9 || class_17352.field_7874 > 35) continue;
            String string5 = string4;
            String string6 = string3;
            class_1799 class_17992 = class_17352.method_7677();
            if (!bw.a(class_17992, string5, string6)) continue;
            return class_17352;
        }
        for (class_1735 class_17352 : class_23712) {
            if (class_17352.field_7874 < 36 || class_17352.field_7874 > 44) continue;
            String string7 = string4;
            String string8 = string3;
            class_1799 class_17993 = class_17352.method_7677();
            if (!bw.a(class_17993, string7, string8)) continue;
            return class_17352;
        }
        return null;
    }

    private static /* bridge */ /* synthetic */ boolean a(class_1799 class_17992, String string, String string2) {
        class_1799 class_17993;
        String string3;
        if (string2 != null && bw.a(class_17992, string2)) {
            return true;
        }
        return string != null && bw.a(string3 = string, class_17993 = class_17992);
    }

    public static /* bridge */ /* synthetic */ int a(boolean bl2) {
        if (lo.aM.field_1724 == null) {
            return -1;
        }
        for (int i2 = 0; i2 < 36; ++i2) {
            class_1799 class_17992 = lo.aM.field_1724.method_31548().method_5438(i2);
            if (!bw.h(class_17992) || bl2 && !class_17992.method_58657().method_57543()) continue;
            return i2;
        }
        return -1;
    }

    public static /* bridge */ /* synthetic */ void a(int n2, Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (n2 <= 0) {
            runnable.run();
            return;
        }
        b.add(new ko(n2, runnable));
    }

    public static /* bridge */ /* synthetic */ void a(Runnable runnable, int n2) {
        if (runnable == null) {
            return;
        }
        if (n2 <= 0) {
            runnable.run();
            return;
        }
        a.add(new ko(n2, runnable));
    }

    public static /* bridge */ /* synthetic */ boolean a(class_1799 class_17992) {
        if (class_17992 == null || class_17992.method_7960()) {
            return false;
        }
        return bw.b(class_17992) || bw.d(class_17992) || bw.a(class_17992.method_7964().getString(), "\u0441\u0444\u0435\u0440\u0430");
    }

    public static /* bridge */ /* synthetic */ bj a() {
        if (lo.aM.field_1724 == null) {
            return null;
        }
        class_2371 class_23712 = lo.aM.field_1724.field_7512.field_7761;
        fY[] fYArray = fY.values();
        int n2 = fYArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            class_2371 class_23713 = class_23712;
            int n3 = 9;
            fY fY2 = fYArray[i2];
            fY fY3 = fY2;
            int n4 = 35;
            bj bj2 = bw.a((List)class_23713, n3, fY3, n4);
            if (bj2 != null) {
                return bj2;
            }
            class_2371 class_23714 = class_23712;
            int n5 = 36;
            fY fY4 = fY2;
            int n6 = 44;
            bj2 = bw.a((List)class_23714, n5, fY4, n6);
            if (bj2 == null) continue;
            return bj2;
        }
        return null;
    }

    private static /* bridge */ /* synthetic */ bj a(List list, int n2, fY fY2, int n3) {
        for (class_1735 class_17352 : list) {
            fh fh2;
            class_1799 class_17992;
            if (class_17352.field_7874 < n2 || class_17352.field_7874 > n3 || !bw.f(class_17992 = class_17352.method_7677()) || bw.a(class_17992, fh2 = bw.a(class_17992)) != fY2) continue;
            return new bj(class_17352, fh2 != null ? fh2 : fh.d);
        }
        return null;
    }

    private static /* bridge */ /* synthetic */ fY a(class_1799 class_17992, fh fh2) {
        if (!bw.g(class_17992)) {
            return fY.d;
        }
        if (fh2 == null) {
            return fY.b;
        }
        return fh2.T ? fY.c : fY.a;
    }

    public static /* bridge */ /* synthetic */ int a(Class clazz) {
        if (clazz == null || lo.aM.field_1724 == null) {
            return -1;
        }
        for (int i2 = 0; i2 < 9; ++i2) {
            if (!clazz.isInstance(lo.aM.field_1724.method_31548().method_5438(i2).method_7909())) continue;
            return i2;
        }
        return -1;
    }

    public static /* bridge */ /* synthetic */ int a(boolean bl2, class_1792 class_17922) {
        boolean bl3 = bl2;
        int n2 = 35;
        int n3 = 0;
        class_1792 class_17923 = class_17922;
        return bw.a(bl3, class_17923, n2, n3);
    }

    public static /* bridge */ /* synthetic */ int a(class_1792 class_17922) {
        boolean bl2 = false;
        class_1792 class_17923 = class_17922;
        return bw.a(bl2, class_17923);
    }

    public static /* bridge */ /* synthetic */ boolean a(int n2) {
        return n2 >= 36 && n2 <= 44;
    }

    public static /* bridge */ /* synthetic */ class_1735 a(class_1792 class_17922) {
        class_1735 class_17352;
        class_1792 class_17923 = class_17922;
        int n2 = 44;
        int n3 = 36;
        class_1735 class_17353 = bw.a(class_17923, n2, n3);
        if (class_17353 != null) {
            class_17352 = class_17353;
        } else {
            int n4 = 35;
            int n5 = 9;
            class_1792 class_17924 = class_17922;
            class_17352 = bw.a(class_17924, n4, n5);
        }
        return class_17352;
    }

    public static /* bridge */ /* synthetic */ class_1735 a(Predicate predicate) {
        if (lo.aM.field_1724 == null || predicate == null) {
            return null;
        }
        class_2371 class_23712 = lo.aM.field_1724.field_7512.field_7761;
        for (class_1735 class_17352 : class_23712) {
            if (class_17352.field_7874 < 9 || class_17352.field_7874 > 35 || !predicate.test(class_17352.method_7677())) continue;
            return class_17352;
        }
        for (class_1735 class_17352 : class_23712) {
            if (class_17352.field_7874 < 36 || class_17352.field_7874 > 44 || !predicate.test(class_17352.method_7677())) continue;
            return class_17352;
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ boolean g(class_1799 class_17992) {
        class_9280 class_92802 = (class_9280)class_17992.method_57824(class_9334.field_49637);
        if (class_92802 == null) {
            return false;
        }
        return !class_92802.comp_3354().isEmpty() || !class_92802.comp_3356().isEmpty() || !class_92802.comp_3355().isEmpty() || !class_92802.comp_3357().isEmpty();
    }
}

