/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ds {
    private static final Map<String, fv> a = new HashMap<String, fv>();
    private static boolean b = false;

    public static void b() {
        a.clear();
        b = false;
    }

    public static Collection a() {
        if (!b) {
            ds.a();
        }
        return new ArrayList<fv>(a.values());
    }

    public static synchronized void a() {
        if (b) {
            return;
        }
        b = true;
        Function<fv, String> function = fv2 -> fv2.e() + "/" + fv2.a();
        Supplier<List> supplier = do::a;
        List list = cd.a();
        Map<String, fv> map = a;
        bX.a(supplier, function, map, list);
    }
}

