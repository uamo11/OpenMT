package l;

import java.util.Iterator;

/* compiled from: E3QI */
/* renamed from: l.ᩳ᩹ܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18346 extends AbstractC8447 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentMapC14754 f57016;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18346(ConcurrentMapC14754 concurrentMapC14754) {
        super(concurrentMapC14754);
        this.f57016 = concurrentMapC14754;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C16934(this.f57016);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f57016.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f57016.remove(obj) != null;
    }
}
