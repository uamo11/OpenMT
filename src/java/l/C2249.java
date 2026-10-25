package l;

import java.util.Arrays;

/* compiled from: V9W8 */
/* renamed from: l.ۖۖ᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2249 implements InterfaceC8079 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f7319;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C3660[] f7320;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f7321;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f7322;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m7453() {
        return this.f7322;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m7452() {
        return this.f7321;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m7454() {
        return this.f7319;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C3660[] m7451() {
        return this.f7320;
    }

    @Override // l.InterfaceC8079
    /* renamed from: ֫ */
    public final int mo2557(int i, int i2, byte[] bArr) {
        this.f7322 = C1480.m5121(i, bArr) / 2;
        this.f7321 = C1480.m5121(i + 2, bArr);
        this.f7319 = C1480.m5121(i + 4, bArr);
        int i3 = i + 8;
        this.f7320 = new C3660[this.f7321];
        for (int i4 = 0; i4 < this.f7321; i4++) {
            C3660[] c3660Arr = this.f7320;
            C3660 c3660 = new C3660();
            c3660.f11543 = null;
            c3660.f11544 = null;
            c3660.f11539 = null;
            c3660.f11546 = new String[0];
            c3660Arr[i4] = c3660;
            i3 += c3660.mo2557(i3, i2, bArr);
        }
        return i3 - i;
    }

    public final String toString() {
        return "pathConsumed=" + this.f7322 + ",numReferrals=" + this.f7321 + ",flags=" + this.f7319 + ",referrals=" + Arrays.toString(this.f7320);
    }
}
