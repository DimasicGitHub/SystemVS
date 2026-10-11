/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.IntPredicate;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class if {
    public static final IntPredicate a = n2 -> n2 == 45 || n2 == 32 || n2 == 44 || n2 == 59 || n2 == 46 || n2 >= 48 && n2 <= 57;

    private if() {
    }

    public static int[] a(String string) {
        if (string == null) {
            return null;
        }
        String[] stringArray = string.trim().split("[\\s,;]+");
        if (stringArray.length < 3) {
            return null;
        }
        int[] nArray = new int[3];
        for (int i2 = 0; i2 < 3; ++i2) {
            try {
                nArray[i2] = Integer.parseInt(stringArray[i2].trim());
                continue;
            }
            catch (NumberFormatException numberFormatException) {
                return null;
            }
        }
        return nArray;
    }

    public static Integer a(String string) {
        if (string == null) {
            return null;
        }
        try {
            return Integer.parseInt(string.trim());
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }
}

