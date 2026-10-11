/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class av
extends kc {
    private static final float k = 48.0f;
    private static final int l = 3;
    private static final int m = 10;
    private final kp n = new kp(14.0f);
    private int o = -1;
    private final bo p = jm.b(0.0f, 0.28f);
    private float q;
    private final List<dN> r = new ArrayList<dN>();
    private final List<dN> s = new ArrayList<dN>();
    private final List<dN> t = new ArrayList<dN>();
    private final Deque<String> u = new ArrayDeque<String>();
    private Consumer<fV> v;
    private BiConsumer<fV, aT> w;

    public av() {
        this.c = 448.0f;
        this.d = 304.0f;
        this.n.a((T string) -> this.f());
        this.d();
        this.e();
    }

    @Override
    protected void e(float f2, float f3, float f4, Matrix4f matrix4f) {
        this.c();
        float f5 = this.b + jm.b(f3);
        Matrix4f matrix4f2 = jm.a(matrix4f, f3, this.a + this.c / 2.0f, f5 + this.d / 2.0f);
        float f6 = f3;
        float f7 = 1.0f;
        int n2 = gD.border();
        int n3 = gD.background();
        float f8 = 12.0f;
        float f9 = this.d;
        float f10 = this.c;
        float f11 = f5;
        float f12 = this.a;
        Matrix4f matrix4f3 = matrix4f2;
        dP.a(f7, f10, f6, matrix4f3, f11, n3, f8, f12, n2, f9);
        float f13 = f5;
        float f14 = f3;
        Matrix4f matrix4f4 = matrix4f2;
        this.a(f13, matrix4f4, f14);
        float f15 = f5;
        float f16 = f3;
        float f17 = f2;
        float f18 = f4;
        Matrix4f matrix4f5 = matrix4f2;
        this.a(f17, f15, matrix4f5, f16, f18);
    }

    private void e() {
        for (fV fV2 : fV.values()) {
            if (fV2.a()) continue;
            this.s.add(this.a(fV2));
        }
    }

    private void b() {
        List list = this.b();
        if (list.isEmpty()) {
            return;
        }
        int n2 = Math.max(this.o, 0);
        if (n2 >= list.size()) {
            return;
        }
        Runnable runnable = ((dN)list.get(n2)).a();
        if (runnable != null) {
            runnable.run();
        }
    }

    private void b(List list) {
        if (this.o < 0 || this.o >= list.size()) {
            return;
        }
        dN dN2 = (dN)list.get(this.o);
        float f2 = this.b + 40.0f + 1.0f;
        float f3 = this.b + this.d - f2;
        float f4 = dN2.p() - f2 + this.q;
        float f5 = f4 + 32.0f;
        if (f4 < this.q) {
            this.q = Math.max(0.0f, f4 - 4.0f);
        } else if (f5 > this.q + f3) {
            this.q = f5 - f3 + 4.0f;
        }
        this.p.c(this.q);
    }

    private List b() {
        if (!this.n.a()) {
            return this.t;
        }
        ArrayList<dN> arrayList = new ArrayList<dN>(this.r.size() + this.s.size());
        arrayList.addAll(this.r);
        arrayList.addAll(this.s);
        return arrayList;
    }

    @Override
    protected boolean c(int n2, int n3, int n4) {
        if (n4 == 257 || n4 == 335) {
            this.b();
            return true;
        }
        if (n4 == 264) {
            this.a(1);
            return true;
        }
        if (n4 == 265) {
            this.a(-1);
            return true;
        }
        int n5 = n2;
        int n6 = n4;
        this.n.a(n5, n6);
        return true;
    }

    private void c() {
        float f2 = jX.c();
        float f3 = (float)lo.aM.method_22683().method_4486() / f2;
        float f4 = (float)lo.aM.method_22683().method_4502() / f2;
        this.a = Math.round((f3 - this.c) / 2.0f);
        this.b = Math.round((f4 - this.d) / 2.0f);
    }

    private void c(List list) {
        for (int i2 = 0; i2 < list.size(); ++i2) {
            ((dN)list.get(i2)).a(i2 == this.o);
        }
    }

    @Override
    public void h() {
        this.n.a();
        this.t.clear();
        this.o = -1;
        this.q = 0.0f;
        this.p.b(0.0f);
        this.a();
        super.h();
    }

    private void f() {
        this.q = 0.0f;
        this.p.c(0.0f);
        for (dN object2 : this.t) {
            object2.a(false);
        }
        this.t.clear();
        this.o = -1;
        for (dN dN2 : this.r) {
            dN2.a(false);
        }
        Object object3 = this.s.iterator();
        while (object3.hasNext()) {
            dN dN3 = object3.next();
            dN3.a(false);
        }
        if (this.n.a()) {
            return;
        }
        Object object = object3 = af.a() != null ? af.a().a() : null;
        if (object3 == null) {
            return;
        }
        String string = an.a(this.n.a()).toLowerCase();
        for (aT aT2 : ((km)object3).a()) {
            fV fV2 = aT2.a();
            if (fV2 == null) continue;
            String string2 = string;
            aT aT3 = aT2;
            if (this.a(string2, aT3)) {
                String string3 = this.a(this.t.size());
                fV fV3 = fV2;
                aT aT4 = aT2;
                this.t.add(this.a(fV3, string3, aT4));
            }
            Iterator iterator = aT2.b().iterator();
            while (iterator.hasNext()) {
                String string4 = string;
                fa fa2 = (fa)iterator.next();
                fa fa3 = fa2;
                if (!this.a(string4, fa3)) continue;
                String string5 = this.a(this.t.size());
                fV fV4 = fV2;
                fa fa4 = fa2;
                aT aT5 = aT2;
                this.t.add(this.a(fa4, string5, aT5, fV4));
            }
        }
    }

    private void d() {
        km km2;
        km km3 = km2 = af.a() != null ? af.a().a() : null;
        if (km2 == null) {
            return;
        }
        List list = km2.a();
        int n2 = 0;
        for (aT aT2 : list) {
            if (n2 >= 3) break;
            fV fV2 = aT2.a();
            if (fV2 == null) continue;
            String string = this.a(n2);
            fV fV3 = fV2;
            aT aT3 = aT2;
            this.r.add(this.a(fV3, string, aT3));
            ++n2;
        }
    }

    private boolean a(String string, aT aT2) {
        return this.a(aT2.b(), string);
    }

    private boolean a(String string, fa fa2) {
        if (this.a(fa2.g(), string)) {
            return true;
        }
        return this.a(fa2.j(), string);
    }

    private dN a(fa fa2, String string, aT aT2, fV fV2) {
        return new dN(fV2.a(), aT2.b(), fa2.g(), true, string, () -> this.a(fV2, aT2));
    }

    private void a(fV fV2, aT aT2) {
        this.a(aT2);
        if (this.w != null) {
            this.w.accept(fV2, aT2);
        } else if (this.v != null) {
            this.v.accept(fV2);
        }
        this.n();
    }

    private void a(fV fV2) {
        if (this.v != null) {
            this.v.accept(fV2);
        }
        this.n();
    }

    private void a(aT aT2) {
        if (aT2 == null) {
            return;
        }
        String string = aT2.b();
        if (string == null || string.isBlank()) {
            return;
        }
        this.u.removeIf(string2 -> string2.equalsIgnoreCase(string));
        this.u.addFirst(string);
        while (this.u.size() > 10) {
            this.u.removeLast();
        }
    }

    public void a(List list) {
        this.u.clear();
        if (list == null) {
            return;
        }
        for (String string : list) {
            if (string == null || string.isBlank()) continue;
            if (this.u.size() >= 10) break;
            this.u.add(string);
        }
        this.a();
    }

    public List a() {
        return new ArrayList<String>(this.u);
    }

    public void a(BiConsumer biConsumer) {
        this.w = biConsumer;
    }

    public void a(Consumer consumer) {
        this.v = consumer;
    }

    private boolean a(String string, String string2) {
        if (string == null) {
            return false;
        }
        return an.a(string).toLowerCase().contains(string2);
    }

    private float a(float f2, String string, float f3, List list, float f4, Matrix4f matrix4f, float f5) {
        float f6 = f4 + 10.0f;
        ao.a(matrix4f, string, this.a + 12.0f, f6, 12.0f, gD.mutedFg(), f3);
        float f7 = f6 + 12.0f + 6.0f;
        float f8 = this.a + 4.0f;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            dN dN2 = (dN)list.get(i2);
            dN2.c(440.0f);
            float f9 = f7;
            float f10 = f8;
            dN2.c(f9, f10);
            float f11 = f3;
            float f12 = f2;
            float f13 = f5;
            Matrix4f matrix4f2 = matrix4f;
            dN2.c(f11, f12, f13, matrix4f2);
            f7 += 32.0f;
            if (i2 >= list.size() - 1) continue;
            f7 += 4.0f;
        }
        return f7;
    }

    private void a(int n2) {
        List list = this.b();
        if (list.isEmpty()) {
            this.o = -1;
            return;
        }
        this.o = this.o < 0 ? (n2 > 0 ? 0 : list.size() - 1) : Math.clamp((long)(this.o + n2), (int)0, (int)(list.size() - 1));
        this.c(list);
        this.b(list);
    }

    @Override
    private float a(int n2) {
        if (n2 <= 0) {
            return 28.0f;
        }
        return 28.0f + (float)n2 * 32.0f + (float)Math.max(0, n2 - 1) * 4.0f;
    }

    private float a() {
        if (!this.n.a()) {
            return this.a(this.t.size()) + 10.0f;
        }
        return this.a(this.r.size()) + 10.0f + 1.0f + this.a(this.s.size()) + 10.0f;
    }

    @Override
    public boolean a(int n2, char c2) {
        this.n.a(c2);
        return true;
    }

    @Override
    protected boolean a(int n2, double d2, double d3) {
        block6: {
            List<dN> list;
            if (n2 != 0) {
                return true;
            }
            float f2 = this.b + 40.0f + 1.0f;
            if (!(d3 >= (double)f2) || !(d3 <= (double)(this.b + this.d))) break block6;
            List<dN> list2 = list = !this.n.a() ? this.t : null;
            if (list != null) {
                for (dN dN2 : list) {
                    double d4;
                    double d5;
                    int n3;
                    if (!dN2.b(n3 = n2, d5 = d2, d4 = d3)) continue;
                    return true;
                }
            } else {
                for (dN dN3 : this.r) {
                    double d6;
                    double d7;
                    int n4;
                    if (!dN3.b(n4 = n2, d7 = d2, d6 = d3)) continue;
                    return true;
                }
                for (dN dN3 : this.s) {
                    double d8;
                    double d9;
                    int n5;
                    if (!dN3.b(n5 = n2, d9 = d2, d8 = d3)) continue;
                    return true;
                }
            }
        }
        return true;
    }

    @Override
    public boolean a(double d2, double d3, double d4) {
        float f2 = this.b + 40.0f + 1.0f;
        if (d3 < (double)this.a || d3 > (double)(this.a + this.c) || d4 < (double)f2 || d4 > (double)(this.b + this.d)) {
            return true;
        }
        float f3 = this.b + this.d - f2;
        float f4 = Math.max(0.0f, this.a() - f3);
        this.q = Math.clamp((float)(this.q - (float)(d2 * 48.0)), (float)0.0f, (float)f4);
        this.p.c(this.q);
        return true;
    }

    private dN a(fV fV2, String string, aT aT2) {
        return new dN(fV2.a(), fV2.a(), aT2.b(), false, string, () -> this.a(fV2, aT2));
    }

    private dN a(fV fV2) {
        return new dN(fV2.a(), fV2.a(), null, () -> this.a(fV2));
    }

    private String a(int n2) {
        return n2 < 9 ? "Ctrl " + (n2 + 1) : null;
    }

    public boolean a(int n2) {
        List<dN> list;
        List<dN> list2 = list = this.n.a() ? this.r : this.t;
        if (n2 < 0 || n2 >= list.size()) {
            return false;
        }
        Runnable runnable = list.get(n2).a();
        if (runnable == null) {
            return false;
        }
        runnable.run();
        return true;
    }

    private void a() {
        km km2;
        this.r.clear();
        km km3 = km2 = af.a() != null ? af.a().a() : null;
        if (km2 == null) {
            this.d();
            return;
        }
        int n2 = 0;
        for (String string : this.u) {
            fV fV2;
            if (n2 >= 3) break;
            aT aT2 = km2.a(string);
            if (aT2 == null || (fV2 = aT2.a()) == null) continue;
            String string2 = this.a(n2);
            fV fV3 = fV2;
            aT aT3 = aT2;
            this.r.add(this.a(fV3, string2, aT3));
            ++n2;
        }
        if (this.r.isEmpty()) {
            this.d();
        }
    }

    private void a(float f2, Matrix4f matrix4f, float f3) {
        float f4 = this.a + 14.0f;
        float f5 = f2 + 14.0f;
        float f6 = f3;
        int n2 = gD.mutedFg();
        float f7 = 12.0f;
        float f8 = 12.0f;
        float f9 = f5;
        float f10 = f4;
        kD kD2 = kD.SEARCH;
        Matrix4f matrix4f2 = matrix4f;
        jr.a(f6, n2, matrix4f2, f9, kD2, f7, f10, f8);
        float f11 = f4 + 12.0f + 10.0f;
        float f12 = f2 + 13.0f;
        float f13 = this.a + this.c - 14.0f - f11;
        float f14 = 40.0f;
        float f15 = f13;
        float f16 = f2;
        float f17 = f11;
        aM.b(f15, f14, f16, f17);
        if (this.n.a()) {
            ao.a(matrix4f, fc.a().a("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043a\u043e\u043c\u0430\u043d\u0434\u0443 \u0438\u043b\u0438 \u043f\u043e\u0438\u0441\u043a..."), f11, f12, 14.0f, gD.mutedFg(), f3);
            float f18 = f3;
            int n3 = gD.foreground();
            float f19 = 14.0f;
            float f20 = 1.0f;
            float f21 = f12;
            float f22 = f11;
            Matrix4f matrix4f3 = matrix4f;
            dP.a(f18, f19, f22, f21, f20, matrix4f3, n3);
        } else {
            boolean bl2 = true;
            float f23 = f3;
            int n4 = gD.foreground();
            float f24 = f13;
            float f25 = f12;
            float f26 = f11;
            Matrix4f matrix4f4 = matrix4f;
            this.n.a(f25, n4, matrix4f4, f23, bl2, f26, f24);
        }
        aM.b();
        float f27 = f2 + 40.0f;
        float f28 = f3;
        int n5 = gD.border();
        float f29 = 1.0f;
        float f30 = this.c;
        float f31 = f27;
        float f32 = this.a;
        Matrix4f matrix4f5 = matrix4f;
        dP.a(f28, f29, f32, f31, f30, matrix4f5, n5);
    }

    private void a(float f2, float f3, Matrix4f matrix4f, float f4, float f5) {
        boolean bl2;
        float f6 = f3 + 40.0f + 1.0f;
        float f7 = f3 + this.d;
        float f8 = f7 - f6;
        float f9 = this.a();
        float f10 = Math.max(0.0f, f9 - f8);
        if (this.q > f10) {
            this.q = f10;
        }
        if (this.q < 0.0f) {
            this.q = 0.0f;
        }
        this.p.c(this.q);
        float f11 = this.p.a();
        float f12 = f3 + this.d - 2.5f;
        float f13 = f12 - f6;
        float f14 = this.c;
        float f15 = f6;
        float f16 = this.a;
        aM.b(f14, f13, f15, f16);
        float f17 = f6 - f11;
        boolean bl3 = bl2 = !this.n.a();
        if (bl2) {
            float f18 = f17;
            List<dN> list = this.t;
            String string = fc.a().a("\u0420\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u044b");
            float f19 = f4;
            float f20 = f2;
            float f21 = f5;
            Matrix4f matrix4f2 = matrix4f;
            this.a(f20, string, f19, list, f18, matrix4f2, f21);
        } else {
            float f22 = f17;
            List<dN> list = this.r;
            String string = fc.a().a("\u041f\u0440\u0435\u0434\u043b\u043e\u0436\u0435\u043d\u0438\u044f");
            float f23 = f4;
            float f24 = f2;
            float f25 = f5;
            Matrix4f matrix4f3 = matrix4f;
            float f26 = this.a(f24, string, f23, list, f22, matrix4f3, f25);
            float f27 = f26 + 10.0f;
            float f28 = f4;
            int n2 = gD.border();
            float f29 = 1.0f;
            float f30 = this.c;
            float f31 = f27;
            float f32 = this.a;
            Matrix4f matrix4f4 = matrix4f;
            dP.a(f28, f29, f32, f31, f30, matrix4f4, n2);
            float f33 = f27 + 1.0f;
            List<dN> list2 = this.s;
            String string2 = fc.a().a("\u041a\u0430\u0442\u0435\u0433\u043e\u0440\u0438\u0438");
            float f34 = f4;
            float f35 = f2;
            float f36 = f5;
            Matrix4f matrix4f5 = matrix4f;
            this.a(f35, string2, f34, list2, f33, matrix4f5, f36);
        }
        aM.b();
    }
}

