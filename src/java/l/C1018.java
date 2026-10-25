package l;

/* compiled from: 1B9F */
/* renamed from: l.֨ۡܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1018 extends AbstractC15834 {
    public C1018(C3135 c3135, C10191 c10191, C21480 c21480, C20069 c20069) {
        super(c3135, c10191, c21480, c20069);
        int m9558 = c3135.m9558();
        if (m9558 == 5 || m9558 == 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c3135.m9558());
        }
        if (c21480 != null && c3135.m9558() != 1) {
            throw new IllegalArgumentException("can't mix branchingness with result");
        }
    }

    public C1018(C3135 c3135, C10191 c10191, C21480 c21480, C21480 c214802) {
        this(c3135, c10191, c21480, C20069.m46252(c214802));
    }

    @Override // l.AbstractC15834
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10711 mo3533() {
        return C13922.f41594;
    }

    @Override // l.AbstractC15834
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3531(InterfaceC8780 interfaceC8780) {
        interfaceC8780.mo8212(this);
    }

    @Override // l.AbstractC15834
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15834 mo3529(C7573 c7573) {
        throw new UnsupportedOperationException("unsupported");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC15834
    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AbstractC15834 mo3532() {
        C20069 m37479 = m37479();
        int size = m37479.size();
        if (size != 0) {
            InterfaceC1538 m48637 = m37479.m41004get(size - 1).m48637();
            if (!m48637.mo5253()) {
                InterfaceC1538 m486372 = m37479.m41004get(0).m48637();
                if (size == 2 && m486372.mo5253()) {
                    AbstractC13717 abstractC13717 = (AbstractC13717) m486372;
                    C20069 m46257 = m37479.m46257();
                    return new C5252(C12307.m29854(m37484().m9562(), m37483(), m46257, abstractC13717), m37480(), m37483(), m46257, abstractC13717);
                }
            } else {
                AbstractC13717 abstractC137172 = (AbstractC13717) m48637;
                C20069 m46258 = m37479.m46258();
                try {
                    int m9562 = m37484().m9562();
                    if (m9562 == 15 && (abstractC137172 instanceof C2635)) {
                        abstractC137172 = C2635.m8291(-((C2635) abstractC137172).mo2231());
                        m9562 = 14;
                    }
                    AbstractC13717 abstractC137173 = abstractC137172;
                    return new C5252(C12307.m29854(m9562, m37483(), m46258, abstractC137173), m37480(), m37483(), m46258, abstractC137173);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return this;
    }

    @Override // l.AbstractC15834
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15834 mo3530(C21480 c21480, C20069 c20069) {
        return new C1018(m37484(), m37480(), c21480, c20069);
    }
}
