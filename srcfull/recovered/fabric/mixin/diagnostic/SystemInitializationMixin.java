/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.mixin.diagnostic;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import recovered.fabric.assets.AssetInitializationBridge;
import recovered.fabric.diagnostic.SystemDlcLog;
import recovered.fabric.nativebridge.OriginalHookStatus;
import recovered.fabric.offline.OfflineStateBridge;

@Mixin(targets={"af"}, remap=false)
public abstract class SystemInitializationMixin {
    @Inject(method={"a()V"}, at={@At(value="HEAD")}, remap=false)
    private void beforeAuthorization(CallbackInfo callback) {
        SystemDlcLog.info("authorization started");
    }

    @Inject(method={"a()V"}, at={@At(value="RETURN")}, remap=false)
    private void afterAuthorization(CallbackInfo callback) {
        SystemDlcLog.info("authorization completed");
    }

    @Inject(method={"b()V"}, at={@At(value="HEAD")}, remap=false)
    private void beforeSystems(CallbackInfo callback) {
        SystemDlcLog.info("system initialization started");
    }

    @Inject(method={"b()V"}, at={@At(value="RETURN")}, remap=false)
    private void afterSystems(CallbackInfo callback) {
        OriginalHookStatus.report();
        AssetInitializationBridge.initialize();
        OfflineStateBridge.initialize();
        SystemDlcLog.info("system initialization completed");
    }
}

