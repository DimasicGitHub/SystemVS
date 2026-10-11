/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.mixin.diagnostic;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import recovered.fabric.diagnostic.SystemDlcLog;

@Mixin(targets={"cN"}, remap=false)
public abstract class ClientInitializationMixin {
    @Inject(method={"onInitializeClient()V"}, at={@At(value="HEAD")}, remap=false)
    private void beforeClient(CallbackInfo callback) {
        SystemDlcLog.info("client entrypoint started");
    }

    @Inject(method={"onInitializeClient()V"}, at={@At(value="RETURN")}, remap=false)
    private void afterClient(CallbackInfo callback) {
        SystemDlcLog.info("client entrypoint completed");
    }
}

