package l;

import java.util.Iterator;

/* compiled from: I5ZF */
/* renamed from: l.᩹۫ܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22287 implements InterfaceC5998 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f72271;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f72272;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Iterator f72273;

    public C22287(Iterator it) {
        it.getClass();
        this.f72273 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f72272 || this.f72273.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f72272) {
            return this.f72273.next();
        }
        Object obj = this.f72271;
        this.f72272 = false;
        this.f72271 = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C4025.m12115("Can't remove after you've peeked at next", !this.f72272);
        this.f72273.remove();
    }

    @Override // l.InterfaceC5998
    public final Object peek() {
        if (!this.f72272) {
            this.f72271 = this.f72273.next();
            this.f72272 = true;
        }
        return this.f72271;
    }
}
