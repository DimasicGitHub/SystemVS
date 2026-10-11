/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1657;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class dx {
    private static final long a = 1000L;
    private static final ix[] b = ix.values();
    private static final Map<UUID, Map<ix, Long>> c = new ConcurrentHashMap<UUID, Map<ix, Long>>();
    private static final Map<ix, Long> d = new ConcurrentHashMap<ix, Long>();
    private static volatile UUID e;
    private static volatile String f;

    private dx() {
    }

    public static String a() {
        return f;
    }

    public static void a() {
        d.clear();
        c.clear();
        e = null;
        f = null;
    }

    private static void a(Map map) {
        long l2 = System.currentTimeMillis();
        map.entrySet().removeIf(entry -> (Long)entry.getValue() <= l2);
    }

    public static UUID a() {
        return e;
    }

    public static void a(class_1657 class_16572) {
        Map<ix, Long> map;
        if (class_16572 == null) {
            return;
        }
        UUID uUID = class_16572.method_5667();
        if (uUID.equals(e)) {
            return;
        }
        UUID uUID2 = e;
        if (uUID2 != null) {
            map = new ConcurrentHashMap<ix, Long>(d);
            dx.a(map);
            if (map.isEmpty()) {
                c.remove(uUID2);
            } else {
                c.put(uUID2, map);
            }
        }
        e = uUID;
        f = class_16572.method_7334().getName();
        d.clear();
        map = c.remove(uUID);
        if (map != null) {
            dx.a(map);
            d.putAll(map);
        }
    }

    public static void a(ix ix2) {
        if (e == null) {
            return;
        }
        long l2 = System.currentTimeMillis() + ix2.j;
        Long l3 = d.get((Object)ix2);
        if (l3 != null && Math.abs(l3 - l2) < 1000L) {
            return;
        }
        d.put(ix2, l2);
    }

    public static long a(ix ix2) {
        Long l2 = d.get((Object)ix2);
        if (l2 == null) {
            return 0L;
        }
        long l3 = l2 - System.currentTimeMillis();
        if (l3 > 0L) {
            return l3;
        }
        d.remove((Object)ix2);
        return 0L;
    }

    public static ix[] a() {
        return b;
    }
}

