/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_332;
import net.minecraft.class_746;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class je
extends jD {
    private static final int a = 9;
    private static final int b = 3;
    private static final float c = 16.0f;
    private static final float d = 2.0f;
    private static final float e = 20.0f;
    private static final float f = 2.0f;
    private static final float g = 8.0f;
    private static final float h = 4.0f;
    private static final float i = 212.0f;
    private static final float j = 80.0f;
    private static final class_1799[] k = new class_1799[]{new class_1799((class_1935)class_1802.field_8802), new class_1799((class_1935)class_1802.field_8634, 16), new class_1799((class_1935)class_1802.field_8463, 8), new class_1799((class_1935)class_1802.field_8281, 64), new class_1799((class_1935)class_1802.field_8288), new class_1799((class_1935)class_1802.field_8287, 32), new class_1799((class_1935)class_1802.field_8399), new class_1799((class_1935)class_1802.field_8107, 64), new class_1799((class_1935)class_1802.field_8786, 12)};
    private final dw l;
    private final dw m;

    public je() {
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0444", "o", "\u043d"});
        dw2.setDescriptionParts(new String[]{"O", "\u0442", "\u043e", "\u0431", "\u0440", "\u0430", "\u0436", "\u0430", "\u0442", "\u044c", " ", "\u043f", "o", "\u0434", "\u043b", "\u043e", "\u0436", "\u043a", "\u0443", " ", "\u0438", " ", "\u0440", "a", "\u043c", "\u043a", "\u0438", " ", "c", "\u043b", "\u043e", "\u0442", "\u043e", "\u0432", ".", " ", "E", "\u0441", "\u043b", "\u0438", " ", "\u0432", "\u044b", "\u043a", "\u043b", "\u044e", "\u0447", "e", "\u043d", "\u043e", " ", "\u2014", " ", "\u0440", "\u0438", "c", "\u0443", "\u044e", "\u0442", "\u0441", "\u044f", " ", "\u0442", "o", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", "\u044b", "."});
        this.l = dw2;
        dw dw3 = new dw("", "", false);
        dw3.setNameParts(new String[]{"\u0423", "\u0431", "\u0440", "a", "\u0442", "\u044c", " ", "\u043a", "o", "\u043b", "\u043b", "\u0438", "\u0437", "\u0438", "\u044e"});
        dw3.setDescriptionParts(new String[]{"\u0418", "\u043d", "\u0432", "e", "\u043d", "\u0442", "\u0430", "\u0440", "\u044c", " ", "\u043d", "e", " ", "\u0431", "\u0443", "\u0434", "e", "\u0442", " ", "\u0434", "\u0432", "\u0438", "\u0433", "a", "\u0442", "\u044c", "\u0441", "\u044f", " ", "\u0434", "p", "\u0443", "\u0433", "\u0438", "\u043c", "\u0438", " ", "H", "U", "D", "-", "\u044d", "\u043b", "e", "\u043c", "\u0435", "\u043d", "\u0442", "\u0430", "\u043c", "\u0438", " ", "(", "\u043d", "a", "\u043f", "\u0440", "\u0438", "\u043c", "\u0435", "\u0440", ",", " ", "\u0443", "\u0432", "e", "\u0434", "\u043e", "\u043c", "\u043b", "\u0435", "\u043d", "\u0438", "\u044f", "\u043c", "\u0438", ")", " ", "\u0438", " ", "c", "\u0430", "\u043c", " ", "\u043d", "e", " ", "\u0431", "\u0443", "\u0434", "e", "\u0442", " ", "\u0438", "x", " ", "\u0442", "o", "\u043b", "\u043a", "\u0430", "\u0442", "\u044c", "."});
        this.m = dw3;
        this.a(this.l, this.m);
    }

    @Override
    public boolean D() {
        return !this.m.a();
    }

    @Override
    public String e() {
        return "\u0418\u043d\u0432\u0435\u043d\u0442\u043e\u0440\u0439";
    }

    @Override
    public kD b() {
        return kD.CUBE;
    }

    @Override
    public float n() {
        return 80.0f;
    }

    @Override
    public String d() {
        return "inventory";
    }

    private boolean a() {
        class_746 class_7462 = lo.aM.field_1724;
        if (class_7462 == null) {
            return true;
        }
        class_1661 class_16612 = class_7462.method_31548();
        if (class_16612 == null) {
            return true;
        }
        int n2 = Math.min(class_16612.field_7547.size(), 36);
        for (int i2 = 9; i2 < n2; ++i2) {
            class_1799 class_17992 = (class_1799)class_16612.field_7547.get(i2);
            if (class_17992 == null || class_17992.method_7960()) continue;
            return false;
        }
        return true;
    }

    private class_1799 a(int n2, int n3) {
        int n4 = 9 + n3 * 9 + n2;
        class_746 class_7462 = lo.aM.field_1724;
        if (class_7462 == null) {
            return class_1799.field_8037;
        }
        class_1661 class_16612 = class_7462.method_31548();
        if (class_16612 == null || n4 >= class_16612.field_7547.size()) {
            return class_1799.field_8037;
        }
        class_1799 class_17992 = (class_1799)class_16612.field_7547.get(n4);
        return class_17992 != null ? class_17992 : class_1799.field_8037;
    }

    @Override
    protected void a(dd dd2, boolean bl2) {
        dd2.m().a(bl2);
    }

    @Override
    protected boolean a(dd dd2) {
        return dd2.m().a();
    }

    @Override
    public float o() {
        return 80.0f;
    }

    @Override
    public float p() {
        return 212.0f;
    }

    @Override
    protected boolean p() {
        return false;
    }

    @Override
    public float q() {
        return 212.0f;
    }

    @Override
    protected boolean r() {
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void A(float f2, class_332 class_3322, Matrix4f matrix4f, float f3) {
        float f4 = f2 * f3;
        if (f4 <= 0.001f) {
            return;
        }
        float f5 = this.O();
        float f6 = this.P();
        boolean bl2 = this.l.a();
        float f7 = this.A(f4);
        if (bl2) {
            float f8 = f7;
            float f9 = 1.0f;
            float f10 = 1.0f;
            float f11 = 0.0f;
            int n2 = 0x1A000000;
            float f12 = 0.0f;
            int n3 = 0;
            int n4 = gD.background();
            float f13 = 12.0f;
            float f14 = 12.0f;
            float f15 = 12.0f;
            float f16 = 12.0f;
            float f17 = 80.0f;
            float f18 = 212.0f;
            float f19 = f6;
            float f20 = f5;
            Matrix4f matrix4f2 = matrix4f;
            dP.a(f18, n2, n4, f20, f19, f9, f16, f17, f10, matrix4f2, f8, n3, f14, f12, f15, f13, f11);
        }
        boolean bl3 = this.x() && this.a();
        float f21 = 80.0f;
        float f22 = 212.0f;
        float f23 = f6;
        float f24 = f5;
        aM.b(f22, f21, f23, f24);
        try {
            for (int i2 = 0; i2 < 3; ++i2) {
                for (int i3 = 0; i3 < 9; ++i3) {
                    class_1799 class_17992;
                    float f25 = f5 + 8.0f + (float)i3 * 22.0f;
                    float f26 = f6 + 8.0f + (float)i2 * 22.0f;
                    if (bl2) {
                        float f27 = f7;
                        int n5 = gD.elevated();
                        float f28 = 4.0f;
                        float f29 = 20.0f;
                        float f30 = 20.0f;
                        float f31 = f26;
                        float f32 = f25;
                        Matrix4f matrix4f3 = matrix4f;
                        dP.a(f28, f32, n5, matrix4f3, f29, f30, f27, f31);
                    }
                    if (bl3) {
                        v0 = i2 == 0 ? k[i3 % k.length] : class_1799.field_8037;
                    } else {
                        int n6 = i3;
                        int n7 = i2;
                        v0 = class_17992 = this.a(n6, n7);
                    }
                    if (class_17992 == null || class_17992.method_7960()) continue;
                    float f33 = f25 + 2.0f;
                    float f34 = f33;
                    Matrix4f matrix4f4 = matrix4f;
                    float f35 = f4;
                    float f36 = 16.0f;
                    float f37 = f26 + 2.0f;
                    float f38 = f37;
                    class_1799 class_17993 = class_17992;
                    if (!lz.a(f34, matrix4f4, f35, f36, f38, class_17993)) {
                        float f39 = f4;
                        float f40 = 16.0f;
                        float f41 = f37;
                        float f42 = f33;
                        class_1799 class_17994 = class_17992;
                        class_332 class_3323 = class_3322;
                        ir.a(f40, class_17994, f39, f41, f42, class_3323);
                    }
                    class_3322.method_51431(lo.aM.field_1772, class_17992, (int)f33, (int)f37);
                }
            }
        }
        finally {
            aM.b();
        }
    }

    @Override
    public float[] A() {
        return new float[]{20.0f, 200.0f};
    }

    @Override
    public float N() {
        return this.O();
    }

    @Override
    public float M() {
        return 80.0f;
    }

    @Override
    public float L() {
        return 212.0f;
    }
}

