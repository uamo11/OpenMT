package l;

import java.util.List;

/* compiled from: I8HK */
/* renamed from: l.۫ۘۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12161 implements InterfaceC13571 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final AbstractC10232 f36277 = AbstractC10232.m25861().m25866(new C4248(6));

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f36278;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long[] f36279;

    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12161(java.util.List r19) {
        /*
            r18 = this;
            r0 = r18
            r18.<init>()
            int r1 = r19.size()
            r2 = 2
            r3 = 0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r1 != r6) goto L4a
            java.lang.Object r1 = l.C8882.m22950(r19)
            l.۬ۘۧ r1 = (l.C12866) r1
            long r7 = r1.f38639
            l.ܳ۬ܺ r9 = r1.f38636
            long r10 = r1.f38637
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L25
            r7 = 0
        L25:
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 != 0) goto L36
            l.ܳ۬ܺ r1 = l.AbstractC14545.of(r9)
            r0.f36278 = r1
            long[] r1 = new long[r6]
            r1[r3] = r7
            r0.f36279 = r1
            return
        L36:
            l.ܳ۬ܺ r1 = l.AbstractC14545.of()
            l.ܳ۬ܺ r1 = l.AbstractC14545.of(r9, r1)
            r0.f36278 = r1
            long r10 = r10 + r7
            long[] r1 = new long[r2]
            r1[r3] = r7
            r1[r6] = r10
            r0.f36279 = r1
            return
        L4a:
            int r1 = r19.size()
            int r1 = r1 * 2
            long[] r1 = new long[r1]
            r0.f36279 = r1
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.Arrays.fill(r1, r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            l.ۤۤܺ r2 = l.C12161.f36277
            r6 = r19
            l.ܳ۬ܺ r2 = l.AbstractC14545.m34731(r2, r6)
            r6 = 0
        L6a:
            int r7 = r2.size()
            if (r3 >= r7) goto Lcf
            java.lang.Object r7 = r2.get(r3)
            l.۬ۘۧ r7 = (l.C12866) r7
            long r8 = r7.f38639
            long r10 = r7.f38637
            l.ܳ۬ܺ r7 = r7.f38636
            int r12 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r12 != 0) goto L82
            r8 = 0
        L82:
            long r12 = r8 + r10
            if (r6 == 0) goto Lb0
            long[] r14 = r0.f36279
            int r15 = r6 + (-1)
            r16 = r14[r15]
            int r14 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r14 >= 0) goto L91
            goto Lb0
        L91:
            if (r14 != 0) goto La3
            java.lang.Object r14 = r1.get(r15)
            l.ܳ۬ܺ r14 = (l.AbstractC14545) r14
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto La3
            r1.set(r15, r7)
            goto Lba
        La3:
            java.lang.String r14 = "Truncating unsupported overlapping cues."
            l.C19956.m46037(r14)
            long[] r14 = r0.f36279
            r14[r15] = r8
            r1.set(r15, r7)
            goto Lba
        Lb0:
            long[] r14 = r0.f36279
            int r15 = r6 + 1
            r14[r6] = r8
            r1.add(r7)
            r6 = r15
        Lba:
            int r7 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r7 == 0) goto Lcc
            long[] r7 = r0.f36279
            int r8 = r6 + 1
            r7[r6] = r12
            l.ܳ۬ܺ r6 = l.AbstractC14545.of()
            r1.add(r6)
            r6 = r8
        Lcc:
            int r3 = r3 + 1
            goto L6a
        Lcf:
            l.ܳ۬ܺ r1 = l.AbstractC14545.copyOf(r1)
            r0.f36278 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12161.<init>(java.util.List):void");
    }

    @Override // l.InterfaceC13571
    /* renamed from: ֫ */
    public final int mo4659(long j) {
        int m11012 = C3603.m11012(this.f36279, j, false);
        if (m11012 < this.f36278.size()) {
            return m11012;
        }
        return -1;
    }

    @Override // l.InterfaceC13571
    /* renamed from: ֫ */
    public final int mo4658() {
        return this.f36278.size();
    }

    @Override // l.InterfaceC13571
    /* renamed from: ֫ */
    public final long mo4660(int i) {
        C22632.m50631(i < this.f36278.size());
        return this.f36279[i];
    }

    @Override // l.InterfaceC13571
    /* renamed from: ܽ */
    public final List mo4661(long j) {
        int m11036 = C3603.m11036(this.f36279, j, false);
        return m11036 == -1 ? AbstractC14545.of() : (AbstractC14545) this.f36278.get(m11036);
    }
}
