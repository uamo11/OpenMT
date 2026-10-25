package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: 17NL */
/* renamed from: l.ۙ۟ܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4504 implements Iterator {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f14325;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f14326;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Iterator f14327;

    public C4504(String str) {
        this.f14325 = str;
        C3093 c3093 = new C3093(str);
        this.f14327 = c3093;
        this.f14326 = ((Integer) c3093.next()).intValue();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f14326;
        C3093 c3093 = (C3093) this.f14327;
        boolean hasNext = c3093.hasNext();
        String str = this.f14325;
        if (hasNext) {
            this.f14326 = ((Integer) c3093.next()).intValue();
        } else if (hasNext()) {
            this.f14326 = str.length();
        } else {
            throw new NoSuchElementException();
        }
        return str.substring(i, this.f14326);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14326 < this.f14325.length();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
