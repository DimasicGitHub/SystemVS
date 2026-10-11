/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_239;
import net.minecraft.class_3965;
import net.minecraft.class_3966;

public class cm
extends aT {
    public /* synthetic */ dw a;
    public /* synthetic */ gz b;
    public /* synthetic */ gz c;
    /* synthetic */ int d;
    /* synthetic */ int e;

    public /* synthetic */ cm() {
        super("\u0421\u0440\u0439\u0437\u0442\u0430\u043b\u0422\u0430\u043f", fV.a);
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"A", "\u0432", "\u0442", ".", " ", "c", "\u0442", "\u0430", "\u0432", "\u0438", "\u0442", "\u044c", " ", "\u043a", "\u0440", "\u0438", "c", "\u0442", "\u0430", "\u043b"});
        dw2.setDescriptionParts(new String[]{"A", "\u0432", "\u0442", "\u043e", "\u043c", "\u0430", "\u0442", "\u0438", "\u0447", "\u0435", "\u0441", "\u043a", "\u0438", " ", "c", "\u0442", "\u0430", "\u0432", "\u0438", "\u0442", "\u044c", " ", "\u043a", "\u0440", "\u0438", "c", "\u0442", "\u0430", "\u043b", "\u043b", " ", "\u043d", "a", " ", "o", "\u0431", "\u0441", "\u0438", "\u0434", "\u0438", "\u0430", "\u043d"});
        this.a = dw2;
        gz gz2 = new gz("", "", 0.0, 0.0, 5.0, 1.0);
        gz2.setNameParts(new String[]{"\u0417", "a", "\u0434", "\u0435", "\u0440", "\u0436", "\u043a", "\u0430", " ", "c", "\u0442", "\u0430", "\u0432", "\u043a", "\u0438"});
        gz2.setDescriptionParts(new String[]{"\u0417", "a", "\u0434", "\u0435", "\u0440", "\u0436", "\u043a", "\u0430", " ", "\u043c", "e", "\u0436", "\u0434", "\u0443", " ", "\u043f", "o", "\u0441", "\u0442", "\u0430", "\u043d", "\u043e", "\u0432", "\u043a", "\u043e", "\u0439", " ", "\u043a", "\u0440", "\u0438", "c", "\u0442", "\u0430", "\u043b", "\u043b", "\u0430", " ", "(", "\u0442", "\u0438", "\u043a", "\u0438", ")"});
        this.b = gz2;
        gz gz3 = new gz("", "", 0.0, 0.0, 5.0, 1.0);
        gz3.setNameParts(new String[]{"\u0417", "a", "\u0434", "\u0435", "\u0440", "\u0436", "\u043a", "\u0430", " ", "a", "\u0442", "\u0430", "\u043a", "\u0438"});
        gz3.setDescriptionParts(new String[]{"\u0417", "a", "\u0434", "\u0435", "\u0440", "\u0436", "\u043a", "\u0430", " ", "\u043c", "e", "\u0436", "\u0434", "\u0443", " ", "a", "\u0442", "\u0430", "\u043a", "\u0430", "\u043c", "\u0438", " ", "\u043a", "\u0440", "\u0438", "c", "\u0442", "\u0430", "\u043b", "\u043b", "\u0430", " ", "(", "\u0442", "\u0438", "\u043a", "\u0438", ")"});
        this.c = gz3;
        this.a(this.a, this.b, this.c);
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        dF.b();
        dF.d();
    }

    private /* bridge */ /* synthetic */ void a() {
        class_239 class_2392 = this.a().field_1765;
        if (class_2392 instanceof class_3965) {
            class_3965 class_39652 = (class_3965)class_2392;
            if (this.a().method_8320(class_39652.method_17777()).method_26204() == class_2246.field_10540) {
                for (class_1297 class_12972 : this.a().method_18112()) {
                    class_1511 class_15112;
                    if (!(class_12972 instanceof class_1511) || !(class_15112 = (class_1511)class_12972).method_24515().method_10074().equals((Object)class_39652.method_17777())) continue;
                    return;
                }
                if (this.b().method_6047().method_7909() != class_1802.field_8301) {
                    return;
                }
                if ((float)this.e >= this.b.a()) {
                    dF.c();
                    this.e = 0;
                } else {
                    ++this.e;
                }
            }
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
    }

    @Override
    public /* bridge */ /* synthetic */ void j() {
        class_3966 class_39662;
        class_1297 class_12972;
        class_239 class_2392;
        if (this.a.a()) {
            this.a();
        }
        if ((class_2392 = this.a().field_1765) instanceof class_3966 && (class_12972 = (class_39662 = (class_3966)class_2392).method_17782()) instanceof class_1511) {
            class_2392 = (class_1511)class_12972;
            if (class_2392.method_31481() || !class_2392.method_5805()) {
                return;
            }
            if ((float)this.d >= this.c.a()) {
                dF.a();
                this.d = 0;
            } else {
                ++this.d;
            }
        }
    }
}

