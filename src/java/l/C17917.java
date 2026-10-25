package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: P77N */
/* renamed from: l.ᩳ۟᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17917 extends FilterInputStream implements InterfaceC14905 {
    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C17917(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        boolean m37367;
        try {
            return super.read();
        } catch (IOException e) {
            throw new C17211(e);
        } catch (RuntimeException e2) {
            m37367 = C15799.m37367(e2);
            if (!m37367) {
                throw e2;
            }
            throw new C14388(e2);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        boolean m37367;
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            throw new C17211(e);
        } catch (RuntimeException e2) {
            m37367 = C15799.m37367(e2);
            if (!m37367) {
                throw e2;
            }
            throw new C14388(e2);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean m37367;
        try {
            super.close();
        } catch (IOException e) {
            throw new C17211(e);
        } catch (RuntimeException e2) {
            m37367 = C15799.m37367(e2);
            if (!m37367) {
                throw e2;
            }
            throw new C14388(e2);
        }
    }
}
