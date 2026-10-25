package l;

/* compiled from: F8CY */
/* renamed from: l.۬ۨ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13099 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31761(int i, int i2, byte[] bArr) {
        return bArr[i] == bArr[i2] && bArr[i + 1] == bArr[i2 + 1] && bArr[i + 2] == bArr[i2 + 2] && bArr[i + 3] == bArr[i2 + 3];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31760(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        for (int i4 = 0; i4 < i3; i4 += 8) {
            int i5 = i + i4;
            int i6 = i2 + i4;
            for (int i7 = 0; i7 < 8; i7++) {
                try {
                    bArr2[i6 + i7] = bArr[i5 + i7];
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new C3928(C19370.m44628(i, "Malformed input at offset "));
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31757(int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        while (i2 < i3) {
            int i5 = i + 1;
            int i6 = i2 + 1;
            if (bArr[i] != bArr[i2]) {
                break;
            }
            i4++;
            i = i5;
            i2 = i6;
        }
        return i4;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m31763(int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        while (i > 0 && i2 > i3) {
            i--;
            i2--;
            if (bArr[i] != bArr[i2]) {
                break;
            }
            i4++;
        }
        return i4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31759(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9 = i2 - i;
        int i10 = i5 + 1;
        if (i10 + i9 + 8 + (i9 >>> 8) > i6) {
            throw new C3928("maxDestLen is too small");
        }
        if (i9 >= 15) {
            i10 = m31762(i9 - 15, i10, bArr2);
            i7 = -16;
        } else {
            i7 = i9 << 4;
        }
        m31760(i, bArr, i10, bArr2, i9);
        int i11 = i10 + i9;
        int i12 = i2 - i3;
        bArr2[i11] = (byte) i12;
        int i13 = i11 + 2;
        bArr2[i11 + 1] = (byte) (i12 >>> 8);
        int i14 = i4 - 4;
        if (i11 + 8 + (i14 >>> 8) > i6) {
            throw new C3928("maxDestLen is too small");
        }
        if (i14 >= 15) {
            i8 = i7 | 15;
            i13 = m31762(i4 - 19, i13, bArr2);
        } else {
            i8 = i14 | i7;
        }
        bArr2[i5] = (byte) i8;
        return i13;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31758(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        if (((i2 + 240) / 255) + i3 + i2 + 1 > i4) {
            throw new C3928();
        }
        if (i2 >= 15) {
            bArr2[i3] = -16;
            i5 = m31762(i2 - 15, i3 + 1, bArr2);
        } else {
            bArr2[i3] = (byte) (i2 << 4);
            i5 = i3 + 1;
        }
        System.arraycopy(bArr, i, bArr2, i5, i2);
        return i5 + i2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m31762(int i, int i2, byte[] bArr) {
        while (i >= 255) {
            bArr[i2] = -1;
            i -= 255;
            i2++;
        }
        int i3 = i2 + 1;
        bArr[i2] = (byte) i;
        return i3;
    }
}
