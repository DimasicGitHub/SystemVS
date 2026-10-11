/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public final class kv {
    private kv() {
    }

    public static void b(lr lr2) {
        jE jE2 = hJ.a();
        if (jE2 == null || lr2 == null) {
            return;
        }
        List list = jE2.c();
        if (list == null) {
            return;
        }
        lr2.a().a(new HashSet(list));
    }

    public static kR a() {
        jE jE2 = hJ.a();
        return jE2 != null ? jE2.a() : null;
    }

    public static void a(kR kR2) {
        if (kR2.b() != null) {
            hS.a(kR2.b());
        }
    }

    public static void a(av av2, kR kR2) {
        if (av2 != null && kR2.a() != null) {
            av2.a(kR2.a());
        }
    }

    public static void a(kR kR2, ak ak2, bo bo2) {
        boolean bl2 = kR2.a();
        bo2.b(bl2 ? 1.0f : 0.0f);
        ak2.b(bl2 ? 1.0f : 0.0f);
    }

    public static void a(Map map, kR kR2) {
        map.clear();
        if (kR2.b() != null) {
            map.putAll(kR2.b());
        }
    }

    public static kR a(float f2, lr lr2, Map map, av av2, float f3, boolean bl2) {
        Object object;
        kR kR2 = new kR();
        if (lr2 != null) {
            object = lr2.a();
            kR2.a(object != null ? object.name() : null);
            kR2.c(lr2.a() != null ? lr2.a().name() : cG.a.name());
        }
        kR2.a(f2);
        kR2.b(f3);
        kR2.a(bl2);
        kR2.b(hS.a() != null ? hS.a().name() : null);
        object = new HashMap(map);
        if (lr2 != null && lr2.a() == cG.a) {
            object.put(kv.a(lr2.a()), Float.valueOf(lr2.a().a()));
        }
        kR2.b((Map)object);
        if (av2 != null) {
            kR2.a(av2.a());
        }
        kv.a(lr2);
        return kR2;
    }

    public static void a(lr lr2) {
        jE jE2 = hJ.a();
        if (jE2 == null || lr2 == null) {
            return;
        }
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>(jE2.c());
        for (bq bq2 : lr2.a().a()) {
            String string = bq2.a().b();
            if (bq2.a()) {
                linkedHashSet.add(string);
                continue;
            }
            linkedHashSet.remove(string);
        }
        jE2.b(new ArrayList(linkedHashSet));
    }

    public static String a(fV fV2) {
        return fV2 != null ? fV2.name() : "_ALL_";
    }

    public static fV a(String string) {
        if (string == null) {
            return null;
        }
        try {
            return fV.a(string);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }
}

