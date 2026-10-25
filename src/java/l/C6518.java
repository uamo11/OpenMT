package l;

import java.util.ArrayList;

/* compiled from: 2BFP */
/* renamed from: l.ۜۘܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6518 implements InterfaceC17101 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20630 f20129;

    public C6518(C20630 c20630) {
        this.f20129 = c20630;
    }

    @Override // l.InterfaceC17101
    /* renamed from: ֫ */
    public final void mo7531(C12122 c12122) {
        m18014((AbstractC14278) c12122);
    }

    @Override // l.InterfaceC17101
    /* renamed from: ֫ */
    public final void mo7532(C13532 c13532) {
        m18014((AbstractC14278) c13532);
    }

    @Override // l.InterfaceC17101
    /* renamed from: ۧ */
    public final void mo7534(C12122 c12122) {
        m18014((AbstractC14278) c12122);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18014(AbstractC14278 abstractC14278) {
        ArrayList[] arrayListArr;
        C20069 mo29535 = abstractC14278.mo29535();
        int size = mo29535.size();
        for (int i = 0; i < size; i++) {
            arrayListArr = this.f20129.f66367;
            arrayListArr[mo29535.m41004get(i).m48652()].add(abstractC14278);
        }
    }
}
