package l;

import java.text.DecimalFormat;

/* compiled from: U5B8 */
/* renamed from: l.ۛ᩵ۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6260 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f19385 = Float.floatToRawIntBits(Float.NaN);

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int f19391 = Float.floatToRawIntBits(Float.MAX_VALUE);

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int f19390 = Float.floatToRawIntBits(3.1415927f);

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int f19389 = Float.floatToRawIntBits(2.7182817f);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final long f19383 = Double.doubleToRawLongBits(Double.NaN);

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final long f19386 = Double.doubleToLongBits(Double.MAX_VALUE);

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final long f19384 = Double.doubleToLongBits(3.141592653589793d);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final long f19387 = Double.doubleToLongBits(2.718281828459045d);

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final DecimalFormat f19388 = new DecimalFormat("0.####################E0");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17271(int i) {
        if (i == f19385 || i == f19391 || i == f19390 || i == f19389) {
            return true;
        }
        if ((i < 0 || i >= 100000000) && i != Integer.MAX_VALUE && i != Integer.MIN_VALUE) {
            int i2 = i >> 24;
            int i3 = (i >> 16) & 255;
            int i4 = 65535 & i;
            if ((i2 == 127 || i2 == 1) && i3 < 31 && i4 < 4095) {
                return false;
            }
            float intBitsToFloat = Float.intBitsToFloat(i);
            if (Float.isNaN(intBitsToFloat)) {
                return false;
            }
            long j = i;
            DecimalFormat decimalFormat = f19388;
            String format = decimalFormat.format(j);
            String format2 = decimalFormat.format(intBitsToFloat);
            int indexOf = format2.indexOf(46);
            int indexOf2 = format2.indexOf("E");
            int indexOf3 = format2.indexOf("000");
            if (indexOf3 > indexOf && indexOf3 < indexOf2) {
                format2 = format2.substring(0, indexOf3) + format2.substring(indexOf2);
            } else {
                int indexOf4 = format2.indexOf("999");
                if (indexOf4 > indexOf && indexOf4 < indexOf2) {
                    format2 = format2.substring(0, indexOf4) + format2.substring(indexOf2);
                }
            }
            if (format2.length() < format.length()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17272(long j) {
        if (j == f19383 || j == f19386 || j == f19384 || j == f19387) {
            return true;
        }
        if (j >= 0 && j < 100000) {
            return j == 1012 || j == 1214 || j == 1417 || j == 1619 || j == 1822 || j == 2024 || j == 4048 || j == 6072 || j == 8096 || j == 10120 || j == 12144 || j == 14168 || j == 16192 || j == 18216 || j == 20240 || j == 40480 || j == 60721 || j == 80961;
        }
        if (j != C13132.FOREVER_NS && j != Long.MIN_VALUE) {
            double longBitsToDouble = Double.longBitsToDouble(j);
            if (Double.isNaN(longBitsToDouble)) {
                return false;
            }
            DecimalFormat decimalFormat = f19388;
            String format = decimalFormat.format(j);
            String format2 = decimalFormat.format(longBitsToDouble);
            int indexOf = format2.indexOf(46);
            int indexOf2 = format2.indexOf("E");
            int indexOf3 = format2.indexOf("000");
            if (indexOf3 > indexOf && indexOf3 < indexOf2) {
                format2 = format2.substring(0, indexOf3) + format2.substring(indexOf2);
            } else {
                int indexOf4 = format2.indexOf("999");
                if (indexOf4 > indexOf && indexOf4 < indexOf2) {
                    format2 = format2.substring(0, indexOf4) + format2.substring(indexOf2);
                }
            }
            if (format2.length() < format.length()) {
                return true;
            }
        }
        return false;
    }
}
