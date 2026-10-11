/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1695;
import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_9879;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;

@jB(value=class_4184.class)
public class g {
    private static final hW<gm> a = new hW(gm.class);
    private static final hW<kx> b = new hW(kx.class);
    private static final long c = gy.a(class_4184.class, Boolean.TYPE, 0);
    private static final long d = gy.a(class_4184.class, Boolean.TYPE, 1);
    private static final long e = gy.a(class_4184.class, Float.TYPE, 0);
    private static final long f = gy.a(class_4184.class, Float.TYPE, 1);
    private static final long g = gy.a(class_4184.class, Float.TYPE, 2);
    private static final long h = gy.a(class_4184.class, Float.TYPE, 3);
    private static final long i = gy.a(class_4184.class, Float.TYPE, 4);
    private static final long j = gy.a(class_4184.class, class_1922.class);
    private static final long k = gy.a(class_4184.class, class_1297.class);
    private static final long l = gy.a(class_4184.class, class_243.class);
    private static final long m = gy.a(class_4184.class, class_2338.class_2339.class);
    private static final long n = gy.a(class_4184.class, Vector3f.class, 0);
    private static final long o = gy.a(class_4184.class, Vector3f.class, 1);
    private static final long p = gy.a(class_4184.class, Vector3f.class, 2);
    private static final long q = gy.a(class_4184.class, Quaternionf.class);
    private static final Method r = jc.a(class_4184.class, 3);

    private static float b(class_4184 class_41842, float f2) {
        try {
            return ((Float)r.invoke(class_41842, Float.valueOf(f2))).floatValue();
        }
        catch (Exception exception) {
            return f2;
        }
    }

    private static void a(class_4184 class_41842, class_243 class_2432) {
        hW.a.putObject(class_41842, l, class_2432);
        class_2338.class_2339 class_23392 = (class_2338.class_2339)gy.a(class_41842, m);
        class_23392.method_10102(class_2432.field_1352, class_2432.field_1351, class_2432.field_1350);
    }

    private static void a(class_4184 class_41842, float f2, float f3, float f4) {
        Quaternionf quaternionf = (Quaternionf)gy.a(class_41842, q);
        Vector3f vector3f = new Vector3f(f4, f3, -f2).rotate((Quaternionfc)quaternionf);
        class_243 class_2432 = (class_243)gy.a(class_41842, l);
        g.a(class_41842, new class_243(class_2432.field_1352 + (double)vector3f.x, class_2432.field_1351 + (double)vector3f.y, class_2432.field_1350 + (double)vector3f.z));
    }

    @hz(method="method_19318", desc="(F)F", at=iD.REPLACE)
    public static float a(class_4184 class_41842, float f2) {
        gm gm2 = (gm)a.a();
        if (gm2 == null) {
            return bP.a(class_41842, Float.valueOf(f2));
        }
        return gm2.a() * f2 / 4.0f;
    }

    private static void a(class_4184 class_41842, float f2, float f3) {
        hW.a.putFloat(class_41842, e, f3);
        hW.a.putFloat(class_41842, f, f2);
        Quaternionf quaternionf = (Quaternionf)gy.a(class_41842, q);
        quaternionf.rotationYXZ((float)Math.PI - f2 * ((float)Math.PI / 180), -f3 * ((float)Math.PI / 180), 0.0f);
        Vector3f vector3f = (Vector3f)gy.a(class_41842, n);
        Vector3f vector3f2 = (Vector3f)gy.a(class_41842, o);
        Vector3f vector3f3 = (Vector3f)gy.a(class_41842, p);
        new Vector3f(0.0f, 0.0f, -1.0f).rotate((Quaternionfc)quaternionf, vector3f);
        new Vector3f(0.0f, 1.0f, 0.0f).rotate((Quaternionfc)quaternionf, vector3f2);
        new Vector3f(-1.0f, 0.0f, 0.0f).rotate((Quaternionfc)quaternionf, vector3f3);
    }

    @hz(method="method_19321", desc="(Lnet/minecraft/class_1922;Lnet/minecraft/class_1297;ZZF)V", at=iD.REPLACE)
    public static void a(class_4184 class_41842, class_1922 class_19222, class_1297 class_12972, boolean bl2, boolean bl3, float f2) {
        class_243 class_2432;
        class_9879 class_98792;
        class_1695 class_16952;
        class_1297 class_12973;
        kx kx2 = (kx)b.a();
        if (kx2 == null || !kx2.a()) {
            bP.a(class_41842, class_19222, class_12972, bl2, bl3, Float.valueOf(f2));
            return;
        }
        hW.a.putBoolean(class_41842, c, true);
        hW.a.putObject(class_41842, j, class_19222);
        hW.a.putObject(class_41842, k, class_12972);
        hW.a.putBoolean(class_41842, d, bl2);
        hW.a.putFloat(class_41842, i, f2);
        float f3 = class_3532.method_16439((float)f2, (float)hW.a.getFloat(class_41842, h), (float)hW.a.getFloat(class_41842, g));
        if (class_12972.method_5765() && (class_12973 = class_12972.method_5854()) instanceof class_1695 && (class_12973 = (class_16952 = (class_1695)class_12973).method_61569()) instanceof class_9879 && (class_98792 = (class_9879)class_12973).method_61614()) {
            class_12973 = class_16952.method_52538(class_12972).method_1020(class_16952.method_19538()).method_1020(class_12972.method_55668((class_1297)class_16952)).method_1019(new class_243(0.0, (double)f3, 0.0));
            class_2432 = class_98792.method_61610(f2).method_1019((class_243)class_12973);
        } else {
            class_2432 = new class_243(class_3532.method_16436((double)f2, (double)class_12972.field_6014, (double)class_12972.method_23317()), class_3532.method_16436((double)f2, (double)class_12972.field_6036, (double)class_12972.method_23318()) + (double)f3, class_3532.method_16436((double)f2, (double)class_12972.field_5969, (double)class_12972.method_23321()));
        }
        g.a(class_41842, kx2.a(), kx2.b());
        g.a(class_41842, class_2432);
        if (bl2) {
            float f4;
            if (bl3) {
                g.a(class_41842, class_41842.method_19330() + 180.0f, -class_41842.method_19329());
            }
            if (class_12972 instanceof class_1309) {
                class_12973 = (class_1309)class_12972;
                f4 = class_12973.method_55693();
            } else {
                f4 = 1.0f;
            }
            float f5 = f4;
            g.a(class_41842, -g.b(class_41842, 4.0f * f5), 0.0f, 0.0f);
        } else if (class_12972 instanceof class_1309 && (class_16952 = (class_1309)class_12972).method_6113()) {
            class_98792 = class_16952.method_18401();
            g.a(class_41842, class_98792 != null ? class_98792.method_10144() - 180.0f : 0.0f, 0.0f);
            g.a(class_41842, 0.0f, 0.3f, 0.0f);
        }
    }
}

