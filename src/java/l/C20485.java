package l;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;

/* compiled from: P70J */
/* renamed from: l.᩶᩺ܿ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20485 extends FilterInputStream implements InterfaceC14905 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f66039;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f66040;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CRC32 f66041;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C20485(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
        this.f66041 = new CRC32();
        this.f66040 = true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (this.f66040 && read >= 0) {
            this.f66041.update(read);
        }
        if (read >= 0) {
            this.f66039++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (this.f66040 && read > 0) {
            this.f66041.update(bArr, i, read);
        }
        if (read > 0) {
            this.f66039 += read;
        }
        return read;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m46936() {
        return this.f66041.getValue();
    }

    public final long getPosition() {
        return this.f66039;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m46937() {
        this.f66040 = false;
    }
}
