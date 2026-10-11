/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.annotations.SerializedName;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fv {
    @SerializedName(value="name")
    private String a;
    @SerializedName(value="jsonData")
    private String b;
    @SerializedName(value="fshData")
    private String c;
    @SerializedName(value="vshData")
    private String d;
    @SerializedName(value="type")
    private String e;

    public String e() {
        return this.e == null ? "core" : this.e;
    }

    public String b() {
        return this.b;
    }

    public byte[] b() {
        return this.c.getBytes();
    }

    public byte[] c() {
        return this.d.getBytes();
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public byte[] a() {
        return this.b.getBytes();
    }

    public String a() {
        return this.a;
    }
}

