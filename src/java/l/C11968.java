package l;

/* compiled from: 4BJX */
/* renamed from: l.ۨ᩸ۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C11968 extends AbstractC5618 {
    @Override // l.AbstractC5618
    /* renamed from: ֫ */
    public final String mo15922() {
        return "nth-last-of-type";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC5618
    /* renamed from: ֫ */
    public final int mo15921(C19814 c19814) {
        int i = 0;
        if (c19814.mo28099() == null) {
            return 0;
        }
        C2090 m45579 = c19814.mo28099().m45579();
        for (int m45569 = c19814.m45569(); m45569 < m45579.size(); m45569++) {
            if (((C19814) m45579.get(m45569)).m45571().equals(c19814.m45571())) {
                i++;
            }
        }
        return i;
    }
}
