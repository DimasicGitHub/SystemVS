/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class lw
extends fa {
    @Expose
    private int a;
    @Expose
    private int b;
    @Expose
    private int c;
    @Expose
    private int d;
    @Expose
    private int e;
    @Expose
    private int f;
    @Expose
    private int o;
    @Expose
    private int p;
    @Expose
    private boolean q;

    public /* synthetic */ lw(String string, String string2, int n2) {
        this(string, string2, n2, false);
    }

    public /* synthetic */ lw(String string, String string2, int n2, boolean bl2) {
        super(string, string2);
        this.e = n2 >> 16 & 0xFF;
        this.f = n2 >> 8 & 0xFF;
        this.o = n2 & 0xFF;
        this.p = bl2 ? n2 >> 24 & 0xFF : 255;
        this.a = this.e;
        this.b = this.f;
        this.c = this.o;
        this.d = this.p;
        this.q = bl2;
    }

    public /* bridge */ /* synthetic */ int e() {
        return this.b;
    }

    public /* bridge */ /* synthetic */ void e(int n2) {
        this.d = n2;
    }

    public /* bridge */ /* synthetic */ int i() {
        return this.f;
    }

    public /* bridge */ /* synthetic */ void i(int n2) {
        this.p = n2;
    }

    @Override
    public /* bridge */ /* synthetic */ String i() {
        return "color";
    }

    public /* bridge */ /* synthetic */ void b(int n2) {
        this.a = n2;
    }

    public /* bridge */ /* synthetic */ boolean b() {
        return this.q;
    }

    public /* bridge */ /* synthetic */ int b() {
        return 0xFF000000 | this.a << 16 | this.b << 8 | this.c;
    }

    public /* bridge */ /* synthetic */ int c() {
        return this.d << 24 | this.a << 16 | this.b << 8 | this.c;
    }

    @Override
    public /* bridge */ /* synthetic */ void c() {
        int n2 = this.p;
        int n3 = this.o;
        int n4 = this.f;
        int n5 = this.e;
        this.a(n5, n4, n2, n3);
    }

    public /* bridge */ /* synthetic */ void c(int n2) {
        this.b = n2;
    }

    public /* bridge */ /* synthetic */ int h() {
        return this.e;
    }

    public /* bridge */ /* synthetic */ void h(int n2) {
        this.o = n2;
    }

    public /* bridge */ /* synthetic */ int f() {
        return this.c;
    }

    public /* bridge */ /* synthetic */ void f(int n2) {
        this.e = n2;
    }

    public /* bridge */ /* synthetic */ void d(int n2) {
        this.c = n2;
    }

    public /* bridge */ /* synthetic */ int d() {
        return this.a;
    }

    public /* bridge */ /* synthetic */ int a() {
        return this.d << 24 | this.a << 16 | this.b << 8 | this.c;
    }

    public /* bridge */ /* synthetic */ void a(boolean bl2) {
        this.q = bl2;
    }

    public /* bridge */ /* synthetic */ void a(int n2, int n3, int n4, int n5) {
        int n6 = Math.max(0, Math.min(255, n2));
        int n7 = Math.max(0, Math.min(255, n3));
        int n8 = Math.max(0, Math.min(255, n5));
        int n9 = this.q ? Math.max(0, Math.min(255, n4)) : 255;
        this.a(n9 << 24 | n6 << 16 | n7 << 8 | n8);
    }

    public /* bridge */ /* synthetic */ void a(int n2, int n3, int n4) {
        int n5 = Math.max(0, Math.min(255, n4));
        int n6 = Math.max(0, Math.min(255, n3));
        int n7 = Math.max(0, Math.min(255, n2));
        this.a(this.d << 24 | n5 << 16 | n6 << 8 | n7);
    }

    public /* bridge */ /* synthetic */ void a(int n2) {
        int n3 = this.a;
        int n4 = this.b;
        int n5 = this.c;
        int n6 = this.d;
        this.a = n2 >> 16 & 0xFF;
        this.b = n2 >> 8 & 0xFF;
        this.c = n2 & 0xFF;
        if (this.q) {
            this.d = n2 >> 24 & 0xFF;
        }
        if (n3 != this.a || n4 != this.b || n5 != this.c || n6 != this.d) {
            this.d();
        }
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return this.a == this.e && this.b == this.f && this.c == this.o && this.d == this.p;
    }

    @Override
    public /* bridge */ /* synthetic */ void a(JsonObject jsonObject) {
        if (jsonObject.has("red") && jsonObject.has("green") && jsonObject.has("blue")) {
            int n2;
            int n3 = jsonObject.get("red").getAsInt();
            int n4 = jsonObject.get("green").getAsInt();
            int n5 = jsonObject.get("blue").getAsInt();
            int n6 = n2 = jsonObject.has("alpha") ? jsonObject.get("alpha").getAsInt() : 255;
            int n7 = n5;
            int n8 = n4;
            int n9 = n3;
            this.a(n9, n8, n6, n7);
        }
        if (jsonObject.has("visible")) {
            this.i = jsonObject.get("visible").getAsBoolean();
        }
    }

    public /* bridge */ /* synthetic */ String a() {
        if (this.q) {
            return String.format("#%02X%02X%02X%02X", this.a, this.b, this.c, this.d);
        }
        return String.format("#%02X%02X%02X", this.a, this.b, this.c);
    }

    @Override
    public /* bridge */ /* synthetic */ JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", this.i());
        jsonObject.addProperty("red", (Number)this.a);
        jsonObject.addProperty("green", (Number)this.b);
        jsonObject.addProperty("blue", (Number)this.c);
        jsonObject.addProperty("alpha", (Number)this.d);
        jsonObject.addProperty("hasAlpha", Boolean.valueOf(this.q));
        jsonObject.addProperty("hex", this.a());
        jsonObject.addProperty("visible", Boolean.valueOf(this.i));
        return jsonObject;
    }

    public /* bridge */ /* synthetic */ int k() {
        return this.p;
    }

    public /* bridge */ /* synthetic */ int g() {
        return this.d;
    }

    public /* bridge */ /* synthetic */ void g(int n2) {
        this.f = n2;
    }

    public /* bridge */ /* synthetic */ int j() {
        return this.o;
    }
}

