/*
 * Decompiled with CFR 0.152.
 */
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class js
extends iy {
    private static final int v = 2;
    private static final float w = 2.83f;
    private final hO x;

    public js(hO hO2) {
        super(hO2);
        this.x = hO2;
        this.r.b(hO2.a() ? 1.0f : 0.0f);
    }

    @Override
    protected float b() {
        return this.x.a() ? 1.0f : 0.0f;
    }

    @Override
    protected void a(Matrix4f matrix4f, float f2, float f3) {
        boolean bl2 = this.x.a();
        cF[] cFArray = new cF[]{this.x.b(), this.x.c()};
        for (int i2 = 0; i2 < 2; ++i2) {
            float f4;
            float f5;
            int n2;
            cF cF2 = cFArray[i2];
            boolean bl3 = i2 == 1 == bl2;
            int n3 = n2 = bl3 ? gD.foreground() : gD.mutedFg();
            if (cF2.a() != null) {
                f5 = f2 + 11.5f;
                f4 = this.a(i2) - 7.0f;
                float f6 = f3;
                int n4 = n2;
                float f7 = 9.0f;
                float f8 = 14.0f;
                float f9 = f5;
                float f10 = f4;
                kD kD2 = cF2.a();
                Matrix4f matrix4f2 = matrix4f;
                jr.a(f6, n4, matrix4f2, f9, kD2, f7, f10, f8);
                continue;
            }
            f5 = ao.a(cF2.a(), 12.0f);
            f4 = this.a(i2) - f5 / 2.0f;
            float f11 = f2 + 10.0f;
            float f12 = f3;
            int n5 = n2;
            float f13 = 12.0f;
            float f14 = f11;
            float f15 = f4;
            String string = cF2.a();
            Matrix4f matrix4f3 = matrix4f;
            ao.a(f14, f15, n5, f13, f12, string, matrix4f3);
        }
    }

    @Override
    protected void a(int n2) {
        this.x.a(n2 == 1);
    }

    @Override
    protected String a() {
        return this.x.a().a();
    }

    @Override
    protected float a() {
        return this.c / 2.0f - 5.66f;
    }

    @Override
    protected int a() {
        return 2;
    }
}

