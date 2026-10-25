package l;

import java.util.Iterator;
import java.util.List;

/* compiled from: H5GB */
/* renamed from: l.ܶ᩷ۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15473 extends AbstractC0615 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f47349;

    public C15473(List list) {
        this.f47349 = list;
    }

    @Override // l.AbstractC0615, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        InterfaceC16724 interfaceC16724;
        AbstractC21315 m48348 = AbstractC21315.m48348(this.f47349);
        interfaceC16724 = C20414.f65872;
        return m48348.m48350(interfaceC16724).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47349.size();
    }
}
