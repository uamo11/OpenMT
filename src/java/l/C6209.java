package l;

/* compiled from: N673 */
/* renamed from: l.ۛܿ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6209 extends AbstractC1085 {
    public boolean b;
    public final /* synthetic */ C23764 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6209(C23764 c23764, InterfaceC0585 interfaceC0585) {
        super(interfaceC0585);
        this.c = c23764;
        this.b = true;
    }

    @Override // l.AbstractC1085, l.InterfaceC0585
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // l.InterfaceC10422, l.InterfaceC0585
    public final void accept(int i) {
        if (this.b) {
            boolean test = this.c.s.test(i);
            this.b = test;
            if (test) {
                this.a.accept(i);
            }
        }
    }

    @Override // l.AbstractC1085, l.InterfaceC0585
    public final boolean f() {
        return !this.b || this.a.f();
    }
}
