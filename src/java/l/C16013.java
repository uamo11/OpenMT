package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: L42O */
/* renamed from: l.ܺܶ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16013 implements Iterator {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C2609 f49414;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f49414.f8241 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2609 c2609 = this.f49414;
        C2609 c26092 = c2609.f8241;
        if (c26092 == null) {
            throw new NoSuchElementException();
        }
        Object obj = c2609.f8240;
        this.f49414 = c26092;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
