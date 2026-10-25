package l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: 18TA */
/* renamed from: l.ܰۗ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13543 extends AbstractC19042 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f40423;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f40424;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Object[] f40425;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f40426;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f40427;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC4846[] f40428;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int[] f40429;

    public C13543(AbstractC4846[] abstractC4846Arr, Object[] objArr, InterfaceC1242 interfaceC1242) {
        super(interfaceC1242);
        int length = abstractC4846Arr.length;
        this.f40428 = abstractC4846Arr;
        this.f40426 = new int[length];
        this.f40429 = new int[length];
        this.f40425 = objArr;
        this.f40427 = new HashMap();
        int length2 = abstractC4846Arr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length2) {
            AbstractC4846 abstractC4846 = abstractC4846Arr[i];
            this.f40428[i4] = abstractC4846;
            this.f40429[i4] = i2;
            this.f40426[i4] = i3;
            i2 += abstractC4846.mo14107();
            i3 += this.f40428[i4].mo14095();
            this.f40427.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.f40424 = i2;
        this.f40423 = i3;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List m32592() {
        return Arrays.asList(this.f40428);
    }

    @Override // l.AbstractC19042
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo32586(int i) {
        return C3603.m11011(this.f40426, i + 1, false, false);
    }

    @Override // l.AbstractC19042
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo32589(int i) {
        return C3603.m11011(this.f40429, i + 1, false, false);
    }

    @Override // l.AbstractC19042
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo32587(Object obj) {
        Integer num = (Integer) this.f40427.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // l.AbstractC19042
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC4846 mo32593(int i) {
        return this.f40428[i];
    }

    @Override // l.AbstractC19042
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int mo32590(int i) {
        return this.f40426[i];
    }

    @Override // l.AbstractC19042
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int mo32588(int i) {
        return this.f40429[i];
    }

    @Override // l.AbstractC19042
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object mo32591(int i) {
        return this.f40425[i];
    }

    @Override // l.AbstractC4846
    /* renamed from: ۧ */
    public final int mo14107() {
        return this.f40424;
    }

    @Override // l.AbstractC4846
    /* renamed from: ֫ */
    public final int mo14095() {
        return this.f40423;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13543 m32585(InterfaceC1242 interfaceC1242) {
        AbstractC4846[] abstractC4846Arr = this.f40428;
        AbstractC4846[] abstractC4846Arr2 = new AbstractC4846[abstractC4846Arr.length];
        for (int i = 0; i < abstractC4846Arr.length; i++) {
            abstractC4846Arr2[i] = new C22716(abstractC4846Arr[i]);
        }
        return new C13543(abstractC4846Arr2, this.f40425, interfaceC1242);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C13543(java.util.List r7, l.InterfaceC1242 r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            l.ۙ᩵֫[] r0 = new l.AbstractC4846[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = 0
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            l.᩷ۗ֫ r4 = (l.InterfaceC20600) r4
            int r5 = r3 + 1
            l.ۙ᩵֫ r4 = r4.mo22411()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            l.᩷ۗ֫ r3 = (l.InterfaceC20600) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.getUid()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13543.<init>(java.util.List, l.֨ܽۧ):void");
    }
}
