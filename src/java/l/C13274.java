package l;

/* compiled from: S776 */
/* renamed from: l.۬ᩳۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13274 extends C14587 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16096 f39748;

    public C13274(InterfaceC9922 interfaceC9922, C16096 c16096) {
        super(interfaceC9922);
        this.f39748 = c16096;
    }

    @Override // l.C14587
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String mo32239(int i, int i2) {
        boolean m33460;
        String m33450;
        String m334502;
        int i3 = (i2 >>> 24) & 255;
        if (this.f39748.f49590 && i3 != 1) {
            m334502 = C13979.m33450(i2);
            return m334502;
        }
        String mo32239 = super.mo32239(i, i2);
        m33460 = C13979.m33460(mo32239);
        if (!m33460) {
            return mo32239;
        }
        m33450 = C13979.m33450(i2);
        return m33450;
    }
}
