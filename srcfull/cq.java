/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class cq
extends aT {
    public static /* synthetic */ jh a;
    public static /* synthetic */ gz b;

    public /* synthetic */ cq() {
        super("\u0410\u0437\u043f\u0435\u0441\u0442\u0420\u0430\u0442\u0438\u043e", fV.e);
        this.a((fa)a);
        this.a((fa)b);
        b.a(() -> "Custom".equals(a.a()));
    }

    static {
        jh jh2 = new jh("", "", List.of("16:9", "16:10", "4:3", "Custom"), List.of("4:3"), false);
        jh2.setNameParts(new String[]{"\u041f", "\u0440", "e", "\u0441", "\u0435", "\u0442"});
        jh2.setDescriptionParts(new String[]{"C", "\u043e", "\u043e", "\u0442", "\u043d", "\u043e", "\u0448", "\u0435", "\u043d", "\u0438", "\u0435", " ", "c", "\u0442", "\u043e", "\u0440", "\u043e", "\u043d"});
        a = jh2;
        gz gz2 = new gz("", "", 1.0, 0.1, 10.0, 0.1);
        gz2.setNameParts(new String[]{"C", "\u0438", "\u043b", "\u0430", " ", "\u0440", "a", "\u0441", "\u0442", "\u044f", "\u0433", "\u0430"});
        gz2.setDescriptionParts(new String[]{"C", "\u0442", "\u0435", "\u043f", "\u0435", "\u043d", "\u044c", " ", "\u0433", "o", "\u0440", "\u0438", "\u0437", "\u043e", "\u043d", "\u0442", "\u0430", "\u043b", "\u044c", "\u043d", "\u043e", "\u0433", "\u043e", " ", "\u0440", "a", "\u0441", "\u0442", "\u044f", "\u0436", "\u0435", "\u043d", "\u0438", "\u044f", " ", "\u044d", "\u043a", "\u0440", "a", "\u043d", "\u0430"});
        b = gz2;
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
    }

    public static /* bridge */ /* synthetic */ gz a() {
        return b;
    }

    public static /* bridge */ /* synthetic */ float a() {
        return switch (a.a()) {
            case "16:10" -> 2.2f;
            case "4:3" -> 1.6f;
            case "Custom" -> b.a();
            default -> 1.0f;
        };
    }

    public static /* bridge */ /* synthetic */ boolean a() {
        return "16:9".equals(a.a());
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
    }
}

