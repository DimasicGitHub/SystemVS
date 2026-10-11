/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Set;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1297;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;

public class gv {
    private static final /* synthetic */ Set<class_1792> a;

    static {
        a = Set.of(class_1802.field_8477, class_1802.field_8687, class_1802.field_8695, class_1802.field_8620, class_1802.field_22020, class_1802.field_8802, class_1802.field_8377, class_1802.field_8556, class_1802.field_8250, class_1802.field_8527, class_1802.field_8805, class_1802.field_8058, class_1802.field_8348, class_1802.field_8285, class_1802.field_22022, class_1802.field_22024, class_1802.field_22025, class_1802.field_22023, class_1802.field_22026, class_1802.field_22027, class_1802.field_22028, class_1802.field_22029, class_1802.field_22030, class_1802.field_8367, class_1802.field_8463, class_1802.field_8288, class_1802.field_8833, class_1802.field_8545, class_1802.field_8722, class_1802.field_8380, class_1802.field_8050, class_1802.field_8829, class_1802.field_8271, class_1802.field_8548, class_1802.field_8520, class_1802.field_8627, class_1802.field_8451, class_1802.field_8213, class_1802.field_8816, class_1802.field_8350, class_1802.field_8584, class_1802.field_8461, class_1802.field_8676, class_1802.field_8268);
    }

    public static /* bridge */ /* synthetic */ void b() {
        RenderSystem.depthMask((boolean)true);
        GL11.glDepthFunc((int)515);
        RenderSystem.disableBlend();
        RenderSystem.enableCull();
    }

    public static /* bridge */ /* synthetic */ void a(float f2, float f3, float f4, float f5, float f6, Matrix4f matrix4f, float f7, class_287 class_2872, float f8, float f9, float f10, float f11) {
        float f12 = f7;
        float f13 = f6;
        float f14 = f2;
        float f15 = f10;
        float f16 = f9;
        float f17 = f4;
        float f18 = f5;
        float f19 = f3;
        float f20 = f4;
        float f21 = f8;
        Matrix4f matrix4f2 = matrix4f;
        class_287 class_2873 = class_2872;
        gv.a(f20, f14, f17, f15, f12, f18, f16, class_2873, f19, f21, matrix4f2, f13);
        float f22 = f7;
        float f23 = f6;
        float f24 = f2;
        float f25 = f10;
        float f26 = f9;
        float f27 = f11;
        float f28 = f5;
        float f29 = f3;
        float f30 = f11;
        float f31 = f8;
        Matrix4f matrix4f3 = matrix4f;
        class_287 class_2874 = class_2872;
        gv.a(f30, f24, f27, f25, f22, f28, f26, class_2874, f29, f31, matrix4f3, f23);
        float f32 = f7;
        float f33 = f6;
        float f34 = f2;
        float f35 = f10;
        float f36 = f3;
        float f37 = f11;
        float f38 = f5;
        float f39 = f3;
        float f40 = f4;
        float f41 = f8;
        Matrix4f matrix4f4 = matrix4f;
        class_287 class_2875 = class_2872;
        gv.a(f40, f34, f37, f35, f32, f38, f36, class_2875, f39, f41, matrix4f4, f33);
        float f42 = f7;
        float f43 = f6;
        float f44 = f2;
        float f45 = f10;
        float f46 = f9;
        float f47 = f11;
        float f48 = f5;
        float f49 = f9;
        float f50 = f4;
        float f51 = f8;
        Matrix4f matrix4f5 = matrix4f;
        class_287 class_2876 = class_2872;
        gv.a(f50, f44, f47, f45, f42, f48, f46, class_2876, f49, f51, matrix4f5, f43);
        float f52 = f7;
        float f53 = f6;
        float f54 = f2;
        float f55 = f10;
        float f56 = f9;
        float f57 = f11;
        float f58 = f8;
        float f59 = f3;
        float f60 = f4;
        float f61 = f8;
        Matrix4f matrix4f6 = matrix4f;
        class_287 class_2877 = class_2872;
        gv.a(f60, f54, f57, f55, f52, f58, f56, class_2877, f59, f61, matrix4f6, f53);
        float f62 = f7;
        float f63 = f6;
        float f64 = f2;
        float f65 = f10;
        float f66 = f9;
        float f67 = f11;
        float f68 = f5;
        float f69 = f3;
        float f70 = f4;
        float f71 = f5;
        Matrix4f matrix4f7 = matrix4f;
        class_287 class_2878 = class_2872;
        gv.a(f70, f64, f67, f65, f62, f68, f66, class_2878, f69, f71, matrix4f7, f63);
    }

    public static /* bridge */ /* synthetic */ void a(float f2, float f3, float f4, float f5, Matrix4f matrix4f, float f6, float f7, float f8, class_287 class_2872, float f9, float f10, float f11, float f12) {
        float f13 = f3;
        float f14 = f9;
        float f15 = f4;
        float f16 = f12;
        float f17 = f10;
        float f18 = f7;
        float f19 = f5;
        float f20 = f2;
        float f21 = f7;
        float f22 = f5;
        float f23 = f6;
        Matrix4f matrix4f2 = matrix4f;
        class_287 class_2873 = class_2872;
        gv.a(f20, f18, f19, f13, f17, f21, f15, f14, class_2873, matrix4f2, f23, f16, f22);
        float f24 = f3;
        float f25 = f9;
        float f26 = f4;
        float f27 = f12;
        float f28 = f10;
        float f29 = f11;
        float f30 = f5;
        float f31 = f2;
        float f32 = f7;
        float f33 = f5;
        float f34 = f2;
        Matrix4f matrix4f3 = matrix4f;
        class_287 class_2874 = class_2872;
        gv.a(f31, f29, f30, f24, f28, f32, f26, f25, class_2874, matrix4f3, f34, f27, f33);
        float f35 = f3;
        float f36 = f9;
        float f37 = f4;
        float f38 = f12;
        float f39 = f10;
        float f40 = f11;
        float f41 = f5;
        float f42 = f6;
        float f43 = f11;
        float f44 = f5;
        float f45 = f2;
        Matrix4f matrix4f4 = matrix4f;
        class_287 class_2875 = class_2872;
        gv.a(f42, f40, f41, f35, f39, f43, f37, f36, class_2875, matrix4f4, f45, f38, f44);
        float f46 = f3;
        float f47 = f9;
        float f48 = f4;
        float f49 = f12;
        float f50 = f10;
        float f51 = f7;
        float f52 = f5;
        float f53 = f6;
        float f54 = f11;
        float f55 = f5;
        float f56 = f6;
        Matrix4f matrix4f5 = matrix4f;
        class_287 class_2876 = class_2872;
        gv.a(f53, f51, f52, f46, f50, f54, f48, f47, class_2876, matrix4f5, f56, f49, f55);
        float f57 = f3;
        float f58 = f9;
        float f59 = f4;
        float f60 = f12;
        float f61 = f10;
        float f62 = f7;
        float f63 = f8;
        float f64 = f2;
        float f65 = f7;
        float f66 = f8;
        float f67 = f6;
        Matrix4f matrix4f6 = matrix4f;
        class_287 class_2877 = class_2872;
        gv.a(f64, f62, f63, f57, f61, f65, f59, f58, class_2877, matrix4f6, f67, f60, f66);
        float f68 = f3;
        float f69 = f9;
        float f70 = f4;
        float f71 = f12;
        float f72 = f10;
        float f73 = f11;
        float f74 = f8;
        float f75 = f2;
        float f76 = f7;
        float f77 = f8;
        float f78 = f2;
        Matrix4f matrix4f7 = matrix4f;
        class_287 class_2878 = class_2872;
        gv.a(f75, f73, f74, f68, f72, f76, f70, f69, class_2878, matrix4f7, f78, f71, f77);
        float f79 = f3;
        float f80 = f9;
        float f81 = f4;
        float f82 = f12;
        float f83 = f10;
        float f84 = f11;
        float f85 = f8;
        float f86 = f6;
        float f87 = f11;
        float f88 = f8;
        float f89 = f2;
        Matrix4f matrix4f8 = matrix4f;
        class_287 class_2879 = class_2872;
        gv.a(f86, f84, f85, f79, f83, f87, f81, f80, class_2879, matrix4f8, f89, f82, f88);
        float f90 = f3;
        float f91 = f9;
        float f92 = f4;
        float f93 = f12;
        float f94 = f10;
        float f95 = f7;
        float f96 = f8;
        float f97 = f6;
        float f98 = f11;
        float f99 = f8;
        float f100 = f6;
        Matrix4f matrix4f9 = matrix4f;
        class_287 class_28710 = class_2872;
        gv.a(f97, f95, f96, f90, f94, f98, f92, f91, class_28710, matrix4f9, f100, f93, f99);
        float f101 = f3;
        float f102 = f9;
        float f103 = f4;
        float f104 = f12;
        float f105 = f10;
        float f106 = f7;
        float f107 = f8;
        float f108 = f6;
        float f109 = f7;
        float f110 = f5;
        float f111 = f6;
        Matrix4f matrix4f10 = matrix4f;
        class_287 class_28711 = class_2872;
        gv.a(f108, f106, f107, f101, f105, f109, f103, f102, class_28711, matrix4f10, f111, f104, f110);
        float f112 = f3;
        float f113 = f9;
        float f114 = f4;
        float f115 = f12;
        float f116 = f10;
        float f117 = f7;
        float f118 = f8;
        float f119 = f2;
        float f120 = f7;
        float f121 = f5;
        float f122 = f2;
        Matrix4f matrix4f11 = matrix4f;
        class_287 class_28712 = class_2872;
        gv.a(f119, f117, f118, f112, f116, f120, f114, f113, class_28712, matrix4f11, f122, f115, f121);
        float f123 = f3;
        float f124 = f9;
        float f125 = f4;
        float f126 = f12;
        float f127 = f10;
        float f128 = f11;
        float f129 = f8;
        float f130 = f2;
        float f131 = f11;
        float f132 = f5;
        float f133 = f2;
        Matrix4f matrix4f12 = matrix4f;
        class_287 class_28713 = class_2872;
        gv.a(f130, f128, f129, f123, f127, f131, f125, f124, class_28713, matrix4f12, f133, f126, f132);
        float f134 = f3;
        float f135 = f9;
        float f136 = f4;
        float f137 = f12;
        float f138 = f10;
        float f139 = f11;
        float f140 = f8;
        float f141 = f6;
        float f142 = f11;
        float f143 = f5;
        float f144 = f6;
        Matrix4f matrix4f13 = matrix4f;
        class_287 class_28714 = class_2872;
        gv.a(f141, f139, f140, f134, f138, f142, f136, f135, class_28714, matrix4f13, f144, f137, f143);
    }

    public static /* bridge */ /* synthetic */ void a(class_4587 class_45872, float f2, float f3, class_243 class_2432, boolean bl2, float f4, class_243 class_2433, float f5) {
        if (bl2) {
            GL11.glDepthFunc((int)519);
            RenderSystem.depthMask((boolean)false);
        }
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        class_289 class_2892 = class_289.method_1348();
        class_287 class_2872 = class_2892.method_60827(class_293.class_5596.field_27379, class_290.field_1576);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f6 = f5;
        float f7 = f2;
        float f8 = f4;
        float f9 = f3;
        float f10 = (float)class_2433.field_1350;
        float f11 = (float)class_2433.field_1351;
        float f12 = (float)class_2433.field_1352;
        float f13 = (float)class_2432.field_1350;
        float f14 = (float)class_2432.field_1351;
        float f15 = (float)class_2432.field_1352;
        Matrix4f matrix4f2 = matrix4f;
        class_287 class_2873 = class_2872;
        gv.a(f8, f13, f14, f12, f7, matrix4f2, f6, class_2873, f15, f10, f9, f11);
        class_286.method_43433((class_9801)class_2872.method_60800());
        if (bl2) {
            RenderSystem.depthMask((boolean)true);
            GL11.glDepthFunc((int)515);
        }
        RenderSystem.disableBlend();
        RenderSystem.enableCull();
    }

    public static /* bridge */ /* synthetic */ void a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, class_287 class_2872, float f9, float f10, Matrix4f matrix4f, float f11) {
        boolean bl2;
        boolean bl3 = Math.abs(f7 - f10) > 1.0E-4f;
        boolean bl4 = Math.abs(f4 - f2) > 1.0E-4f;
        boolean bl5 = bl2 = Math.abs(f8 - f9) > 1.0E-4f;
        if (bl3 && bl4) {
            class_2872.method_22918(matrix4f, f10, f2, f9).method_22915(f5, f3, f11, f6);
            class_2872.method_22918(matrix4f, f7, f2, f9).method_22915(f5, f3, f11, f6);
            class_2872.method_22918(matrix4f, f7, f4, f9).method_22915(f5, f3, f11, f6);
            class_2872.method_22918(matrix4f, f10, f2, f9).method_22915(f5, f3, f11, f6);
            class_2872.method_22918(matrix4f, f7, f4, f9).method_22915(f5, f3, f11, f6);
            class_2872.method_22918(matrix4f, f10, f4, f9).method_22915(f5, f3, f11, f6);
        } else if (bl3 && bl2) {
            class_2872.method_22918(matrix4f, f10, f2, f9).method_22915(f5, f3, f11, f6);
            class_2872.method_22918(matrix4f, f7, f2, f9).method_22915(f5, f3, f11, f6);
            class_2872.method_22918(matrix4f, f7, f2, f8).method_22915(f5, f3, f11, f6);
            class_2872.method_22918(matrix4f, f10, f2, f9).method_22915(f5, f3, f11, f6);
            class_2872.method_22918(matrix4f, f7, f2, f8).method_22915(f5, f3, f11, f6);
            class_2872.method_22918(matrix4f, f10, f2, f8).method_22915(f5, f3, f11, f6);
        } else if (bl4 && bl2) {
            class_2872.method_22918(matrix4f, f10, f2, f9).method_22915(f5, f3, f11, f6);
            class_2872.method_22918(matrix4f, f10, f2, f8).method_22915(f5, f3, f11, f6);
            class_2872.method_22918(matrix4f, f10, f4, f8).method_22915(f5, f3, f11, f6);
            class_2872.method_22918(matrix4f, f10, f2, f9).method_22915(f5, f3, f11, f6);
            class_2872.method_22918(matrix4f, f10, f4, f8).method_22915(f5, f3, f11, f6);
            class_2872.method_22918(matrix4f, f10, f4, f9).method_22915(f5, f3, f11, f6);
        }
    }

    public static /* bridge */ /* synthetic */ void a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, class_287 class_2872, Matrix4f matrix4f, float f10, float f11, float f12) {
        float f13;
        float f14;
        float f15;
        float f16 = f2 - f10;
        float f17 = f4 - f12;
        float f18 = f3 - f7;
        float f19 = f16 * f16 + f17 * f17 + f18 * f18;
        if (f19 < 1.0E-6f) {
            return;
        }
        float f20 = (float)Math.sqrt(f19);
        float f21 = f16 / f20;
        float f22 = f17 / f20;
        float f23 = f18 / f20;
        if (Math.abs(f21) <= Math.abs(f22) && Math.abs(f21) <= Math.abs(f23)) {
            f15 = 1.0f;
            f14 = 0.0f;
            f13 = 0.0f;
        } else if (Math.abs(f22) <= Math.abs(f23)) {
            f15 = 0.0f;
            f14 = 1.0f;
            f13 = 0.0f;
        } else {
            f15 = 0.0f;
            f14 = 0.0f;
            f13 = 1.0f;
        }
        float f24 = f22 * f13 - f23 * f14;
        float f25 = f23 * f15 - f21 * f13;
        float f26 = f21 * f14 - f22 * f15;
        float f27 = (float)Math.sqrt(f24 * f24 + f25 * f25 + f26 * f26);
        float f28 = f22 * (f26 *= f6 / f27) - f23 * (f25 *= f6 / f27);
        float f29 = f23 * (f24 *= f6 / f27) - f21 * f26;
        float f30 = f21 * f25 - f22 * f24;
        float f31 = (float)Math.sqrt(f28 * f28 + f29 * f29 + f30 * f30);
        f28 *= f6 / f31;
        f29 *= f6 / f31;
        f30 *= f6 / f31;
        class_2872.method_22918(matrix4f, f10 + f24, f12 + f25, f7 + f26).method_22915(f11, f8, f9, f5);
        class_2872.method_22918(matrix4f, f2 + f24, f4 + f25, f3 + f26).method_22915(f11, f8, f9, f5);
        class_2872.method_22918(matrix4f, f2 - f24, f4 - f25, f3 - f26).method_22915(f11, f8, f9, f5);
        class_2872.method_22918(matrix4f, f10 + f24, f12 + f25, f7 + f26).method_22915(f11, f8, f9, f5);
        class_2872.method_22918(matrix4f, f2 - f24, f4 - f25, f3 - f26).method_22915(f11, f8, f9, f5);
        class_2872.method_22918(matrix4f, f10 - f24, f12 - f25, f7 - f26).method_22915(f11, f8, f9, f5);
        class_2872.method_22918(matrix4f, f10 + f28, f12 + f29, f7 + f30).method_22915(f11, f8, f9, f5);
        class_2872.method_22918(matrix4f, f2 + f28, f4 + f29, f3 + f30).method_22915(f11, f8, f9, f5);
        class_2872.method_22918(matrix4f, f2 - f28, f4 - f29, f3 - f30).method_22915(f11, f8, f9, f5);
        class_2872.method_22918(matrix4f, f10 + f28, f12 + f29, f7 + f30).method_22915(f11, f8, f9, f5);
        class_2872.method_22918(matrix4f, f2 - f28, f4 - f29, f3 - f30).method_22915(f11, f8, f9, f5);
        class_2872.method_22918(matrix4f, f10 - f28, f12 - f29, f7 - f30).method_22915(f11, f8, f9, f5);
    }

    public static /* bridge */ /* synthetic */ void a(float f2, float f3, Matrix4f matrix4f, float f4, float f5, float f6, class_287 class_2872, float f7, float f8, float f9, float f10) {
        class_2872.method_22918(matrix4f, f5 + f8, f4, f2).method_22915(f10, f3, f7, f6);
        class_2872.method_22918(matrix4f, f5 + f8, f9, f2).method_22915(f10, f3, f7, f6);
        class_2872.method_22918(matrix4f, f5 - f8, f9, f2).method_22915(f10, f3, f7, f6);
        class_2872.method_22918(matrix4f, f5 + f8, f4, f2).method_22915(f10, f3, f7, f6);
        class_2872.method_22918(matrix4f, f5 - f8, f9, f2).method_22915(f10, f3, f7, f6);
        class_2872.method_22918(matrix4f, f5 - f8, f4, f2).method_22915(f10, f3, f7, f6);
        class_2872.method_22918(matrix4f, f5, f4, f2 + f8).method_22915(f10, f3, f7, f6);
        class_2872.method_22918(matrix4f, f5, f9, f2 + f8).method_22915(f10, f3, f7, f6);
        class_2872.method_22918(matrix4f, f5, f9, f2 - f8).method_22915(f10, f3, f7, f6);
        class_2872.method_22918(matrix4f, f5, f4, f2 + f8).method_22915(f10, f3, f7, f6);
        class_2872.method_22918(matrix4f, f5, f9, f2 - f8).method_22915(f10, f3, f7, f6);
        class_2872.method_22918(matrix4f, f5, f4, f2 - f8).method_22915(f10, f3, f7, f6);
    }

    public static /* bridge */ /* synthetic */ float[] a(int n2) {
        return new float[]{(float)(n2 >> 16 & 0xFF) / 255.0f, (float)(n2 >> 8 & 0xFF) / 255.0f, (float)(n2 & 0xFF) / 255.0f, (float)(n2 >> 24 & 0xFF) / 255.0f};
    }

    public static /* bridge */ /* synthetic */ boolean a(class_243 class_2432, double d2, class_243 class_2433) {
        double d3 = d2 * d2;
        return class_2432.method_1025(class_2433) <= d3;
    }

    public static /* bridge */ /* synthetic */ boolean a(class_1792 class_17922) {
        return a.contains(class_17922);
    }

    public static /* bridge */ /* synthetic */ class_243 a(float f2, class_1297 class_12972, class_243 class_2432) {
        double d2 = class_3532.method_16436((double)f2, (double)class_12972.field_6014, (double)class_12972.method_23317()) - class_2432.field_1352;
        double d3 = class_3532.method_16436((double)f2, (double)class_12972.field_6036, (double)class_12972.method_23318()) - class_2432.field_1351;
        double d4 = class_3532.method_16436((double)f2, (double)class_12972.field_5969, (double)class_12972.method_23321()) - class_2432.field_1350;
        return new class_243(d2, d3, d4);
    }

    public static /* bridge */ /* synthetic */ void a(class_287 class_2872) {
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.depthMask((boolean)true);
        GL11.glDepthFunc((int)515);
        RenderSystem.disableBlend();
        RenderSystem.lineWidth((float)1.0f);
    }

    public static /* bridge */ /* synthetic */ void a(class_287 class_2872, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, Matrix4f matrix4f, float f11) {
        class_2872.method_22918(matrix4f, f6, f9, f10).method_22915(f7, f5, f2, f4);
        class_2872.method_22918(matrix4f, f11, f3, f8).method_22915(f7, f5, f2, f4);
    }

    public static /* bridge */ /* synthetic */ class_287 a(float f2) {
        GL11.glDepthFunc((int)519);
        RenderSystem.depthMask((boolean)false);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        RenderSystem.lineWidth((float)f2);
        return class_289.method_1348().method_60827(class_293.class_5596.field_29344, class_290.field_1576);
    }

    public static /* bridge */ /* synthetic */ void a(class_4587.class_4665 class_46652, class_4587 class_45872) {
        if (class_45872 == null) {
            return;
        }
        while (!class_45872.method_22911() && class_45872.method_23760() != class_46652) {
            class_45872.method_22909();
        }
    }

    public static /* bridge */ /* synthetic */ void a(class_4587 class_45872) {
        class_4587.class_4665 class_46652 = null;
        class_4587 class_45873 = class_45872;
        gv.a(class_46652, class_45873);
    }

    public static /* bridge */ /* synthetic */ void a(Matrix4f matrix4f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, class_287 class_2872, float f10) {
        class_2872.method_22918(matrix4f, f8 + f6, f3, f5).method_22915(f2, f9, f4, f7);
        class_2872.method_22918(matrix4f, f8 + f6, f3, f10).method_22915(f2, f9, f4, f7);
        class_2872.method_22918(matrix4f, f8 - f6, f3, f10).method_22915(f2, f9, f4, f7);
        class_2872.method_22918(matrix4f, f8 + f6, f3, f5).method_22915(f2, f9, f4, f7);
        class_2872.method_22918(matrix4f, f8 - f6, f3, f10).method_22915(f2, f9, f4, f7);
        class_2872.method_22918(matrix4f, f8 - f6, f3, f5).method_22915(f2, f9, f4, f7);
        class_2872.method_22918(matrix4f, f8, f3 + f6, f5).method_22915(f2, f9, f4, f7);
        class_2872.method_22918(matrix4f, f8, f3 + f6, f10).method_22915(f2, f9, f4, f7);
        class_2872.method_22918(matrix4f, f8, f3 - f6, f10).method_22915(f2, f9, f4, f7);
        class_2872.method_22918(matrix4f, f8, f3 + f6, f5).method_22915(f2, f9, f4, f7);
        class_2872.method_22918(matrix4f, f8, f3 - f6, f10).method_22915(f2, f9, f4, f7);
        class_2872.method_22918(matrix4f, f8, f3 - f6, f5).method_22915(f2, f9, f4, f7);
    }

    public static /* bridge */ /* synthetic */ void a() {
        GL11.glDepthFunc((int)519);
        RenderSystem.depthMask((boolean)false);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.setShader((class_10156)class_10142.field_53876);
    }

    public static /* bridge */ /* synthetic */ void a(float f2, float f3, float f4, Matrix4f matrix4f, float f5, float f6, float f7, float f8, float f9, class_287 class_2872, float f10) {
        class_2872.method_22918(matrix4f, f4, f5, f7 + f10).method_22915(f2, f9, f6, f8);
        class_2872.method_22918(matrix4f, f3, f5, f7 + f10).method_22915(f2, f9, f6, f8);
        class_2872.method_22918(matrix4f, f3, f5, f7 - f10).method_22915(f2, f9, f6, f8);
        class_2872.method_22918(matrix4f, f4, f5, f7 + f10).method_22915(f2, f9, f6, f8);
        class_2872.method_22918(matrix4f, f3, f5, f7 - f10).method_22915(f2, f9, f6, f8);
        class_2872.method_22918(matrix4f, f4, f5, f7 - f10).method_22915(f2, f9, f6, f8);
        class_2872.method_22918(matrix4f, f4, f5 + f10, f7).method_22915(f2, f9, f6, f8);
        class_2872.method_22918(matrix4f, f3, f5 + f10, f7).method_22915(f2, f9, f6, f8);
        class_2872.method_22918(matrix4f, f3, f5 - f10, f7).method_22915(f2, f9, f6, f8);
        class_2872.method_22918(matrix4f, f4, f5 + f10, f7).method_22915(f2, f9, f6, f8);
        class_2872.method_22918(matrix4f, f3, f5 - f10, f7).method_22915(f2, f9, f6, f8);
        class_2872.method_22918(matrix4f, f4, f5 - f10, f7).method_22915(f2, f9, f6, f8);
    }

    public static /* bridge */ /* synthetic */ void a(float f2, float f3, float f4, float f5, Matrix4f matrix4f, float f6, float f7, float f8, class_287 class_2872, float f9, float f10) {
        float f11 = f5;
        float f12 = f3;
        float f13 = f2;
        float f14 = f10;
        float f15 = f6 + f8;
        float f16 = f9 + f8;
        float f17 = f6 - f8;
        float f18 = f7 - f8;
        Matrix4f matrix4f2 = matrix4f;
        class_287 class_2873 = class_2872;
        gv.a(f18, matrix4f2, f11, f15, f16, f13, f12, f17, class_2873, f14);
        float f19 = f5;
        float f20 = f3;
        float f21 = f2;
        float f22 = f10;
        float f23 = f4 + f8;
        float f24 = f9 + f8;
        float f25 = f4 - f8;
        float f26 = f7 - f8;
        Matrix4f matrix4f3 = matrix4f;
        class_287 class_2874 = class_2872;
        gv.a(f26, matrix4f3, f19, f23, f24, f21, f20, f25, class_2874, f22);
        float f27 = f5;
        float f28 = f3;
        float f29 = f2;
        float f30 = f10;
        float f31 = f4 - f8;
        float f32 = f7 + f8;
        float f33 = f6 + f8;
        float f34 = f7 - f8;
        Matrix4f matrix4f4 = matrix4f;
        class_287 class_2875 = class_2872;
        gv.a(f34, matrix4f4, f27, f31, f32, f29, f28, f33, class_2875, f30);
        float f35 = f5;
        float f36 = f3;
        float f37 = f2;
        float f38 = f10;
        float f39 = f4 - f8;
        float f40 = f9 + f8;
        float f41 = f6 + f8;
        float f42 = f9 - f8;
        Matrix4f matrix4f5 = matrix4f;
        class_287 class_2876 = class_2872;
        gv.a(f42, matrix4f5, f35, f39, f40, f37, f36, f41, class_2876, f38);
    }

    public static /* bridge */ /* synthetic */ void a(float f2, Matrix4f matrix4f, float f3, float f4, float f5, float f6, float f7, float f8, class_287 class_2872, float f9) {
        class_2872.method_22918(matrix4f, f2, f8, 0.0f).method_22915(f9, f6, f7, f3);
        class_2872.method_22918(matrix4f, f5, f8, 0.0f).method_22915(f9, f6, f7, f3);
        class_2872.method_22918(matrix4f, f5, f4, 0.0f).method_22915(f9, f6, f7, f3);
        class_2872.method_22918(matrix4f, f2, f8, 0.0f).method_22915(f9, f6, f7, f3);
        class_2872.method_22918(matrix4f, f5, f4, 0.0f).method_22915(f9, f6, f7, f3);
        class_2872.method_22918(matrix4f, f2, f4, 0.0f).method_22915(f9, f6, f7, f3);
    }
}

