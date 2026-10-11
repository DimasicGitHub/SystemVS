/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_1799;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class jb
extends Record {
    private final class_1799 a;
    private final double b;
    private final float c;
    private final String d;

    private jb(class_1799 class_17992, double d2, float f2, String string) {
        this.a = class_17992;
        this.b = d2;
        this.c = f2;
        this.d = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{jb.class, "stack;remainingSeconds;ratio;label", "a", "b", "c", "d"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{jb.class, "stack;remainingSeconds;ratio;label", "a", "b", "c", "d"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{jb.class, "stack;remainingSeconds;ratio;label", "a", "b", "c", "d"}, this);
    }

    public float a() {
        return this.c;
    }

    public String a() {
        return this.d;
    }

    public double a() {
        return this.b;
    }

    public class_1799 a() {
        return this.a;
    }
}

