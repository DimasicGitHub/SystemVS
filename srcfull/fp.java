/*
 * Decompiled with CFR 0.152.
 */
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import net.minecraft.class_124;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1291;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1836;
import net.minecraft.class_1844;
import net.minecraft.class_1887;
import net.minecraft.class_1890;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2281;
import net.minecraft.class_2336;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2382;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2480;
import net.minecraft.class_2520;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2745;
import net.minecraft.class_2769;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_3708;
import net.minecraft.class_3965;
import net.minecraft.class_437;
import net.minecraft.class_4587;
import net.minecraft.class_465;
import net.minecraft.class_481;
import net.minecraft.class_490;
import net.minecraft.class_6880;
import net.minecraft.class_7225;
import net.minecraft.class_7923;
import net.minecraft.class_9290;
import net.minecraft.class_9334;
import net.minecraft.class_9801;
import org.joml.Matrix4f;

public class fp
extends aT {
    private static final /* synthetic */ long a;
    private static final /* synthetic */ float[][] b;
    private static final /* synthetic */ float[][] c;
    private /* synthetic */ jh d;
    private /* synthetic */ gz e;
    private /* synthetic */ gz f;
    private /* synthetic */ gz g;
    private /* synthetic */ lw h;
    private /* synthetic */ au i;
    private /* synthetic */ eP j;
    private /* synthetic */ class_2338 k;
    private /* synthetic */ long l;
    private /* synthetic */ class_465<?> m;
    private /* synthetic */ int n;
    private /* synthetic */ cc<Integer> o;
    private /* synthetic */ cc<Integer> p;
    private /* synthetic */ cc<Integer> q;
    private /* synthetic */ cc<Integer> r;
    private /* synthetic */ boolean s;
    private final /* synthetic */ float[] t;

    public /* synthetic */ fp() {
        super("\u0420\u0435\u0437\u043e\u0443\u0440\u0437\u0435\u0424\u0438\u043d\u0434\u0435\u0440", fV.d);
        jh jh2 = new jh("", "", Arrays.asList(ec.join(new String[]{"\u042f", "\u0449", "\u0438", "\u043a"}), ec.join(new String[]{"\u0423", "\u0433", "\u043b", "\u044b"}), ec.join(new String[]{"\u0417", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0430"})), List.of(ec.join(new String[]{"\u042f", "\u0449", "\u0438", "\u043a"})), false);
        jh2.setNameParts(new String[]{"\u0420", "e", "\u0436", "\u0438", "\u043c", " ", "E", "\u0421", "\u041f"});
        jh2.setDescriptionParts(new String[]{"K", "\u0430", "\u043a", " ", "o", "\u0442", "\u0440", "\u0438", "\u0441", "\u043e", "\u0432", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u043f", "o", "\u0434", "\u0441", "\u0432", "\u0435", "\u0442", "\u043a", "\u0443", " ", "\u043a", "o", "\u043d", "\u0442", "\u0435", "\u0439", "\u043d", "\u0435", "\u0440", "\u043e", "\u0432"});
        this.d = jh2;
        gz gz2 = new gz("", "", 0.3, 0.1, 1.0, 0.1);
        gz2.setNameParts(new String[]{"\u0420", "a", "\u0437", "\u043c", "\u0435", "\u0440", " ", "\u0443", "\u0433", "\u043b", "o", "\u0432"});
        gz2.setDescriptionParts(new String[]{"\u0420", "a", "\u0437", "\u043c", "\u0435", "\u0440", " ", "\u0443", "\u0433", "\u043b", "o", "\u0432", " ", "E", "\u0421", "\u041f"});
        this.e = gz2;
        gz gz3 = new gz("", "", 64.0, 16.0, 256.0, 8.0);
        gz3.setNameParts(new String[]{"\u0414", "a", "\u043b", "\u044c", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c"});
        gz3.setDescriptionParts(new String[]{"\u0414", "a", "\u043b", "\u044c", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u043f", "o", "\u0434", "\u0441", "\u0432", "\u0435", "\u0442", "\u043a", "\u0438"});
        this.f = gz3;
        gz gz4 = new gz("", "", 0.3, 0.1, 1.0, 0.1);
        gz4.setNameParts(new String[]{"\u041f", "\u0440", "o", "\u0437", "\u0440", "\u0430", "\u0447", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u0437", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0438"});
        gz4.setDescriptionParts(new String[]{"\u041f", "\u0440", "o", "\u0437", "\u0440", "\u0430", "\u0447", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u0437", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0438", " ", "\u043a", "o", "\u043d", "\u0442", "\u0435", "\u0439", "\u043d", "\u0435", "\u0440", "\u043e", "\u0432"});
        this.g = gz4;
        lw lw2 = new lw("", "", -23296);
        lw2.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u043f", "o", "\u0434", "\u0441", "\u0432", "\u0435", "\u0442", "\u043a", "\u0438"});
        lw2.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "E", "\u0421", "\u041f", " ", "\u043a", "o", "\u043d", "\u0442", "\u0435", "\u0439", "\u043d", "\u0435", "\u0440", "\u043e", "\u0432", " ", "c", " ", "\u0438", "c", "\u043a", "\u043e", "\u043c", "\u044b", "\u043c", " ", "\u0440", "e", "\u0441", "\u0443", "\u0440", "\u0441", "\u043e", "\u043c"});
        this.h = lw2;
        au au2 = new au("", "");
        au2.setNameParts(new String[]{"\u0418", "\u043d", "\u0434", "e", "\u043a", "\u0441", " ", "\u0440", "e", "\u0441", "\u0443", "\u0440", "\u0441", "\u043e", "\u0432"});
        au2.setDescriptionParts(new String[]{"O", "\u0442", "\u043a", "\u0440", "\u043e", "\u0439", " ", "c", "\u0443", "\u043d", "\u0434", "\u0443", "\u043a", "/", "\u0448", "a", "\u043b", "\u043a", "\u0435", "\u0440", " ", "\u0447", "\u0442", "o", "\u0431", "\u044b", " ", "\u0437", "a", "\u043f", "\u043e", "\u043c", "\u043d", "\u0438", "\u0442", "\u044c", " ", "e", "\u0433", "\u043e", " ", "c", "\u043e", "\u0434", "\u0435", "\u0440", "\u0436", "\u0438", "\u043c", "\u043e", "\u0435"});
        this.i = au2;
        eP eP2 = new eP("", "");
        eP2.setNameParts(new String[]{"O", "\u0447", "\u0438", "\u0441", "\u0442", "\u0438", "\u0442", "\u044c", " ", "\u0438", "\u043d", "\u0434", "e", "\u043a", "\u0441"});
        eP2.setDescriptionParts(new String[]{"\u0417", "a", "\u0431", "\u044b", "\u0442", "\u044c", " ", "\u0432", "c", "\u0435", " ", "\u0437", "a", "\u043f", "\u043e", "\u043c", "\u043d", "\u0435", "\u043d", "\u043d", "\u044b", "\u0435", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", "\u044b"});
        this.j = eP2;
        this.t = new float[3];
        this.e.a(() -> this.d.b("\u0423\u0433\u043b\u044b"));
        this.g.a(() -> this.d.b("\u0417a\u043b\u0438\u0432\u043a\u0430"));
        this.a(this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        this.j.a(this.i::a);
    }

    static {
        a = 5L * aL;
        b = new float[][]{{0.0f, 0.0f, 0.0f}, {1.0f, 0.0f, 0.0f}, {0.0f, 0.0f, 1.0f}, {1.0f, 0.0f, 1.0f}, {0.0f, 1.0f, 0.0f}, {1.0f, 1.0f, 0.0f}, {0.0f, 1.0f, 1.0f}, {1.0f, 1.0f, 1.0f}};
        c = new float[][]{{1.0f, 1.0f, 1.0f}, {-1.0f, 1.0f, 1.0f}, {1.0f, 1.0f, -1.0f}, {-1.0f, 1.0f, -1.0f}, {1.0f, -1.0f, 1.0f}, {-1.0f, -1.0f, 1.0f}, {1.0f, -1.0f, -1.0f}, {-1.0f, -1.0f, -1.0f}};
    }

    @Override
    public /* bridge */ /* synthetic */ void i() {
        int n2;
        class_465 class_4652;
        block11: {
            block10: {
                if (this.z()) {
                    return;
                }
                class_437 class_4372 = this.a();
                if (!(class_4372 instanceof class_465)) break block10;
                class_4652 = (class_465)class_4372;
                if (!(class_4372 instanceof class_490) && !(class_4372 instanceof class_481)) break block11;
            }
            this.m = null;
            return;
        }
        if (this.m != class_4652) {
            this.m = class_4652;
            this.n = 0;
        }
        if ((n2 = this.a(class_4652)) == 0 || n2 == this.n) {
            return;
        }
        this.n = n2;
        List list = this.a(class_4652);
        if (list.isEmpty()) {
            return;
        }
        class_2338 class_23382 = this.a();
        if (class_23382 != null) {
            String string = this.a().method_27983().method_29177().toString();
            List list2 = this.a(class_23382);
            class_2338 class_23383 = fp.a(list2);
            for (class_2338 class_23384 : list2) {
                if (class_23384.equals((Object)class_23383)) continue;
                this.i.a(string, class_23384);
            }
            this.i.a(string, class_23383, list);
        } else {
            this.i.a("virtual", fp.a(class_4652), list);
        }
    }

    private static /* bridge */ /* synthetic */ void b(StringBuilder stringBuilder, String string) {
        if (string == null) {
            return;
        }
        String string2 = class_124.method_539((String)string);
        if (string2 != null) {
            stringBuilder.append(string2);
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.a();
    }

    @Override
    public /* bridge */ /* synthetic */ void f(H h2) {
        if (this.z() || this.i.a().isEmpty()) {
            return;
        }
        String string = this.a().method_27983().method_29177().toString();
        this.a(string);
        List list = this.a(this.i.a(string));
        if (list.isEmpty()) {
            return;
        }
        class_4587 class_45872 = h2.a();
        if (class_45872 == null) {
            return;
        }
        class_243 class_2432 = h2.a().method_19326();
        class_2338 class_23382 = this.b().method_24515();
        int n2 = (int)this.f.d();
        int n3 = n2 * n2;
        int n4 = this.h.b();
        this.t[0] = (float)(n4 >> 16 & 0xFF) / 255.0f;
        this.t[1] = (float)(n4 >> 8 & 0xFF) / 255.0f;
        this.t[2] = (float)(n4 & 0xFF) / 255.0f;
        if (this.d.b("\u0417a\u043b\u0438\u0432\u043a\u0430")) {
            List list2 = list;
            int n5 = n3;
            class_2338 class_23383 = class_23382;
            class_243 class_2433 = class_2432;
            class_4587 class_45873 = class_45872;
            this.a(list2, class_45873, class_2433, class_23383, n5);
        }
        if (this.d.b("\u042f\u0449\u0438\u043a") || this.d.b("\u0423\u0433\u043b\u044b")) {
            List list3 = list;
            int n6 = n3;
            class_2338 class_23384 = class_23382;
            class_243 class_2434 = class_2432;
            class_4587 class_45874 = class_45872;
            this.a(class_2434, n6, class_23384, list3, class_45874);
        }
    }

    private /* bridge */ /* synthetic */ void a(List list, class_4587 class_45872, class_243 class_2432, class_2338 class_23382, int n2) {
        gv.a();
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27379, class_290.field_1576);
        float f2 = this.g.a();
        for (class_2338 class_23383 : list) {
            if (class_23383.method_10262((class_2382)class_23382) > (double)n2) continue;
            class_45872.method_22903();
            class_45872.method_22904((double)class_23383.method_10263() - class_2432.field_1352, (double)class_23383.method_10264() - class_2432.field_1351, (double)class_23383.method_10260() - class_2432.field_1350);
            Matrix4f matrix4f = class_45872.method_23760().method_23761();
            float f3 = f2;
            float f4 = this.t[2];
            float f5 = this.t[1];
            float f6 = this.t[0];
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

    private /* bridge */ /* synthetic */ void a(class_287 class_2872, float f2, Matrix4f matrix4f) {
        for (int i2 = 0; i2 < b.length; ++i2) {
            float f3 = b[i2][0];
            float f4 = b[i2][1];
            float f5 = b[i2][2];
            float f6 = c[i2][0] * f2;
            float f7 = c[i2][1] * f2;
            float f8 = c[i2][2] * f2;
            float f9 = 1.0f;
            float f10 = this.t[2];
            float f11 = this.t[1];
            float f12 = this.t[0];
            float f13 = 0.005f;
            float f14 = f3 + f6;
            float f15 = f5;
            float f16 = f4;
            float f17 = f3;
            Matrix4f matrix4f2 = matrix4f;
            class_287 class_2873 = class_2872;
            gv.a(f12, f14, f17, matrix4f2, f16, f10, f15, f9, f11, class_2873, f13);
            float f18 = 1.0f;
            float f19 = this.t[2];
            float f20 = this.t[1];
            float f21 = this.t[0];
            float f22 = 0.005f;
            float f23 = f4 + f7;
            float f24 = f5;
            float f25 = f4;
            float f26 = f3;
            Matrix4f matrix4f3 = matrix4f;
            class_287 class_2874 = class_2872;
            gv.a(f24, f20, matrix4f3, f25, f26, f18, class_2874, f19, f22, f23, f21);
            float f27 = 1.0f;
            float f28 = this.t[2];
            float f29 = this.t[1];
            float f30 = this.t[0];
            float f31 = 0.005f;
            float f32 = f5 + f8;
            float f33 = f5;
            float f34 = f4;
            float f35 = f3;
            Matrix4f matrix4f4 = matrix4f;
            class_287 class_2875 = class_2872;
            gv.a(matrix4f4, f30, f34, f28, f33, f31, f27, f35, f29, class_2875, f32);
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void a(jG jG2) {
        kN kN2;
        if (this.z() || this.i.a().isEmpty()) {
            return;
        }
        Object object = this.a();
        if (!(object instanceof class_465)) {
            return;
        }
        class_465 class_4652 = (class_465)object;
        object = new HashSet();
        for (String string : this.i.a()) {
            kN2 = (kN)this.i.a().get(string);
            if (kN2 == null || kN2.c == null) continue;
            object.add(kN2.c.toLowerCase());
        }
        if (object.isEmpty()) {
            return;
        }
        Object object2 = this.a(class_4652);
        int n2 = this.h.a();
        kN2 = jG2.a();
        for (class_1735 class_17352 : class_4652.method_17577().field_7761) {
            String string;
            if (class_17352 == null || !class_17352.method_7682() || !class_17352.method_7681() || (string = fp.a(class_17352.method_7677().method_7964().getString()).toLowerCase()).isEmpty() || !object.contains(string)) continue;
            kN2.method_25294((int)(object2[0] + class_17352.field_7873), (int)(object2[1] + class_17352.field_7872), (int)(object2[0] + class_17352.field_7873 + 16), (int)(object2[1] + class_17352.field_7872 + 16), n2);
        }
    }

    private /* bridge */ /* synthetic */ void a(class_243 class_2432, int n2, class_2338 class_23382, List list, class_4587 class_45872) {
        boolean bl2 = this.d.b("\u042f\u0449\u0438\u043a");
        boolean bl3 = this.d.b("\u0423\u0433\u043b\u044b");
        gv.a();
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27379, class_290.field_1576);
        for (class_2338 class_23383 : list) {
            if (class_23383.method_10262((class_2382)class_23382) > (double)n2) continue;
            class_45872.method_22903();
            class_45872.method_22904((double)class_23383.method_10263() - class_2432.field_1352, (double)class_23383.method_10264() - class_2432.field_1351, (double)class_23383.method_10260() - class_2432.field_1350);
            Matrix4f matrix4f = class_45872.method_23760().method_23761();
            if (bl2) {
                float f2 = 1.0f;
                float f3 = this.t[2];
                float f4 = this.t[1];
                float f5 = this.t[0];
                float f6 = 0.005f;
                float f7 = 1.0f;
                float f8 = 1.0f;
                float f9 = 1.0f;
                float f10 = 0.0f;
                float f11 = 0.0f;
                float f12 = 0.0f;
                Matrix4f matrix4f2 = matrix4f;
                class_287 class_2873 = class_2872;
                gv.a(f9, f2, f4, f11, matrix4f2, f12, f10, f8, class_2873, f3, f6, f7, f5);
            }
            if (bl3) {
                float f13 = this.e.a();
                Matrix4f matrix4f3 = matrix4f;
                class_287 class_2874 = class_2872;
                this.a(class_2874, f13, matrix4f3);
            }
            class_45872.method_22909();
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
        gv.b();
    }

    private /* bridge */ /* synthetic */ void a(String string) {
        class_1937 class_19372 = this.a();
        Predicate<class_2338> predicate = class_23382 -> {
            if (!class_19372.method_8398().method_12123(class_23382.method_10263() >> 4, class_23382.method_10260() >> 4)) {
                return true;
            }
            return fp.a(class_19372.method_8320(class_23382).method_26204());
        };
        String string2 = string;
        this.i.a(predicate, string2);
    }

    private /* bridge */ /* synthetic */ List a(List list) {
        if (list.isEmpty()) {
            return list;
        }
        HashSet hashSet = new HashSet(list.size() * 2);
        for (class_2338 class_23382 : list) {
            hashSet.addAll(this.a(class_23382));
        }
        return new ArrayList(hashSet);
    }

    private /* bridge */ /* synthetic */ void a() {
        this.k = null;
        this.m = null;
        this.n = 0;
    }

    private static /* bridge */ /* synthetic */ void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append('\n');
        fp.b(stringBuilder, string);
    }

    private /* bridge */ /* synthetic */ int[] a(class_465 class_4652) {
        if (!this.s) {
            this.o = new cc(null, class_465.class, 23);
            this.p = new cc(null, class_465.class, 24);
            this.q = new cc(null, class_465.class, 9);
            this.r = new cc(null, class_465.class, 10);
            this.s = true;
        }
        int n2 = this.o.a(class_4652);
        int n3 = this.p.a(class_4652);
        if (n2 != 0 || n3 != 0) {
            return new int[]{n2, n3};
        }
        int n4 = this.q.a(class_4652);
        int n5 = this.r.a(class_4652);
        if (n4 == 0) {
            n4 = 176;
        }
        if (n5 == 0) {
            n5 = 166;
        }
        return new int[]{(class_4652.field_22789 - n4) / 2, (class_4652.field_22790 - n5) / 2};
    }

    private /* bridge */ /* synthetic */ int a(class_465 class_4652) {
        int n2 = 0;
        class_1661 class_16612 = this.a();
        for (class_1735 class_17352 : class_4652.method_17577().field_7761) {
            class_1799 class_17992;
            if (class_17352.field_7871 == class_16612 || (class_17992 = class_17352.method_7677()).method_7960()) continue;
            n2 = n2 * 31 + class_17992.method_7909().hashCode();
            n2 = n2 * 31 + class_17992.method_7947();
        }
        return n2;
    }

    private static /* bridge */ /* synthetic */ class_2338 a(class_465 class_4652) {
        String string = class_4652.method_25440() == null ? "" : class_4652.method_25440().getString();
        return new class_2338(string.hashCode(), class_4652.method_17577().field_7761.size(), 0);
    }

    private static /* bridge */ /* synthetic */ boolean a(class_2248 class_22482) {
        return class_22482 instanceof class_2281 || class_22482 instanceof class_2336 || class_22482 instanceof class_2480 || class_22482 instanceof class_3708;
    }

    private static /* bridge */ /* synthetic */ class_2338 a(List list) {
        class_2338 class_23382 = (class_2338)list.getFirst();
        for (class_2338 class_23383 : list) {
            if (class_23383.method_10063() >= class_23382.method_10063()) continue;
            class_23382 = class_23383;
        }
        return class_23382;
    }

    private /* bridge */ /* synthetic */ List a(class_2338 class_23382) {
        class_2680 class_26802 = this.a().method_8320(class_23382);
        if (!(class_26802.method_26204() instanceof class_2281)) {
            return List.of(class_23382);
        }
        class_2745 class_27452 = class_26802.method_28500((class_2769)class_2741.field_12506).orElse(class_2745.field_12569);
        if (class_27452 == class_2745.field_12569) {
            return List.of(class_23382);
        }
        class_2350 class_23502 = class_26802.method_28500((class_2769)class_2741.field_12481).orElse(class_2350.field_11043);
        class_2350 class_23503 = class_27452 == class_2745.field_12574 ? class_23502.method_10170() : class_23502.method_10160();
        return List.of(class_23382, class_23382.method_10093(class_23503));
    }

    private /* bridge */ /* synthetic */ class_2338 a() {
        class_3965 class_39652;
        if (this.k != null && System.nanoTime() - this.l <= a) {
            return this.k;
        }
        class_239 class_2392 = this.a().field_1765;
        if (class_2392 instanceof class_3965 && (class_39652 = (class_3965)class_2392).method_17783() == class_239.class_240.field_1332) {
            class_2338 class_23382 = class_39652.method_17777();
            if (fp.a(this.a().method_8320(class_23382).method_26204())) {
                return class_23382.method_10062();
            }
        }
        return null;
    }

    @Override
    public /* bridge */ /* synthetic */ class_1269 a(class_1657 class_16572, class_1937 class_19372, class_1268 class_12682, class_3965 class_39652) {
        if (class_19372 == null || class_39652 == null) {
            return class_1269.field_5811;
        }
        class_2248 class_22482 = class_19372.method_8320(class_39652.method_17777()).method_26204();
        if (fp.a(class_22482)) {
            this.k = class_39652.method_17777().method_10062();
            this.l = System.nanoTime();
        }
        return class_1269.field_5811;
    }

    private /* bridge */ /* synthetic */ String a(class_1657 class_16572, class_1799 class_17992) {
        Object object;
        class_1844 class_18442;
        class_9290 class_92902;
        class_2561 class_25612;
        StringBuilder stringBuilder = new StringBuilder();
        fp.b(stringBuilder, class_17992.method_7964().getString());
        class_2561 class_25613 = (class_2561)class_17992.method_57824(class_9334.field_49631);
        if (class_25613 != null) {
            fp.a(stringBuilder, class_25613.getString());
        }
        if ((class_25612 = (class_2561)class_17992.method_57824(class_9334.field_50239)) != null) {
            fp.a(stringBuilder, class_25612.getString());
        }
        if ((class_92902 = (class_9290)class_17992.method_57824(class_9334.field_49632)) != null) {
            class_18442 = class_92902.comp_2400().iterator();
            while (class_18442.hasNext()) {
                object = (class_2561)class_18442.next();
                fp.a(stringBuilder, object.getString());
            }
        }
        try {
            class_18442 = class_1890.method_57532((class_1799)class_17992).method_57539().iterator();
            while (class_18442.hasNext()) {
                object = (Object2IntMap.Entry)class_18442.next();
                fp.a(stringBuilder, ((class_1887)((class_6880)object.getKey()).comp_349()).comp_2686().getString());
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if ((class_18442 = (class_1844)class_17992.method_57824(class_9334.field_49651)) != null) {
            try {
                fp.a(stringBuilder, class_18442.method_64195("").getString());
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            class_18442.method_57402(class_12932 -> {
                try {
                    fp.a(stringBuilder, ((class_1291)class_12932.method_5579().comp_349()).method_5560().getString());
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            });
        }
        try {
            object = class_17992.method_7950(class_1792.class_9635.field_51353, class_16572, (class_1836)class_1836.field_41071);
            if (object != null) {
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    class_2561 class_25614 = (class_2561)iterator.next();
                    if (class_25614 == null) continue;
                    fp.a(stringBuilder, class_25614.getString());
                }
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if ((object = class_7923.field_41178.method_10221((Object)class_17992.method_7909())) != null) {
            stringBuilder.append('\n').append(object.method_12832()).append(' ').append(object.method_12836());
        }
        return stringBuilder.toString().toLowerCase();
    }

    private static /* bridge */ /* synthetic */ String a(class_7225.class_7874 class_78742, class_1799 class_17992) {
        try {
            class_2520 class_25202 = class_17992.method_57375(class_78742);
            return class_25202.toString();
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private static /* bridge */ /* synthetic */ String a(String string) {
        int n2;
        if (string == null) {
            return "";
        }
        String string2 = string;
        while (string2.startsWith("[") && (n2 = string2.indexOf(93)) >= 0) {
            string2 = string2.substring(n2 + 1).stripLeading();
        }
        return string2;
    }

    private /* bridge */ /* synthetic */ List a(class_465 class_4652) {
        Object object;
        Object object2;
        class_1735 class_1735222;
        HashMap<String, int[]> hashMap = new HashMap<String, int[]>();
        HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
        HashMap<Object, String> hashMap3 = new HashMap<Object, String>();
        class_1661 class_16612 = this.a();
        for (class_1735 class_1735222 : class_4652.method_17577().field_7761) {
            class_2960 class_29602;
            if (class_1735222.field_7871 == class_16612 || (object2 = class_1735222.method_7677()).method_7960() || (class_29602 = class_7923.field_41178.method_10221((Object)object2.method_7909())) == null) continue;
            String object3 = class_29602.toString();
            object = object3 + "\u0000" + object2.method_7964().getString();
            int[] nArray = hashMap.computeIfAbsent((String)object, string -> new int[1]);
            nArray[0] = nArray[0] + object2.method_7947();
            hashMap2.put(object, object2);
            hashMap3.put(object, object3);
        }
        Iterator iterator = this.b();
        class_1735222 = this.a().method_30349();
        object2 = new ArrayList(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            object = (String)entry.getKey();
            class_1799 class_17992 = (class_1799)hashMap2.get(object);
            Iterator iterator2 = iterator;
            class_1799 class_17993 = class_17992;
            class_1735 class_17352 = class_1735222;
            class_1799 class_17994 = class_17992;
            object2.add(new cS((String)object, (String)hashMap3.get(object), fp.a(class_17992.method_7964().getString()), this.a((class_1657)iterator2, class_17993), fp.a((class_7225.class_7874)class_17352, class_17994), ((int[])entry.getValue())[0]));
        }
        return object2;
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.a();
    }
}

