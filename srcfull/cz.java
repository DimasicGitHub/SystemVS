/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

public class cz {
    private static final Map<Class<? extends fa>, Function<fa, cA>> a = new LinkedHashMap<Class<? extends fa>, Function<fa, cA>>();

    private cz() {
    }

    static {
        cz.a(hO.class, fa2 -> new js((hO)fa2));
        cz.a(lh.class, fa2 -> new hR((lh)fa2));
        cz.a(au.class, fa2 -> new cn((au)fa2));
        cz.a(dw.class, fa2 -> new hr((dw)fa2));
        cz.a(gz.class, fa2 -> new Q((gz)fa2));
        cz.a(fr.class, fa2 -> new gl((fr)fa2));
        cz.a(jh.class, fa2 -> new gl((jh)fa2));
        cz.a(lw.class, fa2 -> new gX((lw)fa2));
        cz.a(t.class, fa2 -> new kG((t)fa2));
        cz.a(cX.class, fa2 -> new aN((cX)fa2));
        cz.a(fx.class, fa2 -> new cH((fx)fa2));
        cz.a(bu.class, bK::new);
        cz.a(kn.class, bK::new);
        cz.a(kZ.class, fa2 -> new hn((kZ)fa2));
        cz.a(aq.class, fa2 -> new iN((aq)fa2));
        cz.a(eP.class, fa2 -> new C((eP)fa2));
        cz.a(hE.class, fa2 -> new gf((hE)fa2));
    }

    public static cA a(fa fa2) {
        if (fa2 == null) {
            return null;
        }
        for (Map.Entry<Class<? extends fa>, Function<fa, cA>> entry : a.entrySet()) {
            if (!entry.getKey().isInstance(fa2)) continue;
            return entry.getValue().apply(fa2);
        }
        return null;
    }

    public static void a(Class clazz, Function function) {
        a.put(clazz, function);
    }
}

