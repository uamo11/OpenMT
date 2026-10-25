package l;

import java.util.ArrayList;

/* compiled from: I9EA */
/* renamed from: l.ܶۨۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C15202 extends C16614 {
    @Override // l.C16614
    /* renamed from: ۧ */
    public final void mo7050(C0097 c0097) {
        c0097.m26096(2);
        int m26100 = c0097.m26100();
        int m26099 = c0097.m26099();
        if (m26100 > 0 && m26099 > 0) {
            ArrayList arrayList = new ArrayList();
            c0097.m26097(((C23670) this.f2936).mo14552() + m26100);
            while (true) {
                int m26083 = c0097.m26083();
                C17985 c17985 = new C17985();
                c17985.m42026(c0097);
                arrayList.add(c17985);
                if (c17985.m42025() == 0) {
                    break;
                } else {
                    c0097.m26097(c17985.m42025() + m26083);
                }
            }
        }
        c0097.m26097(((C23670) this.f2936).mo14552() + m26100 + m26099);
    }
}
