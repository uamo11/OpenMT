package l;

/* compiled from: Q9CC */
/* renamed from: l.۟᩶ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C7692 extends AbstractC23920 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f23760;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC14292 f23761;

    public C7692(C6987 c6987, AbstractC14292 abstractC14292) {
        super(c6987);
        this.f23761 = abstractC14292;
    }

    @Override // l.AbstractC23920
    /* renamed from: ֫ */
    public final void mo18883(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.f23760 = str;
        AbstractC14292 abstractC14292 = this.f23761;
        abstractC14292.getClass();
        super.mo18883(i, i2, AbstractC14292.m34073(str), abstractC14292.m34074(str2, false), AbstractC14292.m34073(str3), strArr == null ? null : AbstractC14292.m34071(strArr));
    }

    @Override // l.AbstractC23920
    /* renamed from: ֫ */
    public final AbstractC22509 mo18881(int i, String str, String str2) {
        AbstractC14292 abstractC14292 = this.f23761;
        abstractC14292.getClass();
        AbstractC22509 mo18881 = super.mo18881(i, str, str2);
        if (mo18881 == null) {
            return null;
        }
        return new C17821(this.f77590, mo18881, abstractC14292);
    }

    @Override // l.AbstractC23920
    /* renamed from: ֫ */
    public final AbstractC14104 mo18879(String str, boolean z) {
        AbstractC14292 abstractC14292 = this.f23761;
        abstractC14292.getClass();
        AbstractC14104 mo18879 = super.mo18879(AbstractC14292.m34069(str), z);
        if (mo18879 == null) {
            return null;
        }
        int i = this.f77590;
        return new C14041(i, str, mo18879, abstractC14292).m33651(new C14041(i, null, mo18879, abstractC14292));
    }

    @Override // l.AbstractC23920
    /* renamed from: ֫ */
    public final AbstractC14104 mo18878(int i, C23214 c23214, String str, boolean z) {
        AbstractC14292 abstractC14292 = this.f23761;
        abstractC14292.getClass();
        AbstractC14104 mo18878 = super.mo18878(i, c23214, AbstractC14292.m34069(str), z);
        if (mo18878 == null) {
            return null;
        }
        int i2 = this.f77590;
        return new C14041(i2, str, mo18878, abstractC14292).m33651(new C14041(i2, null, mo18878, abstractC14292));
    }

    @Override // l.AbstractC23920
    /* renamed from: ֫ */
    public final void mo18888(C16864 c16864) {
        if (c16864 instanceof C16409) {
            throw null;
        }
        super.mo18888(c16864);
    }

    @Override // l.AbstractC23920
    /* renamed from: ۧ */
    public final AbstractC4870 mo18889(String str, String str2, String str3) {
        AbstractC14292 abstractC14292 = this.f23761;
        abstractC14292.getClass();
        AbstractC4870 mo18889 = super.mo18889(str, AbstractC14292.m34069(str2), abstractC14292.m34074(str3, true));
        if (mo18889 == null) {
            return null;
        }
        return new C17115(this.f77590, mo18889, abstractC14292);
    }

    @Override // l.AbstractC23920
    /* renamed from: ֫ */
    public final AbstractC4165 mo18877(int i, String str, String str2, String str3, Object obj) {
        AbstractC14292 abstractC14292 = this.f23761;
        abstractC14292.getClass();
        AbstractC4165 mo18877 = super.mo18877(i, str, AbstractC14292.m34069(str2), abstractC14292.m34074(str3, true), obj == null ? null : AbstractC14292.m34068(obj));
        if (mo18877 == null) {
            return null;
        }
        return new C1593(this.f77590, mo18877, abstractC14292);
    }

    @Override // l.AbstractC23920
    /* renamed from: ֫ */
    public final AbstractC15452 mo18880(int i, String str, String str2, String str3, String[] strArr) {
        AbstractC14292 abstractC14292 = this.f23761;
        abstractC14292.getClass();
        AbstractC15452 mo18880 = super.mo18880(i, str, AbstractC14292.m34072(str2), abstractC14292.m34074(str3, false), strArr == null ? null : AbstractC14292.m34071(strArr));
        if (mo18880 == null) {
            return null;
        }
        return new C10766(this.f77590, mo18880, abstractC14292);
    }

    @Override // l.AbstractC23920
    /* renamed from: ֫ */
    public final void mo18885(String str, int i, String str2, String str3) {
        this.f23761.getClass();
        String m34073 = AbstractC14292.m34073(str);
        String str4 = null;
        String m340732 = str2 == null ? null : AbstractC14292.m34073(str2);
        if (str3 != null) {
            String m340733 = AbstractC14292.m34073(str);
            if (!m340733.equals(str)) {
                int lastIndexOf = str.lastIndexOf(47);
                int lastIndexOf2 = m340733.lastIndexOf(47);
                if ((lastIndexOf == -1 || lastIndexOf2 == -1 || !str.substring(lastIndexOf).equals(m340733.substring(lastIndexOf2))) && m340733.contains("$")) {
                    int lastIndexOf3 = m340733.lastIndexOf(36);
                    do {
                        lastIndexOf3++;
                        if (lastIndexOf3 >= m340733.length()) {
                            break;
                        }
                    } while (Character.isDigit(m340733.charAt(lastIndexOf3)));
                    str3 = m340733.substring(lastIndexOf3);
                }
            }
            str4 = str3;
        }
        super.mo18885(m34073, i, m340732, str4);
    }

    @Override // l.AbstractC23920
    /* renamed from: ֫ */
    public final void mo18887(String str, String str2, String str3) {
        this.f23761.getClass();
        String m34073 = AbstractC14292.m34073(str);
        if (str2 == null) {
            str2 = null;
        }
        super.mo18887(m34073, str2, str3 != null ? AbstractC14292.m34072(str3) : null);
    }

    @Override // l.AbstractC23920
    /* renamed from: ֫ */
    public final void mo18884(String str) {
        this.f23761.getClass();
        super.mo18884(AbstractC14292.m34073(str));
    }

    @Override // l.AbstractC23920
    /* renamed from: ۧ */
    public final void mo18890(String str) {
        this.f23761.getClass();
        super.mo18890(AbstractC14292.m34073(str));
    }

    @Override // l.AbstractC23920
    /* renamed from: ܽ */
    public final void mo18892(String str) {
        this.f23761.getClass();
        super.mo18892(AbstractC14292.m34073(str));
    }
}
