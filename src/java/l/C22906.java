package l;

import java.util.Iterator;

/* compiled from: G7LX */
/* renamed from: l.᩺ۢ۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22906 extends AbstractC11618 {
    @Override // l.AbstractC11618
    /* renamed from: ֫ */
    public final void mo28512(AbstractC0764 abstractC0764, C2609 c2609, boolean z, AbstractC4308 abstractC4308) {
        int i;
        C20661 c20661;
        C2609 m28511 = AbstractC11618.m28511(c2609);
        Iterator it = m28511.iterator();
        boolean z2 = true;
        while (true) {
            boolean hasNext = it.hasNext();
            c20661 = this.f5951;
            if (!hasNext) {
                break;
            }
            C2609 c26092 = (C2609) it.next();
            C12171.m29641("Arguments list is empty", !c26092.isEmpty());
            StringBuilder sb = new StringBuilder(c26092.m8245());
            C18837 c18837 = new C18837();
            C18837 c188372 = new C18837();
            Iterator it2 = c26092.iterator();
            boolean z3 = z2;
            while (it2.hasNext()) {
                AbstractC5144 abstractC5144 = (AbstractC5144) it2.next();
                Object mo12915 = abstractC5144.f16086.mo12915();
                if (!"".equals(mo12915)) {
                    AbstractC4308 abstractC43082 = abstractC5144.f16086;
                    if (abstractC43082 == c20661.f66522) {
                        sb.append((String) null);
                    } else if (mo12915 != null) {
                        String mo3259 = abstractC43082.mo3259();
                        if (mo3259.indexOf(2) != -1 || mo3259.indexOf(1) != -1) {
                            sb.append((char) 2);
                            c188372.m43511(C5268.m15194(mo3259));
                        } else {
                            sb.append(mo3259);
                        }
                    } else {
                        sb.append((char) 1);
                        AbstractC4308 abstractC43083 = abstractC5144.f16086;
                        if (!z3 || z) {
                            this.f5949.m32350(abstractC43083, abstractC5144).mo5817();
                        }
                        if (!this.f5955.m17559(abstractC43083).mo12941() && abstractC43083.f13890 != c20661.f66533.f13890) {
                            this.f5949.m32361((AbstractC5144) abstractC0764, c20661.f66533, this.f5952.f18896, C2609.of((Object) c20661.f66526), true);
                            abstractC43083 = c20661.f66533;
                        }
                        c18837.m43511(abstractC43083);
                        z3 = false;
                    }
                }
            }
            m50993(abstractC4308, abstractC0764, sb.toString(), c188372.m43517(), c18837.m43517());
            z2 = z3;
        }
        if (m28511.m8245() > 1) {
            C18837 c188373 = new C18837();
            StringBuilder sb2 = new StringBuilder();
            for (i = 0; i < m28511.m8245(); i++) {
                c188373.m43511(c20661.f66533);
                sb2.append((char) 1);
            }
            m50993(abstractC4308, abstractC0764, sb2.toString(), C2609.m8239(), c188373.m43517());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50993(AbstractC4308 abstractC4308, AbstractC0764 abstractC0764, String str, C2609 c2609, C2609 c26092) {
        AbstractC7715[] abstractC7715Arr;
        C6136 c6136 = this.f5952;
        C13359 c13359 = this.f5949;
        C2609 m8239 = C2609.m8239();
        C20661 c20661 = this.f5951;
        C14163 c14163 = c20661.f66481;
        AbstractC4308 abstractC43082 = c20661.f66533;
        C10658 c10658 = new C10658(c26092, abstractC4308, m8239, c14163);
        C17013 c17013 = this.f5950;
        int i = c17013.f52172;
        try {
            c17013.m39946((InterfaceC3109) abstractC0764);
            C18837 c18837 = new C18837();
            C18837 c188372 = new C18837();
            Iterator it = c2609.iterator();
            while (it.hasNext()) {
                c188372.m43511((InterfaceC8090) it.next());
                c18837.m43511(abstractC43082);
            }
            C2609 m8242 = C2609.of((Object) c20661.f66478, (Object) abstractC43082, (Object) c20661.f66455).m8242(abstractC43082);
            m8242.getClass();
            C9226 c9226 = new C9226(c6136.f18846, c20661.f66475, this.f5954.m50300(abstractC0764, c13359.m32368(), c20661.f66498, c6136.f18846, c18837.m43517().m8248(m8242), (C2609) null).mo10967(), c10658, (InterfaceC8090[]) c188372.m43517().m8248(C2609.of((Object) C5268.m15194(str))).toArray(new InterfaceC8090[c188372.size()]));
            C14439 m32366 = c13359.m32366();
            m32366.getClass();
            C6319 c6319 = m32366.f44256;
            C1365.m4782(c9226.mo16091(c6319));
            C12171.m29642(c9226.f17559 == EnumC1296.f4571);
            C10658 c106582 = (C10658) c9226.mo16091(c6319);
            int m4782 = C1365.m4782(c106582.f32060);
            m32366.f44254.m4810(c9226, c106582);
            abstractC7715Arr = m32366.f44255;
            AbstractC7715 abstractC7715 = abstractC7715Arr[m4782];
        } finally {
            c17013.f52172 = i;
        }
    }
}
