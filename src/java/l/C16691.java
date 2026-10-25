package l;

import java.util.ArrayList;

/* compiled from: MASO */
/* renamed from: l.ܽܳ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C16691 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f51224 = false;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f51225 = -1;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C23936 f51226;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f51227;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C8931 f51228;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39230(AbstractC9637 abstractC9637) {
        if (this.f51224) {
            return;
        }
        this.f51224 = true;
        InterfaceC0463 m24567 = abstractC9637.m24567();
        String m39227 = m39227(m24567);
        C23936 m24573 = abstractC9637.m24573();
        StringBuilder m9834 = C3200.m9834("extraneous input ", m39227, " expecting ");
        m9834.append(m24573.m52718(abstractC9637.mo1331()));
        abstractC9637.m24559(m24567, m9834.toString(), (C2581) null);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39231(AbstractC9637 abstractC9637, C2581 c2581) {
        String str;
        if (this.f51224) {
            return;
        }
        this.f51224 = true;
        if (!(c2581 instanceof C20926)) {
            if (c2581 instanceof C17397) {
                C2581 c25812 = (C17397) c2581;
                abstractC9637.m24559(c25812.m8186(), "mismatched input " + m39227(c25812.m8186()) + " expecting " + c25812.m8182().m52718(abstractC9637.mo1331()), c25812);
                return;
            }
            if (!(c2581 instanceof C18103)) {
                System.err.println("unknown recognition error type: ".concat(c2581.getClass().getName()));
                abstractC9637.m24559(c2581.m8186(), c2581.getMessage(), c2581);
                return;
            }
            C2581 c25813 = (C18103) c2581;
            StringBuilder m9834 = C3200.m9834("rule ", abstractC9637.mo4239()[abstractC9637.f29205.mo1085()], " ");
            m9834.append(c25813.getMessage());
            abstractC9637.m24559(c25813.m8186(), m9834.toString(), c25813);
            return;
        }
        C20926 c20926 = (C20926) c2581;
        C1875 c1875 = abstractC9637.f29208;
        if (c1875 == null) {
            str = "<unknown input>";
        } else if (c20926.m47754().getType() == -1) {
            str = "<EOF>";
        } else {
            InterfaceC0463 m47754 = c20926.m47754();
            InterfaceC0463 m8186 = c20926.m8186();
            c1875.getClass();
            if (m47754 != null && m8186 != null) {
                C14763 m35067 = C14763.m35067(m47754.mo2052(), m8186.mo2052());
                ArrayList arrayList = c1875.f6384;
                int i = m35067.f45081;
                int i2 = m35067.f45082;
                if (i >= 0 && i2 >= 0) {
                    c1875.m6212(i2);
                    if (i2 >= arrayList.size()) {
                        i2 = arrayList.size() - 1;
                    }
                    StringBuilder sb = new StringBuilder();
                    while (i <= i2) {
                        InterfaceC0463 interfaceC0463 = (InterfaceC0463) arrayList.get(i);
                        if (interfaceC0463.getType() == -1) {
                            break;
                        }
                        sb.append(interfaceC0463.getText());
                        i++;
                    }
                    str = sb.toString();
                }
            }
            str = "";
        }
        abstractC9637.m24559(c20926.m8186(), "no viable alternative at input " + m39226(str), c20926);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39229() {
        this.f51224 = false;
        this.f51226 = null;
        this.f51225 = -1;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C23936 m39228(AbstractC9637 abstractC9637) {
        C21631 c21631 = ((C23313) abstractC9637.f59356).f35089;
        C23936 c23936 = new C23936(new int[0]);
        for (C8931 c8931 = abstractC9637.f29205; c8931 != null; c8931 = c8931.f63075) {
            int i = c8931.f63074;
            if (i < 0) {
                break;
            }
            c23936.m52721(c21631.m48894(((C8706) ((AbstractC23041) c21631.f69449.get(i)).m51211(0)).f26506));
        }
        c23936.m52724();
        return c23936;
    }

    /* renamed from: ᩳ */
    public void mo26270(AbstractC9637 abstractC9637) {
        AbstractC23041 abstractC23041 = (AbstractC23041) ((C23313) abstractC9637.f59356).f35089.f69449.get(abstractC9637.m43462());
        if (this.f51224) {
            return;
        }
        int mo6203 = abstractC9637.f29208.mo6203(1);
        C23936 m48894 = abstractC9637.mo1330().m48894(abstractC23041);
        if (m48894.m52723(mo6203)) {
            this.f51228 = null;
            this.f51227 = -1;
            return;
        }
        if (m48894.m52723(-2)) {
            if (this.f51228 == null) {
                this.f51228 = abstractC9637.f29205;
                this.f51227 = abstractC9637.m43462();
                return;
            }
            return;
        }
        int mo13211 = abstractC23041.mo13211();
        if (mo13211 != 3 && mo13211 != 4 && mo13211 != 5) {
            switch (mo13211) {
                case 9:
                case 11:
                    m39230(abstractC9637);
                    C23936 m24573 = abstractC9637.m24573();
                    C23936 m39228 = m39228(abstractC9637);
                    C23936 c23936 = new C23936(new int[0]);
                    c23936.m52721(m24573);
                    c23936.m52721(m39228);
                    int mo62032 = abstractC9637.f29208.mo6203(1);
                    while (mo62032 != -1 && !c23936.m52723(mo62032)) {
                        abstractC9637.mo9958();
                        mo62032 = abstractC9637.f29208.mo6203(1);
                    }
                    return;
                case 10:
                    break;
                default:
                    return;
            }
        }
        if (m39232(abstractC9637) == null) {
            throw new C17397(abstractC9637);
        }
    }

    /* renamed from: ֫ */
    public void mo26269(AbstractC9637 abstractC9637, C2581 c2581) {
        C23936 c23936;
        if (this.f51225 == abstractC9637.f29208.index() && (c23936 = this.f51226) != null && c23936.m52723(abstractC9637.m43462())) {
            abstractC9637.mo9958();
        }
        this.f51225 = abstractC9637.f29208.index();
        if (this.f51226 == null) {
            this.f51226 = new C23936(new int[0]);
        }
        this.f51226.m52719(abstractC9637.m43462());
        C23936 m39228 = m39228(abstractC9637);
        int mo6203 = abstractC9637.f29208.mo6203(1);
        while (mo6203 != -1 && !m39228.m52723(mo6203)) {
            abstractC9637.mo9958();
            mo6203 = abstractC9637.f29208.mo6203(1);
        }
    }

    /* renamed from: ֫ */
    public InterfaceC0463 mo26268(AbstractC9637 abstractC9637) {
        String str;
        InterfaceC0463 m39232 = m39232(abstractC9637);
        if (m39232 != null) {
            abstractC9637.mo9958();
            return m39232;
        }
        if (((C23313) abstractC9637.f59356).f35089.m48895(((AbstractC23041) ((C23313) abstractC9637.f59356).f35089.f69449.get(abstractC9637.m43462())).m51211(0).f38806, abstractC9637.f29205).m52723(abstractC9637.f29208.mo6203(1))) {
            if (!this.f51224) {
                this.f51224 = true;
                InterfaceC0463 m24567 = abstractC9637.m24567();
                abstractC9637.m24559(m24567, "missing " + abstractC9637.m24573().m52718(abstractC9637.mo1331()) + " at " + m39227(m24567), (C2581) null);
            }
            InterfaceC0463 m245672 = abstractC9637.m24567();
            C23936 m24573 = abstractC9637.m24573();
            int m52717 = !m24573.m52722() ? m24573.m52717() : 0;
            if (m52717 == -1) {
                str = "<missing EOF>";
            } else {
                str = "<missing " + abstractC9637.mo1331().m36283(m52717) + ">";
            }
            String str2 = str;
            InterfaceC0463 mo6211 = abstractC9637.f29208.mo6211(-1);
            if (m245672.getType() == -1 && mo6211 != null) {
                m245672 = mo6211;
            }
            return abstractC9637.f29208.f6383.mo3968().mo3833(new C21115(m245672.mo2051(), m245672.mo2051().getInputStream()), m52717, str2, 0, -1, -1, m245672.getLine(), m245672.mo2049());
        }
        if (this.f51228 != null) {
            int i = this.f51227;
            C17397 c17397 = new C17397(abstractC9637, abstractC9637.f29208, this.f51228);
            c17397.m8183(i);
            c17397.m8184(abstractC9637.m24567());
            throw c17397;
        }
        throw new C17397(abstractC9637);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0463 m39232(AbstractC9637 abstractC9637) {
        if (!abstractC9637.m24573().m52723(abstractC9637.f29208.mo6203(2))) {
            return null;
        }
        m39230(abstractC9637);
        abstractC9637.mo9958();
        InterfaceC0463 m24567 = abstractC9637.m24567();
        this.f51224 = false;
        this.f51226 = null;
        this.f51225 = -1;
        return m24567;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m39227(InterfaceC0463 interfaceC0463) {
        if (interfaceC0463 == null) {
            return "<no token>";
        }
        String text = interfaceC0463.getText();
        if (text == null) {
            if (interfaceC0463.getType() == -1) {
                text = "<EOF>";
            } else {
                text = "<" + interfaceC0463.getType() + ">";
            }
        }
        return m39226(text);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m39226(String str) {
        return C4860.m14172("'", str.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t"), "'");
    }
}
