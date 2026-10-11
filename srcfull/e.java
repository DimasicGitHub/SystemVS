/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class e
extends Record {
    private final /* synthetic */ int a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ Runnable c;

    private /* synthetic */ e(int n2, boolean bl2, Runnable runnable) {
        this.a = n2;
        this.b = bl2;
        this.c = runnable;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "delay;atTickStart;action", "a", "b", "c"}, this, object);
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "delay;atTickStart;action", "a", "b", "c"}, this);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "delay;atTickStart;action", "a", "b", "c"}, this);
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return this.b;
    }

    public /* bridge */ /* synthetic */ Runnable a() {
        return this.c;
    }

    public /* bridge */ /* synthetic */ int a() {
        return this.a;
    }
}

