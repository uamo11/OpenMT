package l;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: LA2Z */
/* renamed from: l.۠۠ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8055 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashSet f24856 = new HashSet();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21436(AbstractC15440 abstractC15440) {
        if (abstractC15440 == null || !(abstractC15440 instanceof C12993)) {
            return;
        }
        this.f24856.add(abstractC15440.mo31566());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21437() {
        C5242 c5242;
        if (!C11083.m27510()) {
            return true;
        }
        Iterator it = this.f24856.iterator();
        while (it.hasNext()) {
            String m31565 = ((C12993) it.next()).m31565();
            C20050 c20050 = C12993.f38911;
            if (!C20050.m46238(m31565)) {
                c5242 = C12993.f38908;
                c5242.mo1664(new AtomicReference(m31565));
                return false;
            }
        }
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m21438() {
        if (!C11083.m27510()) {
            return Collections.EMPTY_LIST;
        }
        return (List) C5378.stream(this.f24856).filter(new C6586(1)).sorted().collect(C22976.toList());
    }
}
