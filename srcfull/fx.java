/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class fx
extends fa {
    @Expose
    private String a;
    @Expose
    private final String b;
    @Expose
    private final String c;
    @Expose
    private final boolean d;
    @Expose
    private final double e;
    @Expose
    private final double f;

    public /* synthetic */ fx(String string, String string2, String string3, String string4, boolean bl2, double d2, double d3) {
        super(string, string2);
        this.a = this.b = string3 != null ? string3 : "";
        this.c = string4 != null ? string4 : "";
        this.d = bl2;
        this.e = d2;
        this.f = d3;
    }

    public /* synthetic */ fx(String string, String string2, String string3, String string4, boolean bl2) {
        this(string, string2, string3, string4, bl2, 0.0, 100.0);
    }

    public /* synthetic */ fx(String string, String string2, String string3, String string4) {
        this(string, string2, string3, string4, false, 0.0, 0.0);
    }

    public /* bridge */ /* synthetic */ boolean e() {
        return this.d && this.e != this.f;
    }

    @Override
    public /* bridge */ /* synthetic */ String i() {
        return "input";
    }

    public /* bridge */ /* synthetic */ boolean b() {
        if (!this.d) {
            return false;
        }
        try {
            Double.parseDouble(this.a);
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    public /* bridge */ /* synthetic */ void b() {
        if (this.d && this.e != this.f) {
            double d2 = this.a();
            double d3 = this.b();
            this.a(d2 - d3);
        }
    }

    private /* bridge */ /* synthetic */ double b() {
        double d2 = this.f - this.e;
        if (d2 >= 100.0) {
            return 1.0;
        }
        if (d2 >= 10.0) {
            return 0.1;
        }
        if (d2 >= 1.0) {
            return 0.01;
        }
        return 0.001;
    }

    public /* bridge */ /* synthetic */ String b() {
        return this.a;
    }

    public /* bridge */ /* synthetic */ boolean c() {
        return this.a.equals(this.b);
    }

    public /* bridge */ /* synthetic */ double c() {
        return this.e;
    }

    public /* bridge */ /* synthetic */ String c() {
        return this.b;
    }

    @Override
    public /* bridge */ /* synthetic */ void c() {
        this.a = this.b;
    }

    public /* bridge */ /* synthetic */ boolean f() {
        return this.d;
    }

    public /* bridge */ /* synthetic */ double d() {
        return this.f;
    }

    public /* bridge */ /* synthetic */ String d() {
        return this.c;
    }

    @Override
    public /* bridge */ /* synthetic */ void a(JsonObject jsonObject) {
        if (jsonObject.has("value")) {
            this.a(jsonObject.get("value").getAsString());
        }
        if (jsonObject.has("visible")) {
            this.i = jsonObject.get("visible").getAsBoolean();
        }
    }

    public /* bridge */ /* synthetic */ void a(double d2) {
        if (this.d) {
            if (this.e != this.f) {
                d2 = Math.max(this.e, Math.min(this.f, d2));
            }
            this.a = String.valueOf(d2);
        }
    }

    public /* bridge */ /* synthetic */ void a(String string) {
        if (string == null) {
            this.a = "";
            return;
        }
        if (this.d) {
            try {
                double d2 = Double.parseDouble(string);
                if (this.e != this.f) {
                    d2 = Math.max(this.e, Math.min(this.f, d2));
                }
                this.a = String.valueOf(d2);
            }
            catch (NumberFormatException numberFormatException) {}
        } else {
            this.a = string;
        }
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return this.a == null || this.a.trim().isEmpty();
    }

    public /* bridge */ /* synthetic */ int a() {
        return (int)this.a();
    }

    public /* bridge */ /* synthetic */ float a() {
        return (float)this.a();
    }

    public /* bridge */ /* synthetic */ void a() {
        if (this.d && this.e != this.f) {
            double d2 = this.a();
            double d3 = this.b();
            this.a(d2 + d3);
        }
    }

    public /* bridge */ /* synthetic */ long a() {
        return (long)this.a();
    }

    public /* bridge */ /* synthetic */ String a() {
        if (this.a()) {
            return this.j() + ": " + this.c;
        }
        return this.j() + ": " + this.a;
    }

    public /* bridge */ /* synthetic */ double a() {
        if (this.d) {
            try {
                return Double.parseDouble(this.a);
            }
            catch (NumberFormatException numberFormatException) {
                return this.e;
            }
        }
        return 0.0;
    }

    @Override
    public /* bridge */ /* synthetic */ JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", this.i());
        jsonObject.addProperty("value", this.a);
        jsonObject.addProperty("defaultValue", this.b);
        jsonObject.addProperty("placeholder", this.c);
        jsonObject.addProperty("isNumber", Boolean.valueOf(this.d));
        jsonObject.addProperty("minValue", (Number)this.e);
        jsonObject.addProperty("maxValue", (Number)this.f);
        jsonObject.addProperty("isEmpty", Boolean.valueOf(this.a()));
        jsonObject.addProperty("isValidNumber", Boolean.valueOf(this.b()));
        jsonObject.addProperty("isAtDefault", Boolean.valueOf(this.c()));
        jsonObject.addProperty("visible", Boolean.valueOf(this.i));
        return jsonObject;
    }
}

