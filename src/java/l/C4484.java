package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: 6BDM */
/* renamed from: l.ۙۜܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4484 extends AbstractC5895 {

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Comparator f14262 = new C22123();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final EnumC20007 f14263;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f14264;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f14265;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f14266;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized AbstractC3073 m13223(AbstractC3073 abstractC3073) {
        m16519();
        AbstractC3073 abstractC30732 = (AbstractC3073) this.f14264.get(abstractC3073);
        if (abstractC30732 != null) {
            return abstractC30732;
        }
        m13220(abstractC3073);
        this.f14264.put(abstractC3073, abstractC3073);
        return abstractC3073;
    }

    public C4484(String str, C1662 c1662, int i, EnumC20007 enumC20007) {
        super(str, c1662, i);
        this.f14266 = new ArrayList(100);
        this.f14264 = new HashMap(100);
        this.f14263 = enumC20007;
        this.f14265 = -1;
    }

    @Override // l.AbstractC5895
    /* renamed from: ᩳ */
    public final Collection mo6834() {
        return this.f14266;
    }

    @Override // l.AbstractC5895
    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo13226() {
        m16524();
        return this.f14265;
    }

    @Override // l.AbstractC5895
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo13219(AbstractC2368 abstractC2368) {
        return ((AbstractC3073) abstractC2368).m9390();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13220(AbstractC3073 abstractC3073) {
        m16519();
        try {
            if (abstractC3073.m9392() > m16516()) {
                throw new IllegalArgumentException("incompatible item alignment");
            }
            this.f14266.add(abstractC3073);
        } catch (NullPointerException unused) {
            throw new NullPointerException("item == null");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13221(C18241 c18241, EnumC3779 enumC3779) {
        m16524();
        TreeMap treeMap = new TreeMap();
        Iterator it = this.f14266.iterator();
        while (it.hasNext()) {
            AbstractC3073 abstractC3073 = (AbstractC3073) it.next();
            if (abstractC3073.mo2862() == enumC3779) {
                treeMap.put(abstractC3073.mo2864(), abstractC3073);
            }
        }
        if (treeMap.size() == 0) {
            return;
        }
        c18241.m42501(0, "\nmethod code index:\n\n");
        for (Map.Entry entry : treeMap.entrySet()) {
            c18241.m42501(0, ((AbstractC3073) entry.getValue()).m9391() + ' ' + ((String) entry.getKey()) + '\n');
        }
    }

    @Override // l.AbstractC5895
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo13225() {
        C1662 m16521 = m16521();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f14266;
            int size = arrayList.size();
            if (i >= size) {
                return;
            }
            while (i < size) {
                ((AbstractC3073) arrayList.get(i)).mo2863(m16521);
                i++;
            }
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m13222() {
        m16524();
        int ordinal = this.f14263.ordinal();
        ArrayList arrayList = this.f14266;
        if (ordinal == 1) {
            Collections.sort(arrayList, f14262);
        } else if (ordinal == 2) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC3073 abstractC3073 = (AbstractC3073) arrayList.get(i2);
            try {
                int m9388 = abstractC3073.m9388(this, i);
                if (m9388 < i) {
                    throw new RuntimeException("bogus place() result for " + abstractC3073);
                }
                i = abstractC3073.mo3385() + m9388;
            } catch (RuntimeException e) {
                throw C8136.m21601("...while placing " + abstractC3073, e);
            }
        }
        this.f14265 = i;
    }

    @Override // l.AbstractC5895
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo13224(C18241 c18241) {
        boolean m42506 = c18241.m42506();
        C1662 m16521 = m16521();
        Iterator it = this.f14266.iterator();
        int i = 0;
        boolean z = true;
        while (it.hasNext()) {
            AbstractC3073 abstractC3073 = (AbstractC3073) it.next();
            if (m42506) {
                if (z) {
                    z = false;
                } else {
                    c18241.m42501(0, "\n");
                }
            }
            int m9392 = abstractC3073.m9392() - 1;
            int i2 = (~m9392) & (i + m9392);
            if (i != i2) {
                c18241.m42518(i2 - i);
                i = i2;
            }
            abstractC3073.mo3384(m16521, c18241);
            i += abstractC3073.mo3385();
        }
        if (i != this.f14265) {
            throw new RuntimeException("output size mismatch");
        }
    }
}
