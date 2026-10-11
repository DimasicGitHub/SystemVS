/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class jd
extends Record {
    private final hZ a;
    private final float b;

    private jd(hZ hZ2, float f2) {
        this.a = hZ2;
        this.b = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{jd.class, "font;weight", "a", "b"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{jd.class, "font;weight", "a", "b"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{jd.class, "font;weight", "a", "b"}, this);
    }

    public float a() {
        return this.b;
    }

    public hZ a() {
        return this.a;
    }
}

