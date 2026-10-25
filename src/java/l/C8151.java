package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: Q6MT */
/* renamed from: l.۠ۨۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8151 extends FilterInputStream implements InterfaceC14905 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f25140;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f25141;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f25142;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C8151(InputStream inputStream) {
        super(inputStream);
        this.f25140 = 268435456L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        m21622();
        int read = ((FilterInputStream) this).in.read();
        if (read >= 0) {
            m21621(1L);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        m21622();
        InputStream inputStream = ((FilterInputStream) this).in;
        long j = i2;
        long j2 = this.f25140 - this.f25141;
        if (j2 != C13132.FOREVER_NS) {
            j2++;
        }
        int read = inputStream.read(bArr, i, (int) Math.min(j, j2));
        if (read > 0) {
            m21621(read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        m21622();
        InputStream inputStream = ((FilterInputStream) this).in;
        long j2 = this.f25140 - this.f25141;
        if (j2 != C13132.FOREVER_NS) {
            j2++;
        }
        long skip = inputStream.skip(Math.min(j, j2));
        if (skip > 0) {
            m21621(skip);
        }
        return skip;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m21621(long j) {
        long j2 = this.f25141;
        if (j > this.f25140 - j2) {
            this.f25142 = true;
        } else {
            this.f25141 = j2 + j;
        }
        m21622();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21622() {
        if (this.f25142) {
            throw new IOException("Image input exceeds byte limit");
        }
    }
}
