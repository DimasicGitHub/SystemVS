/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_1657;

public abstract class es {
    private final /* synthetic */ String a;

    protected /* synthetic */ es(String string) {
        this.a = string;
    }

    public /* bridge */ /* synthetic */ double b() {
        return 15.0;
    }

    public abstract /* synthetic */ void c();

    public abstract /* synthetic */ void d();

    public abstract /* synthetic */ double[] a(class_1297 var1);

    public abstract /* synthetic */ double[] a(double var1, long var3, double var5, double var7, double var9, double var11, double var13, long var15, class_1657 var17, double var18);

    public /* bridge */ /* synthetic */ String a() {
        return this.a;
    }

    public /* bridge */ /* synthetic */ List a() {
        return Collections.emptyList();
    }

    public /* bridge */ /* synthetic */ void a(String string, jh jh2) {
        for (fa fa2 : this.a()) {
            fa2.a(() -> string.equals(jh2.a()));
        }
    }

    public abstract /* synthetic */ void a(double var1, long var3, class_1297 var5);

    public abstract /* synthetic */ double a();
}

