/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.function.IntConsumer;
import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_1703;
import net.minecraft.class_1792;
import net.minecraft.class_2596;
import net.minecraft.class_2708;
import net.minecraft.class_2724;
import net.minecraft.class_2815;

public final class y {
    private static final /* synthetic */ Deque<aT> a;
    private static final /* synthetic */ List<at> b;
    private static /* synthetic */ int c;
    private static /* synthetic */ int d;
    private static /* synthetic */ int e;

    private /* synthetic */ y() {
    }

    static {
        a = new ArrayDeque<aT>();
        b = new ArrayList<at>();
        c = 0;
        d = 0;
        e = 0;
    }

    private static /* bridge */ /* synthetic */ void e() {
        if (lo.aM.field_1724 == null || lo.aM.field_1724.field_3944 == null || lo.aM.field_1724.field_7512 == null) {
            return;
        }
        iE.a(2);
        lo.aM.field_1724.field_3944.method_52787((class_2596)new class_2815(lo.aM.field_1724.field_7512.field_7763));
    }

    private static /* bridge */ /* synthetic */ void i() {
        while (d > 0) {
            --d;
            gT.b();
        }
    }

    private static /* bridge */ /* synthetic */ void b(int n2, int n3) {
        y.a(n2, n3);
        bw.d(n2);
    }

    public static /* bridge */ /* synthetic */ void b(aT aT2) {
        if (aT2 == null) {
            return;
        }
        a.removeIf(aT3 -> aT3 == aT2);
        if (a.isEmpty()) {
            if (d > 0) {
                y.i();
            }
            ++e;
        }
        y.a(aT2);
    }

    public static /* bridge */ /* synthetic */ boolean b() {
        return !a.isEmpty() || d > 0 || !b.isEmpty();
    }

    public static /* bridge */ /* synthetic */ void b() {
        if (d > 0) {
            gT.d();
        }
        y.c();
    }

    private static /* bridge */ /* synthetic */ void c() {
        if (!y.b() || bw.a()) {
            c = 0;
            return;
        }
        if (++c >= 20) {
            c = 0;
            a.clear();
            y.i();
            ++e;
            y.a(null);
        }
    }

    private static /* bridge */ /* synthetic */ boolean c() {
        if (lo.aM.field_1724 == null || lo.aM.field_1755 != null) {
            return false;
        }
        class_1703 class_17032 = lo.aM.field_1724.field_7512;
        return class_17032 != null && class_17032.method_34255().method_7960();
    }

    private static /* bridge */ /* synthetic */ void f() {
        ++d;
        gT.a();
    }

    private static /* bridge */ /* synthetic */ void d(aT aT2) {
        if (a.isEmpty()) {
            return;
        }
        if (a.peek() == aT2) {
            a.pop();
        } else {
            a.removeIf(aT3 -> aT3 == aT2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static /* bridge */ /* synthetic */ void a(float f2, float f3) {
        boolean bl2;
        if (lo.aM.field_1761 == null || lo.aM.field_1724 == null) {
            return;
        }
        iE.a(2);
        float f4 = lo.aM.field_1724.method_36454();
        float f5 = lo.aM.field_1724.method_36455();
        boolean bl3 = bl2 = !Float.isNaN(f3) || !Float.isNaN(f2);
        if (bl2) {
            lo.aM.field_1724.method_36456(Float.isNaN(f3) ? f4 : f3);
            lo.aM.field_1724.method_36457(Float.isNaN(f2) ? f5 : f2);
        }
        try {
            lo.aM.field_1761.method_2919((class_1657)lo.aM.field_1724, class_1268.field_5808);
        }
        catch (Throwable throwable) {
        }
        finally {
            if (bl2) {
                lo.aM.field_1724.method_36456(f4);
                lo.aM.field_1724.method_36457(f5);
            }
        }
    }

    private static /* bridge */ /* synthetic */ void a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        try {
            runnable.run();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public static /* bridge */ /* synthetic */ void a(aT aT2, int n2, int n3, int n4, IntConsumer intConsumer) {
        IntConsumer intConsumer2 = intConsumer;
        aT aT3 = aT2;
        IntConsumer intConsumer3 = y.a(intConsumer2, aT3);
        if (lo.aM.field_1724 == null || !y.a()) {
            intConsumer3.accept(-3);
            return;
        }
        int n5 = bw.a();
        int n6 = n2 + 36;
        int[] nArray = new int[]{n5};
        Runnable runnable = () -> intConsumer3.accept(nArray[0]);
        aT aT4 = aT2;
        Runnable runnable2 = () -> {
            if (n5 >= 0) {
                int n7 = n5;
                int n8 = n3;
                int n9 = n4;
                y.a(n7, n9, n8);
                bw.a(n5, n2);
                return;
            }
            int n10 = n6;
            int n11 = n3;
            int n12 = n4;
            y.a(n10, n12, n11);
            nArray[0] = y.a(n4);
        };
        int n7 = 1;
        y.a(runnable, aT4).a().a(runnable2, n7).a();
    }

    public static /* bridge */ /* synthetic */ void a(aT aT2, int n2, Runnable runnable, int n3, class_1792 class_17922, int n4) {
        if (n2 == -3) {
            y.a(y.a(aT2, runnable));
            return;
        }
        int n5 = n4 + 36;
        Runnable runnable2 = y.a(aT2, runnable);
        aT aT3 = aT2;
        Runnable runnable3 = () -> {
            if (lo.aM.field_1724 == null) {
                return;
            }
            boolean bl2 = lo.aM.field_1724.method_31548().method_5438(n4).method_7960();
            if (n2 >= 0) {
                bw.a(n2, n4);
                if (bl2) {
                    return;
                }
                bw.c(n2);
                y.a(n3);
                return;
            }
            if (n2 == -2) {
                int n6 = bw.a(n3, class_17922);
                if (n6 < 0) {
                    return;
                }
                y.b(n3, n6);
                if (y.a()) {
                    return;
                }
                bw.c(n5);
                y.a(n3);
                return;
            }
            if (y.a()) {
                return;
            }
            bw.c(n5);
            y.a(n3);
        };
        int n6 = 1;
        y.a(runnable2, aT3).a().b().a(runnable3, n6).a();
    }

    public static /* bridge */ /* synthetic */ void a(aT aT2, int n2, int n3, Runnable runnable, int n4) {
        Runnable runnable2 = y.a(aT2, runnable);
        if (lo.aM.field_1724 == null || !y.a()) {
            y.a(runnable2);
            return;
        }
        int n5 = n2 + 36;
        iE.a(2);
        Runnable runnable3 = runnable2;
        aT aT3 = aT2;
        Runnable runnable4 = () -> {
            int n5 = n5;
            int n6 = n4;
            int n7 = n3;
            y.a(n5, n7, n6);
        };
        int n6 = 1;
        Runnable runnable5 = () -> {
            bw.c(n5);
            y.a(n3);
        };
        int n7 = 1;
        y.a(runnable3, aT3).a().b().a(runnable4, n6).a(() -> {
            float f2 = Float.NaN;
            float f3 = Float.NaN;
            y.a(f2, f3);
        }).a(runnable5, n7).a();
    }

    private static /* bridge */ /* synthetic */ int a(int n2) {
        if (y.a()) {
            return -3;
        }
        if (bw.b(n2)) {
            return -2;
        }
        int n3 = bw.a();
        if (n3 < 0) {
            return -1;
        }
        bw.c(n3);
        return n3;
    }

    private static /* bridge */ /* synthetic */ void a(aT aT2) {
        if (b.isEmpty()) {
            return;
        }
        ArrayList<at> arrayList = new ArrayList<at>();
        for (at at2 : b) {
            if (aT2 != null && at2.a() != aT2) continue;
            arrayList.add(at2);
        }
        b.removeAll(arrayList);
        for (at at2 : arrayList) {
            y.a(at2.a());
        }
    }

    public static /* bridge */ /* synthetic */ void a(int n2, Runnable runnable, aT aT2, int n3) {
        Runnable runnable2 = y.a(aT2, runnable);
        aT aT3 = aT2;
        Runnable runnable3 = () -> bw.a(n2, n3);
        int n4 = 1;
        y.a(runnable2, aT3).a().b().a(runnable3, n4).a();
    }

    public static /* bridge */ /* synthetic */ void a(aT aT2, int n2, Runnable runnable) {
        Runnable runnable2 = y.a(aT2, runnable);
        aT aT3 = aT2;
        Runnable runnable3 = () -> bw.a(n2);
        int n3 = 1;
        y.a(runnable2, aT3).a().b().a(runnable3, n3).a();
    }

    public static /* bridge */ /* synthetic */ void a(Runnable runnable, aT aT2, int n2) {
        Runnable runnable2 = y.a(aT2, runnable);
        if (lo.aM.field_1724 == null) {
            y.a(runnable2);
            return;
        }
        int n3 = lo.aM.field_1724.method_31548().field_7545;
        iE.a(2);
        Runnable runnable3 = runnable2;
        aT aT3 = aT2;
        Runnable runnable4 = () -> bw.a(n2, n3);
        int n4 = 1;
        Runnable runnable5 = () -> bw.a(n2, n3);
        int n5 = 1;
        y.a(runnable3, aT3).a().b().a(runnable4, n4).a(() -> {
            float f2 = Float.NaN;
            float f3 = Float.NaN;
            y.a(f2, f3);
        }).a(runnable5, n5).a();
    }

    public static /* bridge */ /* synthetic */ void a(int n2, int n3, Runnable runnable, aT aT2) {
        Runnable runnable2 = y.a(aT2, runnable);
        if (lo.aM.field_1724 == null) {
            y.a(runnable2);
            return;
        }
        iE.a(2);
        y.a.push(aT2);
        try {
            lo.aM.field_1724.method_31548().field_7545 = n2;
        }
        catch (Throwable throwable) {
            y.d(aT2);
            y.a(runnable2);
            return;
        }
        bw.a(1, () -> {
            float f2 = Float.NaN;
            float f3 = Float.NaN;
            y.a(f2, f3);
        });
        bw.a(2, () -> {
            try {
                if (lo.aM.field_1724 != null) {
                    lo.aM.field_1724.method_31548().field_7545 = n3;
                }
            }
            finally {
                y.d(aT2);
                y.a(runnable2);
            }
        });
    }

    private static /* bridge */ /* synthetic */ dJ a(Runnable runnable, aT aT2) {
        return new dJ(aT2, runnable);
    }

    private static /* bridge */ /* synthetic */ void a(int n2, int n3, Runnable runnable) {
        if (n2 != e) {
            return;
        }
        if (gT.b() || n3 <= 0) {
            runnable.run();
            return;
        }
        Runnable runnable2 = () -> {
            int n4 = n3 - 1;
            Runnable runnable2 = runnable;
            int n5 = n2;
            y.a(n5, n4, runnable2);
        };
        int n4 = 1;
        bw.a(runnable2, n4);
    }

    private static /* bridge */ /* synthetic */ Runnable a(aT aT2, Runnable runnable) {
        boolean[] blArray = new boolean[]{false};
        at[] atArray = new at[1];
        Runnable runnable2 = () -> {
            if (blArray[0]) {
                return;
            }
            blArray[0] = true;
            b.remove((Object)atArray[0]);
            y.a(runnable);
        };
        atArray[0] = new at(aT2, runnable2);
        b.add(atArray[0]);
        return runnable2;
    }

    private static /* bridge */ /* synthetic */ IntConsumer a(IntConsumer intConsumer, aT aT2) {
        boolean[] blArray = new boolean[]{false};
        at[] atArray = new at[1];
        IntConsumer intConsumer2 = n2 -> {
            if (blArray[0]) {
                return;
            }
            blArray[0] = true;
            b.remove((Object)atArray[0]);
            if (intConsumer != null) {
                try {
                    intConsumer.accept(n2);
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
        };
        atArray[0] = new at(aT2, () -> intConsumer2.accept(-1));
        b.add(atArray[0]);
        return intConsumer2;
    }

    private static /* bridge */ /* synthetic */ void a(int n2, int n3) {
        int n4 = -1;
        int n5 = n2;
        bw.d(n4, n5);
        int n6 = n3;
        int n7 = n2;
        bw.d(n6, n7);
    }

    private static /* bridge */ /* synthetic */ void a(int n2, int n3, int n4) {
        y.b(n3, n4);
        bw.c(n2);
    }

    private static /* bridge */ /* synthetic */ boolean a() {
        return bw.a().method_7960();
    }

    public static /* bridge */ /* synthetic */ void a() {
        a.clear();
        if (d > 0) {
            y.i();
        }
        ++e;
        y.a(null);
    }

    public static /* bridge */ /* synthetic */ void a(lx lx2) {
        if (lx2 == null || lx2.a() != iG.b) {
            return;
        }
        class_2596 class_25962 = lx2.a();
        if (class_25962 instanceof class_2724 || class_25962 instanceof class_2708) {
            y.a();
        }
    }

    private static /* bridge */ /* synthetic */ void g() {
        Runnable runnable = () -> {
            if (d == 0) {
                return;
            }
            --d;
            gT.b();
        };
        int n2 = 1;
        bw.a(runnable, n2);
    }
}

