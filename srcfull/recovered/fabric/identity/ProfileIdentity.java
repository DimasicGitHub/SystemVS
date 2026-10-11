/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.identity;

import recovered.fabric.identity.DeviceIdentity;

public final class ProfileIdentity {
    private ProfileIdentity() {
    }

    public static String username() {
        return "t.me/goonglang & paul";
    }

    public static int uid() {
        return 0;
    }

    public static String hwid() {
        return DeviceIdentity.get();
    }

    public static String role() {
        return "Developer";
    }

    public static String subscription() {
        return "Lifetime";
    }
}

