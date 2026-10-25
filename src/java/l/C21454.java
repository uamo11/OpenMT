package l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Function;

/* compiled from: I5ZF */
/* renamed from: l.᩸۠۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21454 implements Iterator {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f69075;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Function f69076;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Iterator f69077;

    public C21454(Iterable iterable, Function function) {
        Iterator it;
        it = C22159.f71911;
        this.f69077 = it;
        this.f69075 = iterable.iterator();
        this.f69076 = function;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it = this.f69077;
        if (it != null && !it.hasNext()) {
            while (true) {
                Iterator it2 = this.f69075;
                if (it2.hasNext()) {
                    Iterator it3 = (Iterator) this.f69076.apply(it2.next());
                    this.f69077 = it3;
                    if (it3.hasNext()) {
                        break;
                    }
                } else {
                    this.f69077 = null;
                    break;
                }
            }
        }
        return this.f69077 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        Iterator it2 = this.f69077;
        it = C22159.f71911;
        if (it2 == it && !hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f69077.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
