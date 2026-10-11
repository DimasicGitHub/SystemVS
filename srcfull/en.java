/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_6880;

public final class en
extends Record {
    private final /* synthetic */ class_6880<class_1291> a;
    private final /* synthetic */ int b;

    public /* synthetic */ en(class_6880 class_68802, int n2) {
        this.a = class_68802;
        this.b = n2;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{en.class, "type;level", "a", "b"}, this, object);
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{en.class, "type;level", "a", "b"}, this);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{en.class, "type;level", "a", "b"}, this);
    }

    public /* bridge */ /* synthetic */ boolean a(class_1293 class_12932) {
        return class_12932.method_5579().comp_349() == this.a.comp_349() && class_12932.method_5578() == this.b - 1;
    }

    public /* bridge */ /* synthetic */ class_6880 a() {
        return this.a;
    }

    public /* bridge */ /* synthetic */ int a() {
        return this.b;
    }
}

