package l;

import com.umeng.analytics.pro.am;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.simpleframework.xml.strategy.Name;

/* compiled from: R6M5 */
/* renamed from: l.᩸֨֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21241 extends AbstractC5697 implements InterfaceC5012 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19830 f68459;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11363 f68460;

    public C21241(InterfaceC19830 interfaceC19830) {
        this.f68459 = interfaceC19830;
        this.f68460 = ((C9952) interfaceC19830).mo25075();
    }

    @Override // l.InterfaceC5012
    /* renamed from: ۧ */
    public final Set mo14504() {
        Class[] clsArr = {C17837.class, C6548.class, C21365.class, C22630.class, C13457.class, C14308.class, C20660.class, C12192.class, C15719.class, C2315.class, C19249.class, C15013.class, C8665.class, C17131.class, C3020.class, C12897.class, C7108.class, C9371.class, C22070.class, C23481.class};
        HashSet hashSet = new HashSet(20);
        for (int i = 0; i < 20; i++) {
            Class cls = clsArr[i];
            C11003.requireNonNull(cls);
            if (!hashSet.add(cls)) {
                throw new IllegalArgumentException("duplicate element: " + cls);
            }
        }
        return C20195.unmodifiableSet(hashSet);
    }

    @Override // l.InterfaceC5012
    /* renamed from: ֫ */
    public final void mo14503(AbstractC0197 abstractC0197) {
        abstractC0197.mo1345(this);
    }

    @Override // l.AbstractC5697, l.InterfaceC10076
    /* renamed from: ֫ */
    public final void mo16054(C17837 c17837) {
        mo16061(c17837);
    }

    @Override // l.AbstractC5697, l.InterfaceC10076
    /* renamed from: ֫ */
    public final void mo16042(C6548 c6548) {
        String str = am.aG + c6548.m18054();
        C11363 c11363 = this.f68460;
        c11363.m28117();
        c11363.m28119(str, m48213(c6548, str, Collections.EMPTY_MAP), false);
        mo16061(c6548);
        c11363.m28121("/" + str);
        c11363.m28117();
    }

    @Override // l.AbstractC5697, l.InterfaceC10076
    /* renamed from: ֫ */
    public final void mo16059(C22630 c22630) {
        C11363 c11363 = this.f68460;
        c11363.m28117();
        c11363.m28119("blockquote", m48213(c22630, "blockquote", Collections.EMPTY_MAP), false);
        c11363.m28117();
        mo16061(c22630);
        c11363.m28117();
        c11363.m28121("/blockquote");
        c11363.m28117();
    }

    @Override // l.AbstractC5697, l.InterfaceC10076
    /* renamed from: ֫ */
    public final void mo16050(C14308 c14308) {
        String m34141 = c14308.m34141();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String m34142 = c14308.m34142();
        if (m34142 != null && !m34142.isEmpty()) {
            int indexOf = m34142.indexOf(" ");
            if (indexOf != -1) {
                m34142 = m34142.substring(0, indexOf);
            }
            linkedHashMap.put(Name.LABEL, "language-" + m34142);
        }
        m48214(m34141, c14308, linkedHashMap);
    }

    @Override // l.AbstractC5697, l.InterfaceC10076
    /* renamed from: ֫ */
    public final void mo16056(C20660 c20660) {
        C11363 c11363 = this.f68460;
        c11363.m28117();
        c11363.m28118(c20660.m47245());
        c11363.m28117();
    }

    @Override // l.AbstractC5697, l.InterfaceC10076
    /* renamed from: ֫ */
    public final void mo16047(C12192 c12192) {
        C11363 c11363 = this.f68460;
        c11363.m28117();
        c11363.m28119("hr", m48213(c12192, "hr", Collections.EMPTY_MAP), true);
        c11363.m28117();
    }

    @Override // l.AbstractC5697, l.InterfaceC10076
    /* renamed from: ֫ */
    public final void mo16052(C15719 c15719) {
        m48214(c15719.m37093(), c15719, Collections.EMPTY_MAP);
    }

    @Override // l.AbstractC5697, l.InterfaceC10076
    /* renamed from: ֫ */
    public final void mo16039(C2315 c2315) {
        boolean z;
        C21946 c21946;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String m7574 = c2315.m7574();
        C5718 c5718 = ((C9952) this.f68459).f30041;
        z = c5718.f17640;
        if (z) {
            c21946 = c5718.f17641;
            m7574 = c21946.m49435(m7574);
            linkedHashMap.put("rel", "nofollow");
        }
        linkedHashMap.put("href", m7574);
        if (c2315.m7573() != null) {
            linkedHashMap.put("title", c2315.m7573());
        }
        LinkedHashMap m48213 = m48213(c2315, am.av, linkedHashMap);
        C11363 c11363 = this.f68460;
        c11363.m28119(am.av, m48213, false);
        mo16061(c2315);
        c11363.m28121("/a");
    }

    @Override // l.AbstractC5697, l.InterfaceC10076
    /* renamed from: ֫ */
    public final void mo16051(C15013 c15013) {
        int intValue = c15013.m35549() != null ? c15013.m35549().intValue() : 1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (intValue != 1) {
            linkedHashMap.put("start", String.valueOf(intValue));
        }
        m48215((AbstractC18543) c15013, "ol", m48213((AbstractC0197) c15013, "ol", (Map) linkedHashMap));
    }

    @Override // l.AbstractC5697, l.InterfaceC10076
    /* renamed from: ֫ */
    public final void mo16044(C8665 c8665) {
        boolean z;
        C21946 c21946;
        String m22423 = c8665.m22423();
        C14889 c14889 = new C14889();
        c14889.mo16044(c8665);
        String m35326 = c14889.m35326();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C5718 c5718 = ((C9952) this.f68459).f30041;
        z = c5718.f17640;
        if (z) {
            c21946 = c5718.f17641;
            m22423 = c21946.m49435(m22423);
        }
        linkedHashMap.put("src", m22423);
        linkedHashMap.put("alt", m35326);
        if (c8665.m22422() != null) {
            linkedHashMap.put("title", c8665.m22422());
        }
        this.f68460.m28119("img", m48213(c8665, "img", linkedHashMap), true);
    }

    @Override // l.AbstractC5697, l.InterfaceC10076
    /* renamed from: ֫ */
    public final void mo16048(C12897 c12897) {
        this.f68460.m28122(c12897.m31335());
    }

    @Override // l.AbstractC5697, l.InterfaceC10076
    /* renamed from: ֫ */
    public final void mo16045(C9371 c9371) {
        this.f68460.m28118(c9371.m24188());
    }

    @Override // l.AbstractC5697, l.InterfaceC10076
    /* renamed from: ֫ */
    public final void mo16058(C22070 c22070) {
        this.f68460.m28118("\n");
    }

    @Override // l.AbstractC5697
    /* renamed from: ۧ */
    public final void mo16061(AbstractC0197 abstractC0197) {
        AbstractC0197 m1341 = abstractC0197.m1341();
        while (m1341 != null) {
            AbstractC0197 m1352 = m1341.m1352();
            ((C9952) this.f68459).mo25076(m1341);
            m1341 = m1352;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48214(String str, AbstractC11342 abstractC11342, Map map) {
        C11363 c11363 = this.f68460;
        c11363.m28117();
        c11363.m28119("pre", m48213(abstractC11342, "pre", Collections.EMPTY_MAP), false);
        c11363.m28119("code", m48213(abstractC11342, "code", map), false);
        c11363.m28122(str);
        c11363.m28121("/code");
        c11363.m28121("/pre");
        c11363.m28117();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48215(AbstractC18543 abstractC18543, String str, LinkedHashMap linkedHashMap) {
        C11363 c11363 = this.f68460;
        c11363.m28117();
        c11363.m28119(str, linkedHashMap, false);
        c11363.m28117();
        mo16061(abstractC18543);
        c11363.m28117();
        c11363.m28121("/".concat(str));
        c11363.m28117();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // l.AbstractC5697, l.InterfaceC10076
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo16057(l.C21365 r6) {
        /*
            r5 = this;
            l.ۨ֡֡ r0 = r6.mo1355()
            r1 = 0
            if (r0 == 0) goto L16
            l.֡ۚ֡ r0 = r0.mo1355()
            boolean r2 = r0 instanceof l.AbstractC18543
            if (r2 == 0) goto L16
            l.ᩴۚ֡ r0 = (l.AbstractC18543) r0
            boolean r0 = r0.m43088()
            goto L17
        L16:
            r0 = 0
        L17:
            l.ۨ֨֡ r2 = r5.f68460
            if (r0 != 0) goto L29
            r2.m28117()
            java.util.Map r3 = java.util.Collections.EMPTY_MAP
            java.lang.String r4 = "p"
            java.util.LinkedHashMap r3 = r5.m48213(r6, r4, r3)
            r2.m28119(r4, r3, r1)
        L29:
            r5.mo16061(r6)
            if (r0 != 0) goto L36
            java.lang.String r6 = "/p"
            r2.m28121(r6)
            r2.m28117()
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21241.mo16057(l.᩸ۚ֡):void");
    }

    @Override // l.AbstractC5697, l.InterfaceC10076
    /* renamed from: ֫ */
    public final void mo16040(C3020 c3020) {
        LinkedHashMap m48213 = m48213(c3020, "strong", Collections.EMPTY_MAP);
        C11363 c11363 = this.f68460;
        c11363.m28119("strong", m48213, false);
        mo16061(c3020);
        c11363.m28121("/strong");
    }

    @Override // l.AbstractC5697, l.InterfaceC10076
    /* renamed from: ֫ */
    public final void mo16043(C7108 c7108) {
        LinkedHashMap m48213 = m48213(c7108, "code", Collections.EMPTY_MAP);
        C11363 c11363 = this.f68460;
        c11363.m28119("code", m48213, false);
        c11363.m28122(c7108.m19123());
        c11363.m28121("/code");
    }

    @Override // l.AbstractC5697, l.InterfaceC10076
    /* renamed from: ֫ */
    public final void mo16049(C13457 c13457) {
        m48215((AbstractC18543) c13457, "ul", m48213(c13457, "ul", Collections.EMPTY_MAP));
    }

    @Override // l.AbstractC5697, l.InterfaceC10076
    /* renamed from: ֫ */
    public final void mo16053(C17131 c17131) {
        LinkedHashMap m48213 = m48213(c17131, "em", Collections.EMPTY_MAP);
        C11363 c11363 = this.f68460;
        c11363.m28119("em", m48213, false);
        mo16061(c17131);
        c11363.m28121("/em");
    }

    @Override // l.AbstractC5697, l.InterfaceC10076
    /* renamed from: ֫ */
    public final void mo16055(C19249 c19249) {
        LinkedHashMap m48213 = m48213(c19249, "li", Collections.EMPTY_MAP);
        C11363 c11363 = this.f68460;
        c11363.m28119("li", m48213, false);
        mo16061(c19249);
        c11363.m28121("/li");
        c11363.m28117();
    }

    @Override // l.AbstractC5697, l.InterfaceC10076
    /* renamed from: ֫ */
    public final void mo16060(C23481 c23481) {
        LinkedHashMap m48213 = m48213(c23481, "br", Collections.EMPTY_MAP);
        C11363 c11363 = this.f68460;
        c11363.m28119("br", m48213, true);
        c11363.m28117();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private LinkedHashMap m48213(AbstractC0197 abstractC0197, String str, Map map) {
        return ((C9952) this.f68459).mo25074(abstractC0197, str, map);
    }
}
