package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;

/* compiled from: SBDM */
/* renamed from: l.ۖۖܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2244 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f7314;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8594[] f7315;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f7316;

    public C2244(C20630 c20630, C20589[] c20589Arr) {
        ArrayList m47190 = c20630.m47190();
        this.f7314 = m47190;
        this.f7315 = new C8594[m47190.size() + 2];
        this.f7316 = new ArrayList();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7433(C20630 c20630, C20589[] c20589Arr) {
        int i;
        C8594[] c8594Arr;
        int i2;
        C2244 c2244 = new C2244(c20630, c20589Arr);
        C16395 m47195 = c20630.m47195();
        ArrayList arrayList = c2244.f7316;
        if (m47195 != null) {
            arrayList.add(m47195);
            c20589Arr[m47195.m38609()].f66282 = m47195.m38609();
        }
        c20630.m47176(new C15648(c2244));
        int size = arrayList.size() - 1;
        int i3 = size;
        while (true) {
            c8594Arr = c2244.f7315;
            if (i3 < 2) {
                break;
            }
            C16395 c16395 = (C16395) arrayList.get(i3);
            C8594 c8594 = c8594Arr[c16395.m38609()];
            BitSet m38624 = c16395.m38624();
            for (int nextSetBit = m38624.nextSetBit(0); nextSetBit >= 0; nextSetBit = m38624.nextSetBit(nextSetBit + 1)) {
                C16395 c163952 = (C16395) c2244.f7314.get(nextSetBit);
                if (c8594Arr[c163952.m38609()] != null && (i2 = c8594Arr[c2244.m7432(c163952).m38609()].f26243) < c8594.f26243) {
                    c8594.f26243 = i2;
                }
            }
            c8594Arr[((C16395) arrayList.get(c8594.f26243)).m38609()].f26241.add(c16395);
            C16395 c163953 = c8594.f26242;
            c8594.f26240 = c163953;
            ArrayList arrayList2 = c8594Arr[c163953.m38609()].f26241;
            while (!arrayList2.isEmpty()) {
                C16395 c163954 = (C16395) C4248.m12790(arrayList2, 1);
                C16395 m7432 = c2244.m7432(c163954);
                if (c8594Arr[m7432.m38609()].f26243 < c8594Arr[c163954.m38609()].f26243) {
                    c20589Arr[c163954.m38609()].f66282 = m7432.m38609();
                } else {
                    c20589Arr[c163954.m38609()].f66282 = c8594.f26242.m38609();
                }
            }
            i3--;
        }
        for (i = 2; i <= size; i++) {
            C16395 c163955 = (C16395) arrayList.get(i);
            if (c20589Arr[c163955.m38609()].f66282 != ((C16395) arrayList.get(c8594Arr[c163955.m38609()].f26243)).m38609()) {
                c20589Arr[c163955.m38609()].f66282 = c20589Arr[c20589Arr[c163955.m38609()].f66282].f66282;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C16395 m7432(C16395 c16395) {
        int m38609 = c16395.m38609();
        C8594[] c8594Arr = this.f7315;
        C8594 c8594 = c8594Arr[m38609];
        if (c8594.f26240 == null) {
            return c16395;
        }
        if (c8594Arr[c8594Arr[c16395.m38609()].f26240.m38609()].f26240 != null) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            arrayList.add(c16395);
            while (!arrayList.isEmpty()) {
                int size = arrayList.size() - 1;
                C8594 c85942 = c8594Arr[((C16395) arrayList.get(size)).m38609()];
                C16395 c163952 = c85942.f26240;
                C8594 c85943 = c8594Arr[c163952.m38609()];
                if (hashSet.add(c163952) && c85943.f26240 != null) {
                    arrayList.add(c163952);
                } else {
                    arrayList.remove(size);
                    if (c85943.f26240 != null) {
                        C16395 c163953 = c85943.f26244;
                        if (c8594Arr[c163953.m38609()].f26243 < c8594Arr[c85942.f26244.m38609()].f26243) {
                            c85942.f26244 = c163953;
                        }
                        c85942.f26240 = c85943.f26240;
                    }
                }
            }
        }
        return c8594.f26244;
    }
}
