/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bl {
    public static final String a = "__global__";
    private static bl b;
    private final gz c;
    private final gz d;
    private final dw e;
    private final dw f;
    private final dw g;
    private final dw h;
    private final dw i;
    private final eP j;
    private fr k;
    private final List<fa> l;
    private boolean m;

    private bl() {
        gz gz2 = new gz("", "", 100.0, 50.0, 200.0, 5.0, "%", 0);
        gz2.setNameParts(new String[]{"\u0420", "a", "\u0437", "\u043c", "\u0435", "\u0440", " ", "\u043c", "o", "\u0434", "\u0443", "\u043b", "\u044f"});
        gz2.setDescriptionParts(new String[]{"\u0413", "\u043b", "o", "\u0431", "\u0430", "\u043b", "\u044c", "\u043d", "\u044b", "\u0439", " ", "\u0440", "a", "\u0437", "\u043c", "\u0435", "\u0440", " ", "\u0434", "\u043b", "\u044f", " ", "\u0432", "c", "\u0435", "\u0445", " ", "\u043c", "o", "\u0434", "\u0443", "\u043b", "\u0435", "\u0439", "."});
        this.c = gz2;
        gz gz3 = new gz("", "", 100.0, 0.0, 100.0, 5.0, "%", 0);
        gz3.setNameParts(new String[]{"\u041d", "e", "\u043f", "\u0440", "\u043e", "\u0437", "\u0440", "\u0430", "\u0447", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u043c", "o", "\u0434", "\u0443", "\u043b", "\u044f"});
        gz3.setDescriptionParts(new String[]{"\u0413", "\u043b", "o", "\u0431", "\u0430", "\u043b", "\u044c", "\u043d", "\u0430", "\u044f", " ", "\u043d", "e", "\u043f", "\u0440", "\u043e", "\u0437", "\u0440", "\u0430", "\u0447", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u0434", "\u043b", "\u044f", " ", "\u0432", "c", "\u0435", "\u0445", " ", "\u043c", "o", "\u0434", "\u0443", "\u043b", "\u0435", "\u0439", "."});
        this.d = gz3;
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0445", "e", "\u0434", "\u0435", "\u0440"});
        dw2.setDescriptionParts(new String[]{"O", "\u0442", "\u043e", "\u0431", "\u0440", "\u0430", "\u0436", "\u0430", "\u0442", "\u044c", " ", "\u0445", "e", "\u0434", "\u0435", "\u0440", " ", "(", "\u043f", "\u043b", "a", "\u0448", "\u043a", "\u0443", " ", "c", " ", "\u043d", "a", "\u0437", "\u0432", "\u0430", "\u043d", "\u0438", "\u0435", "\u043c", ")", " ", "y", " ", "\u043a", "a", "\u0436", "\u0434", "\u043e", "\u0433", "\u043e", " ", "\u043c", "o", "\u0434", "\u0443", "\u043b", "\u044f", "."});
        this.e = dw2;
        dw dw3 = new dw("", "", true);
        dw3.setNameParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0438", "\u043a", "o", "\u043d", "\u043a", "\u0443"});
        dw3.setDescriptionParts(new String[]{"O", "\u0442", "\u043e", "\u0431", "\u0440", "\u0430", "\u0436", "\u0430", "\u0442", "\u044c", " ", "\u0438", "\u043a", "o", "\u043d", "\u043a", "\u0443", " ", "\u0432", " ", "\u0445", "e", "\u0434", "\u0435", "\u0440", "\u0435", " ", "\u043a", "a", "\u0436", "\u0434", "\u043e", "\u0433", "\u043e", " ", "\u043c", "o", "\u0434", "\u0443", "\u043b", "\u044f", "."});
        this.f = dw3;
        dw dw4 = new dw("", "", true);
        dw4.setNameParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0444", "o", "\u043d", " ", "y", " ", "\u0438", "\u043a", "o", "\u043d", "\u043a", "\u0438"});
        dw4.setDescriptionParts(new String[]{"O", "\u0442", "\u043e", "\u0431", "\u0440", "\u0430", "\u0436", "\u0430", "\u0442", "\u044c", " ", "\u043f", "o", "\u0434", "\u043b", "\u043e", "\u0436", "\u043a", "\u0443", " ", "\u043f", "o", "\u0434", " ", "\u0438", "\u043a", "o", "\u043d", "\u043a", "\u043e", "\u0439", " ", "\u0445", "e", "\u0434", "\u0435", "\u0440", "\u0430", "."});
        this.g = dw4;
        dw dw5 = new dw("", "", false);
        dw5.setNameParts(new String[]{"C", "\u0442", "\u0430", "\u043a", "\u043d", "\u0443", "\u0442", "\u044c"});
        dw5.setDescriptionParts(new String[]{"C", "\u043b", "\u0438", "\u0442", "\u044c", " ", "\u0445", "e", "\u0434", "\u0435", "\u0440", " ", "c", " ", "\u043a", "o", "\u043d", "\u0442", "\u0435", "\u043d", "\u0442", "-", "\u043f", "\u043b", "a", "\u0448", "\u043a", "\u043e", "\u0439", " ", "\u0432", " ", "e", "\u0434", "\u0438", "\u043d", "\u0443", "\u044e", " ", "\u0444", "o", "\u0440", "\u043c", "\u0443", " ", "c", " ", "\u043f", "\u043b", "a", "\u0432", "\u043d", "\u044b", "\u043c", "\u0438", " ", "\u043f", "e", "\u0440", "\u0435", "\u0445", "\u043e", "\u0434", "\u0430", "\u043c", "\u0438", "."});
        this.h = dw5;
        dw dw6 = new dw("", "", false);
        dw6.setNameParts(new String[]{"C", "\u0438", "\u043d", "\u0445", "\u0440", "\u043e", "\u043d", "\u0438", "\u0437", "\u0430", "\u0446", "\u0438", "\u044f"});
        dw6.setDescriptionParts(new String[]{"\u041f", "\u0440", "\u0438", "\u043c", "e", "\u043d", "\u044f", "\u0442", "\u044c", " ", "\u044d", "\u0442", "\u0438", " ", "\u043d", "a", "\u0441", "\u0442", "\u0440", "\u043e", "\u0439", "\u043a", "\u0438", " ", "\u043a", "o", " ", "\u0432", "c", "\u0435", "\u043c", " ", "\u043c", "o", "\u0434", "\u0443", "\u043b", "\u044f", "\u043c", "."});
        this.i = dw6;
        eP eP2 = new eP("", "");
        eP2.setNameParts(new String[]{"C", "\u0431", "\u0440", "\u043e", "\u0441", " ", "\u0432", "c", "\u0435", "\u0445", " ", "\u043c", "o", "\u0434", "\u0443", "\u043b", "\u0435", "\u0439"});
        eP2.setDescriptionParts(new String[]{"C", "\u0431", "\u0440", "\u043e", "\u0441", "\u0438", "\u0442", "\u044c", " ", "\u043d", "a", "\u0441", "\u0442", "\u0440", "\u043e", "\u0439", "\u043a", "\u0438", " ", "\u0432", "c", "\u0435", "\u0445", " ", "H", "U", "D", "-", "\u043c", "o", "\u0434", "\u0443", "\u043b", "\u0435", "\u0439", " ", "\u0434", "o", " ", "\u0437", "\u043d", "a", "\u0447", "\u0435", "\u043d", "\u0438", "\u0439", " ", "\u043f", "o", " ", "\u0443", "\u043c", "o", "\u043b", "\u0447", "\u0430", "\u043d", "\u0438", "\u044e", "."});
        this.j = eP2;
        this.l = new ArrayList<fa>();
        this.f.a(this.e::a);
        this.g.a(() -> this.e.a() && this.f.a());
        this.h.a(this.e::a);
        for (fa fa2 : List.of(this.c, this.d, this.e, this.f, this.g, this.h, this.i)) {
            fa2.b(this::b);
            this.l.add(fa2);
        }
        this.j.a(this::a);
        this.l.add(this.j);
    }

    public dw e() {
        return this.i;
    }

    public dw b() {
        return this.f;
    }

    public boolean b(jD jD2) {
        return this.a() && !this.a(jD2);
    }

    public gz b() {
        return this.d;
    }

    private void b() {
        jE jE2 = bl.a();
        if (jE2 != null) {
            jE2.b(a);
        }
    }

    public dw c() {
        return this.g;
    }

    public dw d() {
        return this.h;
    }

    public gz a() {
        return this.c;
    }

    public dw a() {
        return this.e;
    }

    public fr a() {
        return this.k;
    }

    public boolean a(jD jD2) {
        if (this.k == null) {
            return false;
        }
        return this.k.a().contains(jD2.d());
    }

    public boolean a() {
        return this.i.a();
    }

    public List a() {
        return Collections.unmodifiableList(this.l);
    }

    public void a(List list) {
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        for (jD jD2 : list) {
            arrayList.add(jD2.d());
            arrayList2.add(jD2.e());
        }
        if (arrayList.isEmpty()) {
            arrayList.add("placeholder");
            arrayList2.add("placeholder");
        }
        if (!this.m) {
            fr fr2 = new fr("", "", arrayList, new ArrayList(), arrayList2, true);
            fr2.setNameParts(new String[]{"\u0418", "c", "\u043a", "\u043b", "\u044e", "\u0447", "\u0435", "\u043d", "\u0438", "\u044f"});
            fr2.setDescriptionParts(new String[]{"\u042d", "\u0442", "\u0438", " ", "\u043c", "o", "\u0434", "\u0443", "\u043b", "\u0438", " ", "\u0431", "y", "\u0434", "\u0443", "\u0442", " ", "\u0438", "\u0433", "\u043d", "o", "\u0440", "\u0438", "\u0440", "\u043e", "\u0432", "\u0430", "\u0442", "\u044c", " ", "c", "\u0438", "\u043d", "\u0445", "\u0440", "\u043e", "\u043d", "\u0438", "\u0437", "\u0430", "\u0446", "\u0438", "\u044e", " ", "\u0438", " ", "\u0438", "c", "\u043f", "\u043e", "\u043b", "\u044c", "\u0437", "\u043e", "\u0432", "\u0430", "\u0442", "\u044c", " ", "c", "\u0432", "\u043e", "\u0438", " ", "\u043d", "a", "\u0441", "\u0442", "\u0440", "\u043e", "\u0439", "\u043a", "\u0438", "."});
            this.k = fr2;
            this.k.b(this::b);
            int n2 = this.l.indexOf(this.j);
            if (n2 >= 0) {
                this.l.add(n2, this.k);
            } else {
                this.l.add(this.k);
            }
            this.m = true;
        } else {
            this.k.b(arrayList);
            this.k.c(arrayList2);
        }
    }

    private void a() {
        for (fa object : this.l) {
            if (object == this.j) continue;
            object.c();
        }
        fk fk2 = fk.a();
        if (fk2 != null) {
            for (jD jD2 : fk2.a()) {
                for (fa fa2 : jD2.d()) {
                    fa2.c();
                }
                jE jE2 = bl.a();
                if (jE2 == null) continue;
                jE2.b(jD2.d());
            }
        }
        this.b();
    }

    private static jE a() {
        af af2 = af.a();
        return af2 != null ? af2.a() : null;
    }

    public static bl a() {
        if (b == null) {
            b = new bl();
        }
        return b;
    }

    public void a(Map map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (fa fa2 : this.l) {
            Map map2;
            String string;
            JsonObject jsonObject = (JsonObject)map.get(fa2.e());
            if (jsonObject == null && (jsonObject = (JsonObject)kJ.a(string = fa2.j(), map2 = map)) != null) {
                kJ.a();
            }
            if (jsonObject == null) continue;
            try {
                fa2.a(jsonObject);
            }
            catch (Exception exception) {}
        }
    }

    public Map a() {
        LinkedHashMap<String, JsonObject> linkedHashMap = new LinkedHashMap<String, JsonObject>();
        for (fa fa2 : this.l) {
            try {
                JsonObject jsonObject = fa2.a();
                if (jsonObject == null) continue;
                linkedHashMap.put(fa2.e(), jsonObject);
            }
            catch (Exception exception) {}
        }
        return linkedHashMap;
    }
}

