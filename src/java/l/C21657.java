package l;

import java.util.Iterator;

/* compiled from: P6MK */
/* renamed from: l.᩸ܶۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21657 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12484 f69492;

    public C21657(C12484 c12484) {
        this.f69492 = c12484;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0762 m48916(C0762 c0762) {
        C0762 m2906 = C0762.m2906(c0762.mo25050());
        C19814 m2917 = c0762.m2917();
        C22412.m50342(new C8251(this, m2917, m2906.m2917()), m2917);
        m2906.m2912(c0762.m2907().clone());
        return m2906;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15305 m48915(C21657 c21657, C19814 c19814) {
        C12484 c12484 = c21657.f69492;
        String m45591 = c19814.m45591();
        C15578 c15578 = new C15578();
        C19814 c198142 = new C19814(C16305.m38357(m45591, C1489.f5329), c19814.mo25050(), c15578);
        Iterator it = c19814.mo25045().iterator();
        int i = 0;
        while (it.hasNext()) {
            C9230 c9230 = (C9230) it.next();
            if (c12484.m30645(m45591, c19814, c9230)) {
                c15578.m36729(c9230);
            } else {
                i++;
            }
        }
        c15578.m36730(c12484.m30639(m45591));
        if (c19814.m28100().m5479()) {
            c19814.m28100().m5478(c198142, true);
        }
        if (c19814.m45578().m5479()) {
            c19814.m45578().m5478(c198142, false);
        }
        C15305 c15305 = new C15305();
        c15305.f46950 = c198142;
        c15305.f46951 = i;
        return c15305;
    }
}
