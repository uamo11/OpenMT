package l;

import java.util.Iterator;

/* compiled from: D3VQ */
/* renamed from: l.ܳ᩺ܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C14837 extends AbstractC1349 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f45254;

    public C14837(C24010 c24010) {
        C3319 c3319;
        c3319 = C24010.f77811;
        this.f45254 = c3319.m10162(c24010.f77812).iterator();
    }

    @Override // l.AbstractC1349
    /* renamed from: ֫ */
    public final Object mo1890() {
        Iterator it = this.f45254;
        if (it.hasNext()) {
            String str = (String) it.next();
            if (it.hasNext() || !str.isEmpty()) {
                return str;
            }
        }
        m4715();
        return null;
    }
}
