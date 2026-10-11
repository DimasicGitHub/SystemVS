/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1764;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1819;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_742;
import net.minecraft.class_759;
import net.minecraft.class_7833;
import net.minecraft.class_811;
import net.minecraft.class_9334;
import org.joml.Matrix4f;

@jB(value=class_759.class)
public class cj {
    private static final hW<gu> a = new hW(gu.class);
    private static final hW<kI> b = new hW(kI.class);

    private static void b(class_4587 class_45872, class_1306 class_13062, float f2) {
        int n2 = class_13062 == class_1306.field_6183 ? 1 : -1;
        float f3 = class_3532.method_15374((float)(f2 * f2 * (float)Math.PI));
        class_45872.method_22907(class_7833.field_40716.rotationDegrees((float)n2 * (45.0f + f3 * -20.0f)));
        float f4 = class_3532.method_15374((float)(class_3532.method_15355((float)f2) * (float)Math.PI));
        class_45872.method_22907(class_7833.field_40718.rotationDegrees((float)n2 * f4 * -20.0f));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(f4 * -80.0f));
        class_45872.method_22907(class_7833.field_40716.rotationDegrees((float)n2 * -45.0f));
    }

    private static void b(class_742 class_7422, float f2, class_1268 class_12682, float f3, class_1799 class_17992, float f4, class_4587 class_45872, class_1306 class_13062, int n2, boolean bl2, kI kI2) {
        if (class_7422.method_6115() && class_7422.method_6014() > 0 && class_7422.method_6058() == class_12682) {
            switch (class_17992.method_7976()) {
                case field_8952: {
                    cj.a(class_45872, class_13062, f4);
                    break;
                }
                case field_8950: 
                case field_8946: {
                    cj.a(class_45872, f2, class_13062, class_17992, (class_1657)class_7422);
                    cj.a(class_45872, class_13062, f4);
                    break;
                }
                case field_8949: {
                    cj.a(class_45872, class_13062, f4);
                    if (class_17992.method_7909() instanceof class_1819) break;
                    class_45872.method_46416((float)n2 * -0.14f, 0.08f, 0.14f);
                    class_45872.method_22907(class_7833.field_40714.rotationDegrees(-102.25f));
                    class_45872.method_22907(class_7833.field_40716.rotationDegrees((float)n2 * 13.36f));
                    class_45872.method_22907(class_7833.field_40718.rotationDegrees((float)n2 * 78.05f));
                    break;
                }
                case field_8953: {
                    cj.a(class_45872, class_13062, f4);
                    class_45872.method_46416((float)n2 * -0.28f, 0.18f, 0.16f);
                    class_45872.method_22907(class_7833.field_40714.rotationDegrees(-13.93f));
                    class_45872.method_22907(class_7833.field_40716.rotationDegrees((float)n2 * 35.3f));
                    class_45872.method_22907(class_7833.field_40718.rotationDegrees((float)n2 * -9.78f));
                    float f5 = (float)class_17992.method_7935((class_1309)class_7422) - ((float)class_7422.method_6014() - f2 + 1.0f);
                    float f6 = f5 / 20.0f;
                    f6 = (f6 * f6 + f6 * 2.0f) / 3.0f;
                    if (f6 > 1.0f) {
                        f6 = 1.0f;
                    }
                    if (f6 > 0.1f) {
                        float f7 = class_3532.method_15374((float)((f5 - 0.1f) * 1.3f));
                        float f8 = f7 * (f6 - 0.1f);
                        class_45872.method_46416(f8 * 0.0f, f8 * 0.004f, f8 * 0.0f);
                    }
                    class_45872.method_46416(f6 * 0.0f, f6 * 0.0f, f6 * 0.04f);
                    class_45872.method_22905(1.0f, 1.0f, 1.0f + f6 * 0.2f);
                    class_45872.method_22907(class_7833.field_40715.rotationDegrees((float)n2 * 45.0f));
                    break;
                }
                case field_8951: {
                    cj.a(class_45872, class_13062, f4);
                    class_45872.method_46416((float)n2 * -0.5f, 0.7f, 0.1f);
                    class_45872.method_22907(class_7833.field_40714.rotationDegrees(-55.0f));
                    class_45872.method_22907(class_7833.field_40716.rotationDegrees((float)n2 * 35.3f));
                    class_45872.method_22907(class_7833.field_40718.rotationDegrees((float)n2 * -9.785f));
                    float f9 = ((float)class_17992.method_7935((class_1309)class_7422) - ((float)class_7422.method_6014() - f2 + 1.0f)) / 10.0f;
                    if (f9 > 1.0f) {
                        f9 = 1.0f;
                    }
                    if (f9 > 0.1f) {
                        float f10 = class_3532.method_15374((float)((f9 - 0.1f) * 1.3f)) * (f9 - 0.1f);
                        class_45872.method_46416(f10 * 0.0f, f10 * 0.004f, f10 * 0.0f);
                    }
                    class_45872.method_46416(0.0f, 0.0f, f9 * 0.2f);
                    class_45872.method_22905(1.0f, 1.0f, 1.0f + f9 * 0.2f);
                    class_45872.method_22907(class_7833.field_40715.rotationDegrees((float)n2 * 45.0f));
                    break;
                }
                case field_42717: {
                    cj.a(class_45872, f2, class_13062, class_17992, (class_1657)class_7422, f4);
                    break;
                }
                case field_55494: {
                    cj.a(kI2, f3, f4, class_45872, n2, class_13062, bl2);
                }
            }
        } else if (class_7422.method_6123()) {
            cj.a(class_45872, class_13062, f4);
            class_45872.method_46416((float)n2 * -0.4f, 0.8f, 0.3f);
            class_45872.method_22907(class_7833.field_40716.rotationDegrees((float)n2 * 65.0f));
            class_45872.method_22907(class_7833.field_40718.rotationDegrees((float)n2 * -85.0f));
        } else {
            cj.a(kI2, f3, f4, class_45872, n2, class_13062, bl2);
        }
    }

    private static void a(class_4587 class_45872, float f2, class_1306 class_13062, class_1799 class_17992, class_1657 class_16572) {
        float f3;
        float f4 = (float)class_16572.method_6014() - f2 + 1.0f;
        float f5 = f4 / (float)class_17992.method_7935((class_1309)class_16572);
        if (f5 < 0.8f) {
            f3 = class_3532.method_15379((float)(class_3532.method_15362((float)(f4 / 4.0f * (float)Math.PI)) * 0.1f));
            class_45872.method_46416(0.0f, f3, 0.0f);
        }
        f3 = 1.0f - (float)Math.pow(f5, 27.0);
        int n2 = class_13062 == class_1306.field_6183 ? 1 : -1;
        class_45872.method_46416(f3 * 0.6f * (float)n2, f3 * -0.5f, f3 * 0.0f);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees((float)n2 * f3 * 90.0f));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(f3 * 10.0f));
        class_45872.method_22907(class_7833.field_40718.rotationDegrees((float)n2 * f3 * 30.0f));
    }

    private static void a(class_4587 class_45872, class_1306 class_13062, float f2) {
        int n2 = class_13062 == class_1306.field_6183 ? 1 : -1;
        class_45872.method_46416((float)n2 * 0.56f, -0.52f + f2 * -0.6f, -0.72f);
    }

    private static void a(class_4587 class_45872, float f2, class_1306 class_13062, class_1799 class_17992, class_1657 class_16572, float f3) {
        cj.a(class_45872, class_13062, f3);
        float f4 = class_16572.method_6014() % 10;
        float f5 = f4 - f2 + 1.0f;
        float f6 = 1.0f - f5 / 10.0f;
        float f7 = -15.0f + 75.0f * class_3532.method_15362((float)(f6 * 2.0f * (float)Math.PI));
        if (class_13062 != class_1306.field_6183) {
            class_45872.method_22904(0.1, 0.83, 0.35);
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(-80.0f));
            class_45872.method_22907(class_7833.field_40716.rotationDegrees(-90.0f));
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(f7));
            class_45872.method_22904(-0.3, 0.22, 0.35);
        } else {
            class_45872.method_22904(-0.25, 0.22, 0.35);
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(-80.0f));
            class_45872.method_22907(class_7833.field_40716.rotationDegrees(90.0f));
            class_45872.method_22907(class_7833.field_40718.rotationDegrees(0.0f));
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(f7));
        }
    }

    private static boolean a(gu gu2, boolean bl2) {
        if (!aa.a() || iw.a()) {
            return false;
        }
        if (gu2 == null) {
            return true;
        }
        dz dz2 = gu2.a();
        return !dz2.d() || dz2.a(bl2);
    }

    private static void a(class_742 class_7422, float f2, class_1268 class_12682, float f3, class_1799 class_17992, float f4, class_4587 class_45872, class_1306 class_13062, int n2, boolean bl2, kI kI2) {
        boolean bl3 = class_1764.method_7781((class_1799)class_17992);
        if (class_7422.method_6115() && class_7422.method_6014() > 0 && class_7422.method_6058() == class_12682) {
            cj.a(class_45872, class_13062, f4);
            class_45872.method_46416((float)n2 * -0.48f, -0.094f, 0.057f);
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(-12.0f));
            class_45872.method_22907(class_7833.field_40716.rotationDegrees((float)n2 * 65.3f));
            class_45872.method_22907(class_7833.field_40718.rotationDegrees((float)n2 * -9.78f));
            float f5 = (float)class_17992.method_7935((class_1309)class_7422) - ((float)class_7422.method_6014() - f2 + 1.0f);
            float f6 = f5 / (float)class_1764.method_7775((class_1799)class_17992, (class_1309)class_7422);
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            if (f6 > 0.1f) {
                float f7 = class_3532.method_15374((float)((f5 - 0.1f) * 1.3f));
                float f8 = f6 - 0.1f;
                float f9 = f7 * f8;
                class_45872.method_46416(f9 * 0.0f, f9 * 0.004f, f9 * 0.0f);
            }
            class_45872.method_46416(f6 * 0.0f, f6 * 0.0f, f6 * 0.04f);
            class_45872.method_22905(1.0f, 1.0f, 1.0f + f6 * 0.2f);
            class_45872.method_22907(class_7833.field_40715.rotationDegrees((float)n2 * 45.0f));
        } else {
            cj.a(kI2, f3, f4, class_45872, n2, class_13062, bl2);
            if (bl3 && f3 < 0.001f && bl2) {
                class_45872.method_46416((float)n2 * -0.64f, 0.0f, 0.0f);
                class_45872.method_22907(class_7833.field_40716.rotationDegrees((float)n2 * 10.0f));
            }
        }
    }

    private static void a(kI kI2, float f2, float f3, class_4587 class_45872, int n2, class_1306 class_13062, boolean bl2) {
        boolean bl3;
        boolean bl4 = bl3 = kI2 != null && kI2.a();
        if (bl3 && kI2.d.a() && !bl2) {
            bl3 = false;
        }
        if (bl3) {
            float f4 = kI2.a(f2);
            class_1306 class_13063 = class_13062;
            float f5 = f4;
            class_4587 class_45873 = class_45872;
            kI2.a(f5, class_13063, class_45873);
        } else {
            float f6 = -0.4f * class_3532.method_15374((float)(class_3532.method_15355((float)f2) * (float)Math.PI));
            float f7 = 0.2f * class_3532.method_15374((float)(class_3532.method_15355((float)f2) * ((float)Math.PI * 2)));
            float f8 = -0.2f * class_3532.method_15374((float)(f2 * (float)Math.PI));
            class_45872.method_46416((float)n2 * f6, f7, f8);
            cj.a(class_45872, class_13062, f3);
            cj.b(class_45872, class_13062, f2);
        }
    }

    private static void a(gu gu2, class_4587 class_45872, boolean bl2) {
        dz dz2 = gu2.a();
        boolean bl3 = !bl2 && gu2.a().a();
        boolean bl4 = bl3 || bl2;
        float f2 = bl3 ? -dz2.b(true) : dz2.b(bl4);
        float f3 = dz2.c(bl4);
        float f4 = dz2.d(bl4);
        float f5 = f3;
        float f6 = f2;
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        boolean bl5 = bl2;
        dz2.a(matrix4f, f5, f6, bl5);
        class_45872.method_46416(f2, f3, 0.0f);
        if (f4 != 1.0f) {
            float f7 = dz.a(bl2);
            class_45872.method_46416(f7, dz.a(), dz.b());
            class_45872.method_22905(f4, f4, f4);
            class_45872.method_46416(-f7, -dz.a(), -dz.b());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @hz(method="method_3228", desc="(Lnet/minecraft/class_742;FFLnet/minecraft/class_1268;FLnet/minecraft/class_1799;FLnet/minecraft/class_4587;Lnet/minecraft/class_4597;I)V", at=iD.REPLACE)
    public static void a(class_759 class_7592, class_742 class_7422, float f2, float f3, class_1268 class_12682, float f4, class_1799 class_17992, float f5, class_4587 class_45872, class_4597 class_45972, int n2) {
        block34: {
            int n3;
            gu gu2 = (gu)a.a();
            kI kI2 = (kI)b.a();
            boolean bl2 = gu2 != null;
            boolean bl3 = kI2 != null && kI2.a();
            boolean bl4 = class_12682 == class_1268.field_5808;
            class_1306 class_13062 = bl4 ? class_7422.method_6068() : class_7422.method_6068().method_5928();
            boolean bl5 = class_13062 == class_1306.field_6183;
            int n4 = n3 = bl5 ? 1 : -1;
            if (!bl2 && !bl3) {
                bP.a(class_7592, class_7422, Float.valueOf(f2), Float.valueOf(f3), class_12682, Float.valueOf(f4), class_17992, Float.valueOf(f5), class_45872, class_45972, n2);
                if (cj.a(null, bl5)) {
                    iw.a();
                    try {
                        ep ep2 = ep.a();
                        bP.a(class_7592, class_7422, Float.valueOf(f2), Float.valueOf(f3), class_12682, Float.valueOf(f4), class_17992, Float.valueOf(f5), class_45872, ep2, n2);
                        ep2.a();
                        aa.a();
                    }
                    finally {
                        iw.b();
                        class_310.method_1551().method_1522().method_1235(false);
                    }
                }
                return;
            }
            if (class_7422.method_31550()) {
                return;
            }
            if (!bl3) {
                class_45872.method_22903();
                cj.a(gu2, class_45872, bl5);
                bP.a(class_7592, class_7422, Float.valueOf(f2), Float.valueOf(f3), class_12682, Float.valueOf(f4), class_17992, Float.valueOf(f5), class_45872, class_45972, n2);
                class_45872.method_22909();
                if (cj.a(gu2, bl5)) {
                    class_45872.method_22903();
                    cj.a(gu2, class_45872, bl5);
                    iw.a();
                    try {
                        ep ep3 = ep.a();
                        bP.a(class_7592, class_7422, Float.valueOf(f2), Float.valueOf(f3), class_12682, Float.valueOf(f4), class_17992, Float.valueOf(f5), class_45872, ep3, n2);
                        ep3.a();
                        aa.a();
                    }
                    finally {
                        iw.b();
                        class_310.method_1551().method_1522().method_1235(false);
                        class_45872.method_22909();
                    }
                }
                return;
            }
            if (class_17992.method_7960() || class_17992.method_57826(class_9334.field_49646)) {
                if (bl2) {
                    class_45872.method_22903();
                }
                if (bl2) {
                    cj.a(gu2, class_45872, bl5);
                }
                bP.a(class_7592, class_7422, Float.valueOf(f2), Float.valueOf(f3), class_12682, Float.valueOf(f4), class_17992, Float.valueOf(f5), class_45872, class_45972, n2);
                if (bl2) {
                    class_45872.method_22909();
                }
                if (cj.a(gu2, bl5)) {
                    if (bl2) {
                        class_45872.method_22903();
                    }
                    if (bl2) {
                        cj.a(gu2, class_45872, bl5);
                    }
                    iw.a();
                    try {
                        ep ep4 = ep.a();
                        bP.a(class_7592, class_7422, Float.valueOf(f2), Float.valueOf(f3), class_12682, Float.valueOf(f4), class_17992, Float.valueOf(f5), class_45872, ep4, n2);
                        ep4.a();
                        aa.a();
                    }
                    finally {
                        iw.b();
                        class_310.method_1551().method_1522().method_1235(false);
                        if (bl2) {
                            class_45872.method_22909();
                        }
                    }
                }
                return;
            }
            class_45872.method_22903();
            try {
                if (bl2) {
                    cj.a(gu2, class_45872, bl5);
                }
                if (class_17992.method_31574(class_1802.field_8399)) {
                    cj.a(class_7422, f2, class_12682, f4, class_17992, f5, class_45872, class_13062, n3, bl4, kI2);
                } else {
                    cj.b(class_7422, f2, class_12682, f4, class_17992, f5, class_45872, class_13062, n3, bl4, kI2);
                }
                class_811 class_8112 = bl5 ? class_811.field_4322 : class_811.field_4321;
                class_7592.method_3233((class_1309)class_7422, class_17992, class_8112, !bl5, class_45872, class_45972, n2);
                if (!cj.a(gu2, bl5)) break block34;
                iw.a();
                try {
                    ep ep5 = ep.a();
                    class_7592.method_3233((class_1309)class_7422, class_17992, class_8112, !bl5, class_45872, (class_4597)ep5, n2);
                    ep5.a();
                    aa.a();
                }
                finally {
                    iw.b();
                    class_310.method_1551().method_1522().method_1235(false);
                }
            }
            finally {
                class_45872.method_22909();
            }
        }
    }
}

