package l;

import java.util.AbstractList;
import java.util.RandomAccess;

/* compiled from: B5DP */
/* renamed from: l.ܳۗ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14246 extends AbstractList implements RandomAccess {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object[] f42924;

    public C14246(Object[] objArr) {
        this.f42924 = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42924.length;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f42924[i];
    }
}
