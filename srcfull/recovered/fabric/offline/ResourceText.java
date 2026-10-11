/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.offline;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

final class ResourceText {
    private ResourceText() {
    }

    static String read(String path, String fallback) {
        String string;
        block8: {
            InputStream input = ResourceText.class.getResourceAsStream(path);
            try {
                String string2 = string = input == null ? fallback : new String(input.readAllBytes(), StandardCharsets.UTF_8);
                if (input == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (input != null) {
                        try {
                            input.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException error) {
                    return fallback;
                }
            }
            input.close();
        }
        return string;
    }
}

