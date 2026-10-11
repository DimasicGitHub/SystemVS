/*
 * Decompiled with CFR 0.152.
 */
public class ky
extends aT {
    private final /* synthetic */ gz a;

    public /* synthetic */ ky() {
        super("\u0417\u043e\u0443\u043d\u0434\u0437", fV.f);
        gz gz2 = new gz("", "", 20.0, 0.0, 100.0, 1.0, "%", 0);
        gz2.setNameParts(new String[]{"\u0413", "\u0440", "o", "\u043c", "\u043a", "\u043e", "\u0441", "\u0442", "\u044c"});
        gz2.setDescriptionParts(new String[]{"O", "\u0431", "\u0449", "\u0430", "\u044f", " ", "\u0433", "\u0440", "o", "\u043c", "\u043a", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u0437", "\u0432", "\u0443", "\u043a", "o", "\u0432"});
        this.a = gz2;
        this.a(new fa[]{this.a});
        this.a();
    }

    @Override
    protected /* bridge */ /* synthetic */ void c(fa fa2) {
        if (fa2 == this.a) {
            iB.a().a((float)(this.a.d() / 100.0));
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        iB.a().a(false);
    }

    public /* bridge */ /* synthetic */ gz a() {
        return this.a;
    }

    private /* bridge */ /* synthetic */ void a() {
        iB iB2 = iB.a();
        iB2.a(this.f());
        iB2.a((float)(this.a.d() / 100.0));
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        iB.a().a(true);
    }
}

