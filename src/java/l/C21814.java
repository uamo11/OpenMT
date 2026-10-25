package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.util.zip.GZIPInputStream;

/* compiled from: R6SP */
/* renamed from: l.᩸᩶ᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21814 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49169(InputStream inputStream, long j, OutputStream outputStream) {
        int i;
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 2);
        int m49166 = m49166((InputStream) pushbackInputStream);
        int m491662 = m49166((InputStream) pushbackInputStream);
        int i2 = (m491662 << 8) | m49166;
        byte[] bArr = new byte[8192];
        if (i2 != 10831 && i2 != 10847) {
            pushbackInputStream.unread(new byte[]{(byte) m49166, (byte) m491662});
            m49168(pushbackInputStream, outputStream, bArr, j);
            return;
        }
        byte[] bArr2 = new byte[6];
        for (int i3 = 0; i3 < 6; i3++) {
            bArr2[i3] = (byte) m49166((InputStream) pushbackInputStream);
        }
        C12951 c12951 = new C12951(bArr2);
        int readInt = c12951.readInt();
        int m31494 = c12951.m31494();
        if (readInt > 0) {
            long j2 = readInt;
            if (j2 <= j && m31494 == (131071 + j2) / 131072) {
                for (int i4 = 0; i4 < m31494; i4++) {
                    if (i2 == 10831) {
                        i = m49166((InputStream) pushbackInputStream) | (m49166((InputStream) pushbackInputStream) << 8);
                    } else {
                        int i5 = 0;
                        for (int i6 = 0; i6 <= 28; i6 += 7) {
                            int m491663 = m49166((InputStream) pushbackInputStream);
                            if (i6 == 28 && (m491663 & 248) != 0) {
                                throw new IOException("Legacy compression block length overflows");
                            }
                            i5 |= (m491663 & 127) << i6;
                            if ((m491663 & 128) == 0) {
                                i = i5;
                            }
                        }
                        throw new IOException("Invalid legacy compression block length");
                    }
                    if (i <= 0) {
                        throw new IOException("Invalid legacy compression block length");
                    }
                    C15462 c15462 = new C15462(pushbackInputStream, i);
                    long min = Math.min(131072L, j2);
                    if (m49168(c15462, outputStream, bArr, min) != min || c15462.f47328 != 0) {
                        throw new IOException("Legacy compression block does not match declared length");
                    }
                    j2 -= min;
                }
                if (pushbackInputStream.read() != -1) {
                    throw new IOException("Trailing bytes in legacy compression container");
                }
                return;
            }
        }
        throw new IOException("Invalid legacy compression block count or total length");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m49168(InputStream inputStream, OutputStream outputStream, byte[] bArr, long j) {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new C8408(inputStream), 1024);
        long j2 = 0;
        while (true) {
            try {
                int read = gZIPInputStream.read(bArr);
                if (read == -1) {
                    gZIPInputStream.close();
                    return j2;
                }
                if (read <= 0) {
                    throw new IOException("Legacy decompression made no progress");
                }
                long j3 = read;
                if (j3 > j - j2) {
                    throw new IOException("Legacy state exceeds decompression limit");
                }
                outputStream.write(bArr, 0, read);
                j2 += j3;
            } catch (Throwable th) {
                try {
                    gZIPInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m49166(InputStream inputStream) {
        int read = inputStream.read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException("Truncated legacy compression container");
    }
}
