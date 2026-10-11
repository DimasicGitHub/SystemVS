/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import net.minecraft.class_2561;
import net.minecraft.class_266;
import net.minecraft.class_269;
import net.minecraft.class_337;
import net.minecraft.class_345;
import net.minecraft.class_433;
import net.minecraft.class_7439;
import net.minecraft.class_7472;
import net.minecraft.class_8646;
import net.minecraft.class_9011;

public class fj
extends aT {
    private static volatile /* synthetic */ boolean a;
    private static volatile /* synthetic */ boolean b;
    private static final /* synthetic */ String[] c;
    private static final /* synthetic */ Set<String> d;
    private static final /* synthetic */ Pattern e;
    private final /* synthetic */ gz f;
    private /* synthetic */ long g;
    private /* synthetic */ String h;
    private /* synthetic */ long i;
    private /* synthetic */ cc<Map<UUID, class_345>> j;

    public /* synthetic */ fj() {
        super("\u0417\u0430\u0444\u0435\u041b\u0435\u0430\u0432\u0435", fV.c);
        gz gz2 = new gz("", "", 10.0, 1.0, 60.0, 1.0, ec.join(new String[]{" ", "c", "\u0435", "\u043a"}), 0);
        gz2.setNameParts(new String[]{"T", "\u0430", "\u0439", "\u043c", "\u0430", "\u0443", "\u0442", " ", "\u0447", "a", "\u0442", "\u0430"});
        gz2.setDescriptionParts(new String[]{"C", "\u043a", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u0434", "e", "\u0440", "\u0436", "\u0430", "\u0442", "\u044c", " ", "c", "\u0442", "\u0430", "\u0442", "\u0443", "\u0441", " ", "\u043f", "o", "\u0441", "\u043b", "\u0435", " ", "c", "\u043e", "\u043e", "\u0431", "\u0449", "\u0435", "\u043d", "\u0438", "\u044f", " ", "\u0432", " ", "\u0447", "a", "\u0442", "\u0435"});
        this.f = gz2;
        this.g = 0L;
        this.h = null;
        this.i = 0L;
        this.a(new fa[]{this.f});
    }

    static {
        a = false;
        b = false;
        c = new String[]{"pvp", "\u0431\u043e\u0439", "combat", "\u0430\u0440\u0435\u043d\u0430", "arena", "\u0434\u0443\u044d\u043b\u044c", "duel"};
        d = Set.of("hub", "an", "lobby", "leave", "spawn", "quit");
        e = Pattern.compile("\\d+$");
    }

    @Override
    public /* bridge */ /* synthetic */ void i() {
        boolean bl2;
        if (this.z()) {
            return;
        }
        boolean bl3 = this.b();
        boolean bl4 = this.a();
        long l2 = System.currentTimeMillis() - this.g;
        boolean bl5 = this.g > 0L && l2 < (long)(this.f.d() * 1000.0);
        boolean bl6 = dg.a() > 0L;
        boolean bl7 = a;
        boolean bl8 = a = bl3 || bl4 || bl5 || bl6;
        if (bl7 && !a) {
            b = false;
            this.h = null;
        }
        if (!(bl2 = this.a() instanceof class_433)) {
            b = false;
        }
    }

    private /* bridge */ /* synthetic */ boolean b() {
        if (this.z()) {
            return false;
        }
        class_269 class_2692 = this.a().method_8428();
        if (class_2692 == null) {
            return false;
        }
        class_266 class_2662 = class_2692.method_1189(class_8646.field_45157);
        if (class_2662 == null) {
            return false;
        }
        if (this.a(class_2662.method_1114().getString())) {
            return true;
        }
        Collection collection = class_2692.method_1184(class_2662);
        for (class_9011 class_90112 : collection) {
            if (class_90112.method_55385()) continue;
            class_2561 class_25612 = class_90112.comp_2129();
            if (class_25612 != null && this.a(class_25612.getString())) {
                return true;
            }
            class_2561 class_25613 = class_90112.method_55387();
            if (class_25613 != null && this.a(class_25613.getString())) {
                return true;
            }
            String string = class_90112.comp_2127();
            if (!this.a(string)) continue;
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean c() {
        return a;
    }

    private static /* bridge */ /* synthetic */ String c() {
        long l2 = dg.a();
        if (l2 <= 0L) {
            return "";
        }
        return " (\u043e\u0441\u0442\u0430\u043b\u043e\u0441\u044c " + Math.max(1L, (l2 + 999L) / 1000L) + "\u0441)";
    }

    public static /* bridge */ /* synthetic */ void c(boolean bl2) {
        b = bl2;
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        a = false;
        b = false;
        this.g = 0L;
        this.h = null;
        this.i = 0L;
    }

    public static /* bridge */ /* synthetic */ boolean h() {
        return b;
    }

    @Override
    public /* bridge */ /* synthetic */ void l() {
        dg.a();
        a = false;
        b = false;
        this.g = 0L;
        this.h = null;
    }

    private /* bridge */ /* synthetic */ boolean a(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        String string2 = string.toLowerCase();
        for (String string3 : c) {
            if (!string2.contains(string3)) continue;
            return true;
        }
        return false;
    }

    private /* bridge */ /* synthetic */ void a(String string) {
        if (this.b() != null) {
            hB.a();
            this.b().method_7353((class_2561)class_2561.method_43470((String)string), false);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public /* bridge */ /* synthetic */ void a(lx lx2) {
        String string2;
        String string;
        class_7439 class_74392;
        if (lx2.a() == iG.b) {
            boolean bl2;
            class_2561 class_25612;
            Object object = lx2.a();
            if (!(object instanceof class_7439)) return;
            class_74392 = (class_7439)object;
            class_2561 class_25613 = class_25612 = class_74392.comp_763();
            boolean bl3 = bl2 = class_74392.comp_906();
            if (!true) return;
            boolean bl4 = bl2;
            object = class_25613.getString();
            if (!this.a((String)object)) return;
            this.g = System.currentTimeMillis();
            return;
        }
        if (!a) {
            return;
        }
        if (lx2.a() != iG.a) {
            return;
        }
        Object object = lx2.a();
        if (!(object instanceof class_7472)) return;
        class_74392 = (class_7472)object;
        try {
            string2 = string = class_74392.comp_808();
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
        object = string2.toLowerCase().split(" ", 2)[0];
        string = e.matcher((CharSequence)object).replaceAll("");
        if (!d.contains(object) && !d.contains(string)) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (((String)object).equals(this.h) && l2 - this.i < 5000L) {
            this.h = null;
            return;
        }
        lx2.a(true);
        this.h = object;
        this.i = l2;
        this.a("\u00a7c[SafeLeave] \u00a7f\u0412\u044b \u0432 PvP" + fj.c() + "! \u0412\u0432\u0435\u0434\u0438\u0442\u0435 /" + (String)object + " \u0435\u0449\u0451 \u0440\u0430\u0437 \u0434\u043b\u044f \u043f\u043e\u0434\u0442\u0432\u0435\u0440\u0436\u0434\u0435\u043d\u0438\u044f.");
    }

    private /* bridge */ /* synthetic */ boolean a() {
        Map map;
        if (this.a() == null || this.a().field_1705 == null) {
            return false;
        }
        class_337 class_3372 = this.a().field_1705.method_1740();
        if (class_3372 == null) {
            return false;
        }
        if (this.j == null) {
            this.j = new cc((Object)class_3372, class_337.class, Map.class);
        }
        if ((map = (Map)this.j.b(class_3372)) == null || map.isEmpty()) {
            return false;
        }
        for (class_345 class_3452 : map.values()) {
            class_2561 class_25612 = class_3452.method_5414();
            if (class_25612 == null || !this.a(class_25612.getString())) continue;
            return true;
        }
        return false;
    }

    @Override
    public /* bridge */ /* synthetic */ void m() {
        dg.a();
        a = false;
        b = false;
        this.g = 0L;
        this.h = null;
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        a = false;
        b = false;
        this.g = 0L;
        this.h = null;
        this.i = 0L;
    }
}

