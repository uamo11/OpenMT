package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import org.bouncycastle.crypto.hpke.HPKE;

/* compiled from: J71B */
/* renamed from: l.ۜۢۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6678 {

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final String[] f20742 = new String[0];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f20743;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f20744;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f20745;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f20746;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long f20747;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long[] f20748;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f20749;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f20750;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f20751;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] f20752 = new byte[1024];

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f20753;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f20754;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f20755;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f20756;

    public C6678(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.f20751 = j;
        this.f20747 = j2;
        this.f20745 = j3;
        this.f20744 = j4;
        this.f20749 = j5;
        this.f20743 = j6;
        this.f20753 = j7;
        this.f20754 = j8;
        this.f20755 = j9;
        this.f20746 = j10;
        this.f20756 = j11;
        this.f20750 = j12;
        if (j4 > 2147483647L) {
            throw new IllegalArgumentException("Too many boot hierarchy types");
        }
        this.f20748 = new long[(int) j4];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6678 m18216(File file) {
        if (!file.isFile() || file.length() != 3415240) {
            throw new IOException("Boot hierarchy raw file size mismatch");
        }
        byte[] bArr = new byte[208];
        MessageDigest m34534 = C14460.m34534();
        MessageDigest m345342 = C14460.m34534();
        FileInputStream fileInputStream = new FileInputStream(file);
        int i = 0;
        while (i < 208) {
            try {
                int read = fileInputStream.read(bArr, i, 208 - i);
                if (read < 0) {
                    throw new IOException("Truncated boot hierarchy header");
                }
                i += read;
            } finally {
            }
        }
        m34534.update(bArr);
        byte[] bArr2 = new byte[32768];
        while (true) {
            int read2 = fileInputStream.read(bArr2);
            if (read2 == -1) {
                break;
            }
            m34534.update(bArr2, 0, read2);
            m345342.update(bArr2, 0, read2);
        }
        fileInputStream.close();
        if (!"bacb8cb4bb4a4c60edf467ff9d5a56aff4b5bb36e37bbd08e3b0e162efede5fc".equals(C14460.m34531(m34534.digest()))) {
            throw new IOException("Boot hierarchy raw checksum mismatch");
        }
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        if (order.get() != 77 || order.get() != 84 || order.get() != 66 || order.get() != 72 || (order.getShort() & HPKE.aead_EXPORT_ONLY) != 1 || (order.getShort() & HPKE.aead_EXPORT_ONLY) != 208 || order.getInt() != 16909060 || (order.getInt() & 4294967295L) != 36 || (order.getInt() & 4294967295L) != 1) {
            throw new IOException("Invalid boot hierarchy header");
        }
        if (order.getInt() != 0) {
            throw new IOException("Unsupported boot hierarchy flags");
        }
        long j = order.getInt() & 4294967295L;
        long j2 = order.getInt() & 4294967295L;
        long j3 = order.getInt() & 4294967295L;
        long j4 = order.getInt() & 4294967295L;
        long j5 = order.getInt() & 4294967295L;
        if (order.getInt() != 0 || j2 > j) {
            throw new IOException("Invalid boot hierarchy counts");
        }
        long[] jArr = new long[6];
        long[] jArr2 = new long[6];
        for (int i2 = 0; i2 < 6; i2++) {
            jArr[i2] = order.getLong();
            jArr2[i2] = order.getLong();
        }
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[32];
        order.get(bArr3);
        order.get(bArr4);
        if (!"d9eb9da824d9e247a352f570f01e1169e725b2954bca9e283a71786c59b59f9a".equals(C14460.m34531(bArr3)) || !"b2e82096748c00fa60056e7affddea44002d3a0e44201dc814dff202cdfc0e95".equals(C14460.m34531(bArr4)) || !"b2e82096748c00fa60056e7affddea44002d3a0e44201dc814dff202cdfc0e95".equals(C14460.m34531(m345342.digest()))) {
            throw new IOException("Boot hierarchy payload identity mismatch");
        }
        long[] jArr3 = {jArr2[0], m18212(12, j), m18212(16, j2), m18212(4, j3), m18212(20, j4), m18212(8, j5)};
        int i3 = 1;
        for (int i4 = 6; i3 < i4; i4 = 6) {
            if (jArr2[i3] != jArr3[i3]) {
                throw new IOException("Invalid boot hierarchy section length");
            }
            i3++;
        }
        int i5 = 0;
        long j6 = 208;
        while (i5 < 6) {
            long j7 = jArr[i5];
            long j8 = jArr2[i5];
            long length = file.length();
            if (j7 >= 208 && j8 >= 0 && j7 <= length && j8 <= length - j7) {
                long j9 = j7 + j8;
                long j10 = jArr[i5];
                if ((j10 & 7) != 0 || j10 < j6) {
                    throw new IOException("Overlapping boot hierarchy sections");
                }
                i5++;
                j6 = j9;
            } else {
                throw new IOException("Invalid boot hierarchy section range");
            }
        }
        if (j6 != file.length()) {
            throw new IOException("Trailing boot hierarchy data");
        }
        file.length();
        C6678 c6678 = new C6678(jArr[0], jArr2[0], jArr[1], j, jArr[2], j2, jArr[3], j3, jArr[4], j4, jArr[5], j5);
        byte[] bArr5 = c6678.f20752;
        long[] jArr4 = c6678.f20748;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        for (int i6 = 0; i6 < jArr4.length; i6++) {
            try {
                randomAccessFile.seek((i6 * 12) + c6678.f20745);
                long m18213 = m18213(randomAccessFile);
                long m182132 = m18213(randomAccessFile);
                c6678.m18217(m18213, m182132);
                randomAccessFile.seek(c6678.f20751 + m18213);
                long j11 = -3750763034362895579L;
                while (m182132 > 0) {
                    int min = (int) Math.min(bArr5.length, m182132);
                    randomAccessFile.readFully(bArr5, 0, min);
                    for (int i7 = 0; i7 < min; i7++) {
                        j11 = (j11 ^ (bArr5[i7] & 255)) * 1099511628211L;
                    }
                    m182132 -= min;
                }
                jArr4[i6] = j11;
            } finally {
            }
        }
        randomAccessFile.close();
        Arrays.sort(jArr4);
        return c6678;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0199  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C16555 m18218(java.io.RandomAccessFile r34, java.lang.String r35, java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6678.m18218(java.io.RandomAccessFile, java.lang.String, java.lang.String):l.ܽۢۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m18214(RandomAccessFile randomAccessFile, byte[] bArr, long j, long j2, int i) {
        long j3;
        long j4;
        int compare;
        long j5;
        long j6 = j2 - 1;
        long j7 = 0;
        while (j7 <= j6) {
            long j8 = (j7 + j6) >>> 1;
            randomAccessFile.seek((i * j8) + j);
            long m18213 = m18213(randomAccessFile);
            long m182132 = m18213(randomAccessFile);
            m18217(m18213, m182132);
            long min = Math.min(m182132, bArr.length);
            long j9 = j6;
            randomAccessFile.seek(this.f20751 + m18213);
            long j10 = 0;
            while (true) {
                if (j10 < min) {
                    byte[] bArr2 = this.f20752;
                    j3 = j7;
                    j4 = j8;
                    int min2 = (int) Math.min(bArr2.length, min - j10);
                    randomAccessFile.readFully(bArr2, 0, min2);
                    for (int i2 = 0; i2 < min2; i2++) {
                        int i3 = bArr2[i2] & 255;
                        int i4 = bArr[((int) j10) + i2] & 255;
                        if (i3 != i4) {
                            compare = i3 < i4 ? -1 : 1;
                        }
                    }
                    j10 += min2;
                    j7 = j3;
                    j8 = j4;
                } else {
                    j3 = j7;
                    j4 = j8;
                    compare = Long.compare(m182132, bArr.length);
                    break;
                }
            }
            if (compare < 0) {
                j7 = j4 + 1;
                j5 = j9;
            } else {
                if (compare <= 0) {
                    return j4;
                }
                j5 = j4 - 1;
                j7 = j3;
            }
            j6 = j5;
        }
        return -1L;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m18215(RandomAccessFile randomAccessFile, long j) {
        if (j < 0 || j >= this.f20744) {
            throw new IOException("Invalid boot hierarchy type id");
        }
        randomAccessFile.seek((j * 12) + this.f20745);
        long m18213 = m18213(randomAccessFile);
        long m182132 = m18213(randomAccessFile);
        m18217(m18213, m182132);
        if (m182132 > 1048576) {
            throw new IOException("Boot hierarchy string is too large");
        }
        byte[] bArr = new byte[(int) m182132];
        randomAccessFile.seek(this.f20751 + m18213);
        randomAccessFile.readFully(bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18217(long j, long j2) {
        if (j >= 0 && j2 >= 0) {
            long j3 = this.f20747;
            if (j <= j3 && j2 <= j3 - j) {
                return;
            }
        }
        throw new IOException("Invalid boot hierarchy string slice");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m18212(int i, long j) {
        long j2 = i;
        if (j <= C13132.FOREVER_NS / j2) {
            return j * j2;
        }
        throw new IOException("Boot hierarchy count overflow");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m18213(RandomAccessFile randomAccessFile) {
        return Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
    }
}
