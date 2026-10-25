package l;

import java.util.Iterator;
import java.util.Map;

/* compiled from: X93U */
/* renamed from: l.۬ۘۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12859 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Iterator f38622;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Map.Entry f38623;

    public C12859(AbstractC12154 abstractC12154) {
        C19210 c19210;
        c19210 = abstractC12154.f36261;
        Iterator m44319 = c19210.m44319();
        this.f38622 = m44319;
        if (m44319.hasNext()) {
            this.f38623 = (Map.Entry) m44319.next();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31295(int i, AbstractC14766 abstractC14766) {
        while (true) {
            Map.Entry entry = this.f38623;
            if (entry == null || ((C0117) entry.getKey()).getNumber() >= i) {
                return;
            }
            C19210.m44297((C0117) this.f38623.getKey(), this.f38623.getValue(), abstractC14766);
            Iterator it = this.f38622;
            if (it.hasNext()) {
                this.f38623 = (Map.Entry) it.next();
            } else {
                this.f38623 = null;
            }
        }
    }
}
