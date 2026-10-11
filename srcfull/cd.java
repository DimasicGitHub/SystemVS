/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class cd {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private static final String[] b = F.a("arrow", "arrow_3d");
    private static volatile Map<String, byte[]> c = null;
    private static volatile Map<String, byte[]> d = null;
    private static volatile List<fv> e = null;
    private static volatile List<cI> f = null;
    private static volatile List<o> g = null;
    private static volatile Map<String, String> h = null;

    private cd() {
    }

    public static Map b() {
        return d;
    }

    public static List b() {
        return f;
    }

    public static List c() {
        return g;
    }

    public static Map c() {
        return h;
    }

    private static List a(Class clazz, String string, JsonObject jsonObject) {
        if (!jsonObject.has(string) || jsonObject.get(string).isJsonNull()) {
            return null;
        }
        try {
            String string2 = jsonObject.get(string).getAsString();
            ArrayList<Object> arrayList = new ArrayList<Object>();
            JsonArray jsonArray = JsonParser.parseString((String)string2).getAsJsonArray();
            Gson gson = new Gson();
            for (JsonElement jsonElement : jsonArray) {
                arrayList.add(gson.fromJson(jsonElement, clazz));
            }
            return arrayList;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Map a() {
        return c;
    }

    private static Map a(JsonObject jsonObject) {
        if (!jsonObject.has("translations") || jsonObject.get("translations").isJsonNull()) {
            return null;
        }
        try {
            String string = jsonObject.get("translations").getAsString();
            JsonObject jsonObject2 = JsonParser.parseString((String)string).getAsJsonObject();
            HashMap<String, String> hashMap = new HashMap<String, String>();
            for (Map.Entry entry : jsonObject2.entrySet()) {
                if (((JsonElement)entry.getValue()).isJsonNull()) continue;
                hashMap.put((String)entry.getKey(), ((JsonElement)entry.getValue()).getAsString());
            }
            return hashMap;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static Map a(String string, JsonObject jsonObject) {
        if (!jsonObject.has(string) || !jsonObject.get(string).isJsonObject()) {
            return null;
        }
        HashMap<String, byte[]> hashMap = new HashMap<String, byte[]>();
        for (Map.Entry entry : jsonObject.getAsJsonObject(string).entrySet()) {
            if (((JsonElement)entry.getValue()).isJsonNull()) continue;
            hashMap.put((String)entry.getKey(), Base64.getDecoder().decode(((JsonElement)entry.getValue()).getAsString()));
        }
        return hashMap;
    }

    public static void a() {
        if (!a.compareAndSet(false, true)) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (String string : b) {
            jsonArray.add(string);
        }
        jsonObject.add("images", (JsonElement)jsonArray);
        jsonObject.addProperty("sounds", Boolean.valueOf(true));
        jsonObject.addProperty("shaders", Boolean.valueOf(true));
        jsonObject.addProperty("fonts", Boolean.valueOf(true));
        jsonObject.addProperty("icons", Boolean.valueOf(true));
        JsonObject jsonObject2 = do.b(jsonObject);
        if (jsonObject2 == null) {
            return;
        }
        String string = "images";
        JsonObject jsonObject3 = jsonObject2;
        c = cd.a(string, jsonObject3);
        String string2 = "sounds";
        JsonObject jsonObject4 = jsonObject2;
        d = cd.a(string2, jsonObject4);
        Class<fv> clazz = fv.class;
        String string3 = "shaders";
        JsonObject jsonObject5 = jsonObject2;
        e = cd.a(clazz, string3, jsonObject5);
        Class<cI> clazz2 = cI.class;
        String string4 = "fonts";
        JsonObject jsonObject6 = jsonObject2;
        f = cd.a(clazz2, string4, jsonObject6);
        Class<o> clazz3 = o.class;
        String string5 = "icons";
        JsonObject jsonObject7 = jsonObject2;
        g = cd.a(clazz3, string5, jsonObject7);
    }

    public static List a() {
        return e;
    }
}

