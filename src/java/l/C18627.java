package l;

import android.net.Uri;

/* compiled from: V1VQ */
/* renamed from: l.ᩴ۠֫, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18627 extends AbstractC2399 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f57779;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C6367 f57780;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f57781;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f57782;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Uri f57783;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f57784;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18627(byte[] bArr) {
        super(false);
        C6367 c6367 = new C6367(bArr);
        this.f57780 = c6367;
        C22632.m50631(bArr.length > 0);
    }

    @Override // l.InterfaceC21449
    /* renamed from: ֫ */
    public final long mo1620(C3104 c3104) {
        m7774(c3104);
        Uri uri = c3104.f9711;
        long j = c3104.f9713;
        this.f57783 = uri;
        byte[] bArr = (byte[]) this.f57780.f19704;
        this.f57781 = bArr;
        long j2 = c3104.f9718;
        if (j2 > bArr.length) {
            throw new C22154(2008);
        }
        int i = (int) j2;
        this.f57779 = i;
        int length = bArr.length - i;
        this.f57782 = length;
        if (j != -1) {
            this.f57782 = (int) Math.min(length, j);
        }
        this.f57784 = true;
        m7776(c3104);
        return j != -1 ? j : this.f57782;
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f57782;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f57781;
        C22632.m50632(bArr2);
        System.arraycopy(bArr2, this.f57779, bArr, i, min);
        this.f57779 += min;
        this.f57782 -= min;
        m7777(min);
        return min;
    }

    @Override // l.InterfaceC21449
    /* renamed from: ܿ */
    public final Uri mo1621() {
        return this.f57783;
    }

    @Override // l.InterfaceC21449
    public final void close() {
        if (this.f57784) {
            this.f57784 = false;
            m7775();
        }
        this.f57783 = null;
        this.f57781 = null;
    }
}
