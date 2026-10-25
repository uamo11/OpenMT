package l;

import java.lang.reflect.Array;

/* compiled from: P7HY */
/* renamed from: l.ۗ۠ܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3115 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final boolean[][] f9737 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, 15, 15);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m9496(CharSequence charSequence, int i, int i2, InterfaceC4526 interfaceC4526) {
        C11003.checkFromToIndex(i, i2, charSequence.length());
        int codePointAt = Character.codePointAt(charSequence, i);
        int charCount = Character.charCount(codePointAt) + i;
        int m9495 = m9495(codePointAt);
        int i3 = m9495 == 6 ? 1 : 0;
        boolean z = m9495 == 14;
        while (charCount < i2) {
            int codePointAt2 = Character.codePointAt(charSequence, charCount);
            int m94952 = m9495(codePointAt2);
            if (interfaceC4526 != null && ((C8054) interfaceC4526).m21407()) {
                return -2;
            }
            if ((!z || m9495 != 5 || m94952 != 14) && ((i3 % 2 != 1 || m9495 != 6 || m94952 != 6) && f9737[m9495][m94952])) {
                if (charCount > i) {
                    break;
                }
                i3 = 0;
                z = m94952 == 14;
            }
            i3 += m94952 == 6 ? 1 : 0;
            charCount += Character.charCount(codePointAt2);
            m9495 = m94952;
        }
        if (interfaceC4526 == null || !(((C8054) interfaceC4526).m21407() || Thread.currentThread().isInterrupted())) {
            return charCount;
        }
        return -2;
    }

    static {
        for (int i = 0; i <= 14; i++) {
            for (int i2 = 0; i2 <= 14; i2++) {
                f9737[i][i2] = true;
            }
        }
        boolean[][] zArr = f9737;
        boolean[] zArr2 = zArr[9];
        zArr2[9] = false;
        zArr2[10] = false;
        zArr2[12] = false;
        zArr2[13] = false;
        boolean[] zArr3 = zArr[12];
        zArr3[10] = false;
        zArr3[11] = false;
        boolean[] zArr4 = zArr[10];
        zArr4[10] = false;
        zArr4[11] = false;
        zArr[13][11] = false;
        zArr[11][11] = false;
        for (int i3 = 0; i3 <= 14; i3++) {
            boolean[][] zArr5 = f9737;
            boolean[] zArr6 = zArr5[i3];
            zArr6[4] = false;
            zArr6[5] = false;
            zArr6[8] = false;
            zArr5[7][i3] = false;
        }
        for (int i4 = 0; i4 <= 14; i4++) {
            for (int i5 = 1; i5 <= 3; i5++) {
                boolean[][] zArr7 = f9737;
                zArr7[i4][i5] = true;
                zArr7[i5][i4] = true;
            }
        }
        boolean[][] zArr8 = f9737;
        zArr8[1][2] = false;
        boolean[] zArr9 = zArr8[14];
        zArr9[4] = false;
        zArr9[5] = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x00f7 A[FALL_THROUGH, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0138 A[RETURN] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m9495(int r9) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3115.m9495(int):int");
    }
}
