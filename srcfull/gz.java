/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class gz
extends fa {
    @Expose
    private double a;
    @Expose
    private double b;
    @Expose
    private double c;
    @Expose
    private double d;
    @Expose
    private double e;
    @Expose
    private String f;
    @Expose
    private int o;
    private transient /* synthetic */ String p;
    private transient /* synthetic */ double q;

    public /* synthetic */ gz(String string, String string2, double d2, double d3, double d4, double d5, String string3, int n2) {
        super(string, string2);
        this.q = Double.NaN;
        this.b = d2;
        this.a = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = string3 != null ? string3 : "";
        this.o = Math.max(0, n2);
    }

    public /* synthetic */ gz(String string, String string2, double d2, double d3, double d4, double d5) {
        this(string, string2, d2, d3, d4, d5, "", gz.a(d5));
    }

    public /* bridge */ /* synthetic */ double e() {
        return this.b;
    }

    public /* bridge */ /* synthetic */ void e(double d2) {
        this.c = d2;
    }

    @Override
    public /* bridge */ /* synthetic */ String i() {
        return "slider";
    }

    public /* bridge */ /* synthetic */ void b() {
        this.a(this.a - this.e);
    }

    public /* bridge */ /* synthetic */ double b() {
        return (this.a - this.c) / (this.d - this.c) * 100.0;
    }

    public /* bridge */ /* synthetic */ boolean b() {
        return Math.abs(this.a - this.d) < this.e / 2.0;
    }

    public /* bridge */ /* synthetic */ String b() {
        return this.j() + ": " + this.a();
    }

    public /* bridge */ /* synthetic */ int b() {
        return (int)Math.round(this.c() / this.e);
    }

    public /* bridge */ /* synthetic */ void b(double d2) {
        this.a = Math.max(this.c, Math.min(this.d, d2));
    }

    public /* bridge */ /* synthetic */ int c() {
        return this.o;
    }

    public /* bridge */ /* synthetic */ boolean c() {
        return Math.abs(this.a - this.b) < this.e / 2.0;
    }

    public /* bridge */ /* synthetic */ String c() {
        return this.f;
    }

    public /* bridge */ /* synthetic */ double c() {
        return this.d - this.c;
    }

    @Override
    public /* bridge */ /* synthetic */ void c() {
        this.a(this.b);
    }

    public /* bridge */ /* synthetic */ void c(double d2) {
        d2 = Math.max(0.0, Math.min(100.0, d2));
        this.a(this.c + (this.d - this.c) * (d2 / 100.0));
    }

    public /* bridge */ /* synthetic */ double h() {
        return this.e;
    }

    public /* bridge */ /* synthetic */ void f(double d2) {
        this.d = d2;
    }

    public /* bridge */ /* synthetic */ double f() {
        return this.c;
    }

    public /* bridge */ /* synthetic */ double d() {
        return this.a;
    }

    public /* bridge */ /* synthetic */ void d(double d2) {
        this.b = d2;
    }

    public /* bridge */ /* synthetic */ void a(double d2) {
        double d3 = (double)Math.round(d2 * Math.pow(10.0, this.o)) / Math.pow(10.0, this.o);
        double d4 = Math.max(this.c, Math.min(this.d, d3));
        if (this.a != d4) {
            this.a = d4;
            this.d();
        }
    }

    public /* bridge */ /* synthetic */ void a(int n2) {
        this.o = n2;
    }

    public /* bridge */ /* synthetic */ void a(String string) {
        this.f = string;
    }

    private static /* bridge */ /* synthetic */ int a(double d2) {
        if (d2 >= 1.0) {
            return 0;
        }
        if (d2 <= 0.0) {
            return 1;
        }
        return Math.min(6, Math.max(0, (int)Math.ceil(-Math.log10(d2))));
    }

    public /* bridge */ /* synthetic */ float a() {
        return (float)this.a;
    }

    public /* bridge */ /* synthetic */ String a() {
        if (this.p != null && Double.doubleToRawLongBits(this.a) == Double.doubleToRawLongBits(this.q)) {
            return this.p;
        }
        String string = this.o == 0 ? "%.0f%s" : "%." + this.o + "f%s";
        this.p = String.format(string, this.a, this.f);
        this.q = this.a;
        return this.p;
    }

    public /* bridge */ /* synthetic */ double a() {
        return this.a;
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return Math.abs(this.a - this.c) < this.e / 2.0;
    }

    public /* bridge */ /* synthetic */ long a() {
        return (long)this.a;
    }

    public /* bridge */ /* synthetic */ void a() {
        this.a(this.a + this.e);
    }

    @Override
    public /* bridge */ /* synthetic */ void a(JsonObject jsonObject) {
        if (jsonObject.has("value")) {
            this.a(jsonObject.get("value").getAsDouble());
        }
        if (jsonObject.has("percentage")) {
            this.c(jsonObject.get("percentage").getAsDouble());
        }
        if (jsonObject.has("visible")) {
            this.i = jsonObject.get("visible").getAsBoolean();
        }
    }

    @Override
    public /* bridge */ /* synthetic */ JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", this.i());
        jsonObject.addProperty("value", (Number)this.a);
        jsonObject.addProperty("defaultValue", (Number)this.b);
        jsonObject.addProperty("min", (Number)this.c);
        jsonObject.addProperty("max", (Number)this.d);
        jsonObject.addProperty("step", (Number)this.e);
        jsonObject.addProperty("unit", this.f);
        jsonObject.addProperty("decimalPlaces", (Number)this.o);
        jsonObject.addProperty("formattedValue", this.a());
        jsonObject.addProperty("percentage", (Number)this.b());
        jsonObject.addProperty("isAtMin", Boolean.valueOf(this.a()));
        jsonObject.addProperty("isAtMax", Boolean.valueOf(this.b()));
        jsonObject.addProperty("isAtDefault", Boolean.valueOf(this.c()));
        jsonObject.addProperty("range", (Number)this.c());
        jsonObject.addProperty("stepCount", (Number)this.b());
        jsonObject.addProperty("visible", Boolean.valueOf(this.i));
        return jsonObject;
    }

    public /* bridge */ /* synthetic */ int a() {
        return (int)Math.round(this.a);
    }

    public /* bridge */ /* synthetic */ void g(double d2) {
        this.e = d2;
    }

    public /* bridge */ /* synthetic */ double g() {
        return this.d;
    }
}

