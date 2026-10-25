package l;

import java.io.FilterOutputStream;

/* compiled from: 27BS */
/* renamed from: l.֡ܳܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0474 extends FilterOutputStream {
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return;
        }
        ((FilterOutputStream) this).out.write(String.format("%x\r\n", Integer.valueOf(i2)).getBytes());
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        ((FilterOutputStream) this).out.write("\r\n".getBytes());
    }

    public final void finish() {
        ((FilterOutputStream) this).out.write("0\r\n\r\n".getBytes());
    }
}
