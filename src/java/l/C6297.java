package l;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.encoders.UTF8;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: 9AHH */
/* renamed from: l.ۛ᩷֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6297 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19463 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC23230 f19464 = AbstractC14057.m33659(Charset.defaultCharset());

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m17330(String str, byte[] bArr, int i, int i2, InterfaceC23230 interfaceC23230) {
        byte[] mo29130 = interfaceC23230.mo29130(str);
        while (mo29130.length > i2) {
            str = C15472.m36561(1, 0, str);
            mo29130 = interfaceC23230.mo29130(str);
        }
        System.arraycopy(mo29130, 0, bArr, i, mo29130.length);
        for (int length = mo29130.length; length < i2; length++) {
            bArr[i + length] = 0;
        }
        return i + i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17336(long j, byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i2 - 1;
        if (j == 0) {
            i3 = i2 - 2;
            bArr[i4 + i] = UTF8.S_P3A;
        } else {
            long j2 = j;
            while (i4 >= 0 && j2 != 0) {
                bArr[i + i4] = (byte) (((byte) (7 & j2)) + UTF8.S_P3A);
                j2 >>>= 3;
                i4--;
            }
            if (j2 != 0) {
                throw new IllegalArgumentException(j + "=" + Long.toOctalString(j) + " will not fit in octal number buffer of length " + i2);
            }
            i3 = i4;
        }
        while (i3 >= 0) {
            bArr[i + i3] = UTF8.S_P3A;
            i3--;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m17335(String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = str.split(",");
        if (split.length % 2 == 1) {
            throw new IOException("Corrupted TAR archive. Bad format in GNU.sparse.map PAX Header");
        }
        for (int i = 0; i < split.length; i += 2) {
            long m52086 = C23605.m52086(split[i]);
            if (m52086 < 0) {
                throw new IOException("Corrupted TAR archive. Sparse struct offset contains negative value");
            }
            long m520862 = C23605.m52086(split[i + 1]);
            if (m520862 < 0) {
                throw new IOException("Corrupted TAR archive. Sparse struct numbytes contains negative value");
            }
            arrayList.add(new C4886(m52086, m520862));
        }
        return C20195.unmodifiableList(arrayList);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m17332(byte[] bArr, int i, int i2, InterfaceC23230 interfaceC23230) {
        int i3 = 0;
        for (int i4 = i; i3 < i2 && bArr[i4] != 0; i4++) {
            i3++;
        }
        return i3 > 0 ? interfaceC23230.mo29129(i, i3, bArr) : "";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m17331(int i, int i2, byte[] bArr) {
        int i3 = i + i2;
        if (i2 < 2) {
            throw new IllegalArgumentException(C18307.m42645(i2, "Length ", " must be at least 2"));
        }
        long j = 0;
        if (bArr[i] == 0) {
            return 0L;
        }
        int i4 = i;
        while (i4 < i3 && bArr[i4] == 32) {
            i4++;
        }
        byte b = bArr[i3 - 1];
        while (i4 < i3 && (b == 0 || b == 32)) {
            b = bArr[i3 - 2];
            i3--;
        }
        while (i4 < i3) {
            byte b2 = bArr[i4];
            if (b2 < 48 || b2 > 55) {
                String replace = new String(bArr, i, i2, Charset.defaultCharset()).replace(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "{NUL}");
                StringBuilder m32308 = C13325.m32308(b2, "Invalid byte ", " at offset ");
                m32308.append(i4 - i);
                m32308.append(" in '");
                m32308.append(replace);
                m32308.append("' len=");
                m32308.append(i2);
                throw new IllegalArgumentException(m32308.toString());
            }
            j = (j << 3) + (b2 - 48);
            i4++;
        }
        return j;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m17338(int i, int i2, byte[] bArr) {
        byte b = bArr[i];
        if ((b & GCMSIVBlockCipher.MASK) == 0) {
            return m17331(i, i2, bArr);
        }
        boolean z = b == -1;
        if (i2 < 9) {
            if (i2 >= 9) {
                throw new IllegalArgumentException(C19373.m44634("At offset ", i, ", ", " byte binary number exceeds maximum signed long value", i2));
            }
            long j = 0;
            for (int i3 = 1; i3 < i2; i3++) {
                j = (j << 8) + (bArr[i + i3] & 255);
            }
            if (z) {
                j = (j - 1) ^ (((long) Math.pow(2.0d, (i2 - 1) * 8.0d)) - 1);
            }
            return z ? -j : j;
        }
        int i4 = i2 - 1;
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i + 1, bArr2, 0, i4);
        BigInteger bigInteger = new BigInteger(bArr2);
        if (z) {
            bigInteger = bigInteger.add(BigInteger.valueOf(-1L)).not();
        }
        if (bigInteger.bitLength() > 63) {
            throw new IllegalArgumentException(C19373.m44634("At offset ", i, ", ", " byte binary number exceeds maximum signed long value", i2));
        }
        long longValue = bigInteger.longValue();
        return z ? -longValue : longValue;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m17333(InputStream inputStream, int i) {
        ArrayList arrayList = new ArrayList();
        long[] m17337 = m17337(inputStream);
        long j = m17337[0];
        if (j < 0) {
            throw new IOException("Corrupted TAR archive. Negative value in sparse headers block");
        }
        long j2 = m17337[1];
        while (true) {
            long j3 = j - 1;
            if (j > 0) {
                long[] m173372 = m17337(inputStream);
                long j4 = m173372[0];
                if (j4 < 0) {
                    throw new IOException("Corrupted TAR archive. Sparse header block offset contains negative value");
                }
                long j5 = j2 + m173372[1];
                long[] m173373 = m17337(inputStream);
                long j6 = m173373[0];
                if (j6 < 0) {
                    throw new IOException("Corrupted TAR archive. Sparse header block numbytes contains negative value");
                }
                j2 = j5 + m173373[1];
                arrayList.add(new C4886(j4, j6));
                j = j3;
            } else {
                long j7 = i;
                C22194.m49845((j7 - (j2 % j7)) % j7, inputStream);
                return arrayList;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0136, code lost:
    
        throw new java.io.IOException("Failed to read Paxheader. Encountered a non-number while reading length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0138, code lost:
    
        r4 = -1;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap m17334(java.io.InputStream r15, java.util.ArrayList r16, java.util.HashMap r17, long r18) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6297.m17334(java.io.InputStream, java.util.ArrayList, java.util.HashMap, long):java.util.HashMap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        throw new java.io.IOException("Corrupted TAR archive. Non-numeric value in sparse headers block");
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long[] m17337(java.io.InputStream r8) {
        /*
            r0 = 0
            r2 = r0
        L3:
            int r4 = r8.read()
            r5 = 10
            r6 = 1
            if (r4 == r5) goto L32
            long r0 = r0 + r6
            r5 = -1
            if (r4 == r5) goto L2a
            r5 = 48
            if (r4 < r5) goto L22
            r5 = 57
            if (r4 > r5) goto L22
            r5 = 10
            long r2 = r2 * r5
            int r4 = r4 + (-48)
            long r4 = (long) r4
            long r2 = r2 + r4
            goto L3
        L22:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Corrupted TAR archive. Non-numeric value in sparse headers block"
            r8.<init>(r0)
            throw r8
        L2a:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Unexpected EOF when reading parse information of 1.X PAX format"
            r8.<init>(r0)
            throw r8
        L32:
            long r0 = r0 + r6
            r8 = 2
            long[] r8 = new long[r8]
            r4 = 0
            r8[r4] = r2
            r2 = 1
            r8[r2] = r0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6297.m17337(java.io.InputStream):long[]");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static List m17339(int i, int i2, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = (i3 * 24) + i;
            try {
                C4886 c4886 = new C4886(m17338(i4, 12, bArr), m17338(i4 + 12, 12, bArr));
                if (c4886.m14237() < 0) {
                    throw new IOException("Corrupted TAR archive, sparse entry with negative offset");
                }
                if (c4886.m14236() < 0) {
                    throw new IOException("Corrupted TAR archive, sparse entry with negative numbytes");
                }
                arrayList.add(c4886);
            } catch (IllegalArgumentException e) {
                throw new IOException("Corrupted TAR archive, sparse entry is invalid", e);
            }
        }
        return C20195.unmodifiableList(arrayList);
    }
}
