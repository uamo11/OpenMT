package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 25VK */
/* renamed from: l.ۙۙۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4414 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13138(C5637 c5637) {
        C13334 c13334;
        ArrayList arrayList = c5637.f17418;
        c5637.f17418 = new ArrayList();
        C19937 c19937 = new C19937();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4931 c4931 = (C4931) it.next();
            C4931 m14372 = c4931.m14372(c19937);
            AbstractC1591 m5439 = c4931.f15561.m5439();
            boolean z = false;
            while (true) {
                c13334 = c4931.f15559;
                if (m5439 == c13334) {
                    break;
                }
                if (C14996.m35532(m5439)) {
                    if (!z) {
                        AbstractC1591 m5441 = m5439.m5441();
                        if (m5441 == null || m5441.f5638 != EnumC7690.LABEL) {
                            m5441 = new C13334();
                            c5637.f17411.m38666(m5439, m5441);
                        }
                        m14372.f15561 = (C13334) m5441;
                        z = true;
                    }
                } else if (z) {
                    AbstractC1591 m54412 = m5439.m5441();
                    if (m54412 == null || m54412.f5638 != EnumC7690.LABEL) {
                        m54412 = new C13334();
                        c5637.f17411.m38666(m5439, m54412);
                    }
                    m14372.f15559 = (C13334) m54412;
                    c5637.f17418.add(m14372);
                    m14372 = c4931.m14372(c19937);
                    z = false;
                }
                m5439 = m5439.m5439();
            }
            if (z) {
                m14372.f15559 = c13334;
                c5637.f17418.add(m14372);
            }
        }
    }
}
