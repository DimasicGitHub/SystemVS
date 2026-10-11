/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_243;

final class ai {
    final /* synthetic */ List<class_243> a;
    /* synthetic */ class_243 b;
    /* synthetic */ class_243 c;
    /* synthetic */ float d;
    /* synthetic */ boolean e;
    /* synthetic */ boolean f;

    private /* synthetic */ ai() {
        this.a = new ArrayList<class_243>();
        this.b = null;
        this.c = new class_243(0.0, 1.0, 0.0);
        this.d = 0.0f;
        this.e = false;
        this.f = false;
    }

    /* bridge */ /* synthetic */ ai a() {
        ai ai2 = new ai();
        ai2.a.addAll(this.a);
        ai2.b = this.b;
        ai2.c = this.c;
        ai2.d = this.d;
        ai2.e = this.e;
        ai2.f = this.f;
        return ai2;
    }
}

