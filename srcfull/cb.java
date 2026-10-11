/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cb {
    private final Map<String, fH> a = new HashMap<String, fH>();
    private static volatile cb INSTANCE;

    public cb() {
        aV.a();
        for (String string : F.a()) {
            this.a(string);
        }
    }

    public Map a() {
        return this.a;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static cb a() {
        cb cb2 = INSTANCE;
        if (cb2 != null) return cb2;
        Class<cb> clazz = cb.class;
        synchronized (cb.class) {
            cb2 = INSTANCE;
            if (cb2 != null) return cb2;
            INSTANCE = cb2 = new cb();
            // ** MonitorExit[var1_1] (shouldn't be in output)
            return cb2;
        }
    }

    private void a(String string) {
        cI cI2 = aV.a(string);
        if (cI2 == null) {
            return;
        }
        byte[] byArray = cI2.a();
        String string2 = "fonts/" + string + ".json";
        this.a.put(string + ".json", fH.a(byArray, string2));
    }
}

