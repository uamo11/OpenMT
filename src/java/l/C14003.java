package l;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: V7BB */
/* renamed from: l.ܰᩴۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14003 extends InputStream implements InterfaceC14905 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f42361;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InputStream f42362;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C14003(long j, InputStream inputStream) {
        this.f42362 = inputStream;
        this.f42361 = Math.max(j, 0L);
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f42361 <= 0) {
            return -1;
        }
        int read = this.f42362.read();
        if (read != -1) {
            this.f42361--;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f42361;
        if (j <= 0) {
            return -1;
        }
        int read = this.f42362.read(bArr, i, (int) Math.min(i2, j));
        if (read > 0) {
            this.f42361 -= read;
        }
        return read;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f42362.close();
    }
}
