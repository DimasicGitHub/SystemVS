/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_746;

public class ck
extends aT {
    private /* synthetic */ dw a;
    private /* synthetic */ gz b;
    private /* synthetic */ gz c;
    private final /* synthetic */ hk d;
    private /* synthetic */ boolean e;

    public /* synthetic */ ck() {
        super("\u0417\u0445\u0438\u0435\u043b\u0434\u0411\u0440\u0435\u0430\u043a\u0435\u0440", fV.a);
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"T", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u0438", "\u0433", "\u0440", "o", "\u043a", "\u0438"});
        dw2.setDescriptionParts(new String[]{"\u0420", "e", "\u0430", "\u0433", "\u0438", "\u0440", "\u043e", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0442", "o", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u043d", "a", " ", "\u0438", "\u0433", "\u0440", "o", "\u043a", "\u043e", "\u0432", ",", " ", "a", " ", "\u043d", "e", " ", "\u043d", "a", " ", "\u043c", "o", "\u0431", "\u043e", "\u0432"});
        this.a = dw2;
        gz gz2 = new gz("", "", 200.0, 200.0, 1000.0, 10.0);
        gz2.setNameParts(new String[]{"\u0412", "\u0440", "e", "\u043c", "\u044f", " ", "\u0443", "\u0434", "e", "\u0440", "\u0436", "\u0430", "\u043d", "\u0438", "\u044f"});
        gz2.setDescriptionParts(new String[]{"\u0412", "\u0440", "e", "\u043c", "\u044f", " ", "\u0443", "\u0434", "e", "\u0440", "\u0436", "\u0430", "\u043d", "\u0438", "\u044f", " ", "\u0442", "o", "\u043f", "\u043e", "\u0440", "\u0430", " ", "\u043f", "o", "\u0441", "\u043b", "\u0435", " ", "a", "\u0442", "\u0430", "\u043a", "\u0438", " ", "(", "\u0432", " ", "\u043c", "c", ")"});
        this.b = gz2;
        gz gz3 = new gz("", "", 3.4, 2.0, 6.0, 0.1);
        gz3.setNameParts(new String[]{"\u0414", "a", "\u043b", "\u044c", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c", " ", "o", "\u0431", "\u043d", "\u0430", "\u0440", "\u0443", "\u0436", "\u0435", "\u043d", "\u0438", "\u044f"});
        gz3.setDescriptionParts(new String[]{"M", "\u0430", "\u043a", "\u0441", "\u0438", "\u043c", "\u0430", "\u043b", "\u044c", "\u043d", "\u043e", "\u0435", " ", "\u0440", "a", "\u0441", "\u0441", "\u0442", "\u043e", "\u044f", "\u043d", "\u0438", "\u0435", " ", "\u0434", "\u043b", "\u044f", " ", "o", "\u0431", "\u043d", "\u0430", "\u0440", "\u0443", "\u0436", "\u0435", "\u043d", "\u0438", "\u044f", " ", "\u0449", "\u0438", "\u0442", "a"});
        this.c = gz3;
        this.d = new hk();
        this.e = false;
        this.a(this.a, this.b, this.c);
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.d.a();
        this.e = false;
    }

    private /* bridge */ /* synthetic */ class_1309 a() {
        class_746 class_7462 = this.a();
        return class_7462.method_37908().method_8390(class_1309.class, class_7462.method_5829().method_1014(this.c.d()), class_13092 -> {
            if (class_13092 == this.a() || !class_13092.method_5805() || class_13092.method_31481() || !class_13092.method_5863()) {
                return false;
            }
            return !this.a.a() || class_13092 instanceof class_1657;
        }).stream().filter(class_13092 -> (double)class_7462.method_5739((class_1297)class_13092) <= this.c.d()).filter(gK::a).min((class_13092, class_13093) -> Float.compare(class_7462.method_5739((class_1297)class_13092), class_7462.method_5739((class_1297)class_13093))).orElse(null);
    }

    private /* bridge */ /* synthetic */ void a() {
        class_1309 class_13092;
        boolean bl2 = this.a().field_1886.method_1434();
        if (bl2 && !this.e && !this.d.a() && (class_13092 = this.a()) != null) {
            this.d.a(class_13092);
        }
        this.e = bl2;
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.d.b();
        this.e = false;
    }

    @Override
    public /* bridge */ /* synthetic */ void j() {
        if (!this.y()) {
            if (this.d.a()) {
                this.d.a();
            }
            return;
        }
        this.a();
        this.d.a(this.b.d());
    }
}

