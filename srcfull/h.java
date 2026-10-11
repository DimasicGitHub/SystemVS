/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1802;

public class h
extends aT {
    private /* synthetic */ dw a;
    private /* synthetic */ gz b;
    private /* synthetic */ gz c;
    private /* synthetic */ gz d;
    private /* synthetic */ dw e;
    private final /* synthetic */ Set<Integer> f;
    private final /* synthetic */ Set<Integer> g;
    private /* synthetic */ int h;
    private /* synthetic */ long i;

    public /* synthetic */ h() {
        super("\u0421\u0440\u0439\u0437\u0442\u0430\u043b\u0422\u0448\u0435\u0430\u043a\u0437", fV.e);
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"M", "\u0435", "\u043d", "\u044f", "\u0442", "\u044c", " ", "\u0440", "a", "\u0437", "\u043c", "\u0435", "\u0440"});
        dw2.setDescriptionParts(new String[]{"\u0418", "\u0437", "\u043c", "e", "\u043d", "\u044f", "\u0442", "\u044c", " ", "\u0440", "a", "\u0437", "\u043c", "\u0435", "\u0440", " ", "\u0438", " ", "\u043f", "o", "\u043b", "\u043e", "\u0436", "\u0435", "\u043d", "\u0438", "\u0435", " ", "\u043a", "\u0440", "\u0438", "c", "\u0442", "\u0430", "\u043b", "\u043b", "\u0430"});
        this.a = dw2;
        gz gz2 = new gz("", "", 2.0, 0.1, 5.0, 0.05);
        gz2.setNameParts(new String[]{"\u0420", "a", "\u0437", "\u043c", "\u0435", "\u0440"});
        gz2.setDescriptionParts(new String[]{"\u0420", "a", "\u0437", "\u043c", "\u0435", "\u0440", " ", "\u043a", "\u0440", "\u0438", "c", "\u0442", "\u0430", "\u043b", "\u043b", "\u0430"});
        this.b = gz2;
        gz gz3 = new gz("", "", 0.0, -3.0, 3.0, 0.05);
        gz3.setNameParts(new String[]{"C", "\u0434", "\u0432", "\u0438", "\u0433", " ", "X"});
        gz3.setDescriptionParts(new String[]{"C", "\u0434", "\u0432", "\u0438", "\u0433", " ", "\u043a", "\u0440", "\u0438", "c", "\u0442", "\u0430", "\u043b", "\u043b", "\u0430", " ", "\u043f", "o", " ", "o", "\u0441", "\u0438", " ", "X"});
        this.c = gz3;
        gz gz4 = new gz("", "", 0.0, -3.0, 3.0, 0.05);
        gz4.setNameParts(new String[]{"C", "\u0434", "\u0432", "\u0438", "\u0433", " ", "Y"});
        gz4.setDescriptionParts(new String[]{"C", "\u0434", "\u0432", "\u0438", "\u0433", " ", "\u043a", "\u0440", "\u0438", "c", "\u0442", "\u0430", "\u043b", "\u043b", "\u0430", " ", "\u043f", "o", " ", "o", "\u0441", "\u0438", " ", "Y"});
        this.d = gz4;
        dw dw3 = new dw("", "", false);
        dw3.setNameParts(new String[]{"T", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "c", "\u0432", "\u043e", "\u0439"});
        dw3.setDescriptionParts(new String[]{"\u041f", "\u0440", "\u0438", "\u043c", "e", "\u043d", "\u044f", "\u0442", "\u044c", " ", "\u0442", "o", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u043d", "a", " ", "\u043a", "\u0440", "\u0438", "c", "\u0442", "\u0430", "\u043b", "\u043b", "\u044b", ",", " ", "\u043f", "o", "\u0441", "\u0442", "\u0430", "\u0432", "\u043b", "\u0435", "\u043d", "\u043d", "\u044b", "\u0435", " ", "\u0432", "a", "\u043c", "\u0438"});
        this.e = dw3;
        this.f = ConcurrentHashMap.newKeySet();
        this.g = ConcurrentHashMap.newKeySet();
        this.h = -1;
        this.i = -1L;
        this.a(this.a, this.b, this.c, this.d, this.e);
        this.b.a(this.a::a);
        this.c.a(this.a::a);
        this.d.a(this.a::a);
    }

    public /* bridge */ /* synthetic */ gz b() {
        return this.c;
    }

    @Override
    public /* bridge */ /* synthetic */ void s() {
        if (!this.e.a() || this.z()) {
            return;
        }
        int n3 = 0;
        for (class_1268 class_12682 : class_1268.values()) {
            if (!this.a().method_5998(class_12682).method_31574(class_1802.field_8301)) continue;
            n3 += this.a().method_5998(class_12682).method_7947();
        }
        if (this.h > 0 && n3 < this.h) {
            this.i = this.a().method_8510();
        }
        this.h = n3;
        this.f.removeIf(n2 -> this.a().method_8469(n2.intValue()) == null);
        this.g.removeIf(n2 -> this.a().method_8469(n2.intValue()) == null);
    }

    public /* bridge */ /* synthetic */ gz c() {
        return this.d;
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.f.clear();
        this.g.clear();
        this.h = -1;
        this.i = -1L;
    }

    public /* bridge */ /* synthetic */ dw a() {
        return this.a;
    }

    public /* bridge */ /* synthetic */ gz a() {
        return this.b;
    }

    public /* bridge */ /* synthetic */ boolean a(class_1297 class_12972) {
        if (!this.e.a()) {
            return true;
        }
        int n2 = class_12972.method_5628();
        if (this.g.add(n2) && this.a() != null && this.a().method_8510() - this.i <= 1L) {
            this.f.add(n2);
        }
        return this.f.contains(n2);
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
    }
}

