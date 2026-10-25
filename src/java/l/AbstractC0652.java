package l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: JAH8 */
/* renamed from: l.֡᩷֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC0652 extends FilterOutputStream {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f2501;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f2502;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f2503;

    public AbstractC0652(OutputStream outputStream) {
        super(outputStream);
        this.f2501 = new byte[1];
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        this.f2502 = true;
    }

    public void finish() {
        this.f2503 = true;
    }

    public final boolean isClosed() {
        return this.f2502;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2664() {
        if (this.f2503) {
            throw new IOException("Stream has already been finished.");
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m2665() {
        return this.f2503;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        byte[] bArr = this.f2501;
        bArr[0] = (byte) (i & 255);
        write(bArr, 0, 1);
    }
}
