package l;

/* compiled from: PARF */
/* renamed from: l.ۚ᩻֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5675 implements InterfaceC19081 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f17529;

    @Override // l.InterfaceC19081
    /* renamed from: ֫ */
    public final boolean mo4951() {
        return false;
    }

    public C5675(int i) {
        this.f17529 = i;
    }

    public final int hashCode() {
        return C2093.m6873(C2093.m6876(C2093.m6876(0, EnumC0735.CHANNEL.ordinal()), this.f17529), 2);
    }

    @Override // l.InterfaceC19081
    /* renamed from: ֫ */
    public final void mo4950(AbstractC23747 abstractC23747) {
        abstractC23747.f76887 = this.f17529;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5675) {
            return this.f17529 == ((C5675) obj).f17529;
        }
        return false;
    }

    public final String toString() {
        return String.format("channel(%d)", Integer.valueOf(this.f17529));
    }
}
