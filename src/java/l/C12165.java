package l;

import java.util.Arrays;

/* compiled from: 76ZW */
/* renamed from: l.۫ۘܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12165 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC21338 f36282;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int[] f36283;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19927[] f36284;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f36285;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f36286;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f36287;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f36288;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f36289;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f36290;

    public C12165(C2993 c2993, EnumC21338 enumC21338) {
        int i;
        int[] iArr;
        int i2;
        C19927[] c19927Arr;
        int i3;
        i = c2993.f9442;
        this.f36290 = i;
        iArr = c2993.f9440;
        i2 = c2993.f9441;
        int[] copyOf = Arrays.copyOf(iArr, i2);
        this.f36287 = copyOf;
        c19927Arr = c2993.f9439;
        i3 = c2993.f9441;
        this.f36284 = (C19927[]) Arrays.copyOf(c19927Arr, i3);
        this.f36282 = enumC21338;
        int[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length + 1);
        copyOf2[copyOf.length] = 0;
        Arrays.sort(copyOf2);
        int i4 = 0;
        for (int i5 : copyOf2) {
            if (i4 == 0 || copyOf2[i4 - 1] != i5) {
                copyOf2[i4] = i5;
                i4++;
            }
        }
        this.f36286 = Arrays.copyOf(copyOf2, i4);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (C19927 c19927 : this.f36284) {
            i6 = c19927.m45902() != -1 ? i6 + 1 : i6;
            i7 = c19927.m45901() ? i7 + 1 : i7;
            if (c19927.m45899() != EnumC21338.COMPLETE) {
                i8++;
            }
        }
        long[] jArr = new long[i6];
        this.f36288 = new int[i7];
        this.f36283 = new int[i8];
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            C19927[] c19927Arr2 = this.f36284;
            if (i9 >= c19927Arr2.length) {
                break;
            }
            C19927 c199272 = c19927Arr2[i9];
            if (c199272.m45902() != -1) {
                jArr[i10] = (Math.min(this.f36287[i9], this.f36284[i9].m45902()) << 32) | (i9 & 4294967295L);
                i10++;
            }
            if (c199272.m45901()) {
                this.f36288[i11] = i9;
                i11++;
            }
            if (c199272.m45899() != EnumC21338.COMPLETE) {
                this.f36283[i12] = i9;
                i12++;
            }
            i9++;
        }
        Arrays.sort(jArr);
        this.f36289 = new int[i10];
        this.f36285 = new int[i10];
        for (int i13 = 0; i13 < i10; i13++) {
            this.f36289[i13] = (int) jArr[i13];
        }
        m29617(0, i10);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m29617(int i, int i2) {
        if (i == i2) {
            return -1;
        }
        int i3 = (i + i2) >>> 1;
        int i4 = this.f36289[i3];
        int max = Math.max(Math.max(Math.max(this.f36287[i4], this.f36284[i4].m45895()), m29617(i, i3)), m29617(i3 + 1, i2));
        this.f36285[i3] = max;
        return max;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m29621(C12165 c12165, int i) {
        return Math.min(c12165.f36287[i], c12165.f36284[i].m45902());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m29618(C12165 c12165, int i) {
        return Math.max(c12165.f36287[i], c12165.f36284[i].m45895());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m29630() {
        return this.f36290;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m29628() {
        return this.f36284.length;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m29633(int i) {
        return this.f36287[i];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19927 m29631(int i) {
        return this.f36284[i];
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m29632(int i) {
        C11003.checkFromToIndex(i, i, this.f36290);
        int[] iArr = this.f36286;
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return iArr[binarySearch];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m29629(int i) {
        C11003.checkFromToIndex(i, i, this.f36290);
        int[] iArr = this.f36286;
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        if (binarySearch < iArr.length) {
            return iArr[binarySearch];
        }
        return -1;
    }
}
