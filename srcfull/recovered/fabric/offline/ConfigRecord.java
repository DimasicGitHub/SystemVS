/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.offline;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.UUID;
import recovered.fabric.offline.JsonField;

record ConfigRecord(String name, String description, String data, String key, String createdAt, String updatedAt, boolean privateConfig) {
    static ConfigRecord create(String name, String description, String data) {
        String now = LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS).toString();
        String key = UUID.randomUUID().toString().replace("-", "");
        return new ConfigRecord(name, description, data, key, now, now, false);
    }

    ConfigRecord withData(String value) {
        return this.changed(this.name, this.description, value, this.privateConfig);
    }

    ConfigRecord withDescription(String value) {
        return this.changed(this.name, value, this.data, this.privateConfig);
    }

    ConfigRecord withName(String value) {
        return this.changed(value, this.description, this.data, this.privateConfig);
    }

    ConfigRecord withPrivacy(boolean value) {
        return this.changed(this.name, this.description, this.data, value);
    }

    String serialize() {
        return String.join((CharSequence)"\n", ConfigRecord.encode(this.name), ConfigRecord.encode(this.description), ConfigRecord.encode(this.data), ConfigRecord.encode(this.key), ConfigRecord.encode(this.createdAt), ConfigRecord.encode(this.updatedAt), Boolean.toString(this.privateConfig));
    }

    static ConfigRecord deserialize(String value) {
        String[] fields = value.split("\\R", -1);
        if (fields.length != 7) {
            throw new IllegalArgumentException("invalid config record");
        }
        return new ConfigRecord(ConfigRecord.decode(fields[0]), ConfigRecord.decode(fields[1]), ConfigRecord.decode(fields[2]), ConfigRecord.decode(fields[3]), ConfigRecord.decode(fields[4]), ConfigRecord.decode(fields[5]), Boolean.parseBoolean(fields[6]));
    }

    String json(boolean active) {
        return "{\"config_name\":" + JsonField.quote(this.name) + ",\"description\":" + JsonField.quote(this.description) + ",\"config_key\":" + JsonField.quote(this.key) + ",\"is_active\":" + active + ",\"is_private\":" + this.privateConfig + ",\"is_imported\":false,\"created_at\":" + JsonField.quote(this.createdAt) + ",\"updated_at\":" + JsonField.quote(this.updatedAt) + "}";
    }

    private ConfigRecord changed(String nextName, String nextDescription, String nextData, boolean nextPrivacy) {
        String now = LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS).toString();
        return new ConfigRecord(nextName, nextDescription, nextData, this.key, this.createdAt, now, nextPrivacy);
    }

    private static String encode(String value) {
        return Base64.getEncoder().encodeToString(value.getBytes(StandardCharsets.UTF_8));
    }

    private static String decode(String value) {
        return new String(Base64.getDecoder().decode(value), StandardCharsets.UTF_8);
    }
}

