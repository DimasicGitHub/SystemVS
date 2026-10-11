/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1921;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_9799;

public final class ep
implements class_4597,
AutoCloseable {
    private static final /* synthetic */ ep INSTANCE;
    private final /* synthetic */ class_4597.class_4598 a;

    public /* synthetic */ ep() {
        this.a = class_4597.method_22991((class_9799)new class_9799(262144));
    }

    static {
        INSTANCE = new ep();
    }

    public /* bridge */ /* synthetic */ void a() {
        this.a.method_22993();
    }

    public static /* bridge */ /* synthetic */ ep a() {
        return INSTANCE;
    }

    @Override
    public /* bridge */ /* synthetic */ void close() {
        this.a.method_22993();
    }

    public /* bridge */ /* synthetic */ class_4588 getBuffer(class_1921 class_19212) {
        return new lC(this.a.getBuffer(class_19212));
    }
}

