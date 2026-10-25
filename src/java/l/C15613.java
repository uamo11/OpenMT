package l;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: M9Q4 */
/* renamed from: l.ܺ֨᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15613 extends OutputStream {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final FileChannel f48080;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f48081;

    public C15613(FileChannel fileChannel, long j) {
        this.f48080 = fileChannel;
        this.f48081 = j;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        long j = this.f48081;
        while (wrap.hasRemaining()) {
            int write = this.f48080.write(wrap, j);
            if (write <= 0) {
                throw new IOException("FileChannel write made no progress");
            }
            j += write;
        }
        this.f48081 = j;
    }
}
