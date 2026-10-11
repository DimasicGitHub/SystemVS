/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class hn
extends iy {
    private static final float v = 87.67f;
    private static final iU[] w = new iU[]{iU.a, iU.b, iU.c};
    private static final kD[] x = new kD[]{kD.ALIGN_LEFT, kD.ALIGN_CENTER, kD.ALIGN_RIGHT};
    private final kZ y;

    public hn(kZ kZ2) {
        super(kZ2);
        this.y = kZ2;
        this.r.b(hn.a(kZ2.a()));
    }

    @Override
    protected float b() {
        return hn.a(this.y.a());
    }

    @Override
    protected float c() {
        return 12.0f;
    }

    @Override
    protected float d() {
        return 8.0f;
    }

    @Override
    protected void a(Matrix4f matrix4f, float f2, float f3) {
        iU iU2 = this.y.a();
        float f4 = f2 + 11.5f;
        for (int i2 = 0; i2 < w.length; ++i2) {
            float f5 = this.a(i2) - 7.0f;
            int n2 = w[i2] == iU2 ? gD.foreground() : gD.mutedFg();
            float f6 = f3;
            int n3 = n2;
            float f7 = 9.0f;
            float f8 = 14.0f;
            float f9 = f4;
            float f10 = f5;
            kD kD2 = x[i2];
            Matrix4f matrix4f2 = matrix4f;
            jr.a(f6, n3, matrix4f2, f9, kD2, f7, f10, f8);
        }
    }

    @Override
    protected void a(int n2) {
        this.y.a(w[n2]);
    }

    @Override
    protected float a() {
        return 87.67f;
    }

    private static int a(iU iU2) {
        for (int i2 = 0; i2 < w.length; ++i2) {
            if (w[i2] != iU2) continue;
            return i2;
        }
        return 1;
    }

    @Override
    protected int a() {
        return w.length;
    }

    @Override
    protected kD a() {
        return kD.SETTING_ALIGNMENT;
    }

    @Override
    protected String a() {
        return this.y.a().d;
    }
}

