/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2382;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3965;

public class ff
extends aT {
    private /* synthetic */ jh a;
    private /* synthetic */ gz b;
    private /* synthetic */ gz c;
    private /* synthetic */ gz d;
    private /* synthetic */ gz e;
    private /* synthetic */ dw f;
    private /* synthetic */ dw g;
    private /* synthetic */ dw h;
    private /* synthetic */ kn i;
    private final /* synthetic */ hQ j;
    private /* synthetic */ kh k;
    private /* synthetic */ int l;
    private /* synthetic */ int m;
    private /* synthetic */ int n;
    private /* synthetic */ class_2338 o;
    private /* synthetic */ int p;
    private /* synthetic */ int q;
    private /* synthetic */ boolean r;
    private /* synthetic */ class_243 s;
    private final /* synthetic */ cT t;
    private /* synthetic */ class_243 u;
    private /* synthetic */ class_2338 v;
    private /* synthetic */ class_2350 w;

    public /* synthetic */ ff() {
        super("\u0410\u0443\u0442\u043e\u0421\u0440\u0439\u0437\u0442\u0430\u043b", fV.a);
        jh jh2 = new jh("", "", List.of(ec.join(new String[]{"T", "\u0438", "\u043a", "\u043e", "\u0432", "\u0430", "\u044f"}), ec.join(new String[]{"O", "\u0431", "\u044b", "\u0447", "\u043d", "\u0430", "\u044f"})), List.of(ec.join(new String[]{"T", "\u0438", "\u043a", "\u043e", "\u0432", "\u0430", "\u044f"})), false);
        jh2.setNameParts(new String[]{"T", "\u0438", "\u043f", " ", "\u0437", "a", "\u0434", "\u0435", "\u0440", "\u0436", "\u043a", "\u0438"});
        jh2.setDescriptionParts(new String[]{"T", "\u0438", "\u043f", " ", "\u0437", "a", "\u0434", "\u0435", "\u0440", "\u0436", "\u043a", "\u0438", " ", "\u043c", "e", "\u0436", "\u0434", "\u0443", " ", "\u0434", "e", "\u0439", "\u0441", "\u0442", "\u0432", "\u0438", "\u044f", "\u043c", "\u0438"});
        this.a = jh2;
        gz gz2 = new gz("", "", 1.0, 0.0, 10.0, 1.0);
        gz2.setNameParts(new String[]{"\u0414", "e", "\u043b", "\u0435", "\u0439", " ", "c", "\u0442", "\u0430", "\u0432", "\u043a", "\u0438"});
        gz2.setDescriptionParts(new String[]{"\u0417", "a", "\u0434", "\u0435", "\u0440", "\u0436", "\u043a", "\u0430", " ", "\u043f", "o", "\u0441", "\u043b", "\u0435", " ", "\u043f", "o", "\u0441", "\u0442", "\u0430", "\u043d", "\u043e", "\u0432", "\u043a", "\u0438", " ", "o", "\u0431", "\u0441", "\u0438", "\u0434", "\u0438", "\u0430", "\u043d", "\u0430"});
        this.b = gz2;
        gz gz3 = new gz("", "", 1.0, 0.0, 50.0, 1.0);
        gz3.setNameParts(new String[]{"\u0414", "e", "\u043b", "\u0435", "\u0439", " ", "c", "\u0442", "\u0430", "\u0432", "\u043a", "\u0438", " ", "(", "\u043c", "c", ")"});
        gz3.setDescriptionParts(new String[]{"\u0417", "a", "\u0434", "\u0435", "\u0440", "\u0436", "\u043a", "\u0430", " ", "\u043f", "o", "\u0441", "\u043b", "\u0435", " ", "\u043f", "o", "\u0441", "\u0442", "\u0430", "\u043d", "\u043e", "\u0432", "\u043a", "\u0438", " ", "o", "\u0431", "\u0441", "\u0438", "\u0434", "\u0438", "\u0430", "\u043d", "\u0430", " ", "(", "\u043c", "c", ")"});
        this.c = gz3;
        gz gz4 = new gz("", "", 5.0, 3.0, 30.0, 1.0);
        gz4.setNameParts(new String[]{"M", "\u0430", "\u043a", "\u0441", ".", " ", "o", "\u0436", "\u0438", "\u0434", "\u0430", "\u043d", "\u0438", "\u0435", " ", "\u043a", "\u0440", "\u0438", "c", "\u0442", "\u0430", "\u043b", "\u043b", "\u0430"});
        gz4.setDescriptionParts(new String[]{"C", "\u043a", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u0442", "\u0438", "\u043a", "o", "\u0432", " ", "\u0436", "\u0434", "a", "\u0442", "\u044c", " ", "\u043f", "o", "\u044f", "\u0432", "\u043b", "\u0435", "\u043d", "\u0438", "\u044f", " ", "\u043a", "\u0440", "\u0438", "c", "\u0442", "\u0430", "\u043b", "\u043b", "\u0430"});
        this.d = gz4;
        gz gz5 = new gz("", "", 5.0, 1.0, 10.0, 0.5);
        gz5.setNameParts(new String[]{"C", "\u043a", "\u043e", "\u0440", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u043d", "a", "\u0432", "\u043e", "\u0434", "\u043a", "\u0438"});
        gz5.setDescriptionParts(new String[]{"C", "\u043a", "\u043e", "\u0440", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u043f", "o", "\u0432", "\u043e", "\u0440", "\u043e", "\u0442", "\u0430", " ", "\u043a", "a", "\u043c", "\u0435", "\u0440", "\u044b"});
        this.e = gz5;
        dw dw2 = new dw("", "", false);
        dw2.setNameParts(new String[]{"A", "\u0432", "\u0442", "\u043e", " ", "\u043f", "p", "\u0438", " ", "c", "\u0442", "\u0430", "\u0432", "\u043a", "\u0435"});
        dw2.setDescriptionParts(new String[]{"A", "\u0432", "\u0442", "\u043e", "\u043c", "\u0430", "\u0442", "\u0438", "\u0447", "\u0435", "\u0441", "\u043a", "\u0438", " ", "c", "\u0442", "\u0430", "\u0432", "\u0438", "\u0442", "\u044c", " ", "\u0438", " ", "\u0432", "\u0437", "\u0440", "\u044b", "\u0432", "a", "\u0442", "\u044c", " ", "\u043a", "\u0440", "\u0438", "c", "\u0442", "\u0430", "\u043b", "\u043b", " ", "\u043f", "p", "\u0438", " ", "\u0440", "\u0443", "\u0447", "\u043d", "o", "\u0439", " ", "c", "\u0442", "\u0430", "\u0432", "\u043a", "\u0435", " ", "o", "\u0431", "\u0441", "\u0438", "\u0434", "\u0438", "\u0430", "\u043d", "\u0430"});
        this.f = dw2;
        dw dw3 = new dw("", "", true);
        dw3.setNameParts(new String[]{"C", "\u0432", "\u0430", "\u043f", "\u0430", "\u0442", "\u044c", " ", "o", "\u0431", "\u0440", "\u0430", "\u0442", "\u043d", "\u043e"});
        dw3.setDescriptionParts(new String[]{"\u0412", "e", "\u0440", "\u043d", "\u0443", "\u0442", "\u044c", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", " ", "\u0432", " ", "p", "\u0443", "\u043a", "\u0443", " ", "\u043f", "o", "\u0441", "\u043b", "\u0435", " ", "\u0432", "\u0437", "\u0440", "\u044b", "\u0432", "a"});
        this.g = dw3;
        dw dw4 = new dw("", "", true);
        dw4.setNameParts(new String[]{"\u0420", "o", "\u0442", "\u0430", "\u0446", "\u0438", "\u044f"});
        dw4.setDescriptionParts(new String[]{"\u041f", "o", "\u0432", "\u043e", "\u0440", "\u0430", "\u0447", "\u0438", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u043a", "a", "\u043c", "\u0435", "\u0440", "\u0443", " ", "\u043a", " ", "\u0431", "\u043b", "o", "\u043a", "\u0443", "/", "\u043a", "\u0440", "\u0438", "c", "\u0442", "\u0430", "\u043b", "\u043b", "\u0443"});
        this.h = dw4;
        kn kn2 = new kn("", "", -1, () -> {
            boolean bl2;
            class_3965 class_39652;
            class_239 class_2392;
            if (this.k != kh.a || this.z() || !((class_2392 = this.a().field_1765) instanceof class_3965) || (class_39652 = (class_3965)class_2392).method_17783() != class_239.class_240.field_1332) {
                return;
            }
            class_2392 = class_39652.method_17777();
            if (this.a().method_8320((class_2338)class_2392).method_26215() || this.a().method_8320((class_2338)class_2392).method_51176()) {
                return;
            }
            if (this.b().method_33571().method_1022(class_243.method_24953((class_2382)class_2392)) > 4.5) {
                return;
            }
            this.n = this.a(class_1802.field_8301);
            if (this.n == -1) {
                return;
            }
            class_2350 class_23502 = class_39652.method_17780();
            class_2338 class_23382 = class_2392.method_10093(class_23502);
            if (!this.a(class_23382)) {
                return;
            }
            this.l = this.a().field_7545;
            this.o = class_23382;
            this.u = class_39652.method_17784();
            this.v = class_39652.method_17777();
            this.w = class_23502;
            this.p = 0;
            this.r = false;
            this.s = this.u;
            boolean bl3 = bl2 = this.b().method_6047().method_7909() == class_1802.field_8281;
            if (bl2) {
                this.k = kh.c;
            } else {
                this.m = this.a(class_1802.field_8281);
                if (this.m == -1) {
                    this.a();
                    return;
                }
                this.k = kh.b;
            }
        });
        kn2.setNameParts(new String[]{"K", "\u043b", "\u0430", "\u0432", "\u0438", "\u0448", "\u0430", " ", "o", "\u0431", "\u0441", "\u0438", "\u0434", "\u0438", "\u0430", "\u043d", "\u0430"});
        kn2.setDescriptionParts(new String[]{"K", "\u043d", "\u043e", "\u043f", "\u043a", "\u0430", " ", "\u0434", "\u043b", "\u044f", " ", "\u043d", "a", "\u0447", "\u0430", "\u043b", "\u0430", " ", "\u0446", "e", "\u043f", "\u043e", "\u0447", "\u043a", "\u0438"});
        this.i = kn2;
        this.j = new hQ();
        this.k = kh.a;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = null;
        this.p = 0;
        this.q = 0;
        this.r = false;
        this.s = null;
        this.t = new cT();
        this.u = null;
        this.v = null;
        this.w = null;
        this.b.a(() -> "T\u0438\u043a\u043e\u0432\u0430\u044f".equals(this.a.a()));
        this.c.a(() -> !this.a());
        this.e.a(this.h::a);
        this.a(this.f, this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.i);
    }

    private /* bridge */ /* synthetic */ void x() {
        class_243 class_2432;
        double d2;
        if (this.o == null) {
            this.a();
            return;
        }
        class_1511 class_15112 = this.a(this.o);
        if (class_15112 == null) {
            this.a();
            return;
        }
        this.s = class_15112.method_19538();
        if (this.h.a() && !this.a(d2 = 15.0, class_2432 = class_15112.method_19538())) {
            int n2 = 1;
            kh kh2 = kh.h;
            this.a(n2, kh2);
            return;
        }
        if (this.a().method_2923()) {
            int n3 = 1;
            kh kh3 = kh.h;
            this.a(n3, kh3);
            return;
        }
        this.a().method_2918(this.b(), (class_1297)class_15112);
        this.a().method_6104(this.a());
        if (this.g.a()) {
            int n4 = 1;
            kh kh4 = kh.i;
            this.a(n4, kh4);
        } else {
            int n5 = 1;
            kh kh5 = kh.j;
            this.a(n5, kh5);
        }
    }

    private /* bridge */ /* synthetic */ void c() {
        if (this.m < 9) {
            this.a().field_7545 = this.m;
        } else {
            int n2 = this.b().field_7512.field_7763;
            this.a().method_2906(n2, this.m, this.l, class_1713.field_7791, this.b());
        }
        int n3 = 1;
        kh kh2 = kh.c;
        this.a(n3, kh2);
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.a();
    }

    private /* bridge */ /* synthetic */ void d() {
        if (this.u == null || this.v == null || this.w == null || this.o == null) {
            this.a();
            return;
        }
        if (this.b().method_6047().method_7909() != class_1802.field_8281) {
            this.a();
            return;
        }
        if (this.a().method_8320(this.v).method_26215() || this.a().method_8320(this.v).method_51176()) {
            this.a();
            return;
        }
        if (!this.a(this.o)) {
            this.a();
            return;
        }
        if (this.b().method_33571().method_1022(class_243.method_24953((class_2382)this.v)) > 4.5) {
            this.a();
            return;
        }
        this.s = this.u;
        class_3965 class_39652 = new class_3965(this.u, this.w, this.v, false);
        this.a().method_2896(this.a(), this.a(), class_39652);
        this.a().method_6104(this.a());
        this.u = null;
        this.v = null;
        this.w = null;
        this.q = 0;
        gz gz2 = this.c;
        gz gz3 = this.b;
        this.a(gz2, gz3);
    }

    private /* bridge */ /* synthetic */ boolean a(double d2, class_243 class_2432) {
        double d3 = d2;
        class_243 class_2433 = class_2432;
        return cy.a(d3, class_2433);
    }

    private /* bridge */ /* synthetic */ boolean a(class_2338 class_23382) {
        return dI.b(class_23382);
    }

    private /* bridge */ /* synthetic */ class_2338 a(class_2338 class_23382) {
        if (this.a().method_8320(class_23382).method_26204() == class_2246.field_10540) {
            return class_23382;
        }
        if (this.a().method_8320(class_23382.method_10074()).method_26204() == class_2246.field_10540) {
            return class_23382.method_10074();
        }
        return null;
    }

    private /* bridge */ /* synthetic */ class_1511 a(class_2338 class_23382) {
        for (class_1297 class_12972 : this.a().method_18112()) {
            class_2338 class_23383;
            class_1511 class_15112;
            if (!(class_12972 instanceof class_1511) || (class_15112 = (class_1511)class_12972).method_31481() || !class_15112.method_5805() || !(class_23383 = class_15112.method_24515()).equals((Object)class_23382.method_10084()) && !class_23383.method_10074().equals((Object)class_23382)) continue;
            return class_15112;
        }
        return null;
    }

    private /* bridge */ /* synthetic */ int a(class_1792 class_17922) {
        return bw.e(class_17922);
    }

    @Override
    public /* bridge */ /* synthetic */ class_1269 a(class_1657 class_16572, class_1937 class_19372, class_1268 class_12682, class_3965 class_39652) {
        if (!this.f.a()) {
            return class_1269.field_5811;
        }
        if (this.z() || this.k != kh.a) {
            return class_1269.field_5811;
        }
        if (class_16572.method_6047().method_7909() != class_1802.field_8281) {
            return class_1269.field_5811;
        }
        class_2338 class_23382 = class_39652.method_17777().method_10093(class_39652.method_17780());
        if (!this.a(class_23382)) {
            return class_1269.field_5811;
        }
        this.n = this.a(class_1802.field_8301);
        if (this.n == -1) {
            return class_1269.field_5811;
        }
        this.l = this.a().field_7545;
        this.m = -1;
        this.o = class_23382;
        this.u = null;
        this.v = null;
        this.w = null;
        this.p = 0;
        this.r = false;
        this.s = class_23382.method_46558();
        this.q = 0;
        gz gz2 = this.c;
        gz gz3 = this.b;
        this.a(gz2, gz3);
        return class_1269.field_5811;
    }

    private /* bridge */ /* synthetic */ void a() {
        this.k = kh.a;
        this.j.b();
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = null;
        this.p = 0;
        this.q = 0;
        this.r = false;
        this.s = null;
        this.t.a();
        this.u = null;
        this.v = null;
        this.w = null;
    }

    private /* bridge */ /* synthetic */ void a(int n2, kh kh2) {
        this.k = kh2;
        if (n2 <= 0) {
            this.r = false;
            this.j.b();
        } else {
            this.r = true;
            if (this.a()) {
                this.j.a(false);
                this.j.a(n2);
            } else {
                this.j.a(true);
                this.j.a((long)n2 * 50L);
            }
        }
    }

    private /* bridge */ /* synthetic */ void a(gz gz2, gz gz3) {
        this.k = kh.d;
        if (this.a()) {
            int n2 = gz3.a();
            if (n2 <= 0) {
                this.r = false;
                this.j.b();
            } else {
                this.r = true;
                this.j.a(false);
                this.j.a(n2);
            }
        } else {
            int n3 = gz2.a();
            if (n3 <= 0) {
                this.r = false;
                this.j.b();
            } else {
                this.r = true;
                this.j.a(true);
                this.j.a((long)n3);
            }
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void k() {
        if (!this.y() || this.k == kh.a || this.s == null || !this.h.a()) {
            return;
        }
        double d2 = this.e.d();
        class_243 class_2432 = this.s;
        this.t.a(d2, class_2432);
    }

    private /* bridge */ /* synthetic */ void t() {
        if (this.o == null) {
            this.a();
            return;
        }
        if (this.a().method_8320(this.o).method_26204() == class_2246.field_10540) {
            int n2 = 0;
            kh kh2 = kh.e;
            this.a(n2, kh2);
            return;
        }
        ++this.q;
        if (this.q >= 5) {
            this.a();
            return;
        }
        int n3 = 1;
        kh kh3 = kh.d;
        this.a(n3, kh3);
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.a();
    }

    private /* bridge */ /* synthetic */ void v() {
        class_243 class_2432;
        double d2;
        class_243 class_2433;
        if (this.o == null) {
            this.a();
            return;
        }
        class_2338 class_23382 = this.a(this.o);
        if (class_23382 == null) {
            this.a();
            return;
        }
        if (this.b().method_6047().method_7909() != class_1802.field_8301) {
            this.a();
            return;
        }
        class_2338 class_23383 = class_23382.method_10084();
        if (!this.a().method_8320(class_23383).method_45474() || !this.a().method_8320(class_23383.method_10084()).method_45474()) {
            this.a();
            return;
        }
        this.s = class_2433 = class_23382.method_46558().method_1031(0.0, 0.5, 0.0);
        if (this.h.a() && !this.a(d2 = 15.0, class_2432 = class_2433)) {
            int n2 = 1;
            kh kh2 = kh.f;
            this.a(n2, kh2);
            return;
        }
        class_3965 class_39652 = new class_3965(class_2433, class_2350.field_11036, class_23382, false);
        this.a().method_2896(this.a(), this.a(), class_39652);
        this.a().method_6104(this.a());
        this.p = 0;
        int n3 = 1;
        kh kh3 = kh.g;
        this.a(n3, kh3);
    }

    @Override
    public /* bridge */ /* synthetic */ void j() {
        if (this.z()) {
            return;
        }
        while (this.k != kh.a) {
            if (this.r && !this.j.a()) {
                this.j.a();
                return;
            }
            kh kh2 = this.k;
            switch (this.k.ordinal()) {
                case 1: {
                    this.c();
                    break;
                }
                case 2: {
                    this.d();
                    break;
                }
                case 3: {
                    this.t();
                    break;
                }
                case 4: {
                    this.u();
                    break;
                }
                case 5: {
                    this.v();
                    break;
                }
                case 6: {
                    this.w();
                    break;
                }
                case 7: {
                    this.x();
                    break;
                }
                case 8: {
                    this.y();
                    break;
                }
                case 9: {
                    this.a();
                }
            }
            if (this.k != kh.a && (!this.r || this.j.a()) && this.k != kh2) continue;
            break;
        }
    }

    private /* bridge */ /* synthetic */ void w() {
        if (this.o == null) {
            this.a();
            return;
        }
        class_1511 class_15112 = this.a(this.o);
        if (class_15112 != null) {
            this.s = class_15112.method_19538();
            int n2 = 0;
            kh kh2 = kh.h;
            this.a(n2, kh2);
            return;
        }
        ++this.p;
        if (this.p >= this.d.a()) {
            this.a();
            return;
        }
        int n3 = 1;
        kh kh3 = kh.g;
        this.a(n3, kh3);
    }

    private /* bridge */ /* synthetic */ void u() {
        this.n = this.a(class_1802.field_8301);
        if (this.n == -1) {
            this.a();
            return;
        }
        if (this.n < 9) {
            this.a().field_7545 = this.n;
        } else {
            int n2 = this.a().field_7545;
            int n3 = this.b().field_7512.field_7763;
            this.a().method_2906(n3, this.n, n2, class_1713.field_7791, this.b());
        }
        int n4 = 1;
        kh kh2 = kh.f;
        this.a(n4, kh2);
    }

    private /* bridge */ /* synthetic */ void y() {
        if (this.m != -1 && this.m >= 9) {
            int n2 = this.a().field_7545;
            int n3 = this.b().field_7512.field_7763;
            this.a().method_2906(n3, this.m, n2, class_1713.field_7791, this.b());
        }
        this.a().field_7545 = this.l;
        this.s = null;
        int n4 = 0;
        kh kh2 = kh.j;
        this.a(n4, kh2);
    }
}

