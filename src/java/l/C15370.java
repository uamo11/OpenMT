package l;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: X44P */
/* renamed from: l.ܶܿ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15370 implements Iterator {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Iterator f47085;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Collection f47086;

    public C15370(Collection collection) {
        this.f47086 = collection;
        this.f47085 = collection.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47085.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            return ((InterfaceC20758) this.f47085.next()).toFile();
        } catch (UnsupportedOperationException e) {
            throw new IllegalStateException(e);
        }
    }
}
