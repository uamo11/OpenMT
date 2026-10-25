package l;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: 1AZL */
/* renamed from: l.ᩳܿۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18190 extends AbstractSet {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23834 f56567;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C23834 c23834 = this.f56567;
        C14661 c14661 = null;
        if (obj != null) {
            try {
                c14661 = c23834.m52529(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (c14661 != null) {
            c23834.m52530(c14661, true);
        }
        return c14661 != null;
    }

    public C18190(C23834 c23834) {
        this.f56567 = c23834;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f56567.f77120;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C16778(this.f56567);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f56567.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f56567.clear();
    }
}
