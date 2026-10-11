/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import net.minecraft.class_2596;
import net.minecraft.class_2670;
import net.minecraft.class_2827;
import net.minecraft.class_634;

public class kf
extends aT {
    private /* synthetic */ gz a;
    private static final /* synthetic */ ScheduledExecutorService b;

    public /* synthetic */ kf() {
        super("\u041f\u0438\u043d\u0433\u0417\u043f\u043e\u043e\u0444", fV.c);
        gz gz2 = new gz("", "", 0.0, 1.0, 1000.0, 10.0);
        gz2.setNameParts(new String[]{"\u041f", "\u0438", "\u043d", "\u0433"});
        gz2.setDescriptionParts(new String[]{"\u0416", "e", "\u043b", "\u0430", "\u0435", "\u043c", "\u044b", "\u0439", " ", "\u043f", "\u0438", "\u043d", "\u0433", " ", "(", "\u043c", "c", ")"});
        this.a = gz2;
        this.a(new fa[]{this.a});
    }

    static {
        b = Executors.newSingleThreadScheduledExecutor(runnable -> {
            Thread thread = new Thread(runnable, "l");
            thread.setDaemon(true);
            return thread;
        });
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
    }

    @Override
    public /* bridge */ /* synthetic */ void a(lx lx2) {
        if (lx2.a() != iG.b) {
            return;
        }
        class_2596 class_25962 = lx2.a();
        if (!(class_25962 instanceof class_2670)) {
            return;
        }
        class_2670 class_26702 = (class_2670)class_25962;
        if (this.a() == null) {
            return;
        }
        lx2.a(true);
        int n2 = this.a.a();
        long l2 = class_26702.method_11517();
        b.schedule(() -> {
            try {
                if (!this.f()) {
                    return;
                }
                class_634 class_6342 = this.a();
                if (class_6342 == null) {
                    return;
                }
                class_6342.method_48296().method_10743((class_2596)new class_2827(l2));
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }, (long)n2, TimeUnit.MILLISECONDS);
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
    }
}

