/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class jh
extends fa {
    private /* synthetic */ String[][] a;
    private final /* synthetic */ Set<Integer> b;
    private final /* synthetic */ Set<Integer> c;
    private final /* synthetic */ boolean d;
    private /* synthetic */ int e;
    private final /* synthetic */ int f;

    public /* synthetic */ jh(String string, String string2, List list, List list2, boolean bl2, int n2, int n3) {
        super(string, string2);
        this.b = new LinkedHashSet<Integer>();
        this.c = new LinkedHashSet<Integer>();
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.a(list);
        this.d = bl2;
        this.e = Math.max(1, n2);
        this.f = Math.max(0, n3);
        if (list2 != null) {
            for (String string3 : list2) {
                int n4 = this.a(string3);
                if (n4 < 0) continue;
                this.c.add(n4);
            }
        }
        this.b.addAll(this.c);
        this.e();
        this.c.clear();
        this.c.addAll(this.b);
    }

    public /* synthetic */ jh(String string, String string2, List list, List list2, boolean bl2) {
        this(string, string2, list, list2, bl2, bl2 ? list.size() : 1, 0);
    }

    public /* synthetic */ jh(String string, String string2, List list, List list2) {
        this(string, string2, list, list2, true, list.size(), 0);
    }

    public /* bridge */ /* synthetic */ boolean e() {
        return this.b.equals(this.c);
    }

    public /* bridge */ /* synthetic */ void e(int n2) {
        this.e = n2;
    }

    public /* bridge */ /* synthetic */ int e() {
        return this.b.size();
    }

    private /* bridge */ /* synthetic */ void e() {
        int n3;
        this.b.removeIf(n2 -> n2 < 0 || n2 >= this.a.length);
        for (n3 = 0; n3 < this.a.length && this.b.size() < this.f; ++n3) {
            this.b.add(n3);
        }
        while (this.b.size() > this.e) {
            n3 = -1;
            Iterator<Integer> iterator = this.b.iterator();
            while (iterator.hasNext()) {
                int n4;
                n3 = n4 = iterator.next().intValue();
            }
            this.b.remove(n3);
        }
        if (!this.d && this.b.size() > 1) {
            n3 = this.b();
            this.b.clear();
            if (n3 >= 0) {
                this.b.add(n3);
            }
        }
    }

    @Override
    public /* bridge */ /* synthetic */ String i() {
        return "list";
    }

    public /* bridge */ /* synthetic */ List b() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int n2 : this.c) {
            arrayList.add(this.a(n2));
        }
        return arrayList;
    }

    public /* bridge */ /* synthetic */ boolean b() {
        return this.b.size() >= this.e;
    }

    public /* bridge */ /* synthetic */ void b(List list) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(this.b);
        this.b.clear();
        if (list != null) {
            for (String string : list) {
                int n2 = this.a(string);
                if (n2 < 0) continue;
                this.b.add(n2);
            }
        }
        this.e();
        if (!linkedHashSet.equals(this.b)) {
            this.d();
        }
    }

    public /* bridge */ /* synthetic */ boolean b(String string) {
        return this.a(string);
    }

    public /* bridge */ /* synthetic */ void b(String string) {
        int n2 = this.a(string);
        if (n2 >= 0) {
            this.d(n2);
        }
    }

    public /* bridge */ /* synthetic */ void b() {
        if (!this.d) {
            return;
        }
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(this.b);
        this.b.clear();
        int n2 = Math.min(this.a.length, this.e);
        for (int i2 = 0; i2 < n2; ++i2) {
            this.b.add(i2);
        }
        if (!linkedHashSet.equals(this.b)) {
            this.d();
        }
    }

    public /* bridge */ /* synthetic */ String b() {
        if (this.b.isEmpty()) {
            return "None";
        }
        if (this.b.size() == 1) {
            return this.a(this.b());
        }
        return String.join((CharSequence)", ", this.a());
    }

    public /* bridge */ /* synthetic */ int b() {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (!this.b.contains(i2)) continue;
            return i2;
        }
        return -1;
    }

    public /* bridge */ /* synthetic */ void b(int n2) {
        if (n2 < 0 || n2 >= this.a.length) {
            return;
        }
        if (this.b.contains(n2)) {
            this.d(n2);
        } else {
            this.c(n2);
        }
    }

    public /* bridge */ /* synthetic */ void c(String string) {
        int n2 = this.a(string);
        if (n2 >= 0) {
            this.b(n2);
        }
    }

    public /* bridge */ /* synthetic */ void c(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        List list2 = this.a();
        this.a(list);
        this.e = this.d ? list.size() : 1;
        this.b.clear();
        for (String string : list2) {
            int n2 = this.a(string);
            if (n2 < 0) continue;
            this.b.add(n2);
        }
        if (this.b.isEmpty() && this.a.length > 0) {
            this.b.add(0);
        }
        this.e();
        this.d();
    }

    public /* bridge */ /* synthetic */ List c() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            arrayList.add(this.a(i2));
        }
        return arrayList;
    }

    public /* bridge */ /* synthetic */ int c() {
        return this.e;
    }

    public /* bridge */ /* synthetic */ boolean c() {
        return this.b.size() <= this.f;
    }

    private /* bridge */ /* synthetic */ void c(int n2) {
        boolean bl2 = false;
        if (!this.d) {
            if (this.b.size() != 1 || !this.b.contains(n2)) {
                this.b.clear();
                this.b.add(n2);
                bl2 = true;
            }
        } else if (!this.b.contains(n2) && this.b.size() < this.e) {
            this.b.add(n2);
            bl2 = true;
        }
        if (bl2) {
            this.d();
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void c() {
        this.b(this.b());
    }

    public /* bridge */ /* synthetic */ void d(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        List list2 = this.a();
        this.a(list);
        this.b.clear();
        for (String string : list2) {
            int n2 = this.a(string);
            if (n2 < 0) continue;
            this.b.add(n2);
        }
        this.e();
    }

    public /* bridge */ /* synthetic */ int d() {
        return this.f;
    }

    private /* bridge */ /* synthetic */ void d(int n2) {
        if (this.b.size() > this.f && this.b.remove(n2)) {
            this.d();
        }
    }

    @Override
    public /* bridge */ /* synthetic */ JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", this.i());
        jsonObject.addProperty("allowMultiple", Boolean.valueOf(this.d));
        jsonObject.addProperty("maxSelections", (Number)this.e);
        jsonObject.addProperty("minSelections", (Number)this.f);
        jsonObject.addProperty("selectedCount", (Number)this.e());
        jsonObject.addProperty("isAtDefault", Boolean.valueOf(this.e()));
        jsonObject.addProperty("visible", Boolean.valueOf(this.i));
        JsonArray jsonArray = new JsonArray();
        for (int n2 : this.b) {
            jsonArray.add((Number)n2);
        }
        jsonObject.add("selectedIndices", (JsonElement)jsonArray);
        return jsonObject;
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return this.d;
    }

    @Override
    public /* bridge */ /* synthetic */ void a(JsonObject jsonObject) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(this.b);
        if (jsonObject.has("selectedIndices") && jsonObject.get("selectedIndices").isJsonArray()) {
            this.b.clear();
            for (JsonElement jsonElement : jsonObject.getAsJsonArray("selectedIndices")) {
                int n2 = jsonElement.getAsInt();
                if (n2 < 0 || n2 >= this.a.length) continue;
                this.b.add(n2);
            }
            this.e();
        } else if (jsonObject.has("selectedValues") && jsonObject.get("selectedValues").isJsonArray()) {
            kJ.a();
            this.b.clear();
            for (JsonElement jsonElement : jsonObject.getAsJsonArray("selectedValues")) {
                int n3 = this.a(jsonElement.getAsString());
                if (n3 < 0) continue;
                this.b.add(n3);
            }
            this.e();
        }
        if (jsonObject.has("visible")) {
            this.i = jsonObject.get("visible").getAsBoolean();
        }
        if (!linkedHashSet.equals(this.b)) {
            this.d();
        }
    }

    public /* bridge */ /* synthetic */ String[] a(int n2) {
        return n2 >= 0 && n2 < this.a.length ? this.a[n2] : new String[]{};
    }

    public /* bridge */ /* synthetic */ boolean a(int n2) {
        return this.b.contains(n2);
    }

    public /* bridge */ /* synthetic */ void a(int n2) {
        if (n2 >= 0 && n2 < this.a.length) {
            this.c(n2);
        }
    }

    private /* bridge */ /* synthetic */ String a(int n2) {
        return ec.join(this.a[n2]);
    }

    public /* bridge */ /* synthetic */ int a() {
        return this.a.length;
    }

    public /* bridge */ /* synthetic */ void a(String[][] stringArray, int[] nArray) {
        this.a = stringArray;
        this.c.clear();
        this.b.clear();
        if (nArray != null) {
            for (int n2 : nArray) {
                if (n2 < 0 || n2 >= stringArray.length) continue;
                this.c.add(n2);
            }
        }
        this.b.addAll(this.c);
        this.e();
    }

    private /* bridge */ /* synthetic */ void a(List list) {
        this.a = new String[list.size()][];
        for (int i2 = 0; i2 < list.size(); ++i2) {
            this.a[i2] = ec.split((String)list.get(i2));
        }
    }

    public /* bridge */ /* synthetic */ void a(String string) {
        int n2 = this.a(string);
        if (n2 >= 0) {
            this.c(n2);
        }
    }

    public /* bridge */ /* synthetic */ Set a() {
        return new LinkedHashSet(this.a());
    }

    public /* bridge */ /* synthetic */ void a() {
        if (this.f == 0 && !this.b.isEmpty()) {
            this.b.clear();
            this.d();
        }
    }

    public /* bridge */ /* synthetic */ List a() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (!this.b.contains(i2)) continue;
            arrayList.add(this.a(i2));
        }
        return arrayList;
    }

    public /* bridge */ /* synthetic */ boolean a(String string) {
        int n2 = this.a(string);
        return n2 >= 0 && this.b.contains(n2);
    }

    public /* bridge */ /* synthetic */ String a() {
        int n2 = this.b();
        return n2 < 0 ? null : this.a(n2);
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
}

