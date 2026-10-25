package l;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: D77D */
/* renamed from: l.۫᩸ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12681 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C4920 f38196 = new C4920();

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ed, code lost:
    
        if (r5 <= r7) goto L45;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List m30954(java.util.ArrayList r12) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12681.m30954(java.util.ArrayList):java.util.List");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m30953(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashMap linkedHashMap) {
        Iterator it = linkedHashSet.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((C13902) it.next()).f41429;
        }
        Iterator it2 = linkedHashSet2.iterator();
        while (it2.hasNext()) {
            C13902 c13902 = (C13902) it2.next();
            Set set = (Set) linkedHashMap.get(c13902);
            int i = 1;
            if (set != null) {
                i = Math.max(1, set.size());
            }
            j += c13902.f41429 * i;
        }
        return j;
    }
}
