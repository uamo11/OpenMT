package l;

/* compiled from: K4WX */
/* renamed from: l.᩵᩺֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19767 extends AbstractC9617 implements InterfaceC0367, InterfaceC0804 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f63826;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC19475 f63827;

    @Override // l.InterfaceC22677
    /* renamed from: ֨ */
    public final String mo1789() {
        throw null;
    }

    public C19767(C12918 c12918, EnumC0841 enumC0841, int i) {
        super(c12918, enumC0841, i);
        this.f63827 = null;
        this.f63826 = -1;
    }

    @Override // l.InterfaceC0367
    /* renamed from: ᩵ */
    public final int mo1819() {
        return this.f29163.m31418().m11942(this.f29164 + 1) & 63;
    }

    @Override // l.InterfaceC10952
    public final InterfaceC8293 getReference() {
        AbstractC19475 abstractC19475 = this.f63827;
        if (abstractC19475 != null) {
            return abstractC19475;
        }
        C12918 c12918 = this.f29163;
        int m11936 = c12918.m31418().m11936(this.f29164 + 2);
        try {
            return AbstractC2143.m7069(c12918, mo3609(), m11936);
        } catch (C14952 e) {
            return new C19061(e, m11936);
        }
    }

    @Override // l.InterfaceC10952
    /* renamed from: ֡ */
    public final int mo3609() {
        int i = this.f63826;
        if (i != -1) {
            return i;
        }
        int m11942 = (this.f29163.m31418().m11942(this.f29164 + 1) >>> 6) + 1;
        if (m11942 < 0 || m11942 > 4) {
            throw new C14952(m11942);
        }
        this.f63826 = m11942;
        return m11942;
    }

    @Override // l.InterfaceC0804
    /* renamed from: ֫ */
    public final void mo3030(C19357 c19357) {
        this.f63827 = (AbstractC19475) c19357.m44609(getReference());
    }
}
