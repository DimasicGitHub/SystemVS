/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.class_1887;
import net.minecraft.class_1893;
import net.minecraft.class_5321;

public final class fb {
    private static final /* synthetic */ String[] a;
    private static final /* synthetic */ Map<String, fb> b;
    private final /* synthetic */ class_5321<class_1887> c;
    private final /* synthetic */ int d;
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private static final /* synthetic */ List<fb> g;
    private static final /* synthetic */ List<fb> h;

    private /* synthetic */ fb(class_5321 class_53212, int n2, String string) {
        this.c = class_53212;
        this.d = n2;
        this.e = n2 > 0 ? string + " " + a[Math.min(n2, a.length - 1)] : string;
        this.f = String.valueOf(class_53212.method_29177()) + "@" + n2;
    }

    static {
        a = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        b = new LinkedHashMap<String, fb>();
        g = new ArrayList<fb>();
        String string = "\u0417\u0430\u0449\u0438\u0442\u0430";
        int n2 = 5;
        class_5321 class_53212 = class_1893.field_9111;
        List<fb> list = g;
        fb.a(n2, class_53212, string, list);
        String string2 = "\u041f\u0440\u043e\u0447\u043d\u043e\u0441\u0442\u044c";
        int n3 = 5;
        class_5321 class_53213 = class_1893.field_9119;
        List<fb> list2 = g;
        fb.a(n3, class_53213, string2, list2);
        String string3 = "\u041fo\u0447\u0438\u043d\u043a\u0430";
        int n4 = 0;
        class_5321 class_53214 = class_1893.field_9101;
        List<fb> list3 = g;
        fb.a(n4, class_53214, string3, list3);
        String string4 = "\u0428\u0438\u043f\u044b";
        int n5 = 0;
        class_5321 class_53215 = class_1893.field_9097;
        List<fb> list4 = g;
        fb.a(n5, class_53215, string4, list4);
        String string5 = "\u041d\u0435\u0432\u0435\u0441\u043e\u043c\u043e\u0441\u0442\u044c";
        int n6 = 4;
        class_5321 class_53216 = class_1893.field_9129;
        List<fb> list5 = g;
        fb.a(n6, class_53216, string5, list5);
        String string6 = "\u041f\u043e\u0434\u0432\u043e\u0434\u043d\u0430\u044f \u0445\u043e\u0434\u044c\u0431\u0430";
        int n7 = 3;
        class_5321 class_53217 = class_1893.field_9128;
        List<fb> list6 = g;
        fb.a(n7, class_53217, string6, list6);
        h = new ArrayList<fb>();
        String string7 = "\u041e\u0441\u0442\u0440\u043e\u0442\u0430";
        int n8 = 7;
        class_5321 class_53218 = class_1893.field_9118;
        List<fb> list7 = h;
        fb.a(n8, class_53218, string7, list7);
        String string8 = "\u041f\u0440\u043e\u0447\u043d\u043e\u0441\u0442\u044c";
        int n9 = 5;
        class_5321 class_53219 = class_1893.field_9119;
        List<fb> list8 = h;
        fb.a(n9, class_53219, string8, list8);
        String string9 = "\u0417\u0430\u0433\u043e\u0432\u043e\u0440 \u043e\u0433\u043d\u044f";
        int n10 = 2;
        class_5321 class_532110 = class_1893.field_9124;
        List<fb> list9 = h;
        fb.a(n10, class_532110, string9, list9);
        String string10 = "\u041e\u0442\u0434\u0430\u0447\u0430";
        int n11 = 2;
        class_5321 class_532111 = class_1893.field_9121;
        List<fb> list10 = h;
        fb.a(n11, class_532111, string10, list10);
        String string11 = "\u0414\u043e\u0431\u044b\u0447\u0430";
        int n12 = 3;
        class_5321 class_532112 = class_1893.field_9110;
        List<fb> list11 = h;
        fb.a(n12, class_532112, string11, list11);
        String string12 = "\u041fo\u0447\u0438\u043d\u043a\u0430";
        int n13 = 0;
        class_5321 class_532113 = class_1893.field_9101;
        List<fb> list12 = h;
        fb.a(n13, class_532113, string12, list12);
    }

    public /* bridge */ /* synthetic */ String b() {
        return this.f;
    }

    public static /* bridge */ /* synthetic */ List b() {
        return fb.a(h);
    }

    public /* bridge */ /* synthetic */ int a() {
        return this.d;
    }

    public /* bridge */ /* synthetic */ String a() {
        return this.e;
    }

    private static /* bridge */ /* synthetic */ void a(int n2, class_5321 class_53212, String string, List list) {
        fb fb2 = new fb(class_53212, n2, string);
        b.put(fb2.e, fb2);
        list.add(fb2);
    }

    public static /* bridge */ /* synthetic */ fb a(String string) {
        return b.get(string);
    }

    private static /* bridge */ /* synthetic */ List a(List list) {
        ArrayList<String> arrayList = new ArrayList<String>(list.size());
        for (fb fb2 : list) {
            arrayList.add(fb2.e);
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ List a() {
        return fb.a(g);
    }

    public /* bridge */ /* synthetic */ class_5321 a() {
        return this.c;
    }
}

