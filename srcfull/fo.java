/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_636;
import net.minecraft.class_746;

@jB(value=class_636.class)
public class fo {
    @hz(method="method_2905", desc="(Lnet/minecraft/class_1657;Lnet/minecraft/class_1297;Lnet/minecraft/class_1268;)Lnet/minecraft/class_1269;", at=iD.REPLACE)
    public static class_1269 a(class_636 class_6362, class_1657 class_16572, class_1297 class_12972, class_1268 class_12682) {
        aW aW2 = hW.a();
        if (aW2 != null && class_16572 != null && class_12972 != null) {
            try {
                class_1269 class_12692 = aW2.b(class_16572, class_16572.method_37908(), class_12682, class_12972, null);
                if (class_12692 != class_1269.field_5811) {
                    return class_12692;
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return (class_1269)bP.a(class_6362, class_16572, class_12972, class_12682);
    }

    @hz(method="method_2917", desc="(Lnet/minecraft/class_1657;Lnet/minecraft/class_1297;Lnet/minecraft/class_3966;Lnet/minecraft/class_1268;)Lnet/minecraft/class_1269;", at=iD.REPLACE)
    public static class_1269 a(class_636 class_6362, class_1657 class_16572, class_1297 class_12972, class_3966 class_39662, class_1268 class_12682) {
        aW aW2 = hW.a();
        if (aW2 != null && class_16572 != null && class_12972 != null) {
            try {
                class_1269 class_12692 = aW2.b(class_16572, class_16572.method_37908(), class_12682, class_12972, class_39662);
                if (class_12692 != class_1269.field_5811) {
                    return class_12692;
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return (class_1269)bP.a(class_6362, class_16572, class_12972, class_39662, class_12682);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @hz(method="method_2919", desc="(Lnet/minecraft/class_1657;Lnet/minecraft/class_1268;)Lnet/minecraft/class_1269;", at=iD.REPLACE)
    public static class_1269 a(class_636 class_6362, class_1657 class_16572, class_1268 class_12682) {
        Float f2 = eM.a();
        if (f2 == null || class_16572 == null) {
            return (class_1269)bP.a(class_6362, class_16572, class_12682);
        }
        float f3 = class_16572.method_36455();
        float f4 = class_16572.field_6004;
        try {
            class_16572.method_36457(f2.floatValue());
            class_16572.field_6004 = f2.floatValue();
            class_1269 class_12692 = (class_1269)bP.a(class_6362, class_16572, class_12682);
            return class_12692;
        }
        finally {
            class_16572.method_36457(f3);
            class_16572.field_6004 = f4;
        }
    }

    @hz(method="method_2918", desc="(Lnet/minecraft/class_1657;Lnet/minecraft/class_1297;)V", at=iD.HEAD)
    public static void a(class_636 class_6362, class_1657 class_16572, class_1297 class_12972) {
        aW aW2 = hW.a();
        if (aW2 == null || class_16572 == null || class_12972 == null) {
            return;
        }
        try {
            aW2.a(class_16572, class_16572.method_37908(), class_1268.field_5808, class_12972, null);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    @hz(method="method_2896", desc="(Lnet/minecraft/class_746;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Lnet/minecraft/class_1269;", at=iD.REPLACE)
    public static class_1269 a(class_636 class_6362, class_746 class_7462, class_1268 class_12682, class_3965 class_39652) {
        aW aW2 = hW.a();
        if (aW2 != null && class_7462 != null) {
            try {
                class_1269 class_12692 = aW2.a((class_1657)class_7462, class_7462.method_37908(), class_12682, class_39652);
                if (class_12692 != class_1269.field_5811) {
                    return class_12692;
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return (class_1269)bP.a(class_6362, class_7462, class_12682, class_39652);
    }
}

