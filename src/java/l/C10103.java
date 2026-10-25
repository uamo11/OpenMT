package l;

/* compiled from: B6MB */
/* renamed from: l.ۤۛۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10103 implements AutoCloseable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f30410;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f30411;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22097 f30412;

    public C10103(byte[] bArr, int i, C22097 c22097) {
        this.f30411 = bArr;
        this.f30410 = i;
        this.f30412 = c22097;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f30412.close();
    }
}
