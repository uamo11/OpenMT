package l;

/* compiled from: S708 */
/* renamed from: l.ۢ֫ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9281 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f28119 = new int[0];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f28120;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f28121;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f28122;

    public C9281(int i, int i2, int[] iArr) {
        this.f28120 = iArr;
        this.f28121 = i;
        this.f28122 = i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m23808() {
        return this.f28121;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m23812() {
        return this.f28122;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m23815(int i) {
        C11003.checkIndex(i, this.f28121);
        return this.f28120[i << 1];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m23809(int i) {
        C11003.checkIndex(i, this.f28121);
        return this.f28120[(i << 1) + 1];
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m23814(int i) {
        int m23813 = m23813(i);
        int i2 = this.f28121;
        int[] iArr = this.f28120;
        if (m23813 < i2) {
            if (iArr[m23813 << 1] <= i) {
                return m23813 + 1;
            }
            return -1;
        }
        int i3 = this.f28122;
        if (i == i3 && i2 != 0 && iArr[((i2 - 1) << 1) + 1] == i3) {
            return i2;
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m23810(int i, int i2) {
        C11003.checkFromToIndex(i, i2, this.f28122);
        int m23814 = m23814(i);
        if (m23814 == -1 || i == i2 || m23814(i2 - 1) == m23814) {
            return m23814;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m23811(int r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            if (r2 < 0) goto L91
            if (r3 < 0) goto L91
            if (r1 < 0) goto L89
            int r4 = r0.f28122
            if (r1 > r4) goto L89
            int r5 = r4 - r1
            if (r2 > r5) goto L89
            int r4 = r4 - r2
            long r4 = (long) r4
            long r6 = (long) r3
            long r4 = r4 + r6
            int r8 = (int) r4
            long r9 = (long) r8
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 != 0) goto L83
            if (r2 != 0) goto L25
            if (r3 != 0) goto L25
            return
        L25:
            int r3 = r1 + r2
            long r4 = (long) r2
            long r6 = r6 - r4
            int r4 = (int) r6
            long r4 = (long) r4
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 != 0) goto L7d
            r6 = 0
            r7 = 0
        L31:
            int r9 = r0.f28121
            if (r6 >= r9) goto L78
            int r9 = r6 << 1
            int[] r10 = r0.f28120
            r11 = r10[r9]
            int r9 = r9 + 1
            r9 = r10[r9]
            if (r2 != 0) goto L46
            if (r11 >= r1) goto L4b
            if (r1 >= r9) goto L4b
            goto L75
        L46:
            if (r11 >= r3) goto L4b
            if (r1 >= r9) goto L4b
            goto L75
        L4b:
            if (r11 < r3) goto L6b
            long r11 = (long) r11
            long r11 = r11 + r4
            int r13 = (int) r11
            long r14 = (long) r13
            int r16 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r16 != 0) goto L65
            long r11 = (long) r9
            long r11 = r11 + r4
            int r9 = (int) r11
            long r14 = (long) r9
            int r16 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r16 != 0) goto L5f
            r11 = r13
            goto L6b
        L5f:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            r1.<init>()
            throw r1
        L65:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            r1.<init>()
            throw r1
        L6b:
            int r12 = r7 << 1
            r10[r12] = r11
            int r12 = r12 + 1
            r10[r12] = r9
            int r7 = r7 + 1
        L75:
            int r6 = r6 + 1
            goto L31
        L78:
            r0.f28121 = r7
            r0.f28122 = r8
            return
        L7d:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            r1.<init>()
            throw r1
        L83:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            r1.<init>()
            throw r1
        L89:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = "Search edit is outside the text"
            r1.<init>(r2)
            throw r1
        L91:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Negative search edit length"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9281.m23811(int, int, int):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m23813(int i) {
        if (i >= 0 && i <= this.f28122) {
            int i2 = this.f28121;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = (i3 + i2) >>> 1;
                if (this.f28120[(i4 << 1) + 1] <= i) {
                    i3 = i4 + 1;
                } else {
                    i2 = i4;
                }
            }
            return i3;
        }
        throw new IndexOutOfBoundsException("Search position is outside the text");
    }
}
