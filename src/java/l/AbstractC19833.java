package l;

import java.nio.ByteBuffer;

/* compiled from: Y3NK */
/* renamed from: l.᩶֨ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC19833 {
    /* renamed from: ֫ */
    public abstract int mo12949(int i, int i2, String str, byte[] bArr);

    /* renamed from: ֫ */
    public abstract int mo12950(int i, byte[] bArr, int i2, int i3);

    /* renamed from: ֫ */
    public abstract String mo12951(int i, int i2, byte[] bArr);

    /* renamed from: ֫ */
    public abstract String mo12952(ByteBuffer byteBuffer, int i, int i2);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m45602(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (b < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (b2 >= 0) {
                cArr[i5] = (char) b2;
                i5++;
                i = i6;
                while (i < i3) {
                    byte b3 = byteBuffer.get(i);
                    if (b3 >= 0) {
                        i++;
                        cArr[i5] = (char) b3;
                        i5++;
                    }
                }
            } else if (b2 < -32) {
                if (i6 >= i3) {
                    throw C2025.m6583();
                }
                i += 2;
                C21949.m49438(b2, byteBuffer.get(i6), cArr, i5);
                i5++;
            } else if (b2 < -16) {
                if (i6 >= i3 - 1) {
                    throw C2025.m6583();
                }
                int i7 = i + 2;
                i += 3;
                C21949.m49437(b2, byteBuffer.get(i6), byteBuffer.get(i7), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw C2025.m6583();
                }
                byte b4 = byteBuffer.get(i6);
                int i8 = i + 3;
                byte b5 = byteBuffer.get(i + 2);
                i += 4;
                C21949.m49436(b2, b4, b5, byteBuffer.get(i8), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }
}
