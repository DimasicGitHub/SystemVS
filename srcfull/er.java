/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class er
extends Record {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;

    private /* synthetic */ er(int n2, int n3, int n4) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{er.class, "left;right;bgTop", "a", "b", "c"}, this, object);
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{er.class, "left;right;bgTop", "a", "b", "c"}, this);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{er.class, "left;right;bgTop", "a", "b", "c"}, this);
    }

    public /* bridge */ /* synthetic */ int b() {
        return this.b;
    }

    public /* bridge */ /* synthetic */ int c() {
        return this.c;
    }

    public /* bridge */ /* synthetic */ int a() {
        return this.a;
    }
}

