/*
 * Decompiled with CFR 0.152.
 */
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2480;
import net.minecraft.class_2596;
import net.minecraft.class_2813;
import net.minecraft.class_2815;
import net.minecraft.class_304;
import net.minecraft.class_408;
import net.minecraft.class_471;
import net.minecraft.class_481;
import net.minecraft.class_490;
import net.minecraft.class_495;
import net.minecraft.class_498;
import net.minecraft.class_744;
import org.lwjgl.glfw.GLFW;

public class iu
extends aT {
    private /* synthetic */ dw a;
    private /* synthetic */ dw b;
    private final /* synthetic */ Queue<class_2813> c;
    private /* synthetic */ class_2813 d;
    private /* synthetic */ class_2815 e;
    private /* synthetic */ boolean f;
    private /* synthetic */ boolean g;
    private /* synthetic */ boolean h;
    private /* synthetic */ int i;
    private /* synthetic */ int j;
    private /* synthetic */ int k;
    private /* synthetic */ int l;
    private /* synthetic */ int m;
    private /* synthetic */ class_304[] n;

    public /* synthetic */ iu() {
        super("\u0418\u043d\u0432\u041c\u043e\u0432\u0435", fV.b);
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"\u0411", "e", "\u0433", "\u0430", "\u0442", "\u044c", " ", "\u0432", " ", "\u0438", "\u043d", "\u0432", "e", "\u043d", "\u0442", "\u0430", "\u0440", "\u0435"});
        dw2.setDescriptionParts(new String[]{"\u041f", "o", "\u0437", "\u0432", "\u043e", "\u043b", "\u044f", "\u0435", "\u0442", " ", "\u0434", "\u0432", "\u0438", "\u0433", "a", "\u0442", "\u044c", "\u0441", "\u044f", " ", "c", " ", "o", "\u0442", "\u043a", "\u0440", "\u044b", "\u0442", "\u044b", "\u043c", " ", "\u0438", "\u043d", "\u0432", "e", "\u043d", "\u0442", "\u0430", "\u0440", "\u0451", "\u043c"});
        this.a = dw2;
        dw dw3 = new dw("", "", true);
        dw3.setNameParts(new String[]{"\u0411", "e", "\u0433", "\u0430", "\u0442", "\u044c", " ", "\u0432", " ", "\u0433", "y", "\u0438"});
        dw3.setDescriptionParts(new String[]{"\u041f", "o", "\u0437", "\u0432", "\u043e", "\u043b", "\u044f", "\u0435", "\u0442", " ", "\u0434", "\u0432", "\u0438", "\u0433", "a", "\u0442", "\u044c", "\u0441", "\u044f", " ", "c", " ", "o", "\u0442", "\u043a", "\u0440", "\u044b", "\u0442", "\u044b", "\u043c", " ", "\u0433", "y", "\u0438", " ", "\u043a", "\u043b", "\u0438", "e", "\u043d", "\u0442", "\u0430"});
        this.b = dw3;
        this.c = new ConcurrentLinkedQueue<class_2813>();
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.a(this.a, this.b);
    }

    @Override
    public /* bridge */ /* synthetic */ void i() {
        if (this.b() == null) {
            this.u();
            return;
        }
        if (this.c()) {
            this.m = 4;
        } else if (this.m > 0) {
            --this.m;
        }
        if (this.l > 0) {
            --this.l;
            if (this.l == 0 && this.e == null) {
                this.c();
            }
        }
        if (this.i > 0) {
            --this.i;
        } else if (!this.c.isEmpty()) {
            class_2813 class_28132 = this.c.poll();
            if (class_28132 != null && class_28132.method_12194() == this.a()) {
                iu.a((class_2596)class_28132);
            }
            this.i = 1;
            if (!this.c.isEmpty()) {
                this.j = Math.max(this.j, 4);
            }
        }
        if (this.j > 0) {
            --this.j;
            if (this.j == 0 && this.c.isEmpty()) {
                this.b();
            }
        }
        if (this.k > 0) {
            --this.k;
            if (this.k == 0 && this.d != null) {
                if (this.d.method_12194() == this.a()) {
                    iu.a((class_2596)this.d);
                }
                this.d = null;
            }
        }
        if (this.g) {
            if (this.h) {
                this.d();
            } else {
                gT.d();
            }
            return;
        }
        if (this.a() == null || this.a() instanceof class_408 || this.a() instanceof class_498 || this.a() instanceof class_471) {
            return;
        }
        if (ih.a() || this.a() instanceof class_495) {
            this.d();
            return;
        }
        this.t();
        boolean bl2 = this.b();
        boolean bl3 = this.a() instanceof jX;
        if ((bl2 && this.a.a() || bl3 && this.b.a()) && this.n != null) {
            long l2 = this.a().method_22683().method_4490();
            for (class_304 class_3042 : this.n) {
                boolean bl4;
                boolean bl5 = bl4 = GLFW.glfwGetKey((long)l2, (int)class_3042.method_1429().method_1444()) == 1;
                if (class_3042.method_1434() == bl4) continue;
                class_3042.method_23481(bl4);
            }
        }
    }

    private /* bridge */ /* synthetic */ void b() {
        if (this.e != null) {
            gT.d();
            iu.a((class_2596)this.e);
            this.e = null;
            this.l = 1;
            return;
        }
        this.c();
    }

    private /* bridge */ /* synthetic */ boolean b() {
        return this.a() instanceof class_490 && !(this.a() instanceof class_481);
    }

    private /* bridge */ /* synthetic */ boolean c() {
        if (this.b() == null || this.a() == null) {
            return false;
        }
        class_744 class_7442 = this.a().field_3913;
        if (class_7442 != null && (class_7442.field_3905 != 0.0f || class_7442.field_3907 != 0.0f)) {
            return true;
        }
        if (this.b().method_5624()) {
            return true;
        }
        if (this.a() != null && this.a().method_22683() != null && this.a() != null) {
            long l2 = this.a().method_22683().method_4490();
            return iu.a(l2, this.a().field_1894.method_1429().method_1444()) || iu.a(l2, this.a().field_1881.method_1429().method_1444()) || iu.a(l2, this.a().field_1913.method_1429().method_1444()) || iu.a(l2, this.a().field_1849.method_1429().method_1444()) || iu.a(l2, this.a().field_1903.method_1429().method_1444());
        }
        return false;
    }

    private /* bridge */ /* synthetic */ void c() {
        if (this.g) {
            this.g = false;
            gT.b();
        }
        this.h = false;
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.u();
    }

    private /* bridge */ /* synthetic */ boolean h() {
        return this.m > 0 || this.c();
    }

    private /* bridge */ /* synthetic */ void d() {
        if (this.a() == null) {
            return;
        }
        this.a().field_1894.method_23481(false);
        this.a().field_1881.method_23481(false);
        this.a().field_1913.method_23481(false);
        this.a().field_1849.method_23481(false);
        this.a().field_1903.method_23481(false);
        this.a().field_1867.method_23481(false);
        this.a().field_1832.method_23481(false);
    }

    private static /* bridge */ /* synthetic */ void a(class_2596 class_25962) {
        try {
            lx.a(class_25962);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private /* bridge */ /* synthetic */ int a() {
        return this.b() != null && this.b().field_7512 != null ? this.b().field_7512.field_7763 : -1;
    }

    private /* bridge */ /* synthetic */ boolean a(int n2) {
        if (this.b() == null || this.b().field_7512 == null) {
            return false;
        }
        if (n2 < 0 || n2 >= this.b().field_7512.field_7761.size()) {
            return false;
        }
        class_1799 class_17992 = ((class_1735)this.b().field_7512.field_7761.get(n2)).method_7677();
        class_1799 class_17993 = this.b().field_7512.method_34255();
        return iu.a(class_17992) || iu.a(class_17993);
    }

    private static /* bridge */ /* synthetic */ boolean a(class_1799 class_17992) {
        class_1747 class_17472;
        class_1792 class_17922 = class_17992.method_7909();
        return class_17922 instanceof class_1747 && (class_17472 = (class_1747)class_17922).method_7711() instanceof class_2480;
    }

    private static /* bridge */ /* synthetic */ boolean a(long l2, int n2) {
        return n2 > 0 && GLFW.glfwGetKey((long)l2, (int)n2) == 1;
    }

    private /* bridge */ /* synthetic */ void a(lx lx2, class_2813 class_28132) {
        class_1713 class_17132 = class_28132.method_12195();
        if (class_17132 == class_1713.field_7790 && !this.f && this.a(class_28132.method_12192())) {
            lx2.a(true);
            this.d = class_28132;
            this.k = 2;
            this.a();
            this.j = 4;
            return;
        }
        if (class_17132 == class_1713.field_7790 || class_17132 == class_1713.field_7794 || class_17132 == class_1713.field_7791 || class_17132 == class_1713.field_7795 || class_17132 == class_1713.field_7789) {
            lx2.a(true);
            this.c.add(class_28132);
            this.a(class_28132);
            this.a();
            this.j = 4;
            if (this.i == 0) {
                this.i = 1;
            }
        }
    }

    private /* bridge */ /* synthetic */ boolean a() {
        if (this.b() == null || this.a() == null) {
            return false;
        }
        class_744 class_7442 = this.a().field_3913;
        if (class_7442 != null && (class_7442.field_3905 != 0.0f || class_7442.field_3907 != 0.0f)) {
            return true;
        }
        return this.b().method_5624();
    }

    private /* bridge */ /* synthetic */ void a() {
        if (this.g) {
            return;
        }
        this.g = true;
        gT.a();
    }

    private /* bridge */ /* synthetic */ void a(lx lx2, class_2815 class_28152) {
        boolean bl2;
        boolean bl3 = bl2 = !this.c.isEmpty() || this.d != null;
        if (!bl2 && !this.a()) {
            return;
        }
        lx2.a(true);
        this.e = class_28152;
        this.l = 0;
        this.a();
        this.j = Math.max(this.j, bl2 ? 4 : 2);
    }

    @Override
    public /* bridge */ /* synthetic */ void a(lx lx2) {
        if (this.z() || lx2.a() != iG.a) {
            return;
        }
        class_2596 class_25962 = lx2.a();
        if (class_25962 instanceof class_2815) {
            class_2815 class_28152 = (class_2815)class_25962;
            this.a(lx2, class_28152);
            return;
        }
        if (gT.a()) {
            return;
        }
        class_25962 = lx2.a();
        if (!(class_25962 instanceof class_2813)) {
            return;
        }
        class_2813 class_28132 = (class_2813)class_25962;
        if (!this.b()) {
            return;
        }
        if (!this.h()) {
            this.a(class_28132);
            return;
        }
        this.a(lx2, class_28132);
    }

    private /* bridge */ /* synthetic */ void a(class_2813 class_28132) {
        if (class_28132.method_12195() == class_1713.field_7790) {
            this.f = !this.f;
        }
    }

    private /* bridge */ /* synthetic */ void t() {
        if (this.n == null && this.a() != null) {
            this.n = new class_304[]{this.a().field_1894, this.a().field_1881, this.a().field_1913, this.a().field_1849, this.a().field_1903, this.a().field_1867};
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.u();
    }

    private /* bridge */ /* synthetic */ void u() {
        int n2 = this.a();
        while (!this.c.isEmpty()) {
            class_2813 class_28132 = this.c.poll();
            if (class_28132 == null || class_28132.method_12194() != n2) continue;
            iu.a((class_2596)class_28132);
        }
        if (this.d != null) {
            if (this.d.method_12194() == n2) {
                iu.a((class_2596)this.d);
            }
            this.d = null;
        }
        this.f = false;
        if (this.e != null) {
            gT.d();
            iu.a((class_2596)this.e);
            this.e = null;
        }
        if (this.g) {
            this.g = false;
            gT.b();
        }
        this.h = false;
        this.k = 0;
        this.i = 0;
        this.j = 0;
        this.l = 0;
        this.m = 0;
    }
}

