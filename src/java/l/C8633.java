package l;

/* compiled from: E8PN */
/* renamed from: l.ۡۘۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8633 implements InterfaceC0165 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f26356;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f26357;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f26358;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC14982 f26359;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f26360;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f26361;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f26362;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19217 f26363;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f26364;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f26365;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f26366;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f26367;

    public C8633(AbstractC14982 abstractC14982, long j, long j2, long j3, long j4, boolean z) {
        C22632.m50631(j >= 0 && j2 > j);
        this.f26359 = abstractC14982;
        this.f26364 = j;
        this.f26365 = j2;
        if (j3 == j2 - j || z) {
            this.f26362 = j4;
            this.f26366 = 4;
        } else {
            this.f26366 = 0;
        }
        this.f26363 = new C19217();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    @Override // l.InterfaceC0165
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo1283(l.InterfaceC8424 r25) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8633.mo1283(l.۠᩷ۧ):long");
    }

    @Override // l.InterfaceC0165
    /* renamed from: ֫ */
    public final InterfaceC9505 mo1284() {
        if (this.f26362 != 0) {
            return new C9339(this);
        }
        return null;
    }

    @Override // l.InterfaceC0165
    /* renamed from: ֫ */
    public final void mo1285(long j) {
        this.f26358 = C3603.m11016(j, 0L, this.f26362 - 1);
        this.f26366 = 2;
        this.f26367 = this.f26364;
        this.f26356 = this.f26365;
        this.f26357 = 0L;
        this.f26360 = this.f26362;
    }
}
