package l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: 35OG */
/* renamed from: l.ܳܺۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14621 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Pattern f44723 = Pattern.compile("((-)?infinityf)|(nanf)", 2);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Pattern f44722 = Pattern.compile("((-)?infinityd?)|(nand?)", 2);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte m34912(String str) {
        char[] charArray;
        boolean z;
        if (str == null) {
            throw new NumberFormatException("string is null");
        }
        if (str.length() == 0) {
            throw new NumberFormatException("string is blank");
        }
        int i = 1;
        byte b = 0;
        if (str.toUpperCase().endsWith("T")) {
            charArray = str.substring(0, str.length() - 1).toCharArray();
        } else {
            charArray = str.toCharArray();
        }
        if (charArray[0] == '-') {
            z = true;
        } else {
            i = 0;
            z = false;
        }
        if (charArray[i] == '0') {
            int i2 = i + 1;
            if (i2 == charArray.length) {
                return (byte) 0;
            }
            char c = charArray[i2];
            if (c == 'x' || c == 'X') {
                i += 2;
                r6 = 16;
            } else {
                r6 = Character.digit(c, 8) >= 0 ? (byte) 8 : (byte) 10;
                i = i2;
            }
        }
        byte b2 = (byte) (127 / (r6 / 2));
        while (i < charArray.length) {
            int digit = Character.digit(charArray[i], (int) r6);
            if (digit < 0) {
                throw new NumberFormatException("The string contains invalid an digit - '" + charArray[i] + "'");
            }
            byte b3 = (byte) (b * r6);
            if (b > b2) {
                throw new NumberFormatException(str.concat(" cannot fit into a byte"));
            }
            if (b3 < 0 && b3 >= (-digit)) {
                throw new NumberFormatException(str.concat(" cannot fit into a byte"));
            }
            b = (byte) (b3 + digit);
            i++;
        }
        if (!z || b == Byte.MIN_VALUE) {
            return b;
        }
        if (b >= 0) {
            return (byte) (b * (-1));
        }
        throw new NumberFormatException(str.concat(" cannot fit into a byte"));
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static short m34916(String str) {
        char[] charArray;
        boolean z;
        if (str == null) {
            throw new NumberFormatException("string is null");
        }
        if (str.length() == 0) {
            throw new NumberFormatException("string is blank");
        }
        int i = 1;
        short s = 0;
        if (str.toUpperCase().endsWith("S")) {
            charArray = str.substring(0, str.length() - 1).toCharArray();
        } else {
            charArray = str.toCharArray();
        }
        if (charArray[0] == '-') {
            z = true;
        } else {
            i = 0;
            z = false;
        }
        if (charArray[i] == '0') {
            int i2 = i + 1;
            if (i2 == charArray.length) {
                return (short) 0;
            }
            char c = charArray[i2];
            if (c == 'x' || c == 'X') {
                i += 2;
                r6 = 16;
            } else {
                r6 = Character.digit(c, 8) >= 0 ? (short) 8 : (short) 10;
                i = i2;
            }
        }
        short s2 = (short) (EnumC5983.f18409 / (r6 / 2));
        while (i < charArray.length) {
            int digit = Character.digit(charArray[i], (int) r6);
            if (digit < 0) {
                throw new NumberFormatException("The string contains invalid an digit - '" + charArray[i] + "'");
            }
            short s3 = (short) (s * r6);
            if (s > s2) {
                throw new NumberFormatException(str.concat(" cannot fit into a short"));
            }
            if (s3 < 0 && s3 >= (-digit)) {
                throw new NumberFormatException(str.concat(" cannot fit into a short"));
            }
            s = (short) (s3 + digit);
            i++;
        }
        if (!z || s == Short.MIN_VALUE) {
            return s;
        }
        if (s >= 0) {
            return (short) (s * (-1));
        }
        throw new NumberFormatException(str.concat(" cannot fit into a short"));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m34920(String str) {
        int i;
        boolean z;
        if (str == null) {
            throw new NumberFormatException("string is null");
        }
        if (str.length() == 0) {
            throw new NumberFormatException("string is blank");
        }
        char[] charArray = str.toCharArray();
        int i2 = 0;
        if (charArray[0] == '-') {
            i = 1;
            z = true;
        } else {
            i = 0;
            z = false;
        }
        if (charArray[i] == '0') {
            int i3 = i + 1;
            if (i3 == charArray.length) {
                return 0;
            }
            char c = charArray[i3];
            if (c == 'x' || c == 'X') {
                i += 2;
                r6 = 16;
            } else {
                r6 = Character.digit(c, 8) >= 0 ? 8 : 10;
                i = i3;
            }
        }
        int i4 = Integer.MAX_VALUE / (r6 / 2);
        while (i < charArray.length) {
            int digit = Character.digit(charArray[i], r6);
            if (digit < 0) {
                throw new NumberFormatException("The string contains an invalid digit - '" + charArray[i] + "'");
            }
            int i5 = i2 * r6;
            if (i2 > i4) {
                throw new NumberFormatException(str.concat(" cannot fit into an int"));
            }
            if (i5 < 0 && i5 >= (-digit)) {
                throw new NumberFormatException(str.concat(" cannot fit into an int"));
            }
            i2 = i5 + digit;
            i++;
        }
        if (!z || i2 == Integer.MIN_VALUE) {
            return i2;
        }
        if (i2 >= 0) {
            return i2 * (-1);
        }
        throw new NumberFormatException(str.concat(" cannot fit into an int"));
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static long m34919(String str) {
        char[] charArray;
        if (str == null) {
            throw new NumberFormatException("string is null");
        }
        if (str.length() == 0) {
            throw new NumberFormatException("string is blank");
        }
        int i = 0;
        boolean z = true;
        if (str.toUpperCase().endsWith("L")) {
            charArray = str.substring(0, str.length() - 1).toCharArray();
        } else {
            charArray = str.toCharArray();
        }
        if (charArray[0] == '-') {
            i = 1;
        } else {
            z = false;
        }
        if (charArray[i] == '0') {
            int i2 = i + 1;
            if (i2 == charArray.length) {
                return 0L;
            }
            char c = charArray[i2];
            if (c == 'x' || c == 'X') {
                i += 2;
                r7 = 16;
            } else {
                r7 = Character.digit(c, 8) >= 0 ? 8 : 10;
                i = i2;
            }
        }
        long j = C13132.FOREVER_NS / (r7 / 2);
        long j2 = 0;
        while (i < charArray.length) {
            int digit = Character.digit(charArray[i], r7);
            if (digit < 0) {
                throw new NumberFormatException("The string contains an invalid digit - '" + charArray[i] + "'");
            }
            long j3 = r7 * j2;
            if (j2 > j) {
                throw new NumberFormatException(str.concat(" cannot fit into a long"));
            }
            if (j3 < 0 && j3 >= (-digit)) {
                throw new NumberFormatException(str.concat(" cannot fit into a long"));
            }
            j2 = digit + j3;
            i++;
        }
        if (!z || j2 == Long.MIN_VALUE) {
            return j2;
        }
        if (j2 >= 0) {
            return j2 * (-1);
        }
        throw new NumberFormatException(str.concat(" cannot fit into a long"));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static float m34917(String str) {
        Matcher matcher = f44723.matcher(str);
        if (matcher.matches()) {
            if (matcher.start(1) != -1) {
                return matcher.start(2) != -1 ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
            }
            return Float.NaN;
        }
        return Float.parseFloat(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static double m34914(String str) {
        Matcher matcher = f44722.matcher(str);
        if (matcher.matches()) {
            if (matcher.start(1) != -1) {
                return matcher.start(2) != -1 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
            }
            return Double.NaN;
        }
        return Double.parseDouble(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m34915(long j) {
        if (j > -1 || j < -2147483648L) {
            throw new NumberFormatException(Long.toString(j) + " cannot fit into an int");
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m34921(long j) {
        if (!(j > 65535) && !(j < -32768)) {
            return;
        }
        throw new NumberFormatException(Long.toString(j) + " cannot fit into a short");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34913(long j) {
        if (!(j > 255) && !(j < -128)) {
            return;
        }
        throw new NumberFormatException(Long.toString(j) + " cannot fit into a byte");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m34918(long j) {
        if (!(j > 15) && !(j < -8)) {
            return;
        }
        throw new NumberFormatException(Long.toString(j) + " cannot fit into a nibble");
    }
}
