package l;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: A3HU */
/* renamed from: l.ۧ᩷֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11237 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f33690 = new LinkedHashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27811(AbstractC16466 abstractC16466, AbstractC16466 abstractC164662, AbstractC16466 abstractC164663) {
        LinkedHashMap linkedHashMap = this.f33690;
        Map map = (Map) linkedHashMap.get(abstractC16466);
        if (map == null) {
            map = new LinkedHashMap();
            linkedHashMap.put(abstractC16466, map);
        } else {
            map.get(abstractC164662);
        }
        map.put(abstractC164662, abstractC164663);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m27810(AbstractC16466 abstractC16466, AbstractC16466 abstractC164662) {
        Map map = (Map) this.f33690.get(abstractC16466);
        if (map == null) {
            return null;
        }
        return map.get(abstractC164662);
    }
}
