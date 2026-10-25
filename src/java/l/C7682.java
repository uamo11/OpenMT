package l;

import java.util.function.Consumer;

/* compiled from: DD2 */
/* renamed from: l.۟᩵ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7682 extends AbstractC14178 implements InterfaceC12063, InterfaceC12433 {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C17707 f23727;

    public C7682(C9241 c9241) {
        super(c9241);
        this.f23727 = new C17707(c9241);
    }

    @Override // l.AbstractC14178
    /* renamed from: ֫ */
    public final void mo5120(int i, Object obj) {
        C17707 c17707 = this.f23727;
        c17707.f54184 = i;
        ((Consumer) obj).accept(c17707);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int m33826 = m33826();
        C17707 c17707 = this.f23727;
        c17707.f54184 = m33826;
        return c17707;
    }
}
