/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_10185;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1690;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3532;
import org.lwjgl.glfw.GLFW;

public class hw
extends aT {
    public /* synthetic */ gz a;
    public /* synthetic */ gz b;
    public /* synthetic */ gz c;
    public /* synthetic */ gz d;
    public /* synthetic */ gz e;
    public /* synthetic */ dw f;
    private /* synthetic */ boolean g;

    public /* synthetic */ hw() {
        super("\u0411\u043e\u0430\u0442\u0424\u043b\u0439", fV.b);
        gz gz2 = new gz("", "", 0.4f, 0.05f, 5.0, 0.05f);
        gz2.setNameParts(new String[]{"C", "\u043a", "\u043e", "\u0440", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u0432", "\u0432", "e", "\u0440", "\u0445"});
        gz2.setDescriptionParts(new String[]{"C", "\u043a", "\u043e", "\u0440", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u0432", "e", "\u0440", "\u0442", "\u0438", "\u043a", "\u0430", "\u043b", "\u044c", "\u043d", "\u043e", "\u0433", "\u043e", " ", "\u043f", "o", "\u043b", "\u0451", "\u0442", "\u0430", " ", "\u0432", "\u0432", "e", "\u0440", "\u0445"});
        this.a = gz2;
        gz gz3 = new gz("", "", 0.4f, 0.05f, 5.0, 0.05f);
        gz3.setNameParts(new String[]{"C", "\u043a", "\u043e", "\u0440", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u0432", "\u043d", "\u0438", "\u0437"});
        gz3.setDescriptionParts(new String[]{"C", "\u043a", "\u043e", "\u0440", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u0432", "e", "\u0440", "\u0442", "\u0438", "\u043a", "\u0430", "\u043b", "\u044c", "\u043d", "\u043e", "\u0433", "\u043e", " ", "\u043f", "o", "\u043b", "\u0451", "\u0442", "\u0430", " ", "\u0432", "\u043d", "\u0438", "\u0437"});
        this.b = gz3;
        gz gz4 = new gz("", "", 0.6f, 0.05f, 5.0, 0.05f);
        gz4.setNameParts(new String[]{"C", "\u043a", "\u043e", "\u0440", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u0432", " ", "c", "\u0442", "\u043e", "\u0440", "\u043e", "\u043d", "\u044b"});
        gz4.setDescriptionParts(new String[]{"\u0413", "o", "\u0440", "\u0438", "\u0437", "\u043e", "\u043d", "\u0442", "\u0430", "\u043b", "\u044c", "\u043d", "\u0430", "\u044f", " ", "c", "\u043a", "\u043e", "\u0440", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u043f", "o", "\u043b", "\u0451", "\u0442", "\u0430", " ", "\u043b", "o", "\u0434", "\u043a", "\u0438"});
        this.c = gz4;
        gz gz5 = new gz("", "", 0.25, 0.05f, 2.0, 0.05f);
        gz5.setNameParts(new String[]{"C", "\u043a", "\u043e", "\u0440", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u0432", " ", "\u0431", "\u043b", "o", "\u043a", "\u0430", "\u0445"});
        gz5.setDescriptionParts(new String[]{"C", "\u043a", "\u043e", "\u0440", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u0434", "\u0432", "\u0438", "\u0436", "e", "\u043d", "\u0438", "\u044f", " ", "c", "\u043a", "\u0432", "\u043e", "\u0437", "\u044c", " ", "\u0431", "\u043b", "o", "\u043a", "\u0438"});
        this.d = gz5;
        gz gz6 = new gz("", "", 0.5, 0.1f, 2.0, 0.1f);
        gz6.setNameParts(new String[]{"\u0414", "\u0438", "c", "\u0442", "\u0430", "\u043d", "\u0446", "\u0438", "\u044f", " ", "\u043f", "\u0440", "o", "\u0432", "\u0435", "\u0440", "\u043a", "\u0438"});
        gz6.setDescriptionParts(new String[]{"\u0414", "\u0438", "c", "\u0442", "\u0430", "\u043d", "\u0446", "\u0438", "\u044f", " ", "o", "\u0431", "\u043d", "\u0430", "\u0440", "\u0443", "\u0436", "\u0435", "\u043d", "\u0438", "\u044f", " ", "\u0431", "\u043b", "o", "\u043a", "\u043e", "\u0432", " ", "\u0432", "\u043f", "e", "\u0440", "\u0435", "\u0434", "\u0438", " ", "\u043b", "o", "\u0434", "\u043a", "\u0438"});
        this.e = gz6;
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"\u0418", "c", "\u043f", "\u043e", "\u043b", "\u044c", "\u0437", "\u043e", "\u0432", "\u0430", "\u043d", "\u0438", "\u0435", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", "\u043e", "\u0432"});
        dw2.setDescriptionParts(new String[]{"\u041f", "o", "\u0437", "\u0432", "\u043e", "\u043b", "\u044f", "\u0435", "\u0442", " ", "\u0438", "c", "\u043f", "\u043e", "\u043b", "\u044c", "\u0437", "\u043e", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", "\u044b", " ", "\u0432", " ", "\u043b", "o", "\u0434", "\u043a", "\u0435"});
        this.f = dw2;
        this.g = false;
        this.a(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override
    public /* bridge */ /* synthetic */ void i() {
        class_10185 class_101852;
        if (this.z()) {
            return;
        }
        class_1297 class_12972 = this.b().method_5854();
        if (!(class_12972 instanceof class_1690)) {
            this.g = false;
            return;
        }
        class_1690 class_16902 = (class_1690)class_12972;
        if (this.f.a()) {
            this.a();
        }
        class_16902.field_5960 = true;
        class_16902.method_5875(true);
        boolean bl2 = this.a();
        boolean bl3 = this.a(class_16902);
        double d2 = bl2 || bl3 ? this.d.d() : this.c.d();
        class_16902.method_36456(this.b().method_36454());
        class_16902.field_5982 = class_16902.method_36454();
        double d3 = 0.0;
        double d4 = 0.0;
        double d5 = 0.0;
        float f2 = class_16902.method_36454();
        double d6 = Math.toRadians(f2);
        if (this.a().field_1903.method_1434()) {
            d4 += this.a.d();
        }
        if (GLFW.glfwGetKey((long)this.a().method_22683().method_4490(), (int)88) == 1) {
            d4 -= this.b.d();
        }
        if ((class_101852 = this.a().field_3913.field_54155).comp_3159()) {
            d3 -= (double)class_3532.method_15374((float)((float)d6)) * d2;
            d5 += (double)class_3532.method_15362((float)((float)d6)) * d2;
        }
        if (class_101852.comp_3160()) {
            d3 += (double)class_3532.method_15374((float)((float)d6)) * d2;
            d5 -= (double)class_3532.method_15362((float)((float)d6)) * d2;
        }
        if (class_101852.comp_3161()) {
            d3 += (double)class_3532.method_15362((float)((float)d6)) * d2;
            d5 += (double)class_3532.method_15374((float)((float)d6)) * d2;
        }
        if (class_101852.comp_3162()) {
            d3 -= (double)class_3532.method_15362((float)((float)d6)) * d2;
            d5 -= (double)class_3532.method_15374((float)((float)d6)) * d2;
        }
        class_243 class_2432 = new class_243(d3, d4, d5);
        class_16902.method_18799(class_2432);
        if (!this.b().method_5765()) {
            this.b().method_5873((class_1297)class_16902, true);
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        class_1297 class_12972;
        if (this.b() != null && (class_12972 = this.b().method_5854()) instanceof class_1690) {
            class_1690 class_16902 = (class_1690)class_12972;
            class_16902.field_5960 = false;
            class_16902.method_5875(false);
        }
        this.g = false;
    }

    private /* bridge */ /* synthetic */ boolean a() {
        if (this.z()) {
            return false;
        }
        class_238 class_2383 = this.b().method_5829().method_1014(0.001);
        int n2 = class_3532.method_15357((double)class_2383.field_1323);
        int n3 = class_3532.method_15357((double)class_2383.field_1322);
        int n4 = class_3532.method_15357((double)class_2383.field_1321);
        int n5 = class_3532.method_15357((double)class_2383.field_1320);
        int n6 = class_3532.method_15357((double)class_2383.field_1325);
        int n7 = class_3532.method_15357((double)class_2383.field_1324);
        for (int i2 = n2; i2 <= n5; ++i2) {
            for (int i3 = n3; i3 <= n6; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    class_2338 class_23382 = class_2338.method_49637((double)i2, (double)i3, (double)i4);
                    class_2680 class_26802 = this.a().method_8320(class_23382);
                    if (!class_26802.method_51367()) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private /* bridge */ /* synthetic */ boolean a(class_1690 class_16902) {
        if (this.z()) {
            return false;
        }
        class_243 class_2432 = class_16902.method_19538();
        float f2 = class_16902.method_36454();
        double d2 = Math.toRadians(f2);
        double d3 = this.e.d();
        class_10185 class_101852 = this.a().field_3913.field_54155;
        double d4 = class_2432.field_1352;
        double d5 = class_2432.field_1351;
        double d6 = class_2432.field_1350;
        if (class_101852.comp_3159()) {
            d4 -= (double)class_3532.method_15374((float)((float)d2)) * d3;
            d6 += (double)class_3532.method_15362((float)((float)d2)) * d3;
        }
        if (class_101852.comp_3160()) {
            d4 += (double)class_3532.method_15374((float)((float)d2)) * d3;
            d6 -= (double)class_3532.method_15362((float)((float)d2)) * d3;
        }
        if (class_101852.comp_3161()) {
            d4 += (double)class_3532.method_15362((float)((float)d2)) * d3;
            d6 += (double)class_3532.method_15374((float)((float)d2)) * d3;
        }
        if (class_101852.comp_3162()) {
            d4 -= (double)class_3532.method_15362((float)((float)d2)) * d3;
            d6 -= (double)class_3532.method_15374((float)((float)d2)) * d3;
        }
        if (this.a().field_1903.method_1434()) {
            d5 += d3;
        }
        if (GLFW.glfwGetKey((long)this.a().method_22683().method_4490(), (int)88) == 1) {
            d5 -= d3;
        }
        class_238 class_2383 = new class_238(d4 - 0.5, d5 - 0.5, d6 - 0.5, d4 + 0.5, d5 + 0.5, d6 + 0.5);
        int n2 = class_3532.method_15357((double)class_2383.field_1323);
        int n3 = class_3532.method_15357((double)class_2383.field_1322);
        int n4 = class_3532.method_15357((double)class_2383.field_1321);
        int n5 = class_3532.method_15357((double)class_2383.field_1320);
        int n6 = class_3532.method_15357((double)class_2383.field_1325);
        int n7 = class_3532.method_15357((double)class_2383.field_1324);
        for (int i2 = n2; i2 <= n5; ++i2) {
            for (int i3 = n3; i3 <= n6; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    class_2338 class_23382 = class_2338.method_49637((double)i2, (double)i3, (double)i4);
                    class_2680 class_26802 = this.a().method_8320(class_23382);
                    if (!class_26802.method_51367()) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private /* bridge */ /* synthetic */ void a() {
        boolean bl2 = this.a().field_1904.method_1434();
        if (bl2 && !this.g) {
            if (!this.b().method_6047().method_7960()) {
                this.a(class_1268.field_5808);
            } else if (!this.b().method_6079().method_7960()) {
                this.a(class_1268.field_5810);
            }
        }
        if (!bl2 && this.g && this.b().method_6115()) {
            this.b().method_6075();
        }
        this.g = bl2;
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.g = false;
    }
}

