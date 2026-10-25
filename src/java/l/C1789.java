package l;

import bin.mt.plus.R;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: 150C */
/* renamed from: l.֫ۧᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1789 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m5956() {
        AbstractC15440 m36526 = C16293.m38327().m36526("dictionary");
        if (!m36526.mo23120() || !C23196.m51460()) {
            return Collections.EMPTY_LIST;
        }
        final String m14327 = C4925.m14327(R.string.MT_Protector_res_0x7f120233);
        List list = (List) C5378.stream(m36526.mo23549(true)).filter(new C13514(0)).map(new C10985(1)).sorted(new Comparator() { // from class: l.۟֫ᩳ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                String m45696 = ((C19866) obj).m45696();
                String m456962 = ((C19866) obj2).m45696();
                String str = m14327;
                if (m45696.equalsIgnoreCase(str)) {
                    return -1;
                }
                if (m456962.equalsIgnoreCase(str)) {
                    return 1;
                }
                return m45696.compareToIgnoreCase(m456962);
            }
        }).collect(C22976.toList());
        if (!list.isEmpty()) {
            return list;
        }
        AbstractC15440 m5957 = m5957(m14327);
        if (m5957.mo23120() || m5957.mo23545()) {
            return Collections.singletonList(new C19866(m14327));
        }
        return Collections.EMPTY_LIST;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m5957(String str) {
        return C16293.m38327().m36526("dictionary").m36526(str + ".mtd");
    }
}
