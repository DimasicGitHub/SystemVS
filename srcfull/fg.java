/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.annotations.SerializedName;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fg {
    @SerializedName(value="moduleName")
    private String a;
    @SerializedName(value="groupName")
    private String b;
    @SerializedName(value="scrollPosition")
    private float c;

    public fg() {
    }

    public fg(String string, String string2, float f2) {
        this.a = string;
        this.b = string2;
        this.c = f2;
    }

    public String b() {
        return this.b;
    }

    public void b(String string) {
        this.b = string;
    }

    public void a(float f2) {
        this.c = f2;
    }

    public void a(String string) {
        this.a = string;
    }

    public float a() {
        return this.c;
    }

    public String a() {
        return this.a;
    }
}

