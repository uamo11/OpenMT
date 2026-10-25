package l;

/* compiled from: OAR3 */
/* renamed from: l.ۜ۟ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6617 extends AbstractC14377 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17200 f20372;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8734 f20373;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f20374;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f20375;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17200 f20376;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f20377;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f20378 = C5659.f17466;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EnumC15788 f20379;

    public C6617(C8734 c8734, EnumC15788 enumC15788, int[] iArr, int[] iArr2) {
        C17200 m22588;
        C17200 m225882;
        this.f20373 = c8734;
        this.f20379 = enumC15788;
        m22588 = C8734.m22588(iArr);
        this.f20376 = m22588;
        m225882 = C8734.m22588(iArr2);
        this.f20372 = m225882;
    }

    @Override // l.AbstractC14377
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC15788 mo18150() {
        return this.f20374 ? EnumC15788.INITIAL : this.f20379;
    }

    @Override // l.AbstractC14377
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo18148(byte[] bArr, int i, int i2) {
        int i3;
        C13150 c13150;
        int m22584;
        C23550 c23550;
        short[] sArr;
        C13150 c131502;
        int m225842;
        int[] iArr;
        C23550 c235502;
        int i4;
        if (i2 == 0) {
            return 0;
        }
        if (this.f20374) {
            return -1;
        }
        int i5 = this.f20377 - this.f20375;
        if (i5 > 0) {
            i3 = Math.min(i2, i5);
            System.arraycopy(this.f20378, this.f20375, bArr, i, i3);
            this.f20375 += i3;
        } else {
            i3 = 0;
        }
        while (true) {
            if (i3 >= i2) {
                break;
            }
            C8734 c8734 = this.f20373;
            c13150 = c8734.f26592;
            m22584 = C8734.m22584(c13150, this.f20376);
            if (m22584 >= 256) {
                if (m22584 > 256) {
                    sArr = C8734.f26588;
                    short s = sArr[m22584 - 257];
                    int m41887 = C17906.m41887(s >>> 5, C8734.m22580(c8734, s & 31));
                    c131502 = c8734.f26592;
                    m225842 = C8734.m22584(c131502, this.f20372);
                    iArr = C8734.f26589;
                    int i6 = iArr[m225842];
                    int m418872 = C17906.m41887(i6 >>> 4, C8734.m22580(c8734, i6 & 15));
                    if (this.f20378.length < m41887) {
                        this.f20378 = new byte[m41887];
                    }
                    this.f20377 = m41887;
                    this.f20375 = 0;
                    c235502 = c8734.f26593;
                    c235502.m52010(m418872, m41887, this.f20378);
                    int i7 = i + i3;
                    int i8 = i2 - i3;
                    int i9 = this.f20377 - this.f20375;
                    if (i9 > 0) {
                        i4 = Math.min(i8, i9);
                        System.arraycopy(this.f20378, this.f20375, bArr, i7, i4);
                        this.f20375 += i4;
                    } else {
                        i4 = 0;
                    }
                    i3 += i4;
                } else {
                    this.f20374 = true;
                    break;
                }
            } else {
                c23550 = c8734.f26593;
                byte b = (byte) m22584;
                c23550.m52009(b);
                bArr[i3 + i] = b;
                i3++;
            }
        }
        return i3;
    }

    @Override // l.AbstractC14377
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo18149() {
        return !this.f20374;
    }

    @Override // l.AbstractC14377
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo18147() {
        return this.f20377 - this.f20375;
    }
}
