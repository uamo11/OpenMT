package l;

import android.content.Context;
import android.view.View;
import bin.mt.plus.R;

/* compiled from: I1KV */
/* renamed from: l.᩸ܳۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC21640 implements View.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69468;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f69469;

    public /* synthetic */ ViewOnClickListenerC21640(int i, Object obj) {
        this.f69468 = i;
        this.f69469 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f69468) {
            case 0:
                ((AbstractActivityC3346) this.f69469).m10217(R.string.MT_Protector_res_0x7f12042f, R.string.MT_Protector_res_0x7f120889, false);
                break;
            default:
                ActivityC10717.m26893((Context) ((ViewOnClickListenerC20313) this.f69469).f65601, C23986.m52814(), false);
                break;
        }
    }
}
