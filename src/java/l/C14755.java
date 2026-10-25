package l;

import java.util.Iterator;
import java.util.Set;

/* compiled from: P676 */
/* renamed from: l.ܳ᩶ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14755 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C23928 f45069;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35066(Set set) {
        C23928 c23928 = this.f45069;
        c23928.f77603.clear();
        c23928.f77604.clear();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int lastIndexOf = str.lastIndexOf(47);
            if (lastIndexOf == -1) {
                c23928.f77604.add(str);
            } else {
                c23928.m52692(str.substring(0, lastIndexOf)).f77604.add(str.substring(lastIndexOf + 1));
            }
        }
        c23928.m52693();
    }
}
