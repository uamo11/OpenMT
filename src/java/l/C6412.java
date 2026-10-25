package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: T8UY */
/* renamed from: l.ۜ֡ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6412 implements InterfaceC15583 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final byte[] f19823 = {73, 68, 51};

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f19825;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f19827;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f19829;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f19832;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f19833;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f19835;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f19836;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f19837;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f19838;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f19839;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f19840;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f19841;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String f19842;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f19846;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16302 f19826 = new C16302(new byte[7], 7);

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C17714 f19828 = new C17714(Arrays.copyOf(f19823, 10));

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f19843 = -1;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f19830 = -1;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f19831 = -9223372036854775807L;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f19845 = -9223372036854775807L;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f19844 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f19834 = 0;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f19824 = 256;

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1004(boolean z) {
    }

    public C6412(String str, int i, String str2, boolean z) {
        this.f19846 = z;
        this.f19842 = str;
        this.f19825 = i;
        this.f19838 = str2;
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1000() {
        this.f19845 = -9223372036854775807L;
        this.f19832 = false;
        this.f19844 = 0;
        this.f19834 = 0;
        this.f19824 = 256;
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1003(InterfaceC21830 interfaceC21830, C19259 c19259) {
        c19259.m44443();
        this.f19833 = c19259.m44444();
        InterfaceC19383 mo3429 = interfaceC21830.mo3429(c19259.m44445(), 1);
        this.f19829 = mo3429;
        this.f19839 = mo3429;
        if (this.f19846) {
            c19259.m44443();
            InterfaceC19383 mo34292 = interfaceC21830.mo3429(c19259.m44445(), 5);
            this.f19841 = mo34292;
            C1297 c1297 = new C1297();
            c1297.m4469(c19259.m44444());
            c1297.m4462(this.f19838);
            c1297.m4465("application/id3");
            mo34292.mo8456(c1297.m4440());
            return;
        }
        this.f19841 = new C19714();
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1001(int i, long j) {
        this.f19845 = j;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m17743() {
        return this.f19831;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1002(C17714 c17714) {
        int i;
        long j;
        int i2;
        byte b;
        int i3;
        this.f19829.getClass();
        String str = C3603.f11424;
        while (c17714.m41457() > 0) {
            int i4 = this.f19844;
            C17714 c177142 = this.f19828;
            C16302 c16302 = this.f19826;
            int i5 = 0;
            int i6 = 4;
            int i7 = 1;
            if (i4 == 0) {
                byte[] m41482 = c17714.m41482();
                int m41485 = c17714.m41485();
                int m41483 = c17714.m41483();
                while (true) {
                    if (m41485 < m41483) {
                        i2 = m41485 + 1;
                        b = m41482[m41485];
                        int i8 = b & 255;
                        if (this.f19824 == 512 && (((((byte) i8) & 255 ? 1 : 0) | 65280 ? 1 : 0) & 65526) == 65520) {
                            if (!this.f19832) {
                                int i9 = m41485 - 1;
                                c17714.m41484(m41485);
                                byte[] bArr = c16302.f50146;
                                if (c17714.m41457() >= i7) {
                                    c17714.m41461(i5, i7, bArr);
                                    c16302.m38354(i6);
                                    int m38343 = c16302.m38343(i7);
                                    int i10 = this.f19843;
                                    if (i10 == -1 || m38343 == i10) {
                                        if (this.f19830 != -1) {
                                            byte[] bArr2 = c16302.f50146;
                                            if (c17714.m41457() < i7) {
                                                break;
                                            }
                                            c17714.m41461(i5, i7, bArr2);
                                            c16302.m38354(2);
                                            i3 = 4;
                                            if (c16302.m38343(4) == this.f19830) {
                                                c17714.m41484(i2);
                                            }
                                        } else {
                                            i3 = 4;
                                        }
                                        byte[] bArr3 = c16302.f50146;
                                        if (c17714.m41457() >= i3) {
                                            c17714.m41461(i5, i3, bArr3);
                                            c16302.m38354(14);
                                            int m383432 = c16302.m38343(13);
                                            if (m383432 >= 7) {
                                                byte[] m414822 = c17714.m41482();
                                                int m414832 = c17714.m41483();
                                                int i11 = i9 + m383432;
                                                if (i11 >= m414832) {
                                                    break;
                                                }
                                                byte b2 = m414822[i11];
                                                if (b2 != -1) {
                                                    if (b2 == 73) {
                                                        int i12 = i11 + 1;
                                                        if (i12 != m414832) {
                                                            if (m414822[i12] == 68) {
                                                                int i13 = i11 + 2;
                                                                if (i13 != m414832) {
                                                                    if (m414822[i13] == 51) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    int i14 = i11 + 1;
                                                    if (i14 != m414832) {
                                                        byte b3 = m414822[i14];
                                                        if ((((b3 & 255 ? 1 : 0) | 65280 ? 1 : 0) & 65526) == 65520 && ((b3 & 8) >> 3) == m38343) {
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        int i15 = this.f19824;
                        int i16 = i8 | i15;
                        if (i16 == 329) {
                            this.f19824 = 768;
                        } else if (i16 == 511) {
                            this.f19824 = 512;
                        } else if (i16 == 836) {
                            this.f19824 = 1024;
                        } else {
                            if (i16 == 1075) {
                                this.f19844 = 2;
                                this.f19834 = 3;
                                this.f19836 = 0;
                                c177142.m41484(0);
                                c17714.m41484(i2);
                                break;
                            }
                            if (i15 != 256) {
                                this.f19824 = 256;
                                i6 = 4;
                                i7 = 1;
                                i5 = 0;
                            }
                        }
                        m41485 = i2;
                        i6 = 4;
                        i7 = 1;
                        i5 = 0;
                    } else {
                        c17714.m41484(m41485);
                        break;
                    }
                }
                this.f19840 = (b & 8) >> 3;
                this.f19837 = (b & 1) == 0;
                if (this.f19832) {
                    this.f19844 = 3;
                    this.f19834 = 0;
                } else {
                    this.f19844 = 1;
                    this.f19834 = 0;
                }
                c17714.m41484(i2);
            } else if (i4 != 1) {
                if (i4 == 2) {
                    byte[] m414823 = c177142.m41482();
                    int min = Math.min(c17714.m41457(), 10 - this.f19834);
                    c17714.m41461(this.f19834, min, m414823);
                    int i17 = this.f19834 + min;
                    this.f19834 = i17;
                    if (i17 == 10) {
                        this.f19841.mo8453(10, c177142);
                        c177142.m41484(6);
                        InterfaceC19383 interfaceC19383 = this.f19841;
                        i = c177142.m41467() + 10;
                        this.f19844 = 4;
                        this.f19834 = 10;
                        this.f19839 = interfaceC19383;
                        j = 0;
                        this.f19835 = j;
                        this.f19836 = i;
                    }
                } else if (i4 == 3) {
                    int i18 = this.f19837 ? 7 : 5;
                    byte[] bArr4 = c16302.f50146;
                    int min2 = Math.min(c17714.m41457(), i18 - this.f19834);
                    c17714.m41461(this.f19834, min2, bArr4);
                    int i19 = this.f19834 + min2;
                    this.f19834 = i19;
                    if (i19 == i18) {
                        c16302.m38354(0);
                        if (!this.f19827) {
                            int m383433 = c16302.m38343(2) + 1;
                            if (m383433 != 2) {
                                C19956.m46037("Detected audio object type: " + m383433 + ", but assuming AAC LC.");
                                m383433 = 2;
                            }
                            c16302.m38351(5);
                            int m383434 = c16302.m38343(3);
                            int i20 = this.f19830;
                            byte[] bArr5 = {(byte) (((m383433 << 3) & 248) | ((i20 >> 1) & 7)), (byte) (((m383434 << 3) & UMErrorCode.E_UM_BE_NOT_MAINPROCESS) | ((i20 << 7) & 128))};
                            C12948 m29741 = C12243.m29741(new C16302(bArr5, 2), false);
                            C1297 c1297 = new C1297();
                            c1297.m4469(this.f19833);
                            c1297.m4462(this.f19838);
                            c1297.m4465("audio/mp4a-latm");
                            c1297.m4445(m29741.f38845);
                            c1297.m4472(m29741.f38844);
                            c1297.m4456(m29741.f38846);
                            c1297.m4446(Collections.singletonList(bArr5));
                            c1297.m4471(this.f19842);
                            c1297.m4454(this.f19825);
                            C8353 m4440 = c1297.m4440();
                            this.f19831 = 1024000000 / m4440.f25624;
                            this.f19829.mo8456(m4440);
                            this.f19827 = true;
                        } else {
                            c16302.m38351(10);
                        }
                        c16302.m38351(4);
                        int m383435 = c16302.m38343(13);
                        i = m383435 - 7;
                        if (this.f19837) {
                            i = m383435 - 9;
                        }
                        InterfaceC19383 interfaceC193832 = this.f19829;
                        j = this.f19831;
                        this.f19844 = 4;
                        this.f19834 = 0;
                        this.f19839 = interfaceC193832;
                        this.f19835 = j;
                        this.f19836 = i;
                    }
                } else {
                    if (i4 != 4) {
                        throw new IllegalStateException();
                    }
                    int min3 = Math.min(c17714.m41457(), this.f19836 - this.f19834);
                    this.f19839.mo8453(min3, c17714);
                    int i21 = this.f19834 + min3;
                    this.f19834 = i21;
                    if (i21 == this.f19836) {
                        C22632.m50634(this.f19845 != -9223372036854775807L);
                        this.f19839.mo8455(this.f19845, 1, this.f19836, 0, null);
                        this.f19845 += this.f19835;
                        this.f19844 = 0;
                        this.f19834 = 0;
                        this.f19824 = 256;
                    }
                }
            } else if (c17714.m41457() != 0) {
                c16302.f50146[0] = c17714.m41482()[c17714.m41485()];
                c16302.m38354(2);
                int m383436 = c16302.m38343(4);
                int i22 = this.f19830;
                if (i22 != -1 && m383436 != i22) {
                    this.f19832 = false;
                    this.f19844 = 0;
                    this.f19834 = 0;
                    this.f19824 = 256;
                } else {
                    if (!this.f19832) {
                        this.f19832 = true;
                        this.f19843 = this.f19840;
                        this.f19830 = m383436;
                    }
                    this.f19844 = 3;
                    this.f19834 = 0;
                }
            }
        }
    }
}
