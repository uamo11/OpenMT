package l;

/* compiled from: Q8H5 */
/* renamed from: l.᩷ۚۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20670 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f66570;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f66571;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f66572;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9248 f66567 = new C9248(0);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f66568 = -9223372036854775807L;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f66569 = -9223372036854775807L;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f66566 = -9223372036854775807L;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C17714 f66573 = new C17714();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m47290() {
        return this.f66570;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47287(InterfaceC8424 interfaceC8424, C23615 c23615, int i) {
        if (i <= 0) {
            m47286(interfaceC8424);
            return 0;
        }
        boolean z = this.f66571;
        C17714 c17714 = this.f66573;
        long j = -9223372036854775807L;
        if (z) {
            if (this.f66569 == -9223372036854775807L) {
                m47286(interfaceC8424);
                return 0;
            }
            if (this.f66572) {
                long j2 = this.f66568;
                if (j2 == -9223372036854775807L) {
                    m47286(interfaceC8424);
                    return 0;
                }
                C9248 c9248 = this.f66567;
                this.f66566 = c9248.m23736(this.f66569) - c9248.m23734(j2);
                m47286(interfaceC8424);
                return 0;
            }
            int min = (int) Math.min(112800, interfaceC8424.getLength());
            long j3 = 0;
            if (interfaceC8424.getPosition() != j3) {
                c23615.f76532 = j3;
                return 1;
            }
            c17714.m41481(min);
            interfaceC8424.mo22066();
            interfaceC8424.mo22061(0, min, c17714.m41482());
            int m41485 = c17714.m41485();
            int m41483 = c17714.m41483();
            while (true) {
                if (m41485 >= m41483) {
                    break;
                }
                if (c17714.m41482()[m41485] == 71) {
                    long m28860 = C11807.m28860(c17714, m41485, i);
                    if (m28860 != -9223372036854775807L) {
                        j = m28860;
                        break;
                    }
                }
                m41485++;
            }
            this.f66568 = j;
            this.f66572 = true;
            return 0;
        }
        long length = interfaceC8424.getLength();
        int min2 = (int) Math.min(112800, length);
        long j4 = length - min2;
        if (interfaceC8424.getPosition() != j4) {
            c23615.f76532 = j4;
            return 1;
        }
        c17714.m41481(min2);
        interfaceC8424.mo22066();
        interfaceC8424.mo22061(0, min2, c17714.m41482());
        int m414852 = c17714.m41485();
        int m414832 = c17714.m41483();
        int i2 = m414832 - 188;
        while (true) {
            if (i2 < m414852) {
                break;
            }
            byte[] m41482 = c17714.m41482();
            int i3 = -4;
            int i4 = 0;
            while (true) {
                if (i3 > 4) {
                    break;
                }
                int i5 = (i3 * 188) + i2;
                if (i5 < m414852 || i5 >= m414832 || m41482[i5] != 71) {
                    i4 = 0;
                } else {
                    i4++;
                    if (i4 == 5) {
                        long m288602 = C11807.m28860(c17714, i2, i);
                        if (m288602 != -9223372036854775807L) {
                            j = m288602;
                            break;
                        }
                    }
                }
                i3++;
            }
            i2--;
        }
        this.f66569 = j;
        this.f66571 = true;
        return 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m47288() {
        return this.f66566;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9248 m47289() {
        return this.f66567;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47286(InterfaceC8424 interfaceC8424) {
        byte[] bArr = C3603.f11423;
        C17714 c17714 = this.f66573;
        c17714.getClass();
        c17714.m41462(bArr.length, bArr);
        this.f66570 = true;
        interfaceC8424.mo22066();
    }
}
