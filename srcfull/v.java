/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1297;
import net.minecraft.class_1657;

public class v
extends ho {
    private final /* synthetic */ gz a;
    private /* synthetic */ boolean b;
    private /* synthetic */ long c;

    public /* synthetic */ v() {
        super("\u041b\u0430\u0433\u0420\u0430\u043d\u0433\u0435", fV.b);
        gz gz2 = new gz("", "", 10.0, 1.0, 30.0, 0.5, ec.join(new String[]{"\u043c"}), 1);
        gz2.setNameParts(new String[]{"\u0414", "\u0438", "c", "\u0442", "\u0430", "\u043d", "\u0446", "\u0438", "\u044f"});
        gz2.setDescriptionParts(new String[]{"\u0414", "\u0438", "c", "\u0442", "\u0430", "\u043d", "\u0446", "\u0438", "\u044f", " ", "\u0434", "o", " ", "\u0431", "\u043b", "\u0438", "\u0436", "a", "\u0439", "\u0448", "\u0435", "\u0433", "\u043e", " ", "\u0438", "\u0433", "\u0440", "o", "\u043a", "\u0430", " ", "\u0434", "\u043b", "\u044f", " ", "a", "\u043a", "\u0442", "\u0438", "\u0432", "\u0430", "\u0446", "\u0438", "\u0438"});
        this.a = gz2;
        this.b = false;
        this.c = 0L;
        this.a(this.d, this.a, this.e);
    }

    @Override
    protected /* bridge */ /* synthetic */ boolean a() {
        if (this.z()) {
            return false;
        }
        double d2 = this.a.d() * this.a.d();
        boolean bl2 = false;
        for (class_1657 class_16572 : this.a().method_18456()) {
            if (class_16572 == this.b() || !(this.b().method_5858((class_1297)class_16572) <= d2)) continue;
            bl2 = true;
            break;
        }
        long l2 = System.currentTimeMillis();
        if (bl2 != this.b) {
            if (this.c == 0L) {
                this.c = l2;
            }
            if (l2 - this.c >= 150L) {
                this.b = bl2;
                this.c = 0L;
                if (!bl2) {
                    return false;
                }
            }
            return this.b;
        }
        this.c = 0L;
        return bl2;
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        super.g();
        this.b = false;
        this.c = 0L;
    }
}

