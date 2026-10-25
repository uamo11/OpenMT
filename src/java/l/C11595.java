package l;

import java.util.Iterator;

/* compiled from: 151T */
/* renamed from: l.ۨۡۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11595 extends AbstractC0615 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22883 f34574;

    public C11595(C22883 c22883) {
        this.f34574 = c22883;
    }

    @Override // l.AbstractC0615, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        InterfaceC16724 interfaceC16724;
        C22883 c22883 = this.f34574;
        AbstractC21315 m48349 = AbstractC21315.m48348(c22883.f73801).m48349(c22883.f73800 + 1);
        interfaceC16724 = C13710.f40917;
        return m48349.m48350(interfaceC16724).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34574.f73800 + 1;
    }
}
