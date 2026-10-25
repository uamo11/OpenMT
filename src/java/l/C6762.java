package l;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: C6PQ */
/* renamed from: l.ۜ۫ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6762 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C22336[] f21000 = new C22336[16];

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f21001 = new int[16];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m18412(C13163 c13163) {
        ArrayList arrayList = c13163.f39354;
        int size = arrayList.size();
        int highestOneBit = size <= 8 ? 16 : Integer.highestOneBit(size - 1) << 2;
        if (highestOneBit > this.f21000.length) {
            this.f21000 = new C22336[highestOneBit];
            this.f21001 = new int[highestOneBit];
        }
        int i = highestOneBit - 1;
        for (int i2 = 0; i2 < size; i2++) {
            try {
                C22336 c22336 = (C22336) arrayList.get(i2);
                AbstractC23041 abstractC23041 = c22336.f72393;
                int i3 = c22336.f72390;
                int i4 = (abstractC23041.f74153 * 31) + c22336.f72391.f50608;
                int i5 = i4 ^ (i4 >>> 16);
                while (true) {
                    int i6 = i5 & i;
                    C22336[] c22336Arr = this.f21000;
                    C22336 c223362 = c22336Arr[i6];
                    if (c223362 == null) {
                        c22336Arr[i6] = c22336;
                        this.f21001[i6] = i3;
                        break;
                    }
                    if (c223362.f72393.f74153 == c22336.f72393.f74153 && c223362.f72391.equals(c22336.f72391)) {
                        int[] iArr = this.f21001;
                        iArr[i6] = Math.min(iArr[i6], i3);
                        break;
                    }
                    i5 = i6 + 1;
                }
            } catch (Throwable th) {
                Arrays.fill(this.f21000, 0, highestOneBit, (Object) null);
                throw th;
            }
        }
        int i7 = 0;
        for (int i8 = 0; i8 < highestOneBit; i8++) {
            C22336[] c22336Arr2 = this.f21000;
            if (c22336Arr2[i8] != null) {
                if (i7 == 0) {
                    i7 = this.f21001[i8];
                } else if (i7 != this.f21001[i8]) {
                    Arrays.fill(c22336Arr2, 0, highestOneBit, (Object) null);
                    return 0;
                }
            }
        }
        Arrays.fill(this.f21000, 0, highestOneBit, (Object) null);
        return i7;
    }
}
