/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.annotations.SerializedName;

public final class ci {
    @SerializedName(value="lineHeight")
    private float a;
    @SerializedName(value="ascender")
    private float b;
    @SerializedName(value="descender")
    private float c;

    public float b() {
        return this.b;
    }

    public float c() {
        return this.c;
    }

    public float d() {
        return this.a + this.c;
    }

    public float a() {
        return this.a;
    }
}

