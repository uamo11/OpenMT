package l;

import java.util.Iterator;

/* compiled from: 01M8 */
/* renamed from: l.ܽܳۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16695 implements Iterator {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC6818 f51235;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Iterator f51236;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f51237;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C22340 f51238;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C22340 f51239;

    public C16695(InterfaceC6818 interfaceC6818) {
        this.f51235 = interfaceC6818;
        Iterator mo6220 = interfaceC6818.mo6220();
        this.f51237 = mo6220;
        Iterator mo6221 = interfaceC6818.mo6221();
        this.f51236 = mo6221;
        this.f51238 = mo6220.hasNext() ? (C22340) mo6220.next() : null;
        this.f51239 = mo6221.hasNext() ? (C22340) mo6221.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return (this.f51238 == null && this.f51239 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C22340 c22340;
        C22340 c223402 = this.f51238;
        if (c223402 == null || ((c22340 = this.f51239) != null && (c22340.f72397 < c223402.f72397 || c22340.f72398 < c223402.f72398))) {
            C22340 c223403 = this.f51239;
            Iterator it = this.f51236;
            this.f51239 = it.hasNext() ? (C22340) it.next() : null;
            return new C13167(c223403, Boolean.TRUE);
        }
        Iterator it2 = this.f51237;
        this.f51238 = it2.hasNext() ? (C22340) it2.next() : null;
        return new C13167(c223402, Boolean.FALSE);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
