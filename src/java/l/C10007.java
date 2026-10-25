package l;

import com.umeng.analytics.pro.bo;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* compiled from: CAQD */
/* renamed from: l.ۤۖܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10007 extends C12123 {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final byte[] f30137 = {bo.j, -117, 8, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public CRC32 f30138;

    public C10007(OutputStream outputStream) {
        super(outputStream, new Deflater(1, true));
        CRC32 crc32 = new CRC32();
        this.f30138 = crc32;
        this.f36207 = true;
        ((FilterOutputStream) this).out.write(f30137);
        crc32.reset();
    }

    @Override // l.C12123, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        super.write(bArr, i, i2);
        this.f30138.update(bArr, i, i2);
    }

    @Override // l.C12123
    public final void finish() {
        Deflater deflater = this.f36208;
        if (deflater.finished()) {
            return;
        }
        deflater.finish();
        while (true) {
            boolean finished = deflater.finished();
            CRC32 crc32 = this.f30138;
            if (finished) {
                int value = (int) crc32.getValue();
                int i = value >> 16;
                int totalIn = deflater.getTotalIn();
                int i2 = totalIn >> 16;
                ((FilterOutputStream) this).out.write(new byte[]{(byte) (value & 255), (byte) (((value & 65535) >> 8) & 255), (byte) (i & 255), (byte) (((i & 65535) >> 8) & 255), (byte) (totalIn & 255), (byte) (((totalIn & 65535) >> 8) & 255), (byte) (i2 & 255), (byte) (((65535 & i2) >> 8) & 255)});
                return;
            }
            byte[] bArr = this.f36209;
            int deflate = deflater.deflate(bArr, 0, bArr.length);
            if (deflater.finished()) {
                byte[] bArr2 = this.f36209;
                if (deflate <= bArr2.length - 8) {
                    int value2 = (int) crc32.getValue();
                    bArr2[deflate] = (byte) (value2 & 255);
                    bArr2[deflate + 1] = (byte) (((value2 & 65535) >> 8) & 255);
                    int i3 = value2 >> 16;
                    bArr2[deflate + 2] = (byte) (i3 & 255);
                    bArr2[deflate + 3] = (byte) (((i3 & 65535) >> 8) & 255);
                    int totalIn2 = deflater.getTotalIn();
                    bArr2[deflate + 4] = (byte) (totalIn2 & 255);
                    bArr2[deflate + 5] = (byte) (((totalIn2 & 65535) >> 8) & 255);
                    int i4 = totalIn2 >> 16;
                    bArr2[deflate + 6] = (byte) (i4 & 255);
                    bArr2[deflate + 7] = (byte) (((65535 & i4) >> 8) & 255);
                    ((FilterOutputStream) this).out.write(this.f36209, 0, deflate + 8);
                    return;
                }
            }
            if (deflate > 0) {
                ((FilterOutputStream) this).out.write(this.f36209, 0, deflate);
            }
        }
    }
}
