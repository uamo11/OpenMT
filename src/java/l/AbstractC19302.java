package l;

/* compiled from: XBCF */
/* renamed from: l.᩵ۜܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC19302 extends AbstractC8718 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC15333 f60712;

    /* renamed from: ۡ */
    public abstract String mo35635();

    @Override // l.AbstractC2368
    /* renamed from: ۧ */
    public final int mo3385() {
        return 8;
    }

    /* renamed from: ۧ */
    public abstract int mo35636(C1662 c1662);

    public AbstractC19302(AbstractC15333 abstractC15333) {
        super(abstractC15333.m36363());
        this.f60712 = abstractC15333;
    }

    @Override // l.AbstractC8718, l.AbstractC2368
    /* renamed from: ֫ */
    public void mo2863(C1662 c1662) {
        super.mo2863(c1662);
        c1662.m5631().m6832(this.f60712.m36364().getName());
    }

    @Override // l.AbstractC2368
    /* renamed from: ֫ */
    public final void mo3384(C1662 c1662, C18241 c18241) {
        C16892 m5632 = c1662.m5632();
        C2076 m5631 = c1662.m5631();
        AbstractC15333 abstractC15333 = this.f60712;
        C20274 m36364 = abstractC15333.m36364();
        int m39748 = m5632.m39748(m22521());
        int m6830 = m5631.m6830(m36364.getName());
        int mo35636 = mo35636(c1662);
        if (c18241.m42506()) {
            c18241.m42501(0, m37189() + ' ' + abstractC15333.mo2463());
            c18241.m42501(2, "  class_idx: ".concat(C14712.m35006(m39748)));
            c18241.m42501(2, String.format("  %-10s %s", mo35635().concat(":"), C14712.m35006(mo35636)));
            c18241.m42501(4, "  name_idx:  ".concat(C14712.m35008(m6830)));
        }
        c18241.m42511(m39748);
        c18241.m42511(mo35636);
        c18241.m42514(m6830);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC15333 m44494() {
        return this.f60712;
    }
}
