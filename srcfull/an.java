/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public class an {
    private static final Map<Character, Character> a = new HashMap<Character, Character>();

    private an() {
    }

    static {
        an.a('\u0410', 'A');
        an.a('\u0411', 'B');
        an.a('\u0412', 'V');
        an.a('\u0413', 'G');
        an.a('\u0414', 'D');
        an.a('\u0415', 'E');
        an.a('\u0416', 'J');
        an.a('\u0417', 'S');
        an.a('\u0418', 'I');
        an.a('\u041a', 'K');
        an.a('\u041b', 'L');
        an.a('\u041c', 'M');
        an.a('\u041d', 'N');
        an.a('\u041e', 'O');
        an.a('\u041f', 'P');
        an.a('\u0420', 'R');
        an.a('\u0421', 'C');
        an.a('\u0422', 'T');
        an.a('\u0423', 'U');
        an.a('\u0424', 'F');
        an.a('\u0425', 'H');
        an.a('\u0428', 'W');
        an.a('\u042b', 'Y');
        an.a('\u0401', 'E');
        an.a('\u0419', 'Y');
        an.a('\u0426', 'C');
        an.a('\u0427', 'C');
        an.a('\u0429', 'W');
        an.a('\u042a', 'B');
        an.a('\u042c', 'B');
        an.a('\u042d', 'E');
        an.a('\u042e', 'I');
        an.a('\u042f', 'R');
        a.put(Character.valueOf('$'), Character.valueOf('x'));
        a.put(Character.valueOf('%'), Character.valueOf('X'));
    }

    private static void a(char c2, char c3) {
        a.put(Character.valueOf(c2), Character.valueOf(c3));
        a.put(Character.valueOf(Character.toLowerCase(c2)), Character.valueOf(Character.toLowerCase(c3)));
    }

    public static String a(String string) {
        if (string == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(string.length());
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            Character c3 = a.get(Character.valueOf(c2));
            stringBuilder.append(c3 != null ? c3.charValue() : c2);
        }
        return stringBuilder.toString();
    }
}

