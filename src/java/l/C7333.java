package l;

/* compiled from: N75S */
/* renamed from: l.۟۟᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7333 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f22529;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f22530;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f22531;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f22532;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f22533;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f22534;

    public C7333(AbstractC15440 abstractC15440, long j, long j2, boolean z, boolean z2) {
        this.f22532 = abstractC15440;
        this.f22530 = abstractC15440.mo23544();
        this.f22534 = j;
        this.f22533 = j2;
        this.f22531 = z;
        this.f22529 = z2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f22531) {
            this.f22532.mo23552();
        }
    }
}
