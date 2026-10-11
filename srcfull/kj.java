/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_1713;
import net.minecraft.class_2561;
import net.minecraft.class_266;
import net.minecraft.class_268;
import net.minecraft.class_269;
import net.minecraft.class_437;
import net.minecraft.class_465;
import net.minecraft.class_490;
import net.minecraft.class_8646;
import net.minecraft.class_9011;

public class kj
extends aT {
    private static final /* synthetic */ Pattern a;
    private /* synthetic */ gz b;
    private /* synthetic */ gz c;
    private /* synthetic */ gz d;
    private /* synthetic */ bu e;
    private /* synthetic */ bu f;
    private /* synthetic */ bu g;
    private /* synthetic */ boolean h;
    private /* synthetic */ int i;
    private /* synthetic */ int j;

    public /* synthetic */ kj() {
        super("\u0424\u0422\u0425\u043e\u0442\u043a\u0435\u044b\u0437", fV.c);
        gz gz2 = new gz("", "", 25.0, 1.0, 54.0, 1.0, "", 0);
        gz2.setNameParts(new String[]{"C", "\u043b", "\u043e", "\u0442", " ", "\u043b", "\u0438", "\u0432", "a"});
        gz2.setDescriptionParts(new String[]{"\u041d", "o", "\u043c", "\u0435", "\u0440", " ", "c", "\u043b", "\u043e", "\u0442", "\u0430", " ", "\u043c", "e", "\u043d", "\u044e", " ", "/", "d", "a", "r", "e", "n", "a", " ", "\u0434", "\u043b", "\u044f", " ", "\u043a", "\u043b", "\u0438", "\u043a", "a", " ", "(", "1", "-", "5", "4", ")"});
        this.b = gz2;
        gz gz3 = new gz("", "", 1.0, 0.0, 20.0, 1.0, ec.join(new String[]{" ", "\u0442", "\u0438", "\u043a", "o", "\u0432"}), 0);
        gz3.setNameParts(new String[]{"\u0417", "a", "\u0434", "\u0435", "\u0440", "\u0436", "\u043a", "\u0430", " ", "\u043a", "\u043b", "\u0438", "\u043a", "a"});
        gz3.setDescriptionParts(new String[]{"C", "\u043a", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u0442", "\u0438", "\u043a", "o", "\u0432", " ", "\u0436", "\u0434", "a", "\u0442", "\u044c", " ", "\u043f", "o", "\u0441", "\u043b", "\u0435", " ", "o", "\u0442", "\u043a", "\u0440", "\u044b", "\u0442", "\u0438", "\u044f", " ", "\u043c", "e", "\u043d", "\u044e", " ", "\u043f", "e", "\u0440", "\u0435", "\u0434", " ", "\u043a", "\u043b", "\u0438", "\u043a", "o", "\u043c"});
        this.c = gz3;
        gz gz4 = new gz("", "", 60.0, 10.0, 2000.0, 5.0, ec.join(new String[]{" ", "\u0442", "\u0438", "\u043a", "o", "\u0432"}), 0);
        gz4.setNameParts(new String[]{"T", "\u0430", "\u0439", "\u043c", "\u0430", "\u0443", "\u0442"});
        gz4.setDescriptionParts(new String[]{"C", "\u043a", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u0442", "\u0438", "\u043a", "o", "\u0432", " ", "\u0436", "\u0434", "a", "\u0442", "\u044c", " ", "o", "\u0442", "\u043a", "\u0440", "\u044b", "\u0442", "\u0438", "\u044f", " ", "\u043c", "e", "\u043d", "\u044e"});
        this.d = gz4;
        bu bu2 = new bu("", "", -1, () -> {
            if (!this.f()) {
                return;
            }
            if (this.z() || this.a() == null) {
                return;
            }
            if (this.h) {
                return;
            }
            this.a().method_45730("darena");
            this.h = true;
            this.i = 0;
            this.j = -1;
        });
        bu2.setNameParts(new String[]{"K", "\u043b", "\u0430", "\u0432", "\u0438", "\u0448", "\u0430", " ", "\u043b", "\u0438", "\u0432", "a", " ", "a", "\u0440", "\u0435", "\u043d", "\u044b"});
        bu2.setDescriptionParts(new String[]{"\u041f", "\u0440", "o", "\u0436", "\u0430", "\u0442", "\u044c", " ", "\u0447", "\u0442", "o", "\u0431", "\u044b", " ", "\u0432", "\u044b", "\u043f", "o", "\u043b", "\u043d", "\u0438", "\u0442", "\u044c", " ", "/", "d", "a", "r", "e", "n", "a", " ", "\u0438", " ", "\u043a", "\u043b", "\u0438", "\u043a", "\u043d", "y", "\u0442", "\u044c", " ", "\u043f", "o", " ", "c", "\u043b", "\u043e", "\u0442", "\u0443"});
        this.e = bu2;
        bu bu3 = new bu("", "", -1, () -> {
            if (!this.f()) {
                return;
            }
            if (this.z() || this.a() == null) {
                return;
            }
            long l2 = this.a();
            if (l2 <= 0L) {
                return;
            }
            this.a().method_45730("clan invest " + l2);
        });
        bu3.setNameParts(new String[]{"K", "\u043b", "\u0430", "\u0432", "\u0438", "\u0448", "\u0430", " ", "\u0438", "\u043d", "\u0432", "e", "\u0441", "\u0442", "\u0430"});
        bu3.setDescriptionParts(new String[]{"\u041f", "\u0440", "o", "\u0436", "\u0430", "\u0442", "\u044c", " ", "\u0447", "\u0442", "o", "\u0431", "\u044b", " ", "\u0438", "\u043d", "\u0432", "e", "\u0441", "\u0442", "\u0438", "\u0440", "\u043e", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0432", "e", "\u0441", "\u044c", " ", "\u0431", "a", "\u043b", "\u0430", "\u043d", "\u0441", " ", "\u0432", " ", "\u043a", "\u043b", "a", "\u043d"});
        this.f = bu3;
        bu bu4 = new bu("", "", -1, () -> {
            if (!this.f()) {
                return;
            }
            if (this.z() || this.a() == null) {
                return;
            }
            this.a().method_45730("clan storage");
        });
        bu4.setNameParts(new String[]{"K", "\u043b", "\u0430", "\u0432", "\u0438", "\u0448", "\u0430", " ", "c", "\u043a", "\u043b", "\u0430", "\u0434", "\u0430"});
        bu4.setDescriptionParts(new String[]{"\u041f", "\u0440", "o", "\u0436", "\u0430", "\u0442", "\u044c", " ", "\u0447", "\u0442", "o", "\u0431", "\u044b", " ", "o", "\u0442", "\u043a", "\u0440", "\u044b", "\u0442", "\u044c", " ", "/", "c", "l", "a", "n", " ", "s", "t", "o", "r", "a", "g", "e"});
        this.g = bu4;
        this.h = false;
        this.i = 0;
        this.j = -1;
        this.a(this.b, this.c, this.d, this.e, this.f, this.g);
    }

    static {
        a = Pattern.compile("\u041c\u043e\u043d\u0435\u0442:\\s*([\\d,.\\s]+)");
    }

    @Override
    public /* bridge */ /* synthetic */ void i() {
        if (!this.h) {
            return;
        }
        if (this.z() || this.a() == null) {
            this.d();
            return;
        }
        ++this.i;
        if ((double)this.i > this.d.d()) {
            this.d();
            return;
        }
        class_437 class_4372 = this.a();
        if (!(class_4372 instanceof class_465)) {
            return;
        }
        class_465 class_4652 = (class_465)class_4372;
        if (class_4652 instanceof class_490) {
            return;
        }
        class_4372 = class_4652.method_17577();
        int n2 = (int)this.b.d() - 1;
        if (n2 < 0 || n2 >= class_4372.field_7761.size()) {
            this.d();
            return;
        }
        if (this.j < 0) {
            this.j = 0;
        }
        if ((double)this.j < this.c.d()) {
            ++this.j;
            return;
        }
        this.a().method_2906(class_4372.field_7763, n2, 0, class_1713.field_7790, this.b());
        class_4652.method_25419();
        this.a().method_1507(null);
        this.d();
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.d();
    }

    private /* bridge */ /* synthetic */ void d() {
        this.h = false;
        this.i = 0;
        this.j = -1;
    }

    private /* bridge */ /* synthetic */ long a() {
        if (this.a() == null) {
            return -1L;
        }
        class_269 class_2692 = this.a().method_8428();
        if (class_2692 == null) {
            return -1L;
        }
        class_266 class_2662 = class_2692.method_1189(class_8646.field_45157);
        if (class_2662 == null) {
            return -1L;
        }
        for (class_9011 class_90112 : class_2692.method_1184(class_2662)) {
            class_268 class_2682 = class_2692.method_1164(class_90112.comp_2127());
            String string = this.a(class_2682, class_90112.comp_2127());
            long l2 = this.a(string);
            if (l2 < 0L) continue;
            return l2;
        }
        return -1L;
    }

    private /* bridge */ /* synthetic */ long a(String string) {
        if (string == null || string.isEmpty()) {
            return -1L;
        }
        Matcher matcher = a.matcher(string);
        if (!matcher.find()) {
            return -1L;
        }
        String string2 = matcher.group(1).replaceAll("[^0-9]", "");
        if (string2.isEmpty()) {
            return -1L;
        }
        try {
            return Long.parseLong(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return -1L;
        }
    }

    private /* bridge */ /* synthetic */ String a(class_268 class_2682, String string) {
        class_2561 class_25612;
        StringBuilder stringBuilder = new StringBuilder();
        if (class_2682 != null && (class_25612 = class_2682.method_1144()) != null) {
            stringBuilder.append(class_25612.getString());
        }
        if (string != null) {
            stringBuilder.append(string);
        }
        if (class_2682 != null && (class_25612 = class_2682.method_1136()) != null) {
            stringBuilder.append(class_25612.getString());
        }
        return stringBuilder.toString();
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.d();
    }
}

