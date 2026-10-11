/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import org.lwjgl.glfw.GLFW;

public class kn
extends fa {
    @Expose
    private int a;
    @Expose
    private int b;
    @Expose
    private int c;
    @Expose
    private String d;
    private /* synthetic */ Runnable e;

    public /* synthetic */ kn(String string, String string2, int n2) {
        super(string, string2);
        this.c = n2;
        this.a = n2;
        this.b = 0;
        this.d = bu.b(n2, 0);
    }

    public /* synthetic */ kn(String string, String string2, int n2, Runnable runnable) {
        this(string, string2, n2);
        this.e = runnable;
    }

    @Override
    public /* bridge */ /* synthetic */ String i() {
        return "hotkey";
    }

    public /* bridge */ /* synthetic */ String b() {
        return this.d;
    }

    public /* bridge */ /* synthetic */ int b() {
        return this.b;
    }

    public /* bridge */ /* synthetic */ void b(int n2) {
        this.b = n2;
    }

    public /* bridge */ /* synthetic */ int c() {
        return this.c;
    }

    @Override
    public /* bridge */ /* synthetic */ void c() {
        this.a(this.c);
    }

    public /* bridge */ /* synthetic */ void c(int n2) {
        this.c = n2;
    }

    public /* bridge */ /* synthetic */ int a() {
        return this.a;
    }

    public /* bridge */ /* synthetic */ Runnable a() {
        return this.e;
    }

    public /* bridge */ /* synthetic */ void a(String string) {
        this.d = string;
    }

    public /* bridge */ /* synthetic */ void a(Runnable runnable) {
        this.e = runnable;
    }

    public /* bridge */ /* synthetic */ String a() {
        return this.d;
    }

    public /* bridge */ /* synthetic */ void a() {
        if (this.e != null) {
            this.e.run();
        }
    }

    public /* bridge */ /* synthetic */ void a(int n2, int n3) {
        this.a = n3;
        this.b = n2;
        this.d = bu.b(n3, n2);
        bH.a().a();
    }

    public /* bridge */ /* synthetic */ void a(int n2) {
        this.a = n2;
        this.b = 0;
        this.d = this.a(n2);
        bH.a().a();
    }

    @Override
    public /* bridge */ /* synthetic */ void a(JsonObject jsonObject) {
        if (jsonObject.has("keyCode")) {
            int n2;
            int n3 = jsonObject.get("keyCode").getAsInt();
            int n4 = n2 = jsonObject.has("modifierFlags") ? jsonObject.get("modifierFlags").getAsInt() : 0;
            int n5 = n3;
            this.a(n4, n5);
        }
    }

    @Override
    public /* bridge */ /* synthetic */ JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", this.i());
        jsonObject.addProperty("keyCode", (Number)this.a);
        jsonObject.addProperty("modifierFlags", (Number)this.b);
        jsonObject.addProperty("defaultKeyCode", (Number)this.c);
        jsonObject.addProperty("keyName", this.d);
        jsonObject.addProperty("fullKeyName", this.a());
        return jsonObject;
    }

    public /* bridge */ /* synthetic */ boolean a() {
        if (this.a == -1 || this.a == -1) {
            return false;
        }
        long l2 = GLFW.glfwGetCurrentContext();
        if (l2 == 0L) {
            return false;
        }
        int n2 = this.b;
        long l3 = l2;
        if (!bu.a(n2, l3)) {
            return false;
        }
        if (this.a >= 0 && this.a <= 7) {
            return GLFW.glfwGetMouseButton((long)l2, (int)this.a) == 1;
        }
        if (this.a < 32) {
            return false;
        }
        return GLFW.glfwGetKey((long)l2, (int)this.a) == 1;
    }

    public /* bridge */ /* synthetic */ String a(int n2) {
        if (n2 == -1) {
            return "None";
        }
        switch (n2) {
            case 0: {
                return "M1";
            }
            case 1: {
                return "M2";
            }
            case 2: {
                return "M3";
            }
            case 3: {
                return "M4";
            }
            case 4: {
                return "M5";
            }
            case 5: {
                return "M6";
            }
            case 6: {
                return "M7";
            }
            case 7: {
                return "M8";
            }
        }
        switch (n2) {
            case 32: {
                return "SPACE";
            }
            case 257: {
                return "ENTER";
            }
            case 258: {
                return "TAB";
            }
            case 259: {
                return "BACKSPACE";
            }
            case 261: {
                return "DELETE";
            }
            case 260: {
                return "INSERT";
            }
            case 268: {
                return "HOME";
            }
            case 269: {
                return "END";
            }
            case 266: {
                return "PAGE_UP";
            }
            case 267: {
                return "PAGE_DOWN";
            }
            case 256: {
                return "ESC";
            }
            case 340: {
                return "LSHIFT";
            }
            case 344: {
                return "RSHIFT";
            }
            case 341: {
                return "LCTRL";
            }
            case 345: {
                return "RCTRL";
            }
            case 342: {
                return "LALT";
            }
            case 346: {
                return "RALT";
            }
            case 280: {
                return "CAPS";
            }
            case 282: {
                return "NUM_LOCK";
            }
            case 281: {
                return "SCROLL_LOCK";
            }
            case 265: {
                return "UP";
            }
            case 264: {
                return "DOWN";
            }
            case 263: {
                return "LEFT";
            }
            case 262: {
                return "RIGHT";
            }
            case 39: {
                return "'";
            }
            case 44: {
                return ",";
            }
            case 45: {
                return "-";
            }
            case 46: {
                return ".";
            }
            case 47: {
                return "/";
            }
            case 59: {
                return ";";
            }
            case 61: {
                return "=";
            }
            case 91: {
                return "[";
            }
            case 92: {
                return "\\";
            }
            case 93: {
                return "]";
            }
            case 96: {
                return "`";
            }
        }
        if (n2 >= 290 && n2 <= 314) {
            return "F" + (n2 - 290 + 1);
        }
        if (n2 >= 320 && n2 <= 329) {
            return "KP_" + (n2 - 320);
        }
        if (n2 >= 48 && n2 <= 57) {
            return String.valueOf((char)n2);
        }
        if (n2 >= 65 && n2 <= 90) {
            return String.valueOf((char)n2);
        }
        return "KEY_" + n2;
    }
}

