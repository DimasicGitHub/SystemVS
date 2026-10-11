/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.Set;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_437;
import net.minecraft.class_465;
import org.lwjgl.glfw.GLFW;

public class bb
extends aT {
    private /* synthetic */ cc<class_1735> a;
    private /* synthetic */ Class<?> b;
    private /* synthetic */ boolean c;
    private /* synthetic */ int d;
    private final /* synthetic */ Set<Integer> e;

    public /* synthetic */ bb() {
        super("\u0418\u0442\u0435\u043c\u0417\u0441\u0440\u043e\u043b\u043b\u0435\u0440", fV.c);
        this.c = false;
        this.d = -1;
        this.e = new HashSet<Integer>();
    }

    @Override
    public /* bridge */ /* synthetic */ void i() {
        class_1735 class_17352;
        if (this.z() || this.a() == null) {
            this.b();
            return;
        }
        boolean bl2 = this.a().field_1832.method_1434() || this.b();
        boolean bl3 = this.a();
        if (!bl2 || !bl3) {
            this.b();
            return;
        }
        class_437 class_4372 = this.a();
        if (!(class_4372 instanceof class_465)) {
            this.b();
            return;
        }
        class_465 class_4652 = (class_465)class_4372;
        int n2 = this.b().field_7512.field_7763;
        if (n2 != this.d) {
            this.e.clear();
            this.d = n2;
        }
        if ((class_17352 = this.a(class_4652)) == null || !class_17352.method_7681()) {
            return;
        }
        if (!this.e.add(class_17352.field_7874)) {
            return;
        }
        this.a().method_2906(this.b().field_7512.field_7763, class_17352.field_7874, 0, class_1713.field_7794, this.b());
    }

    private /* bridge */ /* synthetic */ void b() {
        this.d = -1;
        this.e.clear();
    }

    private /* bridge */ /* synthetic */ boolean b() {
        long l2 = this.a().method_22683().method_4490();
        return GLFW.glfwGetKey((long)l2, (int)340) == 1 || GLFW.glfwGetKey((long)l2, (int)344) == 1;
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.a();
    }

    private /* bridge */ /* synthetic */ boolean a() {
        return GLFW.glfwGetMouseButton((long)this.a().method_22683().method_4490(), (int)0) == 1;
    }

    private /* bridge */ /* synthetic */ class_1735 a(class_465 class_4652) {
        Class<?> clazz = class_4652.getClass();
        if (!this.c || this.b != clazz || this.a == null) {
            this.b = clazz;
            try {
                this.a = new cc((Object)class_4652, class_465.class, class_1735.class);
            }
            catch (Exception exception) {
                this.a = null;
            }
            this.c = true;
        }
        if (this.a == null) {
            return null;
        }
        return (class_1735)this.a.b(class_4652);
    }

    private /* bridge */ /* synthetic */ void a() {
        this.b();
        this.b = null;
        this.a = null;
        this.c = false;
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.a();
    }
}

