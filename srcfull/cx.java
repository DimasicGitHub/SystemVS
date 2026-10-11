/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2394;
import net.minecraft.class_2396;
import net.minecraft.class_2398;
import net.minecraft.class_2680;
import net.minecraft.class_702;
import net.minecraft.class_703;

@jB(value=class_702.class)
public class cx {
    private static final hW<hl> a = new hW(hl.class);

    @hz(method="method_3056", desc="(Lnet/minecraft/class_2394;DDDDDD)Lnet/minecraft/class_703;", at=iD.REPLACE)
    public static class_703 a(class_702 class_7022, class_2394 class_23942, double d2, double d3, double d4, double d5, double d6, double d7) {
        hl hl2 = (hl)a.a();
        if (hl2 != null) {
            class_2396 class_23962 = class_23942.method_10295();
            if (hl2.t() && (class_23962 == class_2398.field_11236 || class_23962 == class_2398.field_11221)) {
                return null;
            }
            if (hl2.u() && (class_23962 == class_2398.field_11217 || class_23962 == class_2398.field_35434 || class_23962 == class_2398.field_54870)) {
                return null;
            }
            if (hl2.n() && (class_23962 == class_2398.field_11238 || class_23962 == class_2398.field_11247 || class_23962 == class_2398.field_11241 || class_23962 == class_2398.field_11243 || class_23962 == class_2398.field_11210 || class_23962 == class_2398.field_11202 || class_23962 == class_2398.field_11244)) {
                return null;
            }
        }
        return (class_703)bP.a(class_7022, class_23942, d2, d3, d4, d5, d6, d7);
    }

    @hz(method="method_3054", desc="(Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)V", at=iD.CANCELLABLE)
    public static boolean a(class_702 class_7022, class_2338 class_23382, class_2350 class_23502) {
        hl hl2 = (hl)a.a();
        return hl2 == null || !hl2.u();
    }

    @hz(method="method_3046", desc="(Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;)V", at=iD.CANCELLABLE)
    public static boolean a(class_702 class_7022, class_2338 class_23382, class_2680 class_26802) {
        hl hl2 = (hl)a.a();
        return hl2 == null || !hl2.u();
    }
}

