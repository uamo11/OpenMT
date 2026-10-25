package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: P1MC */
/* renamed from: l.ܰᩳۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13977 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m33428(ArrayList arrayList, EnumC5491 enumC5491) {
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C23150((CharSequence) it.next(), enumC5491));
        }
        return arrayList2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC6818 m33429(ArrayList arrayList, ArrayList arrayList2, EnumC5491 enumC5491, C4701 c4701) {
        c4701.m13775();
        List m33428 = m33428(arrayList, enumC5491);
        List m334282 = m33428(arrayList2, enumC5491);
        c4701.m13775();
        EnumC5491 enumC54912 = EnumC5491.IGNORE_WHITESPACES;
        if (enumC5491 != enumC54912) {
            InterfaceC6818 m43624 = new C2669(m33428, m334282, m33430(m33427(m33428, enumC54912), m33427(m334282, enumC54912), c4701)).m43624();
            C14578 c14578 = new C14578(m33428, m334282);
            new C10451(m43624, m33428, m334282, c14578).m26307();
            return C23751.m52403(c14578.m42227());
        }
        InterfaceC6818 m436242 = new C2669(m33428, m334282, m33430(m33428, m334282, c4701)).m43624();
        ArrayList arrayList3 = new ArrayList();
        Iterator mo6220 = m436242.mo6218().f41655.mo6220();
        while (mo6220.hasNext()) {
            C22340 c22340 = (C22340) mo6220.next();
            C22340 m10307 = C3374.m10307(m33428, m334282, c22340.f72397, c22340.f72398, c22340.f72395, c22340.f72396);
            if (!m10307.m50072()) {
                arrayList3.add(m10307);
            }
        }
        return C23751.m52403(C23751.m52400(arrayList3, m33428.size(), m334282.size()));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC6818 m33430(List list, List list2, C4701 c4701) {
        C13167 m33431 = m33431(list);
        C13167 m334312 = m33431(list2);
        return new C9019((C15859) m33431.f39375, (C15859) m334312.f39375, list, list2, C23751.m52402((List) m33431.f39374, (List) m334312.f39374, c4701), c4701).m37982();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13167 m33431(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        C15859 c15859 = new C15859(list.size());
        for (int i = 0; i < list.size(); i++) {
            C23150 c23150 = (C23150) list.get(i);
            if (c23150.m51331() > 3) {
                arrayList.add(c23150);
                c15859.add(i);
            }
        }
        return new C13167(arrayList, c15859);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m33427(List list, EnumC5491 enumC5491) {
        EnumC5491 enumC54912;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C23150 c23150 = (C23150) it.next();
            enumC54912 = c23150.f74414;
            if (enumC54912 != enumC5491) {
                c23150 = new C23150(c23150.m51330(), enumC5491);
            }
            arrayList.add(c23150);
        }
        return arrayList;
    }
}
