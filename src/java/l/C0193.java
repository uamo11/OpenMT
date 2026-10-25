package l;

import java.util.Iterator;

/* compiled from: NAWS */
/* renamed from: l.֡ۙ᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0193 implements Iterator {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Iterator f1429;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5133 f1430;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C0193(C5133 c5133) {
        InterfaceC14304 interfaceC14304;
        this.f1430 = c5133;
        interfaceC14304 = c5133.f16072;
        this.f1429 = interfaceC14304.iterator();
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC16233 interfaceC16233;
        interfaceC16233 = this.f1430.f16073;
        return interfaceC16233.invoke(this.f1429.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1429.hasNext();
    }
}
