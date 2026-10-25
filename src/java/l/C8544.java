package l;

/* compiled from: A88Y */
/* renamed from: l.ۡ֨ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8544 extends AbstractC9250 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5016 f26115;

    public C8544(C5016 c5016) {
        this.f26115 = c5016;
    }

    @Override // l.AbstractC9250
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo22245(byte[] bArr, byte[] bArr2) {
        byte[] m14507 = this.f26115.m14507(bArr);
        System.arraycopy(m14507, 0, bArr2, 0, m14507.length);
        return m14507.length;
    }

    @Override // l.AbstractC9250
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo22246(byte[] bArr) {
        this.f26115.write(bArr);
    }

    @Override // l.AbstractC9250
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo22244(byte[] bArr) {
        byte[] read = this.f26115.read();
        System.arraycopy(read, 0, bArr, 0, read.length);
        return read.length;
    }
}
