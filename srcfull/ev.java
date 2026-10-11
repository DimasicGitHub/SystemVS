/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ev {
    public static final int a = 7;
    private static final int[] b = new int[]{-1, -16777216, -1096636, -429290, -340971, -14498466, -12877066};

    private ev() {
    }

    public static void a(int n2, int n3) {
        if (n3 < 0 || n3 >= 7) {
            return;
        }
        jE jE2 = hJ.a();
        if (jE2 == null) {
            return;
        }
        List list = ev.a();
        list.set(n3, n2);
        jE2.c(list);
    }

    public static int[] a() {
        return Arrays.copyOf(b, b.length);
    }

    public static List a() {
        jE jE2 = hJ.a();
        List list = jE2 != null ? jE2.d() : new ArrayList();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(7);
        for (int i2 = 0; i2 < 7; ++i2) {
            if (i2 < list.size() && list.get(i2) != null) {
                arrayList.add((Integer)list.get(i2));
                continue;
            }
            arrayList.add(b[i2]);
        }
        return arrayList;
    }

    public static int a(int n2) {
        if (n2 < 0 || n2 >= 7) {
            return 0;
        }
        List list = ev.a();
        return (Integer)list.get(n2);
    }
}

