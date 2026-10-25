package l;

/* compiled from: 91H5 */
/* renamed from: l.ۛۜܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5896 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3074 f18106;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f18107;

    public C5896(C3074 c3074, int i) {
        this.f18106 = c3074;
        this.f18107 = i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m16529() {
        return this.f18107;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m16533(int i) {
        this.f18107 = i;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte m16532() {
        byte m9398 = this.f18106.m9398(this.f18107);
        this.f18107++;
        return m9398;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m16531() {
        int m9401 = this.f18106.m9401(this.f18107);
        this.f18107++;
        return m9401;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final short m16534() {
        short m9402 = this.f18106.m9402(this.f18107);
        this.f18107 += 2;
        return m9402;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m16537() {
        int m9399 = this.f18106.m9399(this.f18107);
        this.f18107 += 2;
        return m9399;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m16535() {
        int m9400 = this.f18106.m9400(this.f18107);
        this.f18107 += 4;
        return m9400;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] m16527(int i) {
        int[] m9397 = this.f18106.m9397(this.f18107, i);
        this.f18107 = (i * 4) + this.f18107;
        return m9397;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m16530(int i) {
        int i2 = this.f18107;
        StringBuilder sb = new StringBuilder(16);
        int i3 = i;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                break;
            }
            char m9402 = (char) this.f18106.m9402(i2);
            i2 += 2;
            if (m9402 == 0) {
                break;
            }
            sb.append(m9402);
            i3 = i4;
        }
        String sb2 = sb.toString();
        this.f18107 = (i * 2) + this.f18107;
        return sb2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16526(byte[] bArr) {
        this.f18106.m9394(this.f18107, bArr);
        this.f18107 += bArr.length;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m16525() {
        return this.f18106.m9393(this.f18107);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m16528() {
        this.f18107 += 4;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m16536(int i) {
        this.f18107 += i;
    }
}
