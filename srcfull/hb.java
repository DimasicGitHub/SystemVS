/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.LambdaMetafactory;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_2960;
import net.minecraft.class_4573;

public class hb {
    private String a;
    private class_2960 b;
    private String c;

    private hb() {
    }

    public hb b(String string) {
        this.c = string;
        this.b = null;
        return this;
    }

    private static /* synthetic */ eb a(eb eb2, eb eb3) {
        return eb3;
    }

    private static /* synthetic */ eb a(float f2, float f3, kz kz2) {
        return new eb(kz2, f2, f3);
    }

    private static /* synthetic */ void a(class_1044 class_10442) {
        class_10442.method_4527(true, false);
    }

    private static /* synthetic */ void a(Map map, iY iY2) {
        if (iY2 == null) {
            return;
        }
        Float f2 = Float.valueOf(iY2.a());
        Map map2 = map.computeIfAbsent(iY2.a(), n2 -> new HashMap());
        map2.put(iY2.b(), f2);
    }

    /*
     * Unable to fully structure code
     */
    public hZ a() {
        block29: {
            if (this.a == null || this.a.isEmpty()) {
                return null;
            }
            var1_1 = cb.a();
            var2_2 = null;
            var3_3 = this.a + ".json";
            try {
                var4_4 = var1_1.a();
                if (var4_4 == null || (var5_6 = (fH)var4_4.get(var3_3)) == null || (var6_8 = var5_6.a()) == null) break block29;
                var7_10 = var6_8.method_14482();
                try {
                    if (var7_10 != null) {
                        var8_12 = new String(var7_10.readAllBytes(), StandardCharsets.UTF_8);
                        var2_2 = (jR)iS.a((String)var8_12, jR.class);
                    }
                }
                finally {
                    if (var7_10 != null) {
                        var7_10.close();
                    }
                }
            }
            catch (Exception var4_5) {
                return null;
            }
        }
        if (var2_2 == null) {
            return null;
        }
        if (var2_2.a() == null) {
            return null;
        }
        if (this.c != null) {
            try {
                var5_6 = aV.a(this.a);
                var7_10 = new ByteArrayInputStream((byte[])var5_6);
                try {
                    var6_8 = class_1011.method_4310((class_1011.class_1012)class_1011.class_1012.field_4997, (InputStream)var7_10);
                }
                finally {
                    var7_10.close();
                }
                var4_4 = new class_1043((class_1011)var6_8);
            }
            catch (IOException var5_7) {
                if (this.b != null) {
                    if (lo.aM == null) {
                        return null;
                    }
                    var4_4 = lo.aM.method_1531().method_4619(this.b);
                    if (var4_4 != null) ** GOTO lbl55
                    return null;
                }
                return null;
            }
        } else if (this.b != null) {
            if (lo.aM == null) {
                return null;
            }
            var4_4 = lo.aM.method_1531().method_4619(this.b);
            if (var4_4 == null) {
                return null;
            }
        } else {
            return null;
        }
lbl55:
        // 3 sources

        var5_6 = var4_4;
        RenderSystem.recordRenderCall((class_4573)(class_4573)LambdaMetafactory.metafactory(null, null, null, ()V, a(net.minecraft.class_1044 ), ()V)((class_1044)var5_6));
        var6_9 = var2_2.a().b();
        var7_11 = var2_2.a().c();
        var8_12 = new HashMap<K, V>();
        if (var2_2.a() != null) {
            var8_12.putAll(var2_2.a().stream().filter((Predicate<kz>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, nonNull(java.lang.Object ), (Lkz;)Z)()).collect(Collectors.toMap((Function<kz, Integer>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, a(), (Lkz;)Ljava/lang/Integer;)(), (Function<kz, eb>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, a(float float kz ), (Lkz;)Leb;)((float)var6_9, (float)var7_11), (BinaryOperator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, a(eb eb ), (Leb;Leb;)Leb;)())));
        }
        var9_17 = new HashMap<K, V>();
        if (var2_2.b() != null) {
            var2_2.b().forEach((Consumer<iY>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, a(java.util.Map iY ), (LiY;)V)(var9_17));
        }
        return new hZ((class_1044)var4_4, var2_2.a(), var2_2.a(), (Map)var8_12, var9_17);
    }

    public hb a(String string) {
        this.a = string;
        return this;
    }
}

