package l;

import java.util.ArrayList;

/* compiled from: X9RH */
/* renamed from: l.ܿۜܽ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17185 extends AbstractC21749 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f52675;

    public C17185(C5896 c5896) {
        int m16535 = c5896.m16535();
        this.f52675 = new ArrayList(m16535);
        for (int i = 0; i < m16535; i++) {
            this.f52675.add(new C14362(c5896.m16535(), c5896.m16535()));
        }
    }

    @Override // l.InterfaceC19094
    /* renamed from: ᩷ */
    public final int mo36414() {
        return this.f52675.size();
    }

    @Override // l.InterfaceC19094
    /* renamed from: ۧ */
    public final InterfaceC19800 mo36413(int i) {
        return (InterfaceC19800) this.f52675.get(i);
    }
}
