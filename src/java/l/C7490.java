package l;

import java.util.AbstractMap;

/* compiled from: F4NW */
/* renamed from: l.۟۬ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C7490 extends AbstractC14545 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1826 f23076;

    @Override // l.AbstractC22725
    /* renamed from: ܳ */
    public final boolean mo19283() {
        return true;
    }

    public C7490(C1826 c1826) {
        this.f23076 = c1826;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C9403 c9403;
        AbstractC14545 abstractC14545;
        C18054 c18054 = this.f23076.f6259;
        c9403 = c18054.f56264;
        Object obj = c9403.f28541.get(i);
        abstractC14545 = c18054.f56263;
        return new AbstractMap.SimpleImmutableEntry(obj, abstractC14545.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23076.f6259.size();
    }

    @Override // l.AbstractC14545, l.AbstractC22725
    public Object writeReplace() {
        return super.writeReplace();
    }
}
