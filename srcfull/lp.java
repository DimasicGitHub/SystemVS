/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lp {
    private final boolean a;
    private final String b;
    private final String c;
    private final Map<String, Object> d;

    public lp(boolean bl2, String string, String string2) {
        this(bl2, string, string2, null);
    }

    public lp(boolean bl2, String string, String string2, Map map) {
        this.a = bl2;
        this.b = string;
        this.c = string2;
        this.d = map != null ? map : new HashMap();
    }

    public String b() {
        return this.c;
    }

    public boolean b() {
        return "AUTHORIZED".equals(this.c);
    }

    public Object a(String string) {
        return this.d.get(string);
    }

    public boolean a() {
        return this.a;
    }

    public Map a() {
        return this.d;
    }

    public String a() {
        return this.b;
    }
}

