/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2350;

public class lt
extends aT {
    private /* synthetic */ jh a;
    private /* synthetic */ gz b;
    private /* synthetic */ jh c;
    private final /* synthetic */ Map<Long, iA> d;
    private final /* synthetic */ Set<Long> e;
    private /* synthetic */ boolean f;
    private /* synthetic */ double g;
    private /* synthetic */ double h;
    private /* synthetic */ double i;
    private final /* synthetic */ float[] j;
    private /* synthetic */ class_1937 k;
    private /* synthetic */ int l;

    public /* synthetic */ lt() {
        super("\u0421\u0445\u0443\u043d\u043a\u0410\u043d\u0438\u043c\u0430\u0442\u043e\u0440", fV.d);
        jh jh2 = new jh("", "", List.of(ec.join(new String[]{"\u0421", "\u043d", "\u0438", "\u0437", "\u0443"}), ec.join(new String[]{"\u0421", "\u0432", "\u0435", "\u0440", "\u0445", "\u0443"}), ec.join(new String[]{"\u0413", "\u0438", "\u0431", "\u0440", "\u0438", "\u0434"}), ec.join(new String[]{"\u0421", "\u0431", "\u043e", "\u043a", "\u0443"})), List.of(ec.join(new String[]{"\u0421", "\u043d", "\u0438", "\u0437", "\u0443"})), false);
        jh2.setNameParts(new String[]{"\u0420", "e", "\u0436", "\u0438", "\u043c"});
        jh2.setDescriptionParts(new String[]{"O", "\u0442", "\u043a", "\u0443", "\u0434", "\u0430", " ", "\u0432", "\u044b", "e", "\u0437", "\u0436", "\u0430", "\u044e", "\u0442", " ", "\u0447", "a", "\u043d", "\u043a", "\u0438", " ", "(", "\u0413", "\u0438", "\u0431", "p", "\u0438", "\u0434", " ", "\u2014", " ", "\u043d", "\u0438", "\u0436", "e", " ", "\u0433", "o", "\u0440", "\u0438", "\u0437", "\u043e", "\u043d", "\u0442", "\u0430", " ", "c", "\u043d", "\u0438", "\u0437", "\u0443", ",", " ", "\u0432", "\u044b", "\u0448", "e", " ", "\u2014", " ", "c", "\u0432", "\u0435", "\u0440", "\u0445", "\u0443", ")"});
        this.a = jh2;
        gz gz2 = new gz("", "", 1000.0, 100.0, 5000.0, 50.0, ec.join(new String[]{"\u043c", "c"}), 0);
        gz2.setNameParts(new String[]{"\u0414", "\u043b", "\u0438", "\u0442", "e", "\u043b", "\u044c", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c"});
        gz2.setDescriptionParts(new String[]{"\u0412", "\u0440", "e", "\u043c", "\u044f", " ", "a", "\u043d", "\u0438", "\u043c", "\u0430", "\u0446", "\u0438", "\u0438", " ", "o", "\u0434", "\u043d", "\u043e", "\u0439", " ", "c", "\u0435", "\u043a", "\u0446", "\u0438", "\u0438"});
        this.b = gz2;
        jh jh3 = new jh("", "", List.of(ec.join(new String[]{"\u0414", "\u0443", "\u0433", "a"}), ec.join(new String[]{"C", "\u0438", "\u043d", "\u0443", "\u0441"}), ec.join(new String[]{"\u042d", "\u043a", "c", "\u043f", "\u043e", "\u043d", "\u0435", "\u043d", "\u0442", "\u0430"}), ec.join(new String[]{"K", "\u0432", "\u0430", "\u0440", "\u0442"})), List.of(ec.join(new String[]{"\u0414", "\u0443", "\u0433", "a"})), false);
        jh3.setNameParts(new String[]{"\u0418", "\u0437", "\u0438", "\u043d", "\u0433"});
        jh3.setDescriptionParts(new String[]{"\u0424", "y", "\u043d", "\u043a", "\u0446", "\u0438", "\u044f", " ", "c", "\u0433", "\u043b", "\u0430", "\u0436", "\u0438", "\u0432", "\u0430", "\u043d", "\u0438", "\u044f", " ", "a", "\u043d", "\u0438", "\u043c", "\u0430", "\u0446", "\u0438", "\u0438"});
        this.c = jh3;
        this.d = new HashMap<Long, iA>();
        this.e = new HashSet<Long>();
        this.f = false;
        this.j = new float[3];
        this.k = null;
        this.l = 0;
        this.a(this.a, this.b, this.c);
    }

    private /* bridge */ /* synthetic */ int e() {
        return this.a().method_8597().comp_651();
    }

    public /* bridge */ /* synthetic */ void b() {
        this.f = false;
    }

    public /* bridge */ /* synthetic */ int b() {
        String string = this.a.a();
        if (string == null) {
            return 0;
        }
        return switch (string) {
            case "\u0421\u0432\u0435\u0440\u0445\u0443" -> 1;
            case "\u0413\u0438\u0431\u0440\u0438\u0434" -> 2;
            case "\u0421\u0431\u043e\u043a\u0443" -> 3;
            default -> 0;
        };
    }

    public /* bridge */ /* synthetic */ void c() {
        this.d.clear();
        this.e.clear();
        jP.a();
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.a();
    }

    private /* bridge */ /* synthetic */ int f() {
        return this.a().method_8597().comp_651() + this.a().method_8597().comp_652();
    }

    public /* bridge */ /* synthetic */ int d() {
        String string = this.c.a();
        if (string == null) {
            return 7;
        }
        return switch (string) {
            case "C\u0438\u043d\u0443\u0441" -> 6;
            case "\u042d\u043ac\u043f\u043e\u043d\u0435\u043d\u0442\u0430" -> 5;
            case "K\u0432\u0430\u0440\u0442" -> 3;
            default -> 7;
        };
    }

    private /* bridge */ /* synthetic */ class_2350 a(int n2, int n3) {
        class_2338 class_23382 = this.b().method_24515();
        int n4 = class_23382.method_10263() - (n3 + 8);
        int n5 = class_23382.method_10260() - (n2 + 8);
        if (Math.abs(n4) > Math.abs(n5)) {
            return n4 > 0 ? class_2350.field_11034 : class_2350.field_11039;
        }
        return n5 > 0 ? class_2350.field_11035 : class_2350.field_11043;
    }

    public /* bridge */ /* synthetic */ int a() {
        return this.b.a();
    }

    private /* bridge */ /* synthetic */ jv a() {
        String string = this.c.a();
        if (string == null) {
            return jv.p;
        }
        return switch (string) {
            case "C\u0438\u043d\u0443\u0441" -> jv.o;
            case "\u042d\u043ac\u043f\u043e\u043d\u0435\u043d\u0442\u0430" -> jv.n;
            case "K\u0432\u0430\u0440\u0442" -> jv.m;
            default -> jv.p;
        };
    }

    public /* bridge */ /* synthetic */ void a(double d2, double d3, double d4) {
        this.g = d3;
        this.h = d4;
        this.i = d2;
        this.f = true;
    }

    private static /* bridge */ /* synthetic */ long a(int n2, int n3, long l2) {
        long l3 = n3 - (class_2338.method_10061((long)l2) + 8);
        long l4 = n2 - (class_2338.method_10083((long)l2) + 8);
        return l3 * l3 + l4 * l4;
    }

    private /* bridge */ /* synthetic */ void a() {
        this.d.clear();
        this.e.clear();
        jP.a();
        this.f = false;
        this.k = null;
        this.l = 0;
    }

    public /* bridge */ /* synthetic */ float[] a(float f2, float f3, float f4) {
        float f5;
        float f6;
        if (!this.f || this.a() == null) {
            return null;
        }
        double d2 = (double)f4 + this.g;
        double d3 = (double)f2 + this.h;
        double d4 = (double)f3 + this.i;
        int n2 = (int)Math.round(d2);
        int n3 = (int)Math.round(d3);
        int n4 = (int)Math.round(d4);
        if ((n2 & 0xF) != 0 || (n3 & 0xF) != 0 || (n4 & 0xF) != 0) {
            return null;
        }
        if (Math.abs(d2 - (double)n2) > 0.01 || Math.abs(d3 - (double)n3) > 0.01 || Math.abs(d4 - (double)n4) > 0.01) {
            return null;
        }
        long l2 = class_2338.method_10064((int)n2, (int)n3, (int)n4);
        iA iA2 = this.d.get(l2);
        if (iA2 == null) {
            if (!this.e.add(l2)) {
                return null;
            }
            iA2 = new iA(n2, n3, n4);
            this.d.put(l2, iA2);
        }
        long l3 = System.currentTimeMillis();
        if (iA2.a == -1L) {
            iA2.a = l3;
            if ("\u0421\u0431\u043e\u043a\u0443".equals(this.a.a()) && this.b() != null) {
                int n5 = n4;
                int n6 = n2;
                iA2.b = this.a(n5, n6);
            }
        }
        if ((f6 = (float)(l3 - iA2.a)) >= (f5 = this.b.a())) {
            this.d.remove(l2);
            return null;
        }
        jv jv2 = this.a();
        String string = this.a.a();
        if ("\u0413\u0438\u0431\u0440\u0438\u0434".equals(string)) {
            string = (double)iA2.d < 63.0 ? "\u0421\u043d\u0438\u0437\u0443" : "\u0421\u0432\u0435\u0440\u0445\u0443";
        }
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        if ("\u0421\u043d\u0438\u0437\u0443".equals(string)) {
            float f10 = Math.abs(iA2.d - this.e());
            float f11 = f5;
            float f12 = f10;
            float f13 = 0.0f;
            float f14 = f6;
            f8 = -f10 + jv2.a(f14, f13, f11, f12);
        } else if ("\u0421\u0432\u0435\u0440\u0445\u0443".equals(string)) {
            float f15 = Math.max(0, this.f() - iA2.d);
            float f16 = f5;
            float f17 = f15;
            float f18 = 0.0f;
            float f19 = f6;
            f8 = f15 - jv2.a(f19, f18, f16, f17);
        } else if (iA2.b != null) {
            float f20 = f5;
            float f21 = 200.0f;
            float f22 = 0.0f;
            float f23 = f6;
            float f24 = -(200.0f - jv2.a(f23, f22, f20, f21));
            f7 = (float)iA2.b.method_10148() * f24;
            f9 = (float)iA2.b.method_10165() * f24;
        } else {
            return null;
        }
        if (f7 == 0.0f && f8 == 0.0f && f9 == 0.0f) {
            return null;
        }
        this.j[0] = f4 + f7;
        this.j[1] = f2 + f8;
        this.j[2] = f3 + f9;
        return this.j;
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.a();
    }

    @Override
    public /* bridge */ /* synthetic */ void j() {
        class_1937 class_19372;
        class_1937 class_19373 = class_19372 = this.y() ? this.a() : null;
        if (class_19372 != this.k) {
            this.k = class_19372;
            this.d.clear();
            this.e.clear();
        }
        if (class_19372 == null || this.b() == null) {
            return;
        }
        if (++this.l < 20) {
            return;
        }
        this.l = 0;
        int n2 = ((Integer)this.a().method_42503().method_41753() + 2) * 16;
        long l2 = (long)n2 * (long)n2;
        int n3 = this.b().method_24515().method_10263();
        int n4 = this.b().method_24515().method_10260();
        this.e.removeIf(l3 -> {
            int n4 = n4;
            int n5 = n3;
            long l4 = l3;
            return lt.a(n4, n5, l4) > l2;
        });
        this.d.keySet().removeIf(l3 -> {
            int n4 = n4;
            int n5 = n3;
            long l4 = l3;
            return lt.a(n4, n5, l4) > l2;
        });
    }
}

