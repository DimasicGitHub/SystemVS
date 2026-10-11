/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_745;

public class hi
extends aT {
    private /* synthetic */ class_745 a;

    public /* synthetic */ hi() {
        super("\u0424\u0430\u043a\u0435\u041f\u043b\u0430\u0439\u0435\u0440", fV.e);
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        if (this.y() && this.a != null) {
            this.a().method_2945(this.a.method_5628(), class_1297.class_5529.field_26998);
            this.a = null;
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void l() {
        this.a(false);
    }

    @Override
    public /* bridge */ /* synthetic */ void m() {
        this.a(false);
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        if (this.y()) {
            this.a = new class_745(this.a(), new GameProfile(UUID.randomUUID(), "S\u0443stem"));
            this.a.method_33574(this.b().method_19538());
            this.a.method_36456(this.b().method_36454());
            this.a.method_36457(this.b().method_36455());
            this.a.field_6283 = this.b().field_6283;
            this.a.field_6241 = this.b().field_6241;
            for (class_1304 class_13042 : class_1304.values()) {
                this.a.method_5673(class_13042, this.b().method_6118(class_13042).method_7972());
            }
            this.a().method_53875((class_1297)this.a);
        }
    }
}

