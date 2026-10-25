package l;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: J2K4 */
/* renamed from: l.ܰۡ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13705 extends OutputStream {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C13705 f40899 = new C13705();

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        throw new IOException("flush() failed: stream is closed");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        throw new IOException("write(byte[], int, int) failed: stream is closed");
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        throw new IOException("write(int) failed: stream is closed");
    }
}
