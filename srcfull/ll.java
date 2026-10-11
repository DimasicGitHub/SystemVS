/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class ll
extends aT {
    private static final /* synthetic */ Pattern a;
    private /* synthetic */ jh b;
    private /* synthetic */ gz c;
    private /* synthetic */ gz d;
    private /* synthetic */ dw e;
    private /* synthetic */ dw f;
    private /* synthetic */ lw g;
    private /* synthetic */ gz h;
    private /* synthetic */ dw i;
    private /* synthetic */ lw j;
    private /* synthetic */ dw k;
    private /* synthetic */ lw l;
    private /* synthetic */ dw m;
    private /* synthetic */ lw n;
    private final /* synthetic */ List<aw> o;
    private final /* synthetic */ Map<class_1792, String> p;
    private final /* synthetic */ hV q;
    private final /* synthetic */ ArrayList<class_1297> r;

    public /* synthetic */ ll() {
        super("\u0418\u0442\u0435\u043c\u0415\u0417\u041f", fV.d);
        jh jh2 = new jh("", "", Arrays.asList(ec.join(new String[]{"\u041f", "\u043b", "\u0430", "\u0448", "\u043a", "\u0430"}), ec.join(new String[]{"\u0411", "\u043e", "\u043a", "\u0441"}), ec.join(new String[]{"\u041f", "\u043b", "\u0430", "\u0448", "\u043a", "\u0430", " ", "+", " ", "\u0411", "\u043e", "\u043a", "\u0441"})), List.of(ec.join(new String[]{"\u041f", "\u043b", "\u0430", "\u0448", "\u043a", "\u0430"})), false);
        jh2.setNameParts(new String[]{"\u0420", "e", "\u0436", "\u0438", "\u043c"});
        jh2.setDescriptionParts(new String[]{"K", "\u0430", "\u043a", " ", "o", "\u0442", "\u043e", "\u0431", "\u0440", "\u0430", "\u0436", "\u0430", "\u0442", "\u044c", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", "\u044b"});
        this.b = jh2;
        gz gz2 = new gz("", "", 0.35, 0.01, 1.0, 0.05);
        gz2.setNameParts(new String[]{"\u0420", "a", "\u0437", "\u043c", "\u0435", "\u0440"});
        gz2.setDescriptionParts(new String[]{"M", "\u0430", "\u0441", "\u0448", "\u0442", "\u0430", "\u0431", " ", "\u043f", "\u043b", "a", "\u0448", "\u043a", "\u0438"});
        this.c = gz2;
        gz gz3 = new gz("", "", 100.0, 0.0, 100.0, 5.0, "%", 0);
        gz3.setNameParts(new String[]{"\u041f", "\u0440", "o", "\u0437", "\u0440", "\u0430", "\u0447", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u043f", "\u043b", "a", "\u0448", "\u043a", "\u0438"});
        gz3.setDescriptionParts(new String[]{"\u041d", "e", "\u043f", "\u0440", "\u043e", "\u0437", "\u0440", "\u0430", "\u0447", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u0444", "o", "\u043d", "\u0430", " ", "\u0438", " ", "o", "\u0431", "\u0432", "\u043e", "\u0434", "\u043a", "\u0438"});
        this.d = gz3;
        dw dw2 = new dw("", "", false);
        dw2.setNameParts(new String[]{"T", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u0446", "e", "\u043d", "\u043d", "\u044b", "\u0435", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", "\u044b"});
        dw2.setDescriptionParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0442", "o", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u0446", "e", "\u043d", "\u043d", "\u044b", "\u0435", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", "\u044b"});
        this.e = dw2;
        dw dw3 = new dw("", "", true);
        dw3.setNameParts(new String[]{"\u041f", "o", "\u0434", "c", "\u0432", "\u0435", "\u0447", "\u0438", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0442", "a", "\u043b", "\u0438", "\u043a", "\u0438"});
        dw3.setDescriptionParts(new String[]{"B", "\u044b", "\u0434", "\u0435", "\u043b", "\u044f", "\u0442", "\u044c", " ", "\u0442", "a", "\u043b", "\u0438", "\u0441", "\u043c", "\u0430", "\u043d", "\u044b", " ", "\u0424", "T", " ", "o", "\u0442", "\u0434", "\u0435", "\u043b", "\u044c", "\u043d", "\u044b", "\u043c", " ", "\u0446", "\u0432", "e", "\u0442", "\u043e", "\u043c"});
        this.f = dw3;
        lw lw2 = new lw("", "", -48060, true);
        lw2.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u0442", "a", "\u043b", "\u0438", "\u043a", "\u043e", "\u0432"});
        lw2.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u0442", "e", "\u043a", "\u0441", "\u0442", "\u0430", " ", "\u0442", "a", "\u043b", "\u0438", "\u0441", "\u043c", "\u0430", "\u043d", "\u043e", "\u0432", " ", "\u0424", "T"});
        this.g = lw2;
        gz gz4 = new gz("", "", 2.0, 0.1, 5.0, 0.1);
        gz4.setNameParts(new String[]{"T", "\u043e", "\u043b", "\u0449", "\u0438", "\u043d", "\u0430", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0438"});
        gz4.setDescriptionParts(new String[]{"T", "\u043e", "\u043b", "\u0449", "\u0438", "\u043d", "\u0430", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0439"});
        this.h = gz4;
        dw dw4 = new dw("", "", true);
        dw4.setNameParts(new String[]{"M", "\u0430", "\u0441", "\u0448", "\u0442", "\u0430", "\u0431", " ", "o", "\u0442", " ", "\u0434", "\u0438", "c", "\u0442", "\u0430", "\u043d", "\u0446", "\u0438", "\u0438"});
        dw4.setDescriptionParts(new String[]{"\u0423", "\u0442", "o", "\u043b", "\u0449", "\u0430", "\u0442", "\u044c", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0438", " ", "c", " ", "\u0440", "a", "\u0441", "\u0441", "\u0442", "\u043e", "\u044f", "\u043d", "\u0438", "\u0435", "\u043c"});
        this.i = dw4;
        lw lw3 = new lw("", "", -1, true);
        lw3.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0439"});
        lw3.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0439"});
        this.j = lw3;
        dw dw5 = new dw("", "", false);
        dw5.setNameParts(new String[]{"O", "\u0431", "\u0432", "\u043e", "\u0434", "\u043a", "\u0430"});
        dw5.setDescriptionParts(new String[]{"T", "\u0451", "\u043c", "\u043d", "\u0430", "\u044f", " ", "o", "\u0431", "\u0432", "\u043e", "\u0434", "\u043a", "\u0430", " ", "\u0432", "o", "\u043a", "\u0440", "\u0443", "\u0433", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0439", " ", "\u0434", "\u043b", "\u044f", " ", "\u043a", "o", "\u043d", "\u0442", "\u0440", "\u0430", "\u0441", "\u0442", "\u0430"});
        this.k = dw5;
        lw lw4 = new lw("", "", -16777216, true);
        lw4.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "o", "\u0431", "\u0432", "\u043e", "\u0434", "\u043a", "\u0438"});
        lw4.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "o", "\u0431", "\u0432", "\u043e", "\u0434", "\u043a", "\u0438", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0439"});
        this.l = lw4;
        dw dw6 = new dw("", "", false);
        dw6.setNameParts(new String[]{"\u0417", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0430"});
        dw6.setDescriptionParts(new String[]{"\u0417", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0430", " ", "\u0432", "\u043d", "y", "\u0442", "\u0440", "\u0438", " ", "\u0431", "o", "\u043a", "\u0441", "\u0430"});
        this.m = dw6;
        lw lw5 = new lw("", "", 0x4CFFFFFF, true);
        lw5.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u0437", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0438"});
        lw5.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u0437", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0438"});
        this.n = lw5;
        this.o = new ArrayList<aw>();
        this.p = new HashMap<class_1792, String>();
        this.q = new hV();
        this.r = new ArrayList();
        Supplier<Boolean> supplier = () -> this.b.b("\u041f\u043b\u0430\u0448\u043a\u0430") || this.b.b("\u041f\u043b\u0430\u0448\u043a\u0430 + \u0411\u043e\u043a\u0441");
        Supplier<Boolean> supplier2 = () -> this.b.b("\u0411\u043e\u043a\u0441") || this.b.b("\u041f\u043b\u0430\u0448\u043a\u0430 + \u0411\u043e\u043a\u0441");
        this.c.a(supplier::get);
        this.d.a(supplier::get);
        this.f.a(supplier::get);
        this.g.a(() -> (Boolean)supplier.get() != false && this.f.a());
        this.l.a(this.k::a);
        this.n.a(this.m::a);
        hE hE2 = new hE("", "", this.h, this.i);
        hE2.setNameParts(new String[]{"\u0424", "o", "\u0440", "\u043c", "\u0430"});
        hE2.setDescriptionParts(new String[]{"\u041f", "a", "\u0440", "\u0430", "\u043c", "\u0435", "\u0442", "\u0440", "\u044b", " ", "\u0433", "e", "\u043e", "\u043c", "\u0435", "\u0442", "\u0440", "\u0438", "\u0438", " ", "\u0431", "o", "\u043a", "\u0441", "\u0430", "."});
        hE hE3 = hE2;
        hE3.a(supplier2::get);
        hE hE4 = new hE("", "", this.j, this.k, this.l, this.m, this.n);
        hE4.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", "\u0430"});
        hE4.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", "\u0430", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0439", ",", " ", "o", "\u0431", "\u0432", "\u043e", "\u0434", "\u043a", "\u0438", " ", "\u0438", " ", "\u0437", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0438", "."});
        hE hE5 = hE4;
        hE5.a(supplier2::get);
        this.a(this.b, this.c, this.d, this.e, this.f, this.g, hE3, hE5);
    }

    static {
        a = Pattern.compile("\u00a7.");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* bridge */ /* synthetic */ void i(H h2) {
        int n2;
        class_1542 class_15422;
        Object object2;
        class_4587 class_45872 = h2.a();
        if (class_45872 == null) {
            return;
        }
        class_4184 class_41842 = h2.a();
        class_243 class_2432 = class_41842.method_19326();
        class_243 class_2433 = this.b().method_19538();
        float f2 = h2.a().method_60637(true);
        float f3 = (float)((double)((Integer)this.a().field_1690.method_41808().method_41753()).intValue());
        boolean bl2 = this.e.a();
        float f4 = this.c.a();
        float f5 = this.d.a() / 100.0f;
        int n3 = ll.a(gD.background(), f5);
        int n4 = ll.a(gD.border(), f5);
        int n5 = gD.foreground();
        int n6 = this.f.a() ? this.g.a() : n5;
        List<aw> list = this.o;
        int n7 = 0;
        for (Object object2 : this.a().method_18112()) {
            aw aw2;
            double d2;
            double d3;
            float f6;
            double d4;
            boolean bl3;
            double d5;
            class_1542 class_15423;
            class_243 class_2434;
            if (!(object2 instanceof class_1542) || !kw.a(class_2434 = class_2433, class_15423 = (class_15422 = (class_1542)object2), d5 = 1.0, bl3 = bl2, d4 = 128.0)) continue;
            class_243 class_2435 = class_15422.method_19538();
            class_4184 class_41843 = class_41842;
            double d6 = class_2435.field_1351 + (double)class_15422.method_17682() + 0.5;
            double d7 = d6;
            if (!kw.a(class_41843, d7, f6 = f3, d3 = class_2435.field_1350, d2 = class_2435.field_1352)) continue;
            class_243 class_2436 = class_2432;
            float f7 = f2;
            class_1542 class_15424 = class_15422;
            class_243 class_2437 = gv.a(f7, (class_1297)class_15424, class_2436);
            double d8 = class_2433.method_1022(class_2435);
            if (n7 < list.size()) {
                aw2 = list.get(n7);
            } else {
                aw2 = new aw();
                list.add(aw2);
            }
            float f8 = f4;
            double d9 = d8;
            class_243 class_2438 = class_2437;
            class_1542 class_15425 = class_15422;
            aw aw3 = aw2;
            this.a(aw3, class_2438, class_15425, d9, f8);
            ++n7;
        }
        if (n7 == 0) {
            return;
        }
        bU.a(this.a());
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        dP.a();
        try {
            for (n2 = 0; n2 < n7; ++n2) {
                object2 = list.get(n2);
                class_45872.method_22903();
                try {
                    class_4184 class_41844 = class_41842;
                    Object object3 = object2;
                    class_4587 class_45873 = class_45872;
                    ll.a(class_45873, class_41844, (aw)object3);
                    class_15422 = class_45872.method_23760().method_23761();
                    object2.a.set((Matrix4fc)class_15422);
                    int n8 = n3;
                    Object object4 = object2;
                    class_1542 class_15426 = class_15422;
                    this.a((Matrix4f)class_15426, n8, (aw)object4);
                    continue;
                }
                finally {
                    class_45872.method_22909();
                }
            }
        }
        finally {
            dP.b();
        }
        ir.a(1.0f);
        ao.a();
        try {
            for (n2 = 0; n2 < n7; ++n2) {
                object2 = list.get(n2);
                int n9 = object2.i ? n6 : n5;
                Object object5 = object2;
                Matrix4f matrix4f = object2.a;
                this.b(matrix4f, n9, (aw)object5);
            }
        }
        finally {
            ao.b();
            ir.d();
            RenderSystem.depthMask((boolean)true);
            RenderSystem.enableDepthTest();
            bU.b(this.a());
        }
        for (n2 = 0; n2 < n7; ++n2) {
            list.get(n2).a();
        }
    }

    private /* bridge */ /* synthetic */ void b(Matrix4f matrix4f, int n2, aw aw2) {
        float f2 = -aw2.l / 2.0f;
        float f3 = -16.0f;
        float f4 = f3 + 8.0f;
        float f5 = f3 + 10.0f;
        float f6 = f3 + 9.0f;
        float f7 = f2 + 6.0f;
        float f8 = f7;
        Matrix4f matrix4f2 = matrix4f;
        float f9 = 1.0f;
        float f10 = 16.0f;
        float f11 = f4;
        class_1799 class_17992 = aw2.e;
        if (!lz.a(f8, matrix4f2, f9, f10, f11, class_17992)) {
            float f12 = 16.0f;
            float f13 = f4;
            float f14 = f7;
            class_1799 class_17993 = aw2.e;
            Matrix4f matrix4f3 = matrix4f;
            ir.a(f14, f12, class_17993, matrix4f3, f13);
        }
        f7 += 16.0f;
        if (aw2.h) {
            float f15 = 1.0f;
            int n3 = gD.mutedFg();
            float f16 = 12.0f;
            float f17 = f5;
            float f18 = f7 += 4.0f;
            String string = aw2.g;
            Matrix4f matrix4f4 = matrix4f;
            ao.a(f17, f18, n3, f16, f15, string, matrix4f4);
            f7 += aw2.k;
        }
        float f19 = 1.0f;
        int n4 = n2;
        float f20 = 14.0f;
        float f21 = f6;
        float f22 = f7 += 6.0f;
        String string = aw2.f;
        Matrix4f matrix4f5 = matrix4f;
        ao.a(f21, f22, n4, f20, f19, string, matrix4f5);
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.o.clear();
        this.p.clear();
        this.r.clear();
    }

    @Override
    public /* bridge */ /* synthetic */ void f(H h2) {
        if (gd.k()) {
            return;
        }
        if (this.z()) {
            return;
        }
        if (!this.a()) {
            return;
        }
        try {
            this.i(h2);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private /* bridge */ /* synthetic */ String a(class_1799 class_17992) {
        Object object;
        class_1792 class_17922 = class_17992.method_7909();
        if (class_17922 == class_1802.field_8288 && (object = bw.a(class_17992)) != null) {
            return object.L;
        }
        if (class_17922 == class_1802.field_8575 || class_17922 == class_1802.field_8288) {
            return a.matcher(class_17992.method_7964().getString()).replaceAll("");
        }
        object = this.p.get(class_17922);
        if (object != null) {
            return object;
        }
        String string = a.matcher(class_2561.method_43471((String)class_17922.method_7876()).getString()).replaceAll("");
        this.p.put(class_17922, string);
        return string;
    }

    private /* bridge */ /* synthetic */ void a(aw aw2, class_243 class_2432, class_1542 class_15422, double d2, float f2) {
        aw2.b = class_2432;
        aw2.c = class_15422.method_17682();
        aw2.d = ge.a(d2, f2);
        aw2.e = class_15422.method_6983();
        aw2.i = bw.a(aw2.e) != null;
        aw2.f = this.a(aw2.e);
        int n2 = aw2.e.method_7947();
        aw2.h = n2 > 1;
        aw2.g = aw2.h ? "x" + n2 : "";
        aw2.j = ao.a(aw2.f, 14.0f);
        aw2.k = aw2.h ? ao.a(aw2.g, 12.0f) : 0.0f;
        aw2.l = 22.0f + (aw2.h ? 4.0f + aw2.k : 0.0f) + 6.0f + aw2.j + 6.0f;
    }

    private static /* bridge */ /* synthetic */ int a(int n2, float f2) {
        float f3 = f2 < 0.0f ? 0.0f : Math.min(f2, 1.0f);
        int n3 = n2 >> 24 & 0xFF;
        int n4 = Math.round((float)n3 * f3);
        return n4 << 24 | n2 & 0xFFFFFF;
    }

    private /* bridge */ /* synthetic */ void a(Matrix4f matrix4f, int n2, aw aw2) {
        float f2 = -aw2.l / 2.0f;
        float f3 = -16.0f;
        float f4 = 1.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        int n3 = 0;
        float f8 = 0.0f;
        int n4 = 0;
        int n5 = n2;
        float f9 = 8.0f;
        float f10 = 8.0f;
        float f11 = 8.0f;
        float f12 = 8.0f;
        float f13 = 32.0f;
        float f14 = aw2.l;
        float f15 = f3;
        float f16 = f2;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f14, n3, n5, f16, f15, f5, f12, f13, f6, matrix4f2, f4, n4, f10, f8, f11, f9, f7);
    }

    private /* bridge */ /* synthetic */ void a(H h2) {
        class_243 class_2432 = this.b().method_19538();
        boolean bl2 = this.e.a();
        this.r.clear();
        for (class_1297 class_12972 : this.a().method_18112()) {
            double d2;
            boolean bl3;
            double d3;
            class_1542 class_15422;
            class_1542 class_15423;
            class_243 class_2433;
            if (!(class_12972 instanceof class_1542) || !kw.a(class_2433 = class_2432, class_15423 = (class_15422 = (class_1542)class_12972), d3 = 1.0, bl3 = bl2, d2 = 128.0)) continue;
            this.r.add((class_1297)class_15422);
        }
        if (this.r.isEmpty()) {
            return;
        }
        int n2 = this.j.a();
        int n3 = this.n.a();
        this.q.a(this.i.a());
        this.q.a(this.k.a(), this.l.a());
        float f2 = ie.d(n3);
        float f3 = ie.c(n3);
        float f4 = ie.b(n3);
        float f5 = ie.a(n3);
        boolean bl4 = this.m.a();
        float f6 = this.h.a();
        float f7 = ie.d(n2);
        float f8 = ie.c(n2);
        float f9 = ie.b(n2);
        float f10 = ie.a(n2);
        ArrayList<class_1297> arrayList = this.r;
        H h3 = h2;
        this.q.a(f5, f8, arrayList, f7, f9, f4, f2, bl4, f3, f10, h3, f6);
        this.r.clear();
    }

    private static /* bridge */ /* synthetic */ void a(class_4587 class_45872, class_4184 class_41842, aw aw2) {
        class_45872.method_22904(aw2.b.field_1352, aw2.b.field_1351 + (double)aw2.c + 0.5, aw2.b.field_1350);
        bU.a(class_45872);
        class_45872.method_22905(-aw2.d, -aw2.d, -aw2.d);
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
    }

    @Override
    public /* bridge */ /* synthetic */ void g(H h2) {
        if (this.z() || !this.b()) {
            return;
        }
        try {
            this.a(h2);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

