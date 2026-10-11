/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_1792;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class ex
extends Record {
    private final class_1792 a;
    private final int b;
    private final int c;
    private final int d;

    private ex(class_1792 class_17922, int n2, int n3, int n4) {
        this.a = class_17922;
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ex.class, "item;componentsHash;count;damage", "a", "b", "c", "d"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ex.class, "item;componentsHash;count;damage", "a", "b", "c", "d"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ex.class, "item;componentsHash;count;damage", "a", "b", "c", "d"}, this);
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public int a() {
        return this.b;
    }

    public class_1792 a() {
        return this.a;
    }
}

