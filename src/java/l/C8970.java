package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* compiled from: 09LR */
/* renamed from: l.ۡܶ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8970 extends AbstractC0525 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16024 f27245;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8970(ActivityC16024 activityC16024) {
        super(true);
        this.f27245 = activityC16024;
    }

    @Override // l.AbstractC0525
    /* renamed from: ۧ */
    public final void mo1201() {
        C13670 c13670;
        String str;
        ActivityC16024 activityC16024 = this.f27245;
        c13670 = activityC16024.f49434;
        if (c13670.m32872()) {
            C19258 buildDialog = activityC16024.buildDialog();
            str = activityC16024.f49431;
            buildDialog.m44436(str);
            buildDialog.m44416(R.string.MT_Protector_res_0x7f1208cd);
            buildDialog.m44442(R.string.MT_Protector_res_0x7f1208c6, new DialogInterface.OnClickListener() { // from class: l.᩷ܶ᩷
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C8970.this.f27245.m37879(true);
                }
            });
            buildDialog.m44434(R.string.MT_Protector_res_0x7f1202c2, new DialogInterface.OnClickListener() { // from class: l.ۢܶ᩷
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C8970.this.f27245.finish();
                }
            });
            buildDialog.m44438();
            return;
        }
        activityC16024.finish();
    }
}
