/*
 * Decompiled with CFR 0.152.
 */
import b.Boot;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

public final class bx {
    private static final String a = Type.getInternalName(bP.class);
    private static final Map<String, String> b = new HashMap<String, String>();
    private static final Map<String, String> c = new HashMap<String, String>();

    private bx() {
    }

    static {
        bx.a();
    }

    private static byte[] a(Class clazz) {
        byte[] byArray;
        block9: {
            String string = clazz.getName().replace('.', '/') + ".class";
            ClassLoader classLoader = clazz.getClassLoader();
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
                catch (Exception exception) {
                    return null;
                }
            }
            inputStream.close();
        }
        return byArray;
    }

    private static boolean a(MethodNode methodNode, int n2) {
        if (methodNode.instructions == null || methodNode.instructions.size() == 0) {
            return false;
        }
        boolean bl2 = false;
        for (AbstractInsnNode abstractInsnNode = methodNode.instructions.getFirst(); abstractInsnNode != null; abstractInsnNode = abstractInsnNode.getNext()) {
            MethodInsnNode methodInsnNode;
            if (!(abstractInsnNode instanceof MethodInsnNode) || (methodInsnNode = (MethodInsnNode)abstractInsnNode).getOpcode() != 184 || !a.equals(methodInsnNode.owner)) continue;
            String string = bx.a(methodInsnNode.name, methodInsnNode.desc);
            String string2 = b.get(string);
            String string3 = c.get(string);
            if (string2 == null || string3 == null) continue;
            methodNode.instructions.insertBefore((AbstractInsnNode)methodInsnNode, (AbstractInsnNode)new LdcInsnNode((Object)n2));
            methodNode.instructions.insertBefore((AbstractInsnNode)methodInsnNode, (AbstractInsnNode)new InsnNode(95));
            methodInsnNode.name = string2;
            methodInsnNode.desc = string3;
            bl2 = true;
        }
        return bl2;
    }

    private static byte[] a(byte[] byArray, String string, Map map) {
        ClassReader classReader = new ClassReader(byArray);
        ClassNode classNode = new ClassNode();
        classReader.accept((ClassVisitor)classNode, 0);
        boolean bl2 = false;
        for (MethodNode methodNode : classNode.methods) {
            Integer n2 = (Integer)map.get(string + "." + methodNode.name + methodNode.desc);
            if (n2 == null || n2 < 0) continue;
            bl2 |= bx.a(methodNode, n2);
        }
        if (!bl2) {
            return null;
        }
        ClassWriter classWriter = new ClassWriter(3);
        classNode.accept((ClassVisitor)classWriter);
        return classWriter.toByteArray();
    }

    private static String a(String string, String string2) {
        return string + string2;
    }

    public static void a(Class clazz, Map map) {
        if (clazz == null || b.isEmpty()) {
            return;
        }
        byte[] byArray = bx.a(clazz);
        if (byArray == null) {
            return;
        }
        String string = Type.getInternalName((Class)clazz);
        byte[] byArray2 = bx.a(byArray, string, map);
        if (byArray2 == null) {
            return;
        }
        try {
            Boot.nativeRedefineClass(clazz, byArray2);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static void a() {
        Object object;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (Method method : bP.class.getDeclaredMethods()) {
            if (!Modifier.isStatic(method.getModifiers()) || !Modifier.isPublic(method.getModifiers())) continue;
            object = method.getParameterTypes();
            Class<?> clazz = method.getReturnType();
            if (((Class<?>[])object).length == 1 && object[0] == Object[].class) {
                hashMap.put(clazz, method);
                continue;
            }
            if (((Class<?>[])object).length != 2 || object[0] != Integer.TYPE || object[1] != Object[].class) continue;
            hashMap2.put(clazz, method);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            Method method;
            Method method2 = (Method)hashMap2.get(entry.getKey());
            if (method2 == null) continue;
            method = (Method)entry.getValue();
            object = bx.a(method.getName(), Type.getMethodDescriptor((Method)method));
            b.put((String)object, method2.getName());
            c.put((String)object, Type.getMethodDescriptor((Method)method2));
        }
    }
}

