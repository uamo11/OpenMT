package l;

import java.util.Iterator;

/* compiled from: Z5U8 */
/* renamed from: l.᩹ۜ۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22118 implements InterfaceC6403 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f71813;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C2609 f71814;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0052 f71815;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C2609 f71816;

    @Override // l.InterfaceC6403
    /* renamed from: ܽ */
    public final /* synthetic */ boolean mo7078() {
        return false;
    }

    public C22118(C20002 c20002, C0052 c0052, C2609 c2609, C2609 c26092) {
        this.f71813 = c20002;
        this.f71815 = c0052;
        this.f71814 = c2609;
        this.f71816 = c26092;
    }

    @Override // l.InterfaceC6403
    /* renamed from: ֫ */
    public final void mo7076(AbstractC5698 abstractC5698) {
        C20002 c20002;
        C18837 c18837 = new C18837();
        C0052 c0052 = this.f71815;
        c18837.addAll(c0052.f920);
        C18837 c188372 = new C18837();
        Iterator it = this.f71814.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c20002 = this.f71813;
            if (!hasNext) {
                break;
            }
            C16112 c16112 = new C16112(c20002.f64770.m47260(c0052, ((C19297) it.next()).f60701));
            c188372.m43511(c16112);
            c18837.m43511(c16112);
        }
        c0052.f917 = c188372.m43517();
        C18837 c188373 = new C18837();
        Iterator it2 = this.f71816.iterator();
        while (it2.hasNext()) {
            C18591 c18591 = (C18591) it2.next();
            C18837 c188374 = new C18837();
            Iterator it3 = c18591.f57668.iterator();
            while (it3.hasNext()) {
                c188374.m43511(c20002.f64770.m47260(c0052, (AbstractC10370) it3.next()));
            }
            C21053 c21053 = new C21053(c20002.f64770.m47260(c0052, c18591.f57669), c188374.m43517());
            c188373.m43511(c21053);
            c18837.m43511(c21053);
        }
        c0052.f925 = c188373.m43517();
        c0052.f920 = c18837.m43517();
    }
}
