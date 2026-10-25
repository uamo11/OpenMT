package l;

import android.content.Context;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.File;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: 35B7 */
/* renamed from: l.᩺ۤۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C22927 implements InterfaceC3860 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Context f73888;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m51018(int i, int i2, int[] iArr) {
        int length = iArr.length;
        int length2 = iArr.length - 2;
        int i3 = i;
        while (i3 >= i2 && iArr[i3] % length > i) {
            length2 = i3;
            i3 -= (i - i3) + 1;
        }
        int max = Math.max(i2 - 1, i3);
        while (length2 > max + 1) {
            int i4 = (max + length2) >> 1;
            if (iArr[i4] % length > i) {
                length2 = i4;
            } else {
                max = i4;
            }
        }
        return length2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Context m51019() {
        Context context = f73888;
        if (context == null) {
            return null;
        }
        return context;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m51027() {
        Context context = f73888;
        if ((context == null ? null : context) == null) {
            return "";
        }
        if (context == null) {
            context = null;
        }
        return context.getPackageName();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static File m51031() {
        File[] fileArr;
        Context context = f73888;
        if (context == null) {
            context = null;
        }
        if (context == null) {
            return null;
        }
        try {
            fileArr = context.getExternalFilesDirs(null);
        } catch (Throwable th) {
            C9145.m23514("openSDK_LOG.Util", "getExternalFilesDirs exception", th);
            fileArr = null;
        }
        if (fileArr == null || fileArr.length <= 0) {
            return null;
        }
        return fileArr[0];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51024(Context context) {
        f73888 = context;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51020(long j) {
        if (j < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            return j + "B";
        }
        if (j < 1048576) {
            return m51022("K", j / 1024.0d);
        }
        if (j < 1073741824) {
            return m51022("M", j / 1048576.0d);
        }
        if (j < 1099511627776L) {
            return m51022("G", j / 1.073741824E9d);
        }
        return m51022("T", j / 1.099511627776E12d);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m51028(long j) {
        if (j < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            return j + " B";
        }
        if (j < 1048576) {
            return m51022(" KB", j / 1024.0d);
        }
        if (j < 1073741824) {
            return m51022(" MB", j / 1048576.0d);
        }
        if (j < 1099511627776L) {
            return m51022(" GB", j / 1.073741824E9d);
        }
        return m51022(" TB", j / 1.099511627776E12d);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51022(String str, double d) {
        long round = Math.round(d * 100.0d);
        boolean z = round < 0;
        if (z) {
            round = -round;
        }
        long j = round / 100;
        long j2 = round % 100;
        StringBuilder sb = new StringBuilder(str.length() + 7);
        if (z) {
            sb.append('-');
        }
        sb.append(j);
        sb.append('.');
        if (j2 < 10) {
            sb.append('0');
        }
        return C15942.m37718(sb, j2, str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13238 m51023(C13238 c13238, C13238 c132382) {
        if (c13238 == c132382) {
            return c13238;
        }
        int size = c13238.size();
        if (c132382.size() != size) {
            throw new C2698("mismatched stack depths", null);
        }
        C13238 c132383 = null;
        for (int i = 0; i < size; i++) {
            InterfaceC1538 m32111 = c13238.m32111(i);
            InterfaceC1538 m321112 = c132382.m32111(i);
            InterfaceC1538 m51030 = m51030(m32111, m321112);
            if (m51030 != m32111) {
                if (c132383 == null) {
                    c132383 = c13238.m32110();
                }
                if (m51030 == null) {
                    throw new C2698("incompatible: " + m32111 + ", " + m321112, null);
                }
                try {
                    c132383.m32112(i, m51030);
                } catch (C2698 e) {
                    e.m21602("...while merging stack[" + C14712.m35006(i) + "]");
                    throw e;
                }
                e.m21602("...while merging stack[" + C14712.m35006(i) + "]");
                throw e;
            }
        }
        if (c132383 == null) {
            return c13238;
        }
        c132383.mo20349();
        return c132383;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m51029(String str) {
        int i = 0;
        while (str.charAt(i) == '[') {
            i++;
        }
        if (i > 0) {
            str = str.substring(i);
        }
        char charAt = str.charAt(0);
        String replace = charAt == 'V' ? ClassTransform.VOID : charAt == 'Z' ? ClassTransform.BOOLEAN : charAt == 'B' ? ClassTransform.BYTE : charAt == 'C' ? ClassTransform.CHARACTER : charAt == 'S' ? ClassTransform.SHORT : charAt == 'I' ? ClassTransform.INTEGER : charAt == 'F' ? ClassTransform.FLOAT : charAt == 'J' ? ClassTransform.LONG : charAt == 'D' ? ClassTransform.DOUBLE : charAt == '%' ? "%" : charAt == 'L' ? str.substring(1, str.indexOf(59)).replace('/', '.') : null;
        if (replace == null) {
            throw new IllegalArgumentException(C4860.m14172("Unknown type [", str, "]"));
        }
        for (int i2 = 0; i2 < i; i2++) {
            replace = C16014.m37867(replace, "[]");
        }
        return replace;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1538 m51030(InterfaceC1538 interfaceC1538, InterfaceC1538 interfaceC15382) {
        if (interfaceC1538 == null || interfaceC1538.equals(interfaceC15382)) {
            return interfaceC1538;
        }
        if (interfaceC15382 == null) {
            return null;
        }
        C7573 type = interfaceC1538.getType();
        C7573 type2 = interfaceC15382.getType();
        if (type == type2) {
            return type;
        }
        if (type.m20311() && type2.m20311()) {
            C7573 c7573 = C7573.f23417;
            if (type == c7573) {
                return type2;
            }
            if (type2 == c7573) {
                return type;
            }
            if (type.m20301() && type2.m20301()) {
                InterfaceC1538 m51030 = m51030(type.m20310(), type2.m20310());
                if (m51030 == null) {
                    return C7573.f23412;
                }
                return ((C7573) m51030).m20307();
            }
            return C7573.f23412;
        }
        if (type.m20312() && type2.m20312()) {
            return C7573.f23413;
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51025(int[] iArr) {
        int i;
        int i2;
        int i3;
        int length = iArr.length;
        int i4 = 1;
        if (length != 1) {
            if (length != 2) {
                int length2 = iArr.length;
                iArr[0] = iArr[0] + iArr[1];
                int i5 = 2;
                int i6 = 0;
                for (int i7 = 1; i7 < length2 - 1; i7++) {
                    if (i5 < length2) {
                        int i8 = iArr[i6];
                        i2 = iArr[i5];
                        if (i8 >= i2) {
                            i5++;
                            if (i5 < length2 || (i6 < i7 && iArr[i6] < iArr[i5])) {
                                i3 = i2 + iArr[i6];
                                iArr[i6] = i7 + length2;
                                i6++;
                            } else {
                                i3 = i2 + iArr[i5];
                                i5++;
                            }
                            iArr[i7] = i3;
                        }
                    }
                    i2 = iArr[i6];
                    iArr[i6] = i7;
                    i6++;
                    if (i5 < length2) {
                    }
                    i3 = i2 + iArr[i6];
                    iArr[i6] = i7 + length2;
                    i6++;
                    iArr[i7] = i3;
                }
                int length3 = iArr.length - 2;
                for (int i9 = 1; i9 < 19 && length3 > 1; i9++) {
                    length3 = m51018(length3 - 1, 0, iArr);
                }
                if (iArr[0] % iArr.length >= length3) {
                    int length4 = iArr.length - 2;
                    int length5 = iArr.length - 1;
                    while (r3 > 0) {
                        int m51018 = m51018(length4 - 1, 0, iArr);
                        int i10 = length4 - m51018;
                        int i11 = r3 - i10;
                        while (i11 > 0) {
                            iArr[length5] = i4;
                            i11--;
                            length5--;
                        }
                        r3 = i10 << 1;
                        i4++;
                        length4 = m51018;
                    }
                    return;
                }
                int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length3 - 1);
                int i12 = 20 - numberOfLeadingZeros;
                int length6 = iArr.length - 2;
                int length7 = iArr.length - 1;
                r3 = i12 != 1 ? 1 : 2;
                int i13 = i12 == 1 ? length3 - 2 : length3;
                int i14 = r3 << 1;
                while (i14 > 0) {
                    int m510182 = length6 <= length3 ? length6 : m51018(length6 - 1, length3, iArr);
                    if (r3 >= i12) {
                        i = Math.min(i13, 1 << (r3 - i12));
                    } else if (r3 == 19 - numberOfLeadingZeros) {
                        if (iArr[m510182] == length6) {
                            m510182++;
                        }
                        i = 1;
                    } else {
                        i = 0;
                    }
                    int i15 = (length6 - m510182) + i;
                    int i16 = i14 - i15;
                    while (i16 > 0) {
                        iArr[length7] = r3;
                        i16--;
                        length7--;
                    }
                    i13 -= i;
                    i14 = i15 << 1;
                    r3++;
                    length6 = m510182;
                }
                return;
            }
            iArr[1] = 1;
        }
        iArr[0] = 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51026(InterfaceC1538 interfaceC1538, InterfaceC1538 interfaceC15382) {
        C7573 type = interfaceC1538.getType();
        C7573 type2 = interfaceC15382.getType();
        if (type.equals(type2)) {
            return true;
        }
        int mo5255 = type.mo5255();
        int mo52552 = type2.mo5255();
        if (mo5255 == 10) {
            type = C7573.f23412;
            mo5255 = 9;
        }
        if (mo52552 == 10) {
            type2 = C7573.f23412;
            mo52552 = 9;
        }
        if (mo5255 != 9 || mo52552 != 9) {
            return type.m20312() && type2.m20312();
        }
        C7573 c7573 = C7573.f23417;
        if (type == c7573) {
            return false;
        }
        if (type2 == c7573 || type == C7573.f23412) {
            return true;
        }
        if (!type.m20301()) {
            return !type2.m20301() || type == C7573.f23419 || type == C7573.f23415;
        }
        if (!type2.m20301()) {
            return false;
        }
        do {
            type = type.m20310();
            type2 = type2.m20310();
            if (!type.m20301()) {
                break;
            }
        } while (type2.m20301());
        return m51026(type, type2);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m51032(String str) {
        return str.equals("<clinit>") || str.equals("<init>");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51021(String str) {
        StringBuilder sb = new StringBuilder();
        C18070 c18070 = new C18070(str);
        while (c18070.m42135()) {
            sb.append(m51029(c18070.m42136()));
            if (c18070.m42135()) {
                sb.append(',');
            }
        }
        return sb.toString();
    }
}
