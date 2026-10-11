/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_124;
import net.minecraft.class_1799;

public class lv
extends aT {
    private /* synthetic */ fx a;
    private /* synthetic */ dw b;
    private /* synthetic */ dw c;
    private /* synthetic */ kn d;
    private /* synthetic */ long e;

    public /* synthetic */ lv() {
        super("\u0424\u0430\u0437\u0442\u0417\u0435\u0430\u0440\u0441\u0445", fV.c);
        fx fx2 = new fx("", "", "ah search {name}", "ah search {name}");
        fx2.setNameParts(new String[]{"K", "\u043e", "\u043c", "\u0430", "\u043d", "\u0434", "\u0430"});
        fx2.setDescriptionParts(new String[]{"\u0428", "a", "\u0431", "\u043b", "\u043e", "\u043d", " ", "\u043a", "o", "\u043c", "\u0430", "\u043d", "\u0434", "\u044b", ",", " ", "{", "n", "a", "m", "e", "}", " ", "\u0437", "a", "\u043c", "\u0435", "\u043d", "\u044f", "\u0435", "\u0442", "\u0441", "\u044f", " ", "\u043d", "a", " ", "\u043d", "a", "\u0437", "\u0432", "\u0430", "\u043d", "\u0438", "\u0435", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", "\u0430"});
        this.a = fx2;
        dw dw2 = new dw("", "", false);
        dw2.setNameParts(new String[]{"\u0412", "\u0442", "o", "\u0440", "\u043e", "\u0439", " ", "p", "\u0443", "\u043a", "\u0438"});
        dw2.setDescriptionParts(new String[]{"\u0411", "\u0440", "a", "\u0442", "\u044c", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", " ", "\u0438", "\u0437", " ", "\u043b", "e", "\u0432", "\u043e", "\u0439", " ", "p", "\u0443", "\u043a", "\u0438", " ", "\u0432", "\u043c", "e", "\u0441", "\u0442", "\u043e", " ", "\u043f", "\u0440", "a", "\u0432", "\u043e", "\u0439"});
        this.b = dw2;
        dw dw3 = new dw("", "", true);
        dw3.setNameParts(new String[]{"\u0423", "\u0431", "\u0438", "\u0440", "a", "\u0442", "\u044c", " ", "c", "\u043a", "\u043e", "\u0431", "\u043a", "\u0438"});
        dw3.setDescriptionParts(new String[]{"\u0412", "\u044b", "\u0440", "e", "\u0437", "\u0430", "\u0442", "\u044c", " ", "\u043f", "\u0440", "e", "\u0444", "\u0438", "\u043a", "\u0441", "\u044b", " ", "\u0432", " ", "\u043a", "\u0432", "a", "\u0434", "\u0440", "\u0430", "\u0442", "\u043d", "\u044b", "\u0445", " ", "c", "\u043a", "\u043e", "\u0431", "\u043a", "\u0430", "\u0445", " ", "\u0432", "\u0440", "o", "\u0434", "\u0435", " ", "[", "R", "a", "r", "e", "]"});
        this.c = dw3;
        kn kn2 = new kn("", "", -1, () -> {
            class_1799 class_17992;
            if (!this.f()) {
                return;
            }
            if (this.z() || this.a() == null) {
                return;
            }
            long l2 = System.currentTimeMillis();
            if (l2 - this.e < 250L) {
                return;
            }
            this.e = l2;
            class_1799 class_17993 = class_17992 = this.b.a() ? this.b().method_6079() : this.b().method_6047();
            if (class_17992 == null || class_17992.method_7960()) {
                return;
            }
            String string = this.a(class_17992);
            if (string.isEmpty()) {
                return;
            }
            String string2 = this.a.b();
            if (string2 == null || string2.isEmpty()) {
                string2 = "ah search {name}";
            }
            Object object = string2.contains("{name}") ? string2.replace("{name}", string) : string2 + " " + string;
            if (((String)(object = ((String)object).trim())).startsWith("/")) {
                object = ((String)object).substring(1);
            }
            this.a().method_45730((String)object);
        });
        kn2.setNameParts(new String[]{"K", "\u043b", "\u0430", "\u0432", "\u0438", "\u0448", "\u0430", " ", "\u043f", "o", "\u0438", "\u0441", "\u043a", "\u0430"});
        kn2.setDescriptionParts(new String[]{"\u041f", "\u0440", "o", "\u0436", "\u0430", "\u0442", "\u044c", " ", "\u0447", "\u0442", "o", "\u0431", "\u044b", " ", "o", "\u0442", "\u043f", "\u0440", "\u0430", "\u0432", "\u0438", "\u0442", "\u044c", " ", "\u043a", "o", "\u043c", "\u0430", "\u043d", "\u0434", "\u0443", " ", "\u043f", "o", "\u0438", "\u0441", "\u043a", "\u0430", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", "\u0430", " ", "\u0432", " ", "\u0440", "\u0443", "\u043a", "e"});
        this.d = kn2;
        this.e = 0L;
        this.a(this.a, this.b, this.c, this.d);
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
    }

    private /* bridge */ /* synthetic */ String a(class_1799 class_17992) {
        String string = class_17992.method_7964().getString();
        String string2 = class_124.method_539((String)string);
        if (string2 == null) {
            string2 = string;
        }
        string2 = string2.trim();
        if (this.c.a()) {
            int n2;
            while (string2.startsWith("[") && (n2 = string2.indexOf(93)) >= 0) {
                string2 = string2.substring(n2 + 1).trim();
            }
        }
        return string2;
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
    }
}

