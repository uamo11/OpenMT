package l;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: N673 */
/* renamed from: l.ۨ᩶ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11937 {
    public final Map a;
    public final Map b;

    public C11937(Map map) {
        this.a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l2 = (Long) entry2.getKey();
                ConcurrentMapC10942 concurrentMapC10942 = C14052.a;
                hashMap2.put(str, new AbstractMap.SimpleImmutableEntry(str2, l2));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            Collections.sort(arrayList2, C14052.b);
            hashMap.put((EnumC20655) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put(null, arrayList);
        }
        Collections.sort(arrayList, C14052.b);
        this.b = hashMap;
    }

    public final String a(long j, EnumC20655 enumC20655) {
        Map map = (Map) this.a.get(enumC20655);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }
}
