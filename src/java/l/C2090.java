package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: H403 */
/* renamed from: l.֫᩸ۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2090 extends ArrayList {
    @Override // java.util.ArrayList
    public final Object clone() {
        C2090 c2090 = new C2090(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            c2090.add(((C19814) it.next()).mo2918clone());
        }
        return c2090;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder m47000 = C20519.m47000();
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            C19814 c19814 = (C19814) it.next();
            if (m47000.length() != 0) {
                m47000.append("\n");
            }
            m47000.append(c19814.mo2910());
        }
        return C20519.m46998(m47000);
    }
}
