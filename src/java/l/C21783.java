package l;

import java.util.Iterator;

/* compiled from: M4K9 */
/* renamed from: l.᩸᩵ۚ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21783 implements Iterator {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20372 f69777;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f69778;

    public C21783(AbstractC20372 abstractC20372, Iterator it) {
        this.f69777 = abstractC20372;
        this.f69778 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f69778.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f69777.mo18729(this.f69778.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f69778.remove();
    }
}
