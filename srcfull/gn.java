/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_10014;
import net.minecraft.class_1297;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_892;

@jB(value=class_892.class)
public class gn {
    public static volatile class_1297 a = null;
    private static final hW<h> b = new hW(h.class);

    @hz(method="method_3908", desc="(Lnet/minecraft/class_10014;Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;I)V", at=iD.REPLACE)
    public static void a(class_892 class_8922, class_10014 class_100142, class_4587 class_45872, class_4597 class_45972, int n2) {
        boolean bl2;
        h h2 = (h)b.a();
        boolean bl3 = bl2 = h2 != null && a != null && h2.a(a);
        if (bl2 && h2.a().a()) {
            float f2 = (float)h2.a().d() / 2.0f;
            float f3 = (float)h2.b().d();
            float f4 = (float)h2.c().d();
            class_45872.method_22903();
            class_45872.method_46416(f3, f4, 0.0f);
            class_45872.method_22905(f2, f2, f2);
            bP.a(class_8922, class_100142, class_45872, class_45972, n2);
            class_45872.method_22909();
        } else {
            bP.a(class_8922, class_100142, class_45872, class_45972, n2);
        }
    }
}

