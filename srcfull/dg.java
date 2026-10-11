/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_337;
import net.minecraft.class_345;
import net.minecraft.class_7439;

public final class dg {
    private static final /* synthetic */ Pattern a;
    private static /* synthetic */ cc<Map<UUID, class_345>> b;
    private static volatile /* synthetic */ boolean c;
    private static /* synthetic */ long d;
    private static volatile /* synthetic */ long e;

    private /* synthetic */ dg() {
    }

    static {
        a = Pattern.compile("(\\d+)\\s*\u0441\u0435\u043a");
        c = false;
        d = 0L;
        e = 0L;
    }

    private static /* bridge */ /* synthetic */ boolean b() {
        Map map;
        if (lo.aM == null || lo.aM.field_1705 == null) {
            return false;
        }
        class_337 class_3372 = lo.aM.field_1705.method_1740();
        if (class_3372 == null) {
            return false;
        }
        if (b == null) {
            try {
                b = new cc((Object)class_3372, class_337.class, Map.class);
            }
            catch (Throwable throwable) {
                return false;
            }
        }
        if ((map = (Map)b.b(class_3372)) == null || map.isEmpty()) {
            return false;
        }
        for (class_345 class_3452 : map.values()) {
            class_2561 class_25612 = class_3452.method_5414();
            if (class_25612 == null || !class_25612.getString().toLowerCase().contains("pvp")) continue;
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ void a() {
        e = 0L;
        c = false;
        d = 0L;
    }

    public static /* bridge */ /* synthetic */ void a(String string) {
        if (string == null || string.isEmpty()) {
            return;
        }
        String string2 = string.toLowerCase();
        if (string2.contains("\u0432\u044b\u0448\u043b\u0438 \u0438\u0437 \u0440\u0435\u0436\u0438\u043c")) {
            e = 0L;
            return;
        }
        if (string2.contains("\u0432\u043e\u0448\u043b\u0438 \u0432 \u0440\u0435\u0436\u0438\u043c pvp")) {
            dg.e = System.currentTimeMillis() + 30000L;
            return;
        }
        if (!string2.contains("\u0440\u0435\u0436\u0438\u043c pvp") && !string2.contains("\u043d\u0435 \u0432\u044b\u0445\u043e\u0434\u0438\u0442\u0435 \u0438\u0437 \u0438\u0433\u0440\u044b")) {
            return;
        }
        Matcher matcher = a.matcher(string2);
        if (matcher.find()) {
            try {
                dg.e = System.currentTimeMillis() + Long.parseLong(matcher.group(1)) * 1000L;
                return;
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        if (dg.a() <= 0L) {
            dg.e = System.currentTimeMillis() + 30000L;
        }
    }

    public static /* bridge */ /* synthetic */ boolean a() {
        if (dg.a() > 0L) {
            return true;
        }
        long l2 = System.currentTimeMillis();
        if (l2 - d < 100L) {
            return c;
        }
        d = l2;
        c = dg.b();
        return c;
    }

    public static /* bridge */ /* synthetic */ void a(lx lx2) {
        block5: {
            if (lx2 == null || lx2.a() != iG.b) {
                return;
            }
            class_2596 class_25962 = lx2.a();
            if (class_25962 instanceof class_7439) {
                boolean bl2;
                class_2561 class_25612;
                class_7439 class_74392 = (class_7439)class_25962;
                try {
                    class_2561 class_25613;
                    class_25612 = class_25613 = class_74392.comp_763();
                }
                catch (Throwable throwable) {
                    throw new MatchException(throwable.toString(), throwable);
                }
                boolean bl3 = bl2 = class_74392.comp_906();
                if (!true) break block5;
                boolean bl4 = bl2;
                dg.a(class_25612.getString());
            }
        }
    }

    public static /* bridge */ /* synthetic */ long a() {
        long l2 = e;
        if (l2 == 0L) {
            return 0L;
        }
        if (lo.aM.field_1724 == null || lo.aM.field_1724.method_29504()) {
            e = 0L;
            return 0L;
        }
        long l3 = l2 - System.currentTimeMillis();
        if (l3 <= 0L) {
            e = 0L;
            return 0L;
        }
        return l3;
    }
}

