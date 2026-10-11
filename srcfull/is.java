/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import net.minecraft.class_1268;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1684;
import net.minecraft.class_1686;
import net.minecraft.class_1764;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_1935;
import net.minecraft.class_1937;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2616;
import net.minecraft.class_2663;
import net.minecraft.class_2678;
import net.minecraft.class_2718;
import net.minecraft.class_2767;
import net.minecraft.class_2783;
import net.minecraft.class_3414;
import net.minecraft.class_3966;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_746;
import net.minecraft.class_9278;
import net.minecraft.class_9334;
import org.joml.Matrix4f;

public class is
extends aT {
    private static final /* synthetic */ hW<ay> a;
    private static final /* synthetic */ hW<fG> b;
    private static final /* synthetic */ hW<eM> c;
    private static final /* synthetic */ class_1799 d;
    private static final /* synthetic */ class_1799 e;
    private static final /* synthetic */ class_1799 f;
    private static final /* synthetic */ class_1799 g;
    private static final /* synthetic */ class_1799 h;
    private static final /* synthetic */ class_1799 i;
    private final /* synthetic */ gz j;
    private final /* synthetic */ dw k;
    private final /* synthetic */ dw l;
    private final /* synthetic */ dw m;
    private final /* synthetic */ dw n;
    private final /* synthetic */ dw o;
    private final /* synthetic */ dw p;
    private final /* synthetic */ gz q;
    private final /* synthetic */ dw r;
    private final /* synthetic */ dw s;
    private final /* synthetic */ Map<Integer, iL> t;
    private final /* synthetic */ Map<UUID, jY> u;
    private final /* synthetic */ Map<UUID, class_1799> v;
    private final /* synthetic */ Map<UUID, class_1799> w;
    private final /* synthetic */ Set<UUID> x;
    private final /* synthetic */ Set<UUID> y;
    private final /* synthetic */ Set<Integer> z;
    private final /* synthetic */ Set<Integer> A;
    private final /* synthetic */ Map<UUID, z> B;
    private final /* synthetic */ List<jQ> C;
    private final /* synthetic */ Map<jQ, Float> D;
    private /* synthetic */ long E;
    private final /* synthetic */ Set<class_1291> F;
    private /* synthetic */ class_243 G;
    private /* synthetic */ long H;
    private /* synthetic */ class_243 I;
    private /* synthetic */ long J;

    public /* synthetic */ is() {
        super("\u0418\u0442\u0435\u043c\u0422\u0440\u0430\u0441\u043a\u0435\u0440", fV.c);
        gz gz2 = new gz("", "", 50.0, 10.0, 100.0, 1.0);
        gz2.setNameParts(new String[]{"\u0420", "a", "\u0434", "\u0438", "\u0443", "\u0441"});
        gz2.setDescriptionParts(new String[]{"\u0414", "\u0438", "c", "\u0442", "\u0430", "\u043d", "\u0446", "\u0438", "\u044f", " ", "o", "\u0442", "\u0441", "\u043b", "\u0435", "\u0436", "\u0438", "\u0432", "\u0430", "\u043d", "\u0438", "\u044f"});
        this.j = gz2;
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"M", "\u0435", "\u0442", "\u0430", "\u043d", "\u0438", "\u0435", " ", "\u0437", "e", "\u043b", "\u0438", "\u0439"});
        dw2.setDescriptionParts(new String[]{"C", "\u043e", "\u043e", "\u0431", "\u0449", "\u0430", "\u0442", "\u044c", " ", "\u043a", "o", "\u043c", "\u0443", " ", "\u043f", "\u0440", "\u0438", "\u043b", "e", "\u0442", "\u0435", "\u043b", "\u043e", " ", "\u0431", "\u0440", "o", "\u0448", "\u0435", "\u043d", "\u043d", "\u043e", "\u0435", " ", "\u0437", "e", "\u043b", "\u044c", "\u0435"});
        this.k = dw2;
        dw dw3 = new dw("", "", true);
        dw3.setNameParts(new String[]{"\u0411", "\u0440", "o", "\u0441", "\u043e", "\u043a", " ", "\u043f", "e", "\u0440", "\u043b", "\u043e", "\u0432"});
        dw3.setDescriptionParts(new String[]{"C", "\u043e", "\u043e", "\u0431", "\u0449", "\u0430", "\u0442", "\u044c", " ", "\u043a", "o", "\u0433", "\u0434", "\u0430", " ", "\u043a", "\u0442", "o", "-", "\u0442", "o", " ", "\u0431", "\u0440", "o", "\u0441", "\u0438", "\u043b", " ", "\u044d", "\u043d", "\u0434", "e", "\u0440", "-", "\u043f", "e", "\u0440", "\u043b"});
        this.l = dw3;
        dw dw4 = new dw("", "", true);
        dw4.setNameParts(new String[]{"\u0418", "c", "\u043f", "\u043e", "\u043b", "\u044c", "\u0437", "\u043e", "\u0432", "\u0430", "\u043d", "\u0438", "\u0435"});
        dw4.setDescriptionParts(new String[]{"C", "\u043e", "\u043e", "\u0431", "\u0449", "\u0430", "\u0442", "\u044c", " ", "\u043a", "o", "\u0433", "\u0434", "\u0430", " ", "\u0438", "\u0433", "\u0440", "o", "\u043a", " ", "\u043d", "a", "\u0447", "\u0430", "\u043b", " ", "\u0438", "c", "\u043f", "\u043e", "\u043b", "\u044c", "\u0437", "\u043e", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442"});
        this.m = dw4;
        dw dw5 = new dw("", "", true);
        dw5.setNameParts(new String[]{"\u041f", "o", "\u0442", "\u0435", "\u0440", "\u044f", " ", "\u0442", "o", "\u0442", "\u0435", "\u043c", "\u043e", "\u0432"});
        dw5.setDescriptionParts(new String[]{"C", "\u043e", "\u043e", "\u0431", "\u0449", "\u0430", "\u0442", "\u044c", " ", "\u043a", "o", "\u0433", "\u0434", "\u0430", " ", "y", " ", "\u043a", "o", "\u0433", "\u043e", "-", "\u0442", "o", " ", "c", "\u0440", "\u0430", "\u0431", "\u043e", "\u0442", "\u0430", "\u043b", " ", "\u0442", "o", "\u0442", "\u0435", "\u043c"});
        this.n = dw5;
        dw dw6 = new dw("", "", true);
        dw6.setNameParts(new String[]{"K", "\u0443", "\u043b", "\u0434", "\u0430", "\u0443", "\u043d", "\u044b", " ", "\u043f", "\u0440", "o", "\u0442", "\u0438", "\u0432", "\u043d", "\u0438", "\u043a", "\u043e", "\u0432"});
        dw6.setDescriptionParts(new String[]{"O", "\u0442", "\u0441", "\u043b", "\u0435", "\u0436", "\u0438", "\u0432", "\u0430", "\u0442", "\u044c", " ", "o", "\u0442", "\u043a", "\u0430", "\u0442", "\u044b", " ", "\u0433", "\u044d", "\u043f", "\u043b", "o", "\u0432", ",", " ", "\u0447", "a", "\u0440", "\u043e", "\u043a", " ", "\u0438", " ", "\u0442", "\u0440", "a", "\u043f", "\u043e", "\u043a", " ", "y", " ", "\u043f", "o", "\u0441", "\u043b", "\u0435", "\u0434", "\u043d", "\u0435", "\u0439", " ", "\u0446", "e", "\u043b", "\u0438"});
        this.o = dw6;
        dw dw7 = new dw("", "", true);
        dw7.setNameParts(new String[]{"T", "\u0430", "\u0439", "\u043c", "\u0435", "\u0440", "\u044b", " ", "\u0442", "\u0440", "a", "\u043f", "\u043a", "\u0438", "/", "\u043f", "\u043b", "a", "\u0441", "\u0442", "\u0430"});
        dw7.setDescriptionParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0432", " ", "\u043c", "\u0438", "\u0440", "e", " ", "\u0442", "a", "\u0439", "\u043c", "\u0435", "\u0440", " ", "c", "\u0440", "\u0430", "\u0431", "\u0430", "\u0442", "\u044b", "\u0432", "\u0430", "\u043d", "\u0438", "\u044f", " ", "\u0442", "\u0440", "a", "\u043f", "\u043a", "\u0438", " ", "\u0438", " ", "\u043f", "\u043b", "a", "\u0441", "\u0442", "\u0430"});
        this.p = dw7;
        gz gz3 = new gz("", "", 0.3, 0.1, 1.0, 0.1);
        gz3.setNameParts(new String[]{"M", "\u0430", "\u0441", "\u0448", "\u0442", "\u0430", "\u0431", " ", "\u043f", "\u043b", "a", "\u0448", "\u043a", "\u0438"});
        gz3.setDescriptionParts(new String[]{"M", "\u0430", "\u0441", "\u0448", "\u0442", "\u0430", "\u0431", " ", "\u043f", "\u043b", "a", "\u0448", "\u043a", "\u0438", " ", "\u0442", "a", "\u0439", "\u043c", "\u0435", "\u0440", "\u0430", " ", "\u0442", "\u0440", "a", "\u043f", "\u043a", "\u0438", "/", "\u043f", "\u043b", "a", "\u0441", "\u0442", "\u0430"});
        this.q = gz3;
        dw dw8 = new dw("", "", false);
        dw8.setNameParts(new String[]{"C", "\u0435", "\u0431", "\u044f", " ", "\u0442", "o", "\u0436", "\u0435"});
        dw8.setDescriptionParts(new String[]{"\u041b", "o", "\u0433", "\u0433", "\u0438", "\u0440", "\u043e", "\u0432", "\u0430", "\u0442", "\u044c", " ", "c", "\u043e", "\u0431", "\u0441", "\u0442", "\u0432", "\u0435", "\u043d", "\u043d", "\u044b", "\u0435", " ", "\u0434", "e", "\u0439", "\u0441", "\u0442", "\u0432", "\u0438", "\u044f"});
        this.r = dw8;
        dw dw9 = new dw("", "", true);
        dw9.setNameParts(new String[]{"\u0418", "\u0433", "\u043d", "o", "\u0440", "\u0438", "\u0440", "\u043e", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0434", "\u0440", "\u0443", "\u0437", "e", "\u0439"});
        dw9.setDescriptionParts(new String[]{"\u041d", "e", " ", "\u043b", "o", "\u0433", "\u0433", "\u0438", "\u0440", "\u043e", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0434", "e", "\u0439", "\u0441", "\u0442", "\u0432", "\u0438", "\u044f", " ", "\u0434", "\u0440", "\u0443", "\u0437", "e", "\u0439"});
        this.s = dw9;
        this.t = new HashMap<Integer, iL>();
        this.u = new HashMap<UUID, jY>();
        this.v = new HashMap<UUID, class_1799>();
        this.w = new HashMap<UUID, class_1799>();
        this.x = new HashSet<UUID>();
        this.y = new HashSet<UUID>();
        this.z = new HashSet<Integer>();
        this.A = new HashSet<Integer>();
        this.B = new HashMap<UUID, z>();
        this.C = new ArrayList<jQ>();
        this.D = new HashMap<jQ, Float>();
        this.E = System.currentTimeMillis();
        this.F = ConcurrentHashMap.newKeySet();
        this.G = null;
        this.H = 0L;
        this.I = null;
        this.J = 0L;
        this.q.a(this.p::a);
        this.a(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    static {
        a = new hW(ay.class);
        b = new hW(fG.class);
        c = new hW(eM.class);
        d = new class_1799((class_1935)class_1802.field_8399);
        e = is.a();
        g = f = new class_1799((class_1935)fh.f.K);
        h = f;
        i = new class_1799((class_1935)fh.g.K);
    }

    private /* bridge */ /* synthetic */ void e(double d2) {
        class_746 class_7462 = this.a();
        this.y.clear();
        for (class_1657 class_16572 : this.a().method_18456()) {
            if (class_7462.method_5858((class_1297)class_16572) > d2) continue;
            UUID uUID = class_16572.method_5667();
            this.y.add(uUID);
            boolean bl2 = is.b(class_16572);
            boolean bl3 = this.x.contains(uUID);
            if (bl2 && !bl3) {
                this.x.add(uUID);
                continue;
            }
            if (bl2 || !bl3) continue;
            this.x.remove(uUID);
            if (!is.c(class_16572) || !this.b((class_1309)class_16572)) continue;
            String string = is.a((class_1309)class_16572) + " \u0432\u044b\u0441\u0442\u0440\u0435\u043b\u0438\u043b \u0438\u0437 \u0430\u0440\u0431\u0430\u043b\u0435\u0442\u0430";
            String string2 = "";
            ct ct2 = ct.of(d);
            ek.a().a(string2, ct2, string);
        }
        this.x.retainAll(this.y);
    }

    private /* bridge */ /* synthetic */ boolean b(class_1309 class_13092) {
        if (!this.r.a() && class_13092 == this.a()) {
            return false;
        }
        return !this.s.a() || !this.f(class_13092);
    }

    private static /* bridge */ /* synthetic */ void b(class_1799 class_17992) {
        class_1792 class_17922 = class_17992.method_7909();
        if (class_17922 == class_1802.field_8367) {
            dx.a(ix.a);
            return;
        }
        if (class_17922 == class_1802.field_8463) {
            dx.a(ix.d);
            return;
        }
        if (class_17922 == class_1802.field_8233) {
            dx.a(ix.g);
            return;
        }
        if (class_17922 != class_1802.field_8574) {
            return;
        }
        class_1844 class_18442 = (class_1844)class_17992.method_57824(class_9334.field_49651);
        if (class_18442 == null) {
            return;
        }
        for (class_1293 class_12932 : class_18442.method_57397()) {
            class_1291 class_12912 = (class_1291)class_12932.method_5579().comp_349();
            if (class_12912 == class_1294.field_5915.comp_349()) {
                dx.a(ix.f);
                continue;
            }
            if (class_12912 != class_1294.field_5916.comp_349()) continue;
            dx.a(ix.b);
        }
    }

    private static /* bridge */ /* synthetic */ boolean b(fh fh2) {
        return fh2.M != null || fh2.N != null || fh2.R != -1 || fh2.S != -1;
    }

    private static /* bridge */ /* synthetic */ boolean b(class_1657 class_16572) {
        return !is.a((class_1309)class_16572, (T class_17992) -> class_17992.method_7909() instanceof class_1764 && class_1764.method_7781((class_1799)class_17992)).method_7960();
    }

    private /* bridge */ /* synthetic */ void b(double d2) {
        class_746 class_7462 = this.a();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (class_1297 class_12972 : this.a().method_18112()) {
            class_1309 class_13092;
            class_1297 class_12973;
            if (!(class_12972 instanceof class_1684)) continue;
            class_1684 class_16842 = (class_1684)class_12972;
            int n2 = class_16842.method_5628();
            hashSet.add(n2);
            if (this.A.contains(n2)) continue;
            this.A.add(n2);
            if (class_7462.method_5858((class_1297)class_16842) > d2 || !((class_12973 = class_16842.method_24921()) instanceof class_1309) || !this.b(class_13092 = (class_1309)class_12973)) continue;
            String string = is.a(class_13092) + " \u0431\u0440\u043e\u0441\u0438\u043b \u043f\u0435\u0440\u043b";
            String string2 = "";
            ct ct2 = ct.of(new class_1799((class_1935)class_1802.field_8634));
            ek.a().a(string2, ct2, string);
        }
        this.A.retainAll(hashSet);
    }

    private static /* bridge */ /* synthetic */ String b(class_1799 class_17992) {
        fh fh2 = bw.a(class_17992);
        return fh2 != null ? fh2.L : "\u0442\u043e\u0442\u0435\u043c";
    }

    private static /* bridge */ /* synthetic */ boolean b() {
        ay ay2 = (ay)a.b();
        return ay2 != null && ay2.a();
    }

    @Override
    public /* bridge */ /* synthetic */ void b(bh bh2) {
        if (this.z()) {
            return;
        }
        double d2 = this.j.d() * this.j.d();
        if (this.k.a()) {
            this.c(d2);
            this.a(d2);
        }
        if (this.l.a()) {
            this.b(d2);
        }
        if (this.m.a() || this.o.a()) {
            this.d(d2);
        }
        if (this.m.a()) {
            this.e(d2);
        }
        if (this.n.a()) {
            this.f(d2);
        }
    }

    private /* bridge */ /* synthetic */ void c(double d2) {
        Function<class_1309, class_1799> function = class_13092 -> is.a(class_13092, (T class_17992) -> {
            class_1792 class_17922 = class_17992.method_7909();
            return class_17922 == class_1802.field_8436 || class_17922 == class_1802.field_8150;
        });
        Map<UUID, class_1799> map = this.w;
        double d3 = d2;
        this.a(function, d3, map);
    }

    private static /* bridge */ /* synthetic */ boolean c(class_1657 class_16572) {
        return !is.a((class_1309)class_16572, (T class_17992) -> class_17992.method_7909() instanceof class_1764).method_7960();
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.a();
    }

    private /* bridge */ /* synthetic */ void f(double d2) {
        Function<class_1309, class_1799> function = class_13092 -> is.a(class_13092, (T class_17992) -> class_17992.method_7909() == class_1802.field_8288);
        Map<UUID, class_1799> map = this.v;
        double d3 = d2;
        this.a(function, d3, map);
    }

    @Override
    public /* bridge */ /* synthetic */ void f(H h2) {
        if (gd.k()) {
            return;
        }
        if (!this.p.a() || this.C.isEmpty()) {
            return;
        }
        class_243 class_2432 = h2.a().method_19326();
        class_4184 class_41842 = h2.a();
        class_4587 class_45872 = h2.a();
        this.a(class_45872, class_2432, class_41842);
    }

    private /* bridge */ /* synthetic */ void d(double d2) {
        class_746 class_7462 = this.a();
        this.y.clear();
        boolean bl2 = this.m.a();
        UUID uUID = this.o.a() ? dx.a() : null;
        for (class_1657 class_16572 : this.a().method_18456()) {
            UUID uUID2 = class_16572.method_5667();
            boolean bl3 = uUID2.equals(uUID);
            if (!bl3 && class_7462.method_5858((class_1297)class_16572) > d2) continue;
            this.y.add(uUID2);
            boolean bl4 = class_16572.method_6115();
            class_1799 class_17992 = bl4 ? class_16572.method_6030() : class_1799.field_8037;
            jY jY2 = this.u.get(uUID2);
            if (bl4 && !class_17992.method_7960()) {
                int n2 = class_16572.method_6048();
                if (jY2 == null || jY2.b != class_17992.method_7909()) {
                    this.u.put(uUID2, new jY(class_17992.method_7972(), class_17992.method_7935((class_1309)class_16572), n2));
                    if (!bl3) continue;
                    is.a(class_17992);
                    continue;
                }
                jY2.d = n2;
                continue;
            }
            if (jY2 == null) continue;
            if (jY2.d + 2 >= jY2.c) {
                if (bl2 && this.b((class_1309)class_16572)) {
                    class_1799 class_17993 = jY2.a;
                    class_1657 class_16573 = class_16572;
                    this.a(class_17993, class_16573);
                }
                if (bl3) {
                    is.b(jY2.a);
                }
            }
            this.u.remove(uUID2);
        }
        this.u.keySet().retainAll(this.y);
    }

    private /* bridge */ /* synthetic */ void a(class_1799 class_17992, class_1657 class_16572) {
        if (class_17992.method_7960()) {
            return;
        }
        String string = class_17992.method_7964().getString();
        fh fh2 = is.a(class_17992);
        String string2 = is.a(class_17992, fh2);
        if (string2 == null) {
            return;
        }
        String string3 = fh2 != null ? fh2.L : is.a(string);
        class_1799 class_17993 = class_17992.method_7909() instanceof class_1764 ? e : class_17992;
        String string4 = is.a((class_1309)class_16572) + " " + string2 + " " + string3;
        String string5 = "";
        ct ct2 = ct.of(class_17993);
        ek.a().a(string5, ct2, string4);
    }

    private static /* bridge */ /* synthetic */ String a(class_1799 class_17992, fh fh2) {
        class_1792 class_17922 = class_17992.method_7909();
        if (class_17922 instanceof class_1764) {
            return "\u043d\u0430\u0442\u044f\u043d\u0443\u043b";
        }
        if (class_17922 == class_1802.field_8574 || class_17922 == class_1802.field_8436 || class_17922 == class_1802.field_8150) {
            return "\u0432\u044b\u043f\u0438\u043b";
        }
        if (class_17922 == class_1802.field_8103) {
            return "\u0432\u044b\u043f\u0438\u043b";
        }
        if (class_17922 == class_1802.field_8463 || class_17922 == class_1802.field_8367) {
            return "\u0441\u044a\u0435\u043b";
        }
        if (class_17922 == class_1802.field_8233) {
            return "\u0441\u044a\u0435\u043b";
        }
        if (class_17922 == class_1802.field_8071) {
            return "\u0441\u044a\u0435\u043b";
        }
        if (fh2 != null && fh2.K != class_1802.field_8399) {
            return "\u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043b";
        }
        return null;
    }

    private static /* bridge */ /* synthetic */ String a(class_1309 class_13092) {
        String string = class_13092.method_5477().getString();
        fG fG2 = (fG)b.a();
        return fG2 != null ? fG2.a(string) : string;
    }

    private /* bridge */ /* synthetic */ void a(Function function, double d2, Map map) {
        class_746 class_7462 = this.a();
        this.y.clear();
        for (class_1297 class_12972 : this.a().method_18112()) {
            if (!(class_12972 instanceof class_1309)) continue;
            class_1309 class_13092 = (class_1309)class_12972;
            if (class_7462.method_5858(class_12972) > d2) continue;
            UUID uUID = class_13092.method_5667();
            this.y.add(uUID);
            class_1799 class_17992 = (class_1799)function.apply(class_13092);
            if (class_17992.method_7960()) continue;
            map.put(uUID, class_17992.method_7972());
        }
        map.keySet().retainAll(this.y);
    }

    private static /* bridge */ /* synthetic */ class_1799 a(class_1309 class_13092, Predicate predicate) {
        class_1799 class_17992 = class_13092.method_6047();
        if (predicate.test(class_17992)) {
            return class_17992;
        }
        class_1799 class_17993 = class_13092.method_6079();
        if (predicate.test(class_17993)) {
            return class_17993;
        }
        return class_1799.field_8037;
    }

    public static /* bridge */ /* synthetic */ fh a(class_1799 class_17992) {
        if (class_17992 == null || class_17992.method_7960()) {
            return null;
        }
        fh fh2 = null;
        for (fh fh3 : fh.values()) {
            if (is.b(fh3)) {
                fh fh4 = fh3;
                class_1799 class_17993 = class_17992;
                if (!eM.a(fh4, class_17993)) continue;
                return fh3;
            }
            if (fh2 != null || fh3.K != class_17992.method_7909()) continue;
            fh2 = fh3;
        }
        return fh2;
    }

    public static /* bridge */ /* synthetic */ String a(String string) {
        if (string == null) {
            return "";
        }
        return string.replaceAll("(?i)\u00a7[0-9a-fk-or]", "").replaceAll("[\\[\\]]", "").replaceAll("\\s+", " ").trim();
    }

    private /* bridge */ /* synthetic */ void a(class_1309 class_13092) {
        class_1799 class_17992 = this.v.remove(class_13092.method_5667());
        if (class_17992 == null) {
            class_17992 = new class_1799((class_1935)class_1802.field_8288);
        }
        String string = is.a(class_13092) + " \u043f\u043e\u0442\u0435\u0440\u044f\u043b " + is.b(class_17992);
        String string2 = "";
        ct ct2 = ct.of(class_17992);
        ek.a().a(string2, ct2, string);
    }

    private static /* bridge */ /* synthetic */ class_1799 a() {
        class_1799 class_17992 = new class_1799((class_1935)class_1802.field_8399);
        class_17992.method_57379(class_9334.field_49649, (Object)class_9278.method_57439((class_1799)new class_1799((class_1935)class_1802.field_8107)));
        return class_17992;
    }

    private static /* bridge */ /* synthetic */ boolean a() {
        eM eM2 = (eM)c.b();
        return eM2 != null && eM2.A();
    }

    private /* bridge */ /* synthetic */ boolean a(class_1309 class_13092) {
        UUID uUID = dx.a();
        return uUID != null && uUID.equals(class_13092.method_5667());
    }

    private /* bridge */ /* synthetic */ boolean a(fh fh2, UUID uUID) {
        long l2 = System.currentTimeMillis();
        z z2 = this.B.get(uUID);
        if (z2 != null && z2.a == fh2 && l2 - z2.b < 1000L) {
            return false;
        }
        this.B.put(uUID, new z(fh2, l2));
        return true;
    }

    private /* bridge */ /* synthetic */ void a(class_2783 class_27832) {
        boolean bl2;
        if (this.z() || dx.a() == null) {
            return;
        }
        if (class_27832.method_11943() != this.a().method_5628()) {
            return;
        }
        class_1291 class_12912 = (class_1291)class_27832.method_11946().comp_349();
        int n2 = class_27832.method_11945();
        boolean bl3 = bl2 = class_12912 == class_1294.field_5920.comp_349() && n2 == 1 || class_12912 == class_1294.field_5909.comp_349() && n2 == 4 || class_12912 == class_1294.field_5901.comp_349() && n2 == 4;
        if (!bl2) {
            return;
        }
        this.F.add(class_12912);
        if (this.F.size() < 3) {
            return;
        }
        dx.a(ix.b);
        this.F.clear();
    }

    private /* bridge */ /* synthetic */ void a(class_2767 class_27672) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        String string = ((class_3414)class_27672.method_11894().comp_349()).comp_3319().method_12832();
        float f10 = class_27672.method_11892();
        float f11 = class_27672.method_11891();
        class_243 class_2432 = new class_243(class_27672.method_11890(), class_27672.method_11889(), class_27672.method_11893());
        long l2 = System.currentTimeMillis();
        if (string.equals("block.piston.extend") && is.a(f9 = 0.7f, f8 = f10, f7 = f11, f6 = 0.5f)) {
            long l3 = is.b() ? 30000L : 15000L;
            class_243 class_2433 = class_2432;
            long l4 = l2;
            String string2 = fh.f.L;
            String string3 = string2;
            if (!this.a(class_2433, l4, string3)) {
                this.C.add(new jQ(class_2432, l2, l3, f, string2));
            }
            return;
        }
        if (string.equals("block.anvil.place") && is.a(f5 = 0.7f, f4 = f10, f3 = f11, f2 = 1.1f)) {
            long l5 = this.a(class_2432) ? 20000L : 60000L;
            class_243 class_2434 = class_2432;
            long l6 = l2;
            String string4 = fh.g.L;
            String string5 = string4;
            if (!this.a(class_2434, l6, string5)) {
                this.C.add(new jQ(class_2432, l2, l5, i, string4));
            }
            return;
        }
        if (string.equals("entity.evoker_fangs.attack")) {
            this.G = class_2432;
            this.H = l2;
            return;
        }
        if (string.equals("ui.toast.challenge_complete") && this.G != null && l2 - this.H <= 500L && this.G.method_1025(class_2432) < 0.5) {
            class_243 class_2435 = this.G;
            long l7 = l2;
            String string6 = "\u0414\u0440\u0430\u043a\u043e\u043d\u043a\u0430";
            if (!this.a(class_2435, l7, string6)) {
                this.C.add(new jQ(this.G, l2, 30000L, g, "\u0414\u0440\u0430\u043a\u043e\u043d\u043a\u0430"));
            }
            this.G = null;
            this.H = 0L;
            return;
        }
        if (string.equals("entity.wither.break_block")) {
            this.I = class_2432;
            this.J = l2;
            return;
        }
        if (string.equals("entity.ender_dragon.hurt") && this.I != null && l2 - this.J <= 500L && this.I.method_1025(class_2432) < 0.5) {
            class_243 class_2436 = this.I;
            long l8 = l2;
            String string7 = "\u041d\u0435\u0438\u0437\u0431\u0435\u0436\u043a\u0430";
            if (!this.a(class_2436, l8, string7)) {
                this.C.add(new jQ(this.I, l2, 15000L, h, "\u041d\u0435\u0438\u0437\u0431\u0435\u0436\u043a\u0430"));
            }
            this.I = null;
            this.J = 0L;
        }
    }

    private /* bridge */ /* synthetic */ boolean a(class_243 class_2432, long l2, String string) {
        for (jQ jQ2 : this.C) {
            double d2;
            long l3;
            if (!jQ2.e.equals(string) || (l3 = jQ2.c - (l2 - jQ2.b)) > 3000L || (d2 = jQ2.a.method_1025(class_2432)) < 0.0625 || !(d2 <= 25.0)) continue;
            return true;
        }
        return false;
    }

    private /* bridge */ /* synthetic */ void a() {
        this.t.clear();
        this.u.clear();
        this.v.clear();
        this.w.clear();
        this.x.clear();
        this.B.clear();
        this.C.clear();
        this.D.clear();
        this.A.clear();
        this.F.clear();
        dx.a();
        this.G = null;
        this.H = 0L;
        this.I = null;
        this.J = 0L;
    }

    @Override
    public /* bridge */ /* synthetic */ void a(class_1657 class_16572, class_1937 class_19372, class_1268 class_12682, class_1297 class_12972, class_3966 class_39662) {
        class_1657 class_16573;
        if (!this.o.a()) {
            return;
        }
        if (class_12972 instanceof class_1657 && (class_16573 = (class_1657)class_12972) != class_16572 && class_16573.method_5805()) {
            dx.a(class_16573);
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void a(lx lx2) {
        class_2663 class_26632;
        if (lx2.a() != iG.b) {
            return;
        }
        class_2596 class_25962 = lx2.a();
        if (class_25962 instanceof class_2663 && (class_26632 = (class_2663)class_25962).method_11470() == 35) {
            this.a(class_26632);
            return;
        }
        class_25962 = lx2.a();
        if (class_25962 instanceof class_2767) {
            class_26632 = (class_2767)class_25962;
            if (this.p.a()) {
                this.a((class_2767)class_26632);
                return;
            }
        }
        if (lx2.a() instanceof class_2678) {
            this.F.clear();
            dx.a();
            return;
        }
        class_25962 = lx2.a();
        if (class_25962 instanceof class_2616) {
            class_26632 = (class_2616)class_25962;
            this.a((class_2616)class_26632);
            return;
        }
        if (!this.o.a()) {
            return;
        }
        class_25962 = lx2.a();
        if (class_25962 instanceof class_2783) {
            class_26632 = (class_2783)class_25962;
            this.a((class_2783)class_26632);
            return;
        }
        class_25962 = lx2.a();
        if (class_25962 instanceof class_2718) {
            class_26632 = (class_2718)class_25962;
            this.F.remove(class_26632.comp_2176().comp_349());
        }
    }

    private /* bridge */ /* synthetic */ void a(class_2663 class_26632) {
        if (this.z()) {
            return;
        }
        class_1297 class_12972 = class_26632.method_11469(this.a());
        if (!(class_12972 instanceof class_1309)) {
            return;
        }
        class_1309 class_13092 = (class_1309)class_12972;
        if (this.o.a() && this.a(class_13092)) {
            dx.a(ix.c);
        }
        if (this.n.a() && this.b(class_13092)) {
            this.a(class_13092);
        }
    }

    private /* bridge */ /* synthetic */ void a(class_2616 class_26162) {
        int n2 = class_26162.method_11267();
        if (n2 != 0 && n2 != 3) {
            return;
        }
        if (this.z()) {
            return;
        }
        class_1297 class_12972 = this.a().method_8469(class_26162.method_11269());
        if (!(class_12972 instanceof class_1657)) {
            return;
        }
        class_1657 class_16572 = (class_1657)class_12972;
        class_12972 = n2 == 0 ? class_16572.method_6047() : class_16572.method_6079();
        fh fh2 = is.a((class_1799)class_12972);
        if (fh2 == null || !is.a(fh2)) {
            return;
        }
        if (this.o.a() && this.a((class_1309)class_16572)) {
            is.a((class_1799)class_12972);
        }
        if (!this.m.a() || !this.b((class_1309)class_16572)) {
            return;
        }
        double d2 = this.j.d() * this.j.d();
        if (this.a().method_5858((class_1297)class_16572) > d2) {
            return;
        }
        fh fh3 = fh2;
        UUID uUID = class_16572.method_5667();
        if (!this.a(fh3, uUID)) {
            return;
        }
        String string = is.a((class_1309)class_16572) + " \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043b " + fh2.L;
        String string2 = "";
        ct ct2 = ct.of((class_1799)class_12972);
        ek.a().a(string2, ct2, string);
    }

    private static /* bridge */ /* synthetic */ boolean a(fh fh2) {
        return switch (fh2.U) {
            default -> throw new MatchException(null, null);
            case jj.a -> false;
            case jj.d -> true;
            case jj.b -> {
                if (!is.a()) {
                    yield true;
                }
                yield false;
            }
            case jj.c -> is.a();
        };
    }

    private static /* bridge */ /* synthetic */ String a(double d2) {
        return co.a(d2);
    }

    private /* bridge */ /* synthetic */ void a(double d2) {
        class_746 class_7462 = this.a();
        this.z.clear();
        for (Object object : this.a().method_18112()) {
            if (!(object instanceof class_1686)) continue;
            class_1686 class_16862 = (class_1686)object;
            int n2 = object.method_5628();
            iL iL2 = this.t.get(n2);
            if (iL2 == null) {
                if (class_7462.method_5858((class_1297)object) > d2) continue;
                this.t.put(n2, new iL(this.a(class_16862).method_7972(), object.method_19538()));
            } else {
                iL2.b = object.method_19538();
            }
            this.z.add(n2);
        }
        Iterator<Object> iterator = this.t.entrySet().iterator();
        while (iterator.hasNext()) {
            Object object;
            object = (Map.Entry)iterator.next();
            if (this.z.contains(object.getKey())) continue;
            iterator.remove();
            this.a((iL)object.getValue());
        }
    }

    private /* bridge */ /* synthetic */ class_1799 a(class_1686 class_16862) {
        class_1799 class_17992;
        class_1297 class_12972 = class_16862.method_24921();
        if (class_12972 != null && (class_17992 = this.w.get(class_12972.method_5667())) != null && !class_17992.method_7960()) {
            return class_17992;
        }
        return class_16862.method_7495();
    }

    private /* bridge */ /* synthetic */ void a(iL iL2) {
        class_243 class_2432 = iL2.b;
        class_238 class_2383 = new class_238(class_2432.field_1352 - 4.0, class_2432.field_1351 - 2.0, class_2432.field_1350 - 4.0, class_2432.field_1352 + 4.0, class_2432.field_1351 + 2.0, class_2432.field_1350 + 4.0);
        String string = is.a(iL2.a);
        for (class_1309 class_13093 : this.a().method_8390(class_1309.class, class_2383, class_13092 -> class_13092 instanceof class_1657)) {
            double d2;
            double d3 = class_13093.method_23317() - class_2432.field_1352;
            if (Math.sqrt(d3 * d3 + (d2 = class_13093.method_23321() - class_2432.field_1350) * d2) > 4.0 || !this.b(class_13093)) continue;
            String string2 = is.a(class_13093) + " \u043f\u043e\u043b\u0443\u0447\u0438\u043b " + string;
            String string3 = "";
            ct ct2 = ct.of(iL2.a);
            ek.a().a(string3, ct2, string2);
        }
    }

    private static /* bridge */ /* synthetic */ String a(class_1799 class_17992) {
        Object object;
        class_1844 class_18442 = (class_1844)class_17992.method_57824(class_9334.field_49651);
        if (class_18442 != null && class_18442.comp_2379().isPresent() && (object = fh.a((Integer)class_18442.comp_2379().get())) != null) {
            return ((fh)((Object)object)).L;
        }
        object = is.a(class_17992.method_7964().getString());
        fh fh2 = is.a(class_17992);
        if (fh2 != null) {
            return fh2.L;
        }
        return ((String)object).isEmpty() ? "\u0437\u0435\u043b\u044c\u0435" : object;
    }

    private static /* bridge */ /* synthetic */ void a(class_1799 class_17992) {
        class_1792 class_17922 = class_17992.method_7909();
        if (class_17922 == fh.a.K) {
            dx.a(ix.b);
        } else if (class_17922 == fh.g.K) {
            dx.a(ix.e);
        } else if (class_17922 == fh.f.K) {
            dx.a(ix.h);
        }
    }

    private /* bridge */ /* synthetic */ boolean a(class_243 class_2432) {
        if (this.z()) {
            return false;
        }
        class_1657 class_16572 = null;
        double d2 = 64.0;
        for (class_1657 class_16573 : this.a().method_18456()) {
            double d3;
            if (!is.a(class_16573) || !((d3 = class_16573.method_19538().method_1025(class_2432)) < d2)) continue;
            d2 = d3;
            class_16572 = class_16573;
        }
        if (class_16572 == null) {
            return false;
        }
        return Math.abs(class_16572.method_36455()) < 45.0f;
    }

    private static /* bridge */ /* synthetic */ boolean a(class_1657 class_16572) {
        return class_16572.method_6047().method_7909() == fh.g.K || class_16572.method_6079().method_7909() == fh.g.K;
    }

    private static /* bridge */ /* synthetic */ boolean a(float f2, float f3, float f4, float f5) {
        return Math.abs(f3 - f5) < 0.01f && Math.abs(f4 - f2) < 0.01f;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* bridge */ /* synthetic */ void a(class_4587 class_45872, class_243 class_2432, class_4184 class_41842) {
        long l2 = System.currentTimeMillis();
        this.C.removeIf(jQ2 -> l2 - jQ2.b > jQ2.c);
        this.D.keySet().retainAll(this.C);
        if (this.C.isEmpty()) {
            return;
        }
        float f2 = Math.min((float)(l2 - this.E) / 1000.0f, 0.1f);
        this.E = l2;
        bU.a(this.a());
        dP.a();
        try {
            for (jQ jQ3 : this.C) {
                long l3 = jQ3.c - (l2 - jQ3.b);
                if (l3 <= 0L) continue;
                String string = jQ3.e + " " + is.a((double)l3 / 1000.0);
                class_243 class_2433 = jQ3.a.method_1020(class_2432);
                double d2 = jQ3.a.method_1022(class_2432);
                float f3 = f2;
                double d3 = d2;
                String string2 = string;
                jQ jQ4 = jQ3;
                class_243 class_2434 = class_2433;
                class_4184 class_41843 = class_41842;
                class_4587 class_45873 = class_45872;
                this.a(class_41843, f3, jQ4, class_45873, class_2434, d3, string2);
            }
        }
        finally {
            dP.b();
            bU.b(this.a());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* bridge */ /* synthetic */ void a(class_4184 class_41842, float f2, jQ jQ2, class_4587 class_45872, class_243 class_2432, double d2, String string) {
        class_45872.method_22903();
        try {
            class_45872.method_22904(class_2432.field_1352, class_2432.field_1351 + 1.0, class_2432.field_1350);
            bU.a(class_45872);
            float f3 = ge.a(d2, this.q.a());
            float f4 = this.D.getOrDefault(jQ2, Float.valueOf(f3)).floatValue();
            float f5 = f4 + (f3 - f4) * Math.min(1.0f, f2 * 10.0f);
            this.D.put(jQ2, Float.valueOf(f5));
            class_45872.method_22905(-f5, -f5, -f5);
            float f6 = 14.0f;
            String string2 = string;
            hZ hZ2 = aK;
            float f7 = ao.a(f6, hZ2, string2);
            float f8 = 22.0f + f7;
            float f9 = f8 + 20.0f;
            float f10 = Math.max(14.0f, 16.0f) + 10.0f;
            float f11 = -f9 / 2.0f;
            float f12 = -f10 / 2.0f;
            Matrix4f matrix4f = class_45872.method_23760().method_23761();
            float f13 = 1.0f;
            int n2 = gD.background();
            float f14 = 8.0f;
            float f15 = f10;
            float f16 = f9;
            float f17 = f12;
            float f18 = f11;
            Matrix4f matrix4f2 = matrix4f;
            dP.a(f14, f18, n2, matrix4f2, f15, f16, f13, f17);
            float f19 = f11 + 10.0f;
            float f20 = -8.0f;
            float f21 = 1.0f;
            float f22 = 16.0f;
            float f23 = f20;
            float f24 = f19;
            class_1799 class_17992 = jQ2.d;
            Matrix4f matrix4f3 = matrix4f;
            if (!lz.a(f24, matrix4f3, f21, f22, f23, class_17992)) {
                float f25 = 1.0f;
                float f26 = 16.0f;
                float f27 = f20;
                float f28 = f19;
                class_1799 class_17993 = jQ2.d;
                Matrix4f matrix4f4 = matrix4f;
                ir.a(f26, f25, f28, class_17993, matrix4f4, f27);
            }
            float f29 = f19 + 16.0f + 6.0f;
            float f30 = -8.5f;
            int n3 = -1;
            float f31 = 14.0f;
            float f32 = f30;
            float f33 = f29;
            String string3 = string;
            hZ hZ3 = aK;
            Matrix4f matrix4f5 = matrix4f;
            ao.a(string3, f31, matrix4f5, n3, f33, hZ3, f32);
        }
        finally {
            class_45872.method_22909();
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.a();
    }
}

