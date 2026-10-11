/*
 * Decompiled with CFR 0.152.
 */
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_2596;
import net.minecraft.class_2793;
import net.minecraft.class_2797;
import net.minecraft.class_2799;
import net.minecraft.class_2811;
import net.minecraft.class_2813;
import net.minecraft.class_2815;
import net.minecraft.class_2820;
import net.minecraft.class_2824;
import net.minecraft.class_2828;
import net.minecraft.class_2840;
import net.minecraft.class_2842;
import net.minecraft.class_2846;
import net.minecraft.class_2853;
import net.minecraft.class_2855;
import net.minecraft.class_2863;
import net.minecraft.class_2873;
import net.minecraft.class_2877;
import net.minecraft.class_2879;
import net.minecraft.class_2884;
import net.minecraft.class_2885;
import net.minecraft.class_2886;
import net.minecraft.class_5427;
import net.minecraft.class_742;
import net.minecraft.class_7472;

public abstract class ho
extends aT {
    protected final /* synthetic */ gz d;
    protected final /* synthetic */ dw e;
    private final /* synthetic */ Queue<class_2596<?>> f;
    private /* synthetic */ long g;
    private /* synthetic */ long h;
    private /* synthetic */ boolean i;
    protected final /* synthetic */ dj j;

    protected /* synthetic */ ho(String string, fV fV2) {
        super(string, fV2);
        gz gz2 = new gz("", "", 300.0, 50.0, 1000.0, 10.0, ec.join(new String[]{"\u043c", "c"}), 0);
        gz2.setNameParts(new String[]{"\u0417", "a", "\u0434", "\u0435", "\u0440", "\u0436", "\u043a", "\u0430"});
        gz2.setDescriptionParts(new String[]{"\u0417", "a", "\u043c", "\u043e", "\u0440", "\u043e", "\u0437", "\u043a", "\u0430", " ", "\u043f", "a", "\u043a", "\u0435", "\u0442", "\u043e", "\u0432", " ", "(", "\u043c", "c", ",", " ", "\u0440", "a", "\u043d", "\u0434", "\u043e", "\u043c", " ", "0", ".", ".", "2", "x", ")"});
        this.d = gz2;
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u0430", "\u0442", "\u044c", " ", "c", "\u0435", "\u0440", "\u0432", "\u0435", "\u0440", "\u043d", "\u0443", "\u044e", " ", "\u043f", "o", "\u0437", "\u0438", "\u0446", "\u0438", "\u044e"});
        dw2.setDescriptionParts(new String[]{"O", "\u0442", "\u043e", "\u0431", "\u0440", "\u0430", "\u0436", "\u0430", "\u0435", "\u0442", " ", "\u0432", "a", "\u0448", "\u0443", " ", "\u043c", "o", "\u0434", "\u0435", "\u043b", "\u044c", "\u043a", "\u0443", " ", "\u043d", "a", " ", "c", "\u0435", "\u0440", "\u0432", "\u0435", "\u0440", "\u0435"});
        this.e = dw2;
        this.f = new ConcurrentLinkedQueue();
        this.g = 0L;
        this.h = 300L;
        this.i = false;
        this.j = new dj();
    }

    @Override
    public /* bridge */ /* synthetic */ void i() {
        if (this.z()) {
            return;
        }
        boolean bl2 = this.a();
        if (this.i && !bl2) {
            this.b();
            this.a();
        }
        this.i = bl2;
        if (!bl2) {
            this.j.b();
            return;
        }
        long l2 = System.currentTimeMillis();
        if (l2 - this.g >= this.h) {
            this.b();
            this.g = l2;
            this.h = this.a();
        }
    }

    protected /* bridge */ /* synthetic */ void b() {
        while (!this.f.isEmpty()) {
            class_2596<?> class_25962 = this.f.poll();
            if (class_25962 == null) continue;
            lx.a(class_25962);
        }
        this.j.b();
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.b();
        this.j.b();
    }

    @Override
    public /* bridge */ /* synthetic */ void f(H h2) {
        if (this.z() || !this.e.a() || !this.j.a() || this.a().field_1690.method_31044().method_31034()) {
            return;
        }
        this.j.a(h2);
    }

    private /* bridge */ /* synthetic */ boolean a(class_2596 class_25962) {
        if (class_25962 instanceof class_2824 || class_25962 instanceof class_2846 || class_25962 instanceof class_2885 || class_25962 instanceof class_2886 || class_25962 instanceof class_2879) {
            this.b();
            return true;
        }
        if (class_25962 instanceof class_2813 || class_25962 instanceof class_2815 || class_25962 instanceof class_2811 || class_25962 instanceof class_2873 || class_25962 instanceof class_2863 || class_25962 instanceof class_2855) {
            this.b();
            return true;
        }
        if (class_25962 instanceof class_2797 || class_25962 instanceof class_7472) {
            this.b();
            return true;
        }
        if (class_25962 instanceof class_2820 || class_25962 instanceof class_2877) {
            this.b();
            return true;
        }
        if (class_25962 instanceof class_2799 || class_25962 instanceof class_2842) {
            this.b();
            return true;
        }
        if (class_25962 instanceof class_2884 || class_25962 instanceof class_2793) {
            this.b();
            return true;
        }
        if (class_25962 instanceof class_2840 || class_25962 instanceof class_2853 || class_25962 instanceof class_5427) {
            this.b();
            return true;
        }
        return false;
    }

    @Override
    public /* bridge */ /* synthetic */ void a(lx lx2) {
        if (this.z() || !this.a()) {
            return;
        }
        if (lx2.a() == iG.a) {
            class_2596 class_25962 = lx2.a();
            if (this.a(class_25962)) {
                return;
            }
            if (!this.j.a() && class_25962 instanceof class_2828) {
                this.j.a((class_742)this.a());
            }
            this.f.add(class_25962);
            lx2.a(true);
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void a(ei ei2) {
        this.b();
    }

    private /* bridge */ /* synthetic */ long a() {
        long l2 = this.d.a() * 2L;
        if (l2 <= 0L) {
            return 0L;
        }
        return ThreadLocalRandom.current().nextLong(l2 + 1L);
    }

    protected /* bridge */ /* synthetic */ void a() {
    }

    protected abstract /* synthetic */ boolean a();

    @Override
    public /* bridge */ /* synthetic */ void m() {
        this.f.clear();
        this.j.b();
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.f.clear();
        this.g = System.currentTimeMillis();
        this.h = this.a();
        this.i = false;
        this.j.b();
    }
}

