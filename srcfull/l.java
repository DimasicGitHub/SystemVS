/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

record l(float a, float b, float c, float d, float e, float f, float g, float h, float i, float j, float k, float l, float m, float n, float o) {
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{l.class, "boxX;boxY;slidersX;hueY;alphaY;sliderBlockY;sliderBlockH;readoutY;modeBlockX;modeBlockY;presetsX;presetsY;presetGap;savedHeaderY;descMaxW", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{l.class, "boxX;boxY;slidersX;hueY;alphaY;sliderBlockY;sliderBlockH;readoutY;modeBlockX;modeBlockY;presetsX;presetsY;presetGap;savedHeaderY;descMaxW", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{l.class, "boxX;boxY;slidersX;hueY;alphaY;sliderBlockY;sliderBlockH;readoutY;modeBlockX;modeBlockY;presetsX;presetsY;presetGap;savedHeaderY;descMaxW", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"}, this);
    }
}

