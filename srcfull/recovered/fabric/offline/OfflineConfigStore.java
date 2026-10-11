/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.offline;

import recovered.fabric.diagnostic.SystemDlcLog;
import recovered.fabric.offline.ConfigFiles;
import recovered.fabric.offline.ConfigMutations;
import recovered.fabric.offline.ConfigRecord;
import recovered.fabric.offline.ConfigResponses;
import recovered.fabric.offline.JsonField;

final class OfflineConfigStore {
    private OfflineConfigStore() {
    }

    static synchronized String call(int action, String payload) {
        try {
            return switch (action) {
                case 30 -> ConfigMutations.create(payload);
                case 31 -> ConfigMutations.save(payload);
                case 32 -> OfflineConfigStore.load(payload);
                case 33 -> ConfigResponses.list();
                case 34 -> ConfigMutations.delete(payload);
                case 35 -> ConfigMutations.rename(payload);
                case 36 -> ConfigMutations.describe(payload);
                case 37 -> ConfigMutations.activate(payload);
                case 38 -> ConfigResponses.active();
                case 39, 46 -> OfflineConfigStore.key(payload);
                case 40 -> OfflineConfigStore.importKey(payload);
                case 45 -> ConfigMutations.privacy(payload);
                case 47 -> OfflineConfigStore.keys(payload);
                case 48 -> ConfigResponses.ok();
                default -> ConfigResponses.failure("unsupported config action");
            };
        }
        catch (Throwable error) {
            SystemDlcLog.error("offline config storage action=" + action, error);
            return ConfigResponses.failure("config storage failed");
        }
    }

    private static String load(String payload) throws Exception {
        ConfigRecord config = OfflineConfigStore.named(payload);
        return config == null ? ConfigResponses.failure("config not found") : ConfigResponses.loaded(config);
    }

    private static String key(String payload) throws Exception {
        ConfigRecord config = OfflineConfigStore.named(payload);
        return config == null ? ConfigResponses.failure("config not found") : ConfigResponses.key(config);
    }

    private static String keys(String payload) throws Exception {
        ConfigRecord config = OfflineConfigStore.named(payload);
        return config == null ? ConfigResponses.failure("config not found") : ConfigResponses.keys(config);
    }

    private static String importKey(String payload) throws Exception {
        ConfigRecord config = ConfigFiles.findByKey(JsonField.text(payload, "configKey"));
        return config == null ? ConfigResponses.failure("config key not found") : ConfigResponses.config(config);
    }

    private static ConfigRecord named(String payload) throws Exception {
        return ConfigFiles.find(JsonField.text(payload, "configName"));
    }
}

