/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.mixin.diagnostic;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Coerce;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import recovered.fabric.diagnostic.SystemDlcLog;

@Mixin(targets={"km"}, remap=false)
public abstract class ModuleRegistryMixin {
    @Inject(method={"a()V"}, at={@At(value="HEAD")}, remap=false)
    private void beforeModules(CallbackInfo callback) {
        SystemDlcLog.moduleScanStarted();
    }

    @Inject(method={"a(LaT;)V"}, at={@At(value="TAIL")}, remap=false)
    private void afterModule(@Coerce Object module, CallbackInfo callback) {
        SystemDlcLog.moduleRegistered(module);
    }

    @Inject(method={"a()V"}, at={@At(value="RETURN")}, remap=false)
    private void afterModules(CallbackInfo callback) {
        SystemDlcLog.moduleScanFinished();
    }
}

