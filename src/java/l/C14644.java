package l;

import java.util.Iterator;

/* compiled from: A451 */
/* renamed from: l.ܳܽ۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C14644 extends C20161 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f44761 = true;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f44762;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23817 f44763;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f44764;

    public C14644(C23817 c23817, AbstractC4308 abstractC4308, AbstractC4308 abstractC43082) {
        this.f44763 = c23817;
        this.f44764 = abstractC4308;
        this.f44762 = abstractC43082;
    }

    @Override // l.AbstractC15220
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo34934() {
        this.f44761 = false;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1387(C8379 c8379) {
        mo10758(m34932(c8379.f25699));
        mo10758(m34932(c8379.f25700));
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1391(C9232 c9232) {
        boolean m52504;
        EnumC9454 enumC9454 = EnumC9454.VOID;
        AbstractC4308 abstractC4308 = this.f44762;
        if (abstractC4308.m12913(enumC9454)) {
            this.f44761 = this.f44761;
            return;
        }
        AbstractC4308 abstractC43082 = this.f44764;
        boolean z = false;
        if (abstractC43082.m12913(enumC9454)) {
            this.f44761 = false;
            return;
        }
        if (abstractC43082.mo12941() != abstractC4308.mo12941()) {
            boolean z2 = c9232.f27941 == EnumC19816.STANDALONE && c9232.f27943.f17560.mo12923().mo12941();
            boolean z3 = this.f44761;
            if (z2 == abstractC43082.mo12941() && z2 != abstractC4308.mo12941()) {
                z = true;
            }
            this.f44761 = z3 & z;
            return;
        }
        boolean z4 = this.f44761;
        m52504 = this.f44763.m52504(abstractC43082, abstractC4308);
        this.f44761 = z4 & m52504;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1405(C14875 c14875) {
        mo10758(m34932(c14875.f45392));
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1217(C14169 c14169) {
        C2609 m43517;
        boolean m52504;
        boolean m52508;
        boolean m52505;
        EnumC9454 enumC9454 = EnumC9454.VOID;
        AbstractC4308 abstractC4308 = this.f44762;
        if (abstractC4308.m12913(enumC9454)) {
            this.f44761 = this.f44761;
            return;
        }
        AbstractC4308 abstractC43082 = this.f44764;
        if (abstractC43082.m12913(enumC9454)) {
            this.f44761 = false;
            return;
        }
        if (c14169.m33819() == EnumC13706.EXPRESSION) {
            m43517 = C2609.of((Object) m34932((AbstractC12612) c14169.f42776));
        } else {
            C18837 c18837 = new C18837();
            new C17467(this, c18837).mo10758(c14169.f42776);
            m43517 = c18837.m43517();
        }
        boolean isEmpty = m43517.isEmpty();
        C23817 c23817 = this.f44763;
        if (!isEmpty) {
            m52508 = c23817.m52508(abstractC43082, abstractC4308);
            if (m52508) {
                Iterator it = m43517.iterator();
                while (it.hasNext()) {
                    AbstractC12612 abstractC12612 = (AbstractC12612) it.next();
                    boolean z = this.f44761;
                    m52505 = c23817.m52505(abstractC43082, abstractC4308, abstractC12612);
                    this.f44761 = m52505 & z;
                }
                return;
            }
        }
        if (!m43517.isEmpty() && abstractC43082.mo12941() != abstractC4308.mo12941()) {
            Iterator it2 = m43517.iterator();
            while (it2.hasNext()) {
                AbstractC12612 abstractC126122 = (AbstractC12612) it2.next();
                boolean z2 = true;
                boolean z3 = abstractC126122.mo12874() && abstractC126122.f16086.mo12941();
                boolean z4 = this.f44761;
                if (z3 != abstractC43082.mo12941() || z3 == abstractC4308.mo12941()) {
                    z2 = false;
                }
                this.f44761 = z4 & z2;
            }
            return;
        }
        boolean z5 = this.f44761;
        m52504 = c23817.m52504(abstractC43082, abstractC4308);
        this.f44761 = z5 & m52504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC12612 m34932(AbstractC12612 abstractC12612) {
        if (abstractC12612.f16086.m12913(EnumC9454.DEFERRED)) {
            C1110 c1110 = (C1110) abstractC12612.f16086;
            C23817 c23817 = this.f44763;
            AbstractC5144 mo3824 = c1110.mo3824(c23817.f46399);
            if (mo3824 != c23817.f77068.f21273.f72606.f37354) {
                return (AbstractC12612) mo3824;
            }
        }
        return abstractC12612;
    }
}
