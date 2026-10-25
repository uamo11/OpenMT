package l;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: S4VX */
/* renamed from: l.ۤܶܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10375 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m26177(int i, String str) {
        if (i <= 1) {
            if (i >= 0) {
                return i == 0 ? "" : str;
            }
            throw new IllegalArgumentException(m26179("invalid count: %s", Integer.valueOf(i)));
        }
        int length = str.length();
        long j = length * i;
        int i2 = (int) j;
        if (i2 != j) {
            throw new ArrayIndexOutOfBoundsException(C16014.m37865(j, "Required array size too large: "));
        }
        char[] cArr = new char[i2];
        str.getChars(0, length, cArr, 0);
        while (true) {
            int i3 = i2 - length;
            if (length >= i3) {
                System.arraycopy(cArr, 0, cArr, length, i3);
                return new String(cArr);
            }
            System.arraycopy(cArr, 0, cArr, length, length);
            length <<= 1;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m26179(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            sb.append((CharSequence) valueOf, i2, indexOf);
            sb.append(m26178(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) valueOf, i2, valueOf.length());
        if (i < objArr.length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(m26178(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m26178(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e);
            StringBuilder m9834 = C3200.m9834("<", str, " threw ");
            m9834.append(e.getClass().getName());
            m9834.append(">");
            return m9834.toString();
        }
    }
}
