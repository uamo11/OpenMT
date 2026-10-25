package l;

/* compiled from: 75QI */
/* renamed from: l.ۧۗۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10723 extends C21865 {
    @Override // l.C21865
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26909(AbstractC1591 abstractC1591) {
        C17072 c17072;
        if (abstractC1591.f5638 == EnumC7690.FILL_ARRAY_DATA && C14249.m33895(abstractC1591.mo5445())) {
            c17072 = C14249.f42937;
            throw c17072;
        }
        super.mo26909(abstractC1591);
    }

    @Override // l.C21865
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26910(AbstractC8396 abstractC8396) {
        C17072 c17072;
        C17072 c170722;
        C17072 c170723;
        C17072 c170724;
        C17072 c170725;
        C17072 c170726;
        C17072 c170727;
        switch (C17778.f54388[abstractC8396.f25745.ordinal()]) {
            case 1:
            case 2:
            case 3:
                if (C14249.m33895(abstractC8396.mo15838()[0])) {
                    c17072 = C14249.f42937;
                    throw c17072;
                }
                return;
            case 4:
                if (C14249.m33895(abstractC8396.mo2581())) {
                    c170722 = C14249.f42937;
                    throw c170722;
                }
                return;
            case 5:
                if (C14249.m33895(abstractC8396.mo21997())) {
                    c170723 = C14249.f42937;
                    throw c170723;
                }
                return;
            case 6:
                if (abstractC8396.mo2583().f25745 == EnumC1340.CONSTANT && ((Number) ((C11987) abstractC8396.mo2583()).f35889).intValue() == 0) {
                    c170724 = C14249.f42935;
                    throw c170724;
                }
                return;
            case 7:
                if (abstractC8396.mo2583().f25745 == EnumC1340.CONSTANT && ((Number) ((C11987) abstractC8396.mo2583()).f35889).longValue() == 0) {
                    c170725 = C14249.f42935;
                    throw c170725;
                }
                return;
            case 8:
                if (abstractC8396.mo21997().f25745 != EnumC1340.CONSTANT || ((Number) ((C11987) abstractC8396.mo21997()).f35889).intValue() >= 0) {
                    return;
                }
                c170726 = C14249.f42936;
                throw c170726;
            case 9:
                for (AbstractC8396 abstractC83962 : abstractC8396.mo15838()) {
                    if (abstractC83962.f25745 == EnumC1340.CONSTANT && ((Number) ((C11987) abstractC83962).f35889).intValue() < 0) {
                        c170727 = C14249.f42936;
                        throw c170727;
                    }
                }
                return;
            default:
                return;
        }
    }
}
