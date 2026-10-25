package l;

/* compiled from: ZA1E */
/* renamed from: l.ۤۖ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC10011 extends AbstractC11422 {

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f30149 = C11321.m27961(AbstractC10011.class);

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public AbstractC11422 f30150;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public int f30151;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public byte f30152;

    public AbstractC10011(InterfaceC1023 interfaceC1023, byte b, String str) {
        super(interfaceC1023, b, str);
        this.f30152 = (byte) -1;
        this.f30151 = 0;
        this.f30150 = null;
    }

    public AbstractC10011(InterfaceC1023 interfaceC1023) {
        this(interfaceC1023, null);
    }

    public AbstractC10011(InterfaceC1023 interfaceC1023, AbstractC11422 abstractC11422) {
        super(interfaceC1023);
        this.f30152 = (byte) -1;
        this.f30151 = 0;
        this.f30150 = abstractC11422;
        if (abstractC11422 != null) {
            this.f30152 = (byte) abstractC11422.mo10463();
        }
    }

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC11422 m25186() {
        return this.f30150;
    }

    @Override // l.AbstractC11422, l.InterfaceC7578
    /* renamed from: getNext */
    public final InterfaceC7578 mo20322() {
        return this.f30150;
    }

    @Override // l.AbstractC11422, l.InterfaceC7578
    /* renamed from: getNext */
    public final AbstractC11422 mo20322() {
        return this.f30150;
    }

    @Override // l.AbstractC11422, l.InterfaceC7578
    /* renamed from: ܿ */
    public final InterfaceC7578 mo20322() {
        return this.f30150;
    }

    @Override // l.InterfaceC1543
    /* renamed from: ᩹ */
    public final InterfaceC1543 mo5290() {
        return this.f30150;
    }

    @Override // l.AbstractC11422, l.InterfaceC13927
    /* renamed from: ֫ */
    public final int mo10430(int i, byte[] bArr) {
        this.f34143 = i;
        m28220(i, bArr);
        int i2 = i + 32;
        int i3 = i + 35;
        int mo1311 = mo1311(i + 37, bArr);
        int i4 = mo1311 + 4;
        int i5 = mo1311 + 5 + i2;
        int i6 = i4 / 2;
        this.f34157 = i6;
        bArr[i2] = (byte) (i6 & 255);
        int i7 = i5 + 2;
        int mo1309 = mo1309(i7, bArr);
        this.f34160 = mo1309;
        bArr[i5] = (byte) (mo1309 & 255);
        bArr[i5 + 1] = (byte) ((mo1309 >> 8) & 255);
        int i8 = i7 + mo1309;
        if (this.f30150 != null) {
            m28218().getClass();
        }
        this.f30152 = (byte) -1;
        this.f30150 = null;
        bArr[i + 33] = -1;
        bArr[i + 34] = 0;
        bArr[i3] = -34;
        bArr[i + 36] = -34;
        int i9 = ((i8 - i2) + i2) - i;
        this.f34147 = i9;
        C5777 c5777 = this.f34140;
        if (c5777 != null) {
            c5777.m16247(bArr, this.f34143, i9, this, mo5429());
        }
        return this.f34147;
    }

    @Override // l.AbstractC11422, l.InterfaceC13927
    public final int decode(byte[] bArr) {
        this.f34143 = 4;
        m28205(bArr);
        int m25185 = m25185(36, bArr) + 32;
        this.f34147 = m25185;
        if (m28230()) {
            System.arraycopy(bArr, 4, new byte[m25185], 0, m25185);
        }
        if (m28206(4, m25185, bArr)) {
            return m25185;
        }
        throw new C17771("Signature verification failed for ".concat(getClass().getName()));
    }

    public AbstractC10011(InterfaceC1023 interfaceC1023, byte b, AbstractC11422 abstractC11422) {
        super(interfaceC1023, b, null);
        this.f30152 = (byte) -1;
        this.f30151 = 0;
        this.f30150 = abstractC11422;
        if (abstractC11422 != null) {
            this.f30152 = (byte) abstractC11422.mo10463();
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m25185(int i, byte[] bArr) {
        byte b;
        int i2 = i + 1;
        byte b2 = bArr[i];
        this.f34157 = b2;
        if (b2 != 0) {
            this.f30152 = bArr[i2];
            int m5121 = C1480.m5121(i + 3, bArr);
            this.f30151 = m5121;
            if (m5121 == 0) {
                this.f30152 = (byte) -1;
            }
            if (this.f34157 > 2) {
                mo1308(i + 5, bArr);
                if (mo10463() == -94) {
                    C20635 c20635 = (C20635) this;
                    if (c20635.m47221() && c20635.m47219() != 1) {
                        this.f34157 += 8;
                    }
                }
            }
            i2 += this.f34157 * 2;
        }
        int m51212 = C1480.m5121(i2, bArr);
        this.f34160 = m51212;
        int i3 = i2 + 2;
        if (m51212 != 0) {
            int mo1306 = mo1306(i3, bArr);
            if (mo1306 != this.f34160) {
                InterfaceC2148 interfaceC2148 = f30149;
                if (interfaceC2148.mo7099()) {
                    StringBuilder m32308 = C13325.m32308(mo1306, "Short read, have ", ", want ");
                    m32308.append(this.f34160);
                    interfaceC2148.mo7101(m32308.toString());
                }
            }
            i3 += this.f34160;
        }
        if (this.f34150 != 0 || (b = this.f30152) == -1) {
            this.f30152 = (byte) -1;
            this.f30150 = null;
        } else {
            AbstractC11422 abstractC11422 = this.f30150;
            if (abstractC11422 == null) {
                this.f30152 = (byte) -1;
                throw new C13017("no andx command supplied with response");
            }
            int i4 = this.f34143;
            int i5 = this.f30151 + i4;
            abstractC11422.f34143 = i4;
            abstractC11422.mo10459(b);
            AbstractC11422 abstractC114222 = this.f30150;
            abstractC114222.f34150 = this.f34150;
            abstractC114222.m28201(m28223());
            AbstractC11422 abstractC114223 = this.f30150;
            abstractC114223.f34162 = this.f34162;
            abstractC114223.f34144 = this.f34144;
            abstractC114223.f34155 = this.f34155;
            abstractC114223.f34153 = this.f34153;
            abstractC114223.f34154 = this.f34154;
            abstractC114223.m28217(m28215());
            AbstractC11422 abstractC114224 = this.f30150;
            if (abstractC114224 instanceof AbstractC10011) {
                i3 = i5 + ((AbstractC10011) abstractC114224).m25185(i5, bArr);
            } else {
                int i6 = i5 + 1;
                int i7 = abstractC114224.f34157;
                bArr[i5] = (byte) (i7 & 255);
                if (i7 != 0 && i7 > 2) {
                    i6 += abstractC114224.mo1308(i6, bArr);
                }
                this.f30150.f34160 = C1480.m5121(i6, bArr);
                int i8 = i6 + 2;
                AbstractC11422 abstractC114225 = this.f30150;
                if (abstractC114225.f34160 != 0) {
                    abstractC114225.mo1306(i8, bArr);
                    i8 += this.f30150.f34160;
                }
                i3 = i8;
            }
            this.f30150.mo28228();
        }
        return i3 - i;
    }

    @Override // l.AbstractC11422
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(",andxCommand=0x");
        C19033.m43886(this.f30152, 2, ",andxOffset=", sb);
        sb.append(this.f30151);
        return new String(sb.toString());
    }
}
