package l;

import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: UATT */
/* renamed from: l.ۜᩳۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6928 extends AbstractC2926 {

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static final C11459 f21382 = C11459.m28260("(?m)^[ \\t]*// MARK_(?:CLASS_START (L.+?;)|(CLASS_END)|METHOD_START ([vd]) (.+)|(METHOD_END)|FIELD_START ([si]) (.+)|(FIELD_END))\\r?\\n");

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f21383;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Object f21384;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public AbstractC14346 f21385;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public List f21386 = Collections.EMPTY_LIST;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f21387;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f21388;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f21389;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f21390;

    /* JADX WARN: Removed duplicated region for block: B:73:0x01c7  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C10220 m18730(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6928.m18730(java.lang.String):l.ۤۤ");
    }

    public C6928(C21434 c21434) {
        C0972 m48554 = c21434.m48554(am.aI);
        C0972 m485542 = c21434.m48554("m");
        C0972 m485543 = c21434.m48554("f");
        m48554 = m48554 == null ? new C0972() : m48554;
        ArrayList arrayList = new ArrayList(m48554.size());
        ArrayList arrayList2 = new ArrayList(m485542.size());
        ArrayList arrayList3 = new ArrayList(m485543.size());
        for (int i = 0; i < m48554.size(); i++) {
            C21434 m3432 = m48554.m3432(i);
            C8839 c8839 = new C8839();
            c8839.f26917 = m3432.m48553("n");
            c8839.f26919 = m3432.m48553(am.aI);
            c8839.f26918 = m3432.m48551(am.aB);
            c8839.f26916 = m3432.m48551("e");
            arrayList.add(c8839);
        }
        for (int i2 = 0; i2 < m485542.size(); i2++) {
            C21434 m34322 = m485542.m3432(i2);
            C23655 c23655 = new C23655();
            c23655.f76634 = m34322.m48553("n");
            c23655.f76629 = m34322.m48553(am.av);
            c23655.f76633 = m34322.m48553("r");
            c23655.f76632 = m34322.m48553(am.aG);
            c23655.f76635 = m34322.m48552().booleanValue();
            c23655.f76631 = m34322.m48551(am.aB);
            c23655.f76630 = m34322.m48551("e");
            arrayList2.add(c23655);
        }
        for (int i3 = 0; i3 < m485543.size(); i3++) {
            C21434 m34323 = m485543.m3432(i3);
            C14482 c14482 = new C14482();
            c14482.f44373 = m34323.m48553("n");
            c14482.f44370 = m34323.m48553(am.aI);
            c14482.f44374 = m34323.m48553(am.aE);
            c14482.f44369 = m34323.m48553(am.aG);
            c14482.f44371 = m34323.m48550(am.aF);
            c14482.f44372 = m34323.m48551(am.aB);
            c14482.f44368 = m34323.m48551("e");
            arrayList3.add(c14482);
        }
        this.f21390 = arrayList;
        this.f21387 = arrayList2;
        this.f21383 = arrayList3;
    }

    public C6928(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f21390 = arrayList;
        this.f21387 = arrayList2;
        this.f21383 = arrayList3;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C21434 m18734() {
        C21434 c21434 = new C21434();
        C0972 c0972 = new C0972();
        C0972 c09722 = new C0972();
        C0972 c09723 = new C0972();
        Iterator it = this.f21390.iterator();
        while (it.hasNext()) {
            C8839 c8839 = (C8839) it.next();
            c8839.getClass();
            C21434 c214342 = new C21434();
            c214342.m48549("n", c8839.f26917);
            c214342.m48549(am.aI, c8839.f26919);
            c214342.m48549(am.aB, Integer.valueOf(c8839.f26918));
            c214342.m48549("e", Integer.valueOf(c8839.f26916));
            c0972.add(c214342);
        }
        Iterator it2 = this.f21387.iterator();
        while (it2.hasNext()) {
            C23655 c23655 = (C23655) it2.next();
            c23655.getClass();
            C21434 c214343 = new C21434();
            c214343.m48549("n", c23655.f76634);
            c214343.m48549(am.av, c23655.f76629);
            c214343.m48549("r", c23655.f76633);
            String str = c23655.f76632;
            if (str != null) {
                c214343.m48549(am.aG, str);
            }
            c214343.m48549(am.aE, Boolean.valueOf(c23655.f76635));
            c214343.m48549(am.aB, Integer.valueOf(c23655.f76631));
            c214343.m48549("e", Integer.valueOf(c23655.f76630));
            c09722.add(c214343);
        }
        Iterator it3 = this.f21383.iterator();
        while (it3.hasNext()) {
            C14482 c14482 = (C14482) it3.next();
            c14482.getClass();
            C21434 c214344 = new C21434();
            c214344.m48549("n", c14482.f44373);
            c214344.m48549(am.aI, c14482.f44370);
            String str2 = c14482.f44374;
            if (str2 != null) {
                c214344.m48549(am.aE, str2);
            }
            String str3 = c14482.f44369;
            if (str3 != null) {
                c214344.m48549(am.aG, str3);
            }
            c214344.m48549(am.aF, Boolean.valueOf(c14482.f44371));
            c214344.m48549(am.aB, Integer.valueOf(c14482.f44372));
            c214344.m48549("e", Integer.valueOf(c14482.f44368));
            c09723.add(c214344);
        }
        c21434.m48549(am.aI, c0972);
        c21434.m48549("m", c09722);
        c21434.m48549("f", c09723);
        return c21434;
    }

    @Override // l.AbstractC2489
    /* renamed from: ֫ */
    public final void mo7983(C12366 c12366, CharSequence charSequence) {
        m8929(charSequence, new InterfaceC19860() { // from class: l.ܳᩳۢ
            @Override // l.InterfaceC19860
            /* renamed from: ֫ */
            public final Runnable mo11589(CharSequence charSequence2, InterfaceC17066 interfaceC17066) {
                ArrayList arrayList = new ArrayList();
                C23861 c23861 = new C23861(charSequence2);
                int i = 0;
                while (i < charSequence2.length() && !interfaceC17066.mo1526()) {
                    try {
                        int m52574 = c23861.m52574(i, false);
                        if (m52574 == i) {
                            i++;
                        } else {
                            if (charSequence2.charAt(i) == '\"') {
                                C9545 c9545 = new C9545();
                                int i2 = i + 1;
                                c9545.f28948 = i2;
                                int i3 = m52574 - 1;
                                c9545.f28946 = i3;
                                String charSequence3 = charSequence2.subSequence(i2, i3).toString();
                                c9545.f28947 = charSequence3;
                                try {
                                    c9545.f28949 = C10035.f30194.m28254(charSequence3);
                                } catch (RuntimeException unused) {
                                    c9545.f28949 = c9545.f28947;
                                }
                                arrayList.add(c9545);
                            }
                            i = m52574;
                        }
                    } catch (Exception unused2) {
                    }
                }
                return new RunnableC0667(2, C6928.this, arrayList);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.ܳۛ᩷, l.᩷ۧۢ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18731(C6928 c6928, ArrayList arrayList) {
        c6928.f21386 = C20195.unmodifiableList(arrayList);
        ?? r4 = c6928.f21385;
        if (r4 != 0) {
            c6928.m18733(c6928.f21389, c6928.f21388, r4);
        }
        InterfaceC6722 interfaceC6722 = c6928.f7936;
        if (interfaceC6722 != null) {
            interfaceC6722.mo18292(c6928.f21390, c6928.f21387, c6928.f21383, c6928.f21386);
        }
    }

    @Override // l.AbstractC2489
    /* renamed from: ֫ */
    public final Object mo7979() {
        if (m8931()) {
            return this.f21384;
        }
        return null;
    }

    @Override // l.AbstractC2489
    /* renamed from: ֫ */
    public final void mo7980(final int i, final int i2, final InterfaceC20834 interfaceC20834) {
        m8930(new Runnable(interfaceC20834, i, i2) { // from class: l.ܿᩳۢ

            /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f53483;

            /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f53484;

            /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ AbstractC14346 f53486;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f53486 = (AbstractC14346) interfaceC20834;
                this.f53484 = i;
                this.f53483 = i2;
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [l.ܳۛ᩷, l.᩷ۧۢ] */
            @Override // java.lang.Runnable
            public final void run() {
                C6928.m18732(C6928.this, this.f53486, this.f53484, this.f53483);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18732(C6928 c6928, InterfaceC20834 interfaceC20834, int i, int i2) {
        c6928.f21385 = (AbstractC14346) interfaceC20834;
        c6928.f21389 = i;
        c6928.f21388 = i2;
        if (c6928.m8931()) {
            c6928.m18733(i, i2, interfaceC20834);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m18733(int i, int i2, InterfaceC20834 interfaceC20834) {
        int i3;
        int i4;
        int i5;
        int i6;
        this.f21384 = null;
        Iterator it = this.f21387.iterator();
        while (it.hasNext()) {
            C23655 c23655 = (C23655) it.next();
            int i7 = c23655.f76631;
            if (i >= i7 && i <= (i6 = c23655.f76630)) {
                if (i2 < i7 || i2 > i6) {
                    interfaceC20834.mo17422(0, 0, null);
                    return;
                } else {
                    this.f21384 = c23655;
                    interfaceC20834.mo17422(c23655.f76631, c23655.f76630, C9045.m23341(new StringBuilder(), c23655.f76634, "()"));
                    return;
                }
            }
        }
        Iterator it2 = this.f21383.iterator();
        while (it2.hasNext()) {
            C14482 c14482 = (C14482) it2.next();
            int i8 = c14482.f44372;
            if (i >= i8 && i <= (i5 = c14482.f44368)) {
                if (i2 < i8 || i2 > i5) {
                    interfaceC20834.mo17422(0, 0, null);
                    return;
                } else {
                    this.f21384 = c14482;
                    interfaceC20834.mo17422(-1, -1, c14482.f44373);
                    return;
                }
            }
        }
        Iterator it3 = this.f21390.iterator();
        int i9 = Integer.MAX_VALUE;
        C8839 c8839 = null;
        while (it3.hasNext()) {
            C8839 c88392 = (C8839) it3.next();
            int i10 = c88392.f26918;
            if (i >= i10 && i <= (i3 = c88392.f26916) && i2 >= i10 && i2 <= i3 && (i4 = i3 - i10) < i9) {
                c8839 = c88392;
                i9 = i4;
            }
        }
        if (c8839 == null) {
            interfaceC20834.mo17422(0, 0, null);
        } else {
            this.f21384 = c8839;
            interfaceC20834.mo17422(-1, -1, c8839.f26917);
        }
    }
}
