package l;

/* compiled from: M181 */
/* renamed from: l.۫ܺᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12515 implements InterfaceC2959 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10399 f37615;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18683 f37616 = new C18683();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18683 f37614 = new C18683();

    public C12515(C10399 c10399) {
        this.f37615 = c10399;
    }

    @Override // l.InterfaceC2959
    /* renamed from: ܽ */
    public final void mo9041(int i) {
        this.f37614.add(i);
    }

    @Override // l.InterfaceC2959
    /* renamed from: ֫ */
    public final void mo9039(int i) {
        this.f37616.add(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30698() {
        C10399 c10399;
        int i;
        int i2;
        InterfaceC6667 it = this.f37616.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c10399 = this.f37615;
            if (!hasNext) {
                break;
            }
            int nextInt = it.nextInt();
            i2 = c10399.f31291;
            if (nextInt > i2) {
                c10399.f31291 = nextInt;
            }
        }
        InterfaceC6667 it2 = this.f37614.iterator();
        while (it2.hasNext()) {
            int nextInt2 = it2.nextInt();
            i = c10399.f31291;
            if (nextInt2 > i) {
                c10399.f31291 = nextInt2;
            }
        }
    }

    @Override // l.InterfaceC2959
    /* renamed from: ۧ */
    public final void mo9040(int i) {
        mo9041(i);
    }

    @Override // l.InterfaceC2959
    /* renamed from: ᩳ */
    public final void mo9042(int i) {
        mo9039(i);
    }
}
