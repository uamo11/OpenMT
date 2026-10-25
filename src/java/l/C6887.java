package l;

/* compiled from: N8PX */
/* renamed from: l.ۜܽۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6887 implements InterfaceC15373 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8319 f21278;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f21279;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C6887 f21280;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f21281;

    public C6887(int i, long j) {
        C22632.m50634(this.f21278 == null);
        this.f21281 = j;
        this.f21279 = j + i;
    }

    @Override // l.InterfaceC15373
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8319 mo18655() {
        C8319 c8319 = this.f21278;
        c8319.getClass();
        return c8319;
    }

    @Override // l.InterfaceC15373
    public final InterfaceC15373 next() {
        C6887 c6887 = this.f21280;
        if (c6887 == null || c6887.f21278 == null) {
            return null;
        }
        return c6887;
    }
}
