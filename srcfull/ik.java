/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class ik
extends jD {
    private static final float a = 4.5f;
    protected static final float b = 20.0f;
    private static final float c = 4.0f;
    private static final float d = 6.0f;
    private final ey<cp> e = new ey(6.0f);
    private List<i> f = Collections.emptyList();
    private final ArrayList<Object> g = new ArrayList();
    private final Function<Object, cp> h = object -> new cp(this, this.a((String)object));
    private final ArrayList<i> i = new ArrayList();
    private final Set<String> j = new HashSet<String>();
    private static final float k = 0.08f;
    private final Map<String, Float> l = new HashMap<String, Float>();
    private final im m = new im();
    private long n = -1L;
    private float o;

    protected float b() {
        return 0.0f;
    }

    protected float b(i i2) {
        return this.a();
    }

    protected List b() {
        return Collections.emptyList();
    }

    protected int b(i i2) {
        return gD.mutedFg();
    }

    protected boolean b() {
        return false;
    }

    protected float c(i i2) {
        return 0.0f;
    }

    protected float c() {
        return 20.0f;
    }

    @Override
    public float n() {
        this.a();
        if (this.e.a()) {
            return 16.0f + this.a();
        }
        return 16.0f + this.e.a();
    }

    @Override
    public void f() {
        this.e.b();
    }

    protected float d(i i2) {
        return 0.0f;
    }

    protected void a(float f2, Matrix4f matrix4f, float f3, float f4, i i2, float f5, float f6) {
    }

    protected boolean a() {
        return false;
    }

    private float a(float f2, float f3, Matrix4f matrix4f, float f4, i i2, float f5) {
        kD kD2 = i2.a();
        if (kD2 == null) {
            return f4;
        }
        if (this.a()) {
            float f6 = this.c();
            float f7 = f2 + (f5 - f6) / 2.0f;
            float f8 = this.A(f3);
            int n2 = gD.elevated();
            float f9 = 6.0f;
            float f10 = f6;
            float f11 = f6;
            float f12 = f7;
            float f13 = f4;
            Matrix4f matrix4f2 = matrix4f;
            dP.a(f9, f13, n2, matrix4f2, f10, f11, f8, f12);
            float f14 = f6 - 8.0f;
            float f15 = f14 / Math.max(kD2.getWidth(), kD2.getHeight());
            float f16 = kD2.getWidth() * f15;
            float f17 = kD2.getHeight() * f15;
            float f18 = f3;
            int n3 = gD.mutedFg();
            float f19 = f17;
            float f20 = f16;
            float f21 = f7 + (f6 - f17) / 2.0f;
            float f22 = f4 + (f6 - f16) / 2.0f;
            kD kD3 = kD2;
            Matrix4f matrix4f3 = matrix4f;
            jr.a(f18, n3, matrix4f3, f21, kD3, f19, f22, f20);
            return f4 + f6 + 6.0f;
        }
        float f23 = 12.0f / Math.max(kD2.getWidth(), kD2.getHeight());
        float f24 = kD2.getWidth() * f23;
        float f25 = kD2.getHeight() * f23;
        float f26 = f3;
        int n4 = gD.mutedFg();
        float f27 = f25;
        float f28 = f24;
        float f29 = f2 + (f5 - f25) / 2.0f;
        float f30 = f4;
        kD kD4 = kD2;
        Matrix4f matrix4f4 = matrix4f;
        jr.a(f26, n4, matrix4f4, f29, kD4, f27, f30, f28);
        return f4 + f24 + 4.0f;
    }

    private void a(Matrix4f matrix4f, float f2, class_4587 class_45872, cp cp2, float f3, float f4, float f5, float f6) {
        float f7 = cp2.b.c();
        float f8 = 0.85f + 0.15f * f2;
        i i2 = cp2.a;
        float f9 = this.b(i2);
        float f10 = f7 + f9 / 2.0f;
        Matrix4f matrix4f2 = matrix4f;
        boolean bl2 = false;
        if (class_45872 != null && f8 < 0.999f) {
            float f11 = 0.0f;
            float f12 = 1.0f;
            float f13 = f8;
            float f14 = f10;
            float f15 = f5;
            class_4587 class_45873 = class_45872;
            matrix4f2 = ca.a(f15, f12, f14, f11, class_45873, f13);
            bl2 = true;
        }
        float f16 = f2;
        float f17 = f4;
        float f18 = f7;
        float f19 = f3 - this.b() - 8.0f;
        i i3 = i2;
        Matrix4f matrix4f3 = matrix4f2;
        this.a(i3, f18, f16, f17, matrix4f3, f19);
        float f20 = this.c(i2);
        float f21 = f3;
        float f22 = f7 + f20 + (f9 - f20 - 12.0f) / 2.0f;
        float f23 = f4;
        float f24 = f9 - f20;
        float f25 = f7 + f20;
        float f26 = f21;
        i i4 = i2;
        Matrix4f matrix4f4 = matrix4f2;
        f21 = this.a(f25, f23, matrix4f4, f26, i4, f24);
        float f27 = f4;
        float f28 = f22;
        float f29 = f21;
        i i5 = i2;
        Matrix4f matrix4f5 = matrix4f2;
        ik.a(f29, i5, matrix4f5, f28, f27);
        int n2 = this.b(i2);
        float f30 = f4;
        float f31 = f9 - f20;
        float f32 = f22;
        float f33 = f6;
        i i6 = i2;
        Matrix4f matrix4f6 = matrix4f2;
        this.a(f30, matrix4f6, i6, f32, n2, f31, f33);
        if (bl2) {
            class_45872.method_22909();
        }
    }

    @Override
    protected void a(float f2, float f3, float f4, Matrix4f matrix4f) {
        this.a();
        float f5 = f3 + 8.0f + this.b();
        float f6 = f3 + 200.0f - 8.0f;
        float f7 = f4 + 8.0f;
        float f8 = f3 + 100.0f;
        this.e.a(f7);
        class_4587 class_45872 = this.aP != null ? this.aP.method_51448() : null;
        for (cp cp2 : this.e.a()) {
            float f9 = cp2.b.a();
            float f10 = f2 * f9;
            if (f10 <= 0.001f || cp2.a == null) continue;
            float f11 = f8;
            float f12 = f6;
            float f13 = f5;
            float f14 = f10;
            float f15 = f9;
            cp cp3 = cp2;
            class_4587 class_45873 = class_45872;
            Matrix4f matrix4f2 = matrix4f;
            this.a(matrix4f2, f15, class_45873, cp3, f13, f14, f11, f12);
        }
    }

    protected final void a(List list) {
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.i.add((i)list.get(i2));
        }
        list.clear();
    }

    private float a(float f2, i i2) {
        float f3;
        String string;
        Float f4;
        if (!this.b()) {
            return f2;
        }
        long l2 = fk.a();
        if (this.n != l2) {
            this.n = l2;
            this.o = this.m.a();
        }
        if ((f4 = this.l.get(string = i2.a())) == null) {
            f3 = f2;
        } else {
            float f5 = 0.08f;
            float f6 = this.o;
            float f7 = f2;
            float f8 = f4.floatValue();
            f3 = im.a(f7, f8, f6, f5);
        }
        float f9 = f3;
        this.l.put(string, Float.valueOf(f9));
        return f9;
    }

    private void a(float f2, Matrix4f matrix4f, i i2, float f3, int n2, float f4, float f5) {
        float f6 = ao.a(i2.b(), 12.0f);
        i i3 = i2;
        float f7 = this.a(f6, i3);
        float f8 = this.d(i2);
        float f9 = f5 - f8 - f7;
        ao.c();
        float f10 = f2;
        float f11 = f4;
        float f12 = f7;
        float f13 = f3;
        float f14 = f9;
        i i4 = i2;
        Matrix4f matrix4f2 = matrix4f;
        this.a(f13, matrix4f2, f14, f11, i4, f10, f12);
        ao.a(matrix4f, i2.b(), f9, f3, 12.0f, n2, f2);
    }

    private static void a(float f2, i i2, Matrix4f matrix4f, float f3, float f4) {
        if (i2.a()) {
            ao.c(matrix4f, i2.a(), f2, f3, 12.0f, gD.foreground(), f4);
        } else {
            float f5 = f4;
            int n2 = gD.foreground();
            float f6 = 12.0f;
            float f7 = f3;
            float f8 = f2;
            String string = i2.a();
            Matrix4f matrix4f2 = matrix4f;
            ao.a(n2, f5, f7, matrix4f2, f8, f6, string);
        }
    }

    @SafeVarargs
    protected final void a(Map ... mapArray) {
        if (mapArray.length == 0) {
            return;
        }
        this.j.clear();
        for (cp cp2 : this.e.a()) {
            if (cp2.a == null) continue;
            this.j.add(cp2.a.a());
        }
        for (Map map : mapArray) {
            map.keySet().retainAll(this.j);
        }
        this.l.keySet().retainAll(this.j);
    }

    protected abstract List a();

    private i a(String string) {
        for (i i2 : this.f) {
            if (!i2.a().equals(string)) continue;
            return i2;
        }
        return null;
    }

    private void a() {
        if (!this.e.a(fk.a())) {
            return;
        }
        this.f = this.a();
        if (this.f.isEmpty() && this.x()) {
            this.f = this.b();
        }
        this.g.clear();
        for (i object : this.f) {
            this.g.add(object.a());
        }
        this.e.a(this.g, this.h);
        for (cp cp2 : this.e.a()) {
            i i2 = this.a(cp2.a.a());
            if (i2 == null) continue;
            cp2.a = i2;
        }
        this.e.a(this.g);
        this.e.a();
    }

    protected final i a(boolean bl2, String string, kD kD2, String string2) {
        int n2 = this.i.size();
        if (n2 > 0) {
            kD kD3 = kD2;
            boolean bl3 = bl2;
            String string3 = string;
            String string4 = string2;
            return this.i.remove(n2 - 1).a(bl3, kD3, string4, string3);
        }
        return new i(string2, string, bl2, kD2);
    }

    protected float a() {
        return 12.0f;
    }

    protected final i a(String string, String string2) {
        kD kD2 = null;
        boolean bl2 = false;
        String string3 = string;
        String string4 = string2;
        return this.a(bl2, string3, kD2, string4);
    }

    protected void a(Matrix4f matrix4f, i i2, float f2, float f3, float f4) {
    }

    protected final i a(String string, String string2, boolean bl2) {
        kD kD2 = null;
        boolean bl3 = bl2;
        String string3 = string;
        String string4 = string2;
        return this.a(bl3, string3, kD2, string4);
    }

    protected void a(i i2, float f2, float f3, float f4, Matrix4f matrix4f, float f5) {
        float f6 = f4;
        float f7 = f2;
        float f8 = f5;
        i i3 = i2;
        Matrix4f matrix4f2 = matrix4f;
        this.a(matrix4f2, i3, f6, f8, f7);
    }

    @Override
    protected boolean v() {
        this.a();
        return !this.f.isEmpty();
    }

    @Override
    protected boolean A() {
        return !this.a().isEmpty();
    }
}

