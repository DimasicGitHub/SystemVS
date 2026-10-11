/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;

public class bd
extends es {
    private static /* synthetic */ double b;
    private /* synthetic */ gz c;
    private /* synthetic */ gz d;
    private /* synthetic */ gz e;
    private /* synthetic */ fr f;
    private /* synthetic */ gz g;
    private /* synthetic */ double h;
    private /* synthetic */ double i;
    private /* synthetic */ double j;
    private /* synthetic */ double k;
    private /* synthetic */ double l;
    private /* synthetic */ double m;
    private /* synthetic */ double n;
    private /* synthetic */ double o;
    private /* synthetic */ double p;
    private /* synthetic */ boolean q;
    private /* synthetic */ double r;
    private /* synthetic */ double s;
    private /* synthetic */ double t;
    private /* synthetic */ double u;

    public /* synthetic */ bd() {
        super("\u0421\u0432\u043e\u0431\u043e\u0434\u043d\u0430\u044f");
        gz gz2 = new gz("", "", 15.0, 5.0, 20.0, 0.1);
        gz2.setNameParts(new String[]{"C", "\u043a", "\u043e", "\u0440", "\u043e", "\u0441", "\u0442", "\u044c"});
        gz2.setDescriptionParts(new String[]{"\u0411", "a", "\u0437", "\u043e", "\u0432", "\u0430", "\u044f", " ", "c", "\u043a", "\u043e", "\u0440", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u043d", "a", "\u0432", "\u0435", "\u0434", "\u0435", "\u043d", "\u0438", "\u044f"});
        this.c = gz2;
        gz gz3 = new gz("", "", 0.5, 0.1, 1.0, 0.05);
        gz3.setNameParts(new String[]{"C", "\u0438", "\u043b", "\u0430", " ", "\u043a", "o", "\u0440", "\u0440", "\u0435", "\u043a", "\u0446", "\u0438", "\u0438"});
        gz3.setDescriptionParts(new String[]{"\u041d", "a", "\u0441", "\u043a", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "c", "\u0438", "\u043b", "\u044c", "\u043d", "\u043e", " ", "\u043f", "o", "\u043c", "\u043e", "\u0433", "\u0430", "\u0435", "\u0442", " ", "\u043f", "\u0440", "\u0438", "\u0446", "e", "\u043b", "\u0438", "\u0432", "\u0430", "\u043d", "\u0438", "\u0435", " ", "\u0432", "\u043d", "e", " ", "\u0445", "\u0438", "\u0442", "\u0431", "o", "\u043a", "\u0441", "\u0430"});
        this.d = gz3;
        gz gz4 = new gz("", "", 0.0, -1.0, 1.0, 0.05);
        gz4.setNameParts(new String[]{"C", "\u0432", "\u043e", "\u0431", "\u043e", "\u0434", "\u0430", " ", "\u0432", "\u043d", "\u0438", "\u0437"});
        gz4.setDescriptionParts(new String[]{"C", "\u0443", "\u0436", "\u0430", "\u0435", "\u0442", " ", "(", "-", ")", " ", "\u0438", "\u043b", "\u0438", " ", "\u0440", "a", "\u0441", "\u0448", "\u0438", "\u0440", "\u044f", "\u0435", "\u0442", " ", "(", "+", ")", " ", "\u043c", "\u0451", "p", "\u0442", "\u0432", "\u0443", "\u044e", " ", "\u0437", "o", "\u043d", "\u0443", " ", "\u043f", "o", " ", "Y", " ", "c", "\u043d", "\u0438", "\u0437", "\u0443", " ", "\u0445", "\u0438", "\u0442", "\u0431", "o", "\u043a", "\u0441", "\u0430"});
        this.e = gz4;
        fr fr2 = new fr("", "", Arrays.asList(ec.join(new String[]{"\u041f", "\u043b", "a", "\u0432", "\u043d", "\u044b", "\u0439", " ", "\u0432", "\u0445", "o", "\u0434"}), ec.join(new String[]{"\u0423", "\u0447", "\u0438", "\u0442", "\u044b", "\u0432", "a", "\u0442", "\u044c", " ", "c", "\u0435", "\u043d", "\u0441", "\u0443"}), ec.join(new String[]{"\u0417", "a", "\u043c", "\u0435", "\u0434", "\u043b", "\u0435", "\u043d", "\u0438", "\u0435", " ", "\u0432", "\u0431", "\u043b", "\u0438", "\u0437", "\u0438"}), ec.join(new String[]{"\u0428", "y", "\u043c", " ", "\u043f", "p", "\u0438", " ", "\u043d", "a", "\u0432", "\u043e", "\u0434", "\u043a", "\u0435"})), Arrays.asList(ec.join(new String[]{"\u041f", "\u043b", "a", "\u0432", "\u043d", "\u044b", "\u0439", " ", "\u0432", "\u0445", "o", "\u0434"}), ec.join(new String[]{"\u0423", "\u0447", "\u0438", "\u0442", "\u044b", "\u0432", "a", "\u0442", "\u044c", " ", "c", "\u0435", "\u043d", "\u0441", "\u0443"}), ec.join(new String[]{"\u0417", "a", "\u043c", "\u0435", "\u0434", "\u043b", "\u0435", "\u043d", "\u0438", "\u0435", " ", "\u0432", "\u0431", "\u043b", "\u0438", "\u0437", "\u0438"}), ec.join(new String[]{"\u0428", "y", "\u043c", " ", "\u043f", "p", "\u0438", " ", "\u043d", "a", "\u0432", "\u043e", "\u0434", "\u043a", "\u0435"})));
        fr2.setNameParts(new String[]{"\u041f", "o", "\u0432", "\u0435", "\u0434", "\u0435", "\u043d", "\u0438", "\u0435"});
        fr2.setDescriptionParts(new String[]{"\u041d", "a", "\u0441", "\u0442", "\u0440", "\u043e", "\u0439", "\u043a", "\u0438", " ", "\u043f", "o", "\u0432", "\u0435", "\u0434", "\u0435", "\u043d", "\u0438", "\u044f", " ", "\u0440", "o", "\u0442", "\u0430", "\u0446", "\u0438", "\u0438"});
        this.f = fr2;
        gz gz5 = new gz("", "", 6.0, 1.0, 20.0, 0.5);
        gz5.setNameParts(new String[]{"\u041f", "o", "\u0440", "\u043e", "\u0433", " ", "\u0437", "a", "\u043c", "\u0435", "\u0434", "\u043b", "."});
        gz5.setDescriptionParts(new String[]{"\u0423", "\u0433", "o", "\u043b", " ", "(", "\u0433", "\u0440", "a", "\u0434", "\u0443", "\u0441", "\u044b", ")", " ", "\u043f", "p", "\u0438", " ", "\u043a", "o", "\u0442", "\u043e", "\u0440", "\u043e", "\u043c", " ", "\u043d", "a", "\u0447", "\u0438", "\u043d", "\u0430", "\u0435", "\u0442", "\u0441", "\u044f", " ", "\u0437", "a", "\u043c", "\u0435", "\u0434", "\u043b", "\u0435", "\u043d", "\u0438", "\u0435"});
        this.g = gz5;
    }

    static {
        b = 0.0;
    }

    @Override
    public /* bridge */ /* synthetic */ double b() {
        return this.c.d();
    }

    @Override
    public /* bridge */ /* synthetic */ void c() {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        this.h = threadLocalRandom.nextDouble(Math.PI * 2);
        this.i = threadLocalRandom.nextDouble(Math.PI * 2);
        this.j = threadLocalRandom.nextDouble(0.06, 0.18);
        this.k = threadLocalRandom.nextDouble(0.04, 0.14);
        this.l = threadLocalRandom.nextDouble(-0.08, 0.08);
        this.m = 0.0;
        this.n = threadLocalRandom.nextDouble(0.85, 1.15);
        this.o = 0.0;
        this.p = 0.0;
        this.q = false;
        this.u = 0.0;
    }

    @Override
    public /* bridge */ /* synthetic */ void d() {
        this.h = 0.0;
        this.i = 0.0;
        this.j = 0.0;
        this.k = 0.0;
        this.l = 0.0;
        this.m = 0.0;
        this.n = 1.0;
        this.o = 0.0;
        this.p = 0.0;
        this.q = false;
        this.u = 0.0;
    }

    private /* bridge */ /* synthetic */ boolean a(String string) {
        return this.f.a().contains(string);
    }

    @Override
    public /* bridge */ /* synthetic */ double[] a(double d2, long l2, double d3, double d4, double d5, double d6, double d7, long l3, class_1657 class_16572, double d8) {
        double d9;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        double d17 = d5;
        class_1657 class_16573 = class_16572;
        boolean bl2 = this.a(d17, class_16573);
        double d18 = d16 = bl2 ? 0.0 : 1.0;
        this.p = !bl2 ? Math.min(this.p + 0.06 * d8, 3.0) : (this.p *= Math.max(0.0, 1.0 - 0.15 * d8));
        double d19 = bl2 ? 0.08 : 0.08 + this.p * 0.04;
        this.o += (d16 - this.o) * d19 * d8;
        this.o = class_3532.method_15350((double)this.o, (double)0.0, (double)1.0);
        double d20 = this.d.d() * this.m * this.n;
        double d21 = 1.0;
        if (this.a("\u0423\u0447\u0438\u0442\u044b\u0432a\u0442\u044c c\u0435\u043d\u0441\u0443")) {
            d15 = (Double)lo.aM.field_1690.method_42495().method_41753();
            d21 = class_3532.method_15350((double)(d15 * 2.0), (double)0.3, (double)3.0);
        }
        d15 = class_3532.method_15350((double)((double)(l3 - l2) / (450.0 + threadLocalRandom.nextDouble(150.0))), (double)0.0, (double)1.0);
        double d22 = d15 * d15 * (3.0 - 2.0 * d15);
        double d23 = d7 * d20 * d21 * d22;
        if (this.a("\u0417a\u043c\u0435\u0434\u043b\u0435\u043d\u0438\u0435 \u0432\u0431\u043b\u0438\u0437\u0438") && d5 < (d14 = this.g.d())) {
            d13 = Math.max(0.2, d5 / d14);
            d23 *= d13;
        }
        d14 = this.a(d5);
        d23 *= d14;
        d23 *= 1.0 + this.p * 0.5;
        if (d5 > 80.0 && !this.q) {
            this.q = true;
            this.r = threadLocalRandom.nextDouble(2.0, 3.5);
            this.s = threadLocalRandom.nextDouble(5.0, 12.0);
            this.t = threadLocalRandom.nextDouble(0.15, 0.4);
            this.u = threadLocalRandom.nextDouble(Math.PI * 2);
        }
        if (d5 < 6.0 && this.q) {
            this.q = false;
        }
        if (this.q) {
            d13 = Math.sin(this.u) * this.t;
            d23 *= this.r * (1.0 + d13);
        }
        d13 = d7 / 15.0;
        double d24 = threadLocalRandom.nextDouble(-0.002, 0.002);
        double d25 = class_3532.method_15350((double)(d23 * 0.03 * d13 + d24), (double)0.003, (double)0.85);
        double d26 = d2 * d25;
        double d27 = d4 * d25 * (0.85 + threadLocalRandom.nextDouble(0.3));
        if (this.a("\u0428y\u043c \u043fp\u0438 \u043da\u0432\u043e\u0434\u043a\u0435")) {
            d12 = 0.05 + threadLocalRandom.nextDouble(0.07);
            d26 += Math.sin(this.h) * d12 * (0.5 + threadLocalRandom.nextDouble(0.6));
            d27 += Math.cos(this.i) * d12 * 0.45 * (0.4 + threadLocalRandom.nextDouble(0.5));
        }
        if (this.p > 0.3 && !bl2) {
            d12 = class_3532.method_15350((double)(this.p * 0.07), (double)0.02, (double)0.2);
            d11 = d2 * d12;
            d10 = d4 * d12 * 0.85;
            if (Math.abs(d26) < Math.abs(d11)) {
                d26 = d11;
            }
            if (Math.abs(d27) < Math.abs(d10)) {
                d27 = d10;
            }
        }
        d12 = d26 * this.o;
        d11 = d27 * this.o;
        d10 = 1.0 + Math.min(d5 / 30.0, 4.0) * d13;
        if (this.q) {
            d10 *= 2.0 + threadLocalRandom.nextDouble(1.5);
        }
        double d28 = (1.8 + threadLocalRandom.nextDouble(1.2)) * d8 * d10;
        double d29 = (1.3 + threadLocalRandom.nextDouble(0.8)) * d8 * d10;
        double d30 = d12 - d3;
        double d31 = d11 - d6;
        if (Math.abs(d30) > d28) {
            d12 = d3 + Math.signum(d30) * d28;
        }
        if (Math.abs(d31) > d29) {
            d11 = d6 + Math.signum(d31) * d29;
        }
        double d32 = d9 = eO.a();
        double d33 = d12;
        d12 = eO.a(d32, d33);
        double d34 = d9;
        double d35 = d11;
        d11 = eO.a(d34, d35);
        return new double[]{d12, d11, d12, d11};
    }

    @Override
    public /* bridge */ /* synthetic */ double[] a(class_1297 class_12972) {
        return new double[]{0.0, 0.0, 0.0};
    }

    @Override
    public /* bridge */ /* synthetic */ double a() {
        return this.l;
    }

    @Override
    public /* bridge */ /* synthetic */ void a(double d2, long l2, class_1297 class_12972) {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        this.h += this.j * d2;
        this.i += this.k * d2;
        this.m = this.a("\u041f\u043ba\u0432\u043d\u044b\u0439 \u0432\u0445o\u0434") ? Math.min(1.0, this.m + 0.035 * d2) : 1.0;
        if (threadLocalRandom.nextDouble() < 0.02) {
            this.n = threadLocalRandom.nextDouble(0.8, 1.2);
        }
        if (threadLocalRandom.nextDouble() < 0.015) {
            this.l += threadLocalRandom.nextDouble(-0.04, 0.04);
            this.l = class_3532.method_15350((double)this.l, (double)-0.15, (double)0.1);
        }
        if (this.q) {
            this.u += this.s * d2 * 0.02;
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void a(String string, jh jh2) {
        this.c.a(() -> string.equals(jh2.a()));
        this.d.a(() -> string.equals(jh2.a()));
        this.e.a(() -> string.equals(jh2.a()));
        this.f.a(() -> string.equals(jh2.a()));
        this.g.a(() -> string.equals(jh2.a()) && this.f.a().contains("\u0417a\u043c\u0435\u0434\u043b\u0435\u043d\u0438\u0435 \u0432\u0431\u043b\u0438\u0437\u0438"));
    }

    @Override
    public /* bridge */ /* synthetic */ List a() {
        return Arrays.asList(this.c, this.d, this.e, this.f, this.g);
    }

    private /* bridge */ /* synthetic */ boolean a(double d2, class_1657 class_16572) {
        if (d2 > 45.0) {
            return false;
        }
        if (lo.aM.field_1687 == null) {
            return false;
        }
        class_243 class_2432 = class_16572.method_33571();
        class_243 class_2433 = class_16572.method_5828(1.0f);
        double d3 = 6.0;
        class_243 class_2434 = class_2432.method_1019(class_2433.method_1021(d3));
        for (class_1297 class_12972 : lo.aM.field_1687.method_18112()) {
            double d4;
            if (class_12972 == class_16572 || !class_12972.method_5805() || class_16572.method_5858(class_12972) > d3 * d3) continue;
            class_238 class_2383 = class_12972.method_5829();
            if (b > 0.0) {
                class_2383 = class_2383.method_1014(b);
            }
            if ((d4 = this.e.d()) != 0.0) {
                class_2383 = new class_238(class_2383.field_1323, class_2383.field_1322 - d4, class_2383.field_1321, class_2383.field_1320, class_2383.field_1325, class_2383.field_1324);
            }
            if (!class_2383.method_992(class_2432, class_2434).isPresent() && !class_2383.method_1006(class_2434)) continue;
            return true;
        }
        return false;
    }

    private /* bridge */ /* synthetic */ double a(double d2) {
        if (d2 < 1.5) {
            return 0.12 + d2 * 0.12;
        }
        if (d2 < 8.0) {
            double d3 = (d2 - 1.5) / 6.5;
            return 0.3 + d3 * 0.4;
        }
        if (d2 < 40.0) {
            double d4 = (d2 - 8.0) / 32.0;
            double d5 = d4 * d4 * (3.0 - 2.0 * d4);
            return 0.7 + d5 * 1.8;
        }
        double d6 = Math.min((d2 - 40.0) / 140.0, 1.0);
        return 2.5 + d6 * 2.5;
    }
}

