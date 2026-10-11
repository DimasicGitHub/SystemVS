/*
 * Decompiled with CFR 0.152.
 */
public class gm
extends aT {
    private /* synthetic */ gz a;
    private /* synthetic */ dw b;
    private /* synthetic */ gz c;
    private /* synthetic */ float d;
    private /* synthetic */ float e;
    private /* synthetic */ long f;
    private /* synthetic */ long g;

    public /* synthetic */ gm() {
        super("\u0421\u0430\u043c\u0435\u0440\u0430\u0422\u0448\u0435\u0430\u043a\u0437", fV.e);
        gz gz2 = new gz("", "", 4.0, -1.0, 10.0, 0.5, "", 1);
        gz2.setNameParts(new String[]{"\u0414", "\u0438", "c", "\u0442", "\u0430", "\u043d", "\u0446", "\u0438", "\u044f", " ", "\u043a", "a", "\u043c", "\u0435", "\u0440", "\u044b"});
        gz2.setDescriptionParts(new String[]{"M", "\u0430", "\u043a", "\u0441", "\u0438", "\u043c", "\u0430", "\u043b", "\u044c", "\u043d", "\u043e", "\u0435", " ", "o", "\u0442", "\u0434", "\u0430", "\u043b", "\u0435", "\u043d", "\u0438", "\u0435", " ", "\u043a", "a", "\u043c", "\u0435", "\u0440", "\u044b", " ", "o", "\u0442", " ", "\u043f", "e", "\u0440", "\u0441", "\u043e", "\u043d", "\u0430", "\u0436", "\u0430"});
        this.a = gz2;
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"C", "\u043a", "\u0432", "\u043e", "\u0437", "\u044c", " ", "c", "\u0442", "\u0435", "\u043d", "\u044b"});
        dw2.setDescriptionParts(new String[]{"\u041f", "o", "\u0437", "\u0432", "\u043e", "\u043b", "\u044f", "\u0435", "\u0442", " ", "\u043a", "a", "\u043c", "\u0435", "\u0440", "\u0435", " ", "\u043f", "\u0440", "o", "\u0445", "\u043e", "\u0434", "\u0438", "\u0442", "\u044c", " ", "c", "\u043a", "\u0432", "\u043e", "\u0437", "\u044c", " ", "c", "\u0442", "\u0435", "\u043d", "\u044b"});
        this.b = dw2;
        gz gz3 = new gz("", "", 250.0, 0.0, 1000.0, 25.0, ec.join(new String[]{"\u043c", "c"}), 0);
        gz3.setNameParts(new String[]{"A", "\u043d", "\u0438", "\u043c", "\u0430", "\u0446", "\u0438", "\u044f", " ", "F", "5"});
        gz3.setDescriptionParts(new String[]{"\u0414", "\u043b", "\u0438", "\u0442", "e", "\u043b", "\u044c", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u043f", "\u043b", "a", "\u0432", "\u043d", "\u043e", "\u0433", "\u043e", " ", "\u043f", "e", "\u0440", "\u0435", "\u0445", "\u043e", "\u0434", "\u0430", " ", "\u043a", "a", "\u043c", "\u0435", "\u0440", "\u044b", " ", "\u0432", " ", "\u043c", "c", " ", "(", "0", " ", "\u2014", " ", "\u043c", "\u0433", "\u043d", "o", "\u0432", "\u0435", "\u043d", "\u043d", "\u043e", ")"});
        this.c = gz3;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = -1L;
        this.g = 0L;
        this.a(this.a, this.b, this.c);
    }

    @Override
    public /* bridge */ /* synthetic */ void i() {
        float f2;
        if (this.a() == null) {
            return;
        }
        boolean bl2 = !this.a().method_31044().method_31034();
        float f3 = f2 = bl2 ? this.a.a() : 0.0f;
        if (f2 != this.e) {
            this.d = this.a();
            this.e = f2;
            this.f = System.nanoTime();
            this.g = (long)(this.c.d() * 1000000.0);
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.e = 0.0f;
        this.d = 0.0f;
        this.f = -1L;
    }

    public /* bridge */ /* synthetic */ dw a() {
        return this.b;
    }

    public /* bridge */ /* synthetic */ gz a() {
        return this.a;
    }

    public /* bridge */ /* synthetic */ float a() {
        if (this.f < 0L || this.g <= 0L) {
            return this.e;
        }
        long l2 = System.nanoTime() - this.f;
        if (l2 >= this.g) {
            this.f = -1L;
            this.d = this.e;
            return this.e;
        }
        float f2 = (float)l2 / (float)this.g;
        return this.d + (this.e - this.d) * D.b(f2);
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.e = 0.0f;
        this.d = 0.0f;
        this.f = -1L;
    }
}

