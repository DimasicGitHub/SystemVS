/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_3966;

public class dd
extends aT {
    private /* synthetic */ dw a;
    private /* synthetic */ dw b;
    private /* synthetic */ dw c;
    private /* synthetic */ dw d;
    private /* synthetic */ dw e;
    private /* synthetic */ dw f;
    private /* synthetic */ dw g;
    private /* synthetic */ dw h;
    private /* synthetic */ dw i;
    private /* synthetic */ dw j;
    private /* synthetic */ dw k;
    private final /* synthetic */ dw l;
    private /* synthetic */ dw m;
    private /* synthetic */ eP n;
    private /* synthetic */ jh o;

    public /* synthetic */ dd() {
        super("\u0425\u0443\u0434", fV.f);
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"\u0412", "a", "\u0442", "\u0435", "\u0440", "\u043c", "\u0430", "\u0440", "\u043a", "\u0430"});
        dw2.setDescriptionParts(new String[]{"\u0420", "e", "\u043d", "\u0434", "\u0435", "\u0440", "\u0438", "\u0442", "\u044c", " ", "\u0432", "a", "\u0442", "\u0435", "\u0440", "\u043c", "\u0430", "\u0440", "\u043a", "\u0443", "?"});
        this.a = dw2;
        dw dw3 = new dw("", "", true);
        dw3.setNameParts(new String[]{"K", "\u0435", "\u0439", "\u0431", "\u0438", "\u043d", "\u0434", "\u044b"});
        dw3.setDescriptionParts(new String[]{"\u0420", "e", "\u043d", "\u0434", "\u0435", "\u0440", "\u0438", "\u0442", "\u044c", " ", "\u043a", "e", "\u0439", "\u0431", "\u0438", "\u043d", "\u0434", "\u044b", "?"});
        this.b = dw3;
        dw dw4 = new dw("", "", true);
        dw4.setNameParts(new String[]{"C", "\u043f", "\u0438", "\u0441", "\u043e", "\u043a", " ", "c", "\u0442", "\u0430", "\u0444", "\u0430"});
        dw4.setDescriptionParts(new String[]{"\u0420", "e", "\u043d", "\u0434", "\u0435", "\u0440", "\u0438", "\u0442", "\u044c", " ", "c", "\u043f", "\u0438", "\u0441", "\u043e", "\u043a", " ", "\u0432", "\u043a", "\u043b", "\u044e", "\u0447", "e", "\u043d", "\u043d", "\u044b", "\u0445", " ", "\u043c", "o", "\u0434", "\u0443", "\u043b", "\u0435", "\u0439", "?"});
        this.c = dw4;
        dw dw5 = new dw("", "", true);
        dw5.setNameParts(new String[]{"\u042d", "\u0444", "\u0444", "e", "\u043a", "\u0442", "\u044b", " ", "\u0437", "e", "\u043b", "\u0438", "\u0439"});
        dw5.setDescriptionParts(new String[]{"\u0420", "e", "\u043d", "\u0434", "\u0435", "\u0440", "\u0438", "\u0442", "\u044c", " ", "c", "\u043f", "\u0438", "\u0441", "\u043e", "\u043a", " ", "a", "\u043a", "\u0442", "\u0438", "\u0432", "\u043d", "\u044b", "\u0445", " ", "\u0437", "e", "\u043b", "\u0438", "\u0439", "?"});
        this.d = dw5;
        dw dw6 = new dw("", "", true);
        dw6.setNameParts(new String[]{"\u0411", "\u0440", "o", "\u043d", "\u044f"});
        dw6.setDescriptionParts(new String[]{"\u0420", "e", "\u043d", "\u0434", "\u0435", "\u0440", "\u0438", "\u0442", "\u044c", " ", "c", "\u043f", "\u0438", "\u0441", "\u043e", "\u043a", " ", "\u0431", "\u0440", "o", "\u043d", "\u0438", "?"});
        this.e = dw6;
        dw dw7 = new dw("", "", true);
        dw7.setNameParts(new String[]{"T", "\u0430", "\u0440", "\u0433", "\u0435", "\u0442", "\u0425", "\u0443", "\u0434"});
        dw7.setDescriptionParts(new String[]{"\u0420", "e", "\u043d", "\u0434", "\u0435", "\u0440", "\u0438", "\u0442", "\u044c", " ", "\u0442", "a", "\u0440", "\u0433", "\u0435", "\u0442", "\u0445", "\u0443", "\u0434", "?"});
        this.f = dw7;
        dw dw8 = new dw("", "", true);
        dw8.setNameParts(new String[]{"K", "\u0443", "\u043b", "\u0434", "\u0430", "\u0443", "\u043d", "\u044b"});
        dw8.setDescriptionParts(new String[]{"\u0420", "e", "\u043d", "\u0434", "\u0435", "\u0440", "\u0438", "\u0442", "\u044c", " ", "\u043a", "\u0443", "\u043b", "\u0434", "a", "\u0443", "\u043d", "\u044b", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", "\u043e", "\u0432", "?"});
        this.g = dw8;
        dw dw9 = new dw("", "", true);
        dw9.setNameParts(new String[]{"K", "\u0443", "\u043b", "\u0434", "\u0430", "\u0443", "\u043d", "\u044b", " ", "\u0446", "e", "\u043b", "\u0438"});
        dw9.setDescriptionParts(new String[]{"\u0420", "e", "\u043d", "\u0434", "\u0435", "\u0440", "\u0438", "\u0442", "\u044c", " ", "o", "\u0442", "\u043a", "\u0430", "\u0442", "\u044b", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", "\u043e", "\u0432", " ", "y", " ", "\u043f", "o", "\u0441", "\u043b", "\u0435", "\u0434", "\u043d", "\u0435", "\u0439", " ", "\u0446", "e", "\u043b", "\u0438", "?"});
        this.h = dw9;
        dw dw10 = new dw("", "", true);
        dw10.setNameParts(new String[]{"C", "\u0432", "\u0430", "\u043f", " ", "\u0431", "\u0438", "\u043d", "\u0434", "\u044b"});
        dw10.setDescriptionParts(new String[]{"\u0420", "e", "\u043d", "\u0434", "\u0435", "\u0440", "\u0438", "\u0442", "\u044c", " ", "\u0431", "\u0438", "\u043d", "\u0434", "\u044b", " ", "c", "\u0432", "\u0430", "\u043f", "\u0430", "?"});
        this.i = dw10;
        dw dw11 = new dw("", "", true);
        dw11.setNameParts(new String[]{"\u0423", "\u0432", "e", "\u0434", "\u043e", "\u043c", "\u043b", "\u0435", "\u043d", "\u0438", "\u044f"});
        dw11.setDescriptionParts(new String[]{"\u0420", "e", "\u043d", "\u0434", "\u0435", "\u0440", "\u0438", "\u0442", "\u044c", " ", "\u0443", "\u0432", "e", "\u0434", "\u043e", "\u043c", "\u043b", "\u0435", "\u043d", "\u0438", "\u044f", " ", "o", " ", "\u043c", "o", "\u0434", "\u0443", "\u043b", "\u044f", "\u0445", " ", "\u0438", " ", "c", "\u043e", "\u0431", "\u044b", "\u0442", "\u0438", "\u044f", "\u0445", "?"});
        this.j = dw11;
        dw dw12 = new dw("", "", true);
        dw12.setNameParts(new String[]{"K", "\u043e", "\u043e", "\u0440", "\u0434", "\u0438", "\u043d", "\u0430", "\u0442", "\u044b"});
        dw12.setDescriptionParts(new String[]{"\u0420", "e", "\u043d", "\u0434", "\u0435", "\u0440", "\u0438", "\u0442", "\u044c", " ", "\u0442", "e", "\u043a", "\u0443", "\u0449", "\u0438", "\u0435", " ", "\u043a", "o", "\u043e", "\u0440", "\u0434", "\u0438", "\u043d", "\u0430", "\u0442", "\u044b", " ", "\u0438", "\u0433", "\u0440", "o", "\u043a", "\u0430", "?"});
        this.k = dw12;
        dw dw13 = new dw("", "", true);
        dw13.setNameParts(new String[]{"\u041d", "a", "\u0441", "\u044b", "\u0449", "\u0435", "\u043d", "\u0438", "\u0435"});
        dw13.setDescriptionParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u043d", "a", "\u0441", "\u044b", "\u0449", "\u0435", "\u043d", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u0433", "o", "\u043b", "\u043e", "\u0434", "\u0430"});
        this.l = dw13;
        dw dw14 = new dw("", "", false);
        dw14.setNameParts(new String[]{"\u0418", "\u043d", "\u0432", "e", "\u043d", "\u0442", "\u0430", "\u0440", "\u044c"});
        dw14.setDescriptionParts(new String[]{"\u0420", "e", "\u043d", "\u0434", "\u0435", "\u0440", "\u0438", "\u0442", "\u044c", " ", "c", "\u043e", "\u0434", "\u0435", "\u0440", "\u0436", "\u0438", "\u043c", "\u043e", "\u0435", " ", "\u0438", "\u043d", "\u0432", "e", "\u043d", "\u0442", "\u0430", "\u0440", "\u044f", " ", "\u043d", "a", " ", "\u044d", "\u043a", "\u0440", "a", "\u043d", "\u0435", "?"});
        this.m = dw14;
        LinkedHashMap<String, dw> linkedHashMap = new LinkedHashMap<String, dw>();
        linkedHashMap.put(this.a.j(), this.a);
        linkedHashMap.put(this.b.j(), this.b);
        linkedHashMap.put(this.c.j(), this.c);
        linkedHashMap.put(this.d.j(), this.d);
        linkedHashMap.put(this.e.j(), this.e);
        linkedHashMap.put(this.f.j(), this.f);
        linkedHashMap.put(this.g.j(), this.g);
        linkedHashMap.put(this.h.j(), this.h);
        linkedHashMap.put(this.i.j(), this.i);
        linkedHashMap.put(this.j.j(), this.j);
        linkedHashMap.put(this.k.j(), this.k);
        linkedHashMap.put(this.l.j(), this.l);
        linkedHashMap.put(this.m.j(), this.m);
        ArrayList arrayList = new ArrayList(linkedHashMap.keySet());
        ArrayList<String> arrayList2 = new ArrayList<String>();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!((dw)entry.getValue()).a()) continue;
            arrayList2.add((String)entry.getKey());
        }
        jh jh2 = new jh("", "", arrayList, arrayList2, true);
        jh2.setNameParts(new String[]{"\u042d", "\u043b", "e", "\u043c", "\u0435", "\u043d", "\u0442", "\u044b"});
        jh2.setDescriptionParts(new String[]{"\u0427", "\u0442", "o", " ", "\u043f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0432", " ", "H", "U", "D", "."});
        this.o = jh2;
        Supplier<Boolean> supplier = () -> false;
        for (dw dw15 : linkedHashMap.values()) {
            dw15.a(supplier);
        }
        this.o.b(() -> {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                boolean bl2 = this.o.b((String)entry.getKey());
                if (((dw)entry.getValue()).a() == bl2) continue;
                ((dw)entry.getValue()).a(bl2);
            }
        });
        eP eP2 = new eP("", "");
        eP2.setNameParts(new String[]{"C", "\u0431", "\u0440", "\u043e", "\u0441", "\u0438", "\u0442", "\u044c", " ", "\u043f", "o", "\u0437", "\u0438", "\u0446", "\u0438", "\u0438", " ", "H", "U", "D"});
        eP2.setDescriptionParts(new String[]{"C", "\u0431", "\u0440", "\u043e", "\u0441", "\u0438", "\u0442", "\u044c", " ", "\u0432", "c", "\u0435", " ", "\u043f", "o", "\u0437", "\u0438", "\u0446", "\u0438", "\u0438", " ", "H", "U", "D", " ", "\u044d", "\u043b", "e", "\u043c", "\u0435", "\u043d", "\u0442", "\u043e", "\u0432", " ", "\u043d", "a", " ", "\u0434", "e", "\u0444", "\u043e", "\u043b", "\u0442", "\u043d", "\u044b", "\u0435"});
        this.n = eP2;
        this.n.a(() -> {
            try {
                af af2 = af.a();
                if (af2 != null && af2.a() != null) {
                    af2.a().a();
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        });
        this.a(this.o, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }

    public /* bridge */ /* synthetic */ dw e() {
        return this.e;
    }

    public /* bridge */ /* synthetic */ dw i() {
        return this.i;
    }

    public /* bridge */ /* synthetic */ dw b() {
        return this.b;
    }

    public /* bridge */ /* synthetic */ dw c() {
        return this.c;
    }

    public /* bridge */ /* synthetic */ dw h() {
        return this.h;
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
    }

    public /* bridge */ /* synthetic */ dw f() {
        return this.f;
    }

    public /* bridge */ /* synthetic */ dw l() {
        return this.l;
    }

    @Override
    protected /* bridge */ /* synthetic */ boolean d() {
        return false;
    }

    public /* bridge */ /* synthetic */ dw d() {
        return this.d;
    }

    public /* bridge */ /* synthetic */ dw a() {
        return this.a;
    }

    @Override
    public /* bridge */ /* synthetic */ void a(class_1657 class_16572, class_1937 class_19372, class_1268 class_12682, class_1297 class_12972, class_3966 class_39662) {
        class_1657 class_16573;
        if (class_12972 instanceof class_1657 && (class_16573 = (class_1657)class_12972) != class_16572 && class_16573.method_5805()) {
            kk.a(class_16573);
        }
    }

    public /* bridge */ /* synthetic */ dw m() {
        return this.m;
    }

    public /* bridge */ /* synthetic */ dw k() {
        return this.k;
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
    }

    public /* bridge */ /* synthetic */ dw g() {
        return this.g;
    }

    public /* bridge */ /* synthetic */ dw j() {
        return this.j;
    }
}

