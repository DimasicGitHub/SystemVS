/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class fr
extends fa {
    private /* synthetic */ String[][] a;
    private /* synthetic */ String[][] b;
    private final /* synthetic */ Set<Integer> c;
    private final /* synthetic */ Set<Integer> d;
    private /* synthetic */ boolean e;

    public /* synthetic */ fr(String string, String string2, List list, List list2) {
        this(string, string2, list, list2, null, false);
    }

    public /* synthetic */ fr(String string, String string2, List list, List list2, List list3, boolean bl2) {
        super(string, string2);
        this.c = new LinkedHashSet<Integer>();
        this.d = new LinkedHashSet<Integer>();
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.a(list, list3);
        if (list2 != null) {
            for (String string3 : list2) {
                int n2 = this.a(string3);
                if (n2 < 0) continue;
                this.d.add(n2);
            }
        }
        this.c.addAll(this.d);
        this.e = bl2;
    }

    @Override
    public /* bridge */ /* synthetic */ String i() {
        return "multilist";
    }

    public /* bridge */ /* synthetic */ List b() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int n2 : this.d) {
            arrayList.add(this.a(n2));
        }
        return arrayList;
    }

    public /* bridge */ /* synthetic */ Set b() {
        return new LinkedHashSet(this.a());
    }

    public /* bridge */ /* synthetic */ boolean b(String string) {
        return this.a(string);
    }

    public /* bridge */ /* synthetic */ void b(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.a(list, null);
        this.c.removeIf(n2 -> n2 >= this.a.length);
    }

    public /* bridge */ /* synthetic */ int b() {
        return this.c.size();
    }

    public /* bridge */ /* synthetic */ boolean b() {
        return this.e;
    }

    @Override
    public /* bridge */ /* synthetic */ void c() {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(this.c);
        this.c.clear();
        this.c.addAll(this.d);
        if (!linkedHashSet.equals(this.c)) {
            this.d();
        }
    }

    public /* bridge */ /* synthetic */ void c(List list) {
        if (list == null) {
            return;
        }
        for (int i2 = 0; i2 < this.b.length && i2 < list.size(); ++i2) {
            this.b[i2] = ec.split((String)list.get(i2));
        }
    }

    public /* bridge */ /* synthetic */ List c() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            arrayList.add(this.a(i2));
        }
        return arrayList;
    }

    public /* bridge */ /* synthetic */ List d() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String[] stringArray : this.b) {
            arrayList.add(ec.join(stringArray));
        }
        return arrayList;
    }

    public /* bridge */ /* synthetic */ String a() {
        if (this.c.isEmpty()) {
            return "None";
        }
        List list = this.a();
        return list.size() == 1 ? (String)list.getFirst() : (String)list.getFirst() + "...";
    }

    public /* bridge */ /* synthetic */ int a() {
        return this.a.length;
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return this.c.equals(this.d);
    }

    public /* bridge */ /* synthetic */ String[] a(int n2) {
        return n2 >= 0 && n2 < this.b.length ? this.b[n2] : new String[]{};
    }

    private /* bridge */ /* synthetic */ void a(List list, List list2) {
        int n2 = list.size();
        this.a = new String[n2][];
        this.b = new String[n2][];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a[i2] = ec.split((String)list.get(i2));
            String string = list2 != null && i2 < list2.size() ? (String)list2.get(i2) : (String)list.get(i2);
            this.b[i2] = ec.split(string);
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void a(JsonObject jsonObject) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(this.c);
        if (jsonObject.has("selectedIndices") && jsonObject.get("selectedIndices").isJsonArray()) {
            this.c.clear();
            for (JsonElement jsonElement : jsonObject.getAsJsonArray("selectedIndices")) {
                int n2 = jsonElement.getAsInt();
                if (n2 < 0 || n2 >= this.a.length) continue;
                this.c.add(n2);
            }
        } else if (jsonObject.has("selectedValues") && jsonObject.get("selectedValues").isJsonArray()) {
            kJ.a();
            this.c.clear();
            for (JsonElement jsonElement : jsonObject.getAsJsonArray("selectedValues")) {
                int n3 = this.a(jsonElement.getAsString());
                if (n3 < 0) continue;
                this.c.add(n3);
            }
        }
        if (jsonObject.has("visible")) {
            this.i = jsonObject.get("visible").getAsBoolean();
        }
        if (!linkedHashSet.equals(this.c)) {
            this.d();
        }
    }

    @Override
    public /* bridge */ /* synthetic */ JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", this.i());
        jsonObject.addProperty("selectedCount", (Number)this.b());
        jsonObject.addProperty("isAtDefault", Boolean.valueOf(this.a()));
        jsonObject.addProperty("visible", Boolean.valueOf(this.i));
        JsonArray jsonArray = new JsonArray();
        for (int n2 : this.c) {
            jsonArray.add((Number)n2);
        }
        jsonObject.add("selectedIndices", (JsonElement)jsonArray);
        return jsonObject;
    }

    public /* bridge */ /* synthetic */ void a(boolean bl2) {
        this.e = bl2;
    }

    public /* bridge */ /* synthetic */ void a(int[] nArray, String[][] stringArray, String[][] stringArray2) {
        this.a = stringArray;
        this.b = stringArray2 != null && stringArray2.length == stringArray.length ? stringArray2 : stringArray;
        this.d.clear();
        this.c.clear();
        if (nArray != null) {
            for (int n2 : nArray) {
                if (n2 < 0 || n2 >= stringArray.length) continue;
                this.d.add(n2);
            }
        }
        this.c.addAll(this.d);
    }

    public /* bridge */ /* synthetic */ boolean a(String string) {
        int n2 = this.a(string);
        return n2 >= 0 && this.c.contains(n2);
    }

    public /* bridge */ /* synthetic */ void a(String string) {
        int n2 = this.a(string);
        if (n2 >= 0) {
            this.a(n2);
        }
    }

    public /* bridge */ /* synthetic */ void a(List list) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(this.c);
        this.c.clear();
        if (list != null) {
            for (String string : list) {
                int n2 = this.a(string);
                if (n2 < 0) continue;
                this.c.add(n2);
            }
        }
        if (!linkedHashSet.equals(this.c)) {
            this.d();
        }
    }

    public /* bridge */ /* synthetic */ String a(String string) {
        int n2 = this.a(string);
        return n2 < 0 ? string : ec.join(this.b[n2]);
    }

    private /* bridge */ /* synthetic */ int a(String string) {
        if (string == null) {
            return -1;
        }
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            String string2 = string;
            String string3 = this.a(i2);
            if (!kJ.a(string2, string3)) continue;
            return i2;
        }
        return -1;
    }

    private /* bridge */ /* synthetic */ String a(int n2) {
        return ec.join(this.a[n2]);
    }

    public /* bridge */ /* synthetic */ Set a() {
        return new LinkedHashSet<Integer>(this.c);
    }

    public /* bridge */ /* synthetic */ boolean a(int n2) {
        return this.c.contains(n2);
    }

    public /* bridge */ /* synthetic */ List a() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (!this.c.contains(i2)) continue;
            arrayList.add(this.a(i2));
        }
        return arrayList;
    }

    public /* bridge */ /* synthetic */ void a(int n2) {
        if (n2 < 0 || n2 >= this.a.length) {
            return;
        }
        if (!this.c.remove(n2)) {
            this.c.add(n2);
        }
        this.d();
    }

    public /* bridge */ /* synthetic */ void a(boolean bl2, int n2) {
        boolean bl3;
        if (n2 < 0 || n2 >= this.a.length) {
            return;
        }
        boolean bl4 = bl3 = bl2 ? this.c.add(n2) : this.c.remove(n2);
        if (bl3) {
            this.d();
        }
    }
}

