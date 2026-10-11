/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_4587;
import net.minecraft.class_745;
import net.minecraft.class_9801;
import org.joml.Matrix4f;

public class jq
extends ho {
    private /* synthetic */ jh a;
    private /* synthetic */ lw b;
    private /* synthetic */ lw c;

    public /* synthetic */ jq() {
        super("\u0424\u0430\u043a\u0435\u041b\u0430\u0433", fV.b);
        jh jh2 = new jh("", "", Arrays.asList(ec.join(new String[]{"\u041c", "\u043e", "\u0434", "\u0435", "\u043b", "\u044c"}), ec.join(new String[]{"\u0411", "\u043e", "\u043a", "\u0441"})), List.of(ec.join(new String[]{"\u041c", "\u043e", "\u0434", "\u0435", "\u043b", "\u044c"})), false);
        jh2.setNameParts(new String[]{"\u0420", "e", "\u0436", "\u0438", "\u043c", " ", "o", "\u0442", "\u043e", "\u0431", "\u0440", "\u0430", "\u0436", "\u0435", "\u043d", "\u0438", "\u044f"});
        jh2.setDescriptionParts(new String[]{"M", "\u043e", "\u0434", "\u0435", "\u043b", "\u044c", " ", "\u0438", "\u043b", "\u0438", " ", "\u0431", "o", "\u043a", "\u0441"});
        this.a = jh2;
        lw lw2 = new lw("", "", 675592960, true);
        lw2.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u0431", "o", "\u043a", "\u0441", "\u0430"});
        lw2.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u0437", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0438", " ", "\u0431", "o", "\u043a", "\u0441", "\u0430"});
        this.b = lw2;
        lw lw3 = new lw("", "", -16777216, true);
        lw3.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "o", "\u0431", "\u0432", "\u043e", "\u0434", "\u043a", "\u0438"});
        lw3.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "o", "\u0431", "\u0432", "\u043e", "\u0434", "\u043a", "\u0438", " ", "\u0431", "o", "\u043a", "\u0441", "\u0430"});
        this.c = lw3;
        this.b.a(() -> this.a.b("\u0411\u043e\u043a\u0441"));
        this.c.a(() -> this.a.b("\u0411\u043e\u043a\u0441"));
        this.a(this.d, this.e, this.a, this.b, this.c);
    }

    @Override
    public /* bridge */ /* synthetic */ void f(H h2) {
        if (this.z() || !this.e.a() || !this.j.a() || this.a().field_1690.method_31044().method_31034()) {
            return;
        }
        if (this.a.b("\u041c\u043e\u0434\u0435\u043b\u044c")) {
            this.j.a(h2);
        } else {
            this.a(h2);
        }
    }

    private /* bridge */ /* synthetic */ void a(H h2) {
        class_243 class_2432 = this.j.a();
        class_745 class_7452 = this.j.a();
        if (class_2432 == null || class_7452 == null) {
            return;
        }
        class_4587 class_45872 = h2.a();
        class_243 class_2433 = h2.a().method_19326();
        float f2 = class_7452.method_17681();
        float f3 = class_7452.method_17682();
        float f4 = f2 / 2.0f;
        float f5 = (float)(class_2432.field_1352 - class_2433.field_1352);
        float f6 = (float)(class_2432.field_1351 - class_2433.field_1351);
        float f7 = (float)(class_2432.field_1350 - class_2433.field_1350);
        gv.a();
        class_45872.method_22903();
        class_45872.method_46416(f5, f6, f7);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_289 class_2892 = class_289.method_1348();
        class_287 class_2872 = class_2892.method_60827(class_293.class_5596.field_27379, class_290.field_1576);
        int n2 = this.b.a();
        float f8 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        float f9 = (float)(n2 & 0xFF) / 255.0f;
        float f10 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f11 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f12 = f4;
        float f13 = f3;
        float f14 = f4;
        float f15 = -f4;
        float f16 = 0.0f;
        float f17 = -f4;
        Matrix4f matrix4f2 = matrix4f;
        class_287 class_2875 = class_2872;
        gv.a(f10, f15, f16, f14, f9, matrix4f2, f8, class_2875, f17, f12, f11, f13);
        int n3 = this.c.a();
        float f18 = (float)(n3 >> 24 & 0xFF) / 255.0f;
        float f19 = (float)(n3 & 0xFF) / 255.0f;
        float f20 = (float)(n3 >> 8 & 0xFF) / 255.0f;
        float f21 = (float)(n3 >> 16 & 0xFF) / 255.0f;
        float f22 = 0.005f;
        float f23 = f4;
        float f24 = f3;
        float f25 = f4;
        float f26 = -f4;
        float f27 = 0.0f;
        float f28 = -f4;
        Matrix4f matrix4f3 = matrix4f;
        class_287 class_2876 = class_2872;
        gv.a(f25, f18, f20, f27, matrix4f3, f28, f26, f24, class_2876, f19, f22, f23, f21);
        class_286.method_43433((class_9801)class_2872.method_60800());
        class_45872.method_22909();
        gv.b();
    }

    @Override
    protected /* bridge */ /* synthetic */ boolean a() {
        return true;
    }
}

