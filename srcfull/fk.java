/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.minecraft.class_332;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fk
implements fU {
    private static final float a = 1920.0f;
    private static final float b = 1080.0f;
    private static final fk INSTANCE = new fk();
    private static long c;
    private final List<jD> d = new ArrayList<jD>();
    private final List<jD> e = Collections.unmodifiableList(this.d);
    private final bO f = new bO(this);
    private final kX g = new kX(this, this.f);
    private final kd h = new kd(this, this.f);
    private final gW i = new gW(this, this.h);
    private boolean j;
    private float k = 1.0f;
    private float l = 1080.0f;

    private fk() {
        List<jD> list = List.of(new k(), new iO(), new dX(), new bG(), new cl(), new hd(), new fF(), new aP(), new iI(), new cU(), new al(), new je(), new fT());
        for (jD jD2 : list) {
            this.a(jD2);
        }
        bl.a().a(this.d);
    }

    public static void e() {
        ++c;
    }

    public void b() {
        jE jE2 = fk.a();
        if (jE2 == null) {
            return;
        }
        bl.a().a(this.d);
        Map map = jE2.a("__global__");
        if (map != null) {
            bl.a().a(map);
        }
        for (jD jD2 : this.d) {
            Map map2 = jE2.a(jD2.d());
            if (map2 == null) continue;
            jD2.a(map2);
        }
    }

    public boolean b(int n2, int n3, int n4) {
        int n5 = n3;
        int n6 = n4;
        int n7 = n2;
        return this.i.b(n5, n7, n6);
    }

    public float b() {
        return this.l;
    }

    public void b(jD jD2) {
        if (this.d.remove(jD2)) {
            this.d.add(jD2);
        }
    }

    private float c() {
        if (lo.aM == null || lo.aM.method_22683() == null) {
            return 0.0f;
        }
        int n2 = lo.aM.method_22683().method_4480();
        if (n2 <= 0) {
            return 0.0f;
        }
        return (float)(lo.aM.field_1729.method_1603() * 1920.0 / (double)n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void c() {
        boolean bl2;
        jE jE2 = fk.a();
        if (this.j || jE2 == null) {
            return;
        }
        af af2 = af.a();
        ej ej2 = af2 != null ? af2.a() : null;
        boolean bl3 = bl2 = ej2 != null && ej2.a();
        if (ej2 != null) {
            ej2.a(true);
        }
        try {
            this.a();
            this.b();
        }
        finally {
            if (ej2 != null) {
                ej2.a(bl2);
            }
        }
        this.j = true;
    }

    private void d() {
        int n2 = lo.aM.method_22683().method_4480();
        int n3 = lo.aM.method_22683().method_4507();
        double d2 = lo.aM.method_22683().method_4495();
        if (d2 <= 0.0) {
            d2 = 1.0;
        }
        this.k = (float)((double)((float)n2 / 1920.0f) / d2);
        this.l = n2 > 0 ? (float)n3 * 1920.0f / (float)n2 : 1080.0f;
    }

    private float d() {
        if (lo.aM == null || lo.aM.method_22683() == null) {
            return 0.0f;
        }
        int n2 = lo.aM.method_22683().method_4480();
        if (n2 <= 0) {
            return 0.0f;
        }
        return (float)(lo.aM.field_1729.method_1604() * 1920.0 / (double)n2);
    }

    private static jE a() {
        af af2 = af.a();
        return af2 != null ? af2.a() : null;
    }

    public boolean a(int n2, int n3, int n4) {
        int n5 = n4;
        int n6 = n2;
        int n7 = n3;
        return this.i.a(n6, n7, n5);
    }

    public float a() {
        return 1920.0f;
    }

    public static long a() {
        return c;
    }

    public static fk a() {
        return INSTANCE;
    }

    public boolean a(double d2, double d3, double d4) {
        double d5 = d3;
        float f2 = this.d();
        float f3 = this.c();
        return this.i.a(f3, d5, f2);
    }

    public boolean a(char c2, int n2) {
        return this.i.a(c2, n2);
    }

    public void a(class_332 class_3322, float f2) {
        float f3;
        ++c;
        this.c();
        if (lo.aM == null || lo.aM.method_22683() == null) {
            return;
        }
        this.d();
        this.g.a(this.h.a());
        float f4 = this.c();
        float f5 = f3 = this.d();
        float f6 = f4;
        this.i.a(f5, f6);
        class_3322.method_51452();
        float f7 = f3;
        float f8 = f4;
        float f9 = f2;
        class_332 class_3323 = class_3322;
        this.a(class_3323, f9, f7, f8);
    }

    public void a() {
        this.f.a(this.d);
    }

    public boolean a() {
        return this.i.c();
    }

    public List a() {
        return this.e;
    }

    public jD a(String string) {
        if (string == null) {
            return null;
        }
        for (jD jD2 : this.d) {
            if (!string.equals(jD2.d())) continue;
            return jD2;
        }
        return null;
    }

    private void a(jD jD2) {
        this.d.add(jD2);
        this.f.b(jD2);
    }

    private void a(Matrix4f matrix4f, float f2) {
        jD jD2 = this.h.a();
        if (jD2 == null || kd.a()) {
            return;
        }
        float f3 = f2;
        int n2 = gD.primary();
        float f4 = this.b();
        float f5 = this.a();
        List<jD> list = this.d;
        jD jD3 = jD2;
        Matrix4f matrix4f2 = matrix4f;
        gs.a(f3, list, matrix4f2, n2, f5, f4, jD3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(class_332 class_3322, float f2, float f3, float f4) {
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_22905(this.k, this.k, 1.0f);
        Matrix4f matrix4f = class_3322.method_51448().method_23760().method_23761();
        float f5 = jX.c();
        jX.a(this.k);
        bp.c();
        try {
            boolean bl2 = this.i.c();
            if (bl2) {
                this.a(matrix4f, f2);
            }
            for (jD jD2 : this.d) {
                ao.a();
                try {
                    float f6 = f2;
                    Matrix4f matrix4f2 = matrix4f;
                    class_332 class_3323 = class_3322;
                    jD2.A(f6, matrix4f2, class_3323);
                }
                finally {
                    ao.b();
                }
            }
            if (bl2 || this.i.a()) {
                float f7 = f2;
                float f8 = f3;
                float f9 = f4;
                Matrix4f matrix4f3 = matrix4f;
                class_332 class_3324 = class_3322;
                this.i.a(f7, f9, class_3324, matrix4f3, f8);
            }
        }
        finally {
            bp.d();
            jX.a(f5);
            class_3322.method_51448().method_22909();
        }
    }
}

