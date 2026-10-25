package l;

/* compiled from: ABG3 */
/* renamed from: l.ܶۖܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14943 implements InterfaceC17101 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21295 f45543;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23596 f45544;

    @Override // l.InterfaceC17101
    /* renamed from: ֫ */
    public final void mo7531(C12122 c12122) {
    }

    @Override // l.InterfaceC17101
    /* renamed from: ֫ */
    public final void mo7532(C13532 c13532) {
    }

    public C14943(C21295 c21295, C23596 c23596) {
        this.f45543 = c21295;
        this.f45544 = c23596;
    }

    @Override // l.InterfaceC17101
    /* renamed from: ۧ */
    public final void mo7534(C12122 c12122) {
        C3135 m37484 = c12122.mo29542().m37484();
        C20069 mo29535 = c12122.mo29535();
        C21295 c21295 = this.f45543;
        if (!C21295.m48332(c21295, c12122) && mo29535.size() == 2) {
            if (m37484.m9558() != 4) {
                C21480 m41004get = mo29535.m41004get(0);
                C21480 m41004get2 = mo29535.m41004get(1);
                C23596 c23596 = this.f45544;
                if (c23596.m52070(m37484, m41004get, m41004get2)) {
                    c12122.m29541();
                    return;
                } else {
                    if (m37484.m9557() && c23596.m52070(m37484, mo29535.m41004get(1), mo29535.m41004get(0))) {
                        c12122.m29534(C20069.m46250(mo29535.m41004get(1), mo29535.m41004get(0)));
                        c12122.m29541();
                        return;
                    }
                    return;
                }
            }
            InterfaceC1538 m48637 = mo29535.m41004get(0).m48637();
            if (!(m48637 instanceof AbstractC1223) || ((AbstractC1223) m48637).mo2227() != 0) {
                InterfaceC1538 m486372 = mo29535.m41004get(1).m48637();
                if ((m486372 instanceof AbstractC1223) && ((AbstractC1223) m486372).mo2227() == 0) {
                    c21295.m48329(c12122, mo29535.m46258(), m37484.m9562(), (AbstractC13717) null);
                    return;
                }
                return;
            }
            C20069 m46257 = mo29535.m46257();
            int m9562 = m37484.m9562();
            switch (m9562) {
                case 7:
                case 8:
                    break;
                case 9:
                    m9562 = 12;
                    break;
                case 10:
                    m9562 = 11;
                    break;
                case 11:
                    m9562 = 10;
                    break;
                case 12:
                    m9562 = 9;
                    break;
                default:
                    throw new RuntimeException(C19370.m44628(m9562, "Unrecognized IF regop: "));
            }
            c21295.m48329(c12122, m46257, m9562, (AbstractC13717) null);
        }
    }
}
