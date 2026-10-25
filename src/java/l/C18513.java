package l;

import java.util.ArrayList;
import java.util.TreeMap;

/* compiled from: 9BH0 */
/* renamed from: l.ᩴۘܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18513 implements InterfaceC17101 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14984 f57372;

    public C18513(C14984 c14984) {
        this.f57372 = c14984;
    }

    @Override // l.InterfaceC17101
    /* renamed from: ֫ */
    public final void mo7531(C12122 c12122) {
        m43024((AbstractC14278) c12122);
    }

    @Override // l.InterfaceC17101
    /* renamed from: ֫ */
    public final void mo7532(C13532 c13532) {
        m43024((AbstractC14278) c13532);
    }

    @Override // l.InterfaceC17101
    /* renamed from: ۧ */
    public final void mo7534(C12122 c12122) {
        m43024((AbstractC14278) c12122);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43024(AbstractC14278 abstractC14278) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TreeMap treeMap;
        TreeMap treeMap2;
        C21480 mo29540 = abstractC14278.mo29540();
        C14984 c14984 = this.f57372;
        if (mo29540 != null) {
            C18658 m48653 = mo29540.m48653();
            treeMap = c14984.f45684;
            ArrayList arrayList4 = (ArrayList) treeMap.get(m48653);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                treeMap2 = c14984.f45684;
                treeMap2.put(m48653, arrayList4);
            }
            arrayList4.add(mo29540);
        }
        if (abstractC14278 instanceof C12122) {
            if (abstractC14278.mo29537().m9562() == 56) {
                arrayList3 = c14984.f45681;
                arrayList3.add((C12122) abstractC14278);
                return;
            }
            C23596 m16229 = C5772.m16229();
            C3135 m37484 = abstractC14278.mo29542().m37484();
            C20069 mo29535 = abstractC14278.mo29535();
            m16229.getClass();
            if (m37484.m9563()) {
                int size = mo29535.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    i += mo29535.m41004get(i2).m48645();
                }
                if (i >= 6) {
                    arrayList2 = c14984.f45682;
                    arrayList2.add((C12122) abstractC14278);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC14278 instanceof C13532) {
            arrayList = c14984.f45678;
            arrayList.add((C13532) abstractC14278);
        }
    }
}
