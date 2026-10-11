/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.mixin.diagnostic;

import b.Boot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import recovered.fabric.diagnostic.SystemDlcLog;

@Mixin(targets={"li"}, remap=false)
public abstract class ClassByteSourceMixin {
    @Redirect(method={"a(Ljava/lang/String;)[B"}, at=@At(value="INVOKE", target="Lb/Boot;nativeDumpClassBytes(Ljava/lang/Class;)[B"), remap=false)
    private static byte[] validateNativeBytes(Class<?> type) {
        byte[] bytes = Boot.nativeDumpClassBytes(type);
        if (ClassByteSourceMixin.valid(bytes)) {
            return bytes;
        }
        SystemDlcLog.once("nativeClassBytes", "native class dump rejected; original fallback enabled");
        return null;
    }

    private static boolean valid(byte[] bytes) {
        return bytes != null && bytes.length >= 4 && bytes[0] == -54 && bytes[1] == -2 && bytes[2] == -70 && bytes[3] == -66;
    }
}

