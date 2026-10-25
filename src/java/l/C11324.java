package l;

import java.util.Arrays;
import java.util.BitSet;

/* compiled from: 01MV */
/* renamed from: l.ۧ᩻ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11324 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[][] f33891 = new int[2][];

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f33892 = {-1, -1};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f33890 = {-1, -1};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[][] m27974(int[] iArr, int[] iArr2) {
        int[] m27972 = m27972(0, iArr2, iArr);
        return new int[][]{m27972, m27972(1, m27972, iArr2)};
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int[] m27972(int i, int[] iArr, int[] iArr2) {
        this.f33892[i] = iArr2.length;
        int[] iArr3 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        Arrays.sort(iArr3);
        C15859 c15859 = new C15859(iArr2.length);
        C15859 c158592 = new C15859(iArr2.length);
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            int i3 = iArr2[i2];
            if (Arrays.binarySearch(iArr3, i3) >= 0) {
                c15859.add(i3);
                c158592.add(i2);
            }
        }
        this.f33891[i] = c158592.mo3586();
        this.f33890[i] = c15859.size();
        return c15859.mo3586();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        r13.m28784(r6 - r2);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m27973(java.util.BitSet[] r12, l.C11757 r13) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11324.m27973(java.util.BitSet[], l.ۨܳۘ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m27971(int[] iArr, int i, BitSet bitSet, int i2) {
        int i3 = i + 1;
        if (i3 < iArr.length) {
            bitSet.set(iArr[i] + 1, iArr[i3]);
            return i3;
        }
        bitSet.set(iArr[i] + 1, i2);
        return i3;
    }
}
