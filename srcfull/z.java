/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class z
extends Record {
    private final /* synthetic */ fh a;
    private final /* synthetic */ long b;

    private /* synthetic */ z(fh fh2, long l2) {
        this.a = fh2;
        this.b = l2;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{z.class, "entry;time", "a", "b"}, this, object);
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{z.class, "entry;time", "a", "b"}, this);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{z.class, "entry;time", "a", "b"}, this);
    }

    public /* bridge */ /* synthetic */ long a() {
        return this.b;
    }

    public /* bridge */ /* synthetic */ fh a() {
        return this.a;
    }
}

