/*
 * Decompiled with CFR 0.152.
 */
import b.Boot;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class do {
    private static final Gson a = new Gson();
    private static volatile boolean b = false;

    public static boolean e(String string, String string2) {
        JsonObject jsonObject = do.a("93");
        jsonObject.addProperty("configName", string2);
        jsonObject.addProperty("payload", string);
        return do.b(jsonObject);
    }

    public static String b(String string) {
        JsonObject jsonObject = do.a("39");
        jsonObject.addProperty("configName", string);
        JsonObject jsonObject2 = do.a(jsonObject);
        if (!do.a(jsonObject2) || !jsonObject2.has("data")) {
            return null;
        }
        JsonObject jsonObject3 = jsonObject2.getAsJsonObject("data");
        return jsonObject3.has("config_key") ? jsonObject3.get("config_key").getAsString() : null;
    }

    private static boolean b(JsonObject jsonObject) {
        return do.a(do.a(jsonObject));
    }

    public static void b() {
        lm.b();
        JsonObject jsonObject = do.a("4");
        jsonObject.addProperty("lastMinecraftName", lm.a());
        String string = lm.b();
        if (string != null) {
            jsonObject.addProperty("currentServer", string);
        }
        do.a(jsonObject);
    }

    public static JsonObject b(JsonObject jsonObject) {
        JsonObject jsonObject2 = do.a("56");
        jsonObject2.add("assets", (JsonElement)jsonObject);
        JsonObject jsonObject3 = do.a(jsonObject2);
        if (!do.a(jsonObject3) || !jsonObject3.has("data")) {
            return null;
        }
        return jsonObject3.getAsJsonObject("data");
    }

    public static boolean b(String string, String string2) {
        JsonObject jsonObject = do.a("35");
        jsonObject.addProperty("configName", string2);
        jsonObject.addProperty("newConfigName", string);
        return do.b(jsonObject);
    }

    public static boolean b(String string) {
        JsonObject jsonObject = do.a("37");
        jsonObject.addProperty("configName", string);
        return do.b(jsonObject);
    }

    public static List b() {
        Type type = new O().getType();
        String string = "fonts";
        JsonObject jsonObject = do.a(do.a("13"));
        return do.a(string, jsonObject, type);
    }

    public static boolean c(String string, String string2) {
        JsonObject jsonObject = do.a("36");
        jsonObject.addProperty("configName", string);
        jsonObject.addProperty("configDescription", string2);
        return do.b(jsonObject);
    }

    public static boolean c(String string) {
        JsonObject jsonObject = do.a("91");
        jsonObject.addProperty("payload", string);
        return do.b(jsonObject);
    }

    public static List c() {
        Type type = new eH().getType();
        String string = "icons";
        JsonObject jsonObject = do.a(do.a("15"));
        return do.a(string, jsonObject, type);
    }

    public static String c(String string) {
        JsonObject jsonObject = do.a("46");
        jsonObject.addProperty("configName", string);
        JsonObject jsonObject2 = do.a(jsonObject);
        if (!do.a(jsonObject2) || !jsonObject2.has("data")) {
            return null;
        }
        return do.a(jsonObject2.getAsJsonObject("data"), "config_key");
    }

    public static void c() {
        JsonObject jsonObject = do.a("5");
        jsonObject.addProperty("lastMinecraftName", lm.a());
        do.a(jsonObject);
    }

    public static boolean d(String string, String string2) {
        JsonObject jsonObject = do.a("48");
        jsonObject.addProperty("configName", string);
        jsonObject.addProperty("configKey", string2);
        return do.b(jsonObject);
    }

    public static List d() {
        JsonObject jsonObject = do.a(do.a("33"));
        ArrayList<kC> arrayList = new ArrayList<kC>();
        if (!do.a(jsonObject) || !jsonObject.has("data")) {
            return arrayList;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject("data");
        if (!jsonObject2.has("configs")) {
            return arrayList;
        }
        for (JsonElement jsonElement : jsonObject2.getAsJsonArray("configs")) {
            JsonObject jsonObject3 = jsonElement.getAsJsonObject();
            kC kC2 = new kC();
            kC2.a(do.a(jsonObject3, "config_name"));
            kC2.b(do.a(jsonObject3, "description"));
            kC2.c(do.a(jsonObject3, "config_key"));
            String string = "is_active";
            JsonObject jsonObject4 = jsonObject3;
            kC2.a(do.a(string, jsonObject4));
            String string2 = "is_private";
            JsonObject jsonObject5 = jsonObject3;
            kC2.b(do.a(string2, jsonObject5));
            String string3 = "is_imported";
            JsonObject jsonObject6 = jsonObject3;
            kC2.c(do.a(string3, jsonObject6));
            kC2.d(hy.a(do.a(jsonObject3, "created_at")));
            kC2.e(do.a(jsonObject3, "updated_at"));
            arrayList.add(kC2);
        }
        return arrayList;
    }

    public static void a() {
        if (!b) {
            do.c();
        }
        b = true;
        try {
            Boot.shutdown();
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            // empty catch block
        }
    }

    private static lp a(JsonObject jsonObject) {
        boolean bl2 = jsonObject.has("success") && jsonObject.get("success").getAsBoolean();
        String string = jsonObject.has("message") ? jsonObject.get("message").getAsString() : "";
        String string2 = jsonObject.has("status") ? jsonObject.get("status").getAsString() : "UNKNOWN";
        HashMap<String, String> hashMap = new HashMap<String, String>();
        if (jsonObject.has("data") && jsonObject.get("data").isJsonObject()) {
            for (Map.Entry entry : jsonObject.getAsJsonObject("data").entrySet()) {
                if (((JsonElement)entry.getValue()).isJsonNull()) continue;
                hashMap.put((String)entry.getKey(), ((JsonElement)entry.getValue()).getAsString());
            }
        }
        return new lp(bl2, string, string2, hashMap);
    }

    public static boolean a(boolean bl2, String string) {
        JsonObject jsonObject = do.a("45");
        jsonObject.addProperty("configName", string);
        jsonObject.addProperty("isPrivateConfig", Boolean.valueOf(bl2));
        return do.b(jsonObject);
    }

    public static kC a(String string) {
        JsonObject jsonObject = do.a("40");
        jsonObject.addProperty("configKey", string);
        JsonObject jsonObject2 = do.a(jsonObject);
        if (!do.a(jsonObject2) || !jsonObject2.has("data")) {
            return null;
        }
        JsonObject jsonObject3 = jsonObject2.getAsJsonObject("data");
        kC kC2 = new kC();
        kC2.a(do.a(jsonObject3, "config_name"));
        kC2.c(do.a(jsonObject3, "config_key"));
        kC2.a(false);
        String string2 = "is_imported";
        JsonObject jsonObject4 = jsonObject3;
        kC2.c(do.a(string2, jsonObject4));
        kC2.d(hy.a(do.a(jsonObject3, "created_at")));
        return kC2;
    }

    private static String a(JsonObject jsonObject, String string) {
        return jsonObject.has(string) && !jsonObject.get(string).isJsonNull() ? jsonObject.get(string).getAsString() : null;
    }

    public static JsonArray a(String string) {
        JsonObject jsonObject = do.a("92");
        jsonObject.addProperty("configName", string);
        JsonObject jsonObject2 = do.a(jsonObject);
        if (!do.a(jsonObject2) || !jsonObject2.has("data")) {
            return null;
        }
        JsonObject jsonObject3 = jsonObject2.getAsJsonObject("data");
        return jsonObject3.has("waypoints") && jsonObject3.get("waypoints").isJsonArray() ? jsonObject3.getAsJsonArray("waypoints") : null;
    }

    private static List a(String string, JsonObject jsonObject, Type type) {
        if (!do.a(jsonObject) || !jsonObject.has("data")) {
            return new ArrayList();
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject("data");
        if (!jsonObject2.has(string)) {
            return new ArrayList();
        }
        String string2 = jsonObject2.get(string).getAsString();
        return (List)a.fromJson(string2, type);
    }

    private static Map a(String string, JsonObject jsonObject) {
        HashMap<String, byte[]> hashMap = new HashMap<String, byte[]>();
        if (!do.a(jsonObject) || !jsonObject.has("data")) {
            return hashMap;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject("data");
        if (!jsonObject2.has(string) || !jsonObject2.get(string).isJsonObject()) {
            return hashMap;
        }
        for (Map.Entry entry : jsonObject2.getAsJsonObject(string).entrySet()) {
            if (((JsonElement)entry.getValue()).isJsonNull()) continue;
            hashMap.put((String)entry.getKey(), Base64.getDecoder().decode(((JsonElement)entry.getValue()).getAsString()));
        }
        return hashMap;
    }

    private static boolean a(String string, JsonObject jsonObject) {
        if (!jsonObject.has(string) || jsonObject.get(string).isJsonNull()) {
            return false;
        }
        JsonElement jsonElement = jsonObject.get(string);
        if (jsonElement.isJsonPrimitive()) {
            JsonPrimitive jsonPrimitive = jsonElement.getAsJsonPrimitive();
            if (jsonPrimitive.isBoolean()) {
                return jsonPrimitive.getAsBoolean();
            }
            if (jsonPrimitive.isNumber()) {
                return jsonPrimitive.getAsInt() != 0;
            }
        }
        return false;
    }

    public static JsonArray a() {
        JsonObject jsonObject = do.a(do.a("90"));
        if (!do.a(jsonObject) || !jsonObject.has("data")) {
            return null;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject("data");
        return jsonObject2.has("friends") && jsonObject2.get("friends").isJsonArray() ? jsonObject2.getAsJsonArray("friends") : null;
    }

    public static List a(String string) {
        JsonObject jsonObject = do.a("47");
        jsonObject.addProperty("configName", string);
        JsonObject jsonObject2 = do.a(jsonObject);
        ArrayList<jz> arrayList = new ArrayList<jz>();
        if (!do.a(jsonObject2) || !jsonObject2.has("data")) {
            return arrayList;
        }
        JsonObject jsonObject3 = jsonObject2.getAsJsonObject("data");
        if (!jsonObject3.has("keys") || !jsonObject3.get("keys").isJsonArray()) {
            return arrayList;
        }
        for (JsonElement jsonElement : jsonObject3.getAsJsonArray("keys")) {
            JsonObject jsonObject4 = jsonElement.getAsJsonObject();
            jz jz2 = new jz();
            jz2.a(do.a(jsonObject4, "key_value"));
            String string2 = "used";
            JsonObject jsonObject5 = jsonObject4;
            jz2.a(do.a(string2, jsonObject5));
            jz2.b(hy.a(do.a(jsonObject4, "created_at")));
            String string3 = do.a(jsonObject4, "used_at");
            jz2.c(string3 == null ? null : hy.a(string3));
            arrayList.add(jz2);
        }
        return arrayList;
    }

    private static boolean a(JsonObject jsonObject) {
        return jsonObject != null && jsonObject.has("success") && !jsonObject.get("success").isJsonNull() && jsonObject.get("success").getAsBoolean();
    }

    public static lp a() {
        JsonObject jsonObject;
        JsonObject jsonObject2 = do.a("3");
        jsonObject2.addProperty("lastMinecraftName", lm.a());
        String string = lm.b();
        if (string != null) {
            jsonObject2.addProperty("currentServer", string);
        }
        if ((jsonObject = do.a(jsonObject2)) == null) {
            return new lp(false, "error", "UNAUTHORIZED");
        }
        return do.a(jsonObject);
    }

    public static Map a(String[] stringArray) {
        JsonObject jsonObject = do.a("10");
        JsonArray jsonArray = new JsonArray();
        for (String string : stringArray) {
            jsonArray.add(string);
        }
        jsonObject.add("imageNames", (JsonElement)jsonArray);
        String string = "images";
        JsonObject jsonObject2 = do.a(jsonObject);
        return do.a(string, jsonObject2);
    }

    public static Map a() {
        String string = "sounds";
        JsonObject jsonObject = do.a(do.a("11"));
        return do.a(string, jsonObject);
    }

    private static JsonObject a(JsonObject jsonObject) {
        String string;
        if (b) {
            return null;
        }
        String string2 = string = jsonObject.has("action") ? jsonObject.get("action").getAsString() : null;
        if (string == null) {
            return null;
        }
        String string3 = gr.a(string, jsonObject.toString());
        if (string3 == null || string3.isEmpty()) {
            return null;
        }
        try {
            JsonObject jsonObject2 = JsonParser.parseString((String)string3).getAsJsonObject();
            do.a(jsonObject2);
            JsonObject jsonObject3 = jsonObject2;
            String string4 = string;
            do.a(jsonObject3, string4);
            return jsonObject2;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static void a(JsonObject jsonObject) {
        if (jsonObject == null || !jsonObject.has("status") || jsonObject.get("status").isJsonNull()) {
            return;
        }
        if ("SESSION_INVALID".equals(jsonObject.get("status").getAsString())) {
            gr.a(null);
        }
    }

    private static void a(JsonObject jsonObject, String string) {
        if (!"1".equals(string) && !"3".equals(string)) {
            return;
        }
        if (!jsonObject.has("data") || !jsonObject.get("data").isJsonObject()) {
            return;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject("data");
        if (jsonObject2.has("session_id") && !jsonObject2.get("session_id").isJsonNull()) {
            gr.a(jsonObject2.get("session_id").getAsString());
        }
    }

    private static JsonObject a(String string) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("action", string);
        jsonObject.addProperty("hwid", Boot.get());
        jsonObject.addProperty("pcName", Boot.pcName());
        jsonObject.addProperty("ip", Boot.ip());
        jsonObject.addProperty("source", "Client");
        jsonObject.addProperty("ts", (Number)(System.currentTimeMillis() / 1000L));
        return jsonObject;
    }

    public static String a(String string) {
        JsonObject jsonObject = do.a("32");
        jsonObject.addProperty("configName", string);
        JsonObject jsonObject2 = do.a(jsonObject);
        if (!do.a(jsonObject2)) {
            return null;
        }
        return jsonObject2.has("configData") ? jsonObject2.get("configData").getAsString() : null;
    }

    public static void a(String string) {
        gr.a(string);
    }

    public static boolean a(String string) {
        JsonObject jsonObject = do.a("34");
        jsonObject.addProperty("configName", string);
        return do.b(jsonObject);
    }

    public static String a() {
        JsonObject jsonObject = do.a(do.a("38"));
        if (!do.a(jsonObject) || !jsonObject.has("data")) {
            return null;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject("data");
        return jsonObject2.has("config_name") && !jsonObject2.get("config_name").isJsonNull() ? jsonObject2.get("config_name").getAsString() : null;
    }

    public static List a() {
        Type type = new bi().getType();
        String string = "shaders";
        JsonObject jsonObject = do.a(do.a("12"));
        return do.a(string, jsonObject, type);
    }

    public static Map a(String string) {
        JsonObject jsonObject = do.a("14");
        jsonObject.addProperty("lang", string);
        JsonObject jsonObject2 = do.a(jsonObject);
        if (!do.a(jsonObject2)) {
            return null;
        }
        JsonObject jsonObject3 = jsonObject2.getAsJsonObject("data");
        if (jsonObject3 == null || !jsonObject3.has("translations")) {
            return null;
        }
        String string2 = jsonObject3.get("translations").getAsString();
        JsonObject jsonObject4 = JsonParser.parseString((String)string2).getAsJsonObject();
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (Map.Entry entry : jsonObject4.entrySet()) {
            hashMap.put((String)entry.getKey(), ((JsonElement)entry.getValue()).getAsString());
        }
        return hashMap;
    }

    public static kC a(String string, String string2, String string3) {
        JsonObject jsonObject = do.a("30");
        jsonObject.addProperty("configName", string3);
        jsonObject.addProperty("configDescription", string2);
        jsonObject.addProperty("configData", string);
        JsonObject jsonObject2 = do.a(jsonObject);
        if (!do.a(jsonObject2)) {
            return null;
        }
        JsonObject jsonObject3 = jsonObject2.has("data") ? jsonObject2.getAsJsonObject("data") : null;
        kC kC2 = new kC();
        kC2.a(jsonObject3 != null && jsonObject3.has("config_name") ? jsonObject3.get("config_name").getAsString() : string3);
        kC2.c(jsonObject3 != null && jsonObject3.has("config_key") ? jsonObject3.get("config_key").getAsString() : null);
        kC2.b(string2);
        kC2.a(false);
        kC2.d(hy.a(jsonObject3 != null ? do.a(jsonObject3, "created_at") : null));
        return kC2;
    }

    public static boolean a(String string, String string2) {
        JsonObject jsonObject = do.a("31");
        jsonObject.addProperty("configName", string);
        jsonObject.addProperty("configData", string2);
        return do.b(jsonObject);
    }
}

