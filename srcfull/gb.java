/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1657;
import net.minecraft.class_418;

public class gb
extends aT {
    private /* synthetic */ dw a;
    private /* synthetic */ long b;
    private /* synthetic */ boolean c;

    public /* synthetic */ gb() {
        super("\u0410\u0443\u0442\u043e\u0420\u0435\u0437\u043f\u0430\u0448\u043d", fV.c);
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u043a", "o", "\u043e", "\u0440", "\u0434", "\u0438", "\u043d", "\u0430", "\u0442", "\u044b", " ", "c", "\u043c", "\u0435", "\u0440", "\u0442", "\u0438"});
        dw2.setDescriptionParts(new String[]{"O", "\u0442", "\u043e", "\u0431", "\u0440", "\u0430", "\u0436", "\u0430", "\u0442", "\u044c", " ", "\u043a", "o", "\u043e", "\u0440", "\u0434", "\u0438", "\u043d", "\u0430", "\u0442", "\u044b", " ", "c", "\u043c", "\u0435", "\u0440", "\u0442", "\u0438"});
        this.a = dw2;
        this.b = -1L;
        this.c = false;
        this.a(new fa[]{this.a});
    }

    @Override
    public /* bridge */ /* synthetic */ void i() {
        if (this.z()) {
            return;
        }
        this.a();
        this.b();
        this.c();
    }

    private /* bridge */ /* synthetic */ void b() {
        if (this.b == -1L) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (l2 >= this.b) {
            this.t();
            this.u();
        }
    }

    private /* bridge */ /* synthetic */ void c() {
        class_1657 class_16572 = this.b();
        if (class_16572 == null) {
            return;
        }
        if (class_16572.method_5805()) {
            this.c = false;
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.u();
    }

    @Override
    public /* bridge */ /* synthetic */ void l() {
        this.v();
    }

    private /* bridge */ /* synthetic */ void d() {
        if (this.c) {
            return;
        }
        this.c = true;
        class_1657 class_16572 = this.b();
        if (class_16572 != null && this.a.a()) {
            this.c("\u0412\u044b \u0443\u043c\u0435\u0440\u043b\u0438 \u043d\u0430 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430\u0445: X=" + (int)class_16572.method_23317() + " Y=" + (int)class_16572.method_23318() + " Z=" + (int)class_16572.method_23321());
        }
        this.b = System.currentTimeMillis() + 500L;
    }

    @Override
    public /* bridge */ /* synthetic */ void a(class_1657 class_16572) {
        if (class_16572 != this.b() || this.c) {
            return;
        }
        this.d();
    }

    private /* bridge */ /* synthetic */ void a() {
        if (this.a() instanceof class_418 && !this.c) {
            this.d();
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void m() {
        this.v();
    }

    private /* bridge */ /* synthetic */ void t() {
        try {
            class_1657 class_16572;
            if (this.a().method_1562() == null) {
                return;
            }
            if (this.a() instanceof class_418) {
                this.a().method_1507(null);
            }
            if ((class_16572 = this.b()) != null) {
                class_16572.method_7331();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.v();
    }

    private /* bridge */ /* synthetic */ void v() {
        this.c = false;
        this.u();
    }

    private /* bridge */ /* synthetic */ void u() {
        this.b = -1L;
    }
}

