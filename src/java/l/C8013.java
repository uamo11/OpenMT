package l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: UAOJ */
/* renamed from: l.۠ۜܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8013 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f24741 = {1701707776, 1701741568};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final char[] f24740 = {'e', 'n'};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m21326(char[] cArr, char[] cArr2) {
        return ((cArr[1] & 255) << 16) | ((cArr[0] & 255) << 24) | ((cArr2[0] & 255) << 8) | (cArr2[1] & 255);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m21328(int[] iArr, C21419 c21419, int i, String str, int[] iArr2, int i2) {
        int i3 = 0;
        do {
            if (iArr != null) {
                iArr[i3] = i;
            }
            i3++;
            for (int i4 = 0; i4 < i2; i4++) {
                if (iArr2[i4] == i) {
                    c21419.m48543(Long.valueOf(i4));
                    return i3;
                }
            }
            if ((65535 & i) != 0) {
                Iterator it = C15067.f46016.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (str.equals(entry.getKey())) {
                        Integer num = (Integer) ((Map) entry.getValue()).get(Integer.valueOf(i));
                        if (num != null) {
                            i = num.intValue();
                        }
                    }
                }
                i &= -65536;
            } else {
                i = 0;
            }
        } while (i != 0);
        c21419.m48543(-1L);
        return i3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21330(int i, String str) {
        return C15067.f46019.contains(Long.valueOf((str.charAt(3) & 255) | (i << 32) | ((str.charAt(0) & 255) << 24) | ((str.charAt(1) & 255) << 16) | ((str.charAt(2) & 255) << 8)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m21327(char[] cArr, char[] cArr2, char[] cArr3, String str, char[] cArr4) {
        int i;
        int i2;
        if (cArr[0] == cArr2[0] && cArr[1] == cArr2[1]) {
            return 0;
        }
        int m21326 = m21326(cArr3, cArr);
        int m213262 = m21326(cArr3, cArr2);
        int m213263 = m21326(cArr3, cArr4);
        boolean z = m21326 == 1702057299 || m21326 == 1702055256;
        boolean z2 = m213262 == 1702057299 || m213262 == 1702055256;
        if (z && !z2 && m213262 != 1702077476) {
            i2 = m213262;
            i = 1702077476;
        } else if (!z2 || z || m21326 == 1702077476) {
            i = m21326;
            i2 = m213262;
        } else {
            i = m21326;
            i2 = 1702077476;
        }
        C21419 c21419 = new C21419();
        int m21328 = m21328(new int[4], c21419, m213263, str, new int[]{i, i2}, 2);
        if (((Long) c21419.m48542()).longValue() == 0) {
            return 1;
        }
        if (((Long) c21419.m48542()).longValue() == 1) {
            return -1;
        }
        int longValue = (int) ((((Long) new C21419().m48542()).longValue() + m21328(null, r7, i, str, r10, m21328)) - 1);
        int longValue2 = (int) ((((Long) new C21419().m48542()).longValue() + m21328(null, r11, i2, str, r10, m21328)) - 1);
        if (longValue != longValue2) {
            return longValue2 - longValue;
        }
        boolean m21330 = m21330(i, str);
        boolean m213302 = m21330(i2, str);
        return m21330 != m213302 ? (m21330 ? 1 : 0) - (m213302 ? 1 : 0) : i2 - i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21329(char[] cArr, char[] cArr2, char[] cArr3) {
        Character ch;
        if (cArr2[0] == 0) {
            Arrays.fill(cArr, (char) 0);
            return;
        }
        int m21326 = m21326(cArr2, cArr3);
        Map map = C15067.f46017;
        Character ch2 = (Character) map.get(Integer.valueOf(m21326));
        if (ch2 == null) {
            if (cArr3[0] != 0 && (ch = (Character) map.get(Integer.valueOf(m21326 & (-65536)))) != null) {
                System.arraycopy(C15067.f46018[ch.charValue()], 0, cArr, 0, 4);
                return;
            } else {
                Arrays.fill(cArr, (char) 0);
                return;
            }
        }
        System.arraycopy(C15067.f46018[ch2.charValue()], 0, cArr, 0, 4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21331(char[] cArr) {
        int m21326 = m21326(f24740, cArr);
        C21419 c21419 = new C21419();
        m21328(null, c21419, m21326, "Latn", f24741, 2);
        return ((Long) c21419.m48542()).longValue() == 0;
    }
}
