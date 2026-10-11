/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;

final class ku
extends Record {
    private final /* synthetic */ class_2338 a;
    private final /* synthetic */ class_2350 b;
    private final /* synthetic */ class_243 c;

    private /* synthetic */ ku(class_2338 class_23382, class_2350 class_23502, class_243 class_2432) {
        this.a = class_23382;
        this.b = class_23502;
        this.c = class_2432;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ku.class, "pos;side;aimPoint", "a", "b", "c"}, this, object);
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ku.class, "pos;side;aimPoint", "a", "b", "c"}, this);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ku.class, "pos;side;aimPoint", "a", "b", "c"}, this);
    }

    public /* bridge */ /* synthetic */ class_2350 a() {
        return this.b;
    }

    public /* bridge */ /* synthetic */ class_243 a() {
        return this.c;
    }

    public /* bridge */ /* synthetic */ class_2338 a() {
        return this.a;
    }
}

