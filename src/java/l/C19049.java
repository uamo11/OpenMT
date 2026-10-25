package l;

import java.util.Arrays;

/* compiled from: H1TP */
/* renamed from: l.ᩴ᩹ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19049 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f59994;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f59995;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public char[] f59996;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f59997;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long[] f59998;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public short f59999;

    public C19049(int i, long j) {
        this.f59994 = i;
        this.f59996 = new char[(int) (i * 1.5f)];
        this.f59998 = new long[i];
        m43906(j);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43907(C19049 c19049, int i, int i2, int i3) {
        this.f59995 |= c19049.f59995;
        int m43904 = c19049.m43904(i);
        int m439042 = c19049.m43904(i2);
        boolean z = i > 0 && c19049.m43902(i + (-1));
        char[] cArr = c19049.f59996;
        if (this == c19049) {
            cArr = Arrays.copyOf(cArr, cArr.length);
        }
        int i4 = 0;
        while (m43904 < m439042) {
            char c = cArr[m43904];
            boolean isHighSurrogate = Character.isHighSurrogate(c);
            int i5 = c;
            if (isHighSurrogate) {
                m43904++;
                i5 = Character.toCodePoint(c, cArr[m43904]);
            }
            if (z) {
                i5 = 32;
                z = false;
            }
            int m18920 = C6991.m18920(i5);
            if (m18920 > 0) {
                i3 += i4;
                i += i4;
                i4 = m18920;
            }
            m43905(i3, i5, c19049.f59998[i]);
            m43904++;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m43903() {
        return this.f59999;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m43909() {
        short s = this.f59999;
        for (int i = 0; i < s; i++) {
            if (this.f59996[i] != ' ') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m43904(int i) {
        if (i == this.f59994) {
            return this.f59999;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            char c = this.f59996[i2];
            boolean isHighSurrogate = Character.isHighSurrogate(c);
            int i5 = c;
            if (isHighSurrogate) {
                int codePoint = Character.toCodePoint(c, this.f59996[i4]);
                i4 = i2 + 2;
                i5 = codePoint;
            }
            int m18920 = C6991.m18920(i5);
            if (m18920 > 0) {
                i3 += m18920;
                if (i3 == i) {
                    while (i4 < this.f59999) {
                        if (Character.isHighSurrogate(this.f59996[i4])) {
                            char[] cArr = this.f59996;
                            if (C6991.m18920(Character.toCodePoint(cArr[i4], cArr[i4 + 1])) > 0) {
                                break;
                            }
                            i4 += 2;
                        } else {
                            if (C6991.m18920(this.f59996[i4]) > 0) {
                                break;
                            }
                            i4++;
                        }
                    }
                    return i4;
                }
                if (i3 > i) {
                    return i2;
                }
            }
            i2 = i4;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m43902(int i) {
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.f59999) {
            int i5 = i3 + 1;
            char c = this.f59996[i3];
            if (Character.isHighSurrogate(c)) {
                i3 += 2;
                i2 = Character.toCodePoint(c, this.f59996[i5]);
            } else {
                i3 = i5;
                i2 = c;
            }
            int m18920 = C6991.m18920(i2);
            if (m18920 > 0) {
                if (i4 == i && m18920 == 2) {
                    return true;
                }
                i4 += m18920;
                if (i4 > i) {
                    break;
                }
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43906(long j) {
        Arrays.fill(this.f59996, ' ');
        Arrays.fill(this.f59998, j);
        this.f59999 = (short) this.f59994;
        this.f59995 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0079  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m43905(int r17, int r18, long r19) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19049.m43905(int, int, long):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m43908(int i) {
        return this.f59998[i];
    }
}
