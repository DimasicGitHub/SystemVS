/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.authlib.GameProfile;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_4050;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_638;
import net.minecraft.class_742;
import net.minecraft.class_745;
import net.minecraft.class_8080;
import net.minecraft.class_898;

public class dj {
    private /* synthetic */ class_745 a;
    private /* synthetic */ class_243 b;
    private /* synthetic */ float c;
    private /* synthetic */ float d;
    private /* synthetic */ float e;
    private /* synthetic */ float f;
    private /* synthetic */ boolean g;
    private /* synthetic */ boolean h;
    private /* synthetic */ float i;
    private /* synthetic */ float j;
    private /* synthetic */ float k;
    private /* synthetic */ float l;
    private /* synthetic */ boolean m;
    private /* synthetic */ int n;
    private /* synthetic */ class_1268 o;
    private /* synthetic */ float p;
    private /* synthetic */ class_4050 q;
    private /* synthetic */ int r;
    private /* synthetic */ cc<Float> s;
    private /* synthetic */ cc<Float> t;
    private /* synthetic */ cc<Float> u;
    private /* synthetic */ cc<Float> v;
    private /* synthetic */ cc<Float> w;
    private /* synthetic */ cc<Float> x;

    public /* bridge */ /* synthetic */ void b() {
        this.a = null;
        this.b = null;
    }

    private /* bridge */ /* synthetic */ void b(class_742 class_7422) {
        if (this.a == null) {
            return;
        }
        for (class_1304 class_13042 : class_1304.values()) {
            this.a.method_5673(class_13042, class_7422.method_6118(class_13042).method_7972());
        }
    }

    public /* bridge */ /* synthetic */ void a(H h2) {
        if (this.a == null || this.b == null || lo.aM.field_1687 == null) {
            return;
        }
        class_4587 class_45872 = h2.a();
        class_243 class_2432 = h2.a().method_19326();
        float f2 = 0.0f;
        this.a();
        double d2 = this.b.field_1352 - class_2432.field_1352;
        double d3 = this.b.field_1351 - class_2432.field_1351;
        double d4 = this.b.field_1350 - class_2432.field_1350;
        class_898 class_8982 = lo.aM.method_1561();
        class_4597.class_4598 class_45982 = lo.aM.method_22940().method_23000();
        int n2 = class_8982.method_23839((class_1297)this.a, f2);
        class_8982.method_62424((class_1297)this.a, d2, d3, d4, f2, class_45872, (class_4597)class_45982, n2);
        class_45982.method_22993();
    }

    private /* bridge */ /* synthetic */ void a(class_8080 class_80802) {
        this.s = new cc((Object)class_80802, class_8080.class, 0);
        this.t = new cc((Object)class_80802, class_8080.class, 1);
        this.u = new cc((Object)class_80802, class_8080.class, 2);
        this.v = new cc((Object)class_80802, class_8080.class, 3);
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return this.a != null && this.b != null;
    }

    public /* bridge */ /* synthetic */ class_243 a() {
        return this.b;
    }

    public /* bridge */ /* synthetic */ class_745 a() {
        return this.a;
    }

    public /* bridge */ /* synthetic */ void a(class_742 class_7422) {
        if (class_7422 == null || lo.aM.field_1687 == null) {
            return;
        }
        this.b = class_7422.method_19538();
        this.c = class_7422.method_36454();
        this.d = class_7422.method_36455();
        this.e = class_7422.field_6283;
        this.f = class_7422.field_6241;
        this.g = class_7422.method_5715();
        this.h = class_7422.method_5624();
        this.a(class_7422.field_42108);
        this.a((class_1309)class_7422);
        this.j = class_7422.field_42108.method_48566();
        try {
            this.i = this.u.a();
            this.k = this.v.a();
        }
        catch (Exception exception) {
            this.i = 0.0f;
            this.k = 1.0f;
        }
        this.l = class_7422.field_6251;
        this.m = class_7422.field_6252;
        this.n = class_7422.field_6279;
        this.o = class_7422.method_6058();
        try {
            this.p = this.w.a();
        }
        catch (Exception exception) {
            this.p = 0.0f;
        }
        this.q = class_7422.method_18376();
        this.r = class_7422.field_6012;
        class_638 class_6382 = lo.aM.field_1687;
        class_742 class_7423 = class_7422;
        this.a(class_6382, class_7423);
    }

    private /* bridge */ /* synthetic */ void a(class_638 class_6382, class_742 class_7422) {
        if (this.a != null) {
            return;
        }
        GameProfile gameProfile = class_7422.method_7334();
        this.a = new class_745(class_6382, gameProfile);
        this.a();
        this.b(class_7422);
    }

    private /* bridge */ /* synthetic */ void a() {
        if (this.a == null) {
            return;
        }
        this.a.method_33574(this.b);
        this.a.field_6014 = this.b.field_1352;
        this.a.field_6036 = this.b.field_1351;
        this.a.field_5969 = this.b.field_1350;
        this.a.field_6038 = this.b.field_1352;
        this.a.field_5971 = this.b.field_1351;
        this.a.field_5989 = this.b.field_1350;
        this.a.method_36456(this.c);
        this.a.method_36457(this.d);
        this.a.field_5982 = this.c;
        this.a.field_6004 = this.d;
        this.a.field_6283 = this.e;
        this.a.field_6220 = this.e;
        this.a.field_6241 = this.f;
        this.a.field_6259 = this.f;
        this.a.method_5660(this.g);
        this.a.method_5728(this.h);
        this.a.method_18380(this.q);
        this.a.field_6012 = this.r;
        this.a(this.a.field_42108);
        this.a((class_1309)this.a);
        try {
            float f2 = this.i + this.j;
            this.u.a(Float.valueOf(f2));
            this.t.a(Float.valueOf(this.j));
            this.s.a(Float.valueOf(this.j));
            this.v.a(Float.valueOf(this.k));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.a.field_6251 = this.l;
        this.a.field_6229 = this.l;
        this.a.field_6252 = this.m;
        this.a.field_6279 = this.n;
        this.a.field_6266 = this.o;
        this.a.method_6021();
        try {
            this.w.a(Float.valueOf(this.p));
            this.x.a(Float.valueOf(this.p));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private /* bridge */ /* synthetic */ void a(class_1309 class_13092) {
        this.w = new cc((Object)class_13092, class_1309.class, 103);
        this.x = new cc((Object)class_13092, class_1309.class, 104);
    }
}

