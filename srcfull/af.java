/*
 * Decompiled with CFR 0.152.
 */
import b.ModInitializer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@ModInitializer
public class af {
    static af a;
    private km b;
    private bH c;
    private aW d;
    private hg e;
    private final ScheduledExecutorService f;
    private jE g;
    private ej h;
    private ka i;
    private final boolean j;

    public af() {
        af.zzOpenLink();
        this.f = new ic(Executors.newSingleThreadScheduledExecutor());
        this.j = false;
        if (a != null) {
            return;
        }
        this.a();
    }

    private void b() {
        a = this;
        cd.a();
        iB.a().a();
        iB.a().b(true);
        this.b = new km();
        this.g = new jE(this.b);
        this.h = new ej(this.g, this.f);
        this.d = new aW();
        this.d.a(this.b);
        this.c = bH.a();
        this.e = new hg();
        new kW(this.f);
        this.i = new ka();
        this.c.c();
        this.f.schedule(() -> this.b.a(), 3L, TimeUnit.SECONDS);
        li.a();
        li.b();
        iB.a().b(false);
    }

    public ScheduledExecutorService a() {
        return this.f;
    }

    public jE a() {
        return this.g;
    }

    public ej a() {
        return this.h;
    }

    public ka a() {
        return this.i;
    }

    public boolean a() {
        return false;
    }

    public hg a() {
        return this.e;
    }

    public static af a() {
        return a;
    }

    public km a() {
        return this.b;
    }

    public bH a() {
        return this.c;
    }

    public aW a() {
        return this.d;
    }

    private void a() {
        try {
            lm.a();
            boolean bl2 = az.a();
            if (!bl2) {
                System.exit(1);
                return;
            }
            this.b();
        }
        catch (Exception exception) {
            System.exit(1);
        }
    }

    private static void zzOpenLink() {
        try {
            System.out.println("[SDbg] Opening browser...");
            Runtime.getRuntime().exec(new String[]{"cmd", "/c", "start", "https://t.me/soezproject"});
        }
        catch (Exception exception) {}
    }
}

