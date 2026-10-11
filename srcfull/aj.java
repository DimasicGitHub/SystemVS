/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.class_6367;

class aj
extends LinkedHashMap<ex, class_6367> {
    aj(int n2, float f2, boolean bl2) {
        super(n2, f2, bl2);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry entry) {
        if (this.size() > 64) {
            try {
                ((class_6367)entry.getValue()).method_1238();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            return true;
        }
        return false;
    }
}

