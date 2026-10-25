package l;

import java.util.List;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;

/* compiled from: D8M7 */
/* renamed from: l.ۗ֡ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2885 implements InterfaceC15583 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f9194;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f9195;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f9197;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f9202;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f9203;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f9204;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f9205;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f9207;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f9208;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f9192 = 0;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C17714 f9201 = new C17714(new byte[15], 2);

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16302 f9211 = new C16302();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17714 f9206 = new C17714();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C12762 f9212 = new C12762();

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f9209 = SecP160R1Field.PInv;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f9210 = -1;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f9200 = -1;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f9196 = true;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f9198 = true;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public double f9193 = -9.223372036854776E18d;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public double f9199 = -9.223372036854776E18d;

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1004(boolean z) {
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1000() {
        this.f9192 = 0;
        this.f9197 = 0;
        this.f9201.m41481(2);
        this.f9195 = 0;
        this.f9203 = 0;
        this.f9209 = SecP160R1Field.PInv;
        this.f9210 = -1;
        this.f9204 = 0;
        this.f9200 = -1L;
        this.f9194 = false;
        this.f9202 = false;
        this.f9198 = true;
        this.f9196 = true;
        this.f9193 = -9.223372036854776E18d;
        this.f9199 = -9.223372036854776E18d;
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1003(InterfaceC21830 interfaceC21830, C19259 c19259) {
        c19259.m44443();
        this.f9207 = c19259.m44444();
        this.f9205 = interfaceC21830.mo3429(c19259.m44445(), 1);
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1001(int i, long j) {
        this.f9208 = i;
        if (!this.f9196 && (this.f9203 != 0 || !this.f9198)) {
            this.f9202 = true;
        }
        if (j != -9223372036854775807L) {
            if (this.f9202) {
                this.f9199 = j;
            } else {
                this.f9193 = j;
            }
        }
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1002(C17714 c17714) {
        int i;
        C22632.m50632(this.f9205);
        while (c17714.m41457() > 0) {
            int i2 = this.f9192;
            int i3 = 0;
            if (i2 == 0) {
                int i4 = this.f9208;
                if ((i4 & 2) != 0) {
                    if ((i4 & 4) == 0) {
                        while (c17714.m41457() > 0) {
                            int i5 = this.f9197 << 8;
                            this.f9197 = i5;
                            int m41456 = i5 | c17714.m41456();
                            this.f9197 = m41456;
                            if ((m41456 & 16777215) == 12583333) {
                                c17714.m41484(c17714.m41485() - 3);
                                this.f9197 = 0;
                            }
                        }
                    }
                    this.f9192 = 1;
                    break;
                }
                c17714.m41484(c17714.m41483());
            } else {
                C17714 c177142 = this.f9206;
                C12762 c12762 = this.f9212;
                if (i2 == 1) {
                    C17714 c177143 = this.f9201;
                    m8819(c17714, c177143, false);
                    if (c177143.m41457() != 0) {
                        this.f9198 = false;
                    } else {
                        int m41483 = c177143.m41483();
                        byte[] m41482 = c177143.m41482();
                        C16302 c16302 = this.f9211;
                        c16302.m38350(m41483, m41482);
                        boolean m25058 = C9941.m25058(c16302, c12762);
                        if (m25058) {
                            this.f9195 = 0;
                            this.f9203 = c12762.f38358 + m41483 + this.f9203;
                        }
                        if (m25058) {
                            c177143.m41484(0);
                            this.f9205.mo8453(c177143.m41483(), c177143);
                            c177143.m41481(2);
                            c177142.m41481(c12762.f38358);
                            this.f9198 = true;
                            this.f9192 = 2;
                        } else if (c177143.m41483() < 15) {
                            c177143.m41486(c177143.m41483() + 1);
                            this.f9198 = false;
                        }
                    }
                } else if (i2 == 2) {
                    int i6 = c12762.f38359;
                    if (i6 == 1 || i6 == 17) {
                        m8819(c17714, c177142, true);
                    }
                    int min = Math.min(c17714.m41457(), c12762.f38358 - this.f9195);
                    this.f9205.mo8453(min, c17714);
                    int i7 = this.f9195 + min;
                    this.f9195 = i7;
                    if (i7 == c12762.f38358) {
                        int i8 = c12762.f38359;
                        if (i8 == 1) {
                            byte[] m414822 = c177142.m41482();
                            C12057 m25057 = C9941.m25057(new C16302(m414822, m414822.length));
                            this.f9209 = m25057.f36064;
                            this.f9210 = m25057.f36065;
                            long j = this.f9200;
                            long j2 = c12762.f38357;
                            if (j != j2) {
                                this.f9200 = j2;
                                int i9 = m25057.f36063;
                                String concat = i9 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i9))) : "mhm1";
                                byte[] bArr = m25057.f36062;
                                AbstractC14545 of = (bArr == null || bArr.length <= 0) ? null : AbstractC14545.of((Object) C3603.f11423, (Object) bArr);
                                C1297 c1297 = new C1297();
                                c1297.m4469(this.f9207);
                                c1297.m4462("video/mp2t");
                                c1297.m4465("audio/mhm1");
                                c1297.m4456(this.f9209);
                                c1297.m4445(concat);
                                c1297.m4446((List) of);
                                this.f9205.mo8456(c1297.m4440());
                            }
                            this.f9194 = true;
                        } else if (i8 == 17) {
                            byte[] m414823 = c177142.m41482();
                            C16302 c163022 = new C16302(m414823, m414823.length);
                            if (c163022.m38352()) {
                                c163022.m38351(2);
                                i3 = c163022.m38343(13);
                            }
                            this.f9204 = i3;
                        } else if (i8 == 2) {
                            if (this.f9194) {
                                this.f9196 = false;
                                i = 1;
                            } else {
                                i = 0;
                            }
                            double d = ((this.f9210 - this.f9204) * 1000000.0d) / this.f9209;
                            long round = Math.round(this.f9193);
                            if (this.f9202) {
                                this.f9202 = false;
                                this.f9193 = this.f9199;
                            } else {
                                this.f9193 += d;
                            }
                            this.f9205.mo8455(round, i, this.f9203, 0, null);
                            this.f9194 = false;
                            this.f9204 = 0;
                            this.f9203 = 0;
                        }
                        this.f9192 = 1;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8819(C17714 c17714, C17714 c177142, boolean z) {
        int m41485 = c17714.m41485();
        int min = Math.min(c17714.m41457(), c177142.m41457());
        c17714.m41461(c177142.m41485(), min, c177142.m41482());
        c177142.m41478(min);
        if (z) {
            c17714.m41484(m41485);
        }
    }
}
