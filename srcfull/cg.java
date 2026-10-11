/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2828;

public class cg
extends aT {
    private static /* synthetic */ cg a;
    private /* synthetic */ class_243 b;
    private /* synthetic */ dw c;
    private /* synthetic */ dw d;

    public /* synthetic */ cg() {
        super("\u0410\u0438\u0440\u0417\u0442\u0443\u0441\u043a", fV.c);
        this.b = class_243.field_1353;
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"O", "\u0442", "\u043c", "\u0435", "\u043d", "\u0438", "\u0442", "\u044c", " ", "\u0434", "\u0432", "\u0438", "\u0436", "e", "\u043d", "\u0438", "\u0435"});
        dw2.setDescriptionParts(new String[]{"\u0411", "\u043b", "o", "\u043a", "\u0438", "\u0440", "\u0443", "\u0435", "\u0442", " ", "\u0432", "\u0432", "o", "\u0434", " ", "\u0434", "\u0432", "\u0438", "\u0436", "e", "\u043d", "\u0438", "\u044f", " ", "\u0438", "\u0433", "\u0440", "o", "\u043a", "\u0430"});
        this.c = dw2;
        dw dw3 = new dw("", "", true);
        dw3.setNameParts(new String[]{"\u0411", "e", "\u0441", "\u0448", "\u0443", "\u043c", "\u043d", "\u0430", "\u044f", " ", "\u0437", "a", "\u043c", "\u043e", "\u0440", "\u043e", "\u0437", "\u043a", "\u0430"});
        dw3.setDescriptionParts(new String[]{"\u041f", "o", "\u0434", "\u043c", "\u0435", "\u043d", "\u044f", "\u0435", "\u0442", " ", "\u043f", "o", "\u0437", "\u0438", "\u0446", "\u0438", "\u044e", " ", "\u0432", " ", "\u0438", "c", "\u0445", "\u043e", "\u0434", "\u044f", "\u0449", "\u0438", "\u0445", " ", "\u043f", "a", "\u043a", "\u0435", "\u0442", "\u0430", "\u0445", " ", "\u043d", "a", " ", "\u0437", "a", "\u043c", "\u043e", "\u0440", "\u043e", "\u0436", "\u0435", "\u043d", "\u043d", "\u0443", "\u044e"});
        this.d = dw3;
        a = this;
        this.a((fa)this.c);
        this.a((fa)this.d);
    }

    @Override
    public /* bridge */ /* synthetic */ void i() {
        if (this.z() || this.b == class_243.field_1353) {
            return;
        }
        this.b().method_5814(this.b.field_1352, this.b.field_1351, this.b.field_1350);
        this.b().method_18799(class_243.field_1353);
        this.b().field_6017 = 0.0f;
        if (this.c.a()) {
            this.a().field_3913.field_3905 = 0.0f;
            this.a().field_3913.field_3907 = 0.0f;
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        if (!this.z() && this.b != class_243.field_1353) {
            this.b().method_5814(this.b.field_1352, this.b.field_1351, this.b.field_1350);
            this.b().method_18799(class_243.field_1353);
            this.b().field_6017 = 0.0f;
        }
        this.b = class_243.field_1353;
    }

    public static /* bridge */ /* synthetic */ cg a() {
        return a;
    }

    @Override
    public /* bridge */ /* synthetic */ void a(lx lx2) {
        class_2828.class_5911 class_59112;
        if (lx2.a() != iG.a) {
            return;
        }
        if (!this.d.a()) {
            return;
        }
        if (this.z() || this.b == class_243.field_1353) {
            return;
        }
        class_2596 class_25962 = lx2.a();
        if (!(class_25962 instanceof class_2828)) {
            return;
        }
        class_2828 class_28282 = (class_2828)class_25962;
        if (!class_28282.method_36171()) {
            return;
        }
        lx2.a(true);
        boolean bl2 = class_28282.method_12273();
        boolean bl3 = class_28282.method_61225();
        if (class_28282.method_36172()) {
            float f2 = class_28282.method_12271(this.b().method_36454());
            float f3 = class_28282.method_12270(this.b().method_36455());
            class_59112 = new class_2828.class_2831(f2, f3, bl2, bl3);
        } else {
            class_59112 = new class_2828.class_5911(bl2, bl3);
        }
        lx.a((class_2596)class_59112);
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        if (this.z()) {
            return;
        }
        this.b = this.b().method_19538();
    }
}

