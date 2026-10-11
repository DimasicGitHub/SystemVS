/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1297;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3959;
import net.minecraft.class_3965;

public class ij {
    public static /* bridge */ /* synthetic */ boolean a(class_243 class_2432, class_243 class_2433) {
        if (lo.aM.field_1687 == null) {
            return false;
        }
        if (class_2433.method_1025(class_2432) < 1.0E-4) {
            return false;
        }
        class_3959 class_39592 = new class_3959(class_2433, class_2432, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)lo.aM.field_1724);
        class_3965 class_39652 = lo.aM.field_1687.method_17742(class_39592);
        return class_39652.method_17783() != class_239.class_240.field_1333;
    }
}

