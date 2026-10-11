/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_238;

public class lj
extends aT {
    private /* synthetic */ gz a;

    public /* synthetic */ lj() {
        super("\u041d\u043e\u0428\u0435\u0431", fV.b);
        gz gz2 = new gz("", "", 0.6, 0.0, 1.0, 0.05, "", 1);
        gz2.setNameParts(new String[]{"C", "\u043a", "\u043e", "\u0440", "\u043e", "\u0441", "\u0442", "\u044c"});
        gz2.setDescriptionParts(new String[]{"C", "\u043a", "\u043e", "\u0440", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u043f", "e", "\u0440", "\u0435", "\u043c", "\u0435", "\u0449", "\u0435", "\u043d", "\u0438", "\u044f"});
        this.a = gz2;
        this.a((fa)this.a);
    }

    @Override
    public /* bridge */ /* synthetic */ void i() {
        if (this.y() && this.a()) {
            double[] dArray = this.a(this.a.a());
            this.b().method_18800(dArray[0], 0.0, dArray[1]);
            if (this.a().field_1903.method_1434()) {
                this.b().method_18799(this.b().method_18798().method_1031(0.0, this.a.a(), 0.0));
            }
            if (this.a().field_1832.method_1434()) {
                this.b().method_18799(this.b().method_18798().method_1031(0.0, -this.a.a(), 0.0));
            }
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
    }

    public /* bridge */ /* synthetic */ boolean a() {
        class_238 class_2383 = this.b().method_5829();
        class_2338 class_23382 = class_2338.method_49638((class_2374)this.b().method_19538());
        for (int i2 = class_23382.method_10263() - 2; i2 <= class_23382.method_10263() + 2; ++i2) {
            for (int i3 = class_23382.method_10264() - 1; i3 <= class_23382.method_10264() + 4; ++i3) {
                for (int i4 = class_23382.method_10260() - 2; i4 <= class_23382.method_10260() + 2; ++i4) {
                    class_2338 class_23383 = new class_2338(i2, i3, i4);
                    if (!class_2383.method_994(new class_238(class_23383)) || this.a().method_8320(class_23383).method_26204() != class_2246.field_10343) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ double[] a(double d2) {
        float f2 = this.a().field_3913.field_3905;
        float f3 = this.a().field_3913.field_3907;
        float f4 = this.a().method_36454();
        if (f2 != 0.0f) {
            if (f3 > 0.0f) {
                f4 += f2 > 0.0f ? -45.0f : 45.0f;
            } else if (f3 < 0.0f) {
                f4 += f2 > 0.0f ? 45.0f : -45.0f;
            }
            f3 = 0.0f;
            if (f2 > 0.0f) {
                f2 = 1.0f;
            } else if (f2 < 0.0f) {
                f2 = -1.0f;
            }
        }
        double d3 = Math.sin(Math.toRadians(f4 + 90.0f));
        double d4 = Math.cos(Math.toRadians(f4 + 90.0f));
        double d5 = (double)f2 * d2 * d4 + (double)f3 * d2 * d3;
        double d6 = (double)f2 * d2 * d3 - (double)f3 * d2 * d4;
        return new double[]{d5, d6};
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
    }
}

