/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class hp {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public /* bridge */ /* synthetic */ void a(H h2, float f2, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        class_4587 class_45872 = h2.a();
        class_4184 class_41842 = h2.a();
        class_243 class_2432 = class_41842.method_19326();
        int n2 = gD.background();
        int n3 = gD.foreground();
        int n4 = gD.mutedFg();
        bU.a(lo.aM);
        try {
            for (fM fM2 : list) {
                double d2;
                double d3;
                double d4;
                double d5;
                double d6;
                double d7;
                double d8;
                double d9;
                double d10;
                double d11;
                if (fM2 == null || (d11 = Math.sqrt((d10 = (d9 = (double)fM2.a() + 0.5) - class_2432.field_1352) * d10 + (d8 = (d7 = (double)((float)fM2.b() + 1.0f)) - class_2432.field_1351) * d8 + (d6 = (d5 = (double)fM2.c() + 0.5) - class_2432.field_1350) * d6)) < 0.001) continue;
                if (lo.aM != null && lo.aM.field_1724 != null) {
                    d4 = lo.aM.field_1724.method_23317() - (double)fM2.a();
                    d3 = lo.aM.field_1724.method_23318() - (double)fM2.b();
                    double d12 = lo.aM.field_1724.method_23321() - (double)fM2.c();
                    d2 = Math.sqrt(d4 * d4 + d3 * d3 + d12 * d12);
                } else {
                    d2 = d11;
                }
                if (d11 > 32.0) {
                    d3 = 32.0 / d11;
                    d10 *= d3;
                    d8 *= d3;
                    d6 *= d3;
                    d4 = 32.0;
                } else {
                    d4 = d11;
                }
                String string = hp.a(d2);
                String string2 = fM2.b() == null ? "" : fM2.b();
                float f3 = ao.a(string2, 14.0f);
                float f4 = ao.a(string, 14.0f);
                float f5 = 26.0f + f3 + 6.0f + f4 + 8.0f;
                class_45872.method_22903();
                try {
                    class_45872.method_22904(d10, d8, d6);
                    bU.a(class_45872);
                    float f6 = (float)Math.clamp((double)(d4 * (double)0.0025f), (double)0.02f, (double)0.1f) * f2;
                    class_45872.method_22905(-f6, -f6, -f6);
                    Matrix4f matrix4f = class_45872.method_23760().method_23761();
                    float f7 = -f5 / 2.0f;
                    float f8 = -14.0f;
                    float f9 = f8 + 6.5f;
                    float f10 = f8 + 7.0f;
                    float f11 = 1.0f;
                    float f12 = 0.0f;
                    float f13 = 0.0f;
                    float f14 = 0.0f;
                    int n5 = 0;
                    float f15 = 0.0f;
                    int n6 = 0;
                    int n7 = n2;
                    float f16 = 8.0f;
                    float f17 = 8.0f;
                    float f18 = 8.0f;
                    float f19 = 8.0f;
                    float f20 = 28.0f;
                    float f21 = f5;
                    float f22 = f8;
                    float f23 = f7;
                    Matrix4f matrix4f2 = matrix4f;
                    dP.a(f21, n5, n7, f23, f22, f12, f19, f20, f13, matrix4f2, f11, n6, f17, f15, f18, f16, f14);
                    float f24 = f7 + 8.0f;
                    float f25 = 1.0f;
                    int n8 = n3;
                    float f26 = 15.0f;
                    float f27 = 12.0f;
                    float f28 = f9;
                    float f29 = f24;
                    kD kD2 = kD.WAYPOINT;
                    Matrix4f matrix4f3 = matrix4f;
                    jr.a(f25, n8, matrix4f3, f28, kD2, f26, f29, f27);
                    float f30 = 1.0f;
                    int n9 = n3;
                    float f31 = 14.0f;
                    float f32 = f10;
                    float f33 = f24 += 18.0f;
                    String string3 = string2;
                    Matrix4f matrix4f4 = matrix4f;
                    ao.a(f32, f33, n9, f31, f30, string3, matrix4f4);
                    float f34 = 1.0f;
                    int n10 = n4;
                    float f35 = 14.0f;
                    float f36 = f10;
                    float f37 = f24 += f3 + 6.0f;
                    String string4 = string;
                    Matrix4f matrix4f5 = matrix4f;
                    ao.a(f36, f37, n10, f35, f34, string4, matrix4f5);
                }
                finally {
                    class_45872.method_22909();
                }
            }
        }
        finally {
            bU.b(lo.aM);
        }
    }

    private static /* bridge */ /* synthetic */ String a(double d2) {
        if (d2 < 1000.0) {
            return (int)Math.round(d2) + "m";
        }
        return String.format("%.1fkm", d2 / 1000.0);
    }
}

