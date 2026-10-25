package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: B4S2 */
/* renamed from: l.ܿ᩷ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17600 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map f53777;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Map f53778;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map f53779;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C7308 f53780;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f53781;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Map f53782;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Map f53783;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f53784;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f53785;

    public C17600(C14777 c14777) {
        this.f53780 = c14777.f45141;
        Map map = c14777.f45138;
        int i = C7017.f21654;
        this.f53779 = C20195.unmodifiableMap(new HashMap(map));
        this.f53777 = C20195.unmodifiableMap(new HashMap(c14777.f45137));
        this.f53778 = C20195.unmodifiableMap(new HashMap(c14777.f45140));
        Map unmodifiableMap = C20195.unmodifiableMap(new HashMap(c14777.f45139));
        this.f53782 = unmodifiableMap;
        ArrayList arrayList = new ArrayList(unmodifiableMap.values());
        C6083.sort(arrayList, C8200.comparing(new C12247(0)));
        this.f53781 = C20195.unmodifiableList(arrayList);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C15068 c15068 = (C15068) it.next();
            Iterator it2 = c15068.m35662().iterator();
            while (it2.hasNext()) {
                C13843.putIfAbsent(hashMap, ((String) it2.next()).toLowerCase(Locale.ROOT), c15068);
            }
        }
        this.f53783 = C20195.unmodifiableMap(new HashMap(hashMap));
        Collection<C15068> values = this.f53779.values();
        ArrayList arrayList2 = new ArrayList(arrayList.size() + values.size() + 1);
        for (C15068 c150682 : values) {
            if (!c150682.m35654()) {
                arrayList2.add(c150682.m35657());
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C15068 c150683 = (C15068) it3.next();
            if (!c150683.m35654()) {
                arrayList2.add(c150683.m35657());
            }
        }
        Collections.sort(arrayList2);
        arrayList2.add(0, "Text");
        arrayList2.trimToSize();
        this.f53784 = C20195.unmodifiableList(arrayList2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C15068 m41136(C17600 c17600, String str) {
        C15068 c15068 = (C15068) c17600.f53782.get(str);
        return c15068 != null ? c15068 : (C15068) c17600.f53779.get(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15068 m41132(C17600 c17600, String str) {
        C15068 c15068 = (C15068) c17600.f53783.get(str);
        return c15068 != null ? c15068 : (C15068) c17600.f53777.get(str);
    }
}
