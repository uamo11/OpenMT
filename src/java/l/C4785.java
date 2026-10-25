package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: O1MI */
/* renamed from: l.ۙܿۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4785 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f15174;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final CharSequence f15176;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6818 f15177;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CharSequence f15178;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f15181;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f15179 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f15173 = -1;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f15175 = -1;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22424 f15180 = null;

    public C4785(InterfaceC6818 interfaceC6818, CharSequence charSequence, CharSequence charSequence2, ArrayList arrayList, ArrayList arrayList2) {
        this.f15178 = charSequence;
        this.f15176 = charSequence2;
        this.f15181 = arrayList;
        this.f15174 = arrayList2;
        this.f15177 = interfaceC6818;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m13966(ArrayList arrayList, CharSequence charSequence, int i) {
        if (i == -1) {
            return 0;
        }
        return i == arrayList.size() ? charSequence.length() : ((InterfaceC18191) arrayList.get(i)).mo18688();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m13968() {
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it = this.f15177.mo6219().iterator();
        boolean z = false;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.f15174;
            arrayList2 = this.f15181;
            if (!hasNext) {
                break;
            }
            C22340 c22340 = (C22340) it.next();
            int i = c22340.f72395;
            int i2 = c22340.f72397;
            int i3 = i - i2;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i2 + i4;
                int i6 = c22340.f72398 + i4;
                if (!(arrayList2.get(i5) instanceof C14662) || !(arrayList.get(i6) instanceof C14662)) {
                    if (i5 == 0 ? true : arrayList2.get(i5 - 1) instanceof C14662) {
                        if (i6 == 0 ? true : arrayList.get(i6 - 1) instanceof C14662) {
                            m13967(i5 - 1, i6 - 1, z);
                        }
                    }
                    z = true;
                } else {
                    m13967(i5, i6, z);
                    z = false;
                }
            }
        }
        m13967(arrayList2.size(), arrayList.size(), z);
        C22424 c22424 = this.f15180;
        ArrayList arrayList3 = this.f15179;
        if (c22424 != null) {
            arrayList3.add(c22424.f72658);
        }
        return arrayList3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
    
        r1 = true;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m13967(int r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4785.m13967(int, int, boolean):void");
    }
}
