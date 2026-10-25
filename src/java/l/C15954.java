package l;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: Y6A7 */
/* renamed from: l.ܺ۬ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15954 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f49246;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Set f49247;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public SparseArray f49248;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37726(AbstractC3255 abstractC3255) {
        int itemViewType = abstractC3255.getItemViewType();
        ArrayList arrayList = m37724(itemViewType).f27068;
        if (((C8900) this.f49248.get(itemViewType)).f27067 <= arrayList.size()) {
            C9975.m25138(abstractC3255.itemView);
        } else {
            if (C13132.sDebugAssertionsEnabled && arrayList.contains(abstractC3255)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            abstractC3255.resetInternal();
            arrayList.add(abstractC3255);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m37728(int i, long j) {
        C8900 m37724 = m37724(i);
        long j2 = m37724.f27066;
        if (j2 != 0) {
            j = (j / 4) + ((j2 / 4) * 3);
        }
        m37724.f27066 = j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37725(int i, long j) {
        C8900 m37724 = m37724(i);
        long j2 = m37724.f27065;
        if (j2 != 0) {
            j = (j / 4) + ((j2 / 4) * 3);
        }
        m37724.f27065 = j;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m37729(long j, int i, long j2) {
        long j3 = m37724(i).f27066;
        return j3 == 0 || j + j3 < j2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m37727(long j, int i, long j2) {
        long j3 = m37724(i).f27065;
        return j3 == 0 || j + j3 < j2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C8900 m37724(int i) {
        SparseArray sparseArray = this.f49248;
        C8900 c8900 = (C8900) sparseArray.get(i);
        if (c8900 != null) {
            return c8900;
        }
        C8900 c89002 = new C8900();
        sparseArray.put(i, c89002);
        return c89002;
    }
}
