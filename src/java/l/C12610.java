package l;

/* compiled from: 35OG */
/* renamed from: l.۫᩵ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12610 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m30869(String str) {
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
}
