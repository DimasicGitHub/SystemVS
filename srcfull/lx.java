/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_2547;
import net.minecraft.class_2596;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lx {
    private final class_2596<?> a;
    private final iG b;
    private boolean c = false;

    public lx(class_2596 class_25962, iG iG2) {
        this.a = class_25962;
        this.b = iG2;
    }

    public static void b(class_2596 class_25962) {
        if (lo.aM.method_1562() == null) {
            return;
        }
        try {
            ha.b(true);
            class_25962.method_65081((class_2547)lo.aM.method_1562());
        }
        finally {
            ha.b(false);
        }
    }

    public void a(boolean bl2) {
        this.c = bl2;
    }

    public boolean a() {
        return this.c;
    }

    public iG a() {
        return this.b;
    }

    public class_2596 a() {
        return this.a;
    }

    public static void a(class_2596 class_25962) {
        if (lo.aM.method_1562() == null) {
            return;
        }
        try {
            ha.a(true);
            lo.aM.method_1562().method_52787(class_25962);
        }
        finally {
            ha.a(false);
        }
    }
}

