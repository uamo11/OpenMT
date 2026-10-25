package l;

/* compiled from: I1TM */
/* renamed from: l.֫᩹ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2115 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f7063;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f7064;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C19049[] f7065;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f7066;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f7062 = 0;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f7067 = 0;

    public C2115(int i, int i2, int i3) {
        this.f7063 = i;
        this.f7064 = i2;
        this.f7066 = i3;
        this.f7065 = new C19049[i2];
        m7005(0, 0, i, i3, 32, C23924.f77597);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m7002(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        StringBuilder sb = new StringBuilder();
        int i8 = this.f7063;
        int i9 = -this.f7062;
        if (i2 >= i9) {
            i9 = i2;
        }
        int i10 = this.f7066;
        int i11 = i4 >= i10 ? i10 - 1 : i4;
        int i12 = i9;
        while (i12 <= i11) {
            int i13 = i12 == i9 ? i : 0;
            if (i12 != i11 || (i5 = i3 + 1) > i8) {
                i5 = i8;
            }
            C19049 c19049 = this.f7065[m7010(i12)];
            int m43904 = c19049.m43904(i13);
            int m439042 = i5 < this.f7063 ? c19049.m43904(i5) : c19049.m43903();
            if (m439042 == m43904) {
                m439042 = c19049.m43904(i5 + 1);
            }
            char[] cArr = c19049.f59996;
            boolean z = this.f7065[m7010(i12)].f59997;
            if (z && i5 == i8) {
                i6 = m439042 - 1;
            } else {
                int i14 = -1;
                for (int i15 = m43904; i15 < m439042; i15++) {
                    if (cArr[i15] != ' ') {
                        i14 = i15;
                    }
                }
                i6 = i14;
            }
            if (i6 != -1 && (i7 = (i6 - m43904) + 1) > 0) {
                sb.append(cArr, m43904, i7);
            }
            if (!z && i12 < i11 && i12 < this.f7066 - 1) {
                sb.append('\n');
            }
            i12++;
        }
        return sb.toString();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m7009() {
        return this.f7062;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m7011() {
        return m7002(0, -this.f7062, this.f7063, this.f7066).trim();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m7001() {
        return this.f7062 + this.f7066;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m7010(int i) {
        if (i < (-this.f7062) || i > this.f7066) {
            throw new IllegalArgumentException();
        }
        int i2 = this.f7067 + i;
        int i3 = this.f7064;
        return i2 < 0 ? i3 + i2 : i2 % i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0156  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7007(int r29, int r30, int r31, int[] r32, long r33, boolean r35) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2115.m7007(int, int, int, int[], long, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m7000(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        int i3 = this.f7064;
        int i4 = i2 - 1;
        C19049 c19049 = this.f7065[((i + i4) + 1) % i3];
        while (i4 >= 0) {
            C19049[] c19049Arr = this.f7065;
            int i5 = i + i4;
            c19049Arr[(i5 + 1) % i3] = c19049Arr[i5 % i3];
            i4--;
        }
        this.f7065[i % i3] = c19049;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7008(int i, int i2, long j) {
        int i3 = i2 - 1;
        if (i > i3 || i < 0 || i2 > this.f7066) {
            throw new IllegalArgumentException();
        }
        m7000(this.f7067, i);
        m7000(m7010(i2), this.f7066 - i2);
        int i4 = this.f7067 + 1;
        int i5 = this.f7064;
        this.f7067 = i4 % i5;
        int i6 = this.f7062;
        if (i6 < i5 - this.f7066) {
            this.f7062 = i6 + 1;
        }
        int m7010 = m7010(i3);
        C19049[] c19049Arr = this.f7065;
        C19049 c19049 = c19049Arr[m7010];
        if (c19049 == null) {
            c19049Arr[m7010] = new C19049(this.f7063, j);
        } else {
            c19049.m43906(j);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7004(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if (i3 == 0) {
            return;
        }
        if (i >= 0 && (i7 = i + i3) <= (i8 = this.f7063) && i2 >= 0) {
            int i9 = i2 + i4;
            int i10 = this.f7066;
            if (i9 <= i10 && i5 >= 0 && i3 + i5 <= i8 && i6 >= 0 && i6 + i4 <= i10) {
                boolean z = i2 > i6;
                for (int i11 = 0; i11 < i4; i11++) {
                    int i12 = z ? i11 : i4 - (i11 + 1);
                    m7003(m7010(i12 + i6)).m43907(m7003(m7010(i2 + i12)), i, i7, i5);
                }
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7005(int i, int i2, int i3, int i4, int i5, long j) {
        if (i < 0 || i + i3 > this.f7063 || i2 < 0 || i2 + i4 > this.f7066) {
            throw new IllegalArgumentException();
        }
        for (int i6 = 0; i6 < i4; i6++) {
            for (int i7 = 0; i7 < i3; i7++) {
                m7006(i + i7, i2 + i6, i5, j);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19049 m7003(int i) {
        C19049[] c19049Arr = this.f7065;
        C19049 c19049 = c19049Arr[i];
        if (c19049 != null) {
            return c19049;
        }
        C19049 c190492 = new C19049(this.f7063, 0L);
        c19049Arr[i] = c190492;
        return c190492;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7006(int i, int i2, int i3, long j) {
        if (i2 >= this.f7066 || i >= this.f7063) {
            throw new IllegalArgumentException();
        }
        m7003(m7010(i2)).m43905(i, i3, j);
    }
}
