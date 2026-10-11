/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.annotations.SerializedName;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class o {
    @SerializedName(value="name")
    private String a;
    @SerializedName(value="width")
    private float b;
    @SerializedName(value="height")
    private float c;
    @SerializedName(value="strokeWidth")
    private float d;
    @SerializedName(value="filled")
    private boolean e;
    @SerializedName(value="paths")
    private List<String> f;

    public float b() {
        return this.c;
    }

    public float c() {
        return this.d;
    }

    public List a() {
        return this.f;
    }

    public boolean a() {
        return this.e;
    }

    public float a() {
        return this.b;
    }

    public String a() {
        return this.a;
    }
}

