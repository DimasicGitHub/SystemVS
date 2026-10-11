/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import net.minecraft.class_3883;
import net.minecraft.class_4506;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_5250;
import net.minecraft.class_5602;
import net.minecraft.class_5617;
import net.minecraft.class_5697;
import net.minecraft.class_572;
import net.minecraft.class_8136;
import net.minecraft.class_922;
import net.minecraft.class_970;
import net.minecraft.class_973;
import net.minecraft.class_976;
import net.minecraft.class_979;
import net.minecraft.class_998;

@jB(value=class_1007.class)
public class eq {
    private static final hW<fG> a = new hW(fG.class);
    private static final hW<db> b = new hW(db.class);
    private static final hW<iz> c = new hW(iz.class);
    private static String d;
    private static Set<String> e;
    private static final Map<String, Pattern> f;
    private static long g;
    private static final long h;

    static {
        f = new ConcurrentHashMap<String, Pattern>();
        h = gy.a(class_922.class, List.class);
    }

    @hz(method="method_4217", desc="(Lnet/minecraft/class_10055;Lnet/minecraft/class_4587;)V", at=iD.REPLACE)
    public static void a(class_1007 class_10072, class_10055 class_100552, class_4587 class_45872) {
        boolean bl2;
        iz iz2 = (iz)c.a();
        boolean bl3 = bl2 = lo.aM.field_1724 != null && lo.aM.field_1724.method_5628() == class_100552.field_53528;
        if (iz2 != null && !bl2) {
            if (iz2.a().a()) {
                float f2 = iz2.a().a();
                class_45872.method_22905(f2, f2, f2);
            } else {
                float f3 = iz2.b().a();
                float f4 = iz2.c().a();
                float f5 = iz2.d().a();
                class_45872.method_22905(f3, f4, f5);
            }
        } else {
            class_45872.method_22905(0.9375f, 0.9375f, 0.9375f);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static class_2561 a(class_2561 class_25612, fG fG2) {
        void var6_11;
        class_5250 class_52502;
        Object object2;
        String string = class_25612.method_54160();
        boolean bl2 = false;
        String string2 = string;
        if (string != null && !string.isEmpty()) {
            if (fG2.a().a() && d != null && string2.contains(d)) {
                object2 = fG2.a().b();
                String object3 = object2 != null && !((String)object2).isEmpty() ? object2 : "S\u0443stemPlayer";
                string2 = string2.replace(d, object3);
                bl2 = true;
            }
            if (fG2.b().a() && e != null) {
                for (Map.Entry<String, Pattern> entry : f.entrySet()) {
                    if (!entry.getValue().matcher(string2).find()) continue;
                    String string3 = eV.a().b(entry.getKey());
                    String string4 = string3 != null && !string3.isEmpty() ? string3 : "SystemFriend";
                    string2 = entry.getValue().matcher(string2).replaceAll(Matcher.quoteReplacement(string4));
                    bl2 = true;
                }
            }
        }
        object2 = class_25612.method_10855();
        if (!bl2 && object2.isEmpty()) {
            return class_25612;
        }
        Object var6_9 = null;
        boolean bl3 = false;
        if (!object2.isEmpty()) {
            class_2561[] class_2561Array = new class_2561[object2.size()];
            for (int i2 = 0; i2 < object2.size(); ++i2) {
                class_2561 class_25613;
                class_2561 class_25614 = (class_2561)object2.get(i2);
                class_2561Array[i2] = class_25613 = eq.a(class_25614, fG2);
                if (class_25613 == class_25614) continue;
                bl3 = true;
            }
        }
        if (!bl2 && !bl3) {
            return class_25612;
        }
        class_5250 class_52503 = class_52502 = bl2 ? class_2561.method_43470((String)string2).method_10862(class_25612.method_10866()) : class_25612.method_27662().method_10862(class_25612.method_10866());
        if (var6_11 != null) {
            for (class_2561 class_25615 : var6_11) {
                class_52502.method_10852(class_25615);
            }
        }
        return class_52502;
    }

    @hz(method="method_4213", desc="(Lnet/minecraft/class_10055;Lnet/minecraft/class_2561;Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;I)V", at=iD.REPLACE)
    public static void a(class_1007 class_10072, class_10055 class_100552, class_2561 class_25612, class_4587 class_45872, class_4597 class_45972, int n2) {
        class_2561 class_25613;
        fG fG2;
        db db2 = (db)b.a();
        boolean bl2 = gd.k();
        if (db2 != null && !db2.a() && !bl2 && lo.aM.field_1687 != null && (fG2 = lo.aM.field_1687.method_8469(class_100552.field_53528)) instanceof class_1657 && db2.a((class_1657)(class_25613 = (class_1657)fG2))) {
            return;
        }
        fG fG3 = fG2 = lo.aM.field_1724 != null ? (fG)a.a() : null;
        if (fG2 == null) {
            bP.a(class_10072, class_100552, class_25612, class_45872, class_45972, n2);
            return;
        }
        eq.a();
        class_25613 = class_100552.field_53525;
        if (class_100552.field_53525 != null) {
            class_100552.field_53525 = eq.a(class_100552.field_53525, fG2);
        }
        class_25612 = eq.a(class_25612, fG2);
        bP.a(class_10072, class_100552, class_25612, class_45872, class_45972, n2);
        class_100552.field_53525 = class_25613;
    }

    public static void a(class_1007 class_10072, class_5617.class_5618 class_56182, boolean bl2) {
        List list = (List)gy.a(class_10072, h);
        list.clear();
        list.add(new class_970((class_3883)class_10072, (class_572)new class_8136(class_56182.method_32167(bl2 ? class_5602.field_27582 : class_5602.field_27579)), (class_572)new class_8136(class_56182.method_32167(bl2 ? class_5602.field_27583 : class_5602.field_27580)), class_56182.method_64072()));
        list.add(new class_5697((class_3883)class_10072));
        list.add(new class_973((class_922)class_10072, class_56182));
        list.add(new class_976((class_3883)class_10072, class_56182.method_32170()));
        list.add(new class_979((class_3883)class_10072, class_56182.method_32170(), class_56182.method_64072()));
        list.add(new class_998((class_3883)class_10072, class_56182.method_32170()));
        list.add(new class_4506((class_922)class_10072, class_56182));
    }

    private static void a() {
        long l2 = System.currentTimeMillis();
        if (l2 - g < 500L) {
            return;
        }
        g = l2;
        try {
            d = lo.aM.field_1724 != null ? lo.aM.field_1724.method_7334().getName() : null;
            Set set = eV.a().a();
            if (e == null || !e.equals(set)) {
                e = new HashSet<String>(set);
                f.clear();
                for (String string : e) {
                    f.put(string, Pattern.compile("(?i)" + Pattern.quote(string)));
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

