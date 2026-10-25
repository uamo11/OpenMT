package l;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: V9OM */
/* renamed from: l.ܺۜۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15763 extends FilterInputStream implements InterfaceC14905 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f48598;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C15763(InputStream inputStream, int i) {
        super(inputStream);
        this.f48598 = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f48598);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f48598 <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.f48598--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f48598;
        if (i3 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            this.f48598 -= read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        int skip = (int) super.skip(Math.min(j, this.f48598));
        if (skip >= 0) {
            this.f48598 -= skip;
        }
        return skip;
    }
}
