package l;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: B6N7 */
/* renamed from: l.ܶۜ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15054 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22336[] f45945 = new C22336[16];

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean[] f45944 = new boolean[16];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C22336[] f45943 = new C22336[16];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m35591(EnumC23522 enumC23522, C13163 c13163) {
        int i;
        C22336[] c22336Arr;
        C22336 c22336;
        ArrayList arrayList = c13163.f39354;
        if (EnumC23522.m51951(c13163)) {
            return true;
        }
        if (enumC23522 == EnumC23522.SLL && c13163.f39356) {
            return EnumC23522.m51952(enumC23522, c13163);
        }
        int size = arrayList.size();
        int highestOneBit = size <= 8 ? 16 : Integer.highestOneBit(size - 1) << 2;
        if (highestOneBit > this.f45945.length) {
            this.f45945 = new C22336[highestOneBit];
            this.f45944 = new boolean[highestOneBit];
        }
        int i2 = highestOneBit - 1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            try {
                C22336 c223362 = (C22336) arrayList.get(i3);
                int i5 = c223362.f72393.f74153;
                int i6 = (i5 >>> 16) ^ i5;
                while (true) {
                    i = i6 & i2;
                    c22336Arr = this.f45945;
                    c22336 = c22336Arr[i];
                    if (c22336 == null || c22336.f72393.f74153 == i5) {
                        break;
                    }
                    i6 = i + 1;
                }
                if (c22336 == null) {
                    c22336Arr[i] = c223362;
                    this.f45944[i] = false;
                    i4++;
                } else {
                    boolean[] zArr = this.f45944;
                    if (!zArr[i] && c22336.f72390 != c223362.f72390) {
                        zArr[i] = true;
                        i4--;
                    }
                }
                i3++;
            } finally {
            }
            Arrays.fill(this.f45945, 0, highestOneBit, (Object) null);
            C22336[] c22336Arr2 = this.f45943;
            Arrays.fill(c22336Arr2, 0, Math.min(highestOneBit, c22336Arr2.length), (Object) null);
        }
        if (i4 != 0) {
            return false;
        }
        if (highestOneBit > this.f45943.length) {
            this.f45943 = new C22336[highestOneBit];
        }
        for (int i7 = 0; i7 < size; i7++) {
            C22336 c223363 = (C22336) arrayList.get(i7);
            int i8 = (c223363.f72393.f74153 * 31) + c223363.f72391.f50608;
            int i9 = i8 ^ (i8 >>> 16);
            while (true) {
                int i10 = i9 & i2;
                C22336[] c22336Arr3 = this.f45943;
                C22336 c223364 = c22336Arr3[i10];
                if (c223364 == null) {
                    c22336Arr3[i10] = c223363;
                    break;
                }
                if (c223364.f72393.f74153 == c223363.f72393.f74153 && c223364.f72391.equals(c223363.f72391)) {
                    if (c223364.f72390 != c223363.f72390) {
                        return true;
                    }
                } else {
                    i9 = i10 + 1;
                }
            }
        }
        return false;
    }
}
