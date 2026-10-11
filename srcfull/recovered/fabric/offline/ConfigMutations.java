/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.offline;

import java.util.function.UnaryOperator;
import recovered.fabric.offline.ConfigFiles;
import recovered.fabric.offline.ConfigRecord;
import recovered.fabric.offline.ConfigResponses;
import recovered.fabric.offline.JsonField;

final class ConfigMutations {
    private ConfigMutations() {
    }

    static String create(String payload) throws Exception {
        String name = ConfigMutations.required(payload, "configName");
        if (ConfigFiles.find(name) != null) {
            return ConfigResponses.failure("config already exists");
        }
        ConfigRecord config = ConfigRecord.create(name, ConfigMutations.text(payload, "configDescription"), ConfigMutations.required(payload, "configData"));
        ConfigFiles.write(config);
        return ConfigResponses.config(config);
    }

    static String save(String payload) throws Exception {
        return ConfigMutations.update(payload, config -> config.withData(ConfigMutations.required(payload, "configData")));
    }

    static String delete(String payload) throws Exception {
        ConfigFiles.delete(ConfigMutations.required(payload, "configName"));
        return ConfigResponses.ok();
    }

    static String rename(String payload) throws Exception {
        String oldName = ConfigMutations.required(payload, "configName");
        String newName = ConfigMutations.required(payload, "newConfigName");
        ConfigRecord config = ConfigFiles.find(oldName);
        if (config == null) {
            return ConfigResponses.failure("config not found");
        }
        if (ConfigFiles.find(newName) != null) {
            return ConfigResponses.failure("config already exists");
        }
        ConfigFiles.rename(oldName, config.withName(newName));
        return ConfigResponses.ok();
    }

    static String describe(String payload) throws Exception {
        return ConfigMutations.update(payload, config -> config.withDescription(ConfigMutations.text(payload, "configDescription")));
    }

    static String activate(String payload) throws Exception {
        String name = ConfigMutations.required(payload, "configName");
        if (ConfigFiles.find(name) == null) {
            return ConfigResponses.failure("config not found");
        }
        ConfigFiles.active(name);
        return ConfigResponses.ok();
    }

    static String privacy(String payload) throws Exception {
        boolean value = JsonField.bool(payload, "isPrivateConfig");
        return ConfigMutations.update(payload, config -> config.withPrivacy(value));
    }

    private static String update(String payload, UnaryOperator<ConfigRecord> change) throws Exception {
        String name = ConfigMutations.required(payload, "configName");
        ConfigRecord config = ConfigFiles.find(name);
        if (config == null) {
            return ConfigResponses.failure("config not found");
        }
        ConfigFiles.write((ConfigRecord)((Object)change.apply(config)));
        return ConfigResponses.ok();
    }

    private static String required(String payload, String field) {
        String value = JsonField.text(payload, field);
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(field + " empty");
        }
        return value;
    }

    private static String text(String payload, String field) {
        String value = JsonField.text(payload, field);
        return value == null ? "" : value;
    }
}

