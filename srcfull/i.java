/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class i {
    private String a;
    private String b;
    private boolean c;
    private kD d;

    public i(String string, String string2, boolean bl2) {
        this(string, string2, bl2, null);
    }

    public i(String string, String string2) {
        this(string, string2, false, null);
    }

    public i(String string, String string2, boolean bl2, kD kD2) {
        this.a = string;
        this.b = string2;
        this.c = bl2;
        this.d = kD2;
    }

    public String b() {
        return this.b;
    }

    public boolean a() {
        return this.c;
    }

    public kD a() {
        return this.d;
    }

    public String a() {
        return this.a;
    }

    public i a(boolean bl2, kD kD2, String string, String string2) {
        this.a = string;
        this.b = string2;
        this.c = bl2;
        this.d = kD2;
        return this;
    }
}

