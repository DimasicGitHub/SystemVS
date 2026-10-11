/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1921;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_9799;

public final class ht
implements class_4597,
AutoCloseable {
    private static final /* synthetic */ class_4588 a;
    private static final /* synthetic */ class_293 b;
    private static final /* synthetic */ ht INSTANCE;
    private final /* synthetic */ class_4597.class_4598 c;

    public /* synthetic */ ht() {
        this.c = class_4597.method_22991((class_9799)new class_9799(786432));
    }

    static {
        a = new dV();
        b = class_290.field_1580;
        INSTANCE = new ht();
    }

    public /* bridge */ /* synthetic */ void a() {
        this.c.method_22993();
    }

    public static /* bridge */ /* synthetic */ ht a() {
        return INSTANCE;
    }

    @Override
    public /* bridge */ /* synthetic */ void close() {
        this.c.method_22993();
    }

    public /* bridge */ /* synthetic */ class_4588 getBuffer(class_1921 class_19212) {
        if (class_19212.method_23031() != b) {
            return a;
        }
        return new em(this.c.getBuffer(class_19212));
    }
}

