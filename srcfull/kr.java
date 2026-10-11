/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class kr {
    private final gw a;
    private final Supplier<String> b;
    private final BooleanSupplier c;
    private float d = 1.0f;

    private kr(gw gw2, Supplier supplier, BooleanSupplier booleanSupplier) {
        this.a = gw2;
        this.b = supplier;
        this.c = booleanSupplier;
    }

    float a(float f2) {
        return f2 * this.d;
    }

    boolean a() {
        return this.c == null || this.c.getAsBoolean();
    }

    public void a(float f2) {
        this.d = f2;
    }

    public gw a() {
        return this.a;
    }
}

