/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.identity;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;

public final class DeviceIdentity {
    private static final String value = DeviceIdentity.create();

    private DeviceIdentity() {
    }

    public static String get() {
        return value;
    }

    private static String create() {
        String source = String.join((CharSequence)"|", DeviceIdentity.property("user.name"), DeviceIdentity.property("os.name"), DeviceIdentity.property("os.arch"), DeviceIdentity.environment("COMPUTERNAME"));
        try {
            byte[] bytes = MessageDigest.getInstance("SHA-256").digest(source.getBytes(StandardCharsets.UTF_8));
            return HexFormat.of().formatHex(bytes);
        }
        catch (NoSuchAlgorithmException error) {
            return Integer.toHexString(source.hashCode());
        }
    }

    private static String property(String name) {
        return System.getProperty(name, "unknown");
    }

    private static String environment(String name) {
        return System.getenv().getOrDefault(name, "unknown");
    }
}

