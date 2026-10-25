package l;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: S8BI */
/* renamed from: l.᩵ۤܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19404 extends FilterInputStream implements InterfaceC14905 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f62780;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C19277 f62781;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C19404(InputStream inputStream, C19277 c19277, boolean z) {
        super(inputStream);
        this.f62781 = c19277;
        this.f62780 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19277 m44686() {
        return this.f62781;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (this.f62780 && read != -1) {
            this.f62781.m44460(1);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = super.skip(j);
        if (this.f62780 && skip > 0) {
            this.f62781.m44458(skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (this.f62780 && read != -1) {
            this.f62781.m44460(read);
        }
        return read;
    }
}
