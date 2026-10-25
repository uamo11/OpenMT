package l;

import java.util.AbstractCollection;
import java.util.Iterator;

/* compiled from: M3XQ */
/* renamed from: l.ܿۙܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17122 extends AbstractCollection {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16416 f52466;

    public C17122(AbstractC16416 abstractC16416) {
        this.f52466 = abstractC16416;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f52466.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f52466.mo1989(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f52466.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C15459(this.f52466);
    }
}
