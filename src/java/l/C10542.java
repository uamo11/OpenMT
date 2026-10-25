package l;

import java.util.List;

/* compiled from: 123V */
/* renamed from: l.ۤ᩷ܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10542 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public List f31650;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16891 f31651;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f31652;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f31653;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C10917 f31654;

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
    }

    public C10542(C16560 c16560, AbstractC16891 abstractC16891) {
        this.f31653 = c16560;
        this.f31651 = abstractC16891;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        if (this.f31651.f51877) {
            this.f31654 = this.f31653.m38992(false, (Runnable) null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (l.C16560.m38972(r2, r0) != false) goto L6;
     */
    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1009() {
        /*
            r3 = this;
            l.ܽ᩷ܳ r0 = r3.f31651
            r1 = 0
            r0.mo14824(r1)
            java.util.List r2 = r0.mo6012()
            r3.f31650 = r2
            r0.f51877 = r1
            l.ܽۢܳ r0 = r3.f31653
            l.C7489.m20120(r0, r2)
            boolean r2 = l.C16560.m38983(r0)
            if (r2 != 0) goto L25
            java.util.List r2 = r3.f31650
            java.util.List r0 = l.C16560.m38989(r0)
            boolean r0 = l.C16560.m38972(r2, r0)
            if (r0 == 0) goto L26
        L25:
            r1 = 1
        L26:
            r3.f31652 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10542.mo1009():void");
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        AbstractC16891 abstractC16891;
        C10917 c10917 = this.f31654;
        C16560 c16560 = this.f31653;
        if (c10917 == null && c16560.m39040()) {
            return;
        }
        abstractC16891 = c16560.f50900;
        if (abstractC16891 == this.f31651 && this.f31652) {
            c16560.m38961(this.f31650, true);
            c16560.f50891.m29923();
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C10917 c10917 = this.f31654;
        if (c10917 != null) {
            c10917.m27224();
        }
    }
}
