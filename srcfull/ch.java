/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_2960;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ch {
    private static final Map<String, byte[]> a = new HashMap<String, byte[]>();
    public static final class_2960 b = class_2960.method_60655((String)"minecraft", (String)"textures/arrow.png");
    public static final class_2960 c = class_2960.method_60655((String)"minecraft", (String)"textures/arrow_3d.png");

    static {
        ch.b();
    }

    public static byte[] b() {
        return a.get("arrow_3d");
    }

    private static void b() {
        String[] stringArray;
        String[] stringArray2 = stringArray = ka.a();
        int n2 = stringArray2.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string;
            String string2 = string = stringArray2[i2];
            String string3 = string;
            ch.a(string2, string3);
        }
    }

    public static boolean a(String string) {
        return a.containsKey(string);
    }

    public static byte[] a() {
        return a.get("arrow");
    }

    private static void a(byte[] byArray, String string, class_2960 class_29602) {
        if (!ch.a(string) || byArray == null || byArray.length == 0) {
            return;
        }
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);){
            BufferedImage bufferedImage = ImageIO.read(byteArrayInputStream);
            if (bufferedImage == null) {
                return;
            }
            int n2 = bufferedImage.getWidth();
            int n3 = bufferedImage.getHeight();
            class_1011 class_10112 = new class_1011(n2, n3, false);
            for (int i2 = 0; i2 < n2; ++i2) {
                for (int i3 = 0; i3 < n3; ++i3) {
                    class_10112.method_61941(i2, i3, bufferedImage.getRGB(i2, i3));
                }
            }
            class_1043 class_10432 = new class_1043(class_10112);
            lo.aM.method_1531().method_4616(class_29602, (class_1044)class_10432);
        }
        catch (Exception exception) {
            System.out.println("Failed to register - " + String.valueOf(class_29602));
        }
    }

    public static void a() {
        if (lo.aM == null) {
            return;
        }
        lo.aM.execute(() -> {
            byte[] byArray = ch.a();
            class_2960 class_29602 = b;
            String string = "arrow";
            ch.a(byArray, string, class_29602);
            byte[] byArray2 = ch.b();
            class_2960 class_29603 = c;
            String string2 = "arrow_3d";
            ch.a(byArray2, string2, class_29603);
        });
    }

    private static void a(String string, String string2) {
        try {
            byte[] byArray = ka.a(string);
            a.put(string2, byArray);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

