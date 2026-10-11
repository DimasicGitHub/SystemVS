/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class jg {
    private static final jg INSTANCE = new jg();
    private final List<kC> a = new ArrayList<kC>();
    private volatile boolean b;

    public void b(String string, String string2, Runnable runnable) {
        Runnable runnable2 = runnable;
        Consumer<jE> consumer = jE2 -> jE2.b(string2, string);
        jg.a(runnable2, consumer);
    }

    public void b(Runnable runnable, String string) {
        jg.a((T jE2) -> {
            boolean bl2 = string != null && string.equals(jE2.b());
            jE2.a(string);
            if (bl2) {
                jE2.a();
            }
        }, runnable);
    }

    public void b(Consumer consumer, String string) {
        jg.a((T jE2) -> jE2.a(string), (T list) -> {
            if (consumer != null) {
                consumer.accept(list == null ? new ArrayList() : list);
            }
        });
    }

    public void b(Runnable runnable) {
        Runnable runnable2 = runnable;
        Consumer<jE> consumer = jE2 -> {
            ej ej2 = jg.a();
            if (ej2 != null) {
                ej2.d();
            } else {
                jE2.a();
            }
        };
        jg.a(runnable2, consumer);
    }

    public void c(Consumer consumer, String string) {
        jg.a((T jE2) -> jE2.a(string), consumer);
    }

    public synchronized List a() {
        return new ArrayList<kC>(this.a);
    }

    public void a(String string, boolean bl2, Runnable runnable) {
        Runnable runnable2 = runnable;
        Consumer<jE> consumer = jE2 -> jE2.a(string, bl2);
        jg.a(runnable2, consumer);
    }

    public void a(String string, Consumer consumer) {
        jg.a((T jE2) -> jE2.b(string), consumer);
    }

    public void a(String string, Runnable runnable, String string2) {
        Runnable runnable2 = runnable;
        Consumer<jE> consumer = jE2 -> {
            String string3 = string2;
            String string4 = string;
            jE2.c(string3, string4);
        };
        jg.a(runnable2, consumer);
    }

    public void a(String string, String string2, Consumer consumer) {
        iJ.a(() -> {
            jE jE2 = jg.a();
            if (jE2 == null) {
                return;
            }
            ej ej2 = jg.a();
            if (ej2 != null && jE2.b() != null) {
                ej2.d();
            }
            kC[] kCArray = new kC[1];
            jg.a(ej2, () -> {
                jE2.a();
                String string3 = string;
                String string4 = string2;
                kCArray[0] = jE2.a(string3, string4);
                if (kCArray[0] != null && kCArray[0].a() != null) {
                    jE2.c(kCArray[0].a());
                }
            });
            iJ.b(() -> {
                if (consumer != null) {
                    consumer.accept(kCArray[0]);
                }
            });
        });
    }

    private static void a(Runnable runnable, Consumer consumer) {
        iJ.a(() -> {
            jE jE2 = jg.a();
            if (jE2 == null) {
                return;
            }
            consumer.accept(jE2);
            iJ.b(runnable);
        });
    }

    public void a(Runnable runnable) {
        this.b = true;
        iJ.a(() -> {
            jE jE2 = jg.a();
            if (jE2 == null) {
                this.b = false;
                return;
            }
            List list = jE2.a();
            jg jg2 = this;
            synchronized (jg2) {
                this.a.clear();
                if (list != null) {
                    list.sort(Comparator.comparing(kC::d, Comparator.nullsLast(Comparator.naturalOrder())));
                    this.a.addAll(list);
                }
            }
            this.b = false;
            iJ.b(runnable);
        });
    }

    public void a(Runnable runnable, String string) {
        iJ.a(() -> {
            jE jE2 = jg.a();
            if (jE2 == null) {
                return;
            }
            ej ej2 = jg.a();
            if (ej2 != null) {
                ej2.d();
            }
            jg.a(ej2, () -> {
                if (jE2.c(string)) {
                    jE2.a(string);
                }
            });
            iJ.b(runnable);
        });
    }

    public void a(String string, String string2, Runnable runnable) {
        Runnable runnable2 = runnable;
        Consumer<jE> consumer = jE2 -> {
            String string3 = string2;
            String string4 = string;
            jE2.a(string3, string4);
        };
        jg.a(runnable2, consumer);
    }

    public void a(Consumer consumer, String string) {
        jg.a((T jE2) -> jE2.a(string), consumer);
    }

    private static ej a() {
        af af2 = af.a();
        return af2 == null ? null : af2.a();
    }

    public boolean a() {
        return this.b;
    }

    public static jg a() {
        return INSTANCE;
    }

    private static void a(Function function, Consumer consumer) {
        iJ.a(() -> {
            jE jE2 = jg.a();
            if (jE2 == null) {
                return;
            }
            Object r2 = function.apply(jE2);
            iJ.b(() -> {
                if (consumer != null) {
                    consumer.accept(r2);
                }
            });
        });
    }

    private static void a(Consumer consumer, Runnable runnable) {
        iJ.a(() -> {
            jE jE2 = jg.a();
            if (jE2 == null) {
                return;
            }
            jg.a(jg.a(), () -> consumer.accept(jE2));
            iJ.b(runnable);
        });
    }

    private static void a(ej ej2, Runnable runnable) {
        if (ej2 != null) {
            ej2.e();
        }
        try {
            runnable.run();
        }
        finally {
            if (ej2 != null) {
                ej2.g();
                ej2.f();
            }
        }
    }

    private static jE a() {
        af af2 = af.a();
        return af2 == null ? null : af2.a();
    }
}

