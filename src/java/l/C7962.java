package l;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: V9PU */
/* renamed from: l.۠ۚۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7962 implements Iterator {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21368 f24601;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f24602 = -1;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Iterator f24603;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f24604;

    public C7962(C21368 c21368) {
        this.f24601 = c21368;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f24602 + 1;
        C21368 c21368 = this.f24601;
        list = c21368.f68839;
        if (i >= list.size()) {
            map = c21368.f68837;
            if (map.isEmpty() || !m21268().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        List list;
        List list2;
        this.f24604 = true;
        int i = this.f24602 + 1;
        this.f24602 = i;
        C21368 c21368 = this.f24601;
        list = c21368.f68839;
        if (i < list.size()) {
            list2 = c21368.f68839;
            return (Map.Entry) list2.get(this.f24602);
        }
        return (Map.Entry) m21268().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.f24604) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f24604 = false;
        C21368 c21368 = this.f24601;
        c21368.m48424();
        int i = this.f24602;
        list = c21368.f68839;
        if (i < list.size()) {
            int i2 = this.f24602;
            this.f24602 = i2 - 1;
            c21368.m48421(i2);
            return;
        }
        m21268().remove();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Iterator m21268() {
        Map map;
        if (this.f24603 == null) {
            map = this.f24601.f68837;
            this.f24603 = map.entrySet().iterator();
        }
        return this.f24603;
    }
}
