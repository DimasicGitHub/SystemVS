/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ej {
    private static long a = 10L;
    private final jE b;
    private final ScheduledExecutorService c;
    private final AtomicReference<ScheduledFuture<?>> d = new AtomicReference();
    private volatile boolean e = false;
    private volatile boolean f = false;
    private volatile boolean g = false;
    private volatile String h = null;

    public ej(jE jE2, ScheduledExecutorService scheduledExecutorService) {
        this.b = jE2;
        this.c = scheduledExecutorService;
    }

    public void e() {
        this.f = true;
        ScheduledFuture scheduledFuture = this.d.getAndSet(null);
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            scheduledFuture.cancel(false);
        }
    }

    private void b() {
        ScheduledFuture<?> scheduledFuture = this.d.get();
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            scheduledFuture.cancel(false);
        }
        ScheduledFuture<?> scheduledFuture2 = this.c.schedule(this::c, a, TimeUnit.SECONDS);
        this.d.set(scheduledFuture2);
    }

    private void c() {
        System.out.println("[SDbg] ej.c() timerFire ENTER");
        if (this.f || !this.e) {
            return;
        }
        try {
            String string = this.b.a();
            String string2 = this.a(string);
            if (string2 != null && string2.equals(this.h)) {
                this.e = false;
                return;
            }
            boolean bl2 = this.b.a();
            if (bl2) {
                this.h = string2;
                this.e = false;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void f() {
        this.f = false;
    }

    public void d() {
        System.out.println("[SDbg] ej.d() ENTER locked=");
        if (this.f) {
            return;
        }
        ScheduledFuture scheduledFuture = this.d.getAndSet(null);
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            scheduledFuture.cancel(false);
        }
        String string = this.b.b();
        System.out.println(string);
        if (string == null) {
            return;
        }
        try {
            boolean bl2;
            String string2 = this.b.a();
            String string3 = this.a(string2);
            if ((string3 == null || !string3.equals(this.h)) && (bl2 = this.b.a())) {
                this.h = string3;
                this.e = false;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void a(boolean bl2) {
        this.g = bl2;
    }

    public boolean a() {
        return this.g;
    }

    private String a(String string) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] byArray = messageDigest.digest(string.getBytes(StandardCharsets.UTF_8));
            StringBuilder stringBuilder = new StringBuilder(byArray.length * 2);
            for (byte by2 : byArray) {
                stringBuilder.append(String.format("%02x", by2));
            }
            return stringBuilder.toString();
        }
        catch (Exception exception) {
            return null;
        }
    }

    public void a() {
        if (this.f || this.g) {
            return;
        }
        this.e = true;
        System.out.println("[SDbg] ej.a() -> calling d()");
        this.d();
        this.b();
    }

    public void g() {
        this.h = null;
    }
}

