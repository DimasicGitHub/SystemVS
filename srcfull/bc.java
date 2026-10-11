/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_10192;
import net.minecraft.class_1304;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_437;
import net.minecraft.class_490;
import net.minecraft.class_9334;

public class bc
extends aT {
    private /* synthetic */ kn a;
    private /* synthetic */ kn b;
    private /* synthetic */ dw c;
    private volatile /* synthetic */ boolean d;
    private /* synthetic */ boolean e;
    private /* synthetic */ Runnable f;
    private /* synthetic */ int g;
    private /* synthetic */ int h;

    public /* synthetic */ bc() {
        super("\u0415\u043b\u0439\u0442\u0440\u0430\u0417\u0448\u0430\u043f", fV.b);
        kn kn2 = new kn("", "", 71, () -> {
            int n2;
            if (this.z() || this.d) {
                return;
            }
            boolean bl2 = this.a();
            int n3 = bl2 ? this.d() : this.a();
            int n4 = n2 = bl2 ? this.e() : this.b();
            if (n3 == -1 && n2 == -1) {
                return;
            }
            if (n3 != -1) {
                this.a(() -> bw.a(6, n3));
            } else {
                this.a(n2);
            }
            this.c(bl2);
        });
        kn2.setNameParts(new String[]{"K", "\u043b", "\u0430", "\u0432", "\u0438", "\u0448", "\u0430", " ", "c", "\u0432", "\u0430", "\u043f", "\u0430"});
        kn2.setDescriptionParts(new String[]{"K", "\u043d", "\u043e", "\u043f", "\u043a", "\u0430", " ", "\u0434", "\u043b", "\u044f", " ", "c", "\u043c", "\u0435", "\u043d", "\u044b", " ", "\u044d", "\u043b", "\u0438", "\u0442", "p", "\u044b"});
        this.a = kn2;
        kn kn3 = new kn("", "", 70, () -> {
            if (this.z() || this.d) {
                return;
            }
            if (!this.a()) {
                return;
            }
            int n2 = this.a(class_1802.field_8639);
            if (n2 != -1) {
                int n3 = this.a().field_7545;
                this.d = true;
                Runnable runnable = this.a();
                int n4 = n3;
                int n5 = n2;
                bc bc2 = this;
                y.a(n5, n4, runnable, bc2);
                String string = "\u0444\u0435\u0439\u0435\u0440\u0432\u0435\u0440\u043a";
                String string2 = "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043b";
                ct ct2 = ct.of(class_1802.field_8639);
                ek.a().a(string2, ct2, string);
                return;
            }
            int n6 = this.b(class_1802.field_8639);
            if (n6 != -1) {
                int n7 = bw.a(n6);
                this.d = true;
                Runnable runnable = this.a();
                int n8 = n7;
                bc bc3 = this;
                y.a(runnable, (aT)bc3, n8);
                String string = "\u0444\u0435\u0439\u0435\u0440\u0432\u0435\u0440\u043a";
                String string3 = "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043b";
                ct ct3 = ct.of(class_1802.field_8639);
                ek.a().a(string3, ct3, string);
            }
        });
        kn3.setNameParts(new String[]{"K", "\u043b", "\u0430", "\u0432", "\u0438", "\u0448", "\u0430", " ", "\u0444", "e", "\u0439", "\u0435", "\u0440", "\u0432", "\u0435", "\u0440", "\u043a", "\u0430"});
        kn3.setDescriptionParts(new String[]{"K", "\u043d", "\u043e", "\u043f", "\u043a", "\u0430", " ", "\u0434", "\u043b", "\u044f", " ", "\u0437", "a", "\u043f", "\u0443", "\u0441", "\u043a", "\u0430", " ", "\u0444", "e", "\u0439", "\u0435", "\u0440", "\u0432", "\u0435", "\u0440", "\u043a", "\u0430"});
        this.b = kn3;
        dw dw2 = new dw("", "", false);
        dw2.setNameParts(new String[]{"O", "\u0442", "\u043a", "\u0440", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0438", "\u043d", "\u0432", "e", "\u043d", "\u0442", "\u0430", "\u0440", "\u044c"});
        dw2.setDescriptionParts(new String[]{"O", "\u0442", "\u043a", "\u0440", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0438", "\u043d", "\u0432", "e", "\u043d", "\u0442", "\u0430", "\u0440", "\u044c", " ", "\u043f", "p", "\u0438", " ", "c", "\u0432", "\u0430", "\u043f", "\u0435"});
        this.c = dw2;
        this.d = false;
        this.e = false;
        this.f = null;
        this.g = 0;
        this.h = 0;
        this.a(this.a, this.b, this.c);
    }

    private /* bridge */ /* synthetic */ int e() {
        for (int i2 = 9; i2 < 36; ++i2) {
            if (!this.a(this.a().method_5438(i2))) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public /* bridge */ /* synthetic */ void i() {
        if (this.d) {
            gT.d();
        }
        if (this.f != null) {
            if (this.g > 0) {
                --this.g;
                return;
            }
            Runnable runnable = this.f;
            this.f = null;
            runnable.run();
            this.h = 2;
            return;
        }
        if (this.h > 0) {
            --this.h;
            if (this.h == 0) {
                dF.f();
                this.c();
                this.d = false;
            }
        }
    }

    private /* bridge */ /* synthetic */ int b() {
        return this.b(class_1802.field_8833);
    }

    private /* bridge */ /* synthetic */ void b() {
        this.c();
        dF.f();
        this.f = null;
        this.g = 0;
        this.h = 0;
        this.d = false;
    }

    private /* bridge */ /* synthetic */ int b(class_1792 class_17922) {
        for (int i2 = 9; i2 < 36; ++i2) {
            if (!this.a().method_5438(i2).method_31574(class_17922)) continue;
            return i2;
        }
        return -1;
    }

    private /* bridge */ /* synthetic */ void c() {
        if (!this.e) {
            return;
        }
        this.e = false;
        gT.b();
    }

    private /* bridge */ /* synthetic */ void c(boolean bl2) {
        String string;
        class_1792 class_17922;
        class_1792 class_17923 = class_17922 = bl2 ? this.a() : class_1802.field_8833;
        if (class_17922 == null) {
            class_17922 = class_1802.field_8833;
        }
        String string2 = string = bl2 ? "\u043d\u0430\u0433\u0440\u0443\u0434\u043d\u0438\u043a" : "\u044d\u043b\u0438\u0442\u0440\u0443";
        String string3 = "\u0421\u0432\u0430\u043f\u043d\u0443\u043b";
        ct ct2 = ct.of(class_17922);
        ek.a().a(string3, ct2, string2);
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.b();
    }

    private /* bridge */ /* synthetic */ int d() {
        for (int i2 = 0; i2 < 9; ++i2) {
            if (!this.a(this.a().method_5438(i2))) continue;
            return i2;
        }
        return -1;
    }

    private /* bridge */ /* synthetic */ Runnable a() {
        return () -> {
            this.d = false;
        };
    }

    private /* bridge */ /* synthetic */ int a(class_1792 class_17922) {
        for (int i2 = 0; i2 < 9; ++i2) {
            if (!this.a().method_5438(i2).method_31574(class_17922)) continue;
            return i2;
        }
        return -1;
    }

    private /* bridge */ /* synthetic */ boolean a(class_1799 class_17992) {
        if (class_17992.method_7960() || class_17992.method_31574(class_1802.field_8833)) {
            return false;
        }
        class_10192 class_101922 = (class_10192)class_17992.method_57824(class_9334.field_54196);
        return class_101922 != null && class_101922.comp_3174() == class_1304.field_6174;
    }

    private /* bridge */ /* synthetic */ void a(int n2) {
        int n3 = this.a().field_7545;
        int n4 = bw.a(n2);
        this.a(() -> {
            Runnable runnable = () -> {
                Runnable runnable = () -> bw.a(n4, n3);
                int n4 = n3;
                int n5 = 6;
                bw.a(runnable, n4, n5);
            };
            int n4 = n3;
            int n5 = n4;
            bw.a(runnable, n4, n5);
        });
    }

    private /* bridge */ /* synthetic */ void a(Runnable runnable) {
        this.d = true;
        this.a();
        dF.e();
        this.e = true;
        gT.a();
        if (this.b() != null) {
            this.b().method_5728(false);
        }
        this.f = runnable;
        this.g = 1;
    }

    private /* bridge */ /* synthetic */ class_1792 a() {
        int n2 = this.d();
        if (n2 != -1) {
            return this.a().method_5438(n2).method_7909();
        }
        int n3 = this.e();
        if (n3 != -1) {
            return this.a().method_5438(n3).method_7909();
        }
        return null;
    }

    private /* bridge */ /* synthetic */ void a() {
        if (this.c.a() && this.a() == null) {
            this.a().method_1507((class_437)new class_490(this.b()));
        }
    }

    private /* bridge */ /* synthetic */ boolean a() {
        return this.b().method_6118(class_1304.field_6174).method_31574(class_1802.field_8833);
    }

    private /* bridge */ /* synthetic */ int a() {
        return this.a(class_1802.field_8833);
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.b();
    }

    @Override
    public /* bridge */ /* synthetic */ void j() {
        if (this.d) {
            gT.d();
        }
    }
}

