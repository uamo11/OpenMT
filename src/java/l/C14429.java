package l;

import android.content.DialogInterface;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: R7YU */
/* renamed from: l.ܳۡ᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14429 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f44227;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6669 f44228;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f44229;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f44230;

    public C14429(View view, ActivityC6669 activityC6669, DialogInterfaceC0206 dialogInterfaceC0206, String str) {
        this.f44228 = activityC6669;
        this.f44229 = str;
        this.f44230 = dialogInterfaceC0206;
        this.f44227 = view;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f44228, R.string.MT_Protector_res_0x7f120b33);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C23602 c23602;
        boolean z;
        C23602 c236022;
        boolean z2;
        ActivityC6669 activityC6669 = this.f44228;
        c23602 = activityC6669.f20723;
        z = c23602.f76511;
        C23881 m7784 = C2405.m7784(this.f44229, z);
        if (m7784.m52607()) {
            return;
        }
        c236022 = activityC6669.f20723;
        z2 = c236022.f76511;
        if (z2) {
            throw new C14501(C1575.m5392(m7784, R.string.MT_Protector_res_0x7f120ae4));
        }
        throw new C14501(C1575.m5392(m7784, R.string.MT_Protector_res_0x7f120520));
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C4925.m14316(new Runnable() { // from class: l.ܿۡ᩷
            @Override // java.lang.Runnable
            public final void run() {
                C23602 c23602;
                String str;
                C23602 c236022;
                String str2;
                ActivityC6669 activityC6669 = C14429.this.f44228;
                Main m36593 = C15528.m36593();
                if (m36593 != null) {
                    c236022 = activityC6669.f20723;
                    str2 = c236022.f76513;
                    m36593.m10218(R.string.MT_Protector_res_0x7f120491, str2, false);
                } else {
                    c23602 = activityC6669.f20723;
                    str = c23602.f76513;
                    C21374.m48464(str);
                }
            }
        }, 1000L);
        this.f44230.dismiss();
        C2405.m7823();
        this.f44228.finish();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f44227.setEnabled(true);
        this.f44228.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
