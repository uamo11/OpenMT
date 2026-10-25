package l;

import android.view.View;
import bin.mt.plus.R;

/* compiled from: LAXL */
/* renamed from: l.ܽ۠ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC16516 implements View.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50753;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f50754;

    public /* synthetic */ ViewOnClickListenerC16516(AbstractActivityC3346 abstractActivityC3346, int i) {
        this.f50753 = i;
        this.f50754 = abstractActivityC3346;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f50753) {
            case 0:
                ViewOnClickListenerC7042.m19011(this.f50754, false);
                break;
            default:
                this.f50754.m10217(R.string.MT_Protector_res_0x7f12042f, R.string.MT_Protector_res_0x7f12018d, false);
                break;
        }
    }
}
