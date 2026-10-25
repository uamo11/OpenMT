package l;

/* compiled from: Q8FL */
/* renamed from: l.ۙ֡ۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4292 implements InterfaceC7505 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23411 f13844;

    public C4292(AbstractC15440 abstractC15440) {
        this.f13844 = abstractC15440.m36513("r");
    }

    @Override // l.InterfaceC7505
    public final long length() {
        return this.f13844.length();
    }

    @Override // l.InterfaceC7505
    /* renamed from: ۧ */
    public final void mo8637(long j, byte[] bArr, int i, int i2) {
        C23411 c23411 = this.f13844;
        c23411.seek(j);
        c23411.m51858(bArr, i, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13844.close();
    }
}
