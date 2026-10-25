package l;

import java.util.Iterator;

/* compiled from: B7KX */
/* renamed from: l.᩶ᩳ۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20332 extends AbstractC5515 implements InterfaceC6403 {

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11139 f65643;

    @Override // l.InterfaceC6403
    /* renamed from: ܽ */
    public final /* synthetic */ boolean mo7078() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20332(C11139 c11139) {
        super(c11139, EnumC12075.HIERARCHY_PHASE, new C23153(c11139));
        this.f65643 = c11139;
    }

    @Override // l.AbstractC13980
    /* renamed from: ۧ */
    public final void mo4345(C2609 c2609) {
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            ((C1755) it.next()).f6079.f17186.f17564 = this;
        }
        Iterator it2 = c2609.iterator();
        while (it2.hasNext()) {
            ((C1755) it2.next()).f6079.f17186.mo16101();
        }
    }

    @Override // l.AbstractC13980
    /* renamed from: ֫ */
    public final void mo6476(C1755 c1755) {
        C5557 c5557 = c1755.f6079;
        C14163 c14163 = c5557.f17186;
        C19955 c19955 = (C19955) c14163.f17560;
        C1755 m15646 = AbstractC5515.m15646(c1755, c5557);
        m15648(c1755, m15646);
        AbstractC10370 abstractC10370 = c14163.f42767;
        C11139 c11139 = this.f65643;
        if (abstractC10370 == c11139.f33438.f18887) {
            if (c5557.f17184 != null) {
                C15240 c15240 = c11139.f33426;
                AbstractC12612 abstractC12612 = c5557.f17184;
                abstractC12612.getClass();
                c15240.m36186(abstractC12612, c19955.f64618);
                c19955.f64618 = AbstractC4308.f13885;
            } else if (c5557.f17183.m8249()) {
                C15240 c152402 = c11139.f33426;
                AbstractC12612 abstractC126122 = (AbstractC12612) c5557.f17183.f8240;
                abstractC126122.getClass();
                c152402.m36186(abstractC126122, (AbstractC4308) c19955.f64620.f8240);
                c19955.f64620 = C2609.m8239();
            }
        }
        c11139.m27652(c14163, c5557.f17181.f7168, m15646);
        C15240 c152403 = c11139.f33426;
        c152403.getClass();
        C0424 c0424 = new C0424(c152403);
        c5557.mo988(c0424);
        if (c0424.f1887 || c0424.f1888) {
            return;
        }
        c5557.f17186.f17563 |= 1073741824;
    }

    @Override // l.AbstractC5515
    /* renamed from: ֫ */
    public final AbstractC12612 mo15647(AbstractC12612 abstractC12612) {
        return C2693.f8433[abstractC12612.mo989().ordinal()] != 1 ? abstractC12612 : ((C16432) abstractC12612).f50542;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    @Override // l.InterfaceC6403
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo7076(l.AbstractC5698 r3) {
        /*
            r2 = this;
            l.ۧܿ۠ r0 = r2.f65643
            l.ܰᩳ۠ r1 = l.C11139.m27645(r0)
            boolean r1 = r1 instanceof l.C12570
            if (r1 != 0) goto L13
            l.ܰᩳ۠ r1 = l.C11139.m27645(r0)
            if (r1 != r2) goto L11
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            l.C12171.m29642(r1)
            l.ܰᩳ۠ r1 = l.C11139.m27645(r0)
            if (r1 == r2) goto L20
            r3.f17564 = r2
            return
        L20:
            l.ܽܿ۠ r0 = l.C11139.m27627(r0)
            l.ܳ֡֨ r3 = (l.C14163) r3
            l.֫ۤ֨ r3 = r0.m39519(r3)
            l.ۖܶ۠ r3 = l.C2609.of(r3)
            super.mo4345(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20332.mo7076(l.ۛ֡֨):void");
    }
}
