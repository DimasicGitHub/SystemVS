/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.class_1799;
import net.minecraft.class_332;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cl
extends ik {
    private static final float p = 16.0f;
    private static final float q = 8.0f;
    private static final float r = 20.0f;
    private static final float s = 4.0f;
    private static final float t = 6.0f;
    private static final float u = 11.0f;
    private static final float v = 1.5f;
    private static final float w = 5.0f;
    private static final float x = 0.18f;
    private static final float y = 0.65f;
    private static final double z = 3.0;
    private static final String A = "Use Tracker";
    private static final hW<fG> B = new hW(fG.class);
    private final Map<String, class_1799> C = new HashMap<String, class_1799>();
    private final Map<String, Float> D = new HashMap<String, Float>();
    private final Map<String, Double> E = new HashMap<String, Double>();
    private final Map<String, Float> F = new HashMap<String, Float>();
    private final im G = new im();
    private long H = -1L;
    private float I;
    private final G<String> J = new G();
    private final Map<String, ix> K = new HashMap<String, ix>();
    private final ArrayList<i> L = new ArrayList();

    @Override
    public String e() {
        return "\u0423\u0437\u0435\u0422\u0440\u0430\u0441\u043a\u0435\u0440";
    }

    @Override
    protected List b() {
        this.C.put(ix.a.i, ix.a.k);
        this.C.put(ix.h.i, ix.h.k);
        return List.of(new i(ix.a.i, "142s"), new i(ix.h.i, "6.4s"));
    }

    @Override
    protected float b() {
        return 24.0f;
    }

    @Override
    protected boolean b() {
        return true;
    }

    @Override
    protected int b(i i2) {
        float f2;
        Double d2 = this.E.get(i2.a());
        if (d2 == null || d2 > 3.0) {
            return gD.mutedFg();
        }
        float f3 = f2 = 1.0f - (float)Math.clamp((double)(d2 / 3.0), (double)0.0, (double)1.0);
        int n2 = gD.danger();
        int n3 = gD.mutedFg();
        return bC.a(n2, f3, n3);
    }

    @Override
    protected String f() {
        String string = dx.a();
        if (string == null || string.isEmpty()) {
            return A;
        }
        fG fG2 = (fG)B.a();
        return fG2 != null ? fG2.a(string) : string;
    }

    @Override
    protected float d(i i2) {
        return 22.0f;
    }

    @Override
    public String d() {
        return "ut";
    }

    @Override
    protected void a(float f2, Matrix4f matrix4f, float f3, float f4, i i2, float f5, float f6) {
        float f7 = f3 - 6.0f;
        float f8 = f6 + 5.0f + 11.0f + 12.0f;
        float f9 = f2 + -4.0f;
        float f10 = this.A(f5);
        int n2 = gD.elevated();
        float f11 = 4.0f;
        float f12 = 20.0f;
        float f13 = f8;
        float f14 = f9;
        float f15 = f7;
        Matrix4f matrix4f2 = matrix4f;
        dP.a(f11, f15, n2, matrix4f2, f12, f13, f10, f14);
        float f16 = Math.round(f3 + f6 + 5.0f);
        float f17 = Math.round(f2 + 0.5f);
        float f18 = f5;
        int n3 = this.b(i2);
        float f19 = this.a(i2);
        float f20 = 1.5f;
        float f21 = 11.0f;
        float f22 = f17;
        float f23 = f16;
        Matrix4f matrix4f3 = matrix4f;
        dP.a(n3, f22, matrix4f3, f19, f20, f23, f18, f21);
    }

    private float a(i i2) {
        float f2;
        Float f3;
        String string = i2.a();
        Float f4 = this.D.get(string);
        float f5 = f4 == null ? 0.65f : f4.floatValue();
        long l2 = fk.a();
        if (this.H != l2) {
            this.H = l2;
            this.I = this.G.a();
        }
        if ((f3 = this.F.get(string)) == null) {
            f2 = f5;
        } else {
            float f6 = 0.18f;
            float f7 = this.I;
            float f8 = f5;
            float f9 = f3.floatValue();
            f2 = im.a(f8, f9, f7, f6);
        }
        float f10 = f2;
        this.F.put(string, Float.valueOf(f10));
        return f10;
    }

    @Override
    protected boolean a(dd dd2) {
        return dd2.h().a();
    }

    private static String a(double d2) {
        if (d2 < 10.0) {
            return I.a(d2) + "s";
        }
        return (int)d2 + "s";
    }

    @Override
    protected List a() {
        ArrayList<i> arrayList = this.L;
        arrayList.clear();
        Map<String, ix> map = this.K;
        map.clear();
        for (ix ix2 : dx.a()) {
            if (dx.a(ix2) <= 0L) continue;
            map.put(ix2.i, ix2);
        }
        this.J.a(map.keySet(), Comparator.comparingLong(string -> dx.a((ix)((Object)((Object)map.get(string))))));
        for (String string2 : this.J.a()) {
            ix ix3 = map.get(string2);
            double d2 = (double)dx.a(ix3) / 1000.0;
            arrayList.add(new i(string2, cl.a(d2)));
            this.C.put(string2, ix3.k);
            Float f2 = this.D.get(string2);
            if (f2 != null && f2.floatValue() <= 0.001f) {
                this.F.remove(string2);
            }
            this.D.put(string2, Float.valueOf((float)Math.clamp((double)(d2 * 1000.0 / (double)ix3.j), (double)0.0, (double)1.0)));
            this.E.put(string2, d2);
        }
        for (String string3 : this.D.keySet()) {
            if (map.containsKey(string3)) continue;
            this.D.put(string3, Float.valueOf(0.0f));
            this.E.put(string3, 0.0);
        }
        this.a(this.C, this.D, this.E, this.F);
        return arrayList;
    }

    @Override
    protected float a() {
        return Math.max(16.0f, 20.0f);
    }

    @Override
    protected void a(i i2, float f2, float f3, float f4, Matrix4f matrix4f, float f5) {
        class_1799 class_17992 = this.C.get(i2.a());
        if (class_17992 == null || class_17992.method_7960()) {
            return;
        }
        float f6 = f5 + 8.0f;
        Matrix4f matrix4f2 = matrix4f;
        float f7 = f4;
        float f8 = 16.0f;
        float f9 = f2;
        class_1799 class_17993 = class_17992;
        if (lz.a(f6, matrix4f2, f7, f8, f9, class_17993)) {
            return;
        }
        class_332 class_3322 = this.aP;
        if (class_3322 == null) {
            return;
        }
        float f10 = f4;
        float f11 = 16.0f;
        float f12 = f2;
        float f13 = f5 + 8.0f;
        class_1799 class_17994 = class_17992;
        class_332 class_3323 = class_3322;
        ir.a(f11, class_17994, f10, f12, f13, class_3323);
    }

    @Override
    protected void a(dd dd2, boolean bl2) {
        dd2.h().a(bl2);
    }

    @Override
    protected kD a() {
        return kD.USE_TRACKER;
    }

    @Override
    protected boolean q() {
        return true;
    }
}

