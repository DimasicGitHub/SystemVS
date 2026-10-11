/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_243;
import net.minecraft.class_3532;

final class ja
extends Record {
    private final /* synthetic */ class_243 a;
    private final /* synthetic */ long b;
    private final /* synthetic */ float c;
    private final /* synthetic */ float d;
    private final /* synthetic */ float e;

    private /* synthetic */ ja(class_243 class_2432, long l2, float f2, float f3, float f4) {
        this.a = class_2432;
        this.b = l2;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ja.class, "pos;createdAt;lifetimeMs;strength;maxRadius", "a", "b", "c", "d", "e"}, this, object);
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ja.class, "pos;createdAt;lifetimeMs;strength;maxRadius", "a", "b", "c", "d", "e"}, this);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ja.class, "pos;createdAt;lifetimeMs;strength;maxRadius", "a", "b", "c", "d", "e"}, this);
    }

    public /* bridge */ /* synthetic */ float b() {
        return this.d;
    }

    public /* bridge */ /* synthetic */ float c() {
        return this.e;
    }

    public /* bridge */ /* synthetic */ float a() {
        return this.c;
    }

    /* bridge */ /* synthetic */ boolean a(long l2) {
        return (float)(l2 - this.b) >= this.c;
    }

    public /* bridge */ /* synthetic */ long a() {
        return this.b;
    }

    public /* bridge */ /* synthetic */ class_243 a() {
        return this.a;
    }

    /* bridge */ /* synthetic */ float a(long l2) {
        return class_3532.method_15363((float)((float)(l2 - this.b) / this.c), (float)0.0f, (float)1.0f);
    }
}

