/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.mixin.diagnostic;

import java.lang.reflect.InvocationTargetException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import recovered.fabric.diagnostic.SystemDlcLog;

@Mixin(targets={"net.minecraft.class_310"}, remap=false)
public abstract class LateInitializationMixin {
    private static boolean attempted;

    @Inject(method={"method_1514()V"}, at={@At(value="HEAD")}, remap=false)
    private void initializeOriginalClient(CallbackInfo callback) {
        if (attempted) {
            return;
        }
        attempted = true;
        try {
            Object entrypoint = Class.forName("cN").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            entrypoint.getClass().getMethod("onInitializeClient", new Class[0]).invoke(entrypoint, new Object[0]);
            SystemDlcLog.info("original client initialized after GLFW");
        }
        catch (Throwable error) {
            SystemDlcLog.error("late client initialization failed", LateInitializationMixin.root(error));
        }
    }

    private static Throwable root(Throwable error) {
        InvocationTargetException invocation;
        if (error instanceof InvocationTargetException && (invocation = (InvocationTargetException)error).getCause() != null) {
            return invocation.getCause();
        }
        return error;
    }
}

