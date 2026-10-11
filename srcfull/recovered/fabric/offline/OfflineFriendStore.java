/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.offline;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import recovered.fabric.diagnostic.SystemDlcLog;
import recovered.fabric.offline.JsonPayload;

final class OfflineFriendStore {
    private static final Path file = Path.of("config", "systemdlc", "friends.json").toAbsolutePath();
    private static final String success = "{\"success\":true,\"message\":\"offline\",\"status\":\"AUTHORIZED\",\"data\":{}}";

    private OfflineFriendStore() {
    }

    static synchronized String call(int action, String payload) {
        try {
            if (action == 90) {
                return OfflineFriendStore.load();
            }
            OfflineFriendStore.save(payload);
            return success;
        }
        catch (Throwable error) {
            SystemDlcLog.error("offline friend storage", error);
            return "{\"success\":false,\"message\":\"friend storage failed\",\"status\":\"OFFLINE_ERROR\",\"data\":{}}";
        }
    }

    private static String load() throws Exception {
        String content = Files.isRegularFile(file, new LinkOption[0]) ? Files.readString(file, StandardCharsets.UTF_8) : "[]";
        String friends = JsonPayload.valid(content);
        return "{\"success\":true,\"message\":\"offline\",\"status\":\"AUTHORIZED\",\"data\":{\"friends\":" + friends + "}}";
    }

    private static void save(String payload) throws Exception {
        String friends = JsonPayload.array(payload, "payload");
        Files.createDirectories(file.getParent(), new FileAttribute[0]);
        Files.writeString(file, (CharSequence)friends.toString(), StandardCharsets.UTF_8, new OpenOption[0]);
    }
}

