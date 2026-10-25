package l;

import java.util.ArrayList;

/* compiled from: P6LY */
/* renamed from: l.ۛ֨֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5718 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f17638;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f17639;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f17640;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C21946 f17641;

    public C5718(C12773 c12773) {
        boolean z;
        C21946 c21946;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        z = c12773.f38376;
        this.f17640 = z;
        c21946 = c12773.f38377;
        this.f17641 = c21946;
        arrayList = c12773.f38374;
        this.f17638 = new ArrayList(arrayList);
        arrayList2 = c12773.f38375;
        ArrayList arrayList4 = new ArrayList(arrayList2.size() + 1);
        this.f17639 = arrayList4;
        arrayList3 = c12773.f38375;
        arrayList4.addAll(arrayList3);
        arrayList4.add(new C2896());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16156(AbstractC0197 abstractC0197, StringBuilder sb) {
        C11003.requireNonNull(abstractC0197, "node must not be null");
        C9952 c9952 = new C9952(this, new C11363(sb));
        c9952.m25078(abstractC0197);
        c9952.mo25076(abstractC0197);
        c9952.m25077(abstractC0197);
    }
}
