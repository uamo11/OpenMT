package l;

import java.util.Arrays;

/* compiled from: XAQ1 */
/* renamed from: l.ۧ᩻֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11320 extends AbstractC16466 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC16466[] f33881;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f33882;

    public C11320(C8000 c8000) {
        this(new AbstractC16466[]{c8000.f24706}, new int[]{c8000.f24707});
    }

    @Override // l.AbstractC16466
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo27960() {
        return this.f33882[0] == Integer.MAX_VALUE;
    }

    @Override // l.AbstractC16466
    /* renamed from: ܽ */
    public final int mo21317() {
        return this.f33882.length;
    }

    @Override // l.AbstractC16466
    /* renamed from: ֫ */
    public final AbstractC16466 mo21315(int i) {
        return this.f33881[i];
    }

    @Override // l.AbstractC16466
    /* renamed from: ۧ */
    public final int mo21316(int i) {
        return this.f33882[i];
    }

    @Override // l.AbstractC16466
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11320)) {
            return false;
        }
        if (this.f50608 != ((AbstractC16466) obj).f50608) {
            return false;
        }
        C11320 c11320 = (C11320) obj;
        return Arrays.equals(this.f33882, c11320.f33882) && Arrays.equals(this.f33881, c11320.f33881);
    }

    public final String toString() {
        if (mo27960()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            int[] iArr = this.f33882;
            if (i < iArr.length) {
                if (i > 0) {
                    sb.append(", ");
                }
                int i2 = iArr[i];
                if (i2 == Integer.MAX_VALUE) {
                    sb.append("$");
                } else {
                    sb.append(i2);
                    AbstractC16466[] abstractC16466Arr = this.f33881;
                    if (abstractC16466Arr[i] != null) {
                        sb.append(' ');
                        sb.append(abstractC16466Arr[i].toString());
                    } else {
                        sb.append("null");
                    }
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C11320(l.AbstractC16466[] r6, int[] r7) {
        /*
            r5 = this;
            int r0 = r6.length
            r1 = 1
            r2 = 0
            r3 = 0
        L4:
            if (r3 >= r0) goto Lf
            r4 = r6[r3]
            int r1 = l.C2093.m6874(r1, r4)
            int r3 = r3 + 1
            goto L4
        Lf:
            int r0 = r7.length
        L10:
            if (r2 >= r0) goto L1b
            r3 = r7[r2]
            int r1 = l.C2093.m6876(r1, r3)
            int r2 = r2 + 1
            goto L10
        L1b:
            int r0 = r6.length
            int r0 = r0 * 2
            int r0 = l.C2093.m6873(r1, r0)
            r5.<init>(r0)
            r5.f33881 = r6
            r5.f33882 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11320.<init>(l.ܽۜ֡[], int[]):void");
    }
}
