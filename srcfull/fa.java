/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.function.Supplier;

public abstract class fa {
    protected /* synthetic */ String[] g;
    protected /* synthetic */ String[] h;
    @Expose
    protected boolean i = true;
    private transient /* synthetic */ String j;
    private transient /* synthetic */ String k;
    protected transient /* synthetic */ Runnable l;
    protected transient /* synthetic */ Runnable m;
    protected transient /* synthetic */ Supplier<Boolean> n;

    public /* synthetic */ fa(String string, String string2) {
        this.g = ec.split(string);
        this.h = ec.split(string2);
    }

    public /* bridge */ /* synthetic */ String e() {
        String string = this.j;
        if (string == null) {
            this.j = string = Long.toHexString(kJ.a(this.g));
        }
        return string;
    }

    public abstract /* synthetic */ String i();

    public /* bridge */ /* synthetic */ Runnable b() {
        return this.l;
    }

    public /* bridge */ /* synthetic */ void b(Runnable runnable) {
        this.l = runnable;
    }

    public /* bridge */ /* synthetic */ String[] b() {
        return this.h;
    }

    public abstract /* synthetic */ void c();

    public /* bridge */ /* synthetic */ void c(Runnable runnable) {
        this.m = runnable;
    }

    public /* bridge */ /* synthetic */ Runnable c() {
        return this.m;
    }

    public /* bridge */ /* synthetic */ void c(boolean bl2) {
        this.i = bl2;
    }

    public /* bridge */ /* synthetic */ String h() {
        String string = fc.a().b(this.f());
        return string != null ? string : this.k();
    }

    public /* bridge */ /* synthetic */ String f() {
        String string = this.k;
        if (string == null) {
            this.k = string = Long.toHexString(kJ.a(this.h));
        }
        return string;
    }

    public /* bridge */ /* synthetic */ void d() {
        if (this.l != null) {
            try {
                this.l.run();
            }
            catch (Exception exception) {
                System.err.println(exception.getMessage());
            }
        }
    }

    public /* bridge */ /* synthetic */ boolean d() {
        if (this.n != null) {
            return this.n.get();
        }
        return this.i;
    }

    public /* bridge */ /* synthetic */ Supplier a() {
        return this.n;
    }

    public /* bridge */ /* synthetic */ String[] a() {
        return this.g;
    }

    public abstract /* synthetic */ void a(JsonObject var1);

    public /* bridge */ /* synthetic */ void a(Supplier supplier) {
        this.n = supplier;
    }

    public abstract /* synthetic */ JsonObject a();

    public /* bridge */ /* synthetic */ String k() {
        return ec.join(this.h);
    }

    public /* bridge */ /* synthetic */ String g() {
        String string = fc.a().b(this.e());
        return string != null ? string : this.j();
    }

    public /* bridge */ /* synthetic */ String j() {
        return ec.join(this.g);
    }

    public /* bridge */ /* synthetic */ void setDescriptionParts(String[] stringArray) {
        this.h = stringArray != null ? stringArray : new String[]{};
        this.k = null;
    }

    public /* bridge */ /* synthetic */ void setNameParts(String[] stringArray) {
        this.g = stringArray != null ? stringArray : new String[]{};
        this.j = null;
    }
}

