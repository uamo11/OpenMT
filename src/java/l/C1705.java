package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: 313O */
/* renamed from: l.֫۠ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1705 implements InterfaceC15815 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f5894;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f5895;

    public C1705(AbstractC15440 abstractC15440, Main main) {
        this.f5895 = abstractC15440;
        this.f5894 = main;
    }

    @Override // l.InterfaceC15815
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo5716(C5732 c5732, InterfaceC5711 interfaceC5711, C9260 c9260) {
        c5732.m16166(interfaceC5711, this.f5895, true);
    }

    @Override // l.InterfaceC15815
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo5715(View view, C5732 c5732, InterfaceC5711 interfaceC5711, C9260 c9260) {
        C21282 c21282 = new C21282(this.f5894, view, 0);
        C3060 m48304 = c21282.m48304();
        m48304.add(0, R.string.MT_Protector_res_0x7f120945, 0, R.string.MT_Protector_res_0x7f120945);
        m48304.add(0, R.string.MT_Protector_res_0x7f120712, 0, R.string.MT_Protector_res_0x7f120712);
        c21282.m48302(new C18499(interfaceC5711, c5732));
        c21282.m48305();
    }
}
