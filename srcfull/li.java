/*
 * Decompiled with CFR 0.152.
 */
import b.Boot;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.MethodNode;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class li {
    private static final Class<?>[] a = new Class[]{jI.class, ha.class, j.class, fJ.class, dC.class, cj.class, aX.class, eq.class, gY.class, aa.class, g.class, cJ.class, hB.class, hs.class, iF.class, eF.class, X.class, u.class, T.class, cx.class, bM.class, gn.class, cE.class, eh.class, gR.class, cw.class, dL.class, cQ.class, eA.class, fo.class, it.class, fK.class, jK.class, bf.class, bW.class};
    private static final Map<String, List<ld>> b = new ConcurrentHashMap<String, List<ld>>();
    private static final Map<String, byte[]> c = new ConcurrentHashMap<String, byte[]>();
    private static final Map<String, MethodHandle> d = new ConcurrentHashMap<String, MethodHandle>();
    private static final Map<String, Integer> e = new ConcurrentHashMap<String, Integer>();
    private static final aA f = new aA();
    private static final ThreadLocal<Boolean> g = ThreadLocal.withInitial(() -> Boolean.FALSE);
    private static volatile boolean h;
    private static boolean i;
    private static final Map<String, Class<?>> j;

    static {
        j = new ConcurrentHashMap();
    }

    private static void e() {
        for (Map.Entry<String, Class<?>> entry : j.entrySet()) {
            try {
                li.a(entry.getValue(), entry.getKey());
            }
            catch (Throwable throwable) {}
        }
        j.clear();
    }

    public static boolean b() {
        boolean bl2 = g.get();
        if (bl2) {
            g.set(false);
        }
        return bl2;
    }

    public static void b() {
        if (!i) {
            return;
        }
        Thread.currentThread().setContextClassLoader(af.class.getClassLoader());
        for (Class<?> clazz : a) {
            try {
                li.a(clazz);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        li.e();
        for (Class<?> clazz : a) {
            try {
                bx.a(clazz, e);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        h = true;
    }

    public static void c() {
        b.clear();
    }

    public static void d() {
        g.set(true);
    }

    private static byte[] a(ClassLoader classLoader, String string) {
        byte[] byArray;
        block9: {
            if (classLoader == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            }
            InputStream inputStream = classLoader.getResourceAsStream(string);
            try {
                byte[] byArray2 = byArray = inputStream == null ? null : inputStream.readAllBytes();
                if (inputStream == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Throwable throwable3) {
                    return null;
                }
            }
            inputStream.close();
        }
        return byArray;
    }

    private static byte[] a(String string) {
        byte[] byArray;
        Class<?> clazz = null;
        ClassLoader classLoader = null;
        try {
            clazz = Class.forName(string.replace('/', '.'), false, Thread.currentThread().getContextClassLoader());
            classLoader = clazz.getClassLoader();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (clazz != null) {
            try {
                byArray = Boot.nativeDumpClassBytes(clazz);
                if (byArray != null && byArray.length > 0) {
                    return byArray;
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if ((byArray = f.a(string, classLoader)) != null) {
            return byArray;
        }
        String string2 = string + ".class";
        byte[] byArray2 = li.a(af.class.getClassLoader(), string2);
        if (byArray2 == null && classLoader != null) {
            byArray2 = li.a(classLoader, string2);
        }
        return byArray2;
    }

    private static void a(Class clazz, String string) {
        byte[] byArray;
        List<ld> list = b.get(string);
        if (list == null || list.isEmpty()) {
            return;
        }
        byte[] byArray2 = c.computeIfAbsent(string, li::a);
        if (byArray2 == null) {
            return;
        }
        try {
            byArray = le.a(byArray2, list, clazz.getClassLoader());
        }
        catch (Throwable throwable) {
            return;
        }
        if (byArray == null) {
            return;
        }
        try {
            Boot.nativeRedefineClass(clazz, byArray);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static fB a(iD iD2) {
        return switch (iD2) {
            default -> throw new MatchException(null, null);
            case iD.a -> fB.a;
            case iD.b -> fB.b;
            case iD.c -> fB.c;
            case iD.d -> fB.d;
        };
    }

    public static void a() {
        if (i) {
            return;
        }
        try {
            i = Boot.nativePatchMethodReady();
        }
        catch (Throwable throwable) {
            i = false;
        }
        try {
            kE.a();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static void a(Class clazz, hz hz2, Class clazz2, Method method) {
        String string2;
        String string3;
        Object object;
        Object object2;
        Object object3;
        boolean bl2;
        String string4 = Type.getInternalName((Class)clazz);
        String string5 = Type.getInternalName((Class)clazz2);
        fB fB2 = li.a(hz2.at());
        String string6 = Type.getMethodDescriptor((Method)method);
        String string7 = hz2.method();
        String string8 = hz2.desc();
        boolean bl3 = bl2 = string7 != null && !string7.isEmpty() && string8 != null && !string8.isEmpty();
        if (bl2) {
            String string9 = string7;
            object3 = string8;
            if (li.a(clazz, string9, (String)object3) == null && li.a(clazz, (String)(object2 = li.a(clazz, string7, string8)), (String)(object = kE.c(string8))) != null) {
                string9 = object2;
                object3 = object;
            }
            if (li.a(clazz, string9, (String)object3) == null) {
                throw new IllegalArgumentException();
            }
            string3 = string9;
            string2 = object3;
        } else {
            int n2 = hz2.methodIndex();
            if (n2 < 0) {
                throw new IllegalArgumentException();
            }
            object3 = jc.a(clazz, n2);
            if (object3 == null) {
                throw new IllegalArgumentException();
            }
            string3 = ((MethodNode)object3).name;
            string2 = ((MethodNode)object3).desc;
        }
        Method method2 = li.a(clazz, string3, string2);
        object3 = new ld(string4, string3, string2, string5, method.getName(), string6, fB2);
        object2 = string5 + "." + method.getName() + string6;
        li.a(clazz, string3, string2, (String)object2, method2);
        object = d.get(object2);
        if (object != null) {
            ((ld)object3).h = bP.a((MethodHandle)object);
        }
        b.computeIfAbsent(string4, string -> new ArrayList()).add(object3);
        e.put((String)object2, ((ld)object3).h);
        j.put(string4, clazz);
    }

    private static void a(Class clazz) {
        jB jB2 = clazz.getAnnotation(jB.class);
        Class<?> clazz2 = jB2 != null && jB2.value() != Void.TYPE ? jB2.value() : null;
        for (Method method : clazz.getDeclaredMethods()) {
            for (hz hz2 : (hz[])method.getAnnotationsByType(hz.class)) {
                Class<?> clazz3;
                block8: {
                    if (!hz2.targetName().isEmpty()) {
                        try {
                            clazz3 = Class.forName(hz2.targetName(), false, af.class.getClassLoader());
                            break block8;
                        }
                        catch (Throwable throwable) {
                            continue;
                        }
                    }
                    Class<Object> clazz4 = clazz3 = hz2.target() != Void.TYPE ? hz2.target() : clazz2;
                }
                if (clazz3 == null) {
                    throw new IllegalStateException();
                }
                try {
                    li.a(clazz3, hz2, clazz, method);
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
        }
    }

    static MethodHandle a(String string, String string2, String string3) {
        return d.get(string + "." + string2 + string3);
    }

    public static boolean a() {
        return h;
    }

    private static void a(Class clazz, String string, String string2, String string4, Method method) {
        d.computeIfAbsent(string4, string3 -> {
            Method method2 = method;
            if (method2 == null) {
                method2 = li.a(clazz, string, string2);
            }
            if (method2 == null) {
                for (Method method3 : clazz.getDeclaredMethods()) {
                    if (!method3.getName().equals(string)) continue;
                    method2 = method3;
                    break;
                }
            }
            if (method2 == null) {
                return null;
            }
            try {
                method2.setAccessible(true);
                return MethodHandles.lookup().unreflect(method2);
            }
            catch (Throwable throwable) {
                return null;
            }
        });
    }

    private static Method a(Class clazz, String string, String string2) {
        for (Method method : clazz.getDeclaredMethods()) {
            if (!method.getName().equals(string) || !Type.getMethodDescriptor((Method)method).equals(string2)) continue;
            return method;
        }
        return null;
    }

    private static String a(Class clazz, String string, String string2) {
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet<Class> hashSet = new HashSet<Class>();
        arrayDeque.add(clazz);
        while (!arrayDeque.isEmpty()) {
            Class clazz2 = (Class)arrayDeque.poll();
            if (!hashSet.add(clazz2)) continue;
            String string3 = kE.b(Type.getInternalName((Class)clazz2));
            String string4 = kE.methodNamed(string3, string, string2);
            if (!string4.equals(string)) {
                return string4;
            }
            if (clazz2.getSuperclass() != null) {
                arrayDeque.add(clazz2.getSuperclass());
            }
            for (Class<?> clazz3 : clazz2.getInterfaces()) {
                arrayDeque.add(clazz3);
            }
        }
        return string;
    }

    public static byte[] a(String string, byte[] byArray) {
        return null;
    }
}

