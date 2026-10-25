package l;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: V9PU */
/* renamed from: l.ۘۚۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3729 implements Iterator {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21368 f11785;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Iterator f11786;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f11787;

    public C3729(C21368 c21368) {
        List list;
        this.f11785 = c21368;
        list = c21368.f68839;
        this.f11787 = list.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.f11787;
        if (i > 0) {
            list = this.f11785.f68839;
            if (i <= list.size()) {
                return true;
            }
        }
        return m11343().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        List list;
        if (!m11343().hasNext()) {
            list = this.f11785.f68839;
            int i = this.f11787 - 1;
            this.f11787 = i;
            return (Map.Entry) list.get(i);
        }
        return (Map.Entry) m11343().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Iterator m11343() {
        Map map;
        if (this.f11786 == null) {
            map = this.f11785.f68836;
            this.f11786 = map.entrySet().iterator();
        }
        return this.f11786;
    }
}
