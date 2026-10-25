package l;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Z93V */
/* renamed from: l.ܽۚۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16428 extends AbstractList implements List, RandomAccess {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14311 f50520;

    public C16428(C14311 c14311) {
        this.f50520 = c14311;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f50520.m34167();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f50520.m34158(i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38700() {
        ((AbstractList) this).modCount++;
    }
}
