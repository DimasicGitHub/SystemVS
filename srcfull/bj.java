/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_1735;

public final class bj
extends Record {
    private final /* synthetic */ class_1735 a;
    private final /* synthetic */ fh b;

    public /* synthetic */ bj(class_1735 class_17352, fh fh2) {
        this.a = class_17352;
        this.b = fh2;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bj.class, "slot;entry", "a", "b"}, this, object);
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bj.class, "slot;entry", "a", "b"}, this);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bj.class, "slot;entry", "a", "b"}, this);
    }

    public /* bridge */ /* synthetic */ fh a() {
        return this.b;
    }

    public /* bridge */ /* synthetic */ class_1735 a() {
        return this.a;
    }
}

