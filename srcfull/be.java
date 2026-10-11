/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public class be {
    private static final /* synthetic */ Map<Integer, Character> a;

    static {
        int n2;
        Object object;
        int n3;
        int[][] nArrayArray;
        a = new HashMap<Integer, Character>(600);
        a.put(7424, Character.valueOf('a'));
        a.put(665, Character.valueOf('b'));
        a.put(7428, Character.valueOf('c'));
        a.put(7429, Character.valueOf('d'));
        a.put(7431, Character.valueOf('e'));
        a.put(42800, Character.valueOf('f'));
        a.put(610, Character.valueOf('g'));
        a.put(668, Character.valueOf('h'));
        a.put(618, Character.valueOf('i'));
        a.put(7434, Character.valueOf('j'));
        a.put(7435, Character.valueOf('k'));
        a.put(671, Character.valueOf('l'));
        a.put(7437, Character.valueOf('m'));
        a.put(628, Character.valueOf('n'));
        a.put(7439, Character.valueOf('o'));
        a.put(7448, Character.valueOf('p'));
        a.put(491, Character.valueOf('q'));
        a.put(640, Character.valueOf('r'));
        a.put(42801, Character.valueOf('s'));
        a.put(7451, Character.valueOf('t'));
        a.put(7452, Character.valueOf('u'));
        a.put(7456, Character.valueOf('v'));
        a.put(7457, Character.valueOf('w'));
        a.put(655, Character.valueOf('y'));
        a.put(7458, Character.valueOf('z'));
        Object object2 = nArrayArray = new int[][]{{119808, 119834}, {119860, 119886}, {119912, 119938}, {119964, 119990}, {120016, 120042}, {120068, 120094}, {120120, 120146}, {120172, 120198}, {120224, 120250}, {120276, 120302}, {120328, 120354}, {120380, 120406}, {120432, 120458}};
        int n4 = ((int[][])object2).length;
        for (n3 = 0; n3 < n4; ++n3) {
            int[] nArray = object2[n3];
            for (object = 0; object < 26; ++object) {
                a.put(nArray[0] + object, Character.valueOf((char)(97 + object)));
                a.put(nArray[1] + object, Character.valueOf((char)(97 + object)));
            }
        }
        Object object3 = object2 = (Object)new int[]{120782, 120792, 120802, 120812, 120822};
        n3 = ((int[][])object3).length;
        for (int i2 = 0; i2 < n3; ++i2) {
            object = object3[i2];
            for (int i3 = 0; i3 < 10; ++i3) {
                a.put(object + i3, Character.valueOf((char)(48 + i3)));
            }
        }
        a.put(8462, Character.valueOf('h'));
        a.put(8492, Character.valueOf('b'));
        a.put(8496, Character.valueOf('e'));
        a.put(8497, Character.valueOf('f'));
        a.put(8459, Character.valueOf('h'));
        a.put(8464, Character.valueOf('i'));
        a.put(8466, Character.valueOf('l'));
        a.put(8499, Character.valueOf('m'));
        a.put(8475, Character.valueOf('r'));
        a.put(8495, Character.valueOf('e'));
        a.put(8458, Character.valueOf('g'));
        a.put(8500, Character.valueOf('o'));
        a.put(8493, Character.valueOf('c'));
        a.put(8460, Character.valueOf('h'));
        a.put(8465, Character.valueOf('i'));
        a.put(8476, Character.valueOf('r'));
        a.put(8488, Character.valueOf('z'));
        a.put(8450, Character.valueOf('c'));
        a.put(8461, Character.valueOf('h'));
        a.put(8469, Character.valueOf('n'));
        a.put(8473, Character.valueOf('p'));
        a.put(8474, Character.valueOf('q'));
        a.put(8477, Character.valueOf('r'));
        a.put(8484, Character.valueOf('z'));
        for (n2 = 0; n2 < 26; ++n2) {
            a.put(65313 + n2, Character.valueOf((char)(97 + n2)));
            a.put(65345 + n2, Character.valueOf((char)(97 + n2)));
        }
        for (n2 = 0; n2 < 10; ++n2) {
            a.put(65296 + n2, Character.valueOf((char)(48 + n2)));
        }
        for (n2 = 0; n2 < 26; ++n2) {
            a.put(9398 + n2, Character.valueOf((char)(97 + n2)));
            a.put(9424 + n2, Character.valueOf((char)(97 + n2)));
        }
        for (n2 = 0; n2 < 26; ++n2) {
            a.put(127280 + n2, Character.valueOf((char)(97 + n2)));
            a.put(127344 + n2, Character.valueOf((char)(97 + n2)));
        }
    }

    private static /* bridge */ /* synthetic */ String b(String string) {
        int n2;
        StringBuilder stringBuilder = new StringBuilder(string.length());
        for (int i2 = 0; i2 < string.length(); i2 += Character.charCount(n2)) {
            n2 = string.codePointAt(i2);
            if (Character.isLetterOrDigit(n2) || n2 == 32 || n2 == 95 || n2 == 45) {
                stringBuilder.appendCodePoint(n2);
                continue;
            }
            if (stringBuilder.isEmpty() || stringBuilder.charAt(stringBuilder.length() - 1) == ' ') continue;
            stringBuilder.append(' ');
        }
        return stringBuilder.toString().strip().replaceAll(" +", " ");
    }

    public static /* bridge */ /* synthetic */ String a(String string, String string2) {
        String string3 = string2;
        String string4 = string.replaceAll("\u00a7.", "").replaceAll("[\\p{Cf}\\p{Cc}]", "");
        String string5 = be.a(string4);
        String string6 = string5;
        int n2 = be.a(string3, string6);
        if (n2 <= 0) {
            return "";
        }
        return be.b(string5.substring(0, n2));
    }

    private static /* bridge */ /* synthetic */ int a(String string, String string2) {
        if (string.isEmpty()) {
            return 0;
        }
        int n2 = string2.length();
        int n3 = string.length();
        int n4 = n2 - n3;
        for (int i2 = 0; i2 <= n4; ++i2) {
            if (!string2.regionMatches(true, i2, string, 0, n3)) continue;
            return i2;
        }
        return -1;
    }

    public static /* bridge */ /* synthetic */ String a(String string) {
        int n2;
        if (string == null || string.isEmpty()) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder(string.length());
        for (int i2 = 0; i2 < string.length(); i2 += Character.charCount(n2)) {
            n2 = string.codePointAt(i2);
            Character c2 = a.get(n2);
            if (c2 != null) {
                stringBuilder.append(c2);
                continue;
            }
            stringBuilder.appendCodePoint(n2);
        }
        return stringBuilder.toString();
    }
}

