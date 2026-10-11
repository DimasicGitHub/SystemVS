/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.nativebridge;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Locale;

final class NativeLibrary {
    private NativeLibrary() {
    }

    static boolean enabled() {
        String osName = System.getProperty("os.name", "").toLowerCase(Locale.ROOT);
        return osName.contains("windows") && Boolean.parseBoolean(System.getProperty("systemdlc.native", "true"));
    }

    static Path extract() throws IOException {
        String resource = "/native/windows-x86_64/systemdlc.dll";
        try (InputStream input = NativeLibrary.class.getResourceAsStream(resource);){
            if (input == null) {
                throw new IOException("Native library resource is missing");
            }
            Path directory = Files.createTempDirectory("systemdlc-native-", new FileAttribute[0]);
            Path library = directory.resolve("systemdlc.dll");
            Files.copy(input, library, StandardCopyOption.REPLACE_EXISTING);
            directory.toFile().deleteOnExit();
            library.toFile().deleteOnExit();
            Path path = library;
            return path;
        }
    }
}

