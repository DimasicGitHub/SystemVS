/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

public final class le {
    private le() {
    }

    private static void b(MethodNode methodNode, ld ld2) {
        for (AbstractInsnNode abstractInsnNode : methodNode.instructions) {
            int n2 = abstractInsnNode.getOpcode();
            if (n2 < 172 || n2 > 177) continue;
            InsnList insnList = le.a(methodNode);
            insnList.add((AbstractInsnNode)le.a(ld2));
            methodNode.instructions.insertBefore(abstractInsnNode, insnList);
        }
    }

    private static void c(MethodNode methodNode, ld ld2) {
        LabelNode labelNode = new LabelNode();
        Type type = Type.getReturnType((String)methodNode.desc);
        InsnList insnList = new InsnList();
        insnList.add((AbstractInsnNode)new MethodInsnNode(184, "b/Boot", "isCallingOriginal", "()Z", false));
        insnList.add((AbstractInsnNode)new JumpInsnNode(154, labelNode));
        insnList.add(le.a(methodNode));
        insnList.add((AbstractInsnNode)le.a(ld2));
        insnList.add((AbstractInsnNode)new InsnNode(type.getOpcode(172)));
        insnList.add((AbstractInsnNode)labelNode);
        methodNode.instructions.insert(insnList);
    }

    private static void d(MethodNode methodNode, ld ld2) {
        InsnList insnList = le.a(methodNode);
        insnList.add((AbstractInsnNode)le.a(ld2));
        LabelNode labelNode = new LabelNode();
        insnList.add((AbstractInsnNode)new JumpInsnNode(154, labelNode));
        Type type = Type.getReturnType((String)methodNode.desc);
        switch (type.getSort()) {
            case 0: {
                insnList.add((AbstractInsnNode)new InsnNode(177));
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                insnList.add((AbstractInsnNode)new InsnNode(3));
                insnList.add((AbstractInsnNode)new InsnNode(172));
                break;
            }
            case 6: {
                insnList.add((AbstractInsnNode)new InsnNode(11));
                insnList.add((AbstractInsnNode)new InsnNode(174));
                break;
            }
            case 7: {
                insnList.add((AbstractInsnNode)new InsnNode(9));
                insnList.add((AbstractInsnNode)new InsnNode(173));
                break;
            }
            case 8: {
                insnList.add((AbstractInsnNode)new InsnNode(14));
                insnList.add((AbstractInsnNode)new InsnNode(175));
                break;
            }
            default: {
                insnList.add((AbstractInsnNode)new InsnNode(1));
                insnList.add((AbstractInsnNode)new InsnNode(176));
            }
        }
        insnList.add((AbstractInsnNode)labelNode);
        methodNode.instructions.insert(insnList);
    }

    public static byte[] a(byte[] byArray, List list) {
        return le.a(byArray, list, null);
    }

    private static MethodInsnNode a(ld ld2) {
        return new MethodInsnNode(184, ld2.d, ld2.e, ld2.f, false);
    }

    private static byte[] a(byte[] byArray, List list, ClassLoader classLoader, boolean bl2) {
        Object object2;
        ClassReader classReader = new ClassReader(byArray);
        HashMap<String, List> hashMap = new HashMap<String, List>();
        HashMap<String, List> hashMap2 = new HashMap<String, List>();
        for (Object object2 : list) {
            if (((ld)object2).c != null) {
                hashMap.computeIfAbsent(((ld)object2).b + ((ld)object2).c, string -> new ArrayList()).add(object2);
                continue;
            }
            hashMap2.computeIfAbsent(((ld)object2).b, string -> new ArrayList()).add(object2);
        }
        Object object3 = Thread.currentThread().getContextClassLoader();
        if (object3 == null) {
            object3 = le.class.getClassLoader();
        }
        object2 = classLoader != null ? classLoader : object3;
        Object object4 = object3;
        int n2 = bl2 ? 3 : 1;
        kB kB2 = new kB(classReader, n2, (ClassLoader)object2, (ClassLoader)object4);
        fW fW2 = new fW(589824, (ClassVisitor)kB2, hashMap, hashMap2);
        classReader.accept((ClassVisitor)fW2, 0);
        return kB2.toByteArray();
    }

    private static Class a(String string, ClassLoader classLoader, ClassLoader classLoader2) {
        String string2 = string.replace('/', '.');
        try {
            return Class.forName(string2, false, classLoader);
        }
        catch (Throwable throwable) {
            if (classLoader2 != classLoader) {
                try {
                    return Class.forName(string2, false, classLoader2);
                }
                catch (Throwable throwable2) {
                    // empty catch block
                }
            }
            try {
                return Class.forName(string2, false, ClassLoader.getSystemClassLoader());
            }
            catch (Throwable throwable3) {
                return null;
            }
        }
    }

    private static InsnList a(MethodNode methodNode) {
        InsnList insnList = new InsnList();
        boolean bl2 = (methodNode.access & 8) != 0;
        int n2 = 0;
        if (!bl2) {
            insnList.add((AbstractInsnNode)new VarInsnNode(25, 0));
            n2 = 1;
        }
        for (Type type : Type.getArgumentTypes((String)methodNode.desc)) {
            insnList.add((AbstractInsnNode)new VarInsnNode(type.getOpcode(21), n2));
            n2 += type.getSize();
        }
        return insnList;
    }

    public static byte[] a(byte[] byArray, List list, ClassLoader classLoader) {
        try {
            return le.a(byArray, list, classLoader, true);
        }
        catch (ArrayIndexOutOfBoundsException | NegativeArraySizeException runtimeException) {
            return le.a(byArray, list, classLoader, false);
        }
    }

    private static void a(MethodNode methodNode, ld ld2) {
        InsnList insnList = le.a(methodNode);
        insnList.add((AbstractInsnNode)le.a(ld2));
        methodNode.instructions.insert(insnList);
    }
}

