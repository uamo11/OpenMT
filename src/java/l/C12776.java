package l;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: Y3NK */
/* renamed from: l.۬֨ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12776 extends AbstractC19833 {
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0066, code lost:
    
        if (l.C21244.m48218(r6, r25) > (-65)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (l.C21244.m48218(r6, r25) > (-65)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x00b1, code lost:
    
        if (l.C21244.m48218(r8, r25) > (-65)) goto L53;
     */
    @Override // l.AbstractC19833
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo12950(int r24, byte[] r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12776.mo12950(int, byte[], int, int):int");
    }

    @Override // l.AbstractC19833
    /* renamed from: ֫ */
    public final String mo12951(int i, int i2, byte[] bArr) {
        Charset charset = C13997.f41724;
        String str = new String(bArr, i, i2, charset);
        if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
            throw C2025.m6583();
        }
        return str;
    }

    @Override // l.AbstractC19833
    /* renamed from: ֫ */
    public final String mo12952(ByteBuffer byteBuffer, int i, int i2) {
        byte m48216;
        byte m482162;
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        long m48219 = C21244.m48219(byteBuffer) + i;
        long j = i2 + m48219;
        char[] cArr = new char[i2];
        int i3 = 0;
        while (m48219 < j && (m482162 = C21244.m48216(m48219)) >= 0) {
            m48219++;
            cArr[i3] = (char) m482162;
            i3++;
        }
        while (m48219 < j) {
            long j2 = m48219 + 1;
            byte m482163 = C21244.m48216(m48219);
            if (m482163 >= 0) {
                cArr[i3] = (char) m482163;
                i3++;
                m48219 = j2;
                while (m48219 < j && (m48216 = C21244.m48216(m48219)) >= 0) {
                    m48219++;
                    cArr[i3] = (char) m48216;
                    i3++;
                }
            } else if (m482163 < -32) {
                if (j2 >= j) {
                    throw C2025.m6583();
                }
                m48219 += 2;
                C21949.m49438(m482163, C21244.m48216(j2), cArr, i3);
                i3++;
            } else if (m482163 < -16) {
                if (j2 >= j - 1) {
                    throw C2025.m6583();
                }
                long j3 = 2 + m48219;
                m48219 += 3;
                C21949.m49437(m482163, C21244.m48216(j2), C21244.m48216(j3), cArr, i3);
                i3++;
            } else {
                if (j2 >= j - 2) {
                    throw C2025.m6583();
                }
                byte m482164 = C21244.m48216(j2);
                long j4 = m48219 + 3;
                byte m482165 = C21244.m48216(2 + m48219);
                m48219 += 4;
                C21949.m49436(m482163, m482164, m482165, C21244.m48216(j4), cArr, i3);
                i3 += 2;
            }
        }
        return new String(cArr, 0, i3);
    }

    @Override // l.AbstractC19833
    /* renamed from: ֫ */
    public final int mo12949(int i, int i2, String str, byte[] bArr) {
        long j;
        char c;
        String str2;
        String str3;
        int i3;
        char charAt;
        long j2 = i;
        long j3 = i2 + j2;
        int length = str.length();
        String str4 = " at index ";
        String str5 = "Failed writing ";
        if (length > i2 || bArr.length - i2 < i) {
            throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i + i2));
        }
        int i4 = 0;
        while (true) {
            j = 1;
            c = 128;
            if (i4 >= length || (charAt = str.charAt(i4)) >= 128) {
                break;
            }
            C21244.m48232(bArr, j2, (byte) charAt);
            i4++;
            j2 = 1 + j2;
        }
        if (i4 == length) {
            return (int) j2;
        }
        String str6 = str;
        while (i4 < length) {
            char charAt2 = str6.charAt(i4);
            if (charAt2 < c && j2 < j3) {
                C21244.m48232(bArr, j2, (byte) charAt2);
                str3 = str5;
                j2 += j;
                str2 = str4;
            } else if (charAt2 >= 2048 || j2 > j3 - 2) {
                str2 = str4;
                str3 = str5;
                if ((charAt2 >= 55296 && 57343 >= charAt2) || j2 > j3 - 3) {
                    if (j2 <= j3 - 4) {
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char charAt3 = str.charAt(i5);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                C21244.m48232(bArr, j2, (byte) ((codePoint >>> 18) | 240));
                                C21244.m48232(bArr, j2 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j4 = j2 + 3;
                                C21244.m48232(bArr, j2 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j2 += 4;
                                C21244.m48232(bArr, j4, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new C2899(i4 - 1, length);
                    }
                    if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, str.charAt(i3)))) {
                        throw new C2899(i4, length);
                    }
                    throw new ArrayIndexOutOfBoundsException(str3 + charAt2 + str2 + j2);
                }
                C21244.m48232(bArr, j2, (byte) ((charAt2 >>> '\f') | 480));
                long j5 = j2 + 2;
                C21244.m48232(bArr, j2 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                j2 += 3;
                C21244.m48232(bArr, j5, (byte) ((charAt2 & '?') | 128));
                str6 = str;
            } else {
                str2 = str4;
                str3 = str5;
                long j6 = j2 + j;
                C21244.m48232(bArr, j2, (byte) ((charAt2 >>> 6) | 960));
                j2 += 2;
                C21244.m48232(bArr, j6, (byte) (c | (charAt2 & '?')));
            }
            i4++;
            c = 128;
            str4 = str2;
            str5 = str3;
            j = 1;
        }
        return (int) j2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31086(long j, byte[] bArr, int i, int i2) {
        int m29453;
        int m29454;
        if (i2 == 0) {
            return C12071.m29445(i);
        }
        if (i2 == 1) {
            m29453 = C12071.m29453(i, C21244.m48218(j, bArr));
            return m29453;
        }
        if (i2 == 2) {
            m29454 = C12071.m29454(i, C21244.m48218(j, bArr), C21244.m48218(j + 1, bArr));
            return m29454;
        }
        throw new AssertionError();
    }
}
