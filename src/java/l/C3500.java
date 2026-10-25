package l;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Properties;
import java.util.zip.ZipException;

/* compiled from: 51RR */
/* renamed from: l.ۗ᩸ۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3500 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C14809 f11098 = new C14809();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m10684(File file) {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                byte[] m10686 = m10686(randomAccessFile2);
                if (m10686 != null) {
                    C4911 c4911 = new C4911();
                    Properties properties = new Properties();
                    c4911.f15502 = properties;
                    c4911.m14281(m10686);
                    String property = properties.getProperty("channelNo");
                    randomAccessFile2.close();
                    return property;
                }
                randomAccessFile2.close();
                return null;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m10686(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length() - 22;
        randomAccessFile.seek(length);
        byte[] bArr = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
        int read = randomAccessFile.read();
        while (read != -1) {
            if (read != bArr[0] || randomAccessFile.read() != bArr[1] || randomAccessFile.read() != bArr[2] || randomAccessFile.read() != bArr[3]) {
                length--;
                randomAccessFile.seek(length);
                read = randomAccessFile.read();
            } else {
                randomAccessFile.seek(length + 20);
                byte[] bArr2 = new byte[2];
                randomAccessFile.readFully(bArr2);
                int m35213 = new C14809(bArr2).m35213();
                if (m35213 == 0) {
                    return null;
                }
                byte[] bArr3 = new byte[m35213];
                randomAccessFile.read(bArr3);
                return bArr3;
            }
        }
        throw new ZipException("archive is not a ZIP archive");
    }
}
