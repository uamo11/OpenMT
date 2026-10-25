package l;

import java.io.OutputStream;

/* compiled from: 95GT */
/* renamed from: l.۠ۡۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8067 extends OutputStream {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f24870;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21473 f24871;

    public C8067(C21473 c21473, int i) {
        this.f24871 = c21473;
        this.f24870 = i;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte[] bArr;
        int i2 = this.f24870 + 1;
        C21473 c21473 = this.f24871;
        C21473.m48619(c21473, i2);
        bArr = c21473.f69095;
        int i3 = this.f24870;
        this.f24870 = i3 + 1;
        bArr[i3] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        byte[] bArr2;
        int length = this.f24870 + bArr.length;
        C21473 c21473 = this.f24871;
        C21473.m48619(c21473, length);
        bArr2 = c21473.f69095;
        System.arraycopy(bArr, 0, bArr2, this.f24870, bArr.length);
        this.f24870 += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        int i3 = this.f24870 + i2;
        C21473 c21473 = this.f24871;
        C21473.m48619(c21473, i3);
        bArr2 = c21473.f69095;
        System.arraycopy(bArr, i, bArr2, this.f24870, i2);
        this.f24870 += i2;
    }
}
