/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1309;

public class hk {
    private /* synthetic */ int a;
    private /* synthetic */ boolean b;
    private /* synthetic */ long c;
    private /* synthetic */ class_1309 d;

    public /* synthetic */ hk() {
        this.a = -1;
        this.b = false;
        this.c = 0L;
        this.d = null;
    }

    public /* bridge */ /* synthetic */ void b() {
        this.a = -1;
        this.b = false;
        this.c = 0L;
        this.d = null;
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return this.b;
    }

    public /* bridge */ /* synthetic */ void a() {
        if (lo.aM.field_1724 == null) {
            return;
        }
        if (this.a != -1 && this.a < 9) {
            lo.aM.field_1724.method_31548().field_7545 = this.a;
        }
        this.b();
    }

    public /* bridge */ /* synthetic */ void a(double d2) {
        boolean bl2;
        if (!this.b || this.a == -1 || lo.aM.field_1724 == null) {
            return;
        }
        int n2 = lo.aM.field_1724.method_31548().field_7545;
        int n3 = gK.a();
        if (n2 != n3 && n2 != this.a) {
            this.b();
            return;
        }
        long l2 = System.currentTimeMillis() - this.c;
        boolean bl3 = bl2 = (double)l2 >= d2;
        if (!(this.d != null && this.d.method_5805() && gK.a(this.d) || l2 < 100L)) {
            bl2 = true;
        }
        if (bl2) {
            this.a();
        }
    }

    public /* bridge */ /* synthetic */ void a(class_1309 class_13092) {
        int n2;
        if (lo.aM.field_1724 == null) {
            return;
        }
        if (this.a == -1) {
            this.a = lo.aM.field_1724.method_31548().field_7545;
        }
        if ((n2 = gK.a()) == -1) {
            return;
        }
        lo.aM.field_1724.method_31548().field_7545 = n2;
        this.b = true;
        this.c = System.currentTimeMillis();
        this.d = class_13092;
    }
}

