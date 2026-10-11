/*
 * Decompiled with CFR 0.152.
 */
public final class ec {
    private ec() {
    }

    public static String[] split(String string) {
        if (string == null || string.isEmpty()) {
            return new String[0];
        }
        String[] stringArray = new String[string.length()];
        for (int i2 = 0; i2 < string.length(); ++i2) {
            stringArray[i2] = String.valueOf(string.charAt(i2));
        }
        return stringArray;
    }

    public static String join(String[] stringArray) {
        if (stringArray == null || stringArray.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(stringArray.length);
        for (String string : stringArray) {
            if (string == null) continue;
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static boolean isBlank(String[] stringArray) {
        if (stringArray == null || stringArray.length == 0) {
            return true;
        }
        for (String string : stringArray) {
            if (string == null || string.isBlank()) continue;
            return false;
        }
        return true;
    }
}

