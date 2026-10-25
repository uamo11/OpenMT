package l;

import com.umeng.analytics.pro.bo;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.util.encoders.UTF8;

/* compiled from: S8SC */
/* renamed from: l.ܽ۠֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16509 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final byte[] f50737 = {0, 0, 0, 1};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final float[] f50736 = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Object f50739 = new Object();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int[] f50738 = new int[10];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m38880(int i, byte[] bArr) {
        int i2;
        synchronized (f50739) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f50738;
                    if (iArr.length <= i4) {
                        f50738 = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f50738[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f50738[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m38881(C8353 c8353) {
        if (C11003.equals(c8353.f25614, "video/avc")) {
            return 1;
        }
        return (C11003.equals(c8353.f25614, "video/hevc") || C9786.m24803(c8353.f25619, "video/hevc") != null) ? 2 : 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38888(byte[] bArr, int i, C8353 c8353) {
        int i2;
        if (C11003.equals(c8353.f25614, "video/avc")) {
            byte b = bArr[4];
            if (((b & UTF8.S_P4B) >> 5) == 0 && ((i2 = b & bo.j) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (C11003.equals(c8353.f25614, "video/hevc")) {
            C4309 m38884 = m38884(new C17921(bArr, 4, i + 4));
            int i3 = m38884.f13892;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && m38884.f13893 == c8353.f25616 - 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0240  */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C10866 m38891(int r23, int r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16509.m38891(int, int, byte[]):l.ۧ۠֫");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C7131 m38889(int r31, int r32, byte[] r33) {
        /*
            Method dump skipped, instructions count: 2057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16509.m38889(int, int, byte[]):l.۟֨֫");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4309 m38884(C17921 c17921) {
        c17921.m41925();
        return new C4309(c17921.m41923(6), c17921.m41923(6), c17921.m41923(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e1  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C11365 m38886(byte[] r28, int r29, int r30, l.C7131 r31) {
        /*
            Method dump skipped, instructions count: 1055
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16509.m38886(byte[], int, int, l.۟֨֫):l.ۨ֨֫");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5720 m38885(int i, int i2, byte[] bArr) {
        byte b;
        int max;
        int max2;
        int i3 = i + 2;
        do {
            i2--;
            b = bArr[i2];
            if (b != 0) {
                break;
            }
        } while (i2 > i3);
        if (b == 0 || i2 <= i3) {
            return null;
        }
        C17921 c17921 = new C17921(bArr, i3, i2 + 1);
        while (c17921.m41922(16)) {
            int m41923 = c17921.m41923(8);
            int i4 = 0;
            while (m41923 == 255) {
                i4 += 255;
                m41923 = c17921.m41923(8);
            }
            int i5 = i4 + m41923;
            int m419232 = c17921.m41923(8);
            int i6 = 0;
            while (m419232 == 255) {
                i6 += 255;
                m419232 = c17921.m41923(8);
            }
            int i7 = i6 + m419232;
            if (i7 == 0 || !c17921.m41922(i7)) {
                return null;
            }
            if (i5 == 176) {
                int m41928 = c17921.m41928();
                boolean m41927 = c17921.m41927();
                int m419282 = m41927 ? c17921.m41928() : 0;
                int m419283 = c17921.m41928();
                int i8 = -1;
                for (int i9 = 0; i9 <= m419283; i9++) {
                    i8 = c17921.m41928();
                    c17921.m41928();
                    int m419233 = c17921.m41923(6);
                    if (m419233 == 63) {
                        return null;
                    }
                    if (m419233 == 0) {
                        max = Math.max(0, m41928 - 30);
                    } else {
                        max = Math.max(0, (m419233 + m41928) - 31);
                    }
                    c17921.m41923(max);
                    if (m41927) {
                        int m419234 = c17921.m41923(6);
                        if (m419234 == 63) {
                            return null;
                        }
                        if (m419234 == 0) {
                            max2 = Math.max(0, m419282 - 30);
                        } else {
                            max2 = Math.max(0, (m419234 + m419282) - 31);
                        }
                        c17921.m41923(max2);
                    }
                    if (c17921.m41927()) {
                        c17921.m41926(10);
                    }
                }
                return new C5720(i8);
            }
            c17921.m41926(i7 * 8);
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m38879(int i, int i2, byte[] bArr, boolean[] zArr) {
        int i3 = i2 - i;
        C22632.m50634(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m38887(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m38887(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m38887(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & UTF8.S_ERR) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    m38887(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38887(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m38882(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i2 = AbstractC14545.f44556;
                C1846 c1846 = new C1846();
                int i3 = 0;
                while (i3 < bArr.length) {
                    int m38879 = m38879(i3, bArr.length, bArr, zArr);
                    if (m38879 != bArr.length) {
                        c1846.m16264(Integer.valueOf(m38879));
                    }
                    i3 = m38879 + 3;
                }
                AbstractC14545 m6131 = c1846.m6131();
                for (int i4 = 0; i4 < m6131.size(); i4++) {
                    if (((Integer) m6131.get(i4)).intValue() + 3 < length) {
                        C17921 c17921 = new C17921(bArr, ((Integer) m6131.get(i4)).intValue() + 3, length);
                        C4309 m38884 = m38884(c17921);
                        if (m38884.f13892 == 33 && m38884.f13891 == 0) {
                            c17921.m41926(4);
                            int m41923 = c17921.m41923(3);
                            c17921.m41925();
                            C2898 m38883 = m38883(c17921, true, m41923, (C2898) null);
                            return C17839.m41769(m38883.f9240, m38883.f9241, m38883.f9239, m38883.f9236, m38883.f9238, m38883.f9237);
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C2898 m38883(l.C17921 r18, boolean r19, int r20, l.C2898 r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r19 == 0) goto L3a
            int r2 = r0.m41923(r5)
            boolean r5 = r18.m41927()
            r8 = 5
            int r8 = r0.m41923(r8)
            r9 = 0
            r10 = 0
        L1e:
            r11 = 32
            if (r9 >= r11) goto L2e
            boolean r11 = r18.m41927()
            if (r11 == 0) goto L2b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L2b:
            int r9 = r9 + 1
            goto L1e
        L2e:
            r9 = 0
        L2f:
            if (r9 >= r3) goto L47
            int r11 = r0.m41923(r6)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L2f
        L3a:
            if (r2 == 0) goto L4e
            int r3 = r2.f9240
            boolean r5 = r2.f9238
            int r8 = r2.f9241
            int r10 = r2.f9239
            int[] r4 = r2.f9236
            r2 = r3
        L47:
            r12 = r2
            r15 = r4
            r16 = r5
            r13 = r8
            r14 = r10
            goto L58
        L4e:
            r2 = 0
            r8 = 0
            r10 = 0
            r5 = 0
            r15 = r4
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
        L58:
            int r17 = r0.m41923(r6)
            r2 = 0
        L5d:
            if (r7 >= r1) goto L72
            boolean r3 = r18.m41927()
            if (r3 == 0) goto L67
            int r2 = r2 + 88
        L67:
            boolean r3 = r18.m41927()
            if (r3 == 0) goto L6f
            int r2 = r2 + 8
        L6f:
            int r7 = r7 + 1
            goto L5d
        L72:
            r0.m41926(r2)
            if (r1 <= 0) goto L7d
            int r6 = r6 - r1
            int r6 = r6 * 2
            r0.m41926(r6)
        L7d:
            l.ۗ֨֫ r0 = new l.ۗ֨֫
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16509.m38883(l.ᩳ۠֫, boolean, int, l.ۗ֨֫):l.ۗ֨֫");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m38890(C17921 c17921) {
        int m41928 = c17921.m41928() + 1;
        c17921.m41926(8);
        for (int i = 0; i < m41928; i++) {
            c17921.m41928();
            c17921.m41928();
            c17921.m41925();
        }
        c17921.m41926(20);
    }
}
