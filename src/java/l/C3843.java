package l;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Q6ZO */
/* renamed from: l.ۘۡܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3843 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f12277 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f12276 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11596(C21834 c21834) {
        HashMap hashMap = this.f12276;
        if (hashMap.containsKey(c21834)) {
            return;
        }
        ArrayList arrayList = this.f12277;
        hashMap.put(c21834, Integer.valueOf(arrayList.size()));
        arrayList.add(c21834);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m11593() {
        return this.f12277.size();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 m11595(int i) {
        return (C21834) this.f12277.get(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m11594(C21834 c21834) {
        Integer num = (Integer) this.f12276.get(c21834);
        C11003.requireNonNull(num);
        return num.intValue();
    }
}
