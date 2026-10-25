package l;

import java.util.List;

/* compiled from: 71XR */
/* renamed from: l.ۜ᩶᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7001 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        c2450.m7907("zip");
        C15717 c15717 = new C15717(c2450.m7921());
        List m7909 = c2450.m7909();
        if (m7909.size() == 1) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) m7909.get(0);
            if (interfaceC17889.isDirectory()) {
                c15717.m37058((C12645) interfaceC17889);
                return;
            } else {
                c15717.m37057((C12645) interfaceC17889);
                return;
            }
        }
        c15717.m37056(m7909);
    }
}
