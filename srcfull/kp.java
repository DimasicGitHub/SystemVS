/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class kp {
    private final StringBuilder a = new StringBuilder();
    private final float b;
    private boolean c;
    private boolean d;
    private int e;
    private int f;
    private Consumer<String> g;
    private Runnable h;

    public kp(float f2) {
        this.b = f2;
    }

    private String b() {
        int n2;
        int n3 = Math.min(this.e, this.f);
        if (n3 == (n2 = Math.max(this.e, this.f))) {
            return "";
        }
        return this.a.substring(n3, n2);
    }

    public int b() {
        return this.a.length();
    }

    private int b(int n2) {
        int n3;
        int n4 = this.a.length();
        for (n3 = n2; n3 < n4 && !Character.isWhitespace(this.a.charAt(n3)); ++n3) {
        }
        while (n3 < n4 && Character.isWhitespace(this.a.charAt(n3))) {
            ++n3;
        }
        return n3;
    }

    public boolean b() {
        return this.e != this.f;
    }

    public kp b(boolean bl2) {
        this.d = bl2;
        return this;
    }

    private void b() {
        int n2;
        int n3 = Math.min(this.e, this.f);
        if (n3 == (n2 = Math.max(this.e, this.f))) {
            return;
        }
        this.a.delete(n3, n2);
        this.e = n3;
        this.f = n3;
    }

    public void b(String string) {
        if (this.f != this.e) {
            this.b();
        }
        this.a.insert(this.e, string);
        this.e += string.length();
        this.f = this.e;
        this.c();
    }

    private void c() {
        if (this.e > this.a.length()) {
            this.e = this.a.length();
        }
        if (this.f > this.a.length()) {
            this.f = this.a.length();
        }
        if (this.g != null) {
            this.g.accept(this.a.toString());
        }
    }

    public int c() {
        return this.e;
    }

    public boolean a(char c2) {
        if (c2 < ' ' || c2 == '\u007f') {
            return false;
        }
        this.b(String.valueOf(c2));
        return true;
    }

    public static int a() {
        return gD.primary() & 0xFFFFFF | 0x55000000;
    }

    public void a(float f2, int n2, Matrix4f matrix4f, float f3, boolean bl2, float f4, float f5) {
        String string = this.a.toString();
        int n3 = this.a(f5);
        String string2 = string.substring(n3);
        if (this.c) {
            ao.b(matrix4f, string2, f4, f2, this.b, n2, f3);
        } else if (this.d) {
            float f6 = f3;
            int n4 = n2;
            float f7 = this.b;
            float f8 = f2;
            float f9 = f4;
            String string3 = string2;
            Matrix4f matrix4f2 = matrix4f;
            ao.a(f8, f9, n4, f7, f6, string3, matrix4f2);
        } else {
            ao.a(matrix4f, string2, f4, f2, this.b, n2, f3);
        }
        int n5 = Math.min(this.e, this.f);
        int n6 = Math.max(this.e, this.f);
        if (n5 != n6) {
            int n7 = Math.max(n5, n3);
            int n8 = Math.max(n6, n3);
            if (n8 > n7) {
                float f10 = f4 + ao.a(string.substring(n3, n7), this.b);
                float f11 = ao.a(string.substring(n7, n8), this.b);
                float f12 = f3;
                int n9 = kp.a();
                float f13 = 0.0f;
                float f14 = this.b + 2.0f;
                float f15 = f11;
                float f16 = f2 - 1.0f;
                float f17 = f10;
                Matrix4f matrix4f3 = matrix4f;
                dP.a(f13, f17, n9, matrix4f3, f14, f15, f12, f16);
            }
        }
        if (bl2) {
            float f18 = f4 + ao.a(string.substring(n3, Math.max(this.e, n3)), this.b);
            float f19 = f3;
            int n10 = gD.foreground();
            float f20 = this.b;
            float f21 = 1.0f;
            float f22 = f2;
            float f23 = f18;
            Matrix4f matrix4f4 = matrix4f;
            dP.a(f19, f20, f23, f22, f21, matrix4f4, n10);
        }
    }

    private int a(int n2) {
        int n3;
        for (n3 = n2; n3 > 0 && Character.isWhitespace(this.a.charAt(n3 - 1)); --n3) {
        }
        while (n3 > 0 && !Character.isWhitespace(this.a.charAt(n3 - 1))) {
            --n3;
        }
        return n3;
    }

    public int a(float f2) {
        int n2;
        String string = this.a.toString();
        for (n2 = 0; n2 < this.e && ao.a(string.substring(n2, this.e), this.b) > f2; ++n2) {
        }
        return n2;
    }

    public void a(String string) {
        this.a.setLength(0);
        if (string != null) {
            this.a.append(string);
        }
        this.f = this.e = this.a.length();
        this.c();
    }

    public boolean a() {
        return this.a.length() == 0;
    }

    public String a() {
        return this.a.toString();
    }

    public kp a(boolean bl2) {
        this.c = bl2;
        return this;
    }

    public boolean a(int n2, int n3) {
        boolean bl2;
        boolean bl3 = (n2 & 2) != 0;
        boolean bl4 = bl2 = (n2 & 1) != 0;
        if (n3 == 257 || n3 == 335) {
            if (this.h != null) {
                this.h.run();
            }
            return true;
        }
        if (bl3 && n3 == 65) {
            this.f = 0;
            this.e = this.a.length();
            return true;
        }
        if (bl3 && n3 == 67) {
            String string = this.b();
            lo.aM.field_1774.method_1455(string.isEmpty() ? this.a.toString() : string);
            return true;
        }
        if (bl3 && n3 == 88) {
            String string = this.b();
            if (!string.isEmpty()) {
                lo.aM.field_1774.method_1455(string);
                this.b();
                this.c();
            }
            return true;
        }
        if (bl3 && n3 == 86) {
            String string = lo.aM.field_1774.method_1460();
            if (string != null && !string.isEmpty()) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int i2 = 0; i2 < string.length(); ++i2) {
                    char c2 = string.charAt(i2);
                    if (c2 < ' ' || c2 == '\u007f') continue;
                    stringBuilder.append(c2);
                }
                if (!stringBuilder.isEmpty()) {
                    this.b(stringBuilder.toString());
                }
            }
            return true;
        }
        if (n3 == 263) {
            int n4;
            int n5 = n4 = bl3 ? this.a(this.e) : Math.max(0, this.e - 1);
            this.e = bl2 ? n4 : (this.f != this.e ? Math.min(this.e, this.f) : n4);
            if (!bl2) {
                this.f = this.e;
            }
            return true;
        }
        if (n3 == 262) {
            int n6;
            int n7 = n6 = bl3 ? this.b(this.e) : Math.min(this.a.length(), this.e + 1);
            this.e = bl2 ? n6 : (this.f != this.e ? Math.max(this.e, this.f) : n6);
            if (!bl2) {
                this.f = this.e;
            }
            return true;
        }
        if (n3 == 268) {
            this.e = 0;
            if (!bl2) {
                this.f = this.e;
            }
            return true;
        }
        if (n3 == 269) {
            this.e = this.a.length();
            if (!bl2) {
                this.f = this.e;
            }
            return true;
        }
        if (n3 == 259) {
            if (this.f != this.e) {
                this.b();
            } else if (this.e > 0) {
                int n8 = bl3 ? this.a(this.e) : this.e - 1;
                this.a.delete(n8, this.e);
                this.f = this.e = n8;
            } else {
                return true;
            }
            this.c();
            return true;
        }
        if (n3 == 261) {
            if (this.f != this.e) {
                this.b();
            } else if (this.e < this.a.length()) {
                int n9 = bl3 ? this.b(this.e) : this.e + 1;
                this.a.delete(this.e, n9);
            } else {
                return true;
            }
            this.c();
            return true;
        }
        return false;
    }

    public void a(Runnable runnable) {
        this.h = runnable;
    }

    public void a(Consumer consumer) {
        this.g = consumer;
    }

    public void a() {
        this.a.setLength(0);
        this.e = 0;
        this.f = 0;
        this.c();
    }
}

