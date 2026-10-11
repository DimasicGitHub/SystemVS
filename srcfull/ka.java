/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ka {
    private static final Map<String, byte[]> a = new ConcurrentHashMap<String, byte[]>();
    private static final CompletableFuture<Void> b = new CompletableFuture();
    private static final String[] c = F.a("arrow", "arrow_3d");

    public ka() {
        new Thread(() -> {
            ka.a();
            b.complete(null);
            ch.a();
        }, "i-t").start();
    }

    public void b() {
        for (byte[] byArray : a.values()) {
            if (byArray == null) continue;
            Arrays.fill(byArray, (byte)0);
        }
        a.clear();
    }

    public static String[] a() {
        return (String[])c.clone();
    }

    public static void a() {
        try {
            Map map = cd.a();
            if (map == null) {
                map = do.a(c);
            }
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() == null || ((byte[])entry.getValue()).length <= 0) continue;
                a.put((String)entry.getKey(), (byte[])entry.getValue());
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static byte[] a(String string) {
        b.join();
        return a.get(string);
    }
}

