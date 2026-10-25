package l;

import java.io.OutputStream;
import java.util.zip.CRC32;

/* compiled from: DBV2 */
/* renamed from: l.᩸ۜ֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21407 extends C1080 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48506(byte[] bArr, OutputStream outputStream) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        long value = crc32.getValue();
        for (int i = 0; i < 4; i++) {
            outputStream.write((byte) (value >>> (i * 8)));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48505(OutputStream outputStream, long j) {
        while (j >= 128) {
            outputStream.write((byte) (128 | j));
            j >>>= 7;
        }
        outputStream.write((byte) j);
    }
}
