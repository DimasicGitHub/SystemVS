/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_10149;
import net.minecraft.class_10151;
import net.minecraft.class_10156;
import net.minecraft.class_243;
import net.minecraft.class_276;
import net.minecraft.class_279;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_4184;
import net.minecraft.class_5944;
import net.minecraft.class_9922;
import net.minecraft.class_9960;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class iv
extends aT {
    private static final /* synthetic */ class_2960 a;
    private static final /* synthetic */ class_10156 b;
    private static final /* synthetic */ Matrix4f c;
    private static final /* synthetic */ Matrix4f d;
    private static final /* synthetic */ Vector3f e;
    private static final /* synthetic */ Matrix4f f;
    private static final /* synthetic */ Matrix4f g;
    private static final /* synthetic */ Vector3f h;
    private static final /* synthetic */ Matrix4f i;
    private static volatile /* synthetic */ boolean j;
    private static volatile /* synthetic */ float k;
    private static volatile /* synthetic */ int l;
    private static volatile /* synthetic */ boolean m;
    private static volatile /* synthetic */ boolean n;
    private static volatile /* synthetic */ boolean o;
    private static volatile /* synthetic */ boolean p;
    private static /* synthetic */ boolean q;
    private static /* synthetic */ boolean r;
    private static /* synthetic */ long s;
    private static /* synthetic */ long t;
    private static /* synthetic */ float u;
    private static /* synthetic */ class_9922 v;
    private static /* synthetic */ class_279 w;
    private static /* synthetic */ boolean x;
    private static /* synthetic */ int y;
    private /* synthetic */ gz z;
    private /* synthetic */ gz A;
    private /* synthetic */ dw B;
    private /* synthetic */ dw C;
    private /* synthetic */ dw D;
    private /* synthetic */ dw E;

    public /* synthetic */ iv() {
        super("\u041c\u043e\u0442\u0438\u043e\u043d\u0411\u043b\u0443\u0440", fV.e);
        gz gz2 = new gz("", "", 1.0, 0.0, 3.0, 0.05, "x", 2);
        gz2.setNameParts(new String[]{"C", "\u0438", "\u043b", "\u0430"});
        gz2.setDescriptionParts(new String[]{"\u0414", "\u043b", "\u0438", "\u043d", "a", " ", "c", "\u043c", "\u0430", "\u0437", "\u0430", " ", "\u0437", "a", " ", "o", "\u0434", "\u0438", "\u043d", " ", "\u043a", "a", "\u0434", "\u0440"});
        this.z = gz2;
        gz gz3 = new gz("", "", 32.0, 4.0, 128.0, 1.0, "", 0);
        gz3.setNameParts(new String[]{"C", "\u044d", "\u043c", "\u043f", "\u043b", "\u044b"});
        gz3.setDescriptionParts(new String[]{"\u041f", "\u0440", "e", "\u0434", "\u0435", "\u043b", " ", "\u0432", "\u044b", "\u0431", "o", "\u0440", "\u043e", "\u043a", " ", "\u043d", "a", " ", "\u043f", "\u0438", "\u043a", "\u0441", "e", "\u043b", "\u044c", ":", " ", "\u0432", "\u044b", "\u0448", "e", " ", "\u2014", " ", "\u043f", "\u043b", "a", "\u0432", "\u043d", "\u0435", "\u0435", ",", " ", "\u043d", "o", " ", "\u0434", "o", "\u0440", "\u043e", "\u0436", "\u0435"});
        this.A = gz3;
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"\u041f", "o", " ", "\u0433", "\u043b", "\u0443", "\u0431", "\u0438", "\u043d", "e"});
        dw2.setDescriptionParts(new String[]{"C", "\u043c", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u043f", "o", " ", "\u0433", "\u043b", "\u0443", "\u0431", "\u0438", "\u043d", "e", " ", "c", "\u0446", "\u0435", "\u043d", "\u044b", ",", " ", "a", " ", "\u043d", "e", " ", "\u0442", "o", "\u043b", "\u044c", "\u043a", "\u043e", " ", "o", "\u0442", " ", "\u043f", "o", "\u0432", "\u043e", "\u0440", "\u043e", "\u0442", "\u0430", " ", "\u043a", "a", "\u043c", "\u0435", "\u0440", "\u044b"});
        this.B = dw2;
        dw dw3 = new dw("", "", false);
        dw3.setNameParts(new String[]{"\u041f", "o", " ", "\u0446", "e", "\u043d", "\u0442", "\u0440", "\u0443"});
        dw3.setDescriptionParts(new String[]{"C", "\u043b", "\u0435", "\u0434", " ", "\u0432", " ", "o", "\u0431", "\u0435", " ", "c", "\u0442", "\u043e", "\u0440", "\u043e", "\u043d", "\u044b", " ", "o", "\u0442", " ", "\u043f", "\u0438", "\u043a", "c", "\u0435", "\u043b", "\u044f", ",", " ", "a", " ", "\u043d", "e", " ", "\u0442", "o", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u043d", "a", "\u0437", "\u0430", "\u0434"});
        this.C = dw3;
        dw dw4 = new dw("", "", false);
        dw4.setNameParts(new String[]{"O", "\u0442", " ", "\u0442", "\u0440", "e", "\u0442", "\u044c", "\u0435", "\u0433", "\u043e", " ", "\u043b", "\u0438", "\u0446", "a"});
        dw4.setDescriptionParts(new String[]{"C", "\u043c", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u043a", "a", "\u0440", "\u0442", "\u0438", "\u043d", "\u043a", "\u0443", " ", "\u0438", " ", "\u0432", " ", "\u0432", "\u0438", "\u0434", "e", " ", "o", "\u0442", " ", "\u0442", "\u0440", "e", "\u0442", "\u044c", "\u0435", "\u0433", "\u043e", " ", "\u043b", "\u0438", "\u0446", "a"});
        this.D = dw4;
        dw dw5 = new dw("", "", true);
        dw5.setNameParts(new String[]{"K", "\u043e", "\u043c", "\u043f", "\u0435", "\u043d", "\u0441", "\u0430", "\u0446", "\u0438", "\u044f", " ", "\u0413", "\u0446"});
        dw5.setDescriptionParts(new String[]{"\u0423", "c", "\u0438", "\u043b", "\u0438", "\u0432", "\u0430", "\u0442", "\u044c", " ", "c", "\u043b", "\u0435", "\u0434", ",", " ", "\u043a", "o", "\u0433", "\u0434", "\u0430", " ", "F", "P", "S", " ", "\u0432", "\u044b", "\u0448", "e", " ", "\u0447", "a", "\u0441", "\u0442", "\u043e", "\u0442", "\u044b", " ", "\u043c", "o", "\u043d", "\u0438", "\u0442", "\u043e", "\u0440", "\u0430"});
        this.E = dw5;
        this.a(this.z, this.A, this.B, this.C, this.D, this.E);
    }

    static {
        a = class_2960.method_60656((String)"motion_blur");
        b = iS.a("motion_blur", class_290.field_1592, class_10149.field_53930);
        c = new Matrix4f();
        d = new Matrix4f();
        e = new Vector3f();
        f = new Matrix4f();
        g = new Matrix4f();
        h = new Vector3f();
        i = new Matrix4f();
        j = false;
        k = 1.0f;
        l = 32;
        m = true;
        n = false;
        o = false;
        p = true;
        q = false;
        r = false;
        s = 16666666L;
        t = 0L;
        u = 1.0f;
        v = null;
        w = null;
        x = false;
        y = -1;
    }

    @Override
    public /* bridge */ /* synthetic */ void i() {
        if (!this.f()) {
            return;
        }
        j = true;
        this.a();
    }

    private static /* bridge */ /* synthetic */ void b() {
        long l2 = System.nanoTime();
        long l3 = l2 - t;
        t = l2;
        if (l3 <= 0L || l3 >= s) {
            u = 1.0f;
            return;
        }
        u = Math.min((float)s / (float)l3, 8.0f);
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        j = false;
        q = false;
        r = false;
    }

    public static /* bridge */ /* synthetic */ boolean a() {
        return j && r && k > 0.0f && (o || iv.aM.field_1690.method_31044().method_31034());
    }

    private static /* bridge */ /* synthetic */ float a() {
        return p ? k * u : k;
    }

    private static /* bridge */ /* synthetic */ class_279 a(class_10151 class_101512) {
        int n2 = jI.a();
        if (n2 != y) {
            y = n2;
            w = null;
            x = false;
        }
        if (w == null && !x) {
            try {
                w = class_101512.method_62941(a, class_9960.field_53902);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            x = w == null;
        }
        return w;
    }

    private /* bridge */ /* synthetic */ void a() {
        k = this.z.a();
        l = this.A.a();
        m = this.B.a();
        n = this.C.a();
        o = this.D.a();
        p = this.E.a();
    }

    public static /* bridge */ /* synthetic */ void a(Matrix4f matrix4f, class_9922 class_99222, Matrix4f matrix4f2, class_4184 class_41842) {
        if (!j || class_41842 == null || iv.aM.field_1773.method_35765()) {
            q = false;
            r = false;
            t = 0L;
            return;
        }
        v = class_99222;
        iv.b();
        if (q) {
            f.set((Matrix4fc)c);
            g.set((Matrix4fc)d);
            h.set((Vector3fc)e);
            r = true;
        }
        class_243 class_2432 = class_41842.method_19326();
        c.set((Matrix4fc)matrix4f);
        d.set((Matrix4fc)matrix4f2);
        e.set((float)(class_2432.field_1352 % 30000.0), (float)(class_2432.field_1351 % 30000.0), (float)(class_2432.field_1350 % 30000.0));
        q = true;
        if (r && e.distanceSquared((Vector3fc)h) > 16.0f) {
            r = false;
        }
    }

    public static /* bridge */ /* synthetic */ void a(class_276 class_2762) {
        if (!iv.a()) {
            return;
        }
        if (jI.b()) {
            return;
        }
        class_9922 class_99222 = v;
        if (class_2762 == null || class_99222 == null) {
            return;
        }
        class_10151 class_101512 = aM.method_62887();
        if (class_101512 == null) {
            return;
        }
        class_279 class_2792 = iv.a(class_101512);
        if (class_2792 == null) {
            return;
        }
        class_5944 class_59442 = class_101512.method_62947(b);
        if (class_59442 == null) {
            return;
        }
        Matrix4f matrix4f = i.set((Matrix4fc)c).invert();
        String string = "MvInverse";
        class_5944 class_59443 = class_59442;
        bS.a(string, matrix4f, class_59443);
        Matrix4f matrix4f2 = i.set((Matrix4fc)d).invert();
        String string2 = "ProjInverse";
        class_5944 class_59444 = class_59442;
        bS.a(string2, matrix4f2, class_59444);
        Matrix4f matrix4f3 = f;
        String string3 = "PrevModelView";
        class_5944 class_59445 = class_59442;
        bS.a(string3, matrix4f3, class_59445);
        Matrix4f matrix4f4 = g;
        String string4 = "PrevProjection";
        class_5944 class_59446 = class_59442;
        bS.a(string4, matrix4f4, class_59446);
        float f2 = iv.e.z;
        float f3 = iv.e.y;
        float f4 = iv.e.x;
        String string5 = "CameraPos";
        class_5944 class_59447 = class_59442;
        bS.a(class_59447, f3, string5, f2, f4);
        float f5 = iv.h.z;
        float f6 = iv.h.y;
        float f7 = iv.h.x;
        String string6 = "PrevCameraPos";
        class_5944 class_59448 = class_59442;
        bS.a(class_59448, f6, string6, f5, f7);
        float f8 = iv.a();
        String string7 = "Strength";
        class_5944 class_59449 = class_59442;
        bS.a(f8, class_59449, string7);
        int n2 = l;
        String string8 = "Samples";
        class_5944 class_594410 = class_59442;
        bS.a(class_594410, n2, string8);
        int n3 = n ? 1 : 0;
        String string9 = "Centered";
        class_5944 class_594411 = class_59442;
        bS.a(class_594411, n3, string9);
        int n4 = m ? 1 : 0;
        String string10 = "UseDepth";
        class_5944 class_594412 = class_59442;
        bS.a(class_594412, n4, string10);
        try {
            class_2792.method_1258(class_2762, class_99222);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        j = true;
        q = false;
        r = false;
        s = 1000000000L / (long)c.a();
        t = 0L;
        u = 1.0f;
        this.a();
    }
}

