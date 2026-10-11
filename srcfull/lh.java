/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;

public class lh
extends eP {
    private final /* synthetic */ dw a;
    private final /* synthetic */ fr b;
    private final /* synthetic */ fr c;
    private final /* synthetic */ String d;

    public /* synthetic */ lh(String string, String string2, String string3, List list, List list2, List list3) {
        super(string, string2);
        this.d = string3;
        this.a = new dw(string, string2, false);
        fr fr2 = new fr("", "", list, list2 != null ? list2 : new ArrayList());
        fr2.setNameParts(new String[]{"O", "\u0431", "\u044f", "\u0437", "\u0430", "\u0442", "\u0435", "\u043b", "\u044c", "\u043d", "\u044b", "\u0435", " ", "\u0447", "a", "\u0440", "\u044b"});
        fr2.setDescriptionParts(new String[]{"O", "\u0431", "\u044f", "\u0437", "\u0430", "\u0442", "\u0435", "\u043b", "\u044c", "\u043d", "\u043e", " ", "\u0434", "o", "\u043b", "\u0436", "\u043d", "\u044b", " ", "\u0431", "\u044b", "\u0442", "\u044c", " ", "\u043d", "a", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", "\u0435"});
        this.b = fr2;
        fr fr3 = new fr("", "", list, list3 != null ? list3 : new ArrayList());
        fr3.setNameParts(new String[]{"\u0418", "c", "\u043a", "\u043b", "\u044e", "\u0447", "\u0435", "\u043d", "\u043d", "\u044b", "\u0435", " ", "\u0447", "a", "\u0440", "\u044b"});
        fr3.setDescriptionParts(new String[]{"\u041d", "e", " ", "\u0434", "o", "\u043b", "\u0436", "\u043d", "\u044b", " ", "\u0431", "\u044b", "\u0442", "\u044c", " ", "\u043d", "a", " ", "\u043f", "\u0440", "e", "\u0434", "\u043c", "\u0435", "\u0442", "\u0435"});
        this.c = fr3;
        this.a.b(this::d);
        this.b.b(this::d);
        this.c.b(this::d);
    }

    @Override
    public /* bridge */ /* synthetic */ String i() {
        return "filter_menu";
    }

    public /* bridge */ /* synthetic */ fr b() {
        return this.c;
    }

    @Override
    public /* bridge */ /* synthetic */ void c() {
        this.a.c();
        this.b.c();
        this.c.c();
    }

    public /* bridge */ /* synthetic */ String a() {
        return this.d;
    }

    @Override
    public /* bridge */ /* synthetic */ JsonObject a() {
        JsonObject jsonObject = super.a();
        jsonObject.add("enabled", (JsonElement)this.a.a());
        jsonObject.add("required", (JsonElement)this.b.a());
        jsonObject.add("excluded", (JsonElement)this.c.a());
        return jsonObject;
    }

    public /* bridge */ /* synthetic */ fr a() {
        return this.b;
    }

    public /* bridge */ /* synthetic */ dw a() {
        return this.a;
    }

    @Override
    public /* bridge */ /* synthetic */ void a(JsonObject jsonObject) {
        super.a(jsonObject);
        if (jsonObject.has("enabled") && jsonObject.get("enabled").isJsonObject()) {
            this.a.a(jsonObject.getAsJsonObject("enabled"));
        }
        if (jsonObject.has("required") && jsonObject.get("required").isJsonObject()) {
            this.b.a(jsonObject.getAsJsonObject("required"));
        }
        if (jsonObject.has("excluded") && jsonObject.get("excluded").isJsonObject()) {
            this.c.a(jsonObject.getAsJsonObject("excluded"));
        }
    }
}

