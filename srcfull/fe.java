/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_2960;

public final class fe
extends Enum<fe> {
    public static final /* synthetic */ /* enum */ fe a;
    public static final /* synthetic */ /* enum */ fe b;
    public static final /* synthetic */ /* enum */ fe c;
    public static final /* synthetic */ /* enum */ fe d;
    public static final /* synthetic */ /* enum */ fe e;
    public static final /* synthetic */ /* enum */ fe f;
    public final /* synthetic */ class_2960 g;
    private static final /* synthetic */ fe[] h;

    private /* synthetic */ fe(String string, int n2, class_2960 class_29602) {
        this.g = class_29602;
    }

    static {
        a = new fe("NONE", 0, null);
        b = new fe("SPEAKER", 1, class_2960.method_60655((String)"voicechat", (String)"textures/icons/speaker.png"));
        c = new fe("WHISPER", 2, class_2960.method_60655((String)"voicechat", (String)"textures/icons/speaker_whisper.png"));
        d = new fe("DISCONNECT", 3, class_2960.method_60655((String)"voicechat", (String)"textures/icons/disconnected.png"));
        e = new fe("GROUP", 4, class_2960.method_60655((String)"voicechat", (String)"textures/icons/group.png"));
        f = new fe("DISABLED", 5, class_2960.method_60655((String)"voicechat", (String)"textures/icons/speaker_off.png"));
        h = fe.a();
    }

    public static /* bridge */ /* synthetic */ fe[] values() {
        return (fe[])h.clone();
    }

    private static /* bridge */ /* synthetic */ fe[] a() {
        return new fe[]{a, b, c, d, e, f};
    }

    public static /* bridge */ /* synthetic */ fe a(String string) {
        return Enum.valueOf(fe.class, string);
    }
}

