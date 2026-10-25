package l;

/* compiled from: JA0W */
/* renamed from: l.ۛۘ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5818 extends AbstractC10011 {

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public long f17872;

    @Override // l.AbstractC11422
    /* renamed from: ۧ */
    public final int mo1306(int i, byte[] bArr) {
        return 0;
    }

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

    public C5818(InterfaceC1023 interfaceC1023) {
        super(interfaceC1023);
    }

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final long m16318() {
        return this.f17872;
    }

    @Override // l.AbstractC11422
    /* renamed from: ܽ */
    public final int mo1308(int i, byte[] bArr) {
        this.f17872 = C1480.m5121(i, bArr) & 65535;
        return 8;
    }

    @Override // l.AbstractC10011, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComWriteAndXResponse[");
        sb.append(super.toString());
        sb.append(",count=");
        return new String(C15942.m37718(sb, this.f17872, "]"));
    }
}
