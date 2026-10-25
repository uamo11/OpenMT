package l;

import android.util.SparseArray;

/* compiled from: H74H */
/* renamed from: l.ܰۙ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13584 implements InterfaceC21830 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17777 f40525;

    public C13584(C17777 c17777) {
        this.f40525 = c17777;
    }

    @Override // l.InterfaceC21830
    /* renamed from: ֫ */
    public final InterfaceC19383 mo3429(int i, int i2) {
        SparseArray sparseArray;
        boolean z;
        C12552 c12552;
        SparseArray sparseArray2;
        C17777 c17777 = this.f40525;
        sparseArray = c17777.f54371;
        C7235 c7235 = (C7235) sparseArray.get(i);
        if (c7235 != null) {
            return c7235;
        }
        z = c17777.f54369;
        if (z) {
            return new C19714();
        }
        c12552 = c17777.f54370;
        C7235 c72352 = new C7235(c17777, c12552, i);
        sparseArray2 = c17777.f54371;
        sparseArray2.put(i, c72352);
        return c72352;
    }

    @Override // l.InterfaceC21830
    /* renamed from: ܳ */
    public final void mo3431() {
        this.f40525.f54369 = true;
    }

    @Override // l.InterfaceC21830
    /* renamed from: ֫ */
    public final void mo3430(InterfaceC9505 interfaceC9505) {
        this.f40525.f54372 = interfaceC9505;
    }
}
