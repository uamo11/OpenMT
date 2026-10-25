package l;

import java.util.Iterator;

/* compiled from: A451 */
/* renamed from: l.᩻ܽ۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23817 extends AbstractC15185 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6884 f77068;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f77069;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23817(C6884 c6884, C6755 c6755, C1386 c1386, AbstractC4308 abstractC4308) {
        super(c6884.f21273, true, c6755, c1386);
        this.f77068 = c6884;
        this.f77069 = abstractC4308;
    }

    @Override // l.AbstractC15185, l.InterfaceC3953
    /* renamed from: ֫ */
    public final boolean mo3859(AbstractC4308 abstractC4308, AbstractC4308 abstractC43082, C1386 c1386) {
        AbstractC4308 abstractC43083;
        AbstractC5144 mo3824;
        C22406 c22406 = this.f77068.f21273;
        if (c22406.f72590 && m52508(abstractC4308, abstractC43082) && (abstractC43083 = this.f77069) != null && abstractC43083.mo3258() == EnumC9454.DEFERRED && (mo3824 = ((C1110) abstractC43083).mo3824(this.f46399)) != c22406.f72606.f37354) {
            return m52505(abstractC4308, abstractC43082, mo3824);
        }
        return m52504(abstractC4308, abstractC43082);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m52504(AbstractC4308 abstractC4308, AbstractC4308 abstractC43082) {
        C22406 c22406 = this.f77068.f21273;
        if (!this.f46401 && abstractC4308.mo12941() != abstractC43082.mo12941()) {
            abstractC4308 = abstractC4308.mo12941() ? c22406.f72597.m17496(abstractC4308).f17560 : c22406.f72597.m17563(abstractC4308);
        }
        return c22406.f72597.m17546(abstractC4308, this.f46399.f20968.m1868(abstractC43082), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m52508(AbstractC4308 abstractC4308, AbstractC4308 abstractC43082) {
        C22406 c22406 = this.f77068.f21273;
        C6319 c6319 = c22406.f72597;
        AbstractC19810 abstractC19810 = abstractC4308.f13890;
        c6319.getClass();
        try {
            c6319.m17493(abstractC19810);
            C6319 c63192 = c22406.f72597;
            AbstractC19810 abstractC198102 = abstractC43082.f13890;
            c63192.getClass();
            c63192.m17493(abstractC198102);
            return m52510(abstractC4308, abstractC43082);
        } catch (C6130 unused) {
            return false;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m52510(AbstractC4308 abstractC4308, AbstractC4308 abstractC43082) {
        boolean mo5146 = abstractC4308.mo5146();
        C6884 c6884 = this.f77068;
        if (mo5146) {
            Iterator it = c6884.f21273.f72597.m17510(abstractC4308).iterator();
            while (it.hasNext()) {
                if (!m52510((AbstractC4308) it.next(), abstractC43082)) {
                    return false;
                }
            }
            return true;
        }
        if (!abstractC43082.mo5146()) {
            return c6884.f21273.f72597.m17527(abstractC43082.f13890, abstractC4308) == null && c6884.f21273.f72597.m17527(abstractC4308.f13890, abstractC43082) == null;
        }
        Iterator it2 = c6884.f21273.f72597.m17510(abstractC43082).iterator();
        while (it2.hasNext()) {
            if (!m52510(abstractC4308, (AbstractC4308) it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m52505(AbstractC4308 abstractC4308, AbstractC4308 abstractC43082, AbstractC5144 abstractC5144) {
        C0384 c0384 = this.f46399.f20968;
        C22406 c22406 = this.f77068.f21273;
        C6319 c6319 = c22406.f72597;
        AbstractC4308 m17538 = c6319.m17538(c6319.m17523(abstractC4308));
        AbstractC4308 m175382 = c22406.f72597.m17538(abstractC4308);
        AbstractC4308 m175383 = c22406.f72597.m17538(abstractC43082);
        C2609 mo12938 = m17538.mo12938();
        C2609 mo129382 = m175382.mo12938();
        C2609 mo129383 = m175383.mo12938();
        if (m17538.m12913(EnumC9454.FORALL) && !c22406.f72597.m17507((C10077) m17538, (C10077) m175382)) {
            return false;
        }
        C2609 c2609 = mo12938;
        C2609 c26092 = mo129383;
        while (c2609.m8249() && c26092.m8249()) {
            AbstractC4308 mo12939 = ((AbstractC4308) c2609.f8240).mo12939();
            AbstractC4308 m17488 = c22406.f72597.m17488(((AbstractC4308) c26092.f8240).mo12939(), mo129383, mo12938);
            if ((mo12939.m12928(mo12938) && m17488.m12928(c0384.f1817)) || !c22406.f72597.m17550(mo12939, c0384.m1868(m17488))) {
                return false;
            }
            c2609 = c2609.f8241;
            c26092 = c26092.f8241;
        }
        if (!c2609.isEmpty() || !c26092.isEmpty()) {
            return false;
        }
        C2609 mo12933 = m17538.mo12933();
        C2609 mo129332 = m175382.mo12933();
        C2609 mo129333 = m175383.mo12933();
        while (mo12933.m8249() && mo129332.m8249() && mo129333.m8249()) {
            AbstractC4308 abstractC43083 = (AbstractC4308) mo12933.f8240;
            AbstractC4308 m174882 = c22406.f72597.m17488((AbstractC4308) mo129332.f8240, mo129382, mo12938);
            AbstractC4308 m174883 = c22406.f72597.m17488((AbstractC4308) mo129333.f8240, mo129383, mo12938);
            if (abstractC43083.m12928(mo12938) && m174883.m12928(c0384.f1817)) {
                return false;
            }
            C2609 c26093 = mo129382;
            if (!c22406.f72597.m17546(c0384.m1868(m174883), abstractC43083, true) || !c22406.f72597.m17550(m174882, c0384.m1868(m174883))) {
                return false;
            }
            mo12933 = mo12933.f8241;
            mo129332 = mo129332.f8241;
            mo129333 = mo129333.f8241;
            mo129382 = c26093;
        }
        if (!mo12933.isEmpty() || !mo129332.isEmpty() || !mo129333.isEmpty()) {
            return false;
        }
        AbstractC4308 mo12923 = m17538.mo12923();
        AbstractC4308 m174884 = c22406.f72597.m17488(m175383.mo12923(), mo129383, mo12938);
        if (mo12923.m12928(mo12938) && m174884.m12928(c0384.f1817)) {
            return false;
        }
        C14644 c14644 = new C14644(this, mo12923, m174884);
        c14644.mo10758(abstractC5144);
        return c14644.f44761;
    }
}
