package l;

/* compiled from: N4NK */
/* renamed from: l.ܳܿ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C14658 extends Exception {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Object f44793;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f44794;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC6898 f44795;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC11858 f44796;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f44797;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f44798;

    public C14658() {
    }

    public C14658(InterfaceC11858 interfaceC11858) {
        Object obj;
        this.f44796 = interfaceC11858;
        interfaceC11858.getClass();
        if (interfaceC11858 instanceof InterfaceC21010) {
            InterfaceC6898 mo32228 = ((InterfaceC21010) interfaceC11858).mo32228(1);
            this.f44795 = mo32228;
            this.f44794 = mo32228.getLine();
            this.f44798 = this.f44795.mo10331();
        }
        if (!(interfaceC11858 instanceof InterfaceC4781)) {
            if (interfaceC11858 instanceof InterfaceC4802) {
                this.f44797 = interfaceC11858.mo28964(1);
                InterfaceC4802 interfaceC4802 = (InterfaceC4802) interfaceC11858;
                this.f44794 = interfaceC4802.getLine();
                this.f44798 = interfaceC4802.m14012();
                return;
            }
            this.f44797 = interfaceC11858.mo28964(1);
            return;
        }
        InterfaceC4781 interfaceC4781 = (InterfaceC4781) interfaceC11858;
        this.f44793 = interfaceC4781.m13964(1);
        if (interfaceC4781 instanceof InterfaceC0547) {
            InterfaceC0547 interfaceC0547 = (InterfaceC0547) interfaceC4781;
            obj = interfaceC0547.mo2293(false);
            if (obj == null) {
                obj = interfaceC0547.mo2293(true);
            }
        } else {
            obj = null;
        }
        C6322 mo13965 = interfaceC4781.mo13965();
        obj = obj == null ? this.f44793 : obj;
        mo13965.getClass();
        InterfaceC6898 interfaceC6898 = obj instanceof C18893 ? ((C18893) obj).f59554 : null;
        if (interfaceC6898 != null) {
            this.f44795 = interfaceC6898;
            if (interfaceC6898.getLine() <= 0) {
                Object m13964 = interfaceC4781.m13964(-1);
                int i = -1;
                while (m13964 != null) {
                    InterfaceC6898 interfaceC68982 = m13964 instanceof C18893 ? ((C18893) m13964).f59554 : null;
                    if (interfaceC68982 != null && interfaceC68982.getLine() > 0) {
                        this.f44794 = interfaceC68982.getLine();
                        this.f44798 = interfaceC68982.mo10331();
                        return;
                    } else {
                        i--;
                        try {
                            m13964 = interfaceC4781.m13964(i);
                        } catch (UnsupportedOperationException unused) {
                            m13964 = null;
                        }
                    }
                }
                return;
            }
            this.f44794 = interfaceC6898.getLine();
            this.f44798 = interfaceC6898.mo10331();
            return;
        }
        Object obj2 = this.f44793;
        if (!(obj2 instanceof InterfaceC22420)) {
            int type = obj2 != null ? ((InterfaceC22420) obj2).getType() : 0;
            Object obj3 = this.f44793;
            this.f44795 = new C3391(type, obj3 != null ? ((InterfaceC22420) obj3).getText() : null);
        } else {
            this.f44794 = ((InterfaceC22420) obj2).getLine();
            this.f44798 = ((InterfaceC22420) this.f44793).mo8349();
            Object obj4 = this.f44793;
            if (obj4 instanceof C18893) {
                this.f44795 = ((C18893) obj4).f59554;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m34945() {
        InterfaceC11858 interfaceC11858 = this.f44796;
        if (interfaceC11858 instanceof InterfaceC21010) {
            return this.f44795.getType();
        }
        if (interfaceC11858 instanceof InterfaceC4781) {
            ((InterfaceC4781) interfaceC11858).mo13965().getClass();
            Object obj = this.f44793;
            if (obj == null) {
                return 0;
            }
            return ((InterfaceC22420) obj).getType();
        }
        return this.f44797;
    }
}
