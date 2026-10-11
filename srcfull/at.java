/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class at
extends Record {
    private final /* synthetic */ aT a;
    private final /* synthetic */ Runnable b;

    private /* synthetic */ at(aT aT2, Runnable runnable) {
        this.a = aT2;
        this.b = runnable;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{at.class, "owner;abort", "a", "b"}, this, object);
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{at.class, "owner;abort", "a", "b"}, this);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{at.class, "owner;abort", "a", "b"}, this);
    }

    public /* bridge */ /* synthetic */ Runnable a() {
        return this.b;
    }

    public /* bridge */ /* synthetic */ aT a() {
        return this.a;
    }
}

