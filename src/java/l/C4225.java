package l;

/* compiled from: U8DO */
/* renamed from: l.ۘ᩹֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4225 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f13714;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f13715;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f13716;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f13717;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f13718;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f13719;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f13720;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f13721;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f13722;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final int[] f13713 = {3, 3, 3, 3, 2, 2, 3};

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final int[] f13712 = {1, 2, 3, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12724(byte[] bArr) {
        bArr[0] = (byte) this.f13722;
        bArr[1] = (byte) this.f13714;
        bArr[2] = (byte) this.f13716;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m12726(int i, C17714 c17714) {
        m12727();
        int m41485 = c17714.m41485();
        int i2 = 0;
        if (c17714.m41457() < 2) {
            return false;
        }
        this.f13718 = m12723(c17714);
        this.f13715 = c17714.m41485() - m41485;
        int m41456 = c17714.m41456();
        this.f13720 = 1;
        if (m41456 == 240) {
            this.f13722 = m41456;
            while (c17714.m41456() != 247) {
            }
        } else if (m41456 == 255) {
            int m414562 = c17714.m41456();
            int m12723 = m12723(c17714);
            this.f13722 = m41456;
            if (m414562 == 47) {
                c17714.m41484(m41485);
                m12727();
                return false;
            }
            if (m414562 == 81) {
                long m41491 = c17714.m41491();
                this.f13721 = m41491;
                if (m41491 <= 0) {
                    throw C9080.m23441("Tempo event data value must be a non-zero positive value. Parsed value: " + this.f13721);
                }
                c17714.m41478(m12723 - 3);
            } else {
                c17714.m41478(m12723);
            }
        } else {
            boolean z = m41456 < 128;
            if (!z) {
                i = m41456;
            } else {
                if (i == Integer.MIN_VALUE) {
                    throw C9080.m23440("Running status in the first event.", (Throwable) null);
                }
                this.f13714 = m41456;
                this.f13720 = 2;
            }
            if (i >= 128 && i <= 255) {
                if (i >= 240) {
                    i2 = f13712[i & 15];
                } else {
                    i2 = f13713[(i >> 4) & 7];
                }
            }
            if (!z && i2 > this.f13720) {
                this.f13714 = c17714.m41456();
                this.f13720++;
            }
            if (i2 > this.f13720) {
                this.f13716 = c17714.m41456();
                this.f13720++;
            }
            this.f13722 = i;
        }
        this.f13719 = c17714.m41485() - m41485;
        c17714.m41484(m41485);
        this.f13717 = true;
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m12725() {
        return this.f13717;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12727() {
        this.f13717 = false;
        this.f13715 = -1;
        this.f13722 = Integer.MIN_VALUE;
        this.f13714 = Integer.MIN_VALUE;
        this.f13716 = Integer.MIN_VALUE;
        this.f13718 = -1L;
        this.f13719 = -1;
        this.f13720 = -1;
        this.f13721 = -9223372036854775807L;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m12723(C17714 c17714) {
        int i = 0;
        int i2 = 0;
        do {
            int m41456 = c17714.m41456();
            i = (i << 7) | (m41456 & 127);
            i2++;
            if ((m41456 & 128) == 0) {
                break;
            }
        } while (i2 <= 4);
        return i;
    }
}
