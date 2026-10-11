/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;
import net.minecraft.class_1268;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1937;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_3218;
import net.minecraft.class_437;
import net.minecraft.class_634;
import net.minecraft.class_636;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_757;

public class lo
implements fU {
    public static /* synthetic */ long aL;
    public static /* synthetic */ class_310 aM;

    static {
        aL = 1000000000L;
        aM = class_310.method_1551();
    }

    public /* bridge */ /* synthetic */ boolean e(class_1657 class_16572) {
        return eV.a().a(class_16572);
    }

    public /* bridge */ /* synthetic */ class_1657 b() {
        return lo.aM.field_1724;
    }

    protected /* bridge */ /* synthetic */ class_1268 b() {
        return class_1268.field_5810;
    }

    public /* bridge */ /* synthetic */ void c(String string) {
        if (this.y()) {
            lo.aM.field_1724.method_7353(class_2561.method_30163((String)string), false);
        }
    }

    protected /* bridge */ /* synthetic */ void c(int n2) {
        class_636 class_6362 = lo.aM.field_1761;
        class_746 class_7462 = lo.aM.field_1724;
        if (class_6362 != null && class_7462 != null) {
            class_6362.method_2906(class_7462.field_7512.field_7763, n2, 0, class_1713.field_7790, (class_1657)class_7462);
        }
    }

    public /* bridge */ /* synthetic */ boolean f(class_1309 class_13092) {
        return eV.a().a(class_13092);
    }

    protected /* bridge */ /* synthetic */ void d(int n2) {
        this.c(n2 < 9 ? n2 + 36 : n2);
        this.c(6);
        this.c(n2 < 9 ? n2 + 36 : n2);
    }

    public /* bridge */ /* synthetic */ boolean d(String string) {
        return eV.a().a(string);
    }

    protected /* bridge */ /* synthetic */ void d(int n2, int n3) {
        this.c(n2 < 9 ? n2 + 36 : n2);
        this.c(n3 < 9 ? n3 + 36 : n3);
        this.c(n2 < 9 ? n2 + 36 : n2);
    }

    public /* bridge */ /* synthetic */ void d(String string) {
        if (this.y()) {
            hB.a();
            lo.aM.field_1724.method_7353(class_2561.method_30163((String)string), false);
        }
    }

    protected /* bridge */ /* synthetic */ class_3218 a() {
        return aM.method_1576() != null ? aM.method_1576().method_3847(Objects.requireNonNull(lo.aM.field_1687).method_27983()) : null;
    }

    protected /* bridge */ /* synthetic */ void a(class_1268 class_12682) {
        class_636 class_6362 = lo.aM.field_1761;
        class_746 class_7462 = lo.aM.field_1724;
        if (class_6362 != null && class_7462 != null) {
            class_6362.method_2919((class_1657)class_7462, class_12682);
        }
    }

    protected /* bridge */ /* synthetic */ class_1268 a() {
        return class_1268.field_5808;
    }

    public /* bridge */ /* synthetic */ class_1937 a() {
        return lo.aM.field_1687;
    }

    public /* bridge */ /* synthetic */ class_310 a() {
        return aM;
    }

    protected /* bridge */ /* synthetic */ class_437 a() {
        return lo.aM.field_1755;
    }

    protected /* bridge */ /* synthetic */ class_634 a() {
        return aM.method_1562();
    }

    protected /* bridge */ /* synthetic */ class_1661 a() {
        class_746 class_7462 = lo.aM.field_1724;
        return class_7462 != null ? class_7462.method_31548() : null;
    }

    public /* bridge */ /* synthetic */ class_757 a() {
        return lo.aM.field_1773;
    }

    protected /* bridge */ /* synthetic */ class_315 a() {
        return lo.aM.field_1690;
    }

    protected /* bridge */ /* synthetic */ class_638 a() {
        return lo.aM.field_1687;
    }

    protected /* bridge */ /* synthetic */ class_746 a() {
        return lo.aM.field_1724;
    }

    protected /* bridge */ /* synthetic */ class_636 a() {
        return lo.aM.field_1761;
    }

    protected /* bridge */ /* synthetic */ boolean z() {
        return !this.y();
    }

    protected /* bridge */ /* synthetic */ boolean y() {
        return lo.aM.field_1724 != null && lo.aM.field_1687 != null;
    }
}

