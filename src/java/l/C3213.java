package l;

import java.util.Locale;

/* compiled from: L530 */
/* renamed from: l.ۗۨۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3213 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final float[] f10108 = {0.00390625f, 3.051758E-5f, 1.192093E-7f, 4.656613E-10f};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String[] f10105 = {"px", "dp", "sp", "pt", "in", "mm", "", ""};

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final String[] f10107 = {"%", "%p", "", "", "", "", "", ""};

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f10106 = {100, 100, 1, 1, 1, 1, 1, 1};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m9856(int i, int i2) {
        float f = (i & (-256)) * i2 * f10108[(i >> 4) & 3];
        char[] charArray = String.format(Locale.ENGLISH, "%f", Float.valueOf(f)).toCharArray();
        int length = charArray.length - 1;
        while (true) {
            if (length <= 0) {
                break;
            }
            char c = charArray[length];
            if (c == '0') {
                length--;
            } else if (c == '.') {
                length--;
            }
        }
        String str = new String(charArray, 0, length + 1);
        int indexOf = str.indexOf(46);
        return (indexOf == -1 || f < 1.0f || Math.abs(f - ((float) ((int) f))) >= 0.001f) ? str : str.substring(0, indexOf);
    }
}
