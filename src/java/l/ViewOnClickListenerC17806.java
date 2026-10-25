package l;

import android.view.View;
import bin.mt.plus.R;

/* compiled from: J26J */
/* renamed from: l.ᩳۘܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC17806 implements View.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f54438;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f54439;

    public /* synthetic */ ViewOnClickListenerC17806(int i, Object obj) {
        this.f54438 = i;
        this.f54439 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f54438;
        Object obj = this.f54439;
        switch (i) {
            case 0:
                C9340.m24044((C9340) obj, view);
                break;
            case 1:
                int i2 = ActivityC22062.f70692;
                ((ActivityC22062) obj).finish();
                break;
            case 2:
                DialogInterfaceOnDismissListenerC5317.m15241((DialogInterfaceOnDismissListenerC5317) obj);
                break;
            case 3:
                C19258 buildDialog = ((AbstractActivityC3346) obj).buildDialog();
                buildDialog.m44433(R.string.MT_Protector_res_0x7f12042f);
                buildDialog.m44416(R.string.MT_Protector_res_0x7f120706);
                buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
                C8960.m23095(buildDialog.m44438());
                break;
            default:
                C4925.m14314((CharSequence) ((C3545) obj).m10779().getName());
                break;
        }
    }
}
