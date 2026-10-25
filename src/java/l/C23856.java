package l;

import java.util.Iterator;
import java.util.List;

/* compiled from: H9F9 */
/* renamed from: l.᩻ᩳۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23856 implements InterfaceC13851 {
    @Override // l.InterfaceC13851
    public final Long apply(Object obj) {
        Iterator it = ((List) obj).iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((Long) it.next()).longValue();
        }
        return Long.valueOf(j);
    }
}
