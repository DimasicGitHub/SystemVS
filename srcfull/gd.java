/*
 * Decompiled with CFR 0.152.
 */
import b.Boot;
import java.util.function.Predicate;
import net.minecraft.class_332;
import net.minecraft.class_408;
import net.minecraft.class_437;
import net.minecraft.class_4587;
import net.minecraft.class_9779;

public class gd
extends aT {
    private static final /* synthetic */ hW<gd> a;
    private static final /* synthetic */ hW<cC> b;
    private static final /* synthetic */ hW<db> c;
    private static final /* synthetic */ hW<ll> d;
    private static final /* synthetic */ hW<is> e;
    private static final /* synthetic */ hW<lg> f;
    private static final /* synthetic */ hW<dc> g;
    private static final /* synthetic */ hW<hv> h;
    private static final /* synthetic */ class_4587 i;
    private static final /* synthetic */ H j;
    private static volatile /* synthetic */ boolean k;
    private static /* synthetic */ boolean l;
    private static volatile /* synthetic */ boolean m;
    private static /* synthetic */ class_332 n;
    private /* synthetic */ dw o;
    private /* synthetic */ dw p;
    private /* synthetic */ dw q;
    private /* synthetic */ dw r;

    public /* synthetic */ gd() {
        super("\u0417\u0442\u0440\u0435\u0430\u043c\u0411\u0439\u043f\u0430\u0437\u0437", fV.f);
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"X", "\u0443", "\u0434"});
        dw2.setDescriptionParts(new String[]{"\u041f", "\u0440", "\u044f", "\u0442", "a", "\u0442", "\u044c", " ", "\u043d", "a", "\u0448", "\u0438", " ", "x", "\u0443", "\u0434", "-", "\u044d", "\u043b", "e", "\u043c", "\u0435", "\u043d", "\u0442", "\u044b"});
        this.o = dw2;
        dw dw3 = new dw("", "", true);
        dw3.setNameParts(new String[]{"\u0413", "y", "\u0438"});
        dw3.setDescriptionParts(new String[]{"\u041f", "\u0440", "\u044f", "\u0442", "a", "\u0442", "\u044c", " ", "\u043c", "e", "\u043d", "\u044e", " ", "\u043a", "\u043b", "\u0438", "e", "\u043d", "\u0442", "\u0430"});
        this.p = dw3;
        dw dw4 = new dw("", "", true);
        dw4.setNameParts(new String[]{"O", "\u0432", "\u0435", "\u0440", "\u043b", "\u0435", "\u0438"});
        dw4.setDescriptionParts(new String[]{"\u041f", "\u0440", "\u044f", "\u0442", "a", "\u0442", "\u044c", " ", "o", "\u0432", "\u0435", "\u0440", "\u043b", "\u0435", "\u0438", " ", "\u043c", "o", "\u0434", "\u0443", "\u043b", "\u0435", "\u0439"});
        this.q = dw4;
        dw dw5 = new dw("", "", true);
        dw5.setNameParts(new String[]{"\u041f", "\u043b", "a", "\u0448", "\u043a", "\u0438", " ", "\u0432", " ", "\u043c", "\u0438", "\u0440", "e"});
        dw5.setDescriptionParts(new String[]{"\u041f", "\u0440", "\u044f", "\u0442", "a", "\u0442", "\u044c", " ", "\u043d", "e", "\u0439", "\u043c", "\u0435", "\u0442", "\u0435", "\u0433", "\u0438", ",", " ", "I", "t", "e", "m", "E", "S", "P", " ", "\u0438", " ", "\u043f", "\u0440", "o", "\u0447", "\u0438", "\u0435", " ", "\u043f", "\u043b", "a", "\u0448", "\u043a", "\u0438", " ", "\u0432", " ", "\u043c", "\u0438", "\u0440", "e"});
        this.r = dw5;
        this.a(this.o, this.p, this.q, this.r);
    }

    static {
        a = new hW(gd.class);
        b = new hW(cC.class);
        c = new hW(db.class);
        d = new hW(ll.class);
        e = new hW(is.class);
        f = new hW(lg.class);
        g = new hW(dc.class);
        h = new hW(hv.class);
        i = new class_4587();
        j = new H();
    }

    public static /* bridge */ /* synthetic */ boolean i() {
        return gd.a((T gd2) -> gd2.p.a());
    }

    public static /* bridge */ /* synthetic */ void b() {
        gd gd2 = gd.a();
        if (gd2 == null) {
            return;
        }
        class_9779 class_97792 = aa.a();
        if (class_97792 == null) {
            class_97792 = class_9779.field_51956;
        }
        if (n == null) {
            n = new class_332(aM, aM.method_22940().method_23000());
        }
        k = true;
        try {
            gd2.a(n, class_97792);
        }
        catch (Throwable throwable) {
        }
        finally {
            k = false;
            try {
                n.method_51452();
            }
            catch (Throwable throwable) {}
        }
    }

    public static /* bridge */ /* synthetic */ boolean b() {
        return k;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static /* bridge */ /* synthetic */ void c() {
        gd gd2 = gd.a();
        if (gd2 == null || !gd2.r.a()) {
            return;
        }
        if (gd.aM.field_1687 == null || gd.aM.field_1724 == null) {
            return;
        }
        class_9779 class_97792 = aa.a();
        if (class_97792 == null) {
            return;
        }
        i.method_34426();
        H h2 = j.a(i, gd.aM.field_1773.method_19418(), class_97792, gd.aM.field_1687);
        k = true;
        try {
            gd.a(h2);
        }
        catch (Throwable throwable) {
        }
        finally {
            k = false;
        }
    }

    public static /* bridge */ /* synthetic */ boolean c() {
        return l;
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        k = false;
        Boot.sbSetActive(false);
    }

    public static /* bridge */ /* synthetic */ boolean h() {
        return gd.a((T gd2) -> gd2.o.a());
    }

    public static /* bridge */ /* synthetic */ void d() {
        k = false;
        Boot.sbDestroy();
        ad.e();
        n = null;
        m = false;
    }

    private /* bridge */ /* synthetic */ void a(class_9779 class_97792, class_332 class_3322) {
        if (this.q.a()) {
            cC cC2;
            aW aW2 = hW.a();
            if (aW2 != null) {
                aW2.a(class_3322, class_97792);
            }
            if ((cC2 = (cC)b.a()) != null) {
                cC2.a(class_3322);
            }
        }
        if (this.o.a()) {
            fk.a().a(class_3322, 1.0f);
        }
    }

    public static /* bridge */ /* synthetic */ boolean a() {
        return m && !k && a.a() != null;
    }

    public static /* bridge */ /* synthetic */ gd a() {
        return m ? (gd)a.a() : null;
    }

    private static /* bridge */ /* synthetic */ boolean a(Predicate predicate) {
        if (k) {
            return false;
        }
        gd gd2 = gd.a();
        return gd2 != null && predicate.test(gd2);
    }

    private /* bridge */ /* synthetic */ void a(class_332 class_3322, class_9779 class_97792) {
        boolean bl2;
        boolean bl3 = bl2 = this.a() != null && this.b() != null && (this.a() == null || !this.a().field_1842);
        if (bl2 && (this.o.a() || this.q.a())) {
            class_9779 class_97793 = class_97792;
            class_332 class_3323 = class_3322;
            this.a(class_97793, class_3323);
            l = true;
        }
        if (this.a() == null) {
            return;
        }
        double d2 = this.a().method_22683().method_4495();
        int n2 = (int)(this.a().field_1729.method_1603() / d2);
        int n3 = (int)(this.a().field_1729.method_1604() / d2);
        float f2 = class_97792.method_60637(false);
        class_437 class_4372 = this.a();
        if (class_4372 instanceof jX) {
            jX jX2 = (jX)class_4372;
            if (this.p.a()) {
                jX2.method_25394(class_3322, n2, n3, f2);
                l = true;
            }
            return;
        }
        if (this.a() instanceof class_408) {
            return;
        }
        if (l) {
            ad.a(this.a(), class_3322, n2, n3, f2);
        }
    }

    public static /* bridge */ /* synthetic */ void a() {
        l = false;
    }

    private static /* bridge */ /* synthetic */ void a(H h2) {
        ll ll2 = (ll)d.a();
        is is2 = (is)e.a();
        lg lg2 = (lg)f.a();
        dc dc2 = (dc)g.a();
        hv hv2 = (hv)h.a();
        db db2 = (db)c.a();
        if (ll2 == null && is2 == null && lg2 == null && dc2 == null && hv2 == null && db2 == null) {
            return;
        }
        l = true;
        if (ll2 != null) {
            ll2.f(h2);
        }
        if (is2 != null) {
            is2.f(h2);
        }
        if (lg2 != null) {
            lg2.f(h2);
        }
        if (dc2 != null) {
            dc2.f(h2);
        }
        if (hv2 != null) {
            hv2.f(h2);
        }
        if (db2 != null) {
            db2.g(h2);
        }
    }

    public static /* bridge */ /* synthetic */ boolean k() {
        return gd.a((T gd2) -> gd2.r.a());
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        m = Boot.sbLoad();
        if (!m) {
            String string = "- \u041d\u0430\u0442\u0438\u0432\u043d\u0430\u044f \u0447\u0430\u0441\u0442\u044c \u043d\u0435\u0434\u043e\u0441\u0442\u0443\u043f\u043d\u0430";
            String string2 = an.a(this.b());
            ct ct2 = ct.of(kD.INFO);
            ek.a().a(string2, ct2, string);
            this.f();
            return;
        }
        Boot.sbSetActive(true);
    }

    public static /* bridge */ /* synthetic */ boolean j() {
        return gd.a((T gd2) -> gd2.q.a());
    }
}

