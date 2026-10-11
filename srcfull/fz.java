/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class fz
extends Record {
    private final jJ a;
    private final float b;
    private final float c;
    private final float d;

    private fz(jJ jJ2, float f2, float f3, float f4) {
        this.a = jJ2;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fz.class, "row;rx;ry;rw", "a", "b", "c", "d"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fz.class, "row;rx;ry;rw", "a", "b", "c", "d"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fz.class, "row;rx;ry;rw", "a", "b", "c", "d"}, this);
    }

    public float b() {
        return this.c;
    }

    public float c() {
        return this.d;
    }

    public float a() {
        return this.b;
    }

    public jJ a() {
        return this.a;
    }
}

