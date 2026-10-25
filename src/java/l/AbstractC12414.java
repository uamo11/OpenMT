package l;

/* compiled from: 3ANU */
/* renamed from: l.۫۫᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC12414 extends AbstractC6064 {
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo30583();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public abstract boolean mo30585();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object mo30584() {
        AbstractC20821 m16923 = m16923();
        return m16923 == null ? C10298.f31024 : m16923.mo42037();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo30581(AbstractC23642 abstractC23642) {
        int m47308;
        C20697 m47315;
        if (mo30583()) {
            C17168 m16922 = m16922();
            do {
                m47315 = m16922.m47315();
                if (m47315 instanceof AbstractC20821) {
                    return false;
                }
            } while (!m47315.m47310(abstractC23642, m16922));
        } else {
            C17168 m169222 = m16922();
            C13119 c13119 = new C13119(abstractC23642, this);
            do {
                C20697 m473152 = m169222.m47315();
                if (m473152 instanceof AbstractC20821) {
                    return false;
                }
                m47308 = m473152.m47308(abstractC23642, m169222, c13119);
                if (m47308 != 1) {
                }
            } while (m47308 != 2);
            return false;
        }
        return true;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7475 m30582() {
        return new C20176(this);
    }
}
