package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* compiled from: J9OT */
/* renamed from: l.ۨۜۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11531 extends AbstractC7297 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f34430;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f34431;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f34432;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f34433;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f34434;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f34435;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f34436;

    public C11531(boolean z, int i, int i2, byte[] bArr) {
        super(0);
        this.f34436 = Integer.MAX_VALUE;
        this.f34434 = bArr;
        this.f34435 = i2 + i;
        this.f34432 = i;
        this.f34431 = i;
    }

    @Override // l.AbstractC7297
    /* renamed from: ܶ */
    public final int mo19567() {
        if (mo19572()) {
            this.f34430 = 0;
            return 0;
        }
        int mo19558 = mo19558();
        this.f34430 = mo19558;
        if ((mo19558 >>> 3) != 0) {
            return mo19558;
        }
        throw C2025.m6581();
    }

    @Override // l.AbstractC7297
    /* renamed from: ֫ */
    public final void mo19554(int i) {
        if (this.f34430 != i) {
            throw C2025.m6579();
        }
    }

    @Override // l.AbstractC7297
    /* renamed from: ᩳ */
    public final boolean mo19573(int i) {
        int mo19567;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.f34435 - this.f34432;
            byte[] bArr = this.f34434;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.f34432;
                    this.f34432 = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw C2025.m6580();
            }
            while (i3 < 10) {
                int i6 = this.f34432;
                if (i6 == this.f34435) {
                    throw C2025.m6584();
                }
                this.f34432 = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw C2025.m6580();
            return true;
        }
        if (i2 == 1) {
            m28407(8);
            return true;
        }
        if (i2 == 2) {
            m28407(mo19558());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                m28407(4);
                return true;
            }
            throw C2025.m6582();
        }
        do {
            mo19567 = mo19567();
            if (mo19567 == 0) {
                break;
            }
        } while (mo19573(mo19567));
        mo19554(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // l.AbstractC7297
    /* renamed from: ᩻ */
    public final double mo19579() {
        return Double.longBitsToDouble(m28405());
    }

    @Override // l.AbstractC7297
    /* renamed from: ۡ */
    public final float mo19562() {
        return Float.intBitsToFloat(m28408());
    }

    @Override // l.AbstractC7297
    /* renamed from: ᩹ */
    public final long mo19578() {
        return m28404();
    }

    @Override // l.AbstractC7297
    /* renamed from: ۖ */
    public final long mo19557() {
        return m28404();
    }

    @Override // l.AbstractC7297
    /* renamed from: ܺ */
    public final int mo19568() {
        return mo19558();
    }

    @Override // l.AbstractC7297
    /* renamed from: ۢ */
    public final long mo19563() {
        return m28405();
    }

    @Override // l.AbstractC7297
    /* renamed from: ᩷ */
    public final int mo19576() {
        return m28408();
    }

    @Override // l.AbstractC7297
    /* renamed from: ܿ */
    public final boolean mo19571() {
        return m28404() != 0;
    }

    @Override // l.AbstractC7297
    /* renamed from: ֨ */
    public final String mo19551() {
        int mo19558 = mo19558();
        if (mo19558 > 0) {
            int i = this.f34435;
            int i2 = this.f34432;
            if (mo19558 <= i - i2) {
                String str = new String(this.f34434, i2, mo19558, C13997.f41724);
                this.f34432 += mo19558;
                return str;
            }
        }
        if (mo19558 == 0) {
            return "";
        }
        if (mo19558 < 0) {
            throw C2025.m6585();
        }
        throw C2025.m6584();
    }

    @Override // l.AbstractC7297
    /* renamed from: ۠ */
    public final String mo19561() {
        int mo19558 = mo19558();
        if (mo19558 > 0) {
            int i = this.f34435;
            int i2 = this.f34432;
            if (mo19558 <= i - i2) {
                String m29455 = C12071.m29455(i2, mo19558, this.f34434);
                this.f34432 += mo19558;
                return m29455;
            }
        }
        if (mo19558 == 0) {
            return "";
        }
        if (mo19558 <= 0) {
            throw C2025.m6585();
        }
        throw C2025.m6584();
    }

    @Override // l.AbstractC7297
    /* renamed from: ֫ */
    public final void mo19555(int i, InterfaceC9228 interfaceC9228, C17798 c17798) {
        m19553();
        this.f22399++;
        interfaceC9228.mergeFrom(this, c17798);
        mo19554((i << 3) | 4);
        this.f22399--;
    }

    @Override // l.AbstractC7297
    /* renamed from: ֫ */
    public final void mo19556(InterfaceC9228 interfaceC9228, C17798 c17798) {
        int mo19558 = mo19558();
        m19553();
        int mo19570 = mo19570(mo19558);
        this.f22399++;
        interfaceC9228.mergeFrom(this, c17798);
        mo19554(0);
        this.f22399--;
        if (mo19564() != 0) {
            throw C2025.m6584();
        }
        mo19565(mo19570);
    }

    @Override // l.AbstractC7297
    /* renamed from: ֫ */
    public final InterfaceC8522 mo19552(InterfaceC12050 interfaceC12050, C17798 c17798) {
        int mo19558 = mo19558();
        m19553();
        int mo19570 = mo19570(mo19558);
        this.f22399++;
        InterfaceC8522 interfaceC8522 = (InterfaceC8522) interfaceC12050.parsePartialFrom(this, c17798);
        mo19554(0);
        this.f22399--;
        if (mo19564() != 0) {
            throw C2025.m6584();
        }
        mo19565(mo19570);
        return interfaceC8522;
    }

    @Override // l.AbstractC7297
    /* renamed from: ܳ */
    public final AbstractC5886 mo19566() {
        byte[] bArr;
        int mo19558 = mo19558();
        byte[] bArr2 = this.f34434;
        if (mo19558 > 0) {
            int i = this.f34435;
            int i2 = this.f34432;
            if (mo19558 <= i - i2) {
                AbstractC5886 m16490 = AbstractC5886.m16490(i2, mo19558, bArr2);
                this.f34432 += mo19558;
                return m16490;
            }
        }
        if (mo19558 == 0) {
            return AbstractC5886.f18080;
        }
        if (mo19558 > 0) {
            int i3 = this.f34435;
            int i4 = this.f34432;
            if (mo19558 <= i3 - i4) {
                int i5 = mo19558 + i4;
                this.f34432 = i5;
                bArr = Arrays.copyOfRange(bArr2, i4, i5);
                AbstractC5886 abstractC5886 = AbstractC5886.f18080;
                return new C12236(bArr);
            }
        }
        if (mo19558 > 0) {
            throw C2025.m6584();
        }
        if (mo19558 == 0) {
            bArr = C13997.f41722;
            AbstractC5886 abstractC58862 = AbstractC5886.f18080;
            return new C12236(bArr);
        }
        throw C2025.m6585();
    }

    @Override // l.AbstractC7297
    /* renamed from: ᩸ */
    public final int mo19577() {
        return mo19558();
    }

    @Override // l.AbstractC7297
    /* renamed from: ۜ */
    public final int mo19560() {
        return mo19558();
    }

    @Override // l.AbstractC7297
    /* renamed from: ᩴ */
    public final int mo19574() {
        return m28408();
    }

    @Override // l.AbstractC7297
    /* renamed from: ᩵ */
    public final long mo19575() {
        return m28405();
    }

    @Override // l.AbstractC7297
    /* renamed from: ֡ */
    public final int mo19550() {
        return AbstractC7297.m19549(mo19558());
    }

    @Override // l.AbstractC7297
    /* renamed from: ۚ */
    public final long mo19559() {
        return AbstractC7297.m19546(m28404());
    }

    @Override // l.AbstractC7297
    /* renamed from: ۘ */
    public final int mo19558() {
        int i;
        int i2 = this.f34432;
        int i3 = this.f34435;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f34434;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f34432 = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ a.g;
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << cb.f77931l) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f34432 = i5;
                return i;
            }
        }
        return (int) m28406();
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long m28404() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f34432;
        int i2 = this.f34435;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f34434;
            byte b = bArr[i];
            if (b >= 0) {
                this.f34432 = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ a.g;
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << cb.f77931l) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f34432 = i4;
                return j;
            }
        }
        return m28406();
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int m28408() {
        int i = this.f34432;
        if (this.f34435 - i < 4) {
            throw C2025.m6584();
        }
        this.f34432 = i + 4;
        byte[] bArr = this.f34434;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m28405() {
        int i = this.f34432;
        if (this.f34435 - i < 8) {
            throw C2025.m6584();
        }
        this.f34432 = i + 8;
        byte[] bArr = this.f34434;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // l.AbstractC7297
    /* renamed from: ܽ */
    public final int mo19570(int i) {
        if (i < 0) {
            throw C2025.m6585();
        }
        int mo19569 = i + mo19569();
        if (mo19569 < 0) {
            throw C2025.m6578();
        }
        int i2 = this.f34436;
        if (mo19569 > i2) {
            throw C2025.m6584();
        }
        this.f34436 = mo19569;
        m28403();
        return i2;
    }

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m28403() {
        int i = this.f34435 + this.f34433;
        this.f34435 = i;
        int i2 = i - this.f34431;
        int i3 = this.f34436;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f34433 = i4;
            this.f34435 = i - i4;
            return;
        }
        this.f34433 = 0;
    }

    @Override // l.AbstractC7297
    /* renamed from: ۧ */
    public final void mo19565(int i) {
        this.f34436 = i;
        m28403();
    }

    @Override // l.AbstractC7297
    /* renamed from: ۧ */
    public final int mo19564() {
        int i = this.f34436;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - mo19569();
    }

    @Override // l.AbstractC7297
    /* renamed from: ᩳ */
    public final boolean mo19572() {
        return this.f34432 == this.f34435;
    }

    @Override // l.AbstractC7297
    /* renamed from: ܽ */
    public final int mo19569() {
        return this.f34432 - this.f34431;
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long m28406() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f34432;
            if (i2 == this.f34435) {
                throw C2025.m6584();
            }
            this.f34432 = i2 + 1;
            j |= (r3 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << i;
            if ((this.f34434[i2] & GCMSIVBlockCipher.MASK) == 0) {
                return j;
            }
        }
        throw C2025.m6580();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m28407(int i) {
        if (i >= 0) {
            int i2 = this.f34435;
            int i3 = this.f34432;
            if (i <= i2 - i3) {
                this.f34432 = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw C2025.m6585();
        }
        throw C2025.m6584();
    }
}
