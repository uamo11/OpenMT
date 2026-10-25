package l;

/* compiled from: 195F */
/* renamed from: l.ܽܿ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16794 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f51555;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f51556;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f51557;

    public C16794(int i) {
        this.f51555 = new int[i];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m39529() {
        return this.f51557;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39526(int i) {
        int i2 = this.f51557;
        int[] iArr = this.f51555;
        if (i2 == iArr.length) {
            throw new IllegalStateException("Code point window is full");
        }
        int i3 = this.f51556 + i2;
        if (i3 >= iArr.length) {
            i3 -= iArr.length;
        }
        iArr[i3] = i;
        this.f51557 = i2 + 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39528(InterfaceC1978 interfaceC1978) {
        if (this.f51557 == 0) {
            throw new IllegalStateException("Code point window is empty");
        }
        int i = this.f51556;
        int[] iArr = this.f51555;
        interfaceC1978.mo6488(iArr[i]);
        int i2 = this.f51556 + 1;
        if (i2 == iArr.length) {
            i2 = 0;
        }
        this.f51556 = i2;
        this.f51557--;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39527(int i, InterfaceC1978 interfaceC1978) {
        if (i < 0 || i > this.f51557) {
            throw new IllegalArgumentException("Code point count is out of range");
        }
        for (int i2 = 0; i2 < i; i2++) {
            m39528(interfaceC1978);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39530(InterfaceC1978 interfaceC1978) {
        m39527(this.f51557, interfaceC1978);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39525() {
        int i;
        int[] iArr;
        int i2 = this.f51557;
        do {
            i2--;
            if (i2 < 0) {
                return -1;
            }
            i = this.f51556 + i2;
            iArr = this.f51555;
            if (i >= iArr.length) {
                i -= iArr.length;
            }
        } while (iArr[i] != 10);
        return i2;
    }
}
