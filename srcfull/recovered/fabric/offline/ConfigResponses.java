/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.offline;

import java.util.List;
import recovered.fabric.offline.ConfigFiles;
import recovered.fabric.offline.ConfigRecord;
import recovered.fabric.offline.JsonField;

final class ConfigResponses {
    private static final String prefix = "{\"success\":true,\"message\":\"offline\",\"status\":\"AUTHORIZED\",\"data\":";

    private ConfigResponses() {
    }

    static String ok() {
        return "{\"success\":true,\"message\":\"offline\",\"status\":\"AUTHORIZED\",\"data\":{}}";
    }

    static String config(ConfigRecord config) throws Exception {
        return prefix + config.json(config.name().equals(ConfigFiles.active())) + "}";
    }

    static String list() throws Exception {
        List<ConfigRecord> configs = ConfigFiles.all();
        String active = ConfigFiles.active();
        StringBuilder data = new StringBuilder("{\"configs\":[");
        for (int index = 0; index < configs.size(); ++index) {
            if (index > 0) {
                data.append(',');
            }
            ConfigRecord config = configs.get(index);
            data.append(config.json(config.name().equals(active)));
        }
        return prefix + data.append("]}}").toString();
    }

    static String loaded(ConfigRecord config) {
        return "{\"success\":true,\"message\":\"offline\",\"status\":\"AUTHORIZED\",\"data\":{},\"configData\":" + JsonField.quote(config.data()) + "}";
    }

    static String active() throws Exception {
        return "{\"success\":true,\"message\":\"offline\",\"status\":\"AUTHORIZED\",\"data\":{\"config_name\":" + JsonField.quote(ConfigFiles.active()) + "}}";
    }

    static String key(ConfigRecord config) {
        return "{\"success\":true,\"message\":\"offline\",\"status\":\"AUTHORIZED\",\"data\":{\"config_key\":" + JsonField.quote(config.key()) + "}}";
    }

    static String keys(ConfigRecord config) {
        String item = "{\"key_value\":" + JsonField.quote(config.key()) + ",\"used\":false,\"created_at\":" + JsonField.quote(config.createdAt()) + ",\"used_at\":null}";
        return "{\"success\":true,\"message\":\"offline\",\"status\":\"AUTHORIZED\",\"data\":{\"keys\":[" + item + "]}}";
    }

    static String failure(String message) {
        return "{\"success\":false,\"message\":" + JsonField.quote(message) + ",\"status\":\"OFFLINE_ERROR\",\"data\":{}}";
    }
}

