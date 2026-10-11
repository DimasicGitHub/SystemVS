/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1531;
import net.minecraft.class_1657;
import net.minecraft.class_1764;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1839;
import net.minecraft.class_1937;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3966;
import net.minecraft.class_465;
import net.minecraft.class_5321;

public class f
extends aT {
    private static /* synthetic */ String a;
    private static /* synthetic */ String b;
    private static /* synthetic */ String c;
    private static final /* synthetic */ List<es> d;
    private static final /* synthetic */ List<String> e;
    private static final /* synthetic */ hW<kx> f;
    private /* synthetic */ jh g;
    private /* synthetic */ jh h;
    private /* synthetic */ gz i;
    private /* synthetic */ gz j;
    private /* synthetic */ gz k;
    private /* synthetic */ dw l;
    private /* synthetic */ dw m;
    private /* synthetic */ gz n;
    private /* synthetic */ fr o;
    private /* synthetic */ fr p;
    private /* synthetic */ class_1297 q;
    private /* synthetic */ long r;
    private final /* synthetic */ cT s;
    private /* synthetic */ long t;
    private /* synthetic */ double u;
    private /* synthetic */ double v;
    private /* synthetic */ class_5321<class_1937> w;
    private /* synthetic */ class_243 x;
    private /* synthetic */ class_243 y;
    private /* synthetic */ class_1297 z;
    private /* synthetic */ double A;
    private final /* synthetic */ Map<UUID, A> B;

    public /* synthetic */ f() {
        super("\u0410\u0438\u043c\u0410\u0437\u0437\u0438\u0437\u0442", fV.a);
        jh jh2 = new jh("", "", e, List.of((String)e.getFirst()), false);
        jh2.setNameParts(new String[]{"\u0420", "o", "\u0442", "\u0430", "\u0446", "\u0438", "\u044f"});
        jh2.setDescriptionParts(new String[]{"\u0420", "e", "\u0436", "\u0438", "\u043c", " ", "\u0440", "o", "\u0442", "\u0430", "\u0446", "\u0438", "\u0438", " ", "\u043f", "\u0440", "\u0438", "\u0446", "e", "\u043b", "\u0438", "\u0432", "\u0430", "\u043d", "\u0438", "\u044f"});
        this.g = jh2;
        jh jh3 = new jh("", "", Arrays.asList(a, b, c), List.of(c), false);
        jh3.setNameParts(new String[]{"\u041f", "\u0440", "\u0438", "o", "\u0440", "\u0438", "\u0442", "\u0435", "\u0442"});
        jh3.setDescriptionParts(new String[]{"\u041f", "o", " ", "\u043a", "a", "\u043a", "\u043e", "\u043c", "\u0443", " ", "\u043f", "a", "\u0440", "\u0430", "\u043c", "\u0435", "\u0442", "\u0440", "\u0443", " ", "\u0432", "\u044b", "\u0431", "\u0438", "\u0440", "a", "\u0442", "\u044c", " ", "\u0446", "e", "\u043b", "\u044c"});
        this.h = jh3;
        gz gz2 = new gz("", "", 4.5, 1.0, 6.0, 0.1);
        gz2.setNameParts(new String[]{"\u0414", "\u0438", "c", "\u0442", "\u0430", "\u043d", "\u0446", "\u0438", "\u044f"});
        gz2.setDescriptionParts(new String[]{"M", "\u0430", "\u043a", "\u0441", "\u0438", "\u043c", "\u0430", "\u043b", "\u044c", "\u043d", "\u0430", "\u044f", " ", "\u0434", "\u0438", "c", "\u0442", "\u0430", "\u043d", "\u0446", "\u0438", "\u044f", " ", "\u0434", "o", " ", "\u0446", "e", "\u043b", "\u0438"});
        this.i = gz2;
        gz gz3 = new gz("", "", 360.0, 20.0, 360.0, 1.0);
        gz3.setNameParts(new String[]{"\u0424", "o", "\u0432"});
        gz3.setDescriptionParts(new String[]{"\u0423", "\u0433", "o", "\u043b", " ", "o", "\u0431", "\u0437", "\u043e", "\u0440", "\u0430", " ", "\u0434", "\u043b", "\u044f", " ", "\u0437", "a", "\u0445", "\u0432", "\u0430", "\u0442", "\u0430", " ", "\u0446", "e", "\u043b", "\u0438"});
        this.j = gz3;
        gz gz4 = new gz("", "", 5.0, 0.0, 30.0, 1.0, "c", 0);
        gz4.setNameParts(new String[]{"\u0423", "\u0434", "e", "\u0440", "\u0436", "\u0430", "\u043d", "\u0438", "\u0435", " ", "\u043f", "o", "\u0441", "\u043b", "\u0435", " ", "\u0443", "\u0434", "a", "\u0440", "\u0430"});
        gz4.setDescriptionParts(new String[]{"\u041f", "o", "\u0441", "\u043b", "\u0435", " ", "\u0443", "\u0434", "a", "\u0440", "\u0430", " ", "\u043f", "o", " ", "\u0446", "e", "\u043b", "\u0438", " ", "a", "\u0438", "\u043c", " ", "\u0434", "e", "\u0440", "\u0436", "\u0438", "\u0442", "\u0441", "\u044f", " ", "\u0442", "o", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u043d", "a", " ", "\u043d", "e", "\u0439", ".", " ", "T", "\u0430", "\u0439", "\u043c", "\u0435", "\u0440", " ", "o", "\u0431", "\u043d", "\u0443", "\u043b", "\u044f", "\u0435", "\u0442", "\u0441", "\u044f", " ", "\u043f", "p", "\u0438", " ", "\u043a", "a", "\u0436", "\u0434", "\u043e", "\u043c", " ", "\u0443", "\u0434", "a", "\u0440", "\u0435"});
        this.k = gz4;
        dw dw2 = new dw("", "", false);
        dw2.setNameParts(new String[]{"T", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u043b", "a", "\u0441", "\u0442", "\u0445", "\u0438", "\u0442"});
        dw2.setDescriptionParts(new String[]{"\u0426", "e", "\u043b", "\u0438", "\u0442", "\u044c", " ", "\u0442", "o", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u0432", " ", "\u0442", "o", "\u0433", "\u043e", ",", " ", "\u043f", "o", " ", "\u043a", "o", "\u043c", "\u0443", " ", "\u043f", "o", "\u0441", "\u043b", "\u0435", "\u0434", "\u043d", "\u0438", "\u0439", " ", "\u0440", "a", "\u0437", " ", "\u0443", "\u0434", "a", "\u0440", "\u0438", "\u043b", "\u0438"});
        this.l = dw2;
        dw dw3 = new dw("", "", false);
        dw3.setNameParts(new String[]{"\u041d", "a", "\u0432", "\u043e", "\u0434", "\u043a", "\u0430", " ", "c", " ", "a", "\u0440", "\u0431", "\u0430", "\u043b", "\u0435", "\u0442", "\u043e", "\u043c"});
        dw3.setDescriptionParts(new String[]{"K", "\u043e", "\u0433", "\u0434", "\u0430", " ", "\u0432", " ", "\u0440", "\u0443", "\u043a", "e", " ", "a", "\u0440", "\u0431", "\u0430", "\u043b", "\u0435", "\u0442", " ", "\u2014", " ", "o", "\u0442", "\u0434", "\u0435", "\u043b", "\u044c", "\u043d", "\u0430", "\u044f", " ", "\u043d", "a", "\u0432", "\u043e", "\u0434", "\u043a", "\u0430"});
        this.m = dw3;
        gz gz5 = new gz("", "", 20.0, 1.0, 100.0, 0.5);
        gz5.setNameParts(new String[]{"\u0414", "\u0438", "c", "\u0442", "\u0430", "\u043d", "\u0446", "\u0438", "\u044f", " ", "a", "\u0440", "\u0431", "\u0430", "\u043b", "\u0435", "\u0442", "\u0430"});
        gz5.setDescriptionParts(new String[]{"M", "\u0430", "\u043a", "\u0441", "\u0438", "\u043c", "\u0430", "\u043b", "\u044c", "\u043d", "\u0430", "\u044f", " ", "\u0434", "\u0438", "c", "\u0442", "\u0430", "\u043d", "\u0446", "\u0438", "\u044f", " ", "\u0434", "o", " ", "\u0446", "e", "\u043b", "\u0438", " ", "\u043a", "o", "\u0433", "\u0434", "\u0430", " ", "\u0440", "a", "\u0431", "\u043e", "\u0442", "\u0430", "\u0435", "\u0442", " ", "\u043d", "a", "\u0432", "\u043e", "\u0434", "\u043a", "\u0430", " ", "c", " ", "a", "\u0440", "\u0431", "\u0430", "\u043b", "\u0435", "\u0442", "\u043e", "\u043c"});
        this.n = gz5;
        fr fr2 = new fr("", "", Arrays.asList(ec.join(new String[]{"T", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u0438", "\u0433", "\u0440", "o", "\u043a", "\u0438"}), ec.join(new String[]{"\u041d", "e", "\u0432", "\u0438", "\u0434", "\u0438", "\u043c", "\u044b", "\u0435"}), ec.join(new String[]{"T", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u0432", " ", "\u0431", "\u0440", "o", "\u043d", "\u0435"}), ec.join(new String[]{"T", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u0432", " ", "\u043d", "e", "\u0437", "\u0435", "\u0440", "\u0438", "\u0442", "\u043e", "\u0432", "\u043e", "\u0439"}), ec.join(new String[]{"\u0413", "o", "\u043b", "\u044b", "\u0435"})), List.of(ec.join(new String[]{"T", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u0438", "\u0433", "\u0440", "o", "\u043a", "\u0438"})));
        fr2.setNameParts(new String[]{"\u0426", "e", "\u043b", "\u0438"});
        fr2.setDescriptionParts(new String[]{"K", "\u043e", "\u0433", "\u043e", " ", "\u0446", "e", "\u043b", "\u0438", "\u0442", "\u044c"});
        this.o = fr2;
        fr fr3 = new fr("", "", Arrays.asList(ec.join(new String[]{"T", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "c", " ", "o", "\u0440", "\u0443", "\u0436", "\u0438", "\u0435", "\u043c"}), ec.join(new String[]{"\u041d", "e", " ", "\u0446", "e", "\u043b", "\u0438", "\u0442", "\u044c", " ", "\u0432", " ", "\u0438", "\u043d", "\u0432", "e", "\u043d", "\u0442", "\u0430", "\u0440", "\u0435"}), ec.join(new String[]{"\u041d", "e", " ", "\u0446", "e", "\u043b", "\u0438", "\u0442", "\u044c", " ", "\u043a", "o", "\u0433", "\u0434", "\u0430", " ", "e", "\u043c"}), ec.join(new String[]{"\u041f", "\u0440", "o", "\u0432", "\u0435", "\u0440", "\u043a", "\u0430", " ", "c", "\u0442", "\u0435", "\u043d"}), ec.join(new String[]{"T", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u043f", "o", " ", "X"}), ec.join(new String[]{"B", "\u044b", "\u043a", "\u043b", ".", " ", "\u043f", "p", "\u0438", " ", "c", "\u043c", "\u0435", "\u043d", "\u0435", " ", "\u043c", "\u0438", "\u0440", "a"})), Arrays.asList(ec.join(new String[]{"T", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "c", " ", "o", "\u0440", "\u0443", "\u0436", "\u0438", "\u0435", "\u043c"}), ec.join(new String[]{"\u041d", "e", " ", "\u0446", "e", "\u043b", "\u0438", "\u0442", "\u044c", " ", "\u0432", " ", "\u0438", "\u043d", "\u0432", "e", "\u043d", "\u0442", "\u0430", "\u0440", "\u0435"}), ec.join(new String[]{"\u041d", "e", " ", "\u0446", "e", "\u043b", "\u0438", "\u0442", "\u044c", " ", "\u043a", "o", "\u0433", "\u0434", "\u0430", " ", "e", "\u043c"}), ec.join(new String[]{"\u041f", "\u0440", "o", "\u0432", "\u0435", "\u0440", "\u043a", "\u0430", " ", "c", "\u0442", "\u0435", "\u043d"}), ec.join(new String[]{"T", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u043f", "o", " ", "X"})));
        fr3.setNameParts(new String[]{"\u0423", "c", "\u043b", "\u043e", "\u0432", "\u0438", "\u044f"});
        fr3.setDescriptionParts(new String[]{"\u0423", "c", "\u043b", "\u043e", "\u0432", "\u0438", "\u044f", " ", "\u0440", "a", "\u0431", "\u043e", "\u0442", "\u044b"});
        this.p = fr3;
        this.s = new cT();
        this.B = new HashMap<UUID, A>();
        this.a(new fa[]{this.g});
        for (es es2 : d) {
            List list = es2.a();
            if (list.isEmpty()) continue;
            this.a(list.toArray(new fa[0]));
            es2.a(es2.a(), this.g);
        }
        this.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p);
        this.n.a(this.m::a);
    }

    static {
        a = "\u0414\u0438c\u0442\u0430\u043d\u0446\u0438\u044f";
        b = "\u0417\u0434\u043e\u0440\u043e\u0432\u044c\u0435";
        c = "\u0423\u0433\u043e\u043b";
        d = List.of(new bd(), new dO());
        e = d.stream().map(es::a).toList();
        f = new hW(kx.class);
    }

    private /* bridge */ /* synthetic */ boolean b(String string) {
        return this.p.a().contains(string);
    }

    private /* bridge */ /* synthetic */ boolean b() {
        if (this.b() == null || !gK.a(class_1764.class)) {
            return false;
        }
        return class_1764.method_7781((class_1799)this.b().method_6047());
    }

    private /* bridge */ /* synthetic */ boolean c() {
        if (this.b() == null || !this.b().method_6115()) {
            return false;
        }
        class_1839 class_18392 = this.b().method_6030().method_7976();
        return class_18392 == class_1839.field_8950 || class_18392 == class_1839.field_8946;
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.a();
    }

    private static /* bridge */ /* synthetic */ double a(double d2) {
        return eO.a(d2);
    }

    @Override
    public /* bridge */ /* synthetic */ void a(class_1657 class_16572, class_1937 class_19372, class_1268 class_12682, class_1297 class_12972, class_3966 class_39662) {
        class_1297 class_12973;
        boolean bl2 = this.a("\u0413o\u043b\u044b\u0435");
        boolean bl3 = this.a("T\u043e\u043b\u044c\u043a\u043e \u0432 \u043de\u0437\u0435\u0440\u0438\u0442\u043e\u0432\u043e\u0439");
        boolean bl4 = this.a("T\u043e\u043b\u044c\u043a\u043e \u0432 \u0431\u0440o\u043d\u0435");
        boolean bl5 = this.a("\u041de\u0432\u0438\u0434\u0438\u043c\u044b\u0435");
        boolean bl6 = this.a("T\u043e\u043b\u044c\u043a\u043e \u0438\u0433\u0440o\u043a\u0438");
        if (!this.a(bl2, bl6, bl5, class_12973 = class_12972, bl4, bl3)) {
            return;
        }
        if (this.k.a() > 0L || this.l.a()) {
            this.z = class_12972;
            this.t = System.currentTimeMillis();
        }
    }

    private /* bridge */ /* synthetic */ boolean a(String string) {
        return this.o.a().contains(string);
    }

    private /* bridge */ /* synthetic */ boolean a(boolean bl2, boolean bl3, boolean bl4, class_1297 class_12972, boolean bl5, boolean bl6) {
        class_1657 class_16572;
        if (!(class_12972 instanceof class_1309)) {
            return false;
        }
        class_1309 class_13092 = (class_1309)class_12972;
        if (class_12972 instanceof class_1531) {
            return false;
        }
        if (class_12972 instanceof class_1657 && this.e(class_16572 = (class_1657)class_12972)) {
            return false;
        }
        if (bl3 && !(class_12972 instanceof class_1657)) {
            return false;
        }
        if (!bl4 && class_13092.method_5767()) {
            return false;
        }
        boolean bl7 = cy.a(class_13092);
        if (bl6 && !this.a(class_13092)) {
            return false;
        }
        if (bl5 && !bl7) {
            return false;
        }
        return bl2 || bl7;
    }

    private /* bridge */ /* synthetic */ void a() {
        this.q = null;
        this.r = 0L;
        this.s.a();
        this.u = 0.0;
        this.v = 0.0;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.t = 0L;
        this.A = 0.0;
        this.B.clear();
        this.a().d();
    }

    private static /* bridge */ /* synthetic */ class_243 a(float f2, float f3) {
        float f4 = (float)Math.toRadians(f2);
        float f5 = (float)Math.toRadians(f3);
        double d2 = -class_3532.method_15374((float)f4) * class_3532.method_15362((float)f5);
        double d3 = -class_3532.method_15374((float)f5);
        double d4 = class_3532.method_15362((float)f4) * class_3532.method_15362((float)f5);
        return new class_243(d2, d3, d4).method_1029();
    }

    private /* bridge */ /* synthetic */ double[] a(class_1297 class_12972, es es2) {
        class_243 class_2432 = this.b().method_33571();
        double d2 = 0.78;
        double d3 = d2 + es2.a();
        double[] dArray = es2.a(class_12972);
        double d4 = dArray[0];
        double d5 = dArray[1];
        double d6 = dArray[2];
        double d7 = class_3532.method_15350((double)(d3 + d5), (double)0.05, (double)0.95);
        class_243 class_2433 = class_12972.method_19538().method_1031(d4, (double)class_12972.method_17682() * d7, d6);
        double d8 = class_2433.field_1352 - class_2432.field_1352;
        double d9 = class_2433.field_1351 - class_2432.field_1351;
        double d10 = class_2433.field_1350 - class_2432.field_1350;
        double d11 = Math.sqrt(d8 * d8 + d10 * d10);
        double d12 = d11 < 0.001 ? (double)this.b().method_36454() : Math.toDegrees(Math.atan2(-d8, d10));
        double d13 = Math.sqrt(d8 * d8 + d9 * d9 + d10 * d10);
        double d14 = d13 < 0.001 ? (double)this.b().method_36455() : -Math.toDegrees(Math.asin(class_3532.method_15350((double)(d9 / d13), (double)-1.0, (double)1.0)));
        return new double[]{d12, d14};
    }

    private /* bridge */ /* synthetic */ class_243 a(class_1297 class_12972) {
        double d2;
        double d3;
        class_243 class_2432 = this.b().method_33571();
        class_243 class_2433 = class_12972.method_19538();
        double d4 = class_2433.field_1352 - class_2432.field_1352;
        double d5 = class_2433.field_1350 - class_2432.field_1350;
        double d6 = Math.sqrt(d4 * d4 + d5 * d5);
        if (d6 <= 4.0) {
            d3 = 0.55;
        } else if (d6 <= 12.0) {
            d2 = (d6 - 4.0) / 8.0;
            d3 = 0.55 + d2 * 0.29999999999999993;
        } else {
            d2 = class_3532.method_15350((double)((d6 - 12.0) / 13.0), (double)0.0, (double)1.0);
            d3 = 0.85 + d2 * 0.20000000000000007;
        }
        d2 = class_2433.field_1351 + (double)class_12972.method_17682() * 0.5 - class_2432.field_1351;
        if (d6 > 0.5) {
            double d7 = d2 / d6;
            d3 -= class_3532.method_15350((double)(d7 * 0.15), (double)-0.15, (double)0.15);
        }
        d3 = class_3532.method_15350((double)d3, (double)0.2, (double)1.15);
        return class_2433.method_1031(0.0, (double)class_12972.method_17682() * d3, 0.0);
    }

    private /* bridge */ /* synthetic */ void a(double d2, class_1297 class_12972) {
        class_243 class_2432 = this.b().method_33571();
        class_243 class_2433 = this.a(class_12972);
        double d3 = class_2433.field_1352 - class_2432.field_1352;
        double d4 = class_2433.field_1351 - class_2432.field_1351;
        double d5 = class_2433.field_1350 - class_2432.field_1350;
        double d6 = Math.sqrt(d3 * d3 + d5 * d5);
        double d7 = Math.sqrt(d3 * d3 + d4 * d4 + d5 * d5);
        if (d7 < 0.001) {
            return;
        }
        double d8 = Math.toDegrees(Math.atan2(-d3, d5));
        double d9 = -Math.toDegrees(Math.asin(class_3532.method_15350((double)(d4 / d7), (double)-1.0, (double)1.0)));
        if (d6 < 0.001) {
            d8 = this.b().method_36454();
        }
        float f2 = this.b().method_36454();
        float f3 = this.b().method_36455();
        double d10 = f.a(d8 - (double)f2);
        double d11 = d9 - (double)f3;
        double d12 = 1.0 - Math.pow(0.72, Math.max(d2, 0.01));
        double d13 = d10 * d12;
        double d14 = d11 * d12;
        if (Math.abs(d10) < 0.02) {
            d13 = d10;
        }
        if (Math.abs(d11) < 0.02) {
            d14 = d11;
        }
        float f4 = f2 + (float)d13;
        float f5 = class_3532.method_15363((float)(f3 + (float)d14), (float)-90.0f, (float)90.0f);
        this.b().method_36456(f4);
        this.b().method_36457(f5);
    }

    private /* bridge */ /* synthetic */ class_243 a(es es2, class_1297 class_12972) {
        double d2 = 0.78;
        double d3 = d2 + es2.a();
        double[] dArray = es2.a(class_12972);
        double d4 = class_3532.method_15350((double)(d3 + dArray[1]), (double)0.05, (double)0.95);
        return class_12972.method_19538().method_1031(dArray[0], (double)class_12972.method_17682() * d4, dArray[2]);
    }

    private /* bridge */ /* synthetic */ double a(class_243 class_2432, class_243 class_2433, class_1297 class_12972) {
        double d2;
        class_243 class_2434 = class_12972.method_19538();
        double d3 = class_2434.field_1352 - class_2433.field_1352;
        double d4 = class_2434.field_1351 + (double)class_12972.method_17682() * 0.78 - class_2433.field_1351;
        double d5 = d3 * d3 + d4 * d4 + (d2 = class_2434.field_1350 - class_2433.field_1350) * d2;
        if (d5 < 1.0E-6) {
            return 1.0;
        }
        double d6 = 1.0 / Math.sqrt(d5);
        return class_2432.field_1352 * d3 * d6 + class_2432.field_1351 * d4 * d6 + class_2432.field_1350 * d2 * d6;
    }

    private /* bridge */ /* synthetic */ boolean a(class_1309 class_13092) {
        for (class_1799 class_17992 : class_13092.method_5661()) {
            class_1792 class_17922;
            if (class_17992.method_7960() || (class_17922 = class_17992.method_7909()) != class_1802.field_22027 && class_17922 != class_1802.field_22028 && class_17922 != class_1802.field_22029 && class_17922 != class_1802.field_22030) continue;
            return true;
        }
        return false;
    }

    private /* bridge */ /* synthetic */ class_1297 a() {
        boolean bl2;
        boolean bl3;
        class_1297 class_12972;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        double d2;
        double d3;
        Object object;
        class_238 class_2383;
        if (this.z()) {
            return null;
        }
        boolean bl7 = this.m.a() && this.b();
        double d4 = bl7 ? this.n.d() : this.i.d();
        double d5 = bl7 ? 45.0 : this.j.d() / 2.0;
        double d6 = Math.cos(Math.toRadians(d5));
        String string = bl7 ? c : this.h.a();
        class_1309 class_13093 = null;
        double d7 = Double.MAX_VALUE;
        boolean bl8 = this.a("T\u043e\u043b\u044c\u043a\u043e \u0438\u0433\u0440o\u043a\u0438");
        boolean bl9 = this.a("\u041de\u0432\u0438\u0434\u0438\u043c\u044b\u0435");
        boolean bl10 = this.a("T\u043e\u043b\u044c\u043a\u043e \u0432 \u0431\u0440o\u043d\u0435");
        boolean bl11 = this.a("T\u043e\u043b\u044c\u043a\u043e \u0432 \u043de\u0437\u0435\u0440\u0438\u0442\u043e\u0432\u043e\u0439");
        boolean bl12 = this.a("\u0413o\u043b\u044b\u0435");
        boolean bl13 = this.b("\u041f\u0440o\u0432\u0435\u0440\u043a\u0430 c\u0442\u0435\u043d");
        class_243 class_2432 = this.b().method_33571();
        float f2 = this.b().method_36454();
        float f3 = this.b().method_36455();
        class_243 class_2433 = f.a(f2, f3);
        es es2 = this.a();
        long l2 = System.currentTimeMillis();
        this.B.entrySet().removeIf(entry -> l2 - ((A)entry.getValue()).b > 2000L);
        if (this.l.a()) {
            class_1309 class_13094;
            boolean bl14 = bl12;
            boolean bl15 = bl8;
            boolean bl16 = bl9;
            class_1297 class_12973 = this.z;
            boolean bl17 = bl10;
            boolean bl18 = bl11;
            if (!this.a(bl14, bl15, bl16, class_12973, bl17, bl18)) {
                this.z = null;
                return null;
            }
            class_1297 class_12974 = this.z;
            if (class_12974 instanceof class_1309 && (class_13094 = (class_1309)class_12974).method_5805() && class_13094.method_6032() > 0.0f) {
                class_243 class_2434;
                class_1297 class_12975;
                es es3;
                class_243 class_2435;
                class_1297 class_12976;
                class_243 class_2436;
                class_243 class_2437;
                double d8;
                double d9 = this.b().method_5739(this.z);
                if (d9 <= d4 && d9 >= 0.5 && (d8 = this.a(class_2437 = class_2433, class_2436 = class_2432, class_12976 = this.z)) >= d6 && (!bl13 || !ij.a(class_2435 = this.a(es3 = es2, class_12975 = this.z), class_2434 = class_2432))) {
                    return this.z;
                }
                return null;
            }
            this.z = null;
            return null;
        }
        long l3 = this.k.a() * 1000L;
        class_1297 class_12977 = null;
        if (l3 > 0L) {
            if (this.z != null && this.t > 0L && l2 - this.t < l3) {
                class_12977 = this.z;
            } else if (this.q != null && this.r > 0L && l2 - this.r < l3) {
                class_12977 = this.q;
            }
        }
        if (class_12977 != null) {
            boolean bl19 = bl12;
            boolean bl20 = bl8;
            boolean bl21 = bl9;
            class_1297 class_12978 = class_12977;
            boolean bl22 = bl10;
            boolean bl23 = bl11;
            if (!this.a(bl19, bl20, bl21, class_12978, bl22, bl23)) {
                if (class_12977 == this.z) {
                    this.z = null;
                    this.t = 0L;
                }
            } else {
                if (class_12977 instanceof class_1309 && (class_2383 = (class_1309)class_12977).method_5805() && class_2383.method_6032() > 0.0f) {
                    double d10 = this.b().method_5739(class_12977);
                    if (d10 <= d4 && d10 >= 0.5) {
                        class_1297 class_12979;
                        class_243 class_2438;
                        class_243 class_2439;
                        double d11;
                        boolean bl24;
                        A a2 = this.B.get(class_12977.method_5667());
                        boolean bl25 = bl24 = a2 != null && l2 < a2.c;
                        if (!bl24 && (d11 = this.a(class_2439 = class_2433, class_2438 = class_2432, class_12979 = class_12977)) >= d6) {
                            class_243 class_24310;
                            class_1297 class_129710;
                            es es4;
                            class_243 class_24311;
                            boolean bl26;
                            boolean bl27 = bl26 = !bl13 || !ij.a(class_24311 = this.a(es4 = es2, class_129710 = class_12977), class_24310 = class_2432);
                            if (bl26) {
                                return class_12977;
                            }
                        }
                    }
                    return null;
                }
                if (class_12977 == this.z) {
                    this.z = null;
                    this.t = 0L;
                }
            }
        }
        class_2383 = this.b().method_5829().method_1014(d4);
        class_1309 class_13095 = this.a().method_8390(class_1309.class, class_2383, class_13092 -> true).iterator();
        while (class_13095.hasNext()) {
            class_1309 class_13096;
            class_243 class_24312;
            class_243 class_24313;
            class_243 class_24314;
            class_1309 class_13097;
            es es5;
            class_243 class_24315;
            class_243 class_24316;
            double d12;
            double d13;
            class_1657 class_16572;
            object = (class_1309)class_13095.next();
            class_1309 class_13098 = object;
            if (class_13098 == this.b() || object.method_29504() || object.method_6032() <= 0.0f || class_13098 instanceof class_1531 || class_13098.method_7325() || !class_13098.method_5863() || bl8 && !(class_13098 instanceof class_1657) || class_13098 instanceof class_1657 && this.e(class_16572 = (class_1657)class_13098) || !bl9 && object.method_5767()) continue;
            boolean bl28 = cy.a(object);
            if (bl11 && !this.a((class_1309)object) || bl10 && !bl28 || !bl12 && !bl28 || (d13 = (double)this.b().method_5739((class_1297)class_13098)) > d4 || d13 < 0.5) continue;
            class_243 class_24317 = class_13098.method_19538();
            A a3 = this.B.computeIfAbsent(class_13098.method_5667(), uUID -> new A());
            if (a3.a != null) {
                d12 = class_24317.method_1022(a3.a);
                d3 = Math.max(1L, l2 - a3.b);
                d2 = d12 / (d3 / 1000.0);
                if (d12 > 12.0 || d2 > 60.0) {
                    a3.c = l2 + 200L;
                }
            }
            a3.a = class_24317;
            a3.b = l2;
            if (l2 < a3.c || bl13 && ij.a(class_24316 = (class_24315 = this.a(es5 = es2, (class_1297)(class_13097 = class_13098))), class_24314 = class_2432) || (d12 = this.a(class_24313 = class_2433, class_24312 = class_2432, (class_1297)(class_13096 = class_13098))) < d6 || !((d3 = b.equals(string) ? (double)object.method_6032() : (c.equals(string) ? Math.toDegrees(Math.acos(class_3532.method_15350((double)d12, (double)-1.0, (double)1.0))) : d13)) < d7)) continue;
            d7 = d3;
            class_13093 = class_13098;
        }
        if (this.q != null && class_13093 != null && class_13093 != this.q && (object = this.q) instanceof class_1309 && (class_13095 = object).method_5805() && class_13095.method_6032() > 0.0f && this.a(bl6 = bl12, bl5 = bl8, bl4 = bl9, class_12972 = this.q, bl3 = bl10, bl2 = bl11)) {
            class_243 class_24318;
            class_1297 class_129711;
            es es6;
            class_243 class_24319;
            boolean bl29;
            object = this.B.get(this.q.method_5667());
            boolean bl30 = object != null && l2 < object.c;
            double d14 = this.b().method_5739(this.q);
            boolean bl31 = d14 <= d4 && d14 >= 0.5;
            class_1297 class_129712 = this.q;
            class_243 class_24320 = class_2433;
            class_243 class_24321 = class_2432;
            double d15 = this.a(class_24320, class_24321, class_129712);
            boolean bl32 = d15 >= d6;
            boolean bl33 = bl29 = !bl13 || !ij.a(class_24319 = this.a(es6 = es2, class_129711 = this.q), class_24318 = class_2432);
            if (!bl30 && bl31 && bl32 && bl29) {
                d3 = b.equals(string) ? (double)class_13095.method_6032() : (c.equals(string) ? Math.toDegrees(Math.acos(class_3532.method_15350((double)d15, (double)-1.0, (double)1.0))) : d14);
                double d16 = c.equals(string) ? 8.0 : (d2 = b.equals(string) ? 4.0 : 0.75);
                if (d7 > d3 - d2) {
                    return this.q;
                }
            }
        }
        return class_13093;
    }

    private /* bridge */ /* synthetic */ boolean a() {
        if (this.b() == null) {
            return false;
        }
        return gK.a(this.b().method_6047());
    }

    private /* bridge */ /* synthetic */ es a() {
        String string = this.g.a();
        for (es es2 : d) {
            if (!es2.a().equals(string)) continue;
            return es2;
        }
        return (es)d.getFirst();
    }

    @Override
    public /* bridge */ /* synthetic */ void k() {
        double d2;
        double d3;
        double d4;
        long l2;
        boolean bl2;
        if (this.z() || this.b() == null) {
            return;
        }
        kx kx2 = (kx)f.a();
        if (kx2 != null && kx2.a()) {
            if (this.q != null) {
                this.a();
            }
            return;
        }
        class_5321 class_53212 = this.a().method_27983();
        if (this.w == null) {
            this.w = class_53212;
        } else if (!this.w.equals((Object)class_53212)) {
            if (this.b("B\u044b\u043a\u043b. \u043fp\u0438 c\u043c\u0435\u043d\u0435 \u043c\u0438\u0440a")) {
                this.a(false);
                return;
            }
            this.w = class_53212;
            this.a();
            this.w = class_53212;
            return;
        }
        class_243 class_2432 = this.b().method_19538();
        if (this.y != null && class_2432.method_1025(this.y) > 64.0) {
            this.a();
            this.y = class_2432;
            return;
        }
        this.y = class_2432;
        boolean bl3 = bl2 = this.m.a() && this.b();
        if (this.b("T\u043e\u043b\u044c\u043a\u043e c o\u0440\u0443\u0436\u0438\u0435\u043c") && !this.a() && !bl2) {
            return;
        }
        if (this.b("\u041de \u0446e\u043b\u0438\u0442\u044c \u0432 \u0438\u043d\u0432e\u043d\u0442\u0430\u0440\u0435") && this.a() instanceof class_465) {
            return;
        }
        if (this.b("\u041de \u0446e\u043b\u0438\u0442\u044c \u043ao\u0433\u0434\u0430 e\u043c") && this.c()) {
            return;
        }
        double d5 = this.s.a();
        class_1297 class_12972 = this.a();
        if (class_12972 == null) {
            boolean bl4;
            long l3 = this.k.a() * 1000L;
            long l4 = System.currentTimeMillis();
            boolean bl5 = bl4 = l3 > 0L && (this.z != null && this.t > 0L && l4 - this.t < l3 || this.q != null && this.r > 0L && l4 - this.r < l3);
            if (!bl4 && this.q != null) {
                this.a();
            }
            return;
        }
        class_243 class_2433 = class_12972.method_19538();
        if (class_12972 == this.q && this.x != null) {
            double d6 = class_2433.method_1022(this.x);
            double d7 = d6 / Math.max(d5, 0.1);
            this.A = d7 > 3.0 ? (this.A += d7 - 3.0) : Math.max(0.0, this.A - 3.0 * d5);
            if (d6 > 12.0 || this.A > 20.0) {
                A a2 = this.B.computeIfAbsent(class_12972.method_5667(), uUID -> new A());
                a2.c = System.currentTimeMillis() + 250L;
                this.A = 0.0;
                this.x = class_2433;
                return;
            }
        } else {
            this.A = 0.0;
        }
        this.x = class_2433;
        es es2 = this.a();
        if (class_12972 != this.q) {
            this.q = class_12972;
            this.r = System.currentTimeMillis();
            this.x = class_2433;
            this.u = 0.0;
            this.v = 0.0;
            es2.c();
        }
        long l5 = l2 = System.currentTimeMillis();
        double d8 = d5;
        class_1297 class_12973 = class_12972;
        es2.a(d8, l5, class_12973);
        if (bl2) {
            double d9 = d5;
            class_1297 class_12974 = class_12972;
            this.a(d9, class_12974);
            return;
        }
        double[] dArray = this.a(class_12972, es2);
        float f2 = this.b().method_36454();
        float f3 = this.b().method_36455();
        boolean bl6 = this.b("T\u043e\u043b\u044c\u043a\u043e \u043fo X") && !bl2;
        double d10 = f.a(dArray[0] - (double)f2);
        double d11 = dArray[1] - (double)f3;
        if (bl6) {
            ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
            double d12 = 8.0 + threadLocalRandom.nextDouble(4.0);
            double d13 = Math.abs(d11);
            if (d13 > d12) {
                d4 = 0.06 + threadLocalRandom.nextDouble(0.06);
                d3 = (d11 - Math.signum(d11) * d12) * d4;
            } else {
                d3 = 0.0;
            }
        } else {
            d3 = d11;
        }
        double d14 = d2 = bl6 ? Math.abs(d10) : Math.sqrt(d10 * d10 + d3 * d3);
        if (d2 < 0.05) {
            return;
        }
        double d15 = es2.b();
        double d16 = this.v;
        double d17 = this.u;
        class_1657 class_16572 = this.b();
        long l6 = this.r;
        long l7 = l2;
        double d18 = d5;
        double d19 = d15;
        double d20 = d2;
        double d21 = d3;
        double d22 = d10;
        double[] dArray2 = es2.a(d22, l6, d17, d21, d20, d16, d19, l7, class_16572, d18);
        d4 = dArray2[0];
        double d23 = dArray2[1];
        this.u = dArray2[2];
        this.v = dArray2[3];
        double d24 = this.b().method_5739(class_12972);
        if (d24 < 1.5) {
            double d25 = class_3532.method_15350((double)(d24 - 0.5), (double)0.05, (double)1.0);
            d4 *= d25;
            d23 *= d25;
            this.u = dArray2[2] * d25;
            this.v = dArray2[3] * d25;
        }
        if (Math.abs(d4) < 0.003 && Math.abs(d23) < 0.003) {
            return;
        }
        float f4 = f2 + (float)d4;
        float f5 = class_3532.method_15363((float)(f3 + (float)d23), (float)-90.0f, (float)90.0f);
        this.b().method_36456(f4);
        this.b().method_36457(f5);
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.a();
    }
}

