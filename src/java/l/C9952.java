package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: P6LY */
/* renamed from: l.ۤ֨֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9952 implements InterfaceC19830 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f30038;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11363 f30039;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12752 f30040 = new C12752();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5718 f30041;

    public C9952(C5718 c5718, C11363 c11363) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        this.f30041 = c5718;
        this.f30039 = c11363;
        arrayList = c5718.f17638;
        this.f30038 = new ArrayList(arrayList.size());
        arrayList2 = c5718.f17638;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f30038.add(((InterfaceC7834) it.next()).create());
        }
        arrayList3 = c5718.f17639;
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            this.f30040.m31053(((InterfaceC4307) it2.next()).mo8836(this));
        }
    }

    @Override // l.InterfaceC19830
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap mo25074(AbstractC0197 abstractC0197, String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Iterator it = this.f30038.iterator();
        while (it.hasNext()) {
            ((InterfaceC0778) it.next()).mo2959(abstractC0197, str, linkedHashMap);
        }
        return linkedHashMap;
    }

    @Override // l.InterfaceC19830
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11363 mo25075() {
        return this.f30039;
    }

    @Override // l.InterfaceC19830
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo25076(AbstractC0197 abstractC0197) {
        this.f30040.m31055(abstractC0197);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m25078(AbstractC0197 abstractC0197) {
        this.f30040.m31054(abstractC0197);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m25077(AbstractC0197 abstractC0197) {
        this.f30040.m31052(abstractC0197);
    }
}
