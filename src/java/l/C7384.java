package l;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: G7LX */
/* renamed from: l.۟ۢ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7384 extends AbstractC1719 {
    @Override // l.AbstractC1719
    /* renamed from: ֫ */
    public final AbstractC7715 mo5771(C9791 c9791) {
        m19885((AbstractC0764) c9791);
        AbstractC12612 abstractC12612 = c9791.f29619;
        AbstractC4308 abstractC4308 = abstractC12612.f16086;
        C13359 c13359 = this.f5949;
        AbstractC7715 m32350 = c13359.m32350(abstractC4308, abstractC12612);
        if (m32350.mo17365() > 0) {
            c13359.m32367().m4824(((m32350.mo17365() - 1) * 3) + 90);
        }
        m32350.mo5817();
        m19886(c9791.f29619);
        Iterator it = AbstractC1719.m5768(c9791.f29618).iterator();
        while (it.hasNext()) {
            AbstractC5144 abstractC5144 = (AbstractC5144) it.next();
            c13359.m32350(abstractC5144.f16086, abstractC5144).mo5817();
            m19886(abstractC5144);
        }
        this.f5949.m32361((AbstractC5144) c9791, this.f5951.f66510, this.f5952.f18783, C2609.m8239(), false);
        return m32350;
    }

    @Override // l.AbstractC1719
    /* renamed from: ֫ */
    public final AbstractC7715 mo5770(C9085 c9085) {
        m19885((AbstractC0764) c9085);
        Iterator it = AbstractC1719.m5768((AbstractC5144) c9085).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            C13359 c13359 = this.f5949;
            if (hasNext) {
                AbstractC5144 abstractC5144 = (AbstractC5144) it.next();
                c13359.m32350(abstractC5144.f16086, abstractC5144).mo5817();
                m19886(abstractC5144);
            } else {
                C20661 c20661 = this.f5951;
                this.f5949.m32361((AbstractC5144) c9085, c20661.f66510, this.f5952.f18783, C2609.m8239(), false);
                return c13359.m32366().m34468(c20661.f66533);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19885(AbstractC0764 abstractC0764) {
        C13359 c13359 = this.f5949;
        C1365 m32367 = c13359.m32367();
        C20661 c20661 = this.f5951;
        m32367.m4805(187, c13359.m32344((InterfaceC3109) abstractC0764, c20661.f66510), (InterfaceC21496) c20661.f66510);
        c13359.m32367().m4824(89);
        this.f5949.m32361((AbstractC5144) abstractC0764, c20661.f66510, this.f5952.f18879, C2609.m8239(), false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m19886(AbstractC5144 abstractC5144) {
        AbstractC7715[] abstractC7715Arr;
        AbstractC4308 mo2973 = abstractC5144.f16086.mo2973();
        boolean mo12941 = mo2973.mo12941();
        C20661 c20661 = this.f5951;
        if (!mo12941 && mo2973.f13890 != c20661.f66533.f13890) {
            mo2973 = c20661.f66526;
        }
        C12171.m29644(mo2973.mo12915());
        HashMap hashMap = this.f5953;
        AbstractC5698 abstractC5698 = (AbstractC5698) hashMap.get(mo2973);
        C13359 c13359 = this.f5949;
        if (abstractC5698 == null) {
            abstractC5698 = this.f5954.m50300(abstractC5144, c13359.m32368(), c20661.f66510, this.f5952.f18845, C2609.of((Object) mo2973), (C2609) null);
            hashMap.put(mo2973, abstractC5698);
        }
        C14439 m32366 = c13359.m32366();
        m32366.getClass();
        C1365 c1365 = m32366.f44254;
        C6319 c6319 = m32366.f44256;
        C1365.m4782(abstractC5698.mo16091(c6319));
        C10658 c10658 = (C10658) abstractC5698.m16096(c6319);
        int m4782 = C1365.m4782(c10658.f32060);
        if ((abstractC5698.f17561.mo16084() & 512) != 0) {
            c1365.m4807(abstractC5698, c10658);
        } else {
            c1365.m4830(abstractC5698, c10658);
        }
        abstractC7715Arr = m32366.f44255;
        AbstractC7715 abstractC7715 = abstractC7715Arr[m4782];
    }
}
