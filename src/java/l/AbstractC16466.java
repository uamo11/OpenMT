package l;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: LAS4 */
/* renamed from: l.ܽۜ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC16466 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f50607 = new AtomicInteger();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f50608;

    public abstract boolean equals(Object obj);

    /* renamed from: ֫ */
    public abstract AbstractC16466 mo21315(int i);

    /* renamed from: ۧ */
    public abstract int mo21316(int i);

    /* renamed from: ܽ */
    public abstract int mo21317();

    public AbstractC16466(int i) {
        f50607.getAndIncrement();
        this.f50608 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8000 m38769(C21631 c21631, C19515 c19515) {
        if (c19515 == null) {
            c19515 = C8931.f27153;
        }
        C8931 c8931 = c19515.f63075;
        if (c8931 == null || c19515 == C8931.f27153) {
            return C21198.f68319;
        }
        C21198 c21198 = C21198.f68319;
        return C8000.m21314(m38769(c21631, c8931), ((C8706) ((AbstractC23041) c21631.f69449.get(c19515.f63074)).m51211(0)).f26506.f74153);
    }

    /* renamed from: ۧ */
    public boolean mo27960() {
        return this == C21198.f68319;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m38772() {
        return mo21316(mo21317() - 1) == Integer.MAX_VALUE;
    }

    public final int hashCode() {
        return this.f50608;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r1 == r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.AbstractC16466 m38770(l.AbstractC16466 r18, l.AbstractC16466 r19, boolean r20, l.C11237 r21) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC16466.m38770(l.ܽۜ֡, l.ܽۜ֡, boolean, l.ۧ᩷֡):l.ܽۜ֡");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC16466 m38771(AbstractC16466 abstractC16466, C17878 c17878, IdentityHashMap identityHashMap) {
        AbstractC16466 c11320;
        if (abstractC16466.mo27960()) {
            return abstractC16466;
        }
        AbstractC16466 abstractC164662 = (AbstractC16466) identityHashMap.get(abstractC16466);
        if (abstractC164662 != null) {
            return abstractC164662;
        }
        AbstractC16466 m41846 = c17878.m41846(abstractC16466);
        HashMap hashMap = c17878.f54599;
        if (m41846 != null) {
            identityHashMap.put(abstractC16466, m41846);
            return m41846;
        }
        AbstractC16466[] abstractC16466Arr = new AbstractC16466[abstractC16466.mo21317()];
        boolean z = false;
        for (int i = 0; i < abstractC16466Arr.length; i++) {
            AbstractC16466 m38771 = m38771(abstractC16466.mo21315(i), c17878, identityHashMap);
            if (z || m38771 != abstractC16466.mo21315(i)) {
                if (!z) {
                    abstractC16466Arr = new AbstractC16466[abstractC16466.mo21317()];
                    for (int i2 = 0; i2 < abstractC16466.mo21317(); i2++) {
                        abstractC16466Arr[i2] = abstractC16466.mo21315(i2);
                    }
                    z = true;
                }
                abstractC16466Arr[i] = m38771;
            }
        }
        if (!z) {
            if (abstractC16466 != C21198.f68319 && ((AbstractC16466) hashMap.get(abstractC16466)) == null) {
                hashMap.put(abstractC16466, abstractC16466);
            }
            identityHashMap.put(abstractC16466, abstractC16466);
            return abstractC16466;
        }
        if (abstractC16466Arr.length == 0) {
            c11320 = C21198.f68319;
        } else if (abstractC16466Arr.length == 1) {
            c11320 = C8000.m21314(abstractC16466Arr[0], abstractC16466.mo21316(0));
        } else {
            c11320 = new C11320(abstractC16466Arr, ((C11320) abstractC16466).f33882);
        }
        if (c11320 != C21198.f68319 && ((AbstractC16466) hashMap.get(c11320)) == null) {
            hashMap.put(c11320, c11320);
        }
        identityHashMap.put(c11320, c11320);
        identityHashMap.put(abstractC16466, c11320);
        return c11320;
    }
}
