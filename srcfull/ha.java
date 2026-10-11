/*
 * Decompiled with CFR 0.152.
 */
import io.netty.channel.ChannelHandlerContext;
import java.util.List;
import net.minecraft.class_2535;
import net.minecraft.class_2596;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@jB(value=class_2535.class)
public class ha {
    private static volatile boolean a = false;
    private static volatile boolean b = false;
    private static volatile class_2535 c = null;

    public static boolean b() {
        return b;
    }

    public static void b(boolean bl2) {
        b = bl2;
    }

    public static void a(boolean bl2) {
        a = bl2;
    }

    public static boolean a() {
        return a;
    }

    @hz(method="method_10770", desc="(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/class_2596;)V", at=iD.CANCELLABLE)
    public static boolean a(class_2535 class_25352, ChannelHandlerContext channelHandlerContext, class_2596 class_25962) {
        c = class_25352;
        if (b || kT.a()) {
            return true;
        }
        lx lx2 = new lx(class_25962, iG.b);
        ha.a(lx2);
        return !lx2.a();
    }

    public static class_2535 a() {
        return c;
    }

    private static void a(lx lx2) {
        block6: {
            if (kT.a()) {
                return;
            }
            try {
                y.a(lx2);
                dg.a(lx2);
                bA.a().a(lx2);
                de.a().a(lx2);
                if (af.a() == null || af.a().a() == null) break block6;
                List list = af.a().a().b();
                for (aT aT2 : list) {
                    try {
                        aT2.a(lx2);
                        if (!lx2.a()) continue;
                        break;
                    }
                    catch (Exception exception) {
                    }
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    @hz(method="method_10743", desc="(Lnet/minecraft/class_2596;)V", at=iD.CANCELLABLE)
    public static boolean a(class_2535 class_25352, class_2596 class_25962) {
        c = class_25352;
        if (a || kT.a()) {
            return true;
        }
        lx lx2 = new lx(class_25962, iG.a);
        ha.a(lx2);
        return !lx2.a();
    }
}

