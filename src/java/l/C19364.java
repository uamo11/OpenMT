package l;

/* compiled from: EBEC */
/* renamed from: l.᩵ۡܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19364 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17246 f62687;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13012 f62688;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0312 f62689;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f62690;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0312 m44622(C13012 c13012) {
        C19364 c19364 = new C19364(c13012);
        int m31593 = c19364.f62688.m31593();
        while (true) {
            C0312 c0312 = c19364.f62689;
            if (m31593 >= 0) {
                int[] iArr = c19364.f62690;
                C13573.m32620(m31593, iArr);
                C4546 m1722 = c0312.m1722(m31593);
                C16540 m40535 = c19364.f62687.m40535(m31593);
                C2430 m38916 = m40535.m38916();
                int size = m38916.size();
                boolean z = m40535.m38917() && m38916.m7865().m37483() != null;
                int i = size - 1;
                C4546 c4546 = m1722;
                for (int i2 = 0; i2 < size; i2++) {
                    if (z && i2 == i) {
                        c4546.mo20349();
                        c4546 = c4546.m13351();
                    }
                    AbstractC15834 m41001get = m38916.m41001get(i2);
                    C21480 m37482 = m41001get.m37482();
                    if (m37482 == null) {
                        C21480 m37483 = m41001get.m37483();
                        if (m37483 != null && c4546.get(m37483.m48652()) != null) {
                            c4546.m13359(c4546.get(m37483.m48652()));
                        }
                    } else {
                        C21480 m48648 = m37482.m48648();
                        c4546.getClass();
                        if (!m48648.equals(c4546.get(m48648.m48652()))) {
                            C21480 m13353 = c4546.m13353(m48648.m48653());
                            if (m13353 != null && m13353.m48652() != m48648.m48652()) {
                                c4546.m13359(m13353);
                            }
                            c0312.m1725(m41001get, m48648);
                            c4546.m13358(m48648);
                        }
                    }
                }
                c4546.mo20349();
                C21064 m38911 = m40535.m38911();
                int size2 = m38911.size();
                int m38913 = m40535.m38913();
                for (int i3 = 0; i3 < size2; i3++) {
                    int i4 = m38911.get(i3);
                    if (c0312.m1726(i4, i4 == m38913 ? c4546 : m1722)) {
                        C13573.m32627(i4, iArr);
                    }
                }
                m31593 = C13573.m32623(0, iArr);
            } else {
                c0312.mo20349();
                return c0312;
            }
        }
    }

    public C19364(C13012 c13012) {
        C17246 m31591 = c13012.m31591();
        int m38023 = m31591.m38023();
        this.f62688 = c13012;
        this.f62687 = m31591;
        this.f62689 = new C0312(c13012);
        this.f62690 = C13573.m32622(m38023);
    }
}
