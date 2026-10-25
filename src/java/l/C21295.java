package l;

import java.util.ArrayList;

/* compiled from: ABG3 */
/* renamed from: l.᩸ۖܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21295 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20630 f68660;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48330(C20630 c20630) {
        c20630.m47182(new C14943(new C21295(c20630), C5772.m16229()));
    }

    public C21295(C20630 c20630) {
        this.f68660 = c20630;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m48332(C21295 c21295, C12122 c12122) {
        C20630 c20630 = c21295.f68660;
        C3135 m37484 = c12122.mo29542().m37484();
        C21480 m34042 = c12122.m34042();
        if (m34042 != null && !c20630.m47183(m34042) && m37484.m9562() != 5) {
            InterfaceC1538 m48637 = c12122.m34042().m48637();
            if (m48637.mo5253() && m48637.mo5255() == 6) {
                C20069 c20069 = C20069.f65002;
                c21295.m48329(c12122, c20069, 5, (AbstractC13717) m48637);
                if (m37484.m9562() == 56) {
                    c21295.m48329((C12122) C18566.m43105(((C16395) c20630.m47190().get(c12122.m34044().m38624().nextSetBit(0))).m38615(), 1), c20069, 6, (AbstractC13717) null);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m48329(C12122 c12122, C20069 c20069, int i, AbstractC13717 abstractC13717) {
        AbstractC15834 c5252;
        AbstractC15834 mo29542 = c12122.mo29542();
        C3135 m29854 = C12307.m29854(i, c12122.m34042(), c20069, abstractC13717);
        if (abstractC13717 == null) {
            c5252 = new C1018(m29854, mo29542.m37480(), c12122.m34042(), c20069);
        } else {
            c5252 = new C5252(m29854, mo29542.m37480(), c12122.m34042(), c20069, abstractC13717);
        }
        C12122 c121222 = new C12122(c5252, c12122.m34044());
        ArrayList m38615 = c12122.m34044().m38615();
        C20630 c20630 = this.f68660;
        c20630.m47178(c12122);
        m38615.set(m38615.lastIndexOf(c12122), c121222);
        c20630.m47177(c121222, (C20069) null);
        c20630.m47179(c121222, (C21480) null);
    }
}
