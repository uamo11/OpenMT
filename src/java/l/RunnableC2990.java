package l;

import java.util.ArrayList;

/* compiled from: OAYY */
/* renamed from: l.ۗۘܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2990 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        C6951 m23409 = C9068.m23409();
        ArrayList arrayList = new ArrayList();
        for (C16828 c16828 : (C16828[]) m23409.m18795().toArray(new C16828[0])) {
            C17534 m39598 = c16828.m39598();
            if (m39598 != null) {
                if (C12749.m31047(m39598.m40974()) == null) {
                    arrayList.add(c16828);
                }
            } else {
                AbstractC15440 m39866 = C16999.m39866(c16828.m39588(), new String[0]);
                if (m39866.mo36530() && !m39866.mo23120()) {
                    arrayList.add(c16828);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C4925.m14315(new RunnableC3239(3, m23409, arrayList));
    }
}
