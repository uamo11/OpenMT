package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: N97D */
/* renamed from: l.᩶᩷ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20423 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f65887 = new ArrayList();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f65888 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46829(C21834 c21834) {
        HashMap hashMap = this.f65888;
        if (hashMap.containsKey(c21834)) {
            return;
        }
        hashMap.put(c21834, Integer.valueOf(hashMap.size()));
        this.f65887.add(c21834);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m46825(C21834 c21834) {
        Integer num = (Integer) this.f65888.get(c21834);
        C11003.requireNonNull(num);
        return num.intValue();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46827(C10130 c10130) {
        ArrayList arrayList = this.f65887;
        c10130.m25441(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C21834) it.next()).m49204(c10130);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46828(C12951 c12951) {
        int m31493 = c12951.m31493();
        ArrayList arrayList = this.f65887;
        arrayList.ensureCapacity(m31493);
        for (int i = 0; i < m31493; i++) {
            arrayList.add(C21834.m49199(c12951));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 m46826(int i) {
        return (C21834) this.f65887.get(i);
    }
}
