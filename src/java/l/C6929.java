package l;

import java.util.ArrayList;

/* compiled from: C8UT */
/* renamed from: l.ۜᩳۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6929 implements InterfaceC17512 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f21391 = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // l.InterfaceC17512
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo18737(l.C12866 r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f38639
            r2 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto Le
            r5 = 1
            goto Lf
        Le:
            r5 = 0
        Lf:
            l.C22632.m50631(r5)
            int r5 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r5 > 0) goto L22
            long r5 = r10.f38638
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L20
            int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r3 >= 0) goto L22
        L20:
            r3 = 1
            goto L23
        L22:
            r3 = 0
        L23:
            java.util.ArrayList r4 = r9.f21391
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L2b:
            if (r5 < 0) goto L4f
            java.lang.Object r6 = r4.get(r5)
            l.۬ۘۧ r6 = (l.C12866) r6
            long r6 = r6.f38639
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 < 0) goto L3f
            int r5 = r5 + 1
            r4.add(r5, r10)
            return r3
        L3f:
            java.lang.Object r6 = r4.get(r5)
            l.۬ۘۧ r6 = (l.C12866) r6
            long r6 = r6.f38639
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r8 > 0) goto L4c
            r3 = 0
        L4c:
            int r5 = r5 + (-1)
            goto L2b
        L4f:
            r4.add(r2, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6929.mo18737(l.۬ۘۧ, long):boolean");
    }

    @Override // l.InterfaceC17512
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 mo18736(long j) {
        int m18735 = m18735(j);
        if (m18735 == 0) {
            return AbstractC14545.of();
        }
        C12866 c12866 = (C12866) this.f21391.get(m18735 - 1);
        long j2 = c12866.f38638;
        if (j2 == -9223372036854775807L || j < j2) {
            return c12866.f38636;
        }
        return AbstractC14545.of();
    }

    @Override // l.InterfaceC17512
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo18740(long j) {
        int m18735 = m18735(j);
        if (m18735 == 0) {
            return;
        }
        ArrayList arrayList = this.f21391;
        long j2 = ((C12866) arrayList.get(m18735 - 1)).f38638;
        if (j2 == -9223372036854775807L || j2 >= j) {
            m18735--;
        }
        arrayList.subList(0, m18735).clear();
    }

    @Override // l.InterfaceC17512
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long mo18738(long j) {
        ArrayList arrayList = this.f21391;
        if (arrayList.isEmpty() || j < ((C12866) arrayList.get(0)).f38639) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((C12866) arrayList.get(i)).f38639;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                C12866 c12866 = (C12866) arrayList.get(i - 1);
                long j3 = c12866.f38638;
                return (j3 == -9223372036854775807L || j3 > j) ? c12866.f38639 : j3;
            }
        }
        C12866 c128662 = (C12866) C8882.m22955(arrayList);
        long j4 = c128662.f38638;
        return (j4 == -9223372036854775807L || j < j4) ? c128662.f38639 : j4;
    }

    @Override // l.InterfaceC17512
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long mo18739(long j) {
        ArrayList arrayList = this.f21391;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((C12866) arrayList.get(0)).f38639) {
            return ((C12866) arrayList.get(0)).f38639;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            C12866 c12866 = (C12866) arrayList.get(i);
            long j2 = c12866.f38639;
            long j3 = c12866.f38639;
            if (j < j2) {
                long j4 = ((C12866) arrayList.get(i - 1)).f38638;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((C12866) C8882.m22955(arrayList)).f38638;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    @Override // l.InterfaceC17512
    public final void clear() {
        this.f21391.clear();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m18735(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f21391;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((C12866) arrayList.get(i)).f38639) {
                return i;
            }
            i++;
        }
    }
}
