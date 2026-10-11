/*
 * Decompiled with CFR 0.152.
 */
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.class_2338;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_638;
import net.minecraft.class_7439;
import net.minecraft.class_7472;

public class hv
extends aT {
    private static final /* synthetic */ String[] a;
    private /* synthetic */ dw b;
    private /* synthetic */ dw c;
    private /* synthetic */ gz d;
    private /* synthetic */ gz e;
    private /* synthetic */ dw f;
    private /* synthetic */ dw g;
    private /* synthetic */ dw h;
    private final /* synthetic */ hp i;
    private final /* synthetic */ List<String> j;
    private volatile /* synthetic */ long k;
    private volatile /* synthetic */ long l;
    private volatile /* synthetic */ boolean m;
    private volatile /* synthetic */ boolean n;
    private volatile /* synthetic */ boolean o;
    private /* synthetic */ WeakReference<class_638> p;

    public /* synthetic */ hv() {
        super("\u0428\u0430\u0439\u043f\u043e\u0438\u043d\u0442\u0437", fV.f);
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"\u0420", "e", "\u043d", "\u0434", "\u0435", "\u0440", " ", "\u0432", " ", "\u043c", "\u0438", "\u0440", "e"});
        dw2.setDescriptionParts(new String[]{"O", "\u0442", "\u043e", "\u0431", "\u0440", "\u0430", "\u0436", "\u0430", "\u0442", "\u044c", " ", "\u043f", "\u043b", "a", "\u0448", "\u043a", "\u0443", " ", "\u0432", "e", "\u0439", "\u043f", "\u043e", "\u0438", "\u043d", "\u0442", "\u0430", " ", "\u0432", " ", "\u043c", "\u0438", "\u0440", "e"});
        this.b = dw2;
        dw dw3 = new dw("", "", true);
        dw3.setNameParts(new String[]{"\u0420", "e", "\u043d", "\u0434", "\u0435", "\u0440", " ", "\u0432", " ", "\u0445", "\u0443", "\u0434", "e"});
        dw3.setDescriptionParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0432", "e", "\u0439", "\u043f", "\u043e", "\u0438", "\u043d", "\u0442", "\u044b", " ", "\u0432", " ", "H", "U", "D", "-", "c", "\u043f", "\u0438", "\u0441", "\u043a", "\u0435"});
        this.c = dw3;
        gz gz2 = new gz("", "", 1000.0, 16.0, 50000.0, 1.0, ec.join(new String[]{"\u043c"}), 0);
        gz2.setNameParts(new String[]{"M", "\u0430", "\u043a", "\u0441", ".", " ", "\u0434", "\u0438", "c", "\u0442", "\u0430", "\u043d", "\u0446", "\u0438", "\u044f"});
        gz2.setDescriptionParts(new String[]{"M", "\u0430", "\u043a", "\u0441", "\u0438", "\u043c", "\u0430", "\u043b", "\u044c", "\u043d", "\u0430", "\u044f", " ", "\u0434", "\u0438", "c", "\u0442", "\u0430", "\u043d", "\u0446", "\u0438", "\u044f", " ", "o", "\u0442", "\u043e", "\u0431", "\u0440", "\u0430", "\u0436", "\u0435", "\u043d", "\u0438", "\u044f"});
        this.d = gz2;
        gz gz3 = new gz("", "", 50.0, 10.0, 200.0, 5.0, "%", 0);
        gz3.setNameParts(new String[]{"\u0420", "a", "\u0437", "\u043c", "\u0435", "\u0440", " ", "\u043f", "\u043b", "a", "\u0448", "\u043a", "\u0438"});
        gz3.setDescriptionParts(new String[]{"\u0420", "a", "\u0437", "\u043c", "\u0435", "\u0440", " ", "\u043f", "\u043b", "a", "\u0448", "\u043a", "\u0438", " ", "\u0432", "e", "\u0439", "\u043f", "\u043e", "\u0438", "\u043d", "\u0442", "\u0430", " ", "\u0432", " ", "\u043c", "\u0438", "\u0440", "e"});
        this.e = gz3;
        dw dw4 = new dw("", "", true);
        dw4.setNameParts(new String[]{"T", "\u043e", "\u0433", "\u0433", "\u043b", " ", "c", "\u043a", "\u0440", "\u044b", "\u0432", "\u0430", "\u0435", "\u0442", " ", "\u0432", " ", "\u043c", "\u0438", "\u0440", "e"});
        dw4.setDescriptionParts(new String[]{"\u0427", "e", "\u043a", "\u0431", "\u043e", "\u043a", "\u0441", " ", "\u043d", "a", " ", "\u043a", "a", "\u0440", "\u0442", "\u043e", "\u0447", "\u043a", "\u0435", " ", "\u043f", "\u0440", "\u044f", "\u0447", "e", "\u0442", " ", "\u043f", "\u043b", "a", "\u0448", "\u043a", "\u0443", " ", "\u0432", " ", "\u043c", "\u0438", "\u0440", "e"});
        this.f = dw4;
        dw dw5 = new dw("", "", true);
        dw5.setNameParts(new String[]{"T", "\u043e", "\u0433", "\u0433", "\u043b", " ", "c", "\u043a", "\u0440", "\u044b", "\u0432", "\u0430", "\u0435", "\u0442", " ", "\u0432", " ", "\u0445", "\u0443", "\u0434", "e"});
        dw5.setDescriptionParts(new String[]{"\u0427", "e", "\u043a", "\u0431", "\u043e", "\u043a", "\u0441", " ", "\u043d", "a", " ", "\u043a", "a", "\u0440", "\u0442", "\u043e", "\u0447", "\u043a", "\u0435", " ", "\u043f", "\u0440", "\u044f", "\u0447", "e", "\u0442", " ", "\u0432", "e", "\u0439", "\u043f", "\u043e", "\u0438", "\u043d", "\u0442", " ", "\u0432", " ", "H", "U", "D"});
        this.g = dw5;
        dw dw6 = new dw("", "", false);
        dw6.setNameParts(new String[]{"\u041c", "e", "\u0442", "\u043a", "\u0438", " ", "\u044d", "\u0432", "e", "\u043d", "\u0442", "\u043e", "\u0432"});
        dw6.setDescriptionParts(new String[]{"\u041f", "o", "\u0441", "\u043b", "\u0435", " ", "\u0437", "a", "\u0445", "\u043e", "\u0434", "\u0430", " ", "\u043d", "a", " ", "a", "\u043d", "\u043a", "\u0443", " ", "\u0437", "a", "\u043f", "\u0440", "\u043e", "\u0441", "\u0438", "\u0442", "\u044c", " ", "/", "e", "v", "e", "n", "t", "s", " ", "d", "e", "l", "a", "y", " ", "\u0438", " ", "o", "\u0442", "\u043c", "\u0435", "\u0442", "\u0438", "\u0442", "\u044c", " ", "a", "\u043a", "\u0442", "\u0438", "\u0432", "\u043d", "\u044b", "\u0435", " ", "\u044d", "\u0432", "e", "\u043d", "\u0442", "\u044b"});
        this.h = dw6;
        this.i = new hp();
        this.j = new CopyOnWriteArrayList<String>();
        this.k = 0L;
        this.l = 0L;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = new WeakReference<Object>(null);
        this.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        this.b(true);
    }

    static {
        a = new String[]{"\u0430\u0438\u0440-\u0434\u0440\u043e\u043f", "\u0430\u0438\u0440\u0434\u0440\u043e\u043f", "air drop", "airdrop", "\u0430\u043b\u0442\u0430\u0440\u044c \u043d\u0435\u0436\u0438\u0442\u0438"};
    }

    @Override
    public /* bridge */ /* synthetic */ void i() {
        if (!this.h.a()) {
            if (this.l != 0L || this.k != 0L) {
                this.a();
            }
            return;
        }
        long l2 = System.currentTimeMillis();
        this.a(l2);
        if (this.k != 0L && l2 >= this.k) {
            if (this.z() || this.a() == null) {
                return;
            }
            if (dg.a() || fj.c()) {
                this.k = l2 + 5000L;
                return;
            }
            this.k = 0L;
            this.o = true;
            try {
                this.a().method_45730("events delay");
            }
            finally {
                this.o = false;
            }
            this.c(true);
            return;
        }
        if (this.l != 0L && l2 >= this.l) {
            this.l = 0L;
            this.a(eD.a(this.j));
            this.j.clear();
        }
    }

    public /* bridge */ /* synthetic */ boolean b() {
        return this.g.a();
    }

    public /* bridge */ /* synthetic */ dw b() {
        return this.c;
    }

    public /* bridge */ /* synthetic */ gz b() {
        return this.e;
    }

    public /* bridge */ /* synthetic */ dw c() {
        return this.f;
    }

    private /* bridge */ /* synthetic */ void c(boolean bl2) {
        this.j.clear();
        this.m = false;
        this.n = bl2;
        this.l = System.currentTimeMillis() + 6000L;
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.a();
    }

    @Override
    public /* bridge */ /* synthetic */ void f(H h2) {
        if (gd.k()) {
            return;
        }
        if (this.z()) {
            return;
        }
        if (!this.b.a()) {
            return;
        }
        if (!fA.a()) {
            return;
        }
        String string = fA.a();
        if (string == null) {
            return;
        }
        ArrayList<fM> arrayList = new ArrayList<fM>();
        double d2 = this.d.d();
        boolean bl2 = this.f.a();
        for (fM fM2 : fA.a().a(string)) {
            double d3;
            double d4;
            double d5;
            double d6;
            if (fM2.c() || bl2 && !fM2.a() || (d6 = Math.sqrt((d5 = this.b().method_23317() - (double)fM2.a()) * d5 + (d4 = this.b().method_23318() - (double)fM2.b()) * d4 + (d3 = this.b().method_23321() - (double)fM2.c()) * d3)) > d2) continue;
            arrayList.add(fM2);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            float f2 = this.a();
            ArrayList<fM> arrayList2 = arrayList;
            H h3 = h2;
            this.i.a(h3, f2, arrayList2);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public /* bridge */ /* synthetic */ dw d() {
        return this.g;
    }

    public /* bridge */ /* synthetic */ gz a() {
        return this.d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public /* bridge */ /* synthetic */ void a(lx lx2) {
        boolean bl3;
        class_2561 class_25612;
        if (!this.h.a()) {
            return;
        }
        if (lx2.a() == iG.a) {
            String string;
            class_2596 class_25962;
            if (this.o || !((class_25962 = lx2.a()) instanceof class_7472)) return;
            class_7472 class_74722 = (class_7472)class_25962;
            String string2 = string = class_74722.comp_808();
            if (!string2.trim().toLowerCase().startsWith("events")) return;
            this.c(false);
            return;
        }
        if (this.l == 0L) {
            return;
        }
        class_2596 class_25963 = lx2.a();
        if (!(class_25963 instanceof class_7439)) return;
        Object object = (class_7439)class_25963;
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
        object = class_25612.getString();
        this.j.add((String)object);
        if (!this.m && eD.a((String)object)) {
            this.m = true;
            this.l = System.currentTimeMillis() + 1200L;
        }
        if (!this.n || !eD.b((String)object)) return;
        lx2.a(true);
    }

    public /* bridge */ /* synthetic */ dw a() {
        return this.b;
    }

    private /* bridge */ /* synthetic */ void a() {
        this.j.clear();
        this.k = 0L;
        this.l = 0L;
        this.m = false;
        this.n = false;
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return this.f() && this.c.a();
    }

    private static /* bridge */ /* synthetic */ boolean a(String string) {
        if (string == null) {
            return true;
        }
        String string2 = string.toLowerCase();
        for (String string3 : a) {
            if (!string2.contains(string3)) continue;
            return true;
        }
        return false;
    }

    private /* bridge */ /* synthetic */ void a(kS kS2) {
        Object object;
        fA fA2 = fA.a();
        fA2.a();
        String string = fA.a();
        if (string == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(kS2.a());
        arrayList.addAll(kS2.b());
        long l2 = System.currentTimeMillis();
        long l3 = Long.MAX_VALUE;
        for (jF jF2 : arrayList) {
            boolean bl2;
            if (hv.a(jF2.a())) continue;
            object = jF2.a();
            Integer n2 = object == null ? null : object.a();
            boolean bl3 = object != null && object.a() == fw.b;
            class_2338 class_23382 = jF2.a();
            boolean bl4 = bl2 = class_23382 == null;
            if (bl2 && (!bl3 || n2 == null)) continue;
            fM fM2 = fA2.b(jF2.a(), bl2 ? 0 : class_23382.method_10263(), bl2 ? 0 : class_23382.method_10264(), bl2 ? 0 : class_23382.method_10260(), string);
            if (fM2 == null) continue;
            fM2.b(bl2);
            if (!bl3 || n2 == null) continue;
            long l4 = l2 + (long)n2.intValue() * 1000L;
            fM2.a(l4);
            l3 = Math.min(l3, l4);
        }
        if (kS2.a() != null) {
            long l5 = l2 + (long)kS2.a().intValue() * 1000L;
            object = fA2.b("\u0421\u043b\u0435\u0434\u0443\u044e\u0449\u0438\u0439 \u0438\u0432\u0435\u043d\u0442", 0, 0, 0, string);
            if (object != null) {
                ((fM)object).b(true);
                ((fM)object).a(l5);
            }
            l3 = Math.min(l3, l5);
        }
        if (!this.m) {
            return;
        }
        long l6 = l2 + 300000L;
        if (l3 != Long.MAX_VALUE) {
            l6 = Math.min(l6, l3 + 3000L);
        }
        this.k = Math.max(l6, l2 + 30000L);
    }

    private /* bridge */ /* synthetic */ void a(long l2) {
        class_638 class_6382 = this.a();
        if (class_6382 == null || class_6382 == this.p.get()) {
            return;
        }
        this.p = new WeakReference<class_638>(class_6382);
        fA.a().a();
        this.k = l2 + 2000L;
    }

    public /* bridge */ /* synthetic */ float a() {
        return this.e.a() / 100.0f;
    }

    public /* bridge */ /* synthetic */ double a() {
        return this.d.d();
    }

    @Override
    public /* bridge */ /* synthetic */ void m() {
        this.a();
        fA.a().a();
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
    }
}

