/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_3965;

public class ax
extends aT {
    private /* synthetic */ kn a;
    private /* synthetic */ jh b;
    private /* synthetic */ dw c;
    private /* synthetic */ gz d;
    private /* synthetic */ gz e;
    private /* synthetic */ gp f;
    private /* synthetic */ int g;
    private /* synthetic */ int h;
    private /* synthetic */ int i;
    private /* synthetic */ int j;
    private /* synthetic */ class_2338 k;
    private /* synthetic */ class_243 l;
    private final /* synthetic */ cT m;
    private /* synthetic */ int n;

    public /* synthetic */ ax() {
        super("\u0428\u0435\u0431\u0422\u0440\u0430\u043f", fV.a);
        kn kn2 = new kn("", "", -1, () -> {
            if (this.f != gp.a) {
                return;
            }
            if (!this.y()) {
                return;
            }
            this.k = this.a();
            if (this.k == null) {
                return;
            }
            if (!this.a()) {
                return;
            }
            this.n = 0;
            this.l = class_243.method_24953((class_2382)this.k).method_1031(0.0, -0.5, 0.0);
            this.h = this.b().method_31548().field_7545;
            this.a(gp.b);
        });
        kn2.setNameParts(new String[]{"K", "\u043d", "\u043e", "\u043f", "\u043a", "\u0430"});
        kn2.setDescriptionParts(new String[]{"\u043d", "a", "\u0436", "\u043c", "\u0438", "\u0442", "\u0435", " ", "\u0434", "\u043b", "\u044f", " ", "\u0440", "a", "\u0437", "\u043c", "\u0435", "\u0449", "\u0435", "\u043d", "\u0438", "\u044f", " ", "\u043f", "a", "\u0443", "\u0442", "\u0438", "\u043d", "\u044b"});
        this.a = kn2;
        jh jh2 = new jh("", "", List.of(ec.join(new String[]{"O", "\u0434", "\u043d", "\u0430"}), ec.join(new String[]{"\u0414", "\u0432", "e"})), List.of(ec.join(new String[]{"O", "\u0434", "\u043d", "\u0430"})), false);
        jh2.setNameParts(new String[]{"K", "\u043e", "\u043b", "\u0438", "\u0447", "\u0435", "\u0441", "\u0442", "\u0432", "\u043e"});
        jh2.setDescriptionParts(new String[]{"c", "\u043a", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u043f", "a", "\u0443", "\u0442", "\u0438", "\u043d", " ", "c", "\u0442", "\u0430", "\u0432", "\u0438", "\u0442", "\u044c"});
        this.b = jh2;
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"\u0420", "o", "\u0442", "\u0430", "\u0446", "\u0438", "\u044f"});
        dw2.setDescriptionParts(new String[]{"\u043f", "o", "\u0432", "\u043e", "\u0440", "\u0430", "\u0447", "\u0438", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u043a", "a", "\u043c", "\u0435", "\u0440", "\u0443", " ", "\u043a", " ", "\u0431", "\u043b", "o", "\u043a", "\u0443"});
        this.c = dw2;
        gz gz2 = new gz("", "", 5.0, 1.0, 10.0, 0.5);
        gz2.setNameParts(new String[]{"C", "\u043a", "\u043e", "\u0440", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u043d", "a", "\u0432", "\u043e", "\u0434", "\u043a", "\u0438"});
        gz2.setDescriptionParts(new String[]{"c", "\u043a", "\u043e", "\u0440", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u043f", "o", "\u0432", "\u043e", "\u0440", "\u043e", "\u0442", "\u0430", " ", "\u043a", "a", "\u043c", "\u0435", "\u0440", "\u044b"});
        this.d = gz2;
        gz gz3 = new gz("", "", 1.0, 0.0, 5.0, 1.0);
        gz3.setNameParts(new String[]{"\u0417", "a", "\u0434", "\u0435", "\u0440", "\u0436", "\u043a", "\u0430"});
        gz3.setDescriptionParts(new String[]{"\u0437", "a", "\u0434", "\u0435", "\u0440", "\u0436", "\u043a", "\u0430", " ", "\u043c", "e", "\u0436", "\u0434", "\u0443", " ", "c", "\u0442", "\u0430", "\u0434", "\u0438", "\u044f", "\u043c", "\u0438", " ", "(", "\u0442", "\u0438", "\u043a", "\u0438", ")"});
        this.e = gz3;
        this.f = gp.a;
        this.g = 0;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.m = new cT();
        this.n = 0;
        this.d.a(this.c::a);
        this.a(this.a, this.b, this.c, this.d, this.e);
    }

    private /* bridge */ /* synthetic */ int b() {
        return bw.d(class_1802.field_8786);
    }

    private /* bridge */ /* synthetic */ void b() {
        this.f = gp.a;
        this.g = 0;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = null;
        this.l = null;
        this.m.a();
        this.n = 0;
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.b();
    }

    private /* bridge */ /* synthetic */ int a() {
        return bw.b(class_1802.field_8786);
    }

    private /* bridge */ /* synthetic */ class_2338 a() {
        class_243 class_2432 = this.b().method_19538();
        class_238 class_2383 = new class_238(class_2432.field_1352 - 4.0, class_2432.field_1351 - 4.0, class_2432.field_1350 - 4.0, class_2432.field_1352 + 4.0, class_2432.field_1351 + 4.0, class_2432.field_1350 + 4.0);
        List list = this.a().method_8390(class_1657.class, class_2383, class_16572 -> class_16572.method_5805() && class_16572 != this.b() && !this.e((class_1657)class_16572));
        class_1657 class_16573 = list.stream().min(Comparator.comparingDouble(class_16572 -> class_16572.method_5858((class_1297)this.b()))).orElse(null);
        if (class_16573 == null) {
            return null;
        }
        class_243 class_2433 = class_16573.method_19538();
        boolean bl2 = false;
        boolean bl3 = false;
        for (double d2 = -0.31; d2 <= 0.31; d2 += 0.31) {
            for (double d3 = -0.31; d3 <= 0.31; d3 += 0.31) {
                if (this.a().method_8320(class_2338.method_49637((double)(class_2433.field_1352 + d2), (double)class_2433.field_1351, (double)(class_2433.field_1350 + d3))).method_26204() == class_2246.field_10343) {
                    bl2 = true;
                }
                if (this.a().method_8320(class_2338.method_49637((double)(class_2433.field_1352 + d2), (double)(class_2433.field_1351 + (double)class_16573.method_5751()), (double)(class_2433.field_1350 + d3))).method_26204() != class_2246.field_10343) continue;
                bl3 = true;
            }
        }
        class_2338 class_23382 = class_16573.method_24515();
        if (!bl2 && this.a().method_8320(class_23382).method_26215()) {
            return class_23382;
        }
        if (!bl3 && this.a().method_8320(class_23382.method_10084()).method_26215()) {
            return class_23382.method_10084();
        }
        return null;
    }

    private /* bridge */ /* synthetic */ boolean a() {
        return this.a() != -1 || this.b() != -1;
    }

    private /* bridge */ /* synthetic */ boolean a(double d2, class_243 class_2432) {
        double d3 = d2;
        class_243 class_2433 = class_2432;
        return cy.a(d3, class_2433);
    }

    private /* bridge */ /* synthetic */ void a(gp gp2) {
        this.f = gp2;
        this.g = this.e.a();
    }

    @Override
    public /* bridge */ /* synthetic */ void k() {
        if (this.f == gp.a || this.l == null || !this.c.a()) {
            return;
        }
        if (this.z()) {
            return;
        }
        double d2 = this.d.d();
        class_243 class_2432 = this.l;
        this.m.a(d2, class_2432);
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.b();
    }

    @Override
    public /* bridge */ /* synthetic */ void j() {
        if (this.z() || this.f == gp.a) {
            return;
        }
        if (this.g > 0) {
            --this.g;
            return;
        }
        switch (this.f.ordinal()) {
            case 1: {
                int n2 = this.a();
                if (n2 != -1) {
                    this.i = n2;
                    this.a().field_7545 = n2;
                } else {
                    this.j = this.b();
                    if (this.j == -1) {
                        this.b();
                        return;
                    }
                    this.i = (this.h + 1) % 9;
                    if (this.i == this.h) {
                        this.i = (this.h + 2) % 9;
                    }
                    this.a().method_2906(this.b().field_7512.field_7763, this.j, this.i, class_1713.field_7791, this.b());
                    this.a().field_7545 = this.i;
                }
                this.a(gp.c);
                break;
            }
            case 2: {
                class_243 class_2432;
                double d2;
                if (this.k == null || !this.a().method_8320(this.k).method_26215()) {
                    this.b();
                    return;
                }
                if (this.c.a() && !this.a(d2 = 15.0, class_2432 = this.l)) {
                    this.g = 1;
                    return;
                }
                class_3965 class_39652 = new class_3965(class_243.method_24955((class_2382)this.k), class_2350.field_11036, this.k.method_10074(), false);
                this.a().method_2896(this.a(), this.a(), class_39652);
                this.b().method_6104(this.a());
                this.a(gp.d);
                break;
            }
            case 3: {
                class_2338 class_23382;
                if (this.j != -1) {
                    this.a().method_2906(this.b().field_7512.field_7763, this.j, this.i, class_1713.field_7791, this.b());
                }
                this.a().field_7545 = this.h;
                ++this.n;
                boolean bl2 = "\u0414\u0432e".equals(this.b.a());
                if (bl2 && this.n < 2 && this.a() && (class_23382 = this.a()) != null) {
                    this.k = class_23382;
                    this.l = class_243.method_24953((class_2382)this.k).method_1031(0.0, -0.5, 0.0);
                    this.h = this.a().field_7545;
                    this.i = -1;
                    this.j = -1;
                    this.a(gp.b);
                    return;
                }
                this.b();
            }
        }
    }
}

