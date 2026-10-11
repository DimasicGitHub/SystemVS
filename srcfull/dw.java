/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class dw
extends fa {
    @Expose
    private boolean c;
    @Expose
    private boolean d;

    public /* synthetic */ dw(String string, String string2, boolean bl2) {
        super(string, string2);
        this.d = bl2;
        this.c = bl2;
    }

    @Override
    public /* bridge */ /* synthetic */ String i() {
        return "boolean";
    }

    public /* bridge */ /* synthetic */ boolean b() {
        return this.c;
    }

    public /* bridge */ /* synthetic */ void b(boolean bl2) {
        this.d = bl2;
    }

    public /* bridge */ /* synthetic */ boolean c() {
        return this.d;
    }

    @Override
    public /* bridge */ /* synthetic */ void c() {
        this.a(this.d);
    }

    @Override
    public /* bridge */ /* synthetic */ JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", this.i());
        jsonObject.addProperty("value", Boolean.valueOf(this.c));
        jsonObject.addProperty("defaultValue", Boolean.valueOf(this.d));
        jsonObject.addProperty("visible", Boolean.valueOf(this.i));
        return jsonObject;
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return this.c;
    }

    public /* bridge */ /* synthetic */ void a(boolean bl2) {
        if (this.c != bl2) {
            this.c = bl2;
            this.d();
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void a(JsonObject jsonObject) {
        if (jsonObject.has("value")) {
            this.c = jsonObject.get("value").getAsBoolean();
        }
        if (jsonObject.has("visible")) {
            this.i = jsonObject.get("visible").getAsBoolean();
        }
    }

    public /* bridge */ /* synthetic */ void a() {
        this.c = !this.c;
        this.d();
    }
}

