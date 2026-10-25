package l;

import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: L3BC */
/* renamed from: l.ۨۨܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11684 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f34818;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f34819;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f34820;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f34821;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final char[] f34822;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f34823;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f34824;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean[] f34825;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f34826;

    public C11684(String str, char[] cArr, byte[] bArr, boolean z) {
        str.getClass();
        this.f34819 = str;
        cArr.getClass();
        this.f34822 = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int m15977 = C5666.m15977(length);
            this.f34818 = m15977;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(m15977);
            int i = 1 << (3 - numberOfTrailingZeros);
            this.f34824 = i;
            this.f34820 = m15977 >> numberOfTrailingZeros;
            this.f34826 = cArr.length - 1;
            this.f34823 = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f34820; i2++) {
                int i3 = this.f34818;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[C5666.m15978(i2 * 8, i3)] = true;
            }
            this.f34825 = zArr;
            this.f34821 = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C11684(java.lang.String r9, char[] r10) {
        /*
            r8 = this;
            r0 = 128(0x80, float:1.8E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = 0
        La:
            int r5 = r10.length
            if (r4 >= r5) goto L4e
            char r5 = r10[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = 1
            goto L15
        L14:
            r7 = 0
        L15:
            if (r7 == 0) goto L3a
            r7 = r1[r5]
            if (r7 != r2) goto L1d
            r7 = 1
            goto L1e
        L1d:
            r7 = 0
        L1e:
            if (r7 == 0) goto L26
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L26:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.Character r10 = java.lang.Character.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r3] = r10
            java.lang.String r10 = "Duplicate character: %s"
            java.lang.String r10 = l.C10375.m26179(r10, r0)
            r9.<init>(r10)
            throw r9
        L3a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.Character r10 = java.lang.Character.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r3] = r10
            java.lang.String r10 = "Non-ASCII character: %s"
            java.lang.String r10 = l.C10375.m26179(r10, r0)
            r9.<init>(r10)
            throw r9
        L4e:
            r8.<init>(r9, r10, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11684.<init>(java.lang.String, char[]):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char m28568(int i) {
        return this.f34822[i];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m28572(int i) {
        return this.f34825[i % this.f34824];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m28569(char c) {
        if (c > 127) {
            throw new C7450(C13540.m32584(new StringBuilder("Unrecognized character: 0x"), c));
        }
        byte b = this.f34823[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new C7450(C13540.m32584(new StringBuilder("Unrecognized character: 0x"), c));
        }
        throw new C7450("Unrecognized character: " + c);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11684 m28570() {
        boolean z;
        char[] cArr = this.f34822;
        for (char c : cArr) {
            if (C15107.m35800(c)) {
                int length = cArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    char c2 = cArr[i];
                    if (c2 >= 'a' && c2 <= 'z') {
                        z = true;
                        break;
                    }
                    i++;
                }
                C4025.m12115("Cannot call lowerCase() on a mixed-case alphabet", !z);
                char[] cArr2 = new char[cArr.length];
                for (int i2 = 0; i2 < cArr.length; i2++) {
                    char c3 = cArr[i2];
                    if (C15107.m35800(c3)) {
                        c3 = (char) (c3 ^ ' ');
                    }
                    cArr2[i2] = c3;
                }
                C11684 c11684 = new C11684(C9045.m23341(new StringBuilder(), this.f34819, ".lowerCase()"), cArr2);
                if (!this.f34821 || c11684.f34821) {
                    return c11684;
                }
                byte[] bArr = c11684.f34823;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i3 = 65; i3 <= 90; i3++) {
                    int i4 = i3 | 32;
                    byte b = bArr[i3];
                    byte b2 = bArr[i4];
                    if (b == -1) {
                        copyOf[i3] = b2;
                    } else {
                        char c4 = (char) i3;
                        char c5 = (char) i4;
                        if (!(b2 == -1)) {
                            throw new IllegalStateException(C10375.m26179("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                        }
                        copyOf[i4] = b;
                    }
                }
                return new C11684(C9045.m23341(new StringBuilder(), c11684.f34819, ".ignoreCase()"), c11684.f34822, copyOf, true);
            }
        }
        return this;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m28571(char c) {
        byte[] bArr = this.f34823;
        return c < bArr.length && bArr[c] != -1;
    }

    public final String toString() {
        return this.f34819;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11684)) {
            return false;
        }
        C11684 c11684 = (C11684) obj;
        return this.f34821 == c11684.f34821 && Arrays.equals(this.f34822, c11684.f34822);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f34822) + (this.f34821 ? 1231 : 1237);
    }
}
