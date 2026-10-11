/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import net.minecraft.class_10017;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_897;
import net.minecraft.class_898;

public class p
extends aT {
    private static /* synthetic */ p a;
    private /* synthetic */ gz b;
    private /* synthetic */ dw c;

    public /* synthetic */ p() {
        super("\u0417\u0445\u043e\u0448\u0418\u043d\u0432\u0438\u0437\u0438\u0431\u043b\u0435", fV.d);
        gz gz2 = new gz("", "", 0.5, 0.1, 1.0, 0.05);
        gz2.setNameParts(new String[]{"A", "\u043b", "\u044c", "\u0444", "\u0430"});
        gz2.setDescriptionParts(new String[]{"\u041f", "\u0440", "o", "\u0437", "\u0440", "\u0430", "\u0447", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u043c", "o", "\u0434", "\u0435", "\u043b", "\u044c", "\u043a", "\u0438"});
        this.b = gz2;
        dw dw2 = new dw("", "", false);
        dw2.setNameParts(new String[]{"\u0425", "\u0438", "\u0442", "\u0431", "o", "\u043a", "\u0441"});
        dw2.setDescriptionParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0445", "\u0438", "\u0442", "\u0431", "o", "\u043a", "\u0441", " ", "\u043d", "e", "\u0432", "\u0438", "\u0434", "\u0438", "\u043c", "\u044b", "\u0445", " ", "\u0438", "\u0433", "\u0440", "o", "\u043a", "\u043e", "\u0432"});
        this.c = dw2;
        this.a(this.b, this.c);
        a = this;
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
    }

    @Override
    public /* bridge */ /* synthetic */ void f(H h2) {
        if (this.z()) {
            return;
        }
        try {
            this.a(h2);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* bridge */ /* synthetic */ void a(H h2) {
        class_310 class_3102 = this.a();
        class_1657 class_16572 = this.b();
        if (class_16572 == null) {
            return;
        }
        List list = this.a().method_18456();
        class_4587 class_45872 = h2.a();
        float f2 = h2.a().method_60637(true);
        class_243 class_2432 = h2.a().method_19326();
        double d2 = class_2432.field_1352;
        double d3 = class_2432.field_1351;
        double d4 = class_2432.field_1350;
        class_898 class_8982 = class_3102.method_1561();
        class_4597.class_4598 class_45982 = class_3102.method_22940().method_23000();
        float f3 = this.b.a();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f3);
        try {
            for (class_1657 class_16573 : list) {
                if (class_16573 == class_16572 || !class_16573.method_5767()) continue;
                double d5 = class_16573.field_6014 + (class_16573.method_23317() - class_16573.field_6014) * (double)f2 - d2;
                double d6 = class_16573.field_6036 + (class_16573.method_23318() - class_16573.field_6036) * (double)f2 - d3;
                double d7 = class_16573.field_5969 + (class_16573.method_23321() - class_16573.field_5969) * (double)f2 - d4;
                class_45872.method_22903();
                class_45872.method_22904(d5, d6, d7);
                class_897 class_8972 = class_8982.method_3953((class_1297)class_16573);
                class_10017 class_100172 = class_8972.method_55269();
                class_8972.method_62354((class_1297)class_16573, class_100172, f2);
                class_100172.field_53333 = false;
                class_8972.method_3936(class_100172, class_45872, (class_4597)class_45982, 0xF000F0);
                class_45872.method_22909();
            }
            class_45982.method_22993();
        }
        finally {
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            RenderSystem.disableBlend();
        }
    }

    public static /* bridge */ /* synthetic */ p a() {
        return a;
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return this.c.a();
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
    }
}

