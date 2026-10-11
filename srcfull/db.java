/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_243;
import net.minecraft.class_4184;

public class db
extends aT {
    private /* synthetic */ gz a;
    private /* synthetic */ dw b;
    private /* synthetic */ gz c;
    private /* synthetic */ gz d;
    private /* synthetic */ fr e;
    private /* synthetic */ fr f;
    private /* synthetic */ jh g;
    private /* synthetic */ jh h;
    private /* synthetic */ dw i;
    private /* synthetic */ dw j;
    private /* synthetic */ dw k;
    private /* synthetic */ dw l;
    private /* synthetic */ dw m;
    private /* synthetic */ gz n;
    private final /* synthetic */ fS o;
    private final /* synthetic */ Map<UUID, q> p;
    private final /* synthetic */ ArrayList<in> q;
    private final /* synthetic */ ArrayList<in> r;
    private static final /* synthetic */ Comparator<in> s;
    private static final /* synthetic */ hW<fG> t;

    public /* synthetic */ db() {
        super("\u041d\u0430\u043c\u0435\u0422\u0430\u0433\u0437", fV.d);
        gz gz2 = new gz("", "", 0.35, 0.01, 1.0, 0.05);
        gz2.setNameParts(new String[]{"\u0420", "a", "\u0437", "\u043c", "\u0435", "\u0440"});
        gz2.setDescriptionParts(new String[]{"M", "\u0430", "\u0441", "\u0448", "\u0442", "\u0430", "\u0431", " ", "\u0438", "\u043c", "e", "\u043d", "\u0438", " ", "\u0438", "\u0433", "\u0440", "o", "\u043a", "\u0430"});
        this.a = gz2;
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"\u0424", "o", "\u043d", " ", "\u043f", "\u043b", "a", "\u0448", "\u043a", "\u0438"});
        dw2.setDescriptionParts(new String[]{"\u0420", "\u0438", "c", "\u043e", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u043f", "o", "\u0434", "\u043b", "\u043e", "\u0436", "\u043a", "\u0443", " ", "\u0437", "a", " ", "\u043d", "e", "\u0439", "\u043c", "\u0442", "\u0435", "\u0433", "\u043e", "\u043c", ".", " ", "\u0412", "\u044b", "\u043a", "\u043b", "\u044e", "\u0447", "e", "\u043d", "\u043e", " ", "\u2014", " ", "\u0442", "o", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u0442", "e", "\u043a", "\u0441", "\u0442", " ", "\u0438", " ", "\u0438", "\u043a", "o", "\u043d", "\u043a", "\u0438", "."});
        this.b = dw2;
        gz gz3 = new gz("", "", 100.0, 0.0, 100.0, 5.0, "%", 0);
        gz3.setNameParts(new String[]{"\u041f", "\u0440", "o", "\u0437", "\u0440", "\u0430", "\u0447", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u043f", "\u043b", "a", "\u0448", "\u043a", "\u0438"});
        gz3.setDescriptionParts(new String[]{"\u041d", "e", "\u043f", "\u0440", "\u043e", "\u0437", "\u0440", "\u0430", "\u0447", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u0444", "o", "\u043d", "\u0430", " ", "\u0437", "a", " ", "\u043d", "\u0438", "\u043a", "o", "\u043c"});
        this.c = gz3;
        gz gz4 = new gz("", "", 64.0, 8.0, 256.0, 4.0, ec.join(new String[]{" ", "\u0431", "\u043b", "o", "\u043a", "\u043e", "\u0432"}), 0);
        gz4.setNameParts(new String[]{"\u0414", "\u0438", "c", "\u0442", "\u0430", "\u043d", "\u0446", "\u0438", "\u044f"});
        gz4.setDescriptionParts(new String[]{"M", "\u0430", "\u043a", "\u0441", "\u0438", "\u043c", "\u0430", "\u043b", "\u044c", "\u043d", "\u0430", "\u044f", " ", "\u0434", "\u0438", "c", "\u0442", "\u0430", "\u043d", "\u0446", "\u0438", "\u044f", " ", "\u0440", "e", "\u043d", "\u0434", "\u0435", "\u0440", "\u0430"});
        this.d = gz4;
        fr fr2 = new fr("", "", Arrays.asList(ec.join(new String[]{"\u0414", "p", "\u0443", "\u0437", "\u044c", "\u044f"}), ec.join(new String[]{"\u0412", "\u0440", "a", "\u0433", "\u0438"}), ec.join(new String[]{"\u0412", "\u0440", "a", "\u0433", "\u0438", " ", "\u0442", "o", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u0432", " ", "\u0431", "\u0440", "o", "\u043d", "\u0435"})), Arrays.asList(ec.join(new String[]{"\u0414", "p", "\u0443", "\u0437", "\u044c", "\u044f"}), ec.join(new String[]{"\u0412", "\u0440", "a", "\u0433", "\u0438"})));
        fr2.setNameParts(new String[]{"\u0426", "e", "\u043b", "\u0438"});
        fr2.setDescriptionParts(new String[]{"K", "\u043e", "\u0433", "\u043e", " ", "o", "\u0442", "\u043e", "\u0431", "\u0440", "\u0430", "\u0436", "\u0430", "\u0442", "\u044c"});
        this.e = fr2;
        fr fr3 = new fr("", "", Arrays.asList(ec.join(new String[]{"\u041f", "\u0440", "\u0435", "\u0444", "\u0438", "\u043a", "\u0441"}), ec.join(new String[]{"\u0411", "\u0440", "o", "\u043d", "\u044f"}), ec.join(new String[]{"\u041b", "\u0435", "\u0432", "\u0430", "\u044f", " ", "\u0440", "\u0443", "\u043a", "\u0430"}), ec.join(new String[]{"\u041f", "\u0440", "\u0430", "\u0432", "\u0430", "\u044f", " ", "\u0440", "\u0443", "\u043a", "\u0430"}), ec.join(new String[]{"\u0426", "\u0432", "\u0435", "\u0442", "\u043d", "\u043e", "\u0435", " ", "H", "P"})), Arrays.asList(ec.join(new String[]{"\u041f", "\u0440", "\u0435", "\u0444", "\u0438", "\u043a", "\u0441"}), ec.join(new String[]{"\u0411", "\u0440", "o", "\u043d", "\u044f"}), ec.join(new String[]{"\u041b", "\u0435", "\u0432", "\u0430", "\u044f", " ", "\u0440", "\u0443", "\u043a", "\u0430"}), ec.join(new String[]{"\u0426", "\u0432", "\u0435", "\u0442", "\u043d", "\u043e", "\u0435", " ", "H", "P"})));
        fr3.setNameParts(new String[]{"\u0427", "\u0442", "o", " ", "\u0440", "e", "\u043d", "\u0434", "\u0435", "\u0440", "\u0438", "\u0442", "\u044c"});
        fr3.setDescriptionParts(new String[]{"K", "\u0430", "\u043a", "\u0438", "\u0435", " ", "\u044d", "\u043b", "e", "\u043c", "\u0435", "\u043d", "\u0442", "\u044b", " ", "o", "\u0442", "\u043e", "\u0431", "\u0440", "\u0430", "\u0436", "\u0430", "\u0442", "\u044c", " ", "\u043d", "a", " ", "\u043d", "e", "\u0439", "\u043c", "\u0442", "\u0435", "\u0433", "\u0435"});
        this.f = fr3;
        jh jh2 = new jh("", "", Arrays.asList(ec.join(new String[]{"\u041e", "\u0447", "\u043a", "\u0438", " ", "\u0437", "\u0434", "\u043e", "\u0440", "\u043e", "\u0432", "\u044c", "\u044f"}), ec.join(new String[]{"\u0421", "\u0435", "\u0440", "\u0434", "\u0446", "\u0430"})), Collections.singletonList(ec.join(new String[]{"\u041e", "\u0447", "\u043a", "\u0438", " ", "\u0437", "\u0434", "\u043e", "\u0440", "\u043e", "\u0432", "\u044c", "\u044f"})), false);
        jh2.setNameParts(new String[]{"\u0420", "e", "\u0436", "\u0438", "\u043c", " ", "H", "P"});
        jh2.setDescriptionParts(new String[]{"C", "\u043f", "\u043e", "\u0441", "\u043e", "\u0431", " ", "o", "\u0442", "\u043e", "\u0431", "\u0440", "\u0430", "\u0436", "\u0435", "\u043d", "\u0438", "\u044f", " ", "\u0437", "\u0434", "o", "\u0440", "\u043e", "\u0432", "\u044c", "\u044f"});
        this.g = jh2;
        jh jh3 = new jh("", "", Arrays.asList(ec.join(new String[]{"\u0412", "\u044b", "\u043a", "\u043b"}), "MB", "FT"), List.of("FT"), false);
        jh3.setNameParts(new String[]{"O", "\u0431", "\u0445", "\u043e", "\u0434", " ", "H", "P"});
        jh3.setDescriptionParts(new String[]{"\u0420", "e", "\u0436", "\u0438", "\u043c", " ", "\u043f", "o", "\u043b", "\u0443", "\u0447", "\u0435", "\u043d", "\u0438", "\u044f", " ", "\u0440", "e", "\u0430", "\u043b", "\u044c", "\u043d", "\u043e", "\u0433", "\u043e", " ", "H", "P"});
        this.h = jh3;
        dw dw3 = new dw("", "", false);
        dw3.setNameParts(new String[]{"\u0412", "a", "\u043d", "\u0438", "\u043b", "\u044c", "\u043d", "\u044b", "\u0435", " ", "\u043d", "e", "\u0439", "\u043c", "\u0442", "\u0435", "\u0433", "\u0438"});
        dw3.setDescriptionParts(new String[]{"\u041d", "e", " ", "c", "\u043a", "\u0440", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "o", "\u0440", "\u0438", "\u0433", "\u0438", "\u043d", "\u0430", "\u043b", "\u044c", "\u043d", "\u044b", "\u0435", " ", "\u043d", "e", "\u0439", "\u043c", "\u0442", "\u0435", "\u0433", "\u0438", " ", "\u043f", "o", "\u0432", "\u0435", "\u0440", "\u0445", " ", "\u043a", "a", "\u0441", "\u0442", "\u043e", "\u043c", "\u043d", "\u044b", "\u0445"});
        this.i = dw3;
        dw dw4 = new dw("", "", false);
        dw4.setNameParts(new String[]{"C", "\u043a", "\u0440", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u043f", "\u0443", "c", "\u0442", "\u044b", "\u0435", " ", "c", "\u043b", "\u043e", "\u0442", "\u044b"});
        dw4.setDescriptionParts(new String[]{"\u041d", "e", " ", "\u0440", "e", "\u043d", "\u0434", "\u0435", "\u0440", "\u0438", "\u0442", "\u044c", " ", "\u043a", "\u0440", "e", "\u0441", "\u0442", "\u0438", "\u043a", "\u0438", " ", "\u0432", " ", "\u043f", "\u0443", "c", "\u0442", "\u044b", "\u0445", " ", "c", "\u043b", "\u043e", "\u0442", "\u0430", "\u0445", " ", "\u044d", "\u043a", "\u0438", "\u043f", "\u0438", "\u0440", "o", "\u0432", "\u043a", "\u0438"});
        this.j = dw4;
        dw dw5 = new dw("", "", true);
        dw5.setNameParts(new String[]{"K", "\u043e", "\u043b", "\u0438", "\u0447", "\u0435", "\u0441", "\u0442", "\u0432", "\u043e", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", "\u043e", "\u0432"});
        dw5.setDescriptionParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0447", "\u0438", "c", "\u043b", "\u043e", " ", "\u0440", "\u044f", "\u0434", "o", "\u043c", " ", "c", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", "\u043e", "\u043c", " ", "\u043a", "a", "\u043a", " ", "\u0432", " ", "\u0438", "\u043d", "\u0432", "e", "\u043d", "\u0442", "\u0430", "\u0440", "\u0435"});
        this.k = dw5;
        dw dw6 = new dw("", "", true);
        dw6.setNameParts(new String[]{"\u0418", "\u043a", "o", "\u043d", "\u043a", "\u0430", " ", "V", "o", "i", "c", "e", "c", "h", "a", "t"});
        dw6.setDescriptionParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0438", "\u043a", "o", "\u043d", "\u043a", "\u0443", " ", "\u0433", "o", "\u043b", "\u043e", "\u0441", "\u043e", "\u0432", "\u043e", "\u0433", "\u043e", " ", "\u0447", "a", "\u0442", "\u0430", " ", "(", "S", "i", "m", "p", "l", "e", " ", "V", "o", "i", "c", "e", " ", "C", "h", "a", "t", ")", " ", "\u043b", "e", "\u0432", "\u0435", "\u0435", " ", "\u043d", "\u0438", "\u043a", "a"});
        this.l = dw6;
        dw dw7 = new dw("", "", false);
        dw7.setNameParts(new String[]{"\u0423", "\u043f", "\u0440", "o", "\u0449", "\u0430", "\u0442", "\u044c", " ", "\u0432", "\u0434", "a", "\u043b", "\u0438"});
        dw7.setDescriptionParts(new String[]{"\u041d", "a", " ", "\u0434", "a", "\u043b", "\u044c", "\u043d", "\u0435", "\u0439", " ", "\u0434", "\u0438", "c", "\u0442", "\u0430", "\u043d", "\u0446", "\u0438", "\u0438", " ", "c", "\u0432", "\u043e", "\u0440", "\u0430", "\u0447", "\u0438", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u043d", "e", "\u0439", "\u043c", "\u0442", "\u0435", "\u0433", " ", "\u0434", "o", " ", "\u043d", "\u0438", "\u043a", "a", " ", "\u0438", " ", "x", "\u043f", " ", "\u2014", " ", "\u044d", "\u043a", "o", "\u043d", "\u043e", "\u043c", "\u0438", "\u0442", " ", "F", "P", "S", " ", "\u0432", " ", "\u0442", "o", "\u043b", "\u043f", "\u0435"});
        this.m = dw7;
        gz gz5 = new gz("", "", 30.0, 8.0, 128.0, 2.0, ec.join(new String[]{" ", "\u0431", "\u043b", "o", "\u043a", "\u043e", "\u0432"}), 0);
        gz5.setNameParts(new String[]{"\u0414", "\u0438", "c", "\u0442", "\u0430", "\u043d", "\u0446", "\u0438", "\u044f", " ", "\u0443", "\u043f", "\u0440", "o", "\u0449", "\u0435", "\u043d", "\u0438", "\u044f"});
        gz5.setDescriptionParts(new String[]{"\u0414", "a", "\u043b", "\u044c", "\u0448", "\u0435", " ", "\u044d", "\u0442", "o", "\u0439", " ", "\u0434", "\u0438", "c", "\u0442", "\u0430", "\u043d", "\u0446", "\u0438", "\u0438", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", "\u044b", " ", "\u0438", " ", "\u0431", "\u0440", "o", "\u043d", "\u044f", " ", "\u043d", "a", " ", "\u043d", "e", "\u0439", "\u043c", "\u0442", "\u0435", "\u0433", "\u0435", " ", "\u043f", "\u043b", "a", "\u0432", "\u043d", "\u043e", " ", "c", "\u043a", "\u0440", "\u044b", "\u0432", "\u0430", "\u044e", "\u0442", "\u0441", "\u044f"});
        this.n = gz5;
        this.o = new fS();
        this.p = new HashMap<UUID, q>();
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.n.a(this.m::a);
        this.c.a(this.b::a);
        this.a(this.h, this.g, this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.j, this.k, this.l, this.m, this.n);
    }

    static {
        s = (in2, in3) -> Double.compare(in3.l, in2.l);
        t = new hW(fG.class);
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.o.a();
        eI.b();
        this.p.clear();
        for (in in2 : this.q) {
            in2.a();
        }
        this.r.clear();
        ir.e();
    }

    private /* bridge */ /* synthetic */ in a(int n2) {
        if (n2 < this.q.size()) {
            return this.q.get(n2);
        }
        in in2 = new in();
        this.q.add(in2);
        return in2;
    }

    private /* bridge */ /* synthetic */ void a(H h2) {
        int n2;
        Object object;
        class_4184 class_41842 = h2.a();
        class_243 class_2432 = class_41842.method_19326();
        float f2 = h2.a().method_60637(true);
        class_1657 class_16572 = this.b();
        class_243 class_2433 = class_16572.method_19538();
        float f3 = (float)((double)((Integer)this.a().field_1690.method_41808().method_41753()).intValue());
        List list = this.f.a();
        boolean bl2 = list.contains("\u041f\u0440\u0435\u0444\u0438\u043a\u0441");
        boolean bl3 = list.contains("\u0411\u0440o\u043d\u044f");
        boolean bl4 = list.contains("\u041b\u0435\u0432\u0430\u044f \u0440\u0443\u043a\u0430");
        boolean bl5 = list.contains("\u041f\u0440\u0430\u0432\u0430\u044f \u0440\u0443\u043a\u0430");
        boolean bl6 = list.contains("\u0426\u0432\u0435\u0442\u043d\u043e\u0435 HP");
        fG fG2 = (fG)t.a();
        boolean bl7 = fG2 != null;
        eE eE2 = eI.a(this.h.a());
        boolean bl8 = "\u0421\u0435\u0440\u0434\u0446\u0430".equals(this.g.a());
        boolean bl9 = this.l.a() && jO.a();
        List list2 = this.e.a();
        boolean bl10 = list2.contains("\u0414p\u0443\u0437\u044c\u044f");
        boolean bl11 = list2.contains("\u0412\u0440a\u0433\u0438");
        boolean bl12 = list2.contains("\u0412\u0440a\u0433\u0438 \u0442o\u043b\u044c\u043a\u043e \u0432 \u0431\u0440o\u043d\u0435");
        double d2 = this.d.a();
        this.r.clear();
        int n3 = 0;
        Iterator iterator = this.a().method_18456().iterator();
        while (iterator.hasNext()) {
            fe fe2;
            class_1657 class_16573;
            double d3 = d2;
            float f4 = f3;
            class_243 class_2434 = class_2433;
            boolean bl13 = true;
            class_4184 class_41843 = class_41842;
            boolean bl14 = false;
            db db2 = this;
            object = (class_1657)iterator.next();
            Object object2 = object;
            if (!kw.a(d3, f4, class_2434, bl13, class_41843, bl14, db2, object2, class_16573 = class_16572) || ((n2 = (int)(this.e((class_1657)object) ? 1 : 0)) != 0 ? !bl10 : !bl11 || bl12 && !cy.a((class_1309)object))) continue;
            double d4 = class_16572.method_5739((class_1297)object);
            class_243 class_2435 = class_2432;
            float f5 = f2;
            Object object3 = object;
            class_243 class_2436 = gv.a(f5, (class_1297)object3, class_2435);
            UUID uUID = object.method_5667();
            String string = object.method_5477().getString();
            String string2 = bl7 ? fG2.a(string) : string;
            String string3 = "";
            if (bl2) {
                String string4 = object.method_5476().getString();
                q q2 = this.p.get(uUID);
                int n4 = string4.hashCode();
                if (q2 == null) {
                    q2 = new q();
                    q2.a = n4;
                    q2.b = be.a(string4, string);
                    this.p.put(uUID, q2);
                } else if (q2.a != n4) {
                    q2.a = n4;
                    q2.b = be.a(string4, string);
                }
                string3 = q2.b;
            }
            eE eE3 = eE2;
            Object object4 = object;
            float f6 = eI.a(eE3, (class_1657)object4);
            float f7 = eI.a((class_1657)object, eE2);
            String string5 = bl8 ? eI.a(f6, f7) : eI.a(f6);
            in in2 = this.a(n3++);
            boolean bl15 = false;
            if (bl3) {
                for (var41_45 = 0; var41_45 < 4; ++var41_45) {
                    class_1799 class_17992;
                    in2.h[var41_45] = class_17992 = object.method_31548().method_5438(36 + var41_45);
                    if (class_17992.method_7960()) continue;
                    bl15 = true;
                }
            } else {
                for (var41_45 = 0; var41_45 < 4; ++var41_45) {
                    in2.h[var41_45] = class_1799.field_8037;
                }
            }
            fe fe3 = fe2 = bl9 ? jO.a(uUID) : fe.a;
            int n5 = n2;
            double d5 = d4;
            class_1799 class_17993 = object.method_6047();
            class_1799 class_17994 = object.method_6079();
            boolean bl16 = bl15;
            float f8 = f7;
            float f9 = f6;
            String string6 = string5;
            String string7 = string2;
            String string8 = string3;
            class_243 class_2437 = class_2436;
            Object object5 = object;
            in2.a(class_2437, f8, n5 != 0, class_17993, (class_1657)object5, class_17994, string8, d5, f9, string7, fe3, string6, bl16);
            this.r.add(in2);
        }
        if (this.r.isEmpty()) {
            if (!this.p.isEmpty()) {
                this.p.clear();
            }
            return;
        }
        int n6 = this.r.size();
        if (this.p.size() > n6 * 2) {
            object = new HashSet(n6);
            for (n2 = 0; n2 < n6; ++n2) {
                object.add(this.r.get((int)n2).a.method_5667());
            }
            this.p.keySet().retainAll((Collection<?>)object);
        }
        this.r.sort(s);
        float f10 = this.n.a();
        boolean bl17 = this.m.a();
        boolean bl18 = this.k.a();
        boolean bl19 = this.j.a();
        boolean bl20 = this.b.a();
        float f11 = this.b.a() ? this.c.a() / 100.0f : 0.0f;
        boolean bl21 = bl6;
        boolean bl22 = bl5;
        boolean bl23 = bl4;
        boolean bl24 = bl3;
        float f12 = this.a.a();
        ArrayList<in> arrayList = this.r;
        H h3 = h2;
        this.o.a(bl24, bl22, f10, bl23, arrayList, h3, bl20, bl17, f11, bl19, bl18, f12, bl21);
        for (int i2 = 0; i2 < n6; ++i2) {
            this.r.get(i2).a();
        }
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return this.i.a();
    }

    public /* bridge */ /* synthetic */ boolean a(class_1657 class_16572) {
        if (this.z()) {
            return false;
        }
        if (class_16572 == null || !class_16572.method_5805()) {
            return false;
        }
        class_1657 class_16573 = this.b();
        if (class_16573 == null || class_16572 == class_16573) {
            return false;
        }
        if ((double)class_16572.method_5739((class_1297)class_16573) > this.d.a()) {
            return false;
        }
        boolean bl2 = this.e(class_16572);
        List list = this.e.a();
        if (bl2) {
            return list.contains("\u0414p\u0443\u0437\u044c\u044f");
        }
        if (!list.contains("\u0412\u0440a\u0433\u0438")) {
            return false;
        }
        return !list.contains("\u0412\u0440a\u0433\u0438 \u0442o\u043b\u044c\u043a\u043e \u0432 \u0431\u0440o\u043d\u0435") || cy.a((class_1309)class_16572);
    }

    @Override
    public /* bridge */ /* synthetic */ void g(H h2) {
        if (gd.k()) {
            return;
        }
        if (this.z()) {
            return;
        }
        this.a(h2);
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
    }
}

