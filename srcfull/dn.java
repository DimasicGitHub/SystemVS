/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dn {
    @SerializedName(value="modules")
    private Map<String, lc> a = new HashMap<String, lc>();
    @SerializedName(value="hudPositions")
    private Map<String, float[]> b = new HashMap<String, float[]>();
    @SerializedName(value="hudSettings")
    private Map<String, Map<String, JsonElement>> c = new HashMap<String, Map<String, JsonElement>>();
    @SerializedName(value="guiState")
    private kR d;
    @SerializedName(value="friends")
    private List<String> e = new ArrayList<String>();
    @SerializedName(value="createdAt")
    private String f;
    @SerializedName(value="friendNicknames")
    private Map<String, String> g = new HashMap<String, String>();
    @SerializedName(value="friendAliases")
    private Map<String, String> h = new HashMap<String, String>();
    @SerializedName(value="friendCreatedAt")
    private Map<String, String> i = new HashMap<String, String>();
    @SerializedName(value="favouriteModules")
    private List<String> j = new ArrayList<String>();
    @SerializedName(value="collapsedModules")
    private List<String> k = new ArrayList<String>();
    @SerializedName(value="savedColors")
    private List<Integer> l = new ArrayList<Integer>();
    @SerializedName(value="waypoints")
    private List<fM> m = new ArrayList<fM>();

    public Map e() {
        return this.h;
    }

    public List e() {
        return this.m;
    }

    public void e(Map map) {
        this.h = map;
    }

    public void e(List list) {
        this.m = list;
    }

    public void b(List list) {
        this.j = list;
    }

    public void b(Map map) {
        this.b = map;
    }

    public Map b() {
        return this.b;
    }

    public List b() {
        return this.j;
    }

    public void c(Map map) {
        this.c = map;
    }

    public Map c() {
        return this.c;
    }

    public void c(List list) {
        this.k = list;
    }

    public List c() {
        return this.k;
    }

    public void f(Map map) {
        this.i = map;
    }

    public Map f() {
        return this.i;
    }

    public void d(Map map) {
        this.g = map;
    }

    public Map d() {
        return this.g;
    }

    public void d(List list) {
        this.l = list;
    }

    public List d() {
        return this.l;
    }

    public Map a() {
        return this.a;
    }

    public List a() {
        return this.e;
    }

    public void a(Map map) {
        this.a = map;
    }

    public kR a() {
        return this.d;
    }

    public String a() {
        return this.f;
    }

    public void a(kR kR2) {
        this.d = kR2;
    }

    public void a(List list) {
        this.e = list;
    }

    public void a(String string) {
        this.f = string;
    }
}

