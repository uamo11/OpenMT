package l;

/* compiled from: D5ZX */
/* renamed from: l.۫ܰ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12438 extends AbstractC5363 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12918 f37432;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f37433;

    public C12438(C12918 c12918, int i) {
        this.f37432 = c12918;
        this.f37433 = i;
    }

    @Override // l.InterfaceC21699
    public final String getType() {
        return this.f37432.m31401(this.f37433);
    }

    @Override // l.AbstractC19475, l.InterfaceC8293
    /* renamed from: ܿ */
    public final void mo10018() {
        int i = this.f37433;
        if (i < 0 || i >= this.f37432.m31396()) {
            throw new C1237("type@" + i);
        }
    }
}
