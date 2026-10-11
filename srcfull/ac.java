/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.function.Consumer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ac
extends dr<da, gq> {
    private final gq v = new gq();
    private aD w;

    public ac() {
        this.v.a(this::a);
        this.v.a(this::a);
        this.b();
    }

    private void e(kC kC2) {
        if (kC2 == null) {
            return;
        }
        Runnable runnable = this::b;
        String string = kC2.a();
        jg.a().b(runnable, string);
    }

    private String b() {
        String[] stringArray = new String[]{"\u043e\u043f\u0438\u0441\u0430\u043d\u0438\u0435", "\u043e\u043f\u0438\u0441\u0430\u043b\u043e\u0432\u043e", "\u0434\u0435\u0441\u043a\u0440\u0438\u043f\u0448\u043d"};
        Random random = new Random();
        return stringArray[random.nextInt(stringArray.length)] + " " + (random.nextInt(9000) + 1000);
    }

    public void b() {
        jg.a().a(this::c);
    }

    private void b(kC kC2, String string) {
        if (kC2 == null) {
            return;
        }
        Runnable runnable = this::b;
        String string2 = string == null ? "" : string;
        String string3 = kC2.a();
        jg.a().b(string2, string3, runnable);
    }

    private void b(kC kC2) {
        this.b();
    }

    private void c() {
        Object object22;
        List list = jg.a().a();
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        for (Object object22 : list) {
            if (object22 == null || ((kC)object22).a() == null) continue;
            linkedHashMap.put(((kC)object22).a(), object22);
        }
        ArrayList arrayList = new ArrayList();
        object22 = new HashSet();
        for (da object3 : this.m) {
            kC kC2 = object3.a();
            if (object3.i()) {
                arrayList.add(object3);
                continue;
            }
            if (kC2 == null || kC2.a() == null) continue;
            kC kC3 = (kC)linkedHashMap.get(kC2.a());
            if (kC3 != null) {
                object3.a(kC3);
                arrayList.add(object3);
                object22.add(kC2.a());
                continue;
            }
            object3.e();
            arrayList.add(object3);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (object22.contains(entry.getKey())) continue;
            arrayList.add(this.a((kC)entry.getValue()));
        }
        this.m.clear();
        this.m.addAll(arrayList);
        if (this.w != null && this.w.a() != null) {
            String string = this.w.a().a();
            for (kC kC2 : list) {
                if (kC2 == null || !Objects.equals(kC2.a(), string)) continue;
                this.w.a(kC2);
                break;
            }
        }
    }

    private void c(kC kC2) {
        jg.a().b(null);
    }

    private void f(kC kC2) {
        if (kC2 == null) {
            return;
        }
        boolean bl2 = !kC2.b();
        kC2.b(bl2);
        jg.a().a(kC2.a(), bl2, null);
    }

    private void d(kC kC2) {
        if (kC2 == null) {
            return;
        }
        Consumer<String> consumer = string -> {
            if (string == null) {
                return;
            }
            if (lo.aM != null && lo.aM.field_1774 != null) {
                lo.aM.field_1774.method_1455(string);
            }
        };
        String string2 = kC2.a();
        jg.a().a(consumer, string2);
    }

    private void d() {
        if (this.w != null) {
            this.w.a();
        }
        this.w = null;
    }

    @Override
    protected void a(float f2) {
        this.v.a(f2);
    }

    private void a(String string) {
        Consumer<kC> consumer = kC2 -> {
            if (kC2 == null) {
                this.v.c();
            } else {
                this.b();
            }
        };
        String string2 = string;
        jg.a().c(consumer, string2);
    }

    @Override
    protected /* bridge */ /* synthetic */ void a(gh gh2, boolean bl2, float f2, float f3) {
        boolean bl3 = bl2;
        float f4 = f3;
        float f5 = f2;
        gq gq2 = (gq)gh2;
        this.a(f4, bl3, gq2, f5);
    }

    @Override
    protected /* bridge */ /* synthetic */ gh a() {
        return this.a();
    }

    @Override
    protected boolean a() {
        return this.v.a().a();
    }

    @Override
    protected gq a() {
        return this.v;
    }

    private void a(kC kC2, String string) {
        if (kC2 == null || string == null) {
            return;
        }
        String string2 = kC2.a();
        if (string2 == null || string2.equals(string) || string.isBlank()) {
            return;
        }
        jg.a().a(string2, string, this::b);
    }

    private void a(da da2, kC kC3) {
        if (kC3 == null) {
            return;
        }
        this.d();
        aD aD2 = new aD(kC3);
        aD2.a(this::a);
        aD2.b(this::b);
        aD2.d(this::f);
        aD2.c((T kC2) -> {
            this.w = null;
        });
        this.w = aD2;
        aD2.a(() -> {
            float f2 = da2.o() + da2.q() + 16.0f;
            if (f2 + 300.0f > this.a + this.c) {
                f2 = da2.o() - 16.0f - 300.0f;
            }
            return new float[]{f2, da2.p()};
        });
    }

    private da a(kC kC3) {
        da da2 = new da(kC3);
        da2.a(this.n);
        da2.b(this::a);
        da2.c(this::b);
        da2.d(this::c);
        da2.e(this::d);
        da2.f(this::e);
        da2.a(this::a);
        da2.b(this::b);
        da2.h(this::f);
        da2.g((T kC2) -> this.a(da2, (kC)kC2));
        return da2;
    }

    private void a() {
        Consumer<kC> consumer = kC2 -> this.b();
        String string = this.b();
        String string2 = this.a();
        jg.a().a(string, string2, consumer);
    }

    private String a() {
        String[] stringArray = new String[]{"\u043a\u0444\u0433", "\u043a\u043e\u043d\u0444\u0438\u0433"};
        HashSet<String> hashSet = new HashSet<String>();
        for (kC kC2 : jg.a().a()) {
            if (kC2.a() == null) continue;
            hashSet.add(kC2.a());
        }
        Random random = new Random();
        for (int i2 = 0; i2 < 32; ++i2) {
            String string = stringArray[random.nextInt(stringArray.length)] + " " + (random.nextInt(9000) + 1000);
            if (hashSet.contains(string)) continue;
            return string;
        }
        return "\u043a\u0444\u0433 " + Long.toString(System.currentTimeMillis(), 36);
    }

    @Override
    protected float a() {
        return 300.0f;
    }

    private void a(kC kC2) {
        if (kC2 == null) {
            return;
        }
        Runnable runnable = this::b;
        String string = kC2.a();
        jg.a().a(runnable, string);
    }

    protected void a(float f2, boolean bl2, gq gq2, float f3) {
        if (bl2) {
            float f4 = f2;
            float f5 = f3;
            gq2.a(f4, f5);
        } else {
            float f6 = f2;
            float f7 = f3;
            gq2.c(f6, f7);
        }
    }
}

