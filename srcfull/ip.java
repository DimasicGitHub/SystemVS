/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class ip
extends Record {
    private final /* synthetic */ char a;
    private final /* synthetic */ long b;
    private final /* synthetic */ int c;

    private /* synthetic */ ip(char c2, long l2, int n2) {
        this.a = c2;
        this.b = l2;
        this.c = n2;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ip.class, "ch;timestamp;x", "a", "b", "c"}, this, object);
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ip.class, "ch;timestamp;x", "a", "b", "c"}, this);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ip.class, "ch;timestamp;x", "a", "b", "c"}, this);
    }

    public /* bridge */ /* synthetic */ long a() {
        return this.b;
    }

    public /* bridge */ /* synthetic */ int a() {
        return this.c;
    }

    public /* bridge */ /* synthetic */ char a() {
        return this.a;
    }
}

