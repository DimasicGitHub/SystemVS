/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fc {
    private static final fc INSTANCE = new fc();
    private volatile hj a = hj.a;
    private final Map<String, String> b = new ConcurrentHashMap<String, String>();
    private final List<Runnable> c = new CopyOnWriteArrayList<Runnable>();
    private volatile boolean d = false;

    private fc() {
    }

    public String b(String string) {
        if (string == null || this.a == hj.a || !this.d) {
            return null;
        }
        return this.b.get(string);
    }

    public void b() {
        this.a = this.a.a();
        if (this.a == hj.a) {
            this.b.clear();
            this.d = false;
        }
        this.c();
    }

    private void c() {
        for (Runnable runnable : this.c) {
            try {
                runnable.run();
            }
            catch (Exception exception) {}
        }
    }

    public void a() {
        try {
            Map map = cd.c();
            if (map == null) {
                map = do.a("en");
            }
            if (map != null && !map.isEmpty()) {
                this.b.clear();
                this.b.putAll(map);
                this.d = true;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public hj a() {
        return this.a;
    }

    public void a(Runnable runnable) {
        this.c.add(runnable);
    }

    public static fc a() {
        return INSTANCE;
    }

    public String a(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        if (this.a == hj.a || !this.d) {
            return string;
        }
        return this.b.getOrDefault(Long.toHexString(kJ.a(string)), string);
    }
}

