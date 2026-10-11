/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.concurrent.ThreadLocalRandom;

public class dm
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
    private double f;
    @Expose
    private double o;
    @Expose
    private String p;
    @Expose
    private int q;

    public /* synthetic */ dm(String string, String string2, double d2, double d3, double d4, double d5, double d6) {
        this(string, string2, d2, d3, d4, d5, d6, "", 1);
    }

    public /* synthetic */ dm(String string, String string2, double d2, double d3, double d4, double d5, double d6, String string3, int n2) {
        super(string, string2);
        this.c = d2;
        this.d = d3;
        this.e = d4;
        this.f = d5;
        this.o = d6;
        this.p = string3 != null ? string3 : "";
        this.q = Math.max(0, n2);
        this.a = this.a(d2);
        this.b = this.a(d3);
    }

    public /* bridge */ /* synthetic */ double e() {
        return this.d;
    }

    public /* bridge */ /* synthetic */ void e(double d2) {
        this.e = d2;
    }

    @Override
    public /* bridge */ /* synthetic */ String i() {
        return "range_slider";
    }

    public /* bridge */ /* synthetic */ void b(double d2) {
        double d3 = this.b(this.a(Math.max(d2, this.a)));
        if (this.b != d3) {
            this.b = d3;
            this.d();
        }
    }

    public /* bridge */ /* synthetic */ double b() {
        return this.a;
    }

    private /* bridge */ /* synthetic */ double b(double d2) {
        return (double)Math.round(d2 * Math.pow(10.0, this.q)) / Math.pow(10.0, this.q);
    }

    public /* bridge */ /* synthetic */ String b() {
        return this.a(this.b);
    }

    public /* bridge */ /* synthetic */ double c() {
        return this.b;
    }

    public /* bridge */ /* synthetic */ String c() {
        return this.a() + " - " + this.b();
    }

    @Override
    public /* bridge */ /* synthetic */ void c() {
        this.a(this.c, this.d);
    }

    public /* bridge */ /* synthetic */ void c(double d2) {
        this.c = d2;
    }

    public /* bridge */ /* synthetic */ double h() {
        return this.o;
    }

    public /* bridge */ /* synthetic */ void f(double d2) {
        this.f = d2;
    }

    public /* bridge */ /* synthetic */ double f() {
        return this.e;
    }

    public /* bridge */ /* synthetic */ double d() {
        return this.c;
    }

    public /* bridge */ /* synthetic */ String d() {
        return this.p;
    }

    public /* bridge */ /* synthetic */ void d(double d2) {
        this.d = d2;
    }

    public /* bridge */ /* synthetic */ void a(int n2) {
        this.q = n2;
    }

    public /* bridge */ /* synthetic */ void a(String string) {
        this.p = string;
    }

    public /* bridge */ /* synthetic */ void a(double d2, double d3) {
        double d4 = this.b(this.a(Math.min(d2, d3)));
        double d5 = this.b(this.a(Math.max(d2, d3)));
        if (this.a != d4 || this.b != d5) {
            this.a = d4;
            this.b = d5;
            this.d();
        }
    }

    public /* bridge */ /* synthetic */ int a() {
        return this.q;
    }

    @Override
    public /* bridge */ /* synthetic */ JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", this.i());
        jsonObject.addProperty("valueLow", (Number)this.a);
        jsonObject.addProperty("valueHigh", (Number)this.b);
        jsonObject.addProperty("defaultLow", (Number)this.c);
        jsonObject.addProperty("defaultHigh", (Number)this.d);
        jsonObject.addProperty("min", (Number)this.e);
        jsonObject.addProperty("max", (Number)this.f);
        jsonObject.addProperty("step", (Number)this.o);
        jsonObject.addProperty("unit", this.p);
        jsonObject.addProperty("decimalPlaces", (Number)this.q);
        jsonObject.addProperty("visible", Boolean.valueOf(this.i));
        return jsonObject;
    }

    public /* bridge */ /* synthetic */ long a() {
        return Math.round(this.a());
    }

    public /* bridge */ /* synthetic */ String a() {
        return this.a(this.a);
    }

    private /* bridge */ /* synthetic */ double a(double d2) {
        return Math.max(this.e, Math.min(this.f, d2));
    }

    private /* bridge */ /* synthetic */ String a(double d2) {
        if (this.q == 0) {
            return String.format("%.0f%s", d2, this.p);
        }
        return String.format("%." + this.q + "f%s", d2, this.p);
    }

    public /* bridge */ /* synthetic */ void a(double d2) {
        double d3 = this.b(this.a(Math.min(d2, this.b)));
        if (this.a != d3) {
            this.a = d3;
            this.d();
        }
    }

    public /* bridge */ /* synthetic */ double a() {
        if (Math.abs(this.a - this.b) < this.o / 2.0) {
            return this.a;
        }
        return ThreadLocalRandom.current().nextDouble(this.a, this.b);
    }

    @Override
    public /* bridge */ /* synthetic */ void a(JsonObject jsonObject) {
        double d2 = jsonObject.has("valueLow") ? jsonObject.get("valueLow").getAsDouble() : this.a;
        double d3 = jsonObject.has("valueHigh") ? jsonObject.get("valueHigh").getAsDouble() : this.b;
        this.a(d2, d3);
        if (jsonObject.has("visible")) {
            this.i = jsonObject.get("visible").getAsBoolean();
        }
    }

    public /* bridge */ /* synthetic */ double g() {
        return this.f;
    }

    public /* bridge */ /* synthetic */ void g(double d2) {
        this.o = d2;
    }
}

