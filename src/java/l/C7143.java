package l;

import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;

/* compiled from: 313O */
/* renamed from: l.۟֨ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7143 implements InterfaceC15815 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17889 f21926;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f21927;

    public C7143(C16560 c16560, InterfaceC17889 interfaceC17889) {
        this.f21927 = c16560;
        this.f21926 = interfaceC17889;
    }

    @Override // l.InterfaceC15815
    /* renamed from: ֫ */
    public final void mo5716(C5732 c5732, InterfaceC5711 interfaceC5711, C9260 c9260) {
        C16560 c16560 = this.f21927;
        InterfaceC17889 interfaceC17889 = this.f21926;
        if (c9260 != null) {
            c9260.m23784(c16560, interfaceC17889);
        } else if (C9966.m25123(c16560, interfaceC17889)) {
            C9340.m24035(interfaceC17889, OpenAuthTask.Duplex);
            C9966.m25122(c16560, interfaceC17889, interfaceC5711.mo8896());
        } else {
            C19568.m45009(c16560, interfaceC17889, new C20525(interfaceC17889, c5732, interfaceC5711));
        }
    }

    @Override // l.InterfaceC15815
    /* renamed from: ֫ */
    public final void mo5715(View view, final C5732 c5732, final InterfaceC5711 interfaceC5711, final C9260 c9260) {
        final String mo36962 = this.f21926.mo36962();
        C21282 c21282 = new C21282(this.f21927.m39056(), view, 0);
        C3060 m48304 = c21282.m48304();
        m48304.add(0, R.string.MT_Protector_res_0x7f120716, 0, R.string.MT_Protector_res_0x7f120716).setEnabled(!mo36962.isEmpty());
        if (interfaceC5711 != null) {
            m48304.add(0, R.string.MT_Protector_res_0x7f120712, 0, R.string.MT_Protector_res_0x7f120712);
        }
        final C16560 c16560 = this.f21927;
        c21282.m48302(new InterfaceC14930() { // from class: l.ܰ֨ܿ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                InterfaceC5711 interfaceC57112 = interfaceC5711;
                if (itemId != R.string.MT_Protector_res_0x7f120716) {
                    if (itemId != R.string.MT_Protector_res_0x7f120712) {
                        return true;
                    }
                    c5732.m16165(interfaceC57112);
                    return true;
                }
                C9260 c92602 = C9260.this;
                String str = mo36962;
                if (c92602 != null) {
                    C2204.m7298(str, c92602);
                } else {
                    C2204.m7297(str, interfaceC57112);
                }
                C16560 c165602 = c16560;
                c165602.m39052();
                c165602.m39026().m39052();
                C21374.m48457(R.string.MT_Protector_res_0x7f120717);
                return true;
            }
        });
        c21282.m48305();
    }
}
