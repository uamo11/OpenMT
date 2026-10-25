package l;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: Q4HB */
/* renamed from: l.᩶ܰۡ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20207 extends InputStream implements InterfaceC14905 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f65379 = new byte[1];

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C4684 f65380;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C12445 f65381;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C20207(C18090 c18090, C3545 c3545, C12445 c12445, String str) {
        this.f65381 = c12445;
        byte[] bArr = new byte[12];
        C2568.m8119(c12445, bArr, 12);
        this.f65380 = new C4684(c18090, c3545, str, bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.f65381.read(bArr, i, i2);
        if (read > 0) {
            this.f65380.m13740(i, read, bArr);
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f65379;
        if (read(bArr) <= 0) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
