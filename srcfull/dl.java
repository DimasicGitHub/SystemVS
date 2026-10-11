/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1661;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_437;
import net.minecraft.class_465;
import net.minecraft.class_481;
import net.minecraft.class_490;

public class dl
extends aT {
    private /* synthetic */ gz a;
    private /* synthetic */ dw b;
    private /* synthetic */ long c;

    public /* synthetic */ dl() {
        super("\u0421\u0445\u0435\u0437\u0442\u0417\u0442\u0435\u0430\u043b\u0435\u0440", fV.c);
        gz gz2 = new gz("", "", 100.0, 0.0, 500.0, 10.0);
        gz2.setNameParts(new String[]{"\u0417", "a", "\u0434", "\u0435", "\u0440", "\u0436", "\u043a", "\u0430"});
        gz2.setDescriptionParts(new String[]{"\u0417", "a", "\u0434", "\u0435", "\u0440", "\u0436", "\u043a", "\u0430", " ", "\u043c", "e", "\u0436", "\u0434", "\u0443", " ", "\u043f", "e", "\u0440", "\u0435", "\u043c", "\u0435", "\u0449", "\u0435", "\u043d", "\u0438", "\u0435", "\u043c", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", "\u043e", "\u0432", " ", "(", "\u0432", " ", "\u043c", "c", ")"});
        this.a = gz2;
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"A", "\u0432", "\u0442", "\u043e", "-", "\u0437", "a", "\u043a", "\u0440", "\u044b", "\u0442", "\u0438", "\u0435"});
        dw2.setDescriptionParts(new String[]{"\u0417", "a", "\u043a", "\u0440", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u043a", "o", "\u043d", "\u0442", "\u0435", "\u0439", "\u043d", "\u0435", "\u0440", " ", "\u043f", "o", "\u0441", "\u043b", "\u0435", " ", "c", "\u0442", "\u0438", "\u043b", "\u0430"});
        this.b = dw2;
        this.c = 0L;
        this.a(this.a, this.b);
    }

    @Override
    public /* bridge */ /* synthetic */ void i() {
        if (this.z() || this.a() == null) {
            return;
        }
        class_437 class_4372 = this.a();
        if (!(class_4372 instanceof class_465)) {
            return;
        }
        class_465 class_4652 = (class_465)class_4372;
        if (class_4652 instanceof class_490 || class_4652 instanceof class_481) {
            return;
        }
        class_4372 = class_4652.method_17577();
        if (!this.a((class_1703)class_4372)) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (l2 - this.c < this.a.a()) {
            return;
        }
        class_1735 class_17352 = this.a((class_1703)class_4372);
        if (class_17352 == null) {
            if (this.b.a() && this.a()) {
                class_4652.method_25419();
                this.a().method_1507(null);
            }
            return;
        }
        this.a().method_2906(class_4372.field_7763, class_17352.field_7874, 0, class_1713.field_7794, this.b());
        this.c = l2;
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.c = 0L;
    }

    private /* bridge */ /* synthetic */ class_1735 a(class_1703 class_17032) {
        class_1661 class_16612 = this.a();
        ArrayList<class_1735> arrayList = new ArrayList<class_1735>();
        for (class_1735 class_17352 : class_17032.field_7761) {
            if (class_17352 == null || !class_17352.method_7681() || class_17352.field_7871 == class_16612 || !class_17352.method_7674(this.b())) continue;
            arrayList.add(class_17352);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (class_1735)arrayList.get(ThreadLocalRandom.current().nextInt(arrayList.size()));
    }

    private /* bridge */ /* synthetic */ boolean a(class_1703 class_17032) {
        class_1661 class_16612 = this.b().method_31548();
        for (class_1735 class_17352 : class_17032.field_7761) {
            if (class_17352 == null || class_17352.field_7871 == class_16612) continue;
            return true;
        }
        return false;
    }

    private /* bridge */ /* synthetic */ boolean a() {
        class_437 class_4372 = this.a();
        if (!(class_4372 instanceof class_465)) {
            return false;
        }
        if (class_4372 instanceof class_490) {
            return false;
        }
        return !(class_4372 instanceof class_481);
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.c = 0L;
    }
}

