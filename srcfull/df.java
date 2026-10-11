/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.function.BiFunction;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_342;
import net.minecraft.class_4587;
import net.minecraft.class_5481;

public final class df {
    private static final /* synthetic */ Map<class_342, df> a;
    private final /* synthetic */ Map<Integer, Long> b;
    private final /* synthetic */ Map<Integer, ip> c;
    private /* synthetic */ String d;

    private /* synthetic */ df() {
        this.b = new HashMap<Integer, Long>();
        this.c = new HashMap<Integer, ip>();
        this.d = "";
    }

    static {
        a = new WeakHashMap<class_342, df>();
    }

    public /* bridge */ /* synthetic */ void a(String string) {
        this.d = string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static /* bridge */ /* synthetic */ df a(class_342 class_3423) {
        Map<class_342, df> map = a;
        synchronized (map) {
            return a.computeIfAbsent(class_3423, class_3422 -> new df());
        }
    }

    public /* bridge */ /* synthetic */ void a(class_327 class_3272, boolean bl2, dE dE2, class_332 class_3322, int n2, class_4587 class_45872, float f2, BiFunction biFunction, int n3) {
        long l2 = System.currentTimeMillis();
        Objects.requireNonNull(class_3272);
        int n4 = 9;
        Iterator<Map.Entry<Integer, ip>> iterator = this.c.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, ip> entry = iterator.next();
            ip ip2 = entry.getValue();
            float f3 = (float)(l2 - ip2.a()) / f2;
            if (f3 >= 1.0f) {
                iterator.remove();
                continue;
            }
            float f4 = Math.max(1.0f - dE2.a(f3), 0.003921569f);
            if (f4 <= 0.01f) {
                iterator.remove();
                continue;
            }
            class_5481 class_54812 = (class_5481)biFunction.apply(String.valueOf(ip2.a()), entry.getKey());
            class_45872.method_22903();
            if (dE2.a()) {
                float f5 = 1.0f;
                int n5 = n4;
                int n6 = n2;
                int n7 = ip2.a();
                class_4587 class_45873 = class_45872;
                dE2.a(n5, class_45873, n6, f5, n7);
                float f6 = f4;
                int n8 = n3;
                class_3322.method_51430(class_3272, class_54812, ip2.a(), n2, fL.a(f6, n8), bl2);
            } else {
                float f7 = f4;
                int n9 = n4;
                int n10 = n2;
                int n11 = ip2.a();
                class_4587 class_45874 = class_45872;
                dE2.a(n9, class_45874, n10, f7, n11);
                class_3322.method_51430(class_3272, class_54812, ip2.a(), n2, n3, bl2);
            }
            class_45872.method_22909();
        }
    }

    public /* bridge */ /* synthetic */ int a(int n2, boolean bl2, int n3, BiFunction biFunction, class_4587 class_45872, int n4, class_327 class_3272, int n5, String string, float f2, int n6, dE dE2, class_332 class_3322) {
        int n7 = n4;
        int n8 = n4;
        long l2 = System.currentTimeMillis();
        Objects.requireNonNull(class_3272);
        int n9 = 9;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            class_5481 class_54812 = (class_5481)biFunction.apply(String.valueOf(string.charAt(i2)), n2 + i2);
            long l3 = this.b.getOrDefault(i2, l2);
            float f3 = Math.min((float)(l2 - l3) / f2, 1.0f);
            if (f3 < 1.0E-4f) continue;
            int n10 = n5;
            float f4 = 1.0f;
            if (dE2.a()) {
                float f5 = dE2.a(f3);
                int n11 = n5;
                n10 = fL.a(f5, n11);
            } else {
                float f6 = f2;
                long l4 = l2;
                long l5 = l3;
                f4 = dE2.a(f6, l5, l4);
            }
            class_45872.method_22903();
            float f7 = f4;
            int n12 = n9;
            int n13 = n6;
            int n14 = n7;
            class_4587 class_45873 = class_45872;
            dE2.a(n14, f7, n12, class_45873, n13);
            class_3322.method_51430(class_3272, class_54812, n7, n6, n10, bl2);
            class_45872.method_22909();
            int n15 = class_3272.method_30880(class_54812);
            if (i2 < n3) {
                n8 += n15;
            }
            n7 += n15;
        }
        return n8;
    }

    public /* bridge */ /* synthetic */ void a(class_327 class_3272, String string, int n2) {
        long l2 = System.currentTimeMillis();
        int n3 = Math.max(string.length(), this.d.length());
        for (int i2 = 0; i2 < n3; ++i2) {
            char c2;
            boolean bl2 = i2 < string.length();
            boolean bl3 = i2 < this.d.length();
            char c3 = bl2 ? string.charAt(i2) : (char)'\u0000';
            char c4 = c2 = bl3 ? this.d.charAt(i2) : (char)'\u0000';
            if (bl2 && (!bl3 || c3 != c2)) {
                this.b.put(i2, l2);
            }
            if (!bl3 || bl2 && c3 == c2) continue;
            int n4 = class_3272.method_1727(this.d.substring(0, i2));
            this.c.put(i2, new ip(c2, l2, n2 + n4));
        }
    }
}

