/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class cf {
    private static String a = "GZ:";
    private static int b = 8192;

    public static String b(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        if (!string.startsWith(a)) {
            return string;
        }
        try {
            byte[] byArray = Base64.getDecoder().decode(string.substring(a.length()));
            return cf.a(byArray);
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static String a(byte[] byArray) throws Exception {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(byArray.length * 3);
        try (GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);){
            int n2;
            byte[] byArray2 = new byte[b];
            while ((n2 = gZIPInputStream.read(byArray2)) != -1) {
                byteArrayOutputStream.write(byArray2, 0, n2);
            }
        }
        return byteArrayOutputStream.toString(StandardCharsets.UTF_8);
    }

    public static String a(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        try {
            byte[] byArray = string.getBytes(StandardCharsets.UTF_8);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(byArray.length / 2);
            try (GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);){
                gZIPOutputStream.write(byArray);
            }
            return a + Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
        }
        catch (Exception exception) {
            return null;
        }
    }
}

