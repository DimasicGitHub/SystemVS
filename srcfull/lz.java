/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2960;
import net.minecraft.class_3300;
import net.minecraft.class_7923;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class lz {
    private static final class_2960 a = class_2960.method_60656((String)"__missing__");
    private static final Map<class_1792, class_2960> b = new HashMap<class_1792, class_2960>();
    private static int c;
    private static final LinkedHashMap<gE, io> d;

    private lz() {
    }

    static {
        d = new LinkedHashMap();
    }

    public static void b() {
        ++c;
    }

    private static class_2960 b(class_1792 class_17922) {
        if (class_17922 instanceof class_1747) {
            return null;
        }
        class_2960 class_29602 = class_7923.field_41178.method_10221((Object)class_17922);
        if (class_29602 == null) {
            return null;
        }
        class_2960 class_29603 = class_2960.method_60655((String)class_29602.method_12836(), (String)("textures/item/" + class_29602.method_12832() + ".png"));
        if (!lz.a(class_29603)) {
            return null;
        }
        if (lz.a(class_17922)) {
            return null;
        }
        return class_29603;
    }

    public static void c() {
        if (c > 0 && --c == 0) {
            lz.d();
        }
    }

    private static void d() {
        for (Map.Entry<gE, io> entry : d.entrySet()) {
            io io2 = entry.getValue();
            if (io2.b == 0) continue;
            int n2 = io2.b;
            float[] fArray = io2.a;
            float f2 = entry.getKey().a();
            float f3 = entry.getKey().a();
            class_2960 class_29602 = entry.getKey().a();
            iQ.a(n2, class_29602, fArray, f2, f3);
            io2.b = 0;
        }
    }

    private static void a(Matrix4f matrix4f, int n2, class_2960 class_29602, float f2, float f3, float f4) {
        io io2 = d.computeIfAbsent(new gE(class_29602, f3), gE2 -> new io());
        if (io2.b + 24 > io2.a.length) {
            io2.a = Arrays.copyOf(io2.a, io2.a.length * 2);
        }
        int n3 = n2;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = f2;
        float f8 = f4;
        Matrix4f matrix4f2 = matrix4f;
        io io3 = io2;
        lz.a(io3, f8, f7, f5, n3, f6, matrix4f2);
        int n4 = n2;
        float f9 = 1.0f;
        float f10 = 0.0f;
        float f11 = f2 + f3;
        float f12 = f4;
        Matrix4f matrix4f3 = matrix4f;
        io io4 = io2;
        lz.a(io4, f12, f11, f9, n4, f10, matrix4f3);
        int n5 = n2;
        float f13 = 1.0f;
        float f14 = 1.0f;
        float f15 = f2 + f3;
        float f16 = f4 + f3;
        Matrix4f matrix4f4 = matrix4f;
        io io5 = io2;
        lz.a(io5, f16, f15, f13, n5, f14, matrix4f4);
        int n6 = n2;
        float f17 = 0.0f;
        float f18 = 1.0f;
        float f19 = f2;
        float f20 = f4 + f3;
        Matrix4f matrix4f5 = matrix4f;
        io io6 = io2;
        lz.a(io6, f20, f19, f17, n6, f18, matrix4f5);
    }

    private static int a(float f2, int n2) {
        int n3 = Math.round((float)(n2 >>> 24 & 0xFF) * Math.clamp((float)f2, (float)0.0f, (float)1.0f));
        return n2 & 0xFFFFFF | n3 << 24;
    }

    private static void a(io io2, float f2, float f3, float f4, int n2, float f5, Matrix4f matrix4f) {
        int n3 = io2.b;
        float[] fArray = io2.a;
        fArray[n3] = matrix4f.m00() * f2 + matrix4f.m10() * f3 + matrix4f.m30();
        fArray[n3 + 1] = matrix4f.m01() * f2 + matrix4f.m11() * f3 + matrix4f.m31();
        fArray[n3 + 2] = matrix4f.m02() * f2 + matrix4f.m12() * f3 + matrix4f.m32();
        fArray[n3 + 3] = f5;
        fArray[n3 + 4] = f4;
        fArray[n3 + 5] = Float.intBitsToFloat(n2);
        io2.b = n3 + 6;
    }

    private static boolean a(class_1792 class_17922) {
        class_2960 class_29602 = class_7923.field_41178.method_10221((Object)class_17922);
        if (class_29602 == null) {
            return false;
        }
        String string = class_29602.method_12832();
        return string.equals("totem_of_undying") || string.equals("elytra") || string.equals("trident") || string.equals("mace") || string.equals("crossbow") || string.equals("bow") || string.equals("fishing_rod") || string.equals("compass") || string.equals("clock") || string.equals("shield") || string.equals("potion") || string.equals("splash_potion") || string.equals("lingering_potion") || string.equals("tipped_arrow");
    }

    public static void a() {
        b.clear();
    }

    public static boolean a(float f2, Matrix4f matrix4f, float f3, float f4, float f5, class_1799 class_17992) {
        if (class_17992 == null || class_17992.method_7960() || f3 <= 0.001f || f4 <= 0.0f) {
            return false;
        }
        class_2960 class_29602 = lz.a(class_17992.method_7909());
        if (class_29602 == null) {
            return false;
        }
        float f6 = f3;
        int n2 = -1;
        int n3 = lz.a(f6, n2);
        if (c > 0) {
            int n4 = n3;
            float f7 = f4;
            float f8 = f5;
            float f9 = f2;
            Matrix4f matrix4f2 = matrix4f;
            class_2960 class_29603 = class_29602;
            lz.a(matrix4f2, n4, class_29603, f8, f7, f9);
            return true;
        }
        float f10 = 1.0f;
        int n5 = n3;
        float f11 = 0.0f;
        float f12 = 1.0f;
        float f13 = 1.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = f4;
        float f17 = f4;
        float f18 = f5;
        float f19 = f2;
        class_2960 class_29604 = class_29602;
        Matrix4f matrix4f3 = matrix4f;
        iQ.a(f11, matrix4f3, f10, f14, f15, f17, f16, n5, f13, class_29604, f18, f19, f12);
        return true;
    }

    public static class_2960 a(class_1792 class_17922) {
        if (class_17922 == null) {
            return null;
        }
        class_2960 class_29602 = b.get(class_17922);
        if (class_29602 != null) {
            return class_29602 == a ? null : class_29602;
        }
        class_2960 class_29603 = lz.b(class_17922);
        b.put(class_17922, class_29603 == null ? a : class_29603);
        return class_29603;
    }

    private static boolean a(class_2960 class_29602) {
        try {
            class_3300 class_33002;
            class_3300 class_33003 = class_33002 = lo.aM != null ? lo.aM.method_1478() : null;
            if (class_33002 == null) {
                return false;
            }
            return class_33002.method_14486(class_29602).isPresent();
        }
        catch (Throwable throwable) {
            return false;
        }
    }
}

