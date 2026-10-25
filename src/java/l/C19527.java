package l;

import java.util.HashSet;

/* compiled from: TBAU */
/* renamed from: l.᩵ܳܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19527 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19611 f63098;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13012 f63099;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f63100;

    public C19527(C13012 c13012, int[] iArr, C19611 c19611) {
        if (iArr == null) {
            throw new NullPointerException("order == null");
        }
        if (c19611 == null) {
            throw new NullPointerException("addresses == null");
        }
        this.f63099 = c13012;
        this.f63100 = iArr;
        this.f63098 = c19611;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m44932() {
        C17246 m31591 = this.f63099.m31591();
        int size = m31591.size();
        for (int i = 0; i < size; i++) {
            if (m31591.m41002get(i).m38915().mo3533().size() != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet m44931() {
        HashSet hashSet = new HashSet(20);
        C17246 m31591 = this.f63099.m31591();
        int size = m31591.size();
        for (int i = 0; i < size; i++) {
            InterfaceC10711 mo3533 = m31591.m41002get(i).m38915().mo3533();
            int size2 = mo3533.size();
            for (int i2 = 0; i2 < size2; i2++) {
                hashSet.add(mo3533.getType(i2));
            }
        }
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
    
        throw new java.lang.RuntimeException("shouldn't happen: weird successors list");
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C8321 m44930() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19527.m44930():l.۠ܿܺ");
    }
}
