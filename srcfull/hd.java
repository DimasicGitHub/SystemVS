/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;
import net.minecraft.class_1306;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1921;
import net.minecraft.class_1935;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_4061;
import net.minecraft.class_746;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class hd
extends jD {
    private static final float a = 24.0f;
    private static final float b = 8.0f;
    private static final float c = 8.0f;
    private static final float d = 8.0f;
    private static final float e = 8.0f;
    private static final float f = 4.0f;
    private static final float g = 6.0f;
    private static final float h = 14.0f;
    private static final float i = 40.0f;
    private static final float j = 0.06f;
    private static final float k = 0.05f;
    private static final float l = 0.07f;
    private static final float m = 0.06f;
    private static final float n = 0.05f;
    private static final float o = 12.0f;
    private static final float p = 0.002f;
    private static final float q = 68.0f;
    private static final float r = 8.0f;
    private static final float s = 8.0f;
    private static final float t = 8.0f;
    private static final float u = 10.0f;
    private static final float v = 0.001f;
    private static final int w = 4;
    private static final class_2960 x = class_2960.method_60656((String)"hud/hotbar");
    private static final int y = 20;
    private static final int z = 22;
    private static final int A = 22;
    private static final int B = 16;
    private static final int C = 3;
    private static final int D = 182;
    private static final int E = 22;
    private static final int F = 3;
    private static final int G = 98;
    private static final int H = 29;
    private static final int I = 23;
    private static final int J = 5;
    private static final float K = 0.05f;
    private static final float L = 1.2f;
    private static final int M = 0xFF3030;
    private static final int N = 112;
    private static final class_2960[] O = new class_2960[]{class_2960.method_60656((String)"container/slot/boots"), class_2960.method_60656((String)"container/slot/leggings"), class_2960.method_60656((String)"container/slot/chestplate"), class_2960.method_60656((String)"container/slot/helmet")};
    private static final float P = 16.0f;
    private static final float Q = 96.0f;
    private static final float R = 36.0f;
    private static final float S = 18.0f;
    private static final float T = 24.0f;
    private static final int U = 17;
    private static final int V = 4;
    private static final class_1799[] W = new class_1799[]{new class_1799((class_1935)class_1802.field_8285), new class_1799((class_1935)class_1802.field_8348), new class_1799((class_1935)class_1802.field_8058), new class_1799((class_1935)class_1802.field_8805)};
    private final jW[] X = new jW[4];
    private final im Y = new im();
    private static final String bf = "\u041f\u043ba\u0448\u043a\u0430";
    private static final String bg = "\u0423 \u0438\u043d\u0432e\u043d\u0442\u0430\u0440\u044f";
    private static final String bh = "Ba\u043d\u0438\u043b\u044c\u043d\u044b\u0439";
    private final jh bi;
    private final hO bj;
    private final hO bk;
    private final hO bl;
    private final dw bm;
    private final dw bn;
    private float bo;
    private float bp;
    private float bq;
    private long bs;

    public hd() {
        jh jh2 = new jh("", "", Arrays.asList(ec.join(new String[]{"\u041f", "\u043b", "a", "\u0448", "\u043a", "\u0430"}), ec.join(new String[]{"\u0423", " ", "\u0438", "\u043d", "\u0432", "e", "\u043d", "\u0442", "\u0430", "\u0440", "\u044f"}), ec.join(new String[]{"B", "a", "\u043d", "\u0438", "\u043b", "\u044c", "\u043d", "\u044b", "\u0439"})), List.of(ec.join(new String[]{"\u041f", "\u043b", "a", "\u0448", "\u043a", "\u0430"})), false);
        jh2.setNameParts(new String[]{"\u0420", "e", "\u0436", "\u0438", "\u043c"});
        jh2.setDescriptionParts(new String[]{"\u041f", "\u043b", "a", "\u0448", "\u043a", "\u0430", " ", "\u2014", " ", "c", "\u0432", "\u043e", "\u044f", " ", "\u043f", "e", "\u0440", "\u0435", "\u0442", "\u0430", "\u0441", "\u043a", "\u0438", "\u0432", "\u0430", "\u0435", "\u043c", "\u0430", "\u044f", " ", "\u043f", "a", "\u043d", "\u0435", "\u043b", "\u044c", ".", " ", "\u0423", " ", "\u0438", "\u043d", "\u0432", "e", "\u043d", "\u0442", "\u0430", "\u0440", "\u044f", " ", "\u2014", " ", "\u0438", "\u043a", "o", "\u043d", "\u043a", "\u0438", " ", "\u043f", "o", " ", "\u043a", "\u0440", "a", "\u044f", "\u043c", " ", "\u0445", "o", "\u0442", "\u0431", "\u0430", "\u0440", "\u0430", ".", " ", "B", "a", "\u043d", "\u0438", "\u043b", "\u044c", "\u043d", "\u044b", "\u0439", " ", "\u2014", " ", "\u043f", "o", "\u043b", "\u043e", "\u0441", "\u0430", " ", "\u043a", "a", "\u043a", " ", "\u0445", "o", "\u0442", "\u0431", "\u0430", "\u0440", ",", " ", "\u0432", "\u043f", "\u043b", "o", "\u0442", "\u043d", "\u0443", "\u044e", " ", "\u043a", " ", "\u043d", "e", "\u043c", "\u0443", "."});
        this.bi = jh2;
        hO hO2 = new hO("", "", new cF("\u0413o\u0440\u0438\u0437\u043e\u043d\u0442\u0430\u043b\u044c", kD.ORIENT_HORIZONTAL), new cF("\u0412e\u0440\u0442\u0438\u043a\u0430\u043b\u044c", kD.ORIENT_VERTICAL), false);
        hO2.setNameParts(new String[]{"O", "\u0440", "\u0438", "\u0435", "\u043d", "\u0442", "\u0430", "\u0446", "\u0438", "\u044f"});
        hO2.setDescriptionParts(new String[]{"\u0420", "a", "\u0441", "\u043f", "\u043e", "\u043b", "\u043e", "\u0436", "\u0435", "\u043d", "\u0438", "\u0435", " ", "\u044d", "\u043b", "e", "\u043c", "\u0435", "\u043d", "\u0442", "\u043e", "\u0432", " ", "\u0431", "\u0440", "o", "\u043d", "\u0438", ":", " ", "\u0433", "o", "\u0440", "\u0438", "\u0437", "\u043e", "\u043d", "\u0442", "\u0430", "\u043b", "\u044c", "\u043d", "\u043e", " ", "\u0438", "\u043b", "\u0438", " ", "\u0432", "e", "\u0440", "\u0442", "\u0438", "\u043a", "\u0430", "\u043b", "\u044c", "\u043d", "\u043e", "."});
        this.bj = hO2;
        hO hO3 = new hO("", "", new cF("C\u043b\u0435\u0432\u0430", kD.ARROW_LEFT), new cF("C\u043f\u0440\u0430\u0432\u0430", kD.ARROW_RIGHT), true);
        hO3.setNameParts(new String[]{"C", "\u0442", "\u043e", "\u0440", "\u043e", "\u043d", "\u0430", " ", "\u043f", "\u0440", "o", "\u0447", "\u043d", "\u043e", "\u0441", "\u0442", "\u0438"});
        hO3.setDescriptionParts(new String[]{"C", " ", "\u043a", "a", "\u043a", "\u043e", "\u0439", " ", "c", "\u0442", "\u043e", "\u0440", "\u043e", "\u043d", "\u044b", " ", "o", "\u0442", " ", "\u0438", "\u043a", "o", "\u043d", "\u043a", "\u0438", " ", "o", "\u0442", "\u043e", "\u0431", "\u0440", "\u0430", "\u0436", "\u0430", "\u0442", "\u044c", " ", "\u0442", "e", "\u043a", "\u0441", "\u0442", " ", "\u043f", "\u0440", "o", "\u0447", "\u043d", "\u043e", "\u0441", "\u0442", "\u0438", "."});
        this.bk = hO3;
        hO hO4 = new hO("", "", new cF("C\u043b\u0435\u0432\u0430", kD.ARROW_LEFT), new cF("C\u043f\u0440\u0430\u0432\u0430", kD.ARROW_RIGHT), false);
        hO4.setNameParts(new String[]{"C", "\u0442", "\u043e", "\u0440", "\u043e", "\u043d", "\u0430", " ", "\u0445", "o", "\u0442", "\u0431", "\u0430", "\u0440", "\u0430"});
        hO4.setDescriptionParts(new String[]{"C", " ", "\u043a", "a", "\u043a", "\u043e", "\u0439", " ", "c", "\u0442", "\u043e", "\u0440", "\u043e", "\u043d", "\u044b", " ", "o", "\u0442", " ", "\u0445", "o", "\u0442", "\u0431", "\u0430", "\u0440", "\u0430", " ", "c", "\u0442", "\u0430", "\u0432", "\u0438", "\u0442", "\u044c", " ", "\u043f", "o", "\u043b", "\u043e", "\u0441", "\u0443", "."});
        this.bl = hO4;
        dw dw2 = new dw("", "", false);
        dw2.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u043f", "o", " ", "\u043f", "\u0440", "o", "\u0447", "\u043d", "\u043e", "\u0441", "\u0442", "\u0438"});
        dw2.setDescriptionParts(new String[]{"O", "\u043a", "\u0440", "\u0430", "\u0448", "\u0438", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0447", "\u0438", "c", "\u043b", "\u043e", " ", "\u043f", "\u0440", "o", "\u0447", "\u043d", "\u043e", "\u0441", "\u0442", "\u0438", " ", "o", "\u0442", " ", "\u0431", "e", "\u043b", "\u043e", "\u0433", "\u043e", " ", "(", "1", "0", "0", "%", ")", " ", "\u043a", " ", "\u0442", "\u0451", "\u043c", "\u043d", "o", "-", "\u043a", "\u0440", "a", "\u0441", "\u043d", "\u043e", "\u043c", "\u0443", " ", "(", "\u043d", "\u0438", "\u0437", "\u043a", "a", "\u044f", ")", "."});
        this.bm = dw2;
        dw dw3 = new dw("", "", true);
        dw3.setNameParts(new String[]{"\u041f", "\u0440", "e", "\u0434", "\u0443", "\u043f", "\u0440", "\u0435", "\u0436", "\u0434", "\u0435", "\u043d", "\u0438", "\u0435", " ", "o", " ", "\u043f", "\u0440", "o", "\u0447", "\u043d", "\u043e", "\u0441", "\u0442", "\u0438"});
        dw3.setDescriptionParts(new String[]{"\u041f", "o", "\u0434", "c", "\u0432", "\u0435", "\u0447", "\u0438", "\u0432", "\u0430", "\u0442", "\u044c", " ", "c", "\u043b", "\u043e", "\u0442", ",", " ", "\u043a", "o", "\u0433", "\u0434", "\u0430", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", " ", "\u043f", "o", "\u0447", "\u0442", "\u0438", " ", "c", "\u043b", "\u043e", "\u043c", "\u0430", "\u043d", "."});
        this.bn = dw3;
        this.bo = -1.0f;
        this.bp = -1.0f;
        this.bq = -1.0f;
        this.bs = -1L;
        for (int i2 = 0; i2 < 4; ++i2) {
            this.X[i2] = new jW(i2);
        }
        this.bj.a(this::d);
        this.bk.a(this::d);
        this.A().a(this::d);
        this.bm.a(() -> !this.e());
        this.bl.a(this::e);
        this.bn.a(this::e);
        this.a(this.bi, this.bj, this.bk, this.bm, this.bl, this.bn);
    }

    @Override
    public boolean D() {
        return !this.c() && !this.e();
    }

    private boolean e() {
        return this.bi.b(bh);
    }

    private float e() {
        return this.j() + this.f() - this.i();
    }

    @Override
    public String e() {
        return "\u0410\u0440\u043c\u043e\u0440";
    }

    private float i() {
        return this.h() - this.a(36.0f);
    }

    @Override
    public kD b() {
        return kD.ARMOR_HUD;
    }

    private float b() {
        float f2 = this.a();
        if (f2 < 0.001f) {
            return 0.0f;
        }
        return 16.0f * f2 + this.a(false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b(class_332 class_3322, float f2) {
        float f3 = jX.c();
        if (f3 <= 0.0f) {
            f3 = 1.0f;
        }
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_22905(1.0f / f3, 1.0f / f3, 1.0f);
        try {
            int n2 = lo.aM.method_22683().method_4486() / 2;
            int n3 = lo.aM.method_22683().method_4502();
            int n4 = n2 - 96 - 16;
            int n5 = n2 + 96;
            int n6 = n3 - 36;
            int n7 = n3 - 18;
            float f4 = f2;
            boolean bl2 = false;
            int n8 = n6;
            int n9 = n4;
            jW jW2 = this.X[3];
            class_332 class_3323 = class_3322;
            this.a(jW2, class_3323, n9, bl2, f4, n8);
            float f5 = f2;
            boolean bl3 = false;
            int n10 = n7;
            int n11 = n4;
            jW jW3 = this.X[2];
            class_332 class_3324 = class_3322;
            this.a(jW3, class_3324, n11, bl3, f5, n10);
            float f6 = f2;
            boolean bl4 = true;
            int n12 = n6;
            int n13 = n5;
            jW jW4 = this.X[1];
            class_332 class_3325 = class_3322;
            this.a(jW4, class_3325, n13, bl4, f6, n12);
            float f7 = f2;
            boolean bl5 = true;
            int n14 = n7;
            int n15 = n5;
            jW jW5 = this.X[0];
            class_332 class_3326 = class_3322;
            this.a(jW5, class_3326, n15, bl5, f7, n14);
        }
        finally {
            class_3322.method_51448().method_22909();
        }
    }

    private int b() {
        int n2 = this.a();
        return n2 <= 0 ? 0 : 22 + (n2 - 1) * 20;
    }

    private boolean b() {
        return this.bj.a();
    }

    @Override
    public float s() {
        return this.c() || this.e() ? 1.0f : super.s();
    }

    private int c() {
        int n2 = lo.aM.method_22683().method_4486() / 2;
        boolean bl2 = this.f();
        int n3 = 98 + this.a(bl2);
        return bl2 ? n2 - n3 - this.b() : n2 + n3;
    }

    private float c() {
        if (this.a() < 0.001f) {
            return 0.0f;
        }
        return 16.0f + this.a(true);
    }

    private boolean c() {
        return this.bi.b(bg);
    }

    @Override
    public float n() {
        this.a();
        float f2 = this.bq;
        float f3 = this.c();
        float f4 = 40.0f;
        return hd.a(f2, f4, f3);
    }

    private float h() {
        fk fk2 = fk.a();
        return fk2 != null ? fk2.b() : 1080.0f;
    }

    private float f() {
        return this.a(16.0f);
    }

    private boolean f() {
        return !this.bl.a();
    }

    private float l() {
        return this.g() + this.a(96.0f);
    }

    @Override
    public String d() {
        return "armor";
    }

    private int d() {
        return lo.aM.method_22683().method_4502() - 22;
    }

    private boolean d() {
        return this.bi.b(bf);
    }

    private float d() {
        return this.l() + this.f() - this.k();
    }

    private void a(jW jW2, class_332 class_3322, int n2, boolean bl2, float f2, int n3) {
        float f3 = f2 * jW2.f * jW2.g;
        if (f3 <= 0.001f) {
            return;
        }
        if (jW2.b != null && !jW2.b.method_7960()) {
            float f4 = f3;
            float f5 = 16.0f;
            float f6 = n3;
            float f7 = n2;
            class_1799 class_17992 = jW2.b;
            class_332 class_3323 = class_3322;
            ir.a(f5, class_17992, f4, f6, f7, class_3323);
        }
        if (jW2.c.isEmpty()) {
            return;
        }
        int n4 = Math.round(Math.clamp((float)f3, (float)0.0f, (float)1.0f) * 255.0f);
        if (n4 <= 3) {
            return;
        }
        int n5 = this.bm.a() ? hd.a(jW2.b) : -1;
        int n6 = n5 & 0xFFFFFF | n4 << 24;
        int n7 = n3 + 4;
        int n8 = bl2 ? n2 + 17 : n2 - 1 - lo.aM.field_1772.method_1727(jW2.c);
        class_3322.method_51433(lo.aM.field_1772, jW2.c, n8, n7, n6, true);
    }

    private float a(float f2) {
        int n2 = lo.aM.method_22683().method_4486();
        if (n2 <= 0) {
            return f2;
        }
        fk fk2 = fk.a();
        float f3 = fk2 != null ? fk2.a() : 1920.0f;
        return f2 * f3 / (float)n2;
    }

    @Override
    public void a(float f2, float f3) {
        if (this.e()) {
            super.a(this.a((float)this.c()), this.a((float)this.d()));
        } else if (this.c()) {
            super.a(this.k(), this.i());
        } else {
            super.a(f2, f3);
        }
    }

    private static boolean a(class_1799 class_17992) {
        if (class_17992 == null || class_17992.method_7960() || !class_17992.method_7963() || class_17992.method_7936() <= 0) {
            return false;
        }
        int n2 = class_17992.method_7936() - class_17992.method_7919();
        return n2 <= 5 || (float)n2 <= (float)class_17992.method_7936() * 0.05f;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(class_332 class_3322, float f2) {
        int n2 = this.a();
        if (n2 <= 0) {
            return;
        }
        float f3 = jX.c();
        if (f3 <= 0.0f) {
            f3 = 1.0f;
        }
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_22905(1.0f / f3, 1.0f / f3, 1.0f);
        try {
            int n3 = 22 + (n2 - 1) * 20;
            int n4 = this.c();
            int n5 = this.d();
            class_3322.method_52708(class_1921::method_62277, x, 182, 22, 0, 0, n4, n5, n3 - 3, 22);
            class_3322.method_52708(class_1921::method_62277, x, 182, 22, 179, 0, n4 + n3 - 3, n5, 3, 22);
            float f4 = hd.m();
            int n6 = 0;
            for (int i2 = 3; i2 >= 0; --i2) {
                jW jW2 = this.X[i2];
                if (!jW2.h) continue;
                int n7 = n4 + n6 * 20;
                int n8 = n7 + 3;
                int n9 = n5 + 3;
                class_1799 class_17992 = jW2.b;
                if (class_17992 == null || class_17992.method_7960()) {
                    class_3322.method_52706(class_1921::method_62277, O[i2], n8, n9, 16, 16);
                } else {
                    int n10;
                    if (this.bn.a() && hd.a(class_17992) && (n10 = Math.round(112.0f * f4 * Math.clamp((float)f2, (float)0.0f, (float)1.0f))) > 3) {
                        class_3322.method_25294(n7 + 1, n5 + 1, n7 + 20 + 1, n5 + 22 - 1, n10 << 24 | 0xFF3030);
                    }
                    float f5 = f2;
                    float f6 = 16.0f;
                    float f7 = n9;
                    float f8 = n8;
                    class_1799 class_17993 = class_17992;
                    class_332 class_3323 = class_3322;
                    ir.a(f6, class_17993, f5, f7, f8, class_3323);
                    class_3322.method_51431(lo.aM.field_1772, class_17992, n8, n9);
                }
                ++n6;
            }
        }
        finally {
            class_3322.method_51448().method_22909();
        }
    }

    private boolean a() {
        return this.bk.a();
    }

    @Override
    protected void a(dd dd2, boolean bl2) {
        dd2.e().a(bl2);
    }

    private static int a(class_1799 class_17992) {
        int n2 = gD.foreground();
        if (class_17992 == null || class_17992.method_7960() || !class_17992.method_7963() || class_17992.method_7936() <= 0) {
            return n2;
        }
        float f2 = 1.0f - (float)class_17992.method_7919() / (float)class_17992.method_7936();
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        int n3 = gD.success();
        int n4 = gD.warning();
        int n5 = gD.caution();
        int n6 = gD.danger();
        if (f2 >= 0.75f) {
            float f3 = (f2 - 0.75f) / 0.25f;
            int n7 = n2;
            int n8 = n3;
            return bC.a(n7, f3, n8);
        }
        if (f2 >= 0.5f) {
            float f4 = (f2 - 0.5f) / 0.25f;
            int n9 = n3;
            int n10 = n4;
            return bC.a(n9, f4, n10);
        }
        if (f2 >= 0.2f) {
            float f5 = (f2 - 0.2f) / 0.3f;
            int n11 = n4;
            int n12 = n5;
            return bC.a(n11, f5, n12);
        }
        if (f2 >= 0.08f) {
            return n5;
        }
        float f6 = f2 / 0.08f;
        int n13 = n5;
        int n14 = n6;
        return bC.a(n13, f6, n14);
    }

    private void a(float f2, float f3, float f4, float f5, float f6, class_332 class_3322, float f7, Matrix4f matrix4f, jW jW2) {
        float f8;
        class_1799 class_17992;
        float f9;
        float f10;
        float f11;
        float f12;
        Matrix4f matrix4f2;
        float f13;
        float f14 = f7 * jW2.f;
        if (f14 <= 0.001f) {
            return;
        }
        ao.c();
        float f15 = jW2.g;
        float f16 = hd.a(jW2.a);
        float f17 = jW2.d * f15;
        float f18 = f3;
        float f19 = f6;
        float f20 = f6 + f17 + 4.0f + f16;
        float f21 = hd.a(f18, f20, f19);
        float f22 = f3;
        float f23 = f6 + 24.0f + 4.0f + f16;
        float f24 = f6;
        float f25 = hd.a(f22, f24, f23);
        float f26 = f3;
        float f27 = this.O() + 8.0f;
        float f28 = this.O() + f4 - 8.0f - 24.0f;
        float f29 = hd.a(f26, f28, f27);
        float f30 = f3;
        float f31 = this.O() + f4 - 8.0f - jW2.d;
        float f32 = this.O() + 8.0f;
        float f33 = hd.a(f30, f32, f31);
        float f34 = f2;
        float f35 = f29;
        float f36 = f21;
        float f37 = hd.a(f34, f36, f35);
        float f38 = f2;
        float f39 = f5;
        float f40 = this.P() + 8.0f + 1.0f;
        float f41 = hd.a(f38, f40, f39);
        if (f15 > 0.001f && jW2.b != null && !jW2.b.method_7960() && !lz.a(f13 = f37, matrix4f2 = matrix4f, f12 = (f11 = f14 * f15), f10 = 24.0f, f9 = f41, class_17992 = jW2.b)) {
            float f42 = f11;
            float f43 = 24.0f;
            float f44 = f41;
            float f45 = f37;
            class_1799 class_17993 = jW2.b;
            class_332 class_3323 = class_3322;
            ir.a(f43, class_17993, f42, f44, f45, class_3323);
        }
        if (f15 < 0.999f) {
            f11 = f37 + 6.0f;
            f8 = f41 + 6.0f;
            float f46 = f14 * (1.0f - f15);
            int n2 = gD.border();
            float f47 = 12.0f;
            float f48 = f8;
            float f49 = f11;
            kD kD2 = kD.CLOSE;
            Matrix4f matrix4f3 = matrix4f;
            jr.a(f48, kD2, n2, matrix4f3, f46, f47, f49);
        }
        if (f15 > 0.001f && !jW2.c.isEmpty()) {
            float f50 = f2;
            float f51 = f33;
            float f52 = f25;
            f11 = hd.a(f50, f52, f51);
            float f53 = f2;
            float f54 = f5 + 5.0f;
            float f55 = this.P() + 13.0f;
            f8 = hd.a(f53, f55, f54);
            int n3 = this.bm.a() ? hd.a(jW2.b) : gD.foreground();
            float f56 = f14 * f15;
            int n4 = n3;
            float f57 = 14.0f;
            float f58 = f8;
            float f59 = f11;
            String string = jW2.c;
            Matrix4f matrix4f4 = matrix4f;
            ao.a(f58, f59, n4, f57, f56, string, matrix4f4);
        }
    }

    private class_1799 a(int n2) {
        class_1799 class_17992;
        class_746 class_7462 = lo.aM.field_1724;
        class_1799 class_17993 = class_17992 = class_7462 != null ? class_7462.method_31548().method_7372(n2) : null;
        if ((class_17992 == null || class_17992.method_7960()) && this.x()) {
            return W[n2].method_7972();
        }
        return class_17992 != null ? class_17992 : class_1799.field_8037;
    }

    private static float a(int n2) {
        return n2 == 3 ? -4.0f : -2.0f;
    }

    private int a() {
        this.a();
        int n2 = 0;
        for (jW jW2 : this.X) {
            if (!jW2.h) continue;
            ++n2;
        }
        return n2;
    }

    private int a(boolean bl2) {
        boolean bl3;
        boolean bl4;
        class_746 class_7462 = lo.aM.field_1724;
        if (class_7462 == null) {
            return 0;
        }
        class_1306 class_13062 = class_7462.method_6068().method_5928();
        boolean bl5 = bl4 = class_13062 == class_1306.field_6182;
        if (!class_7462.method_6079().method_7960() && bl4 == bl2) {
            return 29;
        }
        boolean bl6 = bl3 = !bl4;
        if (lo.aM.field_1690 != null && lo.aM.field_1690.method_42565().method_41753() == class_4061.field_18153 && bl3 == bl2) {
            return 23;
        }
        return 0;
    }

    @Override
    protected boolean a(dd dd2) {
        return dd2.e().a();
    }

    private static float a(float f2, float f3, float f4) {
        return f3 + (f4 - f3) * f2;
    }

    private float a() {
        float f2 = 0.0f;
        for (jW jW2 : this.X) {
            if (!(jW2.f > f2)) continue;
            f2 = jW2.f;
        }
        return f2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(float f2, class_332 class_3322, float f3, Matrix4f matrix4f) {
        float f4 = this.bq;
        float f5 = this.bp;
        float f6 = this.bo;
        float f7 = this.b();
        float f8 = this.c();
        float f9 = f4;
        float f10 = f6;
        float f11 = f7;
        float f12 = hd.a(f9, f11, f10);
        float f13 = f4;
        float f14 = f8;
        float f15 = 40.0f;
        float f16 = hd.a(f13, f15, f14);
        float f17 = this.A(f3) * f2;
        if (f12 <= 0.5f || f16 <= 0.5f) {
            return;
        }
        if (f17 > 0.001f) {
            float f18 = f17;
            float f19 = 1.0f;
            float f20 = 1.0f;
            float f21 = 0.0f;
            int n2 = 0x1A000000;
            float f22 = 0.0f;
            int n3 = 0;
            int n4 = gD.background();
            float f23 = 12.0f;
            float f24 = 12.0f;
            float f25 = 12.0f;
            float f26 = 12.0f;
            float f27 = f16;
            float f28 = f12;
            float f29 = this.P();
            float f30 = this.O();
            Matrix4f matrix4f2 = matrix4f;
            dP.a(f28, n2, n4, f30, f29, f19, f26, f27, f20, matrix4f2, f18, n3, f24, f22, f25, f23, f21);
        }
        float f31 = f16;
        float f32 = f12;
        float f33 = this.P();
        float f34 = this.O();
        aM.b(f32, f31, f33, f34);
        try {
            float f35 = this.O() + 8.0f * f2;
            float f36 = this.P() + 8.0f;
            boolean bl2 = true;
            boolean bl3 = true;
            for (int i2 = 3; i2 >= 0; --i2) {
                jW jW2 = this.X[i2];
                if (jW2.f < 0.001f) continue;
                if (!bl2) {
                    f35 += 6.0f * jW2.f;
                }
                if (!bl3) {
                    f36 += 10.0f * jW2.f;
                }
                bl2 = false;
                bl3 = false;
                float f37 = f3;
                float f38 = f5;
                float f39 = f4;
                float f40 = f6;
                float f41 = f36;
                float f42 = f35;
                jW jW3 = jW2;
                Matrix4f matrix4f3 = matrix4f;
                class_332 class_3323 = class_3322;
                this.a(f39, f38, f40, f41, f42, class_3323, f37, matrix4f3, jW3);
                f35 += jW2.a() * jW2.f;
                f36 += 24.0f * jW2.f;
            }
        }
        finally {
            aM.b();
        }
    }

    private float a(boolean bl2) {
        float f2 = 0.0f;
        boolean bl3 = true;
        for (int i2 = 3; i2 >= 0; --i2) {
            float f3;
            jW jW2 = this.X[i2];
            if (jW2.f < 0.001f) continue;
            float f4 = f3 = bl2 ? 24.0f : jW2.a();
            float f5 = bl3 ? 0.0f : (bl2 ? 10.0f : 6.0f);
            f2 += (f3 + f5) * jW2.f;
            bl3 = false;
        }
        return f2;
    }

    private static String a(class_1799 class_17992) {
        if (class_17992.method_7963()) {
            return Integer.toString(class_17992.method_7936() - class_17992.method_7919());
        }
        return Integer.toString(class_17992.method_7947());
    }

    private void a() {
        long l2 = fk.a();
        if (this.bs == l2) {
            return;
        }
        this.bs = l2;
        float f2 = this.Y.a();
        boolean bl2 = this.s();
        boolean bl3 = !this.y() || this.x();
        for (jW jW2 : this.X) {
            class_1799 class_17992 = this.a(jW2.a);
            if (class_17992 == null) {
                class_17992 = class_1799.field_8037;
            }
            boolean bl4 = !class_17992.method_7960();
            boolean bl5 = jW2.h = bl2 && (bl4 || bl3);
            if (bl4) {
                jW2.b = class_17992.method_7972();
                jW2.c = hd.a(jW2.b);
                jW2.d = ao.a(jW2.c, 14.0f);
                jW2.e = 28.0f + jW2.d;
            }
            float f3 = jW2.h ? 1.0f : 0.0f;
            float f4 = 0.06f;
            float f5 = f2;
            float f6 = f3;
            float f7 = jW2.f;
            jW2.f = im.a(f6, f7, f5, f4);
            float f8 = bl4 ? 1.0f : 0.0f;
            float f9 = 0.05f;
            float f10 = f2;
            float f11 = f8;
            float f12 = jW2.g;
            jW2.g = im.a(f11, f12, f10, f9);
            if (jW2.h || !(jW2.f < 0.002f)) continue;
            jW2.f = 0.0f;
            jW2.g = 0.0f;
            jW2.b = class_1799.field_8037;
            jW2.c = "";
            jW2.d = 0.0f;
            jW2.e = 24.0f;
        }
        float f13 = 0.06f;
        float f14 = f2;
        float f15 = this.a() ? 1.0f : 0.0f;
        float f16 = this.bp;
        this.bp = im.b(f15, f14, f16, f13);
        float f17 = 0.07f;
        float f18 = f2;
        float f19 = this.b() ? 1.0f : 0.0f;
        float f20 = this.bq;
        this.bq = im.b(f19, f18, f20, f17);
        float f21 = this.g() ? 68.0f : 40.0f;
        float f22 = 0.05f;
        float f23 = f2;
        float f24 = f21;
        float f25 = this.bo;
        this.bo = im.b(f24, f23, f25, f22);
    }

    private static float m() {
        long l2 = 1200000000L;
        float f2 = (float)(System.nanoTime() % l2) / (float)l2;
        return 0.5f - 0.5f * (float)Math.cos((double)f2 * Math.PI * 2.0);
    }

    @Override
    public float o() {
        return this.n();
    }

    @Override
    public float p() {
        this.a();
        if (this.a() < 0.001f) {
            return 0.0f;
        }
        float f2 = this.bq;
        float f3 = this.bo;
        float f4 = this.b();
        return hd.a(f2, f4, f3);
    }

    private float k() {
        return this.g() - this.a(96.0f) - this.f();
    }

    private float g() {
        fk fk2 = fk.a();
        return (fk2 != null ? fk2.a() : 1920.0f) / 2.0f;
    }

    private boolean g() {
        for (jW jW2 : this.X) {
            if (!(jW2.f * jW2.g > 0.05f)) continue;
            return true;
        }
        return false;
    }

    @Override
    protected boolean v() {
        return this.a() > 0.001f;
    }

    private float j() {
        return this.h() - this.a(18.0f);
    }

    @Override
    protected boolean q() {
        return true;
    }

    @Override
    public float q() {
        return this.p();
    }

    @Override
    protected boolean r() {
        return false;
    }

    @Override
    public boolean E() {
        return !this.c() && !this.e();
    }

    @Override
    protected boolean A() {
        if (this.a() > 0.001f) {
            return true;
        }
        if (!this.y()) {
            return true;
        }
        for (jW jW2 : this.X) {
            if (!jW2.h) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean A(float f2, float f3) {
        if (this.e()) {
            float f4 = this.a((float)this.c());
            float f5 = this.a((float)this.d());
            float f6 = this.a((float)this.b());
            float f7 = this.a(22.0f);
            return f2 >= f4 && f2 <= f4 + f6 && f3 >= f5 && f3 <= f5 + f7;
        }
        if (!this.c()) {
            return super.A(f2, f3);
        }
        float f8 = this.f();
        float f9 = this.a(24.0f);
        float f10 = this.i();
        float f11 = this.j() + f8;
        float f12 = this.k() - f9;
        float f13 = this.l();
        float f14 = f8 + f9;
        boolean bl2 = f2 >= f12 && f2 <= f12 + f14 && f3 >= f10 && f3 <= f11;
        boolean bl3 = f2 >= f13 && f2 <= f13 + f14 && f3 >= f10 && f3 <= f11;
        return bl2 || bl3;
    }

    @Override
    protected void A(float f2, class_332 class_3322, Matrix4f matrix4f, float f3) {
        this.a();
        float f4 = this.a();
        if (f4 < 0.001f) {
            return;
        }
        float f5 = f2 * f3;
        if (f5 <= 0.001f) {
            return;
        }
        if (this.e()) {
            this.a(class_3322, f5);
        } else if (this.c()) {
            this.b(class_3322, f5);
        } else {
            float f6 = f4;
            float f7 = f5;
            Matrix4f matrix4f2 = matrix4f;
            class_332 class_3323 = class_3322;
            this.a(f6, class_3323, f7, matrix4f2);
        }
    }

    @Override
    public float N() {
        if (this.e()) {
            return this.a((float)this.c());
        }
        if (this.c()) {
            return this.k();
        }
        return this.O();
    }

    @Override
    public float M() {
        if (this.e()) {
            return this.a(22.0f);
        }
        if (this.c()) {
            return this.e();
        }
        return this.n();
    }

    @Override
    public float L() {
        if (this.e()) {
            return this.a((float)this.b());
        }
        if (this.c()) {
            return this.d();
        }
        return this.p();
    }
}

