/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cc<T> {
    private static final Unsafe a = hW.a;
    private final Object b;
    private final Field c;
    private final boolean d;
    private final Object e;
    private final long f;

    public cc(Object object, Class clazz, Class clazz2) {
        this(object, clazz, clazz2, 0);
    }

    public cc(Object object, Class clazz, Class clazz2, int n2) {
        this(object, cc.a(clazz, clazz2, n2));
    }

    public cc(Object object, Class clazz, int n2) {
        this(object, clazz.getDeclaredFields()[n2]);
    }

    public cc(Object object, Field field) {
        this.b = object;
        this.c = field;
        try {
            field.setAccessible(true);
        }
        catch (Exception exception) {
            // empty catch block
        }
        boolean bl2 = Modifier.isStatic(field.getModifiers());
        Object object2 = null;
        long l2 = 0L;
        try {
            if (bl2) {
                object2 = a.staticFieldBase(field);
                l2 = a.staticFieldOffset(field);
            } else {
                l2 = a.objectFieldOffset(field);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        this.d = bl2;
        this.e = object2;
        this.f = l2;
    }

    public Object b(Object object) {
        try {
            return a.getObject(this.a(object), this.f);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public void b(Object object) {
        this.a(this.b, object);
    }

    public void a(Object object, int n2) {
        try {
            a.putInt(this.a(object), this.f, n2);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void a(double d2) {
        this.a(this.b, d2);
    }

    public void a(Object object, boolean bl2) {
        try {
            a.putBoolean(this.a(object), this.f, bl2);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void a(Object object, double d2) {
        try {
            a.putDouble(this.a(object), this.f, d2);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void a(Object object, Float f2) {
        try {
            a.putFloat(this.a(object), this.f, f2.floatValue());
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void a(Object object, Object object2) {
        try {
            a.putObject(this.a(object), this.f, object2);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public boolean a() {
        return this.a(this.b);
    }

    private static Field a(Class clazz, Class clazz2, int n2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getType().equals(clazz2)) continue;
            if (n2 == 0) {
                return field;
            }
            --n2;
        }
        return null;
    }

    public void a(boolean bl2) {
        this.a(this.b, bl2);
    }

    public void a(int n2) {
        this.a(this.b, n2);
    }

    public void a(Float f2) {
        this.a(this.b, f2);
    }

    public float a(Object object) {
        try {
            return a.getFloat(this.a(object), this.f);
        }
        catch (Exception exception) {
            return 0.0f;
        }
    }

    public int a(Object object) {
        try {
            return a.getInt(this.a(object), this.f);
        }
        catch (Exception exception) {
            return 0;
        }
    }

    public boolean a(Object object) {
        try {
            return a.getBoolean(this.a(object), this.f);
        }
        catch (Exception exception) {
            return false;
        }
    }

    public long a(Object object) {
        try {
            return a.getLong(this.a(object), this.f);
        }
        catch (Exception exception) {
            return 0L;
        }
    }

    public Object a() {
        return this.b(this.b);
    }

    private Object a(Object object) {
        return this.d ? this.e : object;
    }

    public void a(Object object) {
        if (this.a() != object) {
            this.b(object);
        }
    }

    public float a() {
        return this.a(this.b);
    }

    public cc a() {
        try {
            Field field = Field.class.getDeclaredField("modifiers");
            field.setAccessible(true);
            int n2 = this.c.getModifiers();
            field.setInt(this.c, n2 & 0xFFFFFFEF & 0xFFFFFFFD);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return this;
    }

    public int a() {
        return this.a(this.b);
    }

    public long a() {
        return this.a(this.b);
    }
}

