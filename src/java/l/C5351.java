package l;

/* compiled from: Z6RB */
/* renamed from: l.ۚ۫ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5351 implements InterfaceC0463 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f16676;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f16677;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f16678;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f16679;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C1117 f16680;

    public C5351(C1117 c1117, int i, int i2, int i3, int i4) {
        this.f16680 = c1117;
        this.f16678 = i;
        this.f16677 = i2;
        this.f16679 = i3;
        this.f16676 = i4;
    }

    @Override // l.InterfaceC0463
    public final String getText() {
        C18757 c18757;
        C18757 c187572;
        C1117 c1117 = this.f16680;
        c18757 = c1117.f4072;
        int size = c18757.size();
        int i = this.f16678;
        if (i >= size) {
            return "<EOF>";
        }
        c187572 = c1117.f4072;
        return c187572.mo12025(C14763.m35067(i, this.f16677));
    }

    @Override // l.InterfaceC0463
    public final int getType() {
        return this.f16676 >> 1;
    }

    @Override // l.InterfaceC0463
    public final int getLine() {
        return C1117.m3829(this.f16680, this.f16678) + 1;
    }

    @Override // l.InterfaceC0463
    /* renamed from: ֫ */
    public final int mo2049() {
        int[] iArr;
        C1117 c1117 = this.f16680;
        int i = this.f16678;
        int m3829 = C1117.m3829(c1117, i);
        iArr = c1117.f4074;
        return i - iArr[m3829];
    }

    @Override // l.InterfaceC0463
    /* renamed from: ۧ */
    public final int mo2050() {
        return this.f16676 & 1;
    }

    @Override // l.InterfaceC0463
    /* renamed from: ܽ */
    public final int mo2052() {
        return this.f16679;
    }

    @Override // l.InterfaceC0463
    /* renamed from: ᩳ */
    public final int mo2054() {
        return this.f16678;
    }

    @Override // l.InterfaceC0463
    /* renamed from: ܿ */
    public final int mo2053() {
        return this.f16677;
    }

    @Override // l.InterfaceC0463
    /* renamed from: ܳ */
    public final InterfaceC1169 mo2051() {
        InterfaceC1169 interfaceC1169;
        interfaceC1169 = this.f16680.f4073;
        return interfaceC1169;
    }

    @Override // l.InterfaceC0463
    public final InterfaceC23125 getInputStream() {
        C18757 c18757;
        c18757 = this.f16680.f4072;
        return c18757;
    }
}
