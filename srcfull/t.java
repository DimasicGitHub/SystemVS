/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_2248;
import net.minecraft.class_2960;
import net.minecraft.class_7923;

public class t
extends fa {
    private final /* synthetic */ Map<class_2248, fZ> a;
    private final /* synthetic */ Map<class_2248, fZ> b;

    public /* synthetic */ t(String string, String string2) {
        super(string, string2);
        this.a = new ConcurrentHashMap<class_2248, fZ>();
        this.b = new HashMap<class_2248, fZ>();
    }

    @Override
    public /* bridge */ /* synthetic */ String i() {
        return "blocklist";
    }

    @Override
    public /* bridge */ /* synthetic */ void c() {
        this.a.clear();
        for (Map.Entry<class_2248, fZ> entry : this.b.entrySet()) {
            this.a.put(entry.getKey(), new fZ(entry.getValue().a(), entry.getValue().a()));
        }
        this.d();
    }

    public /* bridge */ /* synthetic */ void a(int n2, class_2248 class_22482) {
        fZ fZ2 = this.a.get(class_22482);
        if (fZ2 != null) {
            fZ2.a(n2);
            this.d();
        }
    }

    @Override
    public /* bridge */ /* synthetic */ JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", this.i());
        JsonArray jsonArray = new JsonArray();
        for (Map.Entry<class_2248, fZ> entry : this.a.entrySet()) {
            JsonObject jsonObject2 = new JsonObject();
            class_2960 class_29602 = class_7923.field_41175.method_10221((Object)entry.getKey());
            jsonObject2.addProperty("id", class_29602.toString());
            jsonObject2.addProperty("enabled", Boolean.valueOf(entry.getValue().a()));
            int n2 = entry.getValue().a();
            jsonObject2.addProperty("r", (Number)(n2 >> 16 & 0xFF));
            jsonObject2.addProperty("g", (Number)(n2 >> 8 & 0xFF));
            jsonObject2.addProperty("b", (Number)(n2 & 0xFF));
            jsonObject2.addProperty("a", (Number)(n2 >> 24 & 0xFF));
            jsonArray.add((JsonElement)jsonObject2);
        }
        jsonObject.add("blocks", (JsonElement)jsonArray);
        return jsonObject;
    }

    @Override
    public /* bridge */ /* synthetic */ void a(JsonObject jsonObject) {
        if (!jsonObject.has("blocks")) {
            return;
        }
        this.a.clear();
        JsonArray jsonArray = jsonObject.getAsJsonArray("blocks");
        for (int i2 = 0; i2 < jsonArray.size(); ++i2) {
            JsonObject jsonObject2 = jsonArray.get(i2).getAsJsonObject();
            String string = jsonObject2.get("id").getAsString();
            class_2960 class_29602 = class_2960.method_60654((String)string);
            class_2248 class_22482 = (class_2248)class_7923.field_41175.method_63535(class_29602);
            if (class_22482 == null) continue;
            boolean bl2 = jsonObject2.get("enabled").getAsBoolean();
            int n2 = jsonObject2.get("r").getAsInt();
            int n3 = jsonObject2.get("g").getAsInt();
            int n4 = jsonObject2.get("b").getAsInt();
            int n5 = jsonObject2.get("a").getAsInt();
            int n6 = n5 << 24 | n2 << 16 | n3 << 8 | n4;
            this.a.put(class_22482, new fZ(bl2, n6));
        }
        this.d();
    }

    public /* bridge */ /* synthetic */ Map a() {
        return this.a;
    }

    public /* bridge */ /* synthetic */ void a(class_2248 class_22482, boolean bl2, int n2) {
        fZ fZ2 = new fZ(bl2, n2);
        this.b.put(class_22482, fZ2);
        this.a.put(class_22482, new fZ(bl2, n2));
    }

    public /* bridge */ /* synthetic */ void a(boolean bl2, class_2248 class_22482, int n2) {
        this.a.put(class_22482, new fZ(bl2, n2));
        this.d();
    }

    public /* bridge */ /* synthetic */ void a(class_2248 class_22482) {
        this.a.remove(class_22482);
        this.d();
    }

    public /* bridge */ /* synthetic */ boolean a(class_2248 class_22482) {
        fZ fZ2 = this.a.get(class_22482);
        return fZ2 != null && fZ2.a();
    }

    public /* bridge */ /* synthetic */ int a(class_2248 class_22482) {
        fZ fZ2 = this.a.get(class_22482);
        return fZ2 != null ? fZ2.a() : -1;
    }

    public /* bridge */ /* synthetic */ void a(class_2248 class_22482, boolean bl2) {
        fZ fZ2 = this.a.get(class_22482);
        if (fZ2 != null) {
            fZ2.a(bl2);
            this.d();
        }
    }
}

