package l;

import android.graphics.RectF;

/* compiled from: U4IR */
/* renamed from: l.ۙܰܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4690 {

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final String[] f14882 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final char[] f14883 = "0123456789ABCDEF".toCharArray();

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f14884;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f14886;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f14889;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f14893;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f14895;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f14896;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f14899;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C6807 f14900;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final RectF f14887 = new RectF();

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final RectF f14897 = new RectF();

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final RectF f14898 = new RectF();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C14792 f14888 = new C14792(3);

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f14892 = C5659.f17466;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean[] f14894 = C19771.f63835;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char[] f14891 = new char[2];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char[] f14885 = new char[1];

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final char[] f14890 = new char[13];

    public C4690(C6807 c6807) {
        this.f14900 = c6807;
        C10607 c10607 = c6807.f21110;
        this.f14884 = (Math.max(Math.max(c10607.f31851.getIntrinsicHeight(), c10607.f31850.getIntrinsicHeight()), c10607.f31838.getIntrinsicHeight()) * 3) / 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x062d A[LOOP:6: B:104:0x062b->B:105:0x062d, LOOP_END] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13751(android.graphics.Canvas r60, boolean r61, boolean r62, float r63, boolean r64) {
        /*
            Method dump skipped, instructions count: 1687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4690.m13751(android.graphics.Canvas, boolean, boolean, float, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13750(int i, C11562 c11562, boolean z) {
        C6807 c6807 = this.f14900;
        int m27413 = c6807.f21109.m27413();
        C10607 c10607 = c6807.f21110;
        int i2 = c10607.f31845;
        float f = c10607.f31848;
        int m27419 = (int) ((c6807.f21109.m27419() + 1) * f);
        long j = i2;
        long m13766 = ((i / m27413) * j) + m13766();
        long j2 = j + m13766;
        int i3 = (i % m27413) * 3;
        int i4 = i3 + 1;
        if (z) {
            i4 = i3 + 3;
        }
        int i5 = (int) ((i4 * f) + m27419);
        c11562.f34503 = i5;
        c11562.f34505 = m13766;
        c11562.f34504 = i5;
        c11562.f34502 = j2;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m13765() {
        return this.f14896;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m13757() {
        return this.f14895;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final RectF m13764() {
        return this.f14887;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final RectF m13763() {
        return this.f14897;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final RectF m13760() {
        return this.f14898;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14792 m13759() {
        return this.f14888;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m13758(int i) {
        return i * this.f14900.f21110.f31845;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m13749(int i) {
        C10607 c10607 = this.f14900.f21110;
        return Math.max(((((i + 1) * c10607.f31845) + m13766()) + this.f14884) - r0.getHeight(), 0L);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m13762() {
        return m13749(this.f14900.f21109.m27411());
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m13766() {
        C10607 c10607 = this.f14900.f21110;
        return c10607.f31845 + c10607.f31847 + 1;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private float m13746() {
        C6807 c6807 = this.f14900;
        C11041 c11041 = c6807.f21109;
        return (C23202.m51496(c11041.m27413(), 3, c11041.m27419() + 1, 1) + 0.5f + 1.0f) * c6807.f21110.f31848;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m13754() {
        return this.f14893;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m13756() {
        return this.f14899;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m13745(long j) {
        C6807 c6807 = this.f14900;
        C11041 c11041 = c6807.f21109;
        C10607 c10607 = c6807.f21110;
        if (c11041.m27415() == 0) {
            this.f14889 = true;
            return 0;
        }
        long m13766 = (j - m13766()) / c10607.f31845;
        int i = (int) m13766;
        if (m13766 != i) {
            throw new ArithmeticException();
        }
        if (i < 0) {
            this.f14889 = true;
            return 0;
        }
        int m27411 = c11041.m27415() % c11041.m27413() == 0 ? c11041.m27411() : c11041.m27411() - 1;
        if (i <= m27411) {
            return i;
        }
        this.f14889 = true;
        return m27411;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float m13755() {
        return m13766() + this.f14884;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m13747() {
        return this.f14900.getHeight() - this.f14884;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m13761() {
        return this.f14889;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m13748(float f, long j, boolean z) {
        int i = 0;
        this.f14889 = false;
        int m13745 = m13745(j);
        C6807 c6807 = this.f14900;
        C11041 c11041 = c6807.f21109;
        float f2 = c6807.f21110.f31848;
        float m27419 = (f2 / 2.0f) + ((c11041.m27419() + 1) * f2);
        if (f <= m27419) {
            this.f14889 = true;
            this.f14886 = true;
        } else {
            int m27413 = c11041.m27413();
            for (int i2 = 0; i2 < m27413; i2++) {
                float f3 = m27419 + f2;
                if (f <= f3) {
                    this.f14886 = true;
                } else {
                    m27419 = f3 + (f2 * 2.0f);
                    if (f <= m27419) {
                        this.f14886 = false;
                    }
                }
                i = i2;
                break;
            }
            if (z || f <= m27419 + f2) {
                this.f14889 = true;
                this.f14886 = false;
            } else {
                this.f14886 = true;
                float m13746 = m13746();
                if (f <= m13746) {
                    this.f14889 = true;
                } else {
                    while (i < m27413) {
                        m13746 += f2;
                        if (f <= m13746) {
                            break;
                        }
                        i++;
                    }
                    this.f14889 = true;
                }
            }
            i = m27413 - 1;
        }
        return c6807.f21109.m27387(m13745, i);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m13753() {
        return this.f14886;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m13752(C11562 c11562) {
        C6807 c6807 = this.f14900;
        int m27418 = c6807.f21109.m27418();
        C11041 c11041 = c6807.f21109;
        int m27404 = c11041.m27404();
        int m27413 = c11041.m27413();
        C10607 c10607 = c6807.f21110;
        int i = c10607.f31845;
        float f = c10607.f31848;
        int m27419 = (int) ((c11041.m27419() + 1) * f);
        int i2 = m27418 / m27413;
        if (m27418 == m27404) {
            long j = i;
            long m13766 = (i2 * j) + m13766();
            long j2 = j + m13766;
            int i3 = (m27418 % m27413) * 3;
            int i4 = i3 + 1;
            if (!c11041.m27412()) {
                i4 = i3 + 2;
            }
            int i5 = (int) ((i4 * f) + m27419);
            c11562.f34503 = i5;
            c11562.f34505 = m13766;
            c11562.f34504 = i5;
            c11562.f34502 = j2;
            return true;
        }
        if (m27404 - m27418 >= m27413 || i2 != m27404 / m27413) {
            return false;
        }
        long j3 = i;
        long m137662 = (i2 * j3) + m13766();
        c11562.f34503 = ((int) ((((m27418 % m27413) * 3) + 1) * f)) + m27419;
        c11562.f34505 = m137662;
        c11562.f34504 = m27419 + ((int) ((((m27404 % m27413) * 3) + 3) * f));
        c11562.f34502 = j3 + m137662;
        return true;
    }
}
