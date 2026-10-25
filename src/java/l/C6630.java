package l;

import java.lang.reflect.Array;

/* compiled from: 57RJ */
/* renamed from: l.ۜ۠֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6630 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1691 f20400;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int[] f20401 = new int[6];

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[][] f20402;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f20403;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[][] f20404;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f20405;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[][] f20406;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f20407;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f20408;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m18158() {
        int i = this.f20408 + 1;
        this.f20408 = i;
        if (i % 50 == 0) {
            int i2 = this.f20403 + 1;
            this.f20403 = i2;
            byte[] bArr = this.f20407;
            if (i2 == bArr.length) {
                throw new C23563("Error decoding BZip2 block");
            }
            this.f20405 = bArr[i2] & 255;
        }
        int i3 = this.f20405;
        int[] iArr = this.f20404[i3];
        int i4 = this.f20401[i3];
        C1691 c1691 = this.f20400;
        int m5702 = c1691.m5702(i4);
        while (i4 <= 23) {
            if (m5702 <= iArr[i4]) {
                return this.f20406[i3][m5702 - this.f20402[i3][i4]];
            }
            m5702 = (m5702 << 1) | c1691.m5702(1);
            i4++;
        }
        throw new C23563("Error decoding BZip2 block");
    }

    public C6630(C1691 c1691, int i, byte[][] bArr, byte[] bArr2) {
        Class cls = Integer.TYPE;
        this.f20402 = (int[][]) Array.newInstance((Class<?>) cls, 6, 25);
        this.f20404 = (int[][]) Array.newInstance((Class<?>) cls, 6, 24);
        this.f20406 = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
        this.f20403 = -1;
        this.f20408 = -1;
        this.f20400 = c1691;
        this.f20407 = bArr2;
        this.f20405 = bArr2[0];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int[] iArr = this.f20402[i2];
            int[] iArr2 = this.f20404[i2];
            int[] iArr3 = this.f20406[i2];
            byte[] bArr3 = bArr[i2];
            int i3 = 23;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 = Math.max((int) bArr3[i5], i4);
                i3 = Math.min((int) bArr3[i5], i3);
            }
            this.f20401[i2] = i3;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = bArr3[i6] + 1;
                iArr[i7] = iArr[i7] + 1;
            }
            for (int i8 = 1; i8 < 25; i8++) {
                iArr[i8] = iArr[i8] + iArr[i8 - 1];
            }
            int i9 = 0;
            int i10 = i3;
            while (i10 <= i4) {
                int i11 = i10 + 1;
                int i12 = iArr[i11];
                int i13 = iArr[i10];
                int i14 = (i12 - i13) + i9;
                iArr[i10] = i9 - i13;
                iArr2[i10] = i14 - 1;
                i9 = i14 << 1;
                i10 = i11;
            }
            int i15 = 0;
            while (i3 <= i4) {
                for (int i16 = 0; i16 < i; i16++) {
                    if (bArr3[i16] == i3) {
                        iArr3[i15] = i16;
                        i15++;
                    }
                }
                i3++;
            }
        }
    }
}
