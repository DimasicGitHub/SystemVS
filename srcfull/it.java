/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_276;

@jB(value=class_276.class)
public class it {
    @hz(method="method_1235", desc="(Z)V", at=iD.CANCELLABLE)
    public static boolean a(class_276 class_2762, boolean bl2) {
        if (aL.a()) {
            class_276 class_2763 = aL.a();
            if (class_2763 == null) {
                class_2763 = kO.a();
            }
            if (class_2763 == null || class_2762 == class_2763) {
                return true;
            }
            class_2763.method_1235(bl2);
            return false;
        }
        if (iw.a()) {
            class_276 class_2764 = dk.a();
            if (class_2764 == null || class_2762 == class_2764) {
                return true;
            }
            class_2764.method_1235(bl2);
            return false;
        }
        return true;
    }
}

