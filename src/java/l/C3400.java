package l;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: F7HX */
/* renamed from: l.ۗᩳۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3400 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f10762 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final char[] f10763;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final long[] f10764;

    static {
        long[] jArr = new long[1024];
        f10764 = jArr;
        Arrays.fill(jArr, -1L);
        for (int i = 0; i <= 31; i++) {
            m10369(i);
        }
        for (int i2 = 33; i2 <= 35; i2++) {
            m10369(i2);
        }
        for (int i3 = 37; i3 <= 44; i3++) {
            m10369(i3);
        }
        m10369(46);
        for (int i4 = 58; i4 <= 64; i4++) {
            m10369(i4);
        }
        for (int i5 = 91; i5 <= 94; i5++) {
            m10369(i5);
        }
        m10369(96);
        for (int i6 = 123; i6 <= 127; i6++) {
            m10369(i6);
        }
        for (int i7 = 56320; i7 <= 57343; i7++) {
            m10369(i7);
        }
        m10369(8232);
        m10369(65520);
        m10369(65528);
        f10763 = new char[]{'-', '>'};
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10369(int i) {
        int i2 = i >>> 6;
        long[] jArr = f10764;
        jArr[i2] = jArr[i2] & (~(1 << (i & 63)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m10365(int i, int i2, int i3, char[] cArr, char[] cArr2) {
        if (i3 < 0) {
            i3 = 0;
        }
        if (i2 == 0) {
            return i3;
        }
        if (i3 + i2 > i) {
            return -1;
        }
        char c = cArr2[0];
        int i4 = i - i2;
        while (i3 <= i4) {
            if (cArr[i3] != c) {
                do {
                    i3++;
                    if (i3 > i4) {
                        break;
                    }
                } while (cArr[i3] != c);
            }
            if (i3 <= i4) {
                int i5 = i3 + 1;
                int i6 = i3 + i2;
                for (int i7 = 1; i5 < i6 && cArr[i5] == cArr2[i7]; i7++) {
                    i5++;
                }
                if (i5 == i6) {
                    return i3;
                }
            }
            i3++;
        }
        return -1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m10370(int i, int i2, int i3, char[] cArr, char[] cArr2) {
        if (i2 < 0 || i2 + i3 > i) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (cArr[i2 + i4] != cArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m10366(char[] cArr, int i, char[] cArr2, int i2, char[] cArr3, int i3) {
        int m10365;
        int i4;
        int i5;
        char c;
        char c2;
        char c3;
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        while (arrayList.size() < 500 && (m10365 = m10365(i, 2, i6, cArr, f10763)) != -1) {
            int i7 = m10365 - 1;
            while (i7 >= 0 && ((c3 = cArr[i7]) == ' ' || c3 == '\t')) {
                i7--;
            }
            if (i7 >= 0) {
                if (i7 >= 0 && cArr[i7] == ';') {
                    i4 = -1;
                    for (int i8 = i7 - 1; i8 >= 0; i8--) {
                        char c4 = cArr[i8];
                        if (c4 == 'L') {
                            i4 = i8;
                        }
                        if ((f10764[c4 >>> 6] & (1 << (c4 & '?'))) == 0) {
                            break;
                        }
                    }
                } else {
                    i4 = -1;
                }
                if (i4 != -1) {
                    int i9 = m10365 + 2;
                    while (i9 < i) {
                        char c5 = cArr[i9];
                        if (c5 != ' ' && c5 != '\t') {
                            break;
                        }
                        i9++;
                    }
                    if (m10370(i, i9, i2, cArr, cArr2) && ((i5 = i9 + i2) >= i || (c2 = cArr[i5]) == ' ' || c2 == '\t' || c2 == ':')) {
                        while (i5 < i) {
                            char c6 = cArr[i5];
                            if (c6 != ' ' && c6 != '\t') {
                                break;
                            }
                            i5++;
                        }
                        if (i5 < i && cArr[i5] == ':') {
                            while (true) {
                                i5++;
                                if (i5 >= i || ((c = cArr[i5]) != ' ' && c != '\t')) {
                                    break;
                                }
                            }
                            if (m10370(i, i5, i3, cArr, cArr3)) {
                                arrayList.add(new Object[]{new int[]{i4, i5 + i3}, new String(cArr, i4, (i7 + 1) - i4)});
                            }
                            i6 = m10365 + 1;
                        }
                    }
                    i6 = m10365 + 1;
                }
            }
            i6 = m10365 + 1;
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if ((l.C3400.f10764[r13 >>> 6] & (1 << (r13 & '?'))) != 0) goto L17;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList m10368(char[] r18, int r19, char[] r20, int r21, char[] r22, int r23, char[] r24, int r25, char[] r26, int r27) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            r3 = r23
            r4 = r25
            r5 = r27
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
        L12:
            int r8 = r6.size()
            r9 = 500(0x1f4, float:7.0E-43)
            if (r8 >= r9) goto Lbb
            r8 = r22
            int r7 = m10365(r1, r3, r7, r0, r8)
            r9 = -1
            if (r7 != r9) goto L25
            goto Lbb
        L25:
            int r9 = r7 + (-1)
        L27:
            r10 = 9
            r11 = 32
            if (r9 < 0) goto L36
            char r12 = r0[r9]
            if (r12 == r11) goto L33
            if (r12 != r10) goto L36
        L33:
            int r9 = r9 + (-1)
            goto L27
        L36:
            if (r9 >= 0) goto L40
        L38:
            r12 = r20
        L3a:
            r14 = r24
        L3c:
            r10 = r26
            goto Lb7
        L40:
            int r9 = r9 + 1
            int r9 = r9 - r2
            if (r9 < 0) goto L38
            r12 = r20
            boolean r13 = m10370(r1, r9, r2, r0, r12)
            if (r13 != 0) goto L4e
            goto L6d
        L4e:
            if (r9 <= 0) goto L6e
            int r13 = r9 + (-1)
            char r13 = r0[r13]
            if (r13 == r11) goto L6e
            if (r13 != r10) goto L59
            goto L6e
        L59:
            int r14 = r13 >>> 6
            long[] r15 = l.C3400.f10764
            r14 = r15[r14]
            r13 = r13 & 63
            r16 = 1
            long r16 = r16 << r13
            long r13 = r14 & r16
            r15 = 0
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 == 0) goto L6e
        L6d:
            goto L3a
        L6e:
            int r13 = r7 + r3
        L70:
            if (r13 >= r1) goto L7b
            char r14 = r0[r13]
            if (r14 == r11) goto L78
            if (r14 != r10) goto L7b
        L78:
            int r13 = r13 + 1
            goto L70
        L7b:
            r14 = r24
            boolean r15 = m10370(r1, r13, r4, r0, r14)
            if (r15 != 0) goto L84
        L83:
            goto L3c
        L84:
            int r13 = r13 + r4
        L85:
            if (r13 >= r1) goto L90
            char r15 = r0[r13]
            if (r15 == r11) goto L8d
            if (r15 != r10) goto L90
        L8d:
            int r13 = r13 + 1
            goto L85
        L90:
            if (r13 >= r1) goto L3c
            char r10 = r0[r13]
            r15 = 41
            if (r10 == r15) goto L99
            goto L83
        L99:
            int r13 = r13 + 1
            if (r13 >= r1) goto La6
            char r10 = r0[r13]
            r15 = 9
            if (r10 == r11) goto L99
            if (r10 != r15) goto La6
            goto L99
        La6:
            r10 = r26
            boolean r11 = m10370(r1, r13, r5, r0, r10)
            if (r11 != 0) goto Laf
            goto Lb7
        Laf:
            int r13 = r13 + r5
            int[] r9 = new int[]{r9, r13}
            r6.add(r9)
        Lb7:
            int r7 = r7 + 1
            goto L12
        Lbb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3400.m10368(char[], int, char[], int, char[], int, char[], int, char[], int):java.util.ArrayList");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m10367(char[] cArr, int i, char[] cArr2, int i2, char[] cArr3, int i3, char[] cArr4, int i4, C11393 c11393, C18955 c18955, ConcurrentMapC10942 concurrentMapC10942) {
        int m10365;
        int i5;
        char c;
        char c2;
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        while (arrayList.size() < 500 && (m10365 = m10365(i, i2, i6, cArr, cArr2)) != -1) {
            int i7 = m10365 - 1;
            while (i7 >= 0 && ((c2 = cArr[i7]) == ' ' || c2 == '\t')) {
                i7--;
            }
            if (i7 >= 0) {
                if (i7 >= 0 && cArr[i7] == ';') {
                    i5 = -1;
                    for (int i8 = i7 - 1; i8 >= 0; i8--) {
                        char c3 = cArr[i8];
                        if (c3 == 'L') {
                            i5 = i8;
                        }
                        if ((f10764[c3 >>> 6] & (1 << (c3 & '?'))) == 0) {
                            break;
                        }
                    }
                } else {
                    i5 = -1;
                }
                if (i5 != -1) {
                    String str = new String(cArr, i5, (i7 + 1) - i5);
                    int i9 = m10365 + i2;
                    while (i9 < i) {
                        char c4 = cArr[i9];
                        if (c4 != ' ' && c4 != '\t') {
                            break;
                        }
                        i9++;
                    }
                    if (m10370(i, i9, i3, cArr, cArr3)) {
                        int i10 = i9 + i3;
                        while (i10 < i) {
                            char c5 = cArr[i10];
                            if (c5 != ' ' && c5 != '\t') {
                                break;
                            }
                            i10++;
                        }
                        if (i10 < i && cArr[i10] == ')') {
                            while (true) {
                                i10++;
                                if (i10 >= i || ((c = cArr[i10]) != ' ' && c != '\t')) {
                                    break;
                                }
                            }
                            if (m10370(i, i10, i4, cArr, cArr4)) {
                                int i11 = i10 + i4;
                                if (C6180.m17097(c11393, c18955, str, concurrentMapC10942)) {
                                    arrayList.add(new int[]{i5, i11});
                                }
                                i6 = m10365 + 1;
                            }
                            i6 = m10365 + 1;
                        }
                    }
                    i6 = m10365 + 1;
                }
            }
            i6 = m10365 + 1;
        }
        return arrayList;
    }
}
