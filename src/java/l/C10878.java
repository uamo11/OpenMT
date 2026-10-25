package l;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.view.View;

/* compiled from: 313O */
/* renamed from: l.ۧ۠ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10878 implements InterfaceC15815 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2312 f32711;

    public C10878(C2312 c2312) {
        this.f32711 = c2312;
    }

    @Override // l.InterfaceC15815
    /* renamed from: ֫ */
    public final void mo5716(C5732 c5732, InterfaceC5711 interfaceC5711, C9260 c9260) {
        PackageManager m14320 = C4925.m14320();
        ComponentName mo8896 = interfaceC5711.mo8896();
        if (mo8896.equals(C2312.m7571(m14320))) {
            ApplicationC20075.f65008.edit().remove("dsai").apply();
        } else {
            ApplicationC20075.f65008.edit().putString("dsai", mo8896.flattenToString()).apply();
        }
        this.f32711.mo6922();
    }

    @Override // l.InterfaceC15815
    /* renamed from: ֫ */
    public final void mo5715(View view, C5732 c5732, InterfaceC5711 interfaceC5711, C9260 c9260) {
        c5732.m16165(interfaceC5711);
    }
}
