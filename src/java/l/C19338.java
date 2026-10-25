package l;

import java.util.Iterator;

/* compiled from: 37P4 */
/* renamed from: l.᩵۠۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19338 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f60792;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18837 f60793;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18837 f60794;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m44562(C19338 c19338, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC0286 abstractC0286 = (AbstractC0286) it.next();
            if (abstractC0286.f1633 == -1) {
                c19338.m44563(abstractC0286);
            }
        }
        return c19338.f60793.m43517();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m44563(AbstractC0286 abstractC0286) {
        AbstractC0286 abstractC02862;
        int i = this.f60792;
        abstractC0286.f1633 = i;
        abstractC0286.f1632 = i;
        this.f60792 = i + 1;
        C18837 c18837 = this.f60794;
        c18837.m43515(abstractC0286);
        for (AbstractC0286 abstractC02863 : abstractC0286.mo1628()) {
            if (abstractC02863.f1633 == -1) {
                m44563(abstractC02863);
                abstractC0286.f1632 = Math.min(abstractC0286.f1632, abstractC02863.f1632);
            } else if (c18837.contains(abstractC02863)) {
                abstractC0286.f1632 = Math.min(abstractC0286.f1632, abstractC02863.f1633);
            }
        }
        if (abstractC0286.f1632 == abstractC0286.f1633) {
            C18837 c188372 = new C18837();
            do {
                abstractC02862 = (AbstractC0286) c18837.remove();
                abstractC02862.getClass();
                c188372.m43511(abstractC02862);
            } while (abstractC02862 != abstractC0286);
            this.f60793.m43511((Object) c188372.m43517());
        }
    }
}
