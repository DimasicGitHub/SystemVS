/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class km {
    private final Map<String, aT> a = new ConcurrentHashMap<String, aT>();
    private final Map<fV, List<aT>> b = new ConcurrentHashMap<fV, List<aT>>();
    private final Map<Class<? extends aT>, aT> c = new ConcurrentHashMap<Class<? extends aT>, aT>();
    private final List<aT> d = new ArrayList<aT>();
    private Set<Integer> e = new HashSet<Integer>();
    private volatile List<aT> f = Collections.emptyList();
    private volatile List<aT> g = Collections.emptyList();
    private volatile long h = 0L;

    public List e() {
        return this.f;
    }

    public void e() {
        this.a.values().forEach(aT2 -> aT2.a(false));
    }

    public List b() {
        return this.f;
    }

    public void b() {
        ArrayList<aT> arrayList = new ArrayList<aT>();
        for (aT aT2 : this.a.values()) {
            if (!aT2.f()) continue;
            arrayList.add(aT2);
        }
        this.f = Collections.unmodifiableList(arrayList);
        ++this.h;
        bH.a().a();
    }

    public Map b() {
        return this.b;
    }

    public int b() {
        return this.f.size();
    }

    public List c() {
        return new ArrayList<String>(this.a.keySet());
    }

    public Map c() {
        return this.c;
    }

    private void c() {
        this.g = List.copyOf(this.d);
        this.b();
    }

    public void h() {
        this.a.values().forEach(aT2 -> {
            if (aT2.f()) {
                aT2.a(false);
            }
        });
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.c();
    }

    public List f() {
        return this.g;
    }

    public void f() {
        this.a.values().forEach(aT::f);
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.c();
    }

    public List d() {
        return this.d;
    }

    public void d() {
        this.a.values().forEach(aT2 -> aT2.a(true));
    }

    public long a() {
        return this.h;
    }

    public Set a() {
        return this.e;
    }

    public Map a() {
        HashMap hashMap = new HashMap();
        this.b.forEach((fV2, list) -> {
            List list2 = list;
            synchronized (list2) {
                hashMap.put(fV2, new ArrayList(list));
            }
        });
        return hashMap;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public List a(fV fV2) {
        List<aT> list = this.b.get((Object)fV2);
        if (list == null) {
            return new ArrayList();
        }
        List<aT> list2 = list;
        synchronized (list2) {
            return new ArrayList<aT>(list);
        }
    }

    public List a() {
        return this.g;
    }

    public aT a(Class clazz) {
        aT aT2 = this.c.get(clazz);
        if (aT2 != null) {
            return aT2;
        }
        for (aT aT3 : this.a.values()) {
            if (!clazz.isInstance(aT3)) continue;
            this.c.put(clazz, aT3);
            return (aT)clazz.cast(aT3);
        }
        return null;
    }

    public aT a(String string) {
        return this.a.get(string);
    }

    public void a(String string) {
        aT aT2 = this.a.remove(string);
        if (aT2 != null) {
            this.d.remove(aT2);
            this.c.remove(aT2.getClass());
            this.b.computeIfPresent(aT2.a(), (fV2, list) -> {
                List list2 = list;
                synchronized (list2) {
                    list.remove(aT2);
                    return list.isEmpty() ? null : list;
                }
            });
            this.c();
        }
    }

    public void a(Set set) {
        this.e = set;
    }

    private void a(aT aT2) {
        if (aT2 == null) {
            return;
        }
        String string = aT2.b();
        if (this.a.containsKey(string)) {
            return;
        }
        this.a.put(string, aT2);
        this.c.put(aT2.getClass(), aT2);
        this.b.computeIfAbsent(aT2.a(), fV2 -> new ArrayList()).add(aT2);
        this.d.add(aT2);
        this.c();
    }

    public void a() {
        Set set = az.a();
        if (!set.isEmpty()) {
            this.a(set);
        }
        List list = this.e.isEmpty() ? lk.a() : lk.a(this.e);
        for (aT aT2 : list) {
            this.a(aT2);
        }
        try {
            af.a().a().b();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public boolean a(String string) {
        return this.a.containsKey(string);
    }

    public int a() {
        return this.a.size();
    }

    public void g() {
        this.a.values().forEach(aT::e);
    }
}

