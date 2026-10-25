package l;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: X43L */
/* renamed from: l.ܿܶ֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17419 extends AbstractC13374 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashSet f53278 = new HashSet();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f53279;

    @Override // l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        AbstractC4308 abstractC43082 = (AbstractC4308) obj;
        switch (C11070.f33247[abstractC4308.mo3258().ordinal()]) {
            case 3:
                return Boolean.valueOf(!abstractC43082.m12913(EnumC9454.CHAR) && abstractC4308.mo3258().m24299(abstractC43082.mo3258()));
            case 4:
                return Boolean.valueOf(!abstractC43082.m12913(EnumC9454.SHORT) && abstractC4308.mo3258().m24299(abstractC43082.mo3258()));
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return Boolean.valueOf(abstractC4308.mo3258().m24299(abstractC43082.mo3258()));
            case 10:
            case 11:
                return Boolean.valueOf(abstractC4308.m12913(abstractC43082.mo3258()));
            case 12:
                return Boolean.valueOf(this.f53279.m17546(abstractC4308.mo12939(), abstractC43082, false));
            case 13:
                if (!abstractC43082.m12913(EnumC9454.BOT) && !abstractC43082.m12913(EnumC9454.CLASS) && !abstractC43082.m12913(EnumC9454.ARRAY) && !abstractC43082.m12913(EnumC9454.TYPEVAR)) {
                    r1 = false;
                }
                return Boolean.valueOf(r1);
            case 14:
            case 15:
                return Boolean.FALSE;
            default:
                throw new AssertionError("isSubtype " + abstractC4308.mo3258());
        }
    }

    @Override // l.AbstractC4203, l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo12688(C0779 c0779, Object obj) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        if (c0779 == abstractC4308 || c0779.f14167 == abstractC4308 || abstractC4308.m12913(EnumC9454.ERROR) || abstractC4308.m12913(EnumC9454.UNKNOWN)) {
            return Boolean.TRUE;
        }
        if (abstractC4308.m12913(EnumC9454.BOT)) {
            return Boolean.FALSE;
        }
        c0779.m2967(EnumC19125.f60272, abstractC4308, this.f53279);
        return Boolean.TRUE;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2141(C5138 c5138, Object obj) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        boolean m12913 = abstractC4308.m12913(EnumC9454.ARRAY);
        C6319 c6319 = this.f53279;
        if (m12913) {
            if (c5138.f16077.mo12941()) {
                return Boolean.valueOf(c6319.m17550(c5138.f16077, c6319.m17515(abstractC4308)));
            }
            return Boolean.valueOf(c6319.m17546(c5138.f16077, c6319.m17515(abstractC4308), false));
        }
        if (abstractC4308.m12913(EnumC9454.CLASS)) {
            AbstractC10370 mo16076 = abstractC4308.f13890.mo16076();
            C6136 c6136 = c6319.f19600;
            return Boolean.valueOf(mo16076 == c6136.f18887 || mo16076 == c6136.f18895 || mo16076 == c6136.f18786);
        }
        return Boolean.FALSE;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo9465(C12193 c12193, Object obj) {
        return Boolean.TRUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (r4 != false) goto L23;
     */
    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo2145(l.C19955 r7, java.lang.Object r8) {
        /*
            r6 = this;
            l.ۙ֨֨ r8 = (l.AbstractC4308) r8
            l.᩶֡֨ r0 = r8.f13890
            l.ۛ᩸֨ r1 = r6.f53279
            l.ۙ֨֨ r7 = r1.m17527(r0, r7)
            if (r7 != 0) goto Lf
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        Lf:
            l.ۢ۠֨ r0 = l.EnumC9454.CLASS
            boolean r0 = r7.m12913(r0)
            r2 = 0
            if (r0 != 0) goto L21
            boolean r7 = r1.m17546(r7, r8, r2)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L21:
            l.᩶֡֨ r0 = r7.f13890
            l.᩶֡֨ r3 = r8.f13890
            if (r0 != r3) goto L70
            boolean r0 = r8.mo12917()
            if (r0 == 0) goto L61
            l.۠᩸֨ r0 = new l.۠᩸֨
            r0.<init>(r8, r7, r1)
            java.util.HashSet r3 = r6.f53278
            boolean r4 = r3.add(r0)
            if (r4 == 0) goto L4f
            l.ۖܶ۠ r4 = r8.mo12938()     // Catch: java.lang.Throwable -> L4a
            l.ۖܶ۠ r5 = r7.mo12938()     // Catch: java.lang.Throwable -> L4a
            boolean r4 = r1.m17502(r4, r5)     // Catch: java.lang.Throwable -> L4a
            r3.remove(r0)
            goto L5f
        L4a:
            r7 = move-exception
            r3.remove(r0)
            throw r7
        L4f:
            l.ۖܶ۠ r0 = r8.mo12938()
            l.ۙ֨֨ r3 = r6.m40764(r7)
            l.ۖܶ۠ r3 = r3.mo12938()
            boolean r4 = r1.m17502(r0, r3)
        L5f:
            if (r4 == 0) goto L70
        L61:
            l.ۙ֨֨ r7 = r7.mo4958()
            l.ۙ֨֨ r8 = r8.mo4958()
            boolean r7 = r1.m17546(r7, r8, r2)
            if (r7 == 0) goto L70
            r2 = 1
        L70:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17419.mo2145(l.᩶ۚ֨, java.lang.Object):java.lang.Object");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC4308 m40764(AbstractC4308 abstractC4308) {
        C19831 c19831;
        C6319 c6319 = this.f53279;
        C20661 c20661 = c6319.f19609;
        if (!abstractC4308.mo12917()) {
            return abstractC4308;
        }
        C18837 c18837 = new C18837();
        C18837 c188372 = new C18837();
        try {
            c6319.m17500(abstractC4308.f13890.f17560, abstractC4308, c18837, c188372);
            if (c18837.isEmpty()) {
                return abstractC4308;
            }
            C18837 c188373 = new C18837();
            Iterator it = c188372.m43517().iterator();
            boolean z = false;
            while (it.hasNext()) {
                AbstractC4308 abstractC43082 = (AbstractC4308) it.next();
                AbstractC4308 m40764 = m40764(abstractC43082);
                if (m40764.mo12924() && !m40764.mo12922()) {
                    c19831 = new C19831(c20661.f66526, EnumC15678.UNBOUND, c20661.f66480, null, m40764.f13889);
                } else if (m40764 != abstractC43082) {
                    c19831 = new C19831(c6319.m17511(m40764), EnumC15678.EXTENDS, c20661.f66480, null, m40764.f13889);
                } else {
                    c188373.m43511(m40764);
                }
                m40764 = c19831;
                z = true;
                c188373.m43511(m40764);
            }
            return z ? c6319.m17488(abstractC4308.f13890.f17560, c18837.m43517(), c188373.m43517()) : abstractC4308;
        } catch (C8953 e) {
            throw new AssertionError(e);
        }
    }

    public C17419(C6319 c6319) {
        this.f53279 = c6319;
    }
}
