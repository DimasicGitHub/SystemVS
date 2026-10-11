/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1935;
import net.minecraft.class_332;
import net.minecraft.class_4587;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ek
implements fU {
    public static final float a = 4.0f;
    private static final int b = 64;
    private static final ek INSTANCE = new ek();
    private final Deque<fI> c = new ArrayDeque<fI>();
    private final im d = new im();
    private final Object e = new Object();
    private int f = 5;
    private long g = 3000L;
    private float h = Float.NaN;

    private ek() {
    }

    public void b(fh fh2) {
        if (fh2 == null) {
            return;
        }
        String string = fh2.L;
        String string2 = "\u0421\u0432\u0430\u043f\u043d\u0443\u043b";
        ct ct2 = this.a(fh2);
        this.a(string2, ct2, string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b(fI fI2) {
        Object object = this.e;
        synchronized (object) {
            this.c.addFirst(fI2);
            this.a();
            if (!Float.isNaN(this.h)) {
                this.a(this.h);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(float f2) {
        float f3 = this.d.a();
        Object object = this.e;
        synchronized (object) {
            this.h = f2;
            Iterator<fI> iterator = this.c.iterator();
            while (iterator.hasNext()) {
                fI fI2 = iterator.next();
                fI2.a(f3);
                if (!fI2.a()) continue;
                iterator.remove();
            }
            this.a(f2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public float b() {
        Object object = this.e;
        synchronized (object) {
            float f2 = 0.0f;
            for (fI fI2 : this.c) {
                if (fI2.a() || !(fI2.a() > f2)) continue;
                f2 = fI2.a();
            }
            return f2;
        }
    }

    public void a(String string, kD kD2, String string2) {
        String string3 = string2;
        String string4 = string;
        ct ct2 = ct.of(kD2);
        this.a(string4, ct2, string3);
    }

    private ct a(fh fh2) {
        if (fh2.K != null) {
            return ct.of(new class_1799((class_1935)fh2.K));
        }
        return ct.of(kD.INFO);
    }

    public void a(String string, String string2, class_1792 class_17922) {
        if (class_17922 == null) {
            return;
        }
        String string3 = string2;
        String string4 = string;
        ct ct2 = ct.of(class_17922);
        this.a(string4, ct2, string3);
    }

    public static ek a() {
        return INSTANCE;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public float a() {
        Object object = this.e;
        synchronized (object) {
            float f2 = 0.0f;
            boolean bl2 = true;
            for (fI fI2 : this.c) {
                if (fI2.a()) continue;
                if (!bl2) {
                    f2 += 4.0f;
                }
                f2 += 32.0f;
                bl2 = false;
            }
            return f2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(float f2, float f3, float f4, bT bT2, float f5, float f6, class_332 class_3322, float f7) {
        Object object = this.e;
        synchronized (object) {
            float f8 = f2 + 16.0f;
            class_4587 class_45872 = class_3322.method_51448();
            float f9 = 0.0f;
            float f10 = f3;
            float f11 = f8;
            float f12 = f4;
            class_4587 class_45873 = class_45872;
            ca.a(f10, f12, f9, f11, class_45873);
            try {
                for (fI fI2 : this.c) {
                    float f13 = f5;
                    float f14 = f6;
                    bT bT3 = bT2;
                    float f15 = f7;
                    float f16 = f4;
                    class_332 class_3323 = class_3322;
                    fI2.a(f13, class_3323, bT3, f16, f15, f14);
                }
            }
            finally {
                class_45872.method_22909();
            }
        }
    }

    private void a() {
        fI fI22;
        int n2 = 0;
        for (fI fI22 : this.c) {
            if (fI22.a()) continue;
            ++n2;
        }
        Iterator<fI> iterator = this.c.descendingIterator();
        while (n2 > this.f && iterator.hasNext()) {
            fI22 = iterator.next();
            if (fI22.a()) continue;
            fI22.a();
            --n2;
        }
        while (this.c.size() > 64 && (fI22 = this.c.pollLast()) != null) {
        }
    }

    private void a(float f2) {
        int n2 = 0;
        for (fI fI2 : this.c) {
            fI2.b(f2 + (float)n2 * 36.0f);
            ++n2;
        }
    }

    private static boolean a() {
        try {
            af af2 = af.a();
            if (af2 == null) {
                return true;
            }
            km km2 = af2.a();
            if (km2 == null) {
                return true;
            }
            dd dd2 = (dd)km2.a(dd.class);
            return dd2 == null || dd2.j().a();
        }
        catch (Exception exception) {
            return true;
        }
    }

    private static boolean a(String string) {
        return string == null || string.isEmpty();
    }

    public fI a(String string, ct ct2, String string2) {
        if (ct2 == null) {
            return null;
        }
        if (ek.a(string2) && ek.a(string)) {
            return null;
        }
        String string3 = string;
        String string4 = string2;
        ct ct3 = ct2;
        fI fI2 = fI.a(string3, ct3, string4);
        this.b(fI2);
        return fI2;
    }

    public void a(String string, ct ct2) {
        String string2 = string;
        String string3 = "";
        ct ct3 = ct2;
        this.a(string3, ct3, string2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(String string, ct ct2, String string2) {
        long l2;
        if (ct2 == null) {
            return;
        }
        if (ek.a(string) && ek.a(string2)) {
            return;
        }
        if (!ek.a()) {
            return;
        }
        Object object = this.e;
        synchronized (object) {
            l2 = this.g;
        }
        long l3 = l2;
        String string3 = string2;
        String string4 = string;
        ct ct3 = ct2;
        this.b(fI.a(ct3, string3, string4, l3));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(int n2, long l2) {
        Object object = this.e;
        synchronized (object) {
            this.f = Math.max(1, n2);
            this.g = Math.max(50L, l2);
        }
    }

    private static String a(double d2) {
        if (d2 >= 10.0) {
            return String.format("%.0f\u0441", d2);
        }
        return String.format("%.1f\u0441", d2);
    }

    public void a(fh fh2, double d2) {
        String string;
        if (fh2 == null) {
            return;
        }
        String string2 = string = d2 > 0.0 ? fh2.L + " \u2014 " + ek.a(d2) : fh2.L;
        String string3 = "\u041a\u0434";
        ct ct2 = this.a(fh2);
        this.a(string3, ct2, string2);
    }

    public void a(fh fh2) {
        if (fh2 == null) {
            return;
        }
        String string = fh2.L;
        String string2 = "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043b";
        ct ct2 = this.a(fh2);
        this.a(string2, ct2, string);
    }

    public void a(boolean bl2, aT aT2) {
        if (aT2 == null) {
            return;
        }
        fV fV2 = aT2.a();
        kD kD2 = fV2 != null ? fV2.a() : kD.INFO;
        String string = bl2 ? "\u0412\u043a\u043b\u044e\u0447\u0451\u043d" : "\u0412\u044b\u043a\u043b\u044e\u0447\u0435\u043d";
        String string2 = an.a(aT2.b());
        String string3 = string;
        ct ct2 = ct.of(kD2);
        this.a(string3, ct2, string2);
    }

    public void a(fI fI2) {
        if (fI2 != null) {
            fI2.b();
        }
    }
}

