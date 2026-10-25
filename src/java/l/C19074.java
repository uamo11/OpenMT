package l;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* compiled from: C4R6 */
/* renamed from: l.ᩴ᩺ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19074 extends OutputStream {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final BufferedOutputStream f60060;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final BufferedOutputStream f60061;

    public C19074(BufferedOutputStream bufferedOutputStream, BufferedOutputStream bufferedOutputStream2) {
        this.f60060 = bufferedOutputStream;
        this.f60061 = bufferedOutputStream2;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f60060.write(i);
        this.f60061.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f60060.write(bArr, i, i2);
        this.f60061.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f60060.flush();
        this.f60061.flush();
    }
}
