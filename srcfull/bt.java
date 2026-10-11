/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class bt
extends Record {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;
    private final /* synthetic */ dB d;

    private /* synthetic */ bt(int n2, int n3, int n4, dB dB2) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = dB2;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bt.class, "x;y;width;action", "a", "b", "c", "d"}, this, object);
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bt.class, "x;y;width;action", "a", "b", "c", "d"}, this);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bt.class, "x;y;width;action", "a", "b", "c", "d"}, this);
    }

    public /* bridge */ /* synthetic */ int b() {
        return this.b;
    }

    public /* bridge */ /* synthetic */ int c() {
        return this.c;
    }

    public /* bridge */ /* synthetic */ dB a() {
        return this.d;
    }

    public /* bridge */ /* synthetic */ int a() {
        return this.a;
    }

    /* bridge */ /* synthetic */ boolean a(float f2, float f3) {
        return f2 >= (float)this.a && f2 <= (float)(this.a + this.c) && f3 >= (float)this.b && f3 <= (float)(this.b + 20);
    }
}

