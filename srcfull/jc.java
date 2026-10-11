/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class jc {
    private static final Map<Class<?>, ClassNode> a = new HashMap();
    private static final aA b = new aA();

    private jc() {
    }

    private static boolean a(String string) {
        if (string.startsWith("method_")) {
            return true;
        }
        return switch (string) {
            case "<init>", "<clinit>", "toString", "hashCode", "equals", "close", "run", "call", "tick", "render" -> true;
            default -> false;
        };
    }

    private static ClassNode a(Class clazz, String string) {
        try {
            MethodNode methodNode;
            ClassNode classNode = new ClassNode();
            classNode.version = 65;
            classNode.access = clazz.getModifiers() & 0xFFFF;
            classNode.name = string;
            Class clazz2 = clazz.getSuperclass();
            classNode.superName = clazz2 == null ? null : Type.getInternalName(clazz2);
            for (Method executable : clazz.getDeclaredMethods()) {
                if (!jc.a(executable.getName())) continue;
                methodNode = new MethodNode();
                methodNode.access = executable.getModifiers() & 0xFFFF;
                methodNode.name = executable.getName();
                methodNode.desc = Type.getMethodDescriptor((Method)executable);
                methodNode.exceptions = new ArrayList();
                for (Class<?> clazz3 : executable.getExceptionTypes()) {
                    methodNode.exceptions.add(Type.getInternalName(clazz3));
                }
                classNode.methods.add(methodNode);
            }
            for (Executable executable : clazz.getDeclaredConstructors()) {
                methodNode = new MethodNode();
                methodNode.access = ((Constructor)executable).getModifiers() & 0xFFFF;
                methodNode.name = "<init>";
                methodNode.desc = Type.getConstructorDescriptor((Constructor)executable);
                classNode.methods.add(methodNode);
            }
            return classNode;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private static Class[] a(ClassLoader classLoader, Type[] typeArray) {
        Class[] classArray = new Class[typeArray.length];
        for (int i2 = 0; i2 < typeArray.length; ++i2) {
            try {
                classArray[i2] = jc.a(typeArray[i2], classLoader);
                continue;
            }
            catch (ClassNotFoundException classNotFoundException) {
                return null;
            }
        }
        return classArray;
    }

    private static Class a(Type type, ClassLoader classLoader) throws ClassNotFoundException {
        return switch (type.getSort()) {
            case 1 -> Boolean.TYPE;
            case 2 -> Character.TYPE;
            case 3 -> Byte.TYPE;
            case 4 -> Short.TYPE;
            case 5 -> Integer.TYPE;
            case 6 -> Float.TYPE;
            case 7 -> Long.TYPE;
            case 8 -> Double.TYPE;
            case 9 -> Class.forName(type.getDescriptor().replace('/', '.'), false, classLoader);
            default -> Class.forName(type.getClassName(), false, classLoader);
        };
    }

    private static byte[] a(Class clazz, String string) {
        byte[] byArray;
        block12: {
            Object object;
            try {
                object = b.a(string, clazz.getClassLoader());
                if (object != null) {
                    return object;
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            object = clazz.getClassLoader();
            if (object == null) {
                object = ClassLoader.getSystemClassLoader();
            }
            InputStream inputStream = ((ClassLoader)object).getResourceAsStream(string + ".class");
            try {
                byte[] byArray2 = byArray = inputStream == null ? null : inputStream.readAllBytes();
                if (inputStream == null) break block12;
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

    public static Method a(Class clazz, int n2) {
        MethodNode methodNode = jc.a(clazz, n2);
        if (methodNode == null) {
            return null;
        }
        Class[] classArray = jc.a(clazz.getClassLoader(), Type.getArgumentTypes((String)methodNode.desc));
        if (classArray == null) {
            return null;
        }
        try {
            Method method = clazz.getDeclaredMethod(methodNode.name, classArray);
            method.setAccessible(true);
            return method;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return null;
        }
    }

    public static MethodHandle a(Class clazz, int n2) {
        Method method = jc.a(clazz, n2);
        if (method == null) {
            return null;
        }
        try {
            return MethodHandles.lookup().unreflect(method);
        }
        catch (IllegalAccessException illegalAccessException) {
            return null;
        }
    }

    private static synchronized ClassNode a(Class clazz) {
        ClassNode classNode;
        ClassNode classNode2 = a.get(clazz);
        if (classNode2 != null) {
            return classNode2;
        }
        String string = Type.getInternalName((Class)clazz);
        byte[] byArray = jc.a(clazz, string);
        if (byArray != null) {
            try {
                ClassReader classReader = new ClassReader(byArray);
                ClassNode classNode3 = new ClassNode();
                classReader.accept((ClassVisitor)classNode3, 7);
                a.put(clazz, classNode3);
                return classNode3;
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if ((classNode = jc.a(clazz, string)) != null) {
            a.put(clazz, classNode);
        }
        return classNode;
    }

    public static MethodNode a(Class clazz, int n2) {
        ClassNode classNode = jc.a(clazz);
        if (classNode == null || n2 < 0 || n2 >= classNode.methods.size()) {
            return null;
        }
        return (MethodNode)classNode.methods.get(n2);
    }
}

