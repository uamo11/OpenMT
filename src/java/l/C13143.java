package l;

/* compiled from: 65VW */
/* renamed from: l.۬ܰ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13143 extends AbstractC0423 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12918 f39302;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f39303;

    public C13143(C12918 c12918, int i) {
        this.f39302 = c12918;
        this.f39303 = i;
    }

    @Override // l.InterfaceC15347
    public final String getString() {
        return this.f39302.m31422(this.f39303);
    }

    @Override // l.AbstractC19475, l.InterfaceC8293
    /* renamed from: ܿ */
    public final void mo10018() {
        int i = this.f39303;
        if (i < 0 || i >= this.f39302.m31410()) {
            throw new C1237("string@" + i);
        }
    }
}
