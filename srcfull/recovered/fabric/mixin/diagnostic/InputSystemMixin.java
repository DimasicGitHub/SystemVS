/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.mixin.diagnostic;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import recovered.fabric.diagnostic.SystemDlcLog;

@Mixin(targets={"bH"}, remap=false)
public abstract class InputSystemMixin {
    @Inject(method={"c()V"}, at={@At(value="HEAD")}, remap=false)
    private void beforeInput(CallbackInfo callback) {
        SystemDlcLog.info("input system start requested");
    }

    @Inject(method={"c()V"}, at={@At(value="RETURN")}, remap=false)
    private void afterInput(CallbackInfo callback) {
        SystemDlcLog.info("input system returned; recovered bH.c contains no polling code");
    }
}

