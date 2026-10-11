/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.class_1799;
import net.minecraft.class_1802;

public class dy
extends aT {
    private /* synthetic */ boolean a;
    private /* synthetic */ int b;
    private /* synthetic */ int c;

    public /* synthetic */ dy() {
        super("\u041c\u0430\u0441\u0435\u0417\u0448\u0430\u043f", fV.a);
        this.a = false;
        this.b = -1;
        this.c = 0;
    }

    private /* bridge */ /* synthetic */ void b(int n2) {
        if (this.z()) {
            return;
        }
        this.a().field_7545 = n2;
    }

    @Override
    public /* bridge */ /* synthetic */ void b(bh bh2) {
        if (this.a && this.b() != null) {
            ++this.c;
            if (this.c >= 2 && this.b != -1) {
                this.b(this.b);
                this.a = false;
                this.c = 0;
                this.b = -1;
            }
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.a = false;
        this.c = 0;
        this.b = -1;
    }

    private /* bridge */ /* synthetic */ int a() {
        if (this.z()) {
            return -1;
        }
        for (int i2 = 0; i2 < 9; ++i2) {
            class_1799 class_17992 = this.a().method_5438(i2);
            if (class_17992.method_7909() != class_1802.field_49814) continue;
            return i2;
        }
        return -1;
    }

    private /* bridge */ /* synthetic */ boolean a(class_1799 class_17992) {
        if (class_17992 == null || class_17992.method_7960()) {
            return false;
        }
        return class_17992.method_7909() == class_1802.field_8091 || class_17992.method_7909() == class_1802.field_8528 || class_17992.method_7909() == class_1802.field_8371 || class_17992.method_7909() == class_1802.field_8845 || class_17992.method_7909() == class_1802.field_8802 || class_17992.method_7909() == class_1802.field_22022;
    }

    private /* bridge */ /* synthetic */ void a(int n2) {
        if (this.z()) {
            return;
        }
        this.b = this.a().field_7545;
        this.a = true;
        this.c = 0;
        this.b(n2);
    }

    @Override
    public /* bridge */ /* synthetic */ void a(ei ei2) {
        int n2;
        if (this.z() || ei2.a() != this.a() || this.a) {
            return;
        }
        class_1799 class_17992 = this.b().method_6047();
        if (this.a(class_17992) && (n2 = this.a()) != -1) {
            this.a(n2);
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.a = false;
        this.c = 0;
        this.b = -1;
    }
}

