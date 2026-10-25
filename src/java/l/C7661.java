package l;

import java.util.function.Consumer;

/* compiled from: H1MW */
/* renamed from: l.۟ᩴᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7661 extends AbstractC14737 implements InterfaceC12063, InterfaceC12433 {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C18266 f23650;

    public C7661(C9800 c9800) {
        super(c9800);
        this.f23650 = new C18266(c9800);
    }

    @Override // l.AbstractC14737
    /* renamed from: ֫ */
    public final void mo6628(int i, Object obj) {
        C18266 c18266 = this.f23650;
        c18266.f56800 = i;
        ((Consumer) obj).accept(c18266);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int m35041 = m35041();
        C18266 c18266 = this.f23650;
        c18266.f56800 = m35041;
        return c18266;
    }
}
