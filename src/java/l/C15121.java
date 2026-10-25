package l;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: 95GT */
/* renamed from: l.ܶۡۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15121 extends InputStream implements InterfaceC14905 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21473 f46236;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f46237;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f46238;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C15121(C21473 c21473, int i) {
        this.f46236 = c21473;
        this.f46238 = i;
        this.f46237 = i;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i;
        byte[] bArr;
        int i2 = this.f46238;
        C21473 c21473 = this.f46236;
        i = c21473.f69096;
        if (i2 >= i) {
            return -1;
        }
        bArr = c21473.f69095;
        int i3 = this.f46238;
        this.f46238 = i3 + 1;
        return bArr[i3];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int i;
        byte[] bArr2;
        int i2;
        int length = bArr.length;
        C21473 c21473 = this.f46236;
        i = c21473.f69096;
        int min = Math.min(length, i - this.f46238);
        if (min <= 0) {
            int i3 = this.f46238;
            i2 = c21473.f69096;
            return i3 >= i2 ? -1 : 0;
        }
        bArr2 = c21473.f69095;
        System.arraycopy(bArr2, this.f46238, bArr, 0, min);
        this.f46238 += min;
        return min;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        byte[] bArr2;
        int i4;
        C21473 c21473 = this.f46236;
        i3 = c21473.f69096;
        int min = Math.min(i2, i3 - this.f46238);
        if (min <= 0) {
            int i5 = this.f46238;
            i4 = c21473.f69096;
            return i5 >= i4 ? -1 : 0;
        }
        bArr2 = c21473.f69095;
        System.arraycopy(bArr2, this.f46238, bArr, i, min);
        this.f46238 += min;
        return min;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int i;
        i = this.f46236.f69096;
        int max = (int) Math.max(0L, Math.min(j, i - this.f46238));
        this.f46238 += max;
        return max;
    }

    @Override // java.io.InputStream
    public final int available() {
        int i;
        i = this.f46236.f69096;
        return Math.max(0, i - this.f46238);
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f46237 = this.f46238;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f46238 = this.f46237;
    }
}
