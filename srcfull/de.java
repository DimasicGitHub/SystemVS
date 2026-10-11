/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_634;
import net.minecraft.class_640;

public class de {
    private static final /* synthetic */ de INSTANCE;
    private final /* synthetic */ int[] a;
    private /* synthetic */ int b;
    private /* synthetic */ int c;
    private /* synthetic */ int d;

    public /* synthetic */ de() {
        this.a = new int[5];
    }

    static {
        INSTANCE = new de();
    }

    private /* bridge */ /* synthetic */ void b() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }

    public /* bridge */ /* synthetic */ void a(lx lx2) {
    }

    private /* bridge */ /* synthetic */ void a() {
        if (lo.aM == null || lo.aM.field_1724 == null) {
            this.b();
            return;
        }
        class_634 class_6342 = lo.aM.method_1562();
        if (class_6342 == null) {
            this.b();
            return;
        }
        class_640 class_6402 = class_6342.method_2871(lo.aM.field_1724.method_5667());
        if (class_6402 == null) {
            this.b();
            return;
        }
        int n2 = class_6402.method_2959();
        if (n2 <= 0) {
            return;
        }
        this.a[this.b % 5] = n2;
        ++this.b;
        this.c = Math.min(this.c + 1, 5);
        int n3 = 0;
        for (int i2 = 0; i2 < this.c; ++i2) {
            n3 += this.a[i2];
        }
        this.d = n3 / this.c;
    }

    public static /* bridge */ /* synthetic */ de a() {
        return INSTANCE;
    }

    public /* bridge */ /* synthetic */ int a() {
        this.a();
        return this.d;
    }
}

