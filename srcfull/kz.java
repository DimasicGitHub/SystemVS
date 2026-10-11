/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.annotations.SerializedName;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class kz {
    @SerializedName(value="unicode")
    private int a;
    @SerializedName(value="advance")
    private float b;
    @SerializedName(value="planeBounds")
    private jN c;
    @SerializedName(value="atlasBounds")
    private jN d;

    public jN b() {
        return this.d;
    }

    public int a() {
        return this.a;
    }

    public jN a() {
        return this.c;
    }

    public float a() {
        return this.b;
    }
}

