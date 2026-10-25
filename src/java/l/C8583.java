package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: P3JQ */
/* renamed from: l.ۡۖ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8583 implements Iterator {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C3644 f26214;

    public C8583(C3644 c3644) {
        this.f26214 = c3644;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26214 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC13206 interfaceC13206;
        C3644 c3644;
        C3644 c36442 = this.f26214;
        if (c36442 == null) {
            throw new NoSuchElementException();
        }
        interfaceC13206 = c36442.f11500;
        c3644 = this.f26214.f11498;
        this.f26214 = c3644;
        return interfaceC13206;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
