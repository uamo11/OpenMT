package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* compiled from: 4AWI */
/* renamed from: l.᩻ܳܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23761 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7617 f76915;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f76916;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0477 f76917;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f76918;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f76919;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public BitSet f76920 = new BitSet();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f76921;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f76922;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C13132 f76923;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C1556 f76924;

    public C23761(ActivityC0477 activityC0477, int i) {
        this.f76917 = activityC0477;
        this.f76919 = i;
        C13132 c13132 = (C13132) activityC0477.m10216(R.layout.MT_Protector_res_0x7f0d01e2);
        this.f76923 = c13132;
        C7617 c7617 = new C7617(this);
        this.f76915 = c7617;
        c13132.setAdapter(c7617);
        C13265.m32222().m1668(activityC0477, new InterfaceC1008() { // from class: l.᩺ܿܿ
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                C23761.this.f76915.notifyDataSetChanged();
            }
        });
        C1556 c1556 = new C1556(new C13966(this));
        this.f76924 = c1556;
        c1556.m5322(c13132);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5417 m52426() {
        return (C5417) ((ArrayList) C8239.m21821()).get(this.f76919);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m52425() {
        return m52426().m15500();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m52424(boolean z) {
        List m52425 = m52425();
        ArrayList arrayList = new ArrayList();
        BitSet bitSet = this.f76920;
        if (z) {
            ArrayList arrayList2 = (ArrayList) m52425;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (bitSet.get(size)) {
                        arrayList.add((C15293) arrayList2.remove(size));
                        this.f76915.notifyItemRemoved(size);
                    }
                } else {
                    Collections.reverse(arrayList);
                    return arrayList;
                }
            }
        } else {
            ArrayList arrayList3 = (ArrayList) m52425;
            int size2 = arrayList3.size();
            for (int i = 0; i < size2; i++) {
                if (bitSet.get(i)) {
                    arrayList.add((C15293) arrayList3.get(i));
                }
            }
            return arrayList;
        }
    }
}
