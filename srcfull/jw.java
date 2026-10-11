/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1735;

public class jw
extends aT {
    private /* synthetic */ fr a;

    public /* synthetic */ jw() {
        super("\u041b\u043e\u0441\u043a\u0417\u043b\u043e\u0442", fV.c);
        fr fr2 = new fr("", "", jw.d(), List.of());
        fr2.setNameParts(new String[]{"C", "\u043b", "\u043e", "\u0442", "\u044b"});
        fr2.setDescriptionParts(new String[]{"C", "\u043b", "\u043e", "\u0442", "\u044b", " ", "\u0445", "o", "\u0442", "\u0431", "\u0430", "\u0440", "\u0430", ",", " ", "\u0438", "\u0437", " ", "\u043a", "o", "\u0442", "\u043e", "\u0440", "\u044b", "\u0445", " ", "\u043d", "e", "\u043b", "\u044c", "\u0437", "\u044f", " ", "\u0432", "\u044b", "\u043a", "\u0438", "\u0434", "\u044b", "\u0432", "a", "\u0442", "\u044c"});
        this.a = fr2;
        this.a(new fa[]{this.a});
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
    }

    private static /* bridge */ /* synthetic */ List d() {
        ArrayList<String> arrayList = new ArrayList<String>(9);
        for (int i2 = 1; i2 <= 9; ++i2) {
            arrayList.add(String.valueOf(i2));
        }
        return arrayList;
    }

    public /* bridge */ /* synthetic */ boolean a(class_1713 class_17132, int n2) {
        if (class_17132 != class_1713.field_7795 || n2 < 0) {
            return false;
        }
        if (this.b() == null) {
            return false;
        }
        class_1703 class_17032 = this.b().field_7512;
        if (class_17032 == null || n2 >= class_17032.field_7761.size()) {
            return false;
        }
        class_1735 class_17352 = (class_1735)class_17032.field_7761.get(n2);
        if (class_17352 == null || class_17352.field_7871 != this.a()) {
            return false;
        }
        return this.a(class_17352.method_34266());
    }

    private /* bridge */ /* synthetic */ boolean a(int n2) {
        if (n2 < 0 || n2 >= 9) {
            return false;
        }
        return this.a.a().contains(String.valueOf(n2 + 1));
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return this.b() != null && this.a(this.a().field_7545);
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
    }
}

