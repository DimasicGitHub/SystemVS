/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class fd
extends fa {
    @Expose
    private String a;
    @Expose
    private final String b;

    public /* synthetic */ fd(String string, String string2) {
        this(string, string2, "");
    }

    public /* synthetic */ fd(String string, String string2, String string3) {
        super(string, string2);
        this.a = this.b = string3 != null ? string3 : "";
    }

    @Override
    public /* bridge */ /* synthetic */ String i() {
        return "file_picker";
    }

    public /* bridge */ /* synthetic */ String b() {
        return this.a;
    }

    @Override
    public /* bridge */ /* synthetic */ void c() {
        this.a = this.b;
    }

    public /* bridge */ /* synthetic */ String c() {
        return this.b;
    }

    @Override
    public /* bridge */ /* synthetic */ JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", this.i());
        jsonObject.addProperty("value", this.a);
        jsonObject.addProperty("visible", Boolean.valueOf(this.i));
        return jsonObject;
    }

    public /* bridge */ /* synthetic */ void a(String string) {
        this.a = string != null ? string : "";
        this.d();
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return this.a != null && !this.a.isEmpty();
    }

    public /* bridge */ /* synthetic */ String a() {
        if (!this.a()) {
            return "";
        }
        int n2 = Math.max(this.a.lastIndexOf(47), this.a.lastIndexOf(92));
        return n2 >= 0 ? this.a.substring(n2 + 1) : this.a;
    }

    @Override
    public /* bridge */ /* synthetic */ void a(JsonObject jsonObject) {
        if (jsonObject.has("value")) {
            this.a = jsonObject.get("value").getAsString();
        }
        if (jsonObject.has("visible")) {
            this.i = jsonObject.get("visible").getAsBoolean();
        }
    }
}

