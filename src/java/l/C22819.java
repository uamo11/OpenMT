package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* compiled from: J9OT */
/* renamed from: l.᩺ۜۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22819 extends AbstractC7297 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f73674;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f73675;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f73676;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f73677;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f73678;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f73679;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InputStream f73680;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f73681;

    public C22819(InputStream inputStream) {
        super(0);
        this.f73674 = Integer.MAX_VALUE;
        C13997.m33482(inputStream, "input");
        this.f73680 = inputStream;
        this.f73679 = new byte[4096];
        this.f73677 = 0;
        this.f73675 = 0;
        this.f73678 = 0;
    }

    @Override // l.AbstractC7297
    /* renamed from: ܶ */
    public final int mo19567() {
        if (mo19572()) {
            this.f73676 = 0;
            return 0;
        }
        int mo19558 = mo19558();
        this.f73676 = mo19558;
        if ((mo19558 >>> 3) != 0) {
            return mo19558;
        }
        throw C2025.m6581();
    }

    @Override // l.AbstractC7297
    /* renamed from: ֫ */
    public final void mo19554(int i) {
        if (this.f73676 != i) {
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
            int i4 = this.f73677 - this.f73675;
            byte[] bArr = this.f73679;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.f73675;
                    this.f73675 = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw C2025.m6580();
            }
            while (i3 < 10) {
                if (this.f73675 == this.f73677) {
                    m50929(1);
                }
                int i6 = this.f73675;
                this.f73675 = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw C2025.m6580();
            return true;
        }
        if (i2 == 1) {
            m50936(8);
            return true;
        }
        if (i2 == 2) {
            m50936(mo19558());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                m50936(4);
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
        return Double.longBitsToDouble(m50934());
    }

    @Override // l.AbstractC7297
    /* renamed from: ۡ */
    public final float mo19562() {
        return Float.intBitsToFloat(m50937());
    }

    @Override // l.AbstractC7297
    /* renamed from: ᩹ */
    public final long mo19578() {
        return m50933();
    }

    @Override // l.AbstractC7297
    /* renamed from: ۖ */
    public final long mo19557() {
        return m50933();
    }

    @Override // l.AbstractC7297
    /* renamed from: ܺ */
    public final int mo19568() {
        return mo19558();
    }

    @Override // l.AbstractC7297
    /* renamed from: ۢ */
    public final long mo19563() {
        return m50934();
    }

    @Override // l.AbstractC7297
    /* renamed from: ᩷ */
    public final int mo19576() {
        return m50937();
    }

    @Override // l.AbstractC7297
    /* renamed from: ܿ */
    public final boolean mo19571() {
        return m50933() != 0;
    }

    @Override // l.AbstractC7297
    /* renamed from: ֨ */
    public final String mo19551() {
        int mo19558 = mo19558();
        byte[] bArr = this.f73679;
        if (mo19558 > 0) {
            int i = this.f73677;
            int i2 = this.f73675;
            if (mo19558 <= i - i2) {
                String str = new String(bArr, i2, mo19558, C13997.f41724);
                this.f73675 += mo19558;
                return str;
            }
        }
        if (mo19558 == 0) {
            return "";
        }
        if (mo19558 < 0) {
            throw C2025.m6585();
        }
        if (mo19558 <= this.f73677) {
            m50929(mo19558);
            String str2 = new String(bArr, this.f73675, mo19558, C13997.f41724);
            this.f73675 += mo19558;
            return str2;
        }
        return new String(m50932(mo19558), C13997.f41724);
    }

    @Override // l.AbstractC7297
    /* renamed from: ۠ */
    public final String mo19561() {
        int mo19558 = mo19558();
        int i = this.f73675;
        int i2 = this.f73677;
        int i3 = i2 - i;
        byte[] bArr = this.f73679;
        if (mo19558 <= i3 && mo19558 > 0) {
            this.f73675 = i + mo19558;
        } else {
            if (mo19558 == 0) {
                return "";
            }
            if (mo19558 < 0) {
                throw C2025.m6585();
            }
            i = 0;
            if (mo19558 <= i2) {
                m50929(mo19558);
                this.f73675 = mo19558;
            } else {
                bArr = m50932(mo19558);
            }
        }
        return C12071.m29455(i, mo19558, bArr);
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
        int mo19558 = mo19558();
        int i = this.f73677;
        int i2 = this.f73675;
        int i3 = i - i2;
        byte[] bArr = this.f73679;
        if (mo19558 <= i3 && mo19558 > 0) {
            AbstractC5886 m16490 = AbstractC5886.m16490(i2, mo19558, bArr);
            this.f73675 += mo19558;
            return m16490;
        }
        if (mo19558 == 0) {
            return AbstractC5886.f18080;
        }
        if (mo19558 < 0) {
            throw C2025.m6585();
        }
        byte[] m50927 = m50927(mo19558);
        if (m50927 != null) {
            return AbstractC5886.m16490(0, m50927.length, m50927);
        }
        int i4 = this.f73675;
        int i5 = this.f73677;
        int i6 = i5 - i4;
        this.f73678 += i5;
        this.f73675 = 0;
        this.f73677 = 0;
        ArrayList m50931 = m50931(mo19558 - i6);
        byte[] bArr2 = new byte[mo19558];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        Iterator it = m50931.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
            i6 += bArr3.length;
        }
        AbstractC5886 abstractC5886 = AbstractC5886.f18080;
        return new C12236(bArr2);
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
        return m50937();
    }

    @Override // l.AbstractC7297
    /* renamed from: ᩵ */
    public final long mo19575() {
        return m50934();
    }

    @Override // l.AbstractC7297
    /* renamed from: ֡ */
    public final int mo19550() {
        return AbstractC7297.m19549(mo19558());
    }

    @Override // l.AbstractC7297
    /* renamed from: ۚ */
    public final long mo19559() {
        return AbstractC7297.m19546(m50933());
    }

    @Override // l.AbstractC7297
    /* renamed from: ۘ */
    public final int mo19558() {
        int i;
        int i2 = this.f73675;
        int i3 = this.f73677;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f73679;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f73675 = i4;
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
                this.f73675 = i5;
                return i;
            }
        }
        return (int) m50935();
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long m50933() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f73675;
        int i2 = this.f73677;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f73679;
            byte b = bArr[i];
            if (b >= 0) {
                this.f73675 = i3;
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
                this.f73675 = i4;
                return j;
            }
        }
        return m50935();
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int m50937() {
        int i = this.f73675;
        if (this.f73677 - i < 4) {
            m50929(4);
            i = this.f73675;
        }
        this.f73675 = i + 4;
        byte[] bArr = this.f73679;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m50934() {
        int i = this.f73675;
        if (this.f73677 - i < 8) {
            m50929(8);
            i = this.f73675;
        }
        this.f73675 = i + 8;
        byte[] bArr = this.f73679;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // l.AbstractC7297
    /* renamed from: ܽ */
    public final int mo19570(int i) {
        if (i < 0) {
            throw C2025.m6585();
        }
        int i2 = this.f73678 + this.f73675 + i;
        int i3 = this.f73674;
        if (i2 > i3) {
            throw C2025.m6584();
        }
        this.f73674 = i2;
        m50930();
        return i3;
    }

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m50930() {
        int i = this.f73677 + this.f73681;
        this.f73677 = i;
        int i2 = this.f73678 + i;
        int i3 = this.f73674;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f73681 = i4;
            this.f73677 = i - i4;
            return;
        }
        this.f73681 = 0;
    }

    @Override // l.AbstractC7297
    /* renamed from: ۧ */
    public final void mo19565(int i) {
        this.f73674 = i;
        m50930();
    }

    @Override // l.AbstractC7297
    /* renamed from: ۧ */
    public final int mo19564() {
        int i = this.f73674;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f73678 + this.f73675);
    }

    @Override // l.AbstractC7297
    /* renamed from: ᩳ */
    public final boolean mo19572() {
        return this.f73675 == this.f73677 && !m50928(1);
    }

    @Override // l.AbstractC7297
    /* renamed from: ܽ */
    public final int mo19569() {
        return this.f73678 + this.f73675;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m50929(int i) {
        if (m50928(i)) {
            return;
        }
        if (i > (this.f22401 - this.f73678) - this.f73675) {
            throw new C2025("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw C2025.m6584();
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private boolean m50928(int i) {
        int i2 = this.f73675;
        int i3 = i2 + i;
        int i4 = this.f73677;
        if (i3 <= i4) {
            throw new IllegalStateException(C18307.m42645(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.f73678;
        int i6 = this.f22401;
        if (i <= (i6 - i5) - i2 && i5 + i2 + i <= this.f73674) {
            byte[] bArr = this.f73679;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f73678 += i2;
                this.f73677 -= i2;
                this.f73675 = 0;
            }
            int i7 = this.f73677;
            int min = Math.min(bArr.length - i7, (i6 - this.f73678) - i7);
            InputStream inputStream = this.f73680;
            int read = inputStream.read(bArr, i7, min);
            if (read == 0 || read < -1 || read > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read > 0) {
                this.f73677 += read;
                m50930();
                if (this.f73677 >= i) {
                    return true;
                }
                return m50928(i);
            }
        }
        return false;
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long m50935() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f73675 == this.f73677) {
                m50929(1);
            }
            int i2 = this.f73675;
            this.f73675 = i2 + 1;
            j |= (r3 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << i;
            if ((this.f73679[i2] & GCMSIVBlockCipher.MASK) == 0) {
                return j;
            }
        }
        throw C2025.m6580();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private byte[] m50932(int i) {
        byte[] m50927 = m50927(i);
        if (m50927 != null) {
            return m50927;
        }
        int i2 = this.f73675;
        int i3 = this.f73677;
        int i4 = i3 - i2;
        this.f73678 += i3;
        this.f73675 = 0;
        this.f73677 = 0;
        ArrayList m50931 = m50931(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f73679, i2, bArr, 0, i4);
        Iterator it = m50931.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private byte[] m50927(int i) {
        if (i == 0) {
            return C13997.f41722;
        }
        if (i < 0) {
            throw C2025.m6585();
        }
        int i2 = this.f73678;
        int i3 = this.f73675;
        int i4 = i2 + i3 + i;
        if (i4 - this.f22401 > 0) {
            throw new C2025("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f73674;
        if (i4 > i5) {
            m50936((i5 - i2) - i3);
            throw C2025.m6584();
        }
        int i6 = this.f73677 - i3;
        int i7 = i - i6;
        InputStream inputStream = this.f73680;
        if (i7 >= 4096 && i7 > inputStream.available()) {
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f73679, this.f73675, bArr, 0, i6);
        this.f73678 += this.f73677;
        this.f73675 = 0;
        this.f73677 = 0;
        while (i6 < i) {
            int read = inputStream.read(bArr, i6, i - i6);
            if (read == -1) {
                throw C2025.m6584();
            }
            this.f73678 += read;
            i6 += read;
        }
        return bArr;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private ArrayList m50931(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.f73680.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw C2025.m6584();
                }
                this.f73678 += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m50936(int i) {
        int i2 = this.f73677;
        int i3 = this.f73675;
        if (i <= i2 - i3 && i >= 0) {
            this.f73675 = i3 + i;
            return;
        }
        InputStream inputStream = this.f73680;
        if (i < 0) {
            throw C2025.m6585();
        }
        int i4 = this.f73678;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.f73674;
        if (i6 > i7) {
            m50936((i7 - i4) - i3);
            throw C2025.m6584();
        }
        this.f73678 = i5;
        int i8 = i2 - i3;
        this.f73677 = 0;
        this.f73675 = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                long skip = inputStream.skip(j);
                if (skip < 0 || skip > j) {
                    throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                }
                if (skip == 0) {
                    break;
                } else {
                    i8 += (int) skip;
                }
            } finally {
                this.f73678 += i8;
                m50930();
            }
        }
        if (i8 >= i) {
            return;
        }
        int i9 = this.f73677;
        int i10 = i9 - this.f73675;
        this.f73675 = i9;
        m50929(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f73677;
            if (i11 > i12) {
                i10 += i12;
                this.f73675 = i12;
                m50929(1);
            } else {
                this.f73675 = i11;
                return;
            }
        }
    }
}
