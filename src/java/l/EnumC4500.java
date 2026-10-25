package l;

/* compiled from: 5AUH */
/* renamed from: l.ۙ۟ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public enum EnumC4500 {
    CamelCase,
    PascalCase,
    SnakeCase,
    KebabCase;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m13252(String str) {
        char charAt;
        int i = C20023.f64847[ordinal()];
        int i2 = 0;
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            while (i2 < str.length()) {
                char charAt2 = str.charAt(i2);
                if (charAt2 >= 'A' && charAt2 <= 'Z') {
                    char c = (char) (charAt2 + ' ');
                    if (i2 > 0) {
                        sb.append('_');
                    }
                    sb.append(c);
                } else {
                    sb.append(charAt2);
                }
                i2++;
            }
            return sb.toString();
        }
        if (i == 2) {
            StringBuilder sb2 = new StringBuilder();
            while (i2 < str.length()) {
                char charAt3 = str.charAt(i2);
                if (charAt3 >= 'A' && charAt3 <= 'Z') {
                    char c2 = (char) (charAt3 + ' ');
                    if (i2 > 0) {
                        sb2.append('-');
                    }
                    sb2.append(c2);
                } else {
                    sb2.append(charAt3);
                }
                i2++;
            }
            return sb2.toString();
        }
        if (i != 3) {
            if (i != 4 || (charAt = str.charAt(0)) < 'A' || charAt > 'Z') {
                return str;
            }
            char[] charArray = str.toCharArray();
            charArray[0] = (char) (charArray[0] + ' ');
            return new String(charArray);
        }
        char charAt4 = str.charAt(0);
        if (charAt4 < 'a' || charAt4 > 'z') {
            return str;
        }
        char[] charArray2 = str.toCharArray();
        charArray2[0] = (char) (charArray2[0] - ' ');
        return new String(charArray2);
    }
}
