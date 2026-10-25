package l;

import java.util.ArrayList;

/* compiled from: UBEJ */
/* renamed from: l.ۖܳܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C2593 implements InterfaceC8780 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16540 f8202;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15375 f8203;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14586 f8204;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4004 f8205;

    public C2593(C4004 c4004, C14586 c14586) {
        this.f8205 = c4004;
        this.f8204 = c14586;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8218(C16540 c16540, C15375 c15375) {
        this.f8202 = c16540;
        this.f8203 = c15375;
    }

    @Override // l.InterfaceC8780
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo8212(C1018 c1018) {
        AbstractC4793 c18821;
        C19611 c19611;
        C3135 m37484 = c1018.m37484();
        if (m37484.m9562() == 54 || m37484.m9562() == 56) {
            return;
        }
        C10191 m37480 = c1018.m37480();
        C13259 m24584 = C9649.m24584(c1018);
        int m9558 = m37484.m9558();
        if (m9558 != 1 && m9558 != 2) {
            if (m9558 == 3) {
                return;
            }
            if (m9558 == 4) {
                int i = this.f8202.m38911().get(1);
                C20069 m12059 = C4004.m12059(c1018);
                c19611 = this.f8205.f12698;
                c18821 = new C5415(m24584, m37480, m12059, c19611.m45051(i));
                m8214(c18821);
            }
            if (m9558 != 6) {
                throw new RuntimeException("shouldn't happen");
            }
        }
        c18821 = new C18821(m24584, m37480, C4004.m12059(c1018));
        m8214(c18821);
    }

    @Override // l.InterfaceC8780
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo8215(C5252 c5252) {
        boolean z;
        int i;
        int i2;
        C10191 m37480 = c5252.m37480();
        C13259 m24584 = C9649.m24584(c5252);
        C3135 m37484 = c5252.m37484();
        int m9562 = m37484.m9562();
        if (m37484.m9558() != 1) {
            throw new RuntimeException("shouldn't happen");
        }
        if (m9562 == 3) {
            C4004 c4004 = this.f8205;
            z = c4004.f12706;
            if (z) {
                return;
            }
            C21480 m37483 = c5252.m37483();
            int mo2231 = ((C2635) c5252.m34454()).mo2231();
            i = c4004.f12699;
            i2 = c4004.f12701;
            m8214(new C18821(m24584, m37480, C20069.m46250(m37483, C21480.m48631((i - i2) + mo2231, m37483.getType()))));
            return;
        }
        m8214(new C21727(m24584, m37480, C4004.m12059(c5252), c5252.m34454()));
    }

    @Override // l.InterfaceC8780
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo8216(C5957 c5957) {
        C19611 c19611;
        C10191 m37480 = c5957.m37480();
        C21064 m16682 = c5957.m16682();
        C21064 m38911 = this.f8202.m38911();
        int size = m16682.size();
        int size2 = m38911.size();
        int m38913 = this.f8202.m38913();
        if (size != size2 - 1 || m38913 != m38911.get(size)) {
            throw new RuntimeException("shouldn't happen");
        }
        C15375[] c15375Arr = new C15375[size];
        for (int i = 0; i < size; i++) {
            int i2 = m38911.get(i);
            c19611 = this.f8205.f12698;
            c15375Arr[i] = c19611.m45051(i2);
        }
        C15375 c15375 = new C15375(m37480, false);
        C15375 c153752 = new C15375(this.f8203.m13983(), true);
        C0475 c0475 = new C0475(m37480, c153752, m16682, c15375Arr);
        AbstractC4793 c5415 = new C5415(c0475.m2083() ? C12554.f37829 : C12554.f37716, m37480, C4004.m12059(c5957), c15375);
        m8214(c153752);
        m8214(c5415);
        m8221(new C17409(m37480));
        m8221(c15375);
        m8221(c0475);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C21480 m8211() {
        C13012 c13012;
        int m38913 = this.f8202.m38913();
        if (m38913 < 0) {
            return null;
        }
        c13012 = this.f8205.f12702;
        AbstractC15834 m41001get = c13012.m31591().m40535(m38913).m38916().m41001get(0);
        if (m41001get.m37484().m9562() != 56) {
            return null;
        }
        return m41001get.m37483();
    }

    @Override // l.InterfaceC8780
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8213(C3841 c3841) {
        C10191 m37480 = c3841.m37480();
        C13259 m24584 = C9649.m24584(c3841);
        C3135 m37484 = c3841.m37484();
        if (m37484.m9558() != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + m37484.m9558());
        }
        if (!m37484.m9563()) {
            throw new RuntimeException("Expected call-like operation");
        }
        m8214(this.f8203);
        m8214(new C18115(m24584, m37480, c3841.m37479(), new AbstractC13717[]{c3841.m11592(), c3841.m11591()}));
    }

    @Override // l.InterfaceC8780
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo8217(C11602 c11602) {
        C20069 m12063;
        AbstractC4793 c21727;
        AbstractC4793 abstractC4793;
        int m32171;
        C10191 m37480 = c11602.m37480();
        C13259 m24584 = C9649.m24584(c11602);
        C3135 m37484 = c11602.m37484();
        AbstractC13717 m34454 = c11602.m34454();
        if (m37484.m9558() != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + m37484.m9558());
        }
        m8214(this.f8203);
        if (m37484.m9563()) {
            m8214(new C21727(m24584, m37480, c11602.m37479(), m34454));
            return;
        }
        C21480 m8211 = m8211();
        m12063 = C4004.m12063(c11602, m8211);
        if ((m24584.m32173() || m37484.m9562() == 43) != (m8211 != null)) {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch " + c11602);
        }
        if (m37484.m9562() == 41 && m24584.m32171() != 35) {
            c21727 = new C18821(m24584, m37480, m12063);
        } else {
            c21727 = new C21727(m24584, m37480, m12063, m34454);
        }
        C14586 c14586 = this.f8204;
        int m34840 = c14586.m34840() - 1;
        while (true) {
            if (m34840 < 0) {
                abstractC4793 = null;
                break;
            }
            abstractC4793 = c14586.m34836(m34840);
            if (abstractC4793.m13994().m32171() != -1) {
                break;
            } else {
                m34840--;
            }
        }
        if (m24584.m32171() == 32 && abstractC4793 != null && (((m32171 = abstractC4793.m13994().m32171()) == 7 || m32171 == 8 || m32171 == 9) && c21727.m13993().size() > 0 && abstractC4793.m13993().size() > 1 && c21727.m13993().m41004get(0).m48652() == abstractC4793.m13993().m41004get(1).m48652())) {
            m8214(new C18821(C12554.f37725, m37480, C20069.f65002));
        }
        m8214(c21727);
    }

    @Override // l.InterfaceC8780
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo8220(C22890 c22890) {
        C20069 m12063;
        C10191 m37480 = c22890.m37480();
        C13259 m24584 = C9649.m24584(c22890);
        if (c22890.m37484().m9558() != 6) {
            throw new RuntimeException("shouldn't happen");
        }
        C21480 m8211 = m8211();
        if (m24584.m32173() != (m8211 != null)) {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch" + c22890);
        }
        m8214(this.f8203);
        m12063 = C4004.m12063(c22890, m8211);
        m8214(new C18821(m24584, m37480, m12063));
    }

    @Override // l.InterfaceC8780
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8219(C20775 c20775) {
        C10191 m37480 = c20775.m37480();
        AbstractC13717 m47474 = c20775.m47474();
        ArrayList m47475 = c20775.m47475();
        if (c20775.m37484().m9558() == 1) {
            C15375 c15375 = new C15375(m37480, false);
            AbstractC4793 c18905 = new C18905(m37480, this.f8203, m47475, m47474);
            AbstractC4793 c5415 = new C5415(C12554.f37797, m37480, C4004.m12059(c20775), c15375);
            m8214(this.f8203);
            m8214(c5415);
            m8221(new C17409(m37480));
            m8221(c15375);
            m8221(c18905);
            return;
        }
        throw new RuntimeException("shouldn't happen");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8214(AbstractC4793 abstractC4793) {
        this.f8204.m34838(abstractC4793);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8221(AbstractC4793 abstractC4793) {
        this.f8204.m34841(abstractC4793);
    }
}
