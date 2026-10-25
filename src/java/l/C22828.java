package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: JBHC */
/* renamed from: l.᩺ۜܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22828 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f73699 = new HashMap(50);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50938(AbstractC5895 abstractC5895) {
        for (AbstractC2368 abstractC2368 : abstractC5895.mo6834()) {
            String mo2463 = abstractC2368.mo2862().mo2463();
            HashMap hashMap = this.f73699;
            C11540 c11540 = (C11540) hashMap.get(mo2463);
            if (c11540 == null) {
                hashMap.put(mo2463, new C11540(abstractC2368, mo2463));
            } else {
                c11540.m28416(abstractC2368);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50939(C18241 c18241) {
        String str;
        HashMap hashMap = this.f73699;
        if (hashMap.size() == 0) {
            return;
        }
        c18241.m42501(0, "\nstatistics:\n");
        TreeMap treeMap = new TreeMap();
        for (C11540 c11540 : hashMap.values()) {
            str = c11540.f34459;
            treeMap.put(str, c11540);
        }
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            ((C11540) it.next()).m28417(c18241);
        }
    }
}
