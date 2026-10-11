/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.Lists;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_2596;
import net.minecraft.class_7828;

public class jp
extends aT {
    public static final /* synthetic */ CopyOnWriteArrayList<class_1657> a;
    private static final /* synthetic */ Set<UUID> b;
    public /* synthetic */ dw c;
    private final /* synthetic */ Set<UUID> d;
    private final /* synthetic */ Set<UUID> e;

    public /* synthetic */ jp() {
        super("\u0410\u043d\u0442\u0438\u0411\u043e\u0442", fV.a);
        dw dw2 = new dw("", "", false);
        dw2.setNameParts(new String[]{"\u0423", "\u0434", "a", "\u043b", "\u044f", "\u0442", "\u044c", " ", "\u0438", "\u0437", " ", "\u043c", "\u0438", "\u0440", "a"});
        dw2.setDescriptionParts(new String[]{"\u041f", "o", "\u043b", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c", "\u044e", " ", "c", "\u043a", "\u0440", "\u044b", "\u0432", "\u0430", "\u0435", "\u0442", " ", "o", "\u0431", "\u043d", "\u0430", "\u0440", "\u0443", "\u0436", "\u0435", "\u043d", "\u043d", "\u044b", "\u0445", " ", "\u0431", "o", "\u0442", "\u043e", "\u0432", "."});
        this.c = dw2;
        this.d = new HashSet<UUID>();
        this.e = new HashSet<UUID>();
        this.a(new fa[]{this.c});
    }

    static {
        a = Lists.newCopyOnWriteArrayList();
        b = new HashSet<UUID>();
    }

    @Override
    public /* bridge */ /* synthetic */ void i() {
        UUID uUID2;
        if (this.a() == null) {
            return;
        }
        List list = this.a().method_18456();
        Set<UUID> set = this.d;
        set.clear();
        class_1657 class_16573 = this.b();
        for (Object object : list) {
            set.add(object.method_5667());
        }
        a.removeIf(class_16572 -> !set.contains(class_16572.method_5667()));
        b.removeIf(uUID -> !set.contains(uUID));
        for (Object object : list) {
            boolean bl2;
            if (object == class_16573) continue;
            String string = object.method_5477().getString();
            uUID2 = UUID.nameUUIDFromBytes(("OfflinePlayer:" + string).getBytes());
            boolean bl3 = !object.method_5667().equals(uUID2);
            boolean bl4 = bl2 = !string.contains("NPC") && !string.startsWith("[ZNPC]");
            if (!bl3 || !bl2) continue;
            b.add(object.method_5667());
        }
        Set<UUID> set2 = this.e;
        set2.clear();
        for (class_1657 class_16574 : a) {
            set2.add(class_16574.method_5667());
        }
        for (class_1657 class_16575 : list) {
            uUID2 = class_16575.method_5667();
            if (!b.contains(uUID2) || set2.contains(uUID2)) continue;
            a.add(class_16575);
        }
        a.removeIf(class_16572 -> !b.contains(class_16572.method_5667()));
        if (this.c.a()) {
            for (class_1657 class_16576 : a) {
                this.a().method_2945(class_16576.method_5628(), class_1297.class_5529.field_26999);
            }
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.a();
    }

    private /* bridge */ /* synthetic */ void a() {
        a.clear();
        b.clear();
    }

    @Override
    public /* bridge */ /* synthetic */ void a(lx lx2) {
        if (lx2.a() != iG.b) {
            return;
        }
        class_2596 class_25962 = lx2.a();
        if (class_25962 instanceof class_7828) {
            List list;
            class_7828 class_78282 = (class_7828)class_25962;
            try {
                List list2 = class_78282.comp_1105();
                list = list2;
            }
            catch (Throwable throwable) {
                throw new MatchException(throwable.toString(), throwable);
            }
            for (UUID uUID : list) {
                b.remove(uUID);
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean a(class_1309 class_13092) {
        if (class_13092 instanceof class_1657) {
            class_1657 class_16572 = (class_1657)class_13092;
            return a.contains(class_16572) || b.contains(class_16572.method_5667());
        }
        return false;
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.a();
    }
}

