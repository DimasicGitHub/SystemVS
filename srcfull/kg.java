/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_465;

public final class kg {
    private static /* synthetic */ cc<Integer> a;
    private static /* synthetic */ cc<Integer> b;
    private static /* synthetic */ cc<Integer> c;
    private static /* synthetic */ cc<Integer> d;
    private static /* synthetic */ boolean e;

    private /* synthetic */ kg() {
    }

    static {
        e = false;
    }

    public static /* bridge */ /* synthetic */ int[] a(class_465 class_4652) {
        if (class_4652 == null) {
            return new int[]{0, 0};
        }
        kg.a();
        int n2 = a.a(class_4652);
        int n3 = b.a(class_4652);
        if (n2 != 0 || n3 != 0) {
            return new int[]{n2, n3};
        }
        int n4 = c.a(class_4652);
        int n5 = d.a(class_4652);
        if (n4 == 0) {
            n4 = 176;
        }
        if (n5 == 0) {
            n5 = 166;
        }
        return new int[]{(class_4652.field_22789 - n4) / 2, (class_4652.field_22790 - n5) / 2};
    }

    private static /* bridge */ /* synthetic */ void a() {
        if (e) {
            return;
        }
        a = new cc(null, class_465.class, 23);
        b = new cc(null, class_465.class, 24);
        c = new cc(null, class_465.class, 9);
        d = new cc(null, class_465.class, 10);
        e = true;
    }
}

