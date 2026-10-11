/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1684;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_287;
import net.minecraft.class_3726;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class lg
extends aT {
    private /* synthetic */ dw a;
    private /* synthetic */ dw b;
    private /* synthetic */ dw c;
    private /* synthetic */ dw d;
    private /* synthetic */ dw e;
    private /* synthetic */ dw f;
    private /* synthetic */ gz g;
    private /* synthetic */ lw h;
    private /* synthetic */ lw i;
    private /* synthetic */ lw j;
    private /* synthetic */ lw k;
    private final /* synthetic */ Map<Integer, gQ> l;
    private static final /* synthetic */ class_1799 m;
    private final /* synthetic */ Map<Integer, Float> n;
    private /* synthetic */ long o;

    public /* synthetic */ lg() {
        super("\u041f\u0435\u0430\u0440\u043b\u0422\u0440\u0430\u0441\u0435\u0440", fV.d);
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0442", "\u0440", "a", "\u0435", "\u043a", "\u0442", "\u043e", "\u0440", "\u0438", "\u044e"});
        dw2.setDescriptionParts(new String[]{"O", "\u0442", "\u043e", "\u0431", "\u0440", "\u0430", "\u0436", "\u0430", "\u0442", "\u044c", " ", "\u043f", "y", "\u0442", "\u044c", " ", "\u043f", "o", "\u043b", "\u0451", "\u0442", "\u0430", " ", "\u044d", "\u043d", "\u0434", "e", "\u0440", "-", "\u0436", "e", "\u043c", "\u0447", "\u0443", "\u0433", "\u0430"});
        this.a = dw2;
        dw dw3 = new dw("", "", true);
        dw3.setNameParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0442", "o", "\u0447", "\u043a", "\u0443", " ", "\u043f", "\u0440", "\u0438", "\u0437", "e", "\u043c", "\u043b", "\u0435", "\u043d", "\u0438", "\u044f"});
        dw3.setDescriptionParts(new String[]{"O", "\u0442", "\u043e", "\u0431", "\u0440", "\u0430", "\u0436", "\u0430", "\u0442", "\u044c", " ", "\u0442", "o", "\u0447", "\u043a", "\u0443", " ", "\u043f", "\u0440", "\u0438", "\u0437", "e", "\u043c", "\u043b", "\u0435", "\u043d", "\u0438", "\u044f", " ", "\u0436", "e", "\u043c", "\u0447", "\u0443", "\u0433", "\u0430"});
        this.b = dw3;
        dw dw4 = new dw("", "", true);
        dw4.setNameParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0445", "\u0438", "\u0442", "\u0431", "o", "\u043a", "\u0441"});
        dw4.setDescriptionParts(new String[]{"O", "\u0442", "\u043e", "\u0431", "\u0440", "\u0430", "\u0436", "\u0430", "\u0442", "\u044c", " ", "\u0445", "\u0438", "\u0442", "\u0431", "o", "\u043a", "\u0441", " ", "\u0432", " ", "\u0442", "o", "\u0447", "\u043a", "\u0435", " ", "\u043f", "\u0440", "\u0438", "\u0437", "e", "\u043c", "\u043b", "\u0435", "\u043d", "\u0438", "\u044f"});
        this.c = dw4;
        dw dw5 = new dw("", "", true);
        dw5.setNameParts(new String[]{"\u041f", "\u043b", "a", "\u0448", "\u043a", "\u0430", " ", "\u043f", "\u0440", "\u0438", "\u0437", "e", "\u043c", "\u043b", "\u0435", "\u043d", "\u0438", "\u044f"});
        dw5.setDescriptionParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u043f", "\u043b", "a", "\u0448", "\u043a", "\u0443", " ", "c", " ", "\u0432", "\u0440", "e", "\u043c", "\u0435", "\u043d", "\u0435", "\u043c", " ", "\u0434", "o", " ", "\u043f", "\u0440", "\u0438", "\u0437", "e", "\u043c", "\u043b", "\u0435", "\u043d", "\u0438", "\u044f"});
        this.d = dw5;
        dw dw6 = new dw("", "", true);
        dw6.setNameParts(new String[]{"\u0418", "\u0433", "\u043d", "o", "\u0440", "\u0438", "\u0440", "\u043e", "\u0432", "\u0430", "\u0442", "\u044c", " ", "c", "\u0432", "\u043e", "\u0438", " ", "\u0436", "e", "\u043c", "\u0447", "\u0443", "\u0433", "\u0430"});
        dw6.setDescriptionParts(new String[]{"\u041d", "e", " ", "\u043f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0442", "\u0440", "a", "\u0435", "\u043a", "\u0442", "\u043e", "\u0440", "\u0438", "\u044e", " ", "\u0434", "\u043b", "\u044f", " ", "c", "\u0432", "\u043e", "\u0438", "\u0445", " ", "\u0436", "e", "\u043c", "\u0447", "\u0443", "\u0433", "\u043e", "\u0432"});
        this.e = dw6;
        dw dw7 = new dw("", "", true);
        dw7.setNameParts(new String[]{"T", "\u0440", "\u0435", "\u043a", "\u0430", "\u0442", "\u044c", " ", "\u0434", "\u0440", "\u0443", "\u0437", "e", "\u0439"});
        dw7.setDescriptionParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0442", "\u0440", "a", "\u0435", "\u043a", "\u0442", "\u043e", "\u0440", "\u0438", "\u044e", " ", "\u0434", "\u043b", "\u044f", " ", "\u0436", "e", "\u043c", "\u0447", "\u0443", "\u0433", "\u043e", "\u0432", " ", "\u0434", "\u0440", "\u0443", "\u0437", "e", "\u0439", " ", "o", "\u0442", "\u0434", "\u0435", "\u043b", "\u044c", "\u043d", "\u044b", "\u043c", " ", "\u0446", "\u0432", "e", "\u0442", "\u043e", "\u043c"});
        this.f = dw7;
        gz gz2 = new gz("", "", 0.3, 0.1, 1.0, 0.1);
        gz2.setNameParts(new String[]{"M", "\u0430", "\u0441", "\u0448", "\u0442", "\u0430", "\u0431", " ", "\u043f", "\u043b", "a", "\u0448", "\u043a", "\u0438"});
        gz2.setDescriptionParts(new String[]{"M", "\u0430", "\u0441", "\u0448", "\u0442", "\u0430", "\u0431", " ", "\u043f", "\u043b", "a", "\u0448", "\u043a", "\u0438", " ", "\u043f", "\u0440", "\u0438", "\u0437", "e", "\u043c", "\u043b", "\u0435", "\u043d", "\u0438", "\u044f"});
        this.g = gz2;
        lw lw2 = new lw("", "", -1, true);
        lw2.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u0442", "\u0440", "a", "\u0435", "\u043a", "\u0442", "\u043e", "\u0440", "\u0438", "\u0438"});
        lw2.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0438", " ", "\u0442", "\u0440", "a", "\u0435", "\u043a", "\u0442", "\u043e", "\u0440", "\u0438", "\u0438", " ", "\u0436", "e", "\u043c", "\u0447", "\u0443", "\u0433", "\u0430"});
        this.h = lw2;
        lw lw3 = new lw("", "", -1, true);
        lw3.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u043f", "\u0440", "\u0438", "\u0437", "e", "\u043c", "\u043b", "\u0435", "\u043d", "\u0438", "\u044f"});
        lw3.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u0442", "o", "\u0447", "\u043a", "\u0438", " ", "\u043f", "\u0440", "\u0438", "\u0437", "e", "\u043c", "\u043b", "\u0435", "\u043d", "\u0438", "\u044f"});
        this.i = lw3;
        lw lw4 = new lw("", "", -10046721, true);
        lw4.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u0442", "\u0440", "a", "\u0435", "\u043a", "\u0442", "\u043e", "\u0440", "\u0438", "\u0438", " ", "\u0434", "\u0440", "\u0443", "\u0433", "a"});
        lw4.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0438", " ", "\u0442", "\u0440", "a", "\u0435", "\u043a", "\u0442", "\u043e", "\u0440", "\u0438", "\u0438", " ", "\u0434", "\u043b", "\u044f", " ", "\u0436", "e", "\u043c", "\u0447", "\u0443", "\u0433", "\u043e", "\u0432", " ", "\u0434", "\u0440", "\u0443", "\u0437", "e", "\u0439"});
        this.j = lw4;
        lw lw5 = new lw("", "", -10046721, true);
        lw5.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u043f", "\u0440", "\u0438", "\u0437", "e", "\u043c", "\u043b", "\u0435", "\u043d", "\u0438", "\u044f", " ", "\u0434", "\u0440", "\u0443", "\u0433", "a"});
        lw5.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u0442", "o", "\u0447", "\u043a", "\u0438", " ", "\u0438", " ", "\u0445", "\u0438", "\u0442", "\u0431", "o", "\u043a", "\u0441", "\u0430", " ", "\u043f", "\u0440", "\u0438", "\u0437", "e", "\u043c", "\u043b", "\u0435", "\u043d", "\u0438", "\u044f", " ", "\u0434", "\u043b", "\u044f", " ", "\u0436", "e", "\u043c", "\u0447", "\u0443", "\u0433", "\u043e", "\u0432", " ", "\u0434", "\u0440", "\u0443", "\u0437", "e", "\u0439"});
        this.k = lw5;
        this.l = new ConcurrentHashMap<Integer, gQ>();
        this.n = new HashMap<Integer, Float>();
        this.o = System.currentTimeMillis();
        this.g.a(this.d::a);
        this.h.a(this.a::a);
        this.i.a(this.b::a);
        this.j.a(() -> this.f.a() && this.a.a());
        this.k.a(() -> this.f.a() && this.b.a());
        this.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    static {
        m = new class_1799((class_1935)class_1802.field_8634);
    }

    @Override
    public /* bridge */ /* synthetic */ void i() {
        if (this.z()) {
            return;
        }
        this.a();
        this.b();
    }

    private /* bridge */ /* synthetic */ boolean b(class_1684 class_16842) {
        class_1657 class_16572;
        class_1297 class_12972 = class_16842.method_24921();
        return class_12972 instanceof class_1657 && !(class_16572 = (class_1657)class_12972).equals((Object)this.b()) && this.e(class_16572);
    }

    private /* bridge */ /* synthetic */ void b() {
        long l2 = System.currentTimeMillis();
        this.l.entrySet().removeIf(entry -> l2 - ((gQ)entry.getValue()).d > 5000L);
        this.n.keySet().retainAll(this.l.keySet());
    }

    private /* bridge */ /* synthetic */ void b(class_4587 class_45872, class_243 class_2432) {
        class_287 class_2872 = gv.a(0.6f);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        boolean bl2 = this.f.a();
        float f2 = 0.3f;
        float f3 = 1.8f;
        for (gQ gQ2 : this.l.values()) {
            if (gQ2.b == null) continue;
            int n2 = (bl2 && gQ2.j ? this.k : this.i).a();
            float f4 = (float)(n2 >> 16 & 0xFF) / 255.0f;
            float f5 = (float)(n2 >> 8 & 0xFF) / 255.0f;
            float f6 = (float)(n2 & 0xFF) / 255.0f;
            float f7 = (float)(n2 >> 24 & 0xFF) / 255.0f * 0.5f;
            class_243 class_2433 = gQ2.b.method_1020(class_2432);
            float f8 = (float)class_2433.field_1352;
            float f9 = (float)class_2433.field_1351;
            float f10 = (float)class_2433.field_1350;
            float f11 = f8 - f2;
            float f12 = f8 + f2;
            float f13 = f9 + f3;
            float f14 = f10 - f2;
            float f15 = f10 + f2;
            float f16 = f7;
            float f17 = f6;
            float f18 = f5;
            float f19 = f4;
            float f20 = f14;
            float f21 = f9;
            float f22 = f12;
            float f23 = f14;
            float f24 = f9;
            float f25 = f11;
            Matrix4f matrix4f2 = matrix4f;
            class_287 class_2875 = class_2872;
            gv.a(class_2875, f17, f21, f16, f18, f25, f19, f20, f24, f23, matrix4f2, f22);
            float f26 = f7;
            float f27 = f6;
            float f28 = f5;
            float f29 = f4;
            float f30 = f15;
            float f31 = f9;
            float f32 = f12;
            float f33 = f14;
            float f34 = f9;
            float f35 = f12;
            Matrix4f matrix4f3 = matrix4f;
            class_287 class_2876 = class_2872;
            gv.a(class_2876, f27, f31, f26, f28, f35, f29, f30, f34, f33, matrix4f3, f32);
            float f36 = f7;
            float f37 = f6;
            float f38 = f5;
            float f39 = f4;
            float f40 = f15;
            float f41 = f9;
            float f42 = f11;
            float f43 = f15;
            float f44 = f9;
            float f45 = f12;
            Matrix4f matrix4f4 = matrix4f;
            class_287 class_2878 = class_2872;
            gv.a(class_2878, f37, f41, f36, f38, f45, f39, f40, f44, f43, matrix4f4, f42);
            float f46 = f7;
            float f47 = f6;
            float f48 = f5;
            float f49 = f4;
            float f50 = f14;
            float f51 = f9;
            float f52 = f11;
            float f53 = f15;
            float f54 = f9;
            float f55 = f11;
            Matrix4f matrix4f5 = matrix4f;
            class_287 class_28710 = class_2872;
            gv.a(class_28710, f47, f51, f46, f48, f55, f49, f50, f54, f53, matrix4f5, f52);
            float f56 = f7;
            float f57 = f6;
            float f58 = f5;
            float f59 = f4;
            float f60 = f14;
            float f61 = f13;
            float f62 = f12;
            float f63 = f14;
            float f64 = f13;
            float f65 = f11;
            Matrix4f matrix4f6 = matrix4f;
            class_287 class_28711 = class_2872;
            gv.a(class_28711, f57, f61, f56, f58, f65, f59, f60, f64, f63, matrix4f6, f62);
            float f66 = f7;
            float f67 = f6;
            float f68 = f5;
            float f69 = f4;
            float f70 = f15;
            float f71 = f13;
            float f72 = f12;
            float f73 = f14;
            float f74 = f13;
            float f75 = f12;
            Matrix4f matrix4f7 = matrix4f;
            class_287 class_28712 = class_2872;
            gv.a(class_28712, f67, f71, f66, f68, f75, f69, f70, f74, f73, matrix4f7, f72);
            float f76 = f7;
            float f77 = f6;
            float f78 = f5;
            float f79 = f4;
            float f80 = f15;
            float f81 = f13;
            float f82 = f11;
            float f83 = f15;
            float f84 = f13;
            float f85 = f12;
            Matrix4f matrix4f8 = matrix4f;
            class_287 class_28713 = class_2872;
            gv.a(class_28713, f77, f81, f76, f78, f85, f79, f80, f84, f83, matrix4f8, f82);
            float f86 = f7;
            float f87 = f6;
            float f88 = f5;
            float f89 = f4;
            float f90 = f14;
            float f91 = f13;
            float f92 = f11;
            float f93 = f15;
            float f94 = f13;
            float f95 = f11;
            Matrix4f matrix4f9 = matrix4f;
            class_287 class_28714 = class_2872;
            gv.a(class_28714, f87, f91, f86, f88, f95, f89, f90, f94, f93, matrix4f9, f92);
            float f96 = f7;
            float f97 = f6;
            float f98 = f5;
            float f99 = f4;
            float f100 = f14;
            float f101 = f13;
            float f102 = f11;
            float f103 = f14;
            float f104 = f9;
            float f105 = f11;
            Matrix4f matrix4f10 = matrix4f;
            class_287 class_28715 = class_2872;
            gv.a(class_28715, f97, f101, f96, f98, f105, f99, f100, f104, f103, matrix4f10, f102);
            float f106 = f7;
            float f107 = f6;
            float f108 = f5;
            float f109 = f4;
            float f110 = f14;
            float f111 = f13;
            float f112 = f12;
            float f113 = f14;
            float f114 = f9;
            float f115 = f12;
            Matrix4f matrix4f11 = matrix4f;
            class_287 class_28716 = class_2872;
            gv.a(class_28716, f107, f111, f106, f108, f115, f109, f110, f114, f113, matrix4f11, f112);
            float f116 = f7;
            float f117 = f6;
            float f118 = f5;
            float f119 = f4;
            float f120 = f15;
            float f121 = f13;
            float f122 = f12;
            float f123 = f15;
            float f124 = f9;
            float f125 = f12;
            Matrix4f matrix4f12 = matrix4f;
            class_287 class_28717 = class_2872;
            gv.a(class_28717, f117, f121, f116, f118, f125, f119, f120, f124, f123, matrix4f12, f122);
            float f126 = f7;
            float f127 = f6;
            float f128 = f5;
            float f129 = f4;
            float f130 = f15;
            float f131 = f13;
            float f132 = f11;
            float f133 = f15;
            float f134 = f9;
            float f135 = f11;
            Matrix4f matrix4f13 = matrix4f;
            class_287 class_28718 = class_2872;
            gv.a(class_28718, f127, f131, f126, f128, f135, f129, f130, f134, f133, matrix4f13, f132);
        }
        gv.a(class_2872);
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.l.clear();
    }

    @Override
    public /* bridge */ /* synthetic */ void f(H h2) {
        if (gd.k()) {
            return;
        }
        if (this.z()) {
            return;
        }
        try {
            this.a(h2);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private /* bridge */ /* synthetic */ void a() {
        Iterable iterable = this.a().method_18112();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (class_1297 class_12972 : iterable) {
            class_243 class_2432;
            if (!(class_12972 instanceof class_1684)) continue;
            class_1684 class_16842 = (class_1684)class_12972;
            if (this.e.a() && this.a(class_16842)) continue;
            boolean bl2 = this.b(class_16842);
            int n3 = class_16842.method_5628();
            hashSet.add(n3);
            gQ gQ2 = this.l.computeIfAbsent(n3, n2 -> new gQ());
            gQ2.j = bl2;
            gQ2.c = class_2432 = class_16842.method_19538();
            gQ2.d = System.currentTimeMillis();
            if (!gQ2.e) {
                gQ gQ3 = gQ2;
                class_1684 class_16843 = class_16842;
                this.a(gQ3, class_16843);
                gQ2.e = true;
            }
            if (gQ2.a.isEmpty()) continue;
            gQ2.h = gQ2.g;
            float f2 = gQ2.g;
            class_243 class_2433 = class_2432;
            List<class_243> list = gQ2.a;
            gQ2.g = this.a(f2, class_2433, list);
            gQ2.f = (int)gQ2.g;
        }
        this.l.keySet().retainAll(hashSet);
    }

    private static /* bridge */ /* synthetic */ String a(double d2) {
        return co.a(d2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* bridge */ /* synthetic */ void a(int n2, class_4184 class_41842, float f2, class_4587 class_45872, class_243 class_2432, String string, double d2) {
        class_45872.method_22903();
        try {
            class_45872.method_22904(class_2432.field_1352, class_2432.field_1351 + 1.0, class_2432.field_1350);
            bU.a(class_45872);
            float f3 = ge.a(d2, this.g.a());
            float f4 = this.n.getOrDefault(n2, Float.valueOf(f3)).floatValue();
            float f5 = f4 + (f3 - f4) * Math.min(1.0f, f2 * 10.0f);
            this.n.put(n2, Float.valueOf(f5));
            class_45872.method_22905(-f5, -f5, -f5);
            float f6 = 14.0f;
            String string2 = string;
            hZ hZ2 = aK;
            float f7 = ao.a(f6, hZ2, string2);
            float f8 = 22.0f + f7;
            float f9 = f8 + 20.0f;
            float f10 = Math.max(14.0f, 16.0f) + 10.0f;
            float f11 = -f9 / 2.0f;
            float f12 = -f10 / 2.0f;
            Matrix4f matrix4f = class_45872.method_23760().method_23761();
            float f13 = 1.0f;
            int n3 = gD.background();
            float f14 = 8.0f;
            float f15 = f10;
            float f16 = f9;
            float f17 = f12;
            float f18 = f11;
            Matrix4f matrix4f2 = matrix4f;
            dP.a(f14, f18, n3, matrix4f2, f15, f16, f13, f17);
            float f19 = f11 + 10.0f;
            float f20 = -8.0f;
            float f21 = 1.0f;
            float f22 = 16.0f;
            float f23 = f20;
            float f24 = f19;
            class_1799 class_17992 = m;
            Matrix4f matrix4f3 = matrix4f;
            if (!lz.a(f24, matrix4f3, f21, f22, f23, class_17992)) {
                float f25 = 1.0f;
                float f26 = 16.0f;
                float f27 = f20;
                float f28 = f19;
                class_1799 class_17993 = m;
                Matrix4f matrix4f4 = matrix4f;
                ir.a(f26, f25, f28, class_17993, matrix4f4, f27);
            }
            float f29 = f19 + 16.0f + 6.0f;
            float f30 = -8.5f;
            int n4 = -1;
            float f31 = 14.0f;
            float f32 = f30;
            float f33 = f29;
            String string3 = string;
            hZ hZ3 = aK;
            Matrix4f matrix4f5 = matrix4f;
            ao.a(string3, f31, matrix4f5, n4, f33, hZ3, f32);
        }
        finally {
            class_45872.method_22909();
        }
    }

    private /* bridge */ /* synthetic */ void a(class_243 class_2432, class_4587 class_45872) {
        class_287 class_2872 = gv.a(0.8f);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        boolean bl2 = this.f.a();
        float f2 = 0.5f;
        for (gQ gQ2 : this.l.values()) {
            if (gQ2.b == null) continue;
            int n2 = (bl2 && gQ2.j ? this.k : this.i).a();
            float f3 = (float)(n2 >> 16 & 0xFF) / 255.0f;
            float f4 = (float)(n2 >> 8 & 0xFF) / 255.0f;
            float f5 = (float)(n2 & 0xFF) / 255.0f;
            float f6 = (float)(n2 >> 24 & 0xFF) / 255.0f;
            class_243 class_2433 = gQ2.b.method_1020(class_2432);
            float f7 = (float)class_2433.field_1352;
            float f8 = (float)class_2433.field_1351;
            float f9 = (float)class_2433.field_1350;
            float f10 = f6;
            float f11 = f5;
            float f12 = f4;
            float f13 = f3;
            float f14 = f9;
            float f15 = f8;
            float f16 = f7 + f2;
            float f17 = f9;
            float f18 = f8;
            float f19 = f7 - f2;
            Matrix4f matrix4f2 = matrix4f;
            class_287 class_2875 = class_2872;
            gv.a(class_2875, f11, f15, f10, f12, f19, f13, f14, f18, f17, matrix4f2, f16);
            float f20 = f6;
            float f21 = f5;
            float f22 = f4;
            float f23 = f3;
            float f24 = f9;
            float f25 = f8 + f2;
            float f26 = f7;
            float f27 = f9;
            float f28 = f8 - f2;
            float f29 = f7;
            Matrix4f matrix4f3 = matrix4f;
            class_287 class_2876 = class_2872;
            gv.a(class_2876, f21, f25, f20, f22, f29, f23, f24, f28, f27, matrix4f3, f26);
            float f30 = f6;
            float f31 = f5;
            float f32 = f4;
            float f33 = f3;
            float f34 = f9 + f2;
            float f35 = f8;
            float f36 = f7;
            float f37 = f9 - f2;
            float f38 = f8;
            float f39 = f7;
            Matrix4f matrix4f4 = matrix4f;
            class_287 class_2878 = class_2872;
            gv.a(class_2878, f31, f35, f30, f32, f39, f33, f34, f38, f37, matrix4f4, f36);
        }
        gv.a(class_2872);
    }

    private /* bridge */ /* synthetic */ void a(class_4587 class_45872, class_243 class_2432) {
        class_287 class_2872 = gv.a(1.0f);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        boolean bl2 = this.f.a();
        for (gQ gQ2 : this.l.values()) {
            class_243 class_2433;
            class_243 class_2434;
            if (gQ2.a.size() < 2 || gQ2.c == null) continue;
            int n2 = (bl2 && gQ2.j ? this.j : this.h).a();
            float f2 = (float)(n2 >> 16 & 0xFF) / 255.0f;
            float f3 = (float)(n2 >> 8 & 0xFF) / 255.0f;
            float f4 = (float)(n2 & 0xFF) / 255.0f;
            float f5 = (float)(n2 >> 24 & 0xFF) / 255.0f;
            float f6 = gQ2.g;
            int n3 = (int)f6;
            float f7 = f6 - (float)n3;
            if (n3 < gQ2.a.size() - 1) {
                class_243 class_2435 = gQ2.a.get(n3);
                class_2434 = gQ2.a.get(n3 + 1);
                class_2433 = class_2435.method_1019(class_2434.method_1020(class_2435).method_1021((double)f7));
                class_243 class_2436 = class_2433.method_1020(class_2432);
                class_243 class_2437 = class_2434.method_1020(class_2432);
                float f8 = f5;
                float f9 = f4;
                float f10 = f3;
                float f11 = f2;
                float f12 = (float)class_2437.field_1350;
                float f13 = (float)class_2437.field_1351;
                float f14 = (float)class_2437.field_1352;
                float f15 = (float)class_2436.field_1350;
                float f16 = (float)class_2436.field_1351;
                float f17 = (float)class_2436.field_1352;
                Matrix4f matrix4f2 = matrix4f;
                class_287 class_2875 = class_2872;
                gv.a(class_2875, f9, f13, f8, f10, f17, f11, f12, f16, f15, matrix4f2, f14);
            }
            for (int i2 = n3 + 1; i2 < gQ2.a.size() - 1; ++i2) {
                class_2434 = gQ2.a.get(i2).method_1020(class_2432);
                class_2433 = gQ2.a.get(i2 + 1).method_1020(class_2432);
                float f18 = f5;
                float f19 = f4;
                float f20 = f3;
                float f21 = f2;
                float f22 = (float)class_2433.field_1350;
                float f23 = (float)class_2433.field_1351;
                float f24 = (float)class_2433.field_1352;
                float f25 = (float)class_2434.field_1350;
                float f26 = (float)class_2434.field_1351;
                float f27 = (float)class_2434.field_1352;
                Matrix4f matrix4f3 = matrix4f;
                class_287 class_2876 = class_2872;
                gv.a(class_2876, f19, f23, f18, f20, f27, f21, f22, f26, f25, matrix4f3, f24);
            }
        }
        gv.a(class_2872);
    }

    private /* bridge */ /* synthetic */ void a(H h2) {
        if (this.l.isEmpty()) {
            return;
        }
        class_4587 class_45872 = h2.a();
        class_243 class_2432 = h2.a().method_19326();
        if (this.a.a()) {
            this.a(class_45872, class_2432);
        }
        if (this.b.a()) {
            class_243 class_2433 = class_2432;
            class_4587 class_45873 = class_45872;
            this.a(class_2433, class_45873);
        }
        if (this.c.a()) {
            this.b(class_45872, class_2432);
        }
        if (this.d.a()) {
            class_243 class_2434 = class_2432;
            H h3 = h2;
            this.a(class_2434, h3);
        }
    }

    private /* bridge */ /* synthetic */ boolean a(class_243 class_2432, class_243 class_2433) {
        class_243 class_2434 = class_2433.method_1019(class_2432);
        class_3959 class_39592 = new class_3959(class_2433, class_2434, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, class_3726.method_16194());
        class_3965 class_39652 = this.a().method_17742(class_39592);
        return class_39652.method_17783() == class_239.class_240.field_1332;
    }

    private /* bridge */ /* synthetic */ void a(gQ gQ2, class_1684 class_16842) {
        gQ2.a.clear();
        gQ2.b = null;
        gQ2.i = 0;
        class_243 class_2432 = class_16842.method_19538();
        class_243 class_2433 = class_16842.method_18798();
        double d2 = 0.99;
        double d3 = 0.03;
        int n2 = 200;
        int n3 = 100;
        int n4 = n2 / n3;
        for (int i2 = 0; i2 < n2; ++i2) {
            class_243 class_2434;
            class_243 class_2435;
            if (i2 % n4 == 0) {
                gQ2.a.add(class_2432);
            }
            if (this.a(class_2435 = class_2433, class_2434 = class_2432)) {
                gQ2.b = class_2432;
                gQ2.i = i2;
                break;
            }
            class_2433 = class_2433.method_1021(d2);
            class_2433 = class_2433.method_1031(0.0, -d3, 0.0);
            class_2432 = class_2432.method_1019(class_2433);
            if (!(class_2432.field_1351 < -64.0) && !(class_2432.method_1025(class_16842.method_19538()) > 250000.0)) continue;
            gQ2.i = i2;
            break;
        }
        if (gQ2.b == null && !gQ2.a.isEmpty()) {
            gQ2.b = (class_243)gQ2.a.getLast();
            gQ2.i = n2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* bridge */ /* synthetic */ void a(class_243 class_2432, H h2) {
        class_4587 class_45872 = h2.a();
        class_4184 class_41842 = h2.a();
        if (class_45872 == null) {
            return;
        }
        long l2 = System.currentTimeMillis();
        float f2 = Math.min((float)(l2 - this.o) / 1000.0f, 0.1f);
        this.o = l2;
        bU.a(this.a());
        dP.a();
        try {
            for (Map.Entry<Integer, gQ> entry : this.l.entrySet()) {
                gQ gQ2 = entry.getValue();
                if (gQ2.b == null) continue;
                float f3 = (float)gQ2.i - gQ2.g * 2.0f;
                double d2 = Math.max(0.0, (double)f3 / 20.0);
                String string = lg.a(d2);
                class_243 class_2433 = gQ2.b.method_1020(class_2432);
                double d3 = gQ2.b.method_1022(class_2432);
                float f4 = f2;
                int n2 = entry.getKey();
                double d4 = d3;
                String string2 = string;
                class_243 class_2434 = class_2433;
                class_4184 class_41843 = class_41842;
                class_4587 class_45873 = class_45872;
                this.a(n2, class_41843, f4, class_45873, class_2434, string2, d4);
            }
        }
        finally {
            dP.b();
            bU.b(this.a());
        }
    }

    private /* bridge */ /* synthetic */ boolean a(class_1684 class_16842) {
        class_1297 class_12972 = class_16842.method_24921();
        return class_12972 != null && class_12972.equals((Object)this.b());
    }

    private /* bridge */ /* synthetic */ float a(float f2, class_243 class_2432, List list) {
        if (list.size() < 2) {
            return 0.0f;
        }
        int n2 = Math.max(0, (int)f2);
        double d2 = Double.MAX_VALUE;
        float f3 = f2;
        int n3 = Math.max(0, n2 - 1);
        int n4 = Math.min(list.size() - 1, n2 + 10);
        for (int i2 = n3; i2 < n4; ++i2) {
            class_243 class_2433 = (class_243)list.get(i2);
            class_243 class_2434 = (class_243)list.get(i2 + 1);
            class_243 class_2435 = class_2434.method_1020(class_2433);
            double d3 = class_2435.method_1027();
            if (d3 < 1.0E-4) continue;
            class_243 class_2436 = class_2432.method_1020(class_2433);
            double d4 = class_2436.method_1026(class_2435) / d3;
            class_243 class_2437 = class_2433.method_1019(class_2435.method_1021(d4 = Math.clamp((double)d4, (double)0.0, (double)1.0)));
            double d5 = class_2432.method_1025(class_2437);
            if (!(d5 < d2)) continue;
            d2 = d5;
            f3 = (float)i2 + (float)d4;
        }
        return Math.max(f2, f3);
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
    }
}

