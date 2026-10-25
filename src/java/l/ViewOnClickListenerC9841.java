package l;

import android.view.View;
import bin.mt.plus.R;

/* compiled from: 61L9 */
/* renamed from: l.ۢ᩷ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC9841 implements View.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29728;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f29729;

    public /* synthetic */ ViewOnClickListenerC9841(int i, Object obj) {
        this.f29728 = i;
        this.f29729 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f29728;
        Object obj = this.f29729;
        switch (i) {
            case 0:
                int i2 = ActivityC1748.f6044;
                ((ActivityC1748) obj).finish();
                break;
            case 1:
                C19258 buildDialog = ((AbstractActivityC3346) obj).buildDialog();
                buildDialog.m44433(R.string.MT_Protector_res_0x7f1207bd);
                buildDialog.m44416(R.string.MT_Protector_res_0x7f1209a6);
                buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
                buildDialog.m44438();
                break;
            case 2:
                ViewOnClickListenerC19987.m46074((ViewOnClickListenerC19987) obj);
                break;
            case 3:
                ((AbstractViewOnClickListenerC5230) obj).m15021(view);
                break;
            case 4:
                ((AbstractDialogInterfaceOnClickListenerC12849) obj).m31250((CharSequence) C17283.m40576(System.currentTimeMillis()));
                break;
            case 5:
                ActivityC17520.m40936(r1, ((ActivityC12581) obj).f37929.m44000());
                break;
            case 6:
                r1.f52617.smoothScrollToPosition(((ActivityC17169) obj).f52618);
                break;
            case 7:
                ViewOnClickListenerC16700.m39254((ViewOnClickListenerC16700) obj);
                break;
            default:
                C5062.m14588((C5062) obj);
                break;
        }
    }
}
