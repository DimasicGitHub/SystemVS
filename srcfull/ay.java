/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_310;
import net.minecraft.class_3489;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4587;
import net.minecraft.class_9290;
import net.minecraft.class_9334;
import net.minecraft.class_9801;
import org.joml.Matrix4f;

public class ay
extends aT {
    private static final /* synthetic */ Pattern a;
    private static final /* synthetic */ List<String> b;
    private /* synthetic */ fr c;
    private /* synthetic */ lw d;
    private /* synthetic */ lw e;
    private /* synthetic */ lw f;
    private /* synthetic */ lw g;
    private /* synthetic */ lw h;
    private /* synthetic */ lw i;
    private /* synthetic */ lw j;
    private /* synthetic */ iP k;
    private /* synthetic */ dw l;
    private /* synthetic */ dw m;
    private /* synthetic */ eP n;
    private /* synthetic */ int o;
    private /* synthetic */ int p;
    private /* synthetic */ float q;
    private /* synthetic */ boolean r;
    private /* synthetic */ int s;

    public /* synthetic */ ay() {
        super("\u0418\u0442\u0435\u043c\u0420\u0430\u0434\u0438\u0443\u0437", fV.d);
        fr fr2 = new fr("", "", b, b);
        fr2.setNameParts(new String[]{"\u041f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", "\u044b"});
        fr2.setDescriptionParts(new String[]{"\u0414", "\u043b", "\u044f", " ", "\u043a", "a", "\u043a", "\u0438", "\u0445", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", "\u043e", "\u0432", " ", "\u0440", "\u0438", "c", "\u043e", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0440", "a", "\u0434", "\u0438", "\u0443", "\u0441"});
        this.c = fr2;
        lw lw2 = new lw("", "", -16755456, true);
        lw2.setNameParts(new String[]{"\u0414", "e", "\u0437", "\u043a", "\u0430"});
        lw2.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u0440", "a", "\u0434", "\u0438", "\u0443", "\u0441", "\u0430", " ", "\u0434", "e", "\u0437", "\u043a", "\u0438"});
        this.d = lw2;
        lw lw3 = new lw("", "", -6710887, true);
        lw3.setNameParts(new String[]{"\u042f", "\u0432", "\u043a", "a"});
        lw3.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u0440", "a", "\u0434", "\u0438", "\u0443", "\u0441", "\u0430", " ", "\u044f", "\u0432", "\u043a", "\u0438"});
        this.e = lw3;
        lw lw4 = new lw("", "", -11206656, true);
        lw4.setNameParts(new String[]{"O", "\u0433", "\u043d", "\u0435", "\u043d", "\u043d", "\u044b", "\u0439", " ", "\u0437", "a", "\u0440", "\u044f", "\u0434"});
        lw4.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u0440", "a", "\u0434", "\u0438", "\u0443", "\u0441", "\u0430", " ", "\u0437", "a", "\u0440", "\u044f", "\u0434", "\u0430"});
        this.f = lw4;
        lw lw5 = new lw("", "", -16737895, true);
        lw5.setNameParts(new String[]{"\u0411", "o", "\u0436", "\u044c", "\u044f", " ", "a", "\u0443", "\u0440", "\u0430"});
        lw5.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u0440", "a", "\u0434", "\u0438", "\u0443", "\u0441", "\u0430", " ", "a", "\u0443", "\u0440", "\u044b"});
        this.g = lw5;
        lw lw6 = new lw("", "", -7650029, true);
        lw6.setNameParts(new String[]{"T", "\u0440", "\u0430", "\u043f", "\u043a", "\u0430"});
        lw6.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u043a", "\u0443", "\u0431", "a", " ", "\u0442", "\u0440", "a", "\u043f", "\u043a", "\u0438"});
        this.h = lw6;
        lw lw7 = new lw("", "", -13421773, true);
        lw7.setNameParts(new String[]{"\u041f", "\u043b", "a", "\u0441", "\u0442"});
        lw7.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u043f", "\u043b", "a", "\u0441", "\u0442", "\u0430"});
        this.i = lw7;
        lw lw8 = new lw("", "", -1, true);
        lw8.setNameParts(new String[]{"\u0411", "\u0443", "\u043b", "\u044c", "\u0434", "o", "\u0437", "\u0435", "\u0440"});
        lw8.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u043f", "\u0440", "e", "\u0432", "\u044c", "\u044e", " ", "\u0431", "\u0443", "\u043b", "\u044c", "\u0434", "o", "\u0437", "\u0435", "\u0440", "\u0430"});
        this.j = lw8;
        iP iP2 = new iP("", "", true, -16711800, true);
        iP2.setNameParts(new String[]{"\u041f", "o", "\u0434", "\u0441", "\u0432", "\u0435", "\u0442", "\u043a", "\u0430", " ", "\u043f", "o", "\u043f", "\u0430", "\u0434", "\u0430", "\u043d", "\u0438", "\u044f"});
        iP2.setDescriptionParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u043f", "o", "\u0434", "\u0441", "\u0432", "\u0435", "\u0442", "\u043a", "\u0443", " ", "\u043f", "p", "\u0438", " ", "\u043f", "o", "\u043f", "\u0430", "\u0434", "\u0430", "\u043d", "\u0438", "\u0438", " ", "\u0438", "\u0433", "\u0440", "o", "\u043a", "\u043e", "\u0432", " ", "\u0432", " ", "\u0437", "o", "\u043d", "\u0443"});
        this.k = iP2;
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"\u0417", "a", "\u043f", "\u043e", "\u043b", "\u043d", "\u0435", "\u043d", "\u0438", "\u0435"});
        dw2.setDescriptionParts(new String[]{"\u0417", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0430", " ", "\u0444", "\u0438", "\u0433", "y", "\u0440"});
        this.l = dw2;
        dw dw3 = new dw("", "", false);
        dw3.setNameParts(new String[]{"C", "\u043a", "\u0438", "\u043d", " ", "\u0434", "\u0440", "a", "\u043a", "\u043e", "\u043d", "\u0430"});
        dw3.setDescriptionParts(new String[]{"\u0418", "c", "\u043f", "\u043e", "\u043b", "\u044c", "\u0437", "\u043e", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0444", "o", "\u0440", "\u043c", "\u0443", " ", "\u0442", "\u0440", "a", "\u043f", "\u043a", "\u0438", "/", "\u043f", "\u043b", "a", "\u0441", "\u0442", "\u0430", " ", "\u0434", "\u043b", "\u044f", " ", "\u0434", "\u0440", "a", "\u043a", "\u043e", "\u043d", "\u044c", "\u0435", "\u0433", "\u043e", " ", "c", "\u043a", "\u0438", "\u043d", "\u0430"});
        this.m = dw3;
        eP eP2 = new eP("", "");
        eP2.setNameParts(new String[]{"O", "\u043f", "\u0440", "\u0435", "\u0434", "\u0435", "\u043b", "\u0438", "\u0442", "\u044c", " ", "c", "\u043a", "\u0438", "\u043d"});
        eP2.setDescriptionParts(new String[]{"\u041d", "a", "\u0439", "\u0442", "\u0438", " ", "\u0442", "\u0440", "a", "\u043f", "\u043a", "\u0443", " ", "\u0432", " ", "\u0438", "\u043d", "\u0432", "e", "\u043d", "\u0442", "\u0430", "\u0440", "\u0435", " ", "\u0438", " ", "\u0432", "\u044b", "c", "\u0442", "\u0430", "\u0432", "\u0438", "\u0442", "\u044c", " ", "c", "\u043a", "\u0438", "\u043d", " ", "\u043f", "o", " ", "l", "o", "r", "e"});
        this.n = eP2;
        this.o = 0;
        this.p = 0;
        this.q = 0.0f;
        this.r = false;
        this.s = -1;
        IdentityHashMap<lw, class_1792> identityHashMap = new IdentityHashMap<lw, class_1792>();
        identityHashMap.put(this.d, class_1802.field_8449);
        identityHashMap.put(this.e, class_1802.field_8479);
        identityHashMap.put(this.f, class_1802.field_8814);
        identityHashMap.put(this.g, class_1802.field_8614);
        identityHashMap.put(this.h, class_1802.field_22021);
        identityHashMap.put(this.i, class_1802.field_8551);
        identityHashMap.put(this.j, class_1802.field_22024);
        this.d.a(() -> this.c.a(fh.a.L));
        this.e.a(() -> this.c.a(fh.c.L));
        this.f.a(() -> this.c.a(fh.b.L));
        this.g.a(() -> this.c.a(fh.s.L));
        this.h.a(() -> this.c.a(fh.f.L));
        this.i.a(() -> this.c.a(fh.g.L));
        this.j.a(() -> this.c.a("\u0411\u0443\u043b\u044c\u0434o\u0437\u0435\u0440"));
        hE hE2 = new hE("", "", this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        hE2.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", "\u0430"});
        hE2.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u0440", "a", "\u0434", "\u0438", "\u0443", "\u0441", "\u0430", " ", "\u0434", "\u043b", "\u044f", " ", "\u043a", "a", "\u0436", "\u0434", "\u043e", "\u0433", "\u043e", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", "\u0430", "."});
        hE hE3 = hE2;
        hE3.a((T fa2) -> {
            class_1792 class_17922 = (class_1792)identityHashMap.get(fa2);
            return class_17922 != null ? new class_1799((class_1935)class_17922) : class_1799.field_8037;
        });
        this.a(this.c, hE3, this.k, this.l, this.m, this.n);
        this.n.a(() -> {
            class_1657 class_16572 = this.b();
            if (class_16572 == null) {
                return;
            }
            class_1799 class_17992 = ay.a(class_16572);
            if (class_17992 == null) {
                return;
            }
            boolean bl2 = ay.a(class_17992);
            this.m.a(bl2);
        });
    }

    static {
        a = Pattern.compile("\u0431\u0443\u043b\u044c\u0434\u043e\u0437\u0435\u0440\\s*(iii|ii|i|\\d+)?", 66);
        b = List.of(fh.a.L, fh.c.L, fh.b.L, fh.s.L, fh.f.L, fh.g.L, "\u0411\u0443\u043b\u044c\u0434o\u0437\u0435\u0440");
    }

    private static /* bridge */ /* synthetic */ boolean b(class_1657 class_16572, class_1657 class_16573) {
        return class_16573 == class_16572 || !class_16573.method_5805() || class_16573.method_7325() || class_16573.method_5767() || class_16573.method_5756(class_16572);
    }

    private static /* bridge */ /* synthetic */ int b(class_1799 class_17992) {
        class_2561 class_25612;
        if (class_17992 == null || class_17992.method_7960() || !class_17992.method_31573(class_3489.field_42614)) {
            return 0;
        }
        int n2 = 0;
        class_9290 class_92902 = (class_9290)class_17992.method_57824(class_9334.field_49632);
        if (class_92902 != null) {
            class_25612 = class_92902.comp_2400().iterator();
            while (class_25612.hasNext()) {
                class_2561 class_25613 = (class_2561)class_25612.next();
                n2 = Math.max(n2, ay.a(class_25613.getString()));
            }
        }
        if ((class_25612 = (class_2561)class_17992.method_57824(class_9334.field_49631)) != null) {
            n2 = Math.max(n2, ay.a(class_25612.getString()));
        }
        return n2;
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.a();
    }

    @Override
    public /* bridge */ /* synthetic */ void f(H h2) {
        if (this.z()) {
            return;
        }
        class_1657 class_16572 = this.b();
        if (class_16572 == null) {
            return;
        }
        float f2 = h2.a().method_60637(false);
        class_4587 class_45872 = h2.a();
        class_243 class_2432 = h2.a().method_19326();
        int n2 = this.a(class_16572);
        if (n2 == -1) {
            this.s = -1;
            return;
        }
        switch (n2) {
            case 0: {
                int n3 = this.d.a();
                int n4 = 0;
                double d2 = 10.0;
                class_1657 class_16573 = class_16572;
                float f3 = f2;
                class_243 class_2433 = class_2432;
                class_4587 class_45873 = class_45872;
                this.a(n3, n4, d2, f3, class_16573, class_2433, class_45873);
                break;
            }
            case 1: {
                int n5 = this.e.a();
                int n6 = 1;
                double d3 = 10.0;
                class_1657 class_16574 = class_16572;
                float f4 = f2;
                class_243 class_2434 = class_2432;
                class_4587 class_45874 = class_45872;
                this.a(n5, n6, d3, f4, class_16574, class_2434, class_45874);
                break;
            }
            case 2: {
                int n7 = this.f.a();
                int n8 = 2;
                double d4 = 10.0;
                class_1657 class_16575 = class_16572;
                float f5 = f2;
                class_243 class_2435 = class_2432;
                class_4587 class_45875 = class_45872;
                this.a(n7, n8, d4, f5, class_16575, class_2435, class_45875);
                break;
            }
            case 3: {
                int n9 = this.g.a();
                int n10 = 3;
                double d5 = 2.0;
                class_1657 class_16576 = class_16572;
                float f6 = f2;
                class_243 class_2436 = class_2432;
                class_4587 class_45876 = class_45872;
                this.a(n9, n10, d5, f6, class_16576, class_2436, class_45876);
                break;
            }
            case 4: {
                this.a(class_45872, class_2432, f2, class_16572);
                break;
            }
            case 5: {
                class_1657 class_16577 = class_16572;
                float f7 = f2;
                class_243 class_2437 = class_2432;
                class_4587 class_45877 = class_45872;
                this.a(class_2437, class_45877, f7, class_16577);
                break;
            }
            case 6: {
                class_1657 class_16578 = class_16572;
                float f8 = f2;
                class_243 class_2438 = class_2432;
                class_4587 class_45878 = class_45872;
                this.a(class_2438, f8, class_16578, class_45878);
            }
        }
    }

    private /* bridge */ /* synthetic */ boolean a(class_1657 class_16572, class_1657 class_16573) {
        class_243[] class_243Array;
        if (this.a() == null) {
            return false;
        }
        class_243 class_2432 = class_16573.method_33571();
        class_238 class_2383 = class_16572.method_5829();
        for (class_243 class_2433 : class_243Array = new class_243[]{class_16572.method_33571(), class_2383.method_1005(), new class_243(class_2383.field_1323, class_2383.method_1005().field_1351, class_2383.field_1321), new class_243(class_2383.field_1320, class_2383.method_1005().field_1351, class_2383.field_1324)}) {
            class_3965 class_39652 = this.a().method_17742(new class_3959(class_2432, class_2433, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)class_16573));
            if (class_39652.method_17783() != class_239.class_240.field_1333) continue;
            return true;
        }
        return false;
    }

    private static /* bridge */ /* synthetic */ class_243 a(class_1657 class_16572, float f2) {
        return new class_243(class_3532.method_16436((double)f2, (double)class_16572.field_6014, (double)class_16572.method_23317()), class_3532.method_16436((double)f2, (double)class_16572.field_6036, (double)class_16572.method_23318()), class_3532.method_16436((double)f2, (double)class_16572.field_5969, (double)class_16572.method_23321()));
    }

    private /* bridge */ /* synthetic */ boolean a(class_1657 class_16572, List list) {
        if (this.a() == null) {
            return false;
        }
        for (class_1657 class_16573 : this.a().method_18456()) {
            if (ay.b(class_16572, class_16573)) continue;
            class_2338 class_23382 = class_16573.method_24515();
            for (class_2338 class_23383 : list) {
                if (!class_23383.equals((Object)class_23382)) continue;
                return true;
            }
        }
        return false;
    }

    private static /* bridge */ /* synthetic */ int a(float f2, int n2, int n3) {
        int n4 = n3 >> 24 & 0xFF;
        int n5 = n3 >> 16 & 0xFF;
        int n6 = n3 >> 8 & 0xFF;
        int n7 = n3 & 0xFF;
        int n8 = n2 >> 24 & 0xFF;
        int n9 = n2 >> 16 & 0xFF;
        int n10 = n2 >> 8 & 0xFF;
        int n11 = n2 & 0xFF;
        return (int)((float)n4 + (float)(n8 - n4) * f2) << 24 | (int)((float)n5 + (float)(n9 - n5) * f2) << 16 | (int)((float)n6 + (float)(n10 - n6) * f2) << 8 | (int)((float)n7 + (float)(n11 - n7) * f2);
    }

    private static /* bridge */ /* synthetic */ int a(int n2, int n3) {
        return n2 << 24 | n3 & 0xFFFFFF;
    }

    private /* bridge */ /* synthetic */ boolean a(double d2, class_243 class_2432, class_1657 class_16572) {
        if (this.a() == null) {
            return false;
        }
        double d3 = d2 * d2;
        for (class_1657 class_16573 : this.a().method_18456()) {
            class_1657 class_16574;
            class_1657 class_16575;
            if (ay.b(class_16572, class_16573) || !this.a(class_16575 = class_16573, class_16574 = class_16572) || !(class_16573.method_19538().method_1025(class_2432) <= d3)) continue;
            return true;
        }
        return false;
    }

    private /* bridge */ /* synthetic */ boolean a(class_1657 class_16572, class_238 class_2383) {
        if (this.a() == null) {
            return false;
        }
        for (class_1657 class_16573 : this.a().method_18456()) {
            class_1657 class_16574;
            class_1657 class_16575;
            if (ay.b(class_16572, class_16573) || !this.a(class_16575 = class_16573, class_16574 = class_16572) || !class_16573.method_5829().method_994(class_2383)) continue;
            return true;
        }
        return false;
    }

    private /* bridge */ /* synthetic */ void a(String string) {
        class_1657 class_16572 = this.b();
        if (class_16572 != null) {
            class_16572.method_7353((class_2561)class_2561.method_43470((String)string), false);
        }
    }

    private /* bridge */ /* synthetic */ void a(int n2, List list, int n3, class_4587 class_45872, class_243 class_2432) {
        class_265 class_2652 = class_259.method_1073();
        for (class_2338 class_23382 : list) {
            class_2652 = class_259.method_1084((class_265)class_2652, (class_265)class_259.method_1078((class_238)new class_238(class_23382)));
        }
        for (class_2338 class_23382 : class_2652.method_1097().method_1090()) {
            int n4 = n2;
            int n5 = n3;
            class_2338 class_23383 = class_23382;
            class_243 class_2433 = class_2432;
            class_4587 class_45873 = class_45872;
            this.a(n5, class_45873, n4, (class_238)class_23383, class_2433);
        }
    }

    private static /* bridge */ /* synthetic */ float a(float f2) {
        float f3 = class_3532.method_15393((float)f2);
        return f3 < 0.0f ? f3 + 360.0f : f3;
    }

    private static /* bridge */ /* synthetic */ Integer a(float f2) {
        for (int n2 : new int[]{45, 135, 225, 315}) {
            if (!(Math.abs(f2 - (float)n2) < 22.0f)) continue;
            return n2;
        }
        return null;
    }

    private static /* bridge */ /* synthetic */ class_1799 a(class_1657 class_16572) {
        for (int i2 = 0; i2 < class_16572.method_31548().method_5439(); ++i2) {
            fh fh2 = fh.f;
            class_1799 class_17992 = class_16572.method_31548().method_5438(i2);
            class_1799 class_17993 = class_17992;
            if (!ay.a(fh2, class_17993)) continue;
            return class_17992;
        }
        return null;
    }

    private static /* bridge */ /* synthetic */ boolean a(class_1799 class_17992) {
        class_2561 class_25612 = (class_2561)class_17992.method_57824(class_9334.field_49631);
        if (class_25612 != null && class_25612.getString().toLowerCase(Locale.ROOT).contains("\u0434\u0440\u0430\u043a\u043e\u043d")) {
            return true;
        }
        class_9290 class_92902 = (class_9290)class_17992.method_57824(class_9334.field_49632);
        if (class_92902 != null) {
            for (class_2561 class_25613 : class_92902.comp_2400()) {
                if (!class_25613.getString().toLowerCase(Locale.ROOT).contains("\u0434\u0440\u0430\u043a\u043e\u043d")) continue;
                return true;
            }
        }
        return false;
    }

    private /* bridge */ /* synthetic */ void a(int n2, int n3, double d2, float f2, class_1657 class_16572, class_243 class_2432, class_4587 class_45872) {
        class_243 class_2433 = ay.a(class_16572, f2);
        class_243 class_2434 = new class_243(class_2433.field_1352, class_2433.field_1351 + (double)class_16572.method_17682() - 1.4, class_2433.field_1350);
        double d3 = d2;
        class_243 class_2435 = class_2434;
        class_1657 class_16573 = class_16572;
        float f3 = f2;
        boolean bl2 = this.a(d3, class_2435, class_16573);
        int n4 = n2;
        int n5 = n3;
        this.a(n5, f3, bl2, n4);
        int n6 = this.p;
        class_243 class_2436 = class_2432;
        double d4 = d2;
        class_243 class_2437 = class_2434;
        class_4587 class_45873 = class_45872;
        this.a(class_2436, class_2437, class_45873, n6, d4);
        if (this.l.a()) {
            int n7 = this.o;
            class_243 class_2438 = class_2432;
            double d5 = d2;
            class_243 class_2439 = class_2434;
            class_4587 class_45874 = class_45872;
            this.a(n7, d5, class_2438, class_2439, class_45874);
        }
    }

    private /* bridge */ /* synthetic */ void a(class_243 class_2432, class_243 class_2433, class_4587 class_45872, int n2, double d2) {
        float[] fArray = gv.a(n2);
        float f2 = (float)(class_2433.field_1352 - class_2432.field_1352);
        float f3 = (float)(class_2433.field_1351 - class_2432.field_1351);
        float f4 = (float)(class_2433.field_1350 - class_2432.field_1350);
        float f5 = (float)d2;
        class_287 class_2872 = gv.a(0.5f);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f6 = f2;
        float f7 = f4 - f5;
        for (float f8 = 5.0f; f8 <= 360.0f; f8 += 5.0f) {
            float f9 = (float)Math.toRadians(f8);
            float f10 = f2 + class_3532.method_15374((float)f9) * f5;
            float f11 = f4 - class_3532.method_15362((float)f9) * f5;
            float f12 = fArray[3];
            float f13 = fArray[2];
            float f14 = fArray[1];
            float f15 = fArray[0];
            float f16 = f11;
            float f17 = f3;
            float f18 = f10;
            float f19 = f7;
            float f20 = f3;
            float f21 = f6;
            Matrix4f matrix4f2 = matrix4f;
            class_287 class_2873 = class_2872;
            gv.a(class_2873, f13, f17, f12, f14, f21, f15, f16, f20, f19, matrix4f2, f18);
            f6 = f10;
            f7 = f11;
        }
        gv.a(class_2872);
    }

    private /* bridge */ /* synthetic */ void a(int n2, double d2, class_243 class_2432, class_243 class_2433, class_4587 class_45872) {
        float[] fArray = gv.a(n2);
        float f2 = (float)(class_2433.field_1352 - class_2432.field_1352);
        float f3 = (float)(class_2433.field_1351 - class_2432.field_1351);
        float f4 = (float)(class_2433.field_1350 - class_2432.field_1350);
        float f5 = (float)d2;
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27381, class_290.field_1576);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_2872.method_22918(matrix4f, f2, f3, f4).method_22915(fArray[0], fArray[1], fArray[2], fArray[3]);
        for (float f6 = 0.0f; f6 <= 360.0f; f6 += 5.0f) {
            float f7 = (float)Math.toRadians(f6);
            float f8 = f2 + class_3532.method_15374((float)f7) * f5;
            float f9 = f4 - class_3532.method_15362((float)f7) * f5;
            class_2872.method_22918(matrix4f, f8, f3, f9).method_22915(fArray[0], fArray[1], fArray[2], fArray[3]);
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private /* bridge */ /* synthetic */ void a(class_4587 class_45872, class_243 class_2432, float f2, class_1657 class_16572) {
        class_238 class_2383 = this.a(class_16572);
        float f3 = f2;
        boolean bl2 = this.a(class_16572, class_2383);
        int n2 = this.h.a();
        int n3 = 4;
        this.a(n3, f3, bl2, n2);
        int n4 = this.o;
        int n5 = this.p;
        class_238 class_2384 = class_2383;
        class_243 class_2433 = class_2432;
        class_4587 class_45873 = class_45872;
        this.a(n5, class_45873, n4, class_2384, class_2433);
    }

    private /* bridge */ /* synthetic */ class_238 a(class_1657 class_16572) {
        class_2338 class_23382 = class_16572.method_24515();
        boolean bl2 = this.m.a();
        if (bl2) {
            return new class_238((double)class_23382.method_10263() - 2.0, (double)class_23382.method_10264(), (double)class_23382.method_10260() - 2.0, (double)class_23382.method_10263() + 3.0, (double)class_23382.method_10264() + 5.0, (double)class_23382.method_10260() + 3.0);
        }
        return new class_238((double)class_23382.method_10263() - 1.0, (double)class_23382.method_10264(), (double)class_23382.method_10260() - 1.0, (double)class_23382.method_10263() + 2.0, (double)class_23382.method_10264() + 3.0, (double)class_23382.method_10260() + 2.0);
    }

    private /* bridge */ /* synthetic */ void a(class_243 class_2432, class_4587 class_45872, float f2, class_1657 class_16572) {
        boolean bl2 = this.m.a();
        class_2338 class_23382 = class_16572.method_24515();
        float f3 = class_16572.method_36455();
        float f4 = ay.a(class_16572.method_36454());
        if (Math.abs(f3) <= 45.0f) {
            Integer n2 = ay.a(f4);
            if (n2 != null) {
                boolean bl3 = bl2;
                int n3 = n2;
                class_2338 class_23383 = class_23382;
                List list = ay.a(class_23383, bl3, n3);
                float f5 = f2;
                boolean bl4 = this.a(class_16572, list);
                int n4 = this.i.a();
                int n5 = 5;
                this.a(n5, f5, bl4, n4);
                int n6 = this.o;
                int n7 = this.p;
                List list2 = list;
                class_243 class_2433 = class_2432;
                class_4587 class_45873 = class_45872;
                this.a(n6, list2, n7, class_45873, class_2433);
                return;
            }
            boolean bl5 = bl2;
            float f6 = f4;
            class_2338 class_23384 = class_23382;
            class_238 class_2383 = ay.a(bl5, f6, class_23384);
            class_1657 class_16573 = class_16572;
            float f7 = f2;
            class_243 class_2434 = class_2432;
            class_4587 class_45874 = class_45872;
            this.a(class_45874, class_2383, class_2434, f7, class_16573);
        } else if (f3 < -45.0f) {
            class_238 class_2384 = ay.a(class_23382, bl2);
            class_1657 class_16574 = class_16572;
            float f8 = f2;
            class_243 class_2435 = class_2432;
            class_4587 class_45875 = class_45872;
            this.a(class_45875, class_2384, class_2435, f8, class_16574);
        } else {
            boolean bl6 = bl2;
            class_2338 class_23385 = class_23382;
            class_238 class_2385 = ay.a(bl6, class_23385);
            class_1657 class_16575 = class_16572;
            float f9 = f2;
            class_243 class_2436 = class_2432;
            class_4587 class_45876 = class_45872;
            this.a(class_45876, class_2385, class_2436, f9, class_16575);
        }
    }

    private /* bridge */ /* synthetic */ void a() {
        this.s = -1;
        this.q = 0.0f;
        this.r = false;
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return this.m.a();
    }

    private /* bridge */ /* synthetic */ int a(class_1657 class_16572) {
        class_1799 class_17992 = class_16572.method_6047();
        int n2 = ay.b(class_17992);
        if (n2 > 0 && this.c.a("\u0411\u0443\u043b\u044c\u0434o\u0437\u0435\u0440")) {
            return 6;
        }
        int n3 = this.a(class_17992);
        if (n3 != -1) {
            return n3;
        }
        return this.a(class_16572.method_6079());
    }

    private /* bridge */ /* synthetic */ int a(class_1799 class_17992) {
        if (class_17992 == null || class_17992.method_7960()) {
            return -1;
        }
        fh fh2 = fh.a;
        class_1799 class_17993 = class_17992;
        if (ay.a(fh2, class_17993) && this.c.a(fh.a.L)) {
            return 0;
        }
        fh fh3 = fh.c;
        class_1799 class_17994 = class_17992;
        if (ay.a(fh3, class_17994) && this.c.a(fh.c.L)) {
            return 1;
        }
        fh fh4 = fh.b;
        class_1799 class_17995 = class_17992;
        if (ay.a(fh4, class_17995) && this.c.a(fh.b.L)) {
            return 2;
        }
        fh fh5 = fh.s;
        class_1799 class_17996 = class_17992;
        if (ay.a(fh5, class_17996) && this.c.a(fh.s.L)) {
            return 3;
        }
        fh fh6 = fh.f;
        class_1799 class_17997 = class_17992;
        if (ay.a(fh6, class_17997) && this.c.a(fh.f.L)) {
            return 4;
        }
        fh fh7 = fh.g;
        class_1799 class_17998 = class_17992;
        if (ay.a(fh7, class_17998) && this.c.a(fh.g.L)) {
            return 5;
        }
        return -1;
    }

    private static /* bridge */ /* synthetic */ boolean a(fh fh2, class_1799 class_17992) {
        if (class_17992.method_7909() != fh2.K) {
            return false;
        }
        if (fh2.P == null) {
            return true;
        }
        String string = fh2.P;
        class_1799 class_17993 = class_17992;
        return bw.a(string, class_17993);
    }

    private /* bridge */ /* synthetic */ void a(class_243 class_2432, float f2, class_1657 class_16572, class_4587 class_45872) {
        class_239 class_2392;
        class_310 class_3102 = this.a();
        if (class_3102 == null || !((class_2392 = class_3102.field_1765) instanceof class_3965)) {
            return;
        }
        class_3965 class_39652 = (class_3965)class_2392;
        if (class_39652.method_17783() != class_239.class_240.field_1332) {
            return;
        }
        int n2 = ay.b(class_16572.method_6047());
        if (n2 <= 0) {
            return;
        }
        int n3 = n2 >= 2 ? 2 : 1;
        class_2350.class_2351 class_23512 = class_39652.method_17780().method_10166();
        class_2350 class_23502 = class_39652.method_17780().method_10153();
        class_2338 class_23382 = class_39652.method_17777();
        float f3 = f2;
        boolean bl2 = false;
        int n4 = this.j.a();
        int n5 = 6;
        this.a(n5, f3, bl2, n4);
        for (int i2 = 0; i2 < n3; ++i2) {
            class_2338 class_23383 = class_23382.method_10079(class_23502, i2);
            for (int i3 = -1; i3 <= 1; ++i3) {
                for (int i4 = -1; i4 <= 1; ++i4) {
                    int n6 = i4;
                    int n7 = i3;
                    class_2350.class_2351 class_23513 = class_23512;
                    class_2338 class_23384 = class_23383;
                    class_2338 class_23385 = ay.a(n7, class_23384, class_23513, n6);
                    class_238 class_2383 = new class_238(class_23385);
                    int n8 = this.l.a() ? this.o : 0;
                    int n9 = this.p;
                    class_238 class_2384 = class_2383;
                    class_243 class_2433 = class_2432;
                    class_4587 class_45873 = class_45872;
                    this.a(n9, class_45873, n8, class_2384, class_2433);
                }
            }
        }
    }

    private static /* bridge */ /* synthetic */ class_2338 a(int n2, class_2338 class_23382, class_2350.class_2351 class_23512, int n3) {
        return switch (class_23512) {
            default -> throw new MatchException(null, null);
            case class_2350.class_2351.field_11052 -> class_23382.method_10069(n2, 0, n3);
            case class_2350.class_2351.field_11048 -> class_23382.method_10069(0, n2, n3);
            case class_2350.class_2351.field_11051 -> class_23382.method_10069(n2, n3, 0);
        };
    }

    private static /* bridge */ /* synthetic */ int a(String string) {
        Matcher matcher = a.matcher(string);
        if (!matcher.find()) {
            return 0;
        }
        String string2 = matcher.group(1);
        if (string2 == null || string2.isEmpty()) {
            return 1;
        }
        return switch (string2.toLowerCase(Locale.ROOT)) {
            case "i" -> {
                int var5_5;
                yield var5_5 = 1;
            }
            case "ii" -> {
                int var5_6;
                yield var5_6 = 2;
            }
            case "iii" -> {
                int var5_7;
                yield var5_7 = 3;
            }
            default -> {
                try {
                    int var5_8;
                    yield var5_8 = Integer.parseInt(string2);
                }
                catch (NumberFormatException var6_10) {
                    int var5_9;
                    yield var5_9 = 0;
                }
            }
        };
    }

    private /* bridge */ /* synthetic */ void a(int n2, class_4587 class_45872, int n3, class_238 class_2383, class_243 class_2432) {
        class_243 class_2433 = new class_243(class_2383.field_1323 - class_2432.field_1352, class_2383.field_1322 - class_2432.field_1351, class_2383.field_1321 - class_2432.field_1350);
        class_243 class_2434 = new class_243(class_2383.field_1320 - class_2432.field_1352, class_2383.field_1325 - class_2432.field_1351, class_2383.field_1324 - class_2432.field_1350);
        float[] fArray = gv.a(n2);
        float f2 = 0.01f;
        gv.a();
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27379, class_290.field_1576);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f3 = fArray[3];
        float f4 = fArray[2];
        float f5 = fArray[1];
        float f6 = fArray[0];
        float f7 = f2;
        float f8 = (float)class_2434.field_1350;
        float f9 = (float)class_2434.field_1351;
        float f10 = (float)class_2434.field_1352;
        float f11 = (float)class_2433.field_1350;
        float f12 = (float)class_2433.field_1351;
        float f13 = (float)class_2433.field_1352;
        Matrix4f matrix4f2 = matrix4f;
        class_287 class_2873 = class_2872;
        gv.a(f10, f3, f5, f12, matrix4f2, f13, f11, f9, class_2873, f4, f7, f8, f6);
        class_286.method_43433((class_9801)class_2872.method_60800());
        gv.b();
        if (n3 != 0 && this.l.a()) {
            float[] fArray2 = gv.a(n3);
            boolean bl2 = false;
            float f14 = fArray2[3];
            float f15 = fArray2[2];
            float f16 = fArray2[1];
            float f17 = fArray2[0];
            class_243 class_2435 = class_2434;
            class_243 class_2436 = class_2433;
            class_4587 class_45873 = class_45872;
            gv.a(class_45873, f15, f17, class_2436, bl2, f16, class_2435, f14);
        }
    }

    private /* bridge */ /* synthetic */ void a(int n2, float f2, boolean bl2, int n3) {
        int n4;
        if (this.s != n2) {
            this.s = n2;
            this.r = false;
            this.q = 0.0f;
            int n5 = 85;
            int n6 = n3;
            this.o = ay.a(n5, n6);
            int n7 = 255;
            int n8 = n3;
            this.p = ay.a(n7, n8);
        }
        boolean bl3 = this.k.a() && bl2;
        int n9 = n4 = this.k.a() ? this.k.a() : n3;
        if (bl3 != this.r) {
            this.q = 0.0f;
            this.r = bl3;
        }
        int n10 = 85;
        int n11 = bl3 ? n4 : n3;
        int n12 = ay.a(n10, n11);
        int n13 = 255;
        int n14 = bl3 ? n4 : n3;
        int n15 = ay.a(n13, n14);
        float f3 = this.q = Math.min(this.q + f2 / 0.5f, 1.0f);
        int n16 = n12;
        int n17 = this.o;
        this.o = ay.a(f3, n16, n17);
        float f4 = this.q;
        int n18 = n15;
        int n19 = this.p;
        this.p = ay.a(f4, n18, n19);
    }

    private /* bridge */ /* synthetic */ void a(class_4587 class_45872, class_238 class_2383, class_243 class_2432, float f2, class_1657 class_16572) {
        class_238 class_2384 = class_2383.method_35580(0.01, 0.01, 0.01);
        float f3 = f2;
        boolean bl2 = this.a(class_16572, class_2383);
        int n2 = this.i.a();
        int n3 = 5;
        this.a(n3, f3, bl2, n2);
        int n4 = this.o;
        int n5 = this.p;
        class_238 class_2385 = class_2384;
        class_243 class_2433 = class_2432;
        class_4587 class_45873 = class_45872;
        this.a(n5, class_45873, n4, class_2385, class_2433);
    }

    private static /* bridge */ /* synthetic */ class_238 a(boolean bl2, float f2, class_2338 class_23382) {
        double d2;
        double d3 = bl2 ? -3.0 : -2.0;
        double d4 = bl2 ? 4.0 : 3.0;
        double d5 = d2 = bl2 ? 6.0 : 4.0;
        if (f2 >= 315.0f || f2 < 45.0f) {
            return new class_238((double)class_23382.method_10263() + d3, (double)(class_23382.method_10264() - 1), (double)class_23382.method_10260() + 2.0, (double)class_23382.method_10263() + d4, (double)class_23382.method_10264() + d2, (double)class_23382.method_10260() + 4.0);
        }
        if (f2 < 135.0f) {
            return new class_238((double)class_23382.method_10263() - 3.0, (double)(class_23382.method_10264() - 1), (double)class_23382.method_10260() + d3, (double)class_23382.method_10263() - 1.0, (double)class_23382.method_10264() + d2, (double)class_23382.method_10260() + d4);
        }
        if (f2 < 225.0f) {
            return new class_238((double)class_23382.method_10263() + d3, (double)(class_23382.method_10264() - 1), (double)class_23382.method_10260() - 3.0, (double)class_23382.method_10263() + d4, (double)class_23382.method_10264() + d2, (double)class_23382.method_10260() - 1.0);
        }
        return new class_238((double)class_23382.method_10263() + 2.0, (double)(class_23382.method_10264() - 1), (double)class_23382.method_10260() + d3, (double)class_23382.method_10263() + 4.0, (double)class_23382.method_10264() + d2, (double)class_23382.method_10260() + d4);
    }

    private static /* bridge */ /* synthetic */ class_238 a(class_2338 class_23382, boolean bl2) {
        double d2 = bl2 ? -3.0 : -2.0;
        double d3 = bl2 ? 4.0 : 3.0;
        double d4 = 3.0;
        double d5 = bl2 ? 7.0 : 5.0;
        return new class_238((double)class_23382.method_10263() + d2, (double)class_23382.method_10264() + d4, (double)class_23382.method_10260() + d2, (double)class_23382.method_10263() + d3, (double)class_23382.method_10264() + d5, (double)class_23382.method_10260() + d3);
    }

    private static /* bridge */ /* synthetic */ List a(class_2338 class_23382, boolean bl2, int n2) {
        int n3;
        int n4;
        boolean bl3 = switch (n2) {
            case 45 -> {
                n4 = -3;
                n3 = 2;
                yield false;
            }
            case 135 -> {
                n4 = -3;
                n3 = -2;
                yield true;
            }
            case 225 -> {
                n4 = 2;
                n3 = -2;
                yield false;
            }
            default -> {
                n4 = 2;
                n3 = 2;
                yield true;
            }
        };
        class_2338 class_23383 = class_23382.method_10069(n4, -1, n3);
        int n5 = bl2 ? -3 : -2;
        int n6 = bl2 ? 3 : 2;
        int n7 = bl2 ? 7 : 5;
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>((n6 - n5 + 1) * n7 * 2);
        for (int i2 = n5; i2 <= n6; ++i2) {
            int n8 = bl3 ? -i2 : i2;
            for (int i3 = 0; i3 < n7; ++i3) {
                arrayList.add(class_23383.method_10069(i2, i3, n8));
                arrayList.add(class_23383.method_10069(i2 + 1, i3, n8));
            }
        }
        return arrayList;
    }

    private static /* bridge */ /* synthetic */ class_238 a(boolean bl2, class_2338 class_23382) {
        double d2 = bl2 ? -3.0 : -2.0;
        double d3 = bl2 ? 4.0 : 3.0;
        double d4 = -3.0;
        return new class_238((double)class_23382.method_10263() + d2, (double)class_23382.method_10264() + d4, (double)class_23382.method_10260() + d2, (double)class_23382.method_10263() + d3, (double)(class_23382.method_10264() + 1), (double)class_23382.method_10260() + d3);
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.a();
    }
}

