package l;

/* compiled from: M1T7 */
/* renamed from: l.᩷᩷֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21116 extends AbstractC17587 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C14764 f68106;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7004 f68107;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C22817 f68108;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C14764 f68109;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC5593 f68110;

    public C21116(C22817 c22817, AbstractC5593 abstractC5593, int i, int i2, int i3) {
        super(i3);
        this.f68109 = new C14764(this);
        this.f68106 = new C14764(this);
        this.f68108 = c22817;
        this.f68110 = abstractC5593;
        this.f68107 = new C7004(this, i, i2);
        mo8553();
    }

    @Override // l.AbstractC17587
    /* renamed from: ֫ */
    public final void mo8553() {
        super.mo8553();
        this.f68107.m18941();
        this.f68109.mo24895();
        this.f68106.mo24895();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m48081() {
        return this.f53746[0] == -1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48080() {
        int i;
        int i2;
        C22817 c22817 = this.f68108;
        c22817.m50926();
        while (true) {
            boolean m50924 = c22817.m50924();
            AbstractC5593 abstractC5593 = this.f68110;
            if (m50924) {
                int m50915 = c22817.m50915() & this.f53747;
                short[][] sArr = this.f53753;
                C0653 c0653 = this.f53750;
                if (abstractC5593.m15878(sArr[c0653.m2666()], m50915) == 0) {
                    this.f68107.m18940();
                } else {
                    int m15878 = abstractC5593.m15878(this.f53752, c0653.m2666());
                    int i3 = 1;
                    int[] iArr = this.f53746;
                    if (m15878 == 0) {
                        c0653.m2669();
                        iArr[3] = iArr[2];
                        iArr[2] = iArr[1];
                        iArr[1] = iArr[0];
                        i2 = this.f68109.m35068(m50915);
                        int m15879 = abstractC5593.m15879(this.f53748[i2 < 6 ? i2 - 2 : 3]);
                        if (m15879 < 4) {
                            iArr[0] = m15879;
                        } else {
                            int i4 = m15879 >> 1;
                            int i5 = (2 | (m15879 & 1)) << (i4 - 1);
                            iArr[0] = i5;
                            if (m15879 < 14) {
                                short[] sArr2 = this.f53751[m15879 - 4];
                                int i6 = 1;
                                int i7 = 0;
                                int i8 = 0;
                                while (true) {
                                    int m158782 = abstractC5593.m15878(sArr2, i6);
                                    i6 = (i6 << 1) | m158782;
                                    int i9 = i8 + 1;
                                    i7 |= m158782 << i8;
                                    if (i6 >= sArr2.length) {
                                        break;
                                    } else {
                                        i8 = i9;
                                    }
                                }
                                iArr[0] = i5 | i7;
                            } else {
                                int m15877 = i5 | (abstractC5593.m15877(i4 - 5) << 4);
                                iArr[0] = m15877;
                                int i10 = 1;
                                int i11 = 0;
                                int i12 = 0;
                                while (true) {
                                    short[] sArr3 = this.f53744;
                                    int m158783 = abstractC5593.m15878(sArr3, i10);
                                    i10 = (i10 << 1) | m158783;
                                    int i13 = i12 + 1;
                                    i11 |= m158783 << i12;
                                    if (i10 >= sArr3.length) {
                                        break;
                                    } else {
                                        i12 = i13;
                                    }
                                }
                                iArr[0] = m15877 | i11;
                            }
                        }
                    } else {
                        if (abstractC5593.m15878(this.f53749, c0653.m2666()) == 0) {
                            if (abstractC5593.m15878(this.f53755[c0653.m2666()], m50915) == 0) {
                                c0653.m2673();
                                i2 = i3;
                            }
                        } else {
                            if (abstractC5593.m15878(this.f53745, c0653.m2666()) == 0) {
                                i = iArr[1];
                            } else {
                                if (abstractC5593.m15878(this.f53754, c0653.m2666()) == 0) {
                                    i = iArr[2];
                                } else {
                                    i = iArr[3];
                                    iArr[3] = iArr[2];
                                }
                                iArr[2] = iArr[1];
                            }
                            iArr[1] = iArr[0];
                            iArr[0] = i;
                        }
                        c0653.m2671();
                        i3 = this.f68106.m35068(m50915);
                        i2 = i3;
                    }
                    c22817.m50919(iArr[0], i2);
                }
            } else {
                abstractC5593.mo4772();
                return;
            }
        }
    }
}
