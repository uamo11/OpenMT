package l;

/* compiled from: OAR3 */
/* renamed from: l.᩻۟ۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23550 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f75606 = new byte[65536];

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f75607;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f75608;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52009(byte b) {
        int i = this.f75607;
        this.f75606[i] = b;
        int i2 = (i + 1) & 65535;
        if (!this.f75608 && i2 < i) {
            this.f75608 = true;
        }
        this.f75607 = i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52010(int i, int i2, byte[] bArr) {
        byte[] bArr2 = this.f75606;
        if (i > bArr2.length) {
            throw new IllegalStateException(C19370.m44628(i, "Illegal distance parameter: "));
        }
        int i3 = this.f75607;
        int i4 = (i3 - i) & 65535;
        if (!this.f75608 && i4 >= i3) {
            throw new IllegalStateException(C19370.m44628(i, "Attempt to read beyond memory: dist="));
        }
        int i5 = 0;
        while (i5 < i2) {
            byte b = bArr2[i4];
            m52009(b);
            bArr[i5] = b;
            i5++;
            int i6 = (i4 + 1) & 65535;
            if (!this.f75608 && i6 < i4) {
                this.f75608 = true;
            }
            i4 = i6;
        }
    }
}
