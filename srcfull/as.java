/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class as
extends dr<hf, cR> {
    private final cR v = new cR();

    public as() {
        this.v.a(this::a);
        this.b();
    }

    private void b() {
        Object object;
        Object object22;
        List list = hY.a().a();
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        for (Object object22 : this.m) {
            Iterator iterator = ((hf)object22).a();
            if (((iC)object22).i() || iterator == null || ((fM)((Object)iterator)).a() == null) continue;
            hashMap.put(((fM)((Object)iterator)).a(), object22);
        }
        HashSet hashSet = new HashSet();
        object22 = new ArrayList(list.size());
        for (Object object3 : list) {
            if (object3 == null || ((fM)object3).a() == null) continue;
            hashSet.add(((fM)object3).a());
            object = (hf)hashMap.get(((fM)object3).a());
            if (object != null) {
                ((hf)object).a((fM)object3);
            } else {
                object = this.a((fM)object3);
            }
            object22.add(object);
        }
        for (Object object3 : this.m) {
            if (((iC)object3).i() || (object = ((hf)object3).a()) != null && ((fM)object).a() != null && hashSet.contains(((fM)object).a())) continue;
            ((iC)object3).e();
            object22.add(object3);
        }
        this.m.clear();
        this.m.addAll(object22);
    }

    private void b(fM fM2) {
        if (fM2 == null) {
            return;
        }
        if (lo.aM == null || lo.aM.field_1774 == null) {
            return;
        }
        String string = fM2.a() + " " + fM2.b() + " " + fM2.c();
        lo.aM.field_1774.method_1455(string);
    }

    private void c(fM fM2) {
        if (fM2 == null || fM2.a() == null) {
            return;
        }
        boolean bl2 = fM2.a();
        String string = fM2.a();
        hY.a().a(bl2, string);
    }

    private void a(fM fM2) {
        if (fM2 == null || fM2.a() == null) {
            return;
        }
        hY.a().a(fM2.a());
        this.b();
    }

    private void a(fM fM2, String string) {
        if (fM2 == null || fM2.a() == null) {
            return;
        }
        hY.a().a(fM2.a(), string);
        this.b();
    }

    @Override
    protected /* bridge */ /* synthetic */ gh a() {
        return this.a();
    }

    @Override
    protected /* bridge */ /* synthetic */ void a(gh gh2, boolean bl2, float f2, float f3) {
        boolean bl3 = bl2;
        float f4 = f3;
        float f5 = f2;
        cR cR2 = (cR)gh2;
        this.a(cR2, f4, bl3, f5);
    }

    private void a(String string, int n2, int n3, int n4) {
        if (string == null || string.isBlank()) {
            return;
        }
        if (!fA.a()) {
            return;
        }
        String string2 = fA.a();
        if (string2 == null) {
            return;
        }
        String string3 = string2;
        int n5 = n4;
        int n6 = n3;
        int n7 = n2;
        String string4 = string.trim();
        hY.a().a(string4, n5, n7, string3, n6);
        this.b();
    }

    private void a(fM fM2, int n2, int n3, int n4) {
        if (fM2 == null || fM2.a() == null) {
            return;
        }
        hY.a().a(fM2.a(), n2, n3, n4);
        this.b();
    }

    @Override
    protected boolean a() {
        return false;
    }

    @Override
    protected void a(float f2) {
        this.v.a(f2);
    }

    @Override
    protected cR a() {
        return this.v;
    }

    @Override
    protected float a() {
        return 300.0f;
    }

    protected void a(cR cR2, float f2, boolean bl2, float f3) {
        if (bl2) {
            float f4 = f2;
            float f5 = f3;
            cR2.a(f4, f5);
        } else {
            float f6 = f2;
            float f7 = f3;
            cR2.c(f6, f7);
        }
    }

    public void a() {
        this.b();
    }

    private hf a(fM fM2) {
        hf hf2 = new hf(fM2);
        hf2.a(this.n);
        hf2.b(this::a);
        hf2.c(this::b);
        hf2.d(this::c);
        hf2.a(this::a);
        hf2.a(this::a);
        return hf2;
    }
}

