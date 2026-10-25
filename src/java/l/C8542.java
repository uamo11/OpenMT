package l;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: M7MC */
/* renamed from: l.ۡ֨֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8542 {
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Uri m22231(String str, String str2) {
        return Uri.parse(m22228(str, str2));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m22228(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] m22230 = m22230(str2);
        if (m22230[0] != -1) {
            sb.append(str2);
            m22229(sb, m22230[1], m22230[2]);
            return sb.toString();
        }
        int[] m222302 = m22230(str);
        if (m22230[3] == 0) {
            sb.append((CharSequence) str, 0, m222302[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (m22230[2] == 0) {
            sb.append((CharSequence) str, 0, m222302[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = m22230[1];
        if (i != 0) {
            int i2 = m222302[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return m22229(sb, m22230[1] + i2, i2 + m22230[2]);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, m222302[1]);
            sb.append(str2);
            int i3 = m222302[1];
            return m22229(sb, i3, m22230[2] + i3);
        }
        int i4 = m222302[0] + 2;
        int i5 = m222302[1];
        if (i4 < i5 && i5 == m222302[2]) {
            sb.append((CharSequence) str, 0, i5);
            sb.append('/');
            sb.append(str2);
            int i6 = m222302[1];
            return m22229(sb, i6, m22230[2] + i6 + 1);
        }
        int lastIndexOf = str.lastIndexOf(47, m222302[2] - 1);
        int i7 = lastIndexOf == -1 ? m222302[1] : lastIndexOf + 1;
        sb.append((CharSequence) str, 0, i7);
        sb.append(str2);
        return m22229(sb, m222302[1], i7 + m22230[2]);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m22229(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i3);
                i2 -= i3 - i6;
            } else {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    i4 = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = i4 > i ? i4 : i;
                    sb.delete(i8, i3);
                    i2 -= i3 - i8;
                } else {
                    i4 = i5 + 1;
                }
                i6 = i4;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m22230(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }
}
