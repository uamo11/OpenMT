package l;

/* compiled from: C8CP */
/* renamed from: l.ۧ᩺᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11316 extends AbstractC2143 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC2143 f33874 = new C11316(0);

    @Override // l.AbstractC2143
    /* renamed from: ֫ */
    public final int mo7070(byte[] bArr, int i, int i2) {
        int i3;
        int rotateLeft;
        C6322.m17572(i, i2, bArr);
        int i4 = i + i2;
        if (i2 >= 16) {
            int i5 = i4 - 16;
            int i6 = 0;
            int i7 = 606290984;
            int i8 = 1640531535;
            int i9 = -2048144777;
            while (true) {
                rotateLeft = Integer.rotateLeft((C6322.m17578(i, bArr) * (-2048144777)) + i7, 13) * (-1640531535);
                i9 = Integer.rotateLeft((C6322.m17578(i + 4, bArr) * (-2048144777)) + i9, 13) * (-1640531535);
                i6 = Integer.rotateLeft((C6322.m17578(i + 8, bArr) * (-2048144777)) + i6, 13) * (-1640531535);
                i8 = Integer.rotateLeft((C6322.m17578(i + 12, bArr) * (-2048144777)) + i8, 13) * (-1640531535);
                i += 16;
                if (i > i5) {
                    break;
                }
                i7 = rotateLeft;
            }
            i3 = Integer.rotateLeft(i8, 18) + Integer.rotateLeft(i6, 12) + Integer.rotateLeft(i9, 7) + Integer.rotateLeft(rotateLeft, 1);
        } else {
            i3 = 374761393;
        }
        int i10 = i3 + i2;
        while (i <= i4 - 4) {
            i10 = Integer.rotateLeft((C6322.m17578(i, bArr) * (-1028477379)) + i10, 17) * 668265263;
            i += 4;
        }
        while (i < i4) {
            i10 = Integer.rotateLeft(((bArr[i] & 255) * 374761393) + i10, 11) * (-1640531535);
            i++;
        }
        int i11 = ((i10 >>> 15) ^ i10) * (-2048144777);
        int i12 = (i11 ^ (i11 >>> 13)) * (-1028477379);
        return i12 ^ (i12 >>> 16);
    }
}
