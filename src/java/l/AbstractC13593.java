package l;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: O2OZ */
/* renamed from: l.ܰۙܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC13593 implements Iterator {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16374 f40535;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f40536;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f40537;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f40538;

    /* renamed from: ۧ */
    public abstract Object mo16340(int i);

    public AbstractC13593(C16374 c16374) {
        int i;
        this.f40535 = c16374;
        i = c16374.f50371;
        this.f40538 = i;
        this.f40537 = c16374.isEmpty() ? -1 : 0;
        this.f40536 = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40537 >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i;
        C16374 c16374 = this.f40535;
        i = c16374.f50371;
        if (i == this.f40538) {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i2 = this.f40537;
            this.f40536 = i2;
            Object mo16340 = mo16340(i2);
            this.f40537 = c16374.m38564(this.f40537);
            return mo16340;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        C16374 c16374 = this.f40535;
        i = c16374.f50371;
        if (i == this.f40538) {
            C4025.m12115("no calls to next() since the last call to remove()", this.f40536 >= 0);
            this.f40538 += 32;
            c16374.remove(C16374.m38543(c16374, this.f40536));
            this.f40537--;
            this.f40536 = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
