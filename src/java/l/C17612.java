package l;

import java.util.Iterator;

/* compiled from: 4BJX */
/* renamed from: l.ܿ᩸ۚ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17612 extends AbstractC21162 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f53805;

    public final String toString() {
        return C4860.m14172("[^", this.f53805, "]");
    }

    public C17612(String str) {
        C16990.m39823(str);
        this.f53805 = C23340.m51750(str);
    }

    @Override // l.AbstractC21162
    /* renamed from: ֫ */
    public final boolean mo2753(C19814 c19814, C19814 c198142) {
        Iterator it = c198142.mo25045().m36734().iterator();
        while (it.hasNext()) {
            if (C23340.m51750(((C9230) it.next()).getKey()).startsWith(this.f53805)) {
                return true;
            }
        }
        return false;
    }
}
