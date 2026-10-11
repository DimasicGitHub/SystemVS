/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ie {
    public static int b(float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        if (f4 == 0.0f) {
            f6 = f7 = f2;
            f5 = f7;
        } else {
            float f8 = f2 < 0.5f ? f2 * (1.0f + f4) : f2 + f4 - f2 * f4;
            float f9 = 2.0f * f2 - f8;
            f5 = ie.a(f9, f8, f3 + 0.33333334f);
            f6 = ie.a(f9, f8, f3);
            f7 = ie.a(f9, f8, f3 - 0.33333334f);
        }
        return 0xFF000000 | Math.round(f5 * 255.0f) << 16 | Math.round(f6 * 255.0f) << 8 | Math.round(f7 * 255.0f);
    }

    public static int b(float f2, int n2) {
        if (Math.abs(f2 - 1.0f) < 0.001f) {
            return n2;
        }
        float[] fArray = ie.b(n2);
        float f3 = fArray[2];
        float f4 = Math.min(1.0f, Math.max(0.0f, fArray[1] * f2));
        float f5 = fArray[0];
        int n3 = ie.b(f3, f5, f4) & 0xFFFFFF;
        return n2 & 0xFF000000 | n3;
    }

    public static float[] b(int n2) {
        float f2;
        float f3 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f4 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f5 = (float)(n2 & 0xFF) / 255.0f;
        float f6 = Math.max(f3, Math.max(f4, f5));
        float f7 = Math.min(f3, Math.min(f4, f5));
        float f8 = (f6 + f7) / 2.0f;
        if (f6 == f7) {
            return new float[]{0.0f, 0.0f, f8};
        }
        float f9 = f6 - f7;
        float f10 = f2 = f8 > 0.5f ? f9 / (2.0f - f6 - f7) : f9 / (f6 + f7);
        float f11 = f6 == f3 ? (f4 - f5) / f9 + (f4 < f5 ? 6.0f : 0.0f) : (f6 == f4 ? (f5 - f3) / f9 + 2.0f : (f3 - f4) / f9 + 4.0f);
        return new float[]{f11 / 6.0f, f2, f8};
    }

    public static float b(int n2) {
        return (float)(n2 >> 8 & 0xFF) / 255.0f;
    }

    public static float c(int n2) {
        return (float)(n2 & 0xFF) / 255.0f;
    }

    public static float d(int n2) {
        return (float)(n2 >> 24 & 0xFF) / 255.0f;
    }

    private static float a(float f2, float f3, float f4) {
        if (f4 < 0.0f) {
            f4 += 1.0f;
        }
        if (f4 > 1.0f) {
            f4 -= 1.0f;
        }
        if (f4 < 0.16666667f) {
            return f2 + (f3 - f2) * 6.0f * f4;
        }
        if (f4 < 0.5f) {
            return f3;
        }
        if (f4 < 0.6666667f) {
            return f2 + (f3 - f2) * (0.6666667f - f4) * 6.0f;
        }
        return f2;
    }

    public static float a(int n2, int n3) {
        float f2 = (float)((n3 >> 16 & 0xFF) - (n2 >> 16 & 0xFF)) / 255.0f;
        float f3 = (float)((n3 >> 8 & 0xFF) - (n2 >> 8 & 0xFF)) / 255.0f;
        float f4 = (float)((n3 & 0xFF) - (n2 & 0xFF)) / 255.0f;
        return (float)Math.sqrt((f2 * f2 + f3 * f3 + f4 * f4) / 3.0f);
    }

    public static boolean a(int n2, int n3) {
        return (n2 & 0xFFFFFF) == (n3 & 0xFFFFFF);
    }

    public static boolean a(int n2) {
        int n3 = n2 >> 16 & 0xFF;
        int n4 = n2 >> 8 & 0xFF;
        int n5 = n2 & 0xFF;
        return Math.max(n3, Math.max(n4, n5)) < 40;
    }

    public static int a(float f2, int n2) {
        int n3 = Math.round((float)(n2 >>> 24 & 0xFF) * Math.clamp((float)f2, (float)0.0f, (float)1.0f));
        return n2 & 0xFFFFFF | n3 << 24;
    }

    private static float[] a(int n2, int n3, int n4) {
        float f2;
        float f3;
        int n5 = Math.max(n4, Math.max(n3, n2));
        int n6 = Math.min(n4, Math.min(n3, n2));
        float f4 = (float)n5 / 255.0f;
        float f5 = f3 = n5 != 0 ? (float)(n5 - n6) / (float)n5 : 0.0f;
        if (f3 == 0.0f) {
            f2 = 0.0f;
        } else {
            float f6 = n5 - n6;
            float f7 = (float)(n5 - n4) / f6;
            float f8 = (float)(n5 - n3) / f6;
            float f9 = (float)(n5 - n2) / f6;
            f2 = n4 == n5 ? f9 - f8 : (n3 == n5 ? 2.0f + f7 - f9 : 4.0f + f8 - f7);
            if ((f2 /= 6.0f) < 0.0f) {
                f2 += 1.0f;
            }
        }
        return new float[]{f2, f3, f4};
    }

    public static int a(float f2, int n2, float f3, float f4) {
        float f5 = f2;
        float f6 = f3;
        float f7 = f4;
        int n3 = ie.a(f6, f7, f5);
        return n2 << 24 | n3 & 0xFFFFFF;
    }

    public static float[] a(int n2) {
        int n3;
        int n4 = n2 >> 16 & 0xFF;
        int n5 = n2 >> 8 & 0xFF;
        int n6 = n3 = n2 & 0xFF;
        int n7 = n5;
        int n8 = n4;
        return ie.a(n6, n7, n8);
    }

    public static float a(int n2) {
        return (float)(n2 >> 16 & 0xFF) / 255.0f;
    }

    private static int a(float f2, float f3, float f4) {
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        if (f2 == 0.0f) {
            n3 = n4 = (int)(f4 * 255.0f + 0.5f);
            n2 = n4;
        } else {
            float f5 = (f3 - (float)Math.floor(f3)) * 6.0f;
            float f6 = f5 - (float)Math.floor(f5);
            float f7 = f4 * (1.0f - f2);
            float f8 = f4 * (1.0f - f2 * f6);
            float f9 = f4 * (1.0f - f2 * (1.0f - f6));
            switch ((int)f5) {
                case 0: {
                    n2 = (int)(f4 * 255.0f + 0.5f);
                    n3 = (int)(f9 * 255.0f + 0.5f);
                    n4 = (int)(f7 * 255.0f + 0.5f);
                    break;
                }
                case 1: {
                    n2 = (int)(f8 * 255.0f + 0.5f);
                    n3 = (int)(f4 * 255.0f + 0.5f);
                    n4 = (int)(f7 * 255.0f + 0.5f);
                    break;
                }
                case 2: {
                    n2 = (int)(f7 * 255.0f + 0.5f);
                    n3 = (int)(f4 * 255.0f + 0.5f);
                    n4 = (int)(f9 * 255.0f + 0.5f);
                    break;
                }
                case 3: {
                    n2 = (int)(f7 * 255.0f + 0.5f);
                    n3 = (int)(f8 * 255.0f + 0.5f);
                    n4 = (int)(f4 * 255.0f + 0.5f);
                    break;
                }
                case 4: {
                    n2 = (int)(f9 * 255.0f + 0.5f);
                    n3 = (int)(f7 * 255.0f + 0.5f);
                    n4 = (int)(f4 * 255.0f + 0.5f);
                    break;
                }
                case 5: {
                    n2 = (int)(f4 * 255.0f + 0.5f);
                    n3 = (int)(f7 * 255.0f + 0.5f);
                    n4 = (int)(f8 * 255.0f + 0.5f);
                }
            }
        }
        return 0xFF000000 | n2 << 16 | n3 << 8 | n4;
    }

    public static Integer a(String string) {
        if (string == null) {
            return null;
        }
        if ((string = string.trim()).startsWith("#")) {
            string = string.substring(1);
        }
        try {
            int n2;
            int n3;
            if (string.length() == 3) {
                StringBuilder stringBuilder = new StringBuilder(6);
                for (n3 = 0; n3 < 3; ++n3) {
                    n2 = string.charAt(n3);
                    stringBuilder.append((char)n2).append((char)n2);
                }
                string = stringBuilder.toString();
            }
            if (string.length() == 6) {
                int n4 = Integer.parseInt(string.substring(0, 2), 16);
                n3 = Integer.parseInt(string.substring(2, 4), 16);
                n2 = Integer.parseInt(string.substring(4, 6), 16);
                return 0xFF000000 | n4 << 16 | n3 << 8 | n2;
            }
            if (string.length() == 8) {
                int n5 = Integer.parseInt(string.substring(0, 2), 16);
                n3 = Integer.parseInt(string.substring(2, 4), 16);
                n2 = Integer.parseInt(string.substring(4, 6), 16);
                int n6 = Integer.parseInt(string.substring(6, 8), 16);
                return n6 << 24 | n5 << 16 | n3 << 8 | n2;
            }
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        return null;
    }

    public static int a(float f2) {
        int n2;
        int n3;
        float f3 = (f2 - (float)Math.floor(f2)) * 6.0f;
        int n4 = (int)f3;
        float f4 = f3 - (float)n4;
        float f5 = 0.14999998f;
        float f6 = 1.0f - 0.85f * f4;
        float f7 = 1.0f - 0.85f * (1.0f - f4);
        return 0x78000000 | n3 << 16 | n2 << 8 | (switch (n4) {
            case 0 -> {
                n3 = 255;
                n2 = (int)(f7 * 255.0f + 0.5f);
                yield (int)(f5 * 255.0f + 0.5f);
            }
            case 1 -> {
                n3 = (int)(f6 * 255.0f + 0.5f);
                n2 = 255;
                yield (int)(f5 * 255.0f + 0.5f);
            }
            case 2 -> {
                n3 = (int)(f5 * 255.0f + 0.5f);
                n2 = 255;
                yield (int)(f7 * 255.0f + 0.5f);
            }
            case 3 -> {
                n3 = (int)(f5 * 255.0f + 0.5f);
                n2 = (int)(f6 * 255.0f + 0.5f);
                yield 255;
            }
            case 4 -> {
                n3 = (int)(f7 * 255.0f + 0.5f);
                n2 = (int)(f5 * 255.0f + 0.5f);
                yield 255;
            }
            default -> {
                n3 = 255;
                n2 = (int)(f5 * 255.0f + 0.5f);
                yield (int)(f6 * 255.0f + 0.5f);
            }
        });
    }
}

