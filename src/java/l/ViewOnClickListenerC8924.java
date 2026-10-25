package l;

import android.view.View;
import bin.mt.plus.R;

/* compiled from: C5GL */
/* renamed from: l.ۡܰܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC8924 implements View.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27135;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27136;

    public /* synthetic */ ViewOnClickListenerC8924(int i, Object obj) {
        this.f27135 = i;
        this.f27136 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f27135;
        Object obj = this.f27136;
        switch (i) {
            case 0:
                int i2 = ViewOnClickListenerC5396.f16757;
                ((ViewOnClickListenerC5396) obj).finish();
                break;
            case 1:
                C19258 buildDialog = ((AbstractActivityC3346) obj).buildDialog();
                buildDialog.m44433(R.string.MT_Protector_res_0x7f120239);
                buildDialog.m44416(R.string.MT_Protector_res_0x7f12023a);
                buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
                C8960.m23095(buildDialog.m44438());
                break;
            default:
                C16688.m39224((C16688) obj);
                break;
        }
    }
}
