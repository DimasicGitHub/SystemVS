/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import net.minecraft.class_2338;

public class au
extends eP {
    private final /* synthetic */ Map<String, kN> a;
    private final /* synthetic */ Set<String> b;

    public /* synthetic */ au(String string, String string2) {
        super(string, string2);
        this.a = new ConcurrentHashMap<String, kN>();
        this.b = ConcurrentHashMap.newKeySet();
    }

    @Override
    public /* bridge */ /* synthetic */ String i() {
        return "resource_index";
    }

    @Override
    public /* bridge */ /* synthetic */ void c() {
        this.a();
    }

    public /* bridge */ /* synthetic */ void a(Predicate predicate, String string) {
        boolean bl2 = false;
        Iterator<Map.Entry<String, kN>> iterator = this.a.entrySet().iterator();
        while (iterator.hasNext()) {
            kN kN2 = iterator.next().getValue();
            Iterator<Map.Entry<hH, Integer>> iterator2 = kN2.f.entrySet().iterator();
            while (iterator2.hasNext()) {
                hH hH2 = iterator2.next().getKey();
                if (!hH2.a.equals(string) || predicate.test(hH2.b)) continue;
                iterator2.remove();
                bl2 = true;
            }
            if (!kN2.f.isEmpty()) continue;
            iterator.remove();
            bl2 = true;
        }
        if (bl2) {
            this.d();
        }
    }

    @Override
    public /* bridge */ /* synthetic */ JsonObject a() {
        JsonObject jsonObject = super.a();
        JsonArray jsonArray = new JsonArray();
        for (kN kN2 : this.a.values()) {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("id", kN2.a);
            jsonObject2.addProperty("plainId", kN2.b);
            jsonObject2.addProperty("name", kN2.c);
            jsonObject2.addProperty("search", kN2.d);
            if (kN2.e != null) {
                jsonObject2.addProperty("snbt", kN2.e);
            }
            jsonObject2.addProperty("highlighted", Boolean.valueOf(this.b.contains(kN2.a)));
            JsonArray jsonArray2 = new JsonArray();
            for (Map.Entry<hH, Integer> entry : kN2.f.entrySet()) {
                hH hH2 = entry.getKey();
                JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty("dim", hH2.a);
                jsonObject3.addProperty("x", (Number)hH2.b.method_10263());
                jsonObject3.addProperty("y", (Number)hH2.b.method_10264());
                jsonObject3.addProperty("z", (Number)hH2.b.method_10260());
                jsonObject3.addProperty("n", (Number)entry.getValue());
                jsonArray2.add((JsonElement)jsonObject3);
            }
            jsonObject2.add("locs", (JsonElement)jsonArray2);
            jsonArray.add((JsonElement)jsonObject2);
        }
        jsonObject.add("items", (JsonElement)jsonArray);
        return jsonObject;
    }

    @Override
    public /* bridge */ /* synthetic */ void a(JsonObject jsonObject) {
        super.a(jsonObject);
        this.a.clear();
        this.b.clear();
        if (!jsonObject.has("items")) {
            return;
        }
        JsonArray jsonArray = jsonObject.getAsJsonArray("items");
        for (int i2 = 0; i2 < jsonArray.size(); ++i2) {
            JsonObject jsonObject2 = jsonArray.get(i2).getAsJsonObject();
            String string = jsonObject2.get("id").getAsString();
            String string2 = jsonObject2.has("plainId") ? jsonObject2.get("plainId").getAsString() : (string.contains("\u0000") ? string.substring(0, string.indexOf(0)) : string);
            String string3 = jsonObject2.has("name") ? jsonObject2.get("name").getAsString() : string;
            String string4 = jsonObject2.has("search") ? jsonObject2.get("search").getAsString() : string3.toLowerCase();
            String string5 = jsonObject2.has("snbt") ? jsonObject2.get("snbt").getAsString() : null;
            kN kN2 = new kN(string, string2, string3, string4, string5);
            if (jsonObject2.has("locs")) {
                JsonArray jsonArray2 = jsonObject2.getAsJsonArray("locs");
                for (int i3 = 0; i3 < jsonArray2.size(); ++i3) {
                    JsonObject jsonObject3 = jsonArray2.get(i3).getAsJsonObject();
                    hH hH2 = new hH(jsonObject3.get("dim").getAsString(), new class_2338(jsonObject3.get("x").getAsInt(), jsonObject3.get("y").getAsInt(), jsonObject3.get("z").getAsInt()));
                    int n2 = jsonObject3.has("n") ? jsonObject3.get("n").getAsInt() : 1;
                    kN2.f.put(hH2, n2);
                }
            }
            this.a.put(string, kN2);
            if (!jsonObject2.has("highlighted") || !jsonObject2.get("highlighted").getAsBoolean()) continue;
            this.b.add(string);
        }
    }

    public /* bridge */ /* synthetic */ Map a() {
        return this.a;
    }

    public /* bridge */ /* synthetic */ void a() {
        this.a.clear();
        this.b.clear();
        this.d();
    }

    public /* bridge */ /* synthetic */ void a(String string, class_2338 class_23382) {
        hH hH2 = new hH(string, class_23382.method_10062());
        boolean bl2 = false;
        for (kN kN2 : this.a.values()) {
            if (kN2.f.remove(hH2) == null) continue;
            bl2 = true;
        }
        if (!bl2) {
            return;
        }
        this.a.entrySet().removeIf(entry -> ((kN)entry.getValue()).f.isEmpty());
        this.d();
    }

    public /* bridge */ /* synthetic */ void a(String string2, class_2338 class_23382, List list) {
        hH hH2 = new hH(string2, class_23382.method_10062());
        for (kN object : this.a.values()) {
            object.f.remove(hH2);
        }
        for (cS cS2 : list) {
            kN kN2 = this.a.computeIfAbsent(cS2.a, string -> new kN(cS2.a, cS2.b, cS2.c, cS2.d, cS2.e));
            kN2.c = cS2.c;
            kN2.d = cS2.d;
            if (cS2.e != null && !cS2.e.isEmpty()) {
                kN2.e = cS2.e;
            }
            kN2.f.merge(hH2, cS2.f, Integer::sum);
        }
        this.a.entrySet().removeIf(entry -> ((kN)entry.getValue()).f.isEmpty());
        this.d();
    }

    public /* bridge */ /* synthetic */ List a(String string) {
        HashSet<class_2338> hashSet = new HashSet<class_2338>();
        for (String string2 : this.b) {
            kN kN2 = this.a.get(string2);
            if (kN2 == null) continue;
            for (hH hH2 : kN2.f.keySet()) {
                if (!hH2.a.equals(string)) continue;
                hashSet.add(hH2.b);
            }
        }
        return new ArrayList(hashSet);
    }

    public /* bridge */ /* synthetic */ Set a() {
        return this.b;
    }

    public /* bridge */ /* synthetic */ void a(String string, boolean bl2) {
        if (bl2) {
            this.b.add(string);
        } else {
            this.b.remove(string);
        }
        this.d();
    }

    public /* bridge */ /* synthetic */ boolean a(String string) {
        return this.b.contains(string);
    }
}

