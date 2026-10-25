package l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: 75V0 */
/* renamed from: l.֫ۗۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1550 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7236 f5463 = new C7236(null, true);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5309(C5637 c5637) {
        C18274 c18274;
        HashMap hashMap = new HashMap();
        Iterator it = c5637.f17411.iterator();
        while (it.hasNext()) {
            AbstractC1591 abstractC1591 = (AbstractC1591) it.next();
            if (abstractC1591.f5638 == EnumC7690.ASSIGN && abstractC1591.mo5445().f25745 == EnumC1340.LOCAL && abstractC1591.mo5444().f25745 == EnumC1340.NEW) {
                C18274 c182742 = (C18274) abstractC1591.mo5445();
                C13585 c13585 = new C13585();
                c13585.f40527 = c182742;
                hashMap.put(c182742, c13585);
            }
        }
        if (hashMap.size() > 0) {
            int m35534 = C14996.m35534(c5637);
            C14996.m35528(c5637);
            C14996.m35531(c5637.f17411, new C22758(m35534, hashMap));
            Iterator it2 = hashMap.entrySet().iterator();
            while (it2.hasNext()) {
                C13585 c135852 = (C13585) ((Map.Entry) it2.next()).getValue();
                boolean z = !c135852.f40528;
                if (c135852.f40526 == null) {
                    z = false;
                }
                if (!z) {
                    it2.remove();
                }
            }
            if (hashMap.size() > 0) {
                HashSet hashSet = new HashSet();
                C18274[] c18274Arr = new C18274[m35534];
                Iterator it3 = c5637.f17415.iterator();
                while (it3.hasNext()) {
                    C18274 c182743 = (C18274) it3.next();
                    c18274Arr[c182743.f56817] = c182743;
                }
                for (C13585 c135853 : hashMap.values()) {
                    C7236[] c7236Arr = (C7236[]) c135853.f40526.f5637;
                    for (int i = 0; i < c7236Arr.length; i++) {
                        C7236 c7236 = c7236Arr[i];
                        if (c7236 != null && c7236.f22187 == c135853) {
                            hashSet.add(c18274Arr[i]);
                        }
                    }
                }
                Iterator it4 = c5637.f17411.iterator();
                while (it4.hasNext()) {
                    AbstractC1591 abstractC15912 = (AbstractC1591) it4.next();
                    if (abstractC15912.f5638 == EnumC7690.ASSIGN && abstractC15912.mo5445().f25745 == EnumC1340.LOCAL && hashSet.contains((C18274) abstractC15912.mo5445())) {
                        it4.remove();
                    }
                }
                for (C13585 c135854 : hashMap.values()) {
                    AbstractC1591 abstractC15913 = c135854.f40526;
                    C18274 c182744 = c135854.f40527;
                    C7236[] c7236Arr2 = (C7236[]) abstractC15913.f5637;
                    for (int i2 = 0; i2 < c7236Arr2.length; i2++) {
                        C7236 c72362 = c7236Arr2[i2];
                        if (c72362 != null && c72362.f22187 == c135854 && (c18274 = c18274Arr[i2]) != c182744) {
                            c5637.f17411.m38662(c135854.f40526, C17819.m41744(c18274, c182744));
                        }
                    }
                    C11219 m5308 = m5308(c135854.f40526);
                    AbstractC8396[] abstractC8396Arr = m5308.f17269;
                    C7338 c7338 = m5308.f33657;
                    c5637.f17411.m38668(c135854.f40526, C17819.m41744(c182744, C23275.m51588((AbstractC8396[]) Arrays.copyOfRange(abstractC8396Arr, 1, abstractC8396Arr.length), c7338.m19704(), c7338.m19702())));
                }
            }
            Iterator it5 = c5637.f17411.iterator();
            while (it5.hasNext()) {
                ((AbstractC1591) it5.next()).f5637 = null;
            }
        }
        Iterator it6 = c5637.f17411.iterator();
        while (it6.hasNext()) {
            AbstractC1591 abstractC15914 = (AbstractC1591) it6.next();
            C11219 m53082 = m5308(abstractC15914);
            if (m53082 != null) {
                C7338 c73382 = m53082.f33657;
                if ("<init>".equals(c73382.m19700()) && "V".equals(c73382.m19701())) {
                    AbstractC8396[] abstractC8396Arr2 = m53082.f17269;
                    AbstractC8396 abstractC8396 = abstractC8396Arr2[0];
                    if (abstractC8396.f25745 == EnumC1340.NEW) {
                        c5637.f17411.m38666(abstractC15914, new C6530(C23275.m51588((AbstractC8396[]) Arrays.copyOfRange(abstractC8396Arr2, 1, abstractC8396Arr2.length), c73382.m19704(), c73382.m19702())));
                        it6.remove();
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11219 m5308(AbstractC1591 abstractC1591) {
        EnumC7690 enumC7690 = abstractC1591.f5638;
        if (enumC7690 == EnumC7690.ASSIGN) {
            if (abstractC1591.mo5444().f25745 == EnumC1340.INVOKE_SPECIAL) {
                return (C11219) abstractC1591.mo5444();
            }
            return null;
        }
        if (enumC7690 != EnumC7690.VOID_INVOKE) {
            return null;
        }
        AbstractC8396 mo5442 = abstractC1591.mo5442();
        if (mo5442 instanceof C11219) {
            return (C11219) mo5442;
        }
        return null;
    }
}
