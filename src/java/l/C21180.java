package l;

import android.util.SparseArray;

/* compiled from: J7MO */
/* renamed from: l.᩷᩺֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21180 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SparseArray f68258 = new SparseArray();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9248 m48129(int i) {
        SparseArray sparseArray = this.f68258;
        C9248 c9248 = (C9248) sparseArray.get(i);
        if (c9248 != null) {
            return c9248;
        }
        C9248 c92482 = new C9248(9223372036854775806L);
        sparseArray.put(i, c92482);
        return c92482;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48130() {
        this.f68258.clear();
    }
}
