/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_7439;

public class jo
extends aT {
    private /* synthetic */ dw a;
    private /* synthetic */ gz b;
    private /* synthetic */ fx c;
    private /* synthetic */ int d;
    private /* synthetic */ boolean e;

    public /* synthetic */ jo() {
        super("\u0410\u0443\u0442\u043e\u0410\u0441\u0441\u0435\u043f\u0442", fV.c);
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"T", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u0434", "p", "\u0443", "\u0437", "\u044c", "\u044f"});
        dw2.setDescriptionParts(new String[]{"\u041f", "\u0440", "\u0438", "\u043d", "\u0438", "\u043c", "a", "\u0442", "\u044c", " ", "\u0442", "\u043f", " ", "\u0442", "o", "\u043b", "\u044c", "\u043a", "\u043e", " ", "o", "\u0442", " ", "\u0434", "\u0440", "\u0443", "\u0437", "e", "\u0439"});
        this.a = dw2;
        gz gz2 = new gz("", "", 0.0, 0.0, 40.0, 1.0, ec.join(new String[]{" ", "\u0442", "\u0438", "\u043a", "o", "\u0432"}), 0);
        gz2.setNameParts(new String[]{"\u0417", "a", "\u0434", "\u0435", "\u0440", "\u0436", "\u043a", "\u0430"});
        gz2.setDescriptionParts(new String[]{"\u0417", "a", "\u0434", "\u0435", "\u0440", "\u0436", "\u043a", "\u0430", " ", "\u043f", "e", "\u0440", "\u0435", "\u0434", " ", "\u043f", "\u0440", "\u0438", "\u043d", "\u044f", "\u0442", "\u0438", "e", "\u043c", " ", "\u0442", "\u043f"});
        this.b = gz2;
        fx fx2 = new fx("", "", "tpaccept", ec.join(new String[]{"/", "\u043a", "o", "\u043c", "\u0430", "\u043d", "\u0434", "\u0430"}));
        fx2.setNameParts(new String[]{"K", "\u043e", "\u043c", "\u0430", "\u043d", "\u0434", "\u0430"});
        fx2.setDescriptionParts(new String[]{"K", "\u043e", "\u043c", "\u0430", "\u043d", "\u0434", "\u0430", " ", "\u0434", "\u043b", "\u044f", " ", "\u043f", "p", "\u0438", "\u043d", "\u044f", "\u0442", "\u0438", "\u044f", " ", "\u0442", "\u043f"});
        this.c = fx2;
        this.d = 0;
        this.e = false;
        this.a(this.a, this.b, this.c);
    }

    @Override
    public /* bridge */ /* synthetic */ void i() {
        if (this.z() || !this.e) {
            return;
        }
        if (this.d > 0) {
            --this.d;
            return;
        }
        String string = this.c.b().trim();
        if (!string.isEmpty() && this.a() != null) {
            this.a().method_45730(string);
        }
        this.e = false;
    }

    private /* bridge */ /* synthetic */ boolean b(String string) {
        for (String string2 : eV.a().a()) {
            if (!string.contains(string2.toLowerCase())) continue;
            return true;
        }
        return false;
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.e = false;
        this.d = 0;
    }

    private /* bridge */ /* synthetic */ boolean a(String string) {
        return !(!string.contains("teleport") && !string.contains("\u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442") && !string.contains("tpa") && !string.contains("tpask") || !string.contains("request") && !string.contains("\u043f\u0440\u043e\u0441\u0438\u0442") && !string.contains("\u0437\u0430\u043f\u0440\u043e\u0441") && !string.contains("has requested") && !string.contains("wants to"));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public /* bridge */ /* synthetic */ void a(lx lx2) {
        boolean bl3;
        class_2561 class_25612;
        if (lx2.a() != iG.b) {
            return;
        }
        class_2596 class_25962 = lx2.a();
        if (!(class_25962 instanceof class_7439)) return;
        Object object = (class_7439)class_25962;
        try {
            class_2561 class_25613;
            class_25612 = class_25613 = object.comp_763();
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
        boolean bl4 = bl3 = object.comp_906();
        if (!true) return;
        boolean bl2 = bl3;
        if (bl2) {
            return;
        }
        object = class_25612.getString().toLowerCase();
        if (!this.a((String)object)) {
            return;
        }
        if (this.a.a() && !this.b((String)object)) {
            return;
        }
        this.d = (int)this.b.d();
        this.e = true;
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.e = false;
        this.d = 0;
    }
}

