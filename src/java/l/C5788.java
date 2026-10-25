package l;

import java.util.Iterator;

/* compiled from: Y1UK */
/* renamed from: l.ۛۗۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5788 extends AbstractC2821 implements InterfaceC8898 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22016[] f17817;

    public C5788(C22016... c22016Arr) {
        super(2);
        this.f17817 = c22016Arr;
    }

    @Override // l.AbstractC2821, l.InterfaceC8898
    /* renamed from: ֫ */
    public final void mo1225(C2966 c2966) {
        mo8718(c2966);
        String m9074 = c2966.m9074();
        if (m9074 != null) {
            AbstractC19900 m16258 = m16258(C9523.m24408(m9074));
            if (m16258 instanceof C2966) {
                c2966.m9075((C2966) m16258);
            }
        }
    }

    @Override // l.AbstractC2821
    /* renamed from: ۧ */
    public final void mo8718(C2966 c2966) {
        AbstractC19900 m16258;
        if (c2966.m45789() != null && (m16258 = m16258(c2966.m45789())) != null) {
            c2966.m45793(m16258);
            m16258.m45784(c2966);
        }
        Iterator<E> it = c2966.m45798().iterator();
        while (it.hasNext()) {
            AbstractC19900 m162582 = m16258((String) it.next());
            if (m162582 != null) {
                c2966.m45787(m162582);
                m162582.m45784(c2966);
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private AbstractC19900 m16258(String str) {
        for (C22016 c22016 : this.f17817) {
            AbstractC19900 m49539 = c22016.m49539(str);
            if (m49539 != null) {
                return m49539;
            }
        }
        return null;
    }
}
