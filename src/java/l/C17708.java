package l;

/* compiled from: K9V6 */
/* renamed from: l.ᩳ֡᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17708 extends AbstractC8536 {
    @Override // l.AbstractC8536
    /* renamed from: ۧ */
    public final int mo10995(int i, byte[] bArr) {
        return 0;
    }

    public C17708(InterfaceC1023 interfaceC1023, C16296 c16296) {
        super(interfaceC1023);
        this.f26077 = c16296;
        this.f26071 = 32;
    }

    @Override // l.AbstractC8536
    public final String toString() {
        return new String(C9045.m23341(new StringBuilder("NameQueryRequest["), super.toString(), "]"));
    }

    @Override // l.AbstractC8536
    /* renamed from: ᩳ */
    public final int mo10996(int i, byte[] bArr) {
        int m38333 = this.f26077.m38333(i, bArr) + i;
        AbstractC8536.m22217(this.f26071, m38333, bArr);
        AbstractC8536.m22217(this.f26090, m38333 + 2, bArr);
        return (m38333 + 4) - i;
    }

    @Override // l.AbstractC8536
    /* renamed from: ֫ */
    public final int mo10994(int i, byte[] bArr) {
        int m38331 = this.f26077.m38331(i, bArr) + i;
        this.f26071 = AbstractC8536.m22219(m38331, bArr);
        this.f26090 = AbstractC8536.m22219(m38331 + 2, bArr);
        return (m38331 + 4) - i;
    }
}
