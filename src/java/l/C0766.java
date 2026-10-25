package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/* compiled from: 27BV */
/* renamed from: l.֨֡ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0766 extends AbstractC21934 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f2832;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0766(C19818 c19818, String str, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        super(c19818, str, linkedHashMap);
        this.f2832 = arrayList;
    }

    @Override // l.AbstractC21934
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo2920() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f2832.iterator();
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            C9555 c9555 = (C9555) it.next();
            if (m49410()) {
                return;
            }
            if (c9555.isDirectory()) {
                i2++;
                if (!c9555.mo36978()) {
                    arrayList.add(c9555.mo24433());
                }
            } else {
                i++;
                if (!c9555.mo36978()) {
                    j += c9555.getSize();
                }
            }
        }
        int i3 = i;
        int i4 = i2;
        long j2 = j;
        m49407(i3, i4, j2, false);
        LinkedList linkedList = new LinkedList(arrayList);
        while (!linkedList.isEmpty()) {
            if (m49410()) {
                return;
            }
            int i5 = i3;
            int i6 = i4;
            long j3 = j2;
            for (AbstractC15440 abstractC15440 : ((AbstractC15440) linkedList.removeFirst()).mo23549(true)) {
                if (abstractC15440.mo23113()) {
                    i6++;
                    if (!abstractC15440.m36533()) {
                        linkedList.addLast(abstractC15440);
                    }
                } else {
                    i5++;
                    if (!abstractC15440.m36533()) {
                        j3 += abstractC15440.mo23127();
                    }
                }
            }
            i3 = i5;
            i4 = i6;
            j2 = j3;
            m49407(i3, i4, j2, false);
        }
        m49407(i3, i4, j2, true);
    }
}
