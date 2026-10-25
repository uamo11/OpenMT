package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: 21TH */
/* renamed from: l.ۜۜ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6590 extends InputStream implements InterfaceC14905 {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C22112 f20301;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f20302;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InputStream f20305;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC5179 f20306;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4265 f20307;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f20309;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C8498 f20308 = null;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C12939 f20304 = new C12939();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f20300 = false;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public IOException f20299 = null;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] f20303 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C6590(InputStream inputStream, int i, boolean z, byte[] bArr, C4265 c4265) {
        this.f20307 = c4265;
        this.f20305 = inputStream;
        this.f20302 = i;
        this.f20309 = z;
        C22112 m35596 = C15055.m35596(bArr);
        this.f20301 = m35596;
        this.f20306 = AbstractC5179.m14834(m35596.f71787);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f20303;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f20305 == null) {
            throw new C2357("Stream closed");
        }
        IOException iOException = this.f20299;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f20300) {
            return -1;
        }
        int i4 = 0;
        while (i2 > 0) {
            try {
                C8498 c8498 = this.f20308;
                C12939 c12939 = this.f20304;
                if (c8498 == null) {
                    try {
                        this.f20308 = new C8498(this.f20305, this.f20306, this.f20309, this.f20302, this.f20307);
                    } catch (C12026 unused) {
                        c12939.m31444(this.f20305);
                        m18097();
                        this.f20300 = true;
                        if (i4 > 0) {
                            return i4;
                        }
                        return -1;
                    }
                }
                int read = this.f20308.read(bArr, i, i2);
                if (read > 0) {
                    i4 += read;
                    i += read;
                    i2 -= read;
                } else if (read == -1) {
                    c12939.mo9381(this.f20308.m22196(), this.f20308.m22195());
                    this.f20308 = null;
                }
            } catch (IOException e) {
                this.f20299 = e;
                if (i4 == 0) {
                    throw e;
                }
            }
        }
        return i4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18097() {
        byte[] bArr = new byte[12];
        new DataInputStream(this.f20305).readFully(bArr);
        C22112 m35594 = C15055.m35594(bArr);
        if (this.f20301.f71787 != m35594.f71787 || this.f20304.m13213() != m35594.f71786) {
            throw new C22609("XZ Stream Footer does not match Stream Header");
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.f20305 == null) {
            throw new C2357("Stream closed");
        }
        IOException iOException = this.f20299;
        if (iOException != null) {
            throw iOException;
        }
        C8498 c8498 = this.f20308;
        if (c8498 == null) {
            return 0;
        }
        return c8498.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m18098(true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18098(boolean z) {
        if (this.f20305 != null) {
            C8498 c8498 = this.f20308;
            if (c8498 != null) {
                c8498.close();
                this.f20308 = null;
            }
            if (z) {
                try {
                    this.f20305.close();
                } finally {
                    this.f20305 = null;
                }
            }
        }
    }
}
