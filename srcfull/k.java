/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class k
extends ik {
    private final dw p;
    private final ArrayList<i> q;

    public k() {
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"\u0412", "\u0438", "\u0437", "\u0443", "a", "\u043b", "\u044b", " ", "\u0432", " ", "\u0431", "\u0438", "\u043d", "\u0434", "a", "\u0445"});
        dw2.setDescriptionParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0431", "\u0438", "\u043d", "\u0434", "\u044b", " ", "\u043d", "a", " ", "\u0432", "\u0438", "\u0437", "\u0443", "a", "\u043b", "-", "\u043c", "o", "\u0434", "\u0443", "\u043b", "\u0438"});
        this.p = dw2;
        this.q = new ArrayList();
        this.a((fa)this.p);
    }

    @Override
    public String e() {
        return "\u041a\u0435\u0439\u0431\u0438\u043d\u0434\u0437";
    }

    @Override
    protected List b() {
        return List.of(new i("\u0421\u043b\u0438\u0441\u043a\u0413\u0443\u0438", "Y", true, fV.f.a()), new i("\u0422\u0440\u0438\u0433\u0433\u0435\u0440\u0411\u043e\u0442", "R", true, fV.a.a()), new i("\u0410\u0438\u043c\u0410\u0437\u0437\u0438\u0437\u0442", "V", true, fV.a.a()));
    }

    @Override
    protected String f() {
        return "Keybinds";
    }

    @Override
    public String d() {
        return "ks";
    }

    @Override
    protected boolean a() {
        return true;
    }

    @Override
    protected float a() {
        return 20.0f;
    }

    @Override
    protected List a() {
        ArrayList<i> arrayList = this.q;
        arrayList.clear();
        af af2 = af.a();
        if (af2 == null) {
            return arrayList;
        }
        km km2 = af2.a();
        if (km2 == null) {
            return arrayList;
        }
        boolean bl2 = this.p.a();
        for (aT aT2 : km2.b()) {
            int n2;
            bu bu2;
            if (aT2 instanceof bQ || !bl2 && aT2.a() == fV.e || (bu2 = aT2.a()) == null || (n2 = bu2.a()) == -1) continue;
            fV fV2 = aT2.a();
            arrayList.add(new i(aT2.b(), bu2.a(), true, fV2 != null ? fV2.a() : null));
        }
        return arrayList;
    }

    @Override
    protected kD a() {
        return kD.KEYBOARD;
    }

    @Override
    protected void a(dd dd2, boolean bl2) {
        dd2.b().a(bl2);
    }

    @Override
    protected boolean a(dd dd2) {
        return dd2.b().a();
    }
}

