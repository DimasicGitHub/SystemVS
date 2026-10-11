/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_10151;
import net.minecraft.class_276;
import net.minecraft.class_279;
import net.minecraft.class_283;
import net.minecraft.class_2960;
import net.minecraft.class_9922;
import net.minecraft.class_9960;
import net.minecraft.class_9962;

public class ly
extends aT {
    private static final /* synthetic */ class_2960 a;
    private static volatile /* synthetic */ float b;
    private static volatile /* synthetic */ List<Float> c;
    private static volatile /* synthetic */ boolean d;
    private static volatile /* synthetic */ class_279 e;
    private static volatile /* synthetic */ Object f;
    private static volatile /* synthetic */ Object g;
    private static volatile /* synthetic */ int h;
    private static volatile /* synthetic */ class_9922 i;
    private static volatile /* synthetic */ boolean j;
    private /* synthetic */ gz k;
    private /* synthetic */ dw l;

    public /* synthetic */ ly() {
        super("\u0417\u0430\u0442\u0443\u0440\u0430\u0442\u0438\u043e\u043d", fV.e);
        gz gz2 = new gz("", "", 1.0, 0.0, 2.0, 0.05, "", 2);
        gz2.setNameParts(new String[]{"\u041d", "a", "\u0441", "\u044b", "\u0449", "\u0435", "\u043d", "\u043d", "\u043e", "\u0441", "\u0442", "\u044c"});
        gz2.setDescriptionParts(new String[]{"0", " ", "\u2014", " ", "c", "\u0435", "\u0440", "\u044b", "\u0439", ",", " ", "1", " ", "\u2014", " ", "o", "\u0431", "\u044b", "\u0447", "\u043d", "\u044b", "\u0439", ",", " ", "\u0432", "\u044b", "\u0448", "e", " ", "\u2014", " ", "\u043d", "a", "\u0441", "\u044b", "\u0449", "\u0435", "\u043d", "\u043d", "\u0435", "\u0435"});
        this.k = gz2;
        dw dw2 = new dw("", "", false);
        dw2.setNameParts(new String[]{"T", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u043c", "\u0438", "p"});
        dw2.setDescriptionParts(new String[]{"\u041f", "\u0440", "\u0438", "\u043c", "e", "\u043d", "\u044f", "\u0442", "\u044c", " ", "\u0442", "o", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u043a", " ", "\u043c", "\u0438", "p", "\u0443", ".", " ", "P", "\u0443", "\u043a", "\u0438", " ", "\u0438", " ", "H", "U", "D", " ", "o", "\u0441", "\u0442", "\u0430", "\u043d", "\u0443", "\u0442", "\u0441", "\u044f", " ", "o", "\u0431", "\u044b", "\u0447", "\u043d", "\u044b", "\u043c", "\u0438"});
        this.l = dw2;
        this.a(this.k, this.l);
    }

    static {
        a = class_2960.method_60656((String)"saturation");
        b = 1.0f;
        c = null;
        d = false;
        e = null;
        f = null;
        g = null;
        h = -1;
        i = null;
        j = false;
    }

    @Override
    public /* bridge */ /* synthetic */ void i() {
        float f2;
        b = f2 = this.k.a();
        d = Math.abs(f2 - 1.0f) > 0.001f;
        j = this.l.a();
        ly.a(f2);
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        b = 1.0f;
        d = false;
        ly.a(1.0f);
    }

    private static /* bridge */ /* synthetic */ List a(Class clazz, Class clazz2, Object object) throws IllegalAccessException {
        for (Field field : clazz2.getDeclaredFields()) {
            if (Modifier.isStatic(field.getModifiers()) || field.getType() != List.class || !ly.a(field, clazz)) continue;
            field.setAccessible(true);
            return (List)field.get(object);
        }
        return null;
    }

    private static /* bridge */ /* synthetic */ Field a(Class clazz, Class clazz2) {
        for (Field field : clazz2.getDeclaredFields()) {
            if (Modifier.isStatic(field.getModifiers()) || field.getType() != List.class || !ly.a(field, clazz)) continue;
            field.setAccessible(true);
            return field;
        }
        return null;
    }

    private static /* bridge */ /* synthetic */ void a(Object object) throws Exception {
        Object object2;
        Class<class_9962.class_9970> clazz = class_9962.class_9970.class;
        Class<class_283> clazz2 = class_283.class;
        Field field = ly.a(clazz, clazz2);
        if (field == null) {
            return;
        }
        List list = (List)field.get(object);
        if (list == null || list.isEmpty()) {
            return;
        }
        int n2 = -1;
        class_9962.class_9970 class_99702 = null;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            object2 = (class_9962.class_9970)list.get(i2);
            if (!"Saturation".equals(object2.comp_3032())) continue;
            n2 = i2;
            class_99702 = object2;
            break;
        }
        if (n2 < 0 || class_99702 == null) {
            return;
        }
        List list2 = class_99702.comp_3033();
        if (list2 == null) {
            return;
        }
        c = object2 = new ArrayList(list2);
        Constructor<?> constructor = class_9962.class_9970.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        ArrayList<class_9962.class_9970> arrayList = new ArrayList<class_9962.class_9970>(list);
        arrayList.set(n2, (class_9962.class_9970)constructor.newInstance(class_99702.comp_3032(), object2));
        field.set(object, arrayList);
    }

    private static /* bridge */ /* synthetic */ boolean a(Field field, Class clazz) {
        Class clazz2;
        ParameterizedType parameterizedType;
        Type type;
        Class clazz3;
        Type type2 = field.getGenericType();
        if (!(type2 instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType2 = (ParameterizedType)type2;
        Type[] typeArray = parameterizedType2.getActualTypeArguments();
        if (typeArray.length != 1) {
            return false;
        }
        Type type3 = typeArray[0];
        Class clazz4 = type3 instanceof Class ? (clazz3 = (Class)type3) : (type3 instanceof ParameterizedType && (type = (parameterizedType = (ParameterizedType)type3).getRawType()) instanceof Class ? (clazz2 = (Class)type) : null);
        return clazz4 == clazz;
    }

    public static /* bridge */ /* synthetic */ void a(class_276 class_2762) {
        class_279 class_2792;
        if (!d) {
            return;
        }
        if (jI.b()) {
            return;
        }
        class_9922 class_99222 = i;
        if (class_2762 == null || class_99222 == null) {
            return;
        }
        class_10151 class_101512 = aM.method_62887();
        if (class_101512 == null) {
            return;
        }
        int n2 = jI.a();
        if (n2 != h) {
            e = null;
            f = null;
            g = null;
            c = null;
            h = n2;
        }
        if ((class_2792 = e) == null || class_101512 != f) {
            if (class_101512 == g) {
                return;
            }
            try {
                class_2792 = aM.method_62887().method_62941(a, class_9960.field_53902);
            }
            catch (Throwable throwable) {
                g = class_101512;
                return;
            }
            if (class_2792 == null) {
                g = class_101512;
                return;
            }
            ly.a(class_2792);
            ly.a(b);
            e = class_2792;
            f = class_101512;
            g = null;
        }
        try {
            class_2792.method_1258(class_2762, class_99222);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public static /* bridge */ /* synthetic */ boolean a() {
        return j;
    }

    private static /* bridge */ /* synthetic */ void a(float f2) {
        List<Float> list = c;
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            list.set(0, Float.valueOf(f2));
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public static /* bridge */ /* synthetic */ void a(class_9922 class_99222) {
        i = class_99222;
    }

    public static /* bridge */ /* synthetic */ void a(class_279 class_2792) {
        try {
            Class<class_283> clazz = class_283.class;
            Class<class_279> clazz2 = class_279.class;
            class_279 class_2794 = class_2792;
            List list = ly.a(clazz, clazz2, class_2794);
            if (list == null) {
                return;
            }
            for (Object e2 : list) {
                if (e2 == null) continue;
                ly.a(e2);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
    }
}

