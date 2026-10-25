package l;

/* compiled from: Y9SA */
/* renamed from: l.᩸ۘ᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21341 extends AbstractC10011 {

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public String f68771;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public byte[] f68772;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public String f68773;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public boolean f68774;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public String f68775;

    @Override // l.AbstractC11422
    /* renamed from: ܿ */
    public final int mo1309(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC11422
    /* renamed from: ᩻ */
    public final int mo1311(int i, byte[] bArr) {
        return 0;
    }

    public C21341(InterfaceC1023 interfaceC1023, AbstractC11422 abstractC11422) {
        super(interfaceC1023, abstractC11422);
        this.f68773 = "";
        this.f68775 = "";
        this.f68771 = "";
        this.f68772 = null;
    }

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48375() {
        return this.f68774;
    }

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m48376() {
        return this.f68772;
    }

    @Override // l.AbstractC11422
    /* renamed from: ܽ */
    public final int mo1308(int i, byte[] bArr) {
        this.f68774 = (bArr[i] & 1) == 1;
        int i2 = i + 2;
        if (m28221()) {
            int m5121 = C1480.m5121(i2, bArr);
            i2 = i + 4;
            this.f68772 = new byte[m5121];
        }
        return i2 - i;
    }

    @Override // l.AbstractC11422
    /* renamed from: ۧ */
    public final int mo1306(int i, byte[] bArr) {
        int i2;
        if (m28221()) {
            byte[] bArr2 = this.f68772;
            System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
            i2 = this.f68772.length + i;
        } else {
            i2 = i;
        }
        String m28226 = m28226(i2, bArr);
        this.f68773 = m28226;
        int m28196 = m28196(i2, m28226) + i2;
        String m28200 = m28200(bArr, m28196, m28215());
        this.f68775 = m28200;
        int m281962 = m28196(m28196, m28200) + m28196;
        if (!m28221()) {
            String m282002 = m28200(bArr, m281962, m28215());
            this.f68771 = m282002;
            m281962 += m28196(m281962, m282002);
        }
        return m281962 - i;
    }

    @Override // l.AbstractC10011, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComSessionSetupAndXResponse[");
        sb.append(super.toString());
        sb.append(",isLoggedInAsGuest=");
        sb.append(this.f68774);
        sb.append(",nativeOs=");
        sb.append(this.f68773);
        sb.append(",nativeLanMan=");
        sb.append(this.f68775);
        sb.append(",primaryDomain=");
        return new String(C9045.m23341(sb, this.f68771, "]"));
    }
}
