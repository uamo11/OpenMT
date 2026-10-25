package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: 56MU */
/* renamed from: l.ۙܿܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4792 implements InterfaceC14183, InterfaceC17006 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4844 f15189;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f15190;

    @Override // l.InterfaceC14183
    public final InterfaceC17006 create() {
        return this;
    }

    public C4792(int i) {
        this.f15190 = i * 8;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13978(C4844 c4844) {
        this.f15189 = c4844;
    }

    @Override // l.InterfaceC14183
    /* renamed from: ֫ */
    public final Set mo2897() {
        Object[] objArr = {'$', '\\'};
        HashSet hashSet = new HashSet(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            C11003.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
            }
        }
        return C20195.unmodifiableSet(hashSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x027b, code lost:
    
        if ("+-=*\/^_\\<>$".indexOf(r0.charAt(r5)) >= 0) goto L185;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018f  */
    @Override // l.InterfaceC17006
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C4286 mo10955(l.C23188 r19) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4792.mo10955(l.᩺᩵֡):l.ۙ֡֡");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13977(C20535 c20535, C9246 c9246) {
        Iterator it = c9246.m23718(c20535, c9246.m23724()).m41446().iterator();
        while (it.hasNext()) {
            this.f15190 -= ((C16300) it.next()).m38335().length() + 1;
        }
        c9246.m23719(c20535);
    }
}
