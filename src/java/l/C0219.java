package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: M43N */
/* renamed from: l.֡ۛ֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0219 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f1475;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5159 f1476;

    public C0219(C5159 c5159) {
        this.f1476 = c5159;
        this.f1475 = new ArrayList();
        C0384 c0384 = c5159.f16125;
        Iterator it = c0384.m1876().iterator();
        while (it.hasNext()) {
            this.f1475.add(new C19271(this, (AbstractC4308) it.next()));
        }
        Iterator it2 = this.f1475.iterator();
        while (it2.hasNext()) {
            C19271 c19271 = (C19271) it2.next();
            AbstractC4308 abstractC4308 = (AbstractC4308) ((C18837) c19271.f28700).first();
            Iterator it3 = this.f1475.iterator();
            while (it3.hasNext()) {
                C19271 c192712 = (C19271) it3.next();
                AbstractC4308 abstractC43082 = (AbstractC4308) ((C18837) c192712.f28700).first();
                if (abstractC4308 != abstractC43082 && AbstractC4308.m12903(((C0779) c0384.m1868(abstractC4308)).m2963(EnumC19125.values()), C2609.of((Object) abstractC43082))) {
                    c19271.f60647.add(c192712);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it4 = C5226.m15019(this.f1475).iterator();
        while (it4.hasNext()) {
            C2609 c2609 = (C2609) it4.next();
            if (c2609.m8245() > 1) {
                C19271 c192713 = (C19271) c2609.f8240;
                C2609 c26092 = c2609.f8241;
                Object obj = c192713.f28700;
                Iterator it5 = c26092.iterator();
                while (it5.hasNext()) {
                    C19271 c192714 = (C19271) it5.next();
                    C12171.m29641("Attempt to merge a compound node!", ((C18837) c192714.f28700).m43514() == 1);
                    ((C18837) obj).m43513((C18837) c192714.f28700);
                    Iterator it6 = c192714.f60647.iterator();
                    while (it6.hasNext()) {
                        c192713.f60647.add((C19271) it6.next());
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (C19271 c192715 : c192713.f60647) {
                    if (((C18837) obj).contains(((C18837) c192715.f28700).first())) {
                        linkedHashSet.add(c192713);
                    } else {
                        linkedHashSet.add(c192715);
                    }
                }
                c192713.f60647 = linkedHashSet;
                Iterator it7 = c2609.iterator();
                while (it7.hasNext()) {
                    m1468((C19271) it7.next(), c192713);
                }
            }
            arrayList.add((C19271) c2609.f8240);
        }
        this.f1475 = arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1468(C19271 c19271, C19271 c192712) {
        Iterator it = this.f1475.iterator();
        while (it.hasNext()) {
            C19271 c192713 = (C19271) it.next();
            if (c192713.f60647.remove(c19271) && c192712 != null) {
                c192713.f60647.add(c192712);
            }
        }
    }
}
