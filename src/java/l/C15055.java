package l;

import java.io.EOFException;
import java.io.InputStream;
import java.util.zip.CRC32;

/* compiled from: 01TM */
/* renamed from: l.ܶۜ֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C15055 extends C1080 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m35595(int i, byte[] bArr, int i2, int i3) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        long value = crc32.getValue();
        for (int i4 = 0; i4 < 4; i4++) {
            if (((byte) (value >>> (i4 * 8))) != bArr[i3 + i4]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C22112 m35596(byte[] bArr) {
        for (int i = 0; i < 6; i++) {
            if (bArr[i] != C8707.f26510[i]) {
                throw new C15761("Input is not in the XZ format");
            }
        }
        if (!m35595(6, bArr, 2, 8)) {
            throw new C22609("XZ Stream Header is corrupt");
        }
        try {
            return m35593(6, bArr);
        } catch (C9413 unused) {
            throw new C9413("Unsupported options in XZ Stream Header");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22112 m35594(byte[] bArr) {
        byte b = bArr[10];
        byte[] bArr2 = C8707.f26509;
        if (b != bArr2[0] || bArr[11] != bArr2[1]) {
            throw new C22609("XZ Stream Footer is corrupt");
        }
        if (!m35595(4, bArr, 6, 0)) {
            throw new C22609("XZ Stream Footer is corrupt");
        }
        try {
            C22112 m35593 = m35593(8, bArr);
            m35593.f71786 = 0L;
            for (int i = 0; i < 4; i++) {
                m35593.f71786 |= (bArr[i + 4] & 255) << (i * 8);
            }
            m35593.f71786 = (m35593.f71786 + 1) * 4;
            return m35593;
        } catch (C9413 unused) {
            throw new C9413("Unsupported options in XZ Stream Footer");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22112 m35593(int i, byte[] bArr) {
        if (bArr[i] == 0) {
            byte b = bArr[i + 1];
            if ((b & 255) < 16) {
                C22112 c22112 = new C22112();
                c22112.f71787 = b;
                return c22112;
            }
        }
        throw new C9413();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m35592(InputStream inputStream) {
        int read = inputStream.read();
        if (read == -1) {
            throw new EOFException();
        }
        long j = read & 127;
        int i = 0;
        while ((read & 128) != 0) {
            i++;
            if (i >= 9) {
                throw new C22609();
            }
            read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            }
            if (read == 0) {
                throw new C22609();
            }
            j |= (read & 127) << (i * 7);
        }
        return j;
    }
}
