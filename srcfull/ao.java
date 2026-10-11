/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.base.Suppliers;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import net.minecraft.class_10149;
import net.minecraft.class_10156;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_310;
import net.minecraft.class_5944;
import net.minecraft.class_9801;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ao {
    private static final float a = 0.02f;
    private static final float b = 0.03f;
    private static final float c = 0.04f;
    private static final float d = 12.0f;
    private static final float e = 18.0f;
    private static final float f = 0.0f;
    private static final class_10156 g = iS.a("text", class_290.field_1575, class_10149.field_53930);
    private static final class_10156 h = iS.a("text_blur", class_290.field_1575, class_10149.field_53930);
    private static final Supplier<hZ> i = ao.a("a");
    private static final Supplier<hZ> j = ao.a("aa");
    private static final Supplier<hZ> k = ao.a("b");
    private static final Supplier<hZ> l = ao.a("bb");
    private static final Supplier<hZ> m = ao.a("c");
    private static final Supplier<hZ> n = ao.a("cc");
    private static final int o = 1024;
    private static final Map<bF, Float> p = new HashMap<bF, Float>(256);
    private static hZ q;
    private static String r;
    private static int s;
    private static float t;
    private static int u;
    private static final LinkedHashMap<jd, eU> v;
    private static final eU w;
    private static final aB x;

    static {
        v = new LinkedHashMap();
        w = new eU();
        x = new aB();
    }

    public static void b(Matrix4f matrix4f, String string, float f2, float f3, float f4, int n2, float f5) {
        float f6 = f5;
        int n3 = n2;
        float f7 = ao.a(f4);
        float f8 = f4;
        float f9 = f3;
        float f10 = f2;
        String string2 = string;
        Matrix4f matrix4f2 = matrix4f;
        hZ hZ2 = j.get();
        ao.a(f7, f6, f10, n3, matrix4f2, f9, string2, f8, hZ2);
    }

    private static float b(float f2) {
        float f3 = f2;
        float f4 = 0.03f;
        return ao.a(f3, f4);
    }

    public static void b() {
        if (u > 0 && --u == 0) {
            ao.c();
        }
    }

    public static void c() {
        for (Map.Entry<jd, eU> entry : v.entrySet()) {
            eU eU2 = entry.getValue();
            if (eU2.b == 0) continue;
            int n2 = eU2.b;
            float[] fArray = eU2.a;
            float f2 = 0.0f;
            float f3 = entry.getKey().a();
            hZ hZ2 = entry.getKey().a();
            class_10156 class_101562 = g;
            ao.a(f3, n2, f2, hZ2, fArray, class_101562);
            eU2.b = 0;
        }
    }

    private static float c(float f2) {
        float f3 = f2;
        float f4 = 0.04f;
        return ao.a(f3, f4);
    }

    public static void c(Matrix4f matrix4f, String string, float f2, float f3, float f4, int n2, float f5) {
        float f6 = f5;
        int n3 = n2;
        float f7 = ao.c(f4);
        float f8 = f4;
        float f9 = f3;
        float f10 = f2;
        String string2 = string;
        Matrix4f matrix4f2 = matrix4f;
        hZ hZ2 = n.get();
        ao.a(f7, f6, f10, n3, matrix4f2, f9, string2, f8, hZ2);
    }

    public static float d(float f2) {
        return f2 * 1.2f;
    }

    public static void a(float f2, float f3, float f4, String[] stringArray, float f5, int n2, Matrix4f matrix4f, float f6) {
        float f7 = f3;
        int n3 = n2;
        float f8 = ao.a(f5);
        float f9 = f4;
        float f10 = f5;
        float f11 = f2;
        float f12 = f6;
        String[] stringArray2 = stringArray;
        Matrix4f matrix4f2 = matrix4f;
        hZ hZ2 = i.get();
        ao.a(f9, hZ2, matrix4f2, f11, f12, stringArray2, n3, f8, f10, f7);
    }

    private static boolean a(String string, hZ hZ2) {
        if (hZ2 == null || string == null || string.isEmpty()) {
            return false;
        }
        return hZ2.a() != null && hZ2.a() != null && hZ2.a() != 0;
    }

    public static void a(int n2, float f2, String[] stringArray, Matrix4f matrix4f, float f3, float f4, float f5, float f6) {
        float f7 = f2;
        int n3 = n2;
        float f8 = ao.b(f6);
        float f9 = f4;
        float f10 = f6;
        float f11 = f5;
        float f12 = f3;
        String[] stringArray2 = stringArray;
        Matrix4f matrix4f2 = matrix4f;
        hZ hZ2 = k.get();
        ao.a(f9, hZ2, matrix4f2, f11, f12, stringArray2, n3, f8, f10, f7);
    }

    public static float a(float f2, float f3, String[] stringArray) {
        float f4 = f2;
        float f5 = f3;
        String[] stringArray2 = stringArray;
        hZ hZ2 = i.get();
        List list = ao.a(f5, stringArray2, hZ2, f4);
        if (list.isEmpty()) {
            return 0.0f;
        }
        return (float)list.size() * ao.d(f3);
    }

    public static float a(float f2, String[] stringArray) {
        float f3;
        hZ hZ2 = i.get();
        if (hZ2 == null || stringArray == null) {
            f3 = 0.0f;
        } else {
            float f4 = f2;
            int n2 = stringArray.length;
            int n3 = 0;
            String[] stringArray2 = stringArray;
            f3 = hZ2.a(stringArray2, n2, f4, n3);
        }
        return f3;
    }

    private static void a(hZ hZ2, float f2, float f3, float f4, Matrix4f matrix4f, int n2, float f5, String string, float f6, float f7) {
        float f8 = f5;
        float f9 = f2;
        String string2 = string;
        hZ hZ3 = hZ2;
        List list = ao.a(f9, hZ3, string2, f8);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            float f10 = f6;
            int n3 = n2;
            float f11 = f3;
            float f12 = f2;
            float f13 = f4 + (float)i2 * ao.d(f2);
            float f14 = f7;
            String string3 = (String)list.get(i2);
            Matrix4f matrix4f2 = matrix4f;
            hZ hZ4 = hZ2;
            ao.a(f11, f10, f14, n3, matrix4f2, f13, string3, f12, hZ4);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(float f2, int n2, float f3, hZ hZ2, float[] fArray, class_10156 class_101562) {
        if (n2 <= 0) {
            return;
        }
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA, (GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA);
        RenderSystem.disableCull();
        try {
            RenderSystem.setShaderTexture((int)0, (int)hZ2.a());
            class_5944 class_59442 = RenderSystem.setShader((class_10156)class_101562);
            if (class_59442 == null) {
                return;
            }
            float f4 = hZ2.a().c();
            float f5 = hZ2.a().b();
            String string = "AtlasSize";
            class_5944 class_59443 = class_59442;
            bS.a(string, f4, f5, class_59443);
            float f6 = hZ2.a().a();
            String string2 = "DistanceRange";
            class_5944 class_59444 = class_59442;
            bS.a(f6, class_59444, string2);
            float f7 = f2;
            String string3 = "Weight";
            class_5944 class_59445 = class_59442;
            bS.a(f7, class_59445, string3);
            if (class_101562 == h) {
                float f8 = f3;
                String string4 = "Blur";
                class_5944 class_59446 = class_59442;
                bS.a(f8, class_59446, string4);
            }
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
            for (int i2 = 0; i2 < n2; i2 += 6) {
                class_2872.method_22912(fArray[i2], fArray[i2 + 1], fArray[i2 + 2]).method_22913(fArray[i2 + 3], fArray[i2 + 4]).method_39415(Float.floatToRawIntBits(fArray[i2 + 5]));
            }
            class_9801 class_98012 = class_2872.method_60794();
            if (class_98012 != null) {
                class_286.method_43433((class_9801)class_98012);
            }
        }
        finally {
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(float f2, String string, eU eU2, float f3, Matrix4f matrix4f, hZ hZ2, float f4, int n2, float f5) {
        float f6 = f5;
        int n3 = n2;
        int n4 = ie.a(f6, n3);
        double d2 = ao.a();
        float f7 = ao.a(f3, d2);
        float f8 = ao.a(f4 + hZ2.a().d() * f2 - 1.0f, d2);
        int n5 = eU2.b + string.length() * 24;
        if (n5 > eU2.a.length) {
            eU2.a = Arrays.copyOf(eU2.a, Math.max(n5, eU2.a.length * 2));
        }
        ao.x.a = eU2;
        ao.x.b = n4;
        try {
            float f9 = 0.0f;
            float f10 = f8;
            float f11 = f7;
            float f12 = 0.0f;
            float f13 = f2;
            String string2 = string;
            aB aB2 = x;
            Matrix4f matrix4f2 = matrix4f;
            hZ2.a(f11, aB2, f13, matrix4f2, f9, f12, string2, f10);
        }
        finally {
            ao.x.a = null;
        }
    }

    private static List a(float f2, hZ hZ2, String string, float f3) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (hZ2 == null || string == null || string.isBlank()) {
            return arrayList;
        }
        if (f3 <= 0.0f) {
            arrayList.add(string);
            return arrayList;
        }
        float f4 = f2;
        String string2 = " ";
        hZ hZ3 = hZ2;
        float f5 = ao.a(f4, string2, hZ3);
        StringBuilder stringBuilder = new StringBuilder();
        float f6 = 0.0f;
        int n2 = string.length();
        int n3 = 0;
        boolean bl2 = true;
        while (n3 <= n2) {
            float f7;
            hZ hZ4;
            char c2;
            int n4;
            int n5 = n4 = n3 < n2 ? (int)string.charAt(n3) : 10;
            if (n4 == 13) {
                ++n3;
                continue;
            }
            if (n4 == 10 || n3 == n2) {
                if (!stringBuilder.isEmpty() || !bl2) {
                    arrayList.add(stringBuilder.isEmpty() ? "" : stringBuilder.toString());
                }
                stringBuilder.setLength(0);
                f6 = 0.0f;
                bl2 = false;
                if (n3 == n2) break;
                ++n3;
                continue;
            }
            if (n4 == 32 || n4 == 9) {
                ++n3;
                continue;
            }
            int n6 = n3;
            while (n3 < n2 && (c2 = string.charAt(n3)) != ' ' && c2 != '\t' && c2 != '\n' && c2 != '\r') {
                ++n3;
            }
            float f8 = f2;
            String string3 = string.substring(n6, n3);
            String string4 = string3;
            float f9 = ao.a(f8, string4, hZ4 = hZ2);
            if (f9 > f3) {
                if (!stringBuilder.isEmpty()) {
                    arrayList.add(stringBuilder.toString());
                    stringBuilder.setLength(0);
                    f6 = 0.0f;
                }
                ArrayList<String> arrayList2 = arrayList;
                float f10 = f3;
                float f11 = f2;
                String string5 = string3;
                hZ hZ5 = hZ2;
                ao.a(hZ5, arrayList2, f10, f11, string5);
                bl2 = false;
                continue;
            }
            float f12 = f7 = stringBuilder.isEmpty() ? 0.0f : f5;
            if (f6 + f7 + f9 <= f3) {
                if (f7 > 0.0f) {
                    stringBuilder.append(' ');
                }
                stringBuilder.append(string3);
                f6 += f7 + f9;
            } else {
                if (!stringBuilder.isEmpty()) {
                    arrayList.add(stringBuilder.toString());
                }
                stringBuilder.setLength(0);
                stringBuilder.append(string3);
                f6 = f9;
            }
            bl2 = false;
        }
        return arrayList;
    }

    private static void a(hZ hZ2, List list, float f2, float f3, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        float f4 = 0.0f;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            float f5 = f3;
            String string2 = String.valueOf(c2);
            hZ hZ3 = hZ2;
            float f6 = ao.a(f5, string2, hZ3);
            if (!stringBuilder.isEmpty() && f4 + f6 > f2) {
                list.add(stringBuilder.toString());
                stringBuilder.setLength(0);
                f4 = 0.0f;
            }
            stringBuilder.append(c2);
            f4 += f6;
        }
        if (!stringBuilder.isEmpty()) {
            list.add(stringBuilder.toString());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(float f2, float f3, float f4, int n2, float f5, int n3, eU eU2, Matrix4f matrix4f, String[] stringArray, int n4, hZ hZ2) {
        float f6 = f4;
        int n5 = n2;
        int n6 = ie.a(f6, n5);
        double d2 = ao.a();
        float f7 = ao.a(f3, d2);
        float f8 = ao.a(f2 + hZ2.a().d() * f5 - 1.0f, d2);
        int n7 = eU2.b + (n3 - n4) * 24;
        if (n7 > eU2.a.length) {
            eU2.a = Arrays.copyOf(eU2.a, Math.max(n7, eU2.a.length * 2));
        }
        ao.x.a = eU2;
        ao.x.b = n6;
        try {
            float f9 = 0.0f;
            float f10 = f8;
            float f11 = f7;
            float f12 = 0.0f;
            float f13 = f5;
            int n8 = n3;
            int n9 = n4;
            String[] stringArray2 = stringArray;
            aB aB2 = x;
            Matrix4f matrix4f2 = matrix4f;
            hZ2.a(aB2, stringArray2, f13, f10, matrix4f2, n8, f9, f11, n9, f12);
        }
        finally {
            ao.x.a = null;
        }
    }

    private static List a(float f2, String[] stringArray, hZ hZ2, float f3) {
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        if (hZ2 == null || stringArray == null || stringArray.length == 0) {
            return arrayList;
        }
        int n2 = stringArray.length;
        if (f3 <= 0.0f) {
            arrayList.add(new int[]{0, n2});
            return arrayList;
        }
        float f4 = f2;
        String string = " ";
        hZ hZ3 = hZ2;
        float f5 = ao.a(f4, string, hZ3);
        int n3 = -1;
        int n4 = -1;
        float f6 = 0.0f;
        int n5 = 0;
        boolean bl2 = true;
        while (n5 <= n2) {
            float f7;
            String[] stringArray2;
            int n6;
            int n7;
            int n8;
            if (n5 < n2) {
                int n9 = n5;
                String[] stringArray3 = stringArray;
                v0 = ao.a(n9, stringArray3);
            } else {
                v0 = n8 = 10;
            }
            if (n8 == 13) {
                ++n5;
                continue;
            }
            if (n8 == 10 || n5 == n2) {
                if (n3 >= 0 || !bl2) {
                    int[] nArray;
                    if (n3 >= 0) {
                        int[] nArray2 = new int[2];
                        nArray2[0] = n3;
                        nArray = nArray2;
                        nArray2[1] = n4;
                    } else {
                        int[] nArray3 = new int[2];
                        nArray3[0] = n5;
                        nArray = nArray3;
                        nArray3[1] = n5;
                    }
                    arrayList.add(nArray);
                }
                n3 = -1;
                n4 = -1;
                f6 = 0.0f;
                bl2 = false;
                if (n5 == n2) break;
                ++n5;
                continue;
            }
            if (n8 == 32 || n8 == 9) {
                ++n5;
                continue;
            }
            int n10 = n5;
            while (n5 < n2 && (n7 = ao.a(n6 = n5++, stringArray2 = stringArray)) != 32 && n7 != 9 && n7 != 10 && n7 != 13) {
            }
            String[] stringArray4 = stringArray;
            n7 = n5;
            int n11 = n7;
            float f8 = f2;
            int n12 = n10;
            float f9 = hZ2.a(stringArray4, n11, f8, n12);
            if (f9 > f3) {
                if (n3 >= 0) {
                    arrayList.add(new int[]{n3, n4});
                    n3 = -1;
                    n4 = -1;
                    f6 = 0.0f;
                }
                ArrayList<int[]> arrayList2 = arrayList;
                float f10 = f3;
                float f11 = f2;
                int n13 = n7;
                int n14 = n10;
                String[] stringArray5 = stringArray;
                hZ hZ4 = hZ2;
                ao.a(hZ4, f10, n13, f11, arrayList2, n14, stringArray5);
                bl2 = false;
                continue;
            }
            float f12 = f7 = n3 < 0 ? 0.0f : f5;
            if (f6 + f7 + f9 <= f3) {
                if (n3 < 0) {
                    n3 = n10;
                }
                n4 = n7;
                f6 += f7 + f9;
            } else {
                if (n3 >= 0) {
                    arrayList.add(new int[]{n3, n4});
                }
                n3 = n10;
                n4 = n7;
                f6 = f9;
            }
            bl2 = false;
        }
        return arrayList;
    }

    private static void a(hZ hZ2, float f2, int n2, float f3, List list, int n3, String[] stringArray) {
        int n4 = -1;
        float f4 = 0.0f;
        for (int i2 = n3; i2 < n2; ++i2) {
            float f5 = f3;
            int n5 = i2 + 1;
            int n6 = i2;
            String[] stringArray2 = stringArray;
            float f6 = hZ2.a(stringArray2, n5, f5, n6);
            if (n4 >= 0 && f4 + f6 > f2) {
                list.add(new int[]{n4, i2});
                n4 = -1;
                f4 = 0.0f;
            }
            if (n4 < 0) {
                n4 = i2;
            }
            f4 += f6;
        }
        if (n4 >= 0) {
            list.add(new int[]{n4, n2});
        }
    }

    public static void a() {
        ++u;
    }

    public static float a(int n2, String[] stringArray, float f2, int n3) {
        float f3;
        hZ hZ2 = i.get();
        if (hZ2 == null || stringArray == null) {
            f3 = 0.0f;
        } else {
            float f4 = f2;
            int n4 = n3;
            int n5 = n2;
            String[] stringArray2 = stringArray;
            f3 = hZ2.a(stringArray2, n4, f4, n5);
        }
        return f3;
    }

    public static void a(int n2, float f2, String[] stringArray, float f3, Matrix4f matrix4f, int n3, int n4, float f4, float f5) {
        float f6 = f2;
        int n5 = n4;
        float f7 = ao.b(f4);
        float f8 = f4;
        float f9 = f5;
        float f10 = f3;
        int n6 = n3;
        int n7 = n2;
        String[] stringArray2 = stringArray;
        Matrix4f matrix4f2 = matrix4f;
        hZ hZ2 = k.get();
        ao.a(hZ2, f9, f10, f6, f8, stringArray2, f7, matrix4f2, n5, n6, n7);
    }

    public static int a(float f2, float f3, String[] stringArray) {
        hZ hZ2 = i.get();
        if (hZ2 == null || stringArray == null) {
            return 0;
        }
        int n2 = stringArray.length;
        while (n2 > 0) {
            int n3;
            String[] stringArray2 = stringArray;
            float f4 = f2;
            int n4 = 0;
            if (!(hZ2.a(stringArray2, n3 = n2--, f4, n4) <= f3)) continue;
            return n2;
        }
        return 0;
    }

    private static int a(int n2, String[] stringArray) {
        String string = stringArray[n2];
        return string == null || string.isEmpty() ? -1 : (int)string.charAt(0);
    }

    private static void a(float f2, hZ hZ2, Matrix4f matrix4f, float f3, float f4, String[] stringArray, int n2, float f5, float f6, float f7) {
        float f8 = f2;
        float f9 = f6;
        String[] stringArray2 = stringArray;
        hZ hZ3 = hZ2;
        List list = ao.a(f9, stringArray2, hZ3, f8);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            int[] nArray = (int[])list.get(i2);
            float f10 = f7;
            int n3 = n2;
            float f11 = f5;
            float f12 = f6;
            float f13 = f3 + (float)i2 * ao.d(f6);
            float f14 = f4;
            int n4 = nArray[1];
            int n5 = nArray[0];
            String[] stringArray3 = stringArray;
            Matrix4f matrix4f2 = matrix4f;
            hZ hZ4 = hZ2;
            ao.a(hZ4, f13, f14, f10, f12, stringArray3, f11, matrix4f2, n3, n4, n5);
        }
    }

    private static void a(hZ hZ2, float f2, float f3, float f4, float f5, String[] stringArray, float f6, Matrix4f matrix4f, int n2, int n3, int n4) {
        if (hZ2 == null || stringArray == null || n4 >= n3) {
            return;
        }
        if (hZ2.a() == null || hZ2.a() == null || hZ2.a() == 0) {
            return;
        }
        if (u > 0) {
            float f7 = f4;
            int n5 = n2;
            float f8 = f5;
            float f9 = f2;
            float f10 = f3;
            int n6 = n3;
            int n7 = n4;
            String[] stringArray2 = stringArray;
            Matrix4f matrix4f2 = matrix4f;
            hZ hZ3 = hZ2;
            eU eU2 = v.computeIfAbsent(new jd(hZ2, f6), jd2 -> new eU());
            ao.a(f9, f10, f7, n5, f8, n6, eU2, matrix4f2, stringArray2, n7, hZ3);
            return;
        }
        float f11 = f4;
        int n8 = n2;
        float f12 = f5;
        float f13 = f2;
        float f14 = f3;
        int n9 = n3;
        int n10 = n4;
        String[] stringArray3 = stringArray;
        Matrix4f matrix4f3 = matrix4f;
        hZ hZ4 = hZ2;
        eU eU3 = w;
        ao.a(f13, f14, f11, n8, f12, n9, eU3, matrix4f3, stringArray3, n10, hZ4);
        int n11 = ao.w.b;
        float[] fArray = ao.w.a;
        float f15 = 0.0f;
        float f16 = f6;
        hZ hZ5 = hZ2;
        class_10156 class_101562 = g;
        ao.a(f16, n11, f15, hZ5, fArray, class_101562);
        ao.w.b = 0;
    }

    public static void a(float f2, float f3, int n2, float f4, float f5, String string, Matrix4f matrix4f) {
        float f6 = f5;
        int n3 = n2;
        float f7 = ao.b(f4);
        float f8 = f4;
        float f9 = f2;
        float f10 = f3;
        String string2 = string;
        Matrix4f matrix4f2 = matrix4f;
        hZ hZ2 = k.get();
        ao.a(f7, f6, f10, n3, matrix4f2, f9, string2, f8, hZ2);
    }

    public static void a(Matrix4f matrix4f, float f2, float f3, int n2, float f4, String string, float f5, float f6) {
        float f7 = f4;
        float f8 = f3;
        int n3 = n2;
        float f9 = ao.a(f5);
        float f10 = f5;
        float f11 = f2;
        float f12 = f6;
        String string2 = string;
        Matrix4f matrix4f2 = matrix4f;
        hZ hZ2 = j.get();
        ao.a(f8, f11, string2, f9, f7, f12, f10, n3, matrix4f2, hZ2);
    }

    public static void a(int n2, String string, float f2, Matrix4f matrix4f, float f3, float f4, float f5, float f6) {
        float f7 = f2;
        float f8 = f4;
        int n3 = n2;
        float f9 = ao.a(f5);
        float f10 = f5;
        float f11 = f3;
        float f12 = f6;
        String string2 = string;
        Matrix4f matrix4f2 = matrix4f;
        hZ hZ2 = i.get();
        ao.a(f8, f11, string2, f9, f7, f12, f10, n3, matrix4f2, hZ2);
    }

    public static void a(float f2, String string, float f3, float f4, int n2, float f5, Matrix4f matrix4f) {
        float f6 = f2;
        int n3 = n2;
        float f7 = ao.b(f3);
        float f8 = f3;
        float f9 = f5;
        float f10 = f4;
        String string2 = string;
        Matrix4f matrix4f2 = matrix4f;
        hZ hZ2 = l.get();
        ao.a(f7, f6, f10, n3, matrix4f2, f9, string2, f8, hZ2);
    }

    public static float a(float f2, String string) {
        float f3 = f2;
        String string2 = string;
        hZ hZ2 = j.get();
        return ao.a(f3, string2, hZ2);
    }

    public static void a(float f2, String string, float f3, float f4, Matrix4f matrix4f, float f5, float f6, int n2) {
        float f7 = f2;
        int n3 = n2;
        float f8 = ao.a(f4);
        float f9 = f5;
        float f10 = f4;
        float f11 = f6;
        float f12 = f3;
        String string2 = string;
        Matrix4f matrix4f2 = matrix4f;
        hZ hZ2 = i.get();
        ao.a(hZ2, f10, f8, f11, matrix4f2, n3, f9, string2, f7, f12);
    }

    private static double a() {
        class_310 class_3102 = class_310.method_1551();
        if (class_3102 == null || class_3102.method_22683() == null) {
            return 1.0;
        }
        double d2 = class_3102.method_22683().method_4495();
        return d2 > 0.0 ? d2 : 1.0;
    }

    private static float a(float f2, double d2) {
        return (float)((double)Math.round((double)f2 * d2) / d2);
    }

    private static Supplier a(String string) {
        return Suppliers.memoize(() -> hZ.a().a(string).b(string).a());
    }

    private static float a(float f2, String string, hZ hZ2) {
        if (hZ2 == null || string == null || string.isEmpty()) {
            return 0.0f;
        }
        int n2 = Float.floatToRawIntBits(f2);
        if (hZ2 == q && n2 == s && string == r) {
            return t;
        }
        bF bF2 = new bF(hZ2, string, n2);
        Float f3 = p.get((Object)bF2);
        if (f3 != null) {
            q = hZ2;
            r = string;
            s = n2;
            t = f3.floatValue();
            return f3.floatValue();
        }
        if (p.size() >= 1024) {
            p.clear();
        }
        float f4 = hZ2.a(string, f2);
        p.put(bF2, Float.valueOf(f4));
        q = hZ2;
        r = string;
        s = n2;
        t = f4;
        return f4;
    }

    public static void a(Matrix4f matrix4f, String string, float f2, float f3, float f4, int n2, float f5) {
        float f6 = f5;
        int n3 = n2;
        float f7 = ao.a(f4);
        float f8 = f4;
        float f9 = f3;
        float f10 = f2;
        String string2 = string;
        Matrix4f matrix4f2 = matrix4f;
        hZ hZ2 = i.get();
        ao.a(f7, f6, f10, n3, matrix4f2, f9, string2, f8, hZ2);
    }

    public static void a(int n2, float f2, float f3, Matrix4f matrix4f, float f4, float f5, String string) {
        float f6 = f2;
        int n3 = n2;
        float f7 = ao.c(f5);
        float f8 = f5;
        float f9 = f3;
        float f10 = f4;
        String string2 = string;
        Matrix4f matrix4f2 = matrix4f;
        hZ hZ2 = m.get();
        ao.a(f7, f6, f10, n3, matrix4f2, f9, string2, f8, hZ2);
    }

    public static float a(float f2, hZ hZ2, String string) {
        float f3 = f2;
        String string2 = string;
        hZ hZ3 = hZ2;
        return ao.a(f3, string2, hZ3);
    }

    public static float a(float f2, float f3, String string) {
        float f4 = f2;
        float f5 = f3;
        String string2 = string;
        hZ hZ2 = i.get();
        List list = ao.a(f5, hZ2, string2, f4);
        if (list.isEmpty()) {
            return 0.0f;
        }
        return (float)list.size() * ao.d(f3);
    }

    private static float a(float f2, float f3) {
        float f4 = f2 * (float)ao.a();
        if (f4 <= 12.0f) {
            return 0.0f;
        }
        if (f4 >= 18.0f) {
            return f3;
        }
        float f5 = (f4 - 12.0f) / 6.0f;
        return f3 * f5;
    }

    private static float a(float f2) {
        float f3 = f2;
        float f4 = 0.02f;
        return ao.a(f3, f4);
    }

    private static void a(float f2, float f3, float f4, int n2, Matrix4f matrix4f, float f5, String string, float f6, hZ hZ2) {
        String string2 = string;
        hZ hZ3 = hZ2;
        if (!ao.a(string2, hZ3)) {
            return;
        }
        if (u > 0) {
            float f7 = f3;
            int n3 = n2;
            float f8 = f6;
            float f9 = f5;
            float f10 = f4;
            String string3 = string;
            Matrix4f matrix4f2 = matrix4f;
            hZ hZ4 = hZ2;
            eU eU2 = v.computeIfAbsent(new jd(hZ2, f2), jd2 -> new eU());
            ao.a(f8, string3, eU2, f10, matrix4f2, hZ4, f9, n3, f7);
            return;
        }
        float f11 = f3;
        int n4 = n2;
        float f12 = f6;
        float f13 = f5;
        float f14 = f4;
        String string4 = string;
        Matrix4f matrix4f3 = matrix4f;
        hZ hZ5 = hZ2;
        eU eU3 = w;
        ao.a(f12, string4, eU3, f14, matrix4f3, hZ5, f13, n4, f11);
        int n5 = ao.w.b;
        float[] fArray = ao.w.a;
        float f15 = 0.0f;
        float f16 = f2;
        hZ hZ6 = hZ2;
        class_10156 class_101562 = g;
        ao.a(f16, n5, f15, hZ6, fArray, class_101562);
        ao.w.b = 0;
    }

    private static void a(float f2, float f3, String string, float f4, float f5, float f6, float f7, int n2, Matrix4f matrix4f, hZ hZ2) {
        String string2 = string;
        hZ hZ3 = hZ2;
        if (!ao.a(string2, hZ3)) {
            return;
        }
        if (f5 <= 0.001f) {
            float f8 = f2;
            int n3 = n2;
            float f9 = f4;
            float f10 = f7;
            float f11 = f3;
            float f12 = f6;
            String string3 = string;
            Matrix4f matrix4f2 = matrix4f;
            hZ hZ4 = hZ2;
            ao.a(f9, f8, f12, n3, matrix4f2, f11, string3, f10, hZ4);
            return;
        }
        ao.c();
        float f13 = f2;
        int n4 = n2;
        float f14 = f7;
        float f15 = f3;
        float f16 = f6;
        String string4 = string;
        Matrix4f matrix4f3 = matrix4f;
        hZ hZ5 = hZ2;
        eU eU2 = w;
        ao.a(f14, string4, eU2, f16, matrix4f3, hZ5, f15, n4, f13);
        int n5 = ao.w.b;
        float[] fArray = ao.w.a;
        float f17 = Math.clamp((float)f5, (float)0.0f, (float)1.0f);
        float f18 = f4;
        hZ hZ6 = hZ2;
        class_10156 class_101562 = h;
        ao.a(f18, n5, f17, hZ6, fArray, class_101562);
        ao.w.b = 0;
    }

    public static void a(float f2, float f3, int n2, float f4, Matrix4f matrix4f, String string, float f5, float f6) {
        float f7 = f5;
        int n3 = n2;
        float f8 = ao.b(f6);
        float f9 = f4;
        float f10 = f6;
        float f11 = f3;
        float f12 = f2;
        String string2 = string;
        Matrix4f matrix4f2 = matrix4f;
        hZ hZ2 = k.get();
        ao.a(hZ2, f10, f8, f11, matrix4f2, n3, f9, string2, f7, f12);
    }

    public static void a(Matrix4f matrix4f, float f2, float f3, String string, float f4, int n2, float f5, float f6) {
        float f7 = f2;
        int n3 = n2;
        float f8 = ao.c(f4);
        float f9 = f5;
        float f10 = f4;
        float f11 = f6;
        float f12 = f3;
        String string2 = string;
        Matrix4f matrix4f2 = matrix4f;
        hZ hZ2 = m.get();
        ao.a(hZ2, f10, f8, f11, matrix4f2, n3, f9, string2, f7, f12);
    }

    public static void a(String string, float f2, Matrix4f matrix4f, int n2, float f3, hZ hZ2, float f4) {
        float f5 = 1.0f;
        int n3 = n2;
        float f6 = ao.a(f2);
        float f7 = f2;
        float f8 = f4;
        float f9 = f3;
        String string2 = string;
        Matrix4f matrix4f2 = matrix4f;
        hZ hZ3 = hZ2;
        ao.a(f6, f5, f9, n3, matrix4f2, f8, string2, f7, hZ3);
    }

    public static void a(hZ hZ2, float f2, String string, int n2, Matrix4f matrix4f, float f3, float f4, float f5) {
        float f6 = f5;
        int n3 = n2;
        float f7 = ao.a(f3);
        float f8 = f3;
        float f9 = f4;
        float f10 = f2;
        String string2 = string;
        Matrix4f matrix4f2 = matrix4f;
        hZ hZ3 = hZ2;
        ao.a(f7, f6, f10, n3, matrix4f2, f9, string2, f8, hZ3);
    }

    public static float a(String string, float f2) {
        float f3 = f2;
        String string2 = string;
        hZ hZ2 = i.get();
        return ao.a(f3, string2, hZ2);
    }
}

