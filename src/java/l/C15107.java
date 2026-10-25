package l;

/* compiled from: 04TE */
/* renamed from: l.ܶ۠ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15107 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m35800(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m35799(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m35800(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m35800(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m35802(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m35801(String str, String str2) {
        int i;
        char c;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            while (i < length) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                i = (charAt == charAt2 || ((c = (char) ((charAt | ' ') + (-97))) < 26 && c == ((char) ((charAt2 | ' ') + (-97))))) ? i + 1 : 0;
            }
            return true;
        }
        return false;
    }
}
