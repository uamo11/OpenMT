package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: QBEG */
/* renamed from: l.۠ۜܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C8012 extends AbstractC17598 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TreeMap f24739;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m21325(C21685 c21685) {
        if (c21685 == null) {
            throw new NullPointerException("methodHandle == null");
        }
        m16519();
        if (((C0956) this.f24739.get(c21685)) == null) {
            this.f24739.put(c21685, new C0956(c21685));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15772 m21324(AbstractC13717 abstractC13717) {
        if (abstractC13717 == null) {
            throw new NullPointerException("cst == null");
        }
        m16524();
        AbstractC15772 abstractC15772 = (AbstractC15772) this.f24739.get((C21685) abstractC13717);
        if (abstractC15772 != null) {
            return abstractC15772;
        }
        throw new IllegalArgumentException("not found");
    }

    public C8012(C1662 c1662) {
        super("method_handles", c1662, 8);
        this.f24739 = new TreeMap();
    }

    @Override // l.AbstractC17598
    /* renamed from: ۢ */
    public final void mo1508() {
        Iterator it = this.f24739.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C0956) it.next()).m37187(i);
            i++;
        }
    }

    @Override // l.AbstractC5895
    /* renamed from: ᩳ */
    public final Collection mo6834() {
        return this.f24739.values();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m21323(C21685 c21685) {
        return ((C0956) this.f24739.get(c21685)).m37188();
    }
}
