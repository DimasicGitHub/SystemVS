/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2382;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3965;

public class br
extends aT {
    public /* synthetic */ gz a;
    public /* synthetic */ gz b;
    private /* synthetic */ int c;
    private /* synthetic */ int d;
    private /* synthetic */ int e;
    private /* synthetic */ class_2338 f;
    private final /* synthetic */ cT g;

    public /* synthetic */ br() {
        super("\u0410\u043d\u0441\u0445\u043e\u0440\u0422\u0430\u043f", fV.a);
        gz gz2 = new gz("", "", 1.0, 0.0, 5.0, 1.0);
        gz2.setNameParts(new String[]{"\u0417", "a", "\u0434", "\u0435", "\u0440", "\u0436", "\u043a", "\u0430"});
        gz2.setDescriptionParts(new String[]{"\u0417", "a", "\u0434", "\u0435", "\u0440", "\u0436", "\u043a", "\u0430", " ", "\u043c", "e", "\u0436", "\u0434", "\u0443", " ", "c", "\u0442", "\u0430", "\u0434", "\u0438", "\u044f", "\u043c", "\u0438", " ", "(", "\u0442", "\u0438", "\u043a", "\u0438", ")"});
        this.a = gz2;
        gz gz3 = new gz("", "", 5.0, 1.0, 10.0, 0.5);
        gz3.setNameParts(new String[]{"C", "\u043a", "\u043e", "\u0440", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u043d", "a", "\u0432", "\u043e", "\u0434", "\u043a", "\u0438"});
        gz3.setDescriptionParts(new String[]{"C", "\u043a", "\u043e", "\u0440", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u043f", "o", "\u0432", "\u043e", "\u0440", "\u043e", "\u0442", "\u0430", " ", "\u043a", "a", "\u043c", "\u0435", "\u0440", "\u044b", " ", "\u043a", " ", "\u044f", "\u043a", "o", "\u0440", "\u044e"});
        this.b = gz3;
        this.c = 0;
        this.d = -1;
        this.e = 0;
        this.g = new cT();
        this.a(this.a, this.b);
    }

    private /* bridge */ /* synthetic */ int b() {
        int n2 = this.a().field_7545;
        if (this.a().method_5438(n2).method_7909() != class_1802.field_8801) {
            return n2;
        }
        for (int i2 = 0; i2 < 9; ++i2) {
            if (this.a().method_5438(i2).method_7909() == class_1802.field_8801) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.a();
        dF.d();
    }

    private /* bridge */ /* synthetic */ void a() {
        this.c = 0;
        this.d = -1;
        this.f = null;
        this.e = 0;
        this.g.a();
    }

    private /* bridge */ /* synthetic */ int a() {
        for (int i2 = 0; i2 < 9; ++i2) {
            if (this.a().method_5438(i2).method_7909() != class_1802.field_8801) continue;
            return i2;
        }
        return -1;
    }

    private /* bridge */ /* synthetic */ boolean a(class_2338 class_23382) {
        return dI.a(class_23382);
    }

    @Override
    public /* bridge */ /* synthetic */ void k() {
        if (this.z() || this.c == 0 || this.f == null) {
            return;
        }
        double d2 = this.b.d();
        class_243 class_2432 = class_243.method_24953((class_2382)this.f);
        this.g.a(d2, class_2432);
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.a();
    }

    @Override
    public /* bridge */ /* synthetic */ void j() {
        class_3965 class_39652;
        if (this.z()) {
            return;
        }
        class_239 class_2392 = this.a().field_1765;
        if (class_2392 instanceof class_3965) {
            class_39652 = (class_3965)class_2392;
        } else {
            if (this.c != 0) {
                this.a();
            }
            return;
        }
        while (this.c != 0) {
            if (this.e > 0) {
                --this.e;
                return;
            }
            int n2 = this.c;
            switch (this.c) {
                case 1: {
                    int n3 = this.a();
                    if (n3 == -1) {
                        this.a();
                        return;
                    }
                    this.a().field_7545 = n3;
                    this.c = 2;
                    this.e = this.a.a();
                    break;
                }
                case 2: {
                    if (!class_39652.method_17777().equals((Object)this.f)) {
                        this.a();
                        return;
                    }
                    if (this.a().method_8320(this.f).method_26204() != class_2246.field_23152) {
                        this.a();
                        return;
                    }
                    dF.c();
                    this.c = 3;
                    this.e = Math.max(1, this.a.a());
                    break;
                }
                case 3: {
                    if (this.d != -1) {
                        this.a().field_7545 = this.d;
                    }
                    this.c = 4;
                    this.e = this.a.a();
                    break;
                }
                case 4: {
                    if (!class_39652.method_17777().equals((Object)this.f)) {
                        this.a();
                        return;
                    }
                    if (this.a().method_8320(this.f).method_26204() != class_2246.field_23152) {
                        this.a();
                        return;
                    }
                    dF.c();
                    this.c = 5;
                    this.e = 1;
                    break;
                }
                case 5: {
                    this.a();
                }
            }
            if (this.c != 0 && this.e <= 0 && this.c != n2) continue;
            break;
        }
        if (this.c == 0) {
            if (this.a().method_8320(class_39652.method_17777()).method_26204() != class_2246.field_23152) {
                return;
            }
            this.f = class_39652.method_17777();
            this.d = this.a().field_7545;
            if (this.a(this.f)) {
                int n4 = this.b();
                if (n4 == -1) {
                    return;
                }
                this.a().field_7545 = n4;
                this.c = 4;
            } else {
                if (this.a() == -1) {
                    return;
                }
                this.c = 1;
            }
        }
    }
}

