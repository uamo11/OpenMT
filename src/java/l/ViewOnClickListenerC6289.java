package l;

import android.view.View;
import bin.mt.plus.R;

/* compiled from: B4HK */
/* renamed from: l.ۛ᩶ܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6289 implements View.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19452;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19453;

    public /* synthetic */ ViewOnClickListenerC6289(int i, Object obj) {
        this.f19452 = i;
        this.f19453 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f19452) {
            case 0:
                AbstractC23222.m51529((AbstractC23222) this.f19453);
                break;
            case 1:
                DialogInterfaceOnDismissListenerC5317.m15248((DialogInterfaceOnDismissListenerC5317) this.f19453);
                break;
            case 2:
                C9340.m24038((C9340) this.f19453, view);
                break;
            default:
                C19258 buildDialog = ((AbstractActivityC3346) this.f19453).buildDialog();
                buildDialog.m44433(R.string.MT_Protector_res_0x7f120704);
                buildDialog.m44416(R.string.MT_Protector_res_0x7f120705);
                buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
                C8960.m23095(buildDialog.m44438());
                break;
        }
    }
}
