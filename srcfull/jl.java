/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class jl {
    private final String a;
    private int b;

    private jl(String string) {
        this.a = string;
    }

    private boolean b() {
        this.a();
        return this.b < this.a.length() && Character.isLetter(this.a.charAt(this.b));
    }

    private boolean c() {
        this.a();
        if (this.b >= this.a.length()) {
            return false;
        }
        char c2 = this.a.charAt(this.b);
        return c2 == '-' || c2 == '+' || c2 == '.' || Character.isDigit(c2);
    }

    private float a() {
        this.a();
        int n2 = this.b;
        boolean bl2 = false;
        while (this.b < this.a.length()) {
            char c2 = this.a.charAt(this.b);
            if (Character.isDigit(c2) || c2 == '.' || (c2 == '-' || c2 == '+') && this.b == n2 || (c2 == '-' || c2 == '+') && bl2) {
                bl2 = false;
                ++this.b;
                continue;
            }
            if (c2 != 'e' && c2 != 'E') break;
            bl2 = true;
            ++this.b;
        }
        return Float.parseFloat(this.a.substring(n2, this.b));
    }

    private void a() {
        char c2;
        while (this.b < this.a.length() && (Character.isWhitespace(c2 = this.a.charAt(this.b)) || c2 == ',')) {
            ++this.b;
        }
    }

    private char a() {
        return this.a.charAt(this.b++);
    }

    private boolean a() {
        this.a();
        return this.b < this.a.length();
    }
}

