/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Predicate;
import net.minecraft.class_1923;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2374;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_2480;
import net.minecraft.class_2596;
import net.minecraft.class_2626;
import net.minecraft.class_2637;
import net.minecraft.class_2664;
import net.minecraft.class_2666;
import net.minecraft.class_2672;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2769;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_2846;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_4587;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public class bs
extends aT {
    private /* synthetic */ jh a;
    private /* synthetic */ gz b;
    private /* synthetic */ dw c;
    private /* synthetic */ gz d;
    private /* synthetic */ gz e;
    private /* synthetic */ dw f;
    private /* synthetic */ dw g;
    private /* synthetic */ dw h;
    private /* synthetic */ t i;
    private final /* synthetic */ Set<class_2338> j;
    private final /* synthetic */ Set<class_2338> k;
    private final /* synthetic */ List<kM> l;
    private /* synthetic */ long m;
    private static final /* synthetic */ int[] n;
    private final /* synthetic */ Map<class_1923, Map<class_2338, class_2248>> o;
    private final /* synthetic */ Set<class_1923> p;
    private /* synthetic */ ExecutorService q;
    private final /* synthetic */ Map<class_2338, class_2248> r;
    private final /* synthetic */ float[] s;
    private /* synthetic */ class_2338 t;
    private /* synthetic */ int u;
    private /* synthetic */ int v;
    private static final /* synthetic */ float[][] w;
    private static final /* synthetic */ float[][] x;

    public /* synthetic */ bs() {
        super("\u0411\u043b\u043e\u0441\u043a\u0415\u0417\u041f", fV.d);
        jh jh2 = new jh("", "", Arrays.asList(ec.join(new String[]{"\u042f", "\u0449", "\u0438", "\u043a"}), ec.join(new String[]{"\u0423", "\u0433", "\u043b", "\u044b"}), ec.join(new String[]{"\u0417", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0430"})), List.of(ec.join(new String[]{"\u042f", "\u0449", "\u0438", "\u043a"})), false);
        jh2.setNameParts(new String[]{"\u0420", "e", "\u0436", "\u0438", "\u043c", " ", "E", "\u0421", "\u041f"});
        jh2.setDescriptionParts(new String[]{"\u0420", "e", "\u0436", "\u0438", "\u043c", " ", "o", "\u0442", "\u043e", "\u0431", "\u0440", "\u0430", "\u0436", "\u0435", "\u043d", "\u0438", "\u044f", " ", "E", "\u0421", "\u041f"});
        this.a = jh2;
        gz gz2 = new gz("", "", 0.3, 0.1, 1.0, 0.1);
        gz2.setNameParts(new String[]{"\u0420", "a", "\u0437", "\u043c", "\u0435", "\u0440", " ", "\u0443", "\u0433", "\u043b", "o", "\u0432"});
        gz2.setDescriptionParts(new String[]{"\u0420", "a", "\u0437", "\u043c", "\u0435", "\u0440", " ", "\u0443", "\u0433", "\u043b", "o", "\u0432", " ", "E", "\u0421", "\u041f"});
        this.b = gz2;
        dw dw2 = new dw("", "", false);
        dw2.setNameParts(new String[]{"\u0411", "e", "\u0437", " ", "\u043b", "\u0438", "\u043c", "\u0438", "\u0442", "a", " ", "\u0434", "a", "\u043b", "\u044c", "\u043d", "\u043e", "\u0441", "\u0442", "\u0438"});
        dw2.setDescriptionParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0432", "c", "\u0435", " ", "\u043f", "\u0440", "o", "\u0433", "\u0440", "\u0443", "\u0436", "\u0435", "\u043d", "\u043d", "\u044b", "\u0435", " ", "\u0431", "\u043b", "o", "\u043a", "\u0438", " ", "\u0431", "e", "\u0437", " ", "o", "\u0433", "\u0440", "\u0430", "\u043d", "\u0438", "\u0447", "\u0435", "\u043d", "\u0438", "\u044f", " ", "\u043f", "o", " ", "\u0434", "a", "\u043b", "\u044c", "\u043d", "\u043e", "\u0441", "\u0442", "\u0438"});
        this.c = dw2;
        gz gz3 = new gz("", "", 32.0, 16.0, 918.0, 8.0);
        gz3.setNameParts(new String[]{"\u0414", "a", "\u043b", "\u044c", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c"});
        gz3.setDescriptionParts(new String[]{"\u0414", "a", "\u043b", "\u044c", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u043f", "o", "\u0438", "\u0441", "\u043a", "\u0430", " ", "\u0431", "\u043b", "o", "\u043a", "\u043e", "\u0432"});
        this.d = gz3;
        gz gz4 = new gz("", "", 0.3, 0.1, 1.0, 0.1);
        gz4.setNameParts(new String[]{"\u041f", "\u0440", "o", "\u0437", "\u0440", "\u0430", "\u0447", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u0437", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0438"});
        gz4.setDescriptionParts(new String[]{"\u041f", "\u0440", "o", "\u0437", "\u0440", "\u0430", "\u0447", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u0437", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0438", " ", "\u0431", "\u043b", "o", "\u043a", "\u043e", "\u0432"});
        this.e = gz4;
        dw dw3 = new dw("", "", false);
        dw3.setNameParts(new String[]{"T", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u043f", "o", "\u0432", "\u0451", "\u0440", "\u043d", "\u0443", "\u0442", "\u044b", "\u0435"});
        dw3.setDescriptionParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0442", "o", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u0431", "\u043b", "o", "\u043a", "\u0438", " ", "\u043f", "o", "\u0441", "\u0442", "\u0430", "\u0432", "\u043b", "\u0435", "\u043d", "\u043d", "\u044b", "\u0435", " ", "\u0438", "\u0433", "\u0440", "o", "\u043a", "\u043e", "\u043c", " ", "(", "\u0431", "a", "\u0437", "\u0430", "\u043b", "\u044c", "\u0442", "/", "\u043b", "o", "\u0433", "\u0438", " ", "c", " ", "\u0433", "o", "\u0440", "\u0438", "\u0437", "\u043e", "\u043d", "\u0442", "\u0430", "\u043b", "\u044c", "\u043d", "\u043e", "\u0439", " ", "o", "\u0441", "\u044c", "\u044e", ")"});
        this.f = dw3;
        dw dw4 = new dw("", "", false);
        dw4.setNameParts(new String[]{"T", "\u0440", "\u0435", "\u0439", "\u0441", "\u0435", "\u0440", "\u044b"});
        dw4.setDescriptionParts(new String[]{"\u0420", "\u0438", "c", "\u043e", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0438", " ", "o", "\u0442", " ", "\u0438", "\u0433", "\u0440", "o", "\u043a", "\u0430", " ", "\u043a", " ", "\u0431", "\u043b", "o", "\u043a", "\u0430", "\u043c"});
        this.g = dw4;
        dw dw5 = new dw("", "", false);
        dw5.setNameParts(new String[]{"O", "\u0431", "\u043b", "\u043e", "\u043c", "\u043a", "\u0438", " ", "\u0447", "e", "\u0440", "\u0435", "\u0437", " ", "T", "N", "T"});
        dw5.setDescriptionParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0442", "o", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u043d", "e", "\u0437", "\u0435", "\u0440", "\u0438", "\u0442", "\u043e", "\u0432", "\u044b", "\u0435", " ", "o", "\u0431", "\u043b", "\u043e", "\u043c", "\u043a", "\u0438", ",", " ", "\u0432", "c", "\u043a", "\u0440", "\u044b", "\u0442", "\u044b", "\u0435", " ", "\u0432", "\u0437", "\u0440", "\u044b", "\u0432", "o", "\u043c", " ", "T", "N", "T"});
        this.h = dw5;
        t t2 = new t("", "");
        t2.setNameParts(new String[]{"C", "\u043f", "\u0438", "\u0441", "\u043e", "\u043a", " ", "\u0431", "\u043b", "o", "\u043a", "\u043e", "\u0432"});
        t2.setDescriptionParts(new String[]{"\u0423", "\u043f", "\u0440", "a", "\u0432", "\u043b", "\u0435", "\u043d", "\u0438", "\u0435", " ", "\u0431", "\u043b", "o", "\u043a", "\u0430", "\u043c", "\u0438", " ", "\u0434", "\u043b", "\u044f", " ", "E", "\u0421", "\u041f"});
        this.i = t2;
        this.j = ConcurrentHashMap.newKeySet();
        this.k = ConcurrentHashMap.newKeySet();
        this.l = new ArrayList<kM>();
        this.m = 0L;
        this.o = new ConcurrentHashMap<class_1923, Map<class_2338, class_2248>>();
        this.p = ConcurrentHashMap.newKeySet();
        this.r = new HashMap<class_2338, class_2248>();
        this.s = new float[3];
        this.t = null;
        this.u = -1;
        this.v = 0;
        this.a();
        this.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        this.f.b(() -> {
            this.o.clear();
            this.p.clear();
            this.r.clear();
            this.t = null;
            this.u = -1;
            this.d();
        });
        this.c.b(() -> {
            this.r.clear();
            this.t = null;
            this.u = -1;
        });
        this.b();
    }

    static {
        n = new int[]{4, 10, 20, 40};
        w = new float[][]{{0.0f, 0.0f, 0.0f}, {1.0f, 0.0f, 0.0f}, {0.0f, 0.0f, 1.0f}, {1.0f, 0.0f, 1.0f}, {0.0f, 1.0f, 0.0f}, {1.0f, 1.0f, 0.0f}, {0.0f, 1.0f, 1.0f}, {1.0f, 1.0f, 1.0f}};
        x = new float[][]{{1.0f, 1.0f, 1.0f}, {-1.0f, 1.0f, 1.0f}, {1.0f, 1.0f, -1.0f}, {-1.0f, 1.0f, -1.0f}, {1.0f, -1.0f, 1.0f}, {-1.0f, -1.0f, 1.0f}, {1.0f, -1.0f, -1.0f}, {-1.0f, -1.0f, -1.0f}};
    }

    @Override
    public /* bridge */ /* synthetic */ void i() {
        if (this.a() == null || this.b() == null) {
            return;
        }
        this.u();
        if (!this.h.a()) {
            return;
        }
        Iterator<kM> iterator = this.l.iterator();
        while (iterator.hasNext()) {
            kM kM2 = iterator.next();
            if (--kM2.b > 0) continue;
            int n2 = 28;
            class_2338 class_23383 = kM2.a;
            this.a(n2, class_23383);
            iterator.remove();
        }
        long l2 = System.currentTimeMillis();
        if (l2 - this.m > 50L) {
            for (class_2338 class_23384 : this.j) {
                if (!this.k.add(class_23384)) continue;
                if (this.a().method_1562() != null) {
                    this.a().method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12968, class_23384, class_2350.field_11036));
                    this.a().method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12971, class_23384, class_2350.field_11036));
                }
                this.m = l2;
                break;
            }
        }
        this.j.removeIf(class_23382 -> this.a().method_8320(class_23382).method_26204() != class_2246.field_22109);
    }

    private /* bridge */ /* synthetic */ void b(int n2, int n3) {
        if (this.a() == null) {
            return;
        }
        class_2818 class_28182 = this.a().method_8497(n3, n2);
        if (class_28182 == null) {
            return;
        }
        class_2826[] class_2826Array = class_28182.method_12006();
        int n4 = n3 << 4;
        int n5 = n2 << 4;
        ConcurrentHashMap<class_2338, class_2248> concurrentHashMap = new ConcurrentHashMap<class_2338, class_2248>();
        for (int i2 = 0; i2 < class_2826Array.length; ++i2) {
            class_2826 class_28262 = class_2826Array[i2];
            if (class_28262 == null || class_28262.method_38292() || !class_28262.method_19523(class_26802 -> this.a(class_26802.method_26204()) && this.c((class_2680)class_26802))) continue;
            int n6 = class_28182.method_31604(i2) << 4;
            for (int i3 = 0; i3 < 16; ++i3) {
                for (int i4 = 0; i4 < 16; ++i4) {
                    for (int i5 = 0; i5 < 16; ++i5) {
                        class_2680 class_26803 = class_28262.method_12254(i3, i4, i5);
                        if (!this.b(class_26803)) continue;
                        class_2338 class_23382 = new class_2338(n4 + i3, n6 + i4, n5 + i5);
                        concurrentHashMap.put(class_23382, class_26803.method_26204());
                    }
                }
            }
        }
        class_1923 class_19232 = new class_1923(n3, n2);
        if (concurrentHashMap.isEmpty()) {
            this.o.remove(class_19232);
        } else {
            this.o.put(class_19232, concurrentHashMap);
        }
    }

    private /* bridge */ /* synthetic */ boolean b(class_2338 class_23382) {
        int n2 = 0;
        for (int i2 = -1; i2 <= 1; ++i2) {
            for (int i3 = -1; i3 <= 1; ++i3) {
                for (int i4 = -1; i4 <= 1; ++i4) {
                    class_2248 class_22482 = this.a().method_8320(class_23382.method_10069(i2, i3, i4)).method_26204();
                    if (class_22482 != class_2246.field_10213 && class_22482 != class_2246.field_23077 || ++n2 < 4) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private /* bridge */ /* synthetic */ boolean b(class_2338 class_23382, int n2) {
        int n3 = 0;
        for (int i2 = -3; i2 <= 2; ++i2) {
            for (int i3 = -2; i3 <= 2; ++i3) {
                for (int i4 = -2; i4 <= 3; ++i4) {
                    if (this.a().method_8320(class_23382.method_10069(i2, i3, i4)).method_26204() != class_2246.field_22109 || ++n3 <= n2) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private /* bridge */ /* synthetic */ boolean b(class_2248 class_22482) {
        if (this.h.a()) {
            return class_22482 == class_2246.field_22109;
        }
        return this.i.a(bs.a(class_22482));
    }

    private /* bridge */ /* synthetic */ void b() {
        this.i.a(class_2246.field_10442, true, -16711681);
        this.i.a(class_2246.field_29029, true, -16711681);
        this.i.a(class_2246.field_10571, true, -10496);
        this.i.a(class_2246.field_29026, true, -10496);
        this.i.a(class_2246.field_23077, true, -10496);
        this.i.a(class_2246.field_33510, true, -10496);
        this.i.a(class_2246.field_10205, true, -10496);
        this.i.a(class_2246.field_22109, true, -8388480);
        this.i.a(class_2246.field_22108, true, -8388480);
        this.i.a(class_2246.field_10013, true, -16711936);
        this.i.a(class_2246.field_29220, true, -16711936);
        this.i.a(class_2246.field_10212, false, -3618616);
        this.i.a(class_2246.field_29027, false, -3618616);
        this.i.a(class_2246.field_10418, false, -13487566);
        this.i.a(class_2246.field_29219, false, -13487566);
        this.i.a(class_2246.field_10080, false, -65536);
        this.i.a(class_2246.field_29030, false, -65536);
        this.i.a(class_2246.field_10090, false, -16751361);
        this.i.a(class_2246.field_29028, false, -16751361);
        this.i.a(class_2246.field_27120, false, -29696);
        this.i.a(class_2246.field_29221, false, -29696);
        this.i.a(class_2246.field_10034, true, -7650029);
        this.i.a(class_2246.field_10380, true, -7650029);
        this.i.a(class_2246.field_10443, true, -8388480);
        this.i.a(class_2246.field_10260, true, -39836);
        this.i.a(class_2246.field_10603, true, -5635926);
    }

    private /* bridge */ /* synthetic */ boolean c(class_2680 class_26802) {
        return !this.f.a() || bs.a(class_26802);
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.o.clear();
        this.p.clear();
        this.r.clear();
        this.j.clear();
        this.k.clear();
        this.l.clear();
        if (this.q != null) {
            this.q.shutdownNow();
            this.q = null;
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void f(H h2) {
        if (this.z()) {
            return;
        }
        try {
            this.t();
            this.a(h2);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private /* bridge */ /* synthetic */ void d() {
        if (this.a() == null || this.b() == null) {
            return;
        }
        int n2 = this.a().field_1690.method_38521() + 1;
        int n3 = this.b().method_31476().field_9181;
        int n4 = this.b().method_31476().field_9180;
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                this.p.add(new class_1923(n3 + i2, n4 + i3));
            }
        }
    }

    private /* bridge */ /* synthetic */ void a(float f2, class_287 class_2872, class_4587 class_45872, float[] fArray) {
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f3 = this.b.a();
        for (int i2 = 0; i2 < w.length; ++i2) {
            float f4 = w[i2][0];
            float f5 = w[i2][1];
            float f6 = w[i2][2];
            float f7 = x[i2][0] * f3;
            float f8 = x[i2][1] * f3;
            float f9 = x[i2][2] * f3;
            float f10 = 1.0f;
            float f11 = fArray[2];
            float f12 = fArray[1];
            float f13 = fArray[0];
            float f14 = f2;
            float f15 = f4 + f7;
            float f16 = f6;
            float f17 = f5;
            float f18 = f4;
            Matrix4f matrix4f2 = matrix4f;
            class_287 class_2873 = class_2872;
            gv.a(f13, f15, f18, matrix4f2, f17, f11, f16, f10, f12, class_2873, f14);
            float f19 = 1.0f;
            float f20 = fArray[2];
            float f21 = fArray[1];
            float f22 = fArray[0];
            float f23 = f2;
            float f24 = f5 + f8;
            float f25 = f6;
            float f26 = f5;
            float f27 = f4;
            Matrix4f matrix4f3 = matrix4f;
            class_287 class_2874 = class_2872;
            gv.a(f25, f21, matrix4f3, f26, f27, f19, class_2874, f20, f23, f24, f22);
            float f28 = 1.0f;
            float f29 = fArray[2];
            float f30 = fArray[1];
            float f31 = fArray[0];
            float f32 = f2;
            float f33 = f6 + f9;
            float f34 = f6;
            float f35 = f5;
            float f36 = f4;
            Matrix4f matrix4f4 = matrix4f;
            class_287 class_2875 = class_2872;
            gv.a(matrix4f4, f31, f35, f29, f34, f32, f28, f36, f30, class_2875, f33);
        }
    }

    private /* bridge */ /* synthetic */ void a(class_2248 class_22482, float[] fArray) {
        int n2 = this.i.a(bs.a(class_22482));
        fArray[0] = (float)(n2 >> 16 & 0xFF) / 255.0f;
        fArray[1] = (float)(n2 >> 8 & 0xFF) / 255.0f;
        fArray[2] = (float)(n2 & 0xFF) / 255.0f;
    }

    private static /* bridge */ /* synthetic */ class_2248 a(class_2248 class_22482) {
        return class_22482 instanceof class_2480 ? class_2246.field_10603 : class_22482;
    }

    private /* bridge */ /* synthetic */ boolean a(class_2338 class_23382) {
        class_2338 class_23383;
        int n2;
        if (this.a() == null) {
            return false;
        }
        if (this.a().method_8320(class_23382).method_26204() != class_2246.field_22109) {
            return false;
        }
        return this.a(class_23382, 2) && !this.b(class_23382) && this.a(n2 = 4, class_23383 = class_23382) && !this.b(class_23382, 6);
    }

    private /* bridge */ /* synthetic */ boolean a(class_2338 class_23382, int n2) {
        int n3 = 0;
        for (class_2350 class_23502 : class_2350.values()) {
            class_2248 class_22482 = this.a().method_8320(class_23382.method_10093(class_23502)).method_26204();
            if (class_22482 != class_2246.field_10124 && class_22482 != class_2246.field_10164 && class_22482 != class_2246.field_10543 || ++n3 < n2) continue;
            return true;
        }
        return false;
    }

    private /* bridge */ /* synthetic */ boolean a(int n2, class_2338 class_23382) {
        int n3 = 0;
        for (int i2 = -1; i2 <= 1; ++i2) {
            for (int i3 = -1; i3 <= 1; ++i3) {
                for (int i4 = -1; i4 <= 1; ++i4) {
                    class_2248 class_22482 = this.a().method_8320(class_23382.method_10069(i2, i3, i4)).method_26204();
                    if (class_22482 != class_2246.field_10124 && class_22482 != class_2246.field_10164 && class_22482 != class_2246.field_10543 || ++n3 < n2) continue;
                    return true;
                }
            }
        }
        return n3 >= n2;
    }

    private /* bridge */ /* synthetic */ void a(int n2, int n3) {
        if (this.q == null) {
            return;
        }
        this.q.submit(() -> {
            try {
                int n4 = n3;
                int n5 = n2;
                this.b(n4, n5);
            }
            catch (Exception exception) {
                // empty catch block
            }
        });
    }

    private /* bridge */ /* synthetic */ void a(int n2, class_2338 class_23382) {
        class_2338.class_2339 class_23392 = new class_2338.class_2339();
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                for (int i4 = -n2; i4 <= n2; ++i4) {
                    class_23392.method_10103(class_23382.method_10263() + i2, class_23382.method_10264() + i3, class_23382.method_10260() + i4);
                    if (!this.a((class_2338)class_23392)) continue;
                    this.j.add(class_23392.method_10062());
                }
            }
        }
    }

    private /* bridge */ /* synthetic */ void a(class_2680 class_26802, class_2338 class_23382) {
        boolean bl2;
        class_2248 class_22482 = class_26802.method_26204();
        if (this.h.a()) {
            if (class_22482 == class_2246.field_22109) {
                if (this.a(class_23382)) {
                    this.j.add(class_23382.method_10062());
                }
            } else {
                this.j.remove(class_23382);
                this.k.remove(class_23382);
            }
            return;
        }
        class_1923 class_19233 = new class_1923(class_23382);
        boolean bl3 = bl2 = this.a(class_22482) && this.c(class_26802);
        if (bl2) {
            Map map = this.o.computeIfAbsent(class_19233, class_19232 -> new ConcurrentHashMap());
            map.put(class_23382, class_22482);
        } else {
            Map<class_2338, class_2248> map = this.o.get(class_19233);
            if (map != null) {
                map.remove(class_23382);
                if (map.isEmpty()) {
                    this.o.remove(class_19233);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public /* bridge */ /* synthetic */ void a(lx lx2) {
        if (lx2.a() != iG.b) {
            return;
        }
        if (!this.f()) {
            return;
        }
        class_2596 class_25962 = lx2.a();
        if (this.h.a() && class_25962 instanceof class_2664) {
            class_2664 class_26642 = (class_2664)class_25962;
            class_2338 class_23383 = class_2338.method_49638((class_2374)class_26642.comp_2883());
            this.a().execute(() -> {
                for (int n2 : n) {
                    this.l.add(new kM(class_23383, n2));
                }
            });
            return;
        }
        if (class_25962 instanceof class_2672) {
            class_2672 class_26722 = (class_2672)class_25962;
            this.p.add(new class_1923(class_26722.method_11523(), class_26722.method_11524()));
            return;
        }
        if (class_25962 instanceof class_2666) {
            class_1923 class_19233;
            class_2666 class_26662 = (class_2666)class_25962;
            try {
                class_1923 class_19232;
                class_19233 = class_19232 = class_26662.comp_1726();
                this.o.remove(class_19233);
            }
            catch (Throwable throwable) {
                throw new MatchException(throwable.toString(), throwable);
            }
            this.p.remove(class_19233);
            return;
        }
        if (class_25962 instanceof class_2626) {
            class_2626 class_26262 = (class_2626)class_25962;
            class_2338 class_23384 = class_26262.method_11309().method_10062();
            class_2680 class_26803 = class_26262.method_11308();
            this.a().execute(() -> {
                class_2680 class_26803 = class_26803;
                class_2338 class_23383 = class_23384;
                this.a(class_26803, class_23383);
            });
            return;
        }
        if (!(class_25962 instanceof class_2637)) return;
        class_2637 class_26372 = (class_2637)class_25962;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        class_26372.method_30621((class_23382, class_26802) -> {
            arrayList.add(class_23382.method_10062());
            arrayList2.add(class_26802);
        });
        this.a().execute(() -> {
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                class_2680 class_26802 = (class_2680)arrayList2.get(i2);
                class_2338 class_23382 = (class_2338)arrayList.get(i2);
                this.a(class_26802, class_23382);
            }
        });
    }

    private static /* bridge */ /* synthetic */ boolean a(class_2680 class_26802) {
        if (class_26802.method_28498((class_2769)class_2741.field_12496)) {
            return class_26802.method_11654((class_2769)class_2741.field_12496) != class_2350.class_2351.field_11052;
        }
        if (class_26802.method_28498((class_2769)class_2741.field_12529)) {
            return true;
        }
        if (class_26802.method_28498((class_2769)class_2741.field_12525)) {
            class_2350 class_23502 = (class_2350)class_26802.method_11654((class_2769)class_2741.field_12525);
            return class_23502 != class_2350.field_11036 && class_23502 != class_2350.field_11033;
        }
        return false;
    }

    private /* bridge */ /* synthetic */ void a(float[] fArray, class_287 class_2872, float f2, class_4587 class_45872) {
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f3 = 1.0f;
        float f4 = fArray[2];
        float f5 = fArray[1];
        float f6 = fArray[0];
        float f7 = f2;
        float f8 = 1.0f;
        float f9 = 1.0f;
        float f10 = 1.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        Matrix4f matrix4f2 = matrix4f;
        class_287 class_2873 = class_2872;
        gv.a(f10, f3, f5, f12, matrix4f2, f13, f11, f9, class_2873, f4, f7, f8, f6);
    }

    private /* bridge */ /* synthetic */ void a(H h2) {
        boolean bl2;
        class_2338 class_2338222;
        class_4587 class_45872 = h2.a();
        if (class_45872 == null) {
            return;
        }
        boolean bl3 = this.h.a();
        if (bl3) {
            if (this.j.isEmpty()) {
                return;
            }
            this.r.clear();
            for (class_2338 class_2338222 : this.j) {
                this.r.put(class_2338222, class_2246.field_22109);
            }
        } else if (this.o.isEmpty()) {
            return;
        }
        class_243 class_2432 = h2.a().method_19326();
        class_2338222 = this.b().method_24515();
        boolean bl4 = this.c.a();
        int n2 = (int)this.d.d();
        int n3 = n2 * n2;
        boolean bl5 = this.a.b("\u042f\u0449\u0438\u043a");
        boolean bl6 = this.a.b("\u0423\u0433\u043b\u044b");
        boolean bl7 = this.a.b("\u0417a\u043b\u0438\u0432\u043a\u0430");
        boolean bl8 = this.g.a();
        int n4 = bl4 ? Integer.MAX_VALUE : n2;
        boolean bl9 = n4 != this.u;
        boolean bl10 = this.t == null || class_2338222.method_10263() >> 4 != this.t.method_10263() >> 4 || class_2338222.method_10260() >> 4 != this.t.method_10260() >> 4 || Math.abs(class_2338222.method_10264() - this.t.method_10264()) > 8;
        ++this.v;
        boolean bl11 = bl2 = this.v >= 4;
        if (!bl3 && (bl9 || bl10 || bl2)) {
            this.v = 0;
            this.t = class_2338222;
            this.u = n4;
            this.r.clear();
            for (Map object : this.o.values()) {
                for (Map.Entry entry : object.entrySet()) {
                    class_2338 class_23382 = (class_2338)entry.getKey();
                    if (!bl4 && !(class_23382.method_10262((class_2382)class_2338222) <= (double)n3)) continue;
                    this.r.put(class_23382, (class_2248)entry.getValue());
                }
            }
        }
        if (this.r.isEmpty()) {
            return;
        }
        if (bl7) {
            Map<class_2338, class_2248> map = this.r;
            class_243 class_2433 = class_2432;
            class_4587 class_45873 = class_45872;
            this.a(map, class_45873, class_2433);
        }
        if (bl5 || bl6) {
            gv.a();
            class_289 class_2892 = class_289.method_1348();
            class_287 class_2872 = class_2892.method_60827(class_293.class_5596.field_27379, class_290.field_1576);
            float f2 = 0.005f;
            for (Map.Entry<class_2338, class_2248> entry : this.r.entrySet()) {
                class_2338 class_23383 = entry.getKey();
                class_2248 class_22482 = entry.getValue();
                if (!this.b(class_22482)) continue;
                class_45872.method_22903();
                class_45872.method_22904((double)class_23383.method_10263() - class_2432.field_1352, (double)class_23383.method_10264() - class_2432.field_1351, (double)class_23383.method_10260() - class_2432.field_1350);
                this.a(class_22482, this.s);
                if (bl5) {
                    float f3 = f2;
                    float[] fArray = this.s;
                    class_287 class_2873 = class_2872;
                    class_4587 class_45874 = class_45872;
                    this.a(fArray, class_2873, f3, class_45874);
                }
                if (bl6) {
                    float f4 = f2;
                    float[] fArray = this.s;
                    class_287 class_2874 = class_2872;
                    class_4587 class_45875 = class_45872;
                    this.a(f4, class_2874, class_45875, fArray);
                }
                class_45872.method_22909();
            }
            class_286.method_43433((class_9801)class_2872.method_60800());
            gv.b();
        }
        if (bl8) {
            this.a(class_45872, class_2432, h2);
        }
    }

    private /* bridge */ /* synthetic */ void a(Map map, class_4587 class_45872, class_243 class_2432) {
        gv.a();
        class_289 class_2892 = class_289.method_1348();
        class_287 class_2872 = class_2892.method_60827(class_293.class_5596.field_27379, class_290.field_1576);
        float f2 = this.e.a();
        for (Map.Entry entry : map.entrySet()) {
            class_2338 class_23382 = (class_2338)entry.getKey();
            class_2248 class_22482 = (class_2248)entry.getValue();
            if (!this.b(class_22482)) continue;
            class_45872.method_22903();
            class_45872.method_22904((double)class_23382.method_10263() - class_2432.field_1352, (double)class_23382.method_10264() - class_2432.field_1351, (double)class_23382.method_10260() - class_2432.field_1350);
            this.a(class_22482, this.s);
            Matrix4f matrix4f = class_45872.method_23760().method_23761();
            float f3 = f2;
            float f4 = this.s[2];
            float f5 = this.s[1];
            float f6 = this.s[0];
            float f7 = 1.0f;
            float f8 = 1.0f;
            float f9 = 1.0f;
            float f10 = 0.0f;
            float f11 = 0.0f;
            float f12 = 0.0f;
            Matrix4f matrix4f2 = matrix4f;
            class_287 class_2873 = class_2872;
            gv.a(f5, f10, f11, f9, f4, matrix4f2, f3, class_2873, f12, f7, f6, f8);
            class_45872.method_22909();
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
        gv.b();
    }

    private /* bridge */ /* synthetic */ void a() {
        this.b.a(() -> this.a.b("\u0423\u0433\u043b\u044b"));
        this.e.a(() -> this.a.b("\u0417a\u043b\u0438\u0432\u043a\u0430"));
        this.d.a(() -> !this.c.a());
        this.i.a(() -> !this.h.a());
        this.f.a(() -> !this.h.a());
        this.h.b(() -> {
            this.j.clear();
            this.k.clear();
            this.l.clear();
            this.c();
        });
    }

    private /* bridge */ /* synthetic */ boolean a(class_2248 class_22482) {
        return this.i.a(bs.a(class_22482));
    }

    private /* bridge */ /* synthetic */ void a(class_4587 class_45872, class_243 class_2432, H h2) {
        gv.a();
        class_287 class_2872 = gv.a(1.0f);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        Vector3f vector3f = h2.a().method_19335();
        double d2 = (double)vector3f.x * 0.5;
        double d3 = (double)vector3f.y * 0.5 - 0.1;
        double d4 = (double)vector3f.z * 0.5;
        for (Map.Entry<class_2338, class_2248> entry : this.r.entrySet()) {
            class_2338 class_23382 = entry.getKey();
            class_2248 class_22482 = entry.getValue();
            if (!this.i.a(bs.a(class_22482))) continue;
            this.a(class_22482, this.s);
            double d5 = (double)class_23382.method_10263() + 0.5 - class_2432.field_1352;
            double d6 = (double)class_23382.method_10264() + 0.5 - class_2432.field_1351;
            double d7 = (double)class_23382.method_10260() + 0.5 - class_2432.field_1350;
            float f2 = 1.0f;
            float f3 = this.s[2];
            float f4 = this.s[1];
            float f5 = this.s[0];
            float f6 = (float)d7;
            float f7 = (float)d6;
            float f8 = (float)d5;
            float f9 = (float)d4;
            float f10 = (float)d3;
            float f11 = (float)d2;
            Matrix4f matrix4f2 = matrix4f;
            class_287 class_2873 = class_2872;
            gv.a(class_2873, f3, f7, f2, f4, f11, f5, f6, f10, f9, matrix4f2, f8);
        }
        gv.a(class_2872);
        gv.b();
    }

    private /* bridge */ /* synthetic */ void t() {
        if (this.b() == null) {
            return;
        }
        int n2 = this.a().field_1690.method_38521() + 2;
        int n3 = this.b().method_31476().field_9181;
        int n4 = this.b().method_31476().field_9180;
        Predicate<class_1923> predicate = class_19232 -> Math.abs(class_19232.field_9181 - n3) > n2 || Math.abs(class_19232.field_9180 - n4) > n2;
        this.o.keySet().removeIf(predicate);
        this.p.removeIf(predicate);
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.o.clear();
        this.p.clear();
        this.r.clear();
        this.j.clear();
        this.k.clear();
        this.l.clear();
        this.t = null;
        this.u = -1;
        this.v = 0;
        this.q = Executors.newSingleThreadExecutor(runnable -> {
            Thread thread = new Thread(runnable, "z");
            thread.setDaemon(true);
            return thread;
        });
        this.d();
    }

    private /* bridge */ /* synthetic */ void u() {
        if (this.p.isEmpty()) {
            return;
        }
        Iterator<class_1923> iterator = this.p.iterator();
        while (iterator.hasNext()) {
            class_1923 class_19232 = iterator.next();
            if (!this.a().method_8398().method_12123(class_19232.field_9181, class_19232.field_9180)) continue;
            iterator.remove();
            this.a(class_19232.field_9181, class_19232.field_9180);
        }
    }
}

