/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import net.minecraft.class_1304;
import net.minecraft.class_1308;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_243;

public class dv
extends aT {
    private /* synthetic */ jh a;
    private /* synthetic */ jh b;
    private /* synthetic */ jh c;
    private /* synthetic */ gz d;
    private /* synthetic */ dw e;
    private /* synthetic */ lw f;
    private /* synthetic */ dw g;
    private /* synthetic */ lw h;
    private /* synthetic */ dw i;
    private /* synthetic */ lw j;
    private /* synthetic */ dw k;
    private /* synthetic */ dw l;
    private /* synthetic */ lw m;
    private /* synthetic */ lw n;
    private /* synthetic */ dw o;
    private /* synthetic */ gz p;
    private /* synthetic */ gz q;
    private /* synthetic */ lw r;
    private /* synthetic */ dw s;
    private /* synthetic */ lw t;
    private /* synthetic */ gz u;
    private /* synthetic */ gz v;
    private /* synthetic */ gz w;
    private /* synthetic */ lw x;
    private /* synthetic */ dw y;
    private /* synthetic */ dw z;
    private /* synthetic */ gz A;
    private /* synthetic */ gz B;
    private /* synthetic */ lw C;
    private /* synthetic */ lw D;
    private final /* synthetic */ hV E;
    private /* synthetic */ float F;
    private /* synthetic */ boolean G;
    private /* synthetic */ long H;
    private final /* synthetic */ ArrayList<class_1309> I;
    private final /* synthetic */ ArrayList<class_1309> J;
    private final /* synthetic */ ArrayList<class_1309> K;

    public /* synthetic */ dv() {
        super("\u041f\u043b\u0430\u0439\u0435\u0440\u0415\u0417\u041f", fV.d);
        jh jh2 = new jh("", "", Arrays.asList(ec.join(new String[]{"\u0418", "\u0433", "\u0440", "o", "\u043a", "\u0438"}), ec.join(new String[]{"M", "\u043e", "\u0431", "\u044b"}), ec.join(new String[]{"\u0412", "c", "\u0435"})), List.of(ec.join(new String[]{"\u0418", "\u0433", "\u0440", "o", "\u043a", "\u0438"})), false);
        jh2.setNameParts(new String[]{"\u0426", "e", "\u043b", "\u0438"});
        jh2.setDescriptionParts(new String[]{"\u041d", "a", " ", "\u043a", "o", "\u0433", "\u043e", " ", "\u0440", "a", "\u0431", "\u043e", "\u0442", "\u0430", "\u0435", "\u0442", " ", "E", "\u0421", "\u041f"});
        this.a = jh2;
        jh jh3 = new jh("", "", Arrays.asList(ec.join(new String[]{"\u0411", "\u043e", "\u043a", "\u0441"}), ec.join(new String[]{"C", "\u0432", "\u0435", "\u0447", "\u0435", "\u043d", "\u0438", "\u0435"})), List.of(ec.join(new String[]{"\u0411", "\u043e", "\u043a", "\u0441"})), false);
        jh3.setNameParts(new String[]{"\u0420", "e", "\u0436", "\u0438", "\u043c"});
        jh3.setDescriptionParts(new String[]{"\u0420", "e", "\u0436", "\u0438", "\u043c", " ", "o", "\u0442", "\u043e", "\u0431", "\u0440", "\u0430", "\u0436", "\u0435", "\u043d", "\u0438", "\u044f"});
        this.b = jh3;
        jh jh4 = new jh("", "", Arrays.asList(ec.join(new String[]{"\u0412", "c", "\u0435"}), ec.join(new String[]{"T", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u0432", " ", "\u0431", "\u0440", "o", "\u043d", "\u0435"}), ec.join(new String[]{"\u0422", "\u043e", "\u043b", "\u044c", "\u043a", "\u043e", " ", "\u0432", " ", "\u043d", "\u0435", "\u0437", "\u0435", "\u0440", "\u0438", "\u0442", "\u0435"})), List.of(ec.join(new String[]{"\u0412", "c", "\u0435"})), false);
        jh4.setNameParts(new String[]{"\u0424", "\u0438", "\u043b", "\u044c", "\u0442", "p", " ", "\u043f", "o", " ", "\u0431", "\u0440", "o", "\u043d", "\u0435"});
        jh4.setDescriptionParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0438", "\u0433", "\u0440", "o", "\u043a", "\u043e", "\u0432", " ", "\u0432", " ", "\u0437", "a", "\u0432", "\u0438", "\u0441", "\u0438", "\u043c", "\u043e", "\u0441", "\u0442", "\u0438", " ", "o", "\u0442", " ", "\u0431", "\u0440", "o", "\u043d", "\u0438"});
        this.c = jh4;
        gz gz2 = new gz("", "", 2.0, 0.1, 5.0, 0.1);
        gz2.setNameParts(new String[]{"T", "\u043e", "\u043b", "\u0449", "\u0438", "\u043d", "\u0430", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0438"});
        gz2.setDescriptionParts(new String[]{"T", "\u043e", "\u043b", "\u0449", "\u0438", "\u043d", "\u0430", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0439"});
        this.d = gz2;
        dw dw2 = new dw("", "", true);
        dw2.setNameParts(new String[]{"M", "\u0430", "\u0441", "\u0448", "\u0442", "\u0430", "\u0431", " ", "o", "\u0442", " ", "\u0434", "\u0438", "c", "\u0442", "\u0430", "\u043d", "\u0446", "\u0438", "\u0438"});
        dw2.setDescriptionParts(new String[]{"\u0423", "\u0442", "o", "\u043b", "\u0449", "\u0430", "\u0442", "\u044c", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0438", " ", "c", " ", "\u0440", "a", "\u0441", "\u0441", "\u0442", "\u043e", "\u044f", "\u043d", "\u0438", "\u0435", "\u043c"});
        this.e = dw2;
        lw lw2 = new lw("", "", -1, true);
        lw2.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0439"});
        lw2.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0439"});
        this.f = lw2;
        dw dw3 = new dw("", "", false);
        dw3.setNameParts(new String[]{"O", "\u0431", "\u0432", "\u043e", "\u0434", "\u043a", "\u0430"});
        dw3.setDescriptionParts(new String[]{"T", "\u0451", "\u043c", "\u043d", "\u0430", "\u044f", " ", "o", "\u0431", "\u0432", "\u043e", "\u0434", "\u043a", "\u0430", " ", "\u0432", "o", "\u043a", "\u0440", "\u0443", "\u0433", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0439", " ", "\u0434", "\u043b", "\u044f", " ", "\u043a", "o", "\u043d", "\u0442", "\u0440", "\u0430", "\u0441", "\u0442", "\u0430"});
        this.g = dw3;
        lw lw3 = new lw("", "", -16777216, true);
        lw3.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "o", "\u0431", "\u0432", "\u043e", "\u0434", "\u043a", "\u0438"});
        lw3.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "o", "\u0431", "\u0432", "\u043e", "\u0434", "\u043a", "\u0438", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0439"});
        this.h = lw3;
        dw dw4 = new dw("", "", false);
        dw4.setNameParts(new String[]{"\u0417", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0430"});
        dw4.setDescriptionParts(new String[]{"\u0417", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0430", " ", "\u0432", "\u043d", "y", "\u0442", "\u0440", "\u0438", " ", "\u0431", "o", "\u043a", "\u0441", "\u0430"});
        this.i = dw4;
        lw lw4 = new lw("", "", 0x4CFFFFFF, true);
        lw4.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u0437", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0438"});
        lw4.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u0437", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0438"});
        this.j = lw4;
        dw dw5 = new dw("", "", true);
        dw5.setNameParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "\u0434", "\u0440", "\u0443", "\u0437", "e", "\u0439"});
        dw5.setDescriptionParts(new String[]{"O", "\u0442", "\u043e", "\u0431", "\u0440", "\u0430", "\u0436", "\u0430", "\u0442", "\u044c", " ", "\u0434", "\u0440", "\u0443", "\u0437", "e", "\u0439"});
        this.k = dw5;
        dw dw6 = new dw("", "", false);
        dw6.setNameParts(new String[]{"C", "\u0432", "\u043e", "\u0439", " ", "\u0446", "\u0432", "e", "\u0442", " ", "\u0434", "\u043b", "\u044f", " ", "\u0434", "\u0440", "\u0443", "\u0437", "e", "\u0439"});
        dw6.setDescriptionParts(new String[]{"\u0418", "c", "\u043f", "\u043e", "\u043b", "\u044c", "\u0437", "\u043e", "\u0432", "\u0430", "\u0442", "\u044c", " ", "o", "\u0442", "\u0434", "\u0435", "\u043b", "\u044c", "\u043d", "\u044b", "\u0439", " ", "\u0446", "\u0432", "e", "\u0442", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0439", "/", "\u0437", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0438", " ", "\u0434", "\u043b", "\u044f", " ", "\u0434", "\u0440", "\u0443", "\u0437", "e", "\u0439"});
        this.l = dw6;
        lw lw5 = new lw("", "", -16711681, true);
        lw5.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0439", " ", "\u0434", "\u0440", "\u0443", "\u0437", "e", "\u0439"});
        lw5.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0439", " ", "\u0434", "\u043b", "\u044f", " ", "\u0434", "\u0440", "\u0443", "\u0437", "e", "\u0439"});
        this.m = lw5;
        lw lw6 = new lw("", "", 1275133951, true);
        lw6.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u0437", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0438", " ", "\u0434", "\u0440", "\u0443", "\u0437", "e", "\u0439"});
        lw6.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u0437", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0438", " ", "\u0434", "\u043b", "\u044f", " ", "\u0434", "\u0440", "\u0443", "\u0437", "e", "\u0439"});
        this.n = lw6;
        dw dw7 = new dw("", "", true);
        dw7.setNameParts(new String[]{"C", "\u0432", "\u0435", "\u0447", "\u0435", "\u043d", "\u0438", "\u0435", " ", "\u0431", "o", "\u043a", "\u0441", "\u0430"});
        dw7.setDescriptionParts(new String[]{"M", "\u044f", "\u0433", "\u043a", "\u043e", "\u0435", " ", "\u0440", "a", "\u0437", "\u043c", "\u044b", "\u0442", "\u043e", "\u0435", " ", "c", "\u0432", "\u0435", "\u0447", "\u0435", "\u043d", "\u0438", "\u0435", " ", "\u0432", "o", "\u043a", "\u0440", "\u0443", "\u0433", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0439", " ", "(", "p", "o", "s", "t", "-", "e", "f", "f", "e", "c", "t", ")"});
        this.o = dw7;
        gz gz3 = new gz("", "", 20.0, 4.0, 96.0, 1.0, "px", 0);
        gz3.setNameParts(new String[]{"\u0420", "a", "\u0434", "\u0438", "\u0443", "\u0441", " ", "c", "\u0432", "\u0435", "\u0447", "\u0435", "\u043d", "\u0438", "\u044f", " ", "\u0431", "o", "\u043a", "\u0441", "\u0430"});
        gz3.setDescriptionParts(new String[]{"\u0420", "a", "\u0434", "\u0438", "\u0443", "\u0441", " ", "\u0440", "a", "\u0437", "\u043c", "\u044b", "\u0442", "\u0438", "\u044f", " ", "c", "\u0432", "\u0435", "\u0447", "\u0435", "\u043d", "\u0438", "\u044f", " ", "\u0432", " ", "\u043f", "\u0438", "\u043a", "c", "\u0435", "\u043b", "\u044f", "\u0445"});
        this.p = gz3;
        gz gz4 = new gz("", "", 1.0, 0.1, 4.0, 0.05, "", 2);
        gz4.setNameParts(new String[]{"\u042f", "\u0440", "\u043a", "o", "\u0441", "\u0442", "\u044c", " ", "c", "\u0432", "\u0435", "\u0447", "\u0435", "\u043d", "\u0438", "\u044f", " ", "\u0431", "o", "\u043a", "\u0441", "\u0430"});
        gz4.setDescriptionParts(new String[]{"\u042f", "\u0440", "\u043a", "o", "\u0441", "\u0442", "\u044c", " ", "c", "\u0432", "\u0435", "\u0447", "\u0435", "\u043d", "\u0438", "\u044f"});
        this.q = gz4;
        lw lw7 = new lw("", "", -13183233, true);
        lw7.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "c", "\u0432", "\u0435", "\u0447", "\u0435", "\u043d", "\u0438", "\u044f"});
        lw7.setDescriptionParts(new String[]{"O", "\u0441", "\u043d", "\u043e", "\u0432", "\u043d", "\u043e", "\u0439", " ", "\u0446", "\u0432", "e", "\u0442", " ", "o", "\u0440", "\u0435", "\u043e", "\u043b", "\u0430", " ", "\u0432", "o", "\u043a", "\u0440", "\u0443", "\u0433", " ", "\u0438", "\u0433", "\u0440", "o", "\u043a", "\u043e", "\u0432"});
        this.r = lw7;
        dw dw8 = new dw("", "", false);
        dw8.setNameParts(new String[]{"\u0413", "\u0440", "a", "\u0434", "\u0438", "\u0435", "\u043d", "\u0442"});
        dw8.setDescriptionParts(new String[]{"\u041f", "\u043b", "a", "\u0432", "\u043d", "\u044b", "\u0439", " ", "\u043f", "e", "\u0440", "\u0435", "\u0445", "\u043e", "\u0434", " ", "\u043c", "e", "\u0436", "\u0434", "\u0443", " ", "\u0434", "\u0432", "y", "\u043c", "\u044f", " ", "\u0446", "\u0432", "e", "\u0442", "\u0430", "\u043c", "\u0438"});
        this.s = dw8;
        lw lw8 = new lw("", "", -38090, true);
        lw8.setNameParts(new String[]{"\u0412", "\u0442", "o", "\u0440", "\u043e", "\u0439", " ", "\u0446", "\u0432", "e", "\u0442"});
        lw8.setDescriptionParts(new String[]{"\u0412", "\u0442", "o", "\u0440", "\u043e", "\u0439", " ", "\u0446", "\u0432", "e", "\u0442", " ", "\u0433", "\u0440", "a", "\u0434", "\u0438", "\u0435", "\u043d", "\u0442", "\u0430"});
        this.t = lw8;
        gz gz5 = new gz("", "", 0.0, 0.0, 5.0, 0.05);
        gz5.setNameParts(new String[]{"C", "\u043a", "\u043e", "\u0440", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u0433", "\u0440", "a", "\u0434", "\u0438", "\u0435", "\u043d", "\u0442", "\u0430"});
        gz5.setDescriptionParts(new String[]{"C", "\u043a", "\u043e", "\u0440", "\u043e", "\u0441", "\u0442", "\u044c", " ", "\u0434", "\u0432", "\u0438", "\u0436", "e", "\u043d", "\u0438", "\u044f", " ", "\u0433", "\u0440", "a", "\u0434", "\u0438", "\u0435", "\u043d", "\u0442", "\u0430", " ", "(", "0", " ", "\u2014", " ", "c", "\u0442", "\u0430", "\u0442", "\u0438", "\u0447", "\u043d", "\u043e", ")"});
        this.u = gz5;
        gz gz6 = new gz("", "", 24.0, 4.0, 96.0, 1.0);
        gz6.setNameParts(new String[]{"\u0420", "a", "\u0434", "\u0438", "\u0443", "\u0441", " ", "c", "\u0432", "\u0435", "\u0447", "\u0435", "\u043d", "\u0438", "\u044f"});
        gz6.setDescriptionParts(new String[]{"\u0420", "a", "\u0434", "\u0438", "\u0443", "\u0441", " ", "o", "\u0440", "\u0435", "\u043e", "\u043b", "\u0430", " ", "\u0432", " ", "\u043f", "\u0438", "\u043a", "c", "\u0435", "\u043b", "\u044f", "\u0445"});
        this.v = gz6;
        gz gz7 = new gz("", "", 1.5, 0.3, 4.0, 0.05);
        gz7.setNameParts(new String[]{"\u042f", "\u0440", "\u043a", "o", "\u0441", "\u0442", "\u044c", " ", "c", "\u0432", "\u0435", "\u0447", "\u0435", "\u043d", "\u0438", "\u044f"});
        gz7.setDescriptionParts(new String[]{"\u042f", "\u0440", "\u043a", "o", "\u0441", "\u0442", "\u044c", " ", "o", "\u0440", "\u0435", "\u043e", "\u043b", "\u0430"});
        this.w = gz7;
        lw lw9 = new lw("", "", 0xFFFFFF, true);
        lw9.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u0437", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0438", " ", "c", "\u0438", "\u043b", "\u0443", "\u044d", "\u0442", "\u0430"});
        lw9.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "\u0437", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0438", " ", "\u0432", "\u043d", "y", "\u0442", "\u0440", "\u0438", " ", "c", "\u0438", "\u043b", "\u0443", "\u044d", "\u0442", "\u0430"});
        this.x = lw9;
        dw dw9 = new dw("", "", true);
        dw9.setNameParts(new String[]{"C", "\u0432", "\u0435", "\u0447", "\u0435", "\u043d", "\u0438", "\u0435", " ", "c", "\u043a", "\u0432", "\u043e", "\u0437", "\u044c", " ", "c", "\u0442", "\u0435", "\u043d", "\u044b"});
        dw9.setDescriptionParts(new String[]{"\u041f", "o", "\u043a", "\u0430", "\u0437", "\u044b", "\u0432", "\u0430", "\u0442", "\u044c", " ", "c", "\u0432", "\u0435", "\u0447", "\u0435", "\u043d", "\u0438", "\u0435", " ", "\u0447", "e", "\u0440", "\u0435", "\u0437", " ", "\u0431", "\u043b", "o", "\u043a", "\u0438"});
        this.y = dw9;
        dw dw10 = new dw("", "", false);
        dw10.setNameParts(new String[]{"B", "\u043a", "\u043b", "\u044e", "\u0447", "\u0438", "\u0442", "\u044c", " ", "a", "\u043d", "\u0438", "\u043c", "\u0430", "\u0446", "\u0438", "\u044e"});
        dw10.setDescriptionParts(new String[]{"\u0412", "o", "\u043b", "\u043d", "\u0438", "\u0441", "\u0442", "\u0430", "\u044f", " ", "o", "\u0433", "\u043d", "\u0435", "\u043d", "\u043d", "\u0430", "\u044f", " ", "o", "\u0431", "\u0432", "\u043e", "\u0434", "\u043a", "\u0430"});
        this.z = dw10;
        gz gz8 = new gz("", "", 1.0, 0.0, 3.0, 0.05);
        gz8.setNameParts(new String[]{"C", "\u0438", "\u043b", "\u0430", " ", "a", "\u043d", "\u0438", "\u043c", "\u0430", "\u0446", "\u0438", "\u0438"});
        gz8.setDescriptionParts(new String[]{"\u0414", "\u0440", "o", "\u0436", "\u0430", "\u043d", "\u0438", "\u0435", " ", "\u0438", " ", "\u0438", "c", "\u043a", "\u0430", "\u0436", "\u0435", "\u043d", "\u0438", "\u0435", " ", "o", "\u0431", "\u0432", "\u043e", "\u0434", "\u043a", "\u0438"});
        this.A = gz8;
        gz gz9 = new gz("", "", 1.0, 1.0, 2.5, 0.05);
        gz9.setNameParts(new String[]{"\u0420", "a", "\u0437", "\u043c", "\u0435", "\u0440", " ", "a", "\u043d", "\u0438", "\u043c", "\u0430", "\u0446", "\u0438", "\u0438"});
        gz9.setDescriptionParts(new String[]{"\u0420", "a", "\u0441", "\u0448", "\u0438", "\u0440", "\u0435", "\u043d", "\u0438", "\u0435", " ", "o", "\u0440", "\u0435", "\u043e", "\u043b", "\u0430", " ", "\u0432", "o", "\u043a", "\u0440", "\u0443", "\u0433", " ", "c", "\u0438", "\u043b", "\u0443", "\u044d", "\u0442", "\u0430"});
        this.B = gz9;
        lw lw10 = new lw("", "", -16711681, true);
        lw10.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "c", "\u0432", "\u0435", "\u0447", "\u0435", "\u043d", "\u0438", "\u044f", " ", "\u0434", "\u0440", "\u0443", "\u0437", "e", "\u0439"});
        lw10.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", " ", "o", "\u0440", "\u0435", "\u043e", "\u043b", "\u0430", " ", "\u0434", "\u043b", "\u044f", " ", "\u0434", "\u0440", "\u0443", "\u0437", "e", "\u0439"});
        this.C = lw10;
        lw lw11 = new lw("", "", -256, true);
        lw11.setNameParts(new String[]{"\u0412", "\u0442", "o", "\u0440", "\u043e", "\u0439", " ", "\u0446", "\u0432", "e", "\u0442", " ", "\u0434", "\u0440", "\u0443", "\u0437", "e", "\u0439"});
        lw11.setDescriptionParts(new String[]{"\u0412", "\u0442", "o", "\u0440", "\u043e", "\u0439", " ", "\u0446", "\u0432", "e", "\u0442", " ", "\u0433", "\u0440", "a", "\u0434", "\u0438", "\u0435", "\u043d", "\u0442", "\u0430", " ", "\u0434", "\u043b", "\u044f", " ", "\u0434", "\u0440", "\u0443", "\u0437", "e", "\u0439"});
        this.D = lw11;
        this.E = new hV();
        this.H = System.currentTimeMillis();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new ArrayList();
        Supplier<Boolean> supplier = () -> this.b.b("C\u0432\u0435\u0447\u0435\u043d\u0438\u0435");
        Supplier<Boolean> supplier2 = () -> (Boolean)supplier.get() == false;
        Supplier<Boolean> supplier3 = () -> this.a.b("\u0418\u0433\u0440o\u043a\u0438") || this.a.b("\u0412c\u0435");
        Supplier<Boolean> supplier4 = () -> this.k.a() && (Boolean)supplier3.get() != false;
        this.k.a(supplier3::get);
        this.c.a(supplier3::get);
        this.h.a(this.g::a);
        this.j.a(this.i::a);
        this.p.a(this.o::a);
        this.q.a(this.o::a);
        this.m.a(this.l::a);
        this.n.a(() -> this.l.a() && this.i.a());
        hE hE2 = new hE("", "", this.d, this.e);
        hE2.setNameParts(new String[]{"\u0424", "o", "\u0440", "\u043c", "\u0430"});
        hE2.setDescriptionParts(new String[]{"\u041f", "a", "\u0440", "\u0430", "\u043c", "\u0435", "\u0442", "\u0440", "\u044b", " ", "\u0433", "e", "\u043e", "\u043c", "\u0435", "\u0442", "\u0440", "\u0438", "\u0438", " ", "\u0431", "o", "\u043a", "\u0441", "\u0430", "."});
        hE hE3 = hE2;
        hE3.a(supplier2::get);
        hE hE4 = new hE("", "", this.f, this.g, this.h, this.i, this.j);
        hE4.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", "\u0430"});
        hE4.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", "\u0430", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0439", ",", " ", "o", "\u0431", "\u0432", "\u043e", "\u0434", "\u043a", "\u0438", " ", "\u0438", " ", "\u0437", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0438", "."});
        hE hE5 = hE4;
        hE5.a(supplier2::get);
        hE hE6 = new hE("", "", this.o, this.p, this.q);
        hE6.setNameParts(new String[]{"C", "\u0432", "\u0435", "\u0447", "\u0435", "\u043d", "\u0438", "\u0435", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0439"});
        hE6.setDescriptionParts(new String[]{"M", "\u044f", "\u0433", "\u043a", "\u043e", "\u0435", " ", "p", "o", "s", "t", "-", "e", "f", "f", "e", "c", "t", " ", "c", "\u0432", "\u0435", "\u0447", "\u0435", "\u043d", "\u0438", "\u0435", " ", "\u0432", "o", "\u043a", "\u0440", "\u0443", "\u0433", " ", "\u043b", "\u0438", "\u043d", "\u0438", "\u0439", " ", "\u0431", "o", "\u043a", "\u0441", "\u0430", "."});
        hE hE7 = hE6;
        hE7.a(supplier2::get);
        hE hE8 = new hE("", "", this.l, this.m, this.n);
        hE8.setNameParts(new String[]{"\u0414", "p", "\u0443", "\u0437", "\u044c", "\u044f"});
        hE8.setDescriptionParts(new String[]{"O", "\u0442", "\u0434", "\u0435", "\u043b", "\u044c", "\u043d", "\u044b", "\u0435", " ", "\u0446", "\u0432", "e", "\u0442", "\u0430", " ", "\u0434", "\u043b", "\u044f", " ", "\u0434", "\u0440", "\u0443", "\u0437", "e", "\u0439", "."});
        hE hE9 = hE8;
        hE9.a(() -> (Boolean)supplier2.get() != false && (Boolean)supplier4.get() != false);
        this.y.a(supplier::get);
        this.t.a(this.s::a);
        this.u.a(this.s::a);
        this.A.a(this.z::a);
        this.B.a(this.z::a);
        this.C.a(supplier4::get);
        this.D.a(() -> (Boolean)supplier4.get() != false && this.s.a());
        hE hE10 = new hE("", "", this.s, this.r, this.t, this.u, this.x, this.C, this.D);
        hE10.setNameParts(new String[]{"\u0426", "\u0432", "e", "\u0442", "\u0430", " ", "c", "\u0432", "\u0435", "\u0447", "\u0435", "\u043d", "\u0438", "\u044f"});
        hE10.setDescriptionParts(new String[]{"\u0426", "\u0432", "e", "\u0442", "\u0430", " ", "c", "\u0432", "\u0435", "\u0447", "\u0435", "\u043d", "\u0438", "\u044f", " ", "\u0438", " ", "\u0437", "a", "\u043b", "\u0438", "\u0432", "\u043a", "\u0438", " ", "c", "\u0438", "\u043b", "\u0443", "\u044d", "\u0442", "\u0430", "."});
        hE hE11 = hE10;
        hE11.a(supplier::get);
        hE hE12 = new hE("", "", this.v, this.w);
        hE12.setNameParts(new String[]{"O", "\u0440", "\u0435", "\u043e", "\u043b"});
        hE12.setDescriptionParts(new String[]{"\u041f", "a", "\u0440", "\u0430", "\u043c", "\u0435", "\u0442", "\u0440", "\u044b", " ", "o", "\u0440", "\u0435", "\u043e", "\u043b", "\u0430", " ", "\u0432", "o", "\u043a", "\u0440", "\u0443", "\u0433", " ", "c", "\u0438", "\u043b", "\u0443", "\u044d", "\u0442", "\u0430", "."});
        hE hE13 = hE12;
        hE13.a(supplier::get);
        hE hE14 = new hE("", "", this.z, this.A, this.B);
        hE14.setNameParts(new String[]{"A", "\u043d", "\u0438", "\u043c", "\u0430", "\u0446", "\u0438", "\u044f"});
        hE14.setDescriptionParts(new String[]{"O", "\u0433", "\u043d", "\u0435", "\u043d", "\u043d", "\u0430", "\u044f", " ", "\u0432", "o", "\u043b", "\u043d", "\u0438", "\u0441", "\u0442", "\u0430", "\u044f", " ", "o", "\u0431", "\u0432", "\u043e", "\u0434", "\u043a", "\u0430", "."});
        hE hE15 = hE14;
        hE15.a(supplier::get);
        this.a(this.a, this.b, this.k, this.c, hE3, hE5, hE7, hE9, hE11, hE13, hE15, this.y);
    }

    public /* bridge */ /* synthetic */ lw e() {
        return this.D;
    }

    public /* bridge */ /* synthetic */ boolean i() {
        return this.s.a();
    }

    private /* bridge */ /* synthetic */ boolean b(class_1657 class_16572) {
        if (this.c.b("\u0422\u043e\u043b\u044c\u043a\u043e \u0432 \u043d\u0435\u0437\u0435\u0440\u0438\u0442\u0435")) {
            return dv.d(class_16572);
        }
        if (this.c.b("T\u043e\u043b\u044c\u043a\u043e \u0432 \u0431\u0440o\u043d\u0435")) {
            return dv.c(class_16572);
        }
        return true;
    }

    public /* bridge */ /* synthetic */ float b() {
        return this.B.a();
    }

    public /* bridge */ /* synthetic */ boolean b() {
        return this.y.a();
    }

    public /* bridge */ /* synthetic */ double b() {
        return this.w.d();
    }

    public /* bridge */ /* synthetic */ lw b() {
        return this.x;
    }

    public /* bridge */ /* synthetic */ float c() {
        return this.u.a();
    }

    private static /* bridge */ /* synthetic */ boolean c(class_1657 class_16572) {
        for (class_1799 class_17992 : class_16572.method_5661()) {
            if (class_17992.method_7960()) continue;
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean c() {
        return this.k.a();
    }

    public /* bridge */ /* synthetic */ lw c() {
        return this.C;
    }

    public /* bridge */ /* synthetic */ double c() {
        return (double)this.x.g() / 255.0;
    }

    public /* bridge */ /* synthetic */ boolean h() {
        return this.z.a();
    }

    @Override
    public /* bridge */ /* synthetic */ void h() {
        this.G = true;
        this.H = System.currentTimeMillis();
    }

    private static /* bridge */ /* synthetic */ boolean d(class_1657 class_16572) {
        class_1799 class_17992 = class_16572.method_6118(class_1304.field_6169);
        class_1799 class_17993 = class_16572.method_6118(class_1304.field_6174);
        class_1799 class_17994 = class_16572.method_6118(class_1304.field_6172);
        class_1799 class_17995 = class_16572.method_6118(class_1304.field_6166);
        if (!class_17992.method_31574(class_1802.field_22027)) {
            return false;
        }
        if (!class_17994.method_31574(class_1802.field_22029)) {
            return false;
        }
        if (!class_17995.method_31574(class_1802.field_22030)) {
            return false;
        }
        return class_17993.method_31574(class_1802.field_22028) || class_17993.method_31574(class_1802.field_8833);
    }

    public /* bridge */ /* synthetic */ lw d() {
        return this.t;
    }

    public /* bridge */ /* synthetic */ double a() {
        return this.v.d();
    }

    public /* bridge */ /* synthetic */ lw a() {
        return this.r;
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return this.b.b("C\u0432\u0435\u0447\u0435\u043d\u0438\u0435");
    }

    public /* bridge */ /* synthetic */ boolean a(class_1657 class_16572) {
        return this.b(class_16572);
    }

    public /* bridge */ /* synthetic */ float a() {
        return this.A.a();
    }

    private /* bridge */ /* synthetic */ void a(boolean bl2, List list, float f2, H h2, int n2, boolean bl3, int n3) {
        float f3 = ie.a(n3);
        float f4 = ie.b(n3);
        float f5 = ie.c(n3);
        float f6 = ie.d(n3) * this.F;
        float f7 = ie.a(n2);
        float f8 = ie.b(n2);
        float f9 = ie.c(n2);
        float f10 = ie.d(n2) * this.F;
        int n4 = this.h.a();
        boolean bl4 = this.g.a();
        this.E.a(bl2);
        float f11 = this.q.a();
        float f12 = this.p.a();
        boolean bl5 = this.o.a();
        this.E.a(bl5, f11, f12);
        this.E.a(bl4, n4);
        float f13 = f10;
        float f14 = f9;
        float f15 = f8;
        float f16 = f7;
        boolean bl6 = bl3;
        float f17 = f2;
        float f18 = f6;
        float f19 = f5;
        float f20 = f4;
        float f21 = f3;
        List list2 = list;
        H h3 = h2;
        this.E.a(f16, f19, list2, f18, f20, f15, f13, bl6, f14, f21, h3, f17);
    }

    private /* bridge */ /* synthetic */ List a(H h2) {
        boolean bl2;
        boolean bl3 = this.a.b("\u0418\u0433\u0440o\u043a\u0438") || this.a.b("\u0412c\u0435");
        boolean bl4 = bl2 = this.a.b("M\u043e\u0431\u044b") || this.a.b("\u0412c\u0435");
        if (!bl3 && !bl2) {
            return Collections.emptyList();
        }
        class_1657 class_16572 = this.b();
        class_243 class_2432 = class_16572.method_19538();
        boolean bl5 = this.k.a();
        ArrayList<class_1309> arrayList = this.I;
        arrayList.clear();
        if (bl3) {
            Iterator<Object> iterator = this.a().method_18456().iterator();
            while (iterator.hasNext()) {
                double d2 = 128.0;
                class_1657 class_16573 = class_16572;
                class_243 class_2433 = class_2432;
                dv dv2 = this;
                boolean bl6 = bl5;
                boolean bl7 = false;
                class_1657 class_16574 = (class_1657)iterator.next();
                class_1657 class_16575 = class_16574;
                if (!kw.a(d2, class_16573, class_2433, dv2, bl6, bl7, class_16575) || !this.b(class_16574)) continue;
                arrayList.add((class_1309)class_16574);
            }
        }
        if (bl2) {
            for (class_1657 class_16574 : this.a().method_18112()) {
                class_1308 class_13082;
                if (!(class_16574 instanceof class_1308) || !(class_13082 = (class_1308)class_16574).method_5805() || class_13082.method_19538().method_1022(class_2432) > 128.0) continue;
                arrayList.add((class_1309)class_13082);
            }
        }
        return arrayList;
    }

    private static /* bridge */ /* synthetic */ float a(float f2) {
        return Math.clamp((float)f2, (float)0.0f, (float)1.0f);
    }

    private /* bridge */ /* synthetic */ void a() {
        long l2 = System.currentTimeMillis();
        float f2 = (float)(l2 - this.H) / 1000.0f;
        this.H = l2;
        float f3 = f2 * 5.0f;
        this.F = dv.a(this.G ? this.F - f3 : this.F + f3);
    }

    @Override
    public /* bridge */ /* synthetic */ void g(H h2) {
        boolean bl2;
        if (this.z() || !this.f() && !this.G) {
            return;
        }
        this.a();
        if (this.G && this.F <= 0.0f) {
            this.G = false;
            return;
        }
        if (this.a()) {
            return;
        }
        List list = this.a(h2);
        if (list.isEmpty()) {
            return;
        }
        float f2 = this.d.a();
        boolean bl3 = this.i.a();
        boolean bl4 = this.e.a();
        boolean bl5 = bl2 = this.l.a() && this.k.a();
        if (!bl2) {
            boolean bl6 = bl4;
            boolean bl7 = bl3;
            float f3 = f2;
            int n2 = this.j.a();
            int n3 = this.f.a();
            List list2 = list;
            H h3 = h2;
            this.a(bl6, list2, f3, h3, n2, bl7, n3);
            return;
        }
        this.J.clear();
        this.K.clear();
        for (class_1309 class_13092 : list) {
            if (this.f(class_13092)) {
                this.J.add(class_13092);
                continue;
            }
            this.K.add(class_13092);
        }
        if (!this.K.isEmpty()) {
            boolean bl8 = bl4;
            boolean bl9 = bl3;
            float f4 = f2;
            int n4 = this.j.a();
            int n5 = this.f.a();
            ArrayList<class_1309> arrayList = this.K;
            H h4 = h2;
            this.a(bl8, arrayList, f4, h4, n4, bl9, n5);
        }
        if (!this.J.isEmpty()) {
            boolean bl10 = bl4;
            boolean bl11 = bl3;
            float f5 = f2;
            int n6 = this.n.a();
            int n7 = this.m.a();
            ArrayList<class_1309> arrayList = this.J;
            H h5 = h2;
            this.a(bl10, arrayList, f5, h5, n6, bl11, n7);
        }
    }

    @Override
    public /* bridge */ /* synthetic */ void g() {
        this.H = System.currentTimeMillis();
        this.F = 0.0f;
        this.G = false;
    }
}

