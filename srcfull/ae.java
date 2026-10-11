/*
 * Decompiled with CFR 0.152.
 */
final class ae
implements el {
    final String a;
    final jf b;

    ae(String string) {
        this.a = string;
        this.b = new jf(4.5f).a(D::d).a();
    }

    @Override
    public float itemHeight() {
        return 20.0f;
    }

    @Override
    public jf animation() {
        return this.b;
    }
}

