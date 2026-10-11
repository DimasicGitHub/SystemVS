/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.nativebridge;

import b.Boot;
import java.nio.file.Path;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import recovered.fabric.diagnostic.SystemDlcLog;
import recovered.fabric.nativebridge.NativeLibrary;

public final class SystemDlcPreLaunch
implements PreLaunchEntrypoint {
    public void onPreLaunch() {
        boolean enabled = NativeLibrary.enabled();
        SystemDlcLog.info("preLaunch nativeEnabled=" + enabled);
        if (!enabled) {
            return;
        }
        try {
            Path library = NativeLibrary.extract().toAbsolutePath();
            SystemDlcLog.info("native extracted " + String.valueOf(library));
            System.load(library.toString());
            SystemDlcLog.info("native library loaded");
            Boot.bootstrap();
            SystemDlcLog.info("preLaunch completed");
        }
        catch (Throwable error) {
            SystemDlcLog.error("native initialization failed", error);
        }
    }
}

