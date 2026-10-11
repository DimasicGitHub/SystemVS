/*
 * Decompiled with CFR 0.152.
 */
public class hh
extends aT {
    private static /* synthetic */ hh a;
    private /* synthetic */ long b;
    private /* synthetic */ long c;
    private /* synthetic */ long d;

    public /* synthetic */ hh() {
        super("\u0424\u0440\u0430\u043c\u0435\u0417\u0439\u043d\u0441", fV.e);
        a = this;
        this.a();
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
    }

    private /* bridge */ /* synthetic */ void a() {
        this.b = 1000000000L / (long)c.a();
    }

    public static /* bridge */ /* synthetic */ hh a() {
        return a;
    }

    public /* bridge */ /* synthetic */ boolean a() {
        if (!this.f()) {
            return false;
        }
        long l2 = System.nanoTime();
        long l3 = l2 - this.c;
        this.d += l3;
        if (this.d < this.b) {
            if (l3 > this.b * 3L) {
                this.c = l2;
                this.d = 0L;
                return false;
            }
            return true;
        }
        this.d -= this.b;
        if (this.d > this.b * 2L) {
            this.d = this.b;
        }
        this.c = l2;
        return false;
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.a();
        this.c = System.nanoTime();
        this.d = 0L;
    }
}

