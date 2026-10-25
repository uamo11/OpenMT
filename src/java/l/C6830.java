package l;

import java.util.function.Consumer;

/* compiled from: 1N3 */
/* renamed from: l.ۜܳᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6830 extends AbstractC4008 implements InterfaceC12063, InterfaceC12433 {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C16001 f21160;

    public C6830(C5419 c5419) {
        super(c5419);
        this.f21160 = new C16001(c5419);
    }

    @Override // l.AbstractC4008
    /* renamed from: ֫ */
    public final void mo12087(int i, Object obj) {
        C16001 c16001 = this.f21160;
        c16001.f49369 = i;
        ((Consumer) obj).accept(c16001);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int m12086 = m12086();
        C16001 c16001 = this.f21160;
        c16001.f49369 = m12086;
        return c16001;
    }
}
