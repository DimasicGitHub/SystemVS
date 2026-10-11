/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1657;
import net.minecraft.class_465;

public class hu
extends aT {
    private final /* synthetic */ dw a;
    private final /* synthetic */ gz b;
    private /* synthetic */ int c;

    public /* synthetic */ hu() {
        super("\u0416\u0443\u043c\u043f\u0420\u0435\u0437\u0435\u0442", fV.b);
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"\u0428", "a", "\u043d", "\u0441"});
        dw2.setDescriptionParts(new String[]{"B", "\u043a", "\u043b", "\u044e", "\u0447", "\u0438", "\u0442", "\u044c", " ", "c", "\u043b", "\u0443", "\u0447", "\u0430", "\u0439", "\u043d", "\u044b", "\u0439", " ", "\u0448", "a", "\u043d", "\u0441", " ", "\u043f", "\u0440", "\u044b", "\u0436", "\u043a", "a"});
        this.a = dw2;
        gz gz2 = new gz("", "", 80.0, 0.0, 100.0, 0.0);
        gz2.setNameParts(new String[]{"\u041f", "\u0440", "o", "\u0446", "\u0435", "\u043d", "\u0442"});
        gz2.setDescriptionParts(new String[]{"\u0412", "e", "\u0440", "\u043e", "\u044f", "\u0442", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u043f", "\u0440", "\u044b", "\u0436", "\u043a", "a"});
        this.b = gz2;
        this.c = 0;
        this.a(this.a, this.b);
    }

    @Override
    public /* bridge */ /* synthetic */ void b(bh bh2) {
        if (this.z()) {
            return;
        }
        class_1657 class_16572 = this.b();
        if (class_16572 == null) {
            return;
        }
        int n2 = class_16572.field_6235;
        boolean bl2 = n2 > this.c;
        this.c = n2;
        if (!bl2) {
            return;
        }
        if (!(class_16572.method_6065() instanceof class_1657)) {
            return;
        }
        if (!class_16572.method_24828()) {
            return;
        }
        if (this.a() instanceof class_465) {
            return;
        }
        if (class_16572.method_5799() || class_16572.method_5757()) {
            return;
        }
        if (this.a.a() && !eO.a(0, 100, this.b.d())) {
            return;
        }
        class_16572.method_6043();
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.c = 0;
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.c = 0;
    }
}

