/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_124;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1836;
import net.minecraft.class_2561;
import net.minecraft.class_476;
import net.minecraft.class_9290;
import net.minecraft.class_9334;

public final class bv {
    private static final /* synthetic */ Pattern a;

    private /* synthetic */ bv() {
    }

    static {
        a = Pattern.compile("(\\d{1,3}(?:[\\s\u00a0,._]\\d{3})+|\\d+)");
    }

    private static /* bridge */ /* synthetic */ long b(String string) {
        long l2 = 0L;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 < '0' || c2 > '9') continue;
            l2 = l2 * 10L + (long)(c2 - 48);
        }
        return l2;
    }

    public static /* bridge */ /* synthetic */ long a(class_1799 class_17992) {
        class_9290 class_92902 = (class_9290)class_17992.method_57824(class_9334.field_49632);
        if (class_92902 == null) {
            return 0L;
        }
        for (class_2561 class_25612 : class_92902.comp_2400()) {
            long l2;
            String string;
            String string2;
            if (class_25612 == null || (string2 = class_124.method_539((String)class_25612.getString())) == null || string2.isEmpty() || (string = string2.toLowerCase(Locale.ROOT)).contains("\u0437\u0430 1 \u0448\u0442") || !bv.a(string) || (l2 = bv.a(string2)) <= 0L) continue;
            return l2;
        }
        return 0L;
    }

    public static /* bridge */ /* synthetic */ String a(long l2) {
        StringBuilder stringBuilder = new StringBuilder();
        String string = String.valueOf(l2);
        int n2 = 0;
        for (int i2 = string.length() - 1; i2 >= 0; --i2) {
            if (n2 > 0 && n2 % 3 == 0) {
                stringBuilder.insert(0, '.');
            }
            stringBuilder.insert(0, string.charAt(i2));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static /* bridge */ /* synthetic */ boolean a(String[] stringArray,  /* corrupt varargs signature?! */ class_476class_476 class_4762) {
        if (class_4762 == null || class_4762.method_25440() == null) {
            return false;
        }
        String string = class_124.method_539((String)class_4762.method_25440().getString());
        if (string == null) {
            return false;
        }
        String string2 = string.toLowerCase(Locale.ROOT);
        for (String string3 : stringArray) {
            if (!string2.contains(string3)) continue;
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ int a(String string) {
        if (string == null || string.isEmpty()) {
            return -1;
        }
        int n2 = -1;
        Matcher matcher = a.matcher(string);
        while (matcher.find()) {
            long l2 = bv.b(matcher.group(1));
            if (l2 <= 0L || l2 > Integer.MAX_VALUE) continue;
            n2 = (int)l2;
        }
        return n2;
    }

    public static /* bridge */ /* synthetic */ boolean a(String string) {
        if (string.contains("\u0446\u0435\u043d\u0430") || string.contains("price") || string.contains("\u0441\u0442\u043e\u0438\u043c\u043e\u0441\u0442\u044c") || string.contains("cost") || string.contains("\u00a4")) {
            return true;
        }
        return string.matches(".*\\$\\s*[\\d\\s\u00a0,._]+.*");
    }

    public static /* bridge */ /* synthetic */ long a(String string) {
        long l2 = 0L;
        Matcher matcher = a.matcher(string);
        while (matcher.find()) {
            long l3 = bv.b(matcher.group(1));
            if (l3 <= l2) continue;
            l2 = l3;
        }
        return l2;
    }

    public static /* bridge */ /* synthetic */ int a(class_1799 class_17992) {
        try {
            List list = class_17992.method_7950(class_1792.class_9635.field_51353, (class_1657)lo.aM.field_1724, (class_1836)class_1836.field_41070);
            if (list == null || list.isEmpty()) {
                return -1;
            }
            for (int i2 = list.size() - 1; i2 >= 1; --i2) {
                int n2;
                String string;
                String string2;
                class_2561 class_25612 = (class_2561)list.get(i2);
                if (class_25612 == null || (string2 = class_124.method_539((String)class_25612.getString())) == null || string2.isEmpty() || (string = string2.toLowerCase(Locale.ROOT)).contains("\u0437\u0430 1 \u0448\u0442") || !bv.a(string) || (n2 = bv.a(string2)) <= 0) continue;
                return n2;
            }
            return -1;
        }
        catch (Throwable throwable) {
            return -1;
        }
    }
}

