package l;

/* compiled from: D4F3 */
/* renamed from: l.ᩴᩳ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18914 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f59596;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f59597;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C18914 f59598;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18914 f59599;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f59600;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f59601;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f59602;

    public C18914() {
        this.f59596 = new byte[8192];
        this.f59601 = true;
        this.f59602 = false;
    }

    public C18914(byte[] bArr, int i, int i2) {
        this.f59596 = bArr;
        this.f59600 = i;
        this.f59597 = i2;
        this.f59602 = true;
        this.f59601 = false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18914 m43659() {
        this.f59602 = true;
        return new C18914(this.f59596, this.f59600, this.f59597);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18914 m43656() {
        C18914 c18914 = this.f59599;
        C18914 c189142 = c18914 != this ? c18914 : null;
        C18914 c189143 = this.f59598;
        c189143.f59599 = c18914;
        this.f59599.f59598 = c189143;
        this.f59599 = null;
        this.f59598 = null;
        return c189142;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43657(C18914 c18914) {
        c18914.f59598 = this;
        c18914.f59599 = this.f59599;
        this.f59599.f59598 = c18914;
        this.f59599 = c18914;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43658(C18914 c18914, int i) {
        boolean z = c18914.f59601;
        byte[] bArr = c18914.f59596;
        if (!z) {
            throw new IllegalArgumentException();
        }
        int i2 = c18914.f59597;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (c18914.f59602) {
                throw new IllegalArgumentException();
            }
            int i4 = c18914.f59600;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
            c18914.f59597 -= c18914.f59600;
            c18914.f59600 = 0;
        }
        System.arraycopy(this.f59596, this.f59600, bArr, c18914.f59597, i);
        c18914.f59597 += i;
        this.f59600 += i;
    }
}
