/*
 * Decompiled with CFR 0.152.
 */
final class cp
implements el {
    i a;
    final jf b;
    final /* synthetic */ ik c;

    cp(ik ik2, i i2) {
        this.c = ik2;
        this.a = i2;
        this.b = new jf(4.5f).a(D::d).a();
    }

    @Override
    public float itemHeight() {
        return this.c.b(this.a);
    }

    @Override
    public jf animation() {
        return this.b;
    }
}

