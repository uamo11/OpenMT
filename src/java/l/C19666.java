package l;

/* compiled from: 48CR */
/* renamed from: l.᩵᩵ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19666 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21782 f63519;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC22487 f63520;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC21077[] f63521;

    /* JADX WARN: Multi-variable type inference failed */
    public C19666(C0614 c0614, int i, AbstractC22487 abstractC22487) {
        InterfaceC4394 interfaceC4394;
        this.f63520 = abstractC22487;
        this.f63521 = new InterfaceC21077[i];
        for (int i2 = 0; i2 < i; i2++) {
            Object mo19031 = abstractC22487.mo19031();
            interfaceC4394 = c0614.f2370;
            ((C7216) interfaceC4394).m19307((AbstractC23898) mo19031);
            this.f63521[i2] = mo19031;
        }
        this.f63519 = new C21782(this.f63521);
    }
}
