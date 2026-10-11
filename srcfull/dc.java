/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_1297;
import net.minecraft.class_1541;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class dc
extends aT {
    private /* synthetic */ gz a;
    private static final /* synthetic */ class_1799 b;
    private final /* synthetic */ Map<Integer, Float> c;
    private final /* synthetic */ Set<Integer> d;
    private /* synthetic */ long e;

    public /* synthetic */ dc() {
        super("\u0422\u043d\u0442\u0422\u0438\u043c\u0435\u0440", fV.d);
        gz gz2 = new gz("", "", 0.3, 0.1, 1.0, 0.1);
        gz2.setNameParts(new String[]{"M", "\u0430", "\u0441", "\u0448", "\u0442", "\u0430", "\u0431", " ", "\u043f", "\u043b", "a", "\u0448", "\u043a", "\u0438"});
        gz2.setDescriptionParts(new String[]{"M", "\u0430", "\u0441", "\u0448", "\u0442", "\u0430", "\u0431", " ", "\u043f", "\u043b", "a", "\u0448", "\u043a", "\u0438", " ", "c", " ", "\u0442", "a", "\u0439", "\u043c", "\u0435", "\u0440", "\u043e", "\u043c"});
        this.a = gz2;
        this.c = new HashMap<Integer, Float>();
        this.d = new HashSet<Integer>();
        this.e = System.currentTimeMillis();
        this.a(new fa[]{this.a});
    }

    static {
        b = new class_1799((class_1935)class_1802.field_8626);
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public /* bridge */ /* synthetic */ void f(H h2) {
        if (gd.k()) {
            return;
        }
        if (this.z()) {
            return;
        }
        class_4587 class_45872 = h2.a();
        class_4184 class_41842 = h2.a();
        if (class_45872 == null) {
            return;
        }
        class_243 class_2432 = class_41842.method_19326();
        long l2 = System.currentTimeMillis();
        float f2 = Math.min((float)(l2 - this.e) / 1000.0f, 0.1f);
        this.e = l2;
        bU.a(this.a());
        dP.a();
        this.d.clear();
        try {
            for (class_1297 class_12972 : this.a().method_18112()) {
                if (!(class_12972 instanceof class_1541)) continue;
                class_1541 class_15412 = (class_1541)class_12972;
                int n2 = class_15412.method_6969();
                double d2 = Math.max(0.0, (double)n2 / 20.0);
                String string = dc.a(d2);
                class_243 class_2433 = class_15412.method_30950(h2.a().method_60637(true)).method_1020(class_2432);
                double d3 = class_15412.method_19538().method_1022(class_2432);
                this.d.add(class_15412.method_5628());
                float f3 = f2;
                int n3 = class_15412.method_5628();
                double d4 = d3;
                String string2 = string;
                class_243 class_2434 = class_2433;
                class_4184 class_41843 = class_41842;
                class_4587 class_45873 = class_45872;
                this.a(class_45873, n3, class_41843, d4, f3, string2, class_2434);
            }
        }
        finally {
            dP.b();
            bU.b(this.a());
        }
        this.c.keySet().retainAll(this.d);
    }

    private static /* bridge */ /* synthetic */ String a(double d2) {
        return co.a(d2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* bridge */ /* synthetic */ void a(class_4587 class_45872, int n2, class_4184 class_41842, double d2, float f2, String string, class_243 class_2432) {
        class_45872.method_22903();
        try {
            class_45872.method_22904(class_2432.field_1352, class_2432.field_1351 + 1.5, class_2432.field_1350);
            bU.a(class_45872);
            float f3 = ge.a(d2, this.a.a());
            float f4 = this.c.getOrDefault(n2, Float.valueOf(f3)).floatValue();
            float f5 = f4 + (f3 - f4) * Math.min(1.0f, f2 * 10.0f);
            this.c.put(n2, Float.valueOf(f5));
            class_45872.method_22905(-f5, -f5, -f5);
            float f6 = 14.0f;
            String string2 = string;
            hZ hZ2 = aK;
            float f7 = ao.a(f6, hZ2, string2);
            float f8 = 22.0f + f7;
            float f9 = f8 + 20.0f;
            float f10 = Math.max(14.0f, 16.0f) + 10.0f;
            float f11 = -f9 / 2.0f;
            float f12 = -f10 / 2.0f;
            Matrix4f matrix4f = class_45872.method_23760().method_23761();
            float f13 = 1.0f;
            int n3 = gD.background();
            float f14 = 8.0f;
            float f15 = f10;
            float f16 = f9;
            float f17 = f12;
            float f18 = f11;
            Matrix4f matrix4f2 = matrix4f;
            dP.a(f14, f18, n3, matrix4f2, f15, f16, f13, f17);
            float f19 = f11 + 10.0f;
            float f20 = -8.0f;
            float f21 = 1.0f;
            float f22 = 16.0f;
            float f23 = f20;
            float f24 = f19;
            class_1799 class_17992 = b;
            Matrix4f matrix4f3 = matrix4f;
            if (!lz.a(f24, matrix4f3, f21, f22, f23, class_17992)) {
                float f25 = 1.0f;
                float f26 = 16.0f;
                float f27 = f20;
                float f28 = f19;
                class_1799 class_17993 = b;
                Matrix4f matrix4f4 = matrix4f;
                ir.a(f26, f25, f28, class_17993, matrix4f4, f27);
            }
            float f29 = f19 + 16.0f + 6.0f;
            float f30 = -8.5f;
            int n4 = -1;
            float f31 = 14.0f;
            float f32 = f30;
            float f33 = f29;
            String string3 = string;
            hZ hZ3 = aK;
            Matrix4f matrix4f5 = matrix4f;
            ao.a(string3, f31, matrix4f5, n4, f33, hZ3, f32);
        }
        finally {
            class_45872.method_22909();
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
    }
}

