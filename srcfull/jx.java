/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_239;
import net.minecraft.class_3966;

public class jx
extends aT {
    private /* synthetic */ gz a;
    private /* synthetic */ dw b;
    private /* synthetic */ int c;

    public /* synthetic */ jx() {
        super("\u0422\u0430\u043f\u0435\u041c\u043e\u0443\u0437\u0435", fV.a);
        gz gz2 = new gz("", "", 15.0, 1.0, 100.0, 1.0);
        gz2.setNameParts(new String[]{"K", "\u0443", "\u043b", "\u0434", "\u0430", "\u0443", "\u043d"});
        gz2.setDescriptionParts(new String[]{"T", "\u0438", "\u043a", "\u043e", "\u0432", " ", "\u043c", "e", "\u0436", "\u0434", "\u0443", " ", "\u0443", "\u0434", "a", "\u0440", "\u0430", "\u043c", "\u0438"});
        this.a = gz2;
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"\u041f", "a", "\u0443", "\u0437", "\u0430", " ", "\u0432", " ", "\u044d", "\u043a", "\u0440", "a", "\u043d", "\u0435"});
        dw2.setDescriptionParts(new String[]{"O", "\u0441", "\u0442", "\u0430", "\u043d", "\u0430", "\u0432", "\u043b", "\u0438", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0443", "\u0434", "a", "\u0440", "\u044b", " ", "\u043a", "o", "\u0433", "\u0434", "\u0430", " ", "o", "\u0442", "\u043a", "\u0440", "\u044b", "\u0442", " ", "\u044d", "\u043a", "\u0440", "a", "\u043d"});
        this.b = dw2;
        this.a(this.a, this.b);
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
    }

    private /* bridge */ /* synthetic */ void a() {
        if (this.a() == null) {
            dF.a();
            return;
        }
        class_239 class_2392 = this.a().field_1765;
        if (class_2392 instanceof class_3966) {
            class_3966 class_39662 = (class_3966)class_2392;
            gK.a(class_39662.method_17782());
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.c = 0;
    }

    @Override
    public /* bridge */ /* synthetic */ void j() {
        if (this.z()) {
            return;
        }
        if (this.b.a() && this.a() != null) {
            return;
        }
        if (this.a().method_2923()) {
            return;
        }
        if (this.c > 0) {
            --this.c;
            return;
        }
        this.a();
        this.c = this.a.a();
    }
}

