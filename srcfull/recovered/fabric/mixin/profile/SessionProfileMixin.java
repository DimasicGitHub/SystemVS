/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.mixin.profile;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import recovered.fabric.identity.ProfileIdentity;

@Mixin(targets={"lm"}, remap=false)
public abstract class SessionProfileMixin {
    @Inject(method={"a()Ljava/lang/String;"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private static void replaceUsername(CallbackInfoReturnable<String> callback) {
        callback.setReturnValue((Object)ProfileIdentity.username());
    }
}

