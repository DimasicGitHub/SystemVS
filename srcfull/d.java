/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class d {
    private static final d INSTANCE = new d();

    public void b(String string, String string2) {
        eV.a().c(string2, string);
    }

    public void b(String string) {
        eV.a().c(string);
    }

    public String b(String string) {
        return eV.a().b(string);
    }

    public String c(String string) {
        return eV.a().c(string);
    }

    public void a(String string, String string2) {
        eV.a().a(string2, string);
    }

    public String a(String string) {
        String string2 = eV.a().a(string);
        return string2 == null ? string : string2;
    }

    public void a(String string) {
        eV.a().a(string);
    }

    public static d a() {
        return INSTANCE;
    }

    public List a() {
        eV eV2 = eV.a();
        ArrayList<String> arrayList = new ArrayList<String>(eV2.a());
        arrayList.sort(Comparator.comparing(string -> {
            String string2 = eV2.c((String)string);
            return string2 == null ? "" : string2;
        }).reversed().thenComparing(Comparator.naturalOrder()));
        return arrayList;
    }
}

