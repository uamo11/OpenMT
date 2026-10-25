package l;

/* compiled from: C9KT */
/* renamed from: l.۠ۢۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8087 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC22198 f24901;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f24902 = new byte[4];

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C16261 f24903;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21456(InterfaceC22198 interfaceC22198) {
        f24901 = interfaceC22198;
    }

    public C8087(C16261 c16261) {
        this.f24903 = c16261;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21457() {
        this.f24903.f50017 = 5;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21458(int i, boolean z) {
        C16261 c16261 = this.f24903;
        int i2 = c16261.f50017;
        if (!z) {
            i2 -= 4;
        }
        int i3 = (-i2) & (i - 1);
        if (i3 < i) {
            i3 += i;
        }
        int i4 = i2 + i3;
        if (z) {
            i4 -= 4;
        }
        byte[] bArr = this.f24902;
        bArr[0] = (byte) (i4 >>> 24);
        bArr[1] = (byte) (i4 >>> 16);
        bArr[2] = (byte) (i4 >>> 8);
        bArr[3] = (byte) i4;
        System.arraycopy(bArr, 0, c16261.f50016, 0, 4);
        this.f24903.f50016[4] = (byte) i3;
        synchronized (f24901) {
            InterfaceC22198 interfaceC22198 = f24901;
            C16261 c162612 = this.f24903;
            interfaceC22198.mo3071(c162612.f50017, i3, c162612.f50016);
        }
        this.f24903.m38251(i3);
    }
}
