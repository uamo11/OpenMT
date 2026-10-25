package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: 54YN */
/* renamed from: l.ۚۖܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5067 extends InputStream implements InterfaceC14905 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC7889 f15936;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f15937;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f15938 = -1;

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.f15938 = this.f15937;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        long j = this.f15938;
        if (j < 0) {
            throw new IOException("Resetting to invalid mark");
        }
        this.f15937 = j;
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C5067(long j, C23411 c23411) {
        this.f15937 = j;
        this.f15936 = c23411;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j = this.f15937;
        InterfaceC7889 interfaceC7889 = this.f15936;
        interfaceC7889.seek(j);
        this.f15937++;
        return interfaceC7889.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        long j = this.f15937;
        InterfaceC7889 interfaceC7889 = this.f15936;
        interfaceC7889.seek(j);
        int read = interfaceC7889.read(bArr);
        if (read > 0) {
            this.f15937 += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f15937;
        InterfaceC7889 interfaceC7889 = this.f15936;
        interfaceC7889.seek(j);
        int read = interfaceC7889.read(bArr, i, i2);
        if (read > 0) {
            this.f15937 += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        long min = Math.min((int) j, available());
        this.f15937 += min;
        return min;
    }

    @Override // java.io.InputStream
    public final int available() {
        long length = this.f15936.length() - this.f15937;
        if (length > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) length;
    }
}
