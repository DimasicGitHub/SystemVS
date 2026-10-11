/*
 * Decompiled with CFR 0.152.
 */
import java.util.UUID;
import net.minecraft.class_2596;
import net.minecraft.class_2720;
import net.minecraft.class_2856;

public class ag
extends aT {
    public /* synthetic */ ag() {
        super("\u0420\u041f\u0417\u043f\u043e\u043e\u0444\u0435\u0440", fV.c);
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
    }

    @Override
    public /* bridge */ /* synthetic */ void a(lx lx2) {
        if (lx2.a() != iG.b) {
            return;
        }
        class_2596 class_25962 = lx2.a();
        if (!(class_25962 instanceof class_2720)) {
            return;
        }
        class_2720 class_27202 = (class_2720)class_25962;
        lx2.a(true);
        class_25962 = ha.a();
        if (class_25962 == null || !class_25962.method_10758()) {
            return;
        }
        UUID uUID = class_27202.comp_2158();
        class_25962.method_10743((class_2596)new class_2856(uUID, class_2856.class_2857.field_13016));
        class_25962.method_10743((class_2596)new class_2856(uUID, class_2856.class_2857.field_13017));
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
    }
}

