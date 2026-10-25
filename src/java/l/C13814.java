package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: D8GL */
/* renamed from: l.ܰ۫ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13814 implements InterfaceC0612 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10227 f41212;

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final /* synthetic */ void mo2491(int i) {
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final /* synthetic */ void mo2492(int i, int i2) {
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final /* synthetic */ void mo2493(int i, C5552 c5552, C5552 c55522) {
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final /* synthetic */ void mo2494(int i, boolean z) {
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final /* synthetic */ void mo2495(List list) {
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final /* synthetic */ void mo2496(C2730 c2730) {
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final /* synthetic */ void mo2501(C11902 c11902) {
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final /* synthetic */ void mo2505(C18958 c18958) {
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final /* synthetic */ void mo2507(C23896 c23896) {
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final /* synthetic */ void mo2508(boolean z) {
    }

    @Override // l.InterfaceC0612
    /* renamed from: ۧ */
    public final /* synthetic */ void mo2509(int i) {
    }

    @Override // l.InterfaceC0612
    /* renamed from: ۧ */
    public final /* synthetic */ void mo2510(int i, boolean z) {
    }

    @Override // l.InterfaceC0612
    /* renamed from: ۧ */
    public final /* synthetic */ void mo2511(C16134 c16134) {
    }

    @Override // l.InterfaceC0612
    /* renamed from: ܽ */
    public final /* synthetic */ void mo2514(boolean z) {
    }

    @Override // l.InterfaceC0612
    /* renamed from: ᩳ */
    public final /* synthetic */ void mo2515() {
    }

    @Override // l.InterfaceC0612
    /* renamed from: ᩳ */
    public final /* synthetic */ void mo2516(int i) {
    }

    @Override // l.InterfaceC0612
    /* renamed from: ᩳ */
    public final /* synthetic */ void mo2517(boolean z) {
    }

    public C13814(ActivityC10227 activityC10227) {
        this.f41212 = activityC10227;
    }

    @Override // l.InterfaceC0612
    /* renamed from: ܽ */
    public final void mo2513(int i) {
        boolean z;
        String str;
        InterfaceC4162 interfaceC4162;
        InterfaceC4162 interfaceC41622;
        GestureDetectorOnGestureListenerC8816 gestureDetectorOnGestureListenerC8816;
        InterfaceC9603 interfaceC9603;
        InterfaceC9603 interfaceC96032;
        boolean z2;
        ActivityC10227 activityC10227 = this.f41212;
        activityC10227.m25742(i);
        if (i == 4) {
            z = activityC10227.f30745;
            if (z) {
                z2 = activityC10227.f30727;
                if (z2) {
                    return;
                }
                activityC10227.f30757 = true;
                activityC10227.m25787();
                return;
            }
            str = activityC10227.f30825;
            if (!TextUtils.isEmpty(str)) {
                C22926.m51017(str);
            }
            if (ActivityC10227.m25747()) {
                gestureDetectorOnGestureListenerC8816 = activityC10227.f30777;
                if (gestureDetectorOnGestureListenerC8816.f26873 == 0) {
                    return;
                }
                if (!ActivityC10227.m25727()) {
                    interfaceC9603 = activityC10227.f30775;
                    if (interfaceC9603.mo16335()) {
                        interfaceC96032 = activityC10227.f30775;
                        if (interfaceC96032.size() > 1) {
                            C21374.m48463(R.string.MT_Protector_res_0x7f12050f);
                            return;
                        }
                        return;
                    }
                }
                ActivityC10227.m25735(activityC10227);
                return;
            }
            if (ActivityC10227.m25727()) {
                interfaceC4162 = activityC10227.f30786;
                interfaceC4162.mo4581();
                interfaceC41622 = activityC10227.f30786;
                interfaceC41622.mo4601();
            }
        }
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2500(C11197 c11197, int i) {
        ActivityC10227 activityC10227 = this.f41212;
        ActivityC10227.m25718(activityC10227, c11197);
        ActivityC10227.m25812(activityC10227, c11197);
        ActivityC10227.m25797(activityC10227, c11197);
        ActivityC10227.m25769(activityC10227, c11197);
        ActivityC10227.m25709(activityC10227, (CharSequence) null, c11197);
        ActivityC10227.m25791(activityC10227);
        activityC10227.m25693((CharSequence) activityC10227.getString(R.string.MT_Protector_res_0x7f120528));
        activityC10227.m25763((CharSequence) activityC10227.getString(R.string.MT_Protector_res_0x7f120528));
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2498(AbstractC4846 abstractC4846, int i) {
        InterfaceC4162 interfaceC4162;
        if (abstractC4846.m14110()) {
            return;
        }
        ActivityC10227 activityC10227 = this.f41212;
        interfaceC4162 = activityC10227.f30786;
        if (interfaceC4162 != null) {
            ActivityC10227.m25824(activityC10227);
        }
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2506(C19664 c19664) {
        boolean z;
        ActivityC10227 activityC10227 = this.f41212;
        z = activityC10227.f30745;
        if (z) {
            activityC10227.m25843(true);
        }
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2503(C16134 c16134) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        InterfaceC9603 interfaceC9603;
        C16431 c16431;
        C16431 c164312;
        ActivityC10227 activityC10227 = this.f41212;
        ActivityC10227.m25740(activityC10227);
        z = activityC10227.f30788;
        if (z) {
            return;
        }
        if (C2175.m7191(c16134)) {
            activityC10227.finish();
            return;
        }
        int i = C3586.f11375;
        for (Throwable th = c16134; th != null; th = th.getCause()) {
            if (th instanceof C3586) {
                return;
            }
        }
        if (ActivityC10227.m25725(activityC10227, c16134) || ActivityC10227.m25821(activityC10227)) {
            return;
        }
        int i2 = C22510.f72833;
        for (Throwable th2 = c16134; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof C22510) {
                ActivityC10227.m25676(activityC10227);
                return;
            }
        }
        if (ActivityC10227.m25818(activityC10227)) {
            return;
        }
        z2 = activityC10227.f30745;
        if (z2) {
            ActivityC10227.m25750(activityC10227);
            return;
        }
        z3 = activityC10227.f30785;
        if (!z3) {
            z4 = activityC10227.f30780;
            if (!z4) {
                String message = c16134.getMessage();
                if (TextUtils.isEmpty(message)) {
                    message = c16134.toString();
                }
                interfaceC9603 = activityC10227.f30775;
                final InterfaceC17889 mo16334 = interfaceC9603.mo16334();
                if (message.contains("MediaCodecVideoRenderer error") && mo16334 != null) {
                    c16431 = activityC10227.f30744;
                    if (c16431 != null) {
                        c164312 = activityC10227.f30744;
                        if (c164312.m38743() instanceof C2499) {
                            C19258 buildDialog = activityC10227.buildDialog();
                            buildDialog.m44433(R.string.MT_Protector_res_0x7f120307);
                            buildDialog.m44416(R.string.MT_Protector_res_0x7f12064d);
                            buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ۤ۫ۜ
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i3) {
                                    ActivityC10227 activityC102272 = C13814.this.f41212;
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    Uri m29045 = C11914.m29045(mo16334.getPath());
                                    intent.setDataAndType(m29045, "video/*");
                                    intent.addFlags(268435456);
                                    C2837.m8731(intent, m29045);
                                    try {
                                        activityC102272.startActivity(intent);
                                    } catch (Exception e) {
                                        activityC102272.m10223(e, (DialogInterface.OnDismissListener) null);
                                    }
                                }
                            });
                            buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, new DialogInterface.OnClickListener() { // from class: l.ۛ۫ۜ
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i3) {
                                    C13814.this.m33168((C21374) null);
                                }
                            });
                            buildDialog.m44419(new DialogInterface.OnCancelListener() { // from class: l.ۨ۫ۜ
                                @Override // android.content.DialogInterface.OnCancelListener
                                public final void onCancel(DialogInterface dialogInterface) {
                                    C13814.this.m33168((C21374) null);
                                }
                            });
                            buildDialog.m44438();
                            return;
                        }
                    }
                }
                m33168(C21374.m48459((CharSequence) message));
                return;
            }
        }
        C21374.m48463(R.string.MT_Protector_res_0x7f1209f8);
        ActivityC10227.m25745(activityC10227);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m33168(final C21374 c21374) {
        final InterfaceC4162 interfaceC4162;
        InterfaceC9603 interfaceC9603;
        if (ActivityC10227.m25747()) {
            boolean m25727 = ActivityC10227.m25727();
            ActivityC10227 activityC10227 = this.f41212;
            if (!m25727) {
                interfaceC9603 = activityC10227.f30775;
                if (interfaceC9603.mo16335()) {
                    return;
                }
            }
            interfaceC4162 = activityC10227.f30786;
            if (interfaceC4162 == null) {
                return;
            }
            C4925.m14316(new Runnable() { // from class: l.᩺۫ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC4162 interfaceC41622;
                    ActivityC10227 activityC102272 = C13814.this.f41212;
                    C21374 c213742 = c21374;
                    if (c213742 != null) {
                        c213742.m48466();
                    }
                    interfaceC41622 = activityC102272.f30786;
                    InterfaceC4162 interfaceC41623 = interfaceC4162;
                    if (interfaceC41623 == interfaceC41622 && !interfaceC41623.mo12587() && interfaceC41623.mo4603() == 1) {
                        ActivityC10227.m25735(activityC102272);
                    }
                }
            }, 2000L);
        }
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2504(C17546 c17546) {
        InterfaceC4162 interfaceC4162;
        InterfaceC4162 interfaceC41622;
        C11197 mo4595;
        CharSequence charSequence = c17546.f53612;
        ActivityC10227 activityC10227 = this.f41212;
        interfaceC4162 = activityC10227.f30786;
        if (interfaceC4162 == null) {
            mo4595 = null;
        } else {
            interfaceC41622 = activityC10227.f30786;
            mo4595 = interfaceC41622.mo4595();
        }
        ActivityC10227.m25709(activityC10227, charSequence, mo4595);
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2499(C6404 c6404) {
        View view;
        View view2;
        long j;
        boolean z;
        ActivityC10227 activityC10227 = this.f41212;
        activityC10227.f30808 = c6404;
        view = activityC10227.f30814;
        if (view != null) {
            view2 = activityC10227.f30814;
            if (view2.getVisibility() == 0) {
                j = activityC10227.f30805;
                z = activityC10227.f30763;
                activityC10227.m25762(j, z);
            }
        }
        activityC10227.m25698(c6404);
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2497(C4288 c4288) {
        C0289 c0289;
        C0289 c02892;
        ActivityC10227 activityC10227 = this.f41212;
        c0289 = activityC10227.f30755;
        if (c0289 != null) {
            c02892 = activityC10227.f30755;
            c02892.m1636(ActivityC10227.m25684(activityC10227, c4288.f13839));
            activityC10227.m25823();
        }
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2502(C14017 c14017) {
        View view;
        View view2;
        long j;
        boolean z;
        ActivityC10227 activityC10227 = this.f41212;
        view = activityC10227.f30814;
        if (view != null) {
            view2 = activityC10227.f30814;
            if (view2.getVisibility() == 0) {
                j = activityC10227.f30805;
                z = activityC10227.f30763;
                activityC10227.m25762(j, z);
            }
        }
        boolean m25724 = ActivityC10227.m25724(activityC10227, c14017);
        boolean m25800 = ActivityC10227.m25800(activityC10227, c14017);
        boolean m25772 = ActivityC10227.m25772(activityC10227, c14017);
        activityC10227.m25842(c14017);
        if (!m25772) {
            ActivityC10227.m25831(activityC10227);
        }
        if (!m25724 && !m25800) {
            ActivityC10227.m25779(activityC10227);
        }
        activityC10227.m25844(c14017);
    }

    @Override // l.InterfaceC0612
    /* renamed from: ۧ */
    public final void mo2512(boolean z) {
        ActivityC10227 activityC10227 = this.f41212;
        if (z) {
            activityC10227.getWindow().addFlags(128);
        } else {
            activityC10227.getWindow().clearFlags(128);
        }
    }
}
