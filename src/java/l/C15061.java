package l;

import java.util.Iterator;

/* compiled from: Z5U8 */
/* renamed from: l.ܶۜ۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C15061 extends RunnableC17885 {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C2609 f45983;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f45984;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15061(C20002 c20002, AbstractC5698 abstractC5698, C2609 c2609) {
        super(c20002, abstractC5698, C2609.m8239());
        this.f45984 = c20002;
        this.f45983 = c2609;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m35597(C2609 c2609) {
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C21413 c21413 = (C21413) it.next();
            C16384 m34258 = m34258(c21413.f68966);
            c18837.m43511(new C6507(m34258.f26338, m34258.f50417, c21413.f68967));
        }
        return c18837.m43517();
    }

    @Override // l.RunnableC17885, java.lang.Runnable
    public final void run() {
        C20002 c20002 = this.f45984;
        InterfaceC18278 interfaceC18278 = c20002.f64755;
        try {
            c20002.f64755 = this.f54617;
            C2609 m35597 = m35597(this.f45983);
            AbstractC5698 abstractC5698 = this.f54619;
            abstractC5698.m16074(m35597.m8248(abstractC5698.mo16081()));
        } finally {
            c20002.f64755 = interfaceC18278;
        }
    }
}
