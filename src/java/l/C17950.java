package l;

import java.util.Arrays;
import java.util.List;

/* compiled from: X8U2 */
/* renamed from: l.ᩳۡۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17950 implements InterfaceC1368 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16538 f55960;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f55962;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C23896 f55963;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f55965;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C6307 f55967;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f55969;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f55970;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f55971;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f55973;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] f55961 = new byte[42];

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17714 f55966 = new C17714(new byte[32768], 0);

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f55972 = false;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C4896 f55964 = new C4896();

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f55968 = 0;

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4838() {
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        C23896 m38956 = new C16559().m38956(interfaceC8424, C17449.f53305);
        if (m38956 != null) {
            m38956.m52639();
        }
        C17714 c17714 = new C17714(4);
        ((C16184) interfaceC8424).mo22068(false, 0, 4, c17714.m41482());
        return c17714.m41479() == 1716281667;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f55970 = interfaceC21830;
        this.f55962 = interfaceC21830.mo3429(0, 1);
        interfaceC21830.mo3431();
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) {
        InterfaceC9505 c20794;
        long j;
        boolean z;
        int i = this.f55968;
        C23896 c23896 = null;
        if (i == 0) {
            interfaceC8424.mo22066();
            long mo22069 = interfaceC8424.mo22069();
            C23896 m38956 = new C16559().m38956(interfaceC8424, !this.f55972 ? null : C17449.f53305);
            if (m38956 != null && m38956.m52639() != 0) {
                c23896 = m38956;
            }
            interfaceC8424.mo22070((int) (interfaceC8424.mo22069() - mo22069));
            this.f55963 = c23896;
            this.f55968 = 1;
            return 0;
        }
        byte[] bArr = this.f55961;
        if (i == 1) {
            interfaceC8424.mo22061(0, bArr.length, bArr);
            interfaceC8424.mo22066();
            this.f55968 = 2;
            return 0;
        }
        if (i == 2) {
            C17714 c17714 = new C17714(4);
            interfaceC8424.readFully(c17714.m41482(), 0, 4);
            if (c17714.m41479() != 1716281667) {
                throw C9080.m23440("Failed to read FLAC stream marker.", (Throwable) null);
            }
            this.f55968 = 3;
            return 0;
        }
        if (i == 3) {
            C6307 c6307 = this.f55967;
            boolean z2 = false;
            while (!z2) {
                interfaceC8424.mo22066();
                byte[] bArr2 = new byte[4];
                C16302 c16302 = new C16302(bArr2, 4);
                interfaceC8424.mo22061(0, 4, bArr2);
                boolean m38352 = c16302.m38352();
                int m38343 = c16302.m38343(7);
                int m383432 = c16302.m38343(24) + 4;
                if (m38343 == 0) {
                    byte[] bArr3 = new byte[38];
                    interfaceC8424.readFully(bArr3, 0, 38);
                    c6307 = new C6307(bArr3, 4);
                } else {
                    if (c6307 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (m38343 == 3) {
                        C17714 c177142 = new C17714(m383432);
                        interfaceC8424.readFully(c177142.m41482(), 0, m383432);
                        c6307 = c6307.m17437(C13362.m32373(c177142));
                    } else if (m38343 == 4) {
                        C17714 c177143 = new C17714(m383432);
                        interfaceC8424.readFully(c177143.m41482(), 0, m383432);
                        c177143.m41478(4);
                        c6307 = c6307.m17439(Arrays.asList(C21499.m48666(c177143, false, false).f3786));
                    } else if (m38343 == 6) {
                        C17714 c177144 = new C17714(m383432);
                        interfaceC8424.readFully(c177144.m41482(), 0, m383432);
                        c177144.m41478(4);
                        c6307 = c6307.m17436(AbstractC14545.of((Object) C3133.m9555(c177144)));
                    } else {
                        interfaceC8424.mo22070(m383432);
                    }
                }
                String str = C3603.f11424;
                this.f55967 = c6307;
                z2 = m38352;
            }
            this.f55967.getClass();
            this.f55965 = Math.max(this.f55967.f19528, 6);
            C8353 m17438 = this.f55967.m17438(bArr, this.f55963);
            InterfaceC19383 interfaceC19383 = this.f55962;
            C1297 m21948 = m17438.m21948();
            m21948.m4462("audio/flac");
            interfaceC19383.mo8456(m21948.m4440());
            this.f55962.mo8454(this.f55967.m17435());
            this.f55968 = 4;
            return 0;
        }
        long j2 = 0;
        if (i == 4) {
            interfaceC8424.mo22066();
            C17714 c177145 = new C17714(2);
            interfaceC8424.mo22061(0, 2, c177145.m41482());
            int m41464 = c177145.m41464();
            if ((m41464 >> 2) != 16382) {
                interfaceC8424.mo22066();
                throw C9080.m23440("First frame does not start with sync code.", (Throwable) null);
            }
            interfaceC8424.mo22066();
            this.f55973 = m41464;
            InterfaceC21830 interfaceC21830 = this.f55970;
            String str2 = C3603.f11424;
            long position = interfaceC8424.getPosition();
            long length = interfaceC8424.getLength();
            this.f55967.getClass();
            C6307 c63072 = this.f55967;
            C10541 c10541 = c63072.f19529;
            if (c10541 != null && c10541.f31649.length > 0) {
                c20794 = new C12657(c63072, position);
            } else if (length == -1 || c63072.f19533 <= 0) {
                c20794 = new C20794(c63072.m17435());
            } else {
                C16538 c16538 = new C16538(c63072, this.f55973, position, length);
                this.f55960 = c16538;
                c20794 = c16538.m52771();
            }
            interfaceC21830.mo3430(c20794);
            this.f55968 = 5;
            return 0;
        }
        if (i != 5) {
            throw new IllegalStateException();
        }
        this.f55962.getClass();
        this.f55967.getClass();
        C16538 c165382 = this.f55960;
        if (c165382 != null && c165382.m52773()) {
            return this.f55960.m52770(interfaceC8424, c23615);
        }
        if (this.f55971 == -1) {
            C6307 c63073 = this.f55967;
            interfaceC8424.mo22066();
            interfaceC8424.mo22060(1);
            byte[] bArr4 = new byte[1];
            interfaceC8424.mo22061(0, 1, bArr4);
            boolean z3 = (bArr4[0] & 1) == 1;
            interfaceC8424.mo22060(2);
            int i2 = z3 ? 7 : 6;
            C17714 c177146 = new C17714(i2);
            byte[] m41482 = c177146.m41482();
            int i3 = 0;
            while (i3 < i2) {
                int mo22065 = interfaceC8424.mo22065(i3, i2 - i3, m41482);
                if (mo22065 == -1) {
                    break;
                }
                i3 += mo22065;
            }
            c177146.m41486(i3);
            interfaceC8424.mo22066();
            try {
                long m41476 = c177146.m41476();
                if (!z3) {
                    m41476 *= c63073.f19536;
                }
                j2 = m41476;
            } catch (NumberFormatException unused) {
                r4 = false;
            }
            if (!r4) {
                throw C9080.m23440((String) null, (Throwable) null);
            }
            this.f55971 = j2;
        } else {
            C17714 c177147 = this.f55966;
            int m41483 = c177147.m41483();
            if (m41483 < 32768) {
                int read = interfaceC8424.read(c177147.m41482(), m41483, 32768 - m41483);
                r4 = read == -1;
                if (!r4) {
                    c177147.m41486(m41483 + read);
                } else if (c177147.m41457() == 0) {
                    long j3 = this.f55971 * 1000000;
                    C6307 c63074 = this.f55967;
                    String str3 = C3603.f11424;
                    this.f55962.mo8455(j3 / c63074.f19537, 1, this.f55969, 0, null);
                    return -1;
                }
            } else {
                r4 = false;
            }
            int m41485 = c177147.m41485();
            int i4 = this.f55969;
            int i5 = this.f55965;
            if (i4 < i5) {
                c177147.m41478(Math.min(i5 - i4, c177147.m41457()));
            }
            this.f55967.getClass();
            int m414852 = c177147.m41485();
            while (true) {
                int m414832 = c177147.m41483() - 16;
                C4896 c4896 = this.f55964;
                if (m414852 <= m414832) {
                    c177147.m41484(m414852);
                    if (C3485.m10668(c177147, this.f55967, this.f55973, c4896)) {
                        c177147.m41484(m414852);
                        j = c4896.f15458;
                        break;
                    }
                    m414852++;
                } else {
                    if (r4) {
                        while (m414852 <= c177147.m41483() - this.f55965) {
                            c177147.m41484(m414852);
                            try {
                                z = C3485.m10668(c177147, this.f55967, this.f55973, c4896);
                            } catch (IndexOutOfBoundsException unused2) {
                                z = false;
                            }
                            if (c177147.m41485() > c177147.m41483()) {
                                z = false;
                            }
                            if (z) {
                                c177147.m41484(m414852);
                                j = c4896.f15458;
                                break;
                            }
                            m414852++;
                        }
                        c177147.m41484(c177147.m41483());
                    } else {
                        c177147.m41484(m414852);
                    }
                    j = -1;
                }
            }
            int m414853 = c177147.m41485() - m41485;
            c177147.m41484(m41485);
            this.f55962.mo8453(m414853, c177147);
            int i6 = this.f55969 + m414853;
            this.f55969 = i6;
            if (j != -1) {
                long j4 = this.f55971 * 1000000;
                C6307 c63075 = this.f55967;
                String str4 = C3603.f11424;
                this.f55962.mo8455(j4 / c63075.f19537, 1, i6, 0, null);
                this.f55969 = 0;
                this.f55971 = j;
            }
            int length2 = c177147.m41482().length - c177147.m41483();
            if (c177147.m41457() < 16 && length2 < 16) {
                int m41457 = c177147.m41457();
                System.arraycopy(c177147.m41482(), c177147.m41485(), c177147.m41482(), 0, m41457);
                c177147.m41484(0);
                c177147.m41486(m41457);
            }
        }
        return 0;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        if (j == 0) {
            this.f55968 = 0;
        } else {
            C16538 c16538 = this.f55960;
            if (c16538 != null) {
                c16538.m52772(j2);
            }
        }
        this.f55971 = j2 != 0 ? -1L : 0L;
        this.f55969 = 0;
        this.f55966.m41481(0);
    }
}
