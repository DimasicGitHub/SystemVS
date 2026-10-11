/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_3532;
import net.minecraft.class_5498;

public class kx
extends aT {
    private /* synthetic */ kn a;
    private /* synthetic */ dw b;
    private /* synthetic */ boolean c;
    private /* synthetic */ float d;
    private /* synthetic */ float e;
    private /* synthetic */ float f;
    private /* synthetic */ float g;
    private /* synthetic */ boolean h;
    private /* synthetic */ class_5498 i;

    public /* synthetic */ kx() {
        super("\u0424\u0440\u0435\u0435\u041b\u043e\u043e\u043a", fV.e);
        kn kn2 = new kn("", "", 342);
        kn2.setNameParts(new String[]{"K", "\u043b", "\u0430", "\u0432", "\u0438", "\u0448", "\u0430"});
        kn2.setDescriptionParts(new String[]{"\u0417", "a", "\u0436", "\u043c", "\u0438", "\u0442", "\u0435", " ", "\u0434", "\u043b", "\u044f", " ", "c", "\u0432", "\u043e", "\u0431", "\u043e", "\u0434", "\u043d", "\u043e", "\u0433", "\u043e", " ", "o", "\u0441", "\u043c", "\u043e", "\u0442", "\u0440", "\u0430"});
        this.a = kn2;
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"A", "\u0432", "\u0442", "\u043e", " ", "F", "5"});
        dw2.setDescriptionParts(new String[]{"A", "\u0432", "\u0442", "\u043e", "\u043c", "\u0430", "\u0442", "\u0438", "\u0447", "\u0435", "\u0441", "\u043a", "\u0438", " ", "\u043f", "e", "\u0440", "\u0435", "\u043a", "\u043b", "\u044e", "\u0447", "\u0430", "\u0442", "\u044c", " ", "\u0432", " ", "3", "-", "e", " ", "\u043b", "\u0438", "\u0446", "o", " ", "\u0432", "o", " ", "\u0432", "\u0440", "e", "\u043c", "\u044f", " ", "\u0424", "\u0440", "\u0438", "\u043b", "\u0443", "\u043a", "a"});
        this.b = dw2;
        this.c = false;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = false;
        this.i = class_5498.field_26664;
        this.a(this.a, this.b);
    }

    @Override
    public /* bridge */ /* synthetic */ void b(bh bh2) {
        if (!this.c) {
            return;
        }
        bh2.b(this.d);
        bh2.a(this.e);
    }

    public /* bridge */ /* synthetic */ float b() {
        return this.g;
    }

    private /* bridge */ /* synthetic */ void b() {
        if (this.h && this.a() != null) {
            this.a().method_31043(this.i);
        }
        this.c();
    }

    public /* bridge */ /* synthetic */ boolean b() {
        return this.c;
    }

    private /* bridge */ /* synthetic */ void c() {
        this.c = false;
        this.h = false;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.i = class_5498.field_26664;
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.b();
    }

    private /* bridge */ /* synthetic */ void a() {
        if (this.b() == null || this.a() == null) {
            return;
        }
        this.c = true;
        this.d = this.b().method_36454();
        this.e = this.b().method_36455();
        this.f = this.d;
        this.g = this.e;
        this.i = this.a().method_31044();
        this.h = false;
        if (this.b.a() && this.i.method_31034()) {
            this.a().method_31043(class_5498.field_26665);
            this.h = true;
        }
    }

    public /* bridge */ /* synthetic */ float a() {
        return this.f;
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return this.f() && this.c;
    }

    @Override
    public /* bridge */ /* synthetic */ void k() {
        if (this.z()) {
            return;
        }
        if (this.a().field_1755 != null) {
            if (this.c) {
                this.b();
            }
            return;
        }
        if (!this.a.a()) {
            if (this.c) {
                this.b();
            }
            return;
        }
        if (!this.c) {
            this.a();
        }
        if (!this.c) {
            return;
        }
        float f2 = this.b().method_36454();
        float f3 = this.b().method_36455();
        float f4 = class_3532.method_15393((float)(f2 - this.d));
        float f5 = f3 - this.e;
        this.f = class_3532.method_15393((float)(this.f + f4));
        this.g = class_3532.method_15363((float)(this.g + f5), (float)-90.0f, (float)90.0f);
        this.b().method_36456(this.d);
        this.b().method_36457(this.e);
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.c();
    }
}

