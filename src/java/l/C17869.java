package l;

import java.util.AbstractMap;

/* compiled from: 6574 */
/* renamed from: l.ᩳۛܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17869 extends AbstractC14545 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17163 f54566;

    @Override // l.AbstractC22725
    /* renamed from: ܳ */
    public final boolean mo19283() {
        return true;
    }

    public C17869(C17163 c17163) {
        this.f54566 = c17163;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2;
        Object[] objArr;
        int i3;
        Object[] objArr2;
        int i4;
        C17163 c17163 = this.f54566;
        i2 = c17163.f52575;
        C4025.m12103(i, i2);
        objArr = c17163.f52574;
        int i5 = i * 2;
        i3 = c17163.f52573;
        Object obj = objArr[i3 + i5];
        C11003.requireNonNull(obj);
        objArr2 = c17163.f52574;
        i4 = c17163.f52573;
        Object obj2 = objArr2[i5 + (i4 ^ 1)];
        C11003.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.f54566.f52575;
        return i;
    }

    @Override // l.AbstractC14545, l.AbstractC22725
    public Object writeReplace() {
        return super.writeReplace();
    }
}
