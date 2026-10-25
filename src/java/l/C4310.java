package l;

import java.nio.ByteBuffer;

/* compiled from: Y3NK */
/* renamed from: l.ۙ֨ۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4310 extends AbstractC19833 {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] > (-65)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r13[r14] > (-65)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0084, code lost:
    
        if (r13[r12] > (-65)) goto L50;
     */
    @Override // l.AbstractC19833
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo12950(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4310.mo12950(int, byte[], int, int):int");
    }

    @Override // l.AbstractC19833
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo12951(int i, int i2, byte[] bArr) {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
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
            byte b2 = bArr[i];
            if (b2 >= 0) {
                cArr[i5] = (char) b2;
                i5++;
                i = i6;
                while (i < i3) {
                    byte b3 = bArr[i];
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
                C21949.m49438(b2, bArr[i6], cArr, i5);
                i5++;
            } else if (b2 < -16) {
                if (i6 >= i3 - 1) {
                    throw C2025.m6583();
                }
                int i7 = i + 2;
                i += 3;
                C21949.m49437(b2, bArr[i6], bArr[i7], cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw C2025.m6583();
                }
                byte b4 = bArr[i6];
                int i8 = i + 3;
                byte b5 = bArr[i + 2];
                i += 4;
                C21949.m49436(b2, b4, b5, bArr[i8], cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    @Override // l.AbstractC19833
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo12952(ByteBuffer byteBuffer, int i, int i2) {
        return AbstractC19833.m45602(byteBuffer, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r8 + r0;
     */
    @Override // l.AbstractC19833
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo12949(int r8, int r9, java.lang.String r10, byte[] r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4310.mo12949(int, int, java.lang.String, byte[]):int");
    }
}
