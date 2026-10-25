package l;

import java.io.PrintWriter;
import java.util.Iterator;

/* compiled from: Y43E */
@InterfaceC4914(EnumC3503.RELEASE_17)
@InterfaceC22553({"*"})
/* renamed from: l.۬ᩴ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13296 extends AbstractC8442 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public PrintWriter f39805 = new PrintWriter(System.out);

    @Override // l.InterfaceC21848
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo32267(C8358 c8358) {
        Iterator it = c8358.m21962().iterator();
        while (it.hasNext()) {
            ((C3419) ((InterfaceC11970) it.next()).mo951(new C3419(this.f39805, ((C1302) this.f25841).m4528()), null)).f10795.flush();
        }
    }
}
