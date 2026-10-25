package l;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: Q8SE */
/* renamed from: l.ᩴᩳۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18924 extends AbstractC0578 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f59618;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f59619;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f59620;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f59621;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f59622;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float f59623;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f59624;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C14185 f59625;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float f59626;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f59627;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC11163 f59628;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f59629;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f59630;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC13257 f59631;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f59632;

    @Override // l.InterfaceC9731
    /* renamed from: ۧ */
    public final Object mo3759() {
        return null;
    }

    public C18924(C13312 c13312, int[] iArr, InterfaceC13257 interfaceC13257, long j, long j2, long j3, AbstractC14545 abstractC14545) {
        super(c13312, iArr);
        if (j3 < j) {
            C19956.m46037("Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.f59631 = interfaceC13257;
        this.f59618 = j * 1000;
        this.f59621 = j2 * 1000;
        this.f59622 = j3 * 1000;
        this.f59630 = 1279;
        this.f59629 = 719;
        this.f59623 = 0.7f;
        this.f59626 = 0.75f;
        this.f59632 = AbstractC14545.copyOf((Collection) abstractC14545);
        this.f59625 = InterfaceC16427.f50519;
        this.f59619 = 1.0f;
        this.f59624 = 0;
        this.f59620 = -9223372036854775807L;
    }

    @Override // l.AbstractC0578, l.InterfaceC9731
    /* renamed from: ܳ */
    public final void mo2386() {
        this.f59620 = -9223372036854775807L;
        this.f59628 = null;
    }

    @Override // l.AbstractC0578, l.InterfaceC9731
    /* renamed from: ᩳ */
    public final void mo2389() {
        this.f59628 = null;
    }

    @Override // l.AbstractC0578, l.InterfaceC9731
    /* renamed from: ֫ */
    public final void mo2378(float f) {
        this.f59619 = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    @Override // l.InterfaceC9731
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3758(long r14, long r16, long r18, java.util.List r20, l.InterfaceC18218[] r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r21
            l.ܳ֨֫ r2 = r0.f59625
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r4 = r0.f59627
            int r5 = r1.length
            if (r4 >= r5) goto L27
            r4 = r1[r4]
            boolean r4 = r4.next()
            if (r4 == 0) goto L27
            int r4 = r0.f59627
            r1 = r1[r4]
            long r4 = r1.mo15261()
            long r6 = r1.mo15260()
        L25:
            long r4 = r4 - r6
            goto L43
        L27:
            int r4 = r1.length
            r5 = 0
        L29:
            if (r5 >= r4) goto L3f
            r6 = r1[r5]
            boolean r7 = r6.next()
            if (r7 == 0) goto L3c
            long r4 = r6.mo15261()
            long r6 = r6.mo15260()
            goto L25
        L3c:
            int r5 = r5 + 1
            goto L29
        L3f:
            long r4 = m43665(r20)
        L43:
            int r1 = r0.f59624
            if (r1 != 0) goto L51
            r1 = 1
            r0.f59624 = r1
            int r1 = r13.m43664(r2, r4)
            r0.f59627 = r1
            return
        L51:
            int r6 = r0.f59627
            boolean r7 = r20.isEmpty()
            r8 = -1
            if (r7 == 0) goto L5c
            r7 = -1
            goto L68
        L5c:
            java.lang.Object r7 = l.C8882.m22955(r20)
            l.ۧᩳۧ r7 = (l.AbstractC11163) r7
            l.۠ᩴ֫ r7 = r7.f23468
            int r7 = r13.m2376(r7)
        L68:
            if (r7 == r8) goto L73
            java.lang.Object r1 = l.C8882.m22955(r20)
            l.ۧᩳۧ r1 = (l.AbstractC11163) r1
            int r1 = r1.f23466
            r6 = r7
        L73:
            int r7 = r13.m43664(r2, r4)
            if (r7 == r6) goto Lba
            boolean r2 = r13.mo2380(r6, r2)
            if (r2 != 0) goto Lba
            l.۠ᩴ֫ r2 = r13.mo2377(r6)
            l.۠ᩴ֫ r3 = r13.mo2377(r7)
            long r8 = r0.f59618
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
            if (r12 != 0) goto L93
            goto La6
        L93:
            int r12 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r12 == 0) goto L9a
            long r4 = r18 - r4
            goto L9c
        L9a:
            r4 = r18
        L9c:
            float r4 = (float) r4
            float r5 = r0.f59626
            float r4 = r4 * r5
            long r4 = (long) r4
            long r8 = java.lang.Math.min(r4, r8)
        La6:
            int r3 = r3.f25627
            int r2 = r2.f25627
            if (r3 <= r2) goto Lb1
            int r4 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r4 >= 0) goto Lb1
            goto Lb9
        Lb1:
            if (r3 >= r2) goto Lba
            long r2 = r0.f59621
            int r4 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r4 < 0) goto Lba
        Lb9:
            r7 = r6
        Lba:
            if (r7 != r6) goto Lbd
            goto Lbe
        Lbd:
            r1 = 3
        Lbe:
            r0.f59624 = r1
            r0.f59627 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18924.mo3758(long, long, long, java.util.List, l.ᩳᩳۧ[]):void");
    }

    @Override // l.InterfaceC9731
    /* renamed from: ֫ */
    public final int mo3757() {
        return this.f59627;
    }

    @Override // l.InterfaceC9731
    /* renamed from: ᩷ */
    public final int mo3760() {
        return this.f59624;
    }

    @Override // l.AbstractC0578, l.InterfaceC9731
    /* renamed from: ֫ */
    public final int mo2375(long j, List list) {
        int i;
        int i2;
        this.f59625.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.f59620;
        if (j2 != -9223372036854775807L && elapsedRealtime - j2 < 1000 && (list.isEmpty() || ((AbstractC11163) C8882.m22955(list)).equals(this.f59628))) {
            return list.size();
        }
        this.f59620 = elapsedRealtime;
        this.f59628 = list.isEmpty() ? null : (AbstractC11163) C8882.m22955(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long m11038 = C3603.m11038(((AbstractC11163) list.get(size - 1)).f23470 - j, this.f59619);
        long j3 = this.f59622;
        if (m11038 >= j3) {
            C8353 mo2377 = mo2377(m43664(elapsedRealtime, m43665(list)));
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC11163 abstractC11163 = (AbstractC11163) list.get(i3);
                C8353 c8353 = abstractC11163.f23468;
                if (C3603.m11038(abstractC11163.f23470 - j, this.f59619) >= j3 && c8353.f25627 < mo2377.f25627 && (i = c8353.f25609) != -1 && i <= this.f59629 && (i2 = c8353.f25633) != -1 && i2 <= this.f59630 && i < mo2377.f25609) {
                    return i3;
                }
            }
        }
        return size;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m43665(List list) {
        if (!list.isEmpty()) {
            AbstractC11163 abstractC11163 = (AbstractC11163) C8882.m22955(list);
            long j = abstractC11163.f23470;
            if (j != -9223372036854775807L) {
                long j2 = abstractC11163.f23469;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m43664(long j, long j2) {
        long mo28945 = (long) (((long) (this.f59631.mo28945() * this.f59623)) / this.f59619);
        AbstractC14545 abstractC14545 = this.f59632;
        if (!abstractC14545.isEmpty()) {
            int i = 1;
            while (i < abstractC14545.size() - 1 && ((C2696) abstractC14545.get(i)).f8438 < mo28945) {
                i++;
            }
            C2696 c2696 = (C2696) abstractC14545.get(i - 1);
            C2696 c26962 = (C2696) abstractC14545.get(i);
            long j3 = c2696.f8438;
            long j4 = c2696.f8437;
            mo28945 = ((long) (((mo28945 - j3) / (c26962.f8438 - j3)) * (c26962.f8437 - j4))) + j4;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f2289; i3++) {
            if (j == Long.MIN_VALUE || !mo2380(i3, j)) {
                if (mo2377(i3).f25627 <= mo28945) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC14545 m43666(C21020[] c21020Arr) {
        int i;
        long j;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            i = 1;
            if (i2 >= c21020Arr.length) {
                break;
            }
            C21020 c21020 = c21020Arr[i2];
            if (c21020 != null && c21020.f67857.length > 1) {
                int i3 = AbstractC14545.f44556;
                C1846 c1846 = new C1846();
                c1846.m16264(new C2696(0L, 0L));
                arrayList.add(c1846);
            } else {
                arrayList.add(null);
            }
            i2++;
        }
        int length = c21020Arr.length;
        long[][] jArr = new long[length][];
        int i4 = 0;
        while (true) {
            j = -1;
            if (i4 >= c21020Arr.length) {
                break;
            }
            C21020 c210202 = c21020Arr[i4];
            if (c210202 != null) {
                int[] iArr = c210202.f67857;
                jArr[i4] = new long[iArr.length];
                for (int i5 = 0; i5 < iArr.length; i5++) {
                    long j2 = c210202.f67856.m32295(iArr[i5]).f25627;
                    long[] jArr2 = jArr[i4];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr2[i5] = j2;
                }
                Arrays.sort(jArr[i4]);
            } else {
                jArr[i4] = new long[0];
            }
            i4++;
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i6 = 0; i6 < length; i6++) {
            long[] jArr4 = jArr[i6];
            jArr3[i6] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        m43667(arrayList, jArr3);
        InterfaceC3237 mo35872 = AbstractC20110.m46369().m49902().mo35872();
        int i7 = 0;
        while (i7 < length) {
            long[] jArr5 = jArr[i7];
            if (jArr5.length > i) {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i8 = 0;
                while (true) {
                    long[] jArr6 = jArr[i7];
                    double d = 0.0d;
                    if (i8 >= jArr6.length) {
                        break;
                    }
                    long j3 = jArr6[i8];
                    if (j3 != j) {
                        d = Math.log(j3);
                    }
                    dArr[i8] = d;
                    i8++;
                }
                int i9 = length2 - 1;
                double d2 = dArr[i9] - dArr[0];
                int i10 = 0;
                while (i10 < i9) {
                    double d3 = dArr[i10];
                    i10++;
                    mo35872.put(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i10]) * 0.5d) - dArr[0]) / d2), Integer.valueOf(i7));
                }
            }
            i7++;
            i = 1;
            j = -1;
        }
        AbstractC14545 copyOf = AbstractC14545.copyOf(mo35872.values());
        for (int i11 = 0; i11 < copyOf.size(); i11++) {
            int intValue = ((Integer) copyOf.get(i11)).intValue();
            int i12 = iArr2[intValue] + 1;
            iArr2[intValue] = i12;
            jArr3[intValue] = jArr[intValue][i12];
            m43667(arrayList, jArr3);
        }
        for (int i13 = 0; i13 < c21020Arr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr3[i13] = jArr3[i13] * 2;
            }
        }
        m43667(arrayList, jArr3);
        C1846 c18462 = new C1846();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            C1846 c18463 = (C1846) arrayList.get(i14);
            c18462.m16264(c18463 == null ? AbstractC14545.of() : c18463.m6131());
        }
        return c18462.m6131();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43667(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C1846 c1846 = (C1846) arrayList.get(i);
            if (c1846 != null) {
                c1846.m16264(new C2696(j, jArr[i]));
            }
        }
    }
}
