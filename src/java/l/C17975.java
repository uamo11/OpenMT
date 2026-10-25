package l;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: N6ZQ */
/* renamed from: l.ᩳۢܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17975 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f56065;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15068[] f56066;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f56067;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f56068;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f56069;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long[] f56070;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f56071;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final long[] f56061 = new long[0];

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final long[] f56063 = {0};

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final int[] f56062 = {0};

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f56064 = {-1};

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m41991(int i, int i2) {
        return (i >>> i2) & 255;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static long m42002(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x009f, code lost:
    
        r6 = r2[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00a1, code lost:
    
        if (r6 >= r8) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00a4, code lost:
    
        if (r6 <= r8) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00a6, code lost:
    
        r11 = m41996(r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C17975(int r18, int r19, int[] r20, int[] r21, int[] r22, l.C15068[] r23) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17975.<init>(int, int, int[], int[], int[], l.ܶۜܿ[]):void");
    }

    public C17975(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, C15068[] c15068Arr, long[] jArr) {
        this.f56071 = i;
        this.f56069 = i2;
        this.f56067 = iArr;
        this.f56065 = iArr2;
        this.f56068 = iArr3;
        this.f56066 = c15068Arr;
        this.f56070 = jArr;
    }

    public C17975(int i, C15068 c15068) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative syntax context text length");
        }
        this.f56071 = i;
        this.f56069 = 1;
        this.f56067 = f56062;
        this.f56065 = new int[]{i};
        this.f56068 = f56064;
        C11003.requireNonNull(c15068);
        this.f56066 = new C15068[]{c15068};
        if (i == 0) {
            this.f56070 = f56061;
        } else {
            this.f56070 = f56063;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C17975 m41992(int i, C15068 c15068) {
        return new C17975(i, c15068);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42007(int i, C15068 c15068) {
        return this.f56071 == i && this.f56066[0] == c15068;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m42004() {
        return this.f56069;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m42010() {
        return this.f56071;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m42005(int i) {
        C11003.checkIndex(i, this.f56071);
        return m42016(m42008(i));
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m42008(int i) {
        C11003.checkIndex(i, this.f56071);
        long[] jArr = this.f56070;
        int length = jArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            if (((int) (jArr[i3] >>> 32)) <= i) {
                i2 = i3 + 1;
            } else {
                length = i3 - 1;
            }
        }
        if (length >= 0) {
            return length;
        }
        throw new IllegalStateException("Syntax context tree does not cover the offset");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m42006(int i, int i2) {
        int[] iArr;
        C11003.checkFromToIndex(i, i2, this.f56071);
        if (i == i2) {
            throw new IllegalArgumentException("Empty syntax context range");
        }
        int m42008 = m42008(i);
        int m42016 = m42016(m42008);
        do {
            m42008++;
            if (m42008 >= this.f56070.length || m42009(m42008) >= i2) {
                break;
            }
            int m420162 = m42016(m42008);
            int m42011 = m42011(m42016);
            int m420112 = m42011(m420162);
            while (true) {
                iArr = this.f56068;
                if (m42011 <= m420112) {
                    break;
                }
                m42016 = iArr[m42016];
                m42011--;
            }
            while (m420112 > m42011) {
                m420162 = iArr[m420162];
                m420112--;
            }
            while (m42016 != m420162) {
                m42016 = iArr[m42016];
                m420162 = iArr[m420162];
            }
        } while (m42016 != 0);
        return m42016;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m42009(int i) {
        long[] jArr = this.f56070;
        return (int) (jArr[C11003.checkIndex(i, jArr.length)] >>> 32);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m42016(int i) {
        long[] jArr = this.f56070;
        return (int) jArr[C11003.checkIndex(i, jArr.length)];
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m42017(int i) {
        long[] jArr = this.f56070;
        int checkIndex = C11003.checkIndex(i, jArr.length) + 1;
        return checkIndex < jArr.length ? (int) (jArr[checkIndex] >>> 32) : this.f56071;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static int m41996(int i) {
        if (i != Integer.MAX_VALUE) {
            return i + 1;
        }
        throw new OutOfMemoryError("Syntax context run count exceeded");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004d, code lost:
    
        return r4;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m41985(int[] r16, int[] r17, l.C14071 r18, long[] r19) {
        /*
            r15 = this;
            r0 = r15
            r1 = r18
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = -1
        L7:
            int r6 = r0.f56069
            if (r2 < r6) goto Ld
            if (r3 >= r6) goto L4d
        Ld:
            int[] r7 = r0.f56067
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 >= r6) goto L1c
            r10 = r16[r2]
            r10 = r7[r10]
            long r10 = (long) r10
            goto L1d
        L1c:
            r10 = r8
        L1d:
            int[] r12 = r0.f56065
            if (r3 >= r6) goto L27
            r13 = r17[r3]
            r13 = r12[r13]
            long r13 = (long) r13
            goto L28
        L27:
            r13 = r8
        L28:
            long r10 = java.lang.Math.min(r10, r13)
            int r11 = (int) r10
        L2d:
            if (r3 >= r6) goto L3b
            r10 = r17[r3]
            r13 = r12[r10]
            if (r13 != r11) goto L3b
            int r3 = r3 + 1
            r1.m33664(r10)
            goto L2d
        L3b:
            if (r2 >= r6) goto L49
            r10 = r16[r2]
            r13 = r7[r10]
            if (r13 != r11) goto L49
            int r2 = r2 + 1
            r1.m33662(r10)
            goto L3b
        L49:
            if (r2 != r6) goto L4e
            if (r3 != r6) goto L4e
        L4d:
            return r4
        L4e:
            if (r2 >= r6) goto L56
            r10 = r16[r2]
            r7 = r7[r10]
            long r13 = (long) r7
            goto L57
        L56:
            r13 = r8
        L57:
            if (r3 >= r6) goto L5e
            r6 = r17[r3]
            r6 = r12[r6]
            long r8 = (long) r6
        L5e:
            long r6 = java.lang.Math.min(r13, r8)
            long r8 = (long) r11
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 > 0) goto L68
            goto L7
        L68:
            int r6 = r18.m33663()
            if (r6 < 0) goto L7e
            if (r6 == r5) goto L7
            if (r19 == 0) goto L78
            long r7 = m42002(r11, r6)
            r19[r4] = r7
        L78:
            int r4 = m41996(r4)
            r5 = r6
            goto L7
        L7e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Syntax context ranges do not cover the text"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17975.m41985(int[], int[], l.ܰ᩷ܿ, long[]):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41987(int[] iArr, int[] iArr2) {
        Class cls = Integer.TYPE;
        m41988(iArr, iArr2, 0, iArr.length, 24, 0, (int[][]) Array.newInstance((Class<?>) cls, 4, 256), (int[][]) Array.newInstance((Class<?>) cls, 4, 257), (int[][]) Array.newInstance((Class<?>) cls, 4, 256));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41988(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int[][] iArr3, int[][] iArr4, int[][] iArr5) {
        int i5 = i2 - i;
        if (i5 < 2) {
            return;
        }
        if (i5 <= 64) {
            m41993(i, i2, iArr, iArr2);
            return;
        }
        int[] iArr6 = iArr3[i4];
        int[] iArr7 = iArr4[i4];
        int[] iArr8 = iArr5[i4];
        int i6 = 0;
        Arrays.fill(iArr6, 0);
        for (int i7 = i; i7 < i2; i7++) {
            int i8 = (iArr2[iArr[i7]] >>> i3) & 255;
            iArr6[i8] = iArr6[i8] + 1;
        }
        iArr7[0] = i;
        int i9 = 0;
        while (i9 < 256) {
            int i10 = i9 + 1;
            iArr7[i10] = iArr7[i9] + iArr6[i9];
            iArr8[i9] = iArr7[i9];
            i9 = i10;
        }
        int i11 = 0;
        while (i11 < 256) {
            int i12 = i11 + 1;
            int i13 = iArr7[i12];
            while (true) {
                int i14 = iArr8[i11];
                if (i14 < i13) {
                    int i15 = (iArr2[iArr[i14]] >>> i3) & 255;
                    if (i15 == i11) {
                        iArr8[i11] = i14 + 1;
                    } else {
                        int i16 = iArr8[i15];
                        iArr8[i15] = i16 + 1;
                        int i17 = iArr[i14];
                        iArr[i14] = iArr[i16];
                        iArr[i16] = i17;
                    }
                }
            }
            i11 = i12;
        }
        if (i3 == 0) {
            return;
        }
        int i18 = i3 - 8;
        while (i6 < 256) {
            int i19 = iArr7[i6];
            int i20 = i6 + 1;
            int i21 = iArr7[i20];
            if (i21 - i19 > 1) {
                m41988(iArr, iArr2, i19, i21, i18, i4 + 1, iArr3, iArr4, iArr5);
            }
            i6 = i20;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m41993(int i, int i2, int[] iArr, int[] iArr2) {
        for (int i3 = i + 1; i3 < i2; i3++) {
            int i4 = iArr[i3];
            int i5 = iArr2[i4];
            int i6 = i3;
            while (i6 > i) {
                int i7 = iArr[i6 - 1];
                if (iArr2[i7] > i5) {
                    iArr[i6] = i7;
                    i6--;
                }
            }
            iArr[i6] = i4;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m42011(int i) {
        int checkIndex = C11003.checkIndex(i, this.f56069);
        int i2 = 0;
        while (true) {
            checkIndex = this.f56068[checkIndex];
            if (checkIndex == -1) {
                return i2;
            }
            i2++;
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m42012(int i) {
        return this.f56067[C11003.checkIndex(i, this.f56069)];
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m42013(int i) {
        return this.f56065[C11003.checkIndex(i, this.f56069)];
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m42014(int i) {
        return this.f56068[C11003.checkIndex(i, this.f56069)];
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15068 m42015(int i) {
        return this.f56066[C11003.checkIndex(i, this.f56069)];
    }
}
