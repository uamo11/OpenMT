package l;

import android.util.SparseArray;

/* compiled from: 78R7 */
/* renamed from: l.ۚ۬֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5365 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SparseArray f16707;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5531 f16708;

    public C5365(C5531 c5531, SparseArray sparseArray) {
        this.f16708 = c5531;
        SparseArray sparseArray2 = new SparseArray(c5531.m15674());
        for (int i = 0; i < c5531.m15674(); i++) {
            int m15677 = c5531.m15677(i);
            C0425 c0425 = (C0425) sparseArray.get(m15677);
            c0425.getClass();
            sparseArray2.append(m15677, c0425);
        }
        this.f16707 = sparseArray2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0425 m15329(int i) {
        C0425 c0425 = (C0425) this.f16707.get(i);
        c0425.getClass();
        return c0425;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m15327(int i) {
        return this.f16708.m15675(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15326() {
        return this.f16708.m15674();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m15328(int i) {
        return this.f16708.m15677(i);
    }
}
