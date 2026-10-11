/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_642;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lm {
    private static volatile String a;
    private static volatile String b;

    public static String b() {
        return b;
    }

    public static void b() {
        try {
            a = lo.aM.method_53462().getName();
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            class_642 class_6422 = lo.aM.method_1558();
            b = class_6422 != null ? class_6422.field_3761 : null;
        }
        catch (Exception exception) {
            b = null;
        }
    }

    public static String a() {
        return a;
    }

    public static void a() {
        try {
            a = lo.aM.method_53462().getName();
        }
        catch (Exception exception) {
            a = "unknown";
        }
    }
}

