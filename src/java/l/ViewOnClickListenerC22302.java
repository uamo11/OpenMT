package l;

import android.view.View;
import bin.mt.plus.R;

/* compiled from: D8GL */
/* renamed from: l.᩹۬ۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC22302 implements View.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72315;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72316;

    public /* synthetic */ ViewOnClickListenerC22302(int i, Object obj) {
        this.f72315 = i;
        this.f72316 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f72315;
        Object obj = this.f72316;
        switch (i) {
            case 0:
                ActivityC10227.m25796((ActivityC10227) obj, view);
                break;
            case 1:
                ((C16560) obj).m39056().m10217(R.string.MT_Protector_res_0x7f120a76, R.string.MT_Protector_res_0x7f120044, false);
                break;
            default:
                C4583 c4583 = ActivityC11536.f34441;
                ((ActivityC11536) obj).finish();
                break;
        }
    }
}
