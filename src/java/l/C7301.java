package l;

/* compiled from: M664 */
/* renamed from: l.۟ۜ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7301 extends AbstractC2071 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f22410;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f22411;

    public C7301(int i, AbstractC4308 abstractC4308) {
        this.f22410 = i;
        this.f22411 = abstractC4308;
    }

    @Override // l.AbstractC2071
    /* renamed from: ֫ */
    public final int mo6811() {
        int i = this.f22410;
        if (i < 64) {
            return i + 64;
        }
        return 247;
    }

    @Override // l.AbstractC2071
    /* renamed from: ֫ */
    public final void mo6812(C16887 c16887) {
        boolean z;
        boolean z2;
        super.mo6812(c16887);
        if (mo6811() == 247) {
            C14896 c14896 = c16887.f51838;
            int i = this.f22410;
            c14896.m35351(i);
            z2 = c16887.f51840;
            if (z2) {
                System.out.print(" offset_delta=" + i);
            }
        }
        z = c16887.f51840;
        if (z) {
            System.out.print(" stack[0]=");
        }
        c16887.m39711(this.f22411);
    }
}
