package l;

import java.io.OutputStream;

/* compiled from: D6X3 */
/* renamed from: l.᩹ۖۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21994 extends OutputStream {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final OutputStream f70418;

    public C21994(OutputStream outputStream) {
        this.f70418 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        try {
            this.f70418.write(i);
        } catch (RuntimeException e) {
            throw C12821.m31179(e);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        try {
            this.f70418.write(bArr, i, i2);
        } catch (RuntimeException e) {
            throw C12821.m31179(e);
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            this.f70418.flush();
        } catch (RuntimeException e) {
            throw C12821.m31179(e);
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f70418.close();
        } catch (RuntimeException e) {
            throw C12821.m31179(e);
        }
    }
}
