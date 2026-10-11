/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ey<T extends el> {
    private static final float a = 0.001f;
    private final LinkedHashMap<Object, T> b = new LinkedHashMap();
    private final HashSet<Object> c = new HashSet();
    private final float d;
    private final im e = new im();
    private long f = -1L;
    private boolean g;

    public ey(float f2) {
        this.d = f2;
    }

    private float b(ToDoubleFunction toDoubleFunction) {
        float f2 = 0.0f;
        boolean bl2 = true;
        for (el el2 : this.b.values()) {
            float f3 = el2.animation().a();
            if (!bl2) {
                f2 += this.d * f3;
            }
            bl2 = false;
            f2 += (float)toDoubleFunction.applyAsDouble(el2) * f3;
        }
        return f2;
    }

    public void b() {
        this.g = true;
    }

    private void b(float f2, ToDoubleFunction toDoubleFunction) {
        float f3 = f2;
        boolean bl2 = true;
        for (el el2 : this.b.values()) {
            float f4 = el2.animation().a();
            if (!bl2) {
                f3 += this.d * f4;
            }
            bl2 = false;
            el2.animation().a(f3);
            f3 += (float)toDoubleFunction.applyAsDouble(el2) * f4;
        }
    }

    public boolean b() {
        for (el el2 : this.b.values()) {
            if (!(el2.animation().b() > 0.001f)) continue;
            return true;
        }
        return false;
    }

    public void a(float f2, ToDoubleFunction toDoubleFunction) {
        this.b(f2, toDoubleFunction);
    }

    public void a(float f2) {
        this.b(f2, el::itemHeight);
        if (this.g) {
            for (el el2 : this.b.values()) {
                jf jf2 = el2.animation();
                jf2.b(jf2.d());
            }
            this.g = false;
        }
    }

    public boolean a() {
        return this.b.isEmpty();
    }

    private Set a(List list) {
        this.c.clear();
        this.c.addAll(list);
        return this.c;
    }

    public float a(ToDoubleFunction toDoubleFunction) {
        return this.b(toDoubleFunction);
    }

    public float a() {
        return this.b(el::itemHeight);
    }

    public Collection a() {
        return this.b.values();
    }

    private static void a(boolean bl2, jf jf2, int n2, float f2) {
        if (f2 > 0.0f) {
            float f3 = (float)n2 * f2;
            boolean bl3 = bl2;
            jf2.a(f3, bl3);
        } else {
            jf2.a(bl2);
        }
    }

    public void a(float f2, List list, Function function) {
        Object object;
        Set set = this.a(list);
        int n2 = 0;
        for (Object object2 : list) {
            el object3 = (el)this.b.get(object2);
            if (object3 != null) {
                object3.animation().a(true);
                continue;
            }
            object = (el)function.apply(object2);
            if (object == null) continue;
            float f3 = f2;
            int n3 = n2++;
            boolean bl2 = true;
            jf jf2 = object.animation();
            ey.a(bl2, jf2, n3, f3);
            this.b.put(object2, object);
        }
        int n4 = 0;
        for (Map.Entry entry : this.b.entrySet()) {
            if (set.contains(entry.getKey()) || !((jf)(object = ((el)entry.getValue()).animation())).b()) continue;
            float f4 = f2;
            int n5 = n4++;
            boolean bl3 = false;
            Object object2 = object;
            ey.a(bl3, (jf)object2, n5, f4);
        }
    }

    public void a(List list, Function function) {
        float f2 = 0.0f;
        Function function2 = function;
        List list2 = list;
        this.a(f2, list2, function2);
    }

    public boolean a(long l2) {
        if (this.f == l2) {
            return false;
        }
        this.f = l2;
        return true;
    }

    public void a(List list) {
        List list2;
        Set set = this.a(list);
        Set set2 = set;
        if (this.a(set2, list2 = list)) {
            return;
        }
        LinkedHashMap<Object, el> linkedHashMap = new LinkedHashMap<Object, el>(this.b.size());
        Iterator iterator = list.iterator();
        block0: for (Map.Entry<Object, T> object : this.b.entrySet()) {
            Object object2 = object.getKey();
            if (!set.contains(object2)) {
                linkedHashMap.put(object2, (el)object.getValue());
                continue;
            }
            while (iterator.hasNext()) {
                Object e2 = iterator.next();
                el el2 = (el)this.b.get(e2);
                if (el2 == null) continue;
                linkedHashMap.put(e2, el2);
                if (!e2.equals(object2)) continue;
                continue block0;
            }
        }
        while (iterator.hasNext()) {
            Iterator<Map.Entry<Object, Object>> iterator2 = iterator.next();
            el el3 = (el)this.b.get(iterator2);
            if (el3 == null) continue;
            linkedHashMap.putIfAbsent(iterator2, el3);
        }
        this.b.clear();
        this.b.putAll(linkedHashMap);
    }

    private boolean a(Set set, List list) {
        int n2 = 0;
        for (Object object : this.b.keySet()) {
            if (!set.contains(object)) continue;
            if (n2 >= list.size() || !object.equals(list.get(n2))) {
                return false;
            }
            ++n2;
        }
        return n2 == list.size();
    }

    public void a() {
        float f2 = this.e.a();
        Iterator<Map.Entry<Object, T>> iterator = this.b.entrySet().iterator();
        while (iterator.hasNext()) {
            jf jf2 = ((el)iterator.next().getValue()).animation();
            jf2.c(f2);
            if (jf2.b() || !jf2.a()) continue;
            iterator.remove();
        }
    }
}

