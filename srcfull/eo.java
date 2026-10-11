/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumMap;
import java.util.Map;

public final class eo {
    private static final float a = 14.0f;
    private static final Map<kD, gx> b = new EnumMap<kD, gx>(kD.class);

    private eo() {
    }

    static {
        b.put(kD.POTION, new gx(9.0f, 14.0f));
        b.put(kD.WAYPOINT, new gx(11.0f, 14.0f));
        b.put(kD.FRIENDS, new gx(14.0f, 10.0f));
        b.put(kD.KEYBOARD, new gx(14.0f, 9.0f));
        b.put(kD.COORDS, new gx(12.0f, 12.0f));
        b.put(kD.LOGO, new gx(14.0f, 14.0f));
        b.put(kD.BOLT, new gx(13.0f, 14.0f));
        b.put(kD.GLOBE, new gx(14.0f, 14.0f));
        b.put(kD.RACK, new gx(14.0f, 14.0f));
        b.put(kD.CUBE, new gx(12.0f, 14.0f));
    }

    public static float b(kD kD2) {
        gx gx2 = b.get((Object)kD2);
        return gx2 != null ? gx2.b() : 14.0f;
    }

    public static float a(kD kD2) {
        gx gx2 = b.get((Object)kD2);
        return gx2 != null ? gx2.a() : 14.0f;
    }
}

