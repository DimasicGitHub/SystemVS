/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.util.concurrent.ConcurrentHashMap;

class go
extends ClassValue<ConcurrentHashMap<String, MethodHandle>> {
    go() {
    }

    protected ConcurrentHashMap a(Class clazz) {
        return new ConcurrentHashMap();
    }

    @Override
    protected /* bridge */ /* synthetic */ Object computeValue(Class clazz) {
        return this.a(clazz);
    }
}

