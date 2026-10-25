package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: P2G3 */
/* renamed from: l.ۤۡ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC10179 extends FilterInputStream implements InterfaceC14905 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C18307 f30582;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C5688 f30583;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public AbstractC10179(InputStream inputStream, C4534 c4534) {
        super(inputStream);
        this.f30583 = new C5688();
        this.f30582 = InterfaceC1006.f3723;
    }

    /* renamed from: ֫ */
    public void mo9504(int i) {
        this.f30582.getClass();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                m25538(e);
                throw null;
            } catch (Exception e2) {
                m25538(new IOException(e2));
                throw null;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25538(IOException iOException) {
        this.f30583.getClass();
        throw iOException;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        try {
            int read = ((FilterInputStream) this).in.read();
            mo9504(read != -1 ? 1 : -1);
            return read;
        } catch (IOException e) {
            m25538(e);
            throw null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            int read = ((FilterInputStream) this).in.read(bArr, i, i2);
            mo9504(read);
            return read;
        } catch (IOException e) {
            m25538(e);
            throw null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        try {
            return ((FilterInputStream) this).in.skip(j);
        } catch (IOException e) {
            m25538(e);
            throw null;
        }
    }
}
