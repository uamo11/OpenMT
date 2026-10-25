package l;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: 1AZL */
/* renamed from: l.ۧܿۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11135 extends AbstractSet {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23834 f33416;

    public C11135(C23834 c23834) {
        this.f33416 = c23834;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f33416.f77120;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1962(this.f33416);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L29
            l.᩻ܿۖ r0 = r4.f33416
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r2 = r5.getKey()
            r3 = 0
            if (r2 == 0) goto L15
            l.ܳܿۖ r0 = r0.m52529(r2, r1)     // Catch: java.lang.ClassCastException -> L15
            goto L16
        L15:
            r0 = r3
        L16:
            if (r0 == 0) goto L25
            java.lang.Object r2 = r0.f44806
            java.lang.Object r5 = r5.getValue()
            boolean r5 = l.C11003.equals(r2, r5)
            if (r5 == 0) goto L25
            r3 = r0
        L25:
            if (r3 == 0) goto L29
            r5 = 1
            return r5
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11135.contains(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L6
            goto L28
        L6:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r0 = r6.getKey()
            l.᩻ܿۖ r2 = r5.f33416
            r3 = 0
            if (r0 == 0) goto L16
            l.ܳܿۖ r0 = r2.m52529(r0, r1)     // Catch: java.lang.ClassCastException -> L16
            goto L17
        L16:
            r0 = r3
        L17:
            if (r0 == 0) goto L26
            java.lang.Object r4 = r0.f44806
            java.lang.Object r6 = r6.getValue()
            boolean r6 = l.C11003.equals(r4, r6)
            if (r6 == 0) goto L26
            r3 = r0
        L26:
            if (r3 != 0) goto L29
        L28:
            return r1
        L29:
            r6 = 1
            r2.m52530(r3, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11135.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f33416.clear();
    }
}
