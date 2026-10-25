package l;

import java.util.ArrayList;

/* compiled from: 45FR */
/* renamed from: l.ۗۙۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3005 extends C10725 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f9468;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f9469;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ArrayList f9470;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9171(AbstractC15452 abstractC15452, boolean z) {
        ArrayList arrayList = this.f9469;
        int size = arrayList.size();
        C1342[] c1342Arr = new C1342[size];
        ArrayList arrayList2 = this.f9470;
        C1342[] c1342Arr2 = new C1342[arrayList2.size()];
        ArrayList arrayList3 = this.f9468;
        int[] iArr = new int[arrayList3.size()];
        for (int i = 0; i < size; i++) {
            c1342Arr[i] = ((C22055) arrayList.get(i)).m49617();
            c1342Arr2[i] = ((C22055) arrayList2.get(i)).m49617();
            iArr[i] = ((Integer) arrayList3.get(i)).intValue();
        }
        m37037(abstractC15452.mo26966(this.f32310, this.f32311, c1342Arr, c1342Arr2, iArr, this.f48452, z));
    }
}
