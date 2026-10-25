package l;

import android.view.View;
import bin.mt.plus.R;

/* compiled from: C5P7 */
/* renamed from: l.֨֡᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC0775 implements View.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f2874;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2875;

    public /* synthetic */ ViewOnClickListenerC0775(int i, Object obj) {
        this.f2874 = i;
        this.f2875 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f2874;
        Object obj = this.f2875;
        switch (i) {
            case 0:
                int i2 = ActivityC14886.f45433;
                ((ActivityC14886) obj).finish();
                break;
            case 1:
                ActivityC22006 activityC22006 = ((C19184) obj).f60438;
                C19258 buildDialog = activityC22006.buildDialog();
                buildDialog.m44436(activityC22006.f10584.getTitle());
                buildDialog.m44424(activityC22006.f10584.getSubtitle());
                buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
                buildDialog.m44438();
                break;
            case 2:
                int i3 = ActivityC16024.f49427;
                ((ActivityC16024) obj).getOnBackPressedDispatcher().m28892();
                break;
            default:
                C21175.m48116((C21175) obj);
                break;
        }
    }
}
