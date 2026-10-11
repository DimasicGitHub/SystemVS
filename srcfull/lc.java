/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lc {
    @SerializedName(value="enabled")
    private boolean a;
    @SerializedName(value="keyBind")
    private int b;
    @SerializedName(value="settings")
    private Map<String, JsonElement> c = new HashMap<String, JsonElement>();

    public void a(boolean bl2) {
        this.a = bl2;
    }

    public void a(int n2) {
        this.b = n2;
    }

    public void a(Map map) {
        this.c = map;
    }

    public Map a() {
        return this.c;
    }

    public int a() {
        return this.b;
    }

    public boolean a() {
        return this.a;
    }
}

