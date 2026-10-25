package l;

import java.util.Iterator;
import java.util.List;

/* compiled from: 19Q0 */
/* renamed from: l.۬ۚ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12916 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        c2450.m7907("payload");
        C14401 c14401 = new C14401(c2450.m7917());
        c14401.m34420();
        List m7909 = c2450.m7909();
        if (m7909.size() == 1) {
            C19143 c19143 = (C19143) m7909.get(0);
            c14401.m34404(c19143.getName(), (ViewOnLongClickListenerC9963) null);
            c14401.m34415(c19143.getSize()).m19153(8);
            c14401.m34396(c19143.m44212());
            c14401.m34417();
            c14401.m34408();
            C6058.m16907(c14401.m34409(), c2450.m7921(), c19143);
            return;
        }
        c14401.m34405(m7909);
        Iterator it = m7909.iterator();
        long j = 0;
        long j2 = 0;
        while (it.hasNext()) {
            C19143 c191432 = (C19143) ((InterfaceC17889) it.next());
            j += c191432.getSize();
            j2 += c191432.m44212();
        }
        c14401.m34415(j).m19153(8);
        c14401.m34396(j2);
        c14401.m34408();
    }
}
