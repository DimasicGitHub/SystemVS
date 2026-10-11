/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1764;
import net.minecraft.class_2886;
import net.minecraft.class_746;

public class hc
extends aT {
    private final /* synthetic */ dw a;
    private final /* synthetic */ dw b;
    private /* synthetic */ int c;

    public /* synthetic */ hc() {
        super("\u041d\u043e\u0417\u043b\u043e\u0448", fV.b);
        dw dw2 = new dw("", "", false);
        dw2.setNameParts(new String[]{"T", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u043d", "a", " ", "\u0437", "e", "\u043c", "\u043b", "\u0435"});
        dw2.setDescriptionParts(new String[]{"\u0423", "\u0431", "\u0438", "\u0440", "a", "\u0435", "\u0442", " ", "\u0437", "a", "\u043c", "\u0435", "\u0434", "\u043b", "\u0435", "\u043d", "\u0438", "\u0435", " ", "\u0442", "o", "\u043b", "\u044c", "\u043a", "\u043e", " ", "e", "\u0441", "\u043b", "\u0438", " ", "\u0438", "\u0433", "\u0440", "o", "\u043a", " ", "\u043d", "a", " ", "\u0437", "e", "\u043c", "\u043b", "\u0435", "."});
        this.a = dw2;
        dw dw3 = new dw("", "", false);
        dw3.setNameParts(new String[]{"T", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "a", "\u0440", "\u0431", "\u0430", "\u043b", "\u0435", "\u0442"});
        dw3.setDescriptionParts(new String[]{"\u0420", "a", "\u0431", "\u043e", "\u0442", "\u0430", "\u0435", "\u0442", " ", "\u0442", "o", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u043f", "p", "\u0438", " ", "\u0438", "c", "\u043f", "\u043e", "\u043b", "\u044c", "\u0437", "\u043e", "\u0432", "\u0430", "\u043d", "\u0438", "\u0438", " ", "a", "\u0440", "\u0431", "\u0430", "\u043b", "\u0435", "\u0442", "\u0430", "."});
        this.b = dw3;
        this.c = 0;
        this.a(this.a, this.b);
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.c = 0;
    }

    @Override
    public /* bridge */ /* synthetic */ void a(di di2) {
        if (this.z() || this.a() == null) {
            return;
        }
        if (!this.a().method_6115()) {
            return;
        }
        if (this.a.a() && !this.a().method_24828()) {
            return;
        }
        if (this.b.a() && !gK.a(class_1764.class)) {
            return;
        }
        di2.a(true);
    }

    @Override
    public /* bridge */ /* synthetic */ void a(lx lx2) {
        if (this.z()) {
            return;
        }
        if (lx2.a() != iG.a) {
            return;
        }
        if (!(lx2.a() instanceof class_2886)) {
            return;
        }
        class_746 class_7462 = this.a();
        if (class_7462 == null) {
            return;
        }
        if (this.a.a() && !class_7462.method_24828()) {
            return;
        }
        if (this.b.a() && !gK.a(class_1764.class)) {
            return;
        }
        if (this.c > 1 && class_7462.method_6048() > 1) {
            this.c = 0;
            lx2.a(true);
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
    }

    @Override
    public /* bridge */ /* synthetic */ void j() {
        if (this.z() || this.a() == null) {
            return;
        }
        this.c = this.a().method_6115() ? ++this.c : 0;
    }
}

