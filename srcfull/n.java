/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.UUID;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1937;
import net.minecraft.class_2487;
import net.minecraft.class_2509;
import net.minecraft.class_2520;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_332;
import net.minecraft.class_5455;
import net.minecraft.class_9296;
import net.minecraft.class_9326;
import net.minecraft.class_9334;
import net.minecraft.class_9801;
import org.joml.Matrix4f;

public class n
extends aT {
    private final /* synthetic */ gA a;
    private final /* synthetic */ gA b;
    private final /* synthetic */ gA[] c;
    private /* synthetic */ class_1937 d;
    private /* synthetic */ gA e;
    private /* synthetic */ boolean f;
    private /* synthetic */ boolean g;

    public /* synthetic */ n() {
        super("\u0417\u0448\u0430\u043f\u0428\u0445\u0435\u0435\u043b", fV.c);
        this.a = new gA(this, "\u0441\u0432\u0430\u043f\u0430", "\u041a\u043b\u0430\u0432\u0438\u0448\u0430 \u043a\u043e\u043b\u0435\u0441\u0430", "\u042f\u0447\u0435\u0439\u043a\u0438", "wheelSlots", "cellBind", "\u041a\u043e\u043b-\u0432\u043e \u044f\u0447\u0435\u0435\u043a");
        this.b = new gA(this, "\u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u044f", "\u041a\u043b\u0430\u0432\u0438\u0448\u0430 \u043a\u043e\u043b\u0435\u0441\u0430 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u044f", "\u042f\u0447\u0435\u0439\u043a\u0438 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u044f", "useWheelSlots", "useCellBind", "\u041a\u043e\u043b-\u0432\u043e \u044f\u0447\u0435\u0435\u043a \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u044f");
        this.c = new gA[]{this.a, this.b};
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.a.a();
        this.b.a();
    }

    private /* bridge */ /* synthetic */ void b(int n2) {
        Runnable runnable = this.a();
        int n3 = this.a().field_7545;
        if (bw.a(n2)) {
            Runnable runnable2 = runnable;
            int n4 = n3;
            int n5 = n2 - 36;
            n n6 = this;
            y.a(n5, n4, runnable2, n6);
        } else {
            Runnable runnable3 = runnable;
            int n7 = n2;
            n n8 = this;
            y.a(runnable3, (aT)n8, n7);
        }
    }

    private /* bridge */ /* synthetic */ void b(gA gA2) {
        this.e = gA2;
        if (this.a().field_1729 != null && !this.f) {
            this.a().field_1729.method_1610();
            this.f = true;
        }
    }

    private /* bridge */ /* synthetic */ void b() {
        this.e = null;
        if (this.f && this.a().field_1729 != null) {
            if (this.a() == null) {
                this.a().field_1729.method_1612();
            }
            this.f = false;
        }
    }

    private /* bridge */ /* synthetic */ boolean b(class_1799 class_17992, class_1799 class_17993) {
        class_9296 class_92962 = (class_9296)class_17993.method_57824(class_9334.field_49617);
        class_9296 class_92963 = (class_9296)class_17992.method_57824(class_9334.field_49617);
        if (class_92962 == null && class_92963 == null) {
            return true;
        }
        if (class_92962 == null || class_92963 == null) {
            return false;
        }
        String string = class_92962.comp_2410().orElse(null);
        String string2 = class_92963.comp_2410().orElse(null);
        if (string != null && string.equalsIgnoreCase(string2)) {
            return true;
        }
        UUID uUID = class_92962.comp_2411().orElse(null);
        UUID uUID2 = class_92963.comp_2411().orElse(null);
        return uUID != null && uUID.equals(uUID2);
    }

    private /* bridge */ /* synthetic */ void c() {
        this.g = false;
        y.b(this);
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.b();
        this.c();
    }

    public static /* bridge */ /* synthetic */ void a(int n2, float f2, int n3, int n4, float f3, int n5, float f4, float f5, class_287 class_2872, float f6, float f7, Matrix4f matrix4f) {
        int n6 = Math.max(6, (int)(48.0f * (Math.abs(f4 - f5) / ((float)Math.PI * 2))));
        float f8 = (f4 - f5) / (float)n6;
        for (int i2 = 0; i2 < n6; ++i2) {
            float f9 = f5 + f8 * (float)i2;
            float f10 = f5 + f8 * (float)(i2 + 1);
            float f11 = f6 + (float)Math.cos(f9) * f3;
            float f12 = f7 + (float)Math.sin(f9) * f3;
            float f13 = f6 + (float)Math.cos(f10) * f3;
            float f14 = f7 + (float)Math.sin(f10) * f3;
            float f15 = f6 + (float)Math.cos(f9) * f2;
            float f16 = f7 + (float)Math.sin(f9) * f2;
            float f17 = f6 + (float)Math.cos(f10) * f2;
            float f18 = f7 + (float)Math.sin(f10) * f2;
            class_2872.method_22918(matrix4f, f15, f16, 0.0f).method_1336(n4, n5, n2, n3);
            class_2872.method_22918(matrix4f, f11, f12, 0.0f).method_1336(n4, n5, n2, n3);
            class_2872.method_22918(matrix4f, f13, f14, 0.0f).method_1336(n4, n5, n2, n3);
            class_2872.method_22918(matrix4f, f15, f16, 0.0f).method_1336(n4, n5, n2, n3);
            class_2872.method_22918(matrix4f, f13, f14, 0.0f).method_1336(n4, n5, n2, n3);
            class_2872.method_22918(matrix4f, f17, f18, 0.0f).method_1336(n4, n5, n2, n3);
        }
    }

    private /* bridge */ /* synthetic */ void a(class_332 class_3322, gA gA2) {
        float f2;
        float f3;
        int n2;
        int n3 = gA2.slotCapacity();
        float f4 = (float)this.a().method_22683().method_4486() / 2.0f;
        float f5 = (float)this.a().method_22683().method_4502() / 2.0f;
        float f6 = 92.0f;
        float f7 = Math.max(20.0f, f6 - 38.0f);
        float f8 = (float)(this.a().field_1729.method_1603() * (double)this.a().method_22683().method_4486() / (double)this.a().method_22683().method_4480());
        float f9 = (float)(this.a().field_1729.method_1604() * (double)this.a().method_22683().method_4502() / (double)this.a().method_22683().method_4507());
        int n4 = n3;
        float f10 = Float.POSITIVE_INFINITY;
        float f11 = 12.0f;
        float f12 = f5;
        float f13 = f4;
        float f14 = f9;
        float f15 = f8;
        int n5 = n.a(n4, f12, f13, f15, f10, f14, f11);
        RenderSystem.enableBlend();
        RenderSystem.disableCull();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA);
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        Matrix4f matrix4f = class_3322.method_51448().method_23760().method_23761();
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27379, class_290.field_1576);
        for (n2 = 0; n2 < n3; ++n2) {
            int n6 = n2 == n5 ? -587214545 : -1441195751;
            int n7 = n6 >>> 24 & 0xFF;
            int n8 = n6 >> 16 & 0xFF;
            int n9 = n6 >> 8 & 0xFF;
            int n10 = n6 & 0xFF;
            f3 = (float)(-1.5707963267948966 + Math.PI * 2 * ((double)n2 / (double)n3));
            f2 = (float)(-1.5707963267948966 + Math.PI * 2 * (((double)n2 + 1.0) / (double)n3));
            int n11 = n7;
            int n12 = n10;
            int n13 = n9;
            int n14 = n8;
            float f16 = f2;
            float f17 = f3;
            float f18 = f6;
            float f19 = f7;
            float f20 = f5;
            float f21 = f4;
            Matrix4f matrix4f2 = matrix4f;
            class_287 class_2875 = class_2872;
            n.a(n12, f19, n11, n14, f18, n13, f16, f17, class_2875, f21, f20, matrix4f2);
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.enableCull();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
        for (n2 = 0; n2 < n3; ++n2) {
            class_1799 class_17992 = gA2.a[n2];
            if (class_17992 == null || class_17992.method_7960()) continue;
            float f22 = (float)(-1.5707963267948966 + Math.PI * 2 * ((double)n2 / (double)n3));
            float f23 = (float)(-1.5707963267948966 + Math.PI * 2 * (((double)n2 + 1.0) / (double)n3));
            float f24 = (f22 + f23) / 2.0f;
            float f25 = (f7 + f6) / 2.0f;
            f3 = f4 + (float)Math.cos(f24) * f25;
            f2 = f5 + (float)Math.sin(f24) * f25;
            float f26 = 1.0f;
            float f27 = 16.0f;
            float f28 = f2 - 8.0f;
            float f29 = f3 - 8.0f;
            class_1799 class_17993 = class_17992;
            class_332 class_3323 = class_3322;
            ir.a(f27, class_17993, f26, f28, f29, class_3323);
        }
    }

    private static /* bridge */ /* synthetic */ int a(int n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        int n3;
        float f8 = f4 - f3;
        float f9 = f6 - f2;
        float f10 = (float)Math.sqrt(f8 * f8 + f9 * f9);
        if (f10 < f7 || f10 > f5) {
            return -1;
        }
        double d2 = Math.atan2(f9, f8) + 1.5707963267948966;
        if (d2 < 0.0) {
            d2 += Math.PI * 2;
        }
        if ((n3 = (int)Math.floor(d2 / (Math.PI * 2) * (double)n2)) < 0 || n3 >= n2) {
            return -1;
        }
        return n3;
    }

    private /* bridge */ /* synthetic */ int a(gA gA2) {
        int n2 = gA2.slotCapacity();
        float f2 = (float)this.a().method_22683().method_4486() / 2.0f;
        float f3 = (float)this.a().method_22683().method_4502() / 2.0f;
        float f4 = (float)(this.a().field_1729.method_1603() * (double)this.a().method_22683().method_4486() / (double)this.a().method_22683().method_4480());
        float f5 = (float)(this.a().field_1729.method_1604() * (double)this.a().method_22683().method_4502() / (double)this.a().method_22683().method_4507());
        int n3 = n2;
        float f6 = Float.POSITIVE_INFINITY;
        float f7 = 12.0f;
        float f8 = f3;
        float f9 = f2;
        float f10 = f5;
        float f11 = f4;
        return n.a(n3, f8, f9, f11, f6, f10, f7);
    }

    private /* bridge */ /* synthetic */ boolean a(class_1799 class_17992, class_1799 class_17993) {
        if (class_17992 == null || class_17993 == null || class_17992.method_7960() || class_17993.method_7960()) {
            return false;
        }
        if (class_17992.method_7909() != class_17993.method_7909()) {
            return false;
        }
        if (class_17992.method_7909() == class_1802.field_8575) {
            class_1799 class_17994;
            class_1799 class_17995;
            return class_17992.method_7964().getString().equalsIgnoreCase(class_17993.method_7964().getString()) && this.b(class_17995 = class_17993, class_17994 = class_17992);
        }
        return class_17992.method_57380().equals((Object)class_17993.method_57380());
    }

    private /* bridge */ /* synthetic */ void a(gA gA2, boolean bl2) {
        int n2 = gA2.slotCapacity();
        for (int i2 = 0; i2 < 6; ++i2) {
            boolean bl3;
            kn kn2 = gA2.b[i2];
            boolean bl4 = bl3 = kn2.a() != -1 && kn2.a();
            if (bl3 && !gA2.c[i2] && bl2 && i2 < n2) {
                int n3 = i2;
                gA gA3 = gA2;
                this.a(n3, gA3);
            }
            gA2.c[i2] = bl3;
        }
    }

    private /* bridge */ /* synthetic */ void a(int n2, gA gA2) {
        if (n2 < 0 || n2 >= 6) {
            return;
        }
        class_1799 class_17992 = gA2.a[n2];
        if (class_17992 == null || class_17992.method_7960()) {
            return;
        }
        if (this.g) {
            return;
        }
        class_1735 class_17352 = this.a(class_17992);
        if (class_17352 != null) {
            if (gA2 == this.b) {
                this.b(class_17352.field_7874);
            } else {
                this.a(class_17352.field_7874);
            }
            return;
        }
        if (gA2 == this.b) {
            this.a(class_17992);
        }
    }

    private /* bridge */ /* synthetic */ void a(class_1799 class_17992, class_2487 class_24872) {
        class_5455 class_54552;
        class_5455 class_54553 = class_54552 = this.a() != null ? this.a().method_30349() : null;
        if (class_54552 == null || class_24872 == null) {
            return;
        }
        try {
            Codec codec = class_9326.field_49589;
            DataResult dataResult = codec.parse((DynamicOps)class_54552.method_57093((DynamicOps)class_2509.field_11560), (Object)class_24872);
            dataResult.result().ifPresent(arg_0 -> ((class_1799)class_17992).method_59692(arg_0));
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private /* bridge */ /* synthetic */ class_2487 a(class_1799 class_17992) {
        class_5455 class_54552;
        class_5455 class_54553 = class_54552 = this.a() != null ? this.a().method_30349() : null;
        if (class_54552 == null) {
            return null;
        }
        try {
            class_2487 class_24872;
            Codec codec = class_9326.field_49589;
            DataResult dataResult = codec.encodeStart((DynamicOps)class_54552.method_57093((DynamicOps)class_2509.field_11560), (Object)class_17992.method_57380());
            Optional optional = dataResult.result();
            if (optional.isEmpty()) {
                return null;
            }
            class_2520 class_25202 = (class_2520)optional.get();
            return class_25202 instanceof class_2487 ? (class_24872 = (class_2487)class_25202) : null;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private /* bridge */ /* synthetic */ void a() {
        if (this.e == null) {
            return;
        }
        int n2 = this.a(this.e);
        if (n2 < 0 || n2 >= this.e.slotCapacity()) {
            return;
        }
        int n3 = n2;
        gA gA2 = this.e;
        this.a(n3, gA2);
    }

    @Override
    public /* bridge */ /* synthetic */ void a(aS aS2) {
        if (this.e == null) {
            return;
        }
        if (aS2.b() != 1) {
            return;
        }
        if (aS2.a() == 0) {
            this.a();
            this.b();
            aS2.a(true);
        } else if (aS2.a() == 1) {
            this.b();
            aS2.a(true);
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void a(jG jG2) {
        if (this.e == null) {
            return;
        }
        this.a(jG2.a(), this.e);
    }

    private /* bridge */ /* synthetic */ void a(class_1799 class_17992) {
        cM cM2 = bw.a(class_17993 -> this.a(class_17992, (class_1799)class_17993));
        if (cM2 == null) {
            return;
        }
        Runnable runnable = this.a();
        int n2 = this.a().field_7545;
        int n3 = cM2.a();
        int n4 = cM2.a().field_7874;
        n n5 = this;
        y.a((aT)n5, n2, n4, runnable, n3);
    }

    private /* bridge */ /* synthetic */ void a(gA gA2) {
        boolean bl2;
        boolean bl3 = bl2 = gA2.d.a() != -1 && gA2.d.a();
        if (bl2 && !gA2.i) {
            if (this.a() == null && this.e == null) {
                this.b(gA2);
            }
        } else if (!bl2 && gA2.i && this.e == gA2) {
            this.a();
            this.b();
        }
        gA2.i = bl2;
    }

    private /* bridge */ /* synthetic */ class_1735 a(class_1799 class_17992) {
        if (this.b() == null || this.b().field_7512 == null) {
            return null;
        }
        for (class_1735 class_17352 : this.b().field_7512.field_7761) {
            if (class_17352.field_7874 < 9 || class_17352.field_7874 > 35 || !this.a(class_17992, class_17352.method_7677())) continue;
            return class_17352;
        }
        for (class_1735 class_17352 : this.b().field_7512.field_7761) {
            if (class_17352.field_7874 < 36 || class_17352.field_7874 > 44 || !this.a(class_17992, class_17352.method_7677())) continue;
            return class_17352;
        }
        return null;
    }

    private /* bridge */ /* synthetic */ void a(int n2) {
        y.a(this, n2, this.a());
    }

    private /* bridge */ /* synthetic */ Runnable a() {
        this.g = true;
        return () -> {
            this.g = false;
        };
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        for (gA gA2 : this.c) {
            gA2.b();
            gA2.e();
            gA2.c();
        }
        this.e = null;
        this.c();
    }

    @Override
    public /* bridge */ /* synthetic */ void j() {
        class_1937 class_19372 = this.a();
        boolean bl2 = class_19372 != this.d;
        this.d = class_19372;
        for (gA gA2 : this.c) {
            if (bl2) {
                gA2.b();
            }
            if (class_19372 != null && gA2.j) {
                gA2.e();
            }
            this.a(gA2);
        }
        if (this.e != null && this.a() != null) {
            this.b();
        }
        boolean bl3 = this.a() == null;
        for (gA gA3 : this.c) {
            this.a(gA3, bl3);
        }
    }
}

