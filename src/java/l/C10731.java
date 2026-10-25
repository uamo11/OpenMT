package l;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: O2OZ */
/* renamed from: l.ۧۗܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10731 extends AbstractCollection {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16374 f32329;

    public C10731(C16374 c16374) {
        this.f32329 = c16374;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f32329.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f32329.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C16374 c16374 = this.f32329;
        Map m38562 = c16374.m38562();
        if (m38562 != null) {
            return m38562.values().iterator();
        }
        return new C11478(c16374);
    }
}
