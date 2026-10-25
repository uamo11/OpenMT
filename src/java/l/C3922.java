package l;

import java.io.OutputStream;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;

/* compiled from: 573L */
/* renamed from: l.ۘۨܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3922 extends InflaterInputStream implements InterfaceC14905 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f12506;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f12507;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1 || this.f12507) {
            return read;
        }
        if (((InflaterInputStream) this).inf.needsDictionary()) {
            throw new ZipException("ZLIB stream requires a preset dictionary");
        }
        if (((InflaterInputStream) this).inf.getRemaining() != 0 || ((InflaterInputStream) this).in.read() != -1) {
            throw new ZipException("Trailing data after ZLIB stream");
        }
        this.f12507 = true;
        return read;
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12506) {
            return;
        }
        this.f12506 = true;
        try {
            super.close();
        } finally {
            ((InflaterInputStream) this).inf.end();
        }
    }
}
