package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;

/* compiled from: R6SP */
/* renamed from: l.ܶ᩶ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15462 extends InputStream implements InterfaceC14905 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f47328;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final PushbackInputStream f47329;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C15462(PushbackInputStream pushbackInputStream, int i) {
        this.f47329 = pushbackInputStream;
        this.f47328 = i;
    }

    @Override // java.io.InputStream
    public final int read() {
        int m49166;
        if (this.f47328 == 0) {
            return -1;
        }
        m49166 = C21814.m49166((InputStream) this.f47329);
        this.f47328--;
        return m49166;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f47328;
        if (i3 == 0) {
            return -1;
        }
        int read = this.f47329.read(bArr, i, Math.min(i2, i3));
        if (read < 0) {
            throw new EOFException("Truncated legacy compression block");
        }
        if (read <= 0) {
            throw new IOException("Legacy compression block read made no progress");
        }
        this.f47328 -= read;
        return read;
    }

    @Override // java.io.InputStream
    public final int available() {
        return Math.min(this.f47328, this.f47329.available());
    }
}
