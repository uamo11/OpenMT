package l;

import java.util.Iterator;

/* compiled from: 4BJX */
/* renamed from: l.۟᩸ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7734 extends AbstractC21162 {
    public final String toString() {
        return ":only-of-type";
    }

    @Override // l.AbstractC21162
    /* renamed from: ֫ */
    public final boolean mo2753(C19814 c19814, C19814 c198142) {
        C19814 mo28099 = c198142.mo28099();
        if (mo28099 != null && !(mo28099 instanceof C0762)) {
            Iterator<E> it = mo28099.m45579().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((C19814) it.next()).m45571().equals(c198142.m45571())) {
                    i++;
                }
            }
            if (i == 1) {
                return true;
            }
        }
        return false;
    }
}
