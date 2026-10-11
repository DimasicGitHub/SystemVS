/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.BiFunction;
import net.minecraft.class_332;
import net.minecraft.class_342;
import net.minecraft.class_408;
import net.minecraft.class_5481;

@jB(value=class_408.class)
public class hs {
    private static final hW<fG> a = new hW(fG.class);
    private static final hW<dd> b = new hW(dd.class);
    private static final long c = gy.a(class_408.class, class_342.class);
    private static final long d = gy.a(class_342.class, BiFunction.class);
    private static final ThreadLocal<BiFunction<String, Integer, class_5481>> e = new ThreadLocal();

    @hz(method="method_25394", desc="(Lnet/minecraft/class_332;IIF)V", at=iD.TAIL)
    public static void b(class_408 class_4082, class_332 class_3322, int n2, int n3, float f2) {
        if (b.a() != null && !gd.h()) {
            fk.a().a(class_3322, 1.0f);
        }
        int n4 = n3;
        int n5 = n2;
        class_332 class_3323 = class_3322;
        L.a(n5, class_3323, n4);
        BiFunction<String, Integer, class_5481> biFunction = e.get();
        if (biFunction == null) {
            return;
        }
        e.remove();
        class_342 class_3422 = (class_342)gy.a(class_4082, c);
        if (class_3422 == null) {
            return;
        }
        class_3422.method_1854(biFunction);
    }

    @hz(method="method_25394", desc="(Lnet/minecraft/class_332;IIF)V", at=iD.HEAD)
    public static void a(class_408 class_4082, class_332 class_3322, int n2, int n3, float f2) {
        fG fG2 = (fG)a.a();
        if (fG2 == null || !fG2.b()) {
            return;
        }
        class_342 class_3422 = (class_342)gy.a(class_4082, c);
        if (class_3422 == null) {
            return;
        }
        String string2 = class_3422.method_1882();
        if (string2 == null || string2.isEmpty()) {
            return;
        }
        int[] nArray = fG2.a(string2);
        if (nArray == null || nArray[1] <= nArray[0]) {
            return;
        }
        BiFunction biFunction = (BiFunction)gy.a(class_3422, d);
        if (biFunction == null) {
            return;
        }
        int n5 = nArray[0];
        int n6 = nArray[1];
        BiFunction biFunction2 = biFunction;
        BiFunction<String, Integer, class_5481> biFunction3 = (string, n4) -> {
            if (string == null || string.isEmpty()) {
                return (class_5481)biFunction2.apply(string, n4);
            }
            int n5 = n4 == null ? 0 : n4;
            int n6 = n5 + string.length();
            if (n6 <= n5 || n5 >= n6) {
                return (class_5481)biFunction2.apply(string, n4);
            }
            StringBuilder stringBuilder = new StringBuilder(string.length());
            for (int i2 = 0; i2 < string.length(); ++i2) {
                int n7 = n5 + i2;
                char c2 = string.charAt(i2);
                if (n7 >= n5 && n7 < n6 && !Character.isWhitespace(c2)) {
                    stringBuilder.append('*');
                    continue;
                }
                stringBuilder.append(c2);
            }
            return (class_5481)biFunction2.apply(stringBuilder.toString(), n4);
        };
        e.set(biFunction);
        class_3422.method_1854(biFunction3);
    }
}

